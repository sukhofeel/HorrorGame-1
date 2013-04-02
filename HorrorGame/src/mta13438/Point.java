package mta13438;

public class Point {
	private float x,y,z;
	
	public Point(){
		setX(0);
		setY(0);
		setZ(0);
	}
	
	public Point(float x, float y,float z){
		setX(x);
		setY(y);
		setZ(z);
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public float getZ() {
		return z;
	}

	public void setZ(float z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	@Override
	public boolean equals(Object obj){
		if (obj == null) return false;
		if (!(obj instanceof Point)) return false;
		Point point = (Point)obj;
		if (!(getX() == point.getX())) return false;
		if (!(getY() == point.getY())) return false;
		if (!(getZ() == point.getZ())) return false;
		return true;
	}
	
	public int compareTo(Point point){
		if (point == null) return 1;
		if (this.equals(point)) return 0;
		if (getX() > point.getX()) return 1;
		if (getY() > point.getY()) return 1;
		if (getZ() > point.getZ()) return 1;
		if (getX() < point.getX()) return -1;
		if (getY() < point.getY()) return -1;
		if (getZ() < point.getZ()) return -1;
		return 0;
	}
}