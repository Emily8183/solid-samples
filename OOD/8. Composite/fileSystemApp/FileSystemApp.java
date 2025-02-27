public class FileSystemApp {


    public static void main(String[] args) {
        //从大到小generate
        //创建文件夹
        Folder folder = new Folder("Big Folder"); //如果改为FileSystemComponent folder, 则需要在Interface中增加method

        FileSystemComponent file1 = new File("File1.txt");
        FileSystemComponent file2 = new File("File2.txt");

        //创建文件
        folder.addComponent(file1);
        folder.addComponent(file2);

        folder.showDetails();
    }
    



}
