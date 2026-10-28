package com.google.android.gms.internal.measurement;

import androidx.constraintlayout.core.motion.key.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
/* loaded from: classes5.dex */
public abstract class zzjc extends zzil {
    private static final Logger zzb = Logger.getLogger(zzjc.class.getName());
    private static final boolean zzc = zzml.zzc();
    zzjf zza;

    /* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
    private static class zza extends zzjc {
        private final byte[] zzb;
        private final int zzc;
        private int zzd;

        zza(byte[] bArr, int i4, int i5) {
            super();
            if (bArr == null) {
                throw new NullPointerException(ProtectedSandApp.s("풵"));
            }
            if (((bArr.length - i5) | i5) < 0) {
                throw new IllegalArgumentException(String.format(ProtectedSandApp.s("풴"), Integer.valueOf(bArr.length), 0, Integer.valueOf(i5)));
            }
            this.zzb = bArr;
            this.zzd = 0;
            this.zzc = i5;
        }

        private final void zzc(byte[] bArr, int i4, int i5) throws IOException {
            try {
                System.arraycopy(bArr, i4, this.zzb, this.zzd, i5);
                this.zzd += i5;
            } catch (IndexOutOfBoundsException e4) {
                throw new zzb(String.format(ProtectedSandApp.s("풶"), Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Integer.valueOf(i5)), e4);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final int zza() {
            return this.zzc - this.zzd;
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zzb(byte[] bArr, int i4, int i5) throws IOException {
            zzc(i5);
            zzc(bArr, 0, i5);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zzd(int i4, int i5) throws IOException {
            zzc(i4, 0);
            zzc(i5);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(byte b5) throws IOException {
            int i4 = this.zzd;
            try {
                int i5 = i4 + 1;
                try {
                    this.zzb[i4] = b5;
                    this.zzd = i5;
                } catch (IndexOutOfBoundsException e4) {
                    e = e4;
                    i4 = i5;
                    throw new zzb(String.format(ProtectedSandApp.s("풶"), Integer.valueOf(i4), Integer.valueOf(this.zzc), 1), e);
                }
            } catch (IndexOutOfBoundsException e5) {
                e = e5;
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zzb(int i4, int i5) throws IOException {
            zzc(i4, 0);
            zzb(i5);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zzb(int i4) throws IOException {
            if (i4 >= 0) {
                zzc(i4);
            } else {
                zzb(i4);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zzc(int i4, int i5) throws IOException {
            zzc((i4 << 3) | i5);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zzc(int i4) throws IOException {
            while ((i4 & (-128)) != 0) {
                try {
                    byte[] bArr = this.zzb;
                    int i5 = this.zzd;
                    this.zzd = i5 + 1;
                    bArr[i5] = (byte) (i4 | 128);
                    i4 >>>= 7;
                } catch (IndexOutOfBoundsException e4) {
                    throw new zzb(String.format(ProtectedSandApp.s("풶"), Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e4);
                }
            }
            byte[] bArr2 = this.zzb;
            int i6 = this.zzd;
            this.zzd = i6 + 1;
            bArr2[i6] = (byte) i4;
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(int i4, boolean z4) throws IOException {
            zzc(i4, 0);
            zza(z4 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zzb(int i4, zzik zzikVar) throws IOException {
            zzc(1, 3);
            zzd(2, i4);
            zza(3, zzikVar);
            zzc(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(int i4, zzik zzikVar) throws IOException {
            zzc(i4, 2);
            zza(zzikVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(zzik zzikVar) throws IOException {
            zzc(zzikVar.zzb());
            zzikVar.zza(this);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zzb(int i4, long j4) throws IOException {
            zzc(i4, 0);
            zzb(j4);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(int i4, int i5) throws IOException {
            zzc(i4, 5);
            zza(i5);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zzb(long j4) throws IOException {
            if (zzjc.zzc && zza() >= 10) {
                while ((j4 & (-128)) != 0) {
                    byte[] bArr = this.zzb;
                    int i4 = this.zzd;
                    this.zzd = i4 + 1;
                    zzml.zza(bArr, i4, (byte) (((int) j4) | 128));
                    j4 >>>= 7;
                }
                byte[] bArr2 = this.zzb;
                int i5 = this.zzd;
                this.zzd = i5 + 1;
                zzml.zza(bArr2, i5, (byte) j4);
                return;
            }
            while ((j4 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.zzb;
                    int i6 = this.zzd;
                    this.zzd = i6 + 1;
                    bArr3[i6] = (byte) (((int) j4) | 128);
                    j4 >>>= 7;
                } catch (IndexOutOfBoundsException e4) {
                    throw new zzb(String.format(ProtectedSandApp.s("풶"), Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e4);
                }
            }
            byte[] bArr4 = this.zzb;
            int i7 = this.zzd;
            this.zzd = i7 + 1;
            bArr4[i7] = (byte) j4;
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(int i4) throws IOException {
            try {
                byte[] bArr = this.zzb;
                int i5 = this.zzd;
                int i6 = i5 + 1;
                this.zzd = i6;
                bArr[i5] = (byte) i4;
                int i7 = i5 + 2;
                this.zzd = i7;
                bArr[i6] = (byte) (i4 >> 8);
                int i10 = i5 + 3;
                this.zzd = i10;
                bArr[i7] = (byte) (i4 >> 16);
                this.zzd = i5 + 4;
                bArr[i10] = (byte) (i4 >>> 24);
            } catch (IndexOutOfBoundsException e4) {
                throw new zzb(String.format(ProtectedSandApp.s("풶"), Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e4);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(int i4, long j4) throws IOException {
            zzc(i4, 1);
            zza(j4);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(long j4) throws IOException {
            try {
                byte[] bArr = this.zzb;
                int i4 = this.zzd;
                int i5 = i4 + 1;
                this.zzd = i5;
                bArr[i4] = (byte) j4;
                int i6 = i4 + 2;
                this.zzd = i6;
                bArr[i5] = (byte) (j4 >> 8);
                int i7 = i4 + 3;
                this.zzd = i7;
                bArr[i6] = (byte) (j4 >> 16);
                int i10 = i4 + 4;
                this.zzd = i10;
                bArr[i7] = (byte) (j4 >> 24);
                int i11 = i4 + 5;
                this.zzd = i11;
                bArr[i10] = (byte) (j4 >> 32);
                int i12 = i4 + 6;
                this.zzd = i12;
                bArr[i11] = (byte) (j4 >> 40);
                int i13 = i4 + 7;
                this.zzd = i13;
                bArr[i12] = (byte) (j4 >> 48);
                this.zzd = i4 + 8;
                bArr[i13] = (byte) (j4 >> 56);
            } catch (IndexOutOfBoundsException e4) {
                throw new zzb(String.format(ProtectedSandApp.s("풶"), Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e4);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzil
        public final void zza(byte[] bArr, int i4, int i5) throws IOException {
            zzc(bArr, i4, i5);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        final void zza(int i4, zzlc zzlcVar, zzlu zzluVar) throws IOException {
            zzc(i4, 2);
            zzc(((zzib) zzlcVar).zza(zzluVar));
            zzluVar.zza((zzlu) zzlcVar, (zznb) this.zza);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(zzlc zzlcVar) throws IOException {
            zzc(zzlcVar.zzcb());
            zzlcVar.zza(this);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(int i4, zzlc zzlcVar) throws IOException {
            zzc(1, 3);
            zzd(2, i4);
            zzc(3, 2);
            zza(zzlcVar);
            zzc(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(int i4, String str) throws IOException {
            zzc(i4, 2);
            zza(str);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(String str) throws IOException {
            int i4 = this.zzd;
            try {
                int zzj = zzjc.zzj(str.length() * 3);
                int zzj2 = zzjc.zzj(str.length());
                if (zzj2 == zzj) {
                    int i5 = i4 + zzj2;
                    this.zzd = i5;
                    int zza = zzmp.zza(str, this.zzb, i5, zza());
                    this.zzd = i4;
                    zzc((zza - i4) - zzj2);
                    this.zzd = zza;
                    return;
                }
                zzc(zzmp.zza(str));
                this.zzd = zzmp.zza(str, this.zzb, this.zzd, zza());
            } catch (zzmt e4) {
                this.zzd = i4;
                zza(str, e4);
            } catch (IndexOutOfBoundsException e5) {
                throw new zzb(e5);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
    public static class zzb extends IOException {
        zzb() {
            super(ProtectedSandApp.s("풷"));
        }

        zzb(Throwable th) {
            super(ProtectedSandApp.s("풷"), th);
        }

        zzb(String str, Throwable th) {
            super(c.a(ProtectedSandApp.s("풸"), str), th);
        }
    }

    public static int zza(double d5) {
        return 8;
    }

    public static int zzb(int i4, boolean z4) {
        return zzj(i4 << 3) + 1;
    }

    public static int zzc(long j4) {
        return 8;
    }

    public static int zzd(int i4) {
        return zzg(i4);
    }

    public static int zze(int i4) {
        return 4;
    }

    public static int zzf(int i4, int i5) {
        return zzj(i4 << 3) + 4;
    }

    public static int zzg(int i4) {
        return 4;
    }

    public static int zzh(int i4, int i5) {
        return zzj(i4 << 3) + 4;
    }

    private static long zzi(long j4) {
        return (j4 >> 63) ^ (j4 << 1);
    }

    public static int zzj(int i4, int i5) {
        return zzj(i5) + zzj(i4 << 3);
    }

    private static int zzl(int i4) {
        return (i4 >> 31) ^ (i4 << 1);
    }

    public abstract int zza();

    public abstract void zza(byte b5) throws IOException;

    public abstract void zza(int i4) throws IOException;

    public abstract void zza(int i4, int i5) throws IOException;

    public abstract void zza(int i4, long j4) throws IOException;

    public abstract void zza(int i4, zzik zzikVar) throws IOException;

    public abstract void zza(int i4, zzlc zzlcVar) throws IOException;

    abstract void zza(int i4, zzlc zzlcVar, zzlu zzluVar) throws IOException;

    public abstract void zza(int i4, String str) throws IOException;

    public abstract void zza(int i4, boolean z4) throws IOException;

    public abstract void zza(long j4) throws IOException;

    public abstract void zza(zzik zzikVar) throws IOException;

    public abstract void zza(zzlc zzlcVar) throws IOException;

    public abstract void zza(String str) throws IOException;

    public abstract void zzb(int i4) throws IOException;

    public abstract void zzb(int i4, int i5) throws IOException;

    public abstract void zzb(int i4, long j4) throws IOException;

    public abstract void zzb(int i4, zzik zzikVar) throws IOException;

    public abstract void zzb(long j4) throws IOException;

    abstract void zzb(byte[] bArr, int i4, int i5) throws IOException;

    public abstract void zzc(int i4) throws IOException;

    public abstract void zzc(int i4, int i5) throws IOException;

    public abstract void zzd(int i4, int i5) throws IOException;

    public final void zzk(int i4, int i5) throws IOException {
        zzd(i4, zzl(i5));
    }

    private zzjc() {
    }

    public static int zza(float f4) {
        return 4;
    }

    public static int zzb(zzik zzikVar) {
        int zzb2 = zzikVar.zzb();
        return zzj(zzb2) + zzb2;
    }

    public static int zzd(int i4, long j4) {
        return zzg(j4) + zzj(i4 << 3);
    }

    public static int zze(long j4) {
        return 8;
    }

    public static int zzf(int i4) {
        return zzg(i4);
    }

    public static int zzg(int i4, int i5) {
        return zzg(i5) + zzj(i4 << 3);
    }

    public static int zzh(int i4) {
        return zzj(zzl(i4));
    }

    public static int zzi(int i4, int i5) {
        return zzj(zzl(i5)) + zzj(i4 << 3);
    }

    public final void zzk(int i4) throws IOException {
        zzc(zzl(i4));
    }

    public static int zza(boolean z4) {
        return 1;
    }

    public static int zzc(int i4, zzik zzikVar) {
        int zzj = zzj(i4 << 3);
        int zzb2 = zzikVar.zzb();
        return zzj(zzb2) + zzb2 + zzj;
    }

    public static int zze(int i4, int i5) {
        return zzg(i5) + zzj(i4 << 3);
    }

    public static int zzf(int i4, long j4) {
        return zzg(zzi(j4)) + zzj(i4 << 3);
    }

    public static int zzj(int i4) {
        return (352 - (Integer.numberOfLeadingZeros(i4) * 9)) >>> 6;
    }

    public final void zzh(int i4, long j4) throws IOException {
        zzb(i4, zzi(j4));
    }

    public static int zza(byte[] bArr) {
        int length = bArr.length;
        return zzj(length) + length;
    }

    @Deprecated
    static int zzb(int i4, zzlc zzlcVar, zzlu zzluVar) {
        return (zzj(i4 << 3) << 1) + ((zzib) zzlcVar).zza(zzluVar);
    }

    public static int zzd(long j4) {
        return zzg(j4);
    }

    public static int zzg(int i4, long j4) {
        return zzg(j4) + zzj(i4 << 3);
    }

    public static int zzi(int i4) {
        return zzj(i4 << 3);
    }

    public final void zzh(long j4) throws IOException {
        zzb(zzi(j4));
    }

    public static int zzd(int i4, zzik zzikVar) {
        return zzc(3, zzikVar) + zzj(2, i4) + (zzj(8) << 1);
    }

    public static int zze(int i4, long j4) {
        return zzj(i4 << 3) + 8;
    }

    public static int zzf(long j4) {
        return zzg(zzi(j4));
    }

    public static int zza(int i4, double d5) {
        return zzj(i4 << 3) + 8;
    }

    @Deprecated
    public static int zzb(zzlc zzlcVar) {
        return zzlcVar.zzcb();
    }

    public static int zzc(int i4, long j4) {
        return zzj(i4 << 3) + 8;
    }

    public static int zzg(long j4) {
        return (640 - (Long.numberOfLeadingZeros(j4) * 9)) >>> 6;
    }

    public static int zza(int i4, float f4) {
        return zzj(i4 << 3) + 4;
    }

    public static int zzb(int i4, zzkk zzkkVar) {
        int zzj = zzj(i4 << 3);
        int zza2 = zzkkVar.zza();
        return zzj(zza2) + zza2 + zzj;
    }

    static int zzc(int i4, zzlc zzlcVar, zzlu zzluVar) {
        return zzj(i4 << 3) + zza(zzlcVar, zzluVar);
    }

    public static int zza(int i4, zzkk zzkkVar) {
        return zzb(3, zzkkVar) + zzj(2, i4) + (zzj(8) << 1);
    }

    public static int zzc(zzlc zzlcVar) {
        int zzcb = zzlcVar.zzcb();
        return zzj(zzcb) + zzcb;
    }

    public static int zzb(int i4, zzlc zzlcVar) {
        return zzc(zzlcVar) + zzj(24) + zzj(2, i4) + (zzj(8) << 1);
    }

    public static int zza(zzkk zzkkVar) {
        int zza2 = zzkkVar.zza();
        return zzj(zza2) + zza2;
    }

    static int zza(zzlc zzlcVar, zzlu zzluVar) {
        int zza2 = ((zzib) zzlcVar).zza(zzluVar);
        return zzj(zza2) + zza2;
    }

    public static int zzb(int i4, String str) {
        return zzb(str) + zzj(i4 << 3);
    }

    final void zza(String str, zzmt zzmtVar) throws IOException {
        zzb.logp(Level.WARNING, ProtectedSandApp.s("풲"), ProtectedSandApp.s("풰"), ProtectedSandApp.s("풱"), (Throwable) zzmtVar);
        byte[] bytes = str.getBytes(zzjv.zza);
        try {
            zzc(bytes.length);
            zza(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e4) {
            throw new zzb(e4);
        }
    }

    public static int zzb(String str) {
        int length;
        try {
            length = zzmp.zza(str);
        } catch (zzmt unused) {
            length = str.getBytes(zzjv.zza).length;
        }
        return zzj(length) + length;
    }

    public static zzjc zzb(byte[] bArr) {
        return new zza(bArr, 0, bArr.length);
    }

    public final void zzb() {
        if (zza() != 0) {
            throw new IllegalStateException(ProtectedSandApp.s("풳"));
        }
    }

    public final void zzb(boolean z4) throws IOException {
        zza(z4 ? (byte) 1 : (byte) 0);
    }

    public final void zzb(int i4, double d5) throws IOException {
        zza(i4, Double.doubleToRawLongBits(d5));
    }

    public final void zzb(double d5) throws IOException {
        zza(Double.doubleToRawLongBits(d5));
    }

    public final void zzb(int i4, float f4) throws IOException {
        zza(i4, Float.floatToRawIntBits(f4));
    }

    public final void zzb(float f4) throws IOException {
        zza(Float.floatToRawIntBits(f4));
    }
}
