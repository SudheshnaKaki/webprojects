package com.training.ui;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.entity.Customer;


@WebServlet("/Reg")
public class RegistrationServlet extends HttpServlet {
                private static final long serialVersionUID = 1L;
       
    
                protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                                // TODO Auto-generated method stub
                                doPost(request, response);
                }

                
                protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                                // TODO Auto-generated method stub
                                
                                PrintWriter out = response.getWriter();
                                Customer customer = new Customer();
                                
                                
                                String strId = request.getParameter("txtid");
                                if(strId!=null)
                                {
                                                int id = Integer.parseInt(strId);
                                                customer.setId(id);
                                }
                                String strName = request.getParameter("txtName");
                                if(strName!=null)
                                {
                                                customer.setName(strName);
                                }
                                String strGender = request.getParameter("radGender");
                                if(strGender!=null){
                                                int gender = Integer.parseInt(strGender);
                                                customer.setGender(gender);
                                }
                                String strIsPrivileged = request.getParameter("chkPrivileged");
                                if(strIsPrivileged==null)
                                {
                                                customer.setPrevilage(false);
                                }
                                else
                                {
                                                if(strIsPrivileged.equals("yes"));
                                                customer.setPrevilage(true);
                                }
                                String strEmail = request.getParameter("txtEmailid");
                                if(strEmail!=null)
                                {
                                                customer.setEmail(strEmail);
                                }
                                String strphone = request.getParameter("txtPhn");
                                if(strphone!=null)
                                {
                                                customer.setPhone(strphone);
                                }
                                String strAddress = request.getParameter("txtAddress");
                                if(strAddress!=null)
                                {
                                                customer.setAddress(strAddress);
                                }
                                String strDate = request.getParameter("txtDate");
                                if(strDate!=null)
                                {
                                              SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
                                              
                                              Date doj;
											
												try {
													doj = sdf.parse(strDate);
													customer.setDateOfJoining( doj);
												} catch (ParseException e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
												}
												
											} 
                                              
                                              
                                              
                              String strDesc = request.getParameter("txtDesc");
                              if(strDesc != null) {
                            	  customer.setDescription(strDesc);
                              }
                                String strBalance = request.getParameter("txtBalance");
                                if(strBalance != null) {
                                	double balanceAmt = Double.parseDouble(strBalance);
                                	customer.setBalanceAmount(balanceAmt);
                                }
                                
                                String strRating = request.getParameter("txtRating");
                                if(strRating != null) {
                                	int rating = Integer.parseInt(strRating);
                                	customer.setCustomerRating(rating);
                                }
                                out.println(customer.getName()+"<br>");
                                out.println(customer.getId()+"<br>");
                                out.println(customer.getEmail()+"<br>");
                                out.println(customer.getAddress()+"<br>");
                                out.println(customer.getBalanceAmount()+"<br>");
                                out.println(customer.getCustomerRating()+"<br>");
                                out.println(customer.getPhone()+"<br>");
                                out.println(customer.getGender()+"<br>");
                                out.println(customer.getDescription()+"<br>");
                                out.println(customer.isPrevilage()+"<br>");
                }

}
