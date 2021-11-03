/*************************************************************************************************************
Foto.java
Autor: Jeremy Mejía
Fecha de Creación: Noviembre de 2021
Última Modificación: Noviembre de 2021

Laboratorio No. 3
Foto
*************************************************************************************************************/

class Foto extends Post{

    private String link;
    private int peso;
    private String formato;
    private int resolucion;


    public String getLink(){
        return link; 
    }

    public void setLink(String link){
        this.link = link;  
    }

    public int getPeso(){
        return peso; 
    }

    public void setPeso(int peso){
        this.peso = peso;  
    }

    public String getFormato(){
        return formato; 
    }

    public void setFormato(String formato){
        this.formato = formato;  
    }

    public int getResolucon(){
        return resolucion; 
    }

    public void setResolucion(int resolucion){
        this.resolucion = resolucion;  
    }

    public void post(){

    }
}