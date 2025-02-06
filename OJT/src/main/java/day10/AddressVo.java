package day10;

public class AddressVo {
	// 이름, 나이, 성별, 전화번호, 주소
	private int seq;
	private String name;
	private int age;
	private Gender gender;
	private String phone;
	private String address;

	public int getSeq() {
		return this.seq;
	}

	public String getName() {
		return this.name;
	}

	public int setName(String name) {
		if (name == null || name.isEmpty()) {
			return 1;
		}
		this.name = name;
		return 0;
	}

	public int getAge() {
		return this.age;
	}

	public int setAge(int age) {
		if (age < 0) {
			return 1;
		}
		this.age = age;
		return 0;
	}

	public Gender getGender() {
		return this.gender;
	}

	public int setGender(Gender gender) {
		if (gender == null) {
			return 1;
		}
		this.gender = gender;
		return 0;
	}

	public String getPhone() {
		return this.phone;
	}

	public int setPhone(String phone) {
		if (phone == null || phone.isEmpty()) {
			return 1;
		}
		this.phone = phone;
		return 0;
	}

	public String getAddress() {
		return this.address;
	}

	public int setAddress(String address) {
		if (address == null || address.isEmpty()) {
			return 1;
		}
		this.address = address;
		return 0;
	}

	@Override
	public String toString() {
		return "seq=" + seq + ", name=" + name + ", age=" + age + ", gender=" + gender + ", phone=" + phone
				+ ", address=" + address;

	}
}
