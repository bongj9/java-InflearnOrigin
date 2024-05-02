package Package1.Ex.max;

public class MaxCounter {
    public MaxCounter(int max) {
        this.max = max;
    }

    private int count = 0;

    public int max;

    public void increment() {
        if (count < max) {
            count += 1;
        } else {
            System.out.println("최대값을 초과할 수 없습니다");
        }

    }

    public int getCount() {
        return count;
    }
}
