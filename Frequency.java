package Kursova;

public enum Frequency {
	Weekly(52),
	Monthly(12),
	Quaterly(4),
	Yearly(1);
	private int yearFreqCount;
	

	private Frequency(int yearFreqCount) {
		this.yearFreqCount = yearFreqCount;
	}

	public int getYearFreqCount() {
		return yearFreqCount;
	}

	public void setYearFreqCount(int yearFreqCount) {
		this.yearFreqCount = yearFreqCount;
	}
	
}
