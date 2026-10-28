package com.tencent.cos.xml.model.ci;

import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.model.CosXmlResult;
import com.tencent.qcloud.core.http.HttpResponse;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class PreviewDocumentInHtmlLinkResult extends CosXmlResult {
    private String previewUrl;

    public String getPreviewUrl() {
        return this.previewUrl;
    }

    @Override // com.tencent.cos.xml.model.CosXmlResult
    public void parseResponseBody(HttpResponse httpResponse) throws CosXmlClientException, CosXmlServiceException {
        String s4 = ProtectedSandApp.s("㪥\u0001");
        super.parseResponseBody(httpResponse);
        try {
            String string = httpResponse.string();
            if (TextUtils.isEmpty(string)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.has(s4)) {
                this.previewUrl = jSONObject.getString(s4);
            }
        } catch (IOException e4) {
            throw new CosXmlClientException(ClientErrorCode.POOR_NETWORK.getCode(), e4);
        } catch (JSONException e5) {
            throw new CosXmlClientException(ClientErrorCode.SERVERERROR.getCode(), e5);
        }
    }
}
