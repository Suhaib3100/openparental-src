package com.tencent.qcloud.track;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Settings;
import androidx.work.i0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.event.open.BeaconConfig;
import com.tencent.beacon.event.open.BeaconReport;
import com.tencent.qcloud.track.service.ATrackService;
import com.tencent.qcloud.track.service.BeaconTrackService;
import com.tencent.qcloud.track.service.ClsTrackService;
import com.tencent.qcloud.track.utils.NetworkUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes7.dex */
public class QCloudTrackService {
    private static final String EVENT_KEY_CLS_REPORT = ProtectedSandApp.s("孯\u0001");
    private static final String TAG = ProtectedSandApp.s("孱\u0001");
    private static volatile QCloudTrackService instance;
    private Map<String, String> businessParams;
    private Map<String, String> commonParams;
    private Context context;
    private BeaconTrackService simpleDataTrackService;
    private boolean isInitialized = false;
    private final Map<String, List<ATrackService>> trackServiceMap = new HashMap();

    private QCloudTrackService() {
    }

    private String createNewId() {
        String string = Settings.Secure.getString(this.context.getContentResolver(), ProtectedSandApp.s("孡\u0001"));
        return (string == null || string.isEmpty()) ? UUID.randomUUID().toString() : string;
    }

    private Map<String, String> getCommonParams() {
        HashMap hashMap = new HashMap();
        String packageName = this.context.getPackageName();
        hashMap.put(ProtectedSandApp.s("孢\u0001"), packageName);
        try {
            PackageInfo packageInfo = this.context.getPackageManager().getPackageInfo(packageName, 0);
            String str = packageInfo.versionName;
            hashMap.put(ProtectedSandApp.s("季\u0001"), String.valueOf(Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode));
            hashMap.put(ProtectedSandApp.s("孤\u0001"), str);
        } catch (PackageManager.NameNotFoundException e4) {
            e4.printStackTrace();
        }
        hashMap.put(ProtectedSandApp.s("孥\u0001"), ProtectedSandApp.s("学\u0001"));
        hashMap.put(ProtectedSandApp.s("孧\u0001"), Build.VERSION.RELEASE);
        hashMap.put(ProtectedSandApp.s("孨\u0001"), NetworkUtils.getLocalMachineIP());
        hashMap.put(ProtectedSandApp.s("孩\u0001"), String.valueOf(NetworkUtils.isProxy()));
        hashMap.put(ProtectedSandApp.s("孪\u0001"), NetworkUtils.getNetworkType(this.context));
        return hashMap;
    }

    public static QCloudTrackService getInstance() {
        if (instance == null) {
            synchronized (QCloudTrackService.class) {
                try {
                    if (instance == null) {
                        instance = new QCloudTrackService();
                    }
                } finally {
                }
            }
        }
        return instance;
    }

    private void initBeacon() {
        BeaconConfig build = BeaconConfig.builder().auditEnable(false).bidEnable(false).qmspEnable(false).pagePathEnable(false).setNormalPollingTime(i0.f35989d).build();
        BeaconReport beaconReport = BeaconReport.getInstance();
        try {
            beaconReport.setCollectProcessInfo(false);
        } catch (NoSuchMethodError unused) {
        }
        try {
            String safeDeviceId = getSafeDeviceId();
            beaconReport.setOstar(safeDeviceId, safeDeviceId);
            beaconReport.start(this.context, ProtectedSandApp.s("孫\u0001"), build);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        try {
            beaconReport.setCollectProcessInfo(false);
        } catch (NoSuchMethodError unused2) {
        }
    }

    public synchronized void addTrackService(String str, ATrackService aTrackService) {
        try {
            if (this.trackServiceMap.get(str) == null) {
                this.trackServiceMap.put(str, new ArrayList());
            }
            this.trackServiceMap.get(str).add(aTrackService);
        } catch (Throwable th) {
            throw th;
        }
    }

    public String getSafeDeviceId() {
        SharedPreferences sharedPreferences = this.context.getSharedPreferences(ProtectedSandApp.s("孬\u0001"), 0);
        String s4 = ProtectedSandApp.s("孭\u0001");
        String string = sharedPreferences.getString(s4, null);
        if (string != null) {
            return string;
        }
        String createNewId = createNewId();
        sharedPreferences.edit().putString(s4, createNewId).apply();
        return createNewId;
    }

    public synchronized void init(Context context) {
        try {
            try {
                if (!this.isInitialized) {
                    this.context = context.getApplicationContext();
                    this.commonParams = getCommonParams();
                    if (BeaconTrackService.isInclude()) {
                        initBeacon();
                        BeaconTrackService beaconTrackService = new BeaconTrackService();
                        this.simpleDataTrackService = beaconTrackService;
                        beaconTrackService.setContext(context);
                        this.simpleDataTrackService.init(ProtectedSandApp.s("孫\u0001"));
                    }
                    this.isInitialized = true;
                }
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void report(String str, Map<String, String> map) {
        try {
            Map<String, String> map2 = this.commonParams;
            if (map2 != null && map2.size() > 0) {
                map.putAll(this.commonParams);
            }
            Map<String, String> map3 = this.businessParams;
            if (map3 != null && map3.size() > 0) {
                map.putAll(this.businessParams);
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getValue() == null) {
                    map.put(entry.getKey(), ProtectedSandApp.s("孮\u0001"));
                }
            }
            List<ATrackService> list = this.trackServiceMap.get(str);
            if (list != null) {
                Iterator<ATrackService> it = list.iterator();
                while (it.hasNext()) {
                    it.next().report(str, map);
                }
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public void reportSimpleData(String str, Map<String, String> map) {
        if (this.simpleDataTrackService == null) {
            return;
        }
        try {
            Map<String, String> map2 = this.commonParams;
            if (map2 != null && map2.size() > 0) {
                map.putAll(this.commonParams);
            }
            Map<String, String> map3 = this.businessParams;
            if (map3 != null && map3.size() > 0) {
                map.putAll(this.businessParams);
            }
            map.put(ProtectedSandApp.s("孯\u0001"), String.valueOf(ClsTrackService.isInclude()));
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getValue() == null) {
                    map.put(entry.getKey(), ProtectedSandApp.s("孮\u0001"));
                }
            }
            this.simpleDataTrackService.report(str, map);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public void setBusinessParams(Map<String, String> map) {
        this.businessParams = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.businessParams.put(ProtectedSandApp.s("孰\u0001") + entry.getKey(), entry.getValue());
        }
    }

    public void setDebug(boolean z4) {
        BeaconTrackService beaconTrackService = this.simpleDataTrackService;
        if (beaconTrackService != null) {
            beaconTrackService.setDebug(z4);
        }
        Iterator<String> it = this.trackServiceMap.keySet().iterator();
        while (it.hasNext()) {
            List<ATrackService> list = this.trackServiceMap.get(it.next());
            if (list != null) {
                Iterator<ATrackService> it2 = list.iterator();
                while (it2.hasNext()) {
                    it2.next().setDebug(z4);
                }
            }
        }
    }

    public void setIsCloseReport(boolean z4) {
        BeaconTrackService beaconTrackService = this.simpleDataTrackService;
        if (beaconTrackService != null) {
            beaconTrackService.setIsCloseReport(z4);
        }
        Iterator<String> it = this.trackServiceMap.keySet().iterator();
        while (it.hasNext()) {
            List<ATrackService> list = this.trackServiceMap.get(it.next());
            if (list != null) {
                Iterator<ATrackService> it2 = list.iterator();
                while (it2.hasNext()) {
                    it2.next().setIsCloseReport(z4);
                }
            }
        }
    }
}
