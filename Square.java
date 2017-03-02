package shapes;

class Square extends Rectangle{

  private double side;

  private Square(){
    super(0.0,0.0);
    this.side = 0.0;
  }

  public Square(double side){
    super(side,side);
  }


}
