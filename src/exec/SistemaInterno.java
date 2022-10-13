package exec;

import br.com.yohana.model.*;

public class SistemaInterno {

    public boolean login (Autenticavel usuario, int senha) {
        return usuario.autentica(senha);
    }
}
