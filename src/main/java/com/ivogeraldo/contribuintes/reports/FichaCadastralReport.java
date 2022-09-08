package com.ivogeraldo.contribuintes.reports;

import com.ivogeraldo.contribuintes.domains.Pessoa;
import com.ivogeraldo.contribuintes.repositories.PessoaRepository;
import com.ivogeraldo.contribuintes.services.PessoaService;
import java.util.Arrays;
import java.util.List;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

public class FichaCadastralReport {

    PessoaRepository pessoaRepository = new PessoaService();

    public void report(String arg) throws JRException {

        JasperReport pathjrxml = JasperCompileManager.compileReport("src/templates/FichaCadastralReport.jrxml");

        Integer id = Integer.parseInt(arg);
        Pessoa pessoa = pessoaRepository.getPessoaById(id);
        List<Pessoa> pessoas = Arrays.asList(pessoa);

        JasperPrint printReport = JasperFillManager.fillReport(pathjrxml, null, new JRBeanCollectionDataSource(pessoas));
        JasperViewer.viewReport(printReport, false);
    }
}
