import java.sql.*;
import java.io.*;
public class InsertDemo
{
public static void main(String args[]) throws Exception
{
Class.forName("com.mysql.jdbc.Driver"); //loading the driver

Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/srinu","root",""); //establishing the connection

System.out.println("connection sucessfull");

Statement st=con.createStatement();   //creating the sql statement

int r=st.executeUpdate("insert into student values(505,'kshf')");

if(r==0)
System.out.println("insertion failure");
else
System.out.println("no of rows inserted is:"+r);
con.close();
st.close();
}
}
