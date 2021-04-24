package C19373983;

import processing.core.*;

public class Eye {
    
    CAVisual cv;

    public Eye(CAVisual cv){
        this.cv = cv;
    }

    public void render(){
        float c = PApplet.map(cv.getSmoothedAmplitude(), 0, 1, 0, 255);
        cv.stroke(c, 255, 255);        
        cv.strokeWeight(2);
        cv.noFill();                
        cv.ellipse(512, 256, 150 + (cv.lerpedAverage * 100), 50 + (cv.lerpedAverage * 100));
        cv.ellipse(512, 256, 50 + (cv.lerpedAverage * 100), 50 + (cv.lerpedAverage * 100));                
             
    }

}