package lab5;

public class Citydetail {
	private String cityname;
	private String state;
	private String touristPlaces;
	private String info;
	public Citydetail(String cityname, String state, String touristPlaces, String info) {
		super();
		this.cityname = cityname;
		this.state = state;
		this.touristPlaces = touristPlaces;
		this.info = info;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getTouristPlaces() {
		return touristPlaces;
	}
	public void setTouristPlaces(String touristPlaces) {
		this.touristPlaces = touristPlaces;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	@Override
	public String toString() {
		return "[cityname=" + cityname + ", state=" + state + ", touristPlaces=" + touristPlaces + ", info="
				+ info + "]";
	}
	
	
}
