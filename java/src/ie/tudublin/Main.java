package ie.tudublin;

//import example.CubeVisual;
import C19373983.CAVisual;
//mport example.RotatingAudioBands; 

public class Main
{	

	public void startUI()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new CAVisual());	
		//processing.core.PApplet.runSketch( a, new CubeVisual());
		//processing.core.PApplet.runSketch( a, new RotatingAudioBands());	
	}

	public static void main(String[] args)
	{
		Main main = new Main();
		main.startUI();			
	}
}