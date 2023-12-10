delimiter $$

CREATE TABLE `libro` (
  `isbn` varchar(25) NOT NULL,
  `titulo` varchar(100) DEFAULT NULL,
  `edicion` int(11) DEFAULT NULL,
  `añoEdicion` year(4) DEFAULT NULL,
  `editorial` varchar(45) DEFAULT NULL,
  `idioma` varchar(45) DEFAULT NULL,
  `descripcion` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`isbn`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8$$

delimiter $$

CREATE TABLE `almacen` (
  `idAlmacen` int(11) NOT NULL,
  `isbn` varchar(25) DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `precio` decimal(10,2) DEFAULT NULL,
  `observaciones` varchar(250) DEFAULT NULL,
  `fechaAlta` date DEFAULT NULL,
  `fechaBaja` date DEFAULT NULL,
  PRIMARY KEY (`idAlmacen`),
  KEY `FK_ISBN_ALMACEN` (`isbn`),
  CONSTRAINT `FK_ISBN_ALMACEN` FOREIGN KEY (`isbn`) REFERENCES `libro` (`isbn`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8$$

delimiter $$

CREATE TABLE `autores` (
  `idAutor` int(11) NOT NULL,
  `isbn` varchar(25) DEFAULT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `apellidoPaterno` varchar(45) DEFAULT NULL,
  `apellidoMaterno` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idAutor`),
  KEY `FK_ISBN_AUTOR` (`isbn`),
  CONSTRAINT `FK_ISBN_AUTOR` FOREIGN KEY (`isbn`) REFERENCES `libro` (`isbn`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8$$

delimiter $$

CREATE TABLE `catalogo` (
  `idCatalogo` int(11) NOT NULL,
  `isbn` varchar(25) DEFAULT NULL,
  `genero` varchar(45) DEFAULT NULL,
  `categoria` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idCatalogo`),
  KEY `FK_ISBN` (`isbn`),
  CONSTRAINT `FK_ISBN_CATALOGO` FOREIGN KEY (`isbn`) REFERENCES `libro` (`isbn`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8$$

delimiter $$

CREATE TABLE `clientes` (
  `idCliente` varchar(15) NOT NULL,
  `nombre` varchar(45) CHARACTER SET utf8 COLLATE utf8_spanish_ci DEFAULT NULL,
  `apellidoPaterno` varchar(45) CHARACTER SET utf8 COLLATE utf8_spanish_ci DEFAULT NULL,
  `apellidoMaterno` varchar(45) CHARACTER SET utf8 COLLATE utf8_spanish_ci DEFAULT NULL,
  `email` varchar(100) CHARACTER SET utf8 COLLATE utf8_spanish_ci DEFAULT NULL,
  `direccion` varchar(150) CHARACTER SET utf8 COLLATE utf8_spanish_ci DEFAULT NULL,
  `poblacion` varchar(45) CHARACTER SET utf8 COLLATE utf8_spanish_ci DEFAULT NULL,
  `telefono` varchar(14) CHARACTER SET utf8 COLLATE utf8_spanish_ci DEFAULT NULL,
  `codigoPostal` int(11) DEFAULT NULL,
  `intereses` varchar(250) CHARACTER SET utf8 COLLATE utf8_spanish_ci DEFAULT NULL,
  PRIMARY KEY (`idCliente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8$$

delimiter $$

CREATE TABLE `ofertas` (
  `idOferta` int(11) NOT NULL,
  `isbn` varchar(25) DEFAULT NULL,
  `idAlmacen` int(11) DEFAULT NULL,
  `marcaOferta` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`idOferta`),
  KEY `FK_ISBN` (`isbn`),
  KEY `FK_IDALMACEN` (`idAlmacen`),
  CONSTRAINT `FK_IDALMACEN` FOREIGN KEY (`idAlmacen`) REFERENCES `almacen` (`idAlmacen`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_ISBN` FOREIGN KEY (`isbn`) REFERENCES `libro` (`isbn`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8$$

delimiter $$

CREATE TABLE `usuarios` (
  `idUsuario` int(11) NOT NULL AUTO_INCREMENT,
  `usuario` varchar(45) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `password` varchar(45) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `email` varchar(100) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `idCliente` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`idUsuario`),
  KEY `FK_USUARIO_CLIENTE` (`idCliente`),
  CONSTRAINT `FK_USUARIO_CLIENTE` FOREIGN KEY (`idCliente`) REFERENCES `clientes` (`idCliente`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8$$

delimiter $$

CREATE TABLE `ventas` (
  `idVenta` int(11) NOT NULL,
  `isbn` varchar(25) DEFAULT NULL,
  `idCliente` varchar(15) DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `observaciones` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`idVenta`),
  KEY `FK_ISBN_VENTA` (`isbn`),
  KEY `FR_VENTA_CLIENTE` (`idCliente`),
  CONSTRAINT `FK_ISBN_VENTA` FOREIGN KEY (`isbn`) REFERENCES `libro` (`isbn`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FR_VENTA_CLIENTE` FOREIGN KEY (`idCliente`) REFERENCES `clientes` (`idCliente`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8$$



