package tresenrayas;

public class TicTacToe {
	private Tablero tablero = new Tablero();
	private Turno turno = new Turno(TicTacToe.fichas.length);
	private static char[] fichas = {'x','o'};
	private Jugadores[] jugadores = new Jugadores[TicTacToe.fichas.length];
	

	public TicTacToe(){
		
		for (int i = 0; i < jugadores.length; i++) {
			jugadores[i] = new Jugadores(fichas[i]);
		}

	}
	public void jugar(){
		tablero.mostrar();
		do{
			if(jugadores[turno.toca()].puestasTodas()){
				jugadores[turno.toca()].ponerFicha(tablero);
			}
			else 
				jugadores[turno.toca()].moverFicha(tablero);
			tablero.mostrar();
			turno.cambiar();
		}while(!tablero.hayTER());
		jugadores[turno.noToca()].victoria();

	}
	public static void main(String args[]){		
		new TicTacToe().jugar();
	}

}
