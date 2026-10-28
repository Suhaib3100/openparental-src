package com.google.android.gms.internal.common;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
final class zzv implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzx zzb;

    zzv(zzx zzxVar, CharSequence charSequence) {
        this.zzb = zzxVar;
        this.zza = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator zzh;
        zzh = this.zzb.zzh(this.zza);
        return zzh;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        Iterator it = iterator();
        try {
            String s5 = ProtectedSandApp.s("\u0cf5");
            if (it.hasNext()) {
                sb.append(zzq.zza(it.next(), s5));
                while (it.hasNext()) {
                    sb.append((CharSequence) s5);
                    sb.append(zzq.zza(it.next(), s5));
                }
            }
            sb.append(']');
            return sb.toString();
        } catch (IOException e6) {
            throw new AssertionError(e6);
        }
    }
}
