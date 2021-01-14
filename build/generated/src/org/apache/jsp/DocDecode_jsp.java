package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import doctorsearch.connect;

public final class DocDecode_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("/* The Modal (background) */\n");
      out.write(".modal {\n");
      out.write("    display: none; /* Hidden by default */\n");
      out.write("    position: fixed; /* Stay in place */\n");
      out.write("    z-index: 1; /* Sit on top */\n");
      out.write("    padding-top: 100px; /* Location of the box */\n");
      out.write("    left: 0;\n");
      out.write("    top: 0;\n");
      out.write("    width: 100%; /* Full width */\n");
      out.write("    /* Full height */\n");
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
      out.write("function lod(fn) {\n");
      out.write("  \n");
      out.write("     var im = document.getElementById('ii').value;\n");
      out.write("     \n");
      out.write("    var modal = document.getElementById('myModal');\n");
      out.write("     modal.style.display = \"block\";\n");
      out.write("  var xhttp = new XMLHttpRequest();\n");
      out.write("  xhttp.onreadystatechange = function() {\n");
      out.write("    if (this.readyState == 4 && this.status == 200) {\n");
      out.write("      document.getElementById(\"modal-content\").innerHTML =\n");
      out.write("      this.responseText;\n");
      out.write("    }\n");
      out.write("  };\n");
      out.write("  xhttp.open(\"GET\", \"LargeFileView.jsp?im=\"+im+\"&ima=\"+fn, true);\n");
      out.write("  xhttp.send();\n");
      out.write("}\n");
      out.write("function show() {\n");
      out.write("    var key = document.getElementById('key').value;\n");
      out.write("    var im = document.getElementById('t1').value;\n");
      out.write("   \n");
      out.write("        // modal.style.display = \"block\";\n");
      out.write("location.href=\"dochome.jsp?pg=de&key=\"+key+\"&im=\"+im;\n");
      out.write(" \n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      <script>\n");
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
      out.write("</div>\n");
      out.write("    <h1>Welcome</h1>\n");
      out.write("        ");
 
            String un="",fn="",id, lg="";
           // 
           
        if(session.getAttribute("sma")!=null)
        {
       
         out.println("<h3> Data On small File:"+session.getAttribute("sma")+"</h3>");
      un=session.getAttribute("un")+"";
      //out.println(un);
          fn=session.getAttribute("fn")+"";
       //   out.println(fn);
          un=session.getAttribute("un")+"";
    // out.println(un);
          id=session.getAttribute("id")+"";
          lg=session.getAttribute("lar")+""; 
        }
        
        
        
      out.write("\n");
      out.write("       \n");
      out.write("        <form>\n");
      out.write("        <div style=\"width:100%;border:solid thin;\">\n");
      out.write("             <div style=\"width:300px;float:left;border:solid thin;margin-left: 10px;padding:10px;overflow: auto;\">  <h4>Received</h4>\n");
      out.write("    \n");
      out.write("                 <img src=\"temp/");
      out.print(un);
      out.write('/');
      out.print(fn);
      out.write("\" width=\"100%\" >\n");
      out.write("          </div>\n");
      out.write("             <div style=\"width:300px;float:left;border:solid thin;margin-left: 10px;padding:10px;overflow: auto;\">After Spliting Larger Part <h4></h4>\n");
      out.write("                 <input type=\"hidden\" name=\"ii\" id=\"ii\" value=\"");
      out.print(lg);
      out.write("\">\n");
      out.write("                 \n");
      out.write("                 <img src=\"");
      out.print(lg);
      out.write("\" width=\"100%\">\n");
      out.write("    <button onclick=\"lod()\" type=\"button\">Decrypt and View</button>\n");
      out.write("          </div>\n");
      out.write("           <div style=\"width:300px;float:left;border:solid thin;margin-left: 10px;padding:10px;overflow: auto;\">After Spliting Smallert Part <h4></h4>\n");
      out.write("    \n");
      out.write("    <img src=\"Cloud/");
      out.print(un);
      out.write("/sm.png\" height=\"300px\">\n");
      out.write("          </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("             \n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("       \n");
      out.write("                \n");
      out.write("             </form> \n");
      out.write("          \n");
      out.write("          <form name=\"doctr\" action=\"doctr\" method=\"POST\">\n");
      out.write("                 \n");
      out.write("          PT ID<input type=\"text\" name=\"ptid\" value=\"\" />\n");
      out.write("                    Description<input type=\"text\" name=\"desc\" value=\"\" />\n");
      out.write("                    <input type=\"submit\" value=\"submit\" name=\"rslt\" />\n");
      out.write("           ");

                            String first_name=request.getParameter("ptid");
String last_name=request.getParameter("desc");
               connect cc=new connect();
               cc.save("INSERT INTO 'result'('pt_id' , 'description')" + " VALUES ('first_name' ,'last_name') ");    
             
              

            
      out.write("\n");
      out.write("               \n");
      out.write("          </form>\n");
      out.write("       \n");
      out.write("</body>\n");
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
