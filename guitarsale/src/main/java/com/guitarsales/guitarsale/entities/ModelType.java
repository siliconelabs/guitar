package com.guitarsales.guitarsale.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class ModelType {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	private String name;	

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="MODELTYPE_ID")
	private List<Model> models = new ArrayList<Model>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Model> getModels() {
		return models;
	}

	public void setModels(List<Model> models) {
		this.models = models;
	}

	public Long getId() {
		return id;
	}
}
