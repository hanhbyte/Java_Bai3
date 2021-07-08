public class StopWatch {
    private double starTime;
    private double endTime;
    public StopWatch()
    {
    }
    public StopWatch (double starTime, double endTime)
    {
        this.starTime=starTime;
        this.endTime=endTime;
    }
    public double getStarTime() {
        return starTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public void start() {
        this.starTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }
    public double getElapsedTime(){
        return this.endTime- this.starTime;
    }

    public static void main(String[] args) {
        int[] array=new int[100];
        for(int i=0;i<100;i++){
            array[i]=(int) (Math.random()*100)+8;
        }
        System.out.print("Array: ");
        for(int i=0;i<100;i++){
            System.out.print(" "+array[i]);
        }
        StopWatch s = new StopWatch();
        s.start();
        System.out.print("\n Start time: "+ s.getStarTime());
        for (int i=0;i<100;i++){
            for(int j=i+1;j<100;j++){
                if(array[i]>array[j]){
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        s.stop();

        System.out.println(s);
        System.out.print("End time: "+ s.getEndTime());
        System.out.print("\n Ordered array: ");
        for(int e:array){  System.out.print(e+" ");
        }
        System.out.print("\n ElapsedTime: "+s.getElapsedTime()+" ms");
    }
}