package IteratorPattern;

public class DescendingHistory implements Container {
    public String OrderID[]={"2345", "2125","2478","2565","2903"};

    @Override
    public Iterator getIterator() {
        return new DescendingHistoryIterator();
    }

    private class DescendingHistoryIterator implements Iterator {
        int i;

        public DescendingHistoryIterator() {
            i = OrderID.length - 1; // Start from the last index
        }

        @Override
        public boolean hasNext() {
            return i >= 0; // Check if i is within array bounds
        }

        @Override
        public Object getNext() {
            if (this.hasNext()) {
                return OrderID[i--]; // Return current element and decrement i
            }
            return null;

        }
    }
}
