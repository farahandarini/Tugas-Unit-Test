package tugas1.produkdao;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import tugas1.produk.Produk;

@RunWith(MockitoJUnitRunner.class)
public class ProdukDAOTest {
	
	// objek produkdao
	private static ProdukDAO mockProdukDAO = mock(ProdukDAO.class);
	private static ProdukDAO produkDAO = new ProdukDAO();

	// objek produk
	private static Produk produk1 = new Produk(1, "Emina", "Kecantikan", "Rp12.000,00");
	private static Produk produk2 = new Produk(2, "Pixy", "Kecantikan", "Rp30.000,00");

	@Test
	public void getAllTest() {
		when(mockProdukDAO.getAll()).thenReturn(Arrays.asList(produk1, produk2));
		List allProduk = mockProdukDAO.getAll();
	
		assertNotNull(allProduk);
		assertEquals(2, allProduk.size());
	}

	@Test
	public void getProdukTest() {
		when(mockProdukDAO.getProduk(1)).thenReturn(produk1);
		Produk produk = mockProdukDAO.getProduk(1);
	
		assertNotNull(produk);
		assertEquals(1, produk.getProdukId());
		assertEquals("Emina", produk.getProdukName());
		assertEquals("Kecantikan", produk.getProdukCategory());
		assertEquals("Rp12.000,00", produk.getProdukPrice());
	}
	
	@Test
	public void editNamaProdukTest() {
		produkDAO.editNamaProduk("Garnier", produk2);
		
//		String produk2edit = mockProdukDAO.getInstance().editNamaProduk("Garnier", produk2);
		
		when(mockProdukDAO.editNamaProduk("Garnier", produk2)).thenReturn(produk2.getProdukName());
		String produkName = mockProdukDAO.editNamaProduk("Garnier", produk2);
	
		assertNotNull(produkName);
		assertEquals("Garnier", produkName);
	}
	
	@Test
	public void editCategoryProdukTest() {
		produkDAO.editCategoryProduk("Produk Kecantikan", produk2);
		
//		String produk2kategori = mockProdukDAO.getInstance().editCategoryProduk("Produk Kecantikan", produk2);
		
		when(mockProdukDAO.editCategoryProduk("Produk Kecantikan", produk2)).thenReturn(produk2.getProdukCategory());
		String produkkategori = mockProdukDAO.editCategoryProduk("Produk Kecantikan", produk2);
	
		assertNotNull(produkkategori);
		assertEquals("Produk Kecantikan", produkkategori);
	}
	
	@Test
	public void editPriceProdukTest() {
		produkDAO.editPriceProduk("RP50.000,00", produk2);
		
//		String produk2price = mockProdukDAO.getInstance().editPriceProduk("RP50.000,00", produk2);
		
		when(mockProdukDAO.editPriceProduk("RP50.000,00", produk2)).thenReturn(produk2.getProdukPrice());
		String produkprice = mockProdukDAO.editPriceProduk("RP50.000,00", produk2);
	
		assertNotNull(produkprice);
		assertEquals("RP50.000,00", produkprice);
	}
}
