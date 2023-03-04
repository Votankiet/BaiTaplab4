// File: cau2.java

// Lớp Circle đại diện cho hình tròn
class Circle {
    private double radius;
    private String color;

    // Hàm khởi tạo Circle
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    // Phương thức getter và setter cho biến radius
    public double getRadius(){
        return radius;   
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    // Phương thức getter và setter cho biến color
    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    // Phương thức tính diện tích hình tròn
    public double getArea(){
        return this.radius * this.radius * Math.PI;  
    }

    // Phương thức toString để in thông tin hình tròn
    public String toString(){
        return "Circle{" + "radius=" + radius + ", color='" + color + '\'' +'}';
    }
}

// Lớp Cylinder kế thừa từ lớp Circle và đại diện cho hình trụ
class Cylinder extends Circle {
    private double height;

    // Hàm khởi tạo Cylinder
    public Cylinder(double radius, String color, double height){
        // Gọi hàm khởi tạo của lớp Circle để thiết lập bán kính và màu sắc
        super(radius, color);
        this.height = height;
    }

    // Phương thức getter và setter cho biến height
    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    // Phương thức tính thể tích hình trụ
    public double getVolume(){
        return super.getArea() * this.height;
    }
}

public class cau2 {
    public static void main(String[] args) {
        // Tạo đối tượng Cylinder với bán kính 2.4, màu sắc đỏ, và chiều cao 10
        Cylinder cylinder = new Cylinder(2.4,"red",10);

        // In diện tích và thể tích của hình trụ
        System.out.println("Area: " + cylinder.getArea());
        System.out.println("Volume: " + ((Cylinder) cylinder).getVolume());
    }
}