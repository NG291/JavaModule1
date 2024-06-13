package oop.StopWatch;

public class Main {
    public static void main(String[] args) {
        StopWatch sw = new StopWatch();
        System.out.println("start time"+sw.getStartTime());
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        sw.stop();
        System.out.println("end time"+sw.getEndTime());
        System.out.println("Elapsed time in milliseconds"+ sw.getElapsedTime());
    }
}
