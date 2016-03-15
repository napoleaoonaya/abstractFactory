package abstractFactory;

public class ReceptorCreator {
	
	public static final int VISA = 0;
	public static final int MASTERCARD = 1;

	public Receptor create(int tipoDoEmissor) {
		if (tipoDoEmissor == EmissorCreator.VISA) {
			return new ReceptorVisa();
		} else if (tipoDoEmissor == EmissorCreator.MASTERCARD) {
			return new ReceptorMasterCard();
		} else {
			throw new IllegalArgumentException(" Tipo de emissor não suportado ");
		}
	}

}
