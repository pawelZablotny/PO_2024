public class AudioPlayer implements MediaPlayer
{
    private String currentTrack;

    @Override
    public void play(String trackName)
    {
        currentTrack = trackName;
        System.out.println("Odtwarzany utwor: " + trackName);
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