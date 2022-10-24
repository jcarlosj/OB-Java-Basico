package com.github.jcarlosj;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class FileIOStream {
    public static void main(String[] args) {
        ArrayList<String> arrText = new ArrayList<String>();

        File file = createFile();
        writeArrayFile( file );
        arrText = readArrayFile( file );

        for( String line : arrText ) {
            System.out.println( line );
        }
    }

    // Codigo para crear un archivo
    public static File createFile() {
        File file = new File( "sample.txt" );      // Instancia que representa al archivo, no su creación

        if( ! file.exists() ) {                             // Verificamos si el archivo existe
            try {
                file.createNewFile();                       // Crea el archivo
            }
            catch( IOException e ) {
                e.printStackTrace();
            }
        }

        return file;
    }

    public static void writeArrayFile( File file ) {
        // Escribiendo texto en el archivo creado usando FileOutputStream
        try {
            FileOutputStream fos = new FileOutputStream( file );

            for ( String string : Arrays.asList( "Hola estamos escribiendo este archivo", "Buen dia!" ) ) {
                string += "\n";
                fos.write( string.getBytes() );
            }

            fos.flush();
            fos.close();
        }
        catch( IOException e ) {
            System.out.println( e.getMessage() );
        }
    }

    public static void writeTextFile( File file ) {
        // Escribiendo texto en el archivo creado usando FileOutputStream
        try {
            FileOutputStream fos = new FileOutputStream( file );
            String text = "Hola este es un primer registro";

            text += "\n";
            fos.write( text.getBytes() );

            fos.flush();
            fos.close();
        }
        catch( IOException e ) {
            System.out.println( e.getMessage() );
        }
    }

    public static String readTextFile( File file ) {
        String text = "";

        // Leyendo texto del archivo usando FileInputStream
        try {
            FileInputStream fis = new FileInputStream( file );
            int ascii = fis.read();

            while( ascii != -1  ) {
                char character = (char) ascii;

                text += character;
                ascii = fis.read();
            }

            fis.close();
        }
        catch( IOException e ) {
            System.out.println( e.getMessage() );
        }

        return text;
    }

    public static ArrayList<String> readArrayFile( File file ) {
        ArrayList<String> arrText = new ArrayList<String>();
        String text = "";

        // Leyendo texto del archivo usando FileInputStream
        try {
            FileInputStream fis = new FileInputStream( file );
            int ascii = fis.read();

            while( ascii != -1  ) {
                char character = (char) ascii;

                if( ascii != 10 ) {
                    text += character;    
                }
                else {
                    arrText.add( text );
                    text = "";
                }
                
                ascii = fis.read();
            }

            fis.close();
        }
        catch( IOException e ) {
            System.out.println( e.getMessage() );
        }

        return arrText;
    }
}
