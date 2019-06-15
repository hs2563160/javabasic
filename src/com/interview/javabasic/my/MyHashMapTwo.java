package com.interview.javabasic.my;

public class MyHashMapTwo {

    private static final int INIT_LENGTH = 16;

    private static final float FZ_YZ=0.75f;

    private int size;

    private int threasold;

    private HashEntry[] hashEntries;




    public MyHashMapTwo(){

        this.hashEntries=new HashEntry[INIT_LENGTH];
        this.threasold= (int) (INIT_LENGTH*FZ_YZ);

    }

    public void put(Object key,Object value){

        int index = index(key,hashEntries.length-1);
        HashEntry hashEntry=hashEntries[index];
        while(hashEntry!=null){

            if(hashEntry.getKey().hashCode()==key.hashCode() &&(hashEntry.getKey().equals(key) || hashEntry.getKey()==key)){

                hashEntry.value=value;
                return;

            }
            hashEntry=hashEntry.next;
        }
        add(index,key,value);

    }

    public Object get(String key){

        int index = index(key,hashEntries.length-1);
        HashEntry hashEntry=hashEntries[index];
        while (hashEntry!=null){

            if(hashEntry.getKey().hashCode()==key.hashCode() && (hashEntry.getKey().equals(key) || hashEntry.getKey()==key)){

                return hashEntry.getValue();
            }

            hashEntry=hashEntry.next;
        }

        return null;
    }

    public void remove(String key){

        int index = index(key,hashEntries.length-1);
        HashEntry pre = null;
        HashEntry hashEntry = hashEntries[index];
        while (hashEntry!=null){

            if(hashEntry.getKey().hashCode()==key.hashCode() && (hashEntry.getKey().equals(key) || hashEntry.getKey()==key)){

                if(pre==null){
                    hashEntries[index]=hashEntry.getNext();
                    size--;
                    return;
                }else{
                    pre.setNext(hashEntry.getNext());
                }
            }
            pre=hashEntry;
            hashEntry=hashEntry.next;
        }

    }

    private int index(Object key,int length){

        int h;
        return ((key==null)? 0 :(h=key.hashCode()) ^ (h>>>16))&(length);

    }

    private void add(int index,Object key,Object value){

        HashEntry hashEntry = new HashEntry(hashEntries[index],key,value);

        hashEntries[index]=hashEntry;

        if(size++>threasold){
            //扩容
        }

    }

    private void  resize(){

        HashEntry[] newHashEntries = new HashEntry[hashEntries.length*2];
        for(int i=0;i<hashEntries.length-1;i++){
            while (hashEntries[i].getNext()!=null){


            }


        }
    }





    class HashEntry{

        private HashEntry next;

        private final Object key;

        private Object value;

        public HashEntry(HashEntry next,Object key,Object value){

            this.next=next;
            this.key=key;
            this.value=value;
        }
        public Object getKey() {
            return key;
        }

        public Object getValue() {
            return value;
        }

        public void setValue(Object value) {
            this.value = value;
        }

        public HashEntry getNext() {
            return next;
        }

        public void setNext(HashEntry next) {
            this.next = next;
        }
    }
}
