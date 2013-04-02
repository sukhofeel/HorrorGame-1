package mta13438;

public class Player extends Entity {
	
	private int health;
	
	@Override
	public Player() {
		super();
		setHealth(0);
	}
	@Override
	public Player(Point pos, float speed, float angle, int health) {
		super();
		setHealth(health);
	}	
	
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	
	@Override
	public String toString() {
		return "Player [health=" + getHealth() + "speed=" + super.getSpeed() + ", angle=" + super.getAngle() + "]";
	}
	
}