package com.bijay.servlet.app.dto;

public class Computer {
	private int price;
	private String casing;
	private String motherboard;
	private String cpu;
	private String gpu;
	private String ram;
	private String storage;
	private String powersupply;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCasing() {
		return casing;
	}

	public void setCasing(String casing) {
		this.casing = casing;
	}

	public String getMotherboard() {
		return motherboard;
	}

	public void setMotherboard(String motherboard) {
		this.motherboard = motherboard;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getGpu() {
		return gpu;
	}

	public void setGpu(String gpu) {
		this.gpu = gpu;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getStorage() {
		return storage;
	}

	public void setStorage(String storage) {
		this.storage = storage;
	}

	public String getPowersupply() {
		return powersupply;
	}

	public void setPowersupply(String powersupply) {
		this.powersupply = powersupply;
	}

}
