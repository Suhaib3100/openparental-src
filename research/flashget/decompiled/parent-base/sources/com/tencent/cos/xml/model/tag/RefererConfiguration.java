package com.tencent.cos.xml.model.tag;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

@XmlBean
/* loaded from: classes7.dex */
public class RefererConfiguration {
    public List<Domain> domainList;
    public String emptyReferConfiguration;
    public String refererType;
    public String status;

    @XmlBean
    public static class Domain {

        @XmlElement(ignoreName = true)
        public String domain;

        public Domain() {
        }

        public Domain(String str) {
            this.domain = str;
        }
    }

    public enum RefererType {
        Black(ProtectedSandApp.s("䮳\u0001")),
        White(ProtectedSandApp.s("䮵\u0001"));

        private final String type;

        RefererType(String str) {
            this.type = str;
        }

        public static RefererType fromString(String str) {
            for (RefererType refererType : values()) {
                if (refererType.getTypeStr().equalsIgnoreCase(str)) {
                    return refererType;
                }
            }
            return null;
        }

        public String getTypeStr() {
            return this.type;
        }
    }

    public boolean getAllowEmptyRefer() {
        return ProtectedSandApp.s("䮷\u0001").equals(this.emptyReferConfiguration);
    }

    public boolean getEnabled() {
        return ProtectedSandApp.s("䮸\u0001").equals(this.status);
    }

    public RefererType getRefererType() {
        return RefererType.fromString(this.refererType);
    }

    public void setAllowEmptyRefer(boolean z4) {
        if (z4) {
            this.emptyReferConfiguration = ProtectedSandApp.s("䮷\u0001");
        } else {
            this.emptyReferConfiguration = ProtectedSandApp.s("䮹\u0001");
        }
    }

    public void setEnabled(boolean z4) {
        if (z4) {
            this.status = ProtectedSandApp.s("䮸\u0001");
        } else {
            this.status = ProtectedSandApp.s("䮺\u0001");
        }
    }

    public void setRefererType(RefererType refererType) {
        this.refererType = refererType.getTypeStr();
    }
}
