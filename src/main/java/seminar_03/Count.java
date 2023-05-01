package seminar_03;

import java.io.IOException;

public class Count implements AutoCloseable {
    private static Integer count = 0;

    public Count(Integer count) {
        this.count = count;
    }
    public static void  add ()  throws IOException{
        if (isClose() == true) {
            throw new RuntimeException("Resource Closed");
        }
        count +=1 ;
    }

    public static Integer getCount() throws IOException{
        if (isClose()) {
            throw new RuntimeException("Resource Closed");
        }
        return count;
    }

    @Override
    public void close() throws Exception {
        count = null;
    }

    public static boolean isClose(){
        if (count == null) return true;
        else return false;
    }
}
