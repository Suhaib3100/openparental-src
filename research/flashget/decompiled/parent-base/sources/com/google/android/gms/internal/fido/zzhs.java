package com.google.android.gms.internal.fido;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.primitives.u;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import kotlin.time.g;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
public final class zzhs implements Closeable {
    private final InputStream zza;
    private zzhr zzb;
    private final byte[] zzc = new byte[8];
    private final zzht zzd = zzht.zza();

    public zzhs(InputStream inputStream) {
        this.zza = inputStream;
    }

    private final long zzh() throws IOException {
        if (this.zzb.zza() < 24) {
            long zza = this.zzb.zza();
            this.zzb = null;
            return zza;
        }
        if (this.zzb.zza() == 24) {
            int read = this.zza.read();
            if (read == -1) {
                throw new EOFException();
            }
            this.zzb = null;
            return read & 255;
        }
        if (this.zzb.zza() == 25) {
            zzk(this.zzc, 2);
            byte[] bArr = this.zzc;
            return ((bArr[0] & 255) << 8) | (bArr[1] & 255);
        }
        if (this.zzb.zza() == 26) {
            zzk(this.zzc, 4);
            byte[] bArr2 = this.zzc;
            long j4 = bArr2[0];
            long j5 = bArr2[1];
            return (bArr2[3] & 255) | ((j5 & 255) << 16) | ((j4 & 255) << 24) | ((bArr2[2] & 255) << 8);
        }
        if (this.zzb.zza() != 27) {
            throw new IOException(String.format(ProtectedSandApp.s("탯"), Byte.valueOf(this.zzb.zza()), Integer.valueOf(this.zzb.zzc())));
        }
        zzk(this.zzc, 8);
        byte[] bArr3 = this.zzc;
        long j6 = bArr3[0];
        long j7 = bArr3[1];
        long j10 = bArr3[2];
        long j11 = bArr3[3];
        long j12 = bArr3[4];
        long j13 = bArr3[5];
        return (bArr3[7] & 255) | ((j13 & 255) << 16) | ((j7 & 255) << 48) | ((j6 & 255) << 56) | ((j10 & 255) << 40) | ((j11 & 255) << 32) | ((j12 & 255) << 24) | ((bArr3[6] & 255) << 8);
    }

    private final void zzi() throws IOException {
        zzd();
        if (this.zzb.zza() != 31) {
            return;
        }
        throw new IllegalStateException(String.format(ProtectedSandApp.s("탰"), Byte.valueOf(this.zzb.zza())));
    }

    private final void zzj(byte b5) throws IOException {
        zzd();
        if (this.zzb.zzb() == b5) {
            return;
        }
        throw new IllegalStateException(String.format(ProtectedSandApp.s("탱"), Integer.valueOf((b5 >> 5) & 7), Integer.valueOf(this.zzb.zzc())));
    }

    private final void zzk(byte[] bArr, int i4) throws IOException {
        int i5 = 0;
        while (i5 != i4) {
            int read = this.zza.read(bArr, i5, i4 - i5);
            if (read == -1) {
                throw new EOFException();
            }
            i5 += read;
        }
        this.zzb = null;
    }

    private final byte[] zzl() throws IOException {
        zzi();
        long zzh = zzh();
        if (zzh < 0 || zzh > 2147483647L) {
            throw new UnsupportedOperationException(String.format(ProtectedSandApp.s("탲"), Integer.MAX_VALUE));
        }
        if (this.zza.available() < zzh) {
            throw new EOFException();
        }
        int i4 = (int) zzh;
        byte[] bArr = new byte[i4];
        zzk(bArr, i4);
        return bArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zza.close();
        this.zzd.zzb();
    }

    public final long zza() throws IOException {
        zzj(Byte.MIN_VALUE);
        zzi();
        long zzh = zzh();
        if (zzh < 0) {
            throw new UnsupportedOperationException(String.format(ProtectedSandApp.s("탳"), Long.MAX_VALUE));
        }
        if (zzh > 0) {
            this.zzd.zzg(zzh);
        }
        return zzh;
    }

    public final long zzb() throws IOException {
        boolean z4;
        zzd();
        if (this.zzb.zzb() == 0) {
            z4 = true;
        } else {
            if (this.zzb.zzb() != 32) {
                throw new IllegalStateException(String.format(ProtectedSandApp.s("탵"), Integer.valueOf(this.zzb.zzc())));
            }
            z4 = false;
        }
        long zzh = zzh();
        if (zzh >= 0) {
            return z4 ? zzh : ~zzh;
        }
        throw new UnsupportedOperationException(String.format(ProtectedSandApp.s("탴"), Long.MAX_VALUE));
    }

    public final long zzc() throws IOException {
        zzj((byte) -96);
        zzi();
        long zzh = zzh();
        if (zzh < 0 || zzh > g.f79218c) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("탶"));
        }
        if (zzh > 0) {
            this.zzd.zzg(zzh + zzh);
        }
        return zzh;
    }

    public final zzhr zzd() throws IOException {
        if (this.zzb == null) {
            int read = this.zza.read();
            if (read == -1) {
                this.zzd.zzb();
                return null;
            }
            zzhr zzhrVar = new zzhr(read);
            this.zzb = zzhrVar;
            byte zzb = zzhrVar.zzb();
            if (zzb != Byte.MIN_VALUE && zzb != -96 && zzb != -64) {
                if (zzb != -32) {
                    if (zzb != 0 && zzb != 32) {
                        if (zzb == 64) {
                            this.zzd.zze(-1L);
                        } else {
                            if (zzb != 96) {
                                throw new IllegalStateException(String.format(ProtectedSandApp.s("탷"), Integer.valueOf(this.zzb.zzc())));
                            }
                            this.zzd.zze(-2L);
                        }
                        this.zzd.zzf();
                    }
                } else if (this.zzb.zza() == 31) {
                    this.zzd.zzc();
                }
            }
            this.zzd.zzd();
            this.zzd.zzf();
        }
        return this.zzb;
    }

    public final String zze() throws IOException {
        zzj((byte) 96);
        return new String(zzl(), StandardCharsets.UTF_8);
    }

    public final boolean zzf() throws IOException {
        zzj((byte) -32);
        if (this.zzb.zza() > 24) {
            throw new IllegalStateException(ProtectedSandApp.s("탹"));
        }
        int zzh = (int) zzh();
        if (zzh == 20) {
            return false;
        }
        if (zzh == 21) {
            return true;
        }
        throw new IllegalStateException(String.format(ProtectedSandApp.s("탸"), new Object[0]));
    }

    public final byte[] zzg() throws IOException {
        zzj(u.f57540a);
        return zzl();
    }
}
