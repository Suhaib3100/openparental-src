package com.google.firebase.remoteconfig.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: DefaultsXmlParser.java */
/* loaded from: classes2.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    private static final String f18059a = ProtectedSandApp.s("ᧉ");

    /* renamed from: b, reason: collision with root package name */
    private static final String f18060b = ProtectedSandApp.s("\u19ca");

    /* renamed from: c, reason: collision with root package name */
    private static final String f18061c = ProtectedSandApp.s("\u19cb");

    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007c A[Catch: IOException | XmlPullParserException -> 0x0085, TryCatch #0 {IOException | XmlPullParserException -> 0x0085, blocks: (B:3:0x0005, B:7:0x000c, B:12:0x001e, B:14:0x0080, B:19:0x0026, B:23:0x003a, B:30:0x0046, B:40:0x0077, B:42:0x007c, B:44:0x0055, B:47:0x0063), top: B:2:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map<java.lang.String, java.lang.String> a(android.content.Context r7, int r8) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            android.content.res.Resources r7 = r7.getResources()     // Catch: java.lang.Throwable -> L85
            if (r7 != 0) goto Lc
            return r0
        Lc:
            android.content.res.XmlResourceParser r7 = r7.getXml(r8)     // Catch: java.lang.Throwable -> L85
            int r8 = r7.getEventType()     // Catch: java.lang.Throwable -> L85
            r1 = 0
            r2 = r1
            r3 = r2
            r4 = r3
        L18:
            r5 = 1
            if (r8 == r5) goto L85
            r6 = 2
            if (r8 != r6) goto L23
            java.lang.String r2 = r7.getName()     // Catch: java.lang.Throwable -> L85
            goto L80
        L23:
            r6 = 3
            if (r8 != r6) goto L41
            java.lang.String r8 = r7.getName()     // Catch: java.lang.Throwable -> L85
            java.lang.String r2 = "ᧆ"
            java.lang.String r2 = com.flashget.kidsdownloader.ProtectedSandApp.s(r2)     // Catch: java.lang.Throwable -> L85
            boolean r8 = r8.equals(r2)     // Catch: java.lang.Throwable -> L85
            if (r8 == 0) goto L3f
            if (r3 == 0) goto L3d
            if (r4 == 0) goto L3d
            r0.put(r3, r4)     // Catch: java.lang.Throwable -> L85
        L3d:
            r3 = r1
            r4 = r3
        L3f:
            r2 = r1
            goto L80
        L41:
            r6 = 4
            if (r8 != r6) goto L80
            if (r2 == 0) goto L80
            int r8 = r2.hashCode()     // Catch: java.lang.Throwable -> L85
            r6 = 106079(0x19e5f, float:1.48648E-40)
            if (r8 == r6) goto L63
            r6 = 111972721(0x6ac9171, float:6.4912916E-35)
            if (r8 == r6) goto L55
            goto L71
        L55:
            java.lang.String r8 = "ᧇ"
            java.lang.String r8 = com.flashget.kidsdownloader.ProtectedSandApp.s(r8)     // Catch: java.lang.Throwable -> L85
            boolean r8 = r2.equals(r8)     // Catch: java.lang.Throwable -> L85
            if (r8 == 0) goto L71
            r8 = r5
            goto L72
        L63:
            java.lang.String r8 = "ᧈ"
            java.lang.String r8 = com.flashget.kidsdownloader.ProtectedSandApp.s(r8)     // Catch: java.lang.Throwable -> L85
            boolean r8 = r2.equals(r8)     // Catch: java.lang.Throwable -> L85
            if (r8 == 0) goto L71
            r8 = 0
            goto L72
        L71:
            r8 = -1
        L72:
            if (r8 == 0) goto L7c
            if (r8 == r5) goto L77
            goto L80
        L77:
            java.lang.String r4 = r7.getText()     // Catch: java.lang.Throwable -> L85
            goto L80
        L7c:
            java.lang.String r3 = r7.getText()     // Catch: java.lang.Throwable -> L85
        L80:
            int r8 = r7.next()     // Catch: java.lang.Throwable -> L85
            goto L18
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.w.a(android.content.Context, int):java.util.Map");
    }
}
