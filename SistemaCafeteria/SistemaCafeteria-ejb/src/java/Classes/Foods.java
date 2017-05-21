/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author cbzn_
 */
@Entity
@Table(name = "foods")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Foods.findAll", query = "SELECT f FROM Foods f")
    , @NamedQuery(name = "Foods.findByIdFoods", query = "SELECT f FROM Foods f WHERE f.idFoods = :idFoods")
    , @NamedQuery(name = "Foods.findByFoodsName", query = "SELECT f FROM Foods f WHERE f.foodsName = :foodsName")
    , @NamedQuery(name = "Foods.findByFoodsStock", query = "SELECT f FROM Foods f WHERE f.foodsStock = :foodsStock")
    , @NamedQuery(name = "Foods.findByFoodsPrice", query = "SELECT f FROM Foods f WHERE f.foodsPrice = :foodsPrice")})
public class Foods implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_foods")
    private Integer idFoods;
    @Size(max = 45)
    @Column(name = "foods_name")
    private String foodsName;
    @Column(name = "foods_stock")
    private Integer foodsStock;
    @Size(max = 45)
    @Column(name = "foods_price")
    private String foodsPrice;
    @JoinTable(name = "orders_has_foods", joinColumns = {
        @JoinColumn(name = "foods_id_foods", referencedColumnName = "id_foods")}, inverseJoinColumns = {
        @JoinColumn(name = "orders_id_orders", referencedColumnName = "id_orders")
        , @JoinColumn(name = "orders_menus_id_menus", referencedColumnName = "menus_id_menus")})
    @ManyToMany
    private List<Orders> ordersList;

    public Foods() {
    }

    public Foods(Integer idFoods) {
        this.idFoods = idFoods;
    }

    public Integer getIdFoods() {
        return idFoods;
    }

    public void setIdFoods(Integer idFoods) {
        this.idFoods = idFoods;
    }

    public String getFoodsName() {
        return foodsName;
    }

    public void setFoodsName(String foodsName) {
        this.foodsName = foodsName;
    }

    public Integer getFoodsStock() {
        return foodsStock;
    }

    public void setFoodsStock(Integer foodsStock) {
        this.foodsStock = foodsStock;
    }

    public String getFoodsPrice() {
        return foodsPrice;
    }

    public void setFoodsPrice(String foodsPrice) {
        this.foodsPrice = foodsPrice;
    }

    @XmlTransient
    public List<Orders> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(List<Orders> ordersList) {
        this.ordersList = ordersList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFoods != null ? idFoods.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Foods)) {
            return false;
        }
        Foods other = (Foods) object;
        if ((this.idFoods == null && other.idFoods != null) || (this.idFoods != null && !this.idFoods.equals(other.idFoods))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Classes.Foods[ idFoods=" + idFoods + " ]";
    }
    
}
