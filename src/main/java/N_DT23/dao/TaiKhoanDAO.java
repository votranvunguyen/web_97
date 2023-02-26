package N_DT23.dao;

import java.util.List;

import N_DT23.entity.TaiKhoan;

public interface TaiKhoanDAO {
    public List<TaiKhoan> getDSTaiKhoan();
    
    public void addTaiKhoan(TaiKhoan khoan);
}
