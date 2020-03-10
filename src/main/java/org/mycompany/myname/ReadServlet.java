package org.mycompany.myname;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.io.PrintWriter;
import java.sql.Statement;


import java.sql.ResultSet;
import java.sql.SQLException;

class read {
    private int actor_id;
    private String lastname;
    private String firstname;


    public int getActor_id() {
        return actor_id;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }


    public void setActor_id(int actor_id) {
        this.actor_id = actor_id;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public read(ResultSet resultSet)throws SQLException{
        this.actor_id= resultSet.getInt(actor_id);
        this.firstname= resultSet.getString(firstname);
        this.lastname= resultSet.getString(lastname);
    }

}

public class ReadServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException,IOException {
        String qryStr = "";
        Statement stmt = null;
        ResultSet rs = null;
        PrintWriter out = response.getWriter();
        Connection conn = null;

        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/Data", "postgres", "admin");
            stmt = conn.createStatement();

            qryStr = "select * from  actor";
            rs = stmt.executeQuery(qryStr);

            if(rs.next()){
                read actor = new read (rs);
                actor.setActor_id(rs.getInt("actor_id"));
                actor.setLastname(rs.getString("lastname"));
                actor.setFirstname(rs.getString("firstname"));
                request.setAttribute("actor", actor);
                RequestDispatcher view = request.getRequestDispatcher("read.jsp");
                view.forward(request, response);
            }

        }
        catch(ClassNotFoundException e) {
            out.println("Couldn't load database driver: " + e.getMessage());
        }
        catch(SQLException e) {
            out.println("SQLException caught: " + e.getMessage());
        }
        finally {
            // Always close the database connection.
            try {
                if (conn != null) conn.close();
            }
            catch (SQLException ignored) { }
        }

    }
}