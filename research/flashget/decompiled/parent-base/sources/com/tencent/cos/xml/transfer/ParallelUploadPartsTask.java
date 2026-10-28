package com.tencent.cos.xml.transfer;

import android.text.TextUtils;
import android.util.SparseArray;
import bolts.h;
import bolts.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.crypto.COSDirect;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.listener.CosXmlProgressListener;
import com.tencent.cos.xml.listener.CosXmlResultListener;
import com.tencent.cos.xml.model.CosXmlRequest;
import com.tencent.cos.xml.model.CosXmlResult;
import com.tencent.cos.xml.model.object.PutObjectRequest;
import com.tencent.cos.xml.model.object.UploadPartRequest;
import com.tencent.cos.xml.model.object.UploadPartResult;
import com.tencent.cos.xml.transfer.COSUploadTask;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: UploadPartsTask.java */
/* loaded from: classes7.dex */
class ParallelUploadPartsTask extends BaseUploadPartsTask {
    private AtomicLong mTotalProgress;
    private final Set<UploadPartRequest> runningRequestSet;
    private i<Set<COSUploadTask.UploadPart>> tcs;
    private SparseArray<Long> uploadPartProgress;

    ParallelUploadPartsTask(COSDirect cOSDirect, PutObjectRequest putObjectRequest, long j4, long j5, int i4, String str) {
        super(cOSDirect, putObjectRequest, j4, j5, i4, str);
        this.runningRequestSet = Collections.synchronizedSet(new HashSet());
        this.tcs = new i<>();
        this.uploadPartProgress = new SparseArray<>();
        this.mTotalProgress = new AtomicLong(0L);
    }

    private int calculatePartNumber(long j4, long j5) {
        int i4 = (int) (j4 / j5);
        return j4 % j5 != 0 ? i4 + 1 : i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelAllUploadingRequests(boolean z4) {
        synchronized (this.runningRequestSet) {
            try {
                Iterator<UploadPartRequest> it = this.runningRequestSet.iterator();
                while (it.hasNext()) {
                    this.mCosDirect.cancel(it.next(), z4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void updateProgress(UploadPartRequest uploadPartRequest, long j4) {
        int partNumber = uploadPartRequest.getPartNumber();
        long longValue = j4 - this.uploadPartProgress.get(partNumber, 0L).longValue();
        this.uploadPartProgress.put(partNumber, Long.valueOf(j4));
        notifyProgressChange(this.mOffset + this.mTotalProgress.addAndGet(longValue), this.mOffset + this.mSize);
    }

    @Override // com.tencent.cos.xml.transfer.BaseUploadPartsTask
    public void cancel() {
        this.tcs.e();
        cancelAllUploadingRequests(false);
    }

    @Override // com.tencent.cos.xml.transfer.BaseUploadPartsTask
    public Set<COSUploadTask.UploadPart> upload() throws Exception {
        ParallelUploadPartsTask parallelUploadPartsTask = this;
        h<Set<COSUploadTask.UploadPart>> a5 = parallelUploadPartsTask.tcs.a();
        final int calculatePartNumber = parallelUploadPartsTask.calculatePartNumber(parallelUploadPartsTask.mSize, parallelUploadPartsTask.mMaxPartSize);
        AtomicInteger atomicInteger = new AtomicInteger(0);
        int i4 = 0;
        while (i4 < calculatePartNumber) {
            final int i5 = parallelUploadPartsTask.mStartNumber + i4;
            long j4 = parallelUploadPartsTask.mOffset;
            long j5 = parallelUploadPartsTask.mMaxPartSize;
            final long j6 = (i4 * j5) + j4;
            final long min = Math.min(j5, (j4 + parallelUploadPartsTask.mSize) - j6);
            final UploadPartRequest uploadRequest = getUploadRequest(i5, j6, min);
            uploadRequest.setProgressListener(new CosXmlProgressListener() { // from class: com.tencent.cos.xml.transfer.ParallelUploadPartsTask.1
                @Override // com.tencent.qcloud.core.common.QCloudProgressListener
                public void onProgress(long j7, long j10) {
                    ParallelUploadPartsTask.this.updateProgress(uploadRequest, j7);
                }
            });
            synchronized (parallelUploadPartsTask.runningRequestSet) {
                parallelUploadPartsTask.runningRequestSet.add(uploadRequest);
            }
            final AtomicInteger atomicInteger2 = atomicInteger;
            parallelUploadPartsTask.mCosDirect.uploadPartAsync(uploadRequest, new CosXmlResultListener() { // from class: com.tencent.cos.xml.transfer.ParallelUploadPartsTask.2
                @Override // com.tencent.cos.xml.listener.CosXmlResultListener
                public void onFail(CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException) {
                    if (cosXmlClientException != null) {
                        ParallelUploadPartsTask.this.tcs.f(cosXmlClientException);
                    } else if (cosXmlServiceException != null) {
                        ParallelUploadPartsTask.this.tcs.f(cosXmlServiceException);
                    } else {
                        ParallelUploadPartsTask.this.tcs.f(new CosXmlClientException(ClientErrorCode.UNKNOWN));
                    }
                    ParallelUploadPartsTask.this.cancelAllUploadingRequests(false);
                }

                @Override // com.tencent.cos.xml.listener.CosXmlResultListener
                public void onSuccess(CosXmlRequest cosXmlRequest, CosXmlResult cosXmlResult) {
                    synchronized (ParallelUploadPartsTask.this.runningRequestSet) {
                        ParallelUploadPartsTask.this.runningRequestSet.remove(uploadRequest);
                    }
                    UploadPartResult uploadPartResult = (UploadPartResult) cosXmlResult;
                    String str = uploadPartResult.eTag;
                    COSTransferTask.loggerInfo(ProtectedSandApp.s("侥\u0001"), ParallelUploadPartsTask.this.taskId, ProtectedSandApp.s("侦\u0001"), Integer.valueOf(i5), str);
                    if (TextUtils.isEmpty(str)) {
                        ParallelUploadPartsTask.this.tcs.f(new CosXmlClientException(ClientErrorCode.ETAG_NOT_FOUND));
                        ParallelUploadPartsTask.this.cancelAllUploadingRequests(false);
                    } else {
                        ParallelUploadPartsTask.this.uploadParts.add(new COSUploadTask.UploadPart(uploadPartResult.eTag, i5, j6, min));
                        if (atomicInteger2.addAndGet(1) >= calculatePartNumber) {
                            ParallelUploadPartsTask.this.tcs.g(ParallelUploadPartsTask.this.uploadParts);
                        }
                    }
                }
            });
            i4++;
            parallelUploadPartsTask = this;
            atomicInteger = atomicInteger;
        }
        a5.Y();
        if (a5.J()) {
            throw a5.E();
        }
        if (a5.H()) {
            throw new CosXmlClientException(ClientErrorCode.USER_CANCELLED);
        }
        return a5.F();
    }

    @Override // com.tencent.cos.xml.transfer.BaseUploadPartsTask
    public void cancel(boolean z4) {
        this.tcs.e();
        cancelAllUploadingRequests(z4);
    }
}
