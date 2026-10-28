package com.tencent.cos.xml.model.tag.audit.bean;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "JobsDetail")
/* loaded from: classes7.dex */
public class ImageAuditJobsDetail extends AuditJobsDetail {
    public ImagesAuditScenarioInfo adsInfo;
    public int compressionResult;
    public String object;
    public ImagesAuditScenarioInfo politicsInfo;
    public ImagesAuditScenarioInfo pornInfo;
    public ImagesAuditScenarioInfo qualityInfo;
    public int score;
    public ImagesAuditScenarioInfo terrorismInfo;
    public String text;
    public String url;

    public static class ImagesAuditScenarioInfo extends ImageAuditScenarioInfo {
        public int code;
        public String label;
        public String msg;
    }
}
