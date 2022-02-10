package jp.co.sample.form;

import javax.validation.constraints.NotBlank;

public class UpdateEmployeeForm {
	private String id;
	@NotBlank(message = "名前を入力してください")
	private String name;
	@NotBlank(message = "性別を入力してください")
	private String gender;
	@NotBlank(message = "入社日を入力してください")
	private String hireDate;
	@NotBlank(message = "メールアドレスを入力してください")
	private String mailAddress;
	@NotBlank(message = "郵便番号を入力してください")
	private String zipCode;
	@NotBlank(message = "住所を入力してください")
	private String address;
	@NotBlank(message = "電話番号を入力してください")
	private String telephone;
	@NotBlank(message = "給料を入力してください")
	private String salary;
	@NotBlank(message = "特性を入力してください")
	private String characteristics;
	@NotBlank(message = "扶養人数を入力してください")
	private String dependentsCount;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getCharacteristics() {
		return characteristics;
	}

	public void setCharacteristics(String characteristics) {
		this.characteristics = characteristics;
	}

	public String getDependentsCount() {
		return dependentsCount;
	}

	public void setDependentsCount(String dependentsCount) {
		this.dependentsCount = dependentsCount;
	}

	@Override
	public String toString() {
		return "UpdateEmployeeForm [id=" + id + ", name=" + name + ", gender=" + gender + ", hireDate=" + hireDate
				+ ", mailAddress=" + mailAddress + ", zipCode=" + zipCode + ", address=" + address + ", telephone="
				+ telephone + ", salary=" + salary + ", characteristics=" + characteristics + ", dependentsCount="
				+ dependentsCount + "]";
	}

}
