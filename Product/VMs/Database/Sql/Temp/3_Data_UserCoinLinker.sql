DROP TABLE IF EXISTS UserCoinLinker;
CREATE TABLE UserCoinLinker (
	Id INT NOT NULL AUTO_INCREMENT,
	CoinId INT NOT NULL,
	UserId INT NOT NULL,
	Amount INT,
	
	PRIMARY KEY (Id)
);