/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorio;

import java.util.Arrays;
import javax.swing.JOptionPane;
import logica.EquiposLogica;

/**
 *
 * @author mac20
 */
public class LigaRepositorio {
    
    EquiposLogica equipoL = new EquiposLogica();
    EquiposRepositorio equipo = new EquiposRepositorio();

    public void ordenarPorPartidosGanados() {
        
        
        try {
            String[][] cod = equipo.obtenerNombreYCodigoEquipo();
            String[][] partidosGanados = new String[cod.length][1];
            partidosGanados = equipo.obtenerNombreYCodigoEquipo();
            int[] partidosGanadosOperador = new int[cod.length];

            for (int i = 0; i < cod.length; i++) {
                partidosGanadosOperador[i] = Integer.parseInt(partidosGanados[i][2]);
            }
            System.out.println(Arrays.toString(partidosGanadosOperador));
            for (int i = 0; i < partidosGanadosOperador.length; i++) {

                for (int j = 1; j < (partidosGanadosOperador.length - i); j++) {
                    if (partidosGanadosOperador[j - 1] < partidosGanadosOperador[j]) {
                        int cambioLugares = partidosGanadosOperador[j - 1];
                        partidosGanadosOperador[j - 1] = partidosGanadosOperador[j];
                        partidosGanadosOperador[j] = cambioLugares;
                    }
                }
            }
            System.out.println(Arrays.toString(partidosGanadosOperador));
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Error en ordenarPorPartidosGanador en LigaRepositorio, contacte con administrador " + e.getMessage() );
        }
            
    }

    private static class infoEquipo {

        public infoEquipo() {
        }
    }
    
}
