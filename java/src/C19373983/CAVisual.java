package C19373983;

import ie.tudublin.*;

public class CAVisual extends Visual{

    centerBox box;
    int userOption = 0;

public void settings(){
    size(1024, 512, P3D);

    // Use this to make fullscreen
    //fullScreen();

    // Use this to make fullscreen and use P3D for 3D graphics
    //fullScreen(P3D, SPAN); 
}

    public void setup()
    {
        startMinim();

        loadAudio("heatwaves.mp3");

        box = new centerBox(this);
    }

    public void keyPressed()
    {
        if (key == ' ')
        {
            getAudioPlayer().cue(0);
            getAudioPlayer().play();
        }

        if(keyCode >= '0' && keyCode <= '4' ){
            userOption = keyCode - '0';
        }
    }

    public void draw(){
        background(0);
    

    switch(userOption){

        case 0: {
            box.render();
            break;
        }

        case 1: {
            break;
        }

        case 2: {
            break;
        }
    }
    }

}