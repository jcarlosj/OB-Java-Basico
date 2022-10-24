import com.github.jcarlosj.Ejercicio789;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Stream {
    public static void main(String[] args) {
        String absoluteFilePath = getCurrentPath() + getCurrentPackagePath() + "/";

        try {
            File inputFile = new File( absoluteFilePath + "data.txt" );
            File outputFile = new File( absoluteFilePath + "outagain.txt" );

            FileInputStream fis = new FileInputStream(inputFile);
            FileOutputStream fos = new FileOutputStream(outputFile);
            int c;

            while ((c = fis.read()) != -1) {
                fos.write(c);
            }

            fis.close();
            fos.close();
        } catch (FileNotFoundException e) {
            System.err.println("FileStreamsTest: " + e);
        } catch (IOException e) {
            System.err.println("FileStreamsTest: " + e.getMessage() );
        }
    }

    public static String getCurrentPath() {
        Path currentRelativePath = Paths.get( "" );            // Current Relative Path

        return currentRelativePath.toAbsolutePath().toString();     // Current Absolute Path
    }
    public static String getCurrentPackagePath() {
        Ejercicio789 object = new Ejercicio789();
        String packageName = object.getClass().getPackage().getName();
        String packagePath = packageName.replaceAll( "\\.", "/" ); // Current Package Path

        return "/src/" + packagePath;
    }
}