package C19373983;

import ie.tudublin.*;

public class CAVisual extends Visual{

public void settings(){
    size(1000, 500);
}

    public void setup()
    {
        startMinim();

        loadAudio("heatwaves.mp3");
    }

    public void keyPressed()
    {
        if (key == ' ')
        {
            getAudioPlayer().cue(0);
            getAudioPlayer().play();
        }
    }

    public void draw(){
        background(0);
    }

}