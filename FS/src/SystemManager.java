
public class SystemManager {

    FileSystem root;
    SystemManager(Directory fileSystem){
        root = fileSystem;
    }
    public void creteDirectory(FileSystem fileSystem){
        root.add(fileSystem);
    }

    public void addFileToDirectory(FileSystem fileSystem){
        root.add(fileSystem);
    }

    public void deleteFileFromDirectory(FileSystem fileSystem){
        root.delete(fileSystem);
    }

    public void deleteteDirectory(FileSystem fileSystem){
        root.delete(fileSystem);
    }

    public void listContents(Directory fileSystem){
        for(FileSystem d:fileSystem.fileSystemList){
            d.listContents(d);
        }
    }

}
