package N_DT23.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import N_DT23.entity.HoaDon;
import N_DT23.dao.HoaDonDAO;

@Service
public class HoaDonServiceImpl implements HoaDonService {
    @Autowired
    private HoaDonDAO hoaDonDAO;

    @Override
    @Transactional
    public List<HoaDon> getDSHoaDon() {
        return hoaDonDAO.getDSHoaDon();
    }

	@Override
	@Transactional
	public HoaDon addHoaDon(HoaDon hoaDon) {
		hoaDonDAO.addHoaDon(hoaDon);
		return hoaDon;
	}

}
