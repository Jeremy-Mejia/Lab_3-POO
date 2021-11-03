/*************************************************************************************************************
Audio.java
Autor: Jeremy Mejía
Fecha de Creación: Noviembre de 2021
Última Modificación: Noviembre de 2021

Laboratorio No. 3
Audio
*************************************************************************************************************/

class Audio extends Post{

    private String link;
    private int peso;
    private float SampleRate;
    private int BitDepth;


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

    public float getSampleRate(){
        return SampleRate; 
    }

    public void setSampleRate(float SampleRate){
        this.SampleRate = SampleRate;  
    }

    public int getBitDepth(){
        return BitDepth; 
    }

    public void setBitDepth(int BitDepth){
        this.BitDepth = BitDepth;  
    }

    public void post(){

    }
    
}