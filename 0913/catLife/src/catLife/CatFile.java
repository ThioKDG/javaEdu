package catLife;

import java.util.Scanner;

class Cat{
	private String breed;
	String color;
	int age;
	
	public String getBreed() {
		return breed;
	}
	
	public void setBreed(String br) {
		this.breed = br;
	}
	
	Cat(String breed, String color, int age){
		this.breed = breed;
		this.color = color;
		this.age = age;
	}
	
	Cat(String breed, String color){
		this.breed = breed;
		this.color = color;
	}
	
	Cat(String breed){
		this.breed = breed;
	}
	
	void eat(String time) {
		System.out.println(time + "에 사료를 먹습니다.");
	}
	
	void meow() {
		System.out.println("야옹~~~~");
	}
	
	void scratch() {
		System.out.println("스크래치를 긁습니다.");
	}
}

public class CatFile {

	public static void main(String[] args) {
		Cat cats = new Cat("코리안 숏헤어", "치즈테비");
		
		System.out.println("나의 고양이는 " + cats.getBreed() + "입니다.");
		cats.eat("아침");
		cats.meow();
		System.out.println(" ");
		
		cats.eat("점심");
		cats.scratch();
		cats.meow();
		
		
		
		
		
	}

}
