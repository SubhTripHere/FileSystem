public class File extends FileSystem{

    File(String fName){
        super(fName);
    }

    @Override
    public void delete(FileSystem fileName) {
        System.out.println("unsupported operation");
    }

    @Override
    public void add(FileSystem name) {
        System.out.println("unsupported operation");
    }

    @Override
    void listContents(FileSystem file) {
        System.out.println(fsName);
    }
}
