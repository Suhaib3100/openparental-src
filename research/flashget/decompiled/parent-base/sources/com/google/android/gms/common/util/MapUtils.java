package com.google.android.gms.common.util;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@KeepForSdk
/* loaded from: classes5.dex */
public class MapUtils {
    @KeepForSdk
    public static void writeStringMapToJson(@o0 StringBuilder sb, @o0 HashMap<String, String> hashMap) {
        sb.append(ProtectedSandApp.s("찊"));
        boolean z4 = true;
        for (String str : hashMap.keySet()) {
            if (!z4) {
                sb.append(ProtectedSandApp.s("찋"));
            }
            String str2 = hashMap.get(str);
            String s4 = ProtectedSandApp.s("찌");
            androidx.concurrent.futures.a.a(sb, s4, str, ProtectedSandApp.s("찍"));
            if (str2 == null) {
                sb.append(ProtectedSandApp.s("찎"));
            } else {
                androidx.concurrent.futures.a.a(sb, s4, str2, s4);
            }
            z4 = false;
        }
        sb.append(ProtectedSandApp.s("찏"));
    }
}
