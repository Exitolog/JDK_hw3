package task2;

public class SameArray {


    public <T> boolean  compareArrays(T[] t1, T[] t2){
        if(t1.length == t2.length) {
            for (int i = 0; i < t1.length; i++) {
                if(!t1[i].getClass().equals(t2[i].getClass())){
                    return false;
                }
            }
            return true;
            }
        return false;
        }

    }

