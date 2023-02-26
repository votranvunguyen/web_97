package N_DT23.service;

import java.util.List;

import N_DT23.entity.SanPham;

public interface SanPhamService {
    public List<SanPham> getDSSanPham();
    public List<SanPham> getDSSanPham(int page);
    public int getNumberOfPage();
    public void deleteSanPham(int maSp);
    public void addSanPham(SanPham sanPham);
}
