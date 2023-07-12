
public class Main {

    public int countOfElements (int array[]){
        int maxElement =Integer.MIN_VALUE;
        for( int elements : array){
             maxElement = Math.max(elements, maxElement);
        }
        int countOfMaxElements = 0;
        for (int elements : array){
            countOfMaxElements += (elements == maxElement) ? 1 : 0 ;
        }
        return array.length - countOfMaxElements ;
    }

    public static void main(String[] args) {
       Main findCount = new Main();
        System.out.println(findCount.countOfElements(new int[]{5 ,5 ,3}));
    }
}