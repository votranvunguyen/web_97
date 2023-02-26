package N_DT23.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "SanPham")
public class SanPham implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "maSp", nullable = false)
    private int maSp;

    @Column(name = "tenSp", nullable = false, columnDefinition = "NVARCHAR(255)")
    private String tenSp;

    @Column(name = "hinhAnh", columnDefinition = "TEXT")
    private String hinhAnh;

    @Column(name = "moTa", nullable = false, columnDefinition = "TEXT")
    private String moTa;
    
    @Column(name="thuongHieu",nullable = false, columnDefinition ="NVARCHAR(255)")
    private String thuongHieu;
    
    @Column(name="soLuongTon",nullable = false, columnDefinition ="INT" )
    private int soLuongTon;

    @Column(name = "giaSP", nullable = false, columnDefinition = "MONEY")
    private double giaSP;

    @Column(name = "giamGia", nullable = false, columnDefinition = "float")
    private double giamGia;

    @Column(name = "giaMua", nullable = false, columnDefinition = "MONEY")
    private double giaMua;

    @OneToMany(mappedBy = "sanPham")
    private List<ChiTietHoaDon> dsCTHoaDon;

    @OneToMany(mappedBy = "sanPham", fetch = FetchType.EAGER)
    private List<ChiTietLoaiSP> dsLoaiSP;

    @OneToMany(mappedBy = "sanPham")
    private Set<GioHang> dsGioHang;
    

	public SanPham() {
		super();
	}


	public SanPham(int maSp) {
		super();
		this.maSp = maSp;
	}


	public SanPham(int maSp, String tenSp, String hinhAnh, String moTa, String thuongHieu, int soLuongTon, double giaSP,
			double giamGia, double giaMua,  List<ChiTietLoaiSP> dsLoaiSP) {
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
		this.dsLoaiSP = dsLoaiSP;
	}
	
	


	public SanPham(int maSp, String tenSp, String hinhAnh, String moTa, String thuongHieu, int soLuongTon, double giaSP,
			double giamGia, double giaMua) {
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


	public SanPham(String tenSp, String hinhAnh, String moTa, String thuongHieu, int soLuongTon, double giaSP,
			double giamGia, double giaMua,  List<ChiTietLoaiSP> dsLoaiSP) {
		super();
		this.tenSp = tenSp;
		this.hinhAnh = hinhAnh;
		this.moTa = moTa;
		this.thuongHieu = thuongHieu;
		this.soLuongTon = soLuongTon;
		this.giaSP = giaSP;
		this.giamGia = giamGia;
		this.giaMua = giaMua;
		this.dsLoaiSP = dsLoaiSP;
	}


	public SanPham(String tenSp, String hinhAnh, String moTa, String thuongHieu, int soLuongTon, double giaSP,double giamGia, double giaMua) {
		super();
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


	public List<ChiTietHoaDon> getDsCTHoaDon() {
		return dsCTHoaDon;
	}


	public void setDsCTHoaDon(List<ChiTietHoaDon> dsCTHoaDon) {
		this.dsCTHoaDon = dsCTHoaDon;
	}


	public List<ChiTietLoaiSP> getDsLoaiSP() {
		return dsLoaiSP;
	}


	public void setDsLoaiSP(List<ChiTietLoaiSP> dsLoaiSP) {
		this.dsLoaiSP = dsLoaiSP;
	}


	public Set<GioHang> getDsGioHang() {
		return dsGioHang;
	}


	public void setDsGioHang(Set<GioHang> dsGioHang) {
		this.dsGioHang = dsGioHang;
	}
	
	
    

}