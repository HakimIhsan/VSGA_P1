package com.example.hp.vsga_p1.java;

import com.example.hp.vsga_p1.java.music.Gitar;
import com.example.hp.vsga_p1.java.kendaraan.*;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Gitar.bunyi(); //class gitar fungsi bunyi

        Gitar gitar = new Gitar();

        Kereta.jumlahBan();
        Mobil.jumlahBan();
        Motor.jumlahBan();

        int nilaiA = 10;
        float nilaiB = 70;
        double nilaiC = 80;
        double total = nilaiC/nilaiA;
        int total2 = (int) nilaiC/nilaiA;

        System.out.println("Total : "+total+"\nTOTAL2 : "+total2);

        String namaDepan ="Hakim";
        String namaBelakang ="Ihsan";

        System.out.println(namaDepan+" "+namaBelakang);
        System.out.println(namaBelakang.length());
        System.out.println(namaDepan.charAt(3)+"Hakim");
        System.out.println(namaBelakang!=namaDepan);

        while(nilaiA<90)
            for(int x=0;x<nilaiB;x++)
        switch(nilaiA){
            case 10 :
                System.out.println(namaBelakang+" "+(namaBelakang.length()+x-nilaiA));
                nilaiA+=80;break;
            case 70 :
                System.out.println(70-x);break;
                default :
                    if(namaBelakang.isEmpty())
                    System.out.println("haHa");
                    else System.out.println("Ok sabar"+x);
        }
    }
}
