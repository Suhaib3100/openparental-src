package com.tencent.cos.xml.transfer;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.q0;
import androidx.compose.material3.j4;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.CosTrackService;
import com.tencent.cos.xml.CosXmlSimpleService;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.listener.CosXmlProgressListener;
import com.tencent.cos.xml.listener.CosXmlResultListener;
import com.tencent.cos.xml.model.CosXmlRequest;
import com.tencent.cos.xml.model.CosXmlResult;
import com.tencent.cos.xml.model.object.GetObjectRequest;
import com.tencent.cos.xml.model.object.HeadObjectRequest;
import com.tencent.cos.xml.transfer.COSXMLTask;
import com.tencent.cos.xml.utils.COSUtils;
import com.tencent.cos.xml.utils.CRC64Calculator;
import com.tencent.cos.xml.utils.DigestUtils;
import com.tencent.cos.xml.utils.FileUtils;
import com.tencent.qcloud.core.common.QCloudTaskStateListener;
import com.tencent.qcloud.core.logger.COSLogger;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes7.dex */
public final class COSXMLDownloadTask extends COSXMLTask {
    private static final long CRC_CHECK_INTERVAL = 10485760;
    private static final int MAX_RETRY = 3;
    private static final String TAG = ProtectedSandApp.s("佗\u0001");
    private String clientTraceId;
    private boolean crc64CheckEnabled;
    private Map<Long, Long> crc64Map;
    private ExecutorService crcExecutor;
    private CountDownLatch crcLatch;
    private String eTag;
    private long fileOffset;
    private GetObjectRequest getObjectRequest;
    private long hasWriteDataLen;
    private HeadObjectRequest headObjectRequest;
    private long lastCrcCheckPosition;
    private String localSaveDirPath;
    private String localSaveFileName;
    private boolean objectKeySimplifyCheck;
    private long rangeEnd;
    private long rangeStart;
    private int retryCount;
    private String serverCrc64;
    private SharedPreferences sharedPreferences;
    private long startTime;

    public static class COSXMLDownloadTaskRequest extends GetObjectRequest {
        protected COSXMLDownloadTaskRequest(String str, String str2, String str3, String str4, String str5, Map<String, List<String>> map, Map<String, String> map2) {
            super(str2, str3, str4, str5);
            setRegion(str);
            setRequestHeaders(map);
            setQueryParameters(map2);
        }
    }

    public static class COSXMLDownloadTaskResult extends CosXmlResult {
        public String eTag;

        protected COSXMLDownloadTaskResult() {
        }
    }

