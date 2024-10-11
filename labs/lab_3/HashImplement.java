package labs.lab_3;

public class HashImplement {

      public static void main(String[] args) {
            HashTable table = new HashTable();
            table.put(3,4);
            
            
            System.out.println(table.size());
            table.put(3,5);
            table.put(2,5);
            System.out.println(table.size());
            System.out.println(table.get(3));
            table.remove(3);
            System.out.println(table.get(3));
      }
}


class HashTable {
      private final int TABLE_SIZE = 256;
      private Entry[] table;
      private int size = 0;

      private int bucket(Object key) {
            var hash = key.hashCode();
            return Math.abs(hash % table.length);
      }

      HashTable() {
            table = new Entry[TABLE_SIZE];

      }

      public void put(int key, int value) {
            int index = bucket(key);
            if (table[index] == null) {
                  table[index] = new Entry(key, value);
            }
            else {
                  Entry entry = table[index];
                  while (entry.getNext() != null && entry.getKey() != key)
                        entry = entry.getNext();
                        if (entry.getKey() == key) {
                              entry.setValue(value);
                              
                        }
                        else { entry.setNext(new Entry(key, value)); }
            }
            size+=1;
      }

      public int get(int key) {
            int index = bucket(key);
            if (table[index] == null) { return -1; }
            else {
                  Entry entry = table[index];
                  while (entry != null && entry.getKey() != key) {
                        entry = entry.getNext();
                  }
                  if (entry == null) { return -1; }
                  else { return entry.getValue(); }
          }
      }

      public void remove(int key) {
            int index = bucket(key);

            if (table[index] != null) {
                  Entry prevEntry = null;
                  Entry entry = table[index];

                  while (entry.getNext() != null && entry.getKey() != key) {
                        prevEntry = entry;
                        entry = entry.getNext();
                  }

                  if (entry.getKey() == key) {
                        if (prevEntry == null) { table[index] = entry.getNext(); }
                        else { prevEntry.setNext(entry.getNext());}
                        size-=1;
                  }
            }
      }

      public int size() {
            return this.size;
      }

}


class Entry {
      private int key;
      private int value;
      private Entry next;

      Entry(int key, int value) {
            this.key = key;
            this.value = value;
            this.next = null;
      }

      public int getValue() {
            return value;
      }

      public void setValue(int value) {
            this.value = value;
      }

      public int getKey() {
            return key;
      }

      public Entry getNext() {
            return next;
      }

      public void setNext(Entry next) {
            this.next = next;
      }

}
