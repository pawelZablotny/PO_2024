public class Bitmap extends ComputerGraphic{
    public Bitmap(int width, int height, String fileName)
    {
        super(width, height, fileName);
    }

    @Override
    public void loadFile(){
        System.out.println("Ładuje plik:" + fileName);
    }
    @Override
    public void saveFile(){
        System.out.println("Zapisuje plik:" + fileName);
    }
}
