package N_DT23.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import N_DT23.service.*;
import N_DT23.dao.SanPhamDAO;
import N_DT23.dto.SanPhamDTO;
import N_DT23.entity.HoaDon;
import N_DT23.entity.LoaiSanPham;
import N_DT23.entity.NguoiDung;
import N_DT23.entity.SanPham;
import N_DT23.entity.TaiKhoan;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private NguoiDungService nguoiDungService;
	@Autowired
	private SanPhamService sanPhamService;
	@Autowired
	private SanPhamDAO sanPhamDAO;
	
	
	
	@GetMapping("")
	public String home() {
		return "admin/index";
	}
	
	@GetMapping("/user")
	public String user(Model model) {
		List<NguoiDung> users = new ArrayList<NguoiDung>();
		users=nguoiDungService.getDSNguoiDung();
		model.addAttribute("users", users);
		return "admin/user";
	}
	
	@GetMapping("/order")
	public String order(Model model) {
		List<HoaDon> orders = new ArrayList<HoaDon>();
		NguoiDung user1 = new NguoiDung("Trần Văn A", "TP.HCM", "0987654321", new TaiKhoan("tranvana@gmail.com", "123456"));
		NguoiDung user2 = new NguoiDung("Trần Văn B", "TP.HCM", "0987654321", new TaiKhoan("tranvanb@gmail.com", "123456"));
		orders.add(new HoaDon(1, new Date("19/11/2021"), 100000.0, 120, user1));
		orders.add(new HoaDon(2, new Date("19/12/2021"), 120000.0, 100, user2));
		orders.add(new HoaDon(3, new Date("01/11/2021"), 100000.0, 150, user1));
		model.addAttribute("orders", orders);
		return "admin/order";
	}
	
	
	@GetMapping(value = "/product")
	public String product(@RequestParam(name = "page", required = false) Integer page, Model model, HttpServletRequest request) {
		String path = request.getServletPath();
		
		if(page == null)
			page = 1;
		
		
		List<SanPham> dsSanPham = sanPhamService.getDSSanPham(page);
		model.addAttribute("dsSanPham", dsSanPham);
		model.addAttribute("numberOfPage", sanPhamService.getNumberOfPage());
		model.addAttribute("currentPage", page);
		model.addAttribute("path", path);
		

		return "admin/product";
	}
	
	@GetMapping("/category")
	public String category(Model model) {
		List<LoaiSanPham> dsLoaiSanPham = new ArrayList<LoaiSanPham>();
		dsLoaiSanPham.add(new LoaiSanPham("Loa"));
		dsLoaiSanPham.add(new LoaiSanPham("Tai nghe"));
		dsLoaiSanPham.add(new LoaiSanPham("Micro"));
		dsLoaiSanPham.add(new LoaiSanPham("Cáp âm thanh"));
		dsLoaiSanPham.add(new LoaiSanPham("Bộ trộn âm"));
		model.addAttribute("dsLoaiSanPham", dsLoaiSanPham);
		return "admin/category";
	}
	
	@GetMapping("/delete")
    public String deleteSanPham(@RequestParam("maSp") int maSp) {
		System.out.println(maSp);
        // delete the customer
		sanPhamService.deleteSanPham(maSp);

        return "redirect:/admin/product";
    }
	@PostMapping("/saveProduct")
    public String saveCustomer(@ModelAttribute("product") SanPham theSanPham) {
        // save the customer using our service
		System.out.println(theSanPham.getTenSp());
		System.out.println(theSanPham.getMoTa());
		System.out.println(theSanPham.getSoLuongTon());
		System.out.println(theSanPham.getThuongHieu());
		System.out.println(theSanPham.getGiaSP());
		System.out.println(theSanPham.getSoLuongTon());
		
		sanPhamService.addSanPham(theSanPham);
	
        return "redirect:/admin/product";
    }
	
	@GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel) {
      //   create model attribute to bind form data
        SanPham sanPham = new SanPham();
        theModel.addAttribute("product", sanPham);
        return "admin/product-form";    } 
	
	
	@GetMapping("/deleteUser")
    public String deleteUser(@RequestParam("maND") int maND) {
		System.out.println(maND);
        // delete the customer
		nguoiDungService.deleteNguoiDung(maND);

        return "redirect:/admin/user";
    }
}
