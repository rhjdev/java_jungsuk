package ch07_object_oriented_programming;

public class Ex19 {

	public static void main(String[] args) {
		
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		
		b.summary();
	}
}

class Buyer {
	int money = 1000;
	Product[] cart = new Product[3];
	int i = 0;
	
	void buy(Product p) {
		/* 가진 돈과 물건 값을 비교하여 가진 돈이 적으면 메소드 종료 */
		if(p.price > money) {
			System.out.println("잔액이 부족하여 " + p +"을(를) 살 수 없습니다.");
			return;
		}
		/* 가진 돈이 충분하면 물건 값에서 가진 돈 차감 */
		money -= p.price;
		/* 카트에 물건 추가 */
		add(p);
	}

	void add(Product p) {
		/* i의 값이 카드 크기와 같거나 크면 */
		if(i >= cart.length) {
			/* 2배 큰 새로운 배열 생성해 복사 */
			Product[] otherCart = new Product[cart.length * 2];
			System.arraycopy(cart, 0, otherCart, 0, cart.length);
//			for(int j=0; j < cart.length; j++) {
//				otherCart[j] = cart[j];
//			}
			/* 새로운 카드와 기존 카드간 스위치 */
			cart = otherCart;
		}
		/* 물건을 카트에 저장 */
		/* i 값 1 증가 */
		cart[i++] = p;
//			i++;
	}

	
	void summary() {
		String item = "";
		int sum = 0;
		for(int i=0; i < cart.length; i++ ) {
			if(cart[i]==null) {
				break;
			}
			/* 카트 목록 출력 */
			item += cart[i] + " ";
			/* 가격 합산 출력 */
			sum += cart[i].price;		
		}
		
		System.out.println("구입한 물건 : " + item);
		System.out.println("사용한 금액 : " + sum);
		/* 남은 금액 출력 */
		System.out.println("남은 금액 : " + money);
	}
}

class Product {
	int price;
	Product(int price) {
		this.price = price;
	}
}

class Tv extends Product {
	Tv() {
		super(100);
	}
	
	@Override
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}
	
	@Override
	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	Audio() {
		super(50);
	}
	
	@Override
	public String toString() {
		return "Audio";
	}
}
