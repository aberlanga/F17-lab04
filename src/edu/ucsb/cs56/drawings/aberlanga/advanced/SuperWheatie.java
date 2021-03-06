package edu.ucsb.cs56.drawings.aberlanga.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;

/**
   A House
      
   @author Phill Conrad 
   @version for CS56, W16, UCSB
   
*/
public class SuperWheatie extends Wheatie implements Shape
{
    /**
     * Constructor for objects of class CoffeeCup
     */
    public SuperWheatie(double x, double y, double width, double height)
    {
	// construct the basic house shell
	super(x,y,width,height);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
  
	double bottomRightBody_x = x + (this.armWidthScaling +this.bodyWidthScaling)*width;
	double bottomRightBody_y = y + height*this.bodyHeightScaling;

	double topSideCape_x_i = bottomRightBody_x;
	double topSideCape_y_i = bottomRightBody_y-0.2*height;
	double topSideCape_x_f = bottomRightBody_x + this.armWidthScaling*width;
	double topSideCape_y_f = bottomRightBody_y + 0.1*height;

	double bottomSideCape_x_i = bottomRightBody_x-0.1*width;
	double bottomSideCape_y_i = bottomRightBody_y;
	double bottomSideCape_x_f = bottomRightBody_x;
	double bottomSideCape_y_f = y+height;

	double bottomCape_x_i = bottomRightBody_x + this.armWidthScaling*width;
	double bottomCape_y_i = bottomRightBody_y + 0.1*height;
	double bottomCape_x_f = bottomRightBody_x;
	double bottomCape_y_f = y+height;
	
	Line2D.Double topSideCape =
	    new Line2D.Double(topSideCape_x_i,topSideCape_y_i,topSideCape_x_f,topSideCape_y_f);
	Line2D.Double bottomSideCape =
	    new Line2D.Double(bottomSideCape_x_i,bottomSideCape_y_i,bottomSideCape_x_f,bottomSideCape_y_f);
	Line2D.Double bottomCape =
	    new Line2D.Double(bottomCape_x_i,bottomCape_y_i,bottomCape_x_f,bottomCape_y_f);
	
	// add the windows to the house
	// Look up the meaning of the second parameter of append
	// (Hint--is a method of "GeneralPath")
	
        GeneralPath SuperWheatie = this.get();
        SuperWheatie.append(topSideCape, false);
        SuperWheatie.append(bottomSideCape, false);
        SuperWheatie.append(bottomCape, false); 
    }    
}
