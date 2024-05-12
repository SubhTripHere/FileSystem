import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystem{
   public List<FileSystem> fileSystemList;

    Directory(String fsName) {
        super(fsName);
        fileSystemList = new ArrayList<FileSystem>();
    }

    @Override
    public void delete(FileSystem fileName) {
            fileSystemList.remove(fileName);
        }

    @Override
    public void add(FileSystem fileSystem) {
        fileSystemList.add(fileSystem);
    }

    @Override
    void listContents(FileSystem file) {
        System.out.println(fsName);
        for (FileSystem fileSystem : fileSystemList) {
            fileSystem.listContents(file);
        }
    }
}
