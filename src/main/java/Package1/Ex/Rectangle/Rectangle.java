package Package1.Ex.Rectangle;

public class Rectangle {
    int width;  //넓이
    int height; //높이
    boolean square = false;

    void Area() {
        int area = width * height;
        System.out.println("넓이는 : " + area);
    }

    void Perimeter() {
        int perimeter = (width + height) * 2;
        System.out.println("둘레는 = " + perimeter);
    }

    void Square() {
        if (width == height) {
            System.out.println("정사각형입니다");
        } else {
            System.out.println("아님");
        }
    }
/*    int Area; //넓이
    int Perimeter; //둘레
    boolean square; //정사각형 여부*/

}
