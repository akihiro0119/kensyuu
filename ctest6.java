
class ctest6{
  public static void main(String args[]){
    Television tv1 = new Television();

    tv1.setChannel(1);

    tv1.setChannel("NHK");
    tv1.setChannel(3, "NHK総合");
  }
}

class Television{
  private int channelNo;
  private String housouKyoku;

  public void setChannel(int newChannelNo){
    channelNo = newChannelNo;

    if (newChannelNo == 1){
      housouKyoku = "FujiTV";
    }else if(newChannelNo == 3){
      housouKyoku = "NHK";
    }

    System.out.println("チャンネルが変更されました");
    dispChannelInfo();
  }

  public void setChannel(String newHousouKyoku){
    housouKyoku = newHousouKyoku;

    if (newHousouKyoku.equals("FujiTV")){
      channelNo = 1;
    }else if(newHousouKyoku.equals("NHK")){
      channelNo = 3;
    }

    System.out.println("放送局が変更されました");
    dispChannelInfo();
  }

  public void setChannel(int newChannelNo, String newHousouKyoku){
    channelNo = newChannelNo;
    housouKyoku = newHousouKyoku;

    System.out.println("チャンネルと放送局が変更されました");
    dispChannelInfo();
  }

  private void dispChannelInfo(){
    System.out.println("チャンネルNoは" + channelNo);
    System.out.println("放送局は" + housouKyoku);
  }
}
