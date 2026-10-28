package com.tencent.cos.xml.model.ci;

import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.model.tag.pic.PicObject;
import com.tencent.cos.xml.model.tag.pic.PicOriginalInfo;
import com.tencent.cos.xml.model.tag.pic.QRCodeInfo;
import com.tencent.cos.xml.utils.QCloudXmlUtils;
import com.tencent.qcloud.core.http.HttpResponse;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

/* loaded from: classes7.dex */
public class QRCodeUploadResult extends ImageUploadResult {
    public PicUploadResult picUploadResult;

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "UploadResult")
    public static class PicUploadResult {

        @XmlElement(name = "OriginalInfo")
        public PicOriginalInfo originalInfo;

        @XmlElement(name = "ProcessResults")
        public List<QrPicObject> processResults;
    }

    @XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Object")
    public static class QrPicObject extends PicObject {
        public int codeStatus;

        @XmlElement(flatListNote = true, name = "QRcodeInfo")
        public List<QRCodeInfo> qrCodeInfo;
    }

    public PicUploadResult getPicUploadResult() {
        return this.picUploadResult;
    }

    @Override // com.tencent.cos.xml.model.ci.ImageUploadResult, com.tencent.cos.xml.model.CosXmlResult
    public void parseResponseBody(HttpResponse httpResponse) throws CosXmlClientException, CosXmlServiceException {
        super.parseResponseBody(httpResponse);
        this.picUploadResult = (PicUploadResult) QCloudXmlUtils.fromXml(httpResponse.byteStream(), PicUploadResult.class);
    }
}
