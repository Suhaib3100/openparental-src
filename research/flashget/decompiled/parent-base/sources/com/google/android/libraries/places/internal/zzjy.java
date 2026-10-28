package com.google.android.libraries.places.internal;

import android.os.Build;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzjy extends zzjs {
    private static final AtomicReference zza = new AtomicReference();
    private static final AtomicLong zzb = new AtomicLong();
    private static final ConcurrentLinkedQueue zzc = new ConcurrentLinkedQueue();
    private volatile zzja zzd;

    private zzjy(String str) {
        super(str);
        String str2 = Build.FINGERPRINT;
        boolean z4 = true;
        boolean z5 = str2 == null || ProtectedSandApp.s("\uea0e").equals(str2);
        String str3 = Build.HARDWARE;
        boolean z6 = ProtectedSandApp.s("\uea0f").equals(str3) || ProtectedSandApp.s("\uea10").equals(str3);
        String str4 = Build.TYPE;
        if (!ProtectedSandApp.s("\uea11").equals(str4) && !ProtectedSandApp.s("\uea12").equals(str4)) {
            z4 = false;
        }
        if (z5 || z6) {
            this.zzd = new zzjt().zza(zza());
        } else if (z4) {
            this.zzd = new zzka().zzb(false).zza(zza());
        } else {
            this.zzd = null;
        }
    }

    public static zzja zzb(String str) {
        AtomicReference atomicReference = zza;
        if (atomicReference.get() != null) {
            return ((zzju) atomicReference.get()).zza(str);
        }
        zzjy zzjyVar = new zzjy(str.replace('$', '.'));
        zzjw.zza.offer(zzjyVar);
        if (atomicReference.get() != null) {
            while (true) {
                zzjy zzjyVar2 = (zzjy) zzjw.zza.poll();
                if (zzjyVar2 == null) {
                    break;
                }
                zzjyVar2.zzd = ((zzju) zza.get()).zza(zzjyVar2.zza());
            }
            if (((zzjx) zzc.poll()) != null) {
                zzb.getAndDecrement();
                throw null;
            }
        }
        return zzjyVar;
    }
}
