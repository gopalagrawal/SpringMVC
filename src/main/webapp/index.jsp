<html>
<head>
	<script src="http://code.jquery.com/jquery-latest.min.js"
		type="text/javascript"></script>
</head>

<body>

	<form action="add" id="opform">
		<fieldset>
			<legend> Enter 2 integers</legend>
			<input type=text name="t1"> .....
			<input type=text name="t2">
		</fieldset>


		<fieldset>
			<legend> Please Select Operation</legend>
			<input type="radio" name="op" value="add" id="add" checked> 
			<label for="add"> ADD </label> 
			
			<input type="radio" name="op" value="sub" id="sub"> 
			<label for="sub"> SUB </label>
		</fieldset>


		<br> <input type=submit>
	</form>

<p>
Server Version: <%= application.getServerInfo() %><br>
Servlet Version: <%= application.getMajorVersion() %>.<%= application.getMinorVersion() %><br>
JSP Version: <%= JspFactory.getDefaultFactory().getEngineInfo().getSpecificationVersion() %> <br>
<p>

	<script>
		$(document).ready(function() {
			$("input[name='op']").change(function(){
				var radioValue = $("input[name='op']:checked").val();
            	$('form').attr('action', radioValue);		
			})
		});
	</script>



</body>
</html>
