package N_DT23.service;

import java.util.List;

import N_DT23.entity.ChiTietHoaDon;

public interface CTHoaDonService {
    public List<ChiTietHoaDon> getDSCTHoaDon();
    public ChiTietHoaDon addHoaDon(ChiTietHoaDon hoaDon);
}
