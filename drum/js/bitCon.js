$(document).on('keydown',pressAction);
$(document).on('keyup',pressRemove);
     
function pressAction(event){
    if(event['key']==='1'){
        $("#cell1").addClass("playing");
    }else if(event['key']==='2'){
        $("#cell2").addClass("playing");
    }else if(event['key']==='3'){
        $("#cell3").addClass("playing");
    }else if(event['key']==='4'){
        $("#cell4").addClass("playing");
    }else if(event['key']==='5'){
            $("#cell5").addClass("playing");
    }else if(event['key']==='6'){
            $("#cell6").addClass("playing");
    }else if(event['key']==='7'){
            $("#cell7").addClass("playing");
    }else if(event['key']==='8'){
            $("#cell8").addClass("playing");
    }else if(event['key']==='9'){
            $("#cell9").addClass("playing");
    }
}
     
function pressRemove(event){
    if(event['key']==='1'){
        $("#cell1").removeClass("playing");
    }else if(event['key']==='2'){
            $("#cell2").removeClass("playing");
    }else if(event['key']==='3'){
        $("#cell3").removeClass("playing");
    }else if(event['key']==='4'){
            $("#cell4").removeClass("playing");
    }else if(event['key']==='5'){
            $("#cell5").removeClass("playing");
    }else if(event['key']==='6'){
            $("#cell6").removeClass("playing");
    }else if(event['key']==='7'){
            $("#cell7").removeClass("playing");
    }else if(event['key']==='8'){
            $("#cell8").removeClass("playing");
    }else if(event['key']==='9'){
            $("#cell9").removeClass("playing");
    }
}