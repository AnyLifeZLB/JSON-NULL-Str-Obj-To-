package com.anylife.jsont.json_null_str_obj_to;

import java.util.List;

/**
 * Created by zenglb on 2016/9/9.
 */
public class Result {

	/**
	 * firstName : John
	 * lastName : Smith
	 * sex : male
	 * age : 25
	 * isVip : false
	 * address : {"streetAddress":"21 2nd Street","city":"New York","state":"NY","postalCode":"10021"}
	 * phoneNumber : [{"type":"home","number":"212 555-1234"},{"type":"fax","number":"646 555-4567"}]
	 */

	private String firstName;
	private String lastName;
	private String sex;
	private int age;
	private boolean isVip;
	/**
	 * streetAddress : 21 2nd Street
	 * city : New York
	 * state : NY
	 * postalCode : 10021
	 */

	private AddressBean address;
	/**
	 * type : home
	 * number : 212 555-1234
	 */

	private List<PhoneNumberBean> phoneNumber;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isIsVip() {
		return isVip;
	}

	public void setIsVip(boolean isVip) {
		this.isVip = isVip;
	}

	public AddressBean getAddress() {
		return address;
	}

	public void setAddress(AddressBean address) {
		this.address = address;
	}

	public List<PhoneNumberBean> getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(List<PhoneNumberBean> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public static class AddressBean {
		private String streetAddress;
		private String city;
		private String state;
		private String postalCode;

		public String getStreetAddress() {
			return streetAddress;
		}

		public void setStreetAddress(String streetAddress) {
			this.streetAddress = streetAddress;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getPostalCode() {
			return postalCode;
		}

		public void setPostalCode(String postalCode) {
			this.postalCode = postalCode;
		}
	}

	public static class PhoneNumberBean {
		private String type;
		private String number;

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getNumber() {
			return number;
		}

		public void setNumber(String number) {
			this.number = number;
		}
	}
}
