package org.minidns.dnsserverlookup;

import java.io.File;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import org.minidns.util.i;

/* compiled from: UnixUsingEtcResolvConf.java */
/* loaded from: classes.dex */
public final class e extends a {

    /* renamed from: c, reason: collision with root package name */
    public static final int f87306c = 2000;

    /* renamed from: g, reason: collision with root package name */
    private static List<String> f87310g;

    /* renamed from: h, reason: collision with root package name */
    private static long f87311h;

    /* renamed from: e, reason: collision with root package name */
    private static final String f87308e = "/etc/resolv.conf";

    /* renamed from: b, reason: collision with root package name */
    public static final d f87305b = new e();

    /* renamed from: d, reason: collision with root package name */
    private static final Logger f87307d = Logger.getLogger(e.class.getName());

    /* renamed from: f, reason: collision with root package name */
    private static final Pattern f87309f = Pattern.compile("^nameserver\\s+(.*)$");

    private e() {
        super(e.class.getSimpleName(), 2000);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // org.minidns.dnsserverlookup.a, org.minidns.dnsserverlookup.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<java.lang.String> getDnsServerAddresses() {
        /*
            r9 = this;
            java.lang.String r0 = "Could not close reader"
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "/etc/resolv.conf"
            r1.<init>(r2)
            boolean r2 = r1.exists()
            r3 = 0
            if (r2 != 0) goto L11
            return r3
        L11:
            long r4 = r1.lastModified()
            long r6 = org.minidns.dnsserverlookup.e.f87311h
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 != 0) goto L20
            java.util.List<java.lang.String> r2 = org.minidns.dnsserverlookup.e.f87310g
            if (r2 == 0) goto L20
            return r2
        L20:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7b
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7b
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7b
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7b
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7b
            r7.<init>(r8, r1)     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7b
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7b
        L36:
            java.lang.String r1 = r6.readLine()     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L58
            if (r1 == 0) goto L5a
            java.util.regex.Pattern r7 = org.minidns.dnsserverlookup.e.f87309f     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L58
            java.util.regex.Matcher r1 = r7.matcher(r1)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L58
            boolean r7 = r1.matches()     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L58
            if (r7 == 0) goto L36
            r7 = 1
            java.lang.String r1 = r1.group(r7)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L58
            java.lang.String r1 = r1.trim()     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L58
            r2.add(r1)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L58
            goto L36
        L55:
            r1 = move-exception
            r3 = r6
            goto L95
        L58:
            r1 = move-exception
            goto L7d
        L5a:
            r6.close()     // Catch: java.io.IOException -> L5e
            goto L66
        L5e:
            r1 = move-exception
            java.util.logging.Logger r6 = org.minidns.dnsserverlookup.e.f87307d
            java.util.logging.Level r7 = java.util.logging.Level.WARNING
            r6.log(r7, r0, r1)
        L66:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L74
            java.util.logging.Logger r0 = org.minidns.dnsserverlookup.e.f87307d
            java.lang.String r1 = "Could not find any nameservers in /etc/resolv.conf"
            r0.fine(r1)
            return r3
        L74:
            org.minidns.dnsserverlookup.e.f87310g = r2
            org.minidns.dnsserverlookup.e.f87311h = r4
            return r2
        L79:
            r1 = move-exception
            goto L95
        L7b:
            r1 = move-exception
            r6 = r3
        L7d:
            java.util.logging.Logger r2 = org.minidns.dnsserverlookup.e.f87307d     // Catch: java.lang.Throwable -> L55
            java.util.logging.Level r4 = java.util.logging.Level.WARNING     // Catch: java.lang.Throwable -> L55
            java.lang.String r5 = "Could not read from /etc/resolv.conf"
            r2.log(r4, r5, r1)     // Catch: java.lang.Throwable -> L55
            if (r6 == 0) goto L94
            r6.close()     // Catch: java.io.IOException -> L8c
            goto L94
        L8c:
            r1 = move-exception
            java.util.logging.Logger r2 = org.minidns.dnsserverlookup.e.f87307d
            java.util.logging.Level r4 = java.util.logging.Level.WARNING
            r2.log(r4, r0, r1)
        L94:
            return r3
        L95:
            if (r3 == 0) goto La3
            r3.close()     // Catch: java.io.IOException -> L9b
            goto La3
        L9b:
            r2 = move-exception
            java.util.logging.Logger r3 = org.minidns.dnsserverlookup.e.f87307d
            java.util.logging.Level r4 = java.util.logging.Level.WARNING
            r3.log(r4, r0, r2)
        La3:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.minidns.dnsserverlookup.e.getDnsServerAddresses():java.util.List");
    }

    @Override // org.minidns.dnsserverlookup.d
    public boolean isAvailable() {
        if (i.a()) {
            return false;
        }
        try {
            return new File("/etc/resolv.conf").exists();
        } catch (SecurityException e4) {
            f87307d.log(Level.FINE, "Access to /etc/resolv.conf not possible", (Throwable) e4);
            return false;
        }
    }
}
