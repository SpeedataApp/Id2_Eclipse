package com.speedata.libid2;

import java.util.List;

/**
 * @author :Reginer 功能描述:配置实体类
 */
public class Config {

	private Id2Bean id2;

	public Id2Bean getId2() {
		return id2;
	}

	public void setId2(Id2Bean id2) {
		this.id2 = id2;
	}

	public static class Id2Bean {
		/**
		 * serialPort : /dev/ttyMT1 braut : 115200 powerType : MAIN gpio :
		 * [88,6]
		 */

		private String serialPort;
		private int braut;
		private String powerType;
		private List<Integer> gpio;

		public String getSerialPort() {
			return serialPort;
		}

		public void setSerialPort(String serialPort) {
			this.serialPort = serialPort;
		}

		public int getBraut() {
			return braut;
		}

		public void setBraut(int braut) {
			this.braut = braut;
		}

		public String getPowerType() {
			return powerType;
		}

		public void setPowerType(String powerType) {
			this.powerType = powerType;
		}

		public List<Integer> getGpio() {
			return gpio;
		}

		public void setGpio(List<Integer> gpio) {
			this.gpio = gpio;
		}
	}
}
