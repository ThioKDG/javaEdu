package account;

import java.util.Scanner;

class Account {
	private String accounNo;
	private String owner;
	private int balance;
	
	public Account(String accounNo, String owner, int balance) {
		this.accounNo = accounNo;
		this.owner = owner;
		this.balance = balance;
	}

	public String getAccounNo() {
		return accounNo;
	}

	public void setAccounNo(String accounNo) {
		this.accounNo = accounNo;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}

public class BankApplication {
	
	private static Account[] accoArray = new Account[100];
	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		while(1) {
			System.out.println("---------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("---------------------------------------");
			
			System.out.print("선택> ");
			String selecNum = scanner.nextLine();
			
			switch(selecNum) {
			case "1" :
				createAccount();
				break;
			case "2" :
				accountList();
				break;
			case "3" :
				deposit();
				break;
			case "4" :
				withdraw();
			case "5" :
				out();
				break;
			default:
				System.out.println("잘못된 값을 입력하셨습니다. 다시 입력해 주세요");
				continue;
			}
		}
		System.out.println("프로그램 종료");
	}
	
	private static void createAccount() {
		System.out.println("----------");
		System.out.println("계좌생성");
		System.out.println("----------");
		
		System.out.print("계좌번호 : ");
		String accounNo = scanner.nextLine();
		
		System.out.print("계좌주 : ");
		String owner = scanner.nextLine();
		
		System.out.print("초기입금액 : ");
		int Money = scanner.nextInt();
		
		for(int i = 0; i < accoArray.length; i++) {
			if(accoArray[i] == null) {
				accoArray[i] = new Account(accounNo, owner, money);
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}
		}
	}
	private static void accountList() {
		System.out.println("--------");
		System.out.println("계좌목록");
		System.out.println("--------");
		for (int i = 0; i < accoArray.length; i++) {
			if (Array[i] == null) {
				break;
			}
			System.out.println(
					accoArray[i].getAccounNo() + "\t" + accoArray[i].getOwner() + "\t" + accoArray[i].getBalance());
		}
	}
	
	private static Account findAccount(String ano) {
		for (int i = 0; i < accoArray.length; i++) {
			if (accoArray[i] == null) {
				break;
			}
			if (accoArray[i].getAno().equals(ano)) {
				return accoArray[i];
			}
		}
		return null;
	}
	
	private static void deposit() {
		System.out.println("--------");
		System.out.println("예금");
		System.out.println("--------");
		System.out.print("계좌번호: ");
		String accounNo = scanner.nextLine();
		System.out.print("예금액: ");
		int dep = scanner.nextLine();

		if (findAccount(accounNo) == null) {
			System.out.println("입력한 계좌번호를 찾지 못했습니다.");
		} else {
			findAccount(accounNo).setBalance(findAccount(accounNo).getBalance() + dep);
			System.out.println("결과: 입금이 성공되었습니다.");
		}
		
	}
	
	private static void withdraw() {
		System.out.println("--------");
		System.out.println("출금");
		System.out.println("--------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("출금액: ");
		int withd = scanner.nextInt();

		if (findAccount(accounNo) == null) {
			System.out.println("입력한 계좌번호를 찾지 못했습니다.");
		} else {
			if (withd > findAccount(accounNo).getBalance()) {
				System.out.println("잔액보다 큰 액수를 입력하셨습니다.");
			} else {
				findAccount(accounNo).setBalance(findAccount(ano).getBalance() - withd);
				System.out.println("결과: 출금이 성공되었습니다.");
			}
		}
	}
	
}
