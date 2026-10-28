package com.google.android.gms.internal.auth;

import androidx.constraintlayout.core.parser.b;
import androidx.core.app.i0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes5.dex */
final class zzga<T> implements zzgi<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhj.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzfx zzg;
    private final int[] zzh;
    private final int zzi;
    private final int zzj;
    private final zzfl zzk;
    private final zzgz zzl;
    private final zzem zzm;
    private final zzgc zzn;
    private final zzfs zzo;

    private zzga(int[] iArr, Object[] objArr, int i4, int i5, zzfx zzfxVar, int i6, boolean z4, int[] iArr2, int i7, int i10, zzgc zzgcVar, zzfl zzflVar, zzgz zzgzVar, zzem zzemVar, zzfs zzfsVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i4;
        this.zzf = i5;
        this.zzh = iArr2;
        this.zzi = i7;
        this.zzj = i10;
        this.zzn = zzgcVar;
        this.zzk = zzflVar;
        this.zzl = zzgzVar;
        this.zzm = zzemVar;
        this.zzg = zzfxVar;
        this.zzo = zzfsVar;
    }

    private final void zzA(Object obj, int i4, int i5) {
        zzhj.zzn(obj, zzl(i5) & 1048575, i4);
    }

    private final void zzB(Object obj, int i4, Object obj2) {
        zzb.putObject(obj, zzo(i4) & 1048575, obj2);
        zzz(obj, i4);
    }

    private final void zzC(Object obj, int i4, int i5, Object obj2) {
        zzb.putObject(obj, zzo(i5) & 1048575, obj2);
        zzA(obj, i4, i5);
    }

    private final boolean zzD(Object obj, Object obj2, int i4) {
        return zzE(obj, i4) == zzE(obj2, i4);
    }

    private final boolean zzE(Object obj, int i4) {
        int zzl = zzl(i4);
        long j4 = zzl & 1048575;
        if (j4 != 1048575) {
            return (zzhj.zzc(obj, j4) & (1 << (zzl >>> 20))) != 0;
        }
        int zzo = zzo(i4);
        long j5 = zzo & 1048575;
        switch (zzn(zzo)) {
            case 0:
                return Double.doubleToRawLongBits(zzhj.zza(obj, j5)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzhj.zzb(obj, j5)) != 0;
            case 2:
                return zzhj.zzd(obj, j5) != 0;
            case 3:
                return zzhj.zzd(obj, j5) != 0;
            case 4:
                return zzhj.zzc(obj, j5) != 0;
            case 5:
                return zzhj.zzd(obj, j5) != 0;
            case 6:
                return zzhj.zzc(obj, j5) != 0;
            case 7:
                return zzhj.zzt(obj, j5);
            case 8:
                Object zzf = zzhj.zzf(obj, j5);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzef) {
                    return !zzef.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzhj.zzf(obj, j5) != null;
            case 10:
                return !zzef.zzb.equals(zzhj.zzf(obj, j5));
            case 11:
                return zzhj.zzc(obj, j5) != 0;
            case 12:
                return zzhj.zzc(obj, j5) != 0;
            case 13:
                return zzhj.zzc(obj, j5) != 0;
            case 14:
                return zzhj.zzd(obj, j5) != 0;
            case 15:
                return zzhj.zzc(obj, j5) != 0;
            case 16:
                return zzhj.zzd(obj, j5) != 0;
            case 17:
                return zzhj.zzf(obj, j5) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzF(Object obj, int i4, int i5, int i6, int i7) {
        return i5 == 1048575 ? zzE(obj, i4) : (i6 & i7) != 0;
    }

    private static boolean zzG(Object obj, int i4, zzgi zzgiVar) {
        return zzgiVar.zzi(zzhj.zzf(obj, i4 & 1048575));
    }

    private static boolean zzH(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzev) {
            return ((zzev) obj).zzm();
        }
        return true;
    }

    private final boolean zzI(Object obj, int i4, int i5) {
        return zzhj.zzc(obj, (long) (zzl(i5) & 1048575)) == i4;
    }

    static zzha zzc(Object obj) {
        zzev zzevVar = (zzev) obj;
        zzha zzhaVar = zzevVar.zzc;
        if (zzhaVar != zzha.zza()) {
            return zzhaVar;
        }
        zzha zzd = zzha.zzd();
        zzevVar.zzc = zzd;
        return zzd;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0256  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static com.google.android.gms.internal.auth.zzga zzj(java.lang.Class r31, com.google.android.gms.internal.auth.zzfu r32, com.google.android.gms.internal.auth.zzgc r33, com.google.android.gms.internal.auth.zzfl r34, com.google.android.gms.internal.auth.zzgz r35, com.google.android.gms.internal.auth.zzem r36, com.google.android.gms.internal.auth.zzfs r37) {
        /*
            Method dump skipped, instructions count: 1008
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzga.zzj(java.lang.Class, com.google.android.gms.internal.auth.zzfu, com.google.android.gms.internal.auth.zzgc, com.google.android.gms.internal.auth.zzfl, com.google.android.gms.internal.auth.zzgz, com.google.android.gms.internal.auth.zzem, com.google.android.gms.internal.auth.zzfs):com.google.android.gms.internal.auth.zzga");
    }

    private static int zzk(Object obj, long j4) {
        return ((Integer) zzhj.zzf(obj, j4)).intValue();
    }

    private final int zzl(int i4) {
        return this.zzc[i4 + 2];
    }

    private final int zzm(int i4, int i5) {
        int length = (this.zzc.length / 3) - 1;
        while (i5 <= length) {
            int i6 = (length + i5) >>> 1;
            int i7 = i6 * 3;
            int i10 = this.zzc[i7];
            if (i4 == i10) {
                return i7;
            }
            if (i4 < i10) {
                length = i6 - 1;
            } else {
                i5 = i6 + 1;
            }
        }
        return -1;
    }

    private static int zzn(int i4) {
        return (i4 >>> 20) & 255;
    }

    private final int zzo(int i4) {
        return this.zzc[i4 + 1];
    }

    private static long zzp(Object obj, long j4) {
        return ((Long) zzhj.zzf(obj, j4)).longValue();
    }

    private final zzey zzq(int i4) {
        int i5 = i4 / 3;
        return (zzey) this.zzd[i5 + i5 + 1];
    }

    private final zzgi zzr(int i4) {
        int i5 = i4 / 3;
        int i6 = i5 + i5;
        zzgi zzgiVar = (zzgi) this.zzd[i6];
        if (zzgiVar != null) {
            return zzgiVar;
        }
        zzgi zzb2 = zzgf.zza().zzb((Class) this.zzd[i6 + 1]);
        this.zzd[i6] = zzb2;
        return zzb2;
    }

    private final Object zzs(int i4) {
        int i5 = i4 / 3;
        return this.zzd[i5 + i5];
    }

    private final Object zzt(Object obj, int i4) {
        zzgi zzr = zzr(i4);
        int zzo = zzo(i4) & 1048575;
        if (!zzE(obj, i4)) {
            return zzr.zzd();
        }
        Object object = zzb.getObject(obj, zzo);
        if (zzH(object)) {
            return object;
        }
        Object zzd = zzr.zzd();
        if (object != null) {
            zzr.zzf(zzd, object);
        }
        return zzd;
    }

    private final Object zzu(Object obj, int i4, int i5) {
        zzgi zzr = zzr(i5);
        if (!zzI(obj, i4, i5)) {
            return zzr.zzd();
        }
        Object object = zzb.getObject(obj, zzo(i5) & 1048575);
        if (zzH(object)) {
            return object;
        }
        Object zzd = zzr.zzd();
        if (object != null) {
            zzr.zzf(zzd, object);
        }
        return zzd;
    }

    private static Field zzv(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder a5 = b.a(ProtectedSandApp.s("콥"), str, ProtectedSandApp.s("콦"), name, ProtectedSandApp.s("콧"));
            a5.append(arrays);
            throw new RuntimeException(a5.toString());
        }
    }

    private static void zzw(Object obj) {
        if (zzH(obj)) {
            return;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("콨").concat(String.valueOf(obj)));
    }

    private final void zzx(Object obj, Object obj2, int i4) {
        if (zzE(obj2, i4)) {
            int zzo = zzo(i4) & 1048575;
            Unsafe unsafe = zzb;
            long j4 = zzo;
            Object object = unsafe.getObject(obj2, j4);
            if (object == null) {
                throw new IllegalStateException(i0.a(ProtectedSandApp.s("콩"), this.zzc[i4], ProtectedSandApp.s("콪"), obj2.toString()));
            }
            zzgi zzr = zzr(i4);
            if (!zzE(obj, i4)) {
                if (zzH(object)) {
                    Object zzd = zzr.zzd();
                    zzr.zzf(zzd, object);
                    unsafe.putObject(obj, j4, zzd);
                } else {
                    unsafe.putObject(obj, j4, object);
                }
                zzz(obj, i4);
                return;
            }
            Object object2 = unsafe.getObject(obj, j4);
            if (!zzH(object2)) {
                Object zzd2 = zzr.zzd();
                zzr.zzf(zzd2, object2);
                unsafe.putObject(obj, j4, zzd2);
                object2 = zzd2;
            }
            zzr.zzf(object2, object);
        }
    }

    private final void zzy(Object obj, Object obj2, int i4) {
        int i5 = this.zzc[i4];
        if (zzI(obj2, i5, i4)) {
            int zzo = zzo(i4) & 1048575;
            Unsafe unsafe = zzb;
            long j4 = zzo;
            Object object = unsafe.getObject(obj2, j4);
            if (object == null) {
                throw new IllegalStateException(i0.a(ProtectedSandApp.s("콩"), this.zzc[i4], ProtectedSandApp.s("콪"), obj2.toString()));
            }
            zzgi zzr = zzr(i4);
            if (!zzI(obj, i5, i4)) {
                if (zzH(object)) {
                    Object zzd = zzr.zzd();
                    zzr.zzf(zzd, object);
                    unsafe.putObject(obj, j4, zzd);
                } else {
                    unsafe.putObject(obj, j4, object);
                }
                zzA(obj, i5, i4);
                return;
            }
            Object object2 = unsafe.getObject(obj, j4);
            if (!zzH(object2)) {
                Object zzd2 = zzr.zzd();
                zzr.zzf(zzd2, object2);
                unsafe.putObject(obj, j4, zzd2);
                object2 = zzd2;
            }
            zzr.zzf(object2, object);
        }
    }

    private final void zzz(Object obj, int i4) {
        int zzl = zzl(i4);
        long j4 = 1048575 & zzl;
        if (j4 == 1048575) {
            return;
        }
        zzhj.zzn(obj, j4, (1 << (zzl >>> 20)) | zzhj.zzc(obj, j4));
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final int zza(Object obj) {
        int i4;
        long doubleToLongBits;
        int i5;
        int floatToIntBits;
        int zzc;
        int length = this.zzc.length;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7 += 3) {
            int zzo = zzo(i7);
            int i10 = this.zzc[i7];
            long j4 = 1048575 & zzo;
            int i11 = 37;
            switch (zzn(zzo)) {
                case 0:
                    i4 = i6 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzhj.zza(obj, j4));
                    byte[] bArr = zzfa.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i6 = i4 + zzc;
                    break;
                case 1:
                    i5 = i6 * 53;
                    floatToIntBits = Float.floatToIntBits(zzhj.zzb(obj, j4));
                    i6 = floatToIntBits + i5;
                    break;
                case 2:
                    i4 = i6 * 53;
                    doubleToLongBits = zzhj.zzd(obj, j4);
                    byte[] bArr2 = zzfa.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i6 = i4 + zzc;
                    break;
                case 3:
                    i4 = i6 * 53;
                    doubleToLongBits = zzhj.zzd(obj, j4);
                    byte[] bArr3 = zzfa.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i6 = i4 + zzc;
                    break;
                case 4:
                    i4 = i6 * 53;
                    zzc = zzhj.zzc(obj, j4);
                    i6 = i4 + zzc;
                    break;
                case 5:
                    i4 = i6 * 53;
                    doubleToLongBits = zzhj.zzd(obj, j4);
                    byte[] bArr4 = zzfa.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i6 = i4 + zzc;
                    break;
                case 6:
                    i4 = i6 * 53;
                    zzc = zzhj.zzc(obj, j4);
                    i6 = i4 + zzc;
                    break;
                case 7:
                    i5 = i6 * 53;
                    floatToIntBits = zzfa.zza(zzhj.zzt(obj, j4));
                    i6 = floatToIntBits + i5;
                    break;
                case 8:
                    i5 = i6 * 53;
                    floatToIntBits = ((String) zzhj.zzf(obj, j4)).hashCode();
                    i6 = floatToIntBits + i5;
                    break;
                case 9:
                    Object zzf = zzhj.zzf(obj, j4);
                    if (zzf != null) {
                        i11 = zzf.hashCode();
                    }
                    i6 = (i6 * 53) + i11;
                    break;
                case 10:
                    i5 = i6 * 53;
                    floatToIntBits = zzhj.zzf(obj, j4).hashCode();
                    i6 = floatToIntBits + i5;
                    break;
                case 11:
                    i4 = i6 * 53;
                    zzc = zzhj.zzc(obj, j4);
                    i6 = i4 + zzc;
                    break;
                case 12:
                    i4 = i6 * 53;
                    zzc = zzhj.zzc(obj, j4);
                    i6 = i4 + zzc;
                    break;
                case 13:
                    i4 = i6 * 53;
                    zzc = zzhj.zzc(obj, j4);
                    i6 = i4 + zzc;
                    break;
                case 14:
                    i4 = i6 * 53;
                    doubleToLongBits = zzhj.zzd(obj, j4);
                    byte[] bArr5 = zzfa.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i6 = i4 + zzc;
                    break;
                case 15:
                    i4 = i6 * 53;
                    zzc = zzhj.zzc(obj, j4);
                    i6 = i4 + zzc;
                    break;
                case 16:
                    i4 = i6 * 53;
                    doubleToLongBits = zzhj.zzd(obj, j4);
                    byte[] bArr6 = zzfa.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i6 = i4 + zzc;
                    break;
                case 17:
                    Object zzf2 = zzhj.zzf(obj, j4);
                    if (zzf2 != null) {
                        i11 = zzf2.hashCode();
                    }
                    i6 = (i6 * 53) + i11;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i5 = i6 * 53;
                    floatToIntBits = zzhj.zzf(obj, j4).hashCode();
                    i6 = floatToIntBits + i5;
                    break;
                case 50:
                    i5 = i6 * 53;
                    floatToIntBits = zzhj.zzf(obj, j4).hashCode();
                    i6 = floatToIntBits + i5;
                    break;
                case 51:
                    if (zzI(obj, i10, i7)) {
                        i4 = i6 * 53;
                        doubleToLongBits = Double.doubleToLongBits(((Double) zzhj.zzf(obj, j4)).doubleValue());
                        byte[] bArr7 = zzfa.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i6 = i4 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzI(obj, i10, i7)) {
                        i5 = i6 * 53;
                        floatToIntBits = Float.floatToIntBits(((Float) zzhj.zzf(obj, j4)).floatValue());
                        i6 = floatToIntBits + i5;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzI(obj, i10, i7)) {
                        i4 = i6 * 53;
                        doubleToLongBits = zzp(obj, j4);
                        byte[] bArr8 = zzfa.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i6 = i4 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzI(obj, i10, i7)) {
                        i4 = i6 * 53;
                        doubleToLongBits = zzp(obj, j4);
                        byte[] bArr9 = zzfa.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i6 = i4 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzI(obj, i10, i7)) {
                        i4 = i6 * 53;
                        zzc = zzk(obj, j4);
                        i6 = i4 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzI(obj, i10, i7)) {
                        i4 = i6 * 53;
                        doubleToLongBits = zzp(obj, j4);
                        byte[] bArr10 = zzfa.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i6 = i4 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzI(obj, i10, i7)) {
                        i4 = i6 * 53;
                        zzc = zzk(obj, j4);
                        i6 = i4 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzI(obj, i10, i7)) {
                        i5 = i6 * 53;
                        floatToIntBits = zzfa.zza(((Boolean) zzhj.zzf(obj, j4)).booleanValue());
                        i6 = floatToIntBits + i5;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzI(obj, i10, i7)) {
                        i5 = i6 * 53;
                        floatToIntBits = ((String) zzhj.zzf(obj, j4)).hashCode();
                        i6 = floatToIntBits + i5;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzI(obj, i10, i7)) {
                        i5 = i6 * 53;
                        floatToIntBits = zzhj.zzf(obj, j4).hashCode();
                        i6 = floatToIntBits + i5;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzI(obj, i10, i7)) {
                        i5 = i6 * 53;
                        floatToIntBits = zzhj.zzf(obj, j4).hashCode();
                        i6 = floatToIntBits + i5;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzI(obj, i10, i7)) {
                        i4 = i6 * 53;
                        zzc = zzk(obj, j4);
                        i6 = i4 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzI(obj, i10, i7)) {
                        i4 = i6 * 53;
                        zzc = zzk(obj, j4);
                        i6 = i4 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzI(obj, i10, i7)) {
                        i4 = i6 * 53;
                        zzc = zzk(obj, j4);
                        i6 = i4 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzI(obj, i10, i7)) {
                        i4 = i6 * 53;
                        doubleToLongBits = zzp(obj, j4);
                        byte[] bArr11 = zzfa.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i6 = i4 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzI(obj, i10, i7)) {
                        i4 = i6 * 53;
                        zzc = zzk(obj, j4);
                        i6 = i4 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzI(obj, i10, i7)) {
                        i4 = i6 * 53;
                        doubleToLongBits = zzp(obj, j4);
                        byte[] bArr12 = zzfa.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i6 = i4 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzI(obj, i10, i7)) {
                        i5 = i6 * 53;
                        floatToIntBits = zzhj.zzf(obj, j4).hashCode();
                        i6 = floatToIntBits + i5;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this.zzl.zzb(obj).hashCode() + (i6 * 53);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0db8, code lost:
    
        if (r13 == r1) goto L560;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0dba, code lost:
    
        r19.putInt(r7, r13, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0dc0, code lost:
    
        r1 = r0.zzi;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0dc4, code lost:
    
        if (r1 >= r0.zzj) goto L674;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0dc6, code lost:
    
        r2 = r0.zzh[r1];
        r3 = r0.zzc[r2];
        r3 = com.google.android.gms.internal.auth.zzhj.zzf(r7, r0.zzo(r2) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0ddb, code lost:
    
        if (r3 != null) goto L566;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0de2, code lost:
    
        if (r0.zzq(r2) != null) goto L673;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0de7, code lost:
    
        r3 = (com.google.android.gms.internal.auth.zzfr) r3;
        r1 = (com.google.android.gms.internal.auth.zzfq) r0.zzs(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0def, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0de4, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0df0, code lost:
    
        if (r9 != 0) goto L577;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0df4, code lost:
    
        if (r8 != r40) goto L575;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0dfb, code lost:
    
        throw com.google.android.gms.internal.auth.zzfb.zzd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0e02, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0dfe, code lost:
    
        if (r8 > r40) goto L581;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0e00, code lost:
    
        if (r11 != r9) goto L581;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0e07, code lost:
    
        throw com.google.android.gms.internal.auth.zzfb.zzd();
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0a99  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0aac  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0d68 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0d7d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:610:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:730:0x0059 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int zzb(java.lang.Object r37, byte[] r38, int r39, int r40, int r41, com.google.android.gms.internal.auth.zzdt r42) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzga.zzb(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.auth.zzdt):int");
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final Object zzd() {
        return ((zzev) this.zzg).zzc();
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zze(Object obj) {
        if (zzH(obj)) {
            if (obj instanceof zzev) {
                zzev zzevVar = (zzev) obj;
                zzevVar.zzl(Integer.MAX_VALUE);
                zzevVar.zza = 0;
                zzevVar.zzj();
            }
            int length = this.zzc.length;
            for (int i4 = 0; i4 < length; i4 += 3) {
                int zzo = zzo(i4);
                int i5 = 1048575 & zzo;
                int zzn = zzn(zzo);
                long j4 = i5;
                if (zzn != 9) {
                    if (zzn != 60 && zzn != 68) {
                        switch (zzn) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.zzk.zza(obj, j4);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j4);
                                if (object != null) {
                                    ((zzfr) object).zzc();
                                    unsafe.putObject(obj, j4, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzI(obj, this.zzc[i4], i4)) {
                        zzr(i4).zze(zzb.getObject(obj, j4));
                    }
                }
                if (zzE(obj, i4)) {
                    zzr(i4).zze(zzb.getObject(obj, j4));
                }
            }
            this.zzl.zze(obj);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zzf(Object obj, Object obj2) {
        zzw(obj);
        obj2.getClass();
        for (int i4 = 0; i4 < this.zzc.length; i4 += 3) {
            int zzo = zzo(i4);
            int i5 = this.zzc[i4];
            long j4 = 1048575 & zzo;
            switch (zzn(zzo)) {
                case 0:
                    if (zzE(obj2, i4)) {
                        zzhj.zzl(obj, j4, zzhj.zza(obj2, j4));
                        zzz(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzE(obj2, i4)) {
                        zzhj.zzm(obj, j4, zzhj.zzb(obj2, j4));
                        zzz(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzE(obj2, i4)) {
                        zzhj.zzo(obj, j4, zzhj.zzd(obj2, j4));
                        zzz(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzE(obj2, i4)) {
                        zzhj.zzo(obj, j4, zzhj.zzd(obj2, j4));
                        zzz(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzE(obj2, i4)) {
                        zzhj.zzn(obj, j4, zzhj.zzc(obj2, j4));
                        zzz(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzE(obj2, i4)) {
                        zzhj.zzo(obj, j4, zzhj.zzd(obj2, j4));
                        zzz(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzE(obj2, i4)) {
                        zzhj.zzn(obj, j4, zzhj.zzc(obj2, j4));
                        zzz(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzE(obj2, i4)) {
                        zzhj.zzk(obj, j4, zzhj.zzt(obj2, j4));
                        zzz(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzE(obj2, i4)) {
                        zzhj.zzp(obj, j4, zzhj.zzf(obj2, j4));
                        zzz(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzx(obj, obj2, i4);
                    break;
                case 10:
                    if (zzE(obj2, i4)) {
                        zzhj.zzp(obj, j4, zzhj.zzf(obj2, j4));
                        zzz(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzE(obj2, i4)) {
                        zzhj.zzn(obj, j4, zzhj.zzc(obj2, j4));
                        zzz(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzE(obj2, i4)) {
                        zzhj.zzn(obj, j4, zzhj.zzc(obj2, j4));
                        zzz(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzE(obj2, i4)) {
                        zzhj.zzn(obj, j4, zzhj.zzc(obj2, j4));
                        zzz(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzE(obj2, i4)) {
                        zzhj.zzo(obj, j4, zzhj.zzd(obj2, j4));
                        zzz(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzE(obj2, i4)) {
                        zzhj.zzn(obj, j4, zzhj.zzc(obj2, j4));
                        zzz(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzE(obj2, i4)) {
                        zzhj.zzo(obj, j4, zzhj.zzd(obj2, j4));
                        zzz(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzx(obj, obj2, i4);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzk.zzb(obj, obj2, j4);
                    break;
                case 50:
                    int i6 = zzgk.zza;
                    zzhj.zzp(obj, j4, zzfs.zza(zzhj.zzf(obj, j4), zzhj.zzf(obj2, j4)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzI(obj2, i5, i4)) {
                        zzhj.zzp(obj, j4, zzhj.zzf(obj2, j4));
                        zzA(obj, i5, i4);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzy(obj, obj2, i4);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzI(obj2, i5, i4)) {
                        zzhj.zzp(obj, j4, zzhj.zzf(obj2, j4));
                        zzA(obj, i5, i4);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzy(obj, obj2, i4);
                    break;
            }
        }
        zzgk.zzd(this.zzl, obj, obj2);
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zzg(Object obj, byte[] bArr, int i4, int i5, zzdt zzdtVar) throws IOException {
        zzb(obj, bArr, i4, i5, 0, zzdtVar);
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final boolean zzh(Object obj, Object obj2) {
        boolean zzf;
        int length = this.zzc.length;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int zzo = zzo(i4);
            long j4 = zzo & 1048575;
            switch (zzn(zzo)) {
                case 0:
                    if (zzD(obj, obj2, i4) && Double.doubleToLongBits(zzhj.zza(obj, j4)) == Double.doubleToLongBits(zzhj.zza(obj2, j4))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzD(obj, obj2, i4) && Float.floatToIntBits(zzhj.zzb(obj, j4)) == Float.floatToIntBits(zzhj.zzb(obj2, j4))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzD(obj, obj2, i4) && zzhj.zzd(obj, j4) == zzhj.zzd(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzD(obj, obj2, i4) && zzhj.zzd(obj, j4) == zzhj.zzd(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzD(obj, obj2, i4) && zzhj.zzc(obj, j4) == zzhj.zzc(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzD(obj, obj2, i4) && zzhj.zzd(obj, j4) == zzhj.zzd(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzD(obj, obj2, i4) && zzhj.zzc(obj, j4) == zzhj.zzc(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzD(obj, obj2, i4) && zzhj.zzt(obj, j4) == zzhj.zzt(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzD(obj, obj2, i4) && zzgk.zzf(zzhj.zzf(obj, j4), zzhj.zzf(obj2, j4))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzD(obj, obj2, i4) && zzgk.zzf(zzhj.zzf(obj, j4), zzhj.zzf(obj2, j4))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzD(obj, obj2, i4) && zzgk.zzf(zzhj.zzf(obj, j4), zzhj.zzf(obj2, j4))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzD(obj, obj2, i4) && zzhj.zzc(obj, j4) == zzhj.zzc(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzD(obj, obj2, i4) && zzhj.zzc(obj, j4) == zzhj.zzc(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzD(obj, obj2, i4) && zzhj.zzc(obj, j4) == zzhj.zzc(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzD(obj, obj2, i4) && zzhj.zzd(obj, j4) == zzhj.zzd(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzD(obj, obj2, i4) && zzhj.zzc(obj, j4) == zzhj.zzc(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzD(obj, obj2, i4) && zzhj.zzd(obj, j4) == zzhj.zzd(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzD(obj, obj2, i4) && zzgk.zzf(zzhj.zzf(obj, j4), zzhj.zzf(obj2, j4))) {
                        continue;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zzf = zzgk.zzf(zzhj.zzf(obj, j4), zzhj.zzf(obj2, j4));
                    break;
                case 50:
                    zzf = zzgk.zzf(zzhj.zzf(obj, j4), zzhj.zzf(obj2, j4));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long zzl = zzl(i4) & 1048575;
                    if (zzhj.zzc(obj, zzl) == zzhj.zzc(obj2, zzl) && zzgk.zzf(zzhj.zzf(obj, j4), zzhj.zzf(obj2, j4))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzf) {
                return false;
            }
        }
        return this.zzl.zzb(obj).equals(this.zzl.zzb(obj2));
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final boolean zzi(Object obj) {
        int i4;
        int i5;
        int i6 = 0;
        int i7 = 0;
        int i10 = 1048575;
        while (i7 < this.zzi) {
            int i11 = this.zzh[i7];
            int i12 = this.zzc[i11];
            int zzo = zzo(i11);
            int i13 = this.zzc[i11 + 2];
            int i14 = i13 & 1048575;
            int i15 = 1 << (i13 >>> 20);
            if (i14 != i10) {
                if (i14 != 1048575) {
                    i6 = zzb.getInt(obj, i14);
                }
                i5 = i6;
                i4 = i14;
            } else {
                i4 = i10;
                i5 = i6;
            }
            if ((268435456 & zzo) != 0 && !zzF(obj, i11, i4, i5, i15)) {
                return false;
            }
            int zzn = zzn(zzo);
            if (zzn != 9 && zzn != 17) {
                if (zzn != 27) {
                    if (zzn == 60 || zzn == 68) {
                        if (zzI(obj, i12, i11) && !zzG(obj, zzo, zzr(i11))) {
                            return false;
                        }
                    } else if (zzn != 49) {
                        if (zzn == 50 && !((zzfr) zzhj.zzf(obj, zzo & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzhj.zzf(obj, zzo & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzgi zzr = zzr(i11);
                    for (int i16 = 0; i16 < list.size(); i16++) {
                        if (!zzr.zzi(list.get(i16))) {
                            return false;
                        }
                    }
                }
            } else if (zzF(obj, i11, i4, i5, i15) && !zzG(obj, zzo, zzr(i11))) {
                return false;
            }
            i7++;
            i10 = i4;
            i6 = i5;
        }
        return true;
    }
}
