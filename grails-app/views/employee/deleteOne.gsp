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
 	<title>DeleteEmployee</title>
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

$('#Fresher').hide();
$('#Experience').hide();

$('#join').change(function(){
   var value = $(this).val();
   if(value == 'FRESHER'){
	     $('#Fresher').hide();
	     $('#Experience').hide();  
	   } 
   else if(value == 'EXPERIENCE'){
     $('#Fresher').hide();
     $('#Experience').show();  
   } 
   else {
     $('#Fresher').hide();
     $('#Experience').hide();
       }
});
});
</script>
<script>
function myFunction() {
var oneDay = 24*60*60*1000;
var from = getParameterByName("from");
var to = getParameterByName("to");
var diff = Math.abs((from - to)/(oneDay));
if(!isNaN(total)){
document.getElementId("total").value = diff;
}
}
</script>
<script>
$(document).ready(function(){
    $("div").focusin(function(){
        $(this).css("background-color", "lightgrey");
    });
    $("div").focusout(function(){
        $(this).css("background-color", "lightgreen");
    });
});
</script>
     </head>
 <body>
        <g:form  Id="myform" controller="Employee" action="delete">
  
  	<fieldset>
   <legend><h1>DeleteRegistration</h1></legend><br>
    
<table>
<br>
<tr>
<tr>
<td>Id: </td> <td><input type="text" name="id" Id="txt" required="" data-msg-required="please enter id"
  			value id="id"/><br/> </td>
</tr>
</table><br><br>
  			  			         
            <input type="Submit" Id="btnsave" value="delete" style="font-size:15px"/>
                     
            </fieldset>
</g:form>
            
 </body>
</html>
