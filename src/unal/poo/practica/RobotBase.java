package unal.poo.practica;

import becker.robots.*;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class RobotBase
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot estudiante;
        
	public static void main (String[] args){
            //Declarar la creacion de la ciudad
            objetos = new City("Field.txt");
	    objetos.showThingCounts(true);
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Robot(objetos,0, 2, Direction.WEST,10);
            
            boolean stop = false;    
          
            for(int j = 0; j < 2; j++){    
                estudiante.turnLeft();
                estudiante.turnLeft();
                estudiante.move();
                if(stop)break;
                for(int i = 0; i < 4; i++){
                    estudiante.turnLeft();
                    estudiante.turnLeft();
                    estudiante.turnLeft();
                    estudiante.move();
                    estudiante.move();
                    estudiante.move();
                    stop = true;
                }
            }
            
            
            
            
            
            
	}
        
        public static void creacionFuncion(int parametroEntrada){
            for (int i = 0; i < parametroEntrada; i++) 
                estudiante.move();
        }
}

