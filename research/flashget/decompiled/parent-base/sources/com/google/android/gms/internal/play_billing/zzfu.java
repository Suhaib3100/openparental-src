package com.google.android.gms.internal.play_billing;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.Locale;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
final class zzfu extends zzfx {
    private final byte[] zzb;
    private final int zzc;
    private int zzd;

    zzfu(byte[] bArr, int i4, int i5) {
        super(null);
        int length = bArr.length;
        if (((length - i5) | i5) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, ProtectedSandApp.s("힢"), Integer.valueOf(length), 0, Integer.valueOf(i5)));
        }
        this.zzb = bArr;
        this.zzd = 0;
        this.zzc = i5;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final int zza() {
        return this.zzc - this.zzd;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzb(byte b5) throws IOException {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i4 = this.zzd;
        try {
            int i5 = i4 + 1;
            try {
                this.zzb[i4] = b5;
                this.zzd = i5;
            } catch (IndexOutOfBoundsException e4) {
                indexOutOfBoundsException = e4;
                i4 = i5;
                throw new zzfv(i4, this.zzc, 1, indexOutOfBoundsException);
            }
        } catch (IndexOutOfBoundsException e5) {
            indexOutOfBoundsException = e5;
        }
    }

    public final void zzc(byte[] bArr, int i4, int i5) throws IOException {
        try {
            System.arraycopy(bArr, i4, this.zzb, this.zzd, i5);
            this.zzd += i5;
        } catch (IndexOutOfBoundsException e4) {
            throw new zzfv(this.zzd, this.zzc, i5, e4);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzd(int i4, boolean z4) throws IOException {
        zzu(i4 << 3);
        zzb(z4 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zze(byte[] bArr, int i4, int i5) throws IOException {
        zzu(i5);
        zzc(bArr, 0, i5);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzf(int i4, zzfp zzfpVar) throws IOException {
        zzu((i4 << 3) | 2);
        zzg(zzfpVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzg(zzfp zzfpVar) throws IOException {
        zzu(zzfpVar.zzd());
        zzfpVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzh(int i4, int i5) throws IOException {
        zzu((i4 << 3) | 5);
        zzi(i5);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzi(int i4) throws IOException {
        int i5 = this.zzd;
        try {
            byte[] bArr = this.zzb;
            bArr[i5] = (byte) i4;
            bArr[i5 + 1] = (byte) (i4 >> 8);
            bArr[i5 + 2] = (byte) (i4 >> 16);
            bArr[i5 + 3] = (byte) (i4 >> 24);
            this.zzd = i5 + 4;
        } catch (IndexOutOfBoundsException e4) {
            throw new zzfv(i5, this.zzc, 4, e4);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzj(int i4, long j4) throws IOException {
        zzu((i4 << 3) | 1);
        zzk(j4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzk(long j4) throws IOException {
        int i4 = this.zzd;
        try {
            byte[] bArr = this.zzb;
            bArr[i4] = (byte) j4;
            bArr[i4 + 1] = (byte) (j4 >> 8);
            bArr[i4 + 2] = (byte) (j4 >> 16);
            bArr[i4 + 3] = (byte) (j4 >> 24);
            bArr[i4 + 4] = (byte) (j4 >> 32);
            bArr[i4 + 5] = (byte) (j4 >> 40);
            bArr[i4 + 6] = (byte) (j4 >> 48);
            bArr[i4 + 7] = (byte) (j4 >> 56);
            this.zzd = i4 + 8;
        } catch (IndexOutOfBoundsException e4) {
            throw new zzfv(i4, this.zzc, 8, e4);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzl(int i4, int i5) throws IOException {
        zzu(i4 << 3);
        zzm(i5);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzm(int i4) throws IOException {
        IndexOutOfBoundsException indexOutOfBoundsException;
        if (i4 >= 0) {
            zzu(i4);
            return;
        }
        int i5 = this.zzd;
        try {
            byte[] bArr = this.zzb;
            long j4 = i4;
            int i6 = i5 + 1;
            try {
                bArr[i5] = (byte) (((int) j4) | 128);
                int i7 = i5 + 2;
                try {
                    bArr[i6] = (byte) (((int) (j4 >>> 7)) | 128);
                    int i10 = i5 + 3;
                    bArr[i7] = (byte) (((int) (j4 >>> 14)) | 128);
                    i7 = i5 + 4;
                    bArr[i10] = (byte) (((int) (j4 >>> 21)) | 128);
                    int i11 = i5 + 5;
                    bArr[i7] = (byte) (((int) (j4 >>> 28)) | 128);
                    int i12 = i5 + 6;
                    try {
                        bArr[i11] = -1;
                        int i13 = i5 + 7;
                        bArr[i12] = -1;
                        i12 = i5 + 8;
                        bArr[i13] = -1;
                        i6 = i5 + 9;
                        bArr[i12] = -1;
                        i5 += 10;
                        bArr[i6] = 1;
                        this.zzd = i5;
                    } catch (IndexOutOfBoundsException e4) {
                        indexOutOfBoundsException = e4;
                        i5 = i12;
                        throw new zzfv(i5, this.zzc, 10, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e5) {
                    indexOutOfBoundsException = e5;
                    i5 = i7;
                }
            } catch (IndexOutOfBoundsException e6) {
                indexOutOfBoundsException = e6;
                i5 = i6;
            }
        } catch (IndexOutOfBoundsException e7) {
            indexOutOfBoundsException = e7;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzn(zzhr zzhrVar) throws IOException {
        zzu(zzhrVar.zzn());
        zzhrVar.zzD(this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzo(int i4, zzhr zzhrVar) throws IOException {
        zzu(11);
        zzt(2, i4);
        zzu(26);
        zzn(zzhrVar);
        zzu(12);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzp(int i4, zzfp zzfpVar) throws IOException {
        zzu(11);
        zzt(2, i4);
        zzf(3, zzfpVar);
        zzu(12);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzq(int i4, String str) throws IOException {
        zzu((i4 << 3) | 2);
        zzr(str);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzr(String str) throws IOException {
        int i4 = this.zzd;
        try {
            int zzy = zzfx.zzy(str.length() * 3);
            int zzy2 = zzfx.zzy(str.length());
            if (zzy2 != zzy) {
                int i5 = zzjc.zza;
                zzu(zziz.zzb(str));
                byte[] bArr = this.zzb;
                int i6 = this.zzd;
                this.zzd = zzjc.zza(str, bArr, i6, bArr.length - i6);
                return;
            }
            int i7 = i4 + zzy2;
            this.zzd = i7;
            byte[] bArr2 = this.zzb;
            int zza = zzjc.zza(str, bArr2, i7, bArr2.length - i7);
            this.zzd = i4;
            zzu((zza - i4) - zzy2);
            this.zzd = zza;
        } catch (IndexOutOfBoundsException e4) {
            throw new zzfv(e4);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzs(int i4, int i5) throws IOException {
        zzu((i4 << 3) | i5);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzt(int i4, int i5) throws IOException {
        zzu(i4 << 3);
        zzu(i5);
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0012: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r2 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) (LINE:19), block:B:49:0x0011 */
    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzu(int i4) throws IOException {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i5;
        int i6 = this.zzd;
        try {
            try {
                if ((i4 & (-128)) == 0) {
                    int i7 = i6 + 1;
                    this.zzb[i6] = (byte) i4;
                    this.zzd = i7;
                    return;
                }
                byte[] bArr = this.zzb;
                int i10 = i6 + 1;
                bArr[i6] = (byte) (i4 | 128);
                int i11 = i4 >>> 7;
                if ((i11 & (-128)) == 0) {
                    int i12 = i6 + 2;
                    bArr[i10] = (byte) i11;
                    this.zzd = i12;
                    return;
                }
                int i13 = i6 + 2;
                try {
                    bArr[i10] = (byte) (i11 | 128);
                    int i14 = i4 >>> 14;
                    if ((i14 & (-128)) == 0) {
                        int i15 = i6 + 3;
                        bArr[i13] = (byte) i14;
                        this.zzd = i15;
                        return;
                    }
                    int i16 = i6 + 3;
                    try {
                        bArr[i13] = (byte) (i14 | 128);
                        int i17 = i4 >>> 21;
                        if ((i17 & (-128)) == 0) {
                            int i18 = i6 + 4;
                            bArr[i16] = (byte) i17;
                            this.zzd = i18;
                        } else {
                            i13 = i6 + 4;
                            bArr[i16] = (byte) (i17 | 128);
                            int i19 = i6 + 5;
                            bArr[i13] = (byte) (i4 >>> 28);
                            this.zzd = i19;
                        }
                    } catch (IndexOutOfBoundsException e4) {
                        indexOutOfBoundsException = e4;
                        i6 = i16;
                        throw new zzfv(i6, this.zzc, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e5) {
                    indexOutOfBoundsException = e5;
                    i6 = i13;
                }
            } catch (IndexOutOfBoundsException e6) {
                indexOutOfBoundsException = e6;
            }
        } catch (IndexOutOfBoundsException e7) {
            indexOutOfBoundsException = e7;
            i6 = i5;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzv(int i4, long j4) throws IOException {
        zzu(i4 << 3);
        zzw(j4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzw(long j4) throws IOException {
        long j5 = j4 & (-128);
        int i4 = this.zzd;
        try {
            if (j5 == 0) {
                this.zzb[i4] = (byte) j4;
                this.zzd = i4 + 1;
                return;
            }
            byte[] bArr = this.zzb;
            bArr[i4] = (byte) (((int) j4) | 128);
            int i5 = i4 + 1;
            long j6 = j4 >>> 7;
            long j7 = j6 & (-128);
            int i6 = (int) j6;
            if (j7 == 0) {
                bArr[i5] = (byte) i6;
                this.zzd = i4 + 2;
                return;
            }
            bArr[i5] = (byte) (i6 | 128);
            int i7 = i4 + 2;
            long j10 = j4 >>> 14;
            long j11 = j10 & (-128);
            int i10 = (int) j10;
            if (j11 == 0) {
                bArr[i7] = (byte) i10;
                this.zzd = i4 + 3;
                return;
            }
            bArr[i7] = (byte) (i10 | 128);
            int i11 = i4 + 3;
            long j12 = j4 >>> 21;
            long j13 = j12 & (-128);
            int i12 = (int) j12;
            if (j13 == 0) {
                bArr[i11] = (byte) i12;
                this.zzd = i4 + 4;
                return;
            }
            bArr[i11] = (byte) (i12 | 128);
            int i13 = i4 + 4;
            long j14 = j4 >>> 28;
            long j15 = j14 & (-128);
            int i14 = (int) j14;
            if (j15 == 0) {
                bArr[i13] = (byte) i14;
                this.zzd = i4 + 5;
                return;
            }
            bArr[i13] = (byte) (i14 | 128);
            int i15 = i4 + 5;
            long j16 = j4 >>> 35;
            long j17 = j16 & (-128);
            int i16 = (int) j16;
            if (j17 == 0) {
                bArr[i15] = (byte) i16;
                this.zzd = i4 + 6;
                return;
            }
            bArr[i15] = (byte) (i16 | 128);
            int i17 = i4 + 6;
            long j18 = j4 >>> 42;
            long j19 = j18 & (-128);
            int i18 = (int) j18;
            if (j19 == 0) {
                bArr[i17] = (byte) i18;
                this.zzd = i4 + 7;
                return;
            }
            bArr[i17] = (byte) (i18 | 128);
            int i19 = i4 + 7;
            long j20 = j4 >>> 49;
            long j21 = j20 & (-128);
            int i20 = (int) j20;
            if (j21 == 0) {
                bArr[i19] = (byte) i20;
                this.zzd = i4 + 8;
                return;
            }
            bArr[i19] = (byte) (i20 | 128);
            int i21 = i4 + 8;
            long j22 = j4 >>> 56;
            int i22 = (int) j22;
            if (((-128) & j22) == 0) {
                bArr[i21] = (byte) i22;
                this.zzd = i4 + 9;
            } else {
                bArr[i21] = (byte) (i22 | 128);
                bArr[i4 + 9] = (byte) (j4 >>> 63);
                this.zzd = i4 + 10;
            }
        } catch (IndexOutOfBoundsException e4) {
            throw new zzfv(i4, this.zzc, 1, e4);
        }
    }
}
