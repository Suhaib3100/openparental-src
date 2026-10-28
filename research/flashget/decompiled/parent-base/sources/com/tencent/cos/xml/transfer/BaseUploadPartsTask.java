package com.tencent.cos.xml.transfer;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.crypto.COSDirect;
import com.tencent.cos.xml.listener.CosXmlProgressListener;
import com.tencent.cos.xml.model.object.PutObjectRequest;
import com.tencent.cos.xml.transfer.COSUploadTask;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: UploadPartsTask.java */
/* loaded from: classes7.dex */
abstract class BaseUploadPartsTask {
    protected COSDirect mCosDirect;
    protected long mOffset;
    protected PutObjectRequest mPutObjectRequest;
    protected long mSize;
    protected int mStartNumber;
    protected String mUploadId;
    private CosXmlProgressListener progressListener;
    protected String taskId;
    protected Set<COSUploadTask.UploadPart> uploadParts = Collections.synchronizedSet(new HashSet());
    protected long mMaxPartSize = 1048576;
    protected final String TAG = ProtectedSandApp.s("以\u0001");

    BaseUploadPartsTask(COSDirect cOSDirect, PutObjectRequest putObjectRequest, long j4, long j5, int i4, String str) {
        this.mCosDirect = cOSDirect;
        this.mPutObjectRequest = putObjectRequest;
        this.mOffset = j4;
        this.mSize = j5;
        this.mStartNumber = i4;
        this.mUploadId = str;
    }

    private Map<String, List<String>> getUploadPartHeaders(PutObjectRequest putObjectRequest) {
        Map<String, List<String>> requestHeaders = putObjectRequest.getRequestHeaders();
        if (requestHeaders == null) {
            return new HashMap();
        }
        HashMap hashMap = new HashMap();
        for (String str : requestHeaders.keySet()) {
            if (str.startsWith(ProtectedSandApp.s("仦\u0001")) || str.equals(ProtectedSandApp.s("仧\u0001"))) {
                hashMap.put(str, requestHeaders.get(str));
            }
        }
        return hashMap;
    }

    public abstract void cancel();

    public abstract void cancel(boolean z4);

    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    com.tencent.cos.xml.model.object.UploadPartRequest getUploadRequest(int r14, long r15, long r17) {
        /*
            r13 = this;
            r0 = r13
            long r1 = r0.mOffset
            long r3 = r0.mSize
            long r1 = r1 + r3
            int r1 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            r2 = 0
            if (r1 < 0) goto Lc
            return r2
        Lc:
            com.tencent.cos.xml.model.object.PutObjectRequest r1 = r0.mPutObjectRequest
            java.lang.String r5 = r1.getSrcPath()
            com.tencent.cos.xml.model.object.PutObjectRequest r1 = r0.mPutObjectRequest
            android.net.Uri r6 = r1.getUri()
            com.tencent.cos.xml.model.object.PutObjectRequest r1 = r0.mPutObjectRequest
            java.lang.String r3 = r1.getBucket()
            com.tencent.cos.xml.model.object.PutObjectRequest r1 = r0.mPutObjectRequest
            java.lang.String r4 = r1.getCosPath()
            com.tencent.cos.xml.model.object.PutObjectRequest r1 = r0.mPutObjectRequest
            java.lang.String r11 = r1.getRegion()
            if (r5 == 0) goto L3c
            com.tencent.cos.xml.model.object.UploadPartRequest r12 = new com.tencent.cos.xml.model.object.UploadPartRequest
            java.lang.String r10 = r0.mUploadId
            r1 = r12
            r2 = r3
            r3 = r4
            r4 = r14
            r6 = r15
            r8 = r17
            r1.<init>(r2, r3, r4, r5, r6, r8, r10)
        L3a:
            r2 = r12
            goto L4e
        L3c:
            if (r6 == 0) goto L4e
            com.tencent.cos.xml.model.object.UploadPartRequest r12 = new com.tencent.cos.xml.model.object.UploadPartRequest
            java.lang.String r10 = r0.mUploadId
            r1 = r12
            r2 = r3
            r3 = r4
            r4 = r14
            r5 = r6
            r6 = r15
            r8 = r17
            r1.<init>(r2, r3, r4, r5, r6, r8, r10)
            goto L3a
        L4e:
            if (r2 == 0) goto L73
            boolean r1 = android.text.TextUtils.isEmpty(r11)
            if (r1 != 0) goto L59
            r2.setRegion(r11)
        L59:
            com.tencent.cos.xml.model.object.PutObjectRequest r1 = r0.mPutObjectRequest
            java.util.Map r1 = r13.getUploadPartHeaders(r1)
            r2.setRequestHeaders(r1)
            long r3 = r15 + r17
            long r5 = r0.mOffset
            long r7 = r0.mSize
            long r5 = r5 + r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L6f
            r1 = 1
            goto L70
        L6f:
            r1 = 0
        L70:
            r2.setLastPart(r1)
        L73:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.cos.xml.transfer.BaseUploadPartsTask.getUploadRequest(int, long, long):com.tencent.cos.xml.model.object.UploadPartRequest");
    }

    void notifyProgressChange(long j4, long j5) {
        CosXmlProgressListener cosXmlProgressListener = this.progressListener;
        if (cosXmlProgressListener != null) {
            cosXmlProgressListener.onProgress(j4, j5);
        }
    }

    public void setProgressListener(CosXmlProgressListener cosXmlProgressListener) {
        this.progressListener = cosXmlProgressListener;
    }

    public void setTaskId(String str) {
        this.taskId = str;
    }

    public abstract Set<COSUploadTask.UploadPart> upload() throws Exception;
}
