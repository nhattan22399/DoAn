package basic.dev;

import java.util.*;



import java.io.*;
public class MainApp {
	public static void input(List<Person> personList ){
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao so giao vien: ");
		int gv = sc.nextInt();
		for(int i = 1; i <gv+1; i++) {
			System.out.println("Bat dau nhap vao thong tin giao vien "+i+": ten, tuoi, ma giao vien, he so luong.");
			System.out.println("Ten: ");
			String name = sc.next();
			System.out.println("Tuoi: ");
			int age = sc.nextInt();
			System.out.println("Ma giao vien: ");
			String maGV = sc.next();
			System.out.println("He so luong: ");
			double heSoLuong = sc.nextDouble();
			Teacher teacher = new Teacher(name, age, maGV, heSoLuong);
			personList.add(teacher);
		}
		System.out.println("nhap vao so hoc sinh: ");
		int hs = sc.nextInt();
		for(int i = 1; i <hs+1; i++) {
			System.out.println("Bat dau nhap vao thong tin sinh vien "+i+": ten, tuoi, ma sinh vien, diem trung binh.");
			System.out.println("Ten: ");
			String name = sc.next();
			System.out.println("Tuoi: ");
			int age = sc.nextInt();
			System.out.println("Ma sinh vien: ");
			String maSV = sc.next();
			System.out.println("Diem trung binh: ");
			double dtb = sc.nextDouble();
			Student student = new Student(name, age, maSV, dtb);
			personList.add(student);
		}
		
	}
	
	public static void print(List<Person> personList) {
			Iterator<Person> it = personList.iterator();
			while(it.hasNext()) {
				Person person = it.next();
				System.out.println(person.toString());
			}
		}
	
	static void findTeacher(List<Person> personList) {
		Iterator<Person> it = personList.iterator();
		Person max = personList.get(0);
		while(it.hasNext()) {
			Person persons = it.next();
			if(max.heSoLuong() < persons.heSoLuong()) {
				max = persons;
			}
			
		}
		System.out.printf("Giao vien co he so luong lon nhat la: giao vien: %s -- he so luong %f", max.name, max.heSoLuong());
		System.out.println("");
	}
	
	static void findStudent(List<Person> personList) {
		Iterator<Person> it = personList.iterator();
		Person max = personList.get(0);
		while(it.hasNext()) {
			Person persons = it.next();
			if(max.dtb() < persons.dtb()) {
				max = persons;
			}
			
		}
		System.out.printf("Sinh vien co diem trung binh cao nhat la: sinh vien: %s -- diem trung binh: %f", max.name, max.dtb());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> personList = new ArrayList<Person>();
		input(personList);
		print(personList);
		findTeacher(personList);
		findStudent(personList);
      
	}

}
