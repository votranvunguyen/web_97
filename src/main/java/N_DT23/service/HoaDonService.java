package N_DT23.service;

import java.util.List;

import N_DT23.entity.HoaDon;

public interface HoaDonService {
    public List<HoaDon> getDSHoaDon();
    public HoaDon addHoaDon(HoaDon hoaDon);
}
