package com.google.android.gms.internal.fido;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
final class zzht {
    private final Deque zza = new ArrayDeque(16);

    private zzht(boolean z4) {
    }

    public static zzht zza() {
        return new zzht(false);
    }

    private final long zzh() {
        if (this.zza.isEmpty()) {
            return 0L;
        }
        return ((Long) this.zza.peek()).longValue();
    }

    private final void zzi(long j4) {
        this.zza.pop();
        this.zza.push(Long.valueOf(j4));
    }

    public final void zzb() throws IOException {
        if (this.zza.isEmpty()) {
            return;
        }
        throw new IOException(String.format(ProtectedSandApp.s("탺"), Integer.valueOf(this.zza.size()), Long.valueOf(zzh())));
    }

    public final void zzc() throws IOException {
        long zzh = zzh();
        if (zzh >= 0) {
            throw new IOException(String.format(ProtectedSandApp.s("탼"), Long.valueOf(zzh)));
        }
        if (zzh == -5) {
            throw new IOException(ProtectedSandApp.s("탻"));
        }
        this.zza.pop();
    }

    public final void zzd() throws IOException {
        long zzh = zzh();
        if (zzh != -1) {
            if (zzh != -2) {
                return;
            } else {
                zzh = -2;
            }
        }
        throw new IOException(String.format(ProtectedSandApp.s("탽"), Long.valueOf(zzh)));
    }

    public final void zze(long j4) throws IOException {
        long zzh = zzh();
        if (zzh != j4) {
            if (zzh != -1) {
                if (zzh != -2) {
                    return;
                } else {
                    zzh = -2;
                }
            }
            throw new IOException(String.format(ProtectedSandApp.s("탾"), Long.valueOf(j4), Long.valueOf(zzh)));
        }
    }

    public final void zzf() {
        long zzh = zzh();
        if (zzh == 1) {
            this.zza.pop();
            return;
        }
        if (zzh > 1) {
            zzi(zzh - 1);
        } else if (zzh == -4) {
            zzi(-5L);
        } else if (zzh == -5) {
            zzi(-4L);
        }
    }

    public final void zzg(long j4) {
        this.zza.push(Long.valueOf(j4));
    }
}
