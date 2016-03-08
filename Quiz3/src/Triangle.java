public class Triangle extends GeometricObject {
	
	double Area;
	double P;
	public Triangle(double S1, double S2, double S3) {
		this.S1 = S1;
		this.S2 = S2;
		this.S3 = S3;
	}

	public Triangle() {
		this.S1 = 2;
		this.S2 = 3;
		this.S3 = 4;
		
	}
		

	
	private double S1;
	private double S2;
	private double S3;

	// there are three getter and setter
	public double getS1() {
		return S1;
	}

	public void setS1(double S1) {
		this.S1 = S1;
	}

	public double getS2() {
		return S2;
	}

	public void setS2(double S2) {
		this.S2 = S2;
	}

	public double getS3() {
		return S3;
	}

	public void setS3(double S3) {
		this.S3 = S3;
	}

	@Override
	public double getArea() {
		double P = getP() / 2;
		return Math.sqrt(P * ((P - S1) * (P - S2) * (P - S3)));
	}

	public double getP() {
		this.P = S1 + S2 + S3;
		return P;
	}

	public String toString() {
		return " Triangle: Side 1 = " + S1 + " Side 2 = " + S2 + " Side 3 = " + S3;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

}