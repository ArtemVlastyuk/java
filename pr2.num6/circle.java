package package6;

class circle{
    double r;

    public circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    public double s(){
        return r*r*Math.PI;
    }
    public double l(){
        return 2*Math.PI*r;
    }
    public int comp(circle a){
        return Double.compare(a.r, this.r);
    }
}
