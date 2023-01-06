DROP SCHEMA IF EXISTS `eshop` ;
CREATE SCHEMA IF NOT EXISTS `eshop` DEFAULT CHARACTER SET latin1 ;
USE `eshop` ;

CREATE TABLE IF NOT EXISTS `eshop`.`customers` (
    `name` VARCHAR(32),
    `address` VARCHAR(128) not null,
    `email` VARCHAR(128) not null,
    PRIMARY KEY (`name`)
) ;

# Dumping data for table 'customers'
#




INSERT INTO `customers` (`name`,`address`,`email`) VALUES ('fred','201 Cobblestone Lane','fredflintstone@bedrock.com');
INSERT INTO `customers` (`name`,`address`,`email`) VALUES ('sherlock','221B Baker Street, London','sherlock@consultingdetective.org');
INSERT INTO `customers` (`name`,`address`,`email`) VALUES ('spongebob','124 Conch Street, Bikini Bottom','spongebob@yahoo.com');
INSERT INTO `customers` (`name`,`address`,`email`) VALUES ('jessica','698 Candlewood Land, Cabot Cove','fletcher@gmail.com');
INSERT INTO `customers` (`name`,`address`,`email`) VALUES ('dursley','4 Privet Drive, Little Whinging, Surrey','dursley@gmail.com');


DROP SCHEMA IF EXISTS `estore` ;
CREATE SCHEMA IF NOT EXISTS `estore` DEFAULT CHARACTER SET latin1 ;
USE `estore` ;

CREATE TABLE IF NOT EXISTS `estore`.`orders` (
    `orderId` VARCHAR(8) not null,
    `deliveryId` INT(8) not null,
    `name` VARCHAR(32) not null,
    `address` VARCHAR(128) not null,
    `email` VARCHAR(128) not null,
    `orderStatus` VARCHAR(128),
    `orderDate` date not null,
    `uniqueItems` INT(25) not null,
    PRIMARY KEY (`orderId`)
) ;

USE `estore` ;

CREATE TABLE IF NOT EXISTS `estore`.`orderItems` (
    `item` VARCHAR(32) not null,
    `quantity` INT(25) not null,
    `order_id` VARCHAR(8) not null REFERENCES `orders`.`orderId`
) ;