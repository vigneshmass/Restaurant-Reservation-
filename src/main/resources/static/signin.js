function checkregmail(){
    console.log("entered into check mail");
    var decimal=  /^([a-zA-Z0-9_\-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([a-zA-Z0-9\-]+\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\]?)$/;
    const element=document.getElementById('inputEmail');
    const email=element.value;
    if(email.match(decimal)){
        console.log("match");
        document.getElementById('alertregmail').innerHTML=``;
        document.getElementById('sign').disabled = false;
    }
    else{
        console.log("notmatch");
        document.getElementById('alertregmail').innerHTML=`enter valid email`;
        document.getElementById('sign').disabled = true;
    }
}
