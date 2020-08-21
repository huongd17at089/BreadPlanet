-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: localhost    Database: xuong
-- ------------------------------------------------------
-- Server version	8.0.18

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `banh`
--

DROP TABLE IF EXISTS `banh`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `banh` (
  `MaBanh` varchar(10) NOT NULL,
  `TenBanh` varchar(50) DEFAULT NULL,
  `DonViTinh` varchar(10) DEFAULT NULL,
  `Gia` int(11) DEFAULT NULL,
  `Loai` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`MaBanh`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `banh`
--

LOCK TABLES `banh` WRITE;
/*!40000 ALTER TABLE `banh` DISABLE KEYS */;
INSERT INTO `banh` VALUES ('B1','oreo vani','Package',11,'Cookie'),('B10','yellow flan','Package',12,'Flan'),('B100','Red flan','Package',100,'Chesse cake'),('B101','Blue flan','Package',16,'Chesse cake'),('B102','Pumpkin flan','Box',78,'Flan'),('B103','Pineapple flan','pack',155,'Flan'),('B104','Mango cheesecake flan','pack',69,'Flan'),('B105','lala tỉamisu','Package',1,'Tiramisu'),('B106','ahihi','Package',1,'Cookie'),('B11','So sweet ','Package',13,'Flan'),('B12','Grain bread','Box',70,'Bread'),('B13','Matcha cookie','Box',20,'Cookie'),('B14','Peanut Butter','Package',120,'Cookie'),('B15','Pumpkin Spice','pack',75,'Cookie'),('B16','Cr\'s Smile','Package',100000,'Flan'),('B17','Baby cry','Package',14,'Flan'),('B18',' Vani cookie','pack',20,'Cookie'),('B19','Hot chocolate','pack',42,'Cookie'),('B2','oreo socola','pack',10,'Cookie'),('B20','Chesse cookie','pack',88,'Cookie'),('B21','Strawberry donut','Box',250,'Donut'),('B22','Coconut','Box',250,'Donut'),('B23','Strawberry','Package',500,'Donut'),('B24','French cruller','Box',125,'Donut'),('B25','Boston cream','Package',999,'Donut'),('B26','Maple bar','pack',75,'Donut'),('B27','Wonui','Box',147,'Donut'),('B28','Jelly','Package',666,'Donut'),('B29','Blueberry','pack',300,'Donut'),('B3','Sourdough','Box',20,'Bread'),('B30','Buttermilk','Box',67,'Donut'),('B31','Long john','Package',2000,'Donut'),('B32','Cumb cake','pack',14,'Donut'),('B33','Mountain blueberry','pack',600,'Chesse cake'),('B34','Tropical passionfruit','Box',400,'Chesse cake'),('B35','Wild strawberry','Box',250,'Chesse cake'),('B36','French glaze vanilla','Box',300,'Chesse cake'),('B37','Flaked chocolate','pack',125,'Chesse cake'),('B38','Creamy caramel','pack',122,'Chesse cake'),('B39','Pumpkin cheesecake','pack',74,'Chesse cake'),('B4','White bread','pack',13,'Bread'),('B40','Chocolate mountain','Box',115,'Chesse cake'),('B41','Lemon sweet','pack',55,'Chesse cake'),('B42','Honey bunny','pack',346,'Chesse cake'),('B43','Brown sugar','pack',166,'Chesse cake'),('B44','Balconi','Box',44,'Tiramisu'),('B45','Matcha tiramisu','pack',25,'Tiramisu'),('B46','Vegan tiramisu','Box',133,'Tiramisu'),('B47','Tiramisu pancake','pack',33,'Tiramisu'),('B48','Strawberry tiramisu','Box',122,'Tiramisu'),('B49','Morrisons tiramisu','Package',233,'Tiramisu'),('B5','Croissant','Package',25,'Bread'),('B50','Caffe Concerto Tiramisu','Box',77,'Tiramisu'),('B51','Tesco Tiramisu','Package',544,'Tiramisu'),('B52','Chocolate ribbon Tiramisu','Box',677,'Tiramisu'),('B53','Lychee tiramisu','pack',12,'Tiramisu'),('B54','Dark cherry tiramisu','Box',207,'Tiramisu'),('B55','Pistachio tiramisu','Box',155,'Tiramisu'),('B56','Brulee tiramisu','pack',122,'Tiramisu'),('B57','Milk chocolate','Box',44,'chocolate'),('B58','White chocolate','Box',177,'chocolate'),('B59','Dark chocolate','Box',141,'chocolate'),('B6','Hamburger bun','Package',6,'Bread'),('B60','Candy coating chocolate','pack',55,'chocolate'),('B61','Bittersweet chocolate','Box',163,'chocolate'),('B62','Unsweetened chocolate','Box',211,'chocolate'),('B63','Semi-sweet chocolate','Package',1544,'chocolate'),('B64','Coverture chocolate','Box',212,'chocolate'),('B65','Gianduja chocolate','pack',144,'chocolate'),('B66','Ruby chocolate','Box',555,'chocolate'),('B67','Kosher chocolate','Box',211,'chocolate'),('B68','Gluten free chocolate','pack',145,'chocolate'),('B69','Golden chocolate','Box',699,'chocolate'),('B7','Baguette','Box',4,'Bread'),('B70','Redberry','pack',14,'Macaron'),('B71','Chocolate cherry macaron','Box',55,'Macaron'),('B72','Vanilla macaron','Box',35,'Macaron'),('B73','Matcha macaron','Box',155,'Macaron'),('B74','Lotus macaron','pack',33,'Macaron'),('B75','Oreo macaron','Box',67,'Macaron'),('B76','Almond ganache macaron','Package',167,'Macaron'),('B77','Earl grey macaron','pack',65,'Macaron'),('B78','Blueberry macaron','Box',171,'Macaron'),('B79','Yogurt macaron','pack',122,'Macaron'),('B8','Breadsticks','pack',20,'Bread'),('B80','Banana macaron','Box',112,'Macaron'),('B81','Nama mochi','Box',54,'Mochi'),('B82','Original mochi','pack',30,'Mochi'),('B83','Chocolate mochi','Box',33,'Mochi'),('B84','Lemon mochi','pack',17,'Mochi'),('B85','Cream orange mochi','Package',64,'Mochi'),('B86','Mango cheese mochi','Box',155,'Mochi'),('B87','Caramel mochi','pack',122,'Mochi'),('B88','Red bean mochi','pack',13,'Mochi'),('B89','Sakura mochi','pack',165,'Mochi'),('B9','Hot dog bun','Box',11,'Bread'),('B90','Mix mochi','Box',255,'Mochi'),('B91','Coconut mochi','Box',142,'Mochi'),('B92','Chocolate cream mochi','pack',100,'Mochi'),('B93','Chocolate flan cake','Box',512,'Flan'),('B94','Flan cake','Box',200,'Flan'),('B95','Creamy flan cake','pack',145,'Flan'),('B96','Peach flan cake','Box',217,'Flan'),('B97','Mango flan','Box',135,'Flan'),('B98','Almond flan','Package',231,'Flan'),('B99','Lucuma flan','Box',145,'Flan');
/*!40000 ALTER TABLE `banh` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-26 18:07:27
