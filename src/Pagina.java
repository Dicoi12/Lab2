public class Pagina {
    int pagina;
    String descriere;

    public Pagina(int pagina, String descriere) {
        this.pagina = pagina;
        this.descriere = descriere;
    }

    public int getPagina() {
        return pagina;
    }

    public void setPagina(int pagina) {
        this.pagina = pagina;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }
}
