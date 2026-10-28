package com.google.android.gms.common.util;

import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.common.zzo;
import com.google.android.gms.internal.common.zzx;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.text.Typography;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class HttpUtils {
    private static final Pattern zza = Pattern.compile(ProtectedSandApp.s("ౘ"));
    private static final Pattern zzb = Pattern.compile(ProtectedSandApp.s("ౙ"));
    private static final Pattern zzc = Pattern.compile(ProtectedSandApp.s("ౚ"));

    private HttpUtils() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.HashMap] */
    @o0
    @KeepForSdk
    public static Map<String, String> parse(@o0 URI uri, @o0 String str) {
        ?? emptyMap = Collections.emptyMap();
        String rawQuery = uri.getRawQuery();
        if (rawQuery != null && rawQuery.length() > 0) {
            emptyMap = new HashMap();
            zzx zzc2 = zzx.zzc(zzo.zzb('='));
            Iterator it = zzx.zzc(zzo.zzb(Typography.f27128d)).zzb().zzd(rawQuery).iterator();
            while (it.hasNext()) {
                List zzf = zzc2.zzf((String) it.next());
                if (zzf.isEmpty() || zzf.size() > 2) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("\u0c5b"));
                }
                emptyMap.put(zza((String) zzf.get(0), str), zzf.size() == 2 ? zza((String) zzf.get(1), str) : null);
            }
        }
        return emptyMap;
    }

    private static String zza(String str, String str2) {
        if (str2 == null) {
            str2 = ProtectedSandApp.s("\u0c5c");
        }
        try {
            return URLDecoder.decode(str, str2);
        } catch (UnsupportedEncodingException e6) {
            throw new IllegalArgumentException(e6);
        }
    }
}
