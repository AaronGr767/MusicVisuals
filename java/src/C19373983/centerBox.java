package C19373983;

import processing.core.*;

public class centerBox {
    
    CAVisual cv;

    public centerBox(CAVisual cv){
        this.cv = cv;
    }

    public void render(){
        float c = PApplet.map(cv.getSmoothedAmplitude(), 0, 1, 0, 255);
        cv.stroke(c, 255, 255);        
        cv.strokeWeight(2);
        cv.noFill();                
        // See the difference lerping makes? It smooths out the jitteryness of average, so the visual looks smoother
        //ellipse(width / 4, 100, 50 + average * 500, 50 + average * 500);
        cv.ellipse(cv.width / 2, cv.height / 3, 50 + (cv.lerpedAverage * 50), 10 + (cv.lerpedAverage * 10));
        cv.ellipse(cv.width / 2, cv.height / 4, 50 + (cv.lerpedAverage * 50), 10 + (cv.lerpedAverage * 10));                
             
    }

}