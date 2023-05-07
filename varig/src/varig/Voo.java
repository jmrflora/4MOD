package varig;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class Voo {
	private String id;
	private Date dataHoraSaida;
	private Aeronave aeronaveEscalada;
	private Aeroporto aeroportoOrigem;
	private Aeroporto aeroportoDestino;
	private ArrayList<Assento> assentos;
	
	public void setQuantAssentos(){
		int quant = this.aeronaveEscalada.getCapacidadePassageiros();
		for (int i = 0; i < quant; i++) {
			this.assentos.add(new Assento(Integer.toString(i)));
		}
	}
	public void retiraAssento(Assento a) {
		this.assentos.remove(a);
	}
}
