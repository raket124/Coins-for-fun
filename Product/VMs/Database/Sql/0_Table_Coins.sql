DROP TABLE IF EXISTS Coins;
CREATE TABLE Coins (
	Id INT NOT NULL AUTO_INCREMENT,
	CountryId INT,
	SetId INT,
	Name VARCHAR(255),
	Year INT,

	PRIMARY KEY (Id)
);