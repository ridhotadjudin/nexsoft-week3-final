package nexsoft.week3final.testkolam;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import nexsoft.week3final.kolam.Kolam;

class KolamTest {
	
	Kolam kolam = new Kolam();
	
	@DisplayName("Test Fungsi Keliling Kolam")
	@ParameterizedTest
	@CsvFileSource(resources = "data_keliling_kolam.csv",delimiter=',',numLinesToSkip = 1)
	void testKelilingKolam(double inUrut, double inPanjang, double inLebar, double inTinggi, double inHasil) {
		double result = kolam.kelilingKolam(inPanjang, inLebar, inTinggi);
		assertEquals(inHasil, result);
	}
	
	@Disabled
	@DisplayName("Test Fungsi Keliling Kolam Dengan Data Bukan Angka")
	@ParameterizedTest
	@CsvFileSource(resources = "data_keliling_kolam_bukanangka.csv",delimiter=',',numLinesToSkip = 1)
	void testKelilingKolam_dataBukanAngka(String inString) {
		
	}
	
	@DisplayName("Test Fungsi Keliling Kolam Dengan Data Negatif")
	@ParameterizedTest
	@CsvFileSource(resources = "data_keliling_kolam_negatif.csv",delimiter=',',numLinesToSkip = 1)
	void testKelilingKolam_dataNegatif(double inUrut, double inPanjang, double inLebar, double inTinggi, double inHasil) {
		double result = kolam.kelilingKolam(inPanjang, inLebar, inTinggi);
		assertEquals(inHasil, result);
	}
	
	@DisplayName("Test Fungsi Keliling Kolam Dengan Data Kosong")
	@ParameterizedTest
	@CsvSource(value = " , , , , ",delimiter=',')
	void testKelilingKolam_dataKosong(double inUrut, double inPanjang, double inLebar, double inTinggi, double inHasil) {
		double result = kolam.kelilingKolam(inPanjang, inLebar, inTinggi);
		assertEquals(inHasil, result);
	}
	
	@DisplayName("Test Fungsi Volume Kolam")
	@ParameterizedTest
	@CsvFileSource(resources = "data_volume_kolam.csv",delimiter=',',numLinesToSkip = 1)
	void testVolumeKolam(double inUrut, double inPanjang, double inLebar, double inTinggi, double inHasil) {
		double result = kolam.volumeKolam(inPanjang, inLebar, inTinggi);
		assertEquals(inHasil, result);
	}
	
	@Disabled
	@DisplayName("Test Fungsi Volume Kolam Dengan Data Bukan Angka")
	@ParameterizedTest
	@CsvSource(value = "1,a,3,@,6",delimiter=',')
	void testVolumeKolam_dataBukanAngka(String inString) {
		
	}
	
	@DisplayName("Test Fungsi volume Kolam Dengan Data Negatif")
	@ParameterizedTest
	@CsvFileSource(resources = "data_volume_kolam_negatif.csv",delimiter=',',numLinesToSkip = 1)
	void testVolumeKolam_dataNegatif(double inUrut, double inPanjang, double inLebar, double inTinggi, double inHasil) {
		double result = kolam.kelilingKolam(inPanjang, inLebar, inTinggi);
		assertEquals(inHasil, result);
	}
	
	@DisplayName("Test Fungsi Volume Kolam Dengan Data Kosong")
	@ParameterizedTest
	@CsvSource(value = " , , , , ",delimiter=',')
	void testVolumeKolam_dataKosong(double inUrut, double inPanjang, double inLebar, double inTinggi, double inHasil) {
		double result = kolam.kelilingKolam(inPanjang, inLebar, inTinggi);
		assertEquals(inHasil, result);
	}

}
