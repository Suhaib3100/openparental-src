package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public abstract class zzlc {
    private static final zzlc zza = new zzla(ProtectedSandApp.s("\uea25"), ProtectedSandApp.s("\uea26"), '=');
    private static final zzlc zzb = new zzla(ProtectedSandApp.s("\uea27"), ProtectedSandApp.s("\uea28"), '=');
    private static final zzlc zzc = new zzlb(ProtectedSandApp.s("\uea29"), ProtectedSandApp.s("\uea2a"), '=');
    private static final zzlc zzd = new zzlb(ProtectedSandApp.s("\uea2b"), ProtectedSandApp.s("\uea2c"), '=');
    private static final zzlc zze = new zzkz(ProtectedSandApp.s("\uea2d"), ProtectedSandApp.s("\uea2e"));

    zzlc() {
    }

    public static zzlc zzd() {
        return zze;
    }

    abstract void zza(Appendable appendable, byte[] bArr, int i4, int i5) throws IOException;

    abstract int zzb(int i4);

    public final String zze(byte[] bArr, int i4, int i5) {
        zzha.zzg(0, i5, bArr.length);
        StringBuilder sb = new StringBuilder(zzb(i5));
        try {
            zza(sb, bArr, 0, i5);
            return sb.toString();
        } catch (IOException e4) {
            throw new AssertionError(e4);
        }
    }
}
