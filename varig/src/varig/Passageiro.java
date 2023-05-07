package varig;

import java.util.Date;

public class Passageiro {
	private String cpf;
	private String nome;
	private Date dataNascimento;
	
	public Reserva reservarLugar(Voo v) {
		Reserva r = new Reserva(this, v);
		return r;
	}
	public CheckIn realizarCheckIn(Reserva r, Assento a) {
		Voo v = r.getVooReservado();
		v.retiraAssento(a);
		
	}
}
