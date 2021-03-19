package com.juaracoding.ujian2;


import java.lang.Math;
import java.util.Scanner;

public class Main {
	

     public static void main(String[] args) {
    	 // input tanggal
    	 Scanner sc = new Scanner (System.in);
    	 System.out.println("Masukan Tanggal :");
    	 int d=sc.nextInt();
    	 System.out.println("Masukan Bulan :");
    	 int m=sc.nextInt();
    	 System.out.println("Masukan Tahun :");
    	 int y=sc.nextInt();
    	 System.out.println("Masukan Banyak Pinjaman :");
    	 int platfon = sc.nextInt();
    	 System.out.println("Masukan besar bunga pertahun :");
    	 float bunga = sc.nextFloat();
    	 System.out.println("Masukan durasi lama peminjaman :");
    	 int lp = sc.nextInt();
    	 
    	 for(int i = 1; i < lp+1; i++ ) {
    		if(i < 2) {
    	 double v = (1 + (bunga / 12));
         double t = (-(lp / 12) * 12);
         double totalAngsuran = (platfon * (bunga / 12)) / (1 - Math.pow(v, t));
         double angsuranBunga = bunga/12*totalAngsuran;
         double angsuranPokok = totalAngsuran - angsuranBunga;
         double sisaPinjaman = platfon - angsuranPokok;
         
    	 
         System.out.println("-------------------------");
         System.out.println("Ini adalah angsuran ke-1");
    	 System.out.println("Tanggal = "+d+"/"+m+"/"+y);
    	 System.out.println("Banyak pinjaman = "+platfon);
    	 System.out.println("Besar bunga = "+bunga);
    	 System.out.println("Lama peminjaman = "+lp);
    	 System.out.println("-------------------------");
    	 System.out.println(totalAngsuran);
    	 System.out.println(angsuranBunga);
    	 System.out.println(angsuranPokok);
    	 System.out.println(sisaPinjaman);
    		} else {
    			double v = (1 + (bunga / 12));
    	         double t = (-(lp / 12) * 12);
    	         double totalAngsuran = (platfon * (bunga / 12)) / (1 - Math.pow(v, t));
    	         double angsuranBunga = bunga/12*totalAngsuran;
    	         double angsuranPokok = totalAngsuran - angsuranBunga;
    	         double sisaPinjaman = platfon - angsuranPokok;
    	         
    	    	 
    	         System.out.println("-------------------------");
    	         System.out.println("Ini adalah angsuran ke-"+ i);
    	    	 System.out.println("Tanggal = "+d+"/"+m+"/"+y);
    	    	 System.out.println("Banyak pinjaman = "+platfon);
    	    	 System.out.println("Besar bunga = "+bunga);
    	    	 System.out.println("Lama peminjaman = "+lp);
    	    	 System.out.println("-------------------------");
    	    	 System.out.println(totalAngsuran);
    	    	 System.out.println(angsuranBunga);
    	    	 System.out.println(angsuranPokok);
    	    	 System.out.println(sisaPinjaman);
    		}
    	 }
    	 
    }

	private static float pow(float f, int lp) {
		// TODO Auto-generated method stub
		return 0;
	}
}

