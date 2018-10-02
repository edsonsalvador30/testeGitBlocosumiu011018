package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Criando {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @return Var
	 */
	// Criando
	public static Var Executar() throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				System.out.println(Var.valueOf("Fazendo Arte").getObjectAsString());
				return Var.VAR_NULL;
			}
		}.call();
	}

}
