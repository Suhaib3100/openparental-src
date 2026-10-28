package com.tencent.cos.xml.transfer;

import android.text.TextUtils;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.CosTrackService;
import com.tencent.cos.xml.CosXmlServiceConfig;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.crypto.COSDirect;
import com.tencent.cos.xml.crypto.CryptoModuleBase;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.listener.CosXmlProgressListener;
import com.tencent.cos.xml.listener.CosXmlResultListener;
import com.tencent.cos.xml.model.CosXmlRequest;
import com.tencent.cos.xml.model.CosXmlResult;
import com.tencent.cos.xml.model.object.ObjectRequest;
import com.tencent.qcloud.core.logger.COSLogger;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public abstract class COSTransferTask {
    private final String TAG;
    protected String bucket;
    protected CosXmlClientException clientException;
    protected COSDirect cosDirect;
    protected CosXmlProgressListener cosXmlProgressListener;
    protected CosXmlRequest cosXmlRequest;
    protected CosXmlResult cosXmlResult;
    protected CosXmlResultListener cosXmlResultListener;
    protected CosXmlServiceConfig cosXmlServiceConfig;
    protected CryptoModuleBase cryptoModuleBase;
    protected String key;
    protected volatile bolts.e mTransferTaskCts;
    protected String region;
    protected CosXmlServiceException serviceException;
    protected TransferStateListener transferStateListener;
    protected volatile TransferTaskMetrics transferTaskMetrics;
    volatile TransferState taskState = TransferState.WAITING;
    protected volatile boolean manualPause = false;
    protected volatile boolean manualCancel = false;
    protected volatile String taskId = UUID.randomUUID().toString();

    protected static final class TaskThreadFactory implements ThreadFactory {
        private final AtomicInteger increment = new AtomicInteger(1);
        private final int priority;
        private final String tag;

        TaskThreadFactory(String str, int i4) {
            this.tag = str;
            this.priority = i4;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(@o0 Runnable runnable) {
            Thread thread = new Thread(runnable, this.tag + this.increment.getAndIncrement());
            thread.setDaemon(false);
            thread.setPriority(this.priority);
            return thread;
        }
    }

    private class TransferRunnable implements Runnable {
        private TransferRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                COSTransferTask.this.onTransferInProgress();
                COSTransferTask.this.checking();
                COSTransferTask cOSTransferTask = COSTransferTask.this;
                cOSTransferTask.cosXmlResult = cOSTransferTask.execute();
                COSTransferTask cOSTransferTask2 = COSTransferTask.this;
                cOSTransferTask2.onTransferSuccess(cOSTransferTask2.cosXmlRequest, cOSTransferTask2.cosXmlResult);
            } catch (CosXmlClientException e4) {
                if (COSTransferTask.this.isManualPaused() || COSTransferTask.this.isManualCanceled() || ProtectedSandApp.s("伔\u0001").equals(e4.getMessage())) {
                    return;
                }
                COSTransferTask cOSTransferTask3 = COSTransferTask.this;
                cOSTransferTask3.onTransferFailed(cOSTransferTask3.cosXmlRequest, e4, null);
            } catch (CosXmlServiceException e5) {
                if (COSTransferTask.this.isManualPaused() || COSTransferTask.this.isManualCanceled()) {
                    return;
                }
                COSTransferTask cOSTransferTask4 = COSTransferTask.this;
                cOSTransferTask4.onTransferFailed(cOSTransferTask4.cosXmlRequest, null, e5);
            } catch (Exception e6) {
                if (COSTransferTask.this.isManualPaused() || COSTransferTask.this.isManualCanceled()) {
                    return;
                }
                COSTransferTask cOSTransferTask5 = COSTransferTask.this;
                cOSTransferTask5.onTransferFailed(cOSTransferTask5.cosXmlRequest, new CosXmlClientException(ClientErrorCode.UNKNOWN.getCode(), e6.getMessage()), null);
            }
        }
    }

    COSTransferTask(COSDirect cOSDirect, ObjectRequest objectRequest) {
        this.cosXmlServiceConfig = cOSDirect.getCosService().getConfig();
        this.cosXmlRequest = objectRequest;
        this.cosDirect = cOSDirect;
        this.bucket = objectRequest.getBucket();
        String region = objectRequest.getRegion();
        this.region = region;
        if (TextUtils.isEmpty(region)) {
            String region2 = this.cosXmlServiceConfig.getRegion();
            this.region = region2;
            objectRequest.setRegion(region2);
        }
        this.key = objectRequest.getCosPath();
        String tag = tag();
        this.TAG = tag;
        if (cOSDirect.isTransferSecurely()) {
            loggerInfo(tag, this.taskId, ProtectedSandApp.s("伅\u0001"), new Object[0]);
        }
        loggerInfo(tag, this.taskId, ProtectedSandApp.s("伆\u0001"), objectRequest.getClass().getSimpleName(), this.region, this.bucket, this.key);
    }

    private static Object[] compose(String str, Object... objArr) {
        Object[] objArr2 = new Object[objArr.length + 1];
        objArr2[0] = str;
        System.arraycopy(objArr, 0, objArr2, 1, objArr.length);
        return objArr2;
    }

    protected static void loggerInfo(String str, String str2, String str3, Object... objArr) {
        COSLogger.iProcess(str, androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("伇\u0001"), str3), compose(str2, objArr));
    }

    protected static void loggerWarn(String str, String str2, String str3, Object... objArr) {
        COSLogger.wProcess(str, androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("伇\u0001"), str3), compose(str2, objArr));
    }

    private void notifyTransferProgressChange(long j4, long j5) {
        if (this.cosXmlProgressListener == null || this.taskState != TransferState.IN_PROGRESS) {
            return;
        }
        this.cosXmlProgressListener.onProgress(j4, j5);
    }

    private void notifyTransferResultFailed(CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException) {
        if (cosXmlServiceException != null && TextUtils.isEmpty(cosXmlServiceException.getErrorCode())) {
            cosXmlServiceException.setErrorCode(cosXmlServiceException.getHttpMessage());
        }
        CosXmlResultListener cosXmlResultListener = this.cosXmlResultListener;
        if (cosXmlResultListener != null) {
            cosXmlResultListener.onFail(cosXmlRequest, cosXmlClientException, cosXmlServiceException);
        }
    }

    private void notifyTransferResultSuccess(CosXmlRequest cosXmlRequest, CosXmlResult cosXmlResult) {
        CosXmlResultListener cosXmlResultListener = this.cosXmlResultListener;
        if (cosXmlResultListener != null) {
            cosXmlResultListener.onSuccess(cosXmlRequest, cosXmlResult);
        }
    }

    private void notifyTransferStateChange() {
        TransferStateListener transferStateListener = this.transferStateListener;
        if (transferStateListener != null) {
            transferStateListener.onStateChanged(this.taskState);
        }
    }

    public void cancel() {
        loggerInfo(this.TAG, this.taskId, ProtectedSandApp.s("伈\u0001"), new Object[0]);
        this.manualCancel = true;
        onTransferFailed(this.cosXmlRequest, CosXmlClientException.manualCancelException(), null);
        if (this.mTransferTaskCts != null) {
            this.mTransferTaskCts.c();
        }
    }

    protected void checking() throws CosXmlClientException {
        if (TextUtils.isEmpty(this.bucket)) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), ProtectedSandApp.s("伊\u0001"));
        }
        if (TextUtils.isEmpty(this.region)) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), ProtectedSandApp.s("伉\u0001"));
        }
    }

    protected abstract CosXmlResult execute() throws Exception;

    protected abstract Executor executor();

    public CosXmlClientException getClientException() {
        return this.clientException;
    }

    public CosXmlServiceException getServiceException() {
        return this.serviceException;
    }

    public TransferState getTaskState() {
        return this.taskState;
    }

    public TransferTaskMetrics getTransferTaskMetrics() {
        return this.transferTaskMetrics;
    }

    protected boolean isManualCanceled() {
        return this.manualCancel;
    }

    protected boolean isManualPaused() {
        return this.manualPause;
    }

    protected void onTransferFailed(CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException) {
        if (cosXmlClientException != null) {
            loggerInfo(this.TAG, this.taskId, ProtectedSandApp.s("伋\u0001"), Integer.valueOf(cosXmlClientException.errorCode), cosXmlClientException.getMessage());
        } else if (cosXmlServiceException != null) {
            loggerInfo(this.TAG, this.taskId, ProtectedSandApp.s("伌\u0001"), cosXmlServiceException.getErrorCode(), cosXmlServiceException.getErrorMessage());
        }
        this.clientException = cosXmlClientException;
        this.serviceException = cosXmlServiceException;
        this.transferTaskMetrics.onComplete();
        this.taskState = TransferState.FAILED;
        notifyTransferStateChange();
        notifyTransferResultFailed(cosXmlRequest, cosXmlClientException, cosXmlServiceException);
        if (cosXmlClientException != null) {
            CosTrackService.getInstance().reportTransferClientException(cosXmlRequest, this.transferTaskMetrics, cosXmlClientException, this.cosDirect.isTransferSecurely());
        } else if (cosXmlServiceException != null) {
            CosTrackService.getInstance().reportTransferServiceException(cosXmlRequest, this.transferTaskMetrics, cosXmlServiceException, this.cosDirect.isTransferSecurely());
        }
    }

    protected void onTransferInProgress() {
        this.taskState = TransferState.IN_PROGRESS;
        this.transferTaskMetrics.onInProgress();
        notifyTransferStateChange();
    }

    protected void onTransferPaused() {
        this.taskState = TransferState.PAUSED;
        this.transferTaskMetrics.onComplete();
        notifyTransferStateChange();
    }

    protected synchronized void onTransferProgressChange(long j4, long j5) {
        this.transferTaskMetrics.onFirstProgressCallback();
        notifyTransferProgressChange(j4, j5);
    }

    protected void onTransferSuccess(CosXmlRequest cosXmlRequest, CosXmlResult cosXmlResult) {
        this.cosXmlResult = cosXmlResult;
        this.taskState = TransferState.COMPLETED;
        this.transferTaskMetrics.onComplete();
        notifyTransferStateChange();
        notifyTransferResultSuccess(cosXmlRequest, cosXmlResult);
        CosTrackService.getInstance().reportTransferSuccess(cosXmlRequest, this.transferTaskMetrics, this.cosDirect.isTransferSecurely());
    }

    protected void onTransferWaiting() {
        this.taskState = TransferState.WAITING;
        this.transferTaskMetrics.onStart();
        notifyTransferStateChange();
    }

    public void pause() {
        if (this.taskState != TransferState.IN_PROGRESS && this.taskState != TransferState.WAITING) {
            loggerInfo(this.TAG, this.taskId, ProtectedSandApp.s("伍\u0001"), this.taskState);
            return;
        }
        loggerInfo(this.TAG, this.taskId, ProtectedSandApp.s("伎\u0001"), new Object[0]);
        this.manualPause = true;
        onTransferPaused();
        if (this.mTransferTaskCts != null) {
            this.mTransferTaskCts.c();
        }
    }

    public void resume() {
        if (this.taskState != TransferState.PAUSED) {
            loggerInfo(this.TAG, this.taskId, ProtectedSandApp.s("伏\u0001"), this.taskState);
            return;
        }
        loggerInfo(this.TAG, this.taskId, ProtectedSandApp.s("伐\u0001"), this.taskState);
        start();
    }

    public void setCosXmlProgressListener(CosXmlProgressListener cosXmlProgressListener) {
        this.cosXmlProgressListener = cosXmlProgressListener;
    }

    public void setCosXmlResultListener(CosXmlResultListener cosXmlResultListener) {
        this.cosXmlResultListener = cosXmlResultListener;
        if (this.taskState == TransferState.COMPLETED) {
            notifyTransferResultSuccess(this.cosXmlRequest, this.cosXmlResult);
        } else if (this.taskState == TransferState.FAILED) {
            notifyTransferResultFailed(this.cosXmlRequest, this.clientException, this.serviceException);
        }
    }

    public void setTransferStateListener(TransferStateListener transferStateListener) {
        this.transferStateListener = transferStateListener;
        notifyTransferStateChange();
    }

    protected void start() {
        this.manualPause = false;
        this.manualCancel = false;
        this.transferTaskMetrics = new TransferTaskMetrics();
        this.transferTaskMetrics.domain = this.cosXmlRequest.getRequestHost(this.cosXmlServiceConfig);
        onTransferWaiting();
        this.mTransferTaskCts = new bolts.e();
        executor().execute(new TransferRunnable());
    }

    protected abstract String tag();

    public void cancel(boolean z4) {
        cancel();
    }

    public void pause(boolean z4) {
        pause();
    }
}
