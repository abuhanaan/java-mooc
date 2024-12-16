
public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        // initialize the variables count and sum here
        this.count = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        // write code here
        this.count += 1;
        this.sum += number;
    }

    public int getCount() {
        // write code here
        return this.count;
    }

    public int sum() {
        // write code here
        if(count == 0){
            return 0;
        }
        return this.sum;
    }

    public double average() {
        // write code here
        if(count == 0){
            return 0.0;
        }
        return (double)sum / count;
    }
    
    
}
