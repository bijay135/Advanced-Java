package com.bijay.jsp;

public class ComputerPart {
	private String motherboard;
	private String cpu;
	private String gpu;
	private String ram;
	private String ssd;
    public ComputerPart(String motherboard,String cpu,String gpu,String ram,String ssd) {
    	this.motherboard = motherboard;
    	this.cpu = cpu;
    	this.gpu = gpu;
    	this.ram = ram;
    	this.ssd = ssd;
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
	public String getSsd() {
		return ssd;
	}
	public void setSsd(String ssd) {
		this.ssd = ssd;
	}
    
}
