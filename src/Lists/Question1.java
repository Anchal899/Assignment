package Lists;

class Node {
    String data;
    Node next;

    Node(String data) {
        this.data = data;
        this.next = null;
    }
}

public class Question1 {

    public Node addIntheFront(String movie, Node head) {
        Node newNode = new Node(movie);
        newNode.next = head;
        return newNode;
    }

    public Node addAtTheLast(String movie, Node head) {
        Node newNode = new Node(movie);
        if (head == null) {
            return newNode;
        }

        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
        return head;
    }

    public Node removeNodeByTitle(String movieTitle, Node head) {
        if (head == null) return null;

        // If head needs to be removed
        if (head.data.equals(movieTitle)) {
            return head.next;
        }

        Node curr = head;
        while (curr.next != null) {
            if (curr.next.data.equals(movieTitle)) {
                curr.next = curr.next.next;
                return head;
            }
            curr = curr.next;
        }

        // Not found
        System.out.println("Movie \"" + movieTitle + "\" not found in the list.");
        return head;
    }

    public void display(Node head) {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }

        Node curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        Question1 movies = new Question1();
        Node movie = null;

        // Add to front
        movie = movies.addIntheFront("movie1", movie);
        movie = movies.addIntheFront("movie2", movie);
        movie = movies.addIntheFront("movie3", movie);
        movie = movies.addIntheFront("movie4", movie);

        System.out.println("After adding to front:");
        movies.display(movie);

        // Add more to front and last
        movie = movies.addIntheFront("movie5", movie);
        movie = movies.addAtTheLast("movie6", movie);
        movie = movies.addAtTheLast("movie7", movie);
        movie = movies.addAtTheLast("movie8", movie);

        System.out.println("\nAfter adding more:");
        movies.display(movie);

        // Remove nodes
        movie = movies.removeNodeByTitle("movie2", movie);     // Should be removed
        movie = movies.removeNodeByTitle("movie10", movie);    // Not in list

        System.out.println("\nAfter removals:");
        movies.display(movie);

    }
}
