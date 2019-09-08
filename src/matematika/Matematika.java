/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematika;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Matematika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner mtk = new Scanner(System.in);
       Perhitungan hasil = new Perhitungan();
       String Y = new String();
       do{
        System.out.println("===BANGUN RUANG===");
        System.out.println("1. Tabung");
        System.out.println("2. Kerucut");
        System.out.println("3. Bola");
        System.out.print("Pilih   : ");
        int pilih = mtk.nextInt();
        switch(pilih){
            case 1: System.out.println("===TABUNG===");
                    System.out.println("1. Menghitung Luas!");
                    System.out.println("2. Menghitung Volume!");
                    System.out.print("Pilih   : ");
                    int tabung = mtk.nextInt();
                    switch(tabung){
                        case 1: System.out.println("\tMenghitung Luas Tabung");
                                System.out.print("\tJari-jari    : ");
                                double a = mtk.nextDouble();
                                System.out.print("\tTinggi Tabung: ");
                                double b = mtk.nextDouble();
                                System.out.println("\tHasil      : " +hasil.luastabung(a, b));
                        break;
                        case 2: System.out.println("\tMenghitung Volume Tabung");
                                System.out.print("\tJari-jari    : ");
                                double c = mtk.nextDouble();
                                System.out.print("\tTinggi Tabung: ");
                                double d = mtk.nextDouble();
                                System.out.println("\tHasil      : " +hasil.volumetabung(c, d));
                        break;
                        default:
                                System.out.println("Tidak ada pilihan!");
                        break;}
            break;
            case 2: System.out.println("===KERUCUT===");
                    System.out.println("1. Menghitung Luas!");
                    System.out.println("2. Menghitung Volume!");
                    System.out.print("Pilih   : ");
                    int kerucut = mtk.nextInt();
                    switch(kerucut){
                        case 1: System.out.println("\tMenghitung Luas Kerucut");
                                System.out.print("\tJari-jari     : ");
                                double e = mtk.nextDouble();
                                System.out.print("\tSisi miring   : ");
                                double f = mtk.nextDouble();
                                System.out.println("\tHasil         : " +hasil.luaskerucut(e, f));
                        break;
                        case 2: System.out.println("\tMenghitung Volume Kerucut");
                                System.out.print("\tJari-jari     : ");
                                double g = mtk.nextDouble();
                                System.out.print("\tTinggi Kerucut: ");
                                double h = mtk.nextDouble();
                                System.out.println("\tHasil         : " +hasil.volumekerucut(g, h));
                        break;
                        default:
                                System.out.println("Tidak ada pilihan!");
                        break;}
            break;
            case 3: System.out.println("===BOLA===");  
                    System.out.println("1. Menghitung Luas!");
                    System.out.println("2. Menghitung Volume!");
                    System.out.print("Pilih : ");
                    int bola = mtk.nextInt();
                    switch(bola){
                        case 1: System.out.println("\tMenghitung Luas Bola");
                                System.out.print("\tJari-jari    : ");
                                double i = mtk.nextDouble();
                                System.out.println("\tHasil        : " +hasil.luasbola(i));
                        break;
                        case 2: System.out.println("\tMenghitung Volume Bola");
                                System.out.print("\tJari-jari    : ");
                                double j = mtk.nextDouble();
                                System.out.println("\tHasil      : " +hasil.volumebola(j));
                        break;
                        default:
                                System.out.println("Tidak ada pilihan!");
                        break;}
            break;
            default:
                    System.out.println("Tidak ada pilihan!");
            break;}
            System.out.print("Kembali ke menu?<Y/N> ");
            mtk.nextLine();
            Y = mtk.nextLine();}
            while(Y.equals("y"));
    }}

