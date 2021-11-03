/*************************************************************************************************************
Texto.java
Autor: Jeremy Mejía
Fecha de Creación: Noviembre de 2021
Última Modificación: Noviembre de 2021

Laboratorio No. 3
Texto
*************************************************************************************************************/
class Texto extends Post{

    private String texto; 
    private String nombre;

    public String getNombre(){
        return nombre; 
    }

    public void setNombre(String nombre){
        this.nombre = nombre;  
    }

    public String getTexto(){
        return texto; 
    }

    public void setTexto(String texto){
        this.texto = texto;  
    }
    public void post(){

    }
    
}