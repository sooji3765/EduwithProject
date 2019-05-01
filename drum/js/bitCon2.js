var sound1 = new Audio('audio/01_kick_drum.wav');
var sound2 = new Audio('audio/02_closed_hihat.wav');
var sound3 = new Audio('audio/03_open_hihat.wav');
var sound4 = new Audio('audio/04_clap.wav');
var sound5 = new Audio('audio/05_snap.wav');
var sound6 = new Audio('audio/06_crash.wav');
var sound7 = new Audio('audio/07_tom1.wav');
var sound8 = new Audio('audio/08_tom2.wav');
var sound9 = new Audio('audio/09_tambourine.wav');


$(document).on('keydown',bitStart);
$(document).on('keyup',bitStop);
     
function bitStart(event){   
    if(event['key']==='1'){
        sound1.play();    
    }else if(event['key']==='2'){
        sound2.play();
    }else if(event['key']==='3'){
        sound3.play();
    }else if(event['key']==='4'){
        sound4.play();
    }else if(event['key']==='5'){
        sound5.play();        
    }else if(event['key']==='6'){  
        sound6.play();
    }else if(event['key']==='7'){   
        sound7.play();
    }else if(event['key']==='8'){    
        sound8.play();
    }else if(event['key']==='9'){
        sound9.play();
    }
}
     
function bitStop(event){
    if(event['key']==='1'){
        sound1.pause();
        sound1.currentTime =0;
    }else if(event['key']==='2'){
        sound2.pause();
        sound2.currentTime =0;
    }else if(event['key']==='3'){
        sound3.pause();
        sound3.currentTime =0;    
    }else if(event['key']==='4'){
        sound4.pause();
        sound4.currentTime =0;    
    }else if(event['key']==='5'){
        sound5.pause();
        sound5.currentTime =0;
    }else if(event['key']==='6'){
        sound6.pause();
        sound6.currentTime =0;
    }else if(event['key']==='7'){
        sound7.pause();
        sound7.currentTime =0;
    }else if(event['key']==='8'){
        sound8.pause();
        sound8.currentTime =0;    
    }else if(event['key']==='9'){
        sound9.pause();
        sound9.currentTime =0;
    }
}