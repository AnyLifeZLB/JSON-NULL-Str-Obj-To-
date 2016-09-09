package com.anylife.jsont.json_null_str_obj_to;

import java.util.List;

/**
 * Created by zenglb on 2016/9/5.
 */
public class Weather {


	/**
	 * lon : 114.07
	 * lat : 22.55
	 */

	private CoordBean coord;
	/**
	 * coord : {"lon":114.07,"lat":22.55}
	 * weather : [{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03d"}]
	 * base : stations
	 * main : {"temp":301.84,"pressure":1005,"humidity":78,"temp_min":300.65,"temp_max":304.82}
	 * visibility : 10000
	 * wind : {"speed":2.6,"deg":250}
	 * clouds : {"all":40}
	 * dt : 1473151216
	 * sys : {"type":1,"id":7904,"message":0.0116,"country":"CN","sunrise":1473113277,"sunset":1473158134}
	 * id : 1795565
	 * name : Shenzhen
	 * cod : 200
	 */

	private String base;
	/**
	 * temp : 301.84
	 * pressure : 1005
	 * humidity : 78
	 * temp_min : 300.65
	 * temp_max : 304.82
	 */

	private MainBean main;
	private int visibility;
	/**
	 * speed : 2.6
	 * deg : 250
	 */

	private WindBean wind;
	/**
	 * all : 40
	 */

	private CloudsBean clouds;
	private int dt;
	/**
	 * type : 1
	 * id : 7904
	 * message : 0.0116
	 * country : CN
	 * sunrise : 1473113277
	 * sunset : 1473158134
	 */

	private SysBean sys;
	private int id;
	private String name;
	private int cod;
	/**
	 * id : 802
	 * main : Clouds
	 * description : scattered clouds
	 * icon : 03d
	 */

	private List<WeatherBean> weather;

	public CoordBean getCoord() {
		return coord;
	}

	public void setCoord(CoordBean coord) {
		this.coord = coord;
	}

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public MainBean getMain() {
		return main;
	}

	public void setMain(MainBean main) {
		this.main = main;
	}

	public int getVisibility() {
		return visibility;
	}

	public void setVisibility(int visibility) {
		this.visibility = visibility;
	}

	public WindBean getWind() {
		return wind;
	}

	public void setWind(WindBean wind) {
		this.wind = wind;
	}

	public CloudsBean getClouds() {
		return clouds;
	}

	public void setClouds(CloudsBean clouds) {
		this.clouds = clouds;
	}

	public int getDt() {
		return dt;
	}

	public void setDt(int dt) {
		this.dt = dt;
	}

	public SysBean getSys() {
		return sys;
	}

	public void setSys(SysBean sys) {
		this.sys = sys;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public List<WeatherBean> getWeather() {
		return weather;
	}

	public void setWeather(List<WeatherBean> weather) {
		this.weather = weather;
	}

	public static class CoordBean {
		private double lon;
		private double lat;

		public double getLon() {
			return lon;
		}

		public void setLon(double lon) {
			this.lon = lon;
		}

		public double getLat() {
			return lat;
		}

		public void setLat(double lat) {
			this.lat = lat;
		}
	}

	public static class MainBean {
		private double temp;
		private int pressure;
		private int humidity;
		private double temp_min;
		private double temp_max;

		public double getTemp() {
			return temp;
		}

		public void setTemp(double temp) {
			this.temp = temp;
		}

		public int getPressure() {
			return pressure;
		}

		public void setPressure(int pressure) {
			this.pressure = pressure;
		}

		public int getHumidity() {
			return humidity;
		}

		public void setHumidity(int humidity) {
			this.humidity = humidity;
		}

		public double getTemp_min() {
			return temp_min;
		}

		public void setTemp_min(double temp_min) {
			this.temp_min = temp_min;
		}

		public double getTemp_max() {
			return temp_max;
		}

		public void setTemp_max(double temp_max) {
			this.temp_max = temp_max;
		}
	}

	public static class WindBean {
		private double speed;
		private int deg;

		public double getSpeed() {
			return speed;
		}

		public void setSpeed(double speed) {
			this.speed = speed;
		}

		public int getDeg() {
			return deg;
		}

		public void setDeg(int deg) {
			this.deg = deg;
		}
	}

	public static class CloudsBean {
		private int all;

		public int getAll() {
			return all;
		}

		public void setAll(int all) {
			this.all = all;
		}
	}

	public static class SysBean {
		private int type;
		private int id;
		private double message;
		private String country;
		private int sunrise;
		private int sunset;

		public int getType() {
			return type;
		}

		public void setType(int type) {
			this.type = type;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public double getMessage() {
			return message;
		}

		public void setMessage(double message) {
			this.message = message;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public int getSunrise() {
			return sunrise;
		}

		public void setSunrise(int sunrise) {
			this.sunrise = sunrise;
		}

		public int getSunset() {
			return sunset;
		}

		public void setSunset(int sunset) {
			this.sunset = sunset;
		}
	}

	public static class WeatherBean {
		private int id;
		private String main;
		private String description;
		private String icon;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getMain() {
			return main;
		}

		public void setMain(String main) {
			this.main = main;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getIcon() {
			return icon;
		}

		public void setIcon(String icon) {
			this.icon = icon;
		}
	}
}
