abstract  class Shape {
    abstract void area();
}

class Circle extends Shape {
    int r;

    Circle(int r){
        this.r = r;
    }

    @Override
    void area(){
        double result = Math.PI * (Math.pow(r , 2));
        System.out.printf("%.4f\n",result);
    }
}

class Rectangle extends Shape {
    int w;
    int h;

    Rectangle(int w, int h) {
        this.w = w;
        this.h = h;
    }

    @Override
    void  area() {
        System.out.println(w*h);
    }
}

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(3);
        shapes[1] = new Rectangle(4,5);

        for (Shape shape : shapes) {
            shape.area();
        }
    }
}