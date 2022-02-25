import processing.core.PApplet;

public class Sketch extends PApplet {
    
    
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
    // put your size call here
    size(600, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(51,204,255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
      
    //sun 
    fill(255, 255, 0);
    ellipse((float) (width/8), (float) (height/8),(float)
        (width/5), (float)(height/5));

    //cloud
    fill(255, 255, 255);
  ellipse((float) (width/2.1), (float) (height/13.33),(float)
        (width/3.08), (float)(height/10));    
    
    //cloud
    fill(255, 255, 255);
   ellipse((float) (width/1.38), (float) (height/13.33),(float)
        (width/3.08), (float)(height/10));    
    
    //house
    fill(255, 255, 153);
  rect((float) (width/4.0), (float) (height/2.58),
        width/2, height/2);    

    //windows
    fill(255, 255, 255);
    rect((float) (width/3.636), (float) (height/1.428), width/8, height/8); 

      // Window
    fill(255, 255, 255);
    rect((float) (width/1.68), (float) (height/1.428), width/8, height/8); 

    // Window Roof
    fill(51, 0, 0);
    rect((float) (width/1.716), (float) (height/1.428), (float) (width/6.666), height/80); 

    // Window
    fill(255, 255, 255);
    rect((float) (width/3.571), (float) (height/1.428), (float) (width/5.333), height/8); 

    // Window Roof
    fill(51, 0, 0);
        rect((float) (width/3.738), (float) (height/1.428), (float) (width/6.666), height/80); 


    // Window
    fill(255, 255, 255);
 rect((float) (width/1.8779), height/2, (float) (width/5.333), height/8); 
    
    // Window Roof
    fill(51, 0, 0);
        rect((float) (width/1.923), height/2, (float) (width/4.705), height/80); 

    // House Roof
    fill(255, 153, 0);
    triangle((float) (width/2), (float) (height/5.333), (float) (width/1.23), (float) (height/2.285), (float) (width/5.333), (float) (height/2.285)); 

    // Tree Leaves
    fill(0, 255, 51);
    ellipse((float) (width/6.15), (float) (height/1.818), width/4, height/4); 

    // Tree Trunk
    fill(102, 51, 0);
    rect((float) (width/7.273), (float) (height/1.481), width/20, height/4); 

   // Bush
    fill(0, 153, 0);
    ellipse((float) (width/1.269), (float) (height/1.212), (float) (width/6.666), (float) (height/6.666)); 

    // Bush
    fill(0, 102, 0);
ellipse((float) (width/1.176), (float) (height/1.142), (float) (width/6.666), (float) (height/6.666));
    
    // Bush
    fill(0, 204,0);
ellipse((float) (width/1.333), (float) (height/1.142), (float) (width/6.666), (float) (height/6.666));

   

  }
}



