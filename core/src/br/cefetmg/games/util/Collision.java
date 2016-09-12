package br.cefetmg.games.util;

import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Rectangle;

/**
 * Utilitário para verificação de colisão.
 * @author fegemo <coutinho@decom.cefetmg.br>
 */
public class Collision {
   public static final boolean circlesOverlap(Circle c1, Circle c2) {
        float dx,dy,R;
        boolean result;
        
        dx = c1.x - c2.x;
        dy = c1.y - c2.y;
        R = c1.radius + c2.radius;
        
        result = Math.pow(dx,2) + Math.pow(dy,2) < Math.pow(R, 2);
        return result;
    }
    
    public static final boolean rectsOverlap(Rectangle r1, Rectangle r2) {
        boolean result;
        
        result =   (r1.x < (r2.x + r2.width)) && ((r1.x + r1.width) > r2.x) && (r1.y < (r2.y + r2.height)) && ((r1.y + r1.height) > r2.y);
        return result;
    }
    
}
