public class rectangle {
    static float areaRectangle(int length, int breadth)
    {
       int area = length * breadth;
       return area;
    }
    static float perimeterRectangle(int length, int breadth)
    {
       int perimeter = 2*(length + breadth);
       return perimeter;
    }
    public static void main (String[] args) {
        int length = 4;
        int breadth = 2;
        System.out.println("The area of rectangle is = "+ areaRectangle(length, breadth));
        System.out.println("The perimeter of rectangle is = "+ perimeterRectangle(length, breadth));
    }
}