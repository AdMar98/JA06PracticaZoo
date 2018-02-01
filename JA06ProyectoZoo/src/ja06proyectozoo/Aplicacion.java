/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;
import java.util.Scanner;
/**
 *
 * @author Adrian
 */
public class Aplicacion {
static Scanner tec=new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        String nombre;
        String paisOrigen;
        double peso;
        int edad;
        Zoologico v=new Zoologico();
        
        do{
        menu();
        System.out.println("Introduce una opcion");
        opcion=tec.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Introduce el nombre");
                nombre=tec.next();
                System.out.println("Introduce el pais");
                paisOrigen=tec.next();
                System.out.println("Introduce el peso");
                peso=tec.nextDouble();
                System.out.println("Introduce la edad");
                edad=tec.nextInt();
                
                Animal a=new Animal (nombre,paisOrigen,peso,edad);
                v.añadeAnimal(a);
                v.mostrarAnimal(a);
                
            break;
            
            case 2:
                System.out.println("Introduce el pais");
                paisOrigen=tec.next();
                
                v.existeAnimaldelPais(paisOrigen);
            break;
            
            case 3:
                v.edadPromedio();
            break;
            
            case 4:
                System.out.println("Escribe el pais de origen");
                paisOrigen = tec.next();
                v.eliminaAnimalesDe(paisOrigen);
            break;
            
            case 5:
                System.out.println("Introduce el peso para ver que animales pesan mas");
                peso=tec.nextDouble();
                v.cuantosPesanMas(peso);
            break;
            
            case 6:
                System.out.println("Introduce el nombre del animal");
                nombre=tec.next();
                paisOrigen="";
                peso=0;
                edad=0;
                a=new Animal (nombre,paisOrigen,peso,edad);
                if(!v.siEsta(a)){
                    System.out.println("Se ha encontrado el animal");
                }else{
                    System.out.println("No hemos encontrado ningun animal con ese nombre");
                }
                
            break;
            
            case 7:
                edad=v.edadPrimero();
                System.out.println("La edad del primer animal es: " +edad);
            break;
            
            case 8:
                peso=v.pesoUltimo();
                System.out.println("El peso del ultimo animal es: " +peso);
            break;
            
            case 9:
                
            break;
            }
        }while(opcion!=0);
    }
    
    public static void menu(){
        System.out.println("1.- Añadir animal");
        System.out.println("2.- Buscar animal por pais");
        System.out.println("3.- Edad promedio");
        System.out.println("4.- Eliminar animal");
        System.out.println("5.- Animales que pesan mas");
        System.out.println("6.- Buscar animal");
        System.out.println("7.- Edad de primer animal");
        System.out.println("8.- Peso del ultimo animal");
        System.out.println("9.- Reemplazar animal");
        System.out.println("10.- Eliminar animal");
        System.out.println("11.- Inserta animal");
        System.out.println("12.- Clausura zoologico");
        System.out.println("13.- Zoologico clausurado");
    }
}
