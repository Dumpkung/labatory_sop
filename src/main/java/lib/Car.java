package lib;

public class Car implements Cloneable {
	    private String color;
	    private String type;
	    private double speed;
	    private int displacement;
	    private boolean sunroof;

	    public Car(String color, String type, int displacement, boolean sunroof, double speed) {
	        this.color = color;
	        this.type = type;
	        this.displacement = displacement;
	        this.sunroof = sunroof;
	        this.speed = speed;
	    }
	    
	    public String getColor() {
	        return color;
	    }

	    public void setColor(String color) {
	        if (color.length() == 0) {
	        	color = "red";
	        } else {
	            this.color = color;
	        }
	    }
	    
	    public String getType() {
	        return type;
	    }

	    public void setType(String type) {
	        if (type.length() == 0) {
	            this.type = "No details";
	        } else {
	            this.type = type;
	        }
	    }

	    public double getDisplacement() {
	        return displacement;
	    }

	    public void setDisplacement(int displacement) {
	        if (displacement <= 0) {
	            this.displacement = 200;
	        } else {
	            this.displacement = displacement;
	        }
	    }
	    
	    public double getSpeed() {
	        return speed;
	    }

	    public void setSpeed(double speed) {
	        if (speed <= 0) {
	            this.speed = 200;
	        } else {
	            this.speed = speed;
	        }
	    }
	    
	    public boolean getSunroof() {
	        return sunroof;
	    }

	    public void setSunroof(boolean sunroof) {
	         this.sunroof = sunroof;
	    }
	    
	    @Override
	    protected Object clone() throws CloneNotSupportedException {
	        return super.clone();
	    }
}
