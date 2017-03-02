package shapes;

class Rectangle extends TwoDimensionalShape{

  private double height;
  private double width;

  private Rectangle(){
    this.height = 0.0;
    this.width = 0.0;
  }

  public Rectangle(double height, double width){
    this.height = height;
    this.width = height;
  }

  public double getArea(){
    return (this.height * this.width);
  }
  public double getPerimeter(){
    return (2*this.height)+(2*this.width);
  }
}
