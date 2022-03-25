/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.controller;

import agenda.model.bean.BeanAgendamento;
import agenda.model.dao.DaoAgendamento;
import java.util.List;

/**
 *
 * @author gustavo
 */
public class ControllerAgendamento {
    
    private DaoAgendamento daoAgendamento;

    public ControllerAgendamento() {
        daoAgendamento = new DaoAgendamento();
    }
    
    public BeanAgendamento criarAgendamento(BeanAgendamento agendamento){
        return daoAgendamento.criarAgendamento(agendamento);
    }
    
    public List<BeanAgendamento> listaAgendamentos(BeanAgendamento agendamento, String tipoPesquisa){
        return daoAgendamento.listarAgendamento(agendamento, tipoPesquisa);
    }
    
    public BeanAgendamento atualizarAgendamento(BeanAgendamento agendamento, Long novoContato){
        return daoAgendamento.atualizarAgendamento(agendamento, novoContato);
    }
    
    public BeanAgendamento excluirAgendamento(BeanAgendamento agendamento){
        return daoAgendamento.excluirAgendamento(agendamento);
    }

    public BeanAgendamento buscarAgendamento(BeanAgendamento agendamentoEntrada) {
        return daoAgendamento.buscarAgendamento(agendamentoEntrada);
    }
    
    
}
