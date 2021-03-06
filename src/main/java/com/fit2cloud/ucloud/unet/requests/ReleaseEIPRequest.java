
package com.fit2cloud.ucloud.unet.requests;

import com.fit2cloud.ucloud.Request;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:47 PM
 * Email: xqiang.chi@samsung.com
 */
public class ReleaseEIPRequest extends Request {
    private String Region;
    private String EIPId;


    public void setRegion(String Region) {
        this.Region = Region;
    }

    public String getRegion() {
        return Region;
    }

    public void setEIPId(String EIPId) {
        this.EIPId = EIPId;
    }

    public String getEIPId() {
        return EIPId;
    }

    @Override
    public String toString() {
        return "ReleaseEIPRequest{" +
                "Region='" + Region + '\'' +
                ", EIPId='" + EIPId + '\'' +
                '}';
    }
}
        