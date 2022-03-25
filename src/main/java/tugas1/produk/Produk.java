package tugas1.produk;

public class Produk {
	
	private int produkId;
	private String produkName;
	private String produkCategory;
	private String produkPrice;
	
	// Konstruktor
	public Produk() {
		
	}
	
	public Produk(int produkId, String produkName, String produkCategory, String produkPrice) {
		this.produkId = produkId;
		this.produkName = produkName;
		this.produkCategory = produkCategory;
		this.produkPrice = produkPrice;
	}

	// Setter dan Getter
	public int getProdukId() {
		return produkId;
	}

	public void setProdukId(int produkId) {
		this.produkId = produkId;
	}

	public String getProdukName() {
		return produkName;
	}

	public void setProdukName(String produkName) {
		this.produkName = produkName;
	}

	public String getProdukCategory() {
		return produkCategory;
	}

	public void setProdukCategory(String produkCategory) {
		this.produkCategory = produkCategory;
	}

	public String getProdukPrice() {
		return produkPrice;
	}

	public void setProdukPrice(String produkPrice) {
		this.produkPrice = produkPrice;
	}
}
