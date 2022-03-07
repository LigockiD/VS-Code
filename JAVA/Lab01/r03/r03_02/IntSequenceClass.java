package r03.r03_02;

public class IntSequenceClass implements IntSequence {

    private int values[];
    private int counter = 0;

    public IntSequenceClass(int...values){
        this.values = values;
    }


    public static IntSequenceClass of(int...values){ 
        return new IntSequenceClass(values);
    }

    public static IntSequenceClass of2(int...values){ 
        return new IntSequenceClass(values);
    }

    @Override
    public boolean hasNext(){
        if(counter < values.length-1)
            return true;
        else
            return false;
    }


    public int next()
    {
        ++counter;
        int temp = values[counter];
        return temp;
    }

    public int constant(int i){
        return 1;
    }
}
