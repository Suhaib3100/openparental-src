package com.google.android.gms.common.util;

import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class MapUtils {
    @KeepForSdk
    public static void writeStringMapToJson(@o0 StringBuilder sb, @o0 HashMap<String, String> hashMap) {
        sb.append(ProtectedSandApp.s("\u0c70"));
        boolean z5 = true;
        for (String str : hashMap.keySet()) {
            if (!z5) {
                sb.append(ProtectedSandApp.s("\u0c71"));
            }
            String str2 = hashMap.get(str);
            String s5 = ProtectedSandApp.s("\u0c72");
            sb.append(s5);
            sb.append(str);
            sb.append(ProtectedSandApp.s("\u0c73"));
            if (str2 == null) {
                sb.append(ProtectedSandApp.s("\u0c74"));
            } else {
                sb.append(s5);
                sb.append(str2);
                sb.append(s5);
            }
            z5 = false;
        }
        sb.append(ProtectedSandApp.s("\u0c75"));
    }
}
