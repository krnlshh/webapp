package org.mycompany.myname;

import javax.servlet.http.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.io.PrintWriter;


public class insertDataServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        PrintWriter out= response.getWriter();
        String mname = request.getParameter("mname");
        String em = request.getParameter("email");
        try {

            Class.forName("org.postgresql.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/Data","postgres","admin");
            Statement stmt = con.createStatement();

            String queryString="insert into users ( mname, email) values ("
                    + "'" + mname + "'" + "," + "'" + em + "'" + ");";
            int rs= stmt.executeUpdate(queryString);


//            String readString = "select * from  users";
//            ResultSet ps= stmt.executeQuery(readString);
//
//
//            RequestDispatcher requestDispatcher = request.getRequestDispatcher("read.jsp");
//            requestDispatcher.forward(request, response);



            con.close();
            stmt.close();

        }
        catch (Exception e){
            e.printStackTrace();

        }

    }
}