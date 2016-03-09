/*
Navicat MySQL Data Transfer
 
Source Server         : localhost
Source Server Version : 50141
Source Host           : localhost:3306
Source Database       : testdb
 
Target Server Type    : MYSQL
Target Server Version : 50141
File Encoding         : 65001
 
Date: 2016-01-23 16:47:52
*/
 
SET FOREIGN_KEY_CHECKS=0;
 
-- ----------------------------
-- Table structure for `sys_user`
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` int(11) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `name` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `pass` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;