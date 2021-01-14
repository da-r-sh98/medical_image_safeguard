package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import doctorsearch.connect;
import doctorsearch.connect;
import java.util.Date;
import java.text.*;
import doctorsearch.connect;
import doctorsearch.connect;
import doctorsearch.connect;

public final class pathome_jsp extends org.apache.jasper.runtime.HttpJspBase
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

  static {
    _jspx_dependants = new java.util.ArrayList<String>(7);
    _jspx_dependants.add("/mycon.jsp");
    _jspx_dependants.add("/DoctorDetails.jsp");
    _jspx_dependants.add("/UploadFiles.jsp");
    _jspx_dependants.add("/View Appointments.jsp");
    _jspx_dependants.add("/My Results.jsp");
    _jspx_dependants.add("/changepass.jsp");
    _jspx_dependants.add("/SearchDoctors.jsp");
  }

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
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("       <title>BCORE Admin Dashboard Template | Buttons</title>\n");
      out.write("     <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\" />\n");
      out.write("\t<meta content=\"\" name=\"description\" />\n");
      out.write("\t<meta content=\"\" name=\"author\" />\n");
      out.write("     <!--[if IE]>\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n");
      out.write("        <![endif]-->\n");
      out.write("    <!-- GLOBAL STYLES -->\n");
      out.write("    <!-- GLOBAL STYLES -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/plugins/bootstrap/css/bootstrap.css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/main.css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/theme.css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/MoneAdmin.css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/plugins/Font-Awesome/css/font-awesome.css\" />\n");
      out.write("    <!--END GLOBAL STYLES -->\n");
      out.write("\n");
      out.write("    <!-- PAGE LEVEL STYLES -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/plugins/social-buttons/social-buttons.css\" />\n");
      out.write("    <!-- END PAGE LEVEL  STYLES -->\n");
      out.write("       <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("    <div id=\"wrap\">\n");
      out.write("\n");
      out.write("          <!-- HEADER SECTION -->\n");
      out.write("        <div id=\"top\">\n");
      out.write("\n");
      out.write("            <nav class=\"navbar navbar-inverse navbar-fixed-top \" style=\"padding-top: 10px;\">\n");
      out.write("                <a data-original-title=\"Show/Hide Menu\" data-placement=\"bottom\" data-tooltip=\"tooltip\" class=\"accordion-toggle btn btn-primary btn-sm visible-xs\" data-toggle=\"collapse\" href=\"#menu\" id=\"menu-toggle\">\n");
      out.write("                    <i class=\"icon-align-justify\"></i>\n");
      out.write("                </a>\n");
      out.write("                <!-- LOGO SECTION -->\n");
      out.write("                <header class=\"navbar-header\">\n");
      out.write("\n");
      out.write("                    <a href=\"index.jsp\" class=\"navbar-brand\">\n");
      out.write("                    <img src=\"assets/img/logo.png\" alt=\"\" /></a>\n");
      out.write("                </header>\n");
      out.write("                <!-- END LOGO SECTION -->\n");
      out.write("               <ul class=\"nav navbar-top-links navbar-right\">\n");
      out.write("\n");
      out.write("                    <!-- MESSAGES SECTION -->\n");
      out.write("                    <ul class=\"nav navbar-top-links navbar-right\">\n");
      out.write("\n");
      out.write("                    <!-- MESSAGES SECTION -->\n");
      out.write("                    <li class=\"dropdown\">\n");
      out.write("                        <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\n");
      out.write("                            <span class=\"label label-success\"><label ID=\"Label2\" runat=\"server\" Text=\"0\"></label></span>    <i class=\"icon-envelope-alt\"></i>&nbsp; <i class=\"icon-chevron-down\"></i>\n");
      out.write("                        </a>\n");
      out.write("\n");
      out.write("\n");
      out.write("                       <div>\n");
      out.write("          \n");
      out.write("            \n");
      out.write("                           <ItemTemplate><div >\n");
      out.write("               <ul class=\"dropdown-menu dropdown-messages\">\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <div>\n");
      out.write("                                        <strong style=\"color: red\">");
