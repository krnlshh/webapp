package org.mycompany.myname;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;

public class ReadServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text/html;charset=UTF-8");
//      set content type
        try{
            Class.forName("org.postgresql.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/Data","postgres","admin");

            Statement stmt = con.createStatement();

            String mString="SELECT mname FROM users;";
            String eString="SELECT email FROM users;";

            int ab = stmt.executeUpdate(mString);
            int cd = stmt.executeUpdate(eString);

            int em = ab;
            int mname = cd;

            ArrayList<Read> std = new ArrayList<Read>();

            std.add(new Read( em,mname));

            request.setAttribute("data", std);
            RequestDispatcher rd = request.getRequestDispatcher("read.jsp");
            rd.forward(request, response);

        }catch (Exception e){

        }

    }
}
