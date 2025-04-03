package solid.srp.s1;

public class SmartPhone {
    private Call call;
    private Music music;
    private Game game;
    private Camera camera;

    public SmartPhone() {
        this.call = new Call();
        this.music = new Music();
        this.game = new Game();
        this.camera = new Camera();
    }

    public void calling(){
        call.Calling();
    }

    public void PlayMusic(){
        music.PlayMusic();
    }

    public void PlayGame(){
        game.PlayGame();
    }

    public void TakePicture(){
        camera.UseCamera();
    }
}
