package exemplo;
import javax.swing.JOptionPane;
public class Exemplo {

    public static void main(String[] args) {
        
        
        
        
        Pessoa prefeito = new Pessoa();
        prefeito.setNome("Dudu");
        prefeito.setTelefone("99029091");
       
        
        Cidade cidade = new Cidade ();
        
        
        cidade.setArea(23000.0);
        cidade.setNome("Bagé");
        cidade.setPrefeito("Dudu");
        
        Pessoa pessoa = new Pessoa();
        
        pessoa.setNome("Fernanda");
        pessoa.setTelefone("32411004");
        
        JOptionPane.showMessageDialog(null, "Cidade:" + pessoa.getCidade().getNome() +
                "Prefeito" + pessoa.getCidade().getPrefeito());
        
  
        
    }
    
}
