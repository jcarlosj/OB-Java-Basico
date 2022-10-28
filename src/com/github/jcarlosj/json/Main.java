package com.github.jcarlosj.json;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.json.*;

public class Main {
    public static void main(String[] args) {
        String absoluteFilePath = getCurrentPath() + getCurrentPackagePath() + "/";

        try {
            // Creamos el InputStream desde el fichero
            InputStream is = new FileInputStream( absoluteFilePath + "data.json" );

            // Creamos un tokenizador que leerá nuestros InputStream
            JSONTokener tokener = new JSONTokener( is );

            // Creamos una instancia de JSONObject y le pasamos nuestro InputStream tokenizado
            JSONObject obj = new JSONObject( tokener );     //  Lee caracter a caracter, convirtiendo a memoria la representacion textual del JSON

            // Obtenemos el objeto credentials
            JSONObject objCredentials = obj.getJSONObject( "credentials" );

            String username = objCredentials.getString( "username" );
            String password = objCredentials.getString( "password" );
            String site = objCredentials.getString( "site" );

            System.out.println( "username: " + username + "\npassword: " + password + "\nsite: " + site );

            // Obtenemos los videos
            JSONArray videos = objCredentials.getJSONArray( "videos" );

            System.out.println( "Videos (listado)" );
            for ( Object video : videos ) {
                System.out.println( "\t" + video.toString() );
            }

        }
        catch (Exception e) {
            System.out.println( "Error procesando documento " + e.getMessage() );
        }


    }

    public static String getCurrentPath() {
        Path currentRelativePath = Paths.get( "" );            // Current Relative Path

        return currentRelativePath.toAbsolutePath().toString();     // Current Absolute Path
    }

    public static String getCurrentPackagePath() {
        Main object = new Main();
        String packageName = object.getClass().getPackage().getName();
        String packagePath = packageName.replaceAll( "\\.", "/" ); // Current Package Path

        return "/src/" + packagePath;
    }
}
