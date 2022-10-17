package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatcherTest01 {
    public static void main(String[] args) {
        Path path1 = Paths.get("pasta/subpastas/file.bkp");
        Path path2 = Paths.get("pasta/subpastas/file.txt");
        Path path3 = Paths.get("pasta/subpastas/file.java");
        mathcers(path1, "glob:*.bkp");
        mathcers(path1, "glob:**/*.bkp");
        mathcers(path1, "glob:**/*.{bkp,java,txt}");
        mathcers(path2, "glob:**/*.{bkp,java,txt}");
        mathcers(path3, "glob:**/*.{bkp,java,txt}");
        mathcers(path1, "glob:**/*.???");
        mathcers(path2, "glob:**/*.???");
        mathcers(path3, "glob:**/*.???");
        mathcers(path3, "glob:**/file.????");

    }
    private static void mathcers(Path path, String glob){
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": "+ matcher.matches(path));
    }
}
