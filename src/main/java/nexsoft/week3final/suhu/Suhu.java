package nexsoft.week3final.suhu;

public class Suhu {

	public double konversiSuhu(double fahrenheit) {
		double hasilC = (fahrenheit - 32) * 5 / 9;
		return hasilC;
	}
}
