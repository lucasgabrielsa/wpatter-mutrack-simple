package org.wpattern.mutrack.simple.permission;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.wpattern.mutrack.simple.utils.BaseEntity;

@Entity
@Table(name="tb_permission")
@AttributeOverride(name="id", column = @Column(name="pk_id"))
public class PermissionEntity extends BaseEntity<Long> {

	private static final long serialVersionUID = 1L;
	
	@Column(length=45, nullable=false, unique=true)
	private String role;
	
	public PermissionEntity() {
		
	}

	public PermissionEntity(String role) {
		super();
		this.role = role;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	

}
