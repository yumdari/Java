///비동기 처리 예시
package come.test.thread;

class ExamClass implements Runnable {//인터페이스 상속

    @Override // Runnable 상속 받아 쓰려면 Runnable 안의 메소드를 오버라이드 해야함
    public void run() {
        for(int i=0; i<30; i++){
            try {
                Thread.sleep(1000);
                System.out.println("Thread1이 실행");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
    }

}

public class ThreadExam1 {
 
    public static void main(String[] args) {
        Thread thread = new Thread(new ExamClass());
        thread.start();

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
