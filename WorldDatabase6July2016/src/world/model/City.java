package world.model;
/***
 * @author Harshada Gonge
 * Date 7July2016  
 */
public class City 
{
	private String id;
	private String name;
	private String district;
	private String countryCode;
	private String population;
	public City(String id, String name, String district, String countryCode, String population) {
		// TODO Auto-generated constructor stub
		super();
		this.id = id;
		this.name = name;
		this.district = district;
		this.countryCode =countryCode;
		this.population = population;
	}
	public City() {
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getPopulation() {
		return population;
	}
	public void setPopulation(String population) {
		this.population = population;
	}

}