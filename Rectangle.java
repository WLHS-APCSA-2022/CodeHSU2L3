public class Rectangle
{
    // Attributes
    private int width;
    private int height;
    

    /*Constructor
    Copies the values of rectWidth and rectHeight
    into width and height, respectively*/
    public Rectangle(int rectWidth, int rectHeight){
        width = rectWidth;
        height = rectHeight;

    }

    /* Constructor
    Allows user to construct a square
    Copies the value of sidelength
    into both width and height*/
    public Rectangle(int sideLength){
        width = sideLength;
        height = sideLength;
    }

    /*Default Constructor
    Allows a user to construct a rectangle
    without specifying dimensions*/
    public Rectangle(){
        width = 0;
        height = 0;
    }

    // This method lets us print out the object
    // to see the values of the instance variables
    public String toString()
    {
        return "Rectangle with width: " + width + " and height: " + height;
    }
}
