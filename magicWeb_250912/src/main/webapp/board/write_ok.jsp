<%@page import="com.jspsmart.upload.File"%>
<%@page import="com.jspsmart.upload.SmartUpload"%>
<%@page import="java.net.InetAddress"%>
<%@page import="java.sql.Timestamp"%>
<%@page import="magic.board.BoardDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean class="magic.board.BoardBean" id="board"></jsp:useBean>
<jsp:setProperty property="*" name="board"></jsp:setProperty>
<%
	SmartUpload upload = new SmartUpload();
	upload.initialize(pageContext);
	upload.upload();
	
	String fName="";
	int fileSize=0;
	
	File file = upload.getFiles().getFile(0);
	if(!file.isMissing()){
		fName = file.getFileName();
		fileSize = file.getSize();
		file.saveAs("/upload/" + file.getFileName());	
	}
	
%>
<%
	//자바 클래스 이용해서 ip 추가
	//이거 안하면 ip가 0:0:0:0:0:0:0:1 이렇게 나옴
	InetAddress address = InetAddress.getLocalHost();
	// getHostAddress : ip 가져오는 메소드
	String ip = address.getHostAddress();
	
	//set IP
// 	board.setB_ip(request.getRemoteAddr()); 
	board.setB_ip(ip); // 192.168.10.64
	
	//파일 업로드 처리
	board.setB_name(upload.getRequest().getParameter("b_name"));
	board.setB_email(upload.getRequest().getParameter("b_email"));
	board.setB_title(upload.getRequest().getParameter("b_title"));
	board.setB_content(upload.getRequest().getParameter("b_content"));
	board.setB_pwd(upload.getRequest().getParameter("b_pwd"));
	//답변글 처리
	//정수로 캐스팅
	board.setB_id(Integer.parseInt(upload.getRequest().getParameter("b_id")));
	board.setB_ref(Integer.parseInt(upload.getRequest().getParameter("b_ref")));
	board.setB_step(Integer.parseInt(upload.getRequest().getParameter("b_step")));
	board.setB_level(Integer.parseInt(upload.getRequest().getParameter("b_level")));
	
	board.setB_fname(fName);
	board.setB_fsize(fileSize);
	
	//오늘날짜 추가
	board.setB_date(new Timestamp(System.currentTimeMillis()));
	
	BoardDBBean db = BoardDBBean.getInstance();
	
	if(db.insertBoard(board) == 1){//글쓰기가 정상적으로 완료시
		response.sendRedirect("list.jsp");
	}else{//글쓰기가 실패시
		response.sendRedirect("write.jsp");
	}
%>