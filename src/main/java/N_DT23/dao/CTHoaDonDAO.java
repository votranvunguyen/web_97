package N_DT23.dao;

import java.util.List;

import N_DT23.entity.ChiTietHoaDon;
import N_DT23.entity.HoaDon;

public interface CTHoaDonDAO {
    public List<ChiTietHoaDon> getDSCTHoaDon();
    public ChiTietHoaDon addCTHoaDon(ChiTietHoaDon hoaDon);
}
