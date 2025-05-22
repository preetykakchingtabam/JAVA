9c. Develop a JDBC project using MySQL to append the fields empno, empname and basicsalary
into the table Emp of the database Employee by getting the fields through keyboard and Generate
the report as follows for the table Emp (Emp_NO , Emp_Name, Basicsalary ) using HTML and JSP
to get the field and display the results respectively


<%@ page import="java.sql.*" %>
<%
    String jdbcURL = "jdbc:mysql://localhost:3306/Employee1";
    String dbUser = "root";
    String dbPassword = ""; // change if needed

    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    double grandSalary = 0;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
        stmt = conn.createStatement();
        rs = stmt.executeQuery("SELECT * FROM Emp");
%>
<!DOCTYPE html>
<html>
<head>
    <title>Salary Report</title>
    <style>
        pre {
            font-family: monospace;
        }
    </style>
</head>
<body>
    <h2>Salary Report</h2>
<%
        while (rs.next()) {
            int empNo = rs.getInt("Emp_NO");
            String empName = rs.getString("Emp_Name");
            double basic = rs.getDouble("Basicsalary");
            grandSalary += basic;
%>
<pre>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Emp_No   : <%= empNo %>
Emp_Name : <%= empName %>
Basic    : <%= basic %>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
</pre>
<%
        }
%>
<pre>
Grand Salary : <%= grandSalary %>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
</pre>
    <br><a href="addEmp.html">Add More Employees</a>
</body>
</html>
<%
    } catch (Exception e) {
        out.println("Error: " + e.getMessage());
    } finally {
        if (rs != null) try { rs.close(); } catch(Exception e) {}
        if (stmt != null) try { stmt.close(); } catch(Exception e) {}
        if (conn != null) try { conn.close(); } catch(Exception e) {}
    }
%>
