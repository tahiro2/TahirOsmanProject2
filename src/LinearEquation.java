public class LinearEquation {
    //INIT VARIABLES
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    //CONSTRUCTOR
    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    //METHODS
    public double distance() {
        double distance = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
        return Math.round(distance * 100.00) / 100.00;
    }

    public double slope() {
        double slope = ((double) (y2 - y1) / (x2 - x1));
        return Math.round(slope * 100.0) / 100.0;
    }

    public double yint() {
        double yint = ((double) y1 - slope() * x1);
        return Math.round(yint * 100.0) / 100.0;
    }

    public String equationToString() {
        // y = mx+b
        String equation = "n/a";
        if (yint() > 0) {
            if ((y2 - y1) % (x2 - x1) == 0) {
                equation = "y = " + ((y2 - y1) / (x2 - x1)) + "x + " + yint();
            } else {
                if (y2 - y1 < 0 && x2 - x1 < 0) {
                    equation = "y = -" + ((y2 - y1) * -1) + "/" + ((x2 - x1) * -1) + "x + " + yint();
                } else if (y2 - y1 > 0 && x2 - x1 < 0) {
                    equation = "y =" + (y2 - y1) + "/" + ((x2 - x1) * -1) + "x + " + yint();
                } else if (y2 - y1 < 0 && x2 - x1 > 0) {
                    equation = "y = -" + ((y2 - y1) * -1) + "/" + (x2 - x1) + "x + " + yint();
                } else {
                    equation = "y = " + (y2 - y1) + "/" + (x2 - x1) + "x + " + yint();
                }
            }
        } else {
            if ((y2 - y1) % (x2 - x1) == 0) {
                equation = "y = " + ((y2 - y1) / (x2 - x1)) + "x " + yint();
            } else {
                if (y2 - y1 < 0 && x2 - x1 < 0) {
                    equation = "y = -" + ((y2 - y1) * -1) + "/" + ((x2 - x1) * -1) + "x " + yint();
                } else if (y2 - y1 > 0 && x2 - x1 < 0) {
                    equation = "y =" + (y2 - y1) + "/" + ((x2 - x1) * -1) + "x " + yint();
                } else if (y2 - y1 < 0 && x2 - x1 > 0) {
                    equation = "y = -" + ((y2 - y1) * -1) + "/" + (x2 - x1) + "x " + yint();
                } else {
                    equation = "y = " + (y2 - y1) + "/" + (x2 - x1) + "x " + yint();
                }
            }
        }
        if (yint() == 0) {
            equation = equation.substring(0, equation.indexOf("+"));
        }
        if (slope() == 0) {
            equation = equation.substring(0, equation.indexOf("0")) + equation.substring(equation.indexOf("x") + 3);
        }
        return equation;
    }
    public String equationInfo(){
        //the two points, the slope, the y-intercept, the equation of the line through the two points in y = mx + b format, and the distance between the two points.
        String points = ("COORDINATES: (" + x1 + ", " + y1 + ") , (" + x2 + ", " + y2 + ")");
        String slope = ("SLOPE: " + slope());
        String yint = ("Y-INTERCEPT: " + yint());
        String equation2 = ("EQUATION OF THE LINE THROUGH THE POINTS (Y = MX+B): " + equationToString());
        String distance = ("DISTANCE BETWEEN POINTS: " + distance());
        return points + "\n" + slope + "\n" + yint + "\n" + equation2 + "\n" + distance + "\n";
    }
    public String xToCoord(double xValue){
        double yValue = (slope() * xValue) + yint();
        return "(" + xValue + ", " + Math.round(yValue * 100.0) / 100.0 + ")";
    }
}