package testesUnitarios;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CodigoPessoaFisicaTeste.class, ValidadoraAcessoTeste.class, LogCPFTeste.class})
public class TestesUnitarios {

}
