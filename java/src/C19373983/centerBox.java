package C19373983;

import processing.core.*;

public class centerBox {
    
    CAVisual cv;

    public centerBox(CAVisual cv){
        this.cv = cv;
    }

    private float angle = 0;

    public void render(){

        cv.lights();
        cv.strokeWeight(2);
        float c = PApplet.map(cv.lerpedAverage, 0, 1, 0, 255);
        cv.stroke(c, 255, 255);
        cv.noFill();
        angle += 0.01f;
        float b1 = 100 + (20 * cv.lerpedAverage * 10);
        float b2 = 50 + (20 * cv.lerpedAverage * 10);
        
        cv.pushMatrix();
        cv.translate(cv.width / 2, cv.height / 2, 0);
        cv.rotateY(angle);
        cv.rotateX(angle);
        cv.box(b1);
        cv.popMatrix();

        cv.pushMatrix();
        cv.translate(cv.width / 2, cv.height / 2, 0);
        cv.rotateY(angle + 90f);
        cv.rotateX(angle + 90f);
        cv.box(b2);
        cv.popMatrix();
        
        cv.translate(cv.width / 2, cv.height / 2, 0);
        cv.stroke(c, 255, 255);
        cv.fill(c, 255, 255);
        cv.sphere(28 + (cv.lerpedAverage * 100));     
    }

}