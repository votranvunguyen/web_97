package N_DT23.service;

import java.util.List;

import org.springframework.stereotype.Service;

import N_DT23.entity.TaiKhoan;

@Service
public interface TaiKhoanService {
    public List<TaiKhoan> getDSTaiKhoan();
    public void addTaiKhoan(TaiKhoan khoan);
}
