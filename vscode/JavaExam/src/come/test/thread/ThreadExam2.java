///비동기 처리 예시2
package come.test.thread;

class ExamClass2 extends Thread{

    @Override
    public void run(){
        try {
            for(int i=0; i<30; i++){
            Thread.sleep(1000);
            System.out.println("Thread1이 실행");
        }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       

    }

}

public class ThreadExam2 {
    public static void main(String[] args) {
        ExamClass2 examClass2 = new ExamClass2();
        examClass2.start();
        for(int i = 0; i<30; i++){
            try {
                Thread.sleep(1000);
                System.out.println("Thread2이 실행");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        
    }
    }
}
