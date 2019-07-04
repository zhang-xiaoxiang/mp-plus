/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50722
 Source Host           : localhost:3306
 Source Schema         : lvyou

 Target Server Type    : MySQL
 Target Server Version : 50722
 File Encoding         : 65001

 Date: 04/07/2019 23:50:31
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `user_id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '用户主键ID',
  `user_name` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户昵称',
  `user_phone` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户手机号',
  `user_password` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户登录密码',
  `user_icon` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户头像',
  `user_email` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户邮箱地址',
  `user_autonym` int(3) NULL DEFAULT NULL COMMENT '用户身份认证 (0未认证,1已认证)',
  `user_site` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户地址',
  `user_sex` int(1) NULL DEFAULT NULL COMMENT '用户性别( 0女,1男)',
  `user_date_birth` datetime(0) NULL DEFAULT NULL COMMENT '用户出生日期',
  `user_signature` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户个性签名',
  `user_vip` int(3) NULL DEFAULT NULL COMMENT '用户是否会员 ( 0否1是)',
  `c_id` varchar(64) CHARACTER SET tis620 COLLATE tis620_thai_ci NULL DEFAULT NULL COMMENT '移动设备唯一cid',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '用户注册时间',
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '客户端用户表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1559727297780946325', '张晓祥', '18883173476', 'e265048be258b4c63e2e0ac78a19ec1e', '1', '1090510535@qq.com', 123, '重庆', 1, '2019-07-04 19:45:05', '1', 1, '10086', '2019-06-05 17:34:58');
INSERT INTO `user` VALUES ('1559727297780946326', '长草颜团子', '18883173476', 'e265048be258b4c63e2e0ac78a19ec1e', '1', '1090510535@qq.com', 123, '重庆', 1, '2019-07-04 19:45:05', '1', 1, '10086', '2019-06-05 17:34:58');

SET FOREIGN_KEY_CHECKS = 1;
