package proj;

public class Score {
	
	public static int each(int diff){
//		int score1 = 0;
		System.out.println("�t" + diff);
		int score=0;
		switch (diff) {
		case 0:
			System.out.println("10��");
			score = 10;
			break;
		case 1:
			System.out.println("8��");
			score = 8;
			break;
		case 2:
			System.out.println("6��");
			score = 6;
			break;
		case 3:
			System.out.println("4��");
			score = 4;
			break;
		case 4:
			System.out.println("2��");
			score = 2;
			break;
		default:
			System.out.println("0��");
			score = 0;
		}
		
		return score;
	}

}
