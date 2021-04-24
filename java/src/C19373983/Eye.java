package C19373983;

import processing.core.*;

public class Eye {
    
    CAVisual cv;

    public Eye(CAVisual cv){
        this.cv = cv;
    }

    public void render(){

        float c = PApplet.map(cv.getSmoothedAmplitude(), 0, 1, 0, 255);        
        cv.strokeWeight(2);
        cv.noFill();           
        cv.stroke(c, 255, 255);

        cv.ellipse(512, 256, 50 + (cv.lerpedAverage * 100), 50 + (cv.lerpedAverage * 100));

        cv.ellipse(512, 256, 150 + (cv.lerpedAverage * 100), 50 + (cv.lerpedAverage * 100));
   
        
        double d = Math.PI;
        float dp = (float)d;

        float r = 1f;
        int numPoints = 3;

        float thetaInc = dp / (float) numPoints;
        cv.strokeWeight(2);                
        float lastX = cv.width / 2, lastY = cv.height / 2;

        for(int i = 0 ; i < 50 ; i ++){

            cv.stroke(c, 300, 255, 100);
            float theta = i * (thetaInc + cv.lerpedAverage * 5);

            double st = Math.sin(theta);
            double ct = Math.cos(theta);

            float sinth = (float)st;
            float costh = (float)ct;

            float x = cv.width / 2 + sinth * r;
            float y = cv.height / 2 - costh * r;
            r += 0.5f + cv.lerpedAverage;
            cv.line(lastX, lastY, x, y);
            lastX = x;
            lastY = y;
        }
             
    }

}