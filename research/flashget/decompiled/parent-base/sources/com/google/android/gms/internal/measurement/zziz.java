package com.google.android.gms.internal.measurement;

import com.google.common.base.c;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
/* loaded from: classes5.dex */
final class zziz extends zziw {
    private final byte[] zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    private final void zzaa() {
        int i4 = this.zze + this.zzf;
        this.zze = i4;
        int i5 = i4 - this.zzh;
        int i6 = this.zzj;
        if (i5 <= i6) {
            this.zzf = 0;
            return;
        }
        int i7 = i5 - i6;
        this.zzf = i7;
        this.zze = i4 - i7;
    }

    private final byte zzv() throws IOException {
        int i4 = this.zzg;
        if (i4 == this.zze) {
            throw zzkb.zzi();
        }
        byte[] bArr = this.zzd;
        this.zzg = i4 + 1;
        return bArr[i4];
    }

    private final int zzw() throws IOException {
        int i4 = this.zzg;
        if (this.zze - i4 < 4) {
            throw zzkb.zzi();
        }
        byte[] bArr = this.zzd;
        this.zzg = i4 + 4;
        return ((bArr[i4 + 3] & 255) << 24) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16);
    }

    private final int zzx() throws IOException {
        int i4;
        int i5 = this.zzg;
        int i6 = this.zze;
        if (i6 != i5) {
            byte[] bArr = this.zzd;
            int i7 = i5 + 1;
            byte b5 = bArr[i5];
            if (b5 >= 0) {
                this.zzg = i7;
                return b5;
            }
            if (i6 - i7 >= 9) {
                int i10 = i5 + 2;
                int i11 = (bArr[i7] << 7) ^ b5;
                if (i11 < 0) {
                    i4 = i11 ^ (-128);
                } else {
                    int i12 = i5 + 3;
                    int i13 = (bArr[i10] << 14) ^ i11;
                    if (i13 >= 0) {
                        i4 = i13 ^ 16256;
                    } else {
                        int i14 = i5 + 4;
                        int i15 = i13 ^ (bArr[i12] << c.f54879y);
                        if (i15 < 0) {
                            i4 = (-2080896) ^ i15;
                        } else {
                            i12 = i5 + 5;
                            byte b6 = bArr[i14];
                            int i16 = (i15 ^ (b6 << c.F)) ^ 266354560;
                            if (b6 < 0) {
                                i14 = i5 + 6;
                                if (bArr[i12] < 0) {
                                    i12 = i5 + 7;
                                    if (bArr[i14] < 0) {
                                        i14 = i5 + 8;
                                        if (bArr[i12] < 0) {
                                            i12 = i5 + 9;
                                            if (bArr[i14] < 0) {
                                                int i17 = i5 + 10;
                                                if (bArr[i12] >= 0) {
                                                    i10 = i17;
                                                    i4 = i16;
                                                }
                                            }
                                        }
                                    }
                                }
                                i4 = i16;
                            }
                            i4 = i16;
                        }
                        i10 = i14;
                    }
                    i10 = i12;
                }
                this.zzg = i10;
                return i4;
            }
        }
        return (int) zzm();
    }

    private final long zzy() throws IOException {
        int i4 = this.zzg;
        if (this.zze - i4 < 8) {
            throw zzkb.zzi();
        }
        byte[] bArr = this.zzd;
        this.zzg = i4 + 8;
        return ((bArr[i4 + 7] & 255) << 56) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16) | ((bArr[i4 + 3] & 255) << 24) | ((bArr[i4 + 4] & 255) << 32) | ((bArr[i4 + 5] & 255) << 40) | ((bArr[i4 + 6] & 255) << 48);
    }

    private final long zzz() throws IOException {
        long j4;
        long j5;
        long j6;
        int i4 = this.zzg;
        int i5 = this.zze;
        if (i5 != i4) {
            byte[] bArr = this.zzd;
            int i6 = i4 + 1;
            byte b5 = bArr[i4];
            if (b5 >= 0) {
                this.zzg = i6;
                return b5;
            }
            if (i5 - i6 >= 9) {
                int i7 = i4 + 2;
                int i10 = (bArr[i6] << 7) ^ b5;
                if (i10 < 0) {
                    j4 = i10 ^ (-128);
                } else {
                    int i11 = i4 + 3;
                    int i12 = (bArr[i7] << 14) ^ i10;
                    if (i12 >= 0) {
                        j4 = i12 ^ 16256;
                        i7 = i11;
                    } else {
                        int i13 = i4 + 4;
                        int i14 = i12 ^ (bArr[i11] << c.f54879y);
                        if (i14 < 0) {
                            long j7 = (-2080896) ^ i14;
                            i7 = i13;
                            j4 = j7;
                        } else {
                            long j10 = i14;
                            i7 = i4 + 5;
                            long j11 = j10 ^ (bArr[i13] << 28);
                            if (j11 >= 0) {
                                j6 = 266354560;
                            } else {
                                int i15 = i4 + 6;
                                long j12 = j11 ^ (bArr[i7] << 35);
                                if (j12 < 0) {
                                    j5 = -34093383808L;
                                } else {
                                    i7 = i4 + 7;
                                    j11 = j12 ^ (bArr[i15] << 42);
                                    if (j11 >= 0) {
                                        j6 = 4363953127296L;
                                    } else {
                                        i15 = i4 + 8;
                                        j12 = j11 ^ (bArr[i7] << 49);
                                        if (j12 < 0) {
                                            j5 = -558586000294016L;
                                        } else {
                                            i7 = i4 + 9;
                                            long j13 = (j12 ^ (bArr[i15] << 56)) ^ 71499008037633920L;
                                            if (j13 < 0) {
                                                int i16 = i4 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i7 = i16;
                                                }
                                            }
                                            j4 = j13;
                                        }
                                    }
                                }
                                j4 = j12 ^ j5;
                                i7 = i15;
                            }
                            j4 = j11 ^ j6;
                        }
                    }
                }
                this.zzg = i7;
                return j4;
            }
        }
        return zzm();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final double zza() throws IOException {
        return Double.longBitsToDouble(zzy());
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final float zzb() throws IOException {
        return Float.intBitsToFloat(zzw());
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final int zzc() {
        return this.zzg - this.zzh;
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final int zzd() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final int zze() throws IOException {
        return zzw();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final int zzf() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final int zzg() throws IOException {
        return zzw();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final int zzh() throws IOException {
        return zziw.zza(zzx());
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final int zzi() throws IOException {
        if (zzt()) {
            this.zzi = 0;
            return 0;
        }
        int zzx = zzx();
        this.zzi = zzx;
        if ((zzx >>> 3) != 0) {
            return zzx;
        }
        throw zzkb.zzc();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final int zzj() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final long zzk() throws IOException {
        return zzy();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final long zzl() throws IOException {
        return zzz();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    final long zzm() throws IOException {
        long j4 = 0;
        for (int i4 = 0; i4 < 64; i4 += 7) {
            j4 |= (r3 & Byte.MAX_VALUE) << i4;
            if ((zzv() & 128) == 0) {
                return j4;
            }
        }
        throw zzkb.zze();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final long zzn() throws IOException {
        return zzy();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final long zzo() throws IOException {
        return zziw.zza(zzz());
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final long zzp() throws IOException {
        return zzz();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final zzik zzq() throws IOException {
        byte[] bArr;
        int zzx = zzx();
        if (zzx > 0) {
            int i4 = this.zze;
            int i5 = this.zzg;
            if (zzx <= i4 - i5) {
                zzik zza = zzik.zza(this.zzd, i5, zzx);
                this.zzg += zzx;
                return zza;
            }
        }
        if (zzx == 0) {
            return zzik.zza;
        }
        if (zzx > 0) {
            int i6 = this.zze;
            int i7 = this.zzg;
            if (zzx <= i6 - i7) {
                int i10 = zzx + i7;
                this.zzg = i10;
                bArr = Arrays.copyOfRange(this.zzd, i7, i10);
                return zzik.zzb(bArr);
            }
        }
        if (zzx > 0) {
            throw zzkb.zzi();
        }
        if (zzx != 0) {
            throw zzkb.zzf();
        }
        bArr = zzjv.zzb;
        return zzik.zzb(bArr);
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final String zzr() throws IOException {
        int zzx = zzx();
        if (zzx > 0) {
            int i4 = this.zze;
            int i5 = this.zzg;
            if (zzx <= i4 - i5) {
                String str = new String(this.zzd, i5, zzx, zzjv.zza);
                this.zzg += zzx;
                return str;
            }
        }
        if (zzx == 0) {
            return "";
        }
        if (zzx < 0) {
            throw zzkb.zzf();
        }
        throw zzkb.zzi();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final String zzs() throws IOException {
        int zzx = zzx();
        if (zzx > 0) {
            int i4 = this.zze;
            int i5 = this.zzg;
            if (zzx <= i4 - i5) {
                String zzb = zzmp.zzb(this.zzd, i5, zzx);
                this.zzg += zzx;
                return zzb;
            }
        }
        if (zzx == 0) {
            return "";
        }
        if (zzx <= 0) {
            throw zzkb.zzf();
        }
        throw zzkb.zzi();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final boolean zzt() throws IOException {
        return this.zzg == this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final boolean zzu() throws IOException {
        return zzz() != 0;
    }

    private zziz(byte[] bArr, int i4, int i5, boolean z4) {
        super();
        this.zzj = Integer.MAX_VALUE;
        this.zzd = bArr;
        this.zze = i5 + i4;
        this.zzg = i4;
        this.zzh = i4;
    }

    private final void zzf(int i4) throws IOException {
        if (i4 >= 0) {
            int i5 = this.zze;
            int i6 = this.zzg;
            if (i4 <= i5 - i6) {
                this.zzg = i6 + i4;
                return;
            }
        }
        if (i4 >= 0) {
            throw zzkb.zzi();
        }
        throw zzkb.zzf();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final int zzb(int i4) throws zzkb {
        if (i4 < 0) {
            throw zzkb.zzf();
        }
        int zzc = i4 + zzc();
        if (zzc < 0) {
            throw zzkb.zzg();
        }
        int i5 = this.zzj;
        if (zzc > i5) {
            throw zzkb.zzi();
        }
        this.zzj = zzc;
        zzaa();
        return i5;
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final void zzc(int i4) throws zzkb {
        if (this.zzi != i4) {
            throw zzkb.zzb();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final void zzd(int i4) {
        this.zzj = i4;
        zzaa();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final boolean zze(int i4) throws IOException {
        boolean zze;
        int i5 = i4 & 7;
        int i6 = 0;
        if (i5 == 0) {
            if (this.zze - this.zzg < 10) {
                while (i6 < 10) {
                    if (zzv() < 0) {
                        i6++;
                    }
                }
                throw zzkb.zze();
            }
            while (i6 < 10) {
                byte[] bArr = this.zzd;
                int i7 = this.zzg;
                this.zzg = i7 + 1;
                if (bArr[i7] < 0) {
                    i6++;
                }
            }
            throw zzkb.zze();
            return true;
        }
        if (i5 == 1) {
            zzf(8);
            return true;
        }
        if (i5 == 2) {
            zzf(zzx());
            return true;
        }
        if (i5 != 3) {
            if (i5 == 4) {
                return false;
            }
            if (i5 != 5) {
                throw zzkb.zza();
            }
            zzf(4);
            return true;
        }
        do {
            int zzi = zzi();
            if (zzi == 0) {
                break;
            }
            int i10 = this.zza;
            if (i10 >= this.zzb) {
                throw zzkb.zzh();
            }
            this.zza = i10 + 1;
            zze = zze(zzi);
            this.zza--;
        } while (zze);
        zzc(((i4 >>> 3) << 3) | 4);
        return true;
    }
}
