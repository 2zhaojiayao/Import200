/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50506
Source Host           : localhost:3306
Source Database       : ant1

Target Server Type    : MYSQL
Target Server Version : 50506
File Encoding         : 65001

Date: 2018-11-22 10:57:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `activity_information`
-- ----------------------------
DROP TABLE IF EXISTS `activity_information`;
CREATE TABLE `activity_information` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  `description` varchar(1000) COLLATE utf8_unicode_ci DEFAULT NULL,
  `organization_id` int(11) DEFAULT NULL,
  `level` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `apply_begin` datetime DEFAULT NULL,
  `apply_end` datetime DEFAULT NULL,
  `hold_begin` datetime DEFAULT NULL,
  `hold_end` datetime DEFAULT NULL,
  `hold_place` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `style` varchar(6) COLLATE utf8_unicode_ci DEFAULT NULL,
  `participate` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  `image` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `type` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `is_interview` char(2) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='������';

-- ----------------------------
-- Records of activity_information
-- ----------------------------

-- ----------------------------
-- Table structure for `activity_score`
-- ----------------------------
DROP TABLE IF EXISTS `activity_score`;
CREATE TABLE `activity_score` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `activity_id` int(11) DEFAULT NULL,
  `stage` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `score` float DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='��׶η�ֵ��';

-- ----------------------------
-- Records of activity_score
-- ----------------------------

-- ----------------------------
-- Table structure for `basic_score`
-- ----------------------------
DROP TABLE IF EXISTS `basic_score`;
CREATE TABLE `basic_score` (
  `student_id` char(10) COLLATE utf8_unicode_ci NOT NULL,
  `student_name` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `moral_score` float DEFAULT NULL,
  `study_score` float DEFAULT NULL,
  PRIMARY KEY (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='Ʒ�л�����';

-- ----------------------------
-- Records of basic_score
-- ----------------------------

-- ----------------------------
-- Table structure for `class_information`
-- ----------------------------
DROP TABLE IF EXISTS `class_information`;
CREATE TABLE `class_information` (
  `class_id` int(11) NOT NULL AUTO_INCREMENT,
  `profession_id` int(11) DEFAULT NULL,
  `grade` varchar(6) COLLATE utf8_unicode_ci DEFAULT NULL,
  `my_class` varchar(6) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`class_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='�༶��Ϣ��';

-- ----------------------------
-- Records of class_information
-- ----------------------------

-- ----------------------------
-- Table structure for `college_information`
-- ----------------------------
DROP TABLE IF EXISTS `college_information`;
CREATE TABLE `college_information` (
  `college_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`college_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='ѧԺ��Ϣ��';

-- ----------------------------
-- Records of college_information
-- ----------------------------

-- ----------------------------
-- Table structure for `monitor_user`
-- ----------------------------
DROP TABLE IF EXISTS `monitor_user`;
CREATE TABLE `monitor_user` (
  `email` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  `class_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='��ί��Ϣ��';

-- ----------------------------
-- Records of monitor_user
-- ----------------------------

-- ----------------------------
-- Table structure for `organization_user`
-- ----------------------------
DROP TABLE IF EXISTS `organization_user`;
CREATE TABLE `organization_user` (
  `organization_id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  `password` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  `name` varchar(60) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`organization_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='��֯��Ϣ��';

-- ----------------------------
-- Records of organization_user
-- ----------------------------

-- ----------------------------
-- Table structure for `profession_information`
-- ----------------------------
DROP TABLE IF EXISTS `profession_information`;
CREATE TABLE `profession_information` (
  `profession_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  `college_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`profession_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='רҵ��Ϣ��';

-- ----------------------------
-- Records of profession_information
-- ----------------------------

-- ----------------------------
-- Table structure for `student_comprehensive`
-- ----------------------------
DROP TABLE IF EXISTS `student_comprehensive`;
CREATE TABLE `student_comprehensive` (
  `student_id` int(11) NOT NULL,
  `score` float DEFAULT NULL,
  PRIMARY KEY (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='�۲��';

-- ----------------------------
-- Records of student_comprehensive
-- ----------------------------

-- ----------------------------
-- Table structure for `student_join`
-- ----------------------------
DROP TABLE IF EXISTS `student_join`;
CREATE TABLE `student_join` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` char(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `score_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='������';

-- ----------------------------
-- Records of student_join
-- ----------------------------

-- ----------------------------
-- Table structure for `student_scan`
-- ----------------------------
DROP TABLE IF EXISTS `student_scan`;
CREATE TABLE `student_scan` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` char(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `activity_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='������Ļ��';

-- ----------------------------
-- Records of student_scan
-- ----------------------------

-- ----------------------------
-- Table structure for `student_user`
-- ----------------------------
DROP TABLE IF EXISTS `student_user`;
CREATE TABLE `student_user` (
  `id` char(10) COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  `name` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `gender` char(2) COLLATE utf8_unicode_ci DEFAULT NULL,
  `email` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  `class_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='ѧ�����˱�';

-- ----------------------------
-- Records of student_user
-- ----------------------------
