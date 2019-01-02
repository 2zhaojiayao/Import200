/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50506
Source Host           : localhost:3306
Source Database       : ant

Target Server Type    : MYSQL
Target Server Version : 50506
File Encoding         : 65001

Date: 2019-01-02 08:21:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `activity_information`
-- ----------------------------
DROP TABLE IF EXISTS `activity_information`;
CREATE TABLE `activity_information` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  `description` varchar(1000) DEFAULT NULL,
  `organization_id` int(11) DEFAULT NULL,
  `level` varchar(10) DEFAULT NULL,
  `apply_begin` datetime DEFAULT NULL,
  `apply_end` datetime DEFAULT NULL,
  `hold_begin` datetime DEFAULT NULL,
  `hold_end` datetime DEFAULT NULL,
  `hold_place` varchar(50) DEFAULT NULL,
  `style` varchar(6) DEFAULT NULL,
  `participant` varchar(30) DEFAULT NULL,
  `image` varchar(100) DEFAULT NULL,
  `search_type` varchar(10) DEFAULT NULL,
  `comprehensive_type` varchar(10) DEFAULT NULL,
  `is_interview` char(2) DEFAULT NULL,
  `student_number` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 COMMENT='活动详情表';

-- ----------------------------
-- Records of activity_information
-- ----------------------------
INSERT INTO `activity_information` VALUES ('1', '阳光长跑', '描述', '1', '国家级', '2018-12-05 15:47:34', '2018-12-19 15:47:41', '2019-01-01 17:29:56', '2019-01-05 15:46:07', '河北师范大学', '团体', '河北师范大学在校生', 'images/activity1.jpg', '文体竞赛', '能力表现', '否', '7');
INSERT INTO `activity_information` VALUES ('2', '小程序', '描述', '2', '省级', '2018-12-13 13:49:26', '2018-12-17 13:49:32', '2018-12-19 19:34:52', '2018-12-20 15:46:11', '河北师范大学', '团体', '软件学院全体学生', 'images/activity2.jpg', '学术竞赛', '能力表现', '否', '68');
INSERT INTO `activity_information` VALUES ('3', '运动会', '描述', '1', '市级', '2018-12-20 13:49:40', '2018-12-25 13:49:36', '2018-12-26 19:34:58', '2018-12-28 15:38:51', '风雨操场', '个人', '河北师范大学在校生', 'images/activity3.jpg', '文体竞赛', '能力表现', '否', '5');
INSERT INTO `activity_information` VALUES ('4', '德艺双馨', '描述', '2', '校级', '2018-12-12 13:49:50', '2018-12-15 13:49:56', '2018-12-20 19:35:05', '2018-12-25 15:46:17', '金圆大厦', '个人', '软件学院大二学生', 'images/activity4.jpg', '志愿活动', '能力表现', '是', '18');
INSERT INTO `activity_information` VALUES ('5', '永远跟党走', '描述', '1', '院级', '2019-01-01 13:49:50', '2019-01-06 13:49:50', '2019-01-08 13:49:50', '2019-01-10 15:46:22', '金圆大厦', '个人', '软件学院大二学生', 'images/activity5.jpg', '文体竞赛', '能力表现', '是', '100');
INSERT INTO `activity_information` VALUES ('6', '主持人大赛', '描述', '1', '院级', '2018-12-26 13:49:50', '2018-12-27 13:49:50', '2018-12-30 13:49:50', '2019-01-03 15:46:27', '美术与设计学院报告厅', '个人', '软件学院全体学生', 'images/activity6.jpg', '学术竞赛', '能力表现', '否', '10');
INSERT INTO `activity_information` VALUES ('7', '摄影大赛', '描述', '1', '院级', '2018-12-12 13:49:50', '2018-12-12 13:49:50', '2018-12-12 13:49:50', '2018-12-29 15:46:31', '河北师范大学', '个人', '河北师范大学在校生', 'images/activity7.jpg', '文体竞赛', '能力表现', '否', '8');
INSERT INTO `activity_information` VALUES ('8', '演讲比赛', '描述', '1', '院级', '2019-01-01 13:49:50', '2019-01-05 13:49:50', '2019-01-06 13:49:50', '2019-01-10 13:49:50', '河北师范大学', '个人', '河北师范大学在校生', 'images/activity8.jpg', '文体竞赛', '能力表现', '否', '20');
INSERT INTO `activity_information` VALUES ('9', '诗歌比赛', '描述', '1', '院级', '2019-01-12 13:49:50', '2019-01-15 13:49:50', '2019-01-16 13:49:50', '2019-01-18 13:49:50', '河北师范大学', '个人', '河北师范大学在校生', 'images/activity8.jpg', '文体竞赛', '能力表现', '否', '5');
INSERT INTO `activity_information` VALUES ('10', '1', '描述', '1', '市级', '2018-12-25 14:27:28', '2019-01-01 14:27:33', '2019-01-05 14:27:39', '2019-01-10 14:27:45', '河北师范大学', '个人', '河北师范大学在校生', 'images/activity1.jpg', '文体竞赛', '能力表现', '否', '10');
INSERT INTO `activity_information` VALUES ('11', '123', '描述', '1', '国家级', '2018-12-20 13:49:50', '2018-12-31 14:29:16', '2019-01-05 14:29:22', '2019-01-05 14:29:27', '河北师范大学', '个人', '河北师范大学在校生', 'images/activity2.jpg', '文体竞赛', '能力表现', '否', '1');
INSERT INTO `activity_information` VALUES ('12', '麦dream', '为弘扬团学精神，营造良好的学校文化氛围，丰富校园文化生活，关注软件学院的播音主持事业，展现软件学子青春、热情的精神面貌，特开展我院主持人风采大赛，为共青团成立95周年献礼。', '1', '院级', '2018-12-26 07:53:08', '2018-12-28 07:53:15', '2019-01-07 07:53:30', '2019-01-10 07:53:37', '美术与设计学院', '个人', '软件学院全体学生', 'images/sign.jpg', '文体竞赛', '能力表现', '否', '52');

