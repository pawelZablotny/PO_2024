abstract class ComputerGraphic {
    protected int width;
    protected int height;
    protected String fileName;

    public ComputerGraphic(int width, int height, String fileName)
    {
        this.width = width;
        this.height = height;
        this.fileName = fileName;
    }

    public abstract void loadFile();
    public abstract void saveFile();

}

