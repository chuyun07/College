import sqlite3

# Create an in-memory SQLite database
conn = sqlite3.connect(':memory:')
cursor = conn.cursor()

# Execute the Bank Table schema
cursor.execute('''
    CREATE TABLE Bank (
        BankName VARCHAR(100) PRIMARY KEY
    )
''')

# Execute the Branch Table schema
cursor.execute('''
    CREATE TABLE Branch (
        BranchNumber INT,
        BankName VARCHAR(100),
        BranchName VARCHAR(100),
        AddressNumber VARCHAR(10),
        AddressStreet VARCHAR(100),
        AddressCity VARCHAR(100),
        PRIMARY KEY (BranchNumber, BankName),
        FOREIGN KEY (BankName) REFERENCES Bank(BankName)
    )
''')

# Execute the BranchPhones Table schema
cursor.execute('''
    CREATE TABLE BranchPhones (
        BranchNumber INT,
        BankName VARCHAR(100),
        PhoneNumber VARCHAR(15),
        PRIMARY KEY (BranchNumber, BankName, PhoneNumber),
        FOREIGN KEY (BranchNumber, BankName) REFERENCES Branch(BranchNumber, BankName)
    )
''')

# Execute the Customer Table schema
cursor.execute('''
    CREATE TABLE Customer (
        SSN VARCHAR(11) PRIMARY KEY,
        Name VARCHAR(100)
    )
''')

# Execute the CustomerAddresses Table schema
cursor.execute('''
    CREATE TABLE CustomerAddresses (
        SSN VARCHAR(11),
        POBox VARCHAR(10),
        City VARCHAR(100),
        ZipCode VARCHAR(10),
        Country VARCHAR(100),
        PRIMARY KEY (SSN, POBox, City, ZipCode),
        FOREIGN KEY (SSN) REFERENCES Customer(SSN)
    )
''')

# Execute the CustomerPhones Table schema
cursor.execute('''
    CREATE TABLE CustomerPhones (
        SSN VARCHAR(11),
        PhoneNumber VARCHAR(15),
        PRIMARY KEY (SSN, PhoneNumber),
        FOREIGN KEY (SSN) REFERENCES Customer(SSN)
    )
''')

# Execute the Account Table schema
cursor.execute('''
    CREATE TABLE Account (
        AccountNumber INT,
        BranchNumber INT,
        BankName VARCHAR(100),
        AccountType VARCHAR(50),
        Balance DECIMAL(15, 2),
        SSN VARCHAR(11),
        PRIMARY KEY (AccountNumber, BranchNumber, BankName),
        FOREIGN KEY (BranchNumber, BankName) REFERENCES Branch(BranchNumber, BankName),
        FOREIGN KEY (SSN) REFERENCES Customer(SSN)
    )
''')

# Confirm successful execution of the schema creation
"Schema successfully created!"
