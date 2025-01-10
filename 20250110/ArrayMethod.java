import java.util.Arrays;

public class ArrayMethod {
    public static void main(String[] args) {
        // 배열의 copy 메소드
        int[] row = {4,2,1,3};
        int[] copyRow = row.clone();

        System.out.println(Arrays.toString(row));
        System.out.println(Arrays.toString(copyRow));

        // Arrays의 정렬 메소드
        Arrays.sort(copyRow);
        System.out.println(Arrays.toString(copyRow));
        
        // Arrays의 binarySearch 메소드 
        // 전달받은 배열에서 특정 객체의 위치를 이진 검색 알고리즘을 검색한 후, 
        // 위치 반환 (단 정렬되어 있어야 함)
        System.out.println(Arrays.binarySearch(copyRow, 4));
        
        // Arrays의 copyOf 메소드
        // 전달받은 원본 배열과 복사할 요소의 개수와 같은 원본 배열과 같은 타입의 새 배열을 반환
        int[] copyArr = Arrays.copyOf(copyRow, 0);
        
        // Arrays의copyOfRange 메소드
        // 전달받은 원본 배열과 복사 시작 인덱스 및 복사 끝 인덱스로 
        // 원본 배열 범위 내의 요소를 복사하여 같은 타입의 새 배열 반환
        int[] copyArr2 = Arrays.copyOfRange(copyRow, 0, 5);
    
        // Arrays의 fill 메소드
        // 배열을 특정 값으로 채우는 데 사용되는 메서드
        Arrays.fill(copyArr2, 4);
        System.out.println(copyArr2);
    }
}
