package IteratorPattern;

public class AscendingHistory implements Container {
    public String OrderID[]={"2345", "2125","2478","2565","2903"};


    @Override
    public Iterator getIterator() {

        return new AscendingHistoryIterate() ;
    }


    private class AscendingHistoryIterate implements Iterator{

        int i;

        @Override
        public boolean hasNext() {
            if (i<OrderID.length){
                return true;
            }
            return false;
        }

        @Override
        public Object getNext() {
            if(this.hasNext()){
                return OrderID[i++];
            }
            return null;
        }


    }
}


