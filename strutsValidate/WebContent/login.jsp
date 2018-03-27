<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<html>
<head>
<title>Struts Client Side Validation - Login Page</title>
</head>
<body>
 
    <html:form action="/login" >
        <table>
     
            <tr>
                <td>
                    User Name :
                </td>
                <td>
                    <html:text  property="userName"/>
                       <html:errors property="userName"/>
                  
                </td>
            </tr>
                   <tr>
                <td>
                   Email :
                </td>
                <td>
                    <html:text  property="guestEmail"/>
                       <html:errors property="guestEmail"/>
                  
                </td>
            </tr> 
            
            <tr>
                <td>
                    Password  :
                </td>
                <td>
                     <html:password  property="password" />
                       <html:errors property="password"/>      
                </td>
            </tr>
            <tr>
                <td></td>
                <td>
                   <html:submit value="Login" />
                </td>
            </tr>
        </table> 
   
    </html:form>
    
</body>
</html>