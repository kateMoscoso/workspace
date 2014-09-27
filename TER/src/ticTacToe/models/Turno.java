package ticTacToe.models;

public class Turno {

    public static final char CRUZ = 'X';
    public static final char NO_CRUZ = 'O';
    private char jugador = Turno.CRUZ;

    public void cambiar() {
        jugador = this.noToca();
    }

    public char toca() {
        return jugador;
    }

    public char noToca() {
        if (jugador == Turno.CRUZ) {
            return Turno.NO_CRUZ;
        } else {
            return Turno.CRUZ;
        }
    }
}