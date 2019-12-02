package id.ac.unpas.kakas.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import id.ac.unpas.kakas.Hitung;

public class Test1 {
	Hitung hitung = new Hitung();
	@Test
	public void test() {
		int h = hitung.tambah(1, 3);
		assertEquals(h, 4);
	}
	@Test
	public void test2() {
		int h = hitung.kurang(2, 1);
		assertEquals(h, 1);
	}
	@Test
	public void test3() {
		int h = hitung.kali(2, 1);
		assertEquals(h, 2);
	}
	@Test
	public void test4() {
		int h = hitung.bagi(4,2);
		assertEquals(h, 2);
	}

}
