/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.Arrays;
import java.util.HashMap;
import javax.swing.JOptionPane;
import repositorio.EquiposRepositorio;

/**
 *
 * @author mac20
 */
public class LigaLogica {

    EquiposLogica equipoL = new EquiposLogica();
    EquiposRepositorio equipo = new EquiposRepositorio();

    public String[][] ordenarPorPartidosGanados() {

            String[][] cod = equipo.obtenerNombreYCodigoEquipo(); //Matriz con Nombre Equipo, CodigoEquipo , Partidos Ganados 
            String[][] partidosGanados = new String[cod.length][1];
            partidosGanados = equipo.obtenerNombreYCodigoEquipo();
            
            
            int[] partidosGanadosOperador = new int[cod.length];
            
            HashMap<String, String[]> equiposMap = equipo.getHashMapEquipo();
            String nombreEquiposOperador[][] = new String[cod.length][9];
            
        try {

            for (int i = 0; i < cod.length; i++) {

                partidosGanadosOperador[i] = Integer.parseInt(partidosGanados[i][2]);
            }

            for (int i = 0; i < cod.length; i++) {

                nombreEquiposOperador[i] = equiposMap.get(i + ""); 

            }

            for (int i = 0; i < partidosGanadosOperador.length; i++) {
                
                 
                for (int j = 1; j < (partidosGanadosOperador.length - i); j++) {
                    
                    
                    if (partidosGanadosOperador[j - 1] < partidosGanadosOperador[j]) {

                       
                        int cambioLugares = partidosGanadosOperador[j - 1];
                        partidosGanadosOperador[j - 1] = partidosGanadosOperador[j];
                        partidosGanadosOperador[j] = cambioLugares;

                        String auxiliarEquipo[] = nombreEquiposOperador[j - 1];
                        nombreEquiposOperador[j - 1] = nombreEquiposOperador[j];
                        nombreEquiposOperador[j] = auxiliarEquipo;

                    }

                }

            }
            return nombreEquiposOperador;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog( null , "Error en ordenarPorPartidosGanador en LigaLogica por favor contacte el desarrollador " + e.getMessage());
        }
        return nombreEquiposOperador;
    }

    
    
    private static class infoEquipo {

        public infoEquipo() {
        }

    }

}
