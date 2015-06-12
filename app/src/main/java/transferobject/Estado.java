package transferobject;

/**
 * Created by Fabricio on 11/06/2015.
 */
public class Estado {

    public int codigo;
    public String descricao;

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Estado(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Estado() {

    }

}
