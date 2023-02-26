package N_DT23.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import N_DT23.dao.*;
import N_DT23.entity.ChiTietLoaiSP;

@Service
public class CTLoaiSPServiceImpl implements CTLoaiSPService {
    @Autowired
    private CTLoaiSPDAO ctLoaiSPDAO;

    @Override
    @Transactional
    public List<ChiTietLoaiSP> getDSCTLoaiSP() {
        return ctLoaiSPDAO.getDSChiTietLoaiSP();
    }
    
}
