package mta13438;

public class Water extends Obs {
	private Sound waterSound = new Sound(WATERSOUND,getPos(),10,10);
	public void collide(){
		//waterSound.play(); only when the player walks.
	}

	
	@Override
	public String toString() {
		return "Water [pos=" + getPos() + ", dx=" + getDx() + ", dz=" + getDz()
				+ ", lenght=" + getLenght() + ", sabins=" + getSabins() + "]";
	}
}
