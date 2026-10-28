package com.tencent.liteav.base.system;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.Log;
import java.security.MessageDigest;

/* loaded from: classes7.dex */
final class p {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f71912a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX WARN: Code restructure failed: missing block: B:52:0x01de, code lost:
    
        if (r3 == null) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01f8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0182 A[Catch: all -> 0x0186, Exception -> 0x0189, TryCatch #12 {Exception -> 0x0189, all -> 0x0186, blocks: (B:36:0x015e, B:38:0x0182, B:39:0x018c, B:41:0x01aa, B:42:0x01ad), top: B:35:0x015e }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01aa A[Catch: all -> 0x0186, Exception -> 0x0189, TryCatch #12 {Exception -> 0x0189, all -> 0x0186, blocks: (B:36:0x015e, B:38:0x0182, B:39:0x018c, B:41:0x01aa, B:42:0x01ad), top: B:35:0x015e }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e5 A[LOOP:0: B:67:0x00db->B:69:0x00e5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010d A[EDGE_INSN: B:70:0x010d->B:71:0x010d BREAK  A[LOOP:0: B:67:0x00db->B:69:0x00e5], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0112 A[LOOP:1: B:72:0x0110->B:73:0x0112, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.base.system.p.a(java.lang.String):java.lang.String");
    }

    private static String b(String str) {
        if (str == null) {
            return "";
        }
        try {
            byte[] digest = MessageDigest.getInstance(ProtectedSandApp.s("卍\u0001")).digest(str.getBytes(ProtectedSandApp.s("午\u0001")));
            char[] cArr = new char[digest.length << 1];
            int i4 = 0;
            for (byte b5 : digest) {
                int i5 = i4 + 1;
                char[] cArr2 = f71912a;
                cArr[i4] = cArr2[(b5 & 240) >>> 4];
                i4 += 2;
                cArr[i5] = cArr2[b5 & com.google.common.base.c.f54871q];
            }
            return new String(cArr);
        } catch (Exception e4) {
            Log.e(ProtectedSandApp.s("卄\u0001"), ProtectedSandApp.s("华\u0001"), e4);
            return "";
        }
    }
}
