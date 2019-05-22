CREATE TABLE `sa48`.`leavelaps` (
  `leave_id` VARCHAR(45) NOT NULL,
  `start_date` VARCHAR(45) NOT NULL,
  `end_date` VARCHAR(45) NOT NULL,
  `category` VARCHAR(45) NOT NULL,
  `reasons` VARCHAR(45) NOT NULL,
  `work_dissemination` VARCHAR(45) NULL,
  `contact_details` VARCHAR(45) NULL,
  PRIMARY KEY (`leave_id`));