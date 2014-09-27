package ticTacToe.controllers;

import ticTacToe.models.Tablero;
import ticTacToe.models.Turno;
import ticTacToe.views.TableroView;
import ticTacToe.views.TurnoView;

public abstract class JugadorController extends TicTacToeController{
    
    protected Turno turno;
    protected TurnoView turnoView;
    
    public JugadorController(Tablero tablero, Turno turno){
        super(tablero, new TableroView(tablero));
        this.turno = turno;
        this.turnoView = new TurnoView(turno);
    }

}
