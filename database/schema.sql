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