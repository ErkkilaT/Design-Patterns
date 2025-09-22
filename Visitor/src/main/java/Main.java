import java.util.List;

public class Main {

    public static void main(String[] args) {
        Directory root = new Directory("root");
        Directory d1 = new Directory("d1");
        Directory d2 = new Directory("d2");
        Directory d3 = new Directory("d3");
        File file1 = new File("f1x", 10);
        File file2 = new File("f2", 20);
        File file3 = new File("fx3", 10);
        File file4 = new File("f4", 30);
        File file5 = new File("f5", 10);
        File file6 = new File("xf6", 40);

        d3.addFile(file6);
        d3.addFile(file5);
        d2.addDirectory(d3);
        d1.addFile(file4);
        d1.addFile(file3);
        root.addDirectory(d1);
        root.addDirectory(d2);
        root.addFile(file2);
        root.addFile(file1);

        SizeCalculatorVisitor sizeCalc = new SizeCalculatorVisitor();
        root.accept(sizeCalc);
        System.out.println("Total size = " + sizeCalc.getTotalSize());

        SearchVisitor search = new SearchVisitor("x");
        root.accept(search);
        List<File> matches =  search.getMatches();
        if(matches.isEmpty()){
            System.out.println("No matches");
        }
        else{
            System.out.println("Matches:");
            for(File f : matches){
                System.out.println(f.getName());
            }
        }

        search.newSearch("xx");
        List<File> newMatches =  search.getMatches();
        if(newMatches.isEmpty()){
            System.out.println("No matches");
        }
        else{
            System.out.println("Matches:");
            for(File f : newMatches){
                System.out.println(f.getName());
            }
        }


    }
}
