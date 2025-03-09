import java.util.Comparator;

public class Llapis implements Comparable<Llapis> {
    // Att
    private int color;
    private double gruix;
    private final int maxColor = 7;
    private final int minColor = 0;
    private final double maxGruix = 3.0;
    private final double minGruix = 0.1;

    public Llapis(int color, double gruix) {
        this.color = color;
        this.gruix = gruix;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public double getGruix() {
        return gruix;
    }

    public void setGruix(double gruix) {
        this.gruix = gruix;
    }

    public int getMaxColor() {
        return maxColor;
    }

    public int getMinColor() {
        return minColor;
    }

    public double getMaxGruix() {
        return maxGruix;
    }

    public double getMinGruix() {
        return minGruix;
    }

    @Override
    public String toString() {
        return "Llapis{" +
                "color='" + color + '\'' +
                ", gruix=" + gruix +
                '}';
    }

    @Override
    public int compareTo(Llapis o) {
        if (this.color > o.color) {
            return 1;
        } else if (this.color < o.color) {
            return -1;
        }
        return 0;
    }

    static final Comparator<Llapis> compGruix = new Comparator<Llapis>() {
        @Override
        public int compare(Llapis o1, Llapis o2) {
            if (o1.gruix < o2.gruix) {
                return 1;
            } else if (o1.gruix > o2.gruix) {
                return -1;
            }
            return 0;
        }
    };

    static final Comparator<Llapis> compColor = new Comparator<Llapis>() {
        @Override
        public int compare(Llapis o1, Llapis o2) {
            if (o1.color < o2.color) {
                return 1;
            } else if (o1.color > o2.color) {
                return -1;
            }
            return 0;
        }
    };
}
