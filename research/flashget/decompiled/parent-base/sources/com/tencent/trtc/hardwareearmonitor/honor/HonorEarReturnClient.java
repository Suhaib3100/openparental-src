package com.tencent.trtc.hardwareearmonitor.honor;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.trtc.hardwareearmonitor.honor.HonorAudioClient;
import com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService;

/* loaded from: classes7.dex */
public class HonorEarReturnClient extends HonorAudioFeaturesKit {
    private static final String ENGINE_CLASS_NAME = ProtectedSandApp.s("崳\u0001");
    private static final String TAG = ProtectedSandApp.s("崲\u0001");
    private Context mContext;
    private HonorFeatureKitManager mFeatureKitManager;
    private IHonorEarReturnService mHnEarReturnService;
    private boolean mIsServiceConnected = false;
    private IBinder mService = null;
    private ServiceConnection mConnection = new ServiceConnection() { // from class: com.tencent.trtc.hardwareearmonitor.honor.HonorEarReturnClient.1
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            HonorLogUtils.info(ProtectedSandApp.s("崦\u0001"), ProtectedSandApp.s("崧\u0001"));
            HonorEarReturnClient.this.mHnEarReturnService = IHonorEarReturnService.Stub.asInterface(iBinder);
            if (HonorEarReturnClient.this.mHnEarReturnService != null) {
                HonorEarReturnClient.this.mIsServiceConnected = true;
                HonorEarReturnClient honorEarReturnClient = HonorEarReturnClient.this;
                if (!honorEarReturnClient.serviceInit(honorEarReturnClient.mContext.getPackageName())) {
                    HonorEarReturnClient.this.mFeatureKitManager.onCallBack(1002);
                } else {
                    HonorEarReturnClient.this.serviceLinkToDeath(iBinder);
                    HonorEarReturnClient.this.mFeatureKitManager.onCallBack(1000);
                }
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            HonorLogUtils.info(ProtectedSandApp.s("崦\u0001"), ProtectedSandApp.s("崨\u0001"));
            HonorEarReturnClient.this.mIsServiceConnected = false;
            if (HonorEarReturnClient.this.mFeatureKitManager != null) {
                HonorEarReturnClient.this.mFeatureKitManager.onCallBack(1001);
            }
        }
    };
    private IBinder.DeathRecipient mDeathRecipient = new IBinder.DeathRecipient() { // from class: com.tencent.trtc.hardwareearmonitor.honor.HonorEarReturnClient.2
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            HonorLogUtils.error(ProtectedSandApp.s("崩\u0001"), ProtectedSandApp.s("崪\u0001"));
            HonorEarReturnClient.this.mService.unlinkToDeath(HonorEarReturnClient.this.mDeathRecipient, 0);
            HonorEarReturnClient.this.mFeatureKitManager.onCallBack(1003);
            HonorEarReturnClient.this.mService = null;
        }
    };

    public enum ParameName {
        CMD_SET_AUDIO_EFFECT_MODE_BASE(ProtectedSandApp.s("崫\u0001")),
        CMD_SET_VOCAL_VOLUME_BASE(ProtectedSandApp.s("崭\u0001")),
        CMD_SET_VOCAL_EQUALIZER_MODE(ProtectedSandApp.s("崯\u0001"));

        private String mParameName;

        ParameName(String str) {
            this.mParameName = str;
        }

        public final String getParameName() {
            return this.mParameName;
        }
    }

    public HonorEarReturnClient(Context context) {
        this.mFeatureKitManager = null;
        this.mFeatureKitManager = HonorFeatureKitManager.getInstance();
        this.mContext = context;
    }

    private void bindService(Context context) {
        String s4 = ProtectedSandApp.s("崱\u0001");
        String s5 = ProtectedSandApp.s("崲\u0001");
        HonorLogUtils.info(s5, s4);
        try {
            HonorFeatureKitManager honorFeatureKitManager = this.mFeatureKitManager;
            if (honorFeatureKitManager == null || this.mIsServiceConnected) {
                return;
            }
            honorFeatureKitManager.bindService(context, this.mConnection, ProtectedSandApp.s("崳\u0001"));
        } catch (Throwable th) {
            HonorLogUtils.error(s5, ProtectedSandApp.s("崴\u0001") + th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean serviceInit(String str) {
        try {
            IHonorEarReturnService iHonorEarReturnService = this.mHnEarReturnService;
            if (iHonorEarReturnService != null && this.mIsServiceConnected) {
                iHonorEarReturnService.init(str);
            }
            return true;
        } catch (Throwable th) {
            HonorLogUtils.error(ProtectedSandApp.s("崲\u0001"), ProtectedSandApp.s("崵\u0001") + th.getMessage());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void serviceLinkToDeath(IBinder iBinder) {
        this.mService = iBinder;
        if (iBinder != null) {
            try {
                iBinder.linkToDeath(this.mDeathRecipient, 0);
            } catch (Throwable unused) {
                this.mFeatureKitManager.onCallBack(1002);
                HonorLogUtils.error(ProtectedSandApp.s("崲\u0001"), ProtectedSandApp.s("崶\u0001"));
            }
        }
    }

    @Override // com.tencent.trtc.hardwareearmonitor.honor.HonorAudioFeaturesKit
    public void destroy() {
        String s4 = ProtectedSandApp.s("崲\u0001");
        try {
            super.destroy();
            HonorLogUtils.info(s4, ProtectedSandApp.s("崷\u0001") + this.mIsServiceConnected);
            if (this.mIsServiceConnected) {
                this.mIsServiceConnected = false;
                this.mFeatureKitManager.unbindService(this.mContext, this.mConnection);
            }
        } catch (Throwable th) {
            HonorLogUtils.error(s4, ProtectedSandApp.s("崴\u0001") + th.getMessage());
        }
    }

    public int enableEarReturn(boolean z4) {
        String concat = ProtectedSandApp.s("崸\u0001").concat(String.valueOf(z4));
        String s4 = ProtectedSandApp.s("崲\u0001");
        HonorLogUtils.info(s4, concat);
        try {
            IHonorEarReturnService iHonorEarReturnService = this.mHnEarReturnService;
            if (iHonorEarReturnService == null || !this.mIsServiceConnected) {
                return -2;
            }
            return iHonorEarReturnService.enableEarReturn(z4);
        } catch (Throwable th) {
            HonorLogUtils.error(s4, ProtectedSandApp.s("崹\u0001") + th.getMessage());
            return -2;
        }
    }

    public int getEarReturnLatency() {
        String s4 = ProtectedSandApp.s("崺\u0001");
        String s5 = ProtectedSandApp.s("崲\u0001");
        HonorLogUtils.info(s5, s4);
        try {
            IHonorEarReturnService iHonorEarReturnService = this.mHnEarReturnService;
            if (iHonorEarReturnService == null || !this.mIsServiceConnected) {
                return -1;
            }
            return iHonorEarReturnService.getEarReturnLatency();
        } catch (Throwable th) {
            HonorLogUtils.error(s5, ProtectedSandApp.s("崻\u0001") + th.getMessage());
            return -1;
        }
    }

    public void initialize(Context context) {
        String s4 = ProtectedSandApp.s("崼\u0001");
        String s5 = ProtectedSandApp.s("崲\u0001");
        HonorLogUtils.info(s5, s4);
        if (context == null) {
            HonorLogUtils.info(s5, ProtectedSandApp.s("崽\u0001"));
        } else if (HonorFeatureKitManager.isAudioKitSupport(context)) {
            bindService(context);
        } else {
            this.mFeatureKitManager.onCallBack(2);
            HonorLogUtils.info(s5, ProtectedSandApp.s("崾\u0001"));
        }
    }

    @Override // com.tencent.trtc.hardwareearmonitor.honor.HonorAudioFeaturesKit
    public boolean isServiceSupported() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("崿\u0001"));
        HonorAudioClient.ServiceType serviceType = HonorAudioClient.ServiceType.HNAUDIO_SERVICE_EARRETURN;
        sb.append(serviceType.getServiceType());
        String sb2 = sb.toString();
        String s4 = ProtectedSandApp.s("崲\u0001");
        HonorLogUtils.info(s4, sb2);
        try {
            IHonorEarReturnService iHonorEarReturnService = this.mHnEarReturnService;
            if (iHonorEarReturnService != null && this.mIsServiceConnected) {
                return iHonorEarReturnService.isSupported(serviceType.getServiceType());
            }
        } catch (Throwable th) {
            HonorLogUtils.error(s4, ProtectedSandApp.s("嵀\u0001") + th.getMessage());
        }
        return super.isServiceSupported();
    }

    public int setParameter(ParameName parameName, int i4) {
        String s4 = ProtectedSandApp.s("崲\u0001");
        if (parameName == null) {
            return 1807;
        }
        try {
            HonorLogUtils.info(s4, ProtectedSandApp.s("嵁\u0001") + i4 + ProtectedSandApp.s("嵂\u0001") + parameName.getParameName());
            IHonorEarReturnService iHonorEarReturnService = this.mHnEarReturnService;
            if (iHonorEarReturnService == null || !this.mIsServiceConnected) {
                return -2;
            }
            return iHonorEarReturnService.setParameter(parameName.getParameName(), i4);
        } catch (Throwable th) {
            HonorLogUtils.error(s4, ProtectedSandApp.s("嵃\u0001") + th.getMessage());
            return -2;
        }
    }
}
