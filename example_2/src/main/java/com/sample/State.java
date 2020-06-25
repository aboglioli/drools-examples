package com.sample;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class State {
	public static final int NOTRUN = 0;
	public static final int FINISHED = 1;
	
	private final PropertyChangeSupport changes = new PropertyChangeSupport(this);
	
	public State(String name) {
		this.name = name;
	}
	
	private String name;
	private int state;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		int oldState = this.state;
		this.state = state;
		this.changes.firePropertyChange("state", oldState, state);
	}
	
	public String toString() {
		return this.name + "[" + this.state + "]";
	}
	
    public void addPropertyChangeListener(final PropertyChangeListener l) {
        this.changes.addPropertyChangeListener( l );
    }

    public void removePropertyChangeListener(final PropertyChangeListener l) {
        this.changes.removePropertyChangeListener( l );
    }
}
