package N_DT23.dao;

import java.util.List;

import N_DT23.entity.ChucVu;

public interface ChucVuDAO {
    public List<ChucVu> getDSChucVu();
    public ChucVu getChucVuById(int chucVuId);
    public ChucVu addChucVu(ChucVu chucVu);
    public boolean updateChucVu(int chucVuId,ChucVu chucVu);
    public boolean deleteChucVu(int chucVuId); 
}
