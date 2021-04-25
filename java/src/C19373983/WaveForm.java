package C19373983;

import processing.core.*;

public class WaveForm {
    
    CAVisual cv;

    public WaveForm(CAVisual cv){
        this.cv = cv;
    }
	
	public void render(){

        float halfHeight = cv.height / 2;
        
        for (int i = 0; i < cv.getAudioBuffer().size(); i++) {

            float c = PApplet.map(i, 0, cv.getAudioBuffer().size(), 0, 255);
            cv.stroke(c, 255, 255);
            cv.lerpedBuffer[i] = PApplet.lerp(cv.lerpedBuffer[i], cv.getAudioBuffer().get(i), 0.1f);        
            cv.line(cv.width / 2, i * 2, cv.lerpedBuffer[i] * halfHeight * 2, i * 2);
            cv.line(cv.width, i * 2, cv.width - (cv.lerpedBuffer[i] * halfHeight * 2), i * 2);
        } 
        
	}
}