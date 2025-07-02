package org.example;

public class Wall {
  double width;
  double height;

  public Wall(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public double getWidth() {
    return width;
  }

  public double getHeight() {
    return height;
  }

  public void setWidth(double newWidth) {
    if(newWidth>0) {
      this.width = newWidth;
    }
    else {
      this.width = 0;
    }
  }

  public void setHeight(double newHeight) {
    if(newHeight>0) {
      this.height = newHeight;
    }
    else {
      this.height = 0;
    }
  }

  public double getArea() {
    return this.height * this.width;
  }
}
