package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
public enum zzbl {
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
    zzq(49),
    zzr(7),
    zzs(8),
    zzt(9),
    zzu(50),
    zzv(10),
    zzw(11),
    zzx(12),
    zzy(13),
    zzz(51),
    zzA(47),
    zzB(54),
    zzC(55),
    zzD(63),
    zzE(64),
    zzF(65),
    zzG(66),
    zzH(15),
    zzI(48),
    zzJ(16),
    zzK(17),
    zzL(18),
    zzM(19),
    zzN(20),
    zzO(21),
    zzP(22),
    zzQ(23),
    zzR(24),
    zzS(25),
    zzT(26),
    zzU(27),
    zzV(28),
    zzW(29),
    zzX(45),
    zzY(30),
    zzZ(31),
    zzaa(32),
    zzab(33),
    zzac(46),
    zzad(34),
    zzae(35),
    zzaf(36),
    zzag(43),
    zzah(37),
    zzai(38),
    zzaj(39),
    zzak(40),
    zzal(44),
    zzam(41),
    zzan(42);

    private static final Map zzao = new HashMap();
    private final int zzaq;

    static {
        for (zzbl zzblVar : values()) {
            zzao.put(Integer.valueOf(zzblVar.zzaq), zzblVar);
        }
    }

    zzbl(int i5) {
        this.zzaq = i5;
    }

    public static zzbl zza(int i5) {
        return (zzbl) zzao.get(Integer.valueOf(i5));
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.valueOf(this.zzaq).toString();
    }

    public final Integer zzb() {
        return Integer.valueOf(this.zzaq);
    }
}
