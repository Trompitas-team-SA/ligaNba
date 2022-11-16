/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author mac20
 */
public class PartidosRepositorio implements iPartidosRepositorio {
    
        
     //Donde almacenaremos la info
    HashMap<String, String[]> partidosJugados = new HashMap<>();
    HashMap<String, String[]> arbitros        = new HashMap<>();
    String iteradorNPartido = "-1";

    
    
    
    
    
    public String leerArchivoJuegos() {
        
       
        
        try{
        
            BufferedReader lectorIterar = obtenerFile();
            String strng;
        
            while ( (strng = lectorIterar.readLine() ) != null ){
           
                //Validamos si es asterisco o no la linea
                if( !validarSiEsAsterisco( strng ) ){
                    
                    if( !strng.isEmpty() ){
                        //Validar si es linea de arbitro o de juego y a partir de ahi guardaremos la data en hashMaps ( objetos de javascript xd ) 
                        if( validarSiLineaEsDeJuegoUArbitro( strng ) ) ingresarDataPartido( strng );
                        else ingresarDataArbitro( strng );
                    }
                }     
            }        
        }  catch( IOException Io){
            System.out.println( "Error IO en EquiposRepositorio" + Io );
            JOptionPane.showMessageDialog( null, "Error en leerArchivoJuegos en PartidosRepositorio, por favor contacte con desarrollador " + Io.getMessage() );
        }
        
        return "";
    }  
    
    
    public void añadirRegistroJuego( String dataPartido, String dataArbitro )  {

        try {
            leerArchivoJuegos();
            FileWriter fichero = obtenerFichero();
            String codigo = ( Integer.parseInt( iteradorNPartido ) + 1 ) + "";

            String data = "\n***********************" + "\n-"+ codigo + "(" + dataPartido + "\nArbitro(" + dataArbitro + "\n***********************";
            escribir( data , fichero );
        } catch (Exception e) {
            JOptionPane.showMessageDialog( null, "Error en añadirRegistroJuego en PartidosRepositorio, por favor contacte con desarrollador " + e.getMessage() );
        }
    }
    
    public void escribir( String data,  FileWriter fichero ){
        
        BufferedWriter bw = new BufferedWriter(fichero);
        
        
        try {
            bw.write(data ) ;
            bw.close()          ;
        } catch (IOException ex) {
            Logger.getLogger(PartidosRepositorio.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog( null, "Error en escribir en PartidosRepositorio, por favor contacte con desarrollador " + ex.getMessage() );
        }
        
    }
    
    
    
    
    
    public BufferedReader obtenerFile(){
        
        File documento = new File( System.getProperty("user.dir") +"/src/database/juegos.txt");
        BufferedReader lector = null;
        try{
            if( !documento.exists() ) System.out.println("No Existe");
            lector = new BufferedReader( new FileReader( documento ) );
            
        } catch( FileNotFoundException ex) {
            System.out.println( "Error al obtener el bufferReader en EquiposRepositorio" + ex );
            JOptionPane.showMessageDialog( null, "Error en obtenerFile en PartidosRepositorio, por favor contacte con desarrollador " + ex.getMessage() );
        }
        
        return lector;
    }
    
    
    public FileWriter obtenerFichero(){
        
        
        FileWriter fichero = null;
        
        try{
            
            fichero = new FileWriter( System.getProperty("user.dir") +"/src/database/juegos.txt", true);
            
        } catch( IOException io ){
            System.out.println("Error al obtener fichero Equipos Repositorio " + io );
             JOptionPane.showMessageDialog( null, "Error en obtenerFichero en PartidosRepositorio, por favor contacte con desarrollador " + io.getMessage() );
        }
        
        return fichero;
    }
    
    public PrintWriter obtenerPrintWriter( BufferedWriter fichero ){
        
        PrintWriter pw = null;
        
        try{
            
            pw = new PrintWriter( fichero );
            
        } catch( Exception e ){
           System.out.println( "Error al obtener printWriter en partidos repositorio " + e.getMessage() );
            JOptionPane.showMessageDialog( null, "Error en obtenerPrintWriter en PartidosRepositorio, por favor contacte con desarrollador " + e.getMessage() );
        }
        
        return pw;
    }
    
    
    
    
    public boolean validarSiEsAsterisco( String linea ){
        //Si la linea empieza con * devuelve true
        
        try {
            if( !linea.isEmpty()  ){
                if(  linea.charAt(0) == '*'){
                return true;
                }   
                return false;
            }
            
        } catch (Exception e) {
             JOptionPane.showMessageDialog( null, "Error en validarSiEsAsterisco en PartidosRepositorio, por favor contacte con desarrollador " + e.getMessage() );
        }
        return false;
    }
    
    public boolean validarSiLineaEsDeJuegoUArbitro( String linea ){
        
        try {
            if( !linea.isEmpty()  ){
                if( linea.charAt(0) == '-'){
                return true;
                }
                return false;
            }
        } catch (Exception e) {
              JOptionPane.showMessageDialog( null, "Error en validarSiLineaEsDeJuegoUArbitro en PartidosRepositorio, por favor contacte con desarrollador " + e.getMessage() ); 
        }
        return false;
    }
    
    public void ingresarDataPartido( String linea ){
        
        try {
            
            //datosConParentesis es un arreglo donde el primer valor es lo que existe antes del "(" y despues ( antes es el id y despues es la data 
            String[ ] datosConParentesis = linea.split("\\(");

            String idPartido =  datosConParentesis[ 0 ].substring(1);

            String[] informacionJuego = datosConParentesis[1].split(","); 

            iteradorNPartido = idPartido;
            partidosJugados.put( idPartido, informacionJuego ); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog( null, "Error en ingresarDataPartido en PartidosRepositorio, por favor contacte con desarrollador " + e.getMessage() ); 
        }
    }
    
    public void ingresarDataArbitro( String linea ){
        try {
            
            String[] datosConParentesis = linea.split("\\(");     
        
            String[] informacionArbitro = datosConParentesis[1].split(",");

            String codigoArbitro = String.valueOf(  arbitros.size() + 1 );


            arbitros.put( codigoArbitro, informacionArbitro );
        } catch (Exception e) {
            JOptionPane.showMessageDialog( null, "Error en ingresarDataArbitro en PartidosRepositorio, por favor contacte con desarrollador " + e.getMessage() ); 
        }
    }
    
    public void imprimirDataPartidos(){
        leerArchivoJuegos();
        System.out.println("\nInfo partidos");
        for( int i = 0; i < partidosJugados.size(); i ++){
            
            System.out.println("\n");
            String[] data = partidosJugados.get( String.valueOf(i) );
            
            for( int k = 0; k < data.length; k++ ){ 
                
                System.out.print( data[k]);
            }
        } 
    }
    
    
    public void imprimirDataArbitros(){
        
        leerArchivoJuegos();
         System.out.println("\n Info arbitros");
        for( int i = 0; i < partidosJugados.size(); i ++){
            
            String[] data = arbitros.get( String.valueOf(i) );
            
            System.out.println("");
            if( data != null ){
                for( int k = 0; k < data.length; k++ ){ 
                
                 System.out.print( data[k]);
                }
            }
            
            System.out.println("");
        }
    }
    
    public HashMap<String, String[]> getPartidosJugados(){
        leerArchivoJuegos();
        return partidosJugados;
    }
    
    public HashMap<String, String[]> getArbitros(){
        leerArchivoJuegos();
        return arbitros;
    }
}
