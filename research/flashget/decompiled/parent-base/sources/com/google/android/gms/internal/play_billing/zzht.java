package com.google.android.gms.internal.play_billing;

import androidx.constraintlayout.core.e;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.text.m0;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
final class zzht {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    static String zza(zzhr zzhrVar, String str) {
        StringBuilder a5 = e.a(ProtectedSandApp.s("ퟸ"), str);
        zzd(zzhrVar, a5, 0);
        return a5.toString();
    }

    static void zzb(StringBuilder sb, int i4, String str, Object obj) {
        String replace;
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzb(sb, i4, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzb(sb, i4, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        zzc(i4, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i5 = 1; i5 < str.length(); i5++) {
                char charAt = str.charAt(i5);
                if (Character.isUpperCase(charAt)) {
                    sb2.append(ProtectedSandApp.s("ퟹ"));
                }
                sb2.append(Character.toLowerCase(charAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        boolean z4 = obj instanceof String;
        String s4 = ProtectedSandApp.s("ퟺ");
        if (z4) {
            sb.append(s4);
            String str2 = (String) obj;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            for (int i6 = 0; i6 < str2.length(); i6++) {
                char charAt2 = str2.charAt(i6);
                if (charAt2 < ' ' || charAt2 > '~') {
                    replace = zzio.zza(str2.getBytes(StandardCharsets.UTF_8));
                    break;
                }
                if (charAt2 == '\"') {
                    z7 = true;
                } else if (charAt2 == '\'') {
                    z6 = true;
                } else if (charAt2 == '\\') {
                    z5 = true;
                }
            }
            if (z5) {
                str2 = str2.replace(ProtectedSandApp.s("ퟻ"), ProtectedSandApp.s("\ud7fc"));
            }
            replace = z6 ? str2.replace(ProtectedSandApp.s("\ud7fd"), ProtectedSandApp.s("\ud7fe")) : str2;
            if (z7) {
                replace = replace.replace(ProtectedSandApp.s("\ud7ff"), ProtectedSandApp.s("\ud800"));
            }
            sb.append(replace);
            sb.append(m0.quote);
            return;
        }
        if (obj instanceof zzfp) {
            sb.append(s4);
            sb.append(zzio.zza(((zzfp) obj).zzm()));
            sb.append(m0.quote);
            return;
        }
        boolean z10 = obj instanceof zzgp;
        String s5 = ProtectedSandApp.s("\ud801");
        String s6 = ProtectedSandApp.s("\ud802");
        String s7 = ProtectedSandApp.s("\ud803");
        if (z10) {
            sb.append(s7);
            zzd((zzgp) obj, sb, i4 + 2);
            sb.append(s6);
            zzc(i4, sb);
            sb.append(s5);
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(ProtectedSandApp.s("\ud806"));
            sb.append(obj);
            return;
        }
        int i7 = i4 + 2;
        sb.append(s7);
        Map.Entry entry = (Map.Entry) obj;
        zzb(sb, i7, ProtectedSandApp.s("\ud804"), entry.getKey());
        zzb(sb, i7, ProtectedSandApp.s("\ud805"), entry.getValue());
        sb.append(s6);
        zzc(i4, sb);
        sb.append(s5);
    }

    private static void zzc(int i4, StringBuilder sb) {
        while (i4 > 0) {
            int i5 = 80;
            if (i4 <= 80) {
                i5 = i4;
            }
            sb.append(zza, 0, i5);
            i4 -= i5;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0199, code lost:
    
        if (((java.lang.Boolean) r7).booleanValue() == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x019b, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01a9, code lost:
    
        if (((java.lang.Integer) r7).intValue() == 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01bb, code lost:
    
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01d1, code lost:
    
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e9, code lost:
    
        if (r13 != false) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void zzd(com.google.android.gms.internal.play_billing.zzhr r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instructions count: 585
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzht.zzd(com.google.android.gms.internal.play_billing.zzhr, java.lang.StringBuilder, int):void");
    }
}
