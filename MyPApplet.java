import processing.core.*;
public class MyPApplet extends PApplet{
	private PImage img;

	public void setup(){
		img = loadImage("/home/gary/Downloads/kestrel.jpg");
		img.resize(width, height);
	}
	
	public void draw(){
		background(0);
		image(img,0,0);
	}
}
