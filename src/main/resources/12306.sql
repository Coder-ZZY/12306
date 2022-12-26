drop database if exists station;
create database station;
use station;

drop table if exists recent_posts;
create table recent_posts
(
id int primary key,
content varchar(255),
c_date date,
url varchar(255)
);
insert into recent_posts values(1,"铁路旅客禁止、限制携带和托运物品目录","2022-06-17","http://www.12306.cn/mormhweb/zxdt/202206/t20220617_37625.html");
insert into recent_posts values(2,"公 告","2022-02-25","http://www.12306.cn/mormhweb/zxdt/202205/t20220531_37508.html");
insert into recent_posts values(3,"公 告","2022-01-24","http://www.12306.cn/mormhweb/zxdt/202107/t20210731_34834.html");
insert into recent_posts values(4,"候补购票操作说明","2022-12-15","http://www.12306.cn/mormhweb/zxdt/201905/t20190521_22980.html");
insert into recent_posts values(5,"公 告","2022-05-31","http://www.12306.cn/mormhweb/zxdt/201512/t20151201_3949.html");
insert into recent_posts values(6,"关于调整互联网、电话订票起售时间的公告","2022-12-07","http://www.12306.cn/mormhweb/zxdt/201411/t20141126_2316.html");
insert into recent_posts values(7,"中国铁路呼和浩特局集团有限公司关于2022年12月24至2023年1月2日部分旅客列车恢复开行的公告","2022-12-16","http://www.12306.cn/mormhweb/zxdt_news/202212/t20221216_38545.html");
insert into recent_posts values(8,"中国铁路上海局集团有限公司关于2022年12月24日-2022年12月25日增开部分旅客列车公告","2022-12-16","http://www.12306.cn/mormhweb/zxdt_news/202212/t20221216_38542.html");
insert into recent_posts values(9,"中国铁路成都局集团有限公司关于2022年12月16日至18日加开部分列车的公告","2022-12-16","http://www.12306.cn/mormhweb/zxdt_news/202212/t20221216_38539.html");
insert into recent_posts values(10,"中国铁路上海局集团有限公司关于2022年12月16日-2022年1月4日增开部分旅客列车的公告","2022-12-16","http://www.12306.cn/mormhweb/zxdt_news/202212/t20221215_38534.html");

drop table if exists common_quesions;
create table common_quesions
(
id int primary key,
content varchar(255),
url varchar(255)
);
insert into common_quesions values(1,"实名制车票","https://kyfw.12306.cn/otn/gonggao/realNameTicket.html");
insert into common_quesions values(2,"售票窗口购票","https://kyfw.12306.cn/otn/gonggao/ticketWindow.html");
insert into common_quesions values(3,"互联网购票","https://kyfw.12306.cn/otn/gonggao/onlineBooking.html");
insert into common_quesions values(4,"互联网改签、变更到站","https://kyfw.12306.cn/otn/gonggao/onlineEndorse.html");
insert into common_quesions values(5,"互联网退票","https://kyfw.12306.cn/otn/gonggao/onlineRefund.html");
insert into common_quesions values(6,"随身携带品","ghttps://kyfw.12306.cn/otn/onggao/luggage.html");
insert into common_quesions values(7,"进出站","https://kyfw.12306.cn/otn/gonggao/enterAndExit.html");
insert into common_quesions values(8,"丢失购票时使用的有效身份证件","https://kyfw.12306.cn/otn/gonggao/ticketLost.html");
insert into common_quesions values(9,"使用居民身份证直接检票乘车","https://kyfw.12306.cn/otn/gonggao/sgc.html");
insert into common_quesions values(10,"广深港跨境列车","https://kyfw.12306.cn/otn/gonggao/gsgcp.html");

drop table if exists executor_list;
create table executor_list
(
id int primary key,
name varchar(20),
id_num varchar(20)
);
insert into executor_list values(1,"刘红琴","360502********1622");
insert into executor_list values(2,"姚林康","110224********0097");
insert into executor_list values(3,"周保忠","310221********4418");
insert into executor_list values(4,"刘杰","340123********2077");

