/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testocr.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Kuuhaku
 */
@Entity
@Table(name = "tb_image")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbImage.findAll", query = "SELECT t FROM TbImage t")})
public class TbImage implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Lob
    @Column(name = "path")
    private String path;
    @JoinColumn(name = "user_username", referencedColumnName = "username")
    @ManyToOne(optional = false)
    private TbUser userUsername;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "imageId")
    private Collection<TbResult> tbResultCollection;

    public TbImage() {
    }

    public TbImage(Integer id) {
        this.id = id;
    }

    public TbImage(Integer id, String name, String path) {
        this.id = id;
        this.name = name;
        this.path = path;
    }

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

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public TbUser getUserUsername() {
        return userUsername;
    }

    public void setUserUsername(TbUser userUsername) {
        this.userUsername = userUsername;
    }

    @XmlTransient
    public Collection<TbResult> getTbResultCollection() {
        return tbResultCollection;
    }

    public void setTbResultCollection(Collection<TbResult> tbResultCollection) {
        this.tbResultCollection = tbResultCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbImage)) {
            return false;
        }
        TbImage other = (TbImage) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "testocr.model.TbImage[ id=" + id + " ]";
    }
    
}