-- ----------------------------
-- Table structure for `activity_score`
-- ----------------------------
DROP TABLE IF EXISTS `activity_score`;
CREATE TABLE `activity_score` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `activity_id` int(11) DEFAULT NULL,
  `stage` varchar(10) DEFAULT NULL,
  `score` float DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COMMENT='活动阶段分值表';

-- ----------------------------
-- Records of activity_score
-- ----------------------------
INSERT INTO `activity_score` VALUES ('1', '1', '初赛', '2');
INSERT INTO `activity_score` VALUES ('2', '1', '复赛', '1');
INSERT INTO `activity_score` VALUES ('3', '2', '初赛', '2');
INSERT INTO `activity_score` VALUES ('4', '3', '决赛', '2');
INSERT INTO `activity_score` VALUES ('5', '4', '报名', '2');
INSERT INTO `activity_score` VALUES ('6', '2', '复赛', '1');
INSERT INTO `activity_score` VALUES ('7', '5', '决赛', '3');

-- ----------------------------
-- Table structure for `activity_sum`
-- ----------------------------
DROP TABLE IF EXISTS `activity_sum`;
CREATE TABLE `activity_sum` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` int(11) DEFAULT NULL,
  `activity_name` varchar(30) DEFAULT NULL,
  `year` varchar(10) DEFAULT NULL,
  `score` float DEFAULT NULL,
  `type` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=130 DEFAULT CHARSET=utf8 COMMENT='活动汇总表';

-- ----------------------------
-- Records of activity_sum
-- ----------------------------
INSERT INTO `activity_sum` VALUES ('119', '2016011403', '12345上山打老虎', '2018', '3', '文体竞赛');
INSERT INTO `activity_sum` VALUES ('120', '2016011402', '诗歌比赛7', '2018', '2', '文体竞赛');
INSERT INTO `activity_sum` VALUES ('121', '2016011402', '诗歌比赛4', '2018', '2', '文体竞赛');
INSERT INTO `activity_sum` VALUES ('122', '2016011004', '主持人大赛', '2018', '2', '学术竞赛');
INSERT INTO `activity_sum` VALUES ('123', '2016011377', '演讲比赛', '2018', '3', '文体竞赛');
INSERT INTO `activity_sum` VALUES ('124', '2016011003', '永远跟党走', '2018', '3', '文体竞赛');
INSERT INTO `activity_sum` VALUES ('125', '2016011000', '小程序8', '2018', '1', '学术竞赛');
INSERT INTO `activity_sum` VALUES ('126', '2016011000', '小程序3', '2018', '1', '学术竞赛');
INSERT INTO `activity_sum` VALUES ('127', '2016011005', '摄影大赛', '2018', '2', '文体竞赛');
INSERT INTO `activity_sum` VALUES ('128', '2016011001', '运动会', '2018', '3', '文体竞赛');
INSERT INTO `activity_sum` VALUES ('129', '2016011002', '德艺双馨', '2018', '1', '志愿活动');

-- ----------------------------
-- Table structure for `basic_score`
-- ----------------------------
DROP TABLE IF EXISTS `basic_score`;
CREATE TABLE `basic_score` (
  `student_id` char(10) NOT NULL,
  `student_name` varchar(20) DEFAULT NULL,
  `study_score` double DEFAULT NULL,
  PRIMARY KEY (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='学业品德表现表';

-- ----------------------------
-- Records of basic_score
-- ----------------------------
INSERT INTO `basic_score` VALUES ('2016011000', '成球', '100');
INSERT INTO `basic_score` VALUES ('2016011001', '黄文旭', '99');
INSERT INTO `basic_score` VALUES ('2016011002', '王梦真', '98');
INSERT INTO `basic_score` VALUES ('2016011003', '成琼', '97');
INSERT INTO `basic_score` VALUES ('2016011004', '杨丽颖', '96');
INSERT INTO `basic_score` VALUES ('2016011005', '陈培莹', '95');
INSERT INTO `basic_score` VALUES ('2016011333', '陈浩', '94');
INSERT INTO `basic_score` VALUES ('2016011377', '赵家瑶', '93');
INSERT INTO `basic_score` VALUES ('2016011402', '徐俊美', '92');
INSERT INTO `basic_score` VALUES ('2016011403', '丁路', '91');

-- ----------------------------
-- Table structure for `class_information`
-- ----------------------------
DROP TABLE IF EXISTS `class_information`;
CREATE TABLE `class_information` (
  `class_id` int(11) NOT NULL AUTO_INCREMENT,
  `profession_id` int(11) DEFAULT NULL,
  `grade` varchar(6) DEFAULT NULL,
  `my_class` varchar(6) DEFAULT NULL,
  PRIMARY KEY (`class_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='班级信息表';

