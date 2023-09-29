package com.tns.Inheritance;

public class Activa extends Bullet{
	private long maxspeed;
// set getters and setters
	
	public long getMaxspeed() {
		return maxspeed;
	}

	public void setMaxspeed(long maxspeed) {
		this.maxspeed = maxspeed;
	}
// to string function
	@Override
	public String toString() {
		return "Activa [maxspeed=" + maxspeed + ", getModelName()=" + getModelName() + ", getCompanyName()=" + getCompanyName() + "]";
		
	}
}