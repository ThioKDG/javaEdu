package countableAbs;

abstract class Countable{
	abstract void count();
}

class Bird extends Countable {
	String name;
	int num;
	
	public Bird(String name, int num){
		this.name = name;
		this.num = num;
	}
	
	@Override
	public void count() {
		System.out.println(name + "가 " + num + "마리 있다.");
	}
	
	public void fly() {
		System.out.println(num + "마리 " + name +"가 날아간다.");
	}
}

class Tree extends Countable{
	String name;
	int num;
	
	public Tree(String name, int num) {
		this.name = name;
		this.num = num;
	}
	
	
	@Override
	void count() {
		System.out.println(name + "가 " + num + "그루 있다.");
	}
	void ripen() {
		System.out.println(num + "그루 " + name + "에 열매가 잘 익었다.");
	}
	
}

public class CountTestAbs {
	public static void main(String[] args) {
		Countable[] arr = new Countable[] {
				new Bird("뻐꾸기", 5), new Bird("독수리", 2), new Tree("사과나무", 10), new Tree("밤나무", 7)
		};
		
		for(Countable obj : arr) {
			obj.count();
			if(obj instanceof Bird) {
				Bird bird = (Bird) obj;
				bird.fly();
			}else {
				Tree tree = (Tree) obj;
				tree.ripen();
			}
		}
		
	}
}
