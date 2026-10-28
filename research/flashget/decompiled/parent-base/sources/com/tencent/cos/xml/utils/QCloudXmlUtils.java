package com.tencent.cos.xml.utils;

import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class QCloudXmlUtils {
    public static <T> T fromXml(InputStream inputStream, Class<T> cls) throws CosXmlClientException {
        try {
            return (T) QCloudXml.fromXml(inputStream, cls);
        } catch (IOException e4) {
            throw new CosXmlClientException(ClientErrorCode.SERVERERROR.getCode(), e4);
        } catch (XmlPullParserException e5) {
            throw new CosXmlClientException(ClientErrorCode.POOR_NETWORK.getCode(), e5);
        }
    }

    public static <T> String toXml(T t4) throws CosXmlClientException {
        try {
            return QCloudXml.toXml(t4);
        } catch (IOException e4) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), e4);
        } catch (XmlPullParserException e5) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), e5);
        }
    }
}
