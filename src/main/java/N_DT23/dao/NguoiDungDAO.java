package N_DT23.dao;

import java.util.List;

import N_DT23.entity.NguoiDung;

public interface NguoiDungDAO {
    public List<NguoiDung> getDSNguoiDung();
    public NguoiDung addNguoiDung(NguoiDung nguoiDung);
    public boolean updateNguoiDung(NguoiDung nguoiDung);
    public NguoiDung findNguoiDungByEmail(String email);
    public NguoiDung findNguoiDungById(int id);
    void DeleteNguoiDung(int maNguoiDung);
    
}
