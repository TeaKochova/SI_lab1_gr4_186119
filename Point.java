class Point {
	String id
	double x,y;

	//TODO add new variable
    String boja = "zolta"

	//TODO constructor
    public Point(String id, double x, double y, String boja) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.boja = boja;
    }

	//TODO setters and getters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getBoja() {
        return boja;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }

	public void move (char xDirection, char yDirection) {
		//TODO
        x = getX();
        y = getY();
        //ako za Y se dobie parametar L ili R ne treba nisto da pravi ne moze y koordinta da se pomesi levo ili desno
        //isto i za X ako se dobie parametar U ii D nema da moze da odi gore
        //zatoa imam 4 if-ovi pa vo zavisnost od niv kje se pomesi soodvetnata koordinata
        if (xDirection == "L") {
            x = x - 1;
            setX(x);
        }
        if (xDirection == "R") {
            x = x + 1;
            setX(x);
        }
        if (yDirection == "U") {
            y = y + 1;
            setY(y);
        }
        if (yDirection == "D") {
            y = y - 1;
            setY(y);
        }
	}

	public void draw () {
		//TODO
        x = getX();
        y = getY();
        System.out.printf("x: %.2f y: %.2f", x, y);
	}
}

class Canvas
{
    ArrayList<Point> lista=new ArrayList<>();

    public void brisi(ArrayList<Point> lista)
    {
        for(int i=0;i<lista.size();i++)
        {
            lista.remove(i); //da receme sakame da gi izbriseme site tocki edna po edna
        }
    }
    public void dodadi(ArrayList<Point> lista)
    {
        Point tocka=new Point("sesta",6,0,"rozeva");
        lista.add(tocka); //da receme dodavame 6ta tocka
    }

}