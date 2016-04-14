
public class TV {
	public int channel = 1;
	public int volume = 1;
	public boolean on;
	
	public void turnOn(){
		this.on = true;
	}
	
	public void turnOff(){
		this.on = false;
	}
	
	public void setChannel(int c){
		if(this.on == true)
		this.channel = c;
	}
	
	public void setVolume(int v){
		if(this.on == true)
		this.volume = v;
	}
	
	public void channelUp(){
		if(this.on == true)
		this.channel = channel + 1;
	}
	
	public void channelDown(){
		if(this.on == true)
		this.channel = channel - 1;
	}
	
	public void volumeUp(){
		if(this.on == true)
		this.volume = volume + 1;
	}
	
	public void volumeDown(){
		if(this.on == true)
		this.volume = volume - 1;
	}
}
