
public class Television {

	int state;
	private int currentVol;
	private int currentChannel;
	
		int increaseVolume(int cVolume)
		{
			
			currentVol=currentVol+cVolume;
			return currentVol;
		}
		int decreaseVolume(int cVolume)
		{
			currentVol=currentVol-cVolume;
			return currentVol;
		}
		void changeChannel(int cC)
		{
			currentChannel=cC;
		}
		void onOff()
		{
		if(state==0)
			state=1;
		else
			state=0;
		}
	}

