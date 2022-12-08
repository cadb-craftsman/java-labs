package com.bookstore.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.bookstore.adapter.interfaz.INegocioAdapter;
import com.bookstore.jbeans.JB_Libro;
import com.bookstore.jbeans.JB_Oferta;

public class TestClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("cfg/applicationContext.xml");
		INegocioAdapter negocioAdapter = (INegocioAdapter) context.getBean("negocioAdapter"); 
			
		System.out.println("=======================================");
		System.out.println("ApplicationContext: ");
		System.out.println("=======================================");
		
		JB_Libro libro = new JB_Libro();
		libro.setGenerico("12345678901");
	
		List<JB_Libro> librosList = negocioAdapter.getINegocioLibro().buscarLibro(libro);
		
		for (int i = 0; i < librosList.size(); i++) {
			System.out.println(librosList.get(i).toString());
		}
		
		JB_Oferta oferta = new JB_Oferta();
		oferta.setMarcaOferta("O");
		List<JB_Oferta> ofertasList = negocioAdapter.getINegocioOferta().buscarOferta(oferta);
		
		for (int i = 0; i < ofertasList.size(); i++) {
			System.out.println(ofertasList.get(i).toString());
		}
		
		oferta.setMarcaOferta("N");
		List<JB_Oferta> ofertasListN = negocioAdapter.getINegocioOferta().buscarOferta(oferta);
		
		for (int i = 0; i < ofertasListN.size(); i++) {
			System.out.println(ofertasListN.get(i).toString());
		}
		
		/*
		GestionLibro gLibro = null;
		GestionAlmacen gAlmacen = null;
		GestionOferta gOferta = (GestionOferta) context.getBean("gestionOferta");		
		List<JB_Oferta> ofertaList = gOferta.getOfertaDao().consultarOferta(null);
		
		System.out.println("ofertaList " + ofertaList.size());
		
		JB_DatosLibrosList ofertasList = null;		
		if(ofertaList != null){
			ofertasList = new JB_DatosLibrosList();
			gLibro = (GestionLibro) context.getBean("gestionLibro");
			gAlmacen = (GestionAlmacen) context.getBean("gestionAlmacen");
			for (int c = 0; c < ofertaList.size(); c++) {
				List<JB_Libro> librosList = gLibro.getLibroDao().consultarLibro(null);
				System.out.println("librosList: " + librosList.size());
				if(librosList != null){
					for (int i = 0; i < librosList.size(); i++) {
						ofertasList.setLibroList(librosList.get(i));
					}
				}
				List<JB_Almacen> almacenList = gAlmacen.getAlmacenDao().consultar(null);
				System.out.println("almacenList: " + almacenList.size());
				if(almacenList != null){
					for (int i = 0; i < almacenList.size(); i++) {
						ofertasList.setAlmacenList(almacenList.get(i));
					}
				}
				ofertasList.setOfertaList(ofertaList.get(c));
			}
		}	
		
		System.out.println("ofertaList: " + ofertasList.toString());
		
		if(ofertasList != null){
			if (ofertasList.getOfertaList() != null) {
				for (JB_Oferta jbOferta : ofertasList.getOfertaList()) {
					System.out.println(jbOferta.toString());
				}
			}
			if (ofertasList.getLibroList() != null) {
				for (JB_Libro jbLibro : ofertasList.getLibroList()) {
					System.out.println(jbLibro.toString());
				}
			}
			if (ofertasList.getAlmacenList() != null) {
				for (JB_Almacen jbAlmacen : ofertasList.getAlmacenList()) {
					System.out.println(jbAlmacen.toString());
				}
			}
		}
		
		JB_Libro libro = ofertasList.getLibroList().get(0);
		libro.setGenerico("12345678902");
		List<JB_Libro> libroList = gLibro.getLibroDao().consultarLibro(libro);
		
		for (int i = 0; i < libroList.size(); i++) {
			System.out.println(libroList.get(i).toString());
		}*/

	}

}
