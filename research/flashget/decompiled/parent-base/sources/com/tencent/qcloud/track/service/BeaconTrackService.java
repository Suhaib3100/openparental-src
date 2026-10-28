package com.tencent.qcloud.track.service;

import android.content.Context;
import androidx.constraintlayout.core.e;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.event.open.BeaconEvent;
import com.tencent.beacon.event.open.BeaconReport;
import com.tencent.beacon.event.open.EventResult;
import com.tencent.beacon.event.open.EventType;
import com.tencent.qcloud.track.TrackExecutors;
import com.tencent.qcloud.track.utils.EventFileUtils;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes7.dex */
public class BeaconTrackService extends ATrackService {
    private static final String TAG = ProtectedSandApp.s("宀\u0001");
    private String beaconKey;
    private Context context;

    private void directReport(String str, Map<String, String> map) {
        EventResult report = BeaconReport.getInstance().report(BeaconEvent.builder().withAppKey(this.beaconKey).withCode(str).withType(EventType.NORMAL).withParams(map).build());
        if (isDebug()) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("孺\u0001"));
            for (String str2 : map.keySet()) {
                StringBuilder a5 = e.a(str2, ProtectedSandApp.s("孻\u0001"));
                a5.append(map.get(str2));
                a5.append(ProtectedSandApp.s("孼\u0001"));
                sb.append(a5.toString());
            }
            sb.delete(sb.length() - 2, sb.length()).append(ProtectedSandApp.s("孽\u0001"));
            String.format(ProtectedSandApp.s("孾\u0001"), this.beaconKey, str, sb, Long.valueOf(report.eventID), Integer.valueOf(report.errorCode), report.errMsg);
        }
    }

    public static boolean isInclude() {
        return true;
    }

    private boolean isSimpleDataTrackService() {
        return ProtectedSandApp.s("孿\u0001").equals(this.beaconKey);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$report$0(String str, Map map) {
        EventFileUtils.appendEventToFile(this.context, str, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$report$1() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        EventFileUtils.readEventFromFile(this.context, arrayList, arrayList2);
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            directReport((String) arrayList.get(i4), (Map) arrayList2.get(i4));
        }
    }

    public void init(String str) {
        if (this.isInit) {
            return;
        }
        this.isInit = true;
        this.beaconKey = str;
        if (isInclude()) {
            BeaconReport.getInstance().setLogAble(isDebug());
        }
    }

    @Override // com.tencent.qcloud.track.IReport
    public void report(final String str, final Map<String, String> map) {
        if (!this.isInit && !isSimpleDataTrackService()) {
            TrackExecutors.COMMAND_EXECUTOR.execute(new Runnable() { // from class: com.tencent.qcloud.track.service.a
                @Override // java.lang.Runnable
                public final void run() {
                    BeaconTrackService.this.lambda$report$0(str, map);
                }
            });
        }
        if (!isCloseReport() && this.isInit && isInclude()) {
            if (!isSimpleDataTrackService() && EventFileUtils.eventFileExists(this.context)) {
                TrackExecutors.COMMAND_EXECUTOR.execute(new Runnable() { // from class: com.tencent.qcloud.track.service.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        BeaconTrackService.this.lambda$report$1();
                    }
                });
            }
            directReport(str, map);
        }
    }

    public void setContext(Context context) {
        this.context = context;
    }

    @Override // com.tencent.qcloud.track.service.ATrackService
    public void setDebug(boolean z4) {
        super.setDebug(z4);
        if (isInclude()) {
            BeaconReport.getInstance().setLogAble(z4);
        }
    }
}
