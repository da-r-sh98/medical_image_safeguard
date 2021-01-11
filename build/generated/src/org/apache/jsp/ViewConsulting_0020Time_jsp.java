package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.text.SimpleDateFormat;
import java.text.*;
import doctorsearch.connect;

public final class ViewConsulting_0020Time_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    private static String getD(int dayofWeek) {

		String dayName = null;
		switch (dayofWeek) {
		case 1:
			dayName = "Sunday";
			break;
		case 2:
			dayName = "Monday";
			break;
		case 3:
			dayName = "Tuesday";
			break;
		case 4:
			dayName = "Wednesday";
			break;
		case 5:
			dayName = "Thursday";
			break;
		case 6:
			dayName = "Friday";
			break;
		case 7:
			dayName = "Saturday";
			break;
		}
		return dayName;
	}
    
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
      out.write("\n");
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
      out.write("    ");
      out.write("\n");
      out.write("    <body> \n");
      out.write("        <span class=\"close\" onclick=\"cl()\"><i class=\"icon-2x\" >&times;</i></span>\n");
      out.write("        <h2>Consulting Time</h2>\n");
      out.write("        <table border=\"1\" class=\"table\">\n");
      out.write("         \n");
      out.write("            <tr style=\"background:#df8a13\">\n");
      out.write("                <th >day</th>\n");
      out.write("            \n");
      out.write("                  <th>From</th>\n");
      out.write("                   <th>To</th>\n");
      out.write("                   <th >no of booking per day</th>\n");
      out.write("                     <th ></th>\n");
      out.write("                    \n");
      out.write("            </tr>\n");
      out.write("            ");

            connect co= new connect();
             DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            
            Date date = null;
            try {
                date = formatter.parse(request.getParameter("dt"));
            } catch (Exception ex) {
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            // Get values from calendar.
            int day=calendar.get(Calendar.DAY_OF_WEEK);
            co.read("select * from consultingtime where doc='"+request.getParameter("m")+"' and day='"+day+"'");
int i=0;
            while(co.rs.next())
            {
               i++;
            
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print(getD(co.rs.getInt(3)));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(co.rs.getString(4));
      out.write("</td>\n");
      out.write("                  <td>");
      out.print(co.rs.getString(5));
      out.write("</td>\n");
      out.write("                   <td>");
      out.print(co.rs.getString(6));
      out.write("</td>\n");
      out.write("               \n");
      out.write("                   <td><a href=\"Book?id=");
      out.print(co.rs.getString(1));
      out.write("&dt=");
      out.print(request.getParameter("dt"));
      out.write("&doc=");
      out.print(request.getParameter("m"));
      out.write("&t1=");
      out.print(connect.cid);
      out.write("&t2=");
      out.print(connect.sid);
      out.write("&t4=");
      out.print(connect.loc);
      out.write("&t3=");
      out.print(connect.sp);
      out.write("\"><button class=\"btn btn-warning\"><i class=\"icon-heart\">Book Now</i></button></a>\n");
      out.write("                   </td>\n");
      out.write("                      \n");
      out.write("            </tr>\n");
      out.write("           \n");
      out.write("            ");
}
            
      out.write(" <tr>\n");
      out.write("                <td colspan=\"5\">");

            if(i==0)
            {
            out.print("<h3>No Consulting on <font color='red'> "+getD(day)+" </font>  Choose another date</h3>");
            }
            
      out.write("\n");
      out.write("                </td>\n");
      out.write("               </tr> \n");
      out.write("        </table>\n");
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
