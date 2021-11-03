/*************************************************************************************************************
Video.java
Autor: Jeremy Mejía
Fecha de Creación: Noviembre de 2021
Última Modificación: Noviembre de 2021

Laboratorio No. 3
Video
*************************************************************************************************************/

class Video extends Post{

    private String link;
    private int peso;
    private int frameRate;



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

    public int getFrameRate(){
        return frameRate; 
    }

    public void setFrameRate(int frameRate){
        this.frameRate = frameRate;  
    }

    public void post(){

    }
    
}