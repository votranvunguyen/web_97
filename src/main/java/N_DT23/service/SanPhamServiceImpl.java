package N_DT23.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import N_DT23.dao.*;
import N_DT23.entity.SanPham;

@Service
public class SanPhamServiceImpl implements SanPhamService {

    @Autowired
    private SanPhamDAO sanPhamDAO;

    @Override
    @Transactional
    public List<SanPham> getDSSanPham() {
        return sanPhamDAO.getDSSanPham();
    }

	@Override
    @Transactional
	public List<SanPham> getDSSanPham(int page) {
		return sanPhamDAO.getDSSanPham(page);
	}

	@Override
    @Transactional
	public int getNumberOfPage() {
		// TODO Auto-generated method stub
		return sanPhamDAO.getNumberOfPage();
	}

	@Override
	@Transactional
	public void deleteSanPham(int maSp) {
		// TODO Auto-generated method stub
		sanPhamDAO.deleteSanPham(maSp);
		
	}

	@Override
	@Transactional
	public void addSanPham(SanPham sanPham) {
		 sanPhamDAO.addSanPham(sanPham);
	}

}
