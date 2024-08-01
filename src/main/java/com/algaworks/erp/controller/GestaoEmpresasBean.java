package com.algaworks.erp.controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import com.algaworks.erp.model.Empresa;
import com.algaworks.erp.model.TipoEmpresa;

@Named
@ViewScoped
public class GestaoEmpresasBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Empresa empresa = new Empresa();

	public void salvar() {
		System.out.println("Razão social: " + empresa.getRazaoSocial() + " - Nome fantasia: "
				+ empresa.getNomeFantasia() + " - Tipo: " + empresa.getTipo() + " - Data Fundação: "
				+ empresa.getDataFundacao() + " - Faturamento: " + empresa.getFaturamento());
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public TipoEmpresa[] getTiposEmpresa() {
		return TipoEmpresa.values();
	}

	public String ajuda() {
		return "AjudaGestaoEmpresas?faces-redirect=true";
	}

}
