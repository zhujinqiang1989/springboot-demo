
/*Table structure for table `tb_user` */
DROP TABLE IF EXISTS `tb_user`;

CREATE TABLE `tb_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `username` varchar(50) NOT NULL COMMENT '用户名',
  `age` int(11) NOT NULL COMMENT '年龄',
  `ctm` datetime NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `tb_user` */

insert  into `tb_user`(`id`,`username`,`age`,`ctm`) values (1,'张三',18,'2018-06-14 17:13:15'),(3,'王五',19,'2018-06-14 17:14:02'),(5,'zhaosi',18,'2018-06-14 19:38:08'),(6,'?qi',30,'2018-06-14 19:39:34'),(7,'??',29,'2018-06-14 19:41:12'),(8,'??',29,'2018-06-15 10:17:34'),(9,'liuneng',57,'2018-06-15 10:27:56');


/*Table structure for table `tb_student` */
CREATE TABLE `tb_student` (
  `id`  INT(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` VARCHAR(50) NOT NULL COMMENT '学生名称',
  `age` INT(11) NOT NULL COMMENT '年龄',
  `class_id` INT(11) NOT NULL  COMMENT '班级',
  `ctm` DATETIME NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)

) ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

INSERT  INTO `tb_student`(`id`,`name`,`age`, `class_id`, `ctm`) VALUES (1,'张三',18,1,'2018-06-14 17:13:15'),(3,'王五',19, 2,'2018-06-14 17:14:02'),(5,'zhaosi',18,2,'2018-06-14 19:38:08'),(6,'lisi',30,3,'2018-06-14 19:39:34'),(7,'wangwu',29,4,'2018-06-14 19:41:12'),(8,'zhaoliu',29,4,'2018-06-15 10:17:34'),(9,'liuneng',57,5,'2018-06-15 10:27:56');


