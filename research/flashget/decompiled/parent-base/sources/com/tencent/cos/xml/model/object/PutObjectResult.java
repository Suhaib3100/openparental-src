package com.tencent.cos.xml.model.object;

import android.text.TextUtils;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.model.tag.CallbackResult;
import com.tencent.cos.xml.model.tag.pic.PicUploadResult;
import com.tencent.cos.xml.utils.QCloudXmlUtils;
import com.tencent.qcloud.core.http.HttpResponse;
import java.io.IOException;

/* loaded from: classes7.dex */
public final class PutObjectResult extends BasePutObjectResult {
    public CallbackResult callbackResult;
    public PicUploadResult picUploadResult;

    @Override // com.tencent.cos.xml.model.object.BasePutObjectResult, com.tencent.cos.xml.model.CosXmlResult
    public void parseResponseBody(HttpResponse httpResponse) throws CosXmlServiceException, CosXmlClientException {
        super.parseResponseBody(httpResponse);
        try {
            if (ProtectedSandApp.s("䦡\u0001").equalsIgnoreCase(httpResponse.header(ProtectedSandApp.s("䦠\u0001")))) {
                if (this.httpCode != 203) {
                    this.picUploadResult = (PicUploadResult) QCloudXmlUtils.fromXml(httpResponse.byteStream(), PicUploadResult.class);
                    return;
                }
                CallbackResult.Error error = (CallbackResult.Error) QCloudXmlUtils.fromXml(httpResponse.byteStream(), CallbackResult.Error.class);
                CallbackResult callbackResult = new CallbackResult();
                this.callbackResult = callbackResult;
                callbackResult.status = ProtectedSandApp.s("䦢\u0001");
                callbackResult.error = error;
                return;
            }
            try {
                String string = httpResponse.string();
                if (TextUtils.isEmpty(string)) {
                    return;
                }
                CallbackResult callbackResult2 = new CallbackResult();
                this.callbackResult = callbackResult2;
                callbackResult2.status = ProtectedSandApp.s("䦣\u0001");
                callbackResult2.callbackBody = string;
                callbackResult2.callbackBodyNotBase64 = true;
            } catch (IOException e4) {
                throw new CosXmlClientException(ClientErrorCode.POOR_NETWORK.getCode(), e4);
            }
        } catch (Exception e5) {
            if (!(e5 instanceof CosXmlClientException)) {
                throw new CosXmlClientException(ClientErrorCode.SERVERERROR.getCode(), e5);
            }
            throw e5;
        }
    }

    @q0
    public PicUploadResult picUploadResult() {
        return this.picUploadResult;
    }
}
