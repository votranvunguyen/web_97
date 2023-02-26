package N_DT23.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import N_DT23.dao.*;
import N_DT23.entity.NguoiDung;

@Service
public class NguoiDungServiceImpl implements NguoiDungService {
    @Autowired
    private NguoiDungDAO NguoiDungDAO;

    @Override
    @Transactional
    public List<NguoiDung> getDSNguoiDung() {
        return NguoiDungDAO.getDSNguoiDung();
    }

	@Override
	 @Transactional
	public void addNguoiDung(NguoiDung dung) {
		NguoiDungDAO.addNguoiDung(dung);
		
	}

	@Override
	 @Transactional
	public void deleteNguoiDung(int maNguoiDung) {
		NguoiDungDAO.DeleteNguoiDung(maNguoiDung);
	}

}
