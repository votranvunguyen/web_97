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
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "NguoiDung")
public class NguoiDung implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "maND", nullable = false, columnDefinition = "INT")
    private int maND;

    @Column(name = "tenND", nullable = false, columnDefinition = "NVARCHAR(125)")
    private String tenND;

    @Column(name = "diaChi", columnDefinition = "TEXT")
    private String diaChi;

    @Column(name = "sdt", columnDefinition = "VARCHAR(10)")
    private String sdt;

    @OneToOne
    @JoinColumn(name = "email", nullable = false, unique = true, columnDefinition = "VARCHAR(255)")
   private TaiKhoan taiKhoan;

    @OneToMany(mappedBy = "nguoiDung", fetch = FetchType.LAZY)
    private Set<HoaDon> hoaDon;

    @OneToMany(mappedBy = "nguoiDung", fetch = FetchType.LAZY)
    private Set<GioHang> gioHang;

    public NguoiDung() {
    }

    public NguoiDung(int maND) {
        this.maND = maND;
    }

    public NguoiDung(int maND, String tenND, String diaChi, String sdt, TaiKhoan taiKhoan, Set<HoaDon> hoaDon) {
        this.maND = maND;
        this.tenND = tenND;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.taiKhoan = taiKhoan;
        this.hoaDon = hoaDon;
    }

    public NguoiDung(int maND, String tenND, String diaChi, String sdt, TaiKhoan taiKhoan) {
        this.maND = maND;
        this.tenND = tenND;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.taiKhoan = taiKhoan;
    }

    public NguoiDung(String tenND, String diaChi, String sdt,TaiKhoan taiKhoan) {
        this.tenND = tenND;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.taiKhoan = taiKhoan;
    }
    

    public NguoiDung(String tenND, String diaChi, String sdt, Set<HoaDon> hoaDon) {
		super();
		this.tenND = tenND;
		this.diaChi = diaChi;
		this.sdt = sdt;
		this.hoaDon = hoaDon;
	}

	public NguoiDung( String tenND, String diaChi, String sdt) {
		super();
		
		this.tenND = tenND;
		this.diaChi = diaChi;
		this.sdt = sdt;
	}

	public int getMaND() {
        return maND;
    }

    public void setMaND(int maND) {
        this.maND = maND;
    }

    public String getTenND() {
        return tenND;
    }

    public void setTenND(String tenND) {
        this.tenND = tenND;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public TaiKhoan getTaiKhoan() {
        return taiKhoan;
    }

	public void setTaiKhoan(TaiKhoan taiKhoan) {
		this.taiKhoan = taiKhoan;
	}

	

   

}
