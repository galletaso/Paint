
package paint;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;


public class Cuadrado  extends Rectangle2D.Double{
    
    Color color = null;
    
    boolean relleno = false;
    
    public Cuadrado (int _posX, int _posY, int _lado, Color _color, boolean _relleno){
        
        this.x = _posX;
        this.y = _posY;
        this.width = _lado;
        this.height = _lado;
        this.color = _color;
        this.relleno = _relleno;
    }
    
    public void dibujate (Graphics2D g2){
        g2.setColor(color);
        if ( relleno){
            g2.fill(this);
        }else{
            g2.fill(this);
        }
        
    }
}
