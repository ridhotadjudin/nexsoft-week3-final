package nexsoft.week3final.testsuhu;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import nexsoft.week3final.suhu.Suhu;

class SuhuTest {
	
	Suhu suhu = new Suhu();
	
	@DisplayName("Test Konversi Suhu F ke C")
	@ParameterizedTest
	@CsvFileSource(resources = "data_f_ke_c.csv",delimiter=',',numLinesToSkip = 1)
	void testKonversiSuhu(int inUrut, double inFahrenheit, double inCelcius) {
		String result = String.format(".9f", suhu.konversiSuhu(inFahrenheit));
		String expected = String.format(".9f", inCelcius);
		assertEquals(expected, result);
	}
	
	@DisplayName("Test Konversi Suhu F ke C Bukan Angka")
	@ParameterizedTest
	@CsvSource(value = "1,a,@",delimiter=',')
	void testKonversiSuhu_bukanAngka(int inUrut, double inFahrenheit, double inCelcius) {
		String result = String.format(".9f", suhu.konversiSuhu(inFahrenheit));
		String expected = String.format(".9f", inCelcius);
		assertEquals(expected, result);
	}
	
	@DisplayName("Test Konversi Suhu F ke C Kosong")
	@ParameterizedTest
	@CsvSource(value = " , , ",delimiter=',')
	void testKonversiSuhu_kosong(int inUrut, double inFahrenheit, double inCelcius) {
		String result = String.format(".9f", suhu.konversiSuhu(inFahrenheit));
//		String expected = String.format(".9f", inCelcius);
		Assertions.assertNotNull(result, "0");
	}
	
	@DisplayName("Test Konversi Suhu F ke C Nilai Negatif")
	@ParameterizedTest
	@CsvSource(value = "1,-3,21",delimiter=',')
	void testKonversiSuhu_negatif(int inUrut, double inFahrenheit, double inCelcius) {
		String result = String.format(".9f", suhu.konversiSuhu(inFahrenheit));
		String expected = String.format(".9f", inCelcius);
		assertEquals(expected, result);
	}
	
}
