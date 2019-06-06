/*
 Navicat MySQL Data Transfer

 Source Server         : root
 Source Server Type    : MySQL
 Source Server Version : 50523
 Source Host           : localhost:3306
 Source Schema         : spring_qst

 Target Server Type    : MySQL
 Target Server Version : 50523
 File Encoding         : 65001

 Date: 06/06/2019 10:50:38
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tran
-- ----------------------------
DROP TABLE IF EXISTS `tran`;
CREATE TABLE `tran`  (
  `uid` tinyint(2) NOT NULL AUTO_INCREMENT,
  `uname` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `usex` varchar(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  PRIMARY KEY (`uid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 39 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tran
-- ----------------------------
INSERT INTO `tran` VALUES (1, '张九', '女');
INSERT INTO `tran` VALUES (31, '张四', '男');
INSERT INTO `tran` VALUES (32, '张五', '女');
INSERT INTO `tran` VALUES (34, '陈恒', '男');
INSERT INTO `tran` VALUES (37, '李张五', '女');
INSERT INTO `tran` VALUES (38, 'Fcant', 'male');

SET FOREIGN_KEY_CHECKS = 1;
