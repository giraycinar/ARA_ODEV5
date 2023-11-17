package com.giray;

import java.util.Scanner;

public class TurkceString {
    public static void main(String[] args) {

        MetinArama();
        IndexBul();
        KarakterAl();

    }//main sonu

        //Methodlar ve sýnýf kavramlarý düþünüldüðünde,
        // String deðiþkeni bir sýnýftýr ve içninde karakter dizisi iþleyen bir yapýdadýr.
        // String sýnýfýna benzer bir þekilde TurkceString diye bir sýnýf oluþturun ve içinde bir String ifade bilgisi tutsun.
        // Bu sýnýfýn içinde, karakterAl(int index), indexBul(String karakter),
        // altIfade(int balangic, int bitis) þeklinde methodlarý tanýmlayýn ve kodlayýnýz.


    public static String aranacakMetin(){




        String ifade = "Mevsimlerden güzdü. Büyük yolda iki araba urýsla koþturuyordu." +
                " Öndeki posta arabasýnda iki kadýn oturmaktaydý: Biri zayýf, solgun yüzlü bir hanýmefendi;" +
                " öteki ise parlak kýrmýzý yanaklý, gürbüz hizmetçisi. Hizmetçinin kýsa kesilmiþ kuru saçlarý," +
                " soluklaþmýþ þapkasýnýn altýndan ikide bir dýþarý kaçýyor; kýzcaðýz delik eldivenli kýzarýk elleriyle," +
                " rüzgarda uçuþan saçlarýný ikide bir düzeltiyordu. Canlý kara gözleri" +
                " kah pencerenin ötesinde hýzla geçen tarlalarda geziniyor," +
                " kah hanýmýna ürkek ürkek bakýyor kah arabanýn köþelerinde tasayla dolaþýyordu." +
                " Hanýmefendinin file içinde arabanýn tavanýna asýlmýþ þapkasý bumuna deðecekmiþ gibi," +
                " bir ileri bir geri gidip gidip geliyordu. Kýzýn dizlerinin üstünde bir köpek yavrusu vardý." +
                " Ayaklarýný döþemede duran bir kutunun üstüne koymuþtu;" +
                " araba sarsýldýkça yaylarýn çýkardýðý gýcýrtý ile camlarýn þýngýrtýsýna uygun olarak," +
                " zor iþitilir bir sesle bu kutuyu týkýrdatýyordu. ";
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

        // Metin içinde index'i bulma
        int index = metin.indexOf(aranan);

        if (index != -1) {
            System.out.println("'" + aranan + "' metinde bulunuyor. Baþlangýç index'i: " + index);
            System.out.println("'" + aranan + "Bitiþ Ýndex'i: " + (index+aranan.length()));
        } else {
            System.out.println("'" + aranan + "' metinde bulunmuyor.");

        }
    }

    public static void KarakterAl(){
        Scanner scanner = new Scanner(System.in);
        String metin;
        metin = aranacakMetin();
        System.out.println("Ýstenilen karakter numarasýný giriniz... : ");
        // kullanýcýdan karakter numarasý isteyelim.
        int num= scanner.nextInt();

        char index = metin.charAt(num);
        System.out.println(index);
    }
}


