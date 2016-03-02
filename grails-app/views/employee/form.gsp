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
    padding: 8px;
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
      <th>FatherName</th>
      <th>Gender</th>
      <th>DateOfBirth</th>
      <th>Qualification</th>
      <th>MobileNumber</th>
      <th>AlternateMobile</th>
      <th>Email</th>
      <th>PermanentAddress</th>
      <th>PresentAddress</th>
      <th>Joining</th>
      <th>Experience</th>
      <th>Designation</th>
      <th>Status</th>
      <th>EmpId</th>
      <th>Ref</th>
      <th>CreatedDate</th>
      </tr>
      </thead>
      <g:findAll in="${employee}" expr="true" >
     <tbody>
      <tr>
      <td>${it.id}</td>
      <td>${it.name}</td>
      <td>${it.surname}</td>
      <td>${it.fatherName}</td>
      <td>${it.gender}</td>
      <td>${it.dateOfBirth}</td>
      <td>${it.qualification}</td>
      <td>${it.mobileNumber}</td>
      <td>${it.alternateMobile}</td>
      <td>${it.email}</td>
      <td>${it.permanentAddress}</td>
      <td>${it.presentAddress}</td>
      <td>${it.joining}</td>
      <td>${it.experience}</td>
      <td>${it.designation}</td>
      <td>${it.status}</td>
      <td>${it.empId}</td>
      <td>${it.ref}</td>
      <td>${it.createdDate}</td>
      </tr>
      </tbody>
         
      </g:findAll>
      </table>
       
</body>
</html>

