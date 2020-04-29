<!DOCTYPE html>
<html lang="en" xmlns="http://www.w3.org/1999/html">
<head>
    <meta charset="UTF-8">
    <title>springboot+mybatis+freemarker</title>
</head>
<body>
     <#--循环显示-->
    <#list users as one>
        ${one.username!}--->>${one.password!}</br>
    </#list>
     <hr>
    <#--map-->
     <#list map?keys as key>
         key：${key} ->value: ${map[key]}</br>
     </#list>

</body>
</html>