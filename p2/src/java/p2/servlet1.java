/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import entity.MyEntity1;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import session.MyEntity1Facade;
public class servlet1 extends HttpServlet {
    @EJB 
    private MyEntity1Facade myEntity1Facade;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        String fname=request.getParameter("firstname");
        String lname=request.getParameter("lastname");
        // append also last name
        if(fname!=null){
           out.println("Hello, "+fname+" "+lname+"!");
        } else{
           out.println("abc");
        }
        out.close();
    }
        @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        int n1=Integer.parseInt(request.getParameter("number1"));
        int n2=Integer.parseInt(request.getParameter("number2"));
        MyEntity1 myEntity1 = myEntity1Facade.findXY(n1,n2);
            if(myEntity1 != null){
                myEntity1.setCount(myEntity1.getCount()+1);
                myEntity1Facade.edit(myEntity1);
            }else{
                myEntity1 = new MyEntity1(n1, n2, n1*n2, 1);
                myEntity1Facade.create(myEntity1);
            }
            
            
           // 
        out.println(n1*n2);
        out.close();
    }
}
