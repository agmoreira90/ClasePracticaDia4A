package domain;

public class Time {
    private Long start;
    private Long stop;

    public Time() {
    }

    public Long getStart() {
        return this.start;
    }

    public void setStart() {
        this.start = System.currentTimeMillis();
    }

    public Long getStop() {
        return this.stop;
    }

    public void setStop() {
        this.stop = System.currentTimeMillis();
    }

    public Long elapsedTime(){
        return this.stop - this.start;
    }
}
