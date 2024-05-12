public class Main {
    public static void main(String[] args) {
        Directory root=new Directory("root");
        Directory personal=new Directory("personal");
        personal.add(new File("confidential doc"));
        SystemManager fileSystemManager=new SystemManager(root);
        fileSystemManager.addFileToDirectory(new File("abc.java"));
        fileSystemManager.addFileToDirectory(new File("headfirst.java"));
        fileSystemManager.creteDirectory(personal);

        fileSystemManager.listContents(root);
    }
}