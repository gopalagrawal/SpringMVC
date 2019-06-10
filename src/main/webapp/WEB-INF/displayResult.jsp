<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
isELIgnored="false" %>
<!DOCTYPE html>

<html>

<body>
	Result is (using scriptlet): <%= request.getAttribute("result")  %><br>
	Result is (using expr. lang): ${result}
</body>
</html>