package com.e451.model;


import javax.persistence.*;

@Entity
@Table(name = "coupon")
public class CouponRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long campaign;
    private Long couponUpc;
    private Long prodId;

    CouponRecord() {}

    public CouponRecord(long campaign, long couponUpc, long prodId, long id) {
        this.campaign = campaign;
        this.couponUpc = couponUpc;
        this.prodId = prodId;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCampaign() {
        return campaign;
    }

    public void setCampaign(Long campaign) {
        this.campaign = campaign;
    }

    public Long getCouponUpc() {
        return couponUpc;
    }

    public void setCouponUpc(Long couponUpc) {
        this.couponUpc = couponUpc;
    }

    public Long getProdId() {
        return prodId;
    }

    public void setProdId(Long prodId) {
        this.prodId = prodId;
    }
}
