package N_DT23.dao;

import java.util.List;

import N_DT23.entity.LoaiSanPham;

public interface LoaiSanPhamDAO {
    public List<LoaiSanPham> getDSLoaiSanPham();
    public boolean addLoaiSanPham(LoaiSanPham loaiSanPham);
}
