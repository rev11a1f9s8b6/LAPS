CREATE TABLE leaveLAPS (
		leaveID VARCHAR(100) NOT NULL,
		startDate VARCHAR(50) NOT NULL,
		endDate VARCHAR(50) NOT NULL,
		Category VARCHAR(50) NOT NULL,
		reasons VARCHAR(100) NOT NULL,
        workDissemination VARCHAR(100) NULL,
        contactDetails VARCHAR(100) NULL,
		PRIMARY KEY (LeaveID));