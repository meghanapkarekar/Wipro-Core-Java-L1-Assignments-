package live;

import music.string.Veena;
import music.wind.Saxophone;
import music.Playable;

public class Test {
    public static void main(String args[])
    {
        Veena v=new Veena();
        v.play();
        Saxophone s=new Saxophone();
        s.play();

        Playable playable_veena, playable_s;
        playable_veena = new Veena();
        playable_s = new Saxophone();

        playable_veena.play();
        playable_s.play();
    }
}
