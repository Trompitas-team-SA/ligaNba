/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package co.edu.usbcali.nba_project;

import co.edu.usbcali.nba_project.models.LigaNBA;
import interfaces.MenuInicio;
import java.io.File;
import javax.swing.JOptionPane;
import logica.EquiposLogica;
import logica.LigaLogica;
import repositorio.EquiposRepositorio;

/**
 *
 * @author mac20
 */
public class Nba_project {

    public static void main(String[] args) {
       
        //CrearEquipoInterfaz
        //Conexion crearEquipo = new Conexion();
        //crearEquipo.setVisible(true);
        MenuInicio menuInicio = new MenuInicio();
        menuInicio.setVisible(true);
              
    }
}
