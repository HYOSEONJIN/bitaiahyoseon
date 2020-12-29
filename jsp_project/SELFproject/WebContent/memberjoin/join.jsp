<%@page import="java.io.File"%>
<%@page import="java.util.Iterator"%>
<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="java.util.List"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<%@page import="member.model.Member"%>
<%@page import="member.dao.MemberDao"%>
<%@page import="jdbc.ConnectionProvider"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%

int Chk = 0;
String dir = request.getSession().getServletContext().getRealPath("/upload/memberprofile");
String userId, userPw, userName, userNumber, userPhoto =null;

Member member = new Member();
Connection conn = ConnectionProvider.getConnection();
MemberDao dao = MemberDao.getinstance();


//연결이 됐다면
if(conn!=null){
	request.setCharacterEncoding("UTF-8");
	
	
	boolean isMultipart = ServletFileUpload.isMultipartContent(request);
	
	if(isMultipart){
		DiskFileItemFactory factory = new DiskFileItemFactory();
		ServletFileUpload upload = new ServletFileUpload(factory);
		
		List<FileItem> items = upload.parseRequest(request);
		Iterator<FileItem> itr = items.iterator();
		
		while(itr.hasNext()){
			FileItem item = itr.next();
			if(item.isFormField()){
				String fieldName = item.getFieldName();
				if(fieldName.equals("userId")){
					userId = item.getString("UTF-8");
					member.setUserId(userId);}
				if(fieldName.equals("userPw")){
					userPw = item.getString("UTF-8");
					member.setUserPw(userPw);}
				if(fieldName.equals("userName")){
					userName = item.getString("UTF-8");
					member.setUserName(userName);}
				if(fieldName.equals("userNumber")){
					userNumber = item.getString("UTF-8");
					member.setUserNumber(userNumber);}				
			}else{
				if(item.getFieldName().equals("userPhoto") && !item.getName().isEmpty() && item.getSize()>0){
					File saveFilePath = new File(dir);
					
					if(!saveFilePath.exists() || !saveFilePath.isDirectory()){
						saveFilePath.mkdir();
					}
					
					String newFileName = System.currentTimeMillis()+"."+item.getName().split("\\.")[1];					
					item.write(new File(saveFilePath, newFileName));
					userPhoto = newFileName;
					member.setUserPhoto(userPhoto);
					
				}
			}
		}
		
		System.out.println(member);
		
		try{
		Chk = dao.inserMember(conn, member);
		} catch(Exception e){
			File delFile = new File(dir, userPhoto);
			if(delFile.exists()){
				delFile.delete();
			}
		}
			
	}
	

/* 	String userId = request.getParameter("userId");
	String userPw = request.getParameter("userPw");
	String userName = request.getParameter("userName");
	String userPhoto = request.getParameter("userPhoto");
	String userNumber = request.getParameter("userNumber");
	
	Member member = new Member();
	member.setUserId(userId);
	member.setUserPw(userPw);
	member.setUserPhoto(userPhoto);
	member.setUserName(userName);
	member.setUserNumber(userNumber);
	
	System.out.println(member);
	
	Chk = dao.inserMember(conn, member);
	
	System.out.println(Chk); */
}

if(Chk>0){
%> <script>
	alert('회원가입 완료');
	location.href="<%=request.getContextPath()%>";
</script>

<%}else{
	File delFile = new File(dir, userPhoto);
	if(delFile.exists()){
		delFile.delete();
	}
	%>
	<script>
	alert('회원가입 실패');
	history.go(-1);
	</script>
	
<%
}

%>
