$(document).ready(function() { 

});

function del(id) {
	common.confirm("删除竞赛确认！", "您确认要删除该竞赛吗？", function(){
		toastr.success("删除成功");
		
	});
}