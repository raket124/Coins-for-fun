DROP TABLE IF EXISTS Countries;
CREATE TABLE Countries (
	Id INT NOT NULL AUTO_INCREMENT,
	Code VARCHAR(10),
	Name VARCHAR(255),
	
	PRIMARY KEY (Id)
);