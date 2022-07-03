public class Funcionario extends Pessoa{

     private int numeroDeMatricula;
     private String senhaDeAcesso;

     public int getNumeroDeMatricula() {
          return numeroDeMatricula;
     }

     public void setNumeroDeMatricula(int numeroDeMatricula) {
          this.numeroDeMatricula = numeroDeMatricula;
     }

     public String getSenhaDeAcesso() {
          return senhaDeAcesso;
     }

     public void setSenhaDeAcesso(String senhaDeAcesso) {
          this.senhaDeAcesso = senhaDeAcesso;
     }
}
