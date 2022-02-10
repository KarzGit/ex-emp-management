package jp.co.sample.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sample.domain.Employee;
import jp.co.sample.form.UpdateEmployeeForm;
import jp.co.sample.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private HttpSession session;


	@RequestMapping("/showList")
	public String showList(Model model) {
		if(session.getAttribute("administratorName")==null){
			return "redirect:/";
		}
		model.addAttribute("employeeList", employeeService.showList());
		return "employee/list";
	}

	@ModelAttribute
	UpdateEmployeeForm setUpUpdateEmployeeForm() {
		return new UpdateEmployeeForm();
	}

	@RequestMapping("/showDetail")
	public String showDetail(String id, Model model) {
		model.addAttribute("employee", employeeService.showDetail(Integer.parseInt(id)));
		return "employee/detail.html";

	}

	@RequestMapping("/update")
	public String update(@Validated UpdateEmployeeForm form, BindingResult result, String id, Model model) {
		if(session.getAttribute("administratorName")==null){
			return "redirect:/";
		}
		if (result.hasErrors()) {
			return showDetail(id, model);
		}

		Employee employee = employeeService.showDetail(Integer.parseInt(form.getId()));
		employee.setName(form.getName());
		employee.setGender(form.getGender());
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		try {
			employee.setHireDate(dateFormat.parse(form.getHireDate()));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		employee.setMailAddress(form.getMailAddress());
		employee.setZipCode(form.getZipCode());
		employee.setAddress(form.getAddress());
		employee.setTelephone(form.getTelephone());
		employee.setSalary(Integer.parseInt(form.getSalary()));
		employee.setCharacteristics(form.getCharacteristics());
		employee.setDependentsCount(Integer.parseInt(form.getDependentsCount()));
		employeeService.update(employee);
		return "redirect:/employee/showList";
	}

}
