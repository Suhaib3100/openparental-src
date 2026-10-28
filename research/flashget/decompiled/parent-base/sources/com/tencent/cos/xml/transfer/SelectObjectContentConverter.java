package com.tencent.cos.xml.transfer;

import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.listener.SelectObjectContentListener;
import com.tencent.cos.xml.model.object.SelectObjectContentResult;
import com.tencent.cos.xml.model.tag.CosError;
import com.tencent.cos.xml.model.tag.eventstreaming.Message;
import com.tencent.cos.xml.model.tag.eventstreaming.MessageDecoder;
import com.tencent.cos.xml.model.tag.eventstreaming.SelectObjectContentEvent;
import com.tencent.cos.xml.model.tag.eventstreaming.SelectObjectContentEventUnmarshaller;
import com.tencent.cos.xml.utils.BaseXmlSlimParser;
import com.tencent.qcloud.core.common.QCloudClientException;
import com.tencent.qcloud.core.common.QCloudServiceException;
import com.tencent.qcloud.core.http.HttpResponse;
import com.tencent.qcloud.core.http.ResponseBodyConverter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class SelectObjectContentConverter<T> extends ResponseBodyConverter<T> {
    private SelectObjectContentListener contentListener;
    private String localPath;
    private MessageDecoder messageDecoder = new MessageDecoder();
    private SelectObjectContentResult selectObjectContentResult;

    public SelectObjectContentConverter(SelectObjectContentResult selectObjectContentResult, String str) {
        this.selectObjectContentResult = selectObjectContentResult;
        this.localPath = str;
    }

    private void closeFileOutputStream(FileOutputStream fileOutputStream) throws QCloudClientException {
        if (fileOutputStream != null) {
            try {
                fileOutputStream.close();
            } catch (IOException e4) {
                e4.printStackTrace();
                throw new QCloudClientException(e4);
            }
        }
    }

    private FileOutputStream newFileOutputStream(String str) throws QCloudClientException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
        try {
            if (file.createNewFile()) {
                return new FileOutputStream(file);
            }
            return null;
        } catch (IOException e4) {
            e4.printStackTrace();
            throw new QCloudClientException(e4);
        }
    }

    private void parseCOSXMLError(HttpResponse httpResponse) throws CosXmlServiceException, CosXmlClientException {
        int code = httpResponse.code();
        if (code < 200 || code >= 300) {
            CosXmlServiceException cosXmlServiceException = new CosXmlServiceException(httpResponse.message(), httpResponse.host());
            cosXmlServiceException.setStatusCode(code);
            cosXmlServiceException.setRequestId(httpResponse.header(ProtectedSandApp.s("侴\u0001")));
            InputStream byteStream = httpResponse.byteStream();
            if (byteStream == null) {
                throw cosXmlServiceException;
            }
            CosError cosError = new CosError();
            try {
                BaseXmlSlimParser.parseError(byteStream, cosError);
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
            } catch (IOException e4) {
                throw new CosXmlClientException(ClientErrorCode.POOR_NETWORK.getCode(), e4);
            } catch (XmlPullParserException e5) {
                throw new CosXmlClientException(ClientErrorCode.SERVERERROR.getCode(), e5);
            }
        }
    }

    @Override // com.tencent.qcloud.core.http.ResponseBodyConverter
    public T convert(HttpResponse<T> httpResponse) throws QCloudClientException, QCloudServiceException {
        parseCOSXMLError(httpResponse);
        this.selectObjectContentResult.parseResponseBody(httpResponse);
        InputStream byteStream = httpResponse.byteStream();
        byte[] bArr = new byte[256];
        FileOutputStream newFileOutputStream = newFileOutputStream(this.localPath);
        while (true) {
            try {
                int read = byteStream.read(bArr);
                if (read <= 0) {
                    closeFileOutputStream(newFileOutputStream);
                    return (T) this.selectObjectContentResult;
                }
                List<Message> feed = this.messageDecoder.feed(bArr, 0, read);
                if (newFileOutputStream != null) {
                    newFileOutputStream.write(bArr, 0, read);
                }
                Iterator<Message> it = feed.iterator();
                while (it.hasNext()) {
                    SelectObjectContentEvent unmarshalMessage = SelectObjectContentEventUnmarshaller.unmarshalMessage(it.next());
                    SelectObjectContentListener selectObjectContentListener = this.contentListener;
                    if (selectObjectContentListener != null) {
                        selectObjectContentListener.onProcess(unmarshalMessage);
                    }
                }
            } catch (IOException e4) {
                e4.printStackTrace();
                throw new QCloudClientException(e4);
            }
        }
    }

    public void setContentListener(SelectObjectContentListener selectObjectContentListener) {
        this.contentListener = selectObjectContentListener;
    }
}
