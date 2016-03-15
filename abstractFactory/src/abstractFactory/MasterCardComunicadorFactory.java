package abstractFactory;

public class MasterCardComunicadorFactory {
	
	private EmissorCreator emissorCreator = new EmissorCreator();
	private ReceptorCreator receptorCreator = new ReceptorCreator();

	public Emissor createEmissor() {
		return emissorCreator.create( EmissorCreator.MASTERCARD );
	}
	
	public Receptor createReceptor() {
		return receptorCreator.create( ReceptorCreator.MASTERCARD );
	}

}
