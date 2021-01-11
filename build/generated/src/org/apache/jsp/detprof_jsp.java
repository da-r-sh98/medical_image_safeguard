package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import doctorsearch.connect;

public final class detprof_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


               public String  getSub(String x)
               {
               try
               {
                 connect c01=new connect();
                        c01.read("select * from subcat where sub_id='"+x+"'");
                        if(c01.rs.next())
                        {
                        return c01.rs.getString(3);
                        }
                     
               
               }
catch(Exception e)
               {}
               return "";
               }
               public String  getcate(String x)
               {
               try
               {
                 connect c01=new connect();
                        c01.read("select * from cate where cid='"+x+"'");
                        if(c01.rs.next())
                        {
                        return c01.rs.getString(2);
                        }
                     
               
               }
catch(Exception e)
               {}
               return "";
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("         <script>\n");
      out.write("               function get(x)\n");
      out.write("            {//alert(\"Pleace wait for Confirmation\");\n");
      out.write("                var str=x.value;\n");
      out.write("               // alert(x);\n");
      out.write("                var xhttp= new XMLHttpRequest();\n");
      out.write("                xhttp.onreadystatechange=function()\n");
      out.write("                {\n");
      out.write("                  \n");
      out.write("                    if(this.readyState==4 && this.status==200)\n");
      out.write("                    {\n");
      out.write("                        document.getElementById(\"sub\").innerHTML=xhttp.responseText;\n");
      out.write("                    }\n");
      out.write("                };\n");
      out.write("                xhttp.open(\"post\",\"getSubcate.jsp?id=\"+str+\"&y=\"+y,true);\n");
      out.write("                xhttp.send();\n");
      out.write("            }\n");
      out.write("            function chk(v)\n");
      out.write("            {\n");
      out.write("             if(isNaN(v.t5.value))\n");
      out.write("             {\n");
      out.write("                 alert(\"must enter number\");\n");
      out.write("                 v.t5.value=\"\";\n");
      out.write("                 v.t5.focus();\n");
      out.write("                 return false;\n");
      out.write("             }\n");
      out.write("              if(v.t5.value.length<10)\n");
      out.write("             {\n");
      out.write("                 alert(\"must enter number\");\n");
      out.write("                 v.t5.value=\"\";\n");
      out.write("                 v.t5.focus();\n");
      out.write("                 return false;\n");
      out.write("             }\n");
      out.write("              if(!isNaN(v.t3.value))\n");
      out.write("             {\n");
      out.write("                 alert(\"must be alphabet\");\n");
      out.write("                 v.t3.value=\"\";\n");
      out.write("                 v.t3.focus();\n");
      out.write("                 return false;\n");
      out.write("             }\n");
      out.write("             return true;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("        <style>\n");
      out.write("            .b1, .b2, .b3\n");
      out.write("            {\n");
      out.write("                \n");
      out.write("                width:150px;\n");
      out.write("                height:30px;\n");
      out.write("                padding-top: 5px !important;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <script src=\"js/jquery-1.7.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function(){\n");
      out.write("                $(\".b2\").hide();\n");
      out.write("              $(\".b3\").hide();\n");
      out.write("                $(\".c2\").hide();\n");
      out.write("                \n");
      out.write("                $(\".b1\").click(function(){\n");
      out.write("                    $(\".b1\").hide();\n");
      out.write("                    $(\".c1\").hide();\n");
      out.write("                $(\".b2\").show();\n");
      out.write("                  $(\".b3\").show();\n");
      out.write("                $(\".c2\").show()\n");
      out.write("                } );\n");
      out.write("                \n");
      out.write("                $(\".b3\").click(function(){\n");
      out.write("                    $(\".b1\").show();\n");
      out.write("                    $(\".c1\").show();\n");
      out.write("                $(\".b2\").hide();\n");
      out.write("                $(\".b3\").hide();\n");
      out.write("                $(\".c2\").hide()\n");
      out.write("                });\n");
      out.write("              \n");
      out.write("                                    });\n");
      out.write("               </script>\n");
      out.write("               \n");
      out.write("               <style>\n");
      out.write("               </style>\n");
      out.write("               ");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

        connect p=new connect();
        p.read("select * from docreg where mail='"+session.getAttribute("user").toString()+"'");
           if(p.rs.next())  
           {
               
        
      out.write("\n");
      out.write("        <form method=\"post\" action=\"edtpf\" onsubmit=\"return chk(this);\">\n");
      out.write("            <table class=\" table-striped\" width=\"100%\" style=\"padding:10px;margin:20px;\">\n");
      out.write("            <tr><td>name</td>\n");
      out.write("                <td>");
      out.print(p.rs.getString(2));
      out.write("</td></tr>\n");
      out.write("               <tr><td>category</td>\n");
      out.write("                   <td class=\"c1\">");
      out.print(getcate(p.rs.getString(3)));
      out.write("</td>\n");
      out.write("                  <td class=\"c2\">  <Select name=\"t1\" ");
 
      out.write(" onchange=\"get(this);\" class=\"form-control\">\n");
      out.write("                              <option>-select-</option>\n");
      out.write("                        ");

                        connect c01=new connect();
                        c01.read("select * from cate");
                        while(c01.rs.next())
                        {
                            
      out.write("\n");
      out.write("                            <option value=\"");
      out.print(c01.rs.getString(1));
      out.write('"');
      out.write(' ');
 if(p.rs.getString(3).equals(c01.rs.getString(1))) out.print("selected='selected'");
      out.write('>');
      out.print(c01.rs.getString(2));
      out.write("</option>\n");
      out.write("                         ");

                         }
                         
      out.write("\n");
      out.write("                               </Select></td>\n");
      out.write("               </tr>\n");
      out.write("                  <tr><td>sub category</td>\n");
      out.write("                <td class=\"c1\">");
      out.print(getSub(p.rs.getString(4)));
      out.write("</td>\n");
      out.write("                <td class=\"c2\" id=\"sub\">\n");
      out.write("            <Select name=\"t2\" class=\"form-control\" >\n");
      out.write("                              <option value=\"");
      out.print(p.rs.getString(4));
      out.write('"');
      out.write('>');
      out.print(getSub(p.rs.getString(4)));
      out.write("</option>\n");
      out.write("                              <option></option>\n");
      out.write("                               </Select>\n");
      out.write("                </td>\n");
      out.write("                  </tr>\n");
      out.write("                     <tr><td>qualification</td>\n");
      out.write("                          <td class=\"c1\">");
      out.print(p.rs.getString(5));
      out.write("</td>\n");
      out.write("                          <td class=\"c2\"><textarea class=\"form-control\" name=\"ql\" required=\"\">");
      out.print(p.rs.getString(5));
      out.write("</textarea>\n");
      out.write("</td>\n");
      out.write("                      </tr>\n");
      out.write("                        <tr><td>specification details</td>\n");
      out.write("                <td class=\"c1\">");
      out.print(p.rs.getString(6));
      out.write("</td>\n");
      out.write("                <td class=\"c2\"><textarea class=\"form-control\" name=\"q2\" required=\"\">");
      out.print(p.rs.getString(6));
      out.write("</textarea></td></tr>\n");
      out.write("                          <tr><td>hospital name</td>\n");
      out.write("                <td class=\"c1\">");
      out.print(p.rs.getString(7));
      out.write("</td>\n");
      out.write("                <td class=\"c2\"><textarea  class=\"form-control\"name=\"q3\" required=\"\">");
      out.print(p.rs.getString(7));
      out.write("</textarea></td></tr>\n");
      out.write("                            <tr><td>experance</td>\n");
      out.write("                <td class=\"c1\">");
      out.print(p.rs.getString(8));
      out.write("</td>\n");
      out.write("                <td class=\"c2\"><textarea class=\"form-control\" name=\"q4\" required=\"\">");
      out.print(p.rs.getString(8));
      out.write("</textarea></td></tr>\n");
      out.write("                              <tr><td>contact no</td>\n");
      out.write("                <td class=\"c1\">");
      out.print(p.rs.getString(9));
      out.write("</td>\n");
      out.write("                <td class=\"c2\"><textarea  class=\"form-control\" name=\"q5\" required=\"\" maxlength=\"12\">");
      out.print(p.rs.getString(9));
      out.write("</textarea></td></tr>\n");
      out.write("                               <tr><td>address</td>\n");
      out.write("                <td class=\"c1\">");
      out.print(p.rs.getString(10));
      out.write("</td>\n");
      out.write("                <td class=\"c2\"><textarea name=\"q6\" class=\"form-control\" required=\"\">");
      out.print(p.rs.getString(10));
      out.write("</textarea></td></tr>\n");
      out.write("                                <tr><td>location</td>\n");
      out.write("                <td class=\"c1\">");
      out.print(p.rs.getString(11));
      out.write("</td>\n");
      out.write("                <td class=\"c2\">  <textarea name=\"q7\"  class=\"form-control\" required=\"\">");
      out.print(p.rs.getString(11));
      out.write("</textarea></td></tr>\n");
      out.write("                                 <tr><td>email</td>\n");
      out.write("                <td>");
      out.print(p.rs.getString(14));
      out.write("</td>\n");
      out.write("                      </tr>\n");
      out.write("                      <tr><td><button  class=\"b1 btn btn-warning\" type=\"button\">edit</button></td>\n");
      out.write("                                     <td><input type=\"submit\"   value=\"update\"  class=\"b2 btn btn-info\"></td>\n");
      out.write("                                     <td><button class=\"b3 btn btn-danger\"   type=\"button\">cancel</button></td></tr>\n");
      out.write("         </table>   </form>\n");
      out.write("        \n");
      out.write("        ");
}
      out.write("\n");
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
