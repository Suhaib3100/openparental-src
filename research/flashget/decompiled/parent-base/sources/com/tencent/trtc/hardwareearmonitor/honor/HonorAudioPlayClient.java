package com.tencent.trtc.hardwareearmonitor.honor;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioPlayService;

/* loaded from: classes7.dex */
public class HonorAudioPlayClient extends HonorAudioFeaturesKit {
    private static final String ENGINE_CLASS_NAME = ProtectedSandApp.s("崜\u0001");
    private static final String TAG = ProtectedSandApp.s("崚\u0001");
    private Context mContext;
    private HonorFeatureKitManager mFeatureKitManager;
    private IHonorAudioPlayService mHnAudioPlayService;
    private boolean mIsServiceConnected = false;
    private IBinder mService = null;
    private ServiceConnection mConnection = new ServiceConnection() { // from class: com.tencent.trtc.hardwareearmonitor.honor.HonorAudioPlayClient.1
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            HonorLogUtils.info(ProtectedSandApp.s("崕\u0001"), ProtectedSandApp.s("崖\u0001"));
            HonorAudioPlayClient.this.mHnAudioPlayService = IHonorAudioPlayService.Stub.asInterface(iBinder);
            if (HonorAudioPlayClient.this.mHnAudioPlayService != null) {
                HonorAudioPlayClient.this.mIsServiceConnected = true;
                HonorAudioPlayClient honorAudioPlayClient = HonorAudioPlayClient.this;
                honorAudioPlayClient.serviceInit(honorAudioPlayClient.mContext.getPackageName());
                HonorAudioPlayClient.this.serviceLinkToDeath(iBinder);
                HonorAudioPlayClient.this.mFeatureKitManager.onCallBack(3000);
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            HonorLogUtils.info(ProtectedSandApp.s("崕\u0001"), ProtectedSandApp.s("崗\u0001"));
            HonorAudioPlayClient.this.mIsServiceConnected = false;
            if (HonorAudioPlayClient.this.mFeatureKitManager != null) {
                HonorAudioPlayClient.this.mFeatureKitManager.onCallBack(3001);
            }
        }
    };
    private IBinder.DeathRecipient mDeathRecipient = new IBinder.DeathRecipient() { // from class: com.tencent.trtc.hardwareearmonitor.honor.HonorAudioPlayClient.2
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            HonorAudioPlayClient.this.mService.unlinkToDeath(HonorAudioPlayClient.this.mDeathRecipient, 0);
            HonorAudioPlayClient.this.mFeatureKitManager.onCallBack(3004);
            HonorLogUtils.error(ProtectedSandApp.s("崘\u0001"), ProtectedSandApp.s("崙\u0001"));
            HonorAudioPlayClient.this.mService = null;
        }
    };

    public HonorAudioPlayClient(Context context) {
        this.mFeatureKitManager = null;
        this.mFeatureKitManager = HonorFeatureKitManager.getInstance();
        this.mContext = context;
    }

    private void bindService(Context context) {
        HonorLogUtils.info(ProtectedSandApp.s("崚\u0001"), ProtectedSandApp.s("崛\u0001"));
        HonorFeatureKitManager honorFeatureKitManager = this.mFeatureKitManager;
        if (honorFeatureKitManager == null || this.mIsServiceConnected) {
            return;
        }
        honorFeatureKitManager.bindService(context, this.mConnection, ProtectedSandApp.s("崜\u0001"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void serviceInit(String str) {
        String s4 = ProtectedSandApp.s("崝\u0001");
        String s5 = ProtectedSandApp.s("崚\u0001");
        HonorLogUtils.info(s5, s4);
        try {
            IHonorAudioPlayService iHonorAudioPlayService = this.mHnAudioPlayService;
            if (iHonorAudioPlayService == null || !this.mIsServiceConnected) {
                return;
            }
            iHonorAudioPlayService.init(str);
        } catch (Throwable th) {
            HonorLogUtils.error(s5, ProtectedSandApp.s("崞\u0001") + th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void serviceLinkToDeath(IBinder iBinder) {
        this.mService = iBinder;
        if (iBinder != null) {
            try {
                iBinder.linkToDeath(this.mDeathRecipient, 0);
            } catch (Throwable unused) {
                this.mFeatureKitManager.onCallBack(3003);
                HonorLogUtils.error(ProtectedSandApp.s("崚\u0001"), ProtectedSandApp.s("崟\u0001"));
            }
        }
    }

    @Override // com.tencent.trtc.hardwareearmonitor.honor.HonorAudioFeaturesKit
    public void destroy() {
        super.destroy();
        HonorLogUtils.info(ProtectedSandApp.s("崚\u0001"), ProtectedSandApp.s("崠\u0001") + this.mIsServiceConnected);
        if (this.mIsServiceConnected) {
            this.mIsServiceConnected = false;
            this.mFeatureKitManager.unbindService(this.mContext, this.mConnection);
        }
    }

    public void enableHighSampleRatePlay(boolean z4) {
        long j4 = HonorFeatureKitManager.mMinVersion;
        String s4 = ProtectedSandApp.s("崚\u0001");
        if (j4 < 1000001) {
            HonorLogUtils.error(s4, ProtectedSandApp.s("崡\u0001") + HonorFeatureKitManager.mMinVersion);
            this.mFeatureKitManager.onCallBack(3002);
            return;
        }
        HonorLogUtils.info(s4, ProtectedSandApp.s("崢\u0001").concat(String.valueOf(z4)));
        try {
            IHonorAudioPlayService iHonorAudioPlayService = this.mHnAudioPlayService;
            if (iHonorAudioPlayService == null || !this.mIsServiceConnected) {
                return;
            }
            iHonorAudioPlayService.enableHighSampleRatePlay(z4);
        } catch (Throwable th) {
            HonorLogUtils.error(s4, ProtectedSandApp.s("崣\u0001") + th.getMessage());
        }
    }

    public void initialize(Context context) {
        String s4 = ProtectedSandApp.s("崚\u0001");
        if (context == null) {
            HonorLogUtils.info(s4, ProtectedSandApp.s("崤\u0001"));
        } else if (HonorFeatureKitManager.isAudioKitSupport(context)) {
            bindService(context);
        } else {
            this.mFeatureKitManager.onCallBack(2);
            HonorLogUtils.info(s4, ProtectedSandApp.s("崥\u0001"));
        }
    }
}
