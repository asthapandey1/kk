use kk;
CREATE TABLE `cart` (
  `id` varchar(30) DEFAULT NULL,
  `cartInfo` varchar(1000) DEFAULT NULL,
   FOREIGN KEY (id)
   REFERENCES user(id),
   PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO user
VALUES ('dummyid', 'dummypassword', 'dummylastname','dummyfirstname','dummyemailid','dummyphonenumber','dummyaddress','dummyrole');