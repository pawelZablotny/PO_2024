class Storage<T>
{
    private T item;
    public void store(T item)
    {
        this.item = item;
        System.out.println("Przechowywany produkt: " + item);
    }
    public T retrive()
    {
        System.out.println("Zwrocony produkt: " + item);
        return item;
    }
}
