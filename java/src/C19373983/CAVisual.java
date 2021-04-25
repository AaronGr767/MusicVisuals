package C19373983;

import ie.tudublin.*;

public class CAVisual extends Visual{

    centerBox box;
    Eye ed;
    SideBox sbox;
    WaveForm wform;

    float[] lerpedBuffer;

    int userOption = 0;

public void settings(){
    size(1024, 512, P3D);

    // Use this to make fullscreen
    //fullScreen();

    // Use this to make fullscreen and use P3D for 3D graphics
    //fullScreen(P3D, SPAN); 
}

    float y = 200;
    float lerpedY = y;

    public void setup()
    {
        colorMode(HSB);
        startMinim();

        loadAudio("heatwaves.mp3");

        box = new centerBox(this);
        ed = new Eye(this);
        sbox = new SideBox(this);
        wform = new WaveForm(this);

        lerpedBuffer = new float[width];
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

    float lerpedAverage = 0;


    public void draw(){
        background(0);

        float average = 0;
        float sum = 0;

        // Calculate the average of the buffer
        for (int i = 0; i < getAudioBuffer().size(); i ++)
        {
            sum += abs(getAudioBuffer().get(i));
        }
        average = sum / getAudioBuffer().size();
        // Move lerpedAverage 10% closer to average every frame
        lerpedAverage = lerp(lerpedAverage, average, 0.1f);

        try
        {
            // Call this if you want to use FFT data
            calculateFFT(); 
        }
        catch(VisualException e)
        {
            e.printStackTrace();
        }
        // Call this is you want to use frequency bands
        calculateFrequencyBands(); 

        // Call this is you want to get the average amplitude
        calculateAverageAmplitude(); 
    

    switch(userOption){

        case 0: {
            ed.render();
            break;
        }

        case 1: {
            ed.render();
            sbox.render();
            break;
        }

        case 2: {
            box.render();
            break;
        }

        case 3: {
            sbox.render();
            box.render();
            break;
        }
        case 4: {
            wform.render();
            break;
        }
    }
    }

}