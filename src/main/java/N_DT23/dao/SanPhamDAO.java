package N_DT23.dao;

import java.util.List;

import N_DT23.entity.SanPham;


public interface SanPhamDAO{
    public List<SanPham> getDSSanPham();
    public List<SanPham> getDSSanPham(int page);
    public int getNumberOfPage();
    public void addSanPham(SanPham sanPham);
    public boolean updateSanPham (int sanPhamId,SanPham sanPham);
    public SanPham getSanPhamByIdSanPham(int sanPhamId);
    public List<SanPham> getSanPhamByTenSanPham(String tenSP);
    public void deleteSanPham(int maSp);
}
