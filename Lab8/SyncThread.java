class SharedResource {
    synchronized void printMessage(String threadName, String[] messages) {
        for (String message : messages) {
            System.out.println(threadName + ": " + message);
            try {
                Thread.sleep(100);  
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MessageThread extends Thread {
    private SharedResource sharedResource;
    private String threadName;
    private String[] messages = {"I", "want", "to", "go", "class", "today"};
    
    public MessageThread(String name, SharedResource resource) {
        threadName = name;
        sharedResource = resource;
    }
    
    @Override
    public void run() {
        sharedResource.printMessage(threadName, messages);
    }
}

public class SynchronizedDemo {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        
        
        MessageThread thread1 = new MessageThread("Thread 1", resource);
        MessageThread thread2 = new MessageThread("Thread 2", resource);
        
        
        thread1.start();
        thread2.start();
    }
}