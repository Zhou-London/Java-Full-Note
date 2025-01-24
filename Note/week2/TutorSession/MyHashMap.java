package week2.TutorSession;

import java.util.ArrayList;

public class MyHashMap<K,V> {

    private static final int LENGTH = 16;

    ArrayList<Pair<K, V>>[] buckets;

    public MyHashMap() {
        buckets = new ArrayList[LENGTH];
        for (int i = 0; i < LENGTH; i++) {
            buckets[i] = new ArrayList<>();
        }
    }

    public int getHash(K key){
        return key.hashCode() % LENGTH;
    }

    public void printHash(){
        for(int i = 0; i < LENGTH; i++) {
            for(Pair<K, V> p : buckets[i]){
                System.out.println(p.getKey() + " " + p.getValue());
            }
        }

    }

    public void put(K key, V value) {
        int index = getHash(key);
        buckets[index].add(new Pair<>(key, value));
    }

    public V get(K key) {
        int index = getHash(key);
        for(Pair<K, V> pair : buckets[index]) {
            if(pair.getKey().equals(key)) {
                return pair.getValue();
            }
        }
        return null;
    }


}
