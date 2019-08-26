CREATE TABLE `sys_user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `username` varchar(255) NOT NULL COMMENT '登录名',
  `password` varchar(255) NOT NULL COMMENT '密码',
  `user_real_name` varchar(255) NOT NULL COMMENT '用户真实姓名',
  `phone` varchar(255) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `credit` int(11) DEFAULT '100' COMMENT '信用值',
  PRIMARY KEY (`user_id`)
);

INSERT INTO `sys_user` VALUES ('1', 'admin', 'admin', '管理员', '12345678910', 'hellozhaoxudong@163.com', '100');
