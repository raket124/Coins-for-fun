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