package src.repository;
import src.Model.Lancamento;
import java.util.ArrayList;
import java.util.List;

public class LancamentoDAO {
    static List<Lancamento> lancamentoList = new ArrayList<>();

    public static void salvar (Lancamento lancamento) {
        lancamentoList.add(lancamento);
    }

    public static List<Lancamento> buscaTodos(){
        return lancamentoList;
    }
}
