import java.util.Calendar;

public class StopWatch {
    private double startTime;
    private double endTime;

    private double getStartTime(){
        return this.startTime;
    }
    private double getEndTimeTime(){
        return this.endTime;
    }
    public StopWatch(){
        this.startTime =System.currentTimeMillis();
    }
    public double start(){
        return this.startTime=System.currentTimeMillis();
    }
    public double end(){
        return this.endTime=System.currentTimeMillis();
    }

    public double getElapsedTime(){
        return start()-end();
    }
}
