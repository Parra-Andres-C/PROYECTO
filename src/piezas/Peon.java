/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piezas;
import juego.*;

/**
 *
 * @author Parra G
 */
public class Peon extends pieza{
    Type type;

    public Peon(int m_x, int m_y, Player player) {
        super(m_x, m_y, player);
        this.type = Type.PEON;
    }
    
    @Override
    public boolean isValidPath(int finalX, int finalY) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int[][] drawpath(int startX, int startY, int finalX, int finalY) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean capture() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean canBecaptured() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Type getType() {
        return Type.PEON;
    }
    
}
