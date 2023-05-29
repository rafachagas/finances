package src.Model;

import java.time.LocalDate;

public class Lancamento {
    private Integer id;
    private LocalDate dataLancto;
    private String descricao;

    public Lancamento(Integer id, LocalDate dataLancto, String descricao) {
        this.id = id;
        this.dataLancto = dataLancto;
        this.descricao = descricao;
    }

    public Integer getId() {
        return id;
    }

    public LocalDate getDataLancto() {
        return dataLancto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDataLancto(LocalDate dataLancto) {
        this.dataLancto = dataLancto;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Lancamento{" +
                "id=" + id +
                ", dataLancto=" + dataLancto +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
