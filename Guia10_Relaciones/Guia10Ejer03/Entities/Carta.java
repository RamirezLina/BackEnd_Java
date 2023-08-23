class Carta {
  private int num;
  private String palo;

  Carta(){
    
  }

  public int getnum(){
    return num;

  }

  public String getpalo(){
    return palo;

  }

  public void setnum(int num){
    this.num=num;
  }

  public void setpalo(String palo){
    this.palo=palo;
  }

  @Override
  public String toString(){
    return "Carta " + num+" de "+palo;
      
  }
  
  }