package N_DT23.dto;

import N_DT23.entity.*;

public class SanPhamDTO {
	 private int maSp;
	 private String tenSp;
	 private String hinhAnh;
	 private String moTa;
	 private String thuongHieu;
	 private int soLuongTon;
	 private double giaSP;
	 private double giamGia;
	 private double giaMua;
	 
	 public SanPhamDTO() {
			super();		
		}
	 
	 public SanPhamDTO(SanPham sanPham) {
			super();
			this.maSp = sanPham.getMaSp();
			this.tenSp = sanPham.getTenSp();
			this.hinhAnh = sanPham.getHinhAnh();
			this.moTa = sanPham.getMoTa();
			this.thuongHieu = sanPham.getThuongHieu();
			this.soLuongTon = sanPham.getSoLuongTon();
			this.giaSP = sanPham.getGiaSP();
			this.giamGia = sanPham.getGiamGia();
			this.giaMua = sanPham.getGiaMua();
		}
	 
	public SanPhamDTO(int maSp, String tenSp, String hinhAnh, String moTa, String thuongHieu, int soLuongTon,
			double giaSP, double giamGia, double giaMua) {
		super();
		this.maSp = maSp;
		this.tenSp = tenSp;
		this.hinhAnh = hinhAnh;
		this.moTa = moTa;
		this.thuongHieu = thuongHieu;
		this.soLuongTon = soLuongTon;
		this.giaSP = giaSP;
		this.giamGia = giamGia;
		this.giaMua = giaMua;
	}

	public int getMaSp() {
		return maSp;
	}

	public void setMaSp(int maSp) {
		this.maSp = maSp;
	}

	public String getTenSp() {
		return tenSp;
	}

	public void setTenSp(String tenSp) {
		this.tenSp = tenSp;
	}

	public String getHinhAnh() {
		return hinhAnh;
	}

	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public String getThuongHieu() {
		return thuongHieu;
	}

	public void setThuongHieu(String thuongHieu) {
		this.thuongHieu = thuongHieu;
	}

	public int getSoLuongTon() {
		return soLuongTon;
	}

	public void setSoLuongTon(int soLuongTon) {
		this.soLuongTon = soLuongTon;
	}

	public double getGiaSP() {
		return giaSP;
	}

	public void setGiaSP(double giaSP) {
		this.giaSP = giaSP;
	}

	public double getGiamGia() {
		return giamGia;
	}

	public void setGiamGia(double giamGia) {
		this.giamGia = giamGia;
	}

	public double getGiaMua() {
		return giaMua;
	}

	public void setGiaMua(double giaMua) {
		this.giaMua = giaMua;
	}

	@Override
	public String toString() {
		return "SanPhamDTO [maSp=" + maSp + ", tenSp=" + tenSp + ", hinhAnh=" + hinhAnh + ", moTa=" + moTa
				+ ", thuongHieu=" + thuongHieu + ", soLuongTon=" + soLuongTon + ", giaSP=" + giaSP + ", giamGia="
				+ giamGia + ", giaMua=" + giaMua + "]";
	}
	 
	
}
