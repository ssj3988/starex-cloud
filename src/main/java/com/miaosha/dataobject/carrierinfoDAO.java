package com.miaosha.dataobject;

import java.util.Date;

public class carrierinfoDAO {
  // userid
    private Long id;

    private Long venderId;

    private String venderCode;

    private Long categoryId;

    private Long channelId;

    private Long skuId;

    private Long sendTownId;

    private Long sendProvinceId;

    private Long sendCountyId;

    private Long sendCityId;

    private String resultCode;

    private String resultMsg;

    private String reasonMsg;

    private Long carrierId;

    private String carrierName;

    private Long isSupport;

    private Date fallLibraryTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVenderId() {
        return venderId;
    }

    public void setVenderId(Long venderId) {
        this.venderId = venderId;
    }

    public String getVenderCode() {
        return venderCode;
    }

    public void setVenderCode(String venderCode) {
        this.venderCode = venderCode == null ? null : venderCode.trim();
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getChannelId() {
        return channelId;
    }

    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Long getSendTownId() {
        return sendTownId;
    }

    public void setSendTownId(Long sendTownId) {
        this.sendTownId = sendTownId;
    }

    public Long getSendProvinceId() {
        return sendProvinceId;
    }

    public void setSendProvinceId(Long sendProvinceId) {
        this.sendProvinceId = sendProvinceId;
    }

    public Long getSendCountyId() {
        return sendCountyId;
    }

    public void setSendCountyId(Long sendCountyId) {
        this.sendCountyId = sendCountyId;
    }

    public Long getSendCityId() {
        return sendCityId;
    }

    public void setSendCityId(Long sendCityId) {
        this.sendCityId = sendCityId;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode == null ? null : resultCode.trim();
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg == null ? null : resultMsg.trim();
    }

    public String getReasonMsg() {
        return reasonMsg;
    }

    public void setReasonMsg(String reasonMsg) {
        this.reasonMsg = reasonMsg == null ? null : reasonMsg.trim();
    }

    public Long getCarrierId() {
        return carrierId;
    }

    public void setCarrierId(Long carrierId) {
        this.carrierId = carrierId;
    }

    public String getCarrierName() {
        return carrierName;
    }

    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName == null ? null : carrierName.trim();
    }

    public Long getIsSupport() {
        return isSupport;
    }

    public void setIsSupport(Long isSupport) {
        this.isSupport = isSupport;
    }

    public Date getFallLibraryTime() {
        return fallLibraryTime;
    }

    public void setFallLibraryTime(Date fallLibraryTime) {
        this.fallLibraryTime = fallLibraryTime;
    }
}