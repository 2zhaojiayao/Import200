function topbox() {
	var teamname = prompt("请输入团队名：");
	var worker1 = prompt("请输入队员的学号：");
	var worker2 = prompt("请输入队员的学号：");
	if (teamname && (worker1 || worker2))
		alert("报名成功！");
	else
		alert("您输入的数据有误，请重新报名！");
}