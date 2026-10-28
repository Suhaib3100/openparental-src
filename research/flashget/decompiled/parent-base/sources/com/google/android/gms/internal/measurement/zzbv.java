package com.google.android.gms.internal.measurement;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes5.dex */
public enum zzbv {
    zza(0),
    zzb(1),
    zzc(2),
    zzd(3),
    zze(56),
    zzf(57),
    zzg(58),
    zzh(59),
    zzi(60),
    zzj(61),
    zzk(62),
    zzl(53),
    zzm(4),
    zzn(5),
    zzo(52),
    zzp(6),
    zzbk(49),
    zzq(7),
    zzr(8),
    zzs(9),
    zzt(50),
    zzu(10),
    zzbl(11),
    zzv(12),
    zzw(13),
    zzx(51),
    zzy(47),
    zzz(54),
    zzaa(55),
    zzab(63),
    zzac(64),
    zzad(65),
    zzae(66),
    zzaf(15),
    zzbm(48),
    zzag(16),
    zzah(17),
    zzai(18),
    zzaj(19),
    zzak(20),
    zzal(21),
    zzam(22),
    zzan(23),
    zzao(24),
    zzap(25),
    zzaq(26),
    zzar(27),
    zzas(28),
    zzat(29),
    zzau(45),
    zzav(30),
    zzbn(31),
    zzaw(32),
    zzax(33),
    zzay(46),
    zzaz(34),
    zzba(35),
    zzbb(36),
    zzbc(43),
    zzbd(37),
    zzbe(38),
    zzbf(39),
    zzbg(40),
    zzbh(44),
    zzbi(41),
    zzbj(42);

    private static final Map<Integer, zzbv> zzbo = new HashMap();
    private final int zzbq;

    static {
        for (zzbv zzbvVar : values()) {
            zzbo.put(Integer.valueOf(zzbvVar.zzbq), zzbvVar);
        }
    }

    zzbv(int i4) {
        if (i4 > 100) {
            throw new AssertionError(ProtectedSandApp.s("튾"));
        }
        this.zzbq = i4;
    }

    public static zzbv zza(int i4) {
        return zzbo.get(Integer.valueOf(i4));
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.valueOf(this.zzbq).toString();
    }
}
