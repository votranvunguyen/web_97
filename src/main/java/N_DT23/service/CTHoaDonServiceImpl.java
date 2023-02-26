package N_DT23.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import N_DT23.dao.*;
import N_DT23.entity.ChiTietHoaDon;

@Service
public class CTHoaDonServiceImpl implements CTHoaDonService {
    @Autowired
    private CTHoaDonDAO ctHoaDonDAO;
    
    @Override
    @Transactional
    public List<ChiTietHoaDon> getDSCTHoaDon() {
        return ctHoaDonDAO.getDSCTHoaDon();
    }

	@Override
	@Transactional
	public ChiTietHoaDon addHoaDon(ChiTietHoaDon hoaDon) {
		ctHoaDonDAO.addCTHoaDon(hoaDon);
		return hoaDon;
	}

}
