<html>
 <head>
 <style type="text/css">
     label.error{color: red; padding-left: 5.5em;}
 </style> 
 <style>
  body {
    background-color: lightgreen;
    }
    </style>
     
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.0/jquery.min.js"></script>
 	<script src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.14.0/jquery.validate.js"></script>
 	<title>CreateRegistration</title>
 <script>
$(function () {
	$("#myform").validate();
	$("#txt").validate();
	$("#name").validate();
	$("#sur").validate();
	$("#fname").validate();
	$("#gender").validate();
	$("#dob").validate();
	$("#qua").validate();
	$("#num").validate();
	$("#Anum").validate();
	$("#email").validate();
	$("#addrs").validate();
	$("#paddrs").validate();
	$("#join").validate();
	$("#status").validate();
	$("#emp").validate();
	$("#ref").validate();
	$("#date").validate();
	
});
$(document).ready(function(){

$('#Experience').hide();
$('#Experience1').hide();
$('#Experience2').hide();

$('#join').change(function(){
   var value = $(this).val();
   if(value == 'FRESHER'){
	     $('#Experience').hide();
	     $('#Experience1').hide();
	     $('#Experience2').hide()  
	   } 
   else if(value == 'EXPERIENCE'){
     $('#Experience').show();
     $('#Experience1').show();
     $('#Experience2').show()  
   } 
   else {
     $('#Experience').hide();
     $('#Experience1').hide();
     $('#Experience2').hide()
       }
});
});
</script>

<script>
$(document).ready(function(){   
    $("#Experience").focusout(function(){
        var f=document.getElementById("from").value;
        var t=document.getElementById("to").value;
		var d1=new Date(f);
		var d2=new Date(t);
		var difference=d2-d1;
		var months = difference/(24*3600*1000*30)
        document.getElementById("totalExperience").value=months.toFixed(1);
        
        
    });
});
</script>
     </head>
 <body>
        <g:form  Id="myform" controller="Employee" action="myservice">
  
  	<fieldset>
   <legend><h1>Registration</h1></legend><br>
    
<table>
<br>
<tr>
<tr>
<td>Id: </td> <td><input type="text" name="id" Id="txt" required="" data-msg-required="please enter id"
  			value id="id"/><br/> </td>
</tr>
<tr>
<td>Name: </td> <td><input type="text" Id="name" name="name" required="" data-msg-required="please enter name" data-rule-minlength="4" 
  			data-msg-minlength="Your name is too short."/><br/></td>
</tr>
<tr>
<td>SurName: </td> <td><input type="text" Id="sur" name="surname" required="" data-msg-required="please enter surname" data-rule-minlength="3" 
  			data-msg-minlength="Your name is too short."/><br/> </td>
</tr>
<tr>
<td>FatherName: </td> <td><input type="text" Id="fname" name="fatherName" required="" data-msg-required="please enter fathername" data-rule-minlength="3"
			  data-msg-minlength="Your name is too short."/><br/> </td>
</tr>
<tr>
<td>Gender: </td> <td><select type="text" Id="gender" name="gender" required="" data-msg-required="please select gender">                          
				<option value="">-- Select --</option>
				<option value="male">Male</option>
  				<option value="female">Female</option>
  						</select> <br/> </td>
</tr>
<tr>
<td>DateOfBirth: </td> <td><input type="date" Id="dob" name="dateOfBirth" required="" data-msg-required="please select dob"/><br/> </td>
</tr>
<tr>
<td>Qualification: </td> <td><input type="text" Id="qua" name="qualification" required="" data-msg-required="please enter qualification" data-rule-minlength="2"
			  data-msg-minlength="Your name is too short."/><br/> </td>
</tr>
<tr>
<td>MobileNumber: </td> <td><input type="text" Id="num" name="mobileNumber" required="" data-msg-required="please enter mobileNumber" data-rule-minlength="10"
			  data-msg-minlength="Your number is too short."/><br/> </td>
</tr>
<tr>
<td>AlternateMobile: </td> <td><input type="text" Id="Anum" name="alternateMobile" required="" data-msg-required="please enter alternateMobile" data-rule-minlength="3"
			  data-msg-minlength="Your number is too short."/><br/> </td>
</tr>
<tr>
<td>Email: </td> <td><input type="text" Id="email" name="email" required="" data-msg-required="please enter email" data-rule-minlength="4"
			  data-msg-minlength="Your email is not correct."/><br/> </td>
</tr>
<tr>
<td>PermanentAddress: </td> <td><input type="text" Id="addrs" name="permanentAddress" required="" data-msg-required="please enter permanentaddress" data-rule-minlength="4" 
  			data-msg-minlength="Your address is too short."/><br/></td>
</tr>
<tr>
<td>PresentAddress: </td> <td><input type="text" Id="paddrs" name="presentAddress" required="" data-msg-required="please enter presentaddress" data-rule-minlength="4"
			  data-msg-minlength="Your address is too short."/><br/></td>
</tr>
<tr>
<td>Joining: </td>
				<td><select type="text" Id="join" name="joining" required="" data-msg-required="please select joining"/> 
				<option value="">-- Select --</option>
				<option value="FRESHER">Fresher</option>
  				<option value="EXPERIENCE">Experience</option>
  						</select></td></tr>


<tr id="Experience">
						
						<td>From: </td>
						<td><input type="date" id="from" name="from"/></td>					
						<td>To: </td>						
						<td><input type="date" id="to" name="to"/></td>
</tr>

<tr id="Experience1">
						<td>Experience(in months): </td>
						<td><input type="text" id="totalExperience" name="totalExperience" value="" /><br></td>
						
</tr>						
<tr id="Experience2">

						<td>Designation: </td>
						<td><input type="text" id="designation" name="designation"/></td>
</tr>
<tr>
 <td><input type="hidden" Id="status" name="status"/></td>
</tr>
<tr>
 <td><input type="hidden" Id="emp" name="empId"/></td>
</tr>
<tr>
<td>Ref: </td> <td><input type="text" Id="ref" name="ref" required="" data-msg-required="please enter ref"/><br/></td>
</tr>
<tr>
<td>CreatedDate: </td> <td><input type="date" Id="date" name="createdDate" required="" data-msg-required="please select createdate"/><br/></td>
</tr>
</tr>
</table><br><br>
  			<input type="hidden" id="myaction" name="myaction" value="save">  			         
            <input type="Submit" Id="btnsave" value="Create" style="font-size:15px"/>
                     
            </fieldset>
</g:form>
            
 </body>
</html>

