$(document).on('keydown',pressAction);
$(document).on('keyup',pressRemove);

function pressAction(event){
        if(Number(event['key'])>=1&&Number(event['key'])<=9){
                var cell = "#cell"+event['key'];	
                $(cell).addClass("playing");   
        }
}

function pressRemove(event){
        if(Number(event['key'])>=1&&Number(event['key'])<=9){
                var cell = "#cell"+event['key'];	
                $(cell).removeClass("playing");   
        }
}