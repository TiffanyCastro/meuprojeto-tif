package televisao;
public class Televisao {

    public static void main(String[] args) {
      Emissora e = new Emissora ();
        System.out.println("nome = " + e.getNome());
        System.out.println("endereço = " +e.getEndereco());
        System.out.println("aberta ou fechada = " + e.getAbertafechada());
        Ator a = new Ator ();
        System.out.println("nome " + a.getNome ());
        System.out.println("data de nascimento " +a.getDatanascimento ());
        System.out.println("quantidade de novela " + a.getQuantidadedenovela());
        System.out.println("email " + a.getEmail());
        System.out.println("nome artistico " + a.getEmail());
        System.out.println("cidade " + a.getCidade());
        System.out.println("endereço "+a.getEndereco());
        System.out.println("bairro " +a.getBairro());
        System.out.println("estado " +a.getEstado());
        System.out.println("salario mensal "+a.getSalariomensal());
        System.out.println("cache eventos "+ a.getCacheeve());
        Novela n = new Novela ();
        System.out.println("titulo " + n.getTitulo());
        System.out.println("data do primeiro capitulo " + n.getDataprimeiro());
        System.out.println("data ultimo capitulo " + n.getDataultimo());
        System.out.println("horario " + n.getHorario());
        System.out.println("autor " + n.getAutor());
        System.out.println("emissora " + n.getEmissora());
        System.out.println("audiencia" +n.getAudiencia());
       Apresentador ap = new Apresentador ();
        System.out.println("nome " +ap.getNome());
        System.out.println("data de nascimento " + ap.getDatadenascimento());
        System.out.println("programa " + ap.getPrograma());
        System.out.println("email" +ap.getEmail());
        System.out.println("nome artistico " +ap.getNomeartistico());
         System.out.println("cidade " +ap.getCidade());
         System.out.println("endereço " +ap.getEndereco());
         System.out.println("bairro " + ap.getBairro());
         System.out.println("estado " + ap.getEstado());
         System.out.println("salario mensal " + ap.getSalariomensal());
         System.out.println("cache " + ap.getCache());
         System.out.println("merchan " + ap.getMerchan());
    }
}
