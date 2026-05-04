package CursoEmVideoPOO.aula14;

public class Video implements AcoesVieo {
    private String titulo;
    private float avaliacao;
    private int views;
    private int likes;
    private boolean reproduzindo;

    @Override
    public void play() {
        this.reproduzindo = true;
    }

    @Override
    public void pause() {
        this.reproduzindo = false;
    }

    @Override
    public void like() {
        this.likes++;
    }

    @Override
    public String toString() {
        return "Video{" +
                "titulo='" + this.getTitulo() + '\'' +
                ", avaliacao=" + this.getAvaliacao() +
                ", views=" + this.getViews() +
                ", likes=" + this.getLikes() +
                ", reproduzindo=" + this.isReproduzindo() +
                '}';
    }

    //metodos especiais


    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.likes = 0;
        this.reproduzindo = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(float avaliacao) {
        float nova;
        nova = (this.avaliacao + avaliacao)/ this.views;
        this.avaliacao = nova;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
}
