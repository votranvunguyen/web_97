package N_DT23.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import N_DT23.entity.ChiTietHoaDon;
import N_DT23.entity.HoaDon;
import N_DT23.entity.SanPham;

@Repository
public class CTHoaDonDAOImpl implements CTHoaDonDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @SuppressWarnings("unchecked")
    public List<ChiTietHoaDon> getDSCTHoaDon() {
        Session currentSession = sessionFactory.getCurrentSession();
        String queryStr = "select ct.maHD, ct.soLuong, ct.giaBan, "
                + "sp.maSp, sp.tenSp, sp.giaSP, sp.hinhAnh "
                + "from ChiTietHoaDon ct, SanPham sp "
                + "where ct.maSp = sp.maSp ";

        List<Object[]> results = currentSession.createNativeQuery(queryStr).getResultList();
        List<ChiTietHoaDon> dataList = new ArrayList<>();
        results.stream().forEach(item -> {
            int soLuong = Integer.parseInt(item[1].toString());
            double giaBan = Double.parseDouble(item[2].toString());
            int maSp = Integer.parseInt(item[3].toString());
            String tenSp = item[4].toString();
            double giaSp = Double.parseDouble(item[5].toString());
            String hinhAnh = item[6].toString();
            // SanPham sanPham = new SanPham(maSp, tenSp, hinhAnh, giaSp);
            // ChiTietHoaDon ctHoaDon = new ChiTietHoaDon(sanPham, soLuong, giaBan);
            // dataList.add(ctHoaDon);
        });

        return dataList;
    }

	@Override
	public ChiTietHoaDon addCTHoaDon(ChiTietHoaDon hoaDon) {
		  Session currentSession = sessionFactory.getCurrentSession();
	        currentSession.saveOrUpdate(hoaDon);
	        return hoaDon;
		
	}

}
