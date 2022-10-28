package com.github.jcarlosj.xml;

import com.github.jcarlosj.Ejercicio789;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        String absoluteFilePath = getCurrentPath() + getCurrentPackagePath() + "/";


        File file = new File( absoluteFilePath + "data.xml" );
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();

        try {
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();

            try {
                // Analizamos el documento
                Document document = documentBuilder.parse( file );

                //
                String username = document.getElementsByTagName( "username" ).item( 0 ).getTextContent();
                String password = document.getElementsByTagName( "password" ).item( 0 ).getTextContent();
                String site = document.getElementsByTagName( "site" ).item( 0 ).getTextContent();

                System.out.println( "username: " + username + "\npassword: " + password + "\nsite: " + site );

                NamedNodeMap attributes = document.getElementsByTagName( "videos" ).item( 0 ).getAttributes();

                System.out.println( "Videos (atributos)" );
                for ( int i = 0; i < attributes.getLength(); i++ ) {
                    String attributeName = attributes.item( i ).getNodeName();
                    String attributeValue = attributes.item( i ).getNodeValue();

                    System.out.println( "\t" + attributeName + ": " + attributeValue );
                }

                //
                NodeList videos = document.getElementsByTagName( "videos" );

                System.out.println( "Videos (listado)" );
                for ( int i = 0; i < videos.getLength(); i++ ) {
                    Node video = videos.item( i );
                    System.out.println( video.getTextContent() );
                }

            }
            catch( Exception e ) {
                System.out.println( "Error procesando documento " + e.getMessage() );
            }
        }
        catch( Exception e ) {
            System.out.println( "Error abriendo el documento " + e.getMessage() );
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
