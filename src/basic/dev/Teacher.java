package basic.dev;

public class Teacher extends Person{
	private String maGV;
	public double heSoLuong;

	public Teacher(String name, int age, String maGV, double heSoLuong) {
		// TODO Auto-generated constructor stub
		super();
		this.name= name;
		this.age = age;
		this.maGV= maGV;
		this.heSoLuong = heSoLuong;
	}
	public String toString() {

		return maGV+" Ten"+name+" Tuoi"+age+" He so luong"+heSoLuong; 
	}
	public String getMaGV() {
		return maGV;
	}
	public String setMaGV(String maGV) {
		return this.maGV = maGV;
	}
	
	@Override
	double heSoLuong() {
		// TODO Auto-generated method stub
		return this.heSoLuong;
	}
	@Override
	double dtb() {
		// TODO Auto-generated method stub
		return 0;
	}
}

