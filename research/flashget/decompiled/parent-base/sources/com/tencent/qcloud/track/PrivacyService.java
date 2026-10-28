package com.tencent.qcloud.track;

import android.content.Context;
import android.os.Build;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.track.utils.NetworkUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class PrivacyService {
    public static void closeReport() {
        QCloudTrackService.getInstance().setIsCloseReport(true);
    }

    public static Map<String, String> getPrivacyParams(Context context) {
        HashMap hashMap = new HashMap();
        hashMap.put(ProtectedSandApp.s("孞\u0001"), Build.VERSION.RELEASE);
        hashMap.put(ProtectedSandApp.s("孟\u0001"), NetworkUtils.getLocalMachineIP());
        hashMap.put(ProtectedSandApp.s("孠\u0001"), NetworkUtils.getNetworkType(context));
        return hashMap;
    }
}
