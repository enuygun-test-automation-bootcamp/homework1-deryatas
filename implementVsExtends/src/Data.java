public interface Data {
    double length = 10;
    double length1 = 10;

    double length2 = 20;


    static double getCevre() {
        return length + length1 + length2;
    }

    void Cevre();
}
