package appbookelandia.controller;

import appbookelandia.model.Funcionario;
import appbookelandia.view.FrmCadFuncionarios;


public class ControllerCadFuncionarios {
    
    private final FrmCadFuncionarios view;
    
    public ControllerCadFuncionarios(FrmCadFuncionarios view) {
        this.view = view;
    }
    
    public void cadastraFuncionario() {
        Funcionario f = new Funcionario();
        f.setMatricula(view.getTxtMatricula());
        f.setNome(view.getTxtNome().getText());
        f.setDataAdmissao(view.getTxtDataAdmissao().getText());
        f.setSalario(view.getTxtSalario().getText());
        
    }
}
