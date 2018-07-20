use kk;
CREATE TABLE `user` (
  `id` varchar(30) NOT NULL,
  `password` varchar(30) DEFAULT NULL,
  `lastname` varchar(30) DEFAULT NULL,
  `firstname` varchar(30) DEFAULT NULL,
  `emailid` varchar(30) DEFAULT NULL,
  `phonenumber` varchar(30) DEFAULT NULL,
  `address` varchar(30) DEFAULT NULL,
  `role` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO user
VALUES ('dummyid', 'dummypassword', 'dummylastname','dummyfirstname','dummyemailid','dummyphonenumber','dummyaddress','dummyrole');