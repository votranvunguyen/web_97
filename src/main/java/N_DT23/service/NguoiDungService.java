package N_DT23.service;

import java.util.List;

import N_DT23.entity.NguoiDung;

public interface NguoiDungService {
    public List<NguoiDung> getDSNguoiDung();
    public void addNguoiDung(NguoiDung dung);
    public void deleteNguoiDung(int maNguoiDung);
}
