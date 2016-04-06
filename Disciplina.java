package Bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "disciplina")
public class Disciplina {

	@Id
	@SequenceGenerator(name = "pk_sequence", sequenceName = "disciplina_esc_id_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pk_sequence")
	@Column(name = "esc_id")
	private int id;

	@Column(name = "esc_nome", length = 40, nullable = true)
	private String nome;

	@Column(name = "esc_objetivo", length = 40, nullable = true)
	private String objetivo;

	@Column(name = "esc_periodo", length = 40, nullable = true)
	private int periodo;

	@Column(name = "esc_cargaHoraria", length = 40, nullable = true)
	private int cargaHoraria;

	@Column(name = "esc_observacao", length = 40, nullable = true)
	private String observacao;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

}
