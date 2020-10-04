package SimpleFraction;

public class Fraction {
	
	private int num;
	private int den;
	private double calcul;//Calculer le résultat
	
	 public Fraction(int num, int den)
	    {
	        this.den = den;
	        this.num = num;
	        this.calcul = (double)num/den;
	        
	    }
	public int getNum(){
		return num;
	}
	
	public int getDen(){
		return den;
	}
	
	public double getCalcul(){
		return calcul;
	}
	
	@Override
	public String toString() {
		String s = num + " / "+ den +" = " + calcul;
		return s;
	}
	
}
