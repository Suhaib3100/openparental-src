package com.tencent.trtc.hardwareearmonitor.honor;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.trtc.hardwareearmonitor.honor.HonorAudioClient;
import com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService;

/* loaded from: classes7.dex */
public class HonorAdvancedRecordClient extends HonorAudioFeaturesKit {
    private static final String ENGINE_CLASS_NAME = ProtectedSandApp.s("峥\u0001");
    private static final String TAG = ProtectedSandApp.s("峣\u0001");
    private Context mContext;
    private HonorFeatureKitManager mFeatureKitManager;
    private boolean mIsServiceConnected = false;
    private IHonorAdvancedRecordService mHnAdvancedRecordService = null;
    private IBinder mService = null;
    private final IBinder mClientBinder = new Binder();
    private ServiceConnection mConnection = new ServiceConnection() { // from class: com.tencent.trtc.hardwareearmonitor.honor.HonorAdvancedRecordClient.1
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            HonorAdvancedRecordClient.this.mHnAdvancedRecordService = IHonorAdvancedRecordService.Stub.asInterface(iBinder);
            String s4 = ProtectedSandApp.s("峚\u0001");
            String s5 = ProtectedSandApp.s("峛\u0001");
            HonorLogUtils.info(s5, s4);
            if (HonorAdvancedRecordClient.this.mHnAdvancedRecordService != null) {
                HonorAdvancedRecordClient.this.mIsServiceConnected = true;
                HonorLogUtils.info(s5, ProtectedSandApp.s("峜\u0001"));
                HonorAdvancedRecordClient.this.mFeatureKitManager.onCallBack(2000);
                HonorAdvancedRecordClient honorAdvancedRecordClient = HonorAdvancedRecordClient.this;
                honorAdvancedRecordClient.serviceInit(honorAdvancedRecordClient.mContext.getPackageName());
                HonorAdvancedRecordClient.this.serviceLinkToDeath(iBinder);
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            HonorLogUtils.info(ProtectedSandApp.s("峛\u0001"), ProtectedSandApp.s("峝\u0001"));
            HonorAdvancedRecordClient.this.mHnAdvancedRecordService = null;
            HonorAdvancedRecordClient.this.mIsServiceConnected = false;
            HonorAdvancedRecordClient.this.mFeatureKitManager.onCallBack(2001);
        }
    };
    private IBinder.DeathRecipient mDeathRecipient = new IBinder.DeathRecipient() { // from class: com.tencent.trtc.hardwareearmonitor.honor.HonorAdvancedRecordClient.2
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            HonorAdvancedRecordClient.this.mService.unlinkToDeath(HonorAdvancedRecordClient.this.mDeathRecipient, 0);
            HonorAdvancedRecordClient.this.mFeatureKitManager.onCallBack(6);
            HonorLogUtils.error(ProtectedSandApp.s("峞\u0001"), ProtectedSandApp.s("峟\u0001"));
            HonorAdvancedRecordClient.this.mService = null;
        }
    };

    public enum DenoiseLevel {
        DENOISE_DEFAULT_LEVEL(1);

        private final int mDenoiseLevel;

        DenoiseLevel(int i4) {
            this.mDenoiseLevel = i4;
        }

        public final int getLevel() {
            return this.mDenoiseLevel;
        }
    }

    public enum DenoiseMode {
        DENOISE_NN_MODE(1);

        private final int mDenoiseMode;

        DenoiseMode(int i4) {
            this.mDenoiseMode = i4;
        }

        public final int getMode() {
            return this.mDenoiseMode;
        }
    }

    public enum DenoiseScene {
        DENOISE_SPEAK_SCENE(1);

        private final int mDenoiseScene;

        DenoiseScene(int i4) {
            this.mDenoiseScene = i4;
        }

        public final int getScene() {
            return this.mDenoiseScene;
        }
    }

    public HonorAdvancedRecordClient(Context context) {
        this.mFeatureKitManager = null;
        this.mFeatureKitManager = HonorFeatureKitManager.getInstance();
        this.mContext = context;
    }

    private void bindService(Context context) {
        HonorLogUtils.info(ProtectedSandApp.s("峣\u0001"), ProtectedSandApp.s("峤\u0001"));
        HonorFeatureKitManager honorFeatureKitManager = this.mFeatureKitManager;
        if (honorFeatureKitManager == null || this.mIsServiceConnected) {
            return;
        }
        honorFeatureKitManager.bindService(context, this.mConnection, ProtectedSandApp.s("峥\u0001"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void serviceInit(String str) {
        String s4 = ProtectedSandApp.s("峦\u0001");
        String s5 = ProtectedSandApp.s("峣\u0001");
        HonorLogUtils.info(s5, s4);
        try {
            IHonorAdvancedRecordService iHonorAdvancedRecordService = this.mHnAdvancedRecordService;
            if (iHonorAdvancedRecordService == null || !this.mIsServiceConnected) {
                return;
            }
            iHonorAdvancedRecordService.init(str);
        } catch (Throwable th) {
            HonorLogUtils.error(s5, ProtectedSandApp.s("峧\u0001") + th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void serviceLinkToDeath(IBinder iBinder) {
        this.mService = iBinder;
        if (iBinder != null) {
            try {
                iBinder.linkToDeath(this.mDeathRecipient, 0);
            } catch (Throwable unused) {
                this.mFeatureKitManager.onCallBack(2002);
                HonorLogUtils.error(ProtectedSandApp.s("峣\u0001"), ProtectedSandApp.s("峨\u0001"));
            }
        }
    }

    @Override // com.tencent.trtc.hardwareearmonitor.honor.HonorAudioFeaturesKit
    public void destroy() {
        super.destroy();
        HonorLogUtils.info(ProtectedSandApp.s("峣\u0001"), ProtectedSandApp.s("峩\u0001") + this.mIsServiceConnected);
        if (this.mIsServiceConnected) {
            this.mIsServiceConnected = false;
            this.mFeatureKitManager.unbindService(this.mContext, this.mConnection);
        }
    }

    public boolean disableAdvancedRecord(Context context) {
        String str = ProtectedSandApp.s("峪\u0001") + this.mIsServiceConnected;
        String s4 = ProtectedSandApp.s("峣\u0001");
        HonorLogUtils.info(s4, str);
        try {
            IHonorAdvancedRecordService iHonorAdvancedRecordService = this.mHnAdvancedRecordService;
            if (iHonorAdvancedRecordService == null || !this.mIsServiceConnected) {
                return false;
            }
            return iHonorAdvancedRecordService.disableAdvancedRecord();
        } catch (Throwable th) {
            HonorLogUtils.error(s4, ProtectedSandApp.s("峫\u0001") + th.getMessage());
            return false;
        }
    }

    public boolean enableAdvancedRecord(Context context) {
        String s4 = ProtectedSandApp.s("峬\u0001");
        String s5 = ProtectedSandApp.s("峣\u0001");
        HonorLogUtils.info(s5, s4);
        try {
            IHonorAdvancedRecordService iHonorAdvancedRecordService = this.mHnAdvancedRecordService;
            if (iHonorAdvancedRecordService == null || !this.mIsServiceConnected) {
                return false;
            }
            return iHonorAdvancedRecordService.enableAdvancedRecord();
        } catch (Throwable th) {
            HonorLogUtils.error(s5, ProtectedSandApp.s("峭\u0001") + th.getMessage());
            return false;
        }
    }

    public int enableRecordDenoise(boolean z4, DenoiseMode denoiseMode, DenoiseScene denoiseScene, DenoiseLevel denoiseLevel) {
        long j4 = HonorFeatureKitManager.mMinVersion;
        String s4 = ProtectedSandApp.s("峣\u0001");
        if (j4 < 1000001) {
            HonorLogUtils.error(s4, ProtectedSandApp.s("峮\u0001") + HonorFeatureKitManager.mMinVersion);
            return 2004;
        }
        try {
            IHonorAdvancedRecordService iHonorAdvancedRecordService = this.mHnAdvancedRecordService;
            if (iHonorAdvancedRecordService == null || !this.mIsServiceConnected) {
                return -2;
            }
            return iHonorAdvancedRecordService.enableRecordDenoise(z4, denoiseMode.getMode(), denoiseScene.getScene(), denoiseLevel.getLevel(), this.mClientBinder);
        } catch (Throwable th) {
            HonorLogUtils.error(s4, ProtectedSandApp.s("峯\u0001") + th.getMessage());
            return -2;
        }
    }

    public void initialize(Context context) {
        String s4 = ProtectedSandApp.s("峰\u0001");
        String s5 = ProtectedSandApp.s("峣\u0001");
        HonorLogUtils.info(s5, s4);
        if (context == null) {
            HonorLogUtils.info(s5, ProtectedSandApp.s("峱\u0001"));
        } else if (HonorFeatureKitManager.isAudioKitSupport(context)) {
            bindService(context);
        } else {
            this.mFeatureKitManager.onCallBack(2);
            HonorLogUtils.info(s5, ProtectedSandApp.s("峲\u0001"));
        }
    }

    @Override // com.tencent.trtc.hardwareearmonitor.honor.HonorAudioFeaturesKit
    public boolean isServiceSupported() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("峳\u0001"));
        HonorAudioClient.ServiceType serviceType = HonorAudioClient.ServiceType.HNAUDIO_SERVICE_ADVANCEDRECORD;
        sb.append(serviceType.getServiceType());
        sb.append(ProtectedSandApp.s("峴\u0001"));
        sb.append(this.mIsServiceConnected);
        String sb2 = sb.toString();
        String s4 = ProtectedSandApp.s("峣\u0001");
        HonorLogUtils.info(s4, sb2);
        try {
            IHonorAdvancedRecordService iHonorAdvancedRecordService = this.mHnAdvancedRecordService;
            if (iHonorAdvancedRecordService != null && this.mIsServiceConnected) {
                return iHonorAdvancedRecordService.isSupported(serviceType.getServiceType());
            }
        } catch (Throwable th) {
            HonorLogUtils.error(s4, ProtectedSandApp.s("峵\u0001") + th.getMessage());
        }
        return super.isServiceSupported();
    }
}
