package proj;

public class Score {
	
	public static int each(int diff){
//		int score1 = 0;
		System.out.println("差" + diff);
		int score=0;
		switch (diff) {
		case 0:
			System.out.println("10分");
			score = 10;
			break;
		case 1:
			System.out.println("8分");
			score = 8;
			break;
		case 2:
			System.out.println("6分");
			score = 6;
			break;
		case 3:
			System.out.println("4分");
			score = 4;
			break;
		case 4:
			System.out.println("2分");
			score = 2;
			break;
		default:
			System.out.println("0分");
			score = 0;
		}
		
		return score;
	}

}
