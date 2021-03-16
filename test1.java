public class test1 {
	public static void main(String[] args) {
		int rnd = (int)(Math.random()*100)+1;
		System.out.println(rnd);
		if(rnd%2==0) {
			System.out.println("2‚Ì”{”‚Å‚·");
		}
		else if(rnd%3==0) {
			System.out.println("3‚Ì”{”‚Å‚·");
		}
	}
}
