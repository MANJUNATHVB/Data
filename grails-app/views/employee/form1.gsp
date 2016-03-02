<html>
<head>
<title></title>
<style>
body{
background-color:lightgreen;
}
table, th, td {
    border: 1px solid black;
    border-collapse: collapse;
}
th, td {
    padding: 10px;
}
table#t01 {
    width: 75%;    
    background-color: #f1f1c1;
    }
    tr {
    background-color: #f2f2c2;
    }
    th {
    background-color: #4CAF50;
    color: white;
}
</style>
</head>
<body>


      <table align="center">
      <thead>
      <tr>
      <th>Id</th>
      <th>Name</th>
      <th>SurName</th>     
      <th>MobileNumber</th>      
      <th>Email</th>     
      </tr>
      </thead>
      <g:findAll in="${employee}" expr="true" >
     <tbody>
      <tr>     
      <td>${it.id}</td>
      <td><g:link  controller="Employee" action="updateOne">${it.name}</g:link></td>
      <td>${it.surname}</td>     
      <td>${it.mobileNumber}</td>     
      <td>${it.email}</td>     
      </tr>
      </tbody>
         
      </g:findAll>
      </table>
       
</body>
</html>

