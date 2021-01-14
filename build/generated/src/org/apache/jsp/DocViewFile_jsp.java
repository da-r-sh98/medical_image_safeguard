package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import doctorsearch.connect;

public final class DocViewFile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      <h1>My Appointments</h1>\n");
      out.write("        <table class=\"table\" width=\"100%\" border=\"1\">\n");
      out.write("            <tr>\n");
      out.write("                <td>User</td>\n");
      out.write("             <td>Name</td>\n");
      out.write("             <td>Gender</td>\n");
      out.write("             <td>Dateof Birth</td>\n");
      out.write("                <td>Date Of Booking</td>\n");
      out.write("                <td>Photo</td> \n");
      out.write("              \n");
      out.write("              \n");
      out.write("                <td></td>\n");
      out.write("            </tr>\n");
      out.write("           ");

           connect cc1= new connect();
           cc1.read("select * from appintment inner join patientdetails on patientdetails.uname=appintment.uname  where status<>'waiting' and doc='"+session.getAttribute("user")+"'");
           while(cc1.rs.next())
           {
           
      out.write("\n");
      out.write("             <tr>\n");
      out.write("                <td>");
      out.print(cc1.rs.getString(3));
      out.write("</td>\n");
      out.write("               <td>");
      out.print(cc1.rs.getString("name"));
      out.write("</td>\n");
      out.write("                 <td>");
      out.print(cc1.rs.getString("gender"));
      out.write("</td>\n");
      out.write("                  <td>");
      out.print(cc1.rs.getString("dob"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(cc1.rs.getString(4));
      out.write("</td>\n");
      out.write("               \n");
      out.write("                      <td><img src=\"pphoto/");
      out.print(cc1.rs.getString("photo"));
      out.write("\" width=\"50px\" ></td>\n");
      out.write("                      <td><a href=\"dochome.jsp?pg=fup&id1=");
      out.print(cc1.rs.getString(1));
      out.write("&uname=");
      out.print(cc1.rs.getString(3));
      out.write("\"><button class=\"btn btn-info\">View Files</button></a></td>\n");
      out.write("            </tr>\n");
      out.write("            ");
}
           
      out.write("\n");
      out.write("        </table>");

            
            if(request.getParameter("id1")!=null)
            {
                
      out.write("\n");
      out.write("                <table class=\"table\">\n");
      out.write("                    <tr><td>File Id</td><td>File Name</td><td>Uplaoded date</td><td>Decrypt And Download</td></tr>\n");
      out.write("            ");

            cc1.read("select * from filedetails where aid='"+request.getParameter("id1")+"'");
            while(cc1.rs.next())
            {
            
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("            <td>");
      out.print(cc1.rs.getString(1));
      out.write("</td>\n");
      out.write("            <td>");
      out.print(cc1.rs.getString(2));
      out.write("</td>\n");
      out.write("            <td>");
      out.print(cc1.rs.getString(4));
      out.write("</td>\n");
      out.write("            <td><a href=\"dochome.jsp?pg=vf&aid=");
      out.print(cc1.rs.getString(1));
      out.write("\">View File Details</a></td>\n");
      out.write("                    </tr> \n");
      out.write("                    ");

            }
      out.write("     </table>\n");
      out.write("            ");

            }
            
      out.write("\n");
      out.write("                  \n");
      out.write("           \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
