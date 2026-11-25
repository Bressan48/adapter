package padroesestruturais.adapter;

public class ProvaAdapter extends ProvaNota {

    private IProva provaConceito;

    public ProvaAdapter(IProva provaConceito) {
        this.provaConceito = provaConceito;
    }

    public String recuperarProva() {
        if (this.getNota() >= 9.0f)
            provaConceito.setProva("A");
        else
            if (this.getNota() >= 8.0f)
                provaConceito.setProva("B");
            else
                if (this.getNota() >= 7.0f)
                    provaConceito.setProva("C");
                else
                    provaConceito.setProva("D");
        return provaConceito.getProva();
    }

    public void salvarProva() {
        if (provaConceito.getProva().equals("A"))
            this.setNota(9.0f);
        else
            if (provaConceito.getProva().equals("B"))
                this.setNota(8.0f);
            else
                if (provaConceito.getProva().equals("C"))
                    this.setNota(7.0f);
                else
                    this.setNota(0.0f);
    }
}