-- ----------------------------
-- Records of class_information
-- ----------------------------
INSERT INTO `class_information` VALUES ('1', '80902', '2018', '1');
INSERT INTO `class_information` VALUES ('2', '80902', '2016', '2');
INSERT INTO `class_information` VALUES ('3', '80902', '2016', '3');
INSERT INTO `class_information` VALUES ('4', '80902', '2018', '3');

-- ----------------------------
-- Table structure for `college_information`
-- ----------------------------
DROP TABLE IF EXISTS `college_information`;
CREATE TABLE `college_information` (
  `college_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`college_id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8 COMMENT='学院信息表';

-- ----------------------------
-- Records of college_information
-- ----------------------------
INSERT INTO `college_information` VALUES ('1', '软件学院');
INSERT INTO `college_information` VALUES ('2', '教育学院');
INSERT INTO `college_information` VALUES ('3', '文学院');
INSERT INTO `college_information` VALUES ('4', '国际文化交流学院');
INSERT INTO `college_information` VALUES ('5', '历史文化学院');
INSERT INTO `college_information` VALUES ('6', '外国语学院');
INSERT INTO `college_information` VALUES ('7', '音乐学院');
INSERT INTO `college_information` VALUES ('8', '美术与设计学院');
INSERT INTO `college_information` VALUES ('9', '新闻传播学院');
INSERT INTO `college_information` VALUES ('10', '商学院');
INSERT INTO `college_information` VALUES ('11', '法政与公共管理学院');
INSERT INTO `college_information` VALUES ('12', '数学与信息科学学院');
INSERT INTO `college_information` VALUES ('13', '物理科学与信息工程学院');
INSERT INTO `college_information` VALUES ('14', '化学与材料科学学院');
INSERT INTO `college_information` VALUES ('15', '生命科学学院');
INSERT INTO `college_information` VALUES ('16', '资源与环境科学学院');
INSERT INTO `college_information` VALUES ('17', '体育学院');
INSERT INTO `college_information` VALUES ('18', '信息技术学院');
INSERT INTO `college_information` VALUES ('19', '职业技术学院');
INSERT INTO `college_information` VALUES ('20', '旅游系');
INSERT INTO `college_information` VALUES ('21', '马克思主义学院');
INSERT INTO `college_information` VALUES ('22', '中燃工学院');

-- ----------------------------
-- Table structure for `monitor_user`
-- ----------------------------
DROP TABLE IF EXISTS `monitor_user`;
CREATE TABLE `monitor_user` (
  `email` varchar(30) NOT NULL,
  `password` varchar(32) DEFAULT NULL,
  `class_id` int(11) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `validate_code` varchar(32) DEFAULT NULL,
  `register_time` datetime DEFAULT NULL,
  PRIMARY KEY (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='班委信息表';

-- ----------------------------
-- Records of monitor_user
-- ----------------------------
INSERT INTO `monitor_user` VALUES ('1649304921@qq.com', '0884d3007f1937b76b2e6548a17f36a5', '1', '1', 'aea20b83ca6a1a49eb1f52ee2c6664e3', '2019-01-01 21:51:42');

-- ----------------------------
-- Table structure for `moral_score`
-- ----------------------------
DROP TABLE IF EXISTS `moral_score`;
CREATE TABLE `moral_score` (
  `student_id` char(10) NOT NULL,
  `student_name` varchar(20) DEFAULT NULL,
  `moral_score` double DEFAULT NULL,
  PRIMARY KEY (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='品德基础表';

-- ----------------------------
-- Records of moral_score
-- ----------------------------
INSERT INTO `moral_score` VALUES ('2016011000', '成球', '100');
INSERT INTO `moral_score` VALUES ('2016011001', '黄文旭', '100');
INSERT INTO `moral_score` VALUES ('2016011002', '王梦真', '100');
INSERT INTO `moral_score` VALUES ('2016011003', '成琼', '100');
INSERT INTO `moral_score` VALUES ('2016011004', '杨丽颖', '100');
INSERT INTO `moral_score` VALUES ('2016011005', '陈培莹', '100');
INSERT INTO `moral_score` VALUES ('2016011333', '陈浩', '100');
INSERT INTO `moral_score` VALUES ('2016011377', '赵家瑶', '100');
INSERT INTO `moral_score` VALUES ('2016011402', '徐俊美', '100');
INSERT INTO `moral_score` VALUES ('2016011403', '丁路', '100');

-- ----------------------------
-- Table structure for `organization_user`
-- ----------------------------
DROP TABLE IF EXISTS `organization_user`;
CREATE TABLE `organization_user` (
  `organization_id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(30) DEFAULT NULL,
  `password` varchar(32) DEFAULT NULL,
  `name` varchar(60) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `validate_code` varchar(32) DEFAULT NULL,
  `register_time` datetime DEFAULT NULL,
  PRIMARY KEY (`organization_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='组织信息表';

-- ----------------------------
-- Records of organization_user
-- ----------------------------

-- ----------------------------
-- Table structure for `profession_information`
-- ----------------------------
DROP TABLE IF EXISTS `profession_information`;
CREATE TABLE `profession_information` (
  `profession_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  `college_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`profession_id`)
) ENGINE=InnoDB AUTO_INCREMENT=130509 DEFAULT CHARSET=utf8 COMMENT='专业信息表';

-- ----------------------------
-- Records of profession_information
-- ----------------------------
INSERT INTO `profession_information` VALUES ('20101', '经济学', '10');
INSERT INTO `profession_information` VALUES ('20102', '经济统计学', '10');
INSERT INTO `profession_information` VALUES ('20302', '金融工程', '10');
INSERT INTO `profession_information` VALUES ('20401', '国际经济与贸易', '10');
INSERT INTO `profession_information` VALUES ('30101', '法学', '11');
INSERT INTO `profession_information` VALUES ('30201', '政治学与行政学', '11');
INSERT INTO `profession_information` VALUES ('30503', '思想政治教育', '1');
INSERT INTO `profession_information` VALUES ('40101', '教育学', '2');
INSERT INTO `profession_information` VALUES ('40102', '科学教育', '14');
INSERT INTO `profession_information` VALUES ('40104', '教育技术学', '18');
INSERT INTO `profession_information` VALUES ('40106', '学前教育', '2');
INSERT INTO `profession_information` VALUES ('40107', '小学教育', '2');
INSERT INTO `profession_information` VALUES ('40201', '体育教育', '17');
INSERT INTO `profession_information` VALUES ('40203', '社会体育指导与管理', '17');
INSERT INTO `profession_information` VALUES ('50101', '汉语言文学', '3');
INSERT INTO `profession_information` VALUES ('50102', '汉语言', '3');
INSERT INTO `profession_information` VALUES ('50103', '汉语国际教育', '4');
INSERT INTO `profession_information` VALUES ('50107', '秘书学', '3');
INSERT INTO `profession_information` VALUES ('50201', '英语', '6');
INSERT INTO `profession_information` VALUES ('50202', '俄语', '6');
INSERT INTO `profession_information` VALUES ('50205', '西班牙语', '6');
INSERT INTO `profession_information` VALUES ('50207', '日语', '6');
INSERT INTO `profession_information` VALUES ('50261', '翻译', '6');
INSERT INTO `profession_information` VALUES ('50301', '新闻学', '9');
INSERT INTO `profession_information` VALUES ('50302', '广播电视学', '9');
INSERT INTO `profession_information` VALUES ('50303', '广告学', '9');
INSERT INTO `profession_information` VALUES ('60101', '历史学', '5');
INSERT INTO `profession_information` VALUES ('60103', '考古学', '5');
INSERT INTO `profession_information` VALUES ('70101', '数学与应用数学', '12');
INSERT INTO `profession_information` VALUES ('70102', '信息与计算科学', '12');
INSERT INTO `profession_information` VALUES ('70201', '物理学', '13');
INSERT INTO `profession_information` VALUES ('70202', '应用物理学', '13');
INSERT INTO `profession_information` VALUES ('70301', '化学', '14');
INSERT INTO `profession_information` VALUES ('70302', '应用化学', '14');
INSERT INTO `profession_information` VALUES ('70501', '地理科学', '16');
INSERT INTO `profession_information` VALUES ('70502', '自然地理与资源环境', '16');
INSERT INTO `profession_information` VALUES ('70503', '人文地理与城乡规划', '16');
INSERT INTO `profession_information` VALUES ('70802', '空间科学与技术', '13');
INSERT INTO `profession_information` VALUES ('71001', '生物科学', '15');
INSERT INTO `profession_information` VALUES ('71002', '生物技术', '15');
INSERT INTO `profession_information` VALUES ('71004', '生态学', '15');
INSERT INTO `profession_information` VALUES ('71101', '心理学', '2');
INSERT INTO `profession_information` VALUES ('71102', '应用心理学', '2');
INSERT INTO `profession_information` VALUES ('71202', '应用统计学', '12');
INSERT INTO `profession_information` VALUES ('80201', '机械工程', '19');
INSERT INTO `profession_information` VALUES ('80208', '汽车服务工程', '19');
INSERT INTO `profession_information` VALUES ('80902', '软件工程', '21');
INSERT INTO `profession_information` VALUES ('80903', '网络工程', '18');
INSERT INTO `profession_information` VALUES ('81002', '建筑环境与能源应用工程', '22');
INSERT INTO `profession_information` VALUES ('120401', '公共事业管理', '2');
INSERT INTO `profession_information` VALUES ('120402', '行政管理', '11');
INSERT INTO `profession_information` VALUES ('120403', '劳动与社会保障', '11');
INSERT INTO `profession_information` VALUES ('120801', '电子商务', '18');
INSERT INTO `profession_information` VALUES ('130201', '音乐表演', '7');
INSERT INTO `profession_information` VALUES ('130202', '音乐学', '7');
INSERT INTO `profession_information` VALUES ('130204', '舞蹈表演', '7');
INSERT INTO `profession_information` VALUES ('130301', '表演', '20');
INSERT INTO `profession_information` VALUES ('130310', '动画', '8');
INSERT INTO `profession_information` VALUES ('130401', '美术学', '8');
INSERT INTO `profession_information` VALUES ('130402', '绘画', '8');
INSERT INTO `profession_information` VALUES ('130403', '雕塑', '8');
INSERT INTO `profession_information` VALUES ('130405', '书法学', '8');
INSERT INTO `profession_information` VALUES ('130502', '视觉传达设计', '8');
INSERT INTO `profession_information` VALUES ('130503', '环境设计', '8');
INSERT INTO `profession_information` VALUES ('130504', '产品设计', '8');
INSERT INTO `profession_information` VALUES ('130505', '服装与服饰设计', '8');
INSERT INTO `profession_information` VALUES ('130508', '数字媒体艺术', '8');

-- ----------------------------
-- Table structure for `student_comprehensive`
-- ----------------------------
DROP TABLE IF EXISTS `student_comprehensive`;
CREATE TABLE `student_comprehensive` (
  `student_id` int(11) NOT NULL,
  `student_name` varchar(20) DEFAULT NULL,
  `score` float DEFAULT NULL,
  PRIMARY KEY (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='综测表';

-- ----------------------------
-- Records of student_comprehensive
-- ----------------------------
INSERT INTO `student_comprehensive` VALUES ('2016011000', '成球', '100');
INSERT INTO `student_comprehensive` VALUES ('2016011001', '黄文旭', '97.6751');
INSERT INTO `student_comprehensive` VALUES ('2016011002', '王梦真', '96.6943');
INSERT INTO `student_comprehensive` VALUES ('2016011003', '成琼', '92.7544');
INSERT INTO `student_comprehensive` VALUES ('2016011004', '杨丽颖', '90.0001');
INSERT INTO `student_comprehensive` VALUES ('2016011005', '陈培莹', '86.9982');
INSERT INTO `student_comprehensive` VALUES ('2016011333', '陈浩', '83.3345');
INSERT INTO `student_comprehensive` VALUES ('2016011377', '赵家瑶', '81.1258');
INSERT INTO `student_comprehensive` VALUES ('2016011402', '徐俊美', '78.6373');
INSERT INTO `student_comprehensive` VALUES ('2016011403', '丁路', '75.8394');

-- ----------------------------
-- Table structure for `student_join`
-- ----------------------------
DROP TABLE IF EXISTS `student_join`;
CREATE TABLE `student_join` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` char(10) DEFAULT NULL,
  `score_id` int(11) DEFAULT NULL,
  `team_name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 COMMENT='参赛表';

-- ----------------------------
-- Records of student_join
-- ----------------------------
INSERT INTO `student_join` VALUES ('1', '2016011000', '2', null);
INSERT INTO `student_join` VALUES ('2', '2016011000', '3', null);
INSERT INTO `student_join` VALUES ('3', '2016011000', '4', null);
INSERT INTO `student_join` VALUES ('4', '2016011000', '5', null);
INSERT INTO `student_join` VALUES ('5', '2016011000', '7', null);
INSERT INTO `student_join` VALUES ('6', '2016011001', '1', null);
INSERT INTO `student_join` VALUES ('7', '2016011001', '7', null);
INSERT INTO `student_join` VALUES ('8', '2016011002', '3', null);
INSERT INTO `student_join` VALUES ('9', '2016011003', '5', null);
INSERT INTO `student_join` VALUES ('10', '2016011004', '6', null);
INSERT INTO `student_join` VALUES ('11', '2016011005', '4', null);

-- ----------------------------
-- Table structure for `student_scan`
-- ----------------------------
DROP TABLE IF EXISTS `student_scan`;
CREATE TABLE `student_scan` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` char(10) DEFAULT NULL,
  `activity_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='浏览过的活动表';

-- ----------------------------
-- Records of student_scan
-- ----------------------------
INSERT INTO `student_scan` VALUES ('1', '2016011377', '1');
INSERT INTO `student_scan` VALUES ('2', '2016011377', '2');
INSERT INTO `student_scan` VALUES ('3', '2016011377', '3');

-- ----------------------------
-- Table structure for `student_user`
-- ----------------------------
DROP TABLE IF EXISTS `student_user`;
CREATE TABLE `student_user` (
  `id` char(10) NOT NULL,
  `password` varchar(32) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `gender` char(2) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `class_id` int(11) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `validate_code` varchar(32) DEFAULT NULL,
  `register_time` datetime DEFAULT NULL,
  `photo` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='学生个人表';

-- ----------------------------
-- Records of student_user
-- ----------------------------
INSERT INTO `student_user` VALUES ('2016011000', '1111', '黄文旭', '女', '123@qq.com', '1', '1', '487f87505f619bf9ea08f26bb34f8118', '2018-12-18 10:54:10', null);
INSERT INTO `student_user` VALUES ('2016011001', '2345', '王梦真', '女', '123@qq.com', '1', '1', '487f87505f619bf9ea08f26bb34f8118', '2019-02-14 10:54:14', null);
INSERT INTO `student_user` VALUES ('2016011002', '23455', '成琼', '女', '123@qq.com', '1', '1', '487f87505f619bf9ea08f26bb34f8118', '2018-12-13 10:54:29', null);
INSERT INTO `student_user` VALUES ('2016011003', 'erthy', '杨丽颖', '女', '123@qq.com', '1', '1', '487f87505f619bf9ea08f26bb34f8118', '2018-12-13 10:54:29', null);
INSERT INTO `student_user` VALUES ('2016011004', 'fd', '陈培莹', '女', '123@qq.com', '1', '1', '487f87505f619bf9ea08f26bb34f8118', '2018-12-13 10:54:29', null);
INSERT INTO `student_user` VALUES ('2016011005', 'efrgthg', '陈浩', '女', '123@qq.com', '1', '1', '487f87505f619bf9ea08f26bb34f8118', '2018-12-13 10:54:29', null);
INSERT INTO `student_user` VALUES ('2016011333', 'f8a63df74cefd3102b17aaf7f26378d2', '成球', '女', '123@qq.com', '1', '1', '487f87505f619bf9ea08f26bb34f8118', '2018-12-19 15:14:13', null);
INSERT INTO `student_user` VALUES ('2016011377', 'e13f3643cc57e9c43577229842080912', '赵家瑶', '女', '909658364@qq.com', '1', '1', 'd9df5a8e9d9e2e6d3644cad368e250cd', '2018-12-17 14:54:30', null);
INSERT INTO `student_user` VALUES ('2016011402', '0884d3007f1937b76b2e6548a17f36a5', '徐俊美', '女', '1649304921@qq.com', '1', '1', 'aea20b83ca6a1a49eb1f52ee2c6664e3', '2018-12-18 14:25:16', null);
INSERT INTO `student_user` VALUES ('2016011403', '895e6acda085a4196864e8b3cc99bd16', '丁路', '女', '490709869@qq.com', '1', '1', '487f87505f619bf9ea08f26bb34f8118', '2018-12-17 20:32:10', null);
