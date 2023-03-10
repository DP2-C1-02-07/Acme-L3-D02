package acme.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Peep extends AbstractEntity {
	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@NotBlank
	@Column(unique = true)
	@Length(max = 75)
	protected String			tittle;

	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	protected Date				startDate;

	@NotBlank
	@Length(max = 75)
	protected String			message;
	

	@NotBlank
	@Length(max = 100)
	protected String			nick;

	@URL
	protected String			link;
	
	@Email
	protected String            email;


	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------

}