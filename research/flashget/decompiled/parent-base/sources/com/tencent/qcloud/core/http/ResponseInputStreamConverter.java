package com.tencent.qcloud.core.http;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.core.common.QCloudClientException;
import com.tencent.qcloud.core.common.QCloudProgressListener;
import com.tencent.qcloud.core.common.QCloudServiceException;
import com.tencent.qcloud.core.util.QCloudHttpUtils;
import java.io.InputStream;

/* loaded from: classes7.dex */
public class ResponseInputStreamConverter<T> extends ResponseBodyConverter<T> implements ProgressBody {
    private CountingInputStream countingInputStream;
    protected boolean isQuic = false;
    protected QCloudProgressListener progressListener;

    @Override // com.tencent.qcloud.core.http.ResponseBodyConverter
    public T convert(HttpResponse<T> httpResponse) throws QCloudClientException, QCloudServiceException {
        if (this.isQuic) {
            return null;
        }
        HttpResponse.checkResponseSuccessful(httpResponse);
        long[] parseContentRange = QCloudHttpUtils.parseContentRange(httpResponse.header(ProtectedSandApp.s("娋\u0001")));
        this.countingInputStream = new CountingInputStream(httpResponse.byteStream(), parseContentRange != null ? (parseContentRange[1] - parseContentRange[0]) + 1 : httpResponse.contentLength(), this.progressListener);
        return null;
    }

    public void enableQuic(boolean z4) {
        this.isQuic = z4;
    }

    public long getBytesTotal() {
        return this.countingInputStream.getBytesTotal();
    }

    @Override // com.tencent.qcloud.core.http.ProgressBody
    public long getBytesTransferred() {
        CountingInputStream countingInputStream = this.countingInputStream;
        if (countingInputStream != null) {
            return countingInputStream.getTotalTransferred();
        }
        return 0L;
    }

    public InputStream getInputStream() {
        return this.countingInputStream;
    }

    public QCloudProgressListener getProgressListener() {
        return this.progressListener;
    }

    @Override // com.tencent.qcloud.core.http.ProgressBody
    public void setProgressListener(QCloudProgressListener qCloudProgressListener) {
        this.progressListener = qCloudProgressListener;
    }
}
