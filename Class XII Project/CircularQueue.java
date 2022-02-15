import java.util.*;

class CircularQueue {// start of class
    int[] arr;// initialize
    int size;// initialize
    int front;// initialize
    int rear;// initialize

    CircularQueue(int s) {// parameterized constructor
        size = s;// initialize
        arr = new int[size + 1];// initialize
        front = 0;// initialize
        rear = 0;// initialize
    }

    void insert(int val) {// to insert numbers to the queue
        if (rear + 1 == front || (front == 1 && rear == size))// checking
            System.out.println("Queue is full");
        else {
            if (front == 0 && rear == 0)
                front = 1;
            rear++;
            if (rear == size + 1)
                rear = 1;
            arr[rear] = val;
        }
    }

    int delete() {// to delete numbers from the queue
        if (front == 0)// checking front
        {
            front = 0;
            rear = 0;
            System.out.println("Queue is empty");
            return -999;
        } else {
            int val = arr[front];
            front++;
            if (front == size + 1)// checking
                front = 1;
            if (front == rear) {
                front = 0;
                rear = 0;
            }
            return val;
        }
    }

    void display() {// to display the queue
        if (front == 0 && rear == 0) {
            System.out.println("The queue is empty");
            return;
        }
        int i;
        System.out.print("The queue elements are: ");
        if (front <= rear)// checking
        {
            for (i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            for (i = front; i <= size; i++) {
                System.out.print(arr[i] + " ");
            }
            for (i = 1; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value, choice, N;// initialize
        char ans;// initialize
        System.out.print("Enter the size of the queue: ");
        N = sc.nextInt();// to accept and store the size of queue
        CircularQueue ob = new CircularQueue(N);
        do {
            System.out.println("Enter 1 to insert");
            System.out.println("Enter 2 to delete");
            System.out.println("Enter 3 to display");
            choice = sc.nextInt();
            switch (choice) {// start of switch case
                case 1:
                    System.out.print("Enter the value to be inserted: ");
                    value = sc.nextInt();
                    ob.insert(value);
                    break;
                case 2:
                    value = ob.delete();
                    System.out.println("Deleted value: " + value);
                    break;
                case 3:
                    ob.display();
                    break;
                default:
                    System.out.println("Wrong Choice");
            }// end of switch case
            System.out.print("Do you want to continue? (Y/N) : ");
            ans = sc.next().charAt(0);
        } while (ans == 'Y');// checking
    }// end of main()
}// end of class