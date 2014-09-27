package tresenrayas;

public class Jugadores {

	private char ficha;
	private int puestas;
	public Jugadores(char ficha) {
		this.ficha = ficha;
	}
	
	/**
	 * @param args
	 */
	public void toca(){}
	
	public void ponerFicha(Tablero tablero) {
		GestorIO gestorIO = new GestorIO();
		Coordenada coordenada = new Coordenada();
		do{
			coordenada.leer();
		} while(coordenada.valida()|| tablero.ocupada(coordenada));
		tablero.ponerFicha(coordenada, ficha);
		puestas++;
		
	}
	public boolean puestasTodas() {
		return puestas==3;
	}
	public void moverFicha(Tablero tablero) {
		GestorIO gestorIO = new GestorIO();
		Coordenada coordenadaOrigen = new Coordenada();
		do{
			coordenadaOrigen.leer();
		} while(!coordenadaOrigen.valida()|| !tablero.ocupada(coordenadaOrigen,ficha));
		Coordenada coordenadaDestino = new Coordenada();
		do{
			coordenadaDestino.leer();
		} while(!coordenadaDestino.valida()|| tablero.ocupada(coordenadaDestino));
		tablero.quitarFicha(coordenadaOrigen);
		tablero.ponerFicha(coordenadaDestino, ficha);
	//	puestas++;
		
	}
	public void victoria() {
		new GestorIO().out(""+ficha);
		
	}

}
