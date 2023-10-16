import java.util.List;

public class Carte {
    List<Pagina> pagini;
    String autor;
    String titlu;

    public Carte(List<Pagina> pagini, String autor, String titlu) {
        this.pagini = pagini;
        this.autor = autor;
        this.titlu = titlu;
    }

    public List<Pagina> getPagini() {
        return pagini;
    }

    public void setPagini(List<Pagina> pagini) {
        this.pagini = pagini;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    @Override
    public String toString() {
        return "Carte{" +
                ", autor='" + autor + '\'' +
                ", titlu='" + titlu + '\'' +
                '}';
    }
}
