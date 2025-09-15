/**
 * 
 */

function check_ok(){
//	if(write_frm.b_name.value.length == 0){
	if(write_frm.b_name.value == ""){
		alert("작성자 이름을 써주세요");
		write_frm.b_name.focus;
		return;
	}
	if(write_frm.b_title.value == ""){
		alert("제목을 써주세요");
		write_frm.b_title.focus;
		return;
	}
	if(write_frm.b_content.value == ""){
		alert("내용을 써주세요");
		write_frm.b_content.focus;
		return;
	}

	document.write_frm.submit();
};