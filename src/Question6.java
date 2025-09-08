import java.util.LinkedList;
class ListNode {
    String data;
    ListNode next;

    ListNode(String data) {
        this.data = data;
        this.next = null;
    }
}

public class Question6 {

    public ListNode addIntheFront(String movie, ListNode head) {
        ListNode newListNode = new ListNode(movie);
        newListNode.next = head;
        return newListNode;
    }

    public ListNode addAtTheLast(String movie, ListNode head) {
        ListNode newListNode = new ListNode(movie);
        if (head == null) {
            return newListNode;
        }

        ListNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newListNode;
        return head;
    }

    public ListNode removeListNodeByTitle(String movieTitle, ListNode head) {
        if (head == null) return null;

        // If head needs to be removed
        if (head.data.equals(movieTitle)) {
            return head.next;
        }

        ListNode curr = head;
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
    public ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        ListNode next=null;

        while(curr!=null){

            next=curr.next;
            curr.next=prev;

            prev=curr;
            curr=next;
        }
        return prev;
    }

    public void display(ListNode head) {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }

        ListNode curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        Question6 movies = new Question6();
        ListNode movie = null;

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

        // Remove ListNodes
        movie = movies.removeListNodeByTitle("movie2", movie);     // Should be removed
        movie = movies.removeListNodeByTitle("movie10", movie);    // Not in list

        System.out.println("\nAfter removals:");
        movies.display(movie);
        movie=movies.reverse(movie);
        System.out.println("After reversal: ");
        movies.display(movie);
    }
}
