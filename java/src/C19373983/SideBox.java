package C19373983;

import processing.core.*;

public class SideBox {
    
    CAVisual cv;

    public SideBox(CAVisual cv){
        this.cv = cv;
    }

    private float angle = 0;
	
	public void render(){

        cv.lights();
        cv.strokeWeight(2);
        float c = PApplet.map(cv.lerpedAverage, 0, 1, 0, 255);
        angle += 0.01f;
        float b3 = 50 + (20 * cv.lerpedAverage * 10);
        
        cv.stroke(c, 255, 255);
        cv.fill(c + 220, 255, 255);

        cv.pushMatrix();
        cv.translate(cv.width / 5, cv.height / 5, 0);
        cv.rotateY(angle);
        cv.rotateX(angle);
        cv.box(b3);
        cv.popMatrix();

        cv.pushMatrix();
        cv.translate(cv.width / 5, cv.height * 8/10, 0);
        cv.rotateY(angle);
        cv.rotateX(angle);
        cv.box(b3);
        cv.popMatrix();

        cv.pushMatrix();
        cv.translate(cv.width * 8/10, cv.height / 5, 0);
        cv.rotateY(angle);
        cv.rotateX(angle);
        cv.box(b3);
        cv.popMatrix();

        cv.pushMatrix();
        cv.translate(cv.width * 8/10, cv.height * 8/10, 0);
        cv.rotateY(angle);
        cv.rotateX(angle);
        cv.box(b3);
        cv.popMatrix();
	}
}