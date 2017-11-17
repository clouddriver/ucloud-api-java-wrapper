package com.fit2cloud.ucloud.uhost.model;

/**
 * Created by chixq on 8/15/15.
 */
public class Regions {
    private int RegionId;
    private String RegionName;
    private boolean isDefault;
    private String Zone;
    @Override
    public String toString() {
        return "Regions{" +
                "RegionId=" + RegionId +
                ", RegionName='" + RegionName + '\'' +
                ", isDefault=" + isDefault +
                ", Zone=" + Zone +
                '}';
    }

    public int getRegionId() {
        return RegionId;
    }

    public void setRegionId(int regionId) {
        RegionId = regionId;
    }

    public String getRegionName() {
        return RegionName;
    }

    public void setRegionName(String regionName) {
        RegionName = regionName;
    }

    public boolean isDefault() {
        return isDefault;
    }

    public void setIsDefault(boolean isDefault) {
        this.isDefault = isDefault;
    }

    public String getZone() {
        return Zone;
    }

    public void setZone(String zone) {
        Zone = zone;
    }
}
