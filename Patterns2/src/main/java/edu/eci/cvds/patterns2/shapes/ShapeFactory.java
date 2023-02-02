package edu.eci.cvds.patterns2.shapes;
import edu.eci.cvds.patterns2.shapes.concrete.*;

public class ShapeFactory {

    public static shape create(RegularShapeType type){
        shape s = null;
        switch (type){
            case Triangle:{
                s = new Triangle();
                break;
            }
            case Pentagon:{
                s = new Pentagon();
                break;
            }
            case Quadrilateral:{
                s = new Quadrilateral();
                break;
            }
            case Hexagon:{
                s = new Hexagon();
                break;
            }
        }

        return s;

    }    
}
