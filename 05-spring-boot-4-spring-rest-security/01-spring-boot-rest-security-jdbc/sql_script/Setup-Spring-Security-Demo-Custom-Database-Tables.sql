USE `employee_directory`;

DROP TABLE IF EXISTS `roles`;
DROP TABLE IF EXISTS `members`;

--
-- Table structure for table `users`
--

CREATE TABLE `members` (
  `user_id` varchar(50) NOT NULL,
  `pw` varchar(68) NOT NULL,
  `active` tinyint NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Inserting data for table `users`
--

INSERT INTO `members` 
VALUES 
('avi','{bcrypt}$2a$10$A8qKfA0bOyXhsm3CmeepneE9iEE2ktEiq8lrmHlTLad6DPjuUp8Ue',1),
('shubh','{bcrypt}$2a$10$cjXVA4D9PNKgbAXU3MOA1.Cfx0.kTt4XRFn1Bho9yAs1DPjKZtx2K',1),
('mahi','{bcrypt}$2a$10$my7.kkQlNVhs53WYKCQFC.A07HJuZnNVQuiqsSFzOdsmwvvPSvCx6',1);


--
-- Table structure for table `authorities`
--

CREATE TABLE `roles` (
  `user_id` varchar(50) NOT NULL,
  `role` varchar(50) NOT NULL,
  UNIQUE KEY `roles_idx_1` (`user_id`,`role`),
  CONSTRAINT `roles_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `members` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Inserting data for table `authorities`
--

INSERT INTO `roles` 
VALUES 
('mahi','ROLE_EMPLOYEE'),
('shubh','ROLE_EMPLOYEE'),
('shubh','ROLE_MANAGER'),
('avi','ROLE_EMPLOYEE'),
('avi','ROLE_MANAGER'),
('avi','ROLE_ADMIN');