<!DOCTYPE html>
<html>
<body>

<!--Adding Bootstrap to the page--------------------- -->
<script src="js/jquery-1.11.1.min.js"></script>
<script src="bootStrap/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="bootStrap/css/bootstrap.min.css"/>
<link rel="stylesheet" href="bootStrap/css/bootstrap-theme.min.css"/>
<!-- ------------------------------------------------ -->

<div id="id01" hidden="true"></div> 	<!-- Hidden div to hold the received Scripr -->
<div id="id02" class="container"></div>	<!-- Div to displat the Table Content-->

<script>		// Script to read the Json using Ajax Responce
	
	$(document).ready(function(){
		$.get("test.php", function(data){
			$("#id01").html(data);		//store the responce result into the hidden div
			$("#id01 script").each(function() {
				
			scriptT = document.createElement("script");
			scriptT.text = $(this).text();	//getting the div content
			document.getElementsByTagName("head")[0].appendChild(scriptT);	//storing the Script stored in the div to the head of the page
			});
			
			//alert(data);
			//	eval(data);
			//var obj=$.parseJSON(data);
			
			//Generating the table to display the content 
			var str="<table class='table table-striped'> <tr><th>Id</th><th>First Name</th><th>Last Name</th><th>Product Name</th><th>Price</th><th>Quantitu</th><th>Total</th></tr>";

			for( i = 0 ; i < dataset.consumer.length; i++ )
			{
				cObj = dataset.consumer[i];
				str+="<tr><td>"+cObj.id+"</td><td>"+cObj.firstname+"</td><td>"+cObj.lastname+"</td><td>"+cObj.productname+"</td><td>"+cObj.price+"</td><td>"+cObj.quantity+"</td><td>"+cObj.total+"</td></tr>";
				//alert(cObj.firstname);
				
			}
			str+="</table>";
			document.getElementById("id02").innerHTML=str;
			
			
			
   //         $.each(data, function(i, field){
     //           $("#id01").append(field + " ");
 //           });
		});	
			
	/*	$.ajax({
			url:"consumpro.json",
			datatype:"text",
			success: function(data){
				var json=$.parseJSON(data);
				document.getElementById("#id01").InnerHTML='firstname :'+json.consumer.firstname+'<br>';
			}
		});*/
	});

</script>

<!--
<script>
var xmlhttp = new XMLHttpRequest();
var url = "consumpro.json";

xmlhttp.onreadystatechange = function() {
    if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
        var myArr = JSON.parse(xmlhttp.responseText);
        myFunction(myArr);
    }
}
xmlhttp.open("GET", url, true);
xmlhttp.send();

function myFunction(arr) {
    var out = "";
    var i;
    for(i = 0; i < arr.length; i++) {
        out +=arr[i].firstname + '<br>';
    }
    document.getElementById("id01").innerHTML = out;
}
</script>

-->
</body>
</html>

