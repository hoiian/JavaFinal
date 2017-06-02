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
	
	public static String note(int k){
		switch(k){
		case 0: return "C";
		case 1: return "C#";
		case 2: return "D";
		case 3: return "D#";
		case 4: return "E";
		case 5: return "F";
		case 6: return "F#";
		case 7: return "G";
		case 8: return "G#";
		case 9: return "A";
		case 10: return "A#";
		case 11: return "B";
		case 12: return "C";
		}
		return null;
	}

}
