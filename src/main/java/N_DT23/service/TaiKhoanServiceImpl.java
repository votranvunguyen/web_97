package N_DT23.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import N_DT23.dao.*;
import N_DT23.entity.TaiKhoan;

@Service
public class TaiKhoanServiceImpl implements TaiKhoanService {
    @Autowired
    private TaiKhoanDAO TaiKhoanDAO;

    @Override
    @Transactional
    public List<TaiKhoan> getDSTaiKhoan() {
        return TaiKhoanDAO.getDSTaiKhoan();
    }

	@Override
	@Transactional
	public void addTaiKhoan(TaiKhoan khoan) {
		 TaiKhoanDAO.addTaiKhoan(khoan);
		
	}

}
