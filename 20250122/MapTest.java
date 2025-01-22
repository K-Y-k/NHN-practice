import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class HashTable<K, V> implements Iterable<V> { // 키와 값을 한 쌍으로
    /* 해시 테이블의 크기 초기 값 설정 */
    private static int INITIAL_CAPACITY = 16;

    /* 키와 값 한쌍인 Entry 클래스 기반의 배열 = 해시 테이블 */
    private Entry<K, V>[] table;

    /* 현재 크기 */
    private int size = 0;

    /* 키와 값을 한쌍으로 갖는 Entry 클래스 */
    public static class Entry<K, V> {
        final K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public HashTable() {
        this.table = new Entry[INITIAL_CAPACITY];
    }

    public int getSize() {
        return size;
    }

    public Entry<K, V>[] getEntries() {
        return table;
    }


    /* 키를 받고 해시 코드 변환 후 크기를 가공한 해시 함수 */
    public int hashFunction(K key) {
        return Math.abs(key.hashCode()) % INITIAL_CAPACITY;
    }

    /* 키를 통해 값 넣기 */
    public void put(K key, V value) {
        // Entry를 생성한 후
        Entry<K, V> newEntry = new Entry(key, value);

        // 받아온 키의 값을 해시 코드로 가공하여
        int index = this.hashFunction(key);

        // 해시 테이블에 해당 키의 해시 코드를 조회하여 
        // 비어 있으면 Entry 참조 값을 넣고
        // 비어 있지 않으면 해당 Entry의 값만 변경
        if (this.table[index] == null) {
            this.table[index] = newEntry;
        } else {
            this.table[index].value = value;
        }

        this.size++;
    }

    /* 값 가져오기 */
    public V getValue(K key) {
        int index = this.hashFunction(key);

        return this.table[index].value;
    }

    /* Entry<K, V> 배열을 foreach로 조회하기 위한 Iterator 구현 */
    @Override
    public Iterator<V> iterator() {
        List<Entry<K, V>> entryList = Arrays.asList(this.table);
        List<V> result = new ArrayList<>();

        for (Entry<K, V> entry : entryList) {
            if (entry != null) {
                result.add(entry.value);
            }
        }

        return result.iterator();
    }
    
    
    // Iterable<HashTable.Entry<K, V>> 일 때
    // @Override
    // public Iterator<Entry<K, V>> iterator() {
    //     List<Entry<K, V>> list = new ArrayList<>();
        
    //     for (int i = 0; i < table.length; i++) {
    //         if (table[i] != null) {
    //             list.add(table[i]);
    //         }
    //     }

    //     return list.iterator();
    // }
}

public class MapTest {
    public static void main(String[] args) {
        HashTable<String, Integer> hashTable = new HashTable<>();

        hashTable.put("kyk", 3);
        hashTable.put("Celine", 10);
        hashTable.put("Bob", 5);
        hashTable.put("Robert", 20);
        hashTable.put("kyk", 1);

        try {
            System.out.println(hashTable.getValue("kyk"));
            System.out.println(hashTable.getValue("Celine"));
            System.out.println(hashTable.getValue("ddd"));
        } catch (Exception e) {
            System.out.println("Data Not found");
        }
        System.out.println();


        for (Integer i : hashTable) {
            System.out.println(i);
        }
        System.out.println();

        // for (HashTable.Entry<String, Integer> entry : hashTable) {
        //     System.out.println(entry.key + " : " + entry.value);
        // }


        System.out.println(hashTable.getSize());
    }
}
