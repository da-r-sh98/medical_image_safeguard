package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UploadFiles_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <script class=\"jsbin\" src=\"js/jquery.min.js\"></script>\n");
      out.write("<script class=\"jsbin\" src=\"js/jquery-ui.min.js\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

        String doc=request.getParameter("doc");
        String id=request.getParameter("id");
        session.setAttribute("aid",id);
                session.setAttribute("doc",doc);

        
      out.write("\n");
      out.write("  <form name=\"f1\" method=\"post\" action=\"UploadIm\" enctype=\"multipart/form-data\">\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <td>choose your file</td>\n");
      out.write("                <td><input type=\"file\"  onchange=\"readURL(this);\" name=\"fl\" id=\"fl\" accept=\"image/gif, image/jpeg, image/png\" required=\"\" ></td>\n");
      out.write("            </tr>\n");
      out.write("             <tr>\n");
      out.write("                <td></td>\n");
      out.write("                <td><input type=\"submit\" value=\"upload\"></td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("        </table>\n");
      out.write("   \n");
      out.write("          \n");
      out.write("       <img id=\"blah\" src=\"#\" alt=\"your image\" width=\"100px\" border=\"1\" />\n");
      out.write("      <script>\n");
      out.write("                    function readURL(input) {\n");
      out.write("        if (input.files && input.files[0]) {\n");
      out.write("            var reader = new FileReader();\n");
      out.write("\n");
      out.write("            reader.onload = function (e) {\n");
      out.write("                $('#blah')\n");
      out.write("                    .attr('src', e.target.result)\n");
      out.write("                    .width(150)\n");
      out.write("                    .height(200);\n");
      out.write("            };\n");
      out.write("\n");
      out.write("            reader.readAsDataURL(input.files[0]);\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("                    </script>\n");
      out.write("        </form>\n");
      out.write("        ");
 if(request.getAttribute("msg")!=null)
        {
            String fn=request.getAttribute("msg").toString();
        String user=session.getAttribute("user").toString();
        String x[]=user.split("@");
        
      out.write("\n");
      out.write("        <div style=\"width:100%;border:solid thin;\">\n");
      out.write("             <div style=\"width:300px;float:left;border:solid thin;margin-left: 10px;padding:10px;overflow: auto;\">  <h4>Original</h4>\n");
      out.write("    \n");
      out.write("    <img src=\"temp/");
      out.print(fn);
      out.write("\" >\n");
      out.write("          </div>\n");
      out.write("             <div style=\"width:300px;float:left;border:solid thin;margin-left: 10px;padding:10px;overflow: auto;\">  <h4>Shuffled Image</h4>\n");
      out.write("    \n");
      out.write("    <img src=\"temp/");
      out.print(x[0]);
      out.write('c');
      out.write('_');
      out.print(fn);
      out.write("\" >\n");
      out.write("          </div>\n");
      out.write("            <div style=\"width:300px;float:left;border:solid thin;margin-left: 10px;padding:10px;overflow: auto;\"> <h4>LargerPart</h4><img src=\"temp/");
      out.print(x[0]);
      out.write('l');
      out.write('_');
      out.print(fn);
      out.write("\" ></div>\n");
      out.write("            <div style=\"width:300px;float:left;border:solid thin;margin-left: 10px;padding:10px;overflow: auto;\"> <h4>Smaller Part</h4><img src=\"temp/");
      out.print(x[0]);
      out.write('s');
      out.write('_');
      out.print(fn);
      out.write("\" ></div>\n");
      out.write("          <div style=\"width:300px;float:left;border:solid thin;margin-left: 10px;padding:10px;overflow: auto;\">  <h4>Water Marked Larger Part</h4>\n");
      out.write("    \n");
      out.write("    <img src=\"temp/");
      out.print(x[0]);
      out.write('l');
      out.write('_');
      out.print(fn);
      out.write("\" >\n");
      out.write("          </div>\n");
      out.write("             <div style=\"width:300px;float:left;border:solid thin;margin-left: 10px;padding:10px;overflow: auto;\">  <h4>Water Marked Smaller Part</h4>\n");
      out.write("    \n");
      out.write("    <img src=\"temp/");
      out.print(x[0]);
      out.write('s');
      out.write('_');
      out.print(fn);
      out.write("\" >\n");
      out.write("          </div>\n");
      out.write("              <div style=\"width:300px;float:left;border:solid thin;margin-left: 10px;padding:10px;overflow: auto;\">  <h4>Encrypted Larger Part</h4>\n");
      out.write("    \n");
      out.write("    <img src=\"temp/");
      out.print(x[0]);
      out.write("/elarge_");
      out.print(fn);
      out.write("\">\n");
      out.write("          </div>\n");
      out.write("             <div style=\"width:300px;float:left;border:solid thin;margin-left: 10px;padding:10px;overflow: auto;\">  <h4>Joined Image</h4>\n");
      out.write("    \n");
      out.write("    <img src=\"temp/");
      out.print(x[0]);
      out.write('/');
      out.print(fn);
      out.write("\">\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("       ");
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
