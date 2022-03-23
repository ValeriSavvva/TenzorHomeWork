/*
Добавьте абстрактный класс AbstractFileSystemNode, в котором реализуйте
перечисленные методы. Запретите переопределение 1-го и 3-го методов.
 */
abstract class AbstractFileSystemNode implements FileSystemNode {
    String path="";
    String name="";

    public AbstractFileSystemNode(String name){
        this.name = name;
        this.path = name;
    }
    public final FileSystemNode getFileSystemNode(){
        return this;
    };
    public abstract String getNameFileSystemNode();

    public final String getPath(){
        return path;
    };
}
