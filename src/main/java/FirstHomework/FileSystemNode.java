package FirstHomework;

/*
В этом задании нужно разработать средства для представления иерархической
структуры некой файловой системы.
Оформите интерфейс FileSystemNode с методами
1. Возвращающим родительский элемент типа FileSystemNode.
2. Возвращающим имя.
3. Возвращающим путь до элемента в условной файловой системе (формат
произвольный).
 */
public interface FileSystemNode {
     FileSystemNode getFileSystemNode();
     String getNameFileSystemNode();
     String getPath();
}
