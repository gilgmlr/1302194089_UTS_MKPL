package lib;

public class Address {
	private String kampung;
	private String desa;
	private String kecamatan;
	private String kota;
	private boolean isForeigner;

	public Address(String kampung String desa, String kecamatan, String kota){
		this.kampung = kampung;
		this.desa = desa;
		this.kecamatan = kecamatan;
		this.kabupaten = kabupaten;
		this.provinsi = provinsi;
	}

	public void setIsForeigner(boolean isForeigner){
		this.isForeigner = isForeigner;
	}

	public boolean getIsForeigner(){
		return this.isForeigner;
	}
}