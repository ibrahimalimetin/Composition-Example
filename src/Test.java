/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ibrahim Ali Metin
 */
public class Test {
    public static void main(String[] args) {
        
        Resolution resolution = new Resolution(1920, 1080);
        
        Monitor monitor = new Monitor("V243", "HP", "21,5", resolution);
        
        Kasa kasa = new Kasa("450 G3", "HP", "Plastik");
        
        Anakart anakart = new Anakart("B250 PRO", "ASUS", 10, "Win10");
        
        Bilgisayar pc = new Bilgisayar(monitor, kasa, anakart);
        
        pc.getKasa().bilgisayi_ac(); 
        // Composition 'un genel mantığı budur. İç içe objelere referanslar sayesinde erişimi sağlar.
        pc.getMonitor().monitoru_kapat();
        // Composition 'da sahiplik ilişkisi var!
        pc.getAnakart().isletim_sistemi_yukle("MAC OS");
    }
}
