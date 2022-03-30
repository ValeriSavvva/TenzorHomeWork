package FirstHomework;

/*
В тестовой программе создайте корневую папку, добавьте пару подпапок с
несколькими файлами. Отобразите путь до какого-либо файла. Отобразите
расширение N-го дочернего файла какой-либо папки.
 */
public class Main_4 {
    public static void main(String[] strings)
    {
        File file1 = new File("File1");
        File file2 = new File("File2");
        File file3 = new File("File3");
        File file4 = new File("File4");
        File file5 = new File("File5");
        File file6 = new File("File6");
        Folder folder1 = new Folder("Folder1",file1,file2);
        Folder folder2 = new Folder("Folder2",file3,file4,file5);
        Folder mainFolder = new Folder("MainFolder",folder1,folder2);
        System.out.println(file1.getPath());
        System.out.println(file2.getPath());
        System.out.println(file3.getPath());
        System.out.println(file4.getPath());
        System.out.println(file5.getPath());
        System.out.println(file6.getPath());
        System.out.println(folder1.getPath());
        System.out.println(folder2.getPath());
        System.out.println(mainFolder.getPath());
        System.out.println("Содержимое MainFolder\n" + mainFolder.getFileSystemNodes());
        System.out.println("Расширение File5\n" + file5.getExtension());



    }
}
