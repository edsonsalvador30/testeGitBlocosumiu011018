package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class BlocoTeste02 {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @return Var
	 */
	// BlocoTeste02
	public static Var NovoBloco() throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				System.out.println(Var.valueOf("abc").getObjectAsString());
				System.out.println(Var.valueOf("123").getObjectAsString());
				System.out.println(Var.valueOf("ABC").getObjectAsString());
				System.out.println(Var.valueOf("FFFFFFF").getObjectAsString());
				return Var.VAR_NULL;
			}
		}.call();
	}

}
