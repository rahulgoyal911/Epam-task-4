package cleanCode.intrests;
public class SI extends interest{
    public SI(int principle, int rate, int time) {
        super(principle, rate, time);
    }

    public double calculateSI()
    {
        return ((principle*rate*time)/100.0);
    }
}
