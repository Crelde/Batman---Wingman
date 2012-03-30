package Opg84;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class Currencies {
  public static void main(String[] args)  {
    String address = "http://www.nationalbanken.dk/dndk/valuta.nsf/valuta.xml";

    try{
      URL url = new URL(address);
      InputStream inputStream = url.openStream();
      File file = new File("./rates.xml");


      try(BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream); 
          BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(
              new FileOutputStream(file));) {

        byte[] buffer = new byte[1024];

        int bytesRead = 0;
        while ((bytesRead = bufferedInputStream.read(buffer)) != -1) {
          //Write chuncks of 1024 bytes. Then write the remaining bytes.
          bufferedOutputStream.write(buffer, 0, bytesRead);
        }
      } 

    }
    catch (MalformedURLException | FileNotFoundException e ) {
      throw new RuntimeException("Unknown Resource", e);
    }  catch (IOException e) {
      throw new RuntimeException("Some other fault", e);
    }
  }
}