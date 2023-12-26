-- MySQL dump 10.13  Distrib 5.7.43, for Win64 (x86_64)
--
-- Host: localhost    Database: eshop
-- ------------------------------------------------------
-- Server version	5.7.43-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `t_category`
--

DROP TABLE IF EXISTS `t_category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_category` (
  `categoryId` int(11) NOT NULL AUTO_INCREMENT COMMENT '分类id\r\n',
  `status` int(11) DEFAULT NULL COMMENT '是否是一级分类',
  `dependId` int(11) DEFAULT NULL COMMENT '二级分类依赖id',
  `categoryName` varchar(255) DEFAULT NULL COMMENT '分类名称',
  `style` varchar(255) DEFAULT NULL COMMENT '类别对应的样式名称',
  `imgUrl` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`categoryId`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_category`
--

LOCK TABLES `t_category` WRITE;
/*!40000 ALTER TABLE `t_category` DISABLE KEYS */;
INSERT INTO `t_category` VALUES (1,1,2,'菠萝',NULL,NULL),(2,0,0,'新鲜水果','fruit','banner01.jpg'),(3,0,0,'猪牛羊肉','meet','banner02.jpg'),(4,1,3,'猪肉',NULL,NULL),(5,1,2,'苹果',NULL,NULL),(6,1,13,'油菜',NULL,NULL),(7,1,13,'白菜',NULL,NULL),(8,0,0,'海鲜水产','seafood','banner03.jpg'),(9,1,8,'鱼类',NULL,NULL),(10,1,2,'梨',NULL,NULL),(11,1,3,'肥肠',NULL,NULL),(12,1,8,'龙虾',NULL,NULL),(13,0,0,'新鲜蔬菜','vegetables','banner04.jpg'),(14,1,3,'牛肉',NULL,NULL),(15,1,3,'羊肉',NULL,NULL),(16,1,2,'西瓜',NULL,NULL),(20,1,8,'鲍鱼',NULL,NULL),(35,1,13,'辣椒',NULL,NULL),(36,0,0,'禽类蛋品','egg','banner05.jpg'),(37,0,0,'速冻食品','ice','banner06.jpg');
/*!40000 ALTER TABLE `t_category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_goods`
--

DROP TABLE IF EXISTS `t_goods`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_goods` (
  `goodsId` int(11) NOT NULL AUTO_INCREMENT COMMENT '商品id',
  `goodsName` varchar(255) DEFAULT NULL COMMENT '商品名称',
  `unit` decimal(10,0) DEFAULT NULL COMMENT '单价',
  `categoryId` int(11) DEFAULT NULL COMMENT '依赖菜单栏的种类',
  `imgUrl` varchar(255) DEFAULT NULL COMMENT '图片地址',
  `smallImg` varchar(255) DEFAULT NULL COMMENT '缩略图地址',
  `inventory` int(11) DEFAULT NULL COMMENT '库存数量',
  `description` varchar(255) DEFAULT NULL COMMENT '商品描述',
  `updateTime` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `putTime` datetime DEFAULT NULL COMMENT '上架时间',
  PRIMARY KEY (`goodsId`) USING BTREE,
  KEY `category_foreign` (`categoryId`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_goods`
--

LOCK TABLES `t_goods` WRITE;
/*!40000 ALTER TABLE `t_goods` DISABLE KEYS */;
INSERT INTO `t_goods` VALUES (2,'北京油菜',15,6,'北京油菜大.jpg','北京油菜小.jpg',0,'北京油菜好','2020-05-30 14:40:40','2020-05-30 14:40:43'),(3,'山东油菜',20,6,'15916831594265745.jpg','15916831850041557.jpg',99,'山东油菜好','2020-05-30 09:40:48','2020-05-30 09:40:51'),(4,'美国苹果',12,5,'15916834003898480.jpg','15917077341757201.jpg',95,'美国苹果好','2020-06-04 13:11:56','2020-06-04 13:11:56'),(5,'韩国苹果',12,5,'15916837427983927.jpg','15916837658197843.jpg',99,'韩国苹果好','2020-06-04 13:11:56','2020-06-04 13:11:56'),(6,'武汉猪肉',19,4,'15916838998714018.jpg','15916839248347289.jpg',100,'武汉猪肉好','2020-06-04 13:11:56','2020-06-04 13:11:56'),(7,'北京猪肉',11,4,'15916840136245536.jpg','15916840331448999.jpg',96,'北京猪肉好','2020-06-04 13:11:56','2020-06-04 13:11:56'),(8,'澳洲龙虾',30,12,'15916841610148606.jpg','15916841772739645.jpg',196,'澳洲龙虾好','2020-06-04 13:11:56','2020-06-04 13:11:56'),(9,'舟山带鱼',45,9,'15916843027378017.jpg','15916843254258271.jpg',99,'刺好吃，特别多','2020-06-15 15:21:01','2020-06-04 13:11:56'),(10,'东北大白菜',15,7,'15916845171489605.jpg','15916845359378450.jpg',185,'东北大白菜好','2020-06-04 13:11:56','2020-06-04 13:11:56'),(11,'山东大鸭梨',14,10,'15916846152232236.jpg','15916846352309059.jpg',198,'山东大鸭梨好','2020-06-04 13:11:56','2020-06-04 13:11:56'),(12,'云南菠萝',18,1,'15916847351616689.jpg','15916847516597764.jpg',90,'云南菠萝','2020-06-04 13:11:56','2020-06-04 13:11:56'),(13,'四川肥肠',20,11,'15916849776736748.jpg','15916849984395082.jpg',97,'四川肥肠','2020-06-04 13:11:56','2020-06-04 13:11:56'),(14,'科尔沁羊肉',25,15,'15916851879331616.jpg','15916852067947252.jpg',199,'科尔沁羊肉好','2020-06-04 13:11:56','2020-06-04 13:11:56'),(15,'青海牛肉',30,14,'15916853205775156.jPg','15916853407254738.jpg',200,'青海牛肉','2020-06-04 13:11:56','2020-06-04 13:11:56'),(16,'猪里脊肉',20,4,'15916820496605387.jpg','15916820662536356.jpg',99,'猪脊肉含有人体生长的发育所需的丰富的优质蛋白、脂肪、维生素等，而且肉质较嫩，易消化。','2020-06-09 14:04:55','2020-06-09 13:59:35'),(17,'黑拳鲍鱼',100,20,'15921923671492895.jpg','15921923744623011.jpg',100,'活的好的黑拳的','2020-06-15 11:39:51','2020-06-15 11:39:51'),(19,'干辣椒',10,35,'15923890317134693.jpg','15923890345628132.jpg',95,'真的特别辣....','2020-06-17 18:17:28','2020-06-17 18:17:28'),(20,'渤海带鱼',35,9,'15923891101586437.jpg','15923891121041434.jpg',79,'十分新鲜，肉质鲜美','2020-06-17 18:19:22','2020-06-17 18:19:22');
/*!40000 ALTER TABLE `t_goods` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_user`
--

DROP TABLE IF EXISTS `t_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  `psw` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_user`
--

LOCK TABLES `t_user` WRITE;
/*!40000 ALTER TABLE `t_user` DISABLE KEYS */;
INSERT INTO `t_user` VALUES (1,'张三','123','456','789');
/*!40000 ALTER TABLE `t_user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-12-26 13:53:13
