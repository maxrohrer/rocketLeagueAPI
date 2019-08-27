-- MySQL dump 10.13  Distrib 5.7.27, for Linux (x86_64)
--
-- Host: localhost    Database: rocketLeagueAPI
-- ------------------------------------------------------
-- Server version	5.7.27-0ubuntu0.19.04.1

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
-- Table structure for table `antennas`
--

DROP TABLE IF EXISTS `antennas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `antennas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `rarity` varchar(25) NOT NULL,
  `acquired_by` varchar(255) DEFAULT NULL,
  `img_url` varchar(255) DEFAULT NULL,
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `antennas`
--

LOCK TABLES `antennas` WRITE;
/*!40000 ALTER TABLE `antennas` DISABLE KEYS */;
/*!40000 ALTER TABLE `antennas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `car_decals`
--

DROP TABLE IF EXISTS `car_decals`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `car_decals` (
  `car_id` int(11) NOT NULL,
  `decal_id` int(11) NOT NULL,
  `img_url` varchar(255) DEFAULT NULL,
  KEY `car_id` (`car_id`),
  KEY `decal_id` (`decal_id`),
  CONSTRAINT `car_decals_ibfk_1` FOREIGN KEY (`car_id`) REFERENCES `cars` (`id`) ON UPDATE CASCADE,
  CONSTRAINT `car_decals_ibfk_2` FOREIGN KEY (`decal_id`) REFERENCES `decals` (`id`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `car_decals`
--

LOCK TABLES `car_decals` WRITE;
/*!40000 ALTER TABLE `car_decals` DISABLE KEYS */;
INSERT INTO `car_decals` VALUES (5,1,'https://rocketleaguemods.com/wp-content/uploads/cmdm/163224/1479180676_Merc_Dots-1600x700.jpg');
/*!40000 ALTER TABLE `car_decals` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cars`
--

DROP TABLE IF EXISTS `cars`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cars` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `body_type` varchar(30) DEFAULT NULL,
  `rarity` varchar(30) DEFAULT NULL,
  `acquired_by` varchar(255) DEFAULT NULL,
  `platform` varchar(15) DEFAULT NULL,
  `img_url` varchar(255) DEFAULT NULL,
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cars`
--

LOCK TABLES `cars` WRITE;
/*!40000 ALTER TABLE `cars` DISABLE KEYS */;
INSERT INTO `cars` VALUES (1,'Backfire','Octane','Common',NULL,NULL,'https://vignette.wikia.nocookie.net/rocketleague/images/8/8c/Backfire_body_preview.jpg/revision/latest/scale-to-width-down/1000?cb=20171026174940','2019-08-19 01:18:36'),(2,'Breakout','Breakout','Common',NULL,NULL,'https://vignette.wikia.nocookie.net/rocketleague/images/9/92/Breakout_body_preview.jpg/revision/latest/scale-to-width-down/1000?cb=20171010183103','2019-08-19 02:18:29'),(3,'Gizmo','Octane','Common',NULL,NULL,'https://vignette.wikia.nocookie.net/rocketleague/images/8/83/Gizmo_Starbase_ARC_update.jpg/revision/latest/scale-to-width-down/1000?cb=20170525082739','2019-08-22 17:40:58'),(4,'Hotshot','Dominus','Common',NULL,NULL,'https://vignette.wikia.nocookie.net/rocketleague/images/f/fa/Hotshot_body_preview.jpg/revision/latest/scale-to-width-down/1000?cb=20171016163911','2019-08-22 17:42:02'),(5,'Merc','Octane','Common',NULL,NULL,'https://vignette.wikia.nocookie.net/rocketleague/images/4/46/Merc_body_preview.jpg/revision/latest/scale-to-width-down/1000?cb=20171015105859','2019-08-25 14:40:09'),(6,'Octane','Octane','Common',NULL,NULL,'https://vignette.wikia.nocookie.net/rocketleague/images/3/37/Octane_body_preview.jpg/revision/latest/scale-to-width-down/1000?cb=20171022150150','2019-08-25 14:40:56'),(7,'Paladin','Plank','Common',NULL,NULL,'https://vignette.wikia.nocookie.net/rocketleague/images/9/92/Paladin_body_preview.jpg/revision/latest/scale-to-width-down/1000?cb=20171011172741','2019-08-25 14:42:10'),(8,'Road Hog','Octane','Common',NULL,NULL,'https://vignette.wikia.nocookie.net/rocketleague/images/7/7a/Road_Hog_body_preview.jpg/revision/latest/scale-to-width-down/1000?cb=20171014221212','2019-08-25 14:42:49'),(9,'Venom','Hybrid','Common',NULL,NULL,'https://vignette.wikia.nocookie.net/rocketleague/images/6/6b/Venom_body_preview.jpg/revision/latest/scale-to-width-down/1000?cb=20171015141015','2019-08-25 14:43:40'),(10,'X-Devil','Hybrid','Common',NULL,NULL,'https://vignette.wikia.nocookie.net/rocketleague/images/5/5f/X-Devil_Starbase_ARC_update.png/revision/latest?cb=20170621212017','2019-08-25 14:44:16'),(11,'Armadillo','TBC','Platform Exclusive','Complete a season in single player mode.','Xbox One','https://vignette.wikia.nocookie.net/rocketleague/images/8/88/Armadillo_body.png/revision/latest?cb=20170210234432','2019-08-25 14:51:26'),(12,'Hogsticker','Octane','Platform Exclusive','Play one match with every common body.','Xbox One','https://vignette.wikia.nocookie.net/rocketleague/images/f/f0/Hogsticker_body.png/revision/latest?cb=20170210234522','2019-08-25 14:54:01'),(13,'Sweet Tooth','TBC','Platform Exclusive','Play one match with every common body.','PS4','https://vignette.wikia.nocookie.net/rocketleague/images/6/61/Sweet_Tooth_promo_art.jpg/revision/latest/scale-to-width-down/1000?cb=20170528164055','2019-08-25 14:55:16'),(14,'Luigi NSR','Octane','Platform Exclusive',NULL,'Nintendo Switch','https://vignette.wikia.nocookie.net/rocketleague/images/1/13/Mario_NSR_Luigi_NSR_hero_art.jpg/revision/latest/scale-to-width-down/1000?cb=20170823152829','2019-08-25 14:58:43'),(15,'Mario NSR','Octane','Platform Exclusive',NULL,'Nintendo Switch','https://vignette.wikia.nocookie.net/rocketleague/images/1/13/Mario_NSR_Luigi_NSR_hero_art.jpg/revision/latest/scale-to-width-down/1000?cb=20170823152829','2019-08-25 14:59:00'),(16,'Samus\' Gunship','Octane','Platform Exclusive','Complete matches.','Nintendo Switch','https://vignette.wikia.nocookie.net/rocketleague/images/c/cc/Samus%27_Gunship_hero_art.jpg/revision/latest/scale-to-width-down/1000?cb=20170823153543','2019-08-25 15:00:44');
/*!40000 ALTER TABLE `cars` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `decals`
--

DROP TABLE IF EXISTS `decals`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `decals` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `rarity` varchar(20) DEFAULT NULL,
  `acquired_by` varchar(255) DEFAULT NULL,
  `img_url` varchar(255) DEFAULT NULL,
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `decals`
--

LOCK TABLES `decals` WRITE;
/*!40000 ALTER TABLE `decals` DISABLE KEYS */;
INSERT INTO `decals` VALUES (1,'Dots','Common',NULL,NULL,'2019-08-25 15:27:08');
/*!40000 ALTER TABLE `decals` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `goal_explosions`
--

DROP TABLE IF EXISTS `goal_explosions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `goal_explosions` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `rarity` varchar(25) NOT NULL,
  `acquired_by` varchar(255) DEFAULT NULL,
  `img_url` varchar(255) DEFAULT NULL,
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `goal_explosions`
--

LOCK TABLES `goal_explosions` WRITE;
/*!40000 ALTER TABLE `goal_explosions` DISABLE KEYS */;
/*!40000 ALTER TABLE `goal_explosions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `paint_finishes`
--

DROP TABLE IF EXISTS `paint_finishes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `paint_finishes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `rarity` varchar(25) NOT NULL,
  `acquired_by` varchar(255) DEFAULT NULL,
  `img_url` varchar(255) DEFAULT NULL,
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paint_finishes`
--

LOCK TABLES `paint_finishes` WRITE;
/*!40000 ALTER TABLE `paint_finishes` DISABLE KEYS */;
/*!40000 ALTER TABLE `paint_finishes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rocket_trails`
--

DROP TABLE IF EXISTS `rocket_trails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rocket_trails` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `rarity` varchar(30) DEFAULT NULL,
  `acquired_by` varchar(255) DEFAULT NULL,
  `img_url` varchar(255) DEFAULT NULL,
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rocket_trails`
--

LOCK TABLES `rocket_trails` WRITE;
/*!40000 ALTER TABLE `rocket_trails` DISABLE KEYS */;
INSERT INTO `rocket_trails` VALUES (1,'Bubbles','Common',NULL,NULL,'2019-08-19 23:00:19');
/*!40000 ALTER TABLE `rocket_trails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `toppers`
--

DROP TABLE IF EXISTS `toppers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `toppers` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `rarity` varchar(20) DEFAULT NULL,
  `acquired_by` varchar(255) DEFAULT NULL,
  `img_url` varchar(255) DEFAULT NULL,
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `toppers`
--

LOCK TABLES `toppers` WRITE;
/*!40000 ALTER TABLE `toppers` DISABLE KEYS */;
INSERT INTO `toppers` VALUES (1,'Bobby Helmet','Common',NULL,NULL,'2019-08-20 01:14:05');
/*!40000 ALTER TABLE `toppers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wheels`
--

DROP TABLE IF EXISTS `wheels`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wheels` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `rarity` varchar(20) DEFAULT NULL,
  `acquired_by` varchar(255) DEFAULT NULL,
  `img_url` varchar(255) DEFAULT NULL,
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wheels`
--

LOCK TABLES `wheels` WRITE;
/*!40000 ALTER TABLE `wheels` DISABLE KEYS */;
/*!40000 ALTER TABLE `wheels` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-08-27 11:36:13
