
package com.fit2cloud.ucloud.unet.requests;

import com.fit2cloud.ucloud.Request;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:47 PM
 * Email: xqiang.chi@samsung.com
 */
public class DeleteSecurityGroupRequest extends Request {
    private String Region;
    private String GroupId;


    public void setRegion(String Region) {
        this.Region = Region;
    }

    public String getRegion() {
        return Region;
    }

    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    public String getGroupId() {
        return GroupId;
    }

    @Override
    public String toString() {
        return "DeleteSecurityGroupRequest{" +
                "Region='" + Region + '\'' +
                ", GroupId='" + GroupId + '\'' +
                '}';
    }
}
        