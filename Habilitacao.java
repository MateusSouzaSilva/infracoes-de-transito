public class Habilitacao  {
    
    protected String categoriaHabilitacao;
    protected String validadeHabilitacao;
    
    public Habilitacao(String categoriaHabilitacao, String validadeHabilitacao) {
        this.categoriaHabilitacao = categoriaHabilitacao;
        this.validadeHabilitacao = validadeHabilitacao;

    }
    protected String getCategoriaHabilitacao() {
        return this.categoriaHabilitacao;
    }
    protected void setCategoriaHabilitacao(String categoriaHabilitacao) {
        this.categoriaHabilitacao = categoriaHabilitacao;
    }
    protected String getValidadeHabilitacao() {
        return this.validadeHabilitacao;
    }
    protected void setValidadeHabilitacao(String validadeHabilitacao) {
        this.validadeHabilitacao = validadeHabilitacao;
    }
}