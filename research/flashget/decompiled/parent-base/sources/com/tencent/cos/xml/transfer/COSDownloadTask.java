package com.tencent.cos.xml.transfer;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.q0;
import androidx.compose.runtime.snapshots.f0;
import bolts.h;
import bolts.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.common.Range;
import com.tencent.cos.xml.crypto.COSDirect;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.listener.CosXmlProgressListener;
import com.tencent.cos.xml.model.CosXmlResult;
import com.tencent.cos.xml.model.object.GetObjectRequest;
import com.tencent.cos.xml.model.object.GetObjectResult;
import com.tencent.cos.xml.model.object.HeadObjectRequest;
import com.tencent.cos.xml.model.object.HeadObjectResult;
import com.tencent.cos.xml.transfer.COSTransferTask;
import com.tencent.cos.xml.utils.DigestUtils;
import com.tencent.cos.xml.utils.FileUtils;
import com.tencent.qcloud.core.http.HttpTaskMetrics;
import com.tencent.qcloud.core.util.ContextHolder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class COSDownloadTask extends COSTransferTask {
    private static final int DOWNLOAD_CONCURRENT = 3;
    private static final String TAG = ProtectedSandApp.s("休\u0001");
    public static final String TASK_UNKNOWN_STATUS = ProtectedSandApp.s("伒\u0001");
    private static ThreadPoolExecutor downloadTaskExecutor = new ThreadPoolExecutor(3, 3, 5, TimeUnit.SECONDS, new LinkedBlockingQueue(Integer.MAX_VALUE), new COSTransferTask.TaskThreadFactory(ProtectedSandApp.s("伓\u0001"), 8));
    private volatile GetObjectRequest mGetObjectRequest;
    private volatile long remoteEnd;
    private volatile long remoteStart;
    private SimpleDownloadTask simpleDownloadTask;

    private static class DownloadRecord {

        @q0
        String crc64ecma;
        String eTag;
        String lastModified;
        long remoteEnd;
        long remoteStart;

        public DownloadRecord(String str, String str2, String str3, long j4, long j5) {
            this.lastModified = str;
            this.eTag = str2;
            this.crc64ecma = str3;
            this.remoteStart = j4;
            this.remoteEnd = j5;
        }

        public static String flatJson(DownloadRecord downloadRecord) throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ProtectedSandApp.s("仨\u0001"), downloadRecord.lastModified);
            jSONObject.put(ProtectedSandApp.s("仩\u0001"), downloadRecord.eTag);
            jSONObject.put(ProtectedSandApp.s("仪\u0001"), downloadRecord.crc64ecma);
            jSONObject.put(ProtectedSandApp.s("仫\u0001"), downloadRecord.remoteStart);
            jSONObject.put(ProtectedSandApp.s("们\u0001"), downloadRecord.remoteEnd);
            return jSONObject.toString();
        }

        public static DownloadRecord toJson(String str) throws JSONException {
            JSONObject jSONObject = new JSONObject(str);
            return new DownloadRecord(jSONObject.getString(ProtectedSandApp.s("仨\u0001")), jSONObject.getString(ProtectedSandApp.s("仩\u0001")), jSONObject.optString(ProtectedSandApp.s("仪\u0001")), Long.parseLong(jSONObject.getString(ProtectedSandApp.s("仫\u0001"))), Long.parseLong(jSONObject.getString(ProtectedSandApp.s("们\u0001"))));
        }
    }

    private class SimpleDownloadTask implements Runnable {
        private String bucket;
        private COSDirect cosDirect;
        private String crc64ecma;
        private String eTag;
        private volatile GetObjectRequest getObjectRequest;
        private volatile HeadObjectRequest headObjectRequest;
        private String key;
        private String lastModified;
        private TransferTaskMetrics mTransferMetrics;
        private bolts.e mTransferTaskCts;
        private String region;
        private SharedPreferences sharedPreferences;
        private String taskId;
        private i<GetObjectResult> tcs = new i<>();

        public SimpleDownloadTask(COSDirect cOSDirect, GetObjectRequest getObjectRequest, bolts.e eVar) {
            this.cosDirect = cOSDirect;
            this.getObjectRequest = getObjectRequest;
            this.mTransferTaskCts = eVar;
        }

        private void checkCRC64(@q0 String str, File file, long j4, long j5) throws CosXmlClientException {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                long crc64 = DigestUtils.getCRC64(new FileInputStream(file), j4, j5);
                long bigIntFromString = DigestUtils.getBigIntFromString(str);
                if (crc64 != bigIntFromString) {
                    StringBuilder a5 = f0.a(ProtectedSandApp.s("仯\u0001"), crc64, ProtectedSandApp.s("仰\u0001"));
                    a5.append(bigIntFromString);
                    throw CosXmlClientException.internalException(a5.toString());
                }
                COSTransferTask.loggerInfo(ProtectedSandApp.s("仭\u0001"), this.taskId, ProtectedSandApp.s("仮\u0001"), Long.valueOf(j4), Long.valueOf(j5), str);
            } catch (FileNotFoundException e4) {
                throw CosXmlClientException.internalException(ProtectedSandApp.s("仱\u0001") + e4.getMessage());
            }
        }

        private void checkMd5(@q0 String str, File file) throws CosXmlClientException {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            String md5 = DigestUtils.getMD5(file.getAbsolutePath());
            String replaceAll = str.replaceAll(ProtectedSandApp.s("仲\u0001"), "");
            if (md5.equals(replaceAll)) {
                COSTransferTask.loggerInfo(ProtectedSandApp.s("仭\u0001"), this.taskId, ProtectedSandApp.s("仳\u0001"), replaceAll);
            } else {
                throw CosXmlClientException.internalException(ProtectedSandApp.s("仴\u0001") + md5 + ProtectedSandApp.s("仵\u0001") + replaceAll);
            }
        }

        private void checking() throws CosXmlClientException, CosXmlServiceException {
            Context appContext = ContextHolder.getAppContext();
            if (appContext == null) {
                throw CosXmlClientException.internalException(ProtectedSandApp.s("任\u0001"));
            }
            String s4 = ProtectedSandApp.s("仭\u0001");
            this.sharedPreferences = appContext.getSharedPreferences(s4, 0);
            this.headObjectRequest = new HeadObjectRequest(this.bucket, this.key);
            HttpTaskMetrics httpTaskMetrics = new HttpTaskMetrics();
            this.headObjectRequest.attachMetrics(httpTaskMetrics);
            this.headObjectRequest.setRegion(this.region);
            this.headObjectRequest.setRequestHeaders(getHeadHeaders(this.getObjectRequest));
            HeadObjectResult headObject = this.cosDirect.headObject(this.headObjectRequest);
            this.mTransferMetrics.connectAddress = httpTaskMetrics.getConnectAddress();
            this.lastModified = headObject.getHeader(ProtectedSandApp.s("件\u0001"));
            this.eTag = headObject.getHeader(ProtectedSandApp.s("价\u0001"));
            this.crc64ecma = headObject.getHeader(ProtectedSandApp.s("仸\u0001"));
            COSTransferTask.loggerInfo(s4, this.taskId, ProtectedSandApp.s("仹\u0001"), this.getObjectRequest.getDownloadPath());
            COSTransferTask.loggerInfo(s4, this.taskId, ProtectedSandApp.s("仺\u0001"), Long.valueOf(COSDownloadTask.this.remoteStart), Long.valueOf(COSDownloadTask.this.remoteEnd), this.crc64ecma);
        }

        private void checkoutManualCanceled() throws CosXmlClientException {
            if (this.mTransferTaskCts.h()) {
                throw CosXmlClientException.manualCancelException();
            }
        }

        private GetObjectResult download() throws CosXmlClientException, CosXmlServiceException {
            String s4 = ProtectedSandApp.s("仭\u0001");
            try {
                this.sharedPreferences.edit().putString(this.key, DownloadRecord.flatJson(new DownloadRecord(this.lastModified, this.eTag, this.crc64ecma, COSDownloadTask.this.remoteStart, COSDownloadTask.this.remoteEnd))).apply();
            } catch (JSONException e4) {
                COSTransferTask.loggerWarn(s4, this.taskId, ProtectedSandApp.s("仼\u0001"), e4.getMessage());
            }
            Range range = this.getObjectRequest.getRange();
            COSTransferTask.loggerInfo(s4, this.taskId, ProtectedSandApp.s("份\u0001"), Long.valueOf(range != null ? range.getStart() : 0L), Long.valueOf(range != null ? range.getEnd() : -1L), Long.valueOf(this.getObjectRequest.getFileOffset()));
            GetObjectResult object = this.cosDirect.getObject(this.getObjectRequest);
            this.sharedPreferences.edit().remove(this.key).apply();
            COSTransferTask.loggerInfo(s4, this.taskId, ProtectedSandApp.s("仾\u0001"), new Object[0]);
            return object;
        }

        private Map<String, List<String>> getHeadHeaders(GetObjectRequest getObjectRequest) {
            Map<String, List<String>> requestHeaders = getObjectRequest.getRequestHeaders();
            return requestHeaders == null ? new HashMap() : new HashMap(requestHeaders);
        }

        @q0
        private boolean hasDownloadPart() throws CosXmlClientException {
            String string = this.sharedPreferences.getString(this.key, "");
            boolean isEmpty = TextUtils.isEmpty(string);
            String s4 = ProtectedSandApp.s("仭\u0001");
            if (isEmpty) {
                COSTransferTask.loggerInfo(s4, this.taskId, ProtectedSandApp.s("仿\u0001"), new Object[0]);
                return false;
            }
            COSTransferTask.loggerInfo(s4, this.taskId, ProtectedSandApp.s("伀\u0001"), string);
            try {
                DownloadRecord json = DownloadRecord.toJson(string);
                String str = json.lastModified;
                if (str != null) {
                    if (str.equals(this.lastModified)) {
                        String str2 = json.eTag;
                        if (str2 != null) {
                            if (str2.equals(this.eTag)) {
                                String str3 = json.crc64ecma;
                                if (str3 != null) {
                                    String str4 = this.crc64ecma;
                                    if (str4 != null) {
                                        if (str3.equals(str4)) {
                                        }
                                    }
                                }
                                if (json.remoteStart == COSDownloadTask.this.remoteStart && json.remoteEnd == COSDownloadTask.this.remoteEnd) {
                                    return true;
                                }
                            }
                        }
                    }
                }
                COSTransferTask.loggerWarn(s4, this.taskId, ProtectedSandApp.s("企\u0001"), this.lastModified, this.eTag, this.crc64ecma, Long.valueOf(COSDownloadTask.this.remoteStart), Long.valueOf(COSDownloadTask.this.remoteEnd));
                return false;
            } catch (JSONException e4) {
                COSTransferTask.loggerInfo(s4, this.taskId, ProtectedSandApp.s("伂\u0001"), e4.getMessage());
                return false;
            }
        }

        private boolean isRangeDownload() {
            return (COSDownloadTask.this.remoteStart == 0 && COSDownloadTask.this.remoteEnd == -1) ? false : true;
        }

        private void prepareDownloadContext(boolean z4) {
            File file = new File(this.getObjectRequest.getDownloadPath());
            if (!z4) {
                FileUtils.deleteFileIfExist(file.getAbsolutePath());
                return;
            }
            long length = file.length();
            this.getObjectRequest.setFileOffset(length);
            this.getObjectRequest.setRange(COSDownloadTask.this.remoteStart + length, COSDownloadTask.this.remoteEnd);
            COSTransferTask.loggerInfo(ProtectedSandApp.s("仭\u0001"), this.taskId, ProtectedSandApp.s("伃\u0001"), Long.valueOf(length));
        }

        private void verifyContent(GetObjectResult getObjectResult) throws CosXmlClientException {
            String header = getObjectResult.getHeader(ProtectedSandApp.s("仸\u0001"));
            String header2 = getObjectResult.getHeader(ProtectedSandApp.s("伄\u0001"));
            File file = new File(this.getObjectRequest.getDownloadPath());
            this.mTransferMetrics.size = file.length() - this.getObjectRequest.getFileOffset();
            if (isRangeDownload()) {
                checkCRC64(header, file, this.getObjectRequest.getFileOffset(), file.length() - this.getObjectRequest.getFileOffset());
            } else if (this.cosDirect.isTransferSecurely()) {
                checkMd5(header2, file);
            } else {
                checkCRC64(header, file, 0L, -1L);
            }
        }

        public void cancel(boolean z4) {
            if (this.headObjectRequest != null) {
                this.cosDirect.cancel(this.headObjectRequest, z4);
            }
            if (this.getObjectRequest != null) {
                this.cosDirect.cancel(this.getObjectRequest, z4);
            }
        }

        public h<GetObjectResult> getTask() {
            return this.tcs.a();
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                checkoutManualCanceled();
                checking();
                checkoutManualCanceled();
                boolean hasDownloadPart = hasDownloadPart();
                checkoutManualCanceled();
                prepareDownloadContext(hasDownloadPart && !this.cosDirect.isTransferSecurely());
                checkoutManualCanceled();
                GetObjectResult download = download();
                checkoutManualCanceled();
                try {
                    verifyContent(download);
                    this.tcs.d(download);
                } catch (CosXmlClientException e4) {
                    FileUtils.deleteFileIfExist(this.getObjectRequest.getDownloadPath());
                    throw e4;
                }
            } catch (Exception e5) {
                this.tcs.c(e5);
            }
        }

        public void setTaskId(String str) {
            this.taskId = str;
        }
    }

    public COSDownloadTask(COSDirect cOSDirect, GetObjectRequest getObjectRequest) {
        super(cOSDirect, getObjectRequest);
        this.remoteStart = 0L;
        this.remoteEnd = -1L;
        this.mGetObjectRequest = getObjectRequest;
        Range range = getObjectRequest.getRange();
        if (range != null) {
            this.remoteStart = range.getStart();
            this.remoteEnd = range.getEnd();
        }
    }

    private GetObjectResult simpleDownload() throws Exception {
        SimpleDownloadTask simpleDownloadTask = new SimpleDownloadTask(this.cosDirect, this.mGetObjectRequest, this.mTransferTaskCts);
        this.simpleDownloadTask = simpleDownloadTask;
        simpleDownloadTask.bucket = this.bucket;
        this.simpleDownloadTask.key = this.key;
        this.simpleDownloadTask.region = this.region;
        this.simpleDownloadTask.setTaskId(this.taskId);
        this.simpleDownloadTask.mTransferMetrics = this.transferTaskMetrics;
        this.mGetObjectRequest.setProgressListener(new CosXmlProgressListener() { // from class: com.tencent.cos.xml.transfer.COSDownloadTask.1
            @Override // com.tencent.qcloud.core.common.QCloudProgressListener
            public void onProgress(long j4, long j5) {
                long fileOffset = COSDownloadTask.this.mGetObjectRequest.getFileOffset();
                COSDownloadTask.this.onTransferProgressChange(j4 + fileOffset, j5 + fileOffset);
            }
        });
        this.simpleDownloadTask.run();
        h<GetObjectResult> task = this.simpleDownloadTask.getTask();
        if (task.J()) {
            throw task.E();
        }
        if (task.I()) {
            return task.F();
        }
        String s4 = ProtectedSandApp.s("休\u0001");
        String s5 = ProtectedSandApp.s("伒\u0001");
        COSTransferTask.loggerInfo(s4, this.taskId, s5, new Object[0]);
        throw new CosXmlClientException(ClientErrorCode.INTERNAL_ERROR.getCode(), s5);
    }

    @Override // com.tencent.cos.xml.transfer.COSTransferTask
    public void cancel() {
        super.cancel();
        SimpleDownloadTask simpleDownloadTask = this.simpleDownloadTask;
        if (simpleDownloadTask != null) {
            simpleDownloadTask.cancel(false);
        }
        FileUtils.deleteFileIfExist(this.mGetObjectRequest.getDownloadPath());
    }

    @Override // com.tencent.cos.xml.transfer.COSTransferTask
    protected void checking() throws CosXmlClientException {
        super.checking();
    }

    @Override // com.tencent.cos.xml.transfer.COSTransferTask
    protected CosXmlResult execute() throws Exception {
        return simpleDownload();
    }

    @Override // com.tencent.cos.xml.transfer.COSTransferTask
    protected Executor executor() {
        return downloadTaskExecutor;
    }

    @Override // com.tencent.cos.xml.transfer.COSTransferTask
    public void pause() {
        super.pause();
        SimpleDownloadTask simpleDownloadTask = this.simpleDownloadTask;
        if (simpleDownloadTask != null) {
            simpleDownloadTask.cancel(false);
        }
    }

    @Override // com.tencent.cos.xml.transfer.COSTransferTask
    protected String tag() {
        return ProtectedSandApp.s("休\u0001");
    }

    @Override // com.tencent.cos.xml.transfer.COSTransferTask
    public void pause(boolean z4) {
        super.pause();
        SimpleDownloadTask simpleDownloadTask = this.simpleDownloadTask;
        if (simpleDownloadTask != null) {
            simpleDownloadTask.cancel(z4);
        }
    }

    @Override // com.tencent.cos.xml.transfer.COSTransferTask
    public void cancel(boolean z4) {
        super.cancel();
        SimpleDownloadTask simpleDownloadTask = this.simpleDownloadTask;
        if (simpleDownloadTask != null) {
            simpleDownloadTask.cancel(z4);
        }
        FileUtils.deleteFileIfExist(this.mGetObjectRequest.getDownloadPath());
    }
}
