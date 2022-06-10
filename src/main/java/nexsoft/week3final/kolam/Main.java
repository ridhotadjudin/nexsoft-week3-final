package nexsoft.week3final.kolam;

import nexsoft.week3final.suhu.Suhu;

public class Main {

	public static void main(String[] args) {
		
		Kolam kolam = new Kolam();
		System.out.println(kolam.kelilingKolam(5.5, 12, 3));
		
		Suhu suhu = new Suhu();
		System.out.println(suhu.konversiSuhu(24));

	}

}
