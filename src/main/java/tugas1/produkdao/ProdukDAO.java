package tugas1.produkdao;

import static org.junit.Assert.assertEquals;

import java.util.Collections;
import java.util.List;

import tugas1.produk.Produk;

public class ProdukDAO {
	
//	private static ProdukDAO produkDAO = new ProdukDAO();

	// Konstruktor
	public ProdukDAO() {

	}

	// method membuat objek
//	public static ProdukDAO getInstance() {
//		return produkDAO;
//	}

	// get produk
	public Produk getProduk(int produkId) {
		return null;
	}

	// list produk
	public List getAll() {
		return Collections.emptyList();
	}

	// edit nama produk
	public String editNamaProduk(String setProdukName, Produk produk) {
		produk.setProdukName(setProdukName);
		return produk.getProdukName();
	}
	
	// edit kategori produk
	public String editCategoryProduk(String setProdukCategory, Produk produk) {
		produk.setProdukCategory(setProdukCategory);
		return produk.getProdukCategory();
	}
	
	// edit harga produk
	public String editPriceProduk(String setProdukPrice, Produk produk) {
		produk.setProdukPrice(setProdukPrice);
		return produk.getProdukPrice();
	}
}
