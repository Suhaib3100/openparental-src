package com.google.android.gms.common.internal;

import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
@Deprecated
/* loaded from: classes2.dex */
public class LibraryVersion {
    private static final GmsLogger zza = new GmsLogger(ProtectedSandApp.s("୬"), "");
    private static LibraryVersion zzb = new LibraryVersion();
    private ConcurrentHashMap zzc = new ConcurrentHashMap();

    @VisibleForTesting
    protected LibraryVersion() {
    }

    @o0
    @KeepForSdk
    public static LibraryVersion getInstance() {
        return zzb;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00ab  */
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
            java.lang.String r0 = "୭"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            java.lang.String r1 = "୮"
            java.lang.String r1 = com.flashget.kidsdownloader.ProtectedSandApp.s(r1)
            java.lang.String r2 = "୯"
            java.lang.String r2 = com.flashget.kidsdownloader.ProtectedSandApp.s(r2)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r9, r2)
            java.util.concurrent.ConcurrentHashMap r2 = r8.zzc
            boolean r2 = r2.containsKey(r9)
            if (r2 == 0) goto L26
            java.util.concurrent.ConcurrentHashMap r0 = r8.zzc
            java.lang.Object r9 = r0.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            return r9
        L26:
            java.util.Properties r2 = new java.util.Properties
            r2.<init>()
            r3 = 1
            r4 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            r5 = 0
            r3[r5] = r9     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            java.lang.Class<com.google.android.gms.common.internal.LibraryVersion> r5 = com.google.android.gms.common.internal.LibraryVersion.class
            java.lang.String r6 = "୰"
            java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            java.lang.String r3 = java.lang.String.format(r6, r3)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            java.io.InputStream r3 = com.flashget.kidsdownloader.ProtectedSandApp.stoyCEb(r5, r3)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            if (r3 == 0) goto L6f
            r2.load(r3)     // Catch: java.lang.Throwable -> L86 java.io.IOException -> L89
            java.lang.String r5 = "ୱ"
            java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)     // Catch: java.lang.Throwable -> L86 java.io.IOException -> L89
            java.lang.String r4 = r2.getProperty(r5, r4)     // Catch: java.lang.Throwable -> L86 java.io.IOException -> L89
            com.google.android.gms.common.internal.GmsLogger r2 = com.google.android.gms.common.internal.LibraryVersion.zza     // Catch: java.lang.Throwable -> L86 java.io.IOException -> L89
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L86 java.io.IOException -> L89
            r5.<init>()     // Catch: java.lang.Throwable -> L86 java.io.IOException -> L89
            r5.append(r9)     // Catch: java.lang.Throwable -> L86 java.io.IOException -> L89
            java.lang.String r6 = "୲"
            java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)     // Catch: java.lang.Throwable -> L86 java.io.IOException -> L89
            r5.append(r6)     // Catch: java.lang.Throwable -> L86 java.io.IOException -> L89
            r5.append(r4)     // Catch: java.lang.Throwable -> L86 java.io.IOException -> L89
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L86 java.io.IOException -> L89
            r2.v(r0, r5)     // Catch: java.lang.Throwable -> L86 java.io.IOException -> L89
            goto L80
        L6f:
            com.google.android.gms.common.internal.GmsLogger r2 = com.google.android.gms.common.internal.LibraryVersion.zza     // Catch: java.lang.Throwable -> L86 java.io.IOException -> L89
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L86 java.io.IOException -> L89
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L86 java.io.IOException -> L89
            r5.append(r9)     // Catch: java.lang.Throwable -> L86 java.io.IOException -> L89
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L86 java.io.IOException -> L89
            r2.w(r0, r5)     // Catch: java.lang.Throwable -> L86 java.io.IOException -> L89
        L80:
            if (r3 == 0) goto La9
            com.google.android.gms.common.util.IOUtils.closeQuietly(r3)
            goto La9
        L86:
            r9 = move-exception
            r4 = r3
            goto Lc2
        L89:
            r2 = move-exception
            r7 = r4
            r4 = r3
            r3 = r7
            goto L92
        L8e:
            r9 = move-exception
            goto Lc2
        L90:
            r2 = move-exception
            r3 = r4
        L92:
            com.google.android.gms.common.internal.GmsLogger r5 = com.google.android.gms.common.internal.LibraryVersion.zza     // Catch: java.lang.Throwable -> L8e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8e
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L8e
            r6.append(r9)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L8e
            r5.e(r0, r1, r2)     // Catch: java.lang.Throwable -> L8e
            if (r4 == 0) goto La8
            com.google.android.gms.common.util.IOUtils.closeQuietly(r4)
        La8:
            r4 = r3
        La9:
            if (r4 != 0) goto Lbc
            com.google.android.gms.common.internal.GmsLogger r1 = com.google.android.gms.common.internal.LibraryVersion.zza
            java.lang.String r2 = "୳"
            java.lang.String r2 = com.flashget.kidsdownloader.ProtectedSandApp.s(r2)
            r1.d(r0, r2)
            java.lang.String r4 = "୴"
            java.lang.String r4 = com.flashget.kidsdownloader.ProtectedSandApp.s(r4)
        Lbc:
            java.util.concurrent.ConcurrentHashMap r0 = r8.zzc
            r0.put(r9, r4)
            return r4
        Lc2:
            if (r4 == 0) goto Lc7
            com.google.android.gms.common.util.IOUtils.closeQuietly(r4)
        Lc7:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.LibraryVersion.getVersion(java.lang.String):java.lang.String");
    }
}
