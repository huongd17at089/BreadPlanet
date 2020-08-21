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
-- Table structure for table `nhanvien`
--

DROP TABLE IF EXISTS `nhanvien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nhanvien` (
  `MaNV` varchar(20) NOT NULL,
  `TenNV` varchar(50) DEFAULT NULL,
  `CMT` varchar(20) DEFAULT NULL,
  `SDT` varchar(20) DEFAULT NULL,
  `DiaChi` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`MaNV`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nhanvien`
--

LOCK TABLES `nhanvien` WRITE;
/*!40000 ALTER TABLE `nhanvien` DISABLE KEYS */;
INSERT INTO `nhanvien` VALUES ('admin','admin','001199123456','090345627','HN'),('NV1','Nguyễn Ngọc Minh','001199123456789','0987654321','Hà Nội'),('NV10','Diệp Quang Huy','113302983','091826461','THÁI BÌNH'),('NV11','Nguyễn Thái Học','113326192','019247173','LẠNG SƠN'),('NV12','Nguyễn Thái Học','113326192','019247173','LẠNG SƠN'),('NV13','Nguyễn Thái Học','113326192','019247173','LẠNG SƠN'),('NV14','Nguyễn Thái Học','113326192','019247173','LẠNG SƠN'),('NV15','Nguyễn Thái Học','113326192','019247173','LẠNG SƠN'),('NV16','Nguyễn Thái Long','12345','12345','Ha Noi'),('NV17','Nguyễn Thị Thêm','123456','12345','HN'),('NV2','Nguyễn Khánh Nam','112394710','091874615','THÁI BÌNH'),('NV3','Lê Thị Trà','113012357','091193841','NAM ĐỊNH'),('NV4','Ngô Trần Anh Đức','113012948','092193847','HÀ NỘI'),('NV5','Hoàng Thị Thảo','113019274','091827163','HÀ NỘI'),('NV6','Nguyễn Minh Khánh','113019282','090391831','NAM ĐỊNHI'),('NV7','Bùi Xuân Duy','113726152','081723615','HÒA BÌNH'),('NV8','Nguyễn Thị Hoa','113828172','068277183','PHÚ THỌ'),('NV9','Hồ Tuấn Minh','11301928312','068277183','PHAN THIẾT');
/*!40000 ALTER TABLE `nhanvien` ENABLE KEYS */;
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
