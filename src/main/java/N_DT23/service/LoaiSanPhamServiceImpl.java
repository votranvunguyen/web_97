package N_DT23.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import N_DT23.dao.*;
import N_DT23.entity.LoaiSanPham;

@Service
public class LoaiSanPhamServiceImpl implements LoaiSanPhamService {
    @Autowired
    private LoaiSanPhamDAO loaiSanPhamDAO;

    @Override
    @Transactional
    public List<LoaiSanPham> getDSLoaiSanPham() {
        return loaiSanPhamDAO.getDSLoaiSanPham();
    }
}
