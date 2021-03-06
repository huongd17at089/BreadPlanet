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
-- Table structure for table `xuatkho`
--

DROP TABLE IF EXISTS `xuatkho`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `xuatkho` (
  `MaPhieu` varchar(30) NOT NULL,
  `MaBanh` varchar(10) NOT NULL,
  `soluong` int(11) DEFAULT NULL,
  `NgayXuat` date NOT NULL,
  PRIMARY KEY (`MaPhieu`,`MaBanh`),
  KEY `xuatk_idx` (`MaBanh`),
  CONSTRAINT `xuatk` FOREIGN KEY (`MaBanh`) REFERENCES `banh` (`MaBanh`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xuatkho`
--

LOCK TABLES `xuatkho` WRITE;
/*!40000 ALTER TABLE `xuatkho` DISABLE KEYS */;
INSERT INTO `xuatkho` VALUES ('1574445086633','B2',10,'2019-11-23'),('1574445086633','B21',50,'2019-11-23'),('1574445086633','B22',40,'2019-11-23'),('1574445086633','B70',10,'2019-11-23'),('1574445086633','B71',10,'2019-11-23'),('1574612464183','B21',30,'2019-11-24'),('1574695780402','B21',10,'2019-11-25'),('1574695780402','B22',10,'2019-11-25'),('1574736345555','B21',100,'2019-11-26'),('1574764075836','B21',20,'2019-11-26'),('1574765927766','B1',10,'2019-11-26'),('1574765927766','B22',10,'2019-11-26');
/*!40000 ALTER TABLE `xuatkho` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-26 18:07:26
