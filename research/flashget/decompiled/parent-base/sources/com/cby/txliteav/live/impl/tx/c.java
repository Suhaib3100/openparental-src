package com.cby.txliteav.live.impl.tx;

import android.util.Base64;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: GenerateUserSig.java */
/* loaded from: classes3.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    public static final int f46606c = 1600020372;

    /* renamed from: d, reason: collision with root package name */
    private static final int f46607d = 604800;

    /* renamed from: a, reason: collision with root package name */
    public static final String f46604a = ProtectedSandApp.s("ൕ");

    /* renamed from: b, reason: collision with root package name */
    public static final String f46605b = ProtectedSandApp.s("ൖ");

    /* renamed from: e, reason: collision with root package name */
    public static final String f46608e = ProtectedSandApp.s("ൗ");

    /* renamed from: f, reason: collision with root package name */
    public static final String f46609f = ProtectedSandApp.s("൘");

    /* renamed from: g, reason: collision with root package name */
    public static final String f46610g = ProtectedSandApp.s("൙");

    /* renamed from: h, reason: collision with root package name */
    public static final String f46611h = ProtectedSandApp.s("൚");

    /* renamed from: i, reason: collision with root package name */
    public static final String f46612i = ProtectedSandApp.s("൛");

    /* renamed from: j, reason: collision with root package name */
    public static final String f46613j = ProtectedSandApp.s("൜");

    /* renamed from: k, reason: collision with root package name */
    private static final char[] f46614k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    private static byte[] a(byte[] bArr) {
        byte[] bytes = new String(Base64.encode(bArr, 2)).getBytes();
        for (int i4 = 0; i4 < bytes.length; i4++) {
            byte b5 = bytes[i4];
            if (b5 == 43) {
                bytes[i4] = 42;
            } else if (b5 == 47) {
                bytes[i4] = 45;
            } else if (b5 == 61) {
                bytes[i4] = 95;
            }
        }
        return bytes;
    }

    private static String b(byte[] bArr) {
        char[] cArr = new char[bArr.length << 1];
        int i4 = 0;
        for (byte b5 : bArr) {
            int i5 = i4 + 1;
            char[] cArr2 = f46614k;
            cArr[i4] = cArr2[(b5 & 240) >>> 4];
            i4 += 2;
            cArr[i5] = cArr2[b5 & com.google.common.base.c.f54871q];
        }
        return new String(cArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0086 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String c(long r15, java.lang.String r17, long r18, byte[] r20, java.lang.String r21) {
        /*
            r1 = r20
            long r2 = java.lang.System.currentTimeMillis()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r9 = r2 / r4
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r0 = "൝"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)     // Catch: org.json.JSONException -> L51
            java.lang.String r3 = "൞"
            java.lang.String r3 = com.flashget.parentalcontrol.ProtectedSandApp.s(r3)     // Catch: org.json.JSONException -> L51
            r2.put(r0, r3)     // Catch: org.json.JSONException -> L51
            java.lang.String r0 = "ൟ"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)     // Catch: org.json.JSONException -> L51
            r3 = r17
            r2.put(r0, r3)     // Catch: org.json.JSONException -> L4e
            java.lang.String r0 = "ൠ"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)     // Catch: org.json.JSONException -> L4e
            r4 = r15
            r2.put(r0, r4)     // Catch: org.json.JSONException -> L4a
            java.lang.String r0 = "ൡ"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)     // Catch: org.json.JSONException -> L4a
            r11 = r18
            r2.put(r0, r11)     // Catch: org.json.JSONException -> L48
            java.lang.String r0 = "ൢ"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)     // Catch: org.json.JSONException -> L48
            r2.put(r0, r9)     // Catch: org.json.JSONException -> L48
            goto L59
        L48:
            r0 = move-exception
            goto L56
        L4a:
            r0 = move-exception
        L4b:
            r11 = r18
            goto L56
        L4e:
            r0 = move-exception
            r4 = r15
            goto L4b
        L51:
            r0 = move-exception
            r4 = r15
            r3 = r17
            goto L4b
        L56:
            r0.printStackTrace()
        L59:
            if (r1 == 0) goto L70
            r0 = 2
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r0)
            java.lang.String r0 = "ൣ"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)     // Catch: org.json.JSONException -> L6a
            r2.put(r0, r1)     // Catch: org.json.JSONException -> L6a
            goto L6e
        L6a:
            r0 = move-exception
            r0.printStackTrace()
        L6e:
            r14 = r1
            goto L72
        L70:
            r0 = 0
            r14 = r0
        L72:
            r6 = r15
            r8 = r17
            r11 = r18
            r13 = r21
            java.lang.String r0 = f(r6, r8, r9, r11, r13, r14)
            int r1 = r0.length()
            if (r1 != 0) goto L86
            java.lang.String r0 = ""
            return r0
        L86:
            java.lang.String r1 = "\u0d64"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)     // Catch: org.json.JSONException -> L90
            r2.put(r1, r0)     // Catch: org.json.JSONException -> L90
            goto L94
        L90:
            r0 = move-exception
            r0.printStackTrace()
        L94:
            java.util.zip.Deflater r0 = new java.util.zip.Deflater
            r0.<init>()
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "\u0d65"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r2)
            byte[] r1 = r1.getBytes(r2)
            r0.setInput(r1)
            r0.finish()
            r1 = 2048(0x800, float:2.87E-42)
            byte[] r1 = new byte[r1]
            int r2 = r0.deflate(r1)
            r0.end()
            java.lang.String r0 = new java.lang.String
            r3 = 0
            byte[] r1 = java.util.Arrays.copyOfRange(r1, r3, r2)
            byte[] r1 = a(r1)
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cby.txliteav.live.impl.tx.c.c(long, java.lang.String, long, byte[], java.lang.String):java.lang.String");
    }

    public static String d(String str) {
        return c(1600020372L, str, 604800L, null, ProtectedSandApp.s("ൗ"));
    }

    public static String e(String str, Boolean bool) {
        String str2;
        StringBuilder a5 = androidx.constraintlayout.core.e.a(bool.booleanValue() ? ProtectedSandApp.s("൚") : ProtectedSandApp.s("൛"), str);
        a5.append(Long.toHexString(1707993000L).toUpperCase());
        try {
            str2 = b(MessageDigest.getInstance(ProtectedSandApp.s("൦")).digest(a5.toString().getBytes(ProtectedSandApp.s("\u0d65"))));
        } catch (UnsupportedEncodingException e4) {
            e4.printStackTrace();
            str2 = null;
            StringBuilder a6 = androidx.appcompat.view.g.a(ProtectedSandApp.s("൧"), str2, ProtectedSandApp.s("൨"));
            a6.append(Long.toHexString(1707993000L).toUpperCase());
            return a6.toString();
        } catch (NoSuchAlgorithmException e5) {
            e5.printStackTrace();
            str2 = null;
            StringBuilder a62 = androidx.appcompat.view.g.a(ProtectedSandApp.s("൧"), str2, ProtectedSandApp.s("൨"));
            a62.append(Long.toHexString(1707993000L).toUpperCase());
            return a62.toString();
        }
        StringBuilder a622 = androidx.appcompat.view.g.a(ProtectedSandApp.s("൧"), str2, ProtectedSandApp.s("൨"));
        a622.append(Long.toHexString(1707993000L).toUpperCase());
        return a622.toString();
    }

    private static String f(long j4, String str, long j5, long j6, String str2, String str3) {
        String s4 = ProtectedSandApp.s("൩");
        String s5 = ProtectedSandApp.s("\u0d65");
        StringBuilder a5 = b.a(ProtectedSandApp.s("൪"), str, ProtectedSandApp.s("൫"), j4);
        androidx.multidex.c.a(a5, ProtectedSandApp.s("൬"), j5, ProtectedSandApp.s("൭"));
        String s6 = ProtectedSandApp.s("൮");
        String a6 = android.support.v4.media.session.b.a(a5, j6, s6);
        if (str3 != null) {
            a6 = a.a(a6, ProtectedSandApp.s("൯"), str3, s6);
        }
        try {
            byte[] bytes = str2.getBytes(s5);
            Mac mac = Mac.getInstance(s4);
            mac.init(new SecretKeySpec(bytes, s4));
            return new String(Base64.encode(mac.doFinal(a6.getBytes(s5)), 2));
        } catch (UnsupportedEncodingException | InvalidKeyException | NoSuchAlgorithmException unused) {
            return "";
        }
    }
}
