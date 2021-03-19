package Model;

public class Mensagem extends Model{

    private String mensagem;
    private String idConversa;
    private String idUsuario;


    public Mensagem(String mensagem, String idConversa, String idUsuario) {
        this.mensagem = mensagem;
        this.idConversa = idConversa;
        this.idUsuario = idUsuario;
    }

    public Mensagem() {}

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getIdConversa() {
        return idConversa;
    }

    public void setIdConversa(String idConversa) {
        this.idConversa = idConversa;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public String toString() {
        return "Mensagem{" +
                "mensagem='" + mensagem + '\'' +
                ", idConversa='" + idConversa + '\'' +
                ", idUsuario='" + idUsuario + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