//# Eval("Name") 
      out.write("</strong>\n");
      out.write("                                        <span class=\"pull-right text-muted\">\n");
      out.write("                                            <em>Today</em>\n");
      out.write("                                        </span>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div>");
//# Eval("message") 
      out.write("\n");
      out.write("                                        <br />\n");
      out.write("                                        <hr />\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"divider\"></li>\n");
      out.write("                            \n");
      out.write("                           \n");
      out.write("                            <li class=\"divider\"></li>\n");
      out.write("                            <li>\n");
      out.write("                                <a class=\"text-center\" href=\"\">\n");
      out.write("                                    <strong>Read All Messages</strong>\n");
      out.write("                                    <i class=\"icon-angle-right\"></i>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                \n");
      out.write("           \n");
      out.write("                               </div>\n");
      out.write("           </ItemTemplate>\n");
      out.write("            <LayoutTemplate>\n");
      out.write("              \n");
      out.write("                    <span runat=\"server\" id=\"itemPlaceholder\" />\n");
      out.write("                \n");
      out.write("               \n");
      out.write("            </LayoutTemplate>\n");
      out.write("           \n");
      out.write("        </div>\n");
      out.write("     \n");
      out.write("\n");
      out.write("\n");
      out.write("                    </li>\n");
      out.write("                    <!--END MESSAGES SECTION -->\n");
      out.write("\n");
      out.write("                    \n");
      out.write("                   \n");
      out.write("                    <!--ADMIN SETTINGS SECTIONS -->\n");
      out.write("\n");
      out.write("                    <li class=\"dropdown\">\n");
      out.write("                        <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\n");
      out.write("                            <i class=\"icon-user \"></i>&nbsp; <i class=\"icon-chevron-down \"></i>\n");
      out.write("                        </a>\n");
      out.write("\n");
      out.write("                        <ul class=\"dropdown-menu dropdown-user\">\n");
      out.write("                            \n");
      out.write("                            <li><a href=\"pathome.jsp?pg=mya\"><i class=\"icon-user\"></i> Upload Files </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"divider\"></li>\n");
      out.write("                            <li><a href=\"index.jsp?pg=lg\"><i class=\"icon-signout\"></i> Logout </a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("                    </li>\n");
      out.write("                    <!--END ADMIN SETTINGS -->\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- END HEADER SECTION -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- MENU SECTION -->\n");
      out.write("        <div id=\"left\" style=\"margin-top: 50px;\">\n");
      out.write("            <div class=\"media user-media well-small\">\n");
      out.write("                ");

                connect hm=new connect();
                hm.read("select * from patientdetails where uname='"+session.getAttribute("user").toString()+"'");
                if(hm.rs.next())
                {
                
      out.write("\n");
      out.write("             <a class=\"user-link\" href=\"#\">\n");
      out.write("                 <img  ID=\"im\" class=\"media-object img-thumbnail user-img\" alt=\"User Picture\" width=\"100px\" height=\"100%\" src=\"img/u.jpg\"/>\n");
      out.write("                </a>\n");
      out.write("                <br />\n");
      out.write("                <div class=\"media-body\">\n");
      out.write("                    <h5 class=\"media-heading\">\n");
      out.write("                        ");
      out.print(hm.rs.getString(2));
      out.write("\n");
      out.write("                        </h5>\n");
      out.write("                    <ul class=\"list-unstyled user-info\">\n");
      out.write("                        \n");
      out.write("                        <li>\n");
      out.write("                             <a class=\"btn btn-success btn-xs btn-circle\" style=\"width: 10px;height: 12px;\"></a> Online\n");
      out.write("                           \n");
      out.write("                        </li>\n");
      out.write("                       \n");
      out.write("                    </ul>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <br />\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <ul id=\"menu\" class=\"collapse\">\n");
      out.write("\n");
      out.write("                \n");
      out.write("                <li class=\"panel\">\n");
      out.write("                    <a href=\"index.jsp\" >\n");
      out.write("                        <i class=\"icon-table\"></i> Dash Board\n");
      out.write("\t   \n");
      out.write("                       \n");
      out.write("                    </a>                   \n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("            \n");
      out.write("                <li class=\"panel active\">\n");
      out.write("                    <a href=\"#\" data-parent=\"#menu\" data-toggle=\"collapse\" class=\"accordion-toggle\" data-target=\"#component-nav\">\n");
      out.write("                        <i class=\"icon-tasks\"> </i> Tools    \n");
      out.write("\t   \n");
      out.write("                        <span class=\"pull-right\">\n");
      out.write("                          <i class=\"icon-angle-left\"></i>\n");
      out.write("                        </span>\n");
      out.write("                       &nbsp; <span class=\"label label-default\"></span>&nbsp;\n");
      out.write("                    </a>\n");
      out.write("                    <ul class=\"in\" id=\"component-nav\">\n");
      out.write("                         <li class=\"\"><a href=\"pathome.jsp\"><i class=\"icon-angle-right\"></i>Home</a></li>\n");
      out.write("                    \n");
      out.write("                        <li class=\"\"><a href=\"pathome.jsp?pg=mya\"><i class=\"icon-angle-right\"></i>My Appointments</a></li>\n");
      out.write("                        \n");
      out.write("                        <li class=\"\"><a href=\"pathome.jsp?pg=ch\"><i class=\"icon-angle-right\"></i>My Results</a></li>\n");
      out.write("             \n");
      out.write("                       \n");
      out.write("                         <li class=\"\"><a href=\"pathome.jsp?pg=ah\"><i class=\"icon-angle-right\"></i>change password</a></li>\n");
      out.write("                              \n");
      out.write("                           </ul>\n");
      out.write("                </li>   \n");
      out.write("               \n");
      out.write("\n");
      out.write("                \n");
      out.write("               \n");
      out.write("          \n");
      out.write("                \n");
      out.write("\n");
      out.write("\n");
      out.write("                \n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!--END MENU SECTION -->\n");
      out.write("\n");
      out.write("        <!--PAGE CONTENT -->\n");
      out.write("        <div id=\"content\" style=\"margin-top: 60px;\">\n");
      out.write("           \n");
      out.write("                <div class=\"inner\">\n");
      out.write("                    \n");
      out.write("             \n");
      out.write("               \n");
      out.write("                       <div class=\"row\">\n");
      out.write("        <div class=\"col-lg-12\">\n");
      out.write("            <div class=\"box primary\">\n");
      out.write("                <header>\n");
      out.write("                    <div class=\"icons\"><i class=\"icon-building\"></i></div>\n");
      out.write("                    <h5>Details</h5>\n");
      out.write("                    <div class=\"toolbar\">\n");
      out.write("\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                </header>\n");
      out.write("                <div class=\"body collapse in\" id=\"div1\">\n");
      out.write("                  ");

               
                 String pg="";
                if(request.getParameter("pg")!=null)
                  {
                  pg=request.getParameter("pg");
                  
                  if(pg.equals("mycon"))
                  {
                  
      out.write("\n");
      out.write("                  ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script>\n");
      out.write("            function chk(v)\n");
      out.write("            {\n");
      out.write("             if(isNaN(v.t5.value))\n");
      out.write("             {\n");
      out.write("                 alert(\"must enter number\");\n");
      out.write("                 v.t5.value=\"\";\n");
      out.write("                 v.t5.focus();\n");
      out.write("                 return false;\n");
      out.write("             }\n");
      out.write("             return true;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("              ");
      out.write("\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form  method=\"post\" action=\"mycon\" onsubmit=\"return chk(this);\">\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("            <td>day</td>\n");
      out.write("            <td><select name=\"t2\">\n");
      out.write("                    <option value=\"1\">sun</option>\n");
      out.write("                    <option value=\"2\">mon</option>\n");
      out.write("                    <option value=\"3\">thu</option>\n");
      out.write("                    <option value=\"4\">wed</option>\n");
      out.write("                    <option value=\"5\">thes</option>\n");
      out.write("                    <option value=\"6\">fri</option>\n");
      out.write("                    <option value=\"7\">sat</option>\n");
      out.write("                </select></td></tr>\n");
      out.write("             <tr>\n");
      out.write("           \n");
      out.write("              <tr>\n");
      out.write("            <td>time from</td>\n");
      out.write("            <td><input type=\"text\" name=\"t3\" required=\"\"/></td></tr>\n");
      out.write("               <tr>\n");
      out.write("            <td>time to</td>\n");
      out.write("            <td><input type=\"text\" name=\"t4\" required=\"\"/></td></tr>\n");
      out.write("                <tr>\n");
      out.write("            <td>no of booking</td>\n");
      out.write("            <td><input type=\"text\" name=\"t5\" required=\"\" maxlength=\"4\"/></td></tr>\n");
      out.write("                 <tr>\n");
      out.write("            <td></td>\n");
      out.write("            <td><input type=\"submit\" name=\"se\" value=\"save\" /></td></tr>\n");
      out.write("        </table></form>\n");
      out.write("        <hr />\n");
      out.write("        <table border=\"1\" class=\"table\">\n");
      out.write("         \n");
      out.write("            <tr>\n");
      out.write("                <td >day</td>\n");
      out.write("            \n");
      out.write("                  <td>From</td>\n");
      out.write("                   <td>To</td>\n");
      out.write("                   <td >no of booking per day</td>\n");
      out.write("                     <td ></td>\n");
      out.write("                    \n");
      out.write("            </tr>\n");
      out.write("            ");

            connect co= new connect();
            co.read("select * from consultingtime where doc='"+session.getAttribute("user")+"'");
            while(co.rs.next())
            {
            
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
      out.write("                   <td><a href=\"del1.jsp?id=");
      out.print(co.rs.getString(1));
      out.write("\"><button>remove</button></a>\n");
      out.write("                   </td>\n");
      out.write("                      \n");
      out.write("            </tr>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("                \n");
      out.write("        </table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("                    ");

                  } 
                   if(pg.equals("dcv"))
                  {
                  
      out.write("\n");
      out.write("                  ");
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
      out.write("    <style>\n");
      out.write("/* The Modal (background) */\n");
      out.write(".modal {\n");
      out.write("    display: none; /* Hidden by default */\n");
      out.write("    position: fixed; /* Stay in place */\n");
      out.write("    z-index: 1; /* Sit on top */\n");
      out.write("    padding-top: 100px; /* Location of the box */\n");
      out.write("    left: 0;\n");
      out.write("    top: 0;\n");
      out.write("    width: 100%; /* Full width */\n");
      out.write("    height:auto; /* Full height */\n");
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
      out.write("    color:red;\n");
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
      out.write("    function lodd(x) {\n");
      out.write("       \n");
      out.write("    var modal = document.getElementById('myModal');  \n");
      out.write("    var dt = document.getElementById(x).value;\n");
      out.write("    // alert(dt);\n");
      out.write("     modal.style.display = \"block\";\n");
      out.write("  var xhttp = new XMLHttpRequest();\n");
      out.write("  xhttp.onreadystatechange = function() {\n");
      out.write("    if (this.readyState == 4 && this.status == 200) {\n");
      out.write("      document.getElementById(\"modal-content\").innerHTML =\n");
      out.write("      this.responseText;\n");
      out.write("    }\n");
      out.write("  };\n");
      out.write("  xhttp.open(\"GET\", \"ViewConsulting Time.jsp?m=\"+x+\"&dt=\"+dt, true);\n");
      out.write("  xhttp.send();\n");
      out.write("}\n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("    <script>\n");
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
      out.write("    <body>\n");
      out.write("   \n");
      out.write("<div id=\"myModal\" class=\"modal\">\n");
      out.write("\n");
      out.write("  <div class=\"modal-content\" ID=\"modal-content\">\n");
      out.write("     \n");
      out.write(" \n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<form>\n");
      out.write("      ");

           Date date = new Date();
String dty= new SimpleDateFormat("yyyy-MM-dd").format(date);
     connect cc1= new connect();
     String cat=request.getParameter("t1");
    connect.cid=cat;
    
     String subcate=request.getParameter("t2");
     connect.sid=subcate;
     String sp=request.getParameter("t3");
     connect.sp=sp;
     String dt=request.getParameter("dt");
     
     String lo=request.getParameter("t4");connect.loc=lo;
     String q="select * from docreg  where status<>'waiting'";
     if(!cat.equals("0"))
         q=q+" and cid='"+cat+"'";
     
      if(!subcate.equals("0"))
         q=q+" and sub_id='"+subcate+"'";
        if(!sp.equals("0"))
         q=q+" and spce='"+sp+"'";
           if(!lo.equals("0"))
         q=q +" and loc='"+lo+"'";
         //  out.print(q);
     cc1.read(q);
           while(cc1.rs.next())
           {
      
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-6\">\n");
      out.write("                            <div class=\"panel panel-default\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                            \n");
      out.write("                         Dr. ");
      out.print(cc1.rs.getString(2));
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                       \n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                           <img src=\"photo/");
      out.print(cc1.rs.getString("pho"));
      out.write("\" width=\"200px\" height=\"200px\" border=\"1\" style=\"float:left;margin-right:10px;\" />\n");
      out.write("             \n");
      out.write("           <p> qualification:");
      out.print(cc1.rs.getString("qual"));
      out.write("\n");
      out.write("            </p>\n");
      out.write("                <p>\n");
      out.write("            specialization:\n");
      out.write("          ");
      out.print(cc1.rs.getString("spce"));
      out.write("\n");
      out.write("          </p>\n");
      out.write("            <p>  Hospitalname:\n");
      out.write("             ");
      out.print(cc1.rs.getString("hopnm"));
      out.write("\n");
      out.write("              </p>\n");
      out.write("            <p> Experiance:\n");
      out.write("              ");
      out.print(cc1.rs.getString("exp"));
      out.write("\n");
      out.write("        </p><p>\n");
      out.write("            ContactNo: ");
      out.print(cc1.rs.getString("cno"));
      out.write("\n");
      out.write("            \n");
      out.write("        </p>  \n");
      out.write("           \n");
      out.write("        <p class=\"no-bottom-margin\">Choose Date </p>\n");
      out.write("     \n");
      out.write("        <input type=\"date\" name=\"dt\" id=\"");
      out.print(cc1.rs.getString("mail"));
      out.write("\" min=\"");
      out.print(dty);
      out.write("\"/>\n");
      out.write("                      \n");
      out.write("    \n");
      out.write("<button type=\"button\"  class=\"btn btn-danger \" onclick=\"lodd('");
      out.print(cc1.rs.getString("mail"));
      out.write("')\"><i class=\"icon-heart\">Take Appointment</i>\n");
      out.write("                            </button>\n");
      out.write("                           \n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("              \n");
      out.write("               \n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("           \n");
}
      out.write('\n');

if(request.getAttribute("msg")!=null)
{
out.print("<script>alert('"+request.getAttribute("msg")+"');</script>");
}

      out.write("\n");
      out.write("</form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("                    ");

                  }
                  
                   if(pg.equals("up"))
                  {
                  
      out.write("\n");
      out.write("                  ");
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
      out.write("\n");
      out.write("                    ");

                  }
                  if(pg.equals("mya"))
                  {
                  
      out.write("\n");
      out.write("                  ");
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
      out.write("        <h1>My Appointments</h1>\n");
      out.write("        <table class=\"table\" width=\"100%\" border=\"1\">\n");
      out.write("            <tr>\n");
      out.write("                <td>Doctor</td>\n");
      out.write("             \n");
      out.write("                <td>Date</td>\n");
      out.write("                \n");
      out.write("              \n");
      out.write("              \n");
      out.write("                <td></td>\n");
      out.write("            </tr>\n");
      out.write("           ");

           connect cc= new connect();
           cc.read("select * from appintment inner join docreg on docreg.mail=appintment.doc where appintment.status<>'waiting' and uname='"+session.getAttribute("user")+"'");
           while(cc.rs.next())
           {
           
      out.write("\n");
      out.write("             <tr>\n");
      out.write("                 <td><img src=\"photo/");
      out.print(cc.rs.getString("pho"));
      out.write("\" width=\"50px\">");
      out.print(cc.rs.getString("name"));
      out.write("</td>\n");
      out.write("               \n");
      out.write("                \n");
      out.write("                 \n");
      out.write("                <td>");
      out.print(cc.rs.getString(4));
      out.write("</td>\n");
      out.write("               \n");
      out.write("               \n");
      out.write("                <td><a href=\"pathome.jsp?pg=up&id=");
      out.print(cc.rs.getString(1));
      out.write("&doc=");
      out.print(cc.rs.getString(2));
      out.write("\"><button>Upload Files</button></a></td>\n");
      out.write("            </tr>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("                    ");

                  }
                  if(pg.equals("ch"))
                  {
                  
      out.write("\n");
      out.write("                   ");
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
      out.write("        <h1>Hello World!</h1>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("                    ");

                  }
                  if(pg.equals("ah"))
                  {
                  
      out.write("\n");
      out.write("                  \n");
      out.write("                  ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script> function chh(v)\n");
      out.write("            {\n");
      out.write("                if(v.p2.value!=v.p3.value)\n");
      out.write("                {\n");
      out.write("                    alert(\"password missmatch \");\n");
      out.write("                    v.p2.value=\"\";\n");
      out.write("                     v.p3.value=\"\";\n");
      out.write("                      v.p2.focus();\n");
      out.write("                      return false;\n");
      out.write("                }\n");
      out.write("                return true;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form  method=\"post\" action=\"cpas\" onsubmit=\"return chh(this); \">\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <td>current password</td>\n");
      out.write("                <td><input type=\"password\"  name=\"p1\" required=\"\" /></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>new password</td>\n");
      out.write("                <td><input type=\"password\"  name=\"p2\" required=\"\"/></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>retry password</td>\n");
      out.write("                <td><input type=\"password\"  name=\"p3\" required=\"\"/></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td></td>\n");
      out.write("                <td><input type=\"submit\"  name=\"b\" value=\"change\"/></td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("                    ");

                  }
                 
                  }
                  else
                  {
                   
      out.write("\n");
      out.write("                   ");
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
      out.write("             \n");
      out.write("         function get(x)\n");
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
      out.write("                xhttp.open(\"post\",\"getSubcate.jsp?id=\"+str,true);\n");
      out.write("                xhttp.send();\n");
      out.write("            }\n");
      out.write("            </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Search Doctor Here</h1>\n");
      out.write("        <form action=\"pathome.jsp?pg=dcv\" method=\"post\">\n");
      out.write("          \n");
      out.write("      <div class=\"padding-top-8\">\n");
      out.write("        <p class=\"no-bottom-margin\">Category</p>\n");
      out.write("        <div class=\"padding-top-8\">\n");
      out.write("            <Select name=\"t1\" onchange=\"get(this);\" class=\"form-control\">\n");
      out.write("                <option value=\"0\">Any</option>\n");
      out.write("                        ");

                        connect c01=new connect();
                        c01.read("select * from cate");
                        while(c01.rs.next())
                        {
                            
      out.write("\n");
      out.write("                            <option value=\"");
      out.print(c01.rs.getString(1));
      out.write('"');
      out.write('>');
      out.print(c01.rs.getString(2));
      out.write("</option>\n");
      out.write("                         ");

                         }
                         
      out.write("\n");
      out.write("                               </Select>\n");
      out.write("                      \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("     <div class=\"padding-top-8\">\n");
      out.write("        <p class=\"no-bottom-margin\">Subcatogary</p>\n");
      out.write("        <div class=\"padding-top-8\" id=\"sub\">\n");
      out.write("           \n");
      out.write("            <Select name=\"t2\" class=\"form-control\">\n");
      out.write("                              <option value=\"0\">Any</option>\n");
      out.write("                              <option></option>\n");
      out.write("                               </Select>\n");
      out.write("              \n");
      out.write("        </div>\n");
      out.write("     </div>\n");
      out.write("                                   <div class=\"padding-top-8\">\n");
      out.write("        <p class=\"no-bottom-margin\">Specialization</p>\n");
      out.write("        <div class=\"padding-top-8\">\n");
      out.write("            <Select name=\"t3\" onchange=\"get(this);\" class=\"form-control\">\n");
      out.write("                              <option value=\"0\">Any</option>\n");
      out.write("                        ");

                      
                        c01.read("select distinct spce from docreg");
                        while(c01.rs.next())
                        {
                            
      out.write("\n");
      out.write("                            <option value=\"");
      out.print(c01.rs.getString(1));
      out.write('"');
      out.write('>');
      out.print(c01.rs.getString(1));
      out.write("</option>\n");
      out.write("                         ");

                         }
                         
      out.write("\n");
      out.write("                               </Select>\n");
      out.write("                      \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("                                <div class=\"padding-top-8\">\n");
      out.write("        <p class=\"no-bottom-margin\">Location</p>\n");
      out.write("        <div class=\"padding-top-8\">\n");
      out.write("            <Select name=\"t4\" onchange=\"get(this);\" class=\"form-control\">\n");
      out.write("                              <option value=\"0\">Any</option>\n");
      out.write("                        ");

                      
                        c01.read("select distinct loc from docreg");
                        while(c01.rs.next())
                        {
                            
      out.write("\n");
      out.write("                            <option value=\"");
      out.print(c01.rs.getString(1));
      out.write('"');
      out.write('>');
      out.print(c01.rs.getString(1));
      out.write("</option>\n");
      out.write("                         ");

                         }
                         
      out.write("\n");
      out.write("                               </Select>\n");
      out.write("                      \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("       <div style=\"clear:both;\"></div>\n");
      out.write("       <br>\n");
      out.write("   <div>\n");
      out.write("      <div class=\"padding-top-20\">\n");
      out.write("          <input type=\"submit\" value=\"submit\" class=\" btn btn-danger\" >\n");
      out.write("      </div>\n");
      out.write("   </div>\n");
      out.write("   \n");
      out.write("        </form></body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("                    ");

                  }
                  
                  
      out.write("\n");
      out.write("                    \n");
      out.write("                 \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("              \n");
      out.write("\n");
      out.write("\n");
      out.write("      \n");
      out.write("       \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("  </div>\n");
      out.write("               \n");
      out.write("                        </div>\n");
      out.write("                                       \n");
      out.write("                   \n");
      out.write("                     \n");
      out.write("\n");
      out.write("                    \n");
      out.write("                    </div>              \n");
      out.write("             <!--END PAGE CONTENT -->            \n");
      out.write("                 </div>    \n");
      out.write("    <!--END MAIN WRAPPER -->\n");
      out.write("   <!-- FOOTER -->\n");
      out.write("    <div id=\"footer\">\n");
      out.write("        <p>&copy;  binarytheme &nbsp;2014 &nbsp;</p>\n");
      out.write("    </div>\n");
      out.write("    <!--END FOOTER -->\n");
      out.write("     <!-- GLOBAL SCRIPTS -->\n");
      out.write("    <script src=\"assets/plugins/jquery-2.0.3.min.js\"></script>\n");
      out.write("     <script src=\"assets/plugins/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"assets/plugins/modernizr-2.6.2-respond-1.1.0.min.js\"></script>\n");
      out.write("    <div>\n");
      out.write("\n");
      out.write("    </div>\n");
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
