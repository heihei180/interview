# 使用说明
* 项目拉取后导入idea    
* 配置数据库： application.properties 文件中 
* 启动项目，默认端口8080
* 访问 127.0.0.7:8080/index
* 数据库建表sql
`CREATE TABLE `user` (
      `id` int(11) NOT NULL AUTO_INCREMENT,
      `name` varchar(64) DEFAULT NULL,
      `age` int(4) DEFAULT NULL,
      `create_date` datetime NULL DEFAULT NULL,
      PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;`

## 增加用户
* 用户名和年龄填写数据
* id可写可不写，没做限制，写的话必须保证不重复
* 填写完毕，点击添加用户

## 删除用户
* 输入用户ID 
* 点击删除用户

## 修改用户
* 输入用户ID 
* 输入名字和年龄
* 点击修改用户

## 查询用户
* 输入ID，名字，年龄
* 点击查询用户

