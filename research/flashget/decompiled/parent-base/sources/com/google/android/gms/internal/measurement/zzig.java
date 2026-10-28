package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjt;
import com.google.common.base.c;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
/* loaded from: classes5.dex */
final class zzig {
    private static volatile int zza = 100;

    static double zza(byte[] bArr, int i4) {
        return Double.longBitsToDouble(zzd(bArr, i4));
    }

    static float zzb(byte[] bArr, int i4) {
        return Float.intBitsToFloat(zzc(bArr, i4));
    }

    static int zzc(byte[] bArr, int i4) {
        return ((bArr[i4 + 3] & 255) << 24) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16);
    }

    static int zzd(byte[] bArr, int i4, zzij zzijVar) {
        int i5 = i4 + 1;
        long j4 = bArr[i4];
        if (j4 >= 0) {
            zzijVar.zzb = j4;
            return i5;
        }
        int i6 = i4 + 2;
        byte b5 = bArr[i5];
        long j5 = (j4 & 127) | ((b5 & Byte.MAX_VALUE) << 7);
        int i7 = 7;
        while (b5 < 0) {
            int i10 = i6 + 1;
            i7 += 7;
            j5 |= (r10 & Byte.MAX_VALUE) << i7;
            b5 = bArr[i6];
            i6 = i10;
        }
        zzijVar.zzb = j5;
        return i6;
    }

    static int zza(byte[] bArr, int i4, zzij zzijVar) throws zzkb {
        int zzc = zzc(bArr, i4, zzijVar);
        int i5 = zzijVar.zza;
        if (i5 < 0) {
            throw zzkb.zzf();
        }
        if (i5 > bArr.length - zzc) {
            throw zzkb.zzi();
        }
        if (i5 == 0) {
            zzijVar.zzc = zzik.zza;
            return zzc;
        }
        zzijVar.zzc = zzik.zza(bArr, zzc, i5);
        return zzc + i5;
    }

    static int zzb(zzlu<?> zzluVar, int i4, byte[] bArr, int i5, int i6, zzkc<?> zzkcVar, zzij zzijVar) throws IOException {
        int zza2 = zza(zzluVar, bArr, i5, i6, zzijVar);
        zzkcVar.add(zzijVar.zzc);
        while (zza2 < i6) {
            int zzc = zzc(bArr, zza2, zzijVar);
            if (i4 != zzijVar.zza) {
                break;
            }
            zza2 = zza(zzluVar, bArr, zzc, i6, zzijVar);
            zzkcVar.add(zzijVar.zzc);
        }
        return zza2;
    }

    static int zzc(byte[] bArr, int i4, zzij zzijVar) {
        int i5 = i4 + 1;
        byte b5 = bArr[i4];
        if (b5 < 0) {
            return zza(b5, bArr, i5, zzijVar);
        }
        zzijVar.zza = b5;
        return i5;
    }

    static long zzd(byte[] bArr, int i4) {
        return ((bArr[i4 + 7] & 255) << 56) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16) | ((bArr[i4 + 3] & 255) << 24) | ((bArr[i4 + 4] & 255) << 32) | ((bArr[i4 + 5] & 255) << 40) | ((bArr[i4 + 6] & 255) << 48);
    }

    static int zzb(byte[] bArr, int i4, zzij zzijVar) throws zzkb {
        int zzc = zzc(bArr, i4, zzijVar);
        int i5 = zzijVar.zza;
        if (i5 < 0) {
            throw zzkb.zzf();
        }
        if (i5 == 0) {
            zzijVar.zzc = "";
            return zzc;
        }
        zzijVar.zzc = zzmp.zzb(bArr, zzc, i5);
        return zzc + i5;
    }

    static int zza(int i4, byte[] bArr, int i5, int i6, Object obj, zzlc zzlcVar, zzmk<zzmj, zzmj> zzmkVar, zzij zzijVar) throws IOException {
        if (zzijVar.zzd.zza(zzlcVar, i4 >>> 3) == null) {
            return zza(i4, bArr, i5, i6, zzlg.zzc(obj), zzijVar);
        }
        zzjt.zzd zzdVar = (zzjt.zzd) obj;
        zzdVar.zza();
        zzjm<zzjt.zzc> zzjmVar = zzdVar.zzc;
        throw new NoSuchMethodError();
    }

    private static int zza(zzlu zzluVar, byte[] bArr, int i4, int i5, int i6, zzij zzijVar) throws IOException {
        Object zza2 = zzluVar.zza();
        int zza3 = zza(zza2, zzluVar, bArr, i4, i5, i6, zzijVar);
        zzluVar.zzd(zza2);
        zzijVar.zzc = zza2;
        return zza3;
    }

    static int zza(zzlu zzluVar, int i4, byte[] bArr, int i5, int i6, zzkc<?> zzkcVar, zzij zzijVar) throws IOException {
        int i7 = (i4 & (-8)) | 4;
        int zza2 = zza(zzluVar, bArr, i5, i6, i7, zzijVar);
        zzkcVar.add(zzijVar.zzc);
        while (zza2 < i6) {
            int zzc = zzc(bArr, zza2, zzijVar);
            if (i4 != zzijVar.zza) {
                break;
            }
            zza2 = zza(zzluVar, bArr, zzc, i6, i7, zzijVar);
            zzkcVar.add(zzijVar.zzc);
        }
        return zza2;
    }

    static int zza(zzlu zzluVar, byte[] bArr, int i4, int i5, zzij zzijVar) throws IOException {
        Object zza2 = zzluVar.zza();
        int zza3 = zza(zza2, zzluVar, bArr, i4, i5, zzijVar);
        zzluVar.zzd(zza2);
        zzijVar.zzc = zza2;
        return zza3;
    }

    static int zza(byte[] bArr, int i4, zzkc<?> zzkcVar, zzij zzijVar) throws IOException {
        zzjw zzjwVar = (zzjw) zzkcVar;
        int zzc = zzc(bArr, i4, zzijVar);
        int i5 = zzijVar.zza + zzc;
        while (zzc < i5) {
            zzc = zzc(bArr, zzc, zzijVar);
            zzjwVar.zzd(zzijVar.zza);
        }
        if (zzc == i5) {
            return zzc;
        }
        throw zzkb.zzi();
    }

    static int zza(int i4, byte[] bArr, int i5, int i6, zzmj zzmjVar, zzij zzijVar) throws zzkb {
        if ((i4 >>> 3) == 0) {
            throw zzkb.zzc();
        }
        int i7 = i4 & 7;
        if (i7 == 0) {
            int zzd = zzd(bArr, i5, zzijVar);
            zzmjVar.zza(i4, Long.valueOf(zzijVar.zzb));
            return zzd;
        }
        if (i7 == 1) {
            zzmjVar.zza(i4, Long.valueOf(zzd(bArr, i5)));
            return i5 + 8;
        }
        if (i7 == 2) {
            int zzc = zzc(bArr, i5, zzijVar);
            int i10 = zzijVar.zza;
            if (i10 >= 0) {
                if (i10 > bArr.length - zzc) {
                    throw zzkb.zzi();
                }
                if (i10 == 0) {
                    zzmjVar.zza(i4, zzik.zza);
                } else {
                    zzmjVar.zza(i4, zzik.zza(bArr, zzc, i10));
                }
                return zzc + i10;
            }
            throw zzkb.zzf();
        }
        if (i7 != 3) {
            if (i7 == 5) {
                zzmjVar.zza(i4, Integer.valueOf(zzc(bArr, i5)));
                return i5 + 4;
            }
            throw zzkb.zzc();
        }
        zzmj zzd2 = zzmj.zzd();
        int i11 = (i4 & (-8)) | 4;
        int i12 = zzijVar.zze + 1;
        zzijVar.zze = i12;
        zza(i12);
        int i13 = 0;
        while (true) {
            if (i5 >= i6) {
                break;
            }
            int zzc2 = zzc(bArr, i5, zzijVar);
            int i14 = zzijVar.zza;
            i13 = i14;
            if (i14 == i11) {
                i5 = zzc2;
                break;
            }
            int zza2 = zza(i13, bArr, zzc2, i6, zzd2, zzijVar);
            i13 = i14;
            i5 = zza2;
        }
        zzijVar.zze--;
        if (i5 <= i6 && i13 == i11) {
            zzmjVar.zza(i4, zzd2);
            return i5;
        }
        throw zzkb.zzg();
    }

    static int zza(int i4, byte[] bArr, int i5, zzij zzijVar) {
        int i6 = i4 & 127;
        int i7 = i5 + 1;
        byte b5 = bArr[i5];
        if (b5 >= 0) {
            zzijVar.zza = i6 | (b5 << 7);
            return i7;
        }
        int i10 = i6 | ((b5 & Byte.MAX_VALUE) << 7);
        int i11 = i5 + 2;
        byte b6 = bArr[i7];
        if (b6 >= 0) {
            zzijVar.zza = i10 | (b6 << 14);
            return i11;
        }
        int i12 = i10 | ((b6 & Byte.MAX_VALUE) << 14);
        int i13 = i5 + 3;
        byte b7 = bArr[i11];
        if (b7 >= 0) {
            zzijVar.zza = i12 | (b7 << c.f54879y);
            return i13;
        }
        int i14 = i12 | ((b7 & Byte.MAX_VALUE) << 21);
        int i15 = i5 + 4;
        byte b10 = bArr[i13];
        if (b10 >= 0) {
            zzijVar.zza = i14 | (b10 << c.F);
            return i15;
        }
        int i16 = i14 | ((b10 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i17 = i15 + 1;
            if (bArr[i15] >= 0) {
                zzijVar.zza = i16;
                return i17;
            }
            i15 = i17;
        }
    }

    static int zza(int i4, byte[] bArr, int i5, int i6, zzkc<?> zzkcVar, zzij zzijVar) {
        zzjw zzjwVar = (zzjw) zzkcVar;
        int zzc = zzc(bArr, i5, zzijVar);
        zzjwVar.zzd(zzijVar.zza);
        while (zzc < i6) {
            int zzc2 = zzc(bArr, zzc, zzijVar);
            if (i4 != zzijVar.zza) {
                break;
            }
            zzc = zzc(bArr, zzc2, zzijVar);
            zzjwVar.zzd(zzijVar.zza);
        }
        return zzc;
    }

    static int zza(Object obj, zzlu zzluVar, byte[] bArr, int i4, int i5, int i6, zzij zzijVar) throws IOException {
        zzlg zzlgVar = (zzlg) zzluVar;
        int i7 = zzijVar.zze + 1;
        zzijVar.zze = i7;
        zza(i7);
        int zza2 = zzlgVar.zza((zzlg) obj, bArr, i4, i5, i6, zzijVar);
        zzijVar.zze--;
        zzijVar.zzc = obj;
        return zza2;
    }

    static int zza(Object obj, zzlu zzluVar, byte[] bArr, int i4, int i5, zzij zzijVar) throws IOException {
        int i6 = i4 + 1;
        int i7 = bArr[i4];
        if (i7 < 0) {
            i6 = zza(i7, bArr, i6, zzijVar);
            i7 = zzijVar.zza;
        }
        int i10 = i6;
        if (i7 >= 0 && i7 <= i5 - i10) {
            int i11 = zzijVar.zze + 1;
            zzijVar.zze = i11;
            zza(i11);
            int i12 = i7 + i10;
            zzluVar.zza(obj, bArr, i10, i12, zzijVar);
            zzijVar.zze--;
            zzijVar.zzc = obj;
            return i12;
        }
        throw zzkb.zzi();
    }

    static int zza(int i4, byte[] bArr, int i5, int i6, zzij zzijVar) throws zzkb {
        if ((i4 >>> 3) == 0) {
            throw zzkb.zzc();
        }
        int i7 = i4 & 7;
        if (i7 == 0) {
            return zzd(bArr, i5, zzijVar);
        }
        if (i7 == 1) {
            return i5 + 8;
        }
        if (i7 == 2) {
            return zzc(bArr, i5, zzijVar) + zzijVar.zza;
        }
        if (i7 != 3) {
            if (i7 == 5) {
                return i5 + 4;
            }
            throw zzkb.zzc();
        }
        int i10 = (i4 & (-8)) | 4;
        int i11 = 0;
        while (i5 < i6) {
            i5 = zzc(bArr, i5, zzijVar);
            i11 = zzijVar.zza;
            if (i11 == i10) {
                break;
            }
            i5 = zza(i11, bArr, i5, i6, zzijVar);
        }
        if (i5 > i6 || i11 != i10) {
            throw zzkb.zzg();
        }
        return i5;
    }

    private static void zza(int i4) throws zzkb {
        if (i4 >= zza) {
            throw zzkb.zzh();
        }
    }
}
