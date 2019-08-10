DROP TABLE IF EXISTS Users;
CREATE TABLE Users (
	Id INT NOT NULL AUTO_INCREMENT,
	UserName VARCHAR(255),
	Password VARCHAR(255),
	ImageLocation VARCHAR(255),
	FirstName VARCHAR(255),
	LastName VARCHAR(255),
	DateOfBirth DATE,
	Gender ENUM('Male', 'Female', 'Other'),
	CountryId INT,
	
	PRIMARY KEY (Id)
);