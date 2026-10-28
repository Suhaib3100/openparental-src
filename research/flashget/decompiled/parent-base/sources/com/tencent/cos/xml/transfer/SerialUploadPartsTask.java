package com.tencent.cos.xml.transfer;

import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.crypto.COSDirect;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.listener.CosXmlProgressListener;
import com.tencent.cos.xml.model.object.PutObjectRequest;
import com.tencent.cos.xml.model.object.UploadPartRequest;
import com.tencent.cos.xml.transfer.COSUploadTask;
import com.tencent.qcloud.core.http.HttpTaskMetrics;
import java.util.Set;

/* compiled from: UploadPartsTask.java */
/* loaded from: classes7.dex */
class SerialUploadPartsTask extends BaseUploadPartsTask {
    private UploadPartRequest currentUploadPartRequest;
    private volatile HttpTaskMetrics httpTaskMetrics;
    private int mPartNumber;
    private long mStartPointer;

    public SerialUploadPartsTask(COSDirect cOSDirect, PutObjectRequest putObjectRequest, long j4, long j5, int i4, String str) {
        super(cOSDirect, putObjectRequest, j4, j5, i4, str);
    }

    @Override // com.tencent.cos.xml.transfer.BaseUploadPartsTask
    public void cancel() {
        UploadPartRequest uploadPartRequest = this.currentUploadPartRequest;
        if (uploadPartRequest != null) {
            this.mCosDirect.cancel(uploadPartRequest);
        }
    }

    @Override // com.tencent.cos.xml.transfer.BaseUploadPartsTask
    public Set<COSUploadTask.UploadPart> upload() throws CosXmlClientException, CosXmlServiceException {
        this.mStartPointer = this.mOffset;
        this.mPartNumber = this.mStartNumber;
        while (true) {
            long j4 = this.mStartPointer;
            long j5 = this.mOffset;
            long j6 = this.mSize;
            if (j4 >= j5 + j6) {
                return this.uploadParts;
            }
            long min = Math.min(this.mMaxPartSize, (j5 + j6) - j4);
            UploadPartRequest uploadRequest = getUploadRequest(this.mPartNumber, this.mStartPointer, min);
            this.currentUploadPartRequest = uploadRequest;
            uploadRequest.setProgressListener(new CosXmlProgressListener() { // from class: com.tencent.cos.xml.transfer.SerialUploadPartsTask.1
                @Override // com.tencent.qcloud.core.common.QCloudProgressListener
                public void onProgress(long j7, long j10) {
                    SerialUploadPartsTask serialUploadPartsTask = SerialUploadPartsTask.this;
                    long j11 = serialUploadPartsTask.mStartPointer + j7;
                    SerialUploadPartsTask serialUploadPartsTask2 = SerialUploadPartsTask.this;
                    serialUploadPartsTask.notifyProgressChange(j11, serialUploadPartsTask2.mOffset + serialUploadPartsTask2.mSize);
                }
            });
            String str = this.mCosDirect.uploadPart(this.currentUploadPartRequest).eTag;
            COSTransferTask.loggerInfo(ProtectedSandApp.s("侵\u0001"), this.taskId, ProtectedSandApp.s("侶\u0001"), Integer.valueOf(this.mPartNumber), str);
            if (TextUtils.isEmpty(str)) {
                throw new CosXmlClientException(ClientErrorCode.ETAG_NOT_FOUND);
            }
            COSUploadTask.UploadPart uploadPart = new COSUploadTask.UploadPart(str, this.mPartNumber, this.mStartPointer, min);
            this.mStartPointer += min;
            this.mPartNumber++;
            this.uploadParts.add(uploadPart);
        }
    }

    @Override // com.tencent.cos.xml.transfer.BaseUploadPartsTask
    public void cancel(boolean z4) {
        UploadPartRequest uploadPartRequest = this.currentUploadPartRequest;
        if (uploadPartRequest != null) {
            this.mCosDirect.cancel(uploadPartRequest, z4);
        }
    }
}
