package padroesestruturais.adapter;

public class ProvaConceito implements IProva {

    private String conceito;

    @Override
    public String getProva() {
        return this.conceito;
    }

    @Override
    public void setProva(String conceito) {
        this.conceito = conceito;
    }
}
