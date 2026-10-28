package com.google.android.gms.common.util;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.common.zzp;
import com.google.android.gms.internal.common.zzw;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.text.m0;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@KeepForSdk
/* loaded from: classes5.dex */
public class HttpUtils {
    private static final Pattern zza = Pattern.compile(ProtectedSandApp.s("쯲"));
    private static final Pattern zzb = Pattern.compile(ProtectedSandApp.s("쯳"));
    private static final Pattern zzc = Pattern.compile(ProtectedSandApp.s("쯴"));

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
            zzw zza2 = zzw.zza(zzp.zzb('='));
            Iterator it = zzw.zza(zzp.zzb(m0.amp)).zzb().zzc(rawQuery).iterator();
            while (it.hasNext()) {
                List zzd = zza2.zzd((String) it.next());
                if (zzd.isEmpty() || zzd.size() > 2) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("쯵"));
                }
                emptyMap.put(zza((String) zzd.get(0), str), zzd.size() == 2 ? zza((String) zzd.get(1), str) : null);
            }
        }
        return emptyMap;
    }

    private static String zza(String str, String str2) {
        if (str2 == null) {
            try {
                str2 = ProtectedSandApp.s("쯶");
            } catch (UnsupportedEncodingException e4) {
                throw new IllegalArgumentException(e4);
            }
        }
        return URLDecoder.decode(str, str2);
    }
}
