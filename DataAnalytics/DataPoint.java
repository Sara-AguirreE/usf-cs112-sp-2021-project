public class DataPoint{
	private Double f1;
	private Double f2;
	private String label;
	private Boolean isTest;
	
	public DataPoint(Double f1, Double f2, String label, Boolean isTest) {
		this.f1 = f1;
		this.f2 = f2;
		this.label = label;
		this.isTest = true;
	}
	public Double getF1() {
		return this.f1;
		
	}
	public Double getF2() {
		return this.f2;
	}
	public String getLabel() {
		return this.label;
	}
	public Boolean getisTest() {
		return this.isTest;
	}
	public void setF1(Double f1) {
		this.f1 =f1;
	}
	public void setF2(Double f1) {
		this.f2=f2;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public void setisTest(Boolean isTest) {
		this.isTest = true;
	}
