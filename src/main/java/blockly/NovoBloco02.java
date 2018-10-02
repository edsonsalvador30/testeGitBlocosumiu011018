package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class NovoBloco02 {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @return Var
	 */
	// NovoBloco02
	public static Var UltimoAdicionado() throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"),
						Var.valueOf("Testando"));
				cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.notify"), Var.valueOf("info"),
						Var.valueOf("Deve Manter"));
				cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.notify"), Var.valueOf("warning"),
						Var.valueOf("Tudo Preenchido"));
				return Var.VAR_NULL;
			}
		}.call();
	}

}
