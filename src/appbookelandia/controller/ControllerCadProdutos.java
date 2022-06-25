
package appbookelandia.controller;

import appbookelandia.view.FrmCadProdutos;
import appbookelandia.model.Produtos;

public class ControllerCadProdutos {
    
    private final FrmCadProdutos view;
    
    public ControllerCadProdutos(FrmCadProdutos view) {
        this.view = view;
    }
    
    /*public void cadastraProduto(){
        Produtos p = new Produtos();
        p.setNome(view.getTxtNomeDoProduto().getText());
        p.setPreco(view.getTxtPreco().getText());
        p.setDescricao(view.getTxtDescricao().getText());
        p.setCodigoDoProduto(view.getTxtCodigoDoProduto().get());
        p.setCodigoDaCategoria(view.getTxtCodigoDaCategoria().get());
    }
*/
}
