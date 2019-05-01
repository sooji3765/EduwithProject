var audio = new Audio("audio/loop.mp3");  

$("#play-btn").on('click',playMusic);  
$("#stop-btn").on('click' ,stopMusic); 

function playMusic(){
    audio.play();
}

function stopMusic(){
    audio.pause();   
    audio.currentTime = 0
}

