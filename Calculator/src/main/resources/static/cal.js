function numClick(btn){
	 //①一つ目の数字を入力→ディスプレイに表示
	let display = document.getElementById("display");
	//display.value += btn.value;		
	
	 //演算子が押されて二つ目の数字が押されたらディスプレイをクリアーにして二つ目の数字を表示する
	if(document.getElementById("flag").value == "true" || display.value == "0"){
		 display.value = btn.value;
		 document.getElementById("flag").value = "false";
	 } else {
	 //②記号が入力されたらディスプレイをクリア
		 display.value += btn.value;
 	 } 
	 }
	 
 
 function opeClick(btn){
	 //③一つ目の数字と記号を一つ目の値と演算子に代入
	 document.getElementById("firstNum").value = document.getElementById("display").value;
	 document.getElementById("operator").value = btn.value;
	 document.getElementById("flag").value = document.getElementById("display");
	 document.getElementById("flag").value = "true";
	 //④二つ目の数字を入力→ディスプレイに表示
	 document.getElementById("secondNum").value = btn.value;
	  
	
	 }
	  //*必要な動き 
	  
	 
	  
	  
	  
	  //⑥計算結果をディスプレイに表示
	  //⑦記号Cを入力しディスプレイをクリア