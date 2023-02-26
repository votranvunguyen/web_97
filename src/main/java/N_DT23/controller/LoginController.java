package N_DT23.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import N_DT23.entity.SanPham;
import N_DT23.entity.ChiTietLoaiSP;
import N_DT23.entity.LoaiSanPham;

import N_DT23.user.CrmUser;

@Controller
@RequestMapping("")
public class LoginController {

	@RequestMapping({ "/", "/trang-chu", "/home" })
	public String showHomePage(Model model) {
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

		List<SanPham> dsSanPham = new ArrayList<SanPham>();
		dsSanPham.add(new SanPham("Sản phẩm 1", "/resources/user/img/featured/loa1.webp", "mo ta san pham", null,
				100000, 100000, 50000, 0, dsChiTietLoaiSP.subList(0, 1)));
		dsSanPham.add(new SanPham("Sản phẩm 2", "/resources/user/img/featured/loa2.webp", "mo ta san pham", null,
				100000, 100000, 50000, 0, dsChiTietLoaiSP.subList(0, 1)));
		dsSanPham.add(new SanPham("Sản phẩm 3", "/resources/user/img/featured/tainghe1.webp", "mo ta san pham",
				null, 100000, 100000, 50000, 0, dsChiTietLoaiSP.subList(1, 2)));
		dsSanPham.add(new SanPham("Sản phẩm 4", "/resources/user/img/featured/tainghe2.webp", "mo ta san pham",
				null, 100000, 100000, 50000, 0, dsChiTietLoaiSP.subList(1, 2)));
		dsSanPham.add(new SanPham("Sản phẩm 5", "/resources/user/img/featured/mic1.webp", "mo ta san pham", null,
				100000, 100000, 50000, 0, dsChiTietLoaiSP.subList(2, 3)));
		dsSanPham.add(new SanPham("Sản phẩm 6", "/resources/user/img/featured/mic2.webp", "mo ta san pham", null,
				100000, 100000, 50000, 0, dsChiTietLoaiSP.subList(2, 3)));
		dsSanPham.add(new SanPham("Sản phẩm 7", "/resources/user/img/featured/phukien1.webp", "mo ta san pham",
				null, 100000, 100000, 50000, 0, dsChiTietLoaiSP.subList(3, 4)));
		dsSanPham.add(new SanPham("Sản phẩm 8", "/resources/user/img/featured/phukien2.webp", "mo ta san pham",
				null, 100000, 100000, 50000, 0, dsChiTietLoaiSP.subList(3, 4)));
		dsSanPham.add(new SanPham("Sản phẩm 9", "/resources/user/img/featured/mixer1.webp", "mo ta san pham", null,
				100000, 100000, 50000, 0, dsChiTietLoaiSP.subList(4, 5)));

		model.addAttribute("dsSanPham", dsSanPham);

		List<SanPham> dsSanPhamMoi = dsSanPham.subList(0, 3);
		model.addAttribute("dsSanPhamMoi", dsSanPhamMoi);

		List<SanPham> dsSanPhamTot = dsSanPham.subList(3, 6);
		model.addAttribute("dsSanPhamTot", dsSanPhamTot);

		List<SanPham> dsDanhGiaSp = dsSanPham.subList(6, 9);
		model.addAttribute("dsDanhGiaSp", dsDanhGiaSp);

		return "user/index";
	}



	@GetMapping("/contact")
	public String showContractPage() {
		return "user/contact";
	}

	@GetMapping("/home")
	public String showHomePage() {
		return "user/home";
	}

	@GetMapping("/showMyLoginPage")
	public String showMyLoginPage() {

		return "user/plain-login";
		// return "admin/login";

	}

	@Autowired
	private UserDetailsManager userDetailsManager;

	private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

	private Logger logger = Logger.getLogger(getClass().getName());

	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {

		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);

		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

	@GetMapping("/access-denied")
	public String showMyLoginPage(Model theModel) {

		theModel.addAttribute("crmUser", new CrmUser());

		return "user/access-denied";

	}

	@PostMapping("/processRegistrationForm")
	public String processRegistrationForm(@Valid @ModelAttribute("crmUser") CrmUser theCrmUser,
			BindingResult theBindingResult, Model theModel) {

		String userName = theCrmUser.getUserName();

		logger.info("Processing registration form for: " + userName);

		// form validation
		if (theBindingResult.hasErrors()) {

			theModel.addAttribute("crmUser", new CrmUser());
			theModel.addAttribute("registrationError", "User name/password can not be empty.");

			logger.warning("User name/password can not be empty.");

			return "user/access-denied";
		}

		// check the database if user already exists
		boolean userExists = doesUserExist(userName);

		if (userExists) {
			theModel.addAttribute("crmUser", new CrmUser());
			theModel.addAttribute("registrationError", "User name already exists.");

			logger.warning("User name already exists.");

			return "user/access-denied";
		}

		//
		// whew ... we passed all of the validation checks!
		// let's get down to business!!!
		//

		// encrypt the password
		String encodedPassword = passwordEncoder.encode(theCrmUser.getPassword());

		// prepend the encoding algorithm id
		encodedPassword = "{bcrypt}" + encodedPassword;

		// give user default role of "employee"
		List<GrantedAuthority> authorities = AuthorityUtils.createAuthorityList("ROLE_EMPLOYEE");

		// create user object (from Spring Security framework)
		User tempUser = new User(userName, encodedPassword, authorities);

		// save user in the database
		userDetailsManager.createUser(tempUser);

		logger.info("Successfully created user: " + userName);

		return "user/plain-login";
	}

	private boolean doesUserExist(String userName) {

		logger.info("Checking if user exists: " + userName);

		// check the database if the user already exists
		boolean exists = userDetailsManager.userExists(userName);

		logger.info("User: " + userName + ", exists: " + exists);

		return exists;
	}

}