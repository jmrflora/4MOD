package varig;

public class Reserva {
	private Passageiro passageiroCliente;
	private Voo vooReservado;
	
	public Reserva(Passageiro pa, Voo v) {
		this.passageiroCliente = pa;
		this.vooReservado = v;
	}

	public Passageiro getPassageiroCliente() {
		return passageiroCliente;
	}

	public void setPassageiroCliente(Passageiro passageiroCliente) {
		this.passageiroCliente = passageiroCliente;
	}

	public Voo getVooReservado() {
		return vooReservado;
	}

	public void setVooReservado(Voo vooReservado) {
		this.vooReservado = vooReservado;
	}
	
}
