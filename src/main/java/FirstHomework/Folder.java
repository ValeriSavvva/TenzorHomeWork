package FirstHomework;

/*
Реализуйте класс Folder, принимающий в конструкторе переменное число аргументов
типа FileSystemNode (дочерних элементов). Не забудьте изменить родителя у
дочерних элементов. Добавьте метод для получения списка дочерних элементов.
 */
public class Folder extends AbstractFileSystemNode{

    private FileSystemNode[] fileSystemNode;

    public Folder(String name,FileSystemNode...fileSystemNodes){
        super(name);
        this.fileSystemNode = fileSystemNodes;
        changePath();
    }
    @Override
    public String getNameFileSystemNode() {
        return super.name;
    }
    public void changePath() {
        for(FileSystemNode fileSystemNode1:fileSystemNode){
            if (fileSystemNode1 instanceof File) {
                File f = (File) fileSystemNode1;
                f.path=super.name+"/"+f.name;
                fileSystemNode1=f;
            }
            else if (fileSystemNode1 instanceof Folder) {
                Folder f = (Folder) fileSystemNode1;
                String s =f.getNameFileSystemNode();
                ((Folder) fileSystemNode1).path =super.name+"/"+s;
                fileSystemNode1=f;
            }
        }
    }
    public String getFileSystemNodes() {
        String str="";
        for(FileSystemNode fileSystemNode1:fileSystemNode) {
        str +=fileSystemNode1.getPath()+"\n";
        }
        return str;
    }
}

