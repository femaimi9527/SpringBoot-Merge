# SpringBoot Merge
微型项目基础框架。SpringBoot、mybatis plus、spring security、logback、持续集成中...

### 1.使用IDEA打开项目
### 2.初始化用户信息
执行/resources/db下的sql初始化用户信息，默认有一个用户：用户名: admin, 密码: admin。
### 3.核心包
com.sboot.merge.core包为核心包，包含：
- 统一异常处理
- 统一返回结构
- 基于mybatis plus的自定义Service
- 用户登录认证控制
- 核心工具类
### 4.开发
在com.sboot.merge包下新建包用于其他业务模块开发。
### 5.登录页面、首页
![登录页面](/merge/src/main/resources/images/login.PNG)
![登录页面](/merge/src/main/resources/images/index.jpg)