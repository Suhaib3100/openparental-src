package com.google.android.gms.internal.play_billing;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
final class zzfe {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    static int zza(byte[] bArr, int i4, zzfd zzfdVar) throws zzhb {
        int zzi = zzi(bArr, i4, zzfdVar);
        int i5 = zzfdVar.zza;
        if (i5 < 0) {
            throw new zzhb(ProtectedSandApp.s("히"));
        }
        if (i5 > bArr.length - zzi) {
            throw new zzhb(ProtectedSandApp.s("힇"));
        }
        if (i5 == 0) {
            zzfdVar.zzc = zzfp.zza;
            return zzi;
        }
        zzfdVar.zzc = zzfp.zzk(bArr, zzi, i5);
        return zzi + i5;
    }

    static int zzb(byte[] bArr, int i4) {
        int i5 = bArr[i4] & 255;
        int i6 = bArr[i4 + 1] & 255;
        int i7 = bArr[i4 + 2] & 255;
        return ((bArr[i4 + 3] & 255) << 24) | (i6 << 8) | i5 | (i7 << 16);
    }

    static int zzc(zzib zzibVar, byte[] bArr, int i4, int i5, int i6, zzfd zzfdVar) throws IOException {
        Object zze = zzibVar.zze();
        int zzm = zzm(zze, zzibVar, bArr, i4, i5, i6, zzfdVar);
        zzibVar.zzf(zze);
        zzfdVar.zzc = zze;
        return zzm;
    }

    static int zzd(zzib zzibVar, byte[] bArr, int i4, int i5, zzfd zzfdVar) throws IOException {
        Object zze = zzibVar.zze();
        int zzn = zzn(zze, zzibVar, bArr, i4, i5, zzfdVar);
        zzibVar.zzf(zze);
        zzfdVar.zzc = zze;
        return zzn;
    }

    static int zze(zzib zzibVar, int i4, byte[] bArr, int i5, int i6, zzgu zzguVar, zzfd zzfdVar) throws IOException {
        int zzd = zzd(zzibVar, bArr, i5, i6, zzfdVar);
        zzguVar.add(zzfdVar.zzc);
        while (zzd < i6) {
            int zzi = zzi(bArr, zzd, zzfdVar);
            if (i4 != zzfdVar.zza) {
                break;
            }
            zzd = zzd(zzibVar, bArr, zzi, i6, zzfdVar);
            zzguVar.add(zzfdVar.zzc);
        }
        return zzd;
    }

    static int zzf(byte[] bArr, int i4, zzgu zzguVar, zzfd zzfdVar) throws IOException {
        zzgq zzgqVar = (zzgq) zzguVar;
        int zzi = zzi(bArr, i4, zzfdVar);
        int i5 = zzfdVar.zza;
        if (i5 < 0) {
            throw new zzhb(ProtectedSandApp.s("히"));
        }
        int length = bArr.length - zzi;
        String s4 = ProtectedSandApp.s("힇");
        if (i5 > length) {
            throw new zzhb(s4);
        }
        int i6 = i5 + zzi;
        while (zzi < i6) {
            zzi = zzi(bArr, zzi, zzfdVar);
            zzgqVar.zzh(zzfdVar.zza);
        }
        if (zzi == i6) {
            return zzi;
        }
        throw new zzhb(s4);
    }

    static int zzg(byte[] bArr, int i4, zzfd zzfdVar) throws zzhb {
        int i5;
        int zzi = zzi(bArr, i4, zzfdVar);
        int i6 = zzfdVar.zza;
        if (i6 < 0) {
            throw new zzhb(ProtectedSandApp.s("히"));
        }
        if (i6 == 0) {
            zzfdVar.zzc = "";
            return zzi;
        }
        int i7 = zzjc.zza;
        int length = bArr.length;
        if ((((length - zzi) - i6) | zzi | i6) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format(ProtectedSandApp.s("힊"), Integer.valueOf(length), Integer.valueOf(zzi), Integer.valueOf(i6)));
        }
        int i10 = zzi + i6;
        char[] cArr = new char[i6];
        int i11 = 0;
        while (zzi < i10) {
            byte b5 = bArr[zzi];
            if (!zziy.zzd(b5)) {
                break;
            }
            zzi++;
            cArr[i11] = (char) b5;
            i11++;
        }
        int i12 = i11;
        while (zzi < i10) {
            int i13 = zzi + 1;
            byte b6 = bArr[zzi];
            if (zziy.zzd(b6)) {
                cArr[i12] = (char) b6;
                i12++;
                zzi = i13;
                while (zzi < i10) {
                    byte b7 = bArr[zzi];
                    if (zziy.zzd(b7)) {
                        zzi++;
                        cArr[i12] = (char) b7;
                        i12++;
                    }
                }
            } else {
                String s4 = ProtectedSandApp.s("힉");
                if (b6 < -32) {
                    if (i13 >= i10) {
                        throw new zzhb(s4);
                    }
                    i5 = i12 + 1;
                    zzi += 2;
                    zziy.zzc(b6, bArr[i13], cArr, i12);
                } else if (b6 < -16) {
                    if (i13 >= i10 - 1) {
                        throw new zzhb(s4);
                    }
                    i5 = i12 + 1;
                    int i14 = zzi + 2;
                    zzi += 3;
                    zziy.zzb(b6, bArr[i13], bArr[i14], cArr, i12);
                } else {
                    if (i13 >= i10 - 2) {
                        throw new zzhb(s4);
                    }
                    byte b10 = bArr[i13];
                    int i15 = zzi + 3;
                    byte b11 = bArr[zzi + 2];
                    zzi += 4;
                    zziy.zza(b6, b10, b11, bArr[i15], cArr, i12);
                    i12 += 2;
                }
                i12 = i5;
            }
        }
        zzfdVar.zzc = new String(cArr, 0, i12);
        return i10;
    }

    static int zzh(int i4, byte[] bArr, int i5, int i6, zzir zzirVar, zzfd zzfdVar) throws zzhb {
        int i7 = i4 >>> 3;
        String s4 = ProtectedSandApp.s("힋");
        if (i7 == 0) {
            throw new zzhb(s4);
        }
        int i10 = i4 & 7;
        if (i10 == 0) {
            int zzl = zzl(bArr, i5, zzfdVar);
            zzirVar.zzj(i4, Long.valueOf(zzfdVar.zzb));
            return zzl;
        }
        if (i10 == 1) {
            zzirVar.zzj(i4, Long.valueOf(zzp(bArr, i5)));
            return i5 + 8;
        }
        if (i10 == 2) {
            int zzi = zzi(bArr, i5, zzfdVar);
            int i11 = zzfdVar.zza;
            if (i11 < 0) {
                throw new zzhb(ProtectedSandApp.s("히"));
            }
            if (i11 > bArr.length - zzi) {
                throw new zzhb(ProtectedSandApp.s("힇"));
            }
            if (i11 == 0) {
                zzirVar.zzj(i4, zzfp.zza);
            } else {
                zzirVar.zzj(i4, zzfp.zzk(bArr, zzi, i11));
            }
            return zzi + i11;
        }
        if (i10 != 3) {
            if (i10 != 5) {
                throw new zzhb(s4);
            }
            zzirVar.zzj(i4, Integer.valueOf(zzb(bArr, i5)));
            return i5 + 4;
        }
        int i12 = (i4 & (-8)) | 4;
        zzir zzf = zzir.zzf();
        int i13 = zzfdVar.zze + 1;
        zzfdVar.zze = i13;
        zzq(i13);
        int i14 = 0;
        while (true) {
            if (i5 >= i6) {
                break;
            }
            int zzi2 = zzi(bArr, i5, zzfdVar);
            i14 = zzfdVar.zza;
            if (i14 == i12) {
                i5 = zzi2;
                break;
            }
            i5 = zzh(i14, bArr, zzi2, i6, zzf, zzfdVar);
        }
        zzfdVar.zze--;
        if (i5 > i6 || i14 != i12) {
            throw new zzhb(ProtectedSandApp.s("힌"));
        }
        zzirVar.zzj(i4, zzf);
        return i5;
    }

    static int zzi(byte[] bArr, int i4, zzfd zzfdVar) {
        int i5 = i4 + 1;
        byte b5 = bArr[i4];
        if (b5 < 0) {
            return zzj(b5, bArr, i5, zzfdVar);
        }
        zzfdVar.zza = b5;
        return i5;
    }

    static int zzj(int i4, byte[] bArr, int i5, zzfd zzfdVar) {
        byte b5 = bArr[i5];
        int i6 = i5 + 1;
        int i7 = i4 & 127;
        if (b5 >= 0) {
            zzfdVar.zza = i7 | (b5 << 7);
            return i6;
        }
        int i10 = i7 | ((b5 & Byte.MAX_VALUE) << 7);
        int i11 = i5 + 2;
        byte b6 = bArr[i6];
        if (b6 >= 0) {
            zzfdVar.zza = i10 | (b6 << 14);
            return i11;
        }
        int i12 = i10 | ((b6 & Byte.MAX_VALUE) << 14);
        int i13 = i5 + 3;
        byte b7 = bArr[i11];
        if (b7 >= 0) {
            zzfdVar.zza = i12 | (b7 << com.google.common.base.c.f54879y);
            return i13;
        }
        int i14 = i12 | ((b7 & Byte.MAX_VALUE) << 21);
        int i15 = i5 + 4;
        byte b10 = bArr[i13];
        if (b10 >= 0) {
            zzfdVar.zza = i14 | (b10 << com.google.common.base.c.F);
            return i15;
        }
        int i16 = i14 | ((b10 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i17 = i15 + 1;
            if (bArr[i15] >= 0) {
                zzfdVar.zza = i16;
                return i17;
            }
            i15 = i17;
        }
    }

    static int zzk(int i4, byte[] bArr, int i5, int i6, zzgu zzguVar, zzfd zzfdVar) {
        zzgq zzgqVar = (zzgq) zzguVar;
        int zzi = zzi(bArr, i5, zzfdVar);
        zzgqVar.zzh(zzfdVar.zza);
        while (zzi < i6) {
            int zzi2 = zzi(bArr, zzi, zzfdVar);
            if (i4 != zzfdVar.zza) {
                break;
            }
            zzi = zzi(bArr, zzi2, zzfdVar);
            zzgqVar.zzh(zzfdVar.zza);
        }
        return zzi;
    }

    static int zzl(byte[] bArr, int i4, zzfd zzfdVar) {
        long j4 = bArr[i4];
        int i5 = i4 + 1;
        if (j4 >= 0) {
            zzfdVar.zzb = j4;
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
        zzfdVar.zzb = j5;
        return i6;
    }

    static int zzm(Object obj, zzib zzibVar, byte[] bArr, int i4, int i5, int i6, zzfd zzfdVar) throws IOException {
        zzhu zzhuVar = (zzhu) zzibVar;
        int i7 = zzfdVar.zze + 1;
        zzfdVar.zze = i7;
        zzq(i7);
        int zzc = zzhuVar.zzc(obj, bArr, i4, i5, i6, zzfdVar);
        zzfdVar.zze--;
        zzfdVar.zzc = obj;
        return zzc;
    }

    static int zzn(Object obj, zzib zzibVar, byte[] bArr, int i4, int i5, zzfd zzfdVar) throws IOException {
        int i6 = i4 + 1;
        int i7 = bArr[i4];
        if (i7 < 0) {
            i6 = zzj(i7, bArr, i6, zzfdVar);
            i7 = zzfdVar.zza;
        }
        int i10 = i6;
        if (i7 < 0 || i7 > i5 - i10) {
            throw new zzhb(ProtectedSandApp.s("힇"));
        }
        int i11 = zzfdVar.zze + 1;
        zzfdVar.zze = i11;
        zzq(i11);
        int i12 = i7 + i10;
        zzibVar.zzh(obj, bArr, i10, i12, zzfdVar);
        zzfdVar.zze--;
        zzfdVar.zzc = obj;
        return i12;
    }

    static int zzo(int i4, byte[] bArr, int i5, int i6, zzfd zzfdVar) throws zzhb {
        int i7 = i4 >>> 3;
        String s4 = ProtectedSandApp.s("힋");
        if (i7 == 0) {
            throw new zzhb(s4);
        }
        int i10 = i4 & 7;
        if (i10 == 0) {
            return zzl(bArr, i5, zzfdVar);
        }
        if (i10 == 1) {
            return i5 + 8;
        }
        if (i10 == 2) {
            return zzi(bArr, i5, zzfdVar) + zzfdVar.zza;
        }
        if (i10 != 3) {
            if (i10 == 5) {
                return i5 + 4;
            }
            throw new zzhb(s4);
        }
        int i11 = (i4 & (-8)) | 4;
        int i12 = zzfdVar.zze + 1;
        zzfdVar.zze = i12;
        zzq(i12);
        int i13 = 0;
        while (i5 < i6) {
            i5 = zzi(bArr, i5, zzfdVar);
            i13 = zzfdVar.zza;
            if (i13 == i11) {
                break;
            }
            i5 = zzo(i13, bArr, i5, i6, zzfdVar);
        }
        zzfdVar.zze--;
        if (i5 > i6 || i13 != i11) {
            throw new zzhb(ProtectedSandApp.s("힌"));
        }
        return i5;
    }

    static long zzp(byte[] bArr, int i4) {
        return (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16) | ((bArr[i4 + 3] & 255) << 24) | ((bArr[i4 + 4] & 255) << 32) | ((bArr[i4 + 5] & 255) << 40) | ((bArr[i4 + 6] & 255) << 48) | ((bArr[i4 + 7] & 255) << 56);
    }

    private static void zzq(int i4) throws zzhb {
        if (i4 >= zzb) {
            throw new zzhb(ProtectedSandApp.s("힍"));
        }
    }
}
