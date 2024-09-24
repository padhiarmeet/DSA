import java.util.Scanner;

class Deque {
    private int[] deque;
    private int front;
    private int rear;
    private int size;

    public Deque(int size) {
        this.size = size;
        deque = new int[size];
        front = -1;
        rear = -1;
    }

    public boolean isFull() {
        return (front == 0 && rear == size - 1) || (front == rear + 1);
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public void insertFront(int item) {
        if (isFull()) {
            System.out.println("Deque is full");
            return;
        }
        if (front == -1) {
            front = 0;
            rear = 0;
        } else if (front == 0) {
            front = size - 1;
        } else {
            front = front - 1;
        }
        deque[front] = item;
    }

    public void insertRear(int item) {
        if (isFull()) {
            System.out.println("Deque is full");
            return;
        }
        if (front == -1) {
            front = 0;
            rear = 0;
        } else if (rear == size - 1) {
            rear = 0;
        } else {
            rear = rear + 1;
        }
        deque[rear] = item;
    }

    public void deleteFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return;
        }
        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (front == size - 1) {
            front = 0;
        } else {
            front = front + 1;
        }
    }

    public void deleteRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return;
        }
        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (rear == 0) {
            rear = size - 1;
        } else {
            rear = rear - 1;
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return;
        }
        System.out.print("Elements in the deque are: ");
        if (front <= rear) {
            for (int i = front; i <= rear; i++) {
                System.out.print(deque[i] + " ");
            }
        } else {
            for (int i = front; i < size; i++) {
                System.out.print(deque[i] + " ");
            }
            for (int i = 0; i <= rear; i++) {
                System.out.print(deque[i] + " ");
            }
        }
        System.out.println();
    }
}

public class DequeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the deque: ");
        int size = scanner.nextInt();
        Deque deque = new Deque(size);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert at front end");
            System.out.println("2. Insert at rear end");
            System.out.println("3. Delete from front end");
            System.out.println("4. Delete from rear end");
            System.out.println("5. Display all elements of the deque");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to insert at front: ");
                    int frontElement = scanner.nextInt();
                    deque.insertFront(frontElement);
                    break;
                case 2:
                    System.out.print("Enter the element to insert at rear: ");
                    int rearElement = scanner.nextInt();
                    deque.insertRear(rearElement);
                    break;
                case 3:
                    deque.deleteFront();
                    break;
                case 4:
                    deque.deleteRear();
                    break;
                case 5:
                    deque.display();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
