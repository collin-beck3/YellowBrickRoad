package rocks.zipcode.dreamhouse;

/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square sky;
    private Square grass;
    private Square lake;
    private Square wall;
    private Square wall2;
    private Square window;
    private Square window1;
    private Triangle roof;
    private Circle sun;
    private MyRectangle door;
    private Circle window2; 
    private Square garage; 
    private Square window3;
    private MyRectangle2 road; 

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        sky = new Square();
        sky.changeColor("black");
        sky.moveHorizontal(-200);
        sky.moveVertical(-200);
        sky.changeSize(500);
        sky.makeVisible();

        grass = new Square();
        grass.changeColor("grass");
        grass.moveHorizontal(-100);
        grass.moveVertical(100);
        grass.changeSize(400);
        grass.makeVisible();

        lake = new Square();
        lake.changeColor("blue");
        lake.moveHorizontal(-80);
        lake.moveVertical(200);
        lake.changeSize(500);
        lake.makeVisible();

        wall = new Square();
        wall.changeColor("pink");
        wall.moveVertical(60);
        wall.changeSize(120);
        wall.makeVisible();

        wall2 = new Square();
        wall2.changeColor("pink");
        wall2.moveVertical(90);
        wall2.moveHorizontal(110);
        wall2.changeSize(90);
        wall2.makeVisible();

        garage = new Square();
        garage.changeColor("white");
        garage.moveVertical(115);
        garage.moveHorizontal(125);
        garage.changeSize(65);
        garage.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(10);
        window.moveVertical(135);
        window.makeVisible();

        window3 = new Square();
        window3.changeColor("black");
        window3.moveHorizontal(70);
        window3.moveVertical(79);
        window3.makeVisible();

        window1 = new Square();
        window1.changeColor("black");
        window1.moveHorizontal(10);
        window1.moveVertical(79);
        window1.makeVisible();

        roof = new Triangle();
        roof.changeColor("grey");
        roof.changeSize(50, 140);
        roof.moveHorizontal(70);
        roof.moveVertical(52);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("white");
        sun.moveHorizontal(180);
        sun.moveVertical(-45);
        sun.changeSize(60);
        sun.makeVisible();

        door = new MyRectangle();
        door.changeColor("black");
        door.moveHorizontal(70);
        door.moveVertical(130);
        door.changeSize(30, 50);
        door.makeVisible();

        window2 = new Circle();
        window2.changeColor("black");
        window2.moveHorizontal(109);
        window2.moveVertical(105);
        window2.changeSize(31);
        window2.makeVisible();

        road = new MyRectangle2();
        road.changeColor("tan");
        road.moveHorizontal(-60);
        road.moveVertical(180);
        road.changeSize(400, 30);
        road.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            wall2.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
