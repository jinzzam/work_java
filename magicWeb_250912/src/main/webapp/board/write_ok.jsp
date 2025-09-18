<%@page import="java.util.Enumeration"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
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
<% /*
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
	*/
	
	String path = request.getRealPath("upload");
	int size = 1024 * 1024;
	int fileSize = 0 ;
	String file="";
	String orifile="";
	
	//DefaultFileRenamePolicy : 파일명 넘버링 처리
	MultipartRequest multi = new MultipartRequest(request, path, size, "UTF-8", new DefaultFileRenamePolicy());
	//파일명 가져오기
	Enumeration files = multi.getFileNames();
	String str = files.nextElement().toString();
	//file : 넘버링 처리된 파일명
	file = multi.getFilesystemName(str);

	if(file != null){
		//orifile : 실제 파일명 (화면에 출력되므로 다른 글의 파일명과 중복될 수 있음)
		orifile = multi.getOriginalFileName(str);
		fileSize = file.getBytes().length;
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
	/*
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
	*/
	//파일 업로드 처리
	board.setB_name(multi.getParameter("b_name"));
	board.setB_email(multi.getParameter("b_email"));
	board.setB_title(multi.getParameter("b_title"));
	board.setB_content(multi.getParameter("b_content"));
	board.setB_pwd(multi.getParameter("b_pwd"));
	//답변글 처리
	//정수로 캐스팅
	board.setB_id(Integer.parseInt(multi.getParameter("b_id")));
	board.setB_ref(Integer.parseInt(multi.getParameter("b_ref")));
	board.setB_step(Integer.parseInt(multi.getParameter("b_step")));
	board.setB_level(Integer.parseInt(multi.getParameter("b_level")));
	
	if(file != null){
		board.setB_fname(file);
		board.setB_fsize(fileSize);
		board.setB_rfname(orifile);
	}
	
	//오늘날짜 추가
	board.setB_date(new Timestamp(System.currentTimeMillis()));
	
	BoardDBBean db = BoardDBBean.getInstance();
	
	if(db.insertBoard(board) == 1){//글쓰기가 정상적으로 완료시
		response.sendRedirect("list.jsp");
	}else{//글쓰기가 실패시
		response.sendRedirect("write.jsp");
	}
%>