package lab8;

final class lab8 {
	public static final double sum (double...x) {
		double S =0;
		for(double i : x) {
			S+=i;
		}
		return S;
	}
	public static final double min(double...x) {
		double min = 0;
		for(double i :x) {
			min=i;
		}
		for(double i:x) {
			if(min>i) {
				min=i;
			}
		}
		return min;
	}
	public static final double max(double...x) {
		double max = 0;
		for(double i :x) {
			max=i;
		}
		for(double i:x) {
			if(max<i) {
				max=i;
			}
		}
		return max;
	}
	
//	public static void main(String[] args) {
//		double S=0;
//		S=sum(1,2,3,4,5);
//		System.out.println(S);
//	}
	public static final String toUpperFirstChar(String s) {
		String[] words= s.split(" ");
		
		for(int i=0; i<words.length;i++) {
			char firstChar = words[i].charAt(0);
			char upperFirstCharkey = String.valueOf(firstChar).toUpperCase().charAt(0);
			words[i]= upperFirstCharkey + words[i].substring(1);
		}
		String ss= String.join(" ",words);
		return ss;
	}
}