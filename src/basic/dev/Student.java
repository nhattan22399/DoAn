package basic.dev;

public class Student extends Person {
	public String maSV;
	public double dtb;
	
	public Student(String name, int age, String maSV, double dtb) {
		// TODO Auto-generated constructor stub
		super();
		this.maSV = maSV;
		this.name = name;
		this.dtb = dtb;
		this.age = age;
	}
	public String toString() {
		return maSV+" Ten "+name+" Tuoi "+age+" Diem trung binh "+dtb; 
	}
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	
	@Override
	double heSoLuong() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	double dtb() {
		// TODO Auto-generated method stub
		return this.dtb;
	}
	
}
