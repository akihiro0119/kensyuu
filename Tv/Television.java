package Tv;

public class Television{
  private int channelNo;
  private String place;

  Television(String newPlace){
    channelNo = 1;
    place = newPlace;
  }

  public void setChannel(int newChannelNo){
    channelNo = newChannelNo;
  }

  public void dispChannel(){
    System.out.println("現在のチャンネルは" + channelNo+ "です");
    System.out.println("設置してある場所は" + place + "です");
  }
}
