CREATE DATABASE  IF NOT EXISTS `servlet-app` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `servlet-app`;
-- MySQL dump 10.13  Distrib 8.0.14, for Win64 (x86_64)
--
-- Host: localhost    Database: servlet-app
-- ------------------------------------------------------
-- Server version	8.0.14

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `computer`
--

DROP TABLE IF EXISTS `computer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `computer` (
  `price` int(11) NOT NULL,
  `casing` varchar(45) DEFAULT NULL,
  `motherboard` varchar(45) DEFAULT NULL,
  `cpu` varchar(45) DEFAULT NULL,
  `gpu` varchar(45) DEFAULT NULL,
  `ram` varchar(45) DEFAULT NULL,
  `storage` varchar(45) DEFAULT NULL,
  `powersupply` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`price`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `computer`
--

LOCK TABLES `computer` WRITE;
/*!40000 ALTER TABLE `computer` DISABLE KEYS */;
INSERT INTO `computer` VALUES (200,'Rosewil SRM-01','ASRock AB350M-HDV','Ryzen 3 2200G APU','-','G.Skill 2x4GB NT Series','WD Caviar Blue 1 TB','Corsair VS450'),(300,'Cougar-MX330 ATX Mid Tower Case','ASRock-AB350 Pro4 ATX AM4','AMD-Ryzen 3 2200G','-','ADATA-XPG GAMMIX D10 8GB(2 x 4GB)','Western Digital-Caviar Blue 500GB','Corsair-CX 450W 80+ Bronze Certified'),(400,'Corsair-100R ATX','ASRock-X370 Pro4 ATX AM4','AMD-Ryzen 3 2200G','-','G.Skill-Ripjaws V Series 8GB (2 x 4GB)','Western Digital-Caviar Blue 1TB','Corsair-CXM (2015) 450W 80+ Bronze'),(500,'Fractal Design-Focus G ATX','Gigabyte-Z370P D3 ATX','Intel-Core i3-8100','-','Mushkin-Silverline 16GB (2 x 8GB)','Seagate-BarraCuda 1TB','	SeaSonic-520W 80+ Bronze'),(600,'Cooler Master-MasterBox Lite 3.1','ASRock-AB350M Pro4','AMD-Ryzen 5 1500X','Gigabyte-GeForce GTX 1050 2GB','	G.Skill-Ripjaws V Series 8GB (2 x 4GB)','Seagate-BarraCuda 1TB','Corsair-CXM (2015) 450W 80+ Bronze'),(700,'Deepcool-TESSERACT SW ATX','Biostar-A320MH PRO','AMD-Ryzen 5 1600','EVGA-GeForce GTX 1060 6GB','Crucial-Ballistix Sport 8GB (1 x 8GB)','Hitachi-Ultrastar 1TB','Corsair-CXM 550W 80+ Bronze'),(800,'Cougar-MX330 ATX','ASRock-X370 Pro4','AMD-Ryzen 5 1600','MSI-GeForce GTX 1060 6GB','Team-Dark 16GB (2 x 8GB)','Seagate-BarraCuda 1TB','Corsair-CXM (2015) 450W 80+ Bronze'),(900,'NZXT-S340 (Black) ATX','MSI-Z270-A PRO ATX','	Intel-Core i5-7600K','EVGA-GeForce GTX 1060 6GB','Corsair-Vengeance LPX 16GB (2 x 8GB) ','Seagate Barracuda 1 TB','Corsair-CX (2017) 550W 80+ Bronze'),(1000,'NZXT-H500 (Black) ATX','ASRock-B450 Pro4','AMD-Ryzen 5 2600','Zotac-GeForce RTX 2060 6 GB','Team-Vulcan 16 GB (2 x 8 GB)','ADATA-Ultimate SU650 960 GB','Corsair-RMx (2018) 550 W 80+ Gold'),(2500,'Fractal Design-Define R6 White','NZXT-N7-Z37XT-W1 ATX','Intel-Core i7-8700K','EVGA-GeForce GTX 1080 Ti','G.Skill-Ripjaws V Series 16GB (2 x 8GB)','Seagate - Barracuda 2TB ','EVGA-SuperNOVA G3 650W 80+ Gold');
/*!40000 ALTER TABLE `computer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'Bijay','12345');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-05-15 19:27:34
