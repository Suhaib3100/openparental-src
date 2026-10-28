package com.google.android.libraries.places.internal;

import android.support.v4.media.c;
import androidx.room.l0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzaeu<T> implements zzafc<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzagd.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final zzaer zze;
    private final boolean zzf;
    private final boolean zzg;
    private final int[] zzh;
    private final int zzi;
    private final int zzj;
    private final zzaef zzk;
    private final zzaft zzl;
    private final zzada zzm;
    private final zzaew zzn;
    private final zzaem zzo;

    private zzaeu(int[] iArr, Object[] objArr, int i4, int i5, zzaer zzaerVar, boolean z4, boolean z5, int[] iArr2, int i6, int i7, zzaew zzaewVar, zzaef zzaefVar, zzaft zzaftVar, zzada zzadaVar, zzaem zzaemVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzg = z4;
        boolean z6 = false;
        if (zzadaVar != null && zzadaVar.zzc(zzaerVar)) {
            z6 = true;
        }
        this.zzf = z6;
        this.zzh = iArr2;
        this.zzi = i6;
        this.zzj = i7;
        this.zzn = zzaewVar;
        this.zzk = zzaefVar;
        this.zzl = zzaftVar;
        this.zzm = zzadaVar;
        this.zze = zzaerVar;
        this.zzo = zzaemVar;
    }

    private final boolean zzA(Object obj, int i4) {
        int zzo = zzo(i4);
        long j4 = zzo & 1048575;
        if (j4 != 1048575) {
            return (zzagd.zzc(obj, j4) & (1 << (zzo >>> 20))) != 0;
        }
        int zzq = zzq(i4);
        long j5 = zzq & 1048575;
        switch (zzp(zzq)) {
            case 0:
                return Double.doubleToRawLongBits(zzagd.zza(obj, j5)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzagd.zzb(obj, j5)) != 0;
            case 2:
                return zzagd.zzd(obj, j5) != 0;
            case 3:
                return zzagd.zzd(obj, j5) != 0;
            case 4:
                return zzagd.zzc(obj, j5) != 0;
            case 5:
                return zzagd.zzd(obj, j5) != 0;
            case 6:
                return zzagd.zzc(obj, j5) != 0;
            case 7:
                return zzagd.zzw(obj, j5);
            case 8:
                Object zzf = zzagd.zzf(obj, j5);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzacp) {
                    return !zzacp.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzagd.zzf(obj, j5) != null;
            case 10:
                return !zzacp.zzb.equals(zzagd.zzf(obj, j5));
            case 11:
                return zzagd.zzc(obj, j5) != 0;
            case 12:
                return zzagd.zzc(obj, j5) != 0;
            case 13:
                return zzagd.zzc(obj, j5) != 0;
            case 14:
                return zzagd.zzd(obj, j5) != 0;
            case 15:
                return zzagd.zzc(obj, j5) != 0;
            case 16:
                return zzagd.zzd(obj, j5) != 0;
            case 17:
                return zzagd.zzf(obj, j5) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzB(Object obj, int i4, int i5, int i6, int i7) {
        return i5 == 1048575 ? zzA(obj, i4) : (i6 & i7) != 0;
    }

    private static boolean zzC(Object obj, int i4, zzafc zzafcVar) {
        return zzafcVar.zzf(zzagd.zzf(obj, i4 & 1048575));
    }

    private final boolean zzD(Object obj, int i4, int i5) {
        return zzagd.zzc(obj, (long) (zzo(i5) & 1048575)) == i4;
    }

    private static boolean zzE(Object obj, long j4) {
        return ((Boolean) zzagd.zzf(obj, j4)).booleanValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void zzF(Object obj, zzacy zzacyVar) throws IOException {
        int i4;
        boolean z4;
        if (this.zzf) {
            this.zzm.zza(obj);
            throw null;
        }
        int length = this.zzc.length;
        Unsafe unsafe = zzb;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i10 = 0;
        while (i7 < length) {
            int zzq = zzq(i7);
            int[] iArr = this.zzc;
            int i11 = iArr[i7];
            int zzp = zzp(zzq);
            if (zzp <= 17) {
                int i12 = iArr[i7 + 2];
                int i13 = i12 & i5;
                if (i13 != i6) {
                    i10 = unsafe.getInt(obj, i13);
                    i6 = i13;
                }
                i4 = 1 << (i12 >>> 20);
            } else {
                i4 = 0;
            }
            long j4 = zzq & i5;
            switch (zzp) {
                case 0:
                    if ((i10 & i4) == 0) {
                        break;
                    } else {
                        zzacyVar.zzf(i11, zzagd.zza(obj, j4));
                        break;
                    }
                case 1:
                    if ((i10 & i4) == 0) {
                        break;
                    } else {
                        zzacyVar.zzn(i11, zzagd.zzb(obj, j4));
                        break;
                    }
                case 2:
                    if ((i10 & i4) == 0) {
                        break;
                    } else {
                        zzacyVar.zzs(i11, unsafe.getLong(obj, j4));
                        break;
                    }
                case 3:
                    if ((i10 & i4) == 0) {
                        break;
                    } else {
                        zzacyVar.zzH(i11, unsafe.getLong(obj, j4));
                        break;
                    }
                case 4:
                    if ((i10 & i4) == 0) {
                        break;
                    } else {
                        zzacyVar.zzq(i11, unsafe.getInt(obj, j4));
                        break;
                    }
                case 5:
                    if ((i10 & i4) == 0) {
                        break;
                    } else {
                        zzacyVar.zzl(i11, unsafe.getLong(obj, j4));
                        break;
                    }
                case 6:
                    if ((i10 & i4) == 0) {
                        break;
                    } else {
                        zzacyVar.zzj(i11, unsafe.getInt(obj, j4));
                        break;
                    }
                case 7:
                    if ((i10 & i4) == 0) {
                        break;
                    } else {
                        zzacyVar.zzb(i11, zzagd.zzw(obj, j4));
                        break;
                    }
                case 8:
                    if ((i10 & i4) == 0) {
                        break;
                    } else {
                        zzH(i11, unsafe.getObject(obj, j4), zzacyVar);
                        break;
                    }
                case 9:
                    if ((i10 & i4) == 0) {
                        break;
                    } else {
                        zzacyVar.zzu(i11, unsafe.getObject(obj, j4), zzs(i7));
                        break;
                    }
                case 10:
                    if ((i10 & i4) == 0) {
                        break;
                    } else {
                        zzacyVar.zzd(i11, (zzacp) unsafe.getObject(obj, j4));
                        break;
                    }
                case 11:
                    if ((i10 & i4) == 0) {
                        break;
                    } else {
                        zzacyVar.zzF(i11, unsafe.getInt(obj, j4));
                        break;
                    }
                case 12:
                    if ((i10 & i4) == 0) {
                        break;
                    } else {
                        zzacyVar.zzh(i11, unsafe.getInt(obj, j4));
                        break;
                    }
                case 13:
                    if ((i10 & i4) == 0) {
                        break;
                    } else {
                        zzacyVar.zzv(i11, unsafe.getInt(obj, j4));
                        break;
                    }
                case 14:
                    if ((i10 & i4) == 0) {
                        break;
                    } else {
                        zzacyVar.zzx(i11, unsafe.getLong(obj, j4));
                        break;
                    }
                case 15:
                    if ((i10 & i4) == 0) {
                        break;
                    } else {
                        zzacyVar.zzz(i11, unsafe.getInt(obj, j4));
                        break;
                    }
                case 16:
                    if ((i10 & i4) == 0) {
                        break;
                    } else {
                        zzacyVar.zzB(i11, unsafe.getLong(obj, j4));
                        break;
                    }
                case 17:
                    if ((i10 & i4) == 0) {
                        break;
                    } else {
                        zzacyVar.zzp(i11, unsafe.getObject(obj, j4), zzs(i7));
                        break;
                    }
                case 18:
                    zzafe.zzJ(this.zzc[i7], (List) unsafe.getObject(obj, j4), zzacyVar, false);
                    break;
                case 19:
                    zzafe.zzN(this.zzc[i7], (List) unsafe.getObject(obj, j4), zzacyVar, false);
                    break;
                case 20:
                    zzafe.zzQ(this.zzc[i7], (List) unsafe.getObject(obj, j4), zzacyVar, false);
                    break;
                case 21:
                    zzafe.zzY(this.zzc[i7], (List) unsafe.getObject(obj, j4), zzacyVar, false);
                    break;
                case 22:
                    zzafe.zzP(this.zzc[i7], (List) unsafe.getObject(obj, j4), zzacyVar, false);
                    break;
                case 23:
                    zzafe.zzM(this.zzc[i7], (List) unsafe.getObject(obj, j4), zzacyVar, false);
                    break;
                case 24:
                    zzafe.zzL(this.zzc[i7], (List) unsafe.getObject(obj, j4), zzacyVar, false);
                    break;
                case 25:
                    zzafe.zzH(this.zzc[i7], (List) unsafe.getObject(obj, j4), zzacyVar, false);
                    break;
                case 26:
                    zzafe.zzW(this.zzc[i7], (List) unsafe.getObject(obj, j4), zzacyVar);
                    break;
                case 27:
                    zzafe.zzR(this.zzc[i7], (List) unsafe.getObject(obj, j4), zzacyVar, zzs(i7));
                    break;
                case 28:
                    zzafe.zzI(this.zzc[i7], (List) unsafe.getObject(obj, j4), zzacyVar);
                    break;
                case 29:
                    z4 = false;
                    zzafe.zzX(this.zzc[i7], (List) unsafe.getObject(obj, j4), zzacyVar, false);
                    break;
                case 30:
                    z4 = false;
                    zzafe.zzK(this.zzc[i7], (List) unsafe.getObject(obj, j4), zzacyVar, false);
                    break;
                case 31:
                    z4 = false;
                    zzafe.zzS(this.zzc[i7], (List) unsafe.getObject(obj, j4), zzacyVar, false);
                    break;
                case 32:
                    z4 = false;
                    zzafe.zzT(this.zzc[i7], (List) unsafe.getObject(obj, j4), zzacyVar, false);
                    break;
                case 33:
                    z4 = false;
                    zzafe.zzU(this.zzc[i7], (List) unsafe.getObject(obj, j4), zzacyVar, false);
                    break;
                case 34:
                    z4 = false;
                    zzafe.zzV(this.zzc[i7], (List) unsafe.getObject(obj, j4), zzacyVar, false);
                    break;
                case 35:
                    zzafe.zzJ(this.zzc[i7], (List) unsafe.getObject(obj, j4), zzacyVar, true);
                    break;
                case 36:
                    zzafe.zzN(this.zzc[i7], (List) unsafe.getObject(obj, j4), zzacyVar, true);
                    break;
                case 37:
                    zzafe.zzQ(this.zzc[i7], (List) unsafe.getObject(obj, j4), zzacyVar, true);
                    break;
                case 38:
                    zzafe.zzY(this.zzc[i7], (List) unsafe.getObject(obj, j4), zzacyVar, true);
                    break;
                case 39:
                    zzafe.zzP(this.zzc[i7], (List) unsafe.getObject(obj, j4), zzacyVar, true);
                    break;
                case 40:
                    zzafe.zzM(this.zzc[i7], (List) unsafe.getObject(obj, j4), zzacyVar, true);
                    break;
                case 41:
                    zzafe.zzL(this.zzc[i7], (List) unsafe.getObject(obj, j4), zzacyVar, true);
                    break;
                case 42:
                    zzafe.zzH(this.zzc[i7], (List) unsafe.getObject(obj, j4), zzacyVar, true);
                    break;
                case 43:
                    zzafe.zzX(this.zzc[i7], (List) unsafe.getObject(obj, j4), zzacyVar, true);
                    break;
                case 44:
                    zzafe.zzK(this.zzc[i7], (List) unsafe.getObject(obj, j4), zzacyVar, true);
                    break;
                case 45:
                    zzafe.zzS(this.zzc[i7], (List) unsafe.getObject(obj, j4), zzacyVar, true);
                    break;
                case 46:
                    zzafe.zzT(this.zzc[i7], (List) unsafe.getObject(obj, j4), zzacyVar, true);
                    break;
                case 47:
                    zzafe.zzU(this.zzc[i7], (List) unsafe.getObject(obj, j4), zzacyVar, true);
                    break;
                case 48:
                    zzafe.zzV(this.zzc[i7], (List) unsafe.getObject(obj, j4), zzacyVar, true);
                    break;
                case 49:
                    zzafe.zzO(this.zzc[i7], (List) unsafe.getObject(obj, j4), zzacyVar, zzs(i7));
                    break;
                case 50:
                    zzG(zzacyVar, i11, unsafe.getObject(obj, j4), i7);
                    break;
                case 51:
                    if (zzD(obj, i11, i7)) {
                        zzacyVar.zzf(i11, zzj(obj, j4));
                    }
                    break;
                case 52:
                    if (zzD(obj, i11, i7)) {
                        zzacyVar.zzn(i11, zzk(obj, j4));
                    }
                    break;
                case 53:
                    if (zzD(obj, i11, i7)) {
                        zzacyVar.zzs(i11, zzr(obj, j4));
                    }
                    break;
                case 54:
                    if (zzD(obj, i11, i7)) {
                        zzacyVar.zzH(i11, zzr(obj, j4));
                    }
                    break;
                case 55:
                    if (zzD(obj, i11, i7)) {
                        zzacyVar.zzq(i11, zzn(obj, j4));
                    }
                    break;
                case 56:
                    if (zzD(obj, i11, i7)) {
                        zzacyVar.zzl(i11, zzr(obj, j4));
                    }
                    break;
                case 57:
                    if (zzD(obj, i11, i7)) {
                        zzacyVar.zzj(i11, zzn(obj, j4));
                    }
                    break;
                case 58:
                    if (zzD(obj, i11, i7)) {
                        zzacyVar.zzb(i11, zzE(obj, j4));
                    }
                    break;
                case 59:
                    if (zzD(obj, i11, i7)) {
                        zzH(i11, unsafe.getObject(obj, j4), zzacyVar);
                    }
                    break;
                case 60:
                    if (zzD(obj, i11, i7)) {
                        zzacyVar.zzu(i11, unsafe.getObject(obj, j4), zzs(i7));
                    }
                    break;
                case 61:
                    if (zzD(obj, i11, i7)) {
                        zzacyVar.zzd(i11, (zzacp) unsafe.getObject(obj, j4));
                    }
                    break;
                case 62:
                    if (zzD(obj, i11, i7)) {
                        zzacyVar.zzF(i11, zzn(obj, j4));
                    }
                    break;
                case 63:
                    if (zzD(obj, i11, i7)) {
                        zzacyVar.zzh(i11, zzn(obj, j4));
                    }
                    break;
                case 64:
                    if (zzD(obj, i11, i7)) {
                        zzacyVar.zzv(i11, zzn(obj, j4));
                    }
                    break;
                case 65:
                    if (zzD(obj, i11, i7)) {
                        zzacyVar.zzx(i11, zzr(obj, j4));
                    }
                    break;
                case 66:
                    if (zzD(obj, i11, i7)) {
                        zzacyVar.zzz(i11, zzn(obj, j4));
                    }
                    break;
                case 67:
                    if (zzD(obj, i11, i7)) {
                        zzacyVar.zzB(i11, zzr(obj, j4));
                    }
                    break;
                case 68:
                    if (zzD(obj, i11, i7)) {
                        zzacyVar.zzp(i11, unsafe.getObject(obj, j4), zzs(i7));
                    }
                    break;
            }
            i7 += 3;
            i5 = 1048575;
        }
        zzaft zzaftVar = this.zzl;
        zzaftVar.zzg(zzaftVar.zzc(obj), zzacyVar);
    }

    private final void zzG(zzacy zzacyVar, int i4, Object obj, int i5) throws IOException {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private static final void zzH(int i4, Object obj, zzacy zzacyVar) throws IOException {
        if (obj instanceof String) {
            zzacyVar.zzD(i4, (String) obj);
        } else {
            zzacyVar.zzd(i4, (zzacp) obj);
        }
    }

    static zzaeu zzg(Class cls, zzaeo zzaeoVar, zzaew zzaewVar, zzaef zzaefVar, zzaft zzaftVar, zzada zzadaVar, zzaem zzaemVar) {
        if (zzaeoVar instanceof zzafb) {
            return zzh((zzafb) zzaeoVar, zzaewVar, zzaefVar, zzaftVar, zzadaVar, zzaemVar);
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0265  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static com.google.android.libraries.places.internal.zzaeu zzh(com.google.android.libraries.places.internal.zzafb r34, com.google.android.libraries.places.internal.zzaew r35, com.google.android.libraries.places.internal.zzaef r36, com.google.android.libraries.places.internal.zzaft r37, com.google.android.libraries.places.internal.zzada r38, com.google.android.libraries.places.internal.zzaem r39) {
        /*
            Method dump skipped, instructions count: 1019
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzaeu.zzh(com.google.android.libraries.places.internal.zzafb, com.google.android.libraries.places.internal.zzaew, com.google.android.libraries.places.internal.zzaef, com.google.android.libraries.places.internal.zzaft, com.google.android.libraries.places.internal.zzada, com.google.android.libraries.places.internal.zzaem):com.google.android.libraries.places.internal.zzaeu");
    }

    private static double zzj(Object obj, long j4) {
        return ((Double) zzagd.zzf(obj, j4)).doubleValue();
    }

    private static float zzk(Object obj, long j4) {
        return ((Float) zzagd.zzf(obj, j4)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int zzl(Object obj) {
        int i4;
        int zzA;
        int zzB;
        int i5;
        int zzA2;
        int zzv;
        int zzo;
        int zzu;
        boolean z4;
        int zzd;
        int zzA3;
        int zzB2;
        int i6;
        int zzA4;
        int zzv2;
        Unsafe unsafe = zzb;
        int i7 = 1048575;
        int i10 = 1048575;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < this.zzc.length) {
            int zzq = zzq(i11);
            int[] iArr = this.zzc;
            int i14 = iArr[i11];
            int zzp = zzp(zzq);
            if (zzp <= 17) {
                int i15 = iArr[i11 + 2];
                int i16 = i15 & i7;
                i4 = 1 << (i15 >>> 20);
                if (i16 != i10) {
                    i13 = unsafe.getInt(obj, i16);
                    i10 = i16;
                }
            } else {
                i4 = 0;
            }
            long j4 = zzq & i7;
            switch (zzp) {
                case 0:
                    if ((i13 & i4) == 0) {
                        break;
                    } else {
                        i12 = a.a(i14 << 3, 8, i12);
                        break;
                    }
                case 1:
                    if ((i13 & i4) == 0) {
                        break;
                    } else {
                        i12 = a.a(i14 << 3, 4, i12);
                        break;
                    }
                case 2:
                    if ((i13 & i4) == 0) {
                        break;
                    } else {
                        long j5 = unsafe.getLong(obj, j4);
                        zzA = zzacx.zzA(i14 << 3);
                        zzB = zzacx.zzB(j5);
                        i5 = zzB + zzA;
                        i12 += i5;
                        break;
                    }
                case 3:
                    if ((i13 & i4) == 0) {
                        break;
                    } else {
                        long j6 = unsafe.getLong(obj, j4);
                        zzA = zzacx.zzA(i14 << 3);
                        zzB = zzacx.zzB(j6);
                        i5 = zzB + zzA;
                        i12 += i5;
                        break;
                    }
                case 4:
                    if ((i13 & i4) == 0) {
                        break;
                    } else {
                        int i17 = unsafe.getInt(obj, j4);
                        zzA2 = zzacx.zzA(i14 << 3);
                        zzv = zzacx.zzv(i17);
                        i5 = zzv + zzA2;
                        i12 += i5;
                        break;
                    }
                case 5:
                    if ((i13 & i4) == 0) {
                        break;
                    } else {
                        i12 = a.a(i14 << 3, 8, i12);
                        break;
                    }
                case 6:
                    if ((i13 & i4) == 0) {
                        break;
                    } else {
                        i12 = a.a(i14 << 3, 4, i12);
                        break;
                    }
                case 7:
                    if ((i13 & i4) == 0) {
                        break;
                    } else {
                        i12 = a.a(i14 << 3, 1, i12);
                        break;
                    }
                case 8:
                    if ((i13 & i4) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j4);
                        if (!(object instanceof zzacp)) {
                            zzA2 = zzacx.zzA(i14 << 3);
                            zzv = zzacx.zzy((String) object);
                            i5 = zzv + zzA2;
                            i12 += i5;
                            break;
                        } else {
                            int zzA5 = zzacx.zzA(i14 << 3);
                            int zzd2 = ((zzacp) object).zzd();
                            i12 = b.a(zzd2, zzd2, zzA5, i12);
                            break;
                        }
                    }
                case 9:
                    if ((i13 & i4) == 0) {
                        break;
                    } else {
                        zzo = zzafe.zzo(i14, unsafe.getObject(obj, j4), zzs(i11));
                        i12 += zzo;
                        break;
                    }
                case 10:
                    if ((i13 & i4) == 0) {
                        break;
                    } else {
                        zzacp zzacpVar = (zzacp) unsafe.getObject(obj, j4);
                        int zzA6 = zzacx.zzA(i14 << 3);
                        int zzd3 = zzacpVar.zzd();
                        i12 = b.a(zzd3, zzd3, zzA6, i12);
                        break;
                    }
                case 11:
                    if ((i13 & i4) == 0) {
                        break;
                    } else {
                        i12 = a.a(unsafe.getInt(obj, j4), zzacx.zzA(i14 << 3), i12);
                        break;
                    }
                case 12:
                    if ((i13 & i4) == 0) {
                        break;
                    } else {
                        int i18 = unsafe.getInt(obj, j4);
                        zzA2 = zzacx.zzA(i14 << 3);
                        zzv = zzacx.zzv(i18);
                        i5 = zzv + zzA2;
                        i12 += i5;
                        break;
                    }
                case 13:
                    if ((i13 & i4) == 0) {
                        break;
                    } else {
                        i12 = a.a(i14 << 3, 4, i12);
                        break;
                    }
                case 14:
                    if ((i13 & i4) == 0) {
                        break;
                    } else {
                        i12 = a.a(i14 << 3, 8, i12);
                        break;
                    }
                case 15:
                    if ((i13 & i4) == 0) {
                        break;
                    } else {
                        int i19 = unsafe.getInt(obj, j4);
                        i12 = a.a((i19 >> 31) ^ (i19 + i19), zzacx.zzA(i14 << 3), i12);
                        break;
                    }
                case 16:
                    if ((i4 & i13) == 0) {
                        break;
                    } else {
                        long j7 = unsafe.getLong(obj, j4);
                        i5 = zzacx.zzB((j7 >> 63) ^ (j7 + j7)) + zzacx.zzA(i14 << 3);
                        i12 += i5;
                        break;
                    }
                case 17:
                    if ((i13 & i4) == 0) {
                        break;
                    } else {
                        zzo = zzacx.zzu(i14, (zzaer) unsafe.getObject(obj, j4), zzs(i11));
                        i12 += zzo;
                        break;
                    }
                case 18:
                    zzo = zzafe.zzh(i14, (List) unsafe.getObject(obj, j4), false);
                    i12 += zzo;
                    break;
                case 19:
                    zzo = zzafe.zzf(i14, (List) unsafe.getObject(obj, j4), false);
                    i12 += zzo;
                    break;
                case 20:
                    zzo = zzafe.zzm(i14, (List) unsafe.getObject(obj, j4), false);
                    i12 += zzo;
                    break;
                case 21:
                    zzo = zzafe.zzx(i14, (List) unsafe.getObject(obj, j4), false);
                    i12 += zzo;
                    break;
                case 22:
                    zzo = zzafe.zzk(i14, (List) unsafe.getObject(obj, j4), false);
                    i12 += zzo;
                    break;
                case 23:
                    zzo = zzafe.zzh(i14, (List) unsafe.getObject(obj, j4), false);
                    i12 += zzo;
                    break;
                case 24:
                    zzo = zzafe.zzf(i14, (List) unsafe.getObject(obj, j4), false);
                    i12 += zzo;
                    break;
                case 25:
                    zzo = zzafe.zza(i14, (List) unsafe.getObject(obj, j4), false);
                    i12 += zzo;
                    break;
                case 26:
                    zzu = zzafe.zzu(i14, (List) unsafe.getObject(obj, j4));
                    i12 += zzu;
                    break;
                case 27:
                    zzu = zzafe.zzp(i14, (List) unsafe.getObject(obj, j4), zzs(i11));
                    i12 += zzu;
                    break;
                case 28:
                    zzu = zzafe.zzc(i14, (List) unsafe.getObject(obj, j4));
                    i12 += zzu;
                    break;
                case 29:
                    zzu = zzafe.zzv(i14, (List) unsafe.getObject(obj, j4), false);
                    i12 += zzu;
                    break;
                case 30:
                    z4 = false;
                    zzd = zzafe.zzd(i14, (List) unsafe.getObject(obj, j4), false);
                    i12 += zzd;
                    break;
                case 31:
                    z4 = false;
                    zzd = zzafe.zzf(i14, (List) unsafe.getObject(obj, j4), false);
                    i12 += zzd;
                    break;
                case 32:
                    z4 = false;
                    zzd = zzafe.zzh(i14, (List) unsafe.getObject(obj, j4), false);
                    i12 += zzd;
                    break;
                case 33:
                    z4 = false;
                    zzd = zzafe.zzq(i14, (List) unsafe.getObject(obj, j4), false);
                    i12 += zzd;
                    break;
                case 34:
                    z4 = false;
                    zzd = zzafe.zzs(i14, (List) unsafe.getObject(obj, j4), false);
                    i12 += zzd;
                    break;
                case 35:
                    int zzi = zzafe.zzi((List) unsafe.getObject(obj, j4));
                    if (zzi > 0) {
                        i12 = b.a(zzi, zzacx.zzz(i14), zzi, i12);
                    }
                    break;
                case 36:
                    int zzg = zzafe.zzg((List) unsafe.getObject(obj, j4));
                    if (zzg > 0) {
                        i12 = b.a(zzg, zzacx.zzz(i14), zzg, i12);
                    }
                    break;
                case 37:
                    int zzn = zzafe.zzn((List) unsafe.getObject(obj, j4));
                    if (zzn > 0) {
                        i12 = b.a(zzn, zzacx.zzz(i14), zzn, i12);
                    }
                    break;
                case 38:
                    int zzy = zzafe.zzy((List) unsafe.getObject(obj, j4));
                    if (zzy > 0) {
                        i12 = b.a(zzy, zzacx.zzz(i14), zzy, i12);
                    }
                    break;
                case 39:
                    int zzl = zzafe.zzl((List) unsafe.getObject(obj, j4));
                    if (zzl > 0) {
                        i12 = b.a(zzl, zzacx.zzz(i14), zzl, i12);
                    }
                    break;
                case 40:
                    int zzi2 = zzafe.zzi((List) unsafe.getObject(obj, j4));
                    if (zzi2 > 0) {
                        i12 = b.a(zzi2, zzacx.zzz(i14), zzi2, i12);
                    }
                    break;
                case 41:
                    int zzg2 = zzafe.zzg((List) unsafe.getObject(obj, j4));
                    if (zzg2 > 0) {
                        i12 = b.a(zzg2, zzacx.zzz(i14), zzg2, i12);
                    }
                    break;
                case 42:
                    int zzb2 = zzafe.zzb((List) unsafe.getObject(obj, j4));
                    if (zzb2 > 0) {
                        i12 = b.a(zzb2, zzacx.zzz(i14), zzb2, i12);
                    }
                    break;
                case 43:
                    int zzw = zzafe.zzw((List) unsafe.getObject(obj, j4));
                    if (zzw > 0) {
                        i12 = b.a(zzw, zzacx.zzz(i14), zzw, i12);
                    }
                    break;
                case 44:
                    int zze = zzafe.zze((List) unsafe.getObject(obj, j4));
                    if (zze > 0) {
                        i12 = b.a(zze, zzacx.zzz(i14), zze, i12);
                    }
                    break;
                case 45:
                    int zzg3 = zzafe.zzg((List) unsafe.getObject(obj, j4));
                    if (zzg3 > 0) {
                        i12 = b.a(zzg3, zzacx.zzz(i14), zzg3, i12);
                    }
                    break;
                case 46:
                    int zzi3 = zzafe.zzi((List) unsafe.getObject(obj, j4));
                    if (zzi3 > 0) {
                        i12 = b.a(zzi3, zzacx.zzz(i14), zzi3, i12);
                    }
                    break;
                case 47:
                    int zzr = zzafe.zzr((List) unsafe.getObject(obj, j4));
                    if (zzr > 0) {
                        i12 = b.a(zzr, zzacx.zzz(i14), zzr, i12);
                    }
                    break;
                case 48:
                    int zzt = zzafe.zzt((List) unsafe.getObject(obj, j4));
                    if (zzt > 0) {
                        i12 = b.a(zzt, zzacx.zzz(i14), zzt, i12);
                    }
                    break;
                case 49:
                    zzu = zzafe.zzj(i14, (List) unsafe.getObject(obj, j4), zzs(i11));
                    i12 += zzu;
                    break;
                case 50:
                    zzaem.zza(i14, unsafe.getObject(obj, j4), zzt(i11));
                    break;
                case 51:
                    if (zzD(obj, i14, i11)) {
                        i12 = a.a(i14 << 3, 8, i12);
                    }
                    break;
                case 52:
                    if (zzD(obj, i14, i11)) {
                        i12 = a.a(i14 << 3, 4, i12);
                    }
                    break;
                case 53:
                    if (zzD(obj, i14, i11)) {
                        long zzr2 = zzr(obj, j4);
                        zzA3 = zzacx.zzA(i14 << 3);
                        zzB2 = zzacx.zzB(zzr2);
                        i6 = zzB2 + zzA3;
                        i12 += i6;
                    }
                    break;
                case 54:
                    if (zzD(obj, i14, i11)) {
                        long zzr3 = zzr(obj, j4);
                        zzA3 = zzacx.zzA(i14 << 3);
                        zzB2 = zzacx.zzB(zzr3);
                        i6 = zzB2 + zzA3;
                        i12 += i6;
                    }
                    break;
                case 55:
                    if (zzD(obj, i14, i11)) {
                        int zzn2 = zzn(obj, j4);
                        zzA4 = zzacx.zzA(i14 << 3);
                        zzv2 = zzacx.zzv(zzn2);
                        i6 = zzv2 + zzA4;
                        i12 += i6;
                    }
                    break;
                case 56:
                    if (zzD(obj, i14, i11)) {
                        i12 = a.a(i14 << 3, 8, i12);
                    }
                    break;
                case 57:
                    if (zzD(obj, i14, i11)) {
                        i12 = a.a(i14 << 3, 4, i12);
                    }
                    break;
                case 58:
                    if (zzD(obj, i14, i11)) {
                        i12 = a.a(i14 << 3, 1, i12);
                    }
                    break;
                case 59:
                    if (zzD(obj, i14, i11)) {
                        Object object2 = unsafe.getObject(obj, j4);
                        if (object2 instanceof zzacp) {
                            int zzA7 = zzacx.zzA(i14 << 3);
                            int zzd4 = ((zzacp) object2).zzd();
                            i12 = b.a(zzd4, zzd4, zzA7, i12);
                        } else {
                            zzA4 = zzacx.zzA(i14 << 3);
                            zzv2 = zzacx.zzy((String) object2);
                            i6 = zzv2 + zzA4;
                            i12 += i6;
                        }
                    }
                    break;
                case 60:
                    if (zzD(obj, i14, i11)) {
                        zzu = zzafe.zzo(i14, unsafe.getObject(obj, j4), zzs(i11));
                        i12 += zzu;
                    }
                    break;
                case 61:
                    if (zzD(obj, i14, i11)) {
                        zzacp zzacpVar2 = (zzacp) unsafe.getObject(obj, j4);
                        int zzA8 = zzacx.zzA(i14 << 3);
                        int zzd5 = zzacpVar2.zzd();
                        i12 = b.a(zzd5, zzd5, zzA8, i12);
                    }
                    break;
                case 62:
                    if (zzD(obj, i14, i11)) {
                        i12 = a.a(zzn(obj, j4), zzacx.zzA(i14 << 3), i12);
                    }
                    break;
                case 63:
                    if (zzD(obj, i14, i11)) {
                        int zzn3 = zzn(obj, j4);
                        zzA4 = zzacx.zzA(i14 << 3);
                        zzv2 = zzacx.zzv(zzn3);
                        i6 = zzv2 + zzA4;
                        i12 += i6;
                    }
                    break;
                case 64:
                    if (zzD(obj, i14, i11)) {
                        i12 = a.a(i14 << 3, 4, i12);
                    }
                    break;
                case 65:
                    if (zzD(obj, i14, i11)) {
                        i12 = a.a(i14 << 3, 8, i12);
                    }
                    break;
                case 66:
                    if (zzD(obj, i14, i11)) {
                        int zzn4 = zzn(obj, j4);
                        i12 = a.a((zzn4 >> 31) ^ (zzn4 + zzn4), zzacx.zzA(i14 << 3), i12);
                    }
                    break;
                case 67:
                    if (zzD(obj, i14, i11)) {
                        long zzr4 = zzr(obj, j4);
                        i6 = zzacx.zzB((zzr4 >> 63) ^ (zzr4 + zzr4)) + zzacx.zzA(i14 << 3);
                        i12 += i6;
                    }
                    break;
                case 68:
                    if (zzD(obj, i14, i11)) {
                        zzu = zzacx.zzu(i14, (zzaer) unsafe.getObject(obj, j4), zzs(i11));
                        i12 += zzu;
                    }
                    break;
            }
            i11 += 3;
            i7 = 1048575;
        }
        zzaft zzaftVar = this.zzl;
        int zza2 = i12 + zzaftVar.zza(zzaftVar.zzc(obj));
        if (!this.zzf) {
            return zza2;
        }
        this.zzm.zza(obj);
        throw null;
    }

    private final int zzm(Object obj) {
        int zzA;
        int zzB;
        int zzA2;
        int zzv;
        int zzo;
        int i4;
        Unsafe unsafe = zzb;
        int i5 = 0;
        for (int i6 = 0; i6 < this.zzc.length; i6 += 3) {
            int zzq = zzq(i6);
            int zzp = zzp(zzq);
            int i7 = this.zzc[i6];
            long j4 = zzq & 1048575;
            if (zzp >= zzadf.zzJ.zza() && zzp <= zzadf.zzW.zza()) {
                int i10 = this.zzc[i6 + 2];
            }
            switch (zzp) {
                case 0:
                    if (zzA(obj, i6)) {
                        i5 = a.a(i7 << 3, 8, i5);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzA(obj, i6)) {
                        i5 = a.a(i7 << 3, 4, i5);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzA(obj, i6)) {
                        long zzd = zzagd.zzd(obj, j4);
                        zzA = zzacx.zzA(i7 << 3);
                        zzB = zzacx.zzB(zzd);
                        i4 = zzB + zzA;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzA(obj, i6)) {
                        long zzd2 = zzagd.zzd(obj, j4);
                        zzA = zzacx.zzA(i7 << 3);
                        zzB = zzacx.zzB(zzd2);
                        i4 = zzB + zzA;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzA(obj, i6)) {
                        int zzc = zzagd.zzc(obj, j4);
                        zzA2 = zzacx.zzA(i7 << 3);
                        zzv = zzacx.zzv(zzc);
                        i4 = zzv + zzA2;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzA(obj, i6)) {
                        i5 = a.a(i7 << 3, 8, i5);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzA(obj, i6)) {
                        i5 = a.a(i7 << 3, 4, i5);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzA(obj, i6)) {
                        i5 = a.a(i7 << 3, 1, i5);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzA(obj, i6)) {
                        Object zzf = zzagd.zzf(obj, j4);
                        if (zzf instanceof zzacp) {
                            int zzA3 = zzacx.zzA(i7 << 3);
                            int zzd3 = ((zzacp) zzf).zzd();
                            i5 = b.a(zzd3, zzd3, zzA3, i5);
                            break;
                        } else {
                            zzA2 = zzacx.zzA(i7 << 3);
                            zzv = zzacx.zzy((String) zzf);
                            i4 = zzv + zzA2;
                            i5 += i4;
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (zzA(obj, i6)) {
                        zzo = zzafe.zzo(i7, zzagd.zzf(obj, j4), zzs(i6));
                        i5 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzA(obj, i6)) {
                        zzacp zzacpVar = (zzacp) zzagd.zzf(obj, j4);
                        int zzA4 = zzacx.zzA(i7 << 3);
                        int zzd4 = zzacpVar.zzd();
                        i5 = b.a(zzd4, zzd4, zzA4, i5);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzA(obj, i6)) {
                        i5 = a.a(zzagd.zzc(obj, j4), zzacx.zzA(i7 << 3), i5);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzA(obj, i6)) {
                        int zzc2 = zzagd.zzc(obj, j4);
                        zzA2 = zzacx.zzA(i7 << 3);
                        zzv = zzacx.zzv(zzc2);
                        i4 = zzv + zzA2;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzA(obj, i6)) {
                        i5 = a.a(i7 << 3, 4, i5);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzA(obj, i6)) {
                        i5 = a.a(i7 << 3, 8, i5);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzA(obj, i6)) {
                        int zzc3 = zzagd.zzc(obj, j4);
                        i5 = a.a((zzc3 >> 31) ^ (zzc3 + zzc3), zzacx.zzA(i7 << 3), i5);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzA(obj, i6)) {
                        long zzd5 = zzagd.zzd(obj, j4);
                        zzA = zzacx.zzA(i7 << 3);
                        zzB = zzacx.zzB((zzd5 >> 63) ^ (zzd5 + zzd5));
                        i4 = zzB + zzA;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzA(obj, i6)) {
                        zzo = zzacx.zzu(i7, (zzaer) zzagd.zzf(obj, j4), zzs(i6));
                        i5 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzo = zzafe.zzh(i7, (List) zzagd.zzf(obj, j4), false);
                    i5 += zzo;
                    break;
                case 19:
                    zzo = zzafe.zzf(i7, (List) zzagd.zzf(obj, j4), false);
                    i5 += zzo;
                    break;
                case 20:
                    zzo = zzafe.zzm(i7, (List) zzagd.zzf(obj, j4), false);
                    i5 += zzo;
                    break;
                case 21:
                    zzo = zzafe.zzx(i7, (List) zzagd.zzf(obj, j4), false);
                    i5 += zzo;
                    break;
                case 22:
                    zzo = zzafe.zzk(i7, (List) zzagd.zzf(obj, j4), false);
                    i5 += zzo;
                    break;
                case 23:
                    zzo = zzafe.zzh(i7, (List) zzagd.zzf(obj, j4), false);
                    i5 += zzo;
                    break;
                case 24:
                    zzo = zzafe.zzf(i7, (List) zzagd.zzf(obj, j4), false);
                    i5 += zzo;
                    break;
                case 25:
                    zzo = zzafe.zza(i7, (List) zzagd.zzf(obj, j4), false);
                    i5 += zzo;
                    break;
                case 26:
                    zzo = zzafe.zzu(i7, (List) zzagd.zzf(obj, j4));
                    i5 += zzo;
                    break;
                case 27:
                    zzo = zzafe.zzp(i7, (List) zzagd.zzf(obj, j4), zzs(i6));
                    i5 += zzo;
                    break;
                case 28:
                    zzo = zzafe.zzc(i7, (List) zzagd.zzf(obj, j4));
                    i5 += zzo;
                    break;
                case 29:
                    zzo = zzafe.zzv(i7, (List) zzagd.zzf(obj, j4), false);
                    i5 += zzo;
                    break;
                case 30:
                    zzo = zzafe.zzd(i7, (List) zzagd.zzf(obj, j4), false);
                    i5 += zzo;
                    break;
                case 31:
                    zzo = zzafe.zzf(i7, (List) zzagd.zzf(obj, j4), false);
                    i5 += zzo;
                    break;
                case 32:
                    zzo = zzafe.zzh(i7, (List) zzagd.zzf(obj, j4), false);
                    i5 += zzo;
                    break;
                case 33:
                    zzo = zzafe.zzq(i7, (List) zzagd.zzf(obj, j4), false);
                    i5 += zzo;
                    break;
                case 34:
                    zzo = zzafe.zzs(i7, (List) zzagd.zzf(obj, j4), false);
                    i5 += zzo;
                    break;
                case 35:
                    int zzi = zzafe.zzi((List) unsafe.getObject(obj, j4));
                    if (zzi > 0) {
                        i5 = b.a(zzi, zzacx.zzz(i7), zzi, i5);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    int zzg = zzafe.zzg((List) unsafe.getObject(obj, j4));
                    if (zzg > 0) {
                        i5 = b.a(zzg, zzacx.zzz(i7), zzg, i5);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int zzn = zzafe.zzn((List) unsafe.getObject(obj, j4));
                    if (zzn > 0) {
                        i5 = b.a(zzn, zzacx.zzz(i7), zzn, i5);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int zzy = zzafe.zzy((List) unsafe.getObject(obj, j4));
                    if (zzy > 0) {
                        i5 = b.a(zzy, zzacx.zzz(i7), zzy, i5);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    int zzl = zzafe.zzl((List) unsafe.getObject(obj, j4));
                    if (zzl > 0) {
                        i5 = b.a(zzl, zzacx.zzz(i7), zzl, i5);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    int zzi2 = zzafe.zzi((List) unsafe.getObject(obj, j4));
                    if (zzi2 > 0) {
                        i5 = b.a(zzi2, zzacx.zzz(i7), zzi2, i5);
                        break;
                    } else {
                        break;
                    }
                case 41:
                    int zzg2 = zzafe.zzg((List) unsafe.getObject(obj, j4));
                    if (zzg2 > 0) {
                        i5 = b.a(zzg2, zzacx.zzz(i7), zzg2, i5);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    int zzb2 = zzafe.zzb((List) unsafe.getObject(obj, j4));
                    if (zzb2 > 0) {
                        i5 = b.a(zzb2, zzacx.zzz(i7), zzb2, i5);
                        break;
                    } else {
                        break;
                    }
                case 43:
                    int zzw = zzafe.zzw((List) unsafe.getObject(obj, j4));
                    if (zzw > 0) {
                        i5 = b.a(zzw, zzacx.zzz(i7), zzw, i5);
                        break;
                    } else {
                        break;
                    }
                case 44:
                    int zze = zzafe.zze((List) unsafe.getObject(obj, j4));
                    if (zze > 0) {
                        i5 = b.a(zze, zzacx.zzz(i7), zze, i5);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    int zzg3 = zzafe.zzg((List) unsafe.getObject(obj, j4));
                    if (zzg3 > 0) {
                        i5 = b.a(zzg3, zzacx.zzz(i7), zzg3, i5);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    int zzi3 = zzafe.zzi((List) unsafe.getObject(obj, j4));
                    if (zzi3 > 0) {
                        i5 = b.a(zzi3, zzacx.zzz(i7), zzi3, i5);
                        break;
                    } else {
                        break;
                    }
                case 47:
                    int zzr = zzafe.zzr((List) unsafe.getObject(obj, j4));
                    if (zzr > 0) {
                        i5 = b.a(zzr, zzacx.zzz(i7), zzr, i5);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    int zzt = zzafe.zzt((List) unsafe.getObject(obj, j4));
                    if (zzt > 0) {
                        i5 = b.a(zzt, zzacx.zzz(i7), zzt, i5);
                        break;
                    } else {
                        break;
                    }
                case 49:
                    zzo = zzafe.zzj(i7, (List) zzagd.zzf(obj, j4), zzs(i6));
                    i5 += zzo;
                    break;
                case 50:
                    zzaem.zza(i7, zzagd.zzf(obj, j4), zzt(i6));
                    break;
                case 51:
                    if (zzD(obj, i7, i6)) {
                        i5 = a.a(i7 << 3, 8, i5);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzD(obj, i7, i6)) {
                        i5 = a.a(i7 << 3, 4, i5);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzD(obj, i7, i6)) {
                        long zzr2 = zzr(obj, j4);
                        zzA = zzacx.zzA(i7 << 3);
                        zzB = zzacx.zzB(zzr2);
                        i4 = zzB + zzA;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzD(obj, i7, i6)) {
                        long zzr3 = zzr(obj, j4);
                        zzA = zzacx.zzA(i7 << 3);
                        zzB = zzacx.zzB(zzr3);
                        i4 = zzB + zzA;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzD(obj, i7, i6)) {
                        int zzn2 = zzn(obj, j4);
                        zzA2 = zzacx.zzA(i7 << 3);
                        zzv = zzacx.zzv(zzn2);
                        i4 = zzv + zzA2;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzD(obj, i7, i6)) {
                        i5 = a.a(i7 << 3, 8, i5);
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzD(obj, i7, i6)) {
                        i5 = a.a(i7 << 3, 4, i5);
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzD(obj, i7, i6)) {
                        i5 = a.a(i7 << 3, 1, i5);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzD(obj, i7, i6)) {
                        Object zzf2 = zzagd.zzf(obj, j4);
                        if (zzf2 instanceof zzacp) {
                            int zzA5 = zzacx.zzA(i7 << 3);
                            int zzd6 = ((zzacp) zzf2).zzd();
                            i5 = b.a(zzd6, zzd6, zzA5, i5);
                            break;
                        } else {
                            zzA2 = zzacx.zzA(i7 << 3);
                            zzv = zzacx.zzy((String) zzf2);
                            i4 = zzv + zzA2;
                            i5 += i4;
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (zzD(obj, i7, i6)) {
                        zzo = zzafe.zzo(i7, zzagd.zzf(obj, j4), zzs(i6));
                        i5 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzD(obj, i7, i6)) {
                        zzacp zzacpVar2 = (zzacp) zzagd.zzf(obj, j4);
                        int zzA6 = zzacx.zzA(i7 << 3);
                        int zzd7 = zzacpVar2.zzd();
                        i5 = b.a(zzd7, zzd7, zzA6, i5);
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzD(obj, i7, i6)) {
                        i5 = a.a(zzn(obj, j4), zzacx.zzA(i7 << 3), i5);
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzD(obj, i7, i6)) {
                        int zzn3 = zzn(obj, j4);
                        zzA2 = zzacx.zzA(i7 << 3);
                        zzv = zzacx.zzv(zzn3);
                        i4 = zzv + zzA2;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzD(obj, i7, i6)) {
                        i5 = a.a(i7 << 3, 4, i5);
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzD(obj, i7, i6)) {
                        i5 = a.a(i7 << 3, 8, i5);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzD(obj, i7, i6)) {
                        int zzn4 = zzn(obj, j4);
                        i5 = a.a((zzn4 >> 31) ^ (zzn4 + zzn4), zzacx.zzA(i7 << 3), i5);
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzD(obj, i7, i6)) {
                        long zzr4 = zzr(obj, j4);
                        zzA = zzacx.zzA(i7 << 3);
                        zzB = zzacx.zzB((zzr4 >> 63) ^ (zzr4 + zzr4));
                        i4 = zzB + zzA;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzD(obj, i7, i6)) {
                        zzo = zzacx.zzu(i7, (zzaer) zzagd.zzf(obj, j4), zzs(i6));
                        i5 += zzo;
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzaft zzaftVar = this.zzl;
        return i5 + zzaftVar.zza(zzaftVar.zzc(obj));
    }

    private static int zzn(Object obj, long j4) {
        return ((Integer) zzagd.zzf(obj, j4)).intValue();
    }

    private final int zzo(int i4) {
        return this.zzc[i4 + 2];
    }

    private static int zzp(int i4) {
        return (i4 >>> 20) & 255;
    }

    private final int zzq(int i4) {
        return this.zzc[i4 + 1];
    }

    private static long zzr(Object obj, long j4) {
        return ((Long) zzagd.zzf(obj, j4)).longValue();
    }

    private final zzafc zzs(int i4) {
        int i5 = i4 / 3;
        int i6 = i5 + i5;
        zzafc zzafcVar = (zzafc) this.zzd[i6];
        if (zzafcVar != null) {
            return zzafcVar;
        }
        zzafc zzb2 = zzaez.zza().zzb((Class) this.zzd[i6 + 1]);
        this.zzd[i6] = zzb2;
        return zzb2;
    }

    private final Object zzt(int i4) {
        int i5 = i4 / 3;
        return this.zzd[i5 + i5];
    }

    private static Field zzu(Class cls, String str) {
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
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(arrays).length());
            l0.a(sb, ProtectedSandApp.s("\ue7bc"), str, ProtectedSandApp.s("\ue7bd"), name);
            throw new RuntimeException(c.a(sb, ProtectedSandApp.s("\ue7be"), arrays));
        }
    }

    private final void zzv(Object obj, Object obj2, int i4) {
        long zzq = zzq(i4) & 1048575;
        if (zzA(obj2, i4)) {
            Object zzf = zzagd.zzf(obj, zzq);
            Object zzf2 = zzagd.zzf(obj2, zzq);
            if (zzf != null && zzf2 != null) {
                zzagd.zzs(obj, zzq, zzads.zzg(zzf, zzf2));
                zzx(obj, i4);
            } else if (zzf2 != null) {
                zzagd.zzs(obj, zzq, zzf2);
                zzx(obj, i4);
            }
        }
    }

    private final void zzw(Object obj, Object obj2, int i4) {
        int zzq = zzq(i4);
        int i5 = this.zzc[i4];
        long j4 = zzq & 1048575;
        if (zzD(obj2, i5, i4)) {
            Object zzf = zzD(obj, i5, i4) ? zzagd.zzf(obj, j4) : null;
            Object zzf2 = zzagd.zzf(obj2, j4);
            if (zzf != null && zzf2 != null) {
                zzagd.zzs(obj, j4, zzads.zzg(zzf, zzf2));
                zzy(obj, i5, i4);
            } else if (zzf2 != null) {
                zzagd.zzs(obj, j4, zzf2);
                zzy(obj, i5, i4);
            }
        }
    }

    private final void zzx(Object obj, int i4) {
        int zzo = zzo(i4);
        long j4 = 1048575 & zzo;
        if (j4 == 1048575) {
            return;
        }
        zzagd.zzq(obj, j4, (1 << (zzo >>> 20)) | zzagd.zzc(obj, j4));
    }

    private final void zzy(Object obj, int i4, int i5) {
        zzagd.zzq(obj, zzo(i5) & 1048575, i4);
    }

    private final boolean zzz(Object obj, Object obj2, int i4) {
        return zzA(obj, i4) == zzA(obj2, i4);
    }

    @Override // com.google.android.libraries.places.internal.zzafc
    public final int zza(Object obj) {
        return this.zzg ? zzm(obj) : zzl(obj);
    }

    @Override // com.google.android.libraries.places.internal.zzafc
    public final int zzb(Object obj) {
        int i4;
        int zzc;
        int i5;
        int zzc2;
        int length = this.zzc.length;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7 += 3) {
            int zzq = zzq(i7);
            int i10 = this.zzc[i7];
            long j4 = 1048575 & zzq;
            int i11 = 37;
            switch (zzp(zzq)) {
                case 0:
                    i4 = i6 * 53;
                    zzc = zzads.zzc(Double.doubleToLongBits(zzagd.zza(obj, j4)));
                    i6 = zzc + i4;
                    break;
                case 1:
                    i4 = i6 * 53;
                    zzc = Float.floatToIntBits(zzagd.zzb(obj, j4));
                    i6 = zzc + i4;
                    break;
                case 2:
                    i4 = i6 * 53;
                    zzc = zzads.zzc(zzagd.zzd(obj, j4));
                    i6 = zzc + i4;
                    break;
                case 3:
                    i4 = i6 * 53;
                    zzc = zzads.zzc(zzagd.zzd(obj, j4));
                    i6 = zzc + i4;
                    break;
                case 4:
                    i5 = i6 * 53;
                    zzc2 = zzagd.zzc(obj, j4);
                    i6 = i5 + zzc2;
                    break;
                case 5:
                    i4 = i6 * 53;
                    zzc = zzads.zzc(zzagd.zzd(obj, j4));
                    i6 = zzc + i4;
                    break;
                case 6:
                    i5 = i6 * 53;
                    zzc2 = zzagd.zzc(obj, j4);
                    i6 = i5 + zzc2;
                    break;
                case 7:
                    i4 = i6 * 53;
                    zzc = zzads.zza(zzagd.zzw(obj, j4));
                    i6 = zzc + i4;
                    break;
                case 8:
                    i4 = i6 * 53;
                    zzc = ((String) zzagd.zzf(obj, j4)).hashCode();
                    i6 = zzc + i4;
                    break;
                case 9:
                    Object zzf = zzagd.zzf(obj, j4);
                    if (zzf != null) {
                        i11 = zzf.hashCode();
                    }
                    i6 = (i6 * 53) + i11;
                    break;
                case 10:
                    i4 = i6 * 53;
                    zzc = zzagd.zzf(obj, j4).hashCode();
                    i6 = zzc + i4;
                    break;
                case 11:
                    i5 = i6 * 53;
                    zzc2 = zzagd.zzc(obj, j4);
                    i6 = i5 + zzc2;
                    break;
                case 12:
                    i5 = i6 * 53;
                    zzc2 = zzagd.zzc(obj, j4);
                    i6 = i5 + zzc2;
                    break;
                case 13:
                    i5 = i6 * 53;
                    zzc2 = zzagd.zzc(obj, j4);
                    i6 = i5 + zzc2;
                    break;
                case 14:
                    i4 = i6 * 53;
                    zzc = zzads.zzc(zzagd.zzd(obj, j4));
                    i6 = zzc + i4;
                    break;
                case 15:
                    i5 = i6 * 53;
                    zzc2 = zzagd.zzc(obj, j4);
                    i6 = i5 + zzc2;
                    break;
                case 16:
                    i4 = i6 * 53;
                    zzc = zzads.zzc(zzagd.zzd(obj, j4));
                    i6 = zzc + i4;
                    break;
                case 17:
                    Object zzf2 = zzagd.zzf(obj, j4);
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
                    i4 = i6 * 53;
                    zzc = zzagd.zzf(obj, j4).hashCode();
                    i6 = zzc + i4;
                    break;
                case 50:
                    i4 = i6 * 53;
                    zzc = zzagd.zzf(obj, j4).hashCode();
                    i6 = zzc + i4;
                    break;
                case 51:
                    if (zzD(obj, i10, i7)) {
                        i4 = i6 * 53;
                        zzc = zzads.zzc(Double.doubleToLongBits(zzj(obj, j4)));
                        i6 = zzc + i4;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzD(obj, i10, i7)) {
                        i4 = i6 * 53;
                        zzc = Float.floatToIntBits(zzk(obj, j4));
                        i6 = zzc + i4;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzD(obj, i10, i7)) {
                        i4 = i6 * 53;
                        zzc = zzads.zzc(zzr(obj, j4));
                        i6 = zzc + i4;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzD(obj, i10, i7)) {
                        i4 = i6 * 53;
                        zzc = zzads.zzc(zzr(obj, j4));
                        i6 = zzc + i4;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzD(obj, i10, i7)) {
                        i5 = i6 * 53;
                        zzc2 = zzn(obj, j4);
                        i6 = i5 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzD(obj, i10, i7)) {
                        i4 = i6 * 53;
                        zzc = zzads.zzc(zzr(obj, j4));
                        i6 = zzc + i4;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzD(obj, i10, i7)) {
                        i5 = i6 * 53;
                        zzc2 = zzn(obj, j4);
                        i6 = i5 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzD(obj, i10, i7)) {
                        i4 = i6 * 53;
                        zzc = zzads.zza(zzE(obj, j4));
                        i6 = zzc + i4;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzD(obj, i10, i7)) {
                        i4 = i6 * 53;
                        zzc = ((String) zzagd.zzf(obj, j4)).hashCode();
                        i6 = zzc + i4;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzD(obj, i10, i7)) {
                        i4 = i6 * 53;
                        zzc = zzagd.zzf(obj, j4).hashCode();
                        i6 = zzc + i4;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzD(obj, i10, i7)) {
                        i4 = i6 * 53;
                        zzc = zzagd.zzf(obj, j4).hashCode();
                        i6 = zzc + i4;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzD(obj, i10, i7)) {
                        i5 = i6 * 53;
                        zzc2 = zzn(obj, j4);
                        i6 = i5 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzD(obj, i10, i7)) {
                        i5 = i6 * 53;
                        zzc2 = zzn(obj, j4);
                        i6 = i5 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzD(obj, i10, i7)) {
                        i5 = i6 * 53;
                        zzc2 = zzn(obj, j4);
                        i6 = i5 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzD(obj, i10, i7)) {
                        i4 = i6 * 53;
                        zzc = zzads.zzc(zzr(obj, j4));
                        i6 = zzc + i4;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzD(obj, i10, i7)) {
                        i5 = i6 * 53;
                        zzc2 = zzn(obj, j4);
                        i6 = i5 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzD(obj, i10, i7)) {
                        i4 = i6 * 53;
                        zzc = zzads.zzc(zzr(obj, j4));
                        i6 = zzc + i4;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzD(obj, i10, i7)) {
                        i4 = i6 * 53;
                        zzc = zzagd.zzf(obj, j4).hashCode();
                        i6 = zzc + i4;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.zzl.zzc(obj).hashCode() + (i6 * 53);
        if (!this.zzf) {
            return hashCode;
        }
        this.zzm.zza(obj);
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.zzafc
    public final void zzc(Object obj) {
        int i4;
        int i5 = this.zzi;
        while (true) {
            i4 = this.zzj;
            if (i5 >= i4) {
                break;
            }
            long zzq = zzq(this.zzh[i5]) & 1048575;
            Object zzf = zzagd.zzf(obj, zzq);
            if (zzf != null) {
                ((zzael) zzf).zzb();
                zzagd.zzs(obj, zzq, zzf);
            }
            i5++;
        }
        int length = this.zzh.length;
        while (i4 < length) {
            this.zzk.zza(obj, this.zzh[i4]);
            i4++;
        }
        this.zzl.zze(obj);
        if (this.zzf) {
            this.zzm.zzb(obj);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzafc
    public final void zzd(Object obj, Object obj2) {
        obj2.getClass();
        for (int i4 = 0; i4 < this.zzc.length; i4 += 3) {
            int zzq = zzq(i4);
            long j4 = 1048575 & zzq;
            int i5 = this.zzc[i4];
            switch (zzp(zzq)) {
                case 0:
                    if (zzA(obj2, i4)) {
                        zzagd.zzo(obj, j4, zzagd.zza(obj2, j4));
                        zzx(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzA(obj2, i4)) {
                        zzagd.zzp(obj, j4, zzagd.zzb(obj2, j4));
                        zzx(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzA(obj2, i4)) {
                        zzagd.zzr(obj, j4, zzagd.zzd(obj2, j4));
                        zzx(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzA(obj2, i4)) {
                        zzagd.zzr(obj, j4, zzagd.zzd(obj2, j4));
                        zzx(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzA(obj2, i4)) {
                        zzagd.zzq(obj, j4, zzagd.zzc(obj2, j4));
                        zzx(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzA(obj2, i4)) {
                        zzagd.zzr(obj, j4, zzagd.zzd(obj2, j4));
                        zzx(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzA(obj2, i4)) {
                        zzagd.zzq(obj, j4, zzagd.zzc(obj2, j4));
                        zzx(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzA(obj2, i4)) {
                        zzagd.zzm(obj, j4, zzagd.zzw(obj2, j4));
                        zzx(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzA(obj2, i4)) {
                        zzagd.zzs(obj, j4, zzagd.zzf(obj2, j4));
                        zzx(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzv(obj, obj2, i4);
                    break;
                case 10:
                    if (zzA(obj2, i4)) {
                        zzagd.zzs(obj, j4, zzagd.zzf(obj2, j4));
                        zzx(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzA(obj2, i4)) {
                        zzagd.zzq(obj, j4, zzagd.zzc(obj2, j4));
                        zzx(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzA(obj2, i4)) {
                        zzagd.zzq(obj, j4, zzagd.zzc(obj2, j4));
                        zzx(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzA(obj2, i4)) {
                        zzagd.zzq(obj, j4, zzagd.zzc(obj2, j4));
                        zzx(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzA(obj2, i4)) {
                        zzagd.zzr(obj, j4, zzagd.zzd(obj2, j4));
                        zzx(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzA(obj2, i4)) {
                        zzagd.zzq(obj, j4, zzagd.zzc(obj2, j4));
                        zzx(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzA(obj2, i4)) {
                        zzagd.zzr(obj, j4, zzagd.zzd(obj2, j4));
                        zzx(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzv(obj, obj2, i4);
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
                    zzafe.zzG(this.zzo, obj, obj2, j4);
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
                    if (zzD(obj2, i5, i4)) {
                        zzagd.zzs(obj, j4, zzagd.zzf(obj2, j4));
                        zzy(obj, i5, i4);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzw(obj, obj2, i4);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzD(obj2, i5, i4)) {
                        zzagd.zzs(obj, j4, zzagd.zzf(obj2, j4));
                        zzy(obj, i5, i4);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzw(obj, obj2, i4);
                    break;
            }
        }
        zzafe.zzD(this.zzl, obj, obj2);
        if (this.zzf) {
            zzafe.zzC(this.zzm, obj, obj2);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzafc
    public final boolean zze(Object obj, Object obj2) {
        boolean zzF;
        int length = this.zzc.length;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int zzq = zzq(i4);
            long j4 = zzq & 1048575;
            switch (zzp(zzq)) {
                case 0:
                    if (zzz(obj, obj2, i4) && Double.doubleToLongBits(zzagd.zza(obj, j4)) == Double.doubleToLongBits(zzagd.zza(obj2, j4))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzz(obj, obj2, i4) && Float.floatToIntBits(zzagd.zzb(obj, j4)) == Float.floatToIntBits(zzagd.zzb(obj2, j4))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzz(obj, obj2, i4) && zzagd.zzd(obj, j4) == zzagd.zzd(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzz(obj, obj2, i4) && zzagd.zzd(obj, j4) == zzagd.zzd(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzz(obj, obj2, i4) && zzagd.zzc(obj, j4) == zzagd.zzc(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzz(obj, obj2, i4) && zzagd.zzd(obj, j4) == zzagd.zzd(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzz(obj, obj2, i4) && zzagd.zzc(obj, j4) == zzagd.zzc(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzz(obj, obj2, i4) && zzagd.zzw(obj, j4) == zzagd.zzw(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzz(obj, obj2, i4) && zzafe.zzF(zzagd.zzf(obj, j4), zzagd.zzf(obj2, j4))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzz(obj, obj2, i4) && zzafe.zzF(zzagd.zzf(obj, j4), zzagd.zzf(obj2, j4))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzz(obj, obj2, i4) && zzafe.zzF(zzagd.zzf(obj, j4), zzagd.zzf(obj2, j4))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzz(obj, obj2, i4) && zzagd.zzc(obj, j4) == zzagd.zzc(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzz(obj, obj2, i4) && zzagd.zzc(obj, j4) == zzagd.zzc(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzz(obj, obj2, i4) && zzagd.zzc(obj, j4) == zzagd.zzc(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzz(obj, obj2, i4) && zzagd.zzd(obj, j4) == zzagd.zzd(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzz(obj, obj2, i4) && zzagd.zzc(obj, j4) == zzagd.zzc(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzz(obj, obj2, i4) && zzagd.zzd(obj, j4) == zzagd.zzd(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzz(obj, obj2, i4) && zzafe.zzF(zzagd.zzf(obj, j4), zzagd.zzf(obj2, j4))) {
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
                    zzF = zzafe.zzF(zzagd.zzf(obj, j4), zzagd.zzf(obj2, j4));
                    break;
                case 50:
                    zzF = zzafe.zzF(zzagd.zzf(obj, j4), zzagd.zzf(obj2, j4));
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
                    long zzo = zzo(i4) & 1048575;
                    if (zzagd.zzc(obj, zzo) == zzagd.zzc(obj2, zzo) && zzafe.zzF(zzagd.zzf(obj, j4), zzagd.zzf(obj2, j4))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzF) {
                return false;
            }
        }
        if (!this.zzl.zzc(obj).equals(this.zzl.zzc(obj2))) {
            return false;
        }
        if (!this.zzf) {
            return true;
        }
        this.zzm.zza(obj);
        this.zzm.zza(obj2);
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.zzafc
    public final boolean zzf(Object obj) {
        int i4;
        int i5;
        int i6 = 1048575;
        int i7 = 0;
        int i10 = 0;
        while (i10 < this.zzi) {
            int i11 = this.zzh[i10];
            int i12 = this.zzc[i11];
            int zzq = zzq(i11);
            int i13 = this.zzc[i11 + 2];
            int i14 = i13 & 1048575;
            int i15 = 1 << (i13 >>> 20);
            if (i14 != i6) {
                if (i14 != 1048575) {
                    i7 = zzb.getInt(obj, i14);
                }
                i5 = i7;
                i4 = i14;
            } else {
                i4 = i6;
                i5 = i7;
            }
            if ((268435456 & zzq) != 0 && !zzB(obj, i11, i4, i5, i15)) {
                return false;
            }
            int zzp = zzp(zzq);
            if (zzp != 9 && zzp != 17) {
                if (zzp != 27) {
                    if (zzp == 60 || zzp == 68) {
                        if (zzD(obj, i12, i11) && !zzC(obj, zzq, zzs(i11))) {
                            return false;
                        }
                    } else if (zzp != 49) {
                        if (zzp == 50 && !((zzael) zzagd.zzf(obj, zzq & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzagd.zzf(obj, zzq & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzafc zzs = zzs(i11);
                    for (int i16 = 0; i16 < list.size(); i16++) {
                        if (!zzs.zzf(list.get(i16))) {
                            return false;
                        }
                    }
                }
            } else if (zzB(obj, i11, i4, i5, i15) && !zzC(obj, zzq, zzs(i11))) {
                return false;
            }
            i10++;
            i6 = i4;
            i7 = i5;
        }
        if (!this.zzf) {
            return true;
        }
        this.zzm.zza(obj);
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.zzafc
    public final void zzi(Object obj, zzacy zzacyVar) throws IOException {
        if (!this.zzg) {
            zzF(obj, zzacyVar);
            return;
        }
        if (this.zzf) {
            this.zzm.zza(obj);
            throw null;
        }
        int length = this.zzc.length;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int zzq = zzq(i4);
            int i5 = this.zzc[i4];
            switch (zzp(zzq)) {
                case 0:
                    if (zzA(obj, i4)) {
                        zzacyVar.zzf(i5, zzagd.zza(obj, zzq & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzA(obj, i4)) {
                        zzacyVar.zzn(i5, zzagd.zzb(obj, zzq & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzA(obj, i4)) {
                        zzacyVar.zzs(i5, zzagd.zzd(obj, zzq & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzA(obj, i4)) {
                        zzacyVar.zzH(i5, zzagd.zzd(obj, zzq & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzA(obj, i4)) {
                        zzacyVar.zzq(i5, zzagd.zzc(obj, zzq & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzA(obj, i4)) {
                        zzacyVar.zzl(i5, zzagd.zzd(obj, zzq & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzA(obj, i4)) {
                        zzacyVar.zzj(i5, zzagd.zzc(obj, zzq & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzA(obj, i4)) {
                        zzacyVar.zzb(i5, zzagd.zzw(obj, zzq & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzA(obj, i4)) {
                        zzH(i5, zzagd.zzf(obj, zzq & 1048575), zzacyVar);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (zzA(obj, i4)) {
                        zzacyVar.zzu(i5, zzagd.zzf(obj, zzq & 1048575), zzs(i4));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzA(obj, i4)) {
                        zzacyVar.zzd(i5, (zzacp) zzagd.zzf(obj, zzq & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzA(obj, i4)) {
                        zzacyVar.zzF(i5, zzagd.zzc(obj, zzq & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzA(obj, i4)) {
                        zzacyVar.zzh(i5, zzagd.zzc(obj, zzq & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzA(obj, i4)) {
                        zzacyVar.zzv(i5, zzagd.zzc(obj, zzq & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzA(obj, i4)) {
                        zzacyVar.zzx(i5, zzagd.zzd(obj, zzq & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzA(obj, i4)) {
                        zzacyVar.zzz(i5, zzagd.zzc(obj, zzq & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzA(obj, i4)) {
                        zzacyVar.zzB(i5, zzagd.zzd(obj, zzq & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzA(obj, i4)) {
                        zzacyVar.zzp(i5, zzagd.zzf(obj, zzq & 1048575), zzs(i4));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzafe.zzJ(i5, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, false);
                    break;
                case 19:
                    zzafe.zzN(i5, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, false);
                    break;
                case 20:
                    zzafe.zzQ(i5, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, false);
                    break;
                case 21:
                    zzafe.zzY(i5, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, false);
                    break;
                case 22:
                    zzafe.zzP(i5, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, false);
                    break;
                case 23:
                    zzafe.zzM(i5, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, false);
                    break;
                case 24:
                    zzafe.zzL(i5, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, false);
                    break;
                case 25:
                    zzafe.zzH(i5, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, false);
                    break;
                case 26:
                    zzafe.zzW(i5, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar);
                    break;
                case 27:
                    zzafe.zzR(i5, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, zzs(i4));
                    break;
                case 28:
                    zzafe.zzI(i5, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar);
                    break;
                case 29:
                    zzafe.zzX(i5, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, false);
                    break;
                case 30:
                    zzafe.zzK(i5, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, false);
                    break;
                case 31:
                    zzafe.zzS(i5, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, false);
                    break;
                case 32:
                    zzafe.zzT(i5, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, false);
                    break;
                case 33:
                    zzafe.zzU(i5, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, false);
                    break;
                case 34:
                    zzafe.zzV(i5, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, false);
                    break;
                case 35:
                    zzafe.zzJ(i5, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, true);
                    break;
                case 36:
                    zzafe.zzN(i5, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, true);
                    break;
                case 37:
                    zzafe.zzQ(i5, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, true);
                    break;
                case 38:
                    zzafe.zzY(i5, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, true);
                    break;
                case 39:
                    zzafe.zzP(i5, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, true);
                    break;
                case 40:
                    zzafe.zzM(i5, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, true);
                    break;
                case 41:
                    zzafe.zzL(i5, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, true);
                    break;
                case 42:
                    zzafe.zzH(i5, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, true);
                    break;
                case 43:
                    zzafe.zzX(i5, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, true);
                    break;
                case 44:
                    zzafe.zzK(i5, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, true);
                    break;
                case 45:
                    zzafe.zzS(i5, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, true);
                    break;
                case 46:
                    zzafe.zzT(i5, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, true);
                    break;
                case 47:
                    zzafe.zzU(i5, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, true);
                    break;
                case 48:
                    zzafe.zzV(i5, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, true);
                    break;
                case 49:
                    zzafe.zzO(i5, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, zzs(i4));
                    break;
                case 50:
                    zzG(zzacyVar, i5, zzagd.zzf(obj, zzq & 1048575), i4);
                    break;
                case 51:
                    if (zzD(obj, i5, i4)) {
                        zzacyVar.zzf(i5, zzj(obj, zzq & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzD(obj, i5, i4)) {
                        zzacyVar.zzn(i5, zzk(obj, zzq & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzD(obj, i5, i4)) {
                        zzacyVar.zzs(i5, zzr(obj, zzq & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzD(obj, i5, i4)) {
                        zzacyVar.zzH(i5, zzr(obj, zzq & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzD(obj, i5, i4)) {
                        zzacyVar.zzq(i5, zzn(obj, zzq & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzD(obj, i5, i4)) {
                        zzacyVar.zzl(i5, zzr(obj, zzq & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzD(obj, i5, i4)) {
                        zzacyVar.zzj(i5, zzn(obj, zzq & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzD(obj, i5, i4)) {
                        zzacyVar.zzb(i5, zzE(obj, zzq & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzD(obj, i5, i4)) {
                        zzH(i5, zzagd.zzf(obj, zzq & 1048575), zzacyVar);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzD(obj, i5, i4)) {
                        zzacyVar.zzu(i5, zzagd.zzf(obj, zzq & 1048575), zzs(i4));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzD(obj, i5, i4)) {
                        zzacyVar.zzd(i5, (zzacp) zzagd.zzf(obj, zzq & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzD(obj, i5, i4)) {
                        zzacyVar.zzF(i5, zzn(obj, zzq & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzD(obj, i5, i4)) {
                        zzacyVar.zzh(i5, zzn(obj, zzq & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzD(obj, i5, i4)) {
                        zzacyVar.zzv(i5, zzn(obj, zzq & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzD(obj, i5, i4)) {
                        zzacyVar.zzx(i5, zzr(obj, zzq & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzD(obj, i5, i4)) {
                        zzacyVar.zzz(i5, zzn(obj, zzq & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzD(obj, i5, i4)) {
                        zzacyVar.zzB(i5, zzr(obj, zzq & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzD(obj, i5, i4)) {
                        zzacyVar.zzp(i5, zzagd.zzf(obj, zzq & 1048575), zzs(i4));
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzaft zzaftVar = this.zzl;
        zzaftVar.zzg(zzaftVar.zzc(obj), zzacyVar);
    }
}
