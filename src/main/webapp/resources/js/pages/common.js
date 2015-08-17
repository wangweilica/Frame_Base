common = {
	confirm : function(title, message, okFunc, cancelFunc) {
		title = title || '确认';
		message = message || '确认所做操作？';
		okFunc = (okFunc && typeof okFunc == 'function')?okFunc:function(){}
		var modal = $('#confirmModal');
		modal.find('.modal-header .modal-title').text(title);
		modal.find('.modal-body').text(message);
		modal.find('.modal-footer .modal-ok').off('click').on('click', function(){
			okFunc();
			modal.modal('hide');
		});
		if (cancelFunc && typeof cancelFunc == 'function') {
			modal.find('.modal-footer .modal-cancel').off('click').on('click', function(){
				cancelFunc();
			});
		}
		modal.modal('show');
	}	
}
