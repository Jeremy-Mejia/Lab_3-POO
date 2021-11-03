/*************************************************************************************************************
Post.java
Autor: Jeremy Mejía
Fecha de Creación: Noviembre de 2021
Última Modificación: Noviembre de 2021

Laboratorio No. 3
Post
*************************************************************************************************************/

public abstract class Post{
    
    private String nombre; 
    private String texto; 
    private int foto;
    private int video;
    private int audio;
    private int emoticon; 

    public abstract void post(); 
}