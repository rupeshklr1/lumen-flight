package com.lumen.lumenflightmangement.viewmodels;

import java.time.LocalDateTime;

public class FlightListCreateViewModel {
	private String flightCode;
	private String origin;
	private String destination;
	private int capacity;
	private LocalDateTime dateAndTimeOfFight;

	public String getFlightCode() {
		return flightCode;
	}

	public void setFlightCode(String flightCode) {
		this.flightCode = flightCode;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public LocalDateTime getDateAndTimeOfFight() {
		return dateAndTimeOfFight;
	}

	public void setDateAndTimeOfFight(LocalDateTime dateAndTimeOfFight) {
		this.dateAndTimeOfFight = dateAndTimeOfFight;
	}
}
