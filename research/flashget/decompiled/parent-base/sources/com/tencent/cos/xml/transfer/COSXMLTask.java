package com.tencent.cos.xml.transfer;

import androidx.annotation.q0;
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
import com.tencent.qcloud.core.auth.QCloudCredentialProvider;
import com.tencent.qcloud.core.http.HttpTaskMetrics;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public abstract class COSXMLTask {
    private static final String TAG = ProtectedSandApp.s("伿\u0001");
    protected static TaskStateMonitor monitor = TaskStateMonitor.getInstance();
    protected String bucket;
    protected String cosPath;
    protected CosXmlProgressListener cosXmlProgressListener;
    protected CosXmlResultListener cosXmlResultListener;
    protected CosXmlSimpleService cosXmlService;
    protected QCloudCredentialProvider credentialProvider;
    protected Map<String, List<String>> headers;
    protected String host;
    protected InitMultipleUploadListener initMultipleUploadListener;
    protected InitMultipleUploadListener internalInitMultipleUploadListener;
    protected CosXmlProgressListener internalProgressListener;
    protected TransferStateListener internalStateListener;
    private boolean isCancelNow;
    private boolean isPauseNow;
    protected Exception mException;
    protected CosXmlResult mResult;
    protected Set<String> noSignHeaders;
    protected OnGetHttpTaskMetrics onGetHttpTaskMetrics;
    protected OnSignatureListener onSignatureListener;
    protected Map<String, String> queries;
    protected String region;
    protected TransferStateListener transferStateListener;
    protected Timer waitTimeoutTimer;
    protected boolean isNeedMd5 = true;
    protected CosXmlRequest.RequestNetworkType networkType = null;
    volatile TransferState taskState = TransferState.WAITING;
    protected AtomicBoolean IS_EXIT = new AtomicBoolean(false);

    /* renamed from: com.tencent.cos.xml.transfer.COSXMLTask$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$tencent$cos$xml$transfer$TransferState;

        static {
            int[] iArr = new int[TransferState.values().length];
            $SwitchMap$com$tencent$cos$xml$transfer$TransferState = iArr;
            try {
                iArr[TransferState.WAITING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tencent$cos$xml$transfer$TransferState[TransferState.IN_PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$tencent$cos$xml$transfer$TransferState[TransferState.COMPLETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$tencent$cos$xml$transfer$TransferState[TransferState.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$tencent$cos$xml$transfer$TransferState[TransferState.PAUSED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$tencent$cos$xml$transfer$TransferState[TransferState.CANCELED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$tencent$cos$xml$transfer$TransferState[TransferState.RESUMED_WAITING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    class COSXMLMetrics extends HttpTaskMetrics {
        String requestName;

        COSXMLMetrics(String str) {
            this.requestName = str;
        }

        @Override // com.tencent.qcloud.core.http.HttpTaskMetrics
        public void onDataReady() {
            super.onDataReady();
            OnGetHttpTaskMetrics onGetHttpTaskMetrics = COSXMLTask.this.onGetHttpTaskMetrics;
            if (onGetHttpTaskMetrics != null) {
                onGetHttpTaskMetrics.onGetHttpMetrics(this.requestName, this);
            }
        }
    }

    public interface OnGetHttpTaskMetrics {
        void onGetHttpMetrics(String str, HttpTaskMetrics httpTaskMetrics);
    }

    @Deprecated
    public interface OnSignatureListener {
        String onGetSign(CosXmlRequest cosXmlRequest);
    }

    private void dispatchStateChange(TransferState transferState) {
        TransferStateListener transferStateListener = this.transferStateListener;
        if (transferStateListener != null) {
            transferStateListener.onStateChanged(transferState);
        }
        TransferStateListener transferStateListener2 = this.internalStateListener;
        if (transferStateListener2 != null) {
            transferStateListener2.onStateChanged(transferState);
        }
    }

    protected abstract CosXmlRequest buildCOSXMLTaskRequest();

    protected abstract CosXmlResult buildCOSXMLTaskResult(CosXmlResult cosXmlResult);

    public void cancel() {
        if (this.IS_EXIT.get()) {
            return;
        }
        this.IS_EXIT.set(true);
        monitor.sendStateMessage(this, TransferState.CANCELED, new CosXmlClientException(ClientErrorCode.USER_CANCELLED.getCode(), ProtectedSandApp.s("佀\u0001")), null, 2);
    }

    public void clearResultAndException() {
        this.mException = null;
        this.mResult = null;
    }

    protected abstract void encounterError(@q0 CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException);

    protected Map<String, String> getCosXmlServiceConfigTrackParams() {
        HashMap hashMap = new HashMap();
        CosXmlSimpleService cosXmlSimpleService = this.cosXmlService;
        if (cosXmlSimpleService != null && cosXmlSimpleService.getConfig() != null) {
            hashMap.putAll(this.cosXmlService.getConfig().getTrackParams());
        }
        return hashMap;
    }

    public Exception getException() {
        return this.mException;
    }

    protected void getHttpMetrics(CosXmlRequest cosXmlRequest, String str) {
        cosXmlRequest.attachMetrics(new COSXMLMetrics(str));
    }

    public CosXmlResult getResult() {
        return this.mResult;
    }

    public TransferState getTaskState() {
        return this.taskState;
    }

    protected abstract void internalCancel(boolean z4);

    protected abstract void internalCompleted();

    protected abstract void internalFailed();

    protected abstract void internalPause(boolean z4);

    protected abstract void internalResume();

    public void pause() {
        if (this.IS_EXIT.get()) {
            return;
        }
        this.IS_EXIT.set(true);
        monitor.sendStateMessage(this, TransferState.PAUSED, null, null, 2);
    }

    public void resume() {
        monitor.sendStateMessage(this, TransferState.RESUMED_WAITING, null, null, 2);
    }

    public void setCosXmlProgressListener(CosXmlProgressListener cosXmlProgressListener) {
        this.cosXmlProgressListener = cosXmlProgressListener;
    }

    public void setCosXmlResultListener(CosXmlResultListener cosXmlResultListener) {
        this.cosXmlResultListener = cosXmlResultListener;
        monitor.sendStateMessage(this, null, this.mException, this.mResult, 4);
    }

    protected void setCosXmlService(CosXmlSimpleService cosXmlSimpleService) {
        this.cosXmlService = cosXmlSimpleService;
    }

    public void setInitMultipleUploadListener(InitMultipleUploadListener initMultipleUploadListener) {
        this.initMultipleUploadListener = initMultipleUploadListener;
    }

    void setInternalInitMultipleUploadListener(InitMultipleUploadListener initMultipleUploadListener) {
        this.internalInitMultipleUploadListener = initMultipleUploadListener;
    }

    void setInternalProgressListener(CosXmlProgressListener cosXmlProgressListener) {
        this.internalProgressListener = cosXmlProgressListener;
    }

    void setInternalStateListener(TransferStateListener transferStateListener) {
        this.internalStateListener = transferStateListener;
    }

    public void setOnGetHttpTaskMetrics(OnGetHttpTaskMetrics onGetHttpTaskMetrics) {
        this.onGetHttpTaskMetrics = onGetHttpTaskMetrics;
    }

    public void setOnSignatureListener(OnSignatureListener onSignatureListener) {
        this.onSignatureListener = onSignatureListener;
    }

    public void setTransferStateListener(TransferStateListener transferStateListener) {
        this.transferStateListener = transferStateListener;
        monitor.sendStateMessage(this, this.taskState, null, null, 4);
    }

    public void startTimeoutTimer(long j4) {
        Timer timer = new Timer();
        this.waitTimeoutTimer = timer;
        timer.schedule(new TimerTask() { // from class: com.tencent.cos.xml.transfer.COSXMLTask.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                if (COSXMLTask.this.taskState == TransferState.WAITING || COSXMLTask.this.taskState == TransferState.RESUMED_WAITING) {
                    COSXMLTask.this.encounterError(null, new CosXmlClientException(ClientErrorCode.INTERNAL_ERROR.getCode(), ProtectedSandApp.s("佰\u0001")), null);
                }
            }
        }, j4);
    }

    protected synchronized void updateState(TransferState transferState, Exception exc, CosXmlResult cosXmlResult, boolean z4) {
        String s4 = ProtectedSandApp.s("佁\u0001");
        synchronized (this) {
            try {
                if (z4) {
                    if (exc != null) {
                        CosXmlResultListener cosXmlResultListener = this.cosXmlResultListener;
                        if (cosXmlResultListener != null) {
                            if (exc instanceof CosXmlClientException) {
                                cosXmlResultListener.onFail(buildCOSXMLTaskRequest(), (CosXmlClientException) exc, null);
                            } else {
                                cosXmlResultListener.onFail(buildCOSXMLTaskRequest(), null, (CosXmlServiceException) exc);
                            }
                        }
                    } else if (cosXmlResult != null) {
                        CosXmlResultListener cosXmlResultListener2 = this.cosXmlResultListener;
                        if (cosXmlResultListener2 != null) {
                            cosXmlResultListener2.onSuccess(buildCOSXMLTaskRequest(), cosXmlResult);
                        }
                    } else if (transferState != null) {
                        dispatchStateChange(this.taskState);
                    }
                    return;
                }
                switch (AnonymousClass2.$SwitchMap$com$tencent$cos$xml$transfer$TransferState[transferState.ordinal()]) {
                    case 1:
                        if (this.taskState == TransferState.RESUMED_WAITING) {
                            this.taskState = TransferState.WAITING;
                            dispatchStateChange(this.taskState);
                            break;
                        }
                        break;
                    case 2:
                        if (this.taskState == TransferState.WAITING) {
                            this.taskState = TransferState.IN_PROGRESS;
                            dispatchStateChange(this.taskState);
                            break;
                        }
                        break;
                    case 3:
                        if (this.taskState == TransferState.IN_PROGRESS) {
                            this.taskState = TransferState.COMPLETED;
                            this.mResult = buildCOSXMLTaskResult(cosXmlResult);
                            CosXmlResultListener cosXmlResultListener3 = this.cosXmlResultListener;
                            if (cosXmlResultListener3 != null) {
                                cosXmlResultListener3.onSuccess(buildCOSXMLTaskRequest(), this.mResult);
                            }
                            dispatchStateChange(this.taskState);
                            internalCompleted();
                            break;
                        }
                        break;
                    case 4:
                        if (this.taskState == TransferState.WAITING || this.taskState == TransferState.IN_PROGRESS) {
                            this.taskState = TransferState.FAILED;
                            this.mException = exc;
                            CosXmlResultListener cosXmlResultListener4 = this.cosXmlResultListener;
                            if (cosXmlResultListener4 != null) {
                                if (exc instanceof CosXmlClientException) {
                                    cosXmlResultListener4.onFail(buildCOSXMLTaskRequest(), (CosXmlClientException) exc, null);
                                } else {
                                    cosXmlResultListener4.onFail(buildCOSXMLTaskRequest(), null, (CosXmlServiceException) exc);
                                }
                            }
                            dispatchStateChange(this.taskState);
                            internalFailed();
                            break;
                        }
                        break;
                    case 5:
                        if (this.taskState == TransferState.WAITING || this.taskState == TransferState.IN_PROGRESS) {
                            this.taskState = TransferState.PAUSED;
                            dispatchStateChange(this.taskState);
                            internalPause(this.isPauseNow);
                            break;
                        }
                        break;
                    case 6:
                        TransferState transferState2 = this.taskState;
                        TransferState transferState3 = TransferState.CANCELED;
                        if (transferState2 != transferState3 && this.taskState != TransferState.COMPLETED) {
                            this.taskState = transferState3;
                            dispatchStateChange(this.taskState);
                            this.mException = exc;
                            CosXmlResultListener cosXmlResultListener5 = this.cosXmlResultListener;
                            if (cosXmlResultListener5 != null) {
                                cosXmlResultListener5.onFail(buildCOSXMLTaskRequest(), (CosXmlClientException) exc, null);
                            }
                            internalCancel(this.isCancelNow);
                            break;
                        }
                        break;
                    case 7:
                        if (this.taskState == TransferState.PAUSED || this.taskState == TransferState.FAILED || this.taskState == TransferState.CONSTRAINED) {
                            this.taskState = TransferState.RESUMED_WAITING;
                            dispatchStateChange(this.taskState);
                            internalResume();
                            break;
                        }
                        break;
                    default:
                        IllegalStateException illegalStateException = new IllegalStateException(s4 + transferState);
                        CosTrackService.getInstance().reportError(ProtectedSandApp.s("伿\u0001"), illegalStateException);
                        throw illegalStateException;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void cancel(boolean z4) {
        this.isCancelNow = z4;
        if (this.IS_EXIT.get()) {
            return;
        }
        this.IS_EXIT.set(true);
        monitor.sendStateMessage(this, TransferState.CANCELED, new CosXmlClientException(ClientErrorCode.USER_CANCELLED.getCode(), ProtectedSandApp.s("佀\u0001")), null, 2);
    }

    public void pause(boolean z4) {
        this.isPauseNow = z4;
        if (this.IS_EXIT.get()) {
            return;
        }
        this.IS_EXIT.set(true);
        monitor.sendStateMessage(this, TransferState.PAUSED, null, null, 2);
    }
}
