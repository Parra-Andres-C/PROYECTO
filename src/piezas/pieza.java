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
public abstract class pieza {
    public int m_x, m_y;
    public Player player;

    public pieza(int m_x, int m_y, Player player) {
        this.m_x = m_x;
        this.m_y = m_y;
        this.player = player;
    }
    
    public abstract boolean isValidPath(int finalX, int finalY);
    /*
    *verifica la posibilidad de movimiento
    */
    public abstract int[][] drawpath(int startX, int startY, int finalX, int finalY);
    /*
    *muestra los movimientos que puede hacer la ficha    
    */
    public abstract boolean capture();
    /*
    *accion de acpturar si esta en la casilla de destino
    */
    
    public abstract boolean canBecaptured();
    /*
    *chequea la posibilidad de capturar en la casilla destino
    */
    public abstract Type getType();
}
