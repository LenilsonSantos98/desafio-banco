import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    protected List<Conta> contas;
    
    //implementando o método para lista de contas
    
    public Banco(){
        this.contas = new ArrayList<>();
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
     //adicionar conta ao banco
     public void adicionarConta(Conta conta) {
         this.contas.add(conta);
     }
   //imprimmir contas
    public void imprimirContas() {
     for (Conta conta : contas) {
        System.out.println(" Tipo de Conta: " + conta.getClass().getSimpleName());
        
        }
    }

}