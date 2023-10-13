package prototype;

abstract class Shape{
    public float x;
    public float y;
    public String color;

    public Shape(float x, float y, String color){
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public Shape(){
        this.x = 1;
        this.y = 1;
        this.color = "black";
    }


    public abstract Shape clone();

    public abstract void print();

}