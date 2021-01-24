<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>
        <title>Struts2-Project</title>
    </head>
    <body>
        <h1> <s:property value="employee.name" /> User's detail</h1>

        <fieldset>
            <s:label value="Name" />
            <s:label value="Salary" />
            <s:label value="SSN" />
        </fieldset>
        <fieldset>
            <s:property value="employee.name" />
            <s:property value="employee.salary" />
            <s:property value="employee.ssn" />
        </fieldset>
    </body>
</html>