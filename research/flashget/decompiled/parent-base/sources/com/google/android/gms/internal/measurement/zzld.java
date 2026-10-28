package com.google.android.gms.internal.measurement;

import androidx.constraintlayout.core.e;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.text.m0;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
/* loaded from: classes5.dex */
final class zzld {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    static String zza(zzlc zzlcVar, String str) {
        StringBuilder a5 = e.a(ProtectedSandApp.s("픦"), str);
        zza(zzlcVar, a5, 0);
        return a5.toString();
    }

    private static void zza(int i4, StringBuilder sb) {
        while (i4 > 0) {
            char[] cArr = zza;
            int length = i4 > cArr.length ? cArr.length : i4;
            sb.append(cArr, 0, length);
            i4 -= length;
        }
    }

    static void zza(StringBuilder sb, int i4, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zza(sb, i4, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zza(sb, i4, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        zza(i4, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i5 = 1; i5 < str.length(); i5++) {
                char charAt = str.charAt(i5);
                if (Character.isUpperCase(charAt)) {
                    sb2.append(ProtectedSandApp.s("픮"));
                }
                sb2.append(Character.toLowerCase(charAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        boolean z4 = obj instanceof String;
        String s4 = ProtectedSandApp.s("픯");
        if (z4) {
            sb.append(s4);
            sb.append(zzmg.zza(zzik.zza((String) obj)));
            sb.append(m0.quote);
            return;
        }
        if (obj instanceof zzik) {
            sb.append(s4);
            sb.append(zzmg.zza((zzik) obj));
            sb.append(m0.quote);
            return;
        }
        boolean z5 = obj instanceof zzjt;
        String s5 = ProtectedSandApp.s("픰");
        String s6 = ProtectedSandApp.s("픱");
        String s7 = ProtectedSandApp.s("픲");
        if (z5) {
            sb.append(s7);
            zza((zzjt) obj, sb, i4 + 2);
            sb.append(s6);
            zza(i4, sb);
            sb.append(s5);
            return;
        }
        if (obj instanceof Map.Entry) {
            sb.append(s7);
            Map.Entry entry = (Map.Entry) obj;
            int i6 = i4 + 2;
            zza(sb, i6, ProtectedSandApp.s("픳"), entry.getKey());
            zza(sb, i6, ProtectedSandApp.s("픴"), entry.getValue());
            sb.append(s6);
            zza(i4, sb);
            sb.append(s5);
            return;
        }
        sb.append(ProtectedSandApp.s("픵"));
        sb.append(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0169, code lost:
    
        if (r5.containsKey(r10 + androidx.core.content.f.a(r9, 5, 0)) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0191, code lost:
    
        if (((java.lang.Boolean) r7).booleanValue() == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0193, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01a4, code lost:
    
        if (((java.lang.Integer) r7).intValue() == 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b6, code lost:
    
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01cc, code lost:
    
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void zza(com.google.android.gms.internal.measurement.zzlc r20, java.lang.StringBuilder r21, int r22) {
        /*
            Method dump skipped, instructions count: 585
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzld.zza(com.google.android.gms.internal.measurement.zzlc, java.lang.StringBuilder, int):void");
    }
}
