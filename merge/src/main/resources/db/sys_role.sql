CREATE TABLE `sys_role` (
  `role_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色ID',
  `role_code` varchar(255) NOT NULL COMMENT '角色编码',
  `role_name` varchar(255) NOT NULL COMMENT '角色名称',
  PRIMARY KEY (`role_id`)
);

INSERT INTO `sys_role` VALUES ('1', 'ROLE_ADMIN', '管理员');
