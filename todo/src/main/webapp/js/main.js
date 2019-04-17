function moveBtn(id) {
	var content = id.parentNode.parentNode;
    var idx = id.parentNode.parentNode.getElementsByTagName("INPUT")[0].value;
    var type = id.parentNode.parentNode.getElementsByTagName("INPUT")[1].value;

    var section = content.parentNode.parentNode;
    var now = section.getAttribute("class");
    //var title = content.querySelector(".title").innerHTML;
    
    console.log(content);
    console.log(now);
    //console.log(title);
    var xhr = new XMLHttpRequest();
    xhr.open('POST', 'MainServlet',true);
    xhr.onreadystatechange = function() {
        if (xhr.readyState === xhr.DONE) {
            if (xhr.status === 200 || xhr.status === 201) {
                if(now=="todo"){
                	document.querySelector(".doing .grid-contianer").appendChild(content);
                	console.log(document.querySelector(".doing .grid-contianer"));
                	alert("ok");
                }else{
                	document.querySelector(".done .grid-contianer").appendChild(content);
                	alert("yes")
                	
                }
                
            } else {
                console.error(xhr.responseText);
            }
        }
    };
    
    xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
    xhr.send("id="+idx+"&type="+type);

}