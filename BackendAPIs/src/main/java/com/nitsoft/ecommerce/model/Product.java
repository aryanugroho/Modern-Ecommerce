package com.nitsoft.ecommerce.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "products")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "product_id")
    private Integer productId;
    @Basic(optional = false)
    @Column(name = "company_id")
    private int companyId;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "browsing_name")
    private String browsingName;
    @Basic(optional = false)
    @Column(name = "sale_price")
    private double salePrice;
    @Basic(optional = false)
    @Column(name = "list_price")
    private double listPrice;
    @Basic(optional = false)
    @Column(name = "default_image")
    private String defaultImage;
    @Basic(optional = false)
    @Column(name = "overview")
    private String overview;
    @Basic(optional = false)
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "is_stock_controlled")
    private boolean isStockControlled;
    @Basic(optional = false)
    @Column(name = "status")
    private int status;
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @Column(name = "rank")
    private int rank;
    @Basic(optional = false)
    @Column(name = "sku")
    private String sku;
    @Basic(optional = false)
    @Column(name = "created_on")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;
    @Column(name = "updated_on")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedOn;

    public Product() {
    }

    public Product(Integer productId) {
        this.productId = productId;
    }

    public Product(Integer productId, int companyId, String name, String browsingName, double salePrice, double listPrice, String defaultImage, String overview, int quantity, int status, int rank, String sku, Date createdOn) {
        this.productId = productId;
        this.companyId = companyId;
        this.name = name;
        this.browsingName = browsingName;
        this.salePrice = salePrice;
        this.listPrice = listPrice;
        this.defaultImage = defaultImage;
        this.overview = overview;
        this.quantity = quantity;
        this.status = status;
        this.rank = rank;
        this.sku = sku;
        this.createdOn = createdOn;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrowsingName() {
        return browsingName;
    }

    public void setBrowsingName(String browsingName) {
        this.browsingName = browsingName;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public double getListPrice() {
        return listPrice;
    }

    public void setListPrice(double listPrice) {
        this.listPrice = listPrice;
    }

    public String getDefaultImage() {
        return defaultImage;
    }

    public void setDefaultImage(String defaultImage) {
        this.defaultImage = defaultImage;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean getIsStockControlled() {
        return isStockControlled;
    }

    public void setIsStockControlled(boolean isStockControlled) {
        this.isStockControlled = isStockControlled;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productId != null ? productId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Product)) {
            return false;
        }
        Product other = (Product) object;
        if ((this.productId == null && other.productId != null) || (this.productId != null && !this.productId.equals(other.productId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.nitsoft.ecommerce.model.Products[ productId=" + productId + " ]";
    }

}
