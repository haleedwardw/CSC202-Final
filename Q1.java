public class Q1 {
    public static void main(String[] ars) throws CloneNotSupportedException {
        Gene gene = new Gene();
        gene.setNum(27);
        gene.setArray(new int[] {126, 16, 24, 25});

        System.out.println("Gene: " +gene);

        Gene mutation = (Gene)gene.clone();

        System.out.println("Clone: " +mutation);
    }
}
