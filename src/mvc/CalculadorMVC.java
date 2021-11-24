package mvc;

import Modelo.OperationsModel;
import Controlador.OperationsController;
import Vista.VentanaData;
import Vista.VentanaPrincipal;

/**
 *
 * @author Hewlett Packard
 */

public class CalculadorMVC {

    public static void main(String[] args) {
        VentanaPrincipal vista = new VentanaPrincipal();
        VentanaData data = new VentanaData();
        OperationsModel modelo = new OperationsModel();
        OperationsController controlador = new OperationsController(modelo, vista, data);
        controlador.showView();
    }
    
}
