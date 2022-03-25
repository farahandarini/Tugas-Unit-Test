package tugas1.produk;

import static org.junit.Assert.*;


import org.junit.Test;

public class ProdukTest {

	// instans dari produk
	Produk produk = new Produk();
		
	@Test
	public void produkIDTest() {
		produk.setProdukId(1);
		int produkID = produk.getProdukId();
		assertEquals(1, produkID);
	}
	
	@Test
	public void produkNameTest() {
		produk.setProdukName("Emina");
		String produkName = produk.getProdukName();
		assertEquals("Emina", produkName);
	}
	
	@Test
	public void produkCategoryTest() {
		produk.setProdukCategory("Kecantikan");
		String produkCategory = produk.getProdukCategory();
		assertEquals("Kecantikan", produkCategory);
	}
	
	@Test
	public void produkPriceTest() {
		produk.setProdukPrice("Rp12.000,00");
		String produkPrice = produk.getProdukPrice();
		assertEquals("Rp12.000,00", produkPrice);
	}

}
