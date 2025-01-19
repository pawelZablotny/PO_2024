public class VideoPlayer implements MediaPlayer
{
    private String currentTrack;
    @Override
    public void play(String trackName)
    {
        currentTrack = trackName;
        System.out.println("Odtwarzane video: " + trackName);
    }

    @Override
    public void pause()
    {
        if(currentTrack != null)
        {
            System.out.println("Pauza " + currentTrack);
        }
    }

    @Override
    public String getCurrentTrack()
    {
        return currentTrack;
    }

}