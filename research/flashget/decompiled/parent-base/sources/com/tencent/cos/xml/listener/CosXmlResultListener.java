package com.tencent.cos.xml.listener;

import androidx.annotation.q0;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.model.CosXmlRequest;
import com.tencent.cos.xml.model.CosXmlResult;

/* loaded from: classes6.dex */
public interface CosXmlResultListener {
    void onFail(CosXmlRequest cosXmlRequest, @q0 CosXmlClientException cosXmlClientException, @q0 CosXmlServiceException cosXmlServiceException);

    void onSuccess(CosXmlRequest cosXmlRequest, CosXmlResult cosXmlResult);
}
