/*************************************************************************************************************
Vista.java
Autor: Jeremy Mejía
Fecha de Creación: Noviembre de 2021
Última Modificación: Noviembre de 2021

Laboratorio No. 3
Vista
*************************************************************************************************************/


import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


class Vista{
    
    Scanner scan = new Scanner(System.in);

    private String nombre;
    private String comentario;
    private String texto;
    private int op; 
    private int hashtag;
    private String hashtagValor;
    private int op1; 
    private int likes;
    private int Multimedia;
    private String linkImagen;
    private int pesoImagen;
    private String formatoImagen;
    private int megapixelImagen;
    private String linkAudio;
    private int pesoAudio;
    private float sampleRate;
    private int bitDepth;
    private String linkVideo;
    private int pesoVideo;
    private int frameRateVideo;
    private String emoticon; 
    private int buscar;
    private String fecha;
    private String HasHtag; 



    public void vista(){
        System.out.println("\n********************************************************************");
        System.out.println("\nRedSocial - QueOndaMano\n " + "\nIngresa tu nombre: ");
        nombre = scan.nextLine(); 

        Texto tex = new Texto();
        tex.setNombre(nombre); 

        Vista vs = new Vista();
        vs.menu(nombre);
    }

    public void menu(String nombre){

        do{
            System.out.println("\n¿Qué deseas publicar?\n" + 
            " \n1. Texto \n2. Multimedia(imagen, audio, video) \n3. Emoticon  \n4. Salir");
            op = scan.nextInt();
            if(op > 4 || op < 1){
                System.out.println("\nMarcaste una opción inválida, intenta de nuevo");
            }
        }while(op > 4 || op < 1);
        
        if(op == 1){

            DateTimeFormatter dtm = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingresa el texto:");
            System.out.println("\nPresiona enter al finalizar para publicar\n");
            texto = sc.nextLine();
            Texto tex = new Texto();
            tex.setTexto(texto); 

            System.out.println("\n¿Deseas agregar hashtag? \n1. Si \n2. No \nmarca un número:");
            hashtag = sc.nextInt();

            if(hashtag == 1){
                System.out.println("\nIngresa el hashtag y no olvides colocar # al inicio de la palabra");
                hashtagValor = sc.next(); 
                
            }

            if(hashtag == 2){
                System.out.println("Continúemos...");
                hashtagValor = "";
            }

            System.out.println("\nTu publicación: \n");
            System.out.println("\n********************************************************************");
            System.out.println(nombre + " " + dtm.format(LocalDateTime.now()) + " likes:" + likes);
            System.out.println(hashtagValor);
            System.out.println(texto);
            System.out.println("Comentarios:");
            System.out.println("------------");

            do{
                System.out.println("\n¿Deseas agregar comentarios o darle like?" + "\n1. Comentar \n2. Dar like \n3. Siguiente \nmarca con un número:" );
                op1 = scan.nextInt();
                if(op1 > 3 || op1 < 1){
                    System.out.println("\nMarcaste una opción inválida, intenta de nuevo");
                }
            }while(op1 > 3|| op1 < 1); 

            if(op1 == 1){
                System.out.println("\nEscribe el comentario:");
                comentario = sc.next();
                System.out.println("\n********************************************************************");
                System.out.println(nombre + " " + dtm.format(LocalDateTime.now()) + " likes:" + likes);
                System.out.println(hashtagValor);
                System.out.println(texto);
                System.out.println("Comentarios:");
                System.out.println("------------");
                System.out.println("(1) " + comentario);
                Vista vs = new Vista();
                vs.menu1(nombre);
                
            }

            if(op1 == 2){
                likes = likes + 1;
                System.out.println("\n********************************************************************");
                System.out.println(nombre + dtm.format(LocalDateTime.now()) + " likes:" + likes);
                System.out.println(hashtagValor);
                System.out.println(texto);
                System.out.println("Comentarios:");
                System.out.println("------------");
                Vista vs = new Vista();
                vs.menu1(nombre);
            }
            if(op1 == 3){
                Vista vs = new Vista();
                vs.menu1(nombre);
            }
        }
        if(op == 2){
            
            DateTimeFormatter dtm = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            Scanner sca = new Scanner(System.in);
            do{
                System.out.println("\n¿Qué publicarás? " + "\n1. Imagen \n2. Audio \n3. Video" );
                Multimedia = sca.nextInt(); 
                if(Multimedia > 3 || Multimedia < 1){
                    System.out.println("\nMarcaste una opción inválida, intenta de nuevo");
                }
            }while(Multimedia > 3 || Multimedia < 1);
            

            if(Multimedia == 1){
                System.out.println("\nLink de la imagen:");
                linkImagen = sca.next();
                System.out.println("\nPeso de la imagen:");
                pesoImagen = sca.nextInt();
                System.out.println("\nFormato de la imagen:");
                formatoImagen = sca.next();
                System.out.println("\nResolución de la imagen:");
                megapixelImagen = sca.nextInt();
                System.out.println("\nPresiona enter al finalizar para publicar\n");
                
                Foto fo = new Foto();
                fo.setLink(linkImagen); 
                fo.setPeso(pesoImagen); 
                fo.setFormato(formatoImagen); 
                fo.setResolucion(megapixelImagen); 

                System.out.println("\n¿Deseas agregar hashtag? \n1. Si \n2. No \nmarca un número:");
                hashtag = sca.nextInt();
                 
                if(hashtag == 1){
                    System.out.println("\nIngresa el hashtag y no olvides colocar # al inicio de la palabra");
                    hashtagValor = sca.next(); 
                    
                }
    
                if(hashtag == 2){
                    System.out.println("Continúemos...");
                    hashtagValor = "";
                }
            
                System.out.println("\nTu publicación: \n");
                System.out.println("\n********************************************************************");
                System.out.println(nombre + " " + dtm.format(LocalDateTime.now()) + " likes:" + likes);
                System.out.println(hashtagValor);
                System.out.println(linkImagen);
                System.out.println(pesoImagen + " KB, " + formatoImagen + ", " + megapixelImagen + " Megapixeles");
                System.out.println("Comentarios:");
                System.out.println("------------");

                do{
                    System.out.println("\n¿Deseas agregar comentarios o darle like?" + "\n1. Comentar \n2. Dar like \n3. Siguiente \nmarca con un número:" );
                    op1 = scan.nextInt();
                    if(op1 > 3 || op1 < 1){
                        System.out.println("\nMarcaste una opción inválida, intenta de nuevo");
                    }
                }while(op1 > 3|| op1 < 1);
                if(op1 == 1){
                    System.out.println("\nEscribe el comentario:");
                    comentario = sca.next();
                    System.out.println("\n********************************************************************");
                    System.out.println(nombre + " " + dtm.format(LocalDateTime.now()) + " likes:" + likes);
                    System.out.println(hashtagValor);
                    System.out.println(linkImagen);
                    System.out.println(pesoImagen + " KB, " + formatoImagen + ", " + megapixelImagen + " Megapixeles");
                    System.out.println("Comentarios:");
                    System.out.println("------------");
                    System.out.println("(1) " + comentario);
                    Vista vs = new Vista();
                    vs.menu1(nombre);
                    
                }
    
                if(op1 == 2){
                    likes = likes + 1;
                    System.out.println("\n********************************************************************");
                    System.out.println(nombre + dtm.format(LocalDateTime.now()) + " likes:" + likes);
                    System.out.println(hashtagValor);
                    System.out.println(linkImagen);
                    System.out.println(pesoImagen + " KB, " + formatoImagen + ", " + megapixelImagen + " Megapixeles");
                    System.out.println("Comentarios:");
                    System.out.println("------------");
                    Vista vs = new Vista();
                    vs.menu1(nombre);
                }
                if(op1 == 3){
                    Vista vs = new Vista();
                    vs.menu1(nombre);
                }
            }

            if (Multimedia == 2){
                System.out.println("\nLink del audio:");
                linkAudio = sca.next();
                System.out.println("\nPeso del audio:");
                pesoAudio = sca.nextInt();
                System.out.println("\nSampleRate del audio:");
                sampleRate = sca.nextFloat();
                System.out.println("\nBitDepth del audio:");
                bitDepth = sca.nextInt();
                System.out.println("\nPresiona enter al finalizar para publicar\n");
                
                Audio AU = new Audio();
                AU.setLink(linkAudio); 
                AU.setPeso(pesoAudio); 
                AU.setSampleRate(sampleRate); 
                AU.setBitDepth(bitDepth); 

                System.out.println("\n¿Deseas agregar hashtag? \n1. Si \n2. No \nmarca un número:");
                hashtag = sca.nextInt();
    
                if(hashtag == 1){
                    System.out.println("\nIngresa el hashtag y no olvides colocar # al inicio de la palabra");
                    hashtagValor = sca.next(); 
                    
                }
    
                if(hashtag == 2){
                    System.out.println("Continúemos...");
                    hashtagValor = "";
                }
            
                System.out.println("\nTu publicación: \n");
                System.out.println("\n********************************************************************");
                System.out.println(nombre + " " + dtm.format(LocalDateTime.now()) + " likes:" + likes);
                System.out.println(hashtagValor);
                System.out.println(linkAudio);
                System.out.println(pesoAudio + " KB, SampleRate:" + sampleRate + " kHz, BitDepth: " + bitDepth );
                System.out.println("Comentarios:");
                System.out.println("------------");

                do{
                    System.out.println("\n¿Deseas agregar comentarios o darle like?" + "\n1. Comentar \n2. Dar like \n3. Siguiente \nmarca con un número:" );
                    op1 = scan.nextInt();
                    if(op1 > 3 || op1 < 1){
                        System.out.println("\nMarcaste una opción inválida, intenta de nuevo");
                    }
                }while(op1 > 3|| op1 < 1);
                if(op1 == 1){
                    System.out.println("\nEscribe el comentario:");
                    comentario = sca.next();
                    System.out.println("\n********************************************************************");
                    System.out.println(nombre + " " + dtm.format(LocalDateTime.now()) + " likes:" + likes);
                    System.out.println(hashtagValor);
                    System.out.println(linkAudio);
                    System.out.println(pesoAudio + " KB, SampleRate:" + sampleRate + " kHz, BitDepth: " + bitDepth );
                    System.out.println("Comentarios:");
                    System.out.println("------------");
                    System.out.println("(1) " + comentario);
                    Vista vs = new Vista();
                    vs.menu1(nombre);
                    
                }
    
                if(op1 == 2){
                    likes = likes + 1;
                    System.out.println("\n********************************************************************");
                    System.out.println(nombre + dtm.format(LocalDateTime.now()) + " likes:" + likes);
                    System.out.println(hashtagValor);
                    System.out.println(linkAudio);
                    System.out.println(pesoAudio + " KB, SampleRate:" + sampleRate + " kHz, BitDepth: " + bitDepth );
                    System.out.println("Comentarios:");
                    System.out.println("------------");
                    Vista vs = new Vista();
                    vs.menu1(nombre);
                }
                if(op1 == 3){
                    Vista vs = new Vista();
                    vs.menu1(nombre);
                }

            }

            if(Multimedia == 3){
                System.out.println("\nLink del video:");
                linkVideo = sca.next();
                System.out.println("\nPeso del video:");
                pesoVideo = sca.nextInt();
                System.out.println("\nFrameRate:");
                frameRateVideo = sca.nextInt();
                System.out.println("\nPresiona enter al finalizar para publicar\n");
                
                Video vi = new Video();
                vi.setLink(linkVideo); 
                vi.setPeso(pesoVideo); 
                vi.setFrameRate(frameRateVideo); 

                System.out.println("\n¿Deseas agregar hashtag? \n1. Si \n2. No \nmarca un número:");
                hashtag = sca.nextInt();
    
                if(hashtag == 1){
                    System.out.println("\nIngresa el hashtag y no olvides colocar # al inicio de la palabra");
                    hashtagValor = sca.next(); 
                    
                }
    
                if(hashtag == 2){
                    System.out.println("Continúemos...");
                    hashtagValor = "";
                }
              
            
                System.out.println("\nTu publicación: \n");
                System.out.println("\n********************************************************************");
                System.out.println(nombre + " " + dtm.format(LocalDateTime.now()) + " likes:" + likes);
                System.out.println(hashtagValor);
                System.out.println(linkVideo);
                System.out.println(pesoVideo + " KB, FrameRtae:" + frameRateVideo + " fps");
                System.out.println("Comentarios:");
                System.out.println("------------");

                do{
                    System.out.println("\n¿Deseas agregar comentarios o darle like?" + "\n1. Comentar \n2. Dar like \n3. Siguiente \nmarca con un número:" );
                    op1 = scan.nextInt();
                    if(op1 > 3 || op1 < 1){
                        System.out.println("\nMarcaste una opción inválida, intenta de nuevo");
                    }
                }while(op1 > 3|| op1 < 1);
                if(op1 == 1){
                    System.out.println("\nEscribe el comentario:");
                    comentario = sca.next();
                    System.out.println("\n********************************************************************");
                    System.out.println(nombre + " " + dtm.format(LocalDateTime.now()) + " likes:" + likes);
                    System.out.println(hashtagValor);
                    System.out.println(linkVideo);
                    System.out.println(pesoVideo + " KB, FrameRtae" + frameRateVideo + ": fps");
                    System.out.println("Comentarios:");
                    System.out.println("------------");
                    System.out.println("(1) " + comentario);
                    Vista vs = new Vista();
                    vs.menu1(nombre);
                    
                }
    
                if(op1 == 2){
                    likes = likes + 1;
                    System.out.println("\n********************************************************************");
                    System.out.println(nombre + dtm.format(LocalDateTime.now()) + " likes:" + likes);
                    System.out.println(hashtagValor);
                    System.out.println(linkVideo);
                    System.out.println(pesoVideo + " KB, FrameRtae" + frameRateVideo + ": fps");
                    System.out.println("Comentarios:");
                    System.out.println("------------");
                    Vista vs = new Vista();
                    vs.menu1(nombre);
                }
                if(op1 == 3){
                    Vista vs = new Vista();
                    vs.menu1(nombre);
                }

            }

        }

        if(op == 3){

            DateTimeFormatter dtm = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            Scanner s = new Scanner(System.in);
            System.out.println("Ingresa el emoticon:");
            System.out.println("\nPresiona enter al finalizar para publicar\n");
            emoticon = s.nextLine();
            Emoticon em = new Emoticon();
            em.setEmoticon(emoticon); 

            System.out.println("\n¿Deseas agregar hashtag? \n1. Si \n2. No \nmarca un número:");
            hashtag = s.nextInt();
        
    
            if(hashtag == 1){
                System.out.println("\nIngresa el hashtag y no olvides colocar # al inicio de la palabra");
                hashtagValor = s.next(); 
                
            }
    
            if(hashtag == 2){
                System.out.println("Continúemos...");
                hashtagValor = "";
            }

            System.out.println("\nTu publicación: \n");
            System.out.println("\n********************************************************************");
            System.out.println(nombre + " " + dtm.format(LocalDateTime.now()) + " likes:" + likes);
            System.out.println(hashtagValor);
            System.out.println(emoticon);
            System.out.println("Comentarios:");
            System.out.println("------------");

            do{
                System.out.println("\n¿Deseas agregar comentarios o darle like?" + "\n1. Comentar \n2. Dar like \n3. Siguiente \nmarca con un número:" );
                op1 = s.nextInt();
                if(op1 > 3 || op1 < 1){
                    System.out.println("\nMarcaste una opción inválida, intenta de nuevo");
                }
            }while(op1 > 3|| op1 < 1); 

            if(op1 == 1){
                System.out.println("\nEscribe el comentario:");
                comentario = s.next();
                System.out.println("\n********************************************************************");
                System.out.println(nombre + " " + dtm.format(LocalDateTime.now()) + " likes:" + likes);
                System.out.println(hashtagValor);
                System.out.println(emoticon);
                System.out.println("Comentarios:");
                System.out.println("------------");
                System.out.println("(1) " + comentario);
                Vista vs = new Vista();
                vs.menu1(nombre);
                
            }

            if(op1 == 2){
                likes = likes + 1;
                System.out.println("\n********************************************************************");
                System.out.println(nombre + dtm.format(LocalDateTime.now()) + " likes:" + likes);
                System.out.println(hashtagValor);
                System.out.println(emoticon);
                System.out.println("Comentarios:");
                System.out.println("------------");
                Vista vs = new Vista();
                vs.menu1(nombre);
            }
            if(op1 == 3){
                Vista vs = new Vista();
                vs.menu1(nombre);
            }
        }

       
    }
    public void menu1(String nombre){
        do{
            System.out.println("\n¿Qué deseas hacer ahora; publicar o buscar?\n" + 
            " \n1. Texto \n2. Multimedia(imagen, audio, video) \n3. Emoticon \n4. Buscar  \n5. Salir");
            op = scan.nextInt();
            if(op > 5 || op < 1){
                System.out.println("\nMarcaste una opción inválida, intenta de nuevo");
            }
        }while(op > 5 || op < 1);
        if(op == 1){

            DateTimeFormatter dtm = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingresa el texto:");
            System.out.println("\nPresiona enter al finalizar para publicar\n");
            texto = sc.nextLine();
            Texto tex = new Texto();
            tex.setTexto(texto); 
            System.out.println(nombre);

            System.out.println("\n¿Deseas agregar hashtag? \n1. Si \n2. No \nmarca un número:");
            hashtag = sc.nextInt();
        
    
            if(hashtag == 1){
                System.out.println("\nIngresa el hashtag y no olvides colocar # al inicio de la palabra");
                hashtagValor = sc.next(); 
                
            }
    
            if(hashtag == 2){
                System.out.println("Continúemos...");
                hashtagValor = "";
            }

            System.out.println("\nTu publicación: \n");
            System.out.println("\n********************************************************************");
            System.out.println(nombre + " " + dtm.format(LocalDateTime.now()) + " likes:" + likes);
            System.out.println(hashtagValor);
            System.out.println(texto);
            System.out.println("Comentarios:");
            System.out.println("------------");

            do{
                System.out.println("\n¿Deseas agregar comentarios o darle like?" + "\n1. Comentar \n2. Dar like \n3. Siguiente \nmarca con un número:" );
                op1 = scan.nextInt();
                if(op1 > 3 || op1 < 1){
                    System.out.println("\nMarcaste una opción inválida, intenta de nuevo");
                }
            }while(op1 > 3|| op1 < 1); 

            if(op1 == 1){
                System.out.println("\nEscribe el comentario:");
                comentario = sc.next();
                System.out.println("\n********************************************************************");
                System.out.println(nombre + " " + dtm.format(LocalDateTime.now()) + " likes:" + likes);
                System.out.println(hashtagValor);
                System.out.println(texto);
                System.out.println("Comentarios:");
                System.out.println("------------");
                System.out.println("(1) " + comentario);
                Vista vs = new Vista();
                vs.menu1(nombre);
                
            }

            if(op1 == 2){
                likes = likes + 1;
                System.out.println("\n********************************************************************");
                System.out.println(nombre + dtm.format(LocalDateTime.now()) + " likes:" + likes);
                System.out.println(hashtagValor);
                System.out.println(texto);
                System.out.println("Comentarios:");
                System.out.println("------------");
                Vista vs = new Vista();
                vs.menu1(nombre);
            }
            if(op1 == 3){
                Vista vs = new Vista();
                vs.menu1(nombre);
            }
        }
        if(op == 2){
            DateTimeFormatter dtm = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            Scanner sca = new Scanner(System.in);
            do{
                System.out.println("\n¿Qué publicarás? " + "\n1. Imagen \n2. Audio \n3. Video" );
                Multimedia = sca.nextInt(); 
                if(Multimedia > 3 || Multimedia < 1){
                    System.out.println("\nMarcaste una opción inválida, intenta de nuevo");
                }
            }while(Multimedia > 3 || Multimedia < 1);
            

            if(Multimedia == 1){
                System.out.println("\nLink de la imagen:");
                linkImagen = sca.next();
                System.out.println("\nPeso de la imagen:");
                pesoImagen = sca.nextInt();
                System.out.println("\nFormato de la imagen:");
                formatoImagen = sca.next();
                System.out.println("\nResolución de la imagen:");
                megapixelImagen = sca.nextInt();
                System.out.println("\nPresiona enter al finalizar para publicar\n");
                
                Foto fo = new Foto();
                fo.setLink(linkImagen); 
                fo.setPeso(pesoImagen); 
                fo.setFormato(formatoImagen); 
                fo.setResolucion(megapixelImagen); 

                System.out.println("\n¿Deseas agregar hashtag? \n1. Si \n2. No \nmarca un número:");
                hashtag = sca.nextInt();
            
        
                if(hashtag == 1){
                    System.out.println("\nIngresa el hashtag y no olvides colocar # al inicio de la palabra");
                    hashtagValor = sca.next(); 
                    
                }
        
                if(hashtag == 2){
                    System.out.println("Continúemos...");
                    hashtagValor = "";
                }
            
                System.out.println("\nTu publicación: \n");
                System.out.println("\n********************************************************************");
                System.out.println(nombre + " " + dtm.format(LocalDateTime.now()) + " likes:" + likes);
                System.out.println(hashtagValor);
                System.out.println(linkImagen);
                System.out.println(pesoImagen + " KB, " + formatoImagen + ", " + megapixelImagen + " Megapixeles");
                System.out.println("Comentarios:");
                System.out.println("------------");

                do{
                    System.out.println("\n¿Deseas agregar comentarios o darle like?" + "\n1. Comentar \n2. Dar like \n3. Siguiente \nmarca con un número:" );
                    op1 = scan.nextInt();
                    if(op1 > 3 || op1 < 1){
                        System.out.println("\nMarcaste una opción inválida, intenta de nuevo");
                    }
                }while(op1 > 3|| op1 < 1);
                if(op1 == 1){
                    System.out.println("\nEscribe el comentario:");
                    comentario = sca.next();
                    System.out.println("\n********************************************************************");
                    System.out.println(nombre + " " + dtm.format(LocalDateTime.now()) + " likes:" + likes);
                    System.out.println(hashtagValor);
                    System.out.println(linkImagen);
                    System.out.println(pesoImagen + " KB, " + formatoImagen + ", " + megapixelImagen + " Megapixeles");
                    System.out.println("Comentarios:");
                    System.out.println("------------");
                    System.out.println("(1) " + comentario);
                    Vista vs = new Vista();
                    vs.menu1(nombre);
                    
                }
    
                if(op1 == 2){
                    likes = likes + 1;
                    System.out.println("\n********************************************************************");
                    System.out.println(nombre + dtm.format(LocalDateTime.now()) + " likes:" + likes);
                    System.out.println(hashtagValor);
                    System.out.println(linkImagen);
                    System.out.println(pesoImagen + " KB, " + formatoImagen + ", " + megapixelImagen + " Megapixeles");
                    System.out.println("Comentarios:");
                    System.out.println("------------");
                    Vista vs = new Vista();
                    vs.menu1(nombre);
                }
                if(op1 == 3){
                    Vista vs = new Vista();
                    vs.menu1(nombre);
                }
            }

            if(Multimedia == 2){
                System.out.println("\nLink del audio:");
                linkAudio = sca.next();
                System.out.println("\nPeso del audio:");
                pesoAudio = sca.nextInt();
                System.out.println("\nSampleRate del audio:");
                sampleRate = sca.nextFloat();
                System.out.println("\nBitDepth del audio:");
                bitDepth = sca.nextInt();
                System.out.println("\nPresiona enter al finalizar para publicar\n");
                
                Audio AU = new Audio();
                AU.setLink(linkAudio); 
                AU.setPeso(pesoAudio); 
                AU.setSampleRate(sampleRate); 
                AU.setBitDepth(bitDepth); 

                System.out.println("\n¿Deseas agregar hashtag? \n1. Si \n2. No \nmarca un número:");
                hashtag = sca.nextInt();
            
        
                if(hashtag == 1){
                    System.out.println("\nIngresa el hashtag y no olvides colocar # al inicio de la palabra");
                    hashtagValor = sca.next(); 
                    
                }
        
                if(hashtag == 2){
                    System.out.println("Continúemos...");
                    hashtagValor = "";
                }
            
                System.out.println("\nTu publicación: \n");
                System.out.println("\n********************************************************************");
                System.out.println(nombre + " " + dtm.format(LocalDateTime.now()) + " likes:" + likes);
                System.out.println(hashtagValor);
                System.out.println(linkAudio);
                System.out.println(pesoAudio + " KB, SampleRate:" + sampleRate + " kHz, BitDepth: " + bitDepth );
                System.out.println("Comentarios:");
                System.out.println("------------");

                do{
                    System.out.println("\n¿Deseas agregar comentarios o darle like?" + "\n1. Comentar \n2. Dar like \n3. Siguiente \nmarca con un número:" );
                    op1 = scan.nextInt();
                    if(op1 > 3 || op1 < 1){
                        System.out.println("\nMarcaste una opción inválida, intenta de nuevo");
                    }
                }while(op1 > 3|| op1 < 1);
                if(op1 == 1){
                    System.out.println("\nEscribe el comentario:");
                    comentario = sca.next();
                    System.out.println("\n********************************************************************");
                    System.out.println(nombre + " " + dtm.format(LocalDateTime.now()) + " likes:" + likes);
                    System.out.println(hashtagValor);
                    System.out.println(linkAudio);
                    System.out.println(pesoAudio + " KB, SampleRate:" + sampleRate + " kHz, BitDepth: " + bitDepth );
                    System.out.println("Comentarios:");
                    System.out.println("------------");
                    System.out.println("(1) " + comentario);
                    Vista vs = new Vista();
                    vs.menu1(nombre);
                    
                }
    
                if(op1 == 2){
                    likes = likes + 1;
                    System.out.println("\n********************************************************************");
                    System.out.println(nombre + dtm.format(LocalDateTime.now()) + " likes:" + likes);
                    System.out.println(hashtagValor);
                    System.out.println(linkAudio);
                    System.out.println(pesoAudio + " KB, SampleRate:" + sampleRate + " kHz, BitDepth: " + bitDepth );
                    System.out.println("Comentarios:");
                    System.out.println("------------");
                    Vista vs = new Vista();
                    vs.menu1(nombre);
                }
                if(op1 == 3){
                    Vista vs = new Vista();
                    vs.menu1(nombre);
                }

            }

            if(Multimedia == 3){
                System.out.println("\nLink del video:");
                linkVideo = sca.next();
                System.out.println("\nPeso del video:");
                pesoVideo = sca.nextInt();
                System.out.println("\nFrameRate:");
                frameRateVideo = sca.nextInt();
                System.out.println("\nPresiona enter al finalizar para publicar\n");
                
                Video vi = new Video();
                vi.setLink(linkVideo); 
                vi.setPeso(pesoVideo); 
                vi.setFrameRate(frameRateVideo); 

                System.out.println("\n¿Deseas agregar hashtag? \n1. Si \n2. No \nmarca un número:");
                hashtag = sca.nextInt();
            
        
                if(hashtag == 1){
                    System.out.println("\nIngresa el hashtag y no olvides colocar # al inicio de la palabra");
                    hashtagValor = sca.next(); 
                    
                }
        
                if(hashtag == 2){
                    System.out.println("Continúemos...");
                    hashtagValor = "";
                }
              
            
                System.out.println("\nTu publicación: \n");
                System.out.println("\n********************************************************************");
                System.out.println(nombre + " " + dtm.format(LocalDateTime.now()) + " likes:" + likes);
                System.out.println(hashtagValor);
                System.out.println(linkVideo);
                System.out.println(pesoVideo + " KB, FrameRtae:" + frameRateVideo + " fps");
                System.out.println("Comentarios:");
                System.out.println("------------");

                do{
                    System.out.println("\n¿Deseas agregar comentarios o darle like?" + "\n1. Comentar \n2. Dar like \n3. Siguiente \nmarca con un número:" );
                    op1 = scan.nextInt();
                    if(op1 > 3 || op1 < 1){
                        System.out.println("\nMarcaste una opción inválida, intenta de nuevo");
                    }
                }while(op1 > 3|| op1 < 1);
                if(op1 == 1){
                    System.out.println("\nEscribe el comentario:");
                    comentario = sca.next();
                    System.out.println("\n********************************************************************");
                    System.out.println(nombre + " " + dtm.format(LocalDateTime.now()) + " likes:" + likes);
                    System.out.println(hashtagValor);
                    System.out.println(linkVideo);
                    System.out.println(pesoVideo + " KB, FrameRtae" + frameRateVideo + ": fps");
                    System.out.println("Comentarios:");
                    System.out.println("------------");
                    System.out.println("(1) " + comentario);
                    Vista vs = new Vista();
                    vs.menu1(nombre);
                    
                }
    
                if(op1 == 2){
                    likes = likes + 1;
                    System.out.println("\n********************************************************************");
                    System.out.println(nombre + dtm.format(LocalDateTime.now()) + " likes:" + likes);
                    System.out.println(hashtagValor);
                    System.out.println(linkVideo);
                    System.out.println(pesoVideo + " KB, FrameRtae" + frameRateVideo + ": fps");
                    System.out.println("Comentarios:");
                    System.out.println("------------");
                    Vista vs = new Vista();
                    vs.menu1(nombre);
                }
                if(op1 == 3){
                    Vista vs = new Vista();
                    vs.menu1(nombre);
                }
            }

        }
        if(op == 3){

            DateTimeFormatter dtm = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            Scanner s = new Scanner(System.in);
            System.out.println("Ingresa el emoticon:");
            System.out.println("\nPresiona enter al finalizar para publicar\n");
            emoticon = s.nextLine();
            Emoticon em = new Emoticon();
            em.setEmoticon(emoticon); 

            System.out.println("\n¿Deseas agregar hashtag? \n1. Si \n2. No \nmarca un número:");
            hashtag = s.nextInt();
        
    
            if(hashtag == 1){
                System.out.println("\nIngresa el hashtag y no olvides colocar # al inicio de la palabra");
                hashtagValor = s.next(); 
                
            }
    
            if(hashtag == 2){
                System.out.println("Continúemos...");
                hashtagValor = "";
            }

            System.out.println("\nTu publicación: \n");
            System.out.println("\n********************************************************************");
            System.out.println(nombre + " " + dtm.format(LocalDateTime.now()) + " likes:" + likes);
            System.out.println(hashtagValor);
            System.out.println(emoticon);
            System.out.println("Comentarios:");
            System.out.println("------------");

            do{
                System.out.println("\n¿Deseas agregar comentarios o darle like?" + "\n1. Comentar \n2. Dar like \n3. Siguiente \nmarca con un número:" );
                op1 = s.nextInt();
                if(op1 > 3 || op1 < 1){
                    System.out.println("\nMarcaste una opción inválida, intenta de nuevo");
                }
            }while(op1 > 3|| op1 < 1); 

            if(op1 == 1){
                System.out.println("\nEscribe el comentario:");
                comentario = s.next();
                System.out.println("\n********************************************************************");
                System.out.println(nombre + " " + dtm.format(LocalDateTime.now()) + " likes:" + likes);
                System.out.println(hashtagValor);
                System.out.println(emoticon);
                System.out.println("Comentarios:");
                System.out.println("------------");
                System.out.println("(1) " + comentario);
                Vista vs = new Vista();
                vs.menu1(nombre);
                
            }

            if(op1 == 2){
                likes = likes + 1;
                System.out.println("\n********************************************************************");
                System.out.println(nombre + dtm.format(LocalDateTime.now()) + " likes:" + likes);
                System.out.println(hashtagValor);
                System.out.println(emoticon);
                System.out.println("Comentarios:");
                System.out.println("------------");
                Vista vs = new Vista();
                vs.menu1(nombre);
            }
            if(op1 == 3){
                Vista vs = new Vista();
                vs.menu1(nombre);
            }

        }

        if(op == 4){
            do{
                System.out.println("\nDeseas hacer busqueda por: \n1. Fecha \n2. Hashtag ");
                buscar = scan.nextInt(); 
                if(buscar > 2 || buscar < 1){
                    System.out.println("\nMarcaste una opción inválida, intenta de nuevo");
                }

            }while(buscar > 2 || buscar < 1);

            if(buscar == 1){
                System.out.println("\nEscribe la fecha en este formato Año/Mes/Día :");
                fecha = scan.next();
                System.out.println("Publicación de " + nombre);
                Vista vs = new Vista();
                vs.menu1(nombre);

            }
            if(buscar == 2){
                System.out.println("\nEscribe la referencia del hashtag con el #:");
                HasHtag = scan.next();
                System.out.println("Publicación de " + nombre);
                Vista vs = new Vista();
                vs.menu1(nombre);
                
            }
        }

    }


}