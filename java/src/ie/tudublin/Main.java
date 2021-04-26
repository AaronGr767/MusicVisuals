package ie.tudublin;

import C19373983.CAVisual; 

public class Main
{	

	public void startUI()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new CAVisual());	
	}

	public static void main(String[] args)
	{
		Main main = new Main();
		main.startUI();			
	}
	
}