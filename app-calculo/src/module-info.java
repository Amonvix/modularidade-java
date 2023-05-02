/**
 * 
 */
/**
 * @author daniel
 *
 */
module app.calculo {
	
	exports com.amon.app.calculo;
	exports com.amon.app.calculo.interno
		to app.financeiro;
	
	opens com.amon.app.calculo.interno
		to app.financeiro;
	
	
	requires app.logging;
	
	requires app.api;
	provides com.amon.app.Calculadora
	with com.amon.app.calculo.CalculadoraImpl;
}