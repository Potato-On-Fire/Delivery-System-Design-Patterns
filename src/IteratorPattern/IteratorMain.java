package IteratorPattern;
public class IteratorMain {

        public static void main(String[] args) {
            AscendingHistory custHistory1 = new AscendingHistory();
            System.out.println("View Oldest to newest :" );
            System.out.println("------------------------------" );
            for(Iterator iter = custHistory1.getIterator(); iter.hasNext();){
                String ID= (String)iter.getNext();
                System.out.println("OrderID : " + ID);

            }

            DescendingHistory custHistory2 = new DescendingHistory();
            System.out.println("\n\nView newest to Oldest :" );
            System.out.println("------------------------------" );
            for(Iterator iter = custHistory2.getIterator(); iter.hasNext();){
                String ID= (String)iter.getNext();
                System.out.println("OrderID : " + ID);

            }

        }

}
