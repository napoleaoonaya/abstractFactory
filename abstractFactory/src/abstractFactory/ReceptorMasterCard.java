package abstractFactory;

public class ReceptorMasterCard implements Receptor {
	
	public String recebe(){
		System.out.println("Recebendo mensagem da MasterCard");
		String mensagem = "Mensagem da MasterCard";
		return mensagem;
	}

}