drop table if exists tickets;
create table tickets
(
id int primary key,
train_num varchar(20),
start_station varchar(20),
end_station varchar(20),
start_time time,
end_time time,
total_time time,
arrive varchar(20),
principal_seat varchar(10),
frist_seat varchar(10),
second_seat varchar(10),
advanced_sleeper varchar(10),
frist_sleeper varchar(10),
dong_sleeper varchar(10),
second_sleeper varchar(10),
soft_seat varchar(10),
hard_seat varchar(10),
no_seat varchar(10),
other varchar(10)
);
insert into tickets values(1,'Z502','郑州','北京西','00:47','06:49','06:02','当日到达','--','--','--','7','有','--','有','--','有','无','--');
insert into tickets values(2,'Z162','郑州','北京西','00:53','06:55','06:02','当日到达','--','--','--','--','有','--','有','--','有','无','--');
insert into tickets values(3,'Z2','郑州','北京西','01:58','08:16','06:18','当日到达','--','--','--','--','13','--','有','--','有','无','--');
insert into tickets values(4,'T146','郑州','北京西','03:06','11:18','08:12','当日到达','--','--','--','--','19','--','有','--','有','无','--');
insert into tickets values(5,'Z6','郑州','北京西','03:52','09:53','06:01','当日到达','--','--','--','--','有','--','有','--','--','--','--');
insert into tickets values(6,'Z50','郑州','北京西','03:58','10:05','06:07','当日到达','--','--','--','--','有','--','有','--','有','无','--');
insert into tickets values(7,'Z96','郑州','北京西','04:11','10:51','06:40','当日到达','--','--','--','--','有','--','有','--','有','无','--');
insert into tickets values(8,'T168','郑州','北京西','05:33','13:05','07:32','当日到达','--','--','--','--','3','--','有','--','有','无','--');
insert into tickets values(9,'G1588','郑州','北京西','07:11','10:36','03:25','当日到达','候补','候补','有','--','--','--','--','--','--','--','--');
insert into tickets values(10,'G1588','郑州东','北京西','07:32','10:36','03:04','当日到达','1','9','有','--','--','--','--','--','--','--','--');
insert into tickets values(11,'Z836','郑州','北京西','07:53','13:44','05:51','当日到达','--','--','--','15','有','--','有','--','有','无','--');
insert into tickets values(12,'G1572','郑州东','北京西','07:56','11:13','03:17','当日到达','候补','2','有','--','--','--','--','--','--','--','--');
insert into tickets values(13,'G1556','郑州东','北京西','08:52','12:18','03:26','当日到达','2','7','有','--','--','--','--','--','--','--','--');
insert into tickets values(14,'G572','郑州航空港','北京西','09:03','12:59','03:56','当日到达','候补','14','有','--','--','--','--','--','--','--','--');
insert into tickets values(15,'G572','郑州东','北京西','09:27','12:59','03:32','当日到达','1','14','有','--','--','--','--','--','--','--','--');
insert into tickets values(16,'G652','郑州东','北京西','09:08','12:13','03:05','当日到达','1','候补','有','--','--','--','--','--','--','--','--');
insert into tickets values(17,'G68','郑州东','北京西','10:12','12:24','02:12','当日到达','17','有','有','--','--','--','--','--','--','--','--');
insert into tickets values(18,'G502','郑州东','北京西','10:47','14:12','03:25','当日到达','1','1','候补','--','--','--','--','--','--','--','--');
insert into tickets values(19,'G892','郑州东','北京西','10:57','13:25','02:28','当日到达','6','有','有','--','--','--','--','--','--','--','--');
insert into tickets values(20,'Z286','郑州','北京西','11:05','17:03','05:58','当日到达','--','--','--','--','有','--','有','--','有','有','--');
insert into tickets values(21,'G84','郑州东','北京西','11:07','13:35','02:28','当日到达','14','候补','9','--','--','--','--','--','--','--','--');
insert into tickets values(22,'K600','郑州','北京丰台','11:50','20:53','09:03','当日到达','--','--','--','--','候补','--','4','--','有','无','--');
insert into tickets values(23,'G52','郑州东','北京西','12:07','14:26','02:19','当日到达','3','13','有','--','--','--','--','--','--','--','--');
insert into tickets values(24,'G88','郑州东','北京西','12:12','14:31','02:19','当日到达','候补','候补','3','--','--','--','--','--','--','--','--');
insert into tickets values(25,'G812','郑州东','北京西','12:17','14:36','02:19','当日到达','4','1','有','--','--','--','--','--','--','--','--');
insert into tickets values(26,'G686','郑州东','北京西','12:32','15:48','03:16','当日到达','候补','候补','有','--','--','--','--','--','--','--','--');
insert into tickets values(27,'G506','郑州东','北京西','12:47','16:08','03:21','当日到达','候补','1','1','--','--','--','--','--','--','--','--');
insert into tickets values(28,'G352','郑州东','北京西','13:53','17:03','03:10','当日到达','4','4','候补','--','--','--','--','--','--','--','--');
insert into tickets values(29,'G82','郑州东','北京西','14:00','16:27','02:27','当日到达','6','2','有','--','--','--','--','--','--','--','--');
insert into tickets values(30,'G430','郑州东','北京西','14:13','17:14','03:01','当日到达','候补','候补','有','--','--','--','--','--','--','--','--');
insert into tickets values(31,'G482','郑州东','北京西','14:57','18:04','03:07','当日到达','3','2','有','--','--','--','--','--','--','--','--');
insert into tickets values(32,'G894','郑州东','北京西','15:12','17:23','02:11','当日到达','2','15','有','--','--','--','--','--','--','--','--');
insert into tickets values(33,'G70','郑州东','北京西','15:17','17:28','02:11','当日到达','候补','候补','有','--','--','--','--','--','--','--','--');
insert into tickets values(34,'G1580','郑州东','北京西','16:01','19:18','03:17','当日到达','有','有','有','--','--','--','--','--','--','--','--');
insert into tickets values(35,'G58','郑州东','北京西','16:17','18:37','02:20','当日到达','候补','候补','有','--','--','--','--','--','--','--','--');
insert into tickets values(36,'G332','郑州东','北京西','16:23','19:06','02:43','当日到达','3','5','候补','--','--','--','--','--','--','--','--');
insert into tickets values(37,'G388','郑州东','北京西','16:29','20:03','03:34','当日到达','候补','候补','候补','--','--','--','--','--','--','--','--');
insert into tickets values(38,'G80','郑州东','北京西','17:11','19:30','02:19','当日到达','5','有','有','--','--','--','--','--','--','--','--');
insert into tickets values(39,'G72','郑州东','北京西','17:16','19:35','02:19','当日到达','5','12','有','--','--','--','--','--','--','--','--');
insert into tickets values(40,'G308','郑州东','北京西','17:22','20:20','02:58','当日到达','10','有','有','--','--','--','--','--','--','--','--');
insert into tickets values(41,'G1592','郑州东','北京西','17:32','20:35','03:03','当日到达','4','13','有','--','--','--','--','--','--','--','--');
insert into tickets values(42,'G372','郑州航空港','北京西','17:49','21:34','03:45','当日到达','6','5','有','--','--','--','--','--','--','--','--');
insert into tickets values(43,'G372','郑州东','北京西','18:18','21:34','03:16','当日到达','6','9','有','--','--','--','--','--','--','--','--');
insert into tickets values(44,'G338','郑州东','北京西','18:01','21:20','03:19','当日到达','9','有','有','--','--','--','--','--','--','--','--');
insert into tickets values(45,'G422','郑州东','北京西','18:13','21:29','03:16','当日到达','1','6','有','--','--','--','--','--','--','--','--');
insert into tickets values(46,'G896','郑州东','北京西','18:23','20:54','02:31','当日到达','3','1','18','--','--','--','--','--','--','--','--');
insert into tickets values(47,'G486','郑州东','北京西','18:31','21:56','03:25','当日到达','1','候补','有','--','--','--','--','--','--','--','--');
insert into tickets values(48,'G1578','郑州东','北京西','19:49','23:08','03:19','当日到达','7','有','有','--','--','--','--','--','--','--','--');
insert into tickets values(49,'G90','郑州东','北京西','20:13','22:33','02:20','当日到达','15','有','有','--','--','--','--','--','--','--','--');
insert into tickets values(50,'G94','郑州东','北京西','20:18','22:38','02:20','当日到达','5','7','有','--','--','--','--','--','--','--','--');
insert into tickets values(51,'G528','郑州东','北京西','20:29','23:46','03:17','当日到达','有','有','有','--','--','--','--','--','--','--','--');
insert into tickets values(52,'G402','郑州东','北京西','20:41','23:42','03:01','当日到达','2','5','有','--','--','--','--','--','--','--','--');
-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `userid` char(18) DEFAULT NULL UNIQUE,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'admin', '123','340123200210011234');