package N_DT23.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import N_DT23.entity.SanPham;
import N_DT23.service.*;
import N_DT23.entity.*;

@Controller
@RequestMapping("shop")
public class ShopController {
	@Autowired
	private SanPhamService sanPhamService;
	@Autowired
	private NguoiDungService nguoiDungService;
	@Autowired
	private TaiKhoanService taiKhoanService;
	@Autowired
	private HoaDonService donService;
	
	@Autowired
	private  CTHoaDonService ctHoaDonService;
	
	@RequestMapping("/shop-grid")
	public String showShopGridPage(Model model) {
		List<LoaiSanPham> dsLoaiSanPham = new ArrayList<LoaiSanPham>();
		dsLoaiSanPham.add(new LoaiSanPham("Loa"));
		dsLoaiSanPham.add(new LoaiSanPham("Tai nghe"));
		dsLoaiSanPham.add(new LoaiSanPham("Micro"));
		dsLoaiSanPham.add(new LoaiSanPham("Cáp âm thanh"));
		dsLoaiSanPham.add(new LoaiSanPham("Bộ trộn âm"));
		model.addAttribute("dsLoaiSanPham", dsLoaiSanPham);

		List<ChiTietLoaiSP> dsChiTietLoaiSP = new ArrayList<ChiTietLoaiSP>();
		dsChiTietLoaiSP.add(new ChiTietLoaiSP(dsLoaiSanPham.get(0)));
		dsChiTietLoaiSP.add(new ChiTietLoaiSP(dsLoaiSanPham.get(1)));
		dsChiTietLoaiSP.add(new ChiTietLoaiSP(dsLoaiSanPham.get(2)));
		dsChiTietLoaiSP.add(new ChiTietLoaiSP(dsLoaiSanPham.get(3)));
		dsChiTietLoaiSP.add(new ChiTietLoaiSP(dsLoaiSanPham.get(4)));

		List<SanPham> dsSanPham = sanPhamService.getDSSanPham();
//		List<SanPham> dsSanPham = new ArrayList<SanPham>();
//		dsSanPham.add(new SanPham("Sản phẩm 1", "/resources/user/img/featured/feature-2.jpg",
//				"mo ta san pham", "Việt Nam", 100000, 20, 50000,
//				0, dsChiTietLoaiSP.subList(1, 3)));
//		dsSanPham.add(new SanPham("Sản phẩm 2", "/resources/user/img/featured/feature-1.jpg",
//				"mo ta san pham", "Việt Nam", 100000, 20, 50000,
//				0, dsChiTietLoaiSP.subList(0, 2)));
//		dsSanPham.add(new SanPham( "Sản phẩm 3", "/resources/user/img/featured/feature-3.jpg",
//				"mo ta san pham", "iệt Nam", 100000, 20, 50000,
//				0, dsChiTietLoaiSP.subList(2, 4)));
//		dsSanPham.add(new SanPham("Sản phẩm 4", "/resources/user/img/featured/feature-4.jpg",
//				"mo ta san pham", "Việt Nam", 100000, 20, 50000,
//				0, dsChiTietLoaiSP.subList(3, 5)));
//		dsSanPham.add(new SanPham("Sản phẩm 5", "https://d25tv1xepz39hi.cloudfront.net/2016-01-31/files/1045.jpg",
//				"mo ta san pham", "Việt Nam", 100000, 20, 50000, 0, dsChiTietLoaiSP.subList(1, 3)));
//		dsSanPham
//				.add(new SanPham("Sản phẩm 6", "https://icdn.dantri.com.vn/thumb_w/640/2020/08/04/19-1596556901619.jpg",
//						"mo ta san pham", "Việt Nam", 100000, 20, 50000, 0, dsChiTietLoaiSP.subList(1, 2)));
//		dsSanPham
//				.add(new SanPham("Sản phẩm 7", "https://icdn.dantri.com.vn/thumb_w/640/2020/08/04/24-1596556901623.jpg",
//						"mo ta san pham", "Việt Nam", 100000, 20, 50000, 0, dsChiTietLoaiSP.subList(2, 3)));
//		dsSanPham
//				.add(new SanPham("Sản phẩm 8", "https://icdn.dantri.com.vn/thumb_w/640/2020/08/04/27-1596556901642.jpg",
//						"mo ta san pham", "Việt Nam", 100000, 20, 50000, 0, dsChiTietLoaiSP.subList(3, 4)));
//		dsSanPham
//				.add(new SanPham("Sản phẩm 9", "https://icdn.dantri.com.vn/thumb_w/640/2020/08/04/28-1596556901636.jpg",
//						"mo ta san pham", "Việt Nam", 100000, 20, 50000, 0, dsChiTietLoaiSP.subList(4, 5)));
//		dsSanPham.add(new SanPham("Sản phẩm 10", "/resources/user/img/featured/feature-5.jpg",
//				"mo ta san pham", "Việt Nam", 100000, 20, 50000,
//				0, dsChiTietLoaiSP.subList(0, 1)));
//		dsSanPham.add(new SanPham("Sản phẩm 11", "/resources/user/img/featured/feature-6.jpg",
//				"mo ta san pham", "Việt Nam", 100000, 20, 50000,
//				0, dsChiTietLoaiSP.subList(1, 2)));
//		dsSanPham.add(new SanPham("Sản phẩm 12", "/resources/user/img/featured/feature-7.jpg",
//				"mo ta san pham", "Việt Nam", 100000, 20, 50000,
//				0, dsChiTietLoaiSP.subList(4, 5)));
		model.addAttribute("dsSanPham", dsSanPham);

		List<SanPham> dsSanPhamMoi = dsSanPham.subList(0,100);
		model.addAttribute("dsSanPhamMoi", dsSanPham);

		List<SanPham> dsSpGiamGia = dsSanPham.subList(0, 100);
		model.addAttribute("dsSpGiamGia", dsSanPham);

		return "user/shop-grid";
	}

	@GetMapping(value = "/shop-grid")
	public String product(@RequestParam(name = "page", required = false) Integer page, Model model, HttpServletRequest request) {
		String path = request.getServletPath();
		
		if(page == null)
			page = 1;
		
		
		List<SanPham> dsSanPham = sanPhamService.getDSSanPham(page);
		model.addAttribute("dsSanPham", dsSanPham);
		model.addAttribute("numberOfPage", sanPhamService.getNumberOfPage());
		model.addAttribute("currentPage", page);
		model.addAttribute("path", path);
		

		return "user/shop-grid";
	}
	@GetMapping("/shopping-cart")
	public String showShoppingCartPage(Model theModel) {
//		NguoiDung dung=new NguoiDung();
//		  theModel.addAttribute("nguoidung", dung);
//		theModel.getAttribute("sanPham");
		return "user/shopping-cart";
	}

	@GetMapping("/ShowFormND")
	public String showFormND(Model theModel) {
		NguoiDung dung=new NguoiDung();
		  theModel.addAttribute("nguoidung", dung);
		return "user/formAddND";
	}
	
	@RequestMapping("/checkout")
	public String showCheckoutPage() {
		return "user/checkout";
	}
	
	@GetMapping("/Search")
	public String search() {
		return "redirect:/shop/shop-grid";
	}
}
