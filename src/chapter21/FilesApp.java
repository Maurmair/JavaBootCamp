package chapter21;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.DosFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class FilesApp {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("C:\\data\\folder\\file.txt");
            Files.createDirectories(path.getParent());
            if (Files.notExists(path)) {
                Files.createFile(path);
                System.out.println("Bestand gemaakt");
            } else {
                System.out.println("Bestand bestaat reeds");
            }

            List<String> lines = new ArrayList<>();
            lines.add("Hello");
            lines.add("World");
            Files.write(path, lines, StandardOpenOption.APPEND);
            DosFileAttributes attrs = Files.readAttributes(path, DosFileAttributes.class);
            System.out.println(attrs.size());
            System.out.println(attrs.creationTime());
            System.out.println(attrs.lastAccessTime());
            System.out.println(attrs.lastModifiedTime());
            System.out.println(attrs.isArchive());
            System.out.println(attrs.isHidden());
            System.out.println(attrs.isReadOnly());

            Files.lines(path).forEach(System.out::println);

            Path path2 = Paths.get("C:\\data\\folder\\file_copy.txt");
            Files.copy(path, path2, StandardCopyOption.REPLACE_EXISTING);

            Files.deleteIfExists(path);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
