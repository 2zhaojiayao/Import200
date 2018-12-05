var i=1;
function openDialog() {
	window.scrollTo(0,0);
	document.getElementById('light').style.display = 'block';
	document.getElementById('fade').style.display = 'block'

}
function closeDialog() {
	document.getElementById('light').style.display = 'none';
	document.getElementById('fade').style.display = 'none'
}
function submitBtnClick() {
	document.fileForm.submit();
}