$(document)
		.ready(
				function() {
					var MaxInputs = 9;
					var InputsWrapper = $("#InputsWrapper");
					var AddButton = $("#AddMoreFileBox");
					var x = InputsWrapper.length;
					var FieldCount = 1;
					$(AddButton)
							.click(
									function(e) {
										if (x <= MaxInputs) {
											FieldCount++;
											$(InputsWrapper)
													.append(
															'<div><input type="text"  name="mytext[]" class="popup-input search-input"  id="field_'
																	+ FieldCount
																	+ '" placeholder="请输入队员 '
																	+ FieldCount
																	+ ' 的学号"/><input type="button" rel="external nofollow" class="removeclass" value="删除"></div>');
											x++;
										}
										return false;
									});
					$("body").on("click", ".removeclass", function(e) {
						if (x > 1) {
							$(this).parent('div').remove();
							x--;
						}
						return false;
					})
					$("#text1")
							.on(
									"click",
									function() {
										window.scrollTo(0, 0);
										document.getElementById('light').style.display = 'block';
										document.getElementById('fade').style.display = 'block'

									});
					$("#text2")
							.on(
									"click",
									function() {
										document.getElementById('light').style.display = 'none';
										document.getElementById('fade').style.display = 'none'

									});
					$("#text").on("click", function() {
						document.fileForm.submit();
					});

				});