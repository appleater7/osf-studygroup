<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
int age = Integer.parseInt();
if(age<=19) {
	%>
	<script type="text/javascript">
		alert("19세 미만이므로 입장 불가능");
		history.go(-1);
	</script>
	<%
}else {
	
}
%>