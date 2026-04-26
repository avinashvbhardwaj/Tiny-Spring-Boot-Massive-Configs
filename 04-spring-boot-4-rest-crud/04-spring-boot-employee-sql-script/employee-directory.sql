CREATE DATABASE  IF NOT EXISTS `employee_directory`;
USE `employee_directory`;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `employee`
--

INSERT INTO `employee` VALUES 
	(1,'Avinash','Bhardwaj','avinash@curiouscoder.com'),
	(2,'Shubham','Tiwari','shubham@curiouscoder.com'),
	(3,'Mahesh','Hanwatkar','mahesh@curiouscoder.com'),
	(4,'KirtiVardhan','Bais','kirti@curiouscoder.com'),
	(5,'Vikas','Rathi','vikas@curiouscoder.com');

