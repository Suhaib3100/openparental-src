package com.tencent.beacon.event;

import android.annotation.TargetApi;
import android.content.Context;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.core.info.BeaconPubParams;
import com.tencent.beacon.event.open.BeaconConfig;
import com.tencent.beacon.event.open.BeaconEvent;
import com.tencent.beacon.event.open.BeaconInitException;
import com.tencent.beacon.event.open.BeaconReport;
import com.tencent.beacon.event.open.EventType;
import com.tencent.beacon.module.EventModule;
import com.tencent.beacon.module.ModuleName;
import com.tencent.beacon.upload.InitHandleListener;
import com.tencent.beacon.upload.TunnelInfo;
import com.tencent.beacon.upload.UploadHandleListener;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

@Deprecated
/* loaded from: classes6.dex */
public class UserAction {

    /* renamed from: a, reason: collision with root package name */
    private static String f71454a;

    /* renamed from: c, reason: collision with root package name */
    private static String f71456c;
    public static Context mContext;

    /* renamed from: b, reason: collision with root package name */
    private static BeaconConfig.Builder f71455b = BeaconConfig.builder();

    /* renamed from: d, reason: collision with root package name */
    private static boolean f71457d = true;

    @Deprecated
    public static void closeUseInfoEvent() {
    }

    public static void doUploadRecords() {
        EventModule eventModule = (EventModule) com.tencent.beacon.a.c.c.c().a(ModuleName.EVENT);
        if (eventModule != null) {
            eventModule.a(false);
        }
    }

    public static void flushObjectsToDB(boolean z4) {
    }

    public static Map<String, String> getAdditionalInfo() {
        return getAdditionalInfo(null);
    }

    public static String getAppKey() {
        return f71454a;
    }

    public static String getCloudParas(String str) {
        return "";
    }

    public static BeaconPubParams getCommonParams() {
        return BeaconReport.getInstance().getCommonParams(mContext);
    }

    public static String getEventDomain() {
        return com.tencent.beacon.base.net.b.b.f71305c;
    }

    public static String getOpenID(String str) {
        EventModule eventModule = (EventModule) com.tencent.beacon.a.c.c.c().a(ModuleName.EVENT);
        return eventModule != null ? eventModule.b(str) : "";
    }

    public static String getSDKVersion() {
        return BeaconReport.getInstance().getSDKVersion();
    }

    public static String getStrategyDomain() {
        return com.tencent.beacon.base.net.b.b.f71306d;
    }

    public static String getUserID(String str) {
        EventModule eventModule = (EventModule) com.tencent.beacon.a.c.c.c().a(ModuleName.EVENT);
        return eventModule != null ? eventModule.c(str) : "";
    }

    public static void initUserAction(Context context) throws BeaconInitException {
        initUserAction(context, true);
    }

    public static boolean loginEvent(boolean z4, long j4, Map<String, String> map) {
        if (mContext != null) {
            map.put(ProtectedSandApp.s("㉨\u0001"), com.tencent.beacon.a.c.e.l().q());
        }
        return onUserAction(ProtectedSandApp.s("㉩\u0001"), z4, j4, 0L, map, true);
    }

    public static boolean onDTUserAction(Context context, String str, boolean z4, long j4, long j5, Map<String, String> map, boolean z5, boolean z6) {
        if (context == null) {
            return false;
        }
        if (map == null) {
            return onUserAction(str, z4, j4, j5, null, z5, z6);
        }
        com.tencent.beacon.a.c.c.c().a(context);
        com.tencent.beacon.a.c.e l4 = com.tencent.beacon.a.c.e.l();
        com.tencent.beacon.a.c.g e4 = com.tencent.beacon.a.c.g.e();
        HashMap hashMap = new HashMap(map);
        hashMap.put(ProtectedSandApp.s("㉪\u0001"), "" + e4.c());
        hashMap.put(ProtectedSandApp.s("㉫\u0001"), "" + e4.g());
        hashMap.put(ProtectedSandApp.s("㉬\u0001"), "" + l4.o());
        return onUserAction(str, z4, j4, j5, hashMap, z5, z6);
    }

    public static boolean onDTUserActionToTunnel(Context context, String str, String str2, Map<String, String> map, boolean z4, boolean z5) {
        if (context == null) {
            return false;
        }
        if (map == null) {
            return onUserActionToTunnel(str, str2, null, z4, z5);
        }
        com.tencent.beacon.a.c.c.c().a(context);
        com.tencent.beacon.a.c.e l4 = com.tencent.beacon.a.c.e.l();
        com.tencent.beacon.a.c.g e4 = com.tencent.beacon.a.c.g.e();
        HashMap hashMap = new HashMap(map);
        hashMap.put(ProtectedSandApp.s("㉪\u0001"), "" + e4.c());
        hashMap.put(ProtectedSandApp.s("㉫\u0001"), "" + e4.g());
        hashMap.put(ProtectedSandApp.s("㉬\u0001"), "" + l4.o());
        return onUserActionToTunnel(str, str2, hashMap, z4, z5);
    }

