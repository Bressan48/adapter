package padroesestruturais.adapter;

public class Atleta {

    IProva prova;
    ProvaAdapter persistencia;

    public Atleta() {
        prova = new ProvaConceito();
        persistencia = new ProvaAdapter(prova);
    }

    public void setProva(String conceito) {
        prova.setProva(conceito);
        persistencia.salvarProva();
    }

    public String getProva() {
        return persistencia.recuperarProva();
    }

    // Método apenas para mostrar que está convertendo conceito para nota através do adaptador
    public float getNota() {
        return persistencia.getNota();
    }

}
