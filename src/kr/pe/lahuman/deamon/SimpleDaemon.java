package kr.pe.lahuman.deamon;

public class SimpleDaemon implements Runnable{
	
	@Override
	public void run() {
		int i=0;
		while (true){
			try{
				Thread.sleep(500);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println("count : "+ i);
			writeLog(i++);
			if(i == 1000)
				break;
		}
	}

	private void writeLog(int i) {
		if(i%10 == 0){
			System.out.println("Save Log");
		}
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new SimpleDaemon());
		t1.start();
	}
}
