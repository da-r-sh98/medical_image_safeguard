package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import doctorsearch.connect;
import java.io.File;

public final class ViewMyFiles_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<style>\n");
      out.write("/* The Modal (background) */\n");
      out.write(".modal {\n");
      out.write("    display: none; /* Hidden by default */\n");
      out.write("    position: fixed; /* Stay in place */\n");
      out.write("    z-index: 1; /* Sit on top */\n");
      out.write("    padding-top: 100px; /* Location of the box */\n");
      out.write("    left: 0;\n");
      out.write("    top: 0;\n");
      out.write("    width: 80%; /* Full width */\n");
      out.write("    height: 350px; /* Full height */\n");
      out.write("    overflow: auto; /* Enable scroll if needed */\n");
      out.write("    background-color: rgb(0,0,0); /* Fallback color */\n");
      out.write("    background-color: rgba(0,0,0,0.4); /* Black w/ opacity */\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Modal Content */\n");
      out.write(".modal-content {\n");
      out.write("    background-color: #fefefe;\n");
      out.write("    margin: auto;\n");
      out.write("    padding: 20px;\n");
      out.write("    border: 1px solid #888;\n");
      out.write("    width: 80%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* The Close Button */\n");
      out.write(".close {\n");
      out.write("    color: #aaaaaa;\n");
      out.write("    float: right;\n");
      out.write("    font-size: 28px;\n");
      out.write("    font-weight: bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".close:hover,\n");
      out.write(".close:focus {\n");
      out.write("    color: #000;\n");
      out.write("    text-decoration: none;\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<script>\n");
      out.write("function lod(x) {\n");
      out.write("    \n");
      out.write("   location.href=\"Decode?id=\"+x+\"&pg=viewF\";\n");
      out.write(" // xhttp.open(\"GET\", , true);\n");
      out.write("  //xhttp.send();\n");
      out.write("}\n");
      out.write("function show() {\n");
      out.write("    var key = document.getElementById('key').value;\n");
      out.write("    var id = document.getElementById('t1').value;\n");
      out.write("        // modal.style.display = \"block\";\n");
      out.write("  var xhttp = new XMLHttpRequest();\n");
      out.write("  xhttp.onreadystatechange = function() {\n");
      out.write("    if (this.readyState == 4 && this.status == 200) {\n");
      out.write("      document.getElementById(\"modal-content\").innerHTML =\n");
      out.write("      this.responseText;\n");
      out.write("    }\n");
      out.write("  };\n");
      out.write("  xhttp.open(\"GET\", \"Images.jsp?key=\"+key+\"&id=\"+id, true);\n");
      out.write("  xhttp.send();\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            td{\n");
      out.write("               border:solid thin; \n");
      out.write("               padding:10px;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- The Modal -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("// Get the modal\n");
      out.write("var modal = document.getElementById('myModal');\n");
      out.write("\n");
      out.write("// Get the button that opens the modal\n");
      out.write("var btn = document.getElementById(\"myBtn\");\n");
      out.write("\n");
      out.write("// Get the <span> element that closes the modal\n");
      out.write("var span = document.getElementsByClassName(\"close\")[0];\n");
      out.write("\n");
      out.write("// When the user clicks the button, open the modal \n");
      out.write("//btn.onclick = function() {\n");
      out.write("  //  modal.style.display = \"block\";\n");
      out.write("//}\n");
      out.write("\n");
      out.write("// When the user clicks on <span> (x), close the modal\n");
      out.write("\n");
      out.write("\n");
      out.write("// When the user clicks anywhere outside of the modal, close it\n");
      out.write("window.onclick = function(event) {\n");
      out.write("    if (event.target == modal) {\n");
      out.write("        modal.style.display = \"none\";\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("function cl()\n");
      out.write("{\n");
      out.write("    \n");
      out.write("    var modal = document.getElementById('myModal');\n");
      out.write("        modal.style.display = \"none\";\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("<div id=\"myModal\" class=\"modal\">\n");
      out.write("\n");
      out.write("  <div class=\"modal-content\" ID=\"modal-content\">\n");
      out.write("     \n");
      out.write(" \n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("        <h3>My Files</h3>\n");
      out.write("        <div style=\"width:100%;\">\n");
      out.write("         ");

             
      
    
  connect ap=new connect();
   String aid=request.getParameter("aid");
      ap.read("select * from filedetails where fid='"+aid+"'");
      while(ap.rs.next())
      {
          String fn=ap.rs.getString("filename");
          String user=ap.rs.getString("userid");
          String us[]=user.split("@");
                  
      
      out.write("\n");
      out.write("        <div style=\"border:solid thin; width:400px;float:left;padding:5px;margin:10px;\">\n");
      out.write("            <table width=\"100%\" class=\"table\">\n");
      out.write("                <tr>\n");
      out.write("                    <td rowspan=\"2\" id=\"img");
      out.print(ap.rs.getString(1));
      out.write("\" ><img src=\"temp/");
      out.print(us[0]);
      out.write('/');
      out.print(fn);
      out.write("\" width=\"100px\" height=\"100px\">\n");
      out.write("                        <br>--Encrypted--<<button type=\"button\" class=\"btn-danger\" onclick=\"lod(");
      out.print(ap.rs.getString(1));
      out.write(")\" id=\"myBtn\" > View details </button></td>\n");
      out.write("                    <td>Uploaded Date:<br>");
      out.print(ap.rs.getString(4));
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr><td>File Name:<br>");
      out.print(ap.rs.getString(2));
      out.write("</td></tr>\n");
      out.write("               \n");
      out.write("            </table>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("        </div>\n");
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
