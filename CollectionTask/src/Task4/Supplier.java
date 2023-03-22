package Task4;

public class Supplier {
	private int supId;
	private String supName;
	private String supCity;
	public int getSupId() {
		return supId;
	}
	public void setSupId(int supId) {
		this.supId = supId;
	}
	public String getSupName() {
		return supName;
	}
	public void setSupName(String supName) {
		this.supName = supName;
	}
	public String getSupCity() {
		return supCity;
	}
	public void setSupCity(String supCity) {
		this.supCity = supCity;
	}
	@Override
	public String toString() {
		return "Supplier [supId=" + supId + ", supName=" + supName + ", supCity=" + supCity + "]";
	}
	
	
	

}
