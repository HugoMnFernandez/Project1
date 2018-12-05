function getUser(){
	
	let xhr = new XMLHttpRequest();
	
	let username = document.getElementById("inputUsername").value;
	let password = document.getElementById("inputPassword").value;
	
	xhr.onreadystatechange = function(){
		
		if(xhr.readyState == 4 && xhr.status == 200){
			
			let user = JSON.parse(xhr.responseText);
			document.getElementById("result").innerHTML = user.fname + " " + user.lname;
			
		}
		
	}
	
	let user = {};
	user.username = username;
	user.password = password;
	xhr.open("POST", "api/user" + username, true);
	
	xhr.send(JSON.stringify(user));
	
}

function makeUser(){
	
	let xhr = new XMLHttpRequest();
	
	xhr.onreadystatechange = function(){
		
		if(xhr.readyState === 4 && xhr.status === 201){
			document.getElementById("result").innerHTML = "New user created successfully";
		}
		
	}
	
	xhr.open("POST", "api/user", true);
	
	let user = createUser();
	
	xhr.send(JSON.stringify(user));
	
}

function createUser(){
	let user = {};
	
	user.username = document.getElementById("newUsername").value;
	user.fname = document.getElementById("firstname").value;
	user.lname = document.getElementById("lastname").value;
	
	return user;
}


window.onload = function(){
	document.getElementById("loginB").addEventListener("click", getUser, true);
}