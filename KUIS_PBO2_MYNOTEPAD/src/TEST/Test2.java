/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TEST;

import java.io.File;
import java.io.IOException;
import MODEL.Dokumen;

/**
 *
 * @author user only
 */
public class Test2 {
    public static void main(String[] args)  {
        Dokumen test = new Dokumen();
        test.setIsi("ini isi dokumen");
        test.simpanKeFile(new File("dok.dat"));
    }
}
