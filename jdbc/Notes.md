## How to create a JDBC connection?  
          Connection connection = DriverManager.getConnection(DB_URL, USERNAME, PWD);  
          Statement stmt = connection.createStatement();  
          ResultSet resultSet = stmt.executeQuery(QUERY);    
          
## When to use the specific statements?  
          createStatement() is used, if we want to execute static queries.
          preparedStatement is used, when we plan to execute the sql queries many times and accepts the input parameters at run time.
          callableStatement is used, when we plan to access the stored procedures and accepts the input parameters at run time
          
          
