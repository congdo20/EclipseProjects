package coban;

public class TestTV {
	public static void main(String[] args) {
		TV tv = new TV();
		
		//bat tv
        tv.turnOn();
        
        //thu kenh
        tv.setChannel(10);
        tv.channelUp();
        tv.channelDown();
        
        //thu am luong
        tv.setVolume(1);
        tv.volumeUp();
        tv.volumeDown();
        tv.volumeDown();
        
        //tat tv
        tv.turnOff();
		
	}
}
