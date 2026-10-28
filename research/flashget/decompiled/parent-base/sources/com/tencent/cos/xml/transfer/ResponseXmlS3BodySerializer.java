package com.tencent.cos.xml.transfer;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.model.CosXmlResult;
import com.tencent.cos.xml.model.tag.CosError;
import com.tencent.cos.xml.utils.BaseXmlSlimParser;
import com.tencent.qcloud.core.common.QCloudClientException;
import com.tencent.qcloud.core.common.QCloudServiceException;
import com.tencent.qcloud.core.http.HttpResponse;
import com.tencent.qcloud.core.http.ResponseBodyConverter;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class ResponseXmlS3BodySerializer<T> extends ResponseBodyConverter<T> {
    private CosXmlResult cosXmlResult;

    public ResponseXmlS3BodySerializer(CosXmlResult cosXmlResult) {
        this.cosXmlResult = cosXmlResult;
    }

    private void parseCOSXMLError(HttpResponse httpResponse) throws CosXmlServiceException, CosXmlClientException {
        int code = httpResponse.code();
        if (code < 200 || code >= 300) {
            CosXmlServiceException cosXmlServiceException = new CosXmlServiceException(httpResponse.message(), httpResponse.host());
            cosXmlServiceException.setStatusCode(code);
            cosXmlServiceException.setRequestId(httpResponse.header(ProtectedSandApp.s("侱\u0001")));
            String header = httpResponse.header(ProtectedSandApp.s("侲\u0001"));
            CosError cosError = new CosError();
            if (ProtectedSandApp.s("侳\u0001").equalsIgnoreCase(header)) {
                try {
                    cosError = CosError.fromJson(httpResponse.string());
                } catch (IOException e4) {
                    throw new CosXmlClientException(ClientErrorCode.POOR_NETWORK.getCode(), e4);
                } catch (JSONException e5) {
                    throw new CosXmlClientException(ClientErrorCode.SERVERERROR.getCode(), e5);
                }
            } else {
                InputStream byteStream = httpResponse.byteStream();
                if (byteStream != null) {
                    try {
                        BaseXmlSlimParser.parseError(byteStream, cosError);
                    } catch (IOException e6) {
                        throw new CosXmlClientException(ClientErrorCode.POOR_NETWORK.getCode(), e6);
                    } catch (XmlPullParserException e7) {
                        throw new CosXmlClientException(ClientErrorCode.SERVERERROR.getCode(), e7);
                    }
                }
            }
            String str = cosError.code;
            if (str != null) {
                cosXmlServiceException.setErrorCode(str);
            }
            String str2 = cosError.message;
            if (str2 != null) {
                cosXmlServiceException.setErrorMessage(str2);
            }
            String str3 = cosError.requestId;
            if (str3 != null) {
                cosXmlServiceException.setRequestId(str3);
            }
            String str4 = cosError.resource;
            if (str4 == null) {
                throw cosXmlServiceException;
            }
            cosXmlServiceException.setServiceName(str4);
            throw cosXmlServiceException;
        }
    }

    @Override // com.tencent.qcloud.core.http.ResponseBodyConverter
    public T convert(HttpResponse httpResponse) throws QCloudClientException, QCloudServiceException {
        parseCOSXMLError(httpResponse);
        this.cosXmlResult.parseResponseBody(httpResponse);
        return (T) this.cosXmlResult;
    }
}
