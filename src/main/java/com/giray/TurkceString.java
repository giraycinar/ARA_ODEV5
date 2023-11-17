package com.giray;

import java.util.Scanner;

public class TurkceString {
    public static void main(String[] args) {

        MetinArama();
        IndexBul();
        KarakterAl();

    }//main sonu

        //Methodlar ve s�n�f kavramlar� d���n�ld���nde,
        // String de�i�keni bir s�n�ft�r ve i�ninde karakter dizisi i�leyen bir yap�dad�r.
        // String s�n�f�na benzer bir �ekilde TurkceString diye bir s�n�f olu�turun ve i�inde bir String ifade bilgisi tutsun.
        // Bu s�n�f�n i�inde, karakterAl(int index), indexBul(String karakter),
        // altIfade(int balangic, int bitis) �eklinde methodlar� tan�mlay�n ve kodlay�n�z.


    public static String aranacakMetin(){




        String ifade = "Mevsimlerden g�zd�. B�y�k yolda iki araba ur�sla ko�turuyordu." +
                " �ndeki posta arabas�nda iki kad�n oturmaktayd�: Biri zay�f, solgun y�zl� bir han�mefendi;" +
                " �teki ise parlak k�rm�z� yanakl�, g�rb�z hizmet�isi. Hizmet�inin k�sa kesilmi� kuru sa�lar�," +
                " solukla�m�� �apkas�n�n alt�ndan ikide bir d��ar� ka��yor; k�zca��z delik eldivenli k�zar�k elleriyle," +
                " r�zgarda u�u�an sa�lar�n� ikide bir d�zeltiyordu. Canl� kara g�zleri" +
                " kah pencerenin �tesinde h�zla ge�en tarlalarda geziniyor," +
                " kah han�m�na �rkek �rkek bak�yor kah araban�n k��elerinde tasayla dola��yordu." +
                " Han�mefendinin file i�inde araban�n tavan�na as�lm�� �apkas� bumuna de�ecekmi� gibi," +
                " bir ileri bir geri gidip gidip geliyordu. K�z�n dizlerinin �st�nde bir k�pek yavrusu vard�." +
                " Ayaklar�n� d��emede duran bir kutunun �st�ne koymu�tu;" +
                " araba sars�ld�k�a yaylar�n ��kard��� g�c�rt� ile camlar�n ��ng�rt�s�na uygun olarak," +
                " zor i�itilir bir sesle bu kutuyu t�k�rdat�yordu. ";
        return ifade;
    }







    public static void MetinArama() {
        Scanner scanner = new Scanner(System.in);


        String metin;

        System.out.print("Aranacak kelimeyi girin: ");
        String arananKelime = scanner.nextLine();

        metin=aranacakMetin();

        if (metin.contains(arananKelime)) {
            System.out.println("'" + arananKelime + "' kelimesi metinde bulunuyor.");
        } else {
            System.out.println("'" + arananKelime + "' kelimesi metinde bulunmuyor.");
        }

    }
    public static void IndexBul(){
        Scanner scanner = new Scanner(System.in);
        String metin;
        metin=aranacakMetin();



        System.out.print("Aranacak karakteri veya alt diziyi girin: ");
        String aranan = scanner.nextLine();

        // Metin i�inde index'i bulma
        int index = metin.indexOf(aranan);

        if (index != -1) {
            System.out.println("'" + aranan + "' metinde bulunuyor. Ba�lang�� index'i: " + index);
            System.out.println("'" + aranan + "Biti� �ndex'i: " + (index+aranan.length()));
        } else {
            System.out.println("'" + aranan + "' metinde bulunmuyor.");

        }
    }

    public static void KarakterAl(){
        Scanner scanner = new Scanner(System.in);
        String metin;
        metin = aranacakMetin();
        System.out.println("�stenilen karakter numaras�n� giriniz... : ");
        // kullan�c�dan karakter numaras� isteyelim.
        int num= scanner.nextInt();

        char index = metin.charAt(num);
        System.out.println(index);
    }
}


