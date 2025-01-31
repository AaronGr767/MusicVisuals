package C19373983;

import processing.core.*;

public class Eye {
    
    CAVisual cv;

    public Eye(CAVisual cv){
        this.cv = cv;
    }

    public void render(){
        
        cv.strokeWeight(4);
        cv.noFill(); 

        float c1 = PApplet.map(cv.getSmoothedAmplitude(), 0, 1, 120, 255);

        cv.stroke(c1, 255, 255);
        cv.fill(c1+75, 255, 255);
        cv.ellipse(cv.width / 2, cv.height / 2, 600 + (cv.lerpedAverage * 100), 200 + (cv.lerpedAverage * 200));

        cv.strokeWeight(3);
        cv.stroke(c1, 255, 255);
        cv.fill(0, 0, 0);
        cv.ellipse(cv.width / 2, cv.height / 2, 200 + (cv.lerpedAverage * 200), 200 + (cv.lerpedAverage * 200));
        
        double d = Math.PI;
        float dp = (float)d;

        float r = 1f;
        int numPoints = 3;

        float thetaInc = dp / (float) numPoints;
        cv.strokeWeight(2);                
        float lastX = cv.width / 2, lastY = cv.height / 2;

        for(int i = 0 ; i < 140 ; i ++){

            float c2 = PApplet.map(cv.getSmoothedAmplitude(), 0, 1, 0, 255);
            cv.stroke(c2, 255, 255);
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