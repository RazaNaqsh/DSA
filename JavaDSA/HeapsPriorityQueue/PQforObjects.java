package HeapsPriorityQueue;

import java.util.PriorityQueue;

public class PQforObjects {
    static class Student implements Comparable<Student> {
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("A", 4));
        pq.add(new Student("B", 1));
        pq.add(new Student("C", 5));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + "-> " + pq.peek().rank);
            pq.remove();
        }
    }
}
