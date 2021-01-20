public class Segment {

    char point1;
    char point2;

    int color;

    public Segment(char point1Input, char point2Input) {

        point1 = point1Input;
        point2 = point2Input;

        color = 0;

    }    

    public void setColor(int color) {

        this.color = color;

    }

    public int getColor() {

        return color;

    }

}