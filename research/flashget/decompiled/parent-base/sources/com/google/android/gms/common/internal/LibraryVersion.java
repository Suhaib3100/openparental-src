package com.google.android.gms.common.internal;

import androidx.annotation.m1;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@KeepForSdk
@Deprecated
/* loaded from: classes5.dex */
public class LibraryVersion {
    private static final GmsLogger zza = new GmsLogger(ProtectedSandApp.s("쫞"), "");
    private static final LibraryVersion zzb = new LibraryVersion();
    private final ConcurrentHashMap zzc = new ConcurrentHashMap();

    @m1
    protected LibraryVersion() {
    }

    @o0
    @KeepForSdk
    public static LibraryVersion getInstance() {
        return zzb;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d0  */
    @androidx.annotation.o0
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getVersion(@androidx.annotation.o0 java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = "쫞"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            java.lang.String r1 = "쫟"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r9, r1)
            java.lang.String r1 = "쫠"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            java.lang.String r2 = "쫡"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)
            java.util.concurrent.ConcurrentHashMap r3 = r8.zzc
            boolean r4 = r3.containsKey(r9)
            if (r4 == 0) goto L2a
            java.lang.Object r9 = r3.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            return r9
        L2a:
            java.util.Properties r3 = new java.util.Properties
            r3.<init>()
            r4 = 0
            java.lang.String r5 = "쫢"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)     // Catch: java.lang.Throwable -> La5 java.io.IOException -> La7
            java.lang.Object[] r6 = new java.lang.Object[]{r9}     // Catch: java.lang.Throwable -> La5 java.io.IOException -> La7
            java.lang.String r5 = java.lang.String.format(r5, r6)     // Catch: java.lang.Throwable -> La5 java.io.IOException -> La7
            java.lang.Class<com.google.android.gms.common.internal.LibraryVersion> r6 = com.google.android.gms.common.internal.LibraryVersion.class
            java.io.InputStream r5 = com.flashget.parentalcontrol.ProtectedSandApp.a(r6, r5)     // Catch: java.lang.Throwable -> La5 java.io.IOException -> La7
            if (r5 == 0) goto L84
            r3.load(r5)     // Catch: java.lang.Throwable -> L7e java.io.IOException -> L80
            java.lang.String r6 = "쫣"
            java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)     // Catch: java.lang.Throwable -> L7e java.io.IOException -> L80
            java.lang.String r4 = r3.getProperty(r6, r4)     // Catch: java.lang.Throwable -> L7e java.io.IOException -> L80
            com.google.android.gms.common.internal.GmsLogger r3 = com.google.android.gms.common.internal.LibraryVersion.zza     // Catch: java.lang.Throwable -> L7e java.io.IOException -> L80
            java.lang.String r6 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L7e java.io.IOException -> L80
            int r6 = r6.length()     // Catch: java.lang.Throwable -> L7e java.io.IOException -> L80
            int r6 = r6 + 12
            java.lang.String r7 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L7e java.io.IOException -> L80
            int r7 = r7.length()     // Catch: java.lang.Throwable -> L7e java.io.IOException -> L80
            int r6 = r6 + r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7e java.io.IOException -> L80
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L7e java.io.IOException -> L80
            r7.append(r9)     // Catch: java.lang.Throwable -> L7e java.io.IOException -> L80
            r7.append(r1)     // Catch: java.lang.Throwable -> L7e java.io.IOException -> L80
            r7.append(r4)     // Catch: java.lang.Throwable -> L7e java.io.IOException -> L80
            java.lang.String r1 = r7.toString()     // Catch: java.lang.Throwable -> L7e java.io.IOException -> L80
            r3.v(r0, r1)     // Catch: java.lang.Throwable -> L7e java.io.IOException -> L80
            goto Lc9
        L7e:
            r9 = move-exception
            goto La3
        L80:
            r1 = move-exception
            r3 = r4
            r4 = r5
            goto La9
        L84:
            com.google.android.gms.common.internal.GmsLogger r1 = com.google.android.gms.common.internal.LibraryVersion.zza     // Catch: java.lang.Throwable -> L7e java.io.IOException -> L80
            java.lang.String r3 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L7e java.io.IOException -> L80
            int r3 = r3.length()     // Catch: java.lang.Throwable -> L7e java.io.IOException -> L80
            int r3 = r3 + 43
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7e java.io.IOException -> L80
            r6.<init>(r3)     // Catch: java.lang.Throwable -> L7e java.io.IOException -> L80
            r6.append(r2)     // Catch: java.lang.Throwable -> L7e java.io.IOException -> L80
            r6.append(r9)     // Catch: java.lang.Throwable -> L7e java.io.IOException -> L80
            java.lang.String r3 = r6.toString()     // Catch: java.lang.Throwable -> L7e java.io.IOException -> L80
            r1.w(r0, r3)     // Catch: java.lang.Throwable -> L7e java.io.IOException -> L80
            goto Lc9
        La3:
            r4 = r5
            goto Le7
        La5:
            r9 = move-exception
            goto Le7
        La7:
            r1 = move-exception
            r3 = r4
        La9:
            com.google.android.gms.common.internal.GmsLogger r5 = com.google.android.gms.common.internal.LibraryVersion.zza     // Catch: java.lang.Throwable -> La5
            java.lang.String r6 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> La5
            int r6 = r6.length()     // Catch: java.lang.Throwable -> La5
            int r6 = r6 + 43
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La5
            r7.<init>(r6)     // Catch: java.lang.Throwable -> La5
            r7.append(r2)     // Catch: java.lang.Throwable -> La5
            r7.append(r9)     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = r7.toString()     // Catch: java.lang.Throwable -> La5
            r5.e(r0, r2, r1)     // Catch: java.lang.Throwable -> La5
            r5 = r4
            r4 = r3
        Lc9:
            if (r5 == 0) goto Lce
            com.google.android.gms.common.util.IOUtils.closeQuietly(r5)
        Lce:
            if (r4 != 0) goto Le1
            com.google.android.gms.common.internal.GmsLogger r1 = com.google.android.gms.common.internal.LibraryVersion.zza
            java.lang.String r2 = "쫤"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)
            r1.d(r0, r2)
            java.lang.String r4 = "쫥"
            java.lang.String r4 = com.flashget.parentalcontrol.ProtectedSandApp.s(r4)
        Le1:
            java.util.concurrent.ConcurrentHashMap r0 = r8.zzc
            r0.put(r9, r4)
            return r4
        Le7:
            if (r4 == 0) goto Lec
            com.google.android.gms.common.util.IOUtils.closeQuietly(r4)
        Lec:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.LibraryVersion.getVersion(java.lang.String):java.lang.String");
    }
}
