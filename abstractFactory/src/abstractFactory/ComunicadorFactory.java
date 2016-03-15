package abstractFactory;

public interface ComunicadorFactory {
	
	Emissor createEmissor();
	Receptor createReceptor();

}
