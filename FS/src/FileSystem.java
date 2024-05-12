public abstract class FileSystem {
   String fsName;
   FileSystem(String fsName) {
      this.fsName = fsName;
   }
   abstract void delete(FileSystem file);
   abstract void add(FileSystem file);
   abstract void listContents(FileSystem file);
}
