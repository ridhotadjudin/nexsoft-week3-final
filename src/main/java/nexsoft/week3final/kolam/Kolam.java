package nexsoft.week3final.kolam;

public class Kolam {

	public double kelilingKolam(double panjang, double lebar, double tinggi) {
		double hasil = (panjang + lebar + tinggi) * 4;
		return hasil;
	}

	public double volumeKolam(double panjang, double lebar, double tinggi) {
		return panjang * lebar * tinggi;
	}
}
