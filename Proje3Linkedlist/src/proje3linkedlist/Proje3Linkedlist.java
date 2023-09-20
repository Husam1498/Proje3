package proje3linkedlist;

import java.util.Random;
/**
 *
 * @author HUSAM
 */

/*
    Burda bağlı liste kullanarak verilerimi tutmayı tercih ettim
    Bağlı liste sınıfından bir sınıf türetir
    javanın random sınıfından yardımalarak rastgele sayı üretip daha önce 
    eklediğim verilerde bu veri varsa ekleme yapmıyacak ve döngüye geri dönecek
    eklediğim verilerde yok ise yeni bir node türünde nesne oluşturup sayıyı ekliyecek
    ekleme işleminden sonra veri setimi yazdırdım sonra
    normalizasyon hesaplamasında min ve max değerini bulup normalizasyon değerlerini
    yazdırdım
    
    
*/
public class Proje3Linkedlist {

    public static void main(String[] args) {
        Bagliliste bl=new Bagliliste();        
        Random random=new Random();
        int diziElemanSayisi=5;
        int rastgeleSayiAraligi=50;
        while(bl.es<diziElemanSayisi){
            int sayi=random.nextInt(rastgeleSayiAraligi)+1;//1-rastgeleSayiAraligi arassında değerler verir
            if(!bl.ara(sayi)){ //eleman dizide yoksa eğer diziye ekleme yapar
                Node n=new Node(sayi);
                bl.add(n);
                bl.veriSetiYazdir();
                bl.normalizasyonHesaplaYazdir();
            }          
        }     
    }    
}
