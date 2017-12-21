/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : facturacion

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2017-12-20 14:40:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for cliente
-- ----------------------------
DROP TABLE IF EXISTS `cliente`;
CREATE TABLE `cliente` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cedula` varchar(45) DEFAULT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `direccion` varchar(45) DEFAULT NULL,
  `telefono` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for detalle
-- ----------------------------
DROP TABLE IF EXISTS `detalle`;
CREATE TABLE `detalle` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cantidad` double DEFAULT NULL,
  `subtotal` double DEFAULT NULL,
  `iva` double DEFAULT NULL,
  `total` double(255,0) DEFAULT NULL,
  `factura` int(11) DEFAULT NULL,
  `producto` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `factura` (`factura`),
  KEY `producto` (`producto`),
  CONSTRAINT `factura` FOREIGN KEY (`factura`) REFERENCES `factura` (`id`),
  CONSTRAINT `producto` FOREIGN KEY (`producto`) REFERENCES `producto` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for factura
-- ----------------------------
DROP TABLE IF EXISTS `factura`;
CREATE TABLE `factura` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fecha` varchar(255) DEFAULT NULL,
  `cliente` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `cliente` (`cliente`),
  CONSTRAINT `cliente` FOREIGN KEY (`cliente`) REFERENCES `cliente` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for producto
-- ----------------------------
DROP TABLE IF EXISTS `producto`;
CREATE TABLE `producto` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) DEFAULT NULL,
  `stock` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;
SET FOREIGN_KEY_CHECKS=1;
