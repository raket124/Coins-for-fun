DROP TABLE IF EXISTS UserCoinLinker;
CREATE TABLE UserCoinLinker (
	Id INT NOT NULL AUTO_INCREMENT,
	CoinId INT NOT NULL,
	UserId INT NOT NULL,
	Amount INT,
	
	PRIMARY KEY (Id)
);




DROP TABLE IF EXISTS UserCoinHistory;
CREATE TABLE UserCoinHistory (
	Id INT NOT NULL AUTO_INCREMENT,
	CoinId INT NOT NULL,
	UserId INT NOT NULL,
	Amount INT,
	TimeStamp DATETIME,
	
	PRIMARY KEY (Id)
);




DELIMITER $$

DROP TRIGGER IF EXISTS history;
CREATE TRIGGER history 
AFTER INSERT ON UserCoinLinker
FOR EACH ROW 
BEGIN
	INSERT INTO UserCoinHistory (CoinId, UserId, Amount, TimeStamp)
	VALUES (NEW.CoinId, NEW.UserId, NEW.Amount, NOW());
END; $$

DELIMITER ;


INSERT INTO UserCoinLinker (CoinId, UserId, Amount)
VALUES (1, 1, 4);

SELECT * FROM UserCoinLinker;
SELECT * FROM UserCoinHistory;