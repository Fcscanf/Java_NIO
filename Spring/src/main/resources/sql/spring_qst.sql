/*
 Navicat Premium Data Transfer

 Source Server         : root
 Source Server Type    : MySQL
 Source Server Version : 50523
 Source Host           : localhost:3306
 Source Schema         : spring_qst

 Target Server Type    : MySQL
 Target Server Version : 50523
 File Encoding         : 65001

 Date: 10/06/2019 18:52:36
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_card
-- ----------------------------
DROP TABLE IF EXISTS `t_card`;
CREATE TABLE `t_card`  (
  `cid` int(20) NOT NULL,
  `balance` int(20) DEFAULT NULL,
  `suid` int(20) DEFAULT NULL,
  PRIMARY KEY (`cid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_student
-- ----------------------------
DROP TABLE IF EXISTS `t_student`;
CREATE TABLE `t_student`  (
  `suid` int(20) NOT NULL,
  `suname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `suage` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`suid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for tran
-- ----------------------------
DROP TABLE IF EXISTS `tran`;
CREATE TABLE `tran`  (
  `uid` tinyint(2) NOT NULL AUTO_INCREMENT,
  `uname` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `usex` varchar(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`uid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 100 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tran
-- ----------------------------
INSERT INTO `tran` VALUES (1, '张九', '女');
INSERT INTO `tran` VALUES (31, '张四', '男');
INSERT INTO `tran` VALUES (37, '李张五', '女');
INSERT INTO `tran` VALUES (38, 'Fcant', 'male');
INSERT INTO `tran` VALUES (90, 'Frank', 'man');
INSERT INTO `tran` VALUES (93, 'jeer', 'man');
INSERT INTO `tran` VALUES (94, 'Frank', 'man');
INSERT INTO `tran` VALUES (99, 'jack', 'man');

SET FOREIGN_KEY_CHECKS = 1;
