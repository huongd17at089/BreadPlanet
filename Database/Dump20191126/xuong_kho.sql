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
-- Table structure for table `kho`
--

DROP TABLE IF EXISTS `kho`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `kho` (
  `MaBanh` varchar(10) NOT NULL,
  `SoLuong` int(11) DEFAULT '0',
  PRIMARY KEY (`MaBanh`),
  CONSTRAINT `xuat` FOREIGN KEY (`MaBanh`) REFERENCES `banh` (`MaBanh`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kho`
--

LOCK TABLES `kho` WRITE;
/*!40000 ALTER TABLE `kho` DISABLE KEYS */;
INSERT INTO `kho` VALUES ('B1',90),('B10',0),('B100',0),('B101',0),('B102',0),('B103',0),('B104',0),('B105',0),('B106',300),('B11',0),('B12',0),('B13',300),('B14',0),('B15',0),('B16',0),('B17',0),('B18',0),('B19',0),('B2',240),('B20',0),('B21',70),('B22',90),('B23',100),('B24',0),('B25',0),('B26',0),('B27',0),('B28',0),('B29',0),('B3',0),('B30',0),('B31',0),('B32',0),('B33',100),('B34',20),('B35',0),('B36',0),('B37',0),('B38',0),('B39',0),('B4',0),('B40',0),('B41',0),('B42',0),('B43',0),('B44',50),('B45',0),('B46',0),('B47',0),('B48',0),('B49',0),('B5',0),('B50',0),('B51',0),('B52',0),('B53',0),('B54',0),('B55',0),('B56',0),('B57',0),('B58',0),('B59',0),('B6',0),('B60',0),('B61',0),('B62',0),('B63',0),('B64',0),('B65',0),('B66',0),('B67',0),('B68',0),('B69',0),('B7',0),('B70',90),('B71',90),('B72',0),('B73',0),('B74',0),('B75',0),('B76',0),('B77',0),('B78',0),('B79',0),('B8',0),('B80',0),('B81',0),('B82',0),('B83',0),('B84',0),('B85',0),('B86',0),('B87',0),('B88',0),('B89',0),('B9',0),('B90',0),('B91',0),('B92',0),('B93',0),('B94',0),('B95',0),('B96',0),('B97',0),('B98',0),('B99',0);
/*!40000 ALTER TABLE `kho` ENABLE KEYS */;
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
