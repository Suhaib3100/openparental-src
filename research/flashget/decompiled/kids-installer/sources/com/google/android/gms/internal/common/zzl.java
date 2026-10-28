package com.google.android.gms.internal.common;

import com.flashget.kidsdownloader.ProtectedSandApp;
import org.apache.commons.io.n;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes3.dex */
final class zzl extends zzk {
    private final char zza;

    zzl(char c6) {
        this.zza = c6;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("⊱"));
        int i5 = this.zza;
        char[] cArr = {n.f32061c, 'u', 0, 0, 0, 0};
        for (int i6 = 0; i6 < 4; i6++) {
            cArr[5 - i6] = ProtectedSandApp.s("⊲").charAt(i5 & 15);
            i5 >>= 4;
        }
        sb.append(String.copyValueOf(cArr));
        sb.append(ProtectedSandApp.s("⊳"));
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.common.zzo
    public final boolean zza(char c6) {
        return c6 == this.zza;
    }
}
