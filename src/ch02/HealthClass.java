package ch02;

public class HealthClass {
	// �ｺ�� ���� ���α׷�
			String mNumber;
			String program;
			int mshipFee;
			int vip;
			boolean yn;
			
			
			//���� ����� �ֱ� set~
			public void setNumber(String mNumber) {
				this.mNumber = mNumber;
			}
			public void setProgram(String program) {
				this.program = program;
			}
			public void setMshipFee(int mshipFee) {
				this.mshipFee = mshipFee;
			}
			public void setVIP(int vip) {
				this.vip = vip;
			}
			public void setYn(boolean yn) {
				this.yn = yn;
			}
			//���� ��� ����ϱ� get~
			
			public String getMnumber() {
				return mNumber;
			}
			public String getProgram() {
				return program;
			}
			public int getMshipfee() {
				return mshipFee;
			}
			public int getVIP() {
				return vip;
			}
			public boolean getYn() {
				return yn;
			}
			

		

}
