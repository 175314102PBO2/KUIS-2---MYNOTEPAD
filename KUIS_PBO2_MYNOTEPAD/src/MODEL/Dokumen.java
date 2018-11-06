/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ACER
 */
public class Dokumen {

    private String isi;

    public Dokumen() {
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }

    public String getIsi() {
        return isi;
    }

    public void bacaDariFile(File file) {
        FileInputStream fis;
        try {
            fis = new FileInputStream(file);
            String hasil = "";
            int dataInt;
            while ((dataInt = fis.read()) != -1) {
                hasil = hasil + (char) dataInt;
            }
            setIsi(hasil);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Dokumen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Dokumen.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public int hitungJumlahKata() {
        return isi.split(" ").length;

    }

    public void simpanKeFile(File file) {
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream(file);
            String data = this.getIsi();
            fos.write(data.getBytes());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Dokumen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Dokumen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
