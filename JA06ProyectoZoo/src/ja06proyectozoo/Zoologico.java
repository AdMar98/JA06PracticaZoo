/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;
import java.util.ArrayList;
/**
 *
 * @author Adrian
 */
public class Zoologico {
    
    private ArrayList<Animal>v;
    
      public Zoologico(){
        this.v = new ArrayList<Animal>();
    }
    
    public void añadeAnimal(Animal a){
        this.v.add(a);
    }
    
    public void mostrarAnimal (Animal a){
        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i).nombre);
            System.out.println(v.get(i).paisOrigen);
            System.out.println(v.get(i).peso);
            System.out.println(v.get(i).edad);
            System.out.println("");
        }
    }
    
    public void existeAnimaldelPais(String p){
        for (int i = 0; i < v.size(); i++) {
            if(v.get(i).paisOrigen.equals(p)){
                System.out.println("El animal existe!");
                
            }else{
                System.out.println("No tenemos informacion de ningun animal de ese pais");
            }
        }
    }
    
    public void edadPromedio(){
        int cont=0;
        int edades=0;
        for (int i = 0; i < v.size(); i++) {
            edades += v.get(i).edad;
            cont++;
        }
        double resultado=edades / cont;
        System.out.println("Las edades promedias son: "+ resultado);
    }
    
    public void eliminaAnimalesDe(String p){
        for (int i = 0; i < v.size(); i++) {
            if(v.get(i).paisOrigen.equals(p)){
                v.remove(i);
                i--;
                System.out.println("Borrado con exito");
            }
        }
    }
    
    public int cuantosPesanMas(double p){
        int cont=0;
        for (int i = 0; i < v.size(); i++) {
            if(v.get(i).peso > p){
                cont++;
            }
        }
        return cont;
    }
    
    public boolean siEsta(Animal a){
        boolean esta=false;
        for (int i = 0; i < v.size(); i++) {
            
            if(v.get(i).equals(a)){
                esta=true;
            }
        }
        return esta;
    }
    
    public int edadPrimero(){
        int edadPrimero;
        edadPrimero=v.get(0).edad;
        return edadPrimero;
    }
    
    public double pesoUltimo(){
        double p=0;
        for (int i = v.size(); i == v.size(); i--) {
            p=v.get(i).peso;
        }
        return p;
    }
    
    public void reemplazaAnimal(Animal a, int pos){
        for (int i = 0; i < v.size(); i++) {
            
                
            }
        }
    }
    
    

