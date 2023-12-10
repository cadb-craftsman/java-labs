/* 
   
 */
package com.bookstore.persistencia;

import java.util.List;

import com.bookstore.jbeans.JB_Libro;
import com.bookstore.mapper.LibroRowMapper;
import com.bookstore.crud.interfaz.ICRUDLibro;
import org.springframework.jdbc.core.JdbcTemplate;

public class LibroDaoImpl implements ICRUDLibro{

	private static String PERCENT = "%";
	private JdbcTemplate jdbcTemplate;

	private String INSERT_QUERY = "insert into libro (isbn, titulo, edicion, añoEdicion, editorial, idioma, descripcion) values(?, ?, ?, ?, ?, ?, ?)";	
	private String SELECT_QUERY = "select libro.isbn, titulo, edicion, añoEdicion, editorial, idioma, descripcion, categoria, genero, precio from libro, almacen, catalogo where ((libro.isbn = ?) and ((libro.isbn = almacen.isbn) and (libro.isbn = catalogo.isbn)))";
	private String SELECT_QUERY_ALL = "select libro.isbn, titulo, edicion, editorial, añoEdicion, idioma, descripcion, categoria, genero, precio from libro, almacen, catalogo where ((libro.isbn = almacen.isbn) and (libro.isbn = catalogo.isbn))";
	private String SELECT_QUERY_GENERICA = "select libro.isbn, titulo, edicion, añoEdicion, editorial, idioma, descripcion, categoria, genero, precio from libro, almacen, catalogo where (((libro.isbn like ?) or (titulo like ?) or (editorial like ?)) and ((libro.isbn = almacen.isbn) and (libro.isbn = catalogo.isbn)))";	
	private String DELETE_QUERY = "delete from libro where (isbn = ?)";
	private String UPDATE_QUERY = "update libro set (isbn = ?, titulo = ?, edicion = ?, añoEdicion = ?, editorial = ?, idioma = ?, descripcion = ?) where( isbn = ?)";

	public LibroDaoImpl(){
		super();
	}

	public LibroDaoImpl(JdbcTemplate jdbcTemplate){
		super();
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public void insertarLibro(JB_Libro libro) {		
		jdbcTemplate.update(INSERT_QUERY, new Object[]{libro.getIsbn(), libro.getTitulo(), libro.getEdicion(), libro.getAñoEdicion(), libro.getEditorial(), libro.getIdioma(), libro.getDescripcion()});
	}

	@Override
	public void eliminarLibro(JB_Libro libro) {
		jdbcTemplate.update(DELETE_QUERY, new Object[]{libro.getIsbn()});		
	}

	@Override
	public List<JB_Libro> consultarLibro(JB_Libro libro) {
		List<JB_Libro> libros = null;
		if(libro.getGenerico() != null){
			String busqueda = PERCENT+libro.getGenerico()+PERCENT;			
			libros =  jdbcTemplate.query(SELECT_QUERY_GENERICA, new Object[]{busqueda, busqueda, busqueda}, new LibroRowMapper());
		}else if(libro.getIsbn() != null){
			libros = jdbcTemplate.query(SELECT_QUERY, new Object[]{libro.getIsbn()}, new LibroRowMapper());			
		}else if(libro.getIsbn() == null){
			libros =  jdbcTemplate.query(SELECT_QUERY_ALL, new LibroRowMapper());
		}				
		return libros;
	}

	@Override
	public void actualizarLibro(JB_Libro libro) {
		jdbcTemplate.update(UPDATE_QUERY, new Object[]{libro.getIsbn(), libro.getTitulo(), libro.getEdicion(), libro.getAñoEdicion(), libro.getEditorial(), libro.getIdioma(), libro.getDescripcion()});		
	}

}
