package ticTacToe;
//turno aleatorio inicial
//nombre de jugadores y referirse a ellos por nombre -- guardar en turno los nombres, los nombres los pedira turno view
//jugador autom�tico (aleatorio)
//jugar m�s partidas en ContinuarController
//refactorizar PonerController y Mover Controller -- quitar replica de c�digo
//Tablero basado en coordenadas , no en caracteres
//Desacoplar Coordenada de Tres enRaya con clase hija
// x y o no pueden ser parte del modelo, seria vista, y no es operativo


import utils.CoordenadaTester;
import ticTacToe.models.TurnoTester;
import ticTacToe.models.TableroTester;
import utils.CoordenadaViewTester;
import ticTacToe.views.TurnoViewTester;

public class TicTacToeUnitTester {

    public void test() {
        CoordenadaTester.main(null);
        TurnoTester.main(null);
        TableroTester.main(null);
        CoordenadaViewTester.main(null);
        TurnoViewTester.main(null);
    }
}
