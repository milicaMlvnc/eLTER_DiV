package com.ecosense.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;


@Entity
@NamedQuery(name="LayerGroup.findAll", query="SELECT e FROM LayerGroup e")
public class LayerGroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="icon_class")
	private String iconClass;
	
//	@ManyToOne
//	@JoinColumn(name="layer_group_parent_id")
//	private LayerGroup layerGroupParent;

//	//bi-directional many-to-one association to Region
//	@OneToMany(mappedBy="layerGroupParent")
//	private List<LayerGroup> layerGroups;
	

	@OneToMany(mappedBy = "layerGroup")
	private List<Layer> layers;

	public LayerGroup() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Layer> getLayers() {
		return layers;
	}

	public void setLayers(List<Layer> layers) {
		this.layers = layers;
	}

	public String getIconClass() {
		return iconClass;
	}

	public void setIconClass(String iconClass) {
		this.iconClass = iconClass;
	}
	
//	public LayerGroup getLayerGroupParent() {
//		return layerGroupParent;
//	}
//
//	public List<LayerGroup> getLayerGroups() {
//		return layerGroups;
//	}
//
//	public void setLayerGroupParent(LayerGroup layerGroupParent) {
//		this.layerGroupParent = layerGroupParent;
//	}
//
//	public void setLayerGroups(List<LayerGroup> layerGroups) {
//		this.layerGroups = layerGroups;
//	}

	
}
