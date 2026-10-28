package com.tencent.trtc.hardwareearmonitor.honor;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public class HonorAudioClient {
    private static final int DEFAULT_VALUE = 0;
    private Context mContext;
    private HonorFeatureKitManager mFeatureKitManager;
    private static final String ENGINE_PACKAGE_NAME = ProtectedSandApp.s("崁\u0001");
    private static final String ENGINE_CLASS_NAME = ProtectedSandApp.s("崂\u0001");
    private static final String TAG = ProtectedSandApp.s("崃\u0001");
    private static final List<Integer> DEFAULT_FEATURE_LIST = new ArrayList(0);
    private IHonorAudioService mIHnAudioService = null;
    private boolean mIsServiceConnected = false;
    private IBinder mService = null;
    private List<Integer> mSupportedServiceList = new ArrayList();
    private ServiceConnection mConnection = new ServiceConnection() { // from class: com.tencent.trtc.hardwareearmonitor.honor.HonorAudioClient.1
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            HonorAudioClient.this.mIHnAudioService = IHonorAudioService.Stub.asInterface(iBinder);
            String s4 = ProtectedSandApp.s("島\u0001");
            String s5 = ProtectedSandApp.s("峷\u0001");
            HonorLogUtils.info(s5, s4);
            if (HonorAudioClient.this.mIHnAudioService != null) {
                HonorAudioClient.this.mIsServiceConnected = true;
                HonorLogUtils.info(s5, ProtectedSandApp.s("峸\u0001"));
                HonorAudioClient.this.mFeatureKitManager.onCallBack(0);
                HonorAudioClient honorAudioClient = HonorAudioClient.this;
                honorAudioClient.serviceInit(honorAudioClient.mContext.getPackageName(), ProtectedSandApp.s("峹\u0001"));
                HonorAudioClient.this.serviceLinkToDeath(iBinder);
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            HonorLogUtils.info(ProtectedSandApp.s("峷\u0001"), ProtectedSandApp.s("峺\u0001"));
            HonorAudioClient.this.mIHnAudioService = null;
            HonorAudioClient.this.mIsServiceConnected = false;
            HonorAudioClient.this.mFeatureKitManager.onCallBack(4);
        }
    };
    private IBinder.DeathRecipient mDeathRecipient = new IBinder.DeathRecipient() { // from class: com.tencent.trtc.hardwareearmonitor.honor.HonorAudioClient.2
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            HonorAudioClient.this.mService.unlinkToDeath(HonorAudioClient.this.mDeathRecipient, 0);
            HonorAudioClient.this.mFeatureKitManager.onCallBack(6);
            HonorLogUtils.error(ProtectedSandApp.s("峻\u0001"), ProtectedSandApp.s("峼\u0001"));
            HonorAudioClient.this.mService = null;
        }
    };

    public enum ServiceType {
        HNAUDIO_SERVICE_EARRETURN(1),
        HNAUDIO_SERVICE_ADVANCEDRECORD(2),
        HNAUDIO_SERVICE_HIGHSAMPLERATEPLAY(3),
        HNAUDIO_SERVICE_RECORDDENOISE(4);

        private int mServiceType;

        ServiceType(int i4) {
            this.mServiceType = i4;
        }

        public final int getServiceType() {
            return this.mServiceType;
        }
    }

    public HonorAudioClient(Context context, IHonorAudioServiceCallback iHonorAudioServiceCallback) {
        HonorFeatureKitManager honorFeatureKitManager = HonorFeatureKitManager.getInstance();
        this.mFeatureKitManager = honorFeatureKitManager;
        this.mContext = null;
        honorFeatureKitManager.setCallBack(iHonorAudioServiceCallback);
        this.mContext = context;
    }

    private void bindService(Context context) {
        String str = ProtectedSandApp.s("崄\u0001") + this.mIsServiceConnected;
        String s4 = ProtectedSandApp.s("崃\u0001");
        HonorLogUtils.info(s4, str);
        try {
            HonorFeatureKitManager honorFeatureKitManager = this.mFeatureKitManager;
            if (honorFeatureKitManager == null || this.mIsServiceConnected) {
                return;
            }
            honorFeatureKitManager.bindService(context, this.mConnection, ProtectedSandApp.s("崂\u0001"));
        } catch (Throwable th) {
            HonorLogUtils.error(s4, ProtectedSandApp.s("崅\u0001") + th.getMessage());
        }
    }

    private void filterUnsupportedService(int i4) {
        if (i4 == 1) {
            if (HonorFeatureKitManager.mMinVersion >= 1000000) {
                this.mSupportedServiceList.add(Integer.valueOf(i4));
            }
        } else if (i4 == 2) {
            if (HonorFeatureKitManager.mMinVersion >= 1000000) {
                this.mSupportedServiceList.add(Integer.valueOf(i4));
            }
        } else if (i4 == 3) {
            if (HonorFeatureKitManager.mMinVersion >= 1000001) {
                this.mSupportedServiceList.add(Integer.valueOf(i4));
            }
        } else if (i4 == 4 && HonorFeatureKitManager.mMinVersion >= 1000001) {
            this.mSupportedServiceList.add(Integer.valueOf(i4));
        }
    }

    public static boolean isDeviceSupported(Context context) {
        return HonorFeatureKitManager.isAudioKitSupport(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void serviceInit(String str, String str2) {
        String s4 = ProtectedSandApp.s("崆\u0001");
        String s5 = ProtectedSandApp.s("崃\u0001");
        HonorLogUtils.info(s5, s4);
        try {
            IHonorAudioService iHonorAudioService = this.mIHnAudioService;
            if (iHonorAudioService == null || !this.mIsServiceConnected) {
                return;
            }
            iHonorAudioService.init(str, str2);
        } catch (Throwable th) {
            HonorLogUtils.error(s5, ProtectedSandApp.s("崇\u0001") + th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void serviceLinkToDeath(IBinder iBinder) {
        this.mService = iBinder;
        if (iBinder != null) {
            try {
                iBinder.linkToDeath(this.mDeathRecipient, 0);
            } catch (Throwable unused) {
                this.mFeatureKitManager.onCallBack(5);
                HonorLogUtils.error(ProtectedSandApp.s("崃\u0001"), ProtectedSandApp.s("崈\u0001"));
            }
        }
    }

    public <T extends HonorAudioFeaturesKit> T createService(ServiceType serviceType) {
        if (this.mFeatureKitManager != null && serviceType != null && this.mSupportedServiceList.contains(Integer.valueOf(serviceType.getServiceType()))) {
            return (T) this.mFeatureKitManager.createFeatureKit(serviceType.getServiceType(), this.mContext);
        }
        HonorLogUtils.error(ProtectedSandApp.s("崃\u0001"), ProtectedSandApp.s("崉\u0001"));
        return null;
    }

    public void destroy() {
        String str = ProtectedSandApp.s("崊\u0001") + this.mIsServiceConnected;
        String s4 = ProtectedSandApp.s("崃\u0001");
        HonorLogUtils.info(s4, str);
        try {
            if (this.mIsServiceConnected) {
                this.mIsServiceConnected = false;
                this.mFeatureKitManager.unbindService(this.mContext, this.mConnection);
            }
        } catch (Throwable th) {
            HonorLogUtils.error(s4, ProtectedSandApp.s("崋\u0001") + th.getMessage());
        }
    }

    public List<Integer> getSupportedServices() {
        String s4 = ProtectedSandApp.s("崃\u0001");
        try {
            IHonorAudioService iHonorAudioService = this.mIHnAudioService;
            if (iHonorAudioService != null && this.mIsServiceConnected) {
                List supportedServices = iHonorAudioService.getSupportedServices();
                if (supportedServices == null) {
                    HonorLogUtils.error(s4, ProtectedSandApp.s("崌\u0001"));
                    return DEFAULT_FEATURE_LIST;
                }
                this.mSupportedServiceList.clear();
                Iterator it = supportedServices.iterator();
                while (it.hasNext()) {
                    filterUnsupportedService(((Integer) it.next()).intValue());
                }
                HonorLogUtils.info(s4, ProtectedSandApp.s("崍\u0001") + Arrays.toString(supportedServices.toArray()));
                return this.mSupportedServiceList;
            }
        } catch (Throwable unused) {
            HonorLogUtils.error(s4, ProtectedSandApp.s("崎\u0001"));
        }
        HonorLogUtils.info(s4, ProtectedSandApp.s("崏\u0001"));
        return DEFAULT_FEATURE_LIST;
    }

    public void initialize() {
        String s4 = ProtectedSandApp.s("崐\u0001");
        String s5 = ProtectedSandApp.s("崃\u0001");
        HonorLogUtils.info(s5, s4);
        Context context = this.mContext;
        if (context == null) {
            HonorLogUtils.info(s5, ProtectedSandApp.s("崑\u0001"));
            this.mFeatureKitManager.onCallBack(7);
        } else if (HonorFeatureKitManager.isAudioKitSupport(context)) {
            bindService(this.mContext);
        } else {
            HonorLogUtils.info(s5, ProtectedSandApp.s("崒\u0001"));
            this.mFeatureKitManager.onCallBack(2);
        }
    }

    public boolean isServiceSupported(ServiceType serviceType) {
        if (serviceType == null) {
            return false;
        }
        String str = ProtectedSandApp.s("崓\u0001") + serviceType.getServiceType();
        String s4 = ProtectedSandApp.s("崃\u0001");
        HonorLogUtils.info(s4, str);
        try {
            if (this.mIHnAudioService != null && this.mIsServiceConnected && this.mSupportedServiceList.contains(Integer.valueOf(serviceType.getServiceType()))) {
                return this.mIHnAudioService.isServiceSupported(serviceType.getServiceType());
            }
            return false;
        } catch (Throwable th) {
            HonorLogUtils.error(s4, ProtectedSandApp.s("崔\u0001") + th.getMessage());
            return false;
        }
    }
}
