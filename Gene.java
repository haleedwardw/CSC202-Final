import java.util.Arrays;

public class Gene implements Cloneable{
    private int num;
    private int[] array;

    Gene(){
        num = 100;
        array = new int[] {200};
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getNum() {
        return this.num;
    }

    public int[] getArray() {
        return this.array;
    }

    //Used Resource 4  https://howtodoinjava.com/java/cloning/a-guide-to-object-cloning-in-java/#deep_cloning

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Gene cloned = (Gene)super.clone();
        cloned.setArray((int[])cloned.getArray());

        return cloned;
    }

    @Override
    public String toString() {
        return String.format("num: %d    array: %s", this.num,Arrays.toString(this.array));
    }




}
