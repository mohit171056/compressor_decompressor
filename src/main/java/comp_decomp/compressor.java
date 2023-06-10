
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp_decomp;

import java.io.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 *
 * @author mohit
 */
import java.util.*;
import java.io.*;
public class compressor {
    public static void method(File file) throws IOException{
        String fileDirectory=file.getParent();
        System.out.println(fileDirectory);
        
        FileInputStream fis=new FileInputStream(file);
        FileOutputStream fos=new FileOutputStream(fileDirectory+"/Compressedfile.gz");
        
        GZIPOutputStream gzipOS=new GZIPOutputStream(fos);
        
        byte[] buffer=new byte[1024];
        int len;
        
        
        while((len=fis.read(buffer))!=-1){
            //System.out.println(len+" "+Arrays.toString(buffer));
            gzipOS.write(buffer,0,len);
        }
        
        gzipOS.close();
        fis.close();
        fos.close();
        
    }

}