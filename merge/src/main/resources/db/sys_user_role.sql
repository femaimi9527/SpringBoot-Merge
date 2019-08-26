CREATE TABLE `sys_user_role` (
  `user_role_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户角色信息ID',
  `user_id` int(11) NOT NULL COMMENT '用户ID',
  `role_id` int(11) NOT NULL,
  PRIMARY KEY (`user_role_id`)
);

INSERT INTO `sys_user_role` VALUES ('1', '1', '1');