    COSXMLDownloadTask(Context context, CosXmlSimpleService cosXmlSimpleService, String str, String str2, String str3, String str4, String str5) {
        this.crc64CheckEnabled = true;
        this.crc64Map = new ConcurrentHashMap();
        this.lastCrcCheckPosition = 0L;
        this.retryCount = 0;
        this.crcExecutor = Executors.newSingleThreadExecutor();
        this.crcLatch = new CountDownLatch(1);
        this.rangeStart = 0L;
        this.rangeEnd = -1L;
        this.fileOffset = 0L;
        this.objectKeySimplifyCheck = true;
        this.hasWriteDataLen = 0L;
        this.startTime = 0L;
        this.region = str;
        this.bucket = str2;
        this.cosPath = str3;
        this.localSaveDirPath = str4;
        this.localSaveFileName = str5;
        this.cosXmlService = cosXmlSimpleService;
        if (context != null) {
            this.sharedPreferences = context.getSharedPreferences(ProtectedSandApp.s("佛\u0001"), 0);
        }
        this.clientTraceId = UUID.randomUUID().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void calculateFileCrc(final long j4, final long j5, final boolean z4) {
        this.crcExecutor.execute(new Runnable() { // from class: com.tencent.cos.xml.transfer.f
            @Override // java.lang.Runnable
            public final void run() {
                COSXMLDownloadTask.this.lambda$calculateFileCrc$0(j4, j5, z4);
            }
        });
    }

    private void cancelAllRequest(boolean z4) {
        this.cosXmlService.cancel(this.headObjectRequest, z4);
        this.cosXmlService.cancel(this.getObjectRequest, z4);
    }

    private boolean checkParameter() {
        String s4 = ProtectedSandApp.s("作\u0001");
        if (!this.objectKeySimplifyCheck) {
            return true;
        }
        String str = this.cosPath;
        try {
            str = new File(s4 + this.cosPath).getCanonicalPath();
        } catch (IOException e4) {
            e4.printStackTrace();
        }
        if (!s4.equals(str)) {
            return true;
        }
        updateState(TransferState.FAILED, new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), ProtectedSandApp.s("佝\u0001")), null, false);
        return false;
    }

    private synchronized void clear() {
        SharedPreferences sharedPreferences = this.sharedPreferences;
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.remove(getKey());
            edit.remove(getKey() + ProtectedSandApp.s("佞\u0001"));
            edit.commit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long crc64MapLastKey() {
        long j4 = 0;
        for (Long l4 : this.crc64Map.keySet()) {
            if (l4.longValue() > j4) {
                j4 = l4.longValue();
            }
        }
        return j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deserializeCrcMap(String str) {
        this.crc64Map.clear();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        for (String str2 : str.split(ProtectedSandApp.s("佟\u0001"))) {
            String[] split = str2.split(ProtectedSandApp.s("你\u0001"));
            if (split.length == 2) {
                try {
                    this.crc64Map.put(Long.valueOf(Long.parseLong(split[0])), Long.valueOf(Long.parseLong(split[1])));
                } catch (NumberFormatException unused) {
                    COSLogger.wProcess(TAG, ProtectedSandApp.s("佡\u0001").concat(str2));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getDownloadPath() {
        String str = this.localSaveDirPath;
        if (str == null) {
            return null;
        }
        String s4 = ProtectedSandApp.s("作\u0001");
        String a5 = !str.endsWith(s4) ? android.support.v4.media.c.a(new StringBuilder(), this.localSaveDirPath, s4) : this.localSaveDirPath;
        File file = new File(a5);
        if (!file.exists()) {
            file.mkdirs();
        }
        if (this.localSaveFileName != null) {
            StringBuilder a6 = j4.a(a5);
            a6.append(this.localSaveFileName);
            return a6.toString();
        }
        String str2 = this.cosPath;
        if (str2 == null) {
            return a5;
        }
        int lastIndexOf = str2.lastIndexOf(s4);
        if (lastIndexOf >= 0) {
            StringBuilder a7 = j4.a(a5);
            a7.append(this.cosPath.substring(lastIndexOf + 1));
            return a7.toString();
        }
        StringBuilder a8 = j4.a(a5);
        a8.append(this.cosPath);
        return a8.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getKey() {
        StringBuffer stringBuffer = new StringBuffer(ProtectedSandApp.s("佢\u0001"));
        stringBuffer.append(this.region);
        String s4 = ProtectedSandApp.s("佣\u0001");
        stringBuffer.append(s4);
        stringBuffer.append(this.bucket);
        stringBuffer.append(s4);
        stringBuffer.append(this.cosPath);
        stringBuffer.append(s4);
        stringBuffer.append(this.rangeStart);
        stringBuffer.append(s4);
        stringBuffer.append(this.rangeEnd);
        stringBuffer.append(s4);
        stringBuffer.append(this.fileOffset);
        stringBuffer.append(s4);
        stringBuffer.append(this.localSaveDirPath);
        stringBuffer.append(s4);
        stringBuffer.append(this.localSaveFileName);
        stringBuffer.append(s4);
        stringBuffer.append(this.eTag);
        try {
            return DigestUtils.getSha1(stringBuffer.toString());
        } catch (CosXmlClientException unused) {
            return stringBuffer.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleCrcCheckFailure() {
        COSLogger.wProcess(TAG, ProtectedSandApp.s("佤\u0001") + this.retryCount);
        int i4 = this.retryCount;
        this.retryCount = i4 + 1;
        String s4 = ProtectedSandApp.s("佥\u0001");
        if (i4 >= 3) {
            updateState(TransferState.FAILED, new CosXmlClientException(ClientErrorCode.IO_ERROR.getCode(), s4), null, false);
            return;
        }
        this.crcExecutor.shutdownNow();
        if (!FileUtils.deleteFileIfExist(getDownloadPath())) {
            updateState(TransferState.FAILED, new CosXmlClientException(ClientErrorCode.IO_ERROR.getCode(), s4), null, false);
            return;
        }
        clear();
        this.crc64Map.clear();
        this.lastCrcCheckPosition = 0L;
        this.IS_EXIT.set(false);
        this.crcExecutor = Executors.newSingleThreadExecutor();
        this.crcLatch = new CountDownLatch(1);
        download();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized String hasExisted() {
        SharedPreferences sharedPreferences = this.sharedPreferences;
        if (sharedPreferences == null) {
            return null;
        }
        return sharedPreferences.getString(getKey(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$calculateFileCrc$0(long j4, long j5, boolean z4) {
        String s4 = ProtectedSandApp.s("佦\u0001");
        try {
            long crc64 = CRC64Calculator.getCRC64(new FileInputStream(new File(getDownloadPath())), j4, j5 - j4);
            this.crc64Map.put(Long.valueOf(j4), Long.valueOf(crc64));
            synchronized (this) {
                try {
                    SharedPreferences sharedPreferences = this.sharedPreferences;
                    if (sharedPreferences != null) {
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.putString(getKey() + ProtectedSandApp.s("佞\u0001"), serializeCrcMap());
                        edit.apply();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            COSLogger.dProcess(TAG, s4 + j4 + ProtectedSandApp.s("佧\u0001") + j5 + ProtectedSandApp.s("佨\u0001") + crc64);
            if (z4) {
                this.crcLatch.countDown();
            }
        } catch (IOException e4) {
            COSLogger.wProcess(TAG, ProtectedSandApp.s("佩\u0001") + e4.getMessage());
            handleCrcCheckFailure();
        }
    }

    private String mergeCrcValues() {
        Long[] lArr = (Long[]) this.crc64Map.keySet().toArray(new Long[0]);
        Arrays.sort(lArr);
        COSLogger.dProcess(TAG, ProtectedSandApp.s("佪\u0001") + Arrays.toString(lArr) + ProtectedSandApp.s("佫\u0001") + this.lastCrcCheckPosition);
        long longValue = new BigInteger(a.a(this.crc64Map.get(lArr[0]).longValue(), 10).trim()).longValue();
        int i4 = 1;
        while (i4 < lArr.length) {
            Long l4 = lArr[i4];
            longValue = CRC64Calculator.combine(longValue, new BigInteger(b.a(this.crc64Map.get(l4).longValue(), 10).trim()).longValue(), (i4 == lArr.length - 1 ? this.lastCrcCheckPosition : lArr[i4 + 1].longValue()) - l4.longValue());
            i4++;
        }
        return e.a(longValue, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void realDownload(long j4, long j5, long j6) {
        GetObjectRequest getObjectRequest = new GetObjectRequest(this.bucket, this.cosPath, this.localSaveDirPath, this.localSaveFileName);
        this.getObjectRequest = getObjectRequest;
        getObjectRequest.setRegion(this.region);
        this.getObjectRequest.setFileOffset(j6);
        this.getObjectRequest.setQueryParameters(this.queries);
        this.getObjectRequest.setRequestHeaders(this.headers);
        this.getObjectRequest.setObjectKeySimplifyCheck(this.objectKeySimplifyCheck);
        this.getObjectRequest.addNoSignHeader(this.noSignHeaders);
        this.getObjectRequest.setNetworkType(this.networkType);
        this.getObjectRequest.setHost(this.host);
        this.getObjectRequest.setCredentialProvider(this.credentialProvider);
        if (j5 > 0 || j4 > 0) {
            this.getObjectRequest.setRange(j4, j5);
        }
        COSXMLTask.OnSignatureListener onSignatureListener = this.onSignatureListener;
        if (onSignatureListener != null) {
            GetObjectRequest getObjectRequest2 = this.getObjectRequest;
            getObjectRequest2.setSign(onSignatureListener.onGetSign(getObjectRequest2));
        }
        getHttpMetrics(this.getObjectRequest, ProtectedSandApp.s("佬\u0001"));
        this.getObjectRequest.setProgressListener(new CosXmlProgressListener() { // from class: com.tencent.cos.xml.transfer.COSXMLDownloadTask.1
            @Override // com.tencent.qcloud.core.common.QCloudProgressListener
            public void onProgress(long j7, long j10) {
                long j11 = COSXMLDownloadTask.this.hasWriteDataLen + j7;
                if (COSXMLDownloadTask.this.crc64CheckEnabled && (j11 - COSXMLDownloadTask.this.lastCrcCheckPosition >= COSXMLDownloadTask.CRC_CHECK_INTERVAL || (j7 == j10 && j11 > COSXMLDownloadTask.this.lastCrcCheckPosition))) {
                    COSLogger.dProcess(COSXMLDownloadTask.TAG, ProtectedSandApp.s("佉\u0001") + COSXMLDownloadTask.this.lastCrcCheckPosition + ProtectedSandApp.s("佊\u0001") + j11);
                    long j12 = COSXMLDownloadTask.this.lastCrcCheckPosition;
                    COSXMLDownloadTask.this.lastCrcCheckPosition = j11;
                    COSXMLDownloadTask.this.calculateFileCrc(j12, j11, j7 == j10);
                }
                COSXMLDownloadTask cOSXMLDownloadTask = COSXMLDownloadTask.this;
                CosXmlProgressListener cosXmlProgressListener = cOSXMLDownloadTask.cosXmlProgressListener;
                if (cosXmlProgressListener != null) {
                    cosXmlProgressListener.onProgress(j11, cOSXMLDownloadTask.hasWriteDataLen + j10);
                }
            }
        });
        this.getObjectRequest.setClientTraceId(this.clientTraceId);
        this.cosXmlService.internalGetObjectAsync(this.getObjectRequest, new CosXmlResultListener() { // from class: com.tencent.cos.xml.transfer.COSXMLDownloadTask.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.tencent.cos.xml.listener.CosXmlResultListener
            public void onFail(CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException) {
                CosXmlClientException cosXmlClientException2;
                if (cosXmlRequest != COSXMLDownloadTask.this.getObjectRequest) {
                    return;
                }
                if (cosXmlClientException == null || COSXMLDownloadTask.this.taskState == TransferState.PAUSED || COSXMLDownloadTask.this.taskState == TransferState.CANCELED) {
                    cosXmlClientException = null;
                } else {
                    CosTrackService.getInstance().reportDownloadTaskClientException(cosXmlRequest, cosXmlClientException, COSXMLDownloadTask.this.getCosXmlServiceConfigTrackParams());
                }
                if (cosXmlServiceException == 0 || COSXMLDownloadTask.this.taskState == TransferState.PAUSED || COSXMLDownloadTask.this.taskState == TransferState.CANCELED) {
                    cosXmlClientException2 = cosXmlClientException;
                } else {
                    CosTrackService.getInstance().reportDownloadTaskServiceException(cosXmlRequest, cosXmlServiceException, COSXMLDownloadTask.this.getCosXmlServiceConfigTrackParams());
                    cosXmlClientException2 = cosXmlServiceException;
                }
                if (COSXMLDownloadTask.this.IS_EXIT.get()) {
                    return;
                }
                COSXMLDownloadTask.this.IS_EXIT.set(true);
                COSXMLDownloadTask.this.updateState(TransferState.FAILED, cosXmlClientException2, null, false);
            }

            @Override // com.tencent.cos.xml.listener.CosXmlResultListener
            public void onSuccess(CosXmlRequest cosXmlRequest, CosXmlResult cosXmlResult) {
                if (cosXmlRequest != COSXMLDownloadTask.this.getObjectRequest) {
                    return;
                }
                if (COSXMLDownloadTask.this.crc64CheckEnabled) {
                    COSXMLDownloadTask.this.serverCrc64 = cosXmlResult.getHeader(ProtectedSandApp.s("佋\u0001"));
                    COSLogger.dProcess(COSXMLDownloadTask.TAG, ProtectedSandApp.s("佌\u0001") + COSXMLDownloadTask.this.serverCrc64);
                }
                try {
                    COSXMLDownloadTask.this.crcLatch.await();
                    if (COSXMLDownloadTask.this.crc64CheckEnabled && !COSXMLDownloadTask.this.validateCrc64()) {
                        COSXMLDownloadTask.this.handleCrcCheckFailure();
                        return;
                    }
                    CosTrackService.getInstance().reportDownloadTaskSuccess(COSXMLDownloadTask.this.getObjectRequest, COSXMLDownloadTask.this.getCosXmlServiceConfigTrackParams());
                    if (COSXMLDownloadTask.this.IS_EXIT.get()) {
                        return;
                    }
                    COSXMLDownloadTask.this.IS_EXIT.set(true);
                    COSXMLDownloadTask.this.updateState(TransferState.COMPLETED, null, cosXmlResult, false);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    COSXMLDownloadTask.this.handleCrcCheckFailure();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void save(String str) {
        SharedPreferences sharedPreferences = this.sharedPreferences;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString(getKey(), str).commit();
        }
    }

    private String serializeCrcMap() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Long, Long> entry : this.crc64Map.entrySet()) {
            if (sb.length() > 0) {
                sb.append(ProtectedSandApp.s("佟\u0001"));
            }
            sb.append(entry.getKey());
            sb.append(ProtectedSandApp.s("你\u0001"));
            sb.append(entry.getValue());
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean validateCrc64() {
        String s4 = ProtectedSandApp.s("佭\u0001");
        try {
            String mergeCrcValues = mergeCrcValues();
            COSLogger.dProcess(TAG, s4 + mergeCrcValues);
            return mergeCrcValues.equals(this.serverCrc64);
        } catch (Exception e4) {
            COSLogger.wProcess(TAG, ProtectedSandApp.s("佮\u0001") + e4.getMessage());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean validatePartialCrc(File file, long j4) throws IOException {
        long j5 = 0;
        if (j4 <= 0) {
            return true;
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        while (j5 < j4) {
            try {
                long min = Math.min(CRC_CHECK_INTERVAL + j5, j4);
                long crc64 = CRC64Calculator.getCRC64(fileInputStream, j5, min - j5);
                Long l4 = this.crc64Map.get(Long.valueOf(j5));
                if (l4 == null || l4.longValue() != crc64) {
                    fileInputStream.close();
                    return false;
                }
                j5 = min;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        fileInputStream.close();
        return true;
    }

    @Override // com.tencent.cos.xml.transfer.COSXMLTask
    protected CosXmlRequest buildCOSXMLTaskRequest() {
        return new COSXMLDownloadTaskRequest(this.region, this.bucket, this.cosPath, this.localSaveDirPath, this.localSaveFileName, this.headers, this.queries);
    }

    @Override // com.tencent.cos.xml.transfer.COSXMLTask
    protected CosXmlResult buildCOSXMLTaskResult(CosXmlResult cosXmlResult) {
        COSXMLDownloadTaskResult cOSXMLDownloadTaskResult = new COSXMLDownloadTaskResult();
        if (cosXmlResult != null) {
            cOSXMLDownloadTaskResult.httpCode = cosXmlResult.httpCode;
            cOSXMLDownloadTaskResult.httpMessage = cosXmlResult.httpMessage;
            cOSXMLDownloadTaskResult.headers = cosXmlResult.headers;
            cOSXMLDownloadTaskResult.eTag = this.eTag;
            cOSXMLDownloadTaskResult.accessUrl = cosXmlResult.accessUrl;
        }
        return cOSXMLDownloadTaskResult;
    }

    protected void download() {
        if (checkParameter()) {
            this.startTime = System.nanoTime();
            this.clientTraceId = UUID.randomUUID().toString();
            run();
        }
    }

    @Override // com.tencent.cos.xml.transfer.COSXMLTask
    protected void encounterError(@q0 CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException) {
        if (this.IS_EXIT.get()) {
            return;
        }
        this.IS_EXIT.set(true);
        updateState(TransferState.FAILED, COSUtils.mergeException(cosXmlClientException, cosXmlServiceException), null, false);
    }

    @Override // com.tencent.cos.xml.transfer.COSXMLTask
    protected void internalCancel(boolean z4) {
        cancelAllRequest(z4);
        clear();
    }

    @Override // com.tencent.cos.xml.transfer.COSXMLTask
    protected void internalCompleted() {
        clear();
    }

    @Override // com.tencent.cos.xml.transfer.COSXMLTask
    protected void internalFailed() {
        cancelAllRequest(false);
    }

    @Override // com.tencent.cos.xml.transfer.COSXMLTask
    protected void internalPause(boolean z4) {
        if (this.getObjectRequest != null) {
            CosTrackService.getInstance().reportDownloadTaskSuccess(this.getObjectRequest, getCosXmlServiceConfigTrackParams());
        }
        cancelAllRequest(z4);
    }

    @Override // com.tencent.cos.xml.transfer.COSXMLTask
    protected void internalResume() {
        this.taskState = TransferState.WAITING;
        this.IS_EXIT.set(false);
        download();
    }

    protected void run() {
        HeadObjectRequest headObjectRequest = new HeadObjectRequest(this.bucket, this.cosPath);
        this.headObjectRequest = headObjectRequest;
        headObjectRequest.setRequestHeaders(this.headers);
        this.headObjectRequest.addNoSignHeader(this.noSignHeaders);
        this.headObjectRequest.setNetworkType(this.networkType);
        this.headObjectRequest.setHost(this.host);
        this.headObjectRequest.setCredentialProvider(this.credentialProvider);
        this.headObjectRequest.setQueryParameters(this.queries);
        this.headObjectRequest.setRegion(this.region);
        final String downloadPath = getDownloadPath();
        COSXMLTask.OnSignatureListener onSignatureListener = this.onSignatureListener;
        if (onSignatureListener != null) {
            HeadObjectRequest headObjectRequest2 = this.headObjectRequest;
            headObjectRequest2.setSign(onSignatureListener.onGetSign(headObjectRequest2));
        }
        getHttpMetrics(this.headObjectRequest, ProtectedSandApp.s("佯\u0001"));
        this.headObjectRequest.setTaskStateListener(new QCloudTaskStateListener() { // from class: com.tencent.cos.xml.transfer.COSXMLDownloadTask.3
            @Override // com.tencent.qcloud.core.common.QCloudTaskStateListener
            public void onStateChanged(String str, int i4) {
                if (COSXMLDownloadTask.this.IS_EXIT.get() || i4 == 1) {
                    return;
                }
                COSXMLDownloadTask.this.updateState(TransferState.IN_PROGRESS, null, null, false);
            }
        });
        this.headObjectRequest.setClientTraceId(this.clientTraceId);
        this.cosXmlService.headObjectAsync(this.headObjectRequest, new CosXmlResultListener() { // from class: com.tencent.cos.xml.transfer.COSXMLDownloadTask.4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.tencent.cos.xml.listener.CosXmlResultListener
            public void onFail(CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException) {
                if (cosXmlRequest == COSXMLDownloadTask.this.headObjectRequest && !COSXMLDownloadTask.this.IS_EXIT.get()) {
                    if (cosXmlClientException == null) {
                        cosXmlClientException = cosXmlServiceException;
                    }
                    cosXmlClientException.printStackTrace();
                    COSXMLDownloadTask.this.updateState(TransferState.FAILED, cosXmlClientException, null, false);
                    COSLogger.iProcess(COSXMLDownloadTask.TAG, ProtectedSandApp.s("位\u0001") + COSXMLDownloadTask.this.cosPath + ProtectedSandApp.s("低\u0001") + cosXmlClientException.getMessage(), cosXmlClientException);
                }
            }

            @Override // com.tencent.cos.xml.listener.CosXmlResultListener
            public void onSuccess(CosXmlRequest cosXmlRequest, CosXmlResult cosXmlResult) {
                if (cosXmlRequest == COSXMLDownloadTask.this.headObjectRequest && !COSXMLDownloadTask.this.IS_EXIT.get()) {
                    List<String> list = cosXmlResult.headers.get(ProtectedSandApp.s("住\u0001"));
                    if (list != null && list.size() > 0) {
                        COSXMLDownloadTask.this.eTag = list.get(0);
                    }
                    String hasExisted = COSXMLDownloadTask.this.hasExisted();
                    if (hasExisted != null) {
                        File file = new File(hasExisted);
                        if (file.exists()) {
                            String string = COSXMLDownloadTask.this.sharedPreferences.getString(COSXMLDownloadTask.this.getKey() + ProtectedSandApp.s("佐\u0001"), null);
                            COSXMLDownloadTask.this.crc64CheckEnabled = TextUtils.isEmpty(string) ^ true;
                            long length = file.length();
                            String s4 = ProtectedSandApp.s("佑\u0001");
                            if (string == null || !COSXMLDownloadTask.this.crc64CheckEnabled) {
                                List<String> list2 = cosXmlResult.headers.get(s4);
                                if (list2 == null || list2.size() <= 0 || Long.valueOf(list2.get(0)).longValue() != length) {
                                    COSXMLDownloadTask cOSXMLDownloadTask = COSXMLDownloadTask.this;
                                    cOSXMLDownloadTask.hasWriteDataLen = length - cOSXMLDownloadTask.fileOffset;
                                    COSXMLDownloadTask cOSXMLDownloadTask2 = COSXMLDownloadTask.this;
                                    cOSXMLDownloadTask2.realDownload(COSXMLDownloadTask.this.hasWriteDataLen + cOSXMLDownloadTask2.rangeStart, COSXMLDownloadTask.this.rangeEnd, COSXMLDownloadTask.this.hasWriteDataLen + COSXMLDownloadTask.this.fileOffset);
                                    return;
                                }
                                CosXmlProgressListener cosXmlProgressListener = COSXMLDownloadTask.this.cosXmlProgressListener;
                                if (cosXmlProgressListener != null) {
                                    cosXmlProgressListener.onProgress(length, length);
                                }
                                COSXMLDownloadTask.this.IS_EXIT.set(true);
                                COSXMLDownloadTask.this.updateState(TransferState.COMPLETED, null, cosXmlResult, false);
                                return;
                            }
                            COSXMLDownloadTask.this.deserializeCrcMap(string);
                            long crc64MapLastKey = COSXMLDownloadTask.this.crc64Map.isEmpty() ? 0L : COSXMLDownloadTask.this.crc64MapLastKey();
                            String s5 = ProtectedSandApp.s("佒\u0001");
                            String s6 = ProtectedSandApp.s("体\u0001");
                            if (length > crc64MapLastKey) {
                                COSLogger.dProcess(COSXMLDownloadTask.TAG, ProtectedSandApp.s("佔\u0001"));
                                if (!FileUtils.truncateFile(file, crc64MapLastKey)) {
                                    COSLogger.dProcess(COSXMLDownloadTask.TAG, ProtectedSandApp.s("何\u0001"));
                                    COSXMLDownloadTask.this.handleCrcCheckFailure();
                                    return;
                                }
                                try {
                                    if (!COSXMLDownloadTask.this.validatePartialCrc(file, crc64MapLastKey)) {
                                        COSLogger.dProcess(COSXMLDownloadTask.TAG, s6);
                                        COSXMLDownloadTask.this.handleCrcCheckFailure();
                                        return;
                                    }
                                } catch (IOException e4) {
                                    COSLogger.wProcess(COSXMLDownloadTask.TAG, s5 + e4.getMessage());
                                    COSXMLDownloadTask.this.handleCrcCheckFailure();
                                    return;
                                }
                            }
                            if (length < crc64MapLastKey) {
                                COSLogger.dProcess(COSXMLDownloadTask.TAG, ProtectedSandApp.s("佖\u0001"));
                                COSXMLDownloadTask.this.handleCrcCheckFailure();
                                return;
                            }
                            try {
                                if (!COSXMLDownloadTask.this.validatePartialCrc(file, crc64MapLastKey)) {
                                    COSLogger.dProcess(COSXMLDownloadTask.TAG, s6);
                                    COSXMLDownloadTask.this.handleCrcCheckFailure();
                                    return;
                                }
                                List<String> list3 = cosXmlResult.headers.get(s4);
                                if (list3 == null || list3.size() <= 0 || Long.valueOf(list3.get(0)).longValue() != length) {
                                    COSXMLDownloadTask cOSXMLDownloadTask3 = COSXMLDownloadTask.this;
                                    cOSXMLDownloadTask3.hasWriteDataLen = crc64MapLastKey - cOSXMLDownloadTask3.fileOffset;
                                    COSXMLDownloadTask cOSXMLDownloadTask4 = COSXMLDownloadTask.this;
                                    cOSXMLDownloadTask4.realDownload(cOSXMLDownloadTask4.rangeStart + COSXMLDownloadTask.this.hasWriteDataLen, COSXMLDownloadTask.this.rangeEnd, COSXMLDownloadTask.this.fileOffset + COSXMLDownloadTask.this.hasWriteDataLen);
                                    return;
                                }
                                CosXmlProgressListener cosXmlProgressListener2 = COSXMLDownloadTask.this.cosXmlProgressListener;
                                if (cosXmlProgressListener2 != null) {
                                    cosXmlProgressListener2.onProgress(length, length);
                                }
                                COSXMLDownloadTask.this.IS_EXIT.set(true);
                                COSXMLDownloadTask.this.updateState(TransferState.COMPLETED, null, cosXmlResult, false);
                                return;
                            } catch (IOException e5) {
                                COSLogger.wProcess(COSXMLDownloadTask.TAG, s5 + e5.getMessage());
                                COSXMLDownloadTask.this.handleCrcCheckFailure();
                                return;
                            }
                        }
                    }
                    FileUtils.deleteFileIfExist(downloadPath);
                    COSXMLDownloadTask cOSXMLDownloadTask5 = COSXMLDownloadTask.this;
                    cOSXMLDownloadTask5.save(cOSXMLDownloadTask5.getDownloadPath());
                    COSXMLDownloadTask.this.hasWriteDataLen = 0L;
                    COSXMLDownloadTask cOSXMLDownloadTask6 = COSXMLDownloadTask.this;
                    cOSXMLDownloadTask6.realDownload(cOSXMLDownloadTask6.rangeStart, COSXMLDownloadTask.this.rangeEnd, COSXMLDownloadTask.this.fileOffset);
                }
            }
        });
    }

    COSXMLDownloadTask(Context context, CosXmlSimpleService cosXmlSimpleService, GetObjectRequest getObjectRequest) {
        this(context, cosXmlSimpleService, getObjectRequest.getRegion(), getObjectRequest.getBucket(), getObjectRequest.getPath(cosXmlSimpleService.getConfig()), getObjectRequest.getSavePath(), getObjectRequest.getSaveFileName());
        this.queries = getObjectRequest.getQueryString();
        this.headers = getObjectRequest.getRequestHeaders();
        this.noSignHeaders = getObjectRequest.getNoSignHeaders();
        this.networkType = getObjectRequest.getNetworkType();
        this.host = getObjectRequest.getHost();
        this.credentialProvider = getObjectRequest.getCredentialProvider();
        this.objectKeySimplifyCheck = getObjectRequest.isObjectKeySimplifyCheck();
        this.isNeedMd5 = getObjectRequest.isNeedMD5();
        Map<String, List<String>> map = this.headers;
        if (map != null) {
            String s4 = ProtectedSandApp.s("佘\u0001");
            if (map.containsKey(s4)) {
                String str = this.headers.get(s4).get(0);
                int indexOf = str.indexOf(ProtectedSandApp.s("余\u0001"));
                int indexOf2 = str.indexOf(ProtectedSandApp.s("佚\u0001"));
                this.rangeStart = Long.valueOf(str.substring(indexOf + 1, indexOf2)).longValue();
                String substring = str.substring(indexOf2 + 1);
                if (!TextUtils.isEmpty(substring)) {
                    this.rangeEnd = Long.valueOf(substring).longValue();
                }
                this.crc64CheckEnabled = false;
            }
        }
        this.fileOffset = getObjectRequest.getFileOffset();
    }
}
