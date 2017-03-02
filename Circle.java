package shapes;

class Circle extends TwoDimensionalShape{

  private double radius;

  public Circle(){
    this.radius = 0.0;
  }

  public double getArea(){
    return Math.PI * (this.radius*this.radius);
  }
  public double getPerimeter(){
    return 2 * Math.PI * this.radius;
  }
}
