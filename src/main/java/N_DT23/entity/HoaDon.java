package N_DT23.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import N_DT23.utils.Datetime;

@Entity
@Table(name = "HoaDon")
public class HoaDon implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "maHD", nullable = false)
    private int maHD;

    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "ngayLHD", nullable = false, columnDefinition = "DATETIME")
    private Date ngayLHD;

    @Column(name = "tongTien", nullable = false, columnDefinition = "MONEY")
    private double tongTien;

    @Column(name = "tongSoLuong", nullable = false, columnDefinition = "INT")
    private double tongSoLuong;

    @Column(name = "trangThaiDonHang", nullable = false, columnDefinition = "NVARCHAR(100)")
    private String trangThaiDonHang;

    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "ngayGiaoHang", columnDefinition = "DATETIME")
    private Date ngayGiaoHang;

    @Column(name = "diaChiGiaoHang", columnDefinition = "TEXT")
    private String diaChiGiaoHang;

    @OneToMany(mappedBy = "hoaDon")
    private List<ChiTietHoaDon> dsCTHoaDon;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "maKH", nullable = false)
    private NguoiDung nguoiDung;

    public HoaDon() {
    }

    public HoaDon(int maHD, Date ngayLHD, double tongTien, double tongSoLuong, NguoiDung nguoiDung) {
        this.maHD = maHD;
        this.ngayLHD = ngayLHD;
        this.tongTien = tongTien;
        this.tongSoLuong = tongSoLuong;
        this.nguoiDung = nguoiDung;
    }

    public HoaDon(Date ngayLHD, double tongTien, double tongSoLuong, Date ngayGiaoHang, String diaChiGiaoHang) {
        this.ngayLHD = ngayLHD;
        this.tongTien = tongTien;
        this.tongSoLuong = tongSoLuong;
        this.ngayGiaoHang = ngayGiaoHang;
        this.diaChiGiaoHang = diaChiGiaoHang;
    }
    
    

    public HoaDon(Date ngayLHD, double tongTien, double tongSoLuong, String trangThaiDonHang, Date ngayGiaoHang,
			String diaChiGiaoHang, NguoiDung nguoiDung) {
		super();
		this.ngayLHD = ngayLHD;
		this.tongTien = tongTien;
		this.tongSoLuong = tongSoLuong;
		this.trangThaiDonHang = trangThaiDonHang;
		this.ngayGiaoHang = ngayGiaoHang;
		this.diaChiGiaoHang = diaChiGiaoHang;
		this.nguoiDung = nguoiDung;
	}

	public int getMaHD() {
        return maHD;
    }

    public void setMaHD(int maHD) {
        this.maHD = maHD;
    }

    public Date getNgayLHD() {
        return ngayLHD;
    }

    public void setNgayLHD(Date ngayLHD) {
        this.ngayLHD = ngayLHD;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public double getTongSoLuong() {
        return tongSoLuong;
    }

    public void setTongSoLuong(double tongSoLuong) {
        this.tongSoLuong = tongSoLuong;
    }

    public String getTrangThaiDonHang() {
        return trangThaiDonHang;
    }

    public void setTrangThaiDonHang(String trangThaiDonHang) {
        this.trangThaiDonHang = trangThaiDonHang;
    }

    public List<ChiTietHoaDon> getDsCTHoaDon() {
        return dsCTHoaDon;
    }

    public void setDsCTHoaDon(List<ChiTietHoaDon> dsCTHoaDon) {
        this.dsCTHoaDon = dsCTHoaDon;
    }

    public Date getNgayGiaoHang() {
        return ngayGiaoHang;
    }

    public void setNgayGiaoHang(Date ngayGiaoHang) {
        this.ngayGiaoHang = ngayGiaoHang;
    }

    public String getDiaChiGiaoHang() {
        return diaChiGiaoHang;
    }

    public void setDiaChiGiaoHang(String diaChiGiaoHang) {
        this.diaChiGiaoHang = diaChiGiaoHang;
    }
    
    

	public NguoiDung getNguoiDung() {
		return nguoiDung;
	}

	public void setNguoiDung(NguoiDung nguoiDung) {
		this.nguoiDung = nguoiDung;
	}
	
	public String dateToString(Date d) {
		String str = Datetime.dateToString(d);
		if(str==null){
            return "";
        }
		return str;
	}

	@Override
	public String toString() {
		return "HoaDon [maHD=" + maHD + ", ngayLHD=" + ngayLHD + ", tongTien=" + tongTien + ", tongSoLuong="
				+ tongSoLuong + ", trangThaiDonHang=" + trangThaiDonHang + ", ngayGiaoHang=" + ngayGiaoHang
				+ ", diaChiGiaoHang=" + diaChiGiaoHang + ", dsCTHoaDon=" + dsCTHoaDon + ", nguoiDung=" + nguoiDung
				+ "]";
	}
    
    

}

