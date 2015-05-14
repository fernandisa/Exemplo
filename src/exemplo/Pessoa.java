package exemplo;

public class Pessoa {
    
    Pessoa ()
            {
                this.nome = null;
                this.telefone = null;
                this.cidade = null;
                
            }
    
    private String nome;
    private String telefone;
    private Cidade cidade;

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
}
