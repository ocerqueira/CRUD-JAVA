package appbookelandia.controller;

import appbookelandia.dal.ClienteDAO;
import appbookelandia.model.Cliente;
import appbookelandia.model.Login;
import appbookelandia.model.NivelDeAcesso;
import appbookelandia.view.FrmCadClientes;
import java.util.Arrays;
import java.sql.SQLException;
import java.time.LocalDate;

public class ControllerCadClientes {

    private final FrmCadClientes view;

    public ControllerCadClientes(FrmCadClientes view) {
        this.view = view;
    }

    public void cadastraCliente() throws SQLException {
        Cliente c = new Cliente();
        c.setNome(view.getTxtNome().getText());
        c.setEndereco(view.getTxtEndereco().getText());
        c.setCpf(view.getTxtCPF().getText());
        c.setTelefone(view.getTxtTelefone().getText());
        c.setDataDeCadastro(LocalDate.now());

        ClienteDAO clienteDao = new ClienteDAO();
        clienteDao.adiciona(c);

        Login log = new Login();
        log.setEmail(view.getTxtEmail().getText());
        log.setSenha(Arrays.toString(view.getTxtSenha().getPassword()));
        log.setNivelDeAcesso(NivelDeAcesso.Cliente);
        log.setStatus(true);
    }

    public void alteraCliente() throws SQLException {
        Cliente c = new Cliente();
        c.setNome(view.getTxtNome().getText());
        c.setEndereco(view.getTxtEndereco().getText());
        c.setCpf(view.getTxtCPF().getText());
        c.setTelefone(view.getTxtTelefone().getText());
        c.setDataDeCadastro(LocalDate.now());

        ClienteDAO clienteDao = new ClienteDAO();
        clienteDao.altera(c);

    }

    public void limpaTela() {
        view.getTxtCPF().setText("");
        view.getTxtNome().setText("");
        view.getTxtEmail().setText("");
        view.getTxtSenha().setText("");
        view.getTxtTelefone().setText("");
        view.getTxtEndereco().setText("");
    }

    public void consultaCliente() throws SQLException {

        String cpf = view.getTxtCPF().getText();

        ClienteDAO clienteDao = new ClienteDAO();
        Cliente cliente = clienteDao.recupera(cpf);

        if (cliente != null) {
            view.getTxtNome().setText(cliente.getNome());
            view.getTxtEndereco().setText(cliente.getEndereco());
            view.getTxtTelefone().setText(cliente.getTelefone());
        }
    }
}
