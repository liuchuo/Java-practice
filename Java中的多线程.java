// 假设某家银行可接受顾客的汇款，每进行一次汇款，便可计算出汇款的总额。
public class Exercise {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        Customer customer2 = new Customer();
        customer1.start();
        customer2.start();
    }
}

class Customer extends Thread {
    @override
    public void run() {
        for(int i = 0; i < 3; i++) {
            Bank.deposit(100);
        }
    }
}

class Bank {
    public static int balance = 0;
    public synchronized static void deposit(int b) {
        int temp = balance;
        temp += b;
        try {
            Thread.sleep((int)(Math.random() * 1000));
        }catch(InterruptedException e) {

        }
        balance = temp;
        System.out.println("汇款之后" + balance);
    }
}