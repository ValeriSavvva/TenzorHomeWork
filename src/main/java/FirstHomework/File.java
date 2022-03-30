package FirstHomework;

/*
Реализуйте класс File. Добавьте метод, возвращающий расширение файла.
В тестовой программе создайте корневую папку, добавьте пару подпапок с
несколькими файлами. Отобразите путь до какого-либо файла. Отобразите
расширение N-го дочернего файла какой-либо папки.
 */
public class File extends AbstractFileSystemNode {
    private String extension;

       public File(String name){
           super(name);
           addExtension();
       }
        @Override
        public String getNameFileSystemNode() {
          return super.name;
        }
        private void addExtension(){
           int num = (int) (Math.random() * 4);
           switch (num){
               case 0: super.name += ".txt";
                   extension =".txt";
                        break;
               case 1: super.name += ".rtf";
                   extension =".txt";
                        break;
               case 2: super.name += ".doc";
                   extension =".txt";
                        break;
               case 3: super.name += ".jpg";
                   extension =".txt";
                        break;
               default: super.name += ".gif";
                   extension =".txt";
                        break;
           }
        }
        public String getExtension() {
            return extension;
        }
}

