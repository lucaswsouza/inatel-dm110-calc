package br.inatel.dm110.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
@SequenceGenerator(name = "seq_cliente", sequenceName = "seq_cliente", allocationSize = 1)
public class Cliente {
		
	@Id
	@GeneratedValue(generator = "seq_cliente", strategy = GenerationType.SEQUENCE)
	@Column(nullable = false)
	private Integer id;

	@Column(nullable = false, length = 50)
	private String name;

	@Column(nullable = false, length = 100)
	private String email;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return name + " - " + email;
	}

}
