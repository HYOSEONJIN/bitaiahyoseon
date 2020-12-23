<%@page import="form.Member"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%


 List<Member> members = new ArrayList<Member>();
	members.add(new Member("cool1","1111","cool11","photo11.jpg"));
	members.add(new Member("cool2","2222","cool12","photo12.jpg"));
	members.add(new Member("cool3","3333","cool13",null));
	members.add(new Member("cool4","4444","cool14","photo14.jpg"));
	members.add(new Member("cool5","5555","cool15","photo15.jpg"));
	members.add(new Member("cool6","6666","cool16","photo16.jpg"));
	members.add(new Member("cool7","7777","cool17","photo17.jpg"));
	members.add(new Member("cool8","8888","cool18",null));
	members.add(new Member("cool9","9999","cool19",null));
	members.add(new Member("cool10","0000","cool10","photo10.jpg"));
	
	session.setAttribute("members", members);
	


%>
