import com.cfloresh.juegoAhorcado.*;

public class mainJuegoAhorcado {

    public static void main(String[] args) {
        juegoAhorcado nuevoJuego = new juegoAhorcado();

        /* Inicializar el juego */
        nuevoJuego.inicializarJuego();
        boolean continuarJuego = true;

        do {
            int nuevaAccion = nuevoJuego.mostrarMenu();
            switch (nuevaAccion) {
                case 1 -> {
                    boolean resultado = nuevoJuego.buscarYReemplazar(nuevoJuego.getJugador().intentarLetra());
                    nuevoJuego.mostrarEstatus();
                    if (resultado) {
                        if (nuevoJuego.evaluarProgreso()) {
                            nuevoJuego.setJugadorHaGanado(true);
                            nuevoJuego.finalizarJuego();
                            continuarJuego = false;
                        }
                    } else {
                        if (!nuevoJuego.getJugador().disminuirIntentos()) {
                            nuevoJuego.finalizarJuego();
                            continuarJuego = false;
                        }
                    }
                }
                case 2 -> nuevoJuego.darPista();
                case 3 -> {
                    nuevoJuego.finalizarJuego();
                    continuarJuego = false;
                }
                default -> System.out.println("Ingrese una opción válida en el menú");
            }
        } while(continuarJuego);

    }
}
