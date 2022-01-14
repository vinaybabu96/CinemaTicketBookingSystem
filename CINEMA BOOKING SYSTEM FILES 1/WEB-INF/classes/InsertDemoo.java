
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.sql.*;

public class InsertDemoo extends HttpServlet
{
public void doPost(HttpServletRequest req,HttpServletResponse res)
{
try
{
String id=req.getParameter("sid");
String name=req.getParameter("sname");
System.out.println(id+" "+name);
res.setContentType("text/html");
PrintWriter out=res.getWriter();
Class.forName("com.mysql.jdbc.Driver"); //loading the driver

Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/srinu","root",""); //establishing the connection

System.out.println("connection sucessfull");

Statement st=con.createStatement();   //creating the sql statement

int r=st.executeUpdate("insert into student values('"+id+"','"+name+"')");

if(r==0)
out.println("insertion failure");
else
out.println("registration success");
con.close();
st.close();
}
catch(Exception e)
{
}
}
}