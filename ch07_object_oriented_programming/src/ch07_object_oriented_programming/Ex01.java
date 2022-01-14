package ch07_object_oriented_programming;

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	SutdaDeck() {
		for(int i=0; i < cards.length; i++) {
			int num = i % 10 + 1;
			boolean isKwang = (i < 10) && (num == 1 || num == 3 || num == 8);
			
			cards[i] = new SutdaCard(num, isKwang);
		
		}
	}
	
	public void Shuffle() {
		int random = (int)(Math.random() * cards.length);
		for(int i=0; i < cards.length; i++) {
			SutdaCard tmp = cards[i];
			cards[i] = cards[random];
			cards[random] = tmp;
		}
	}
	
	public SutdaCard pick(int index) {
		if(index < 0 || index >= CARD_NUM) {
			return null;
		}
		return cards[index];
	}
	
	public SutdaCard pick() {
		int index = (int)(Math.random() * cards.length);
		return pick(index);
	}
}

class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard() {
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}
public class Ex01 {

	public static void main(String[] args) {
		
		/* Ex01 */
//		SutdaDeck deckA = new SutdaDeck();
//		for(int i=0; i < deckA.cards.length; i++) {
//			System.out.print(deckA.cards[i] + " ");
//		}
		
		/* Ex02 */
		SutdaDeck deckB = new SutdaDeck();
		System.out.println(deckB.pick(0));
		System.out.println(deckB.pick());
		
		for(int i=0; i < deckB.cards.length; i++) {
			System.out.print(deckB.cards[i] + " ");
		}
		System.out.println();
		System.out.println(deckB.pick(0));
	}
}
