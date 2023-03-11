public class HarmonicSeries {
	public static void main(String[] args) {
		int[] serie = {3,5,7,9};
		double result=0;
		int sum=1;
		for(int i=0;i<serie.length;i++) {
			sum += 1/serie[i];
			result = (serie.length) / (sum);
		}
		System.out.print("Harmonic Average: " + result);
	}
}