    public static void onPageIn(String str) {
        com.tencent.beacon.c.a.a(com.tencent.beacon.event.c.d.d(str));
    }

    public static void onPageOut(String str) {
        com.tencent.beacon.c.a.b(com.tencent.beacon.event.c.d.d(str));
    }

    public static boolean onUserAction(String str, boolean z4, long j4, long j5, Map<String, String> map, boolean z5) {
        return onUserAction(str, z4, j4, j5, map, z5, false);
    }

    public static boolean onUserActionToTunnel(String str, String str2, boolean z4, long j4, long j5, Map<String, String> map, boolean z5, boolean z6) {
        return BeaconReport.getInstance().report(BeaconEvent.builder().withCode(str2).withType(z5 ? EventType.REALTIME : EventType.NORMAL).withParams(map).withAppKey(str).withIsSucceed(z4).build()).isSuccess();
    }

    public static void registerTunnel(TunnelInfo tunnelInfo) {
    }

    public static void setAdditionalInfo(String str, Map<String, String> map) {
        BeaconReport.getInstance().setAdditionalParams(str, map);
    }

    public static void setAppKey(String str) {
        f71454a = str;
    }

    public static void setAppVersion(String str) {
        f71456c = str;
    }

    @Deprecated
    public static void setAutoLaunchEventUsable(boolean z4) {
    }

    public static void setChannelID(String str) {
        BeaconReport.getInstance().setChannelID(str);
    }

    public static void setJsClientId(String str) {
    }

    public static void setLogAble(boolean z4, boolean z5) {
        com.tencent.beacon.base.util.c.a(z4);
        com.tencent.beacon.base.util.c.b(z4);
    }

    public static void setOAID(String str) {
        BeaconReport.getInstance().setOAID(str);
    }

    @Deprecated
    public static void setOldInitMethodEnable(boolean z4) {
        f71457d = z4;
    }

    public static void setOmgId(String str) {
        BeaconReport.getInstance().setOmgID(str);
    }

    public static void setOpenID(String str) {
        BeaconReport.getInstance().setOpenID(null, str);
    }

    public static void setQQ(String str) {
        BeaconReport.getInstance().setQQ(str);
    }

    public static void setReportDomain(String str, String str2) {
        com.tencent.beacon.base.net.b.b.a(str, str2);
    }

    public static void setReportIP(String str, String str2) {
        com.tencent.beacon.base.net.b.b.b(str, str2);
    }

    public static void setScheduledService(ScheduledExecutorService scheduledExecutorService) {
        f71455b.setExecutorService(scheduledExecutorService);
    }

    public static void setStrictMode(boolean z4) {
        BeaconReport.getInstance().setStrictMode(z4);
    }

    public static void setUploadMode(boolean z4) {
        if (z4) {
            BeaconReport.getInstance().pauseUpload(true);
        } else {
            BeaconReport.getInstance().resumeUpload();
        }
    }

    public static void setUserID(String str, String str2) {
        BeaconReport.getInstance().setUserID(str, str2);
    }

    public static Map<String, String> getAdditionalInfo(String str) {
        EventModule eventModule = (EventModule) com.tencent.beacon.a.c.c.c().a(ModuleName.EVENT);
        if (eventModule != null) {
            return eventModule.a(str);
        }
        return null;
    }

    public static void initUserAction(Context context, boolean z4) throws BeaconInitException {
        initUserAction(context, z4, 0L);
    }

    public static boolean onUserAction(String str, Map<String, String> map, boolean z4, boolean z5) {
        return onUserAction(str, true, -1L, -1L, map, z4, z5);
    }

    public static void setAdditionalInfo(Map<String, String> map) {
        setAdditionalInfo(null, map);
    }

    public static void setUserID(String str) {
        setUserID(null, str);
    }

    public static void initUserAction(Context context, boolean z4, long j4) throws BeaconInitException {
        initUserAction(context, z4, j4, null, null);
    }

    public static boolean onUserAction(String str, boolean z4, long j4, long j5, Map<String, String> map, boolean z5, boolean z6) {
        return BeaconReport.getInstance().report(BeaconEvent.builder().withCode(str).withType(z5 ? EventType.REALTIME : EventType.NORMAL).withParams(map).withAppKey(f71454a).withIsSucceed(z4).build()).isSuccess();
    }

    @TargetApi(14)
    public static void initUserAction(Context context, boolean z4, long j4, InitHandleListener initHandleListener, UploadHandleListener uploadHandleListener) throws BeaconInitException {
        if (f71457d) {
            mContext = context;
            BeaconReport.getInstance().start(context, f71454a, f71455b.build());
        }
    }

    public static boolean onUserActionToTunnel(String str, String str2, Map<String, String> map, boolean z4, boolean z5) {
        return onUserActionToTunnel(str, str2, true, -1L, -1L, map, z4, z5);
    }
}
