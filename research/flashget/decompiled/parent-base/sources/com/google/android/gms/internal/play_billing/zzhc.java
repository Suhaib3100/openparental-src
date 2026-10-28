package com.google.android.gms.internal.play_billing;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.remoteconfig.p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzb' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
public final class zzhc {
    public static final zzhc zza;
    public static final zzhc zzb;
    public static final zzhc zzc;
    public static final zzhc zzd;
    public static final zzhc zze;
    public static final zzhc zzf;
    public static final zzhc zzg;
    public static final zzhc zzh;
    public static final zzhc zzi;
    public static final zzhc zzj;
    private static final /* synthetic */ zzhc[] zzk;
    private final Class zzl;

    static {
        zzhc zzhcVar = new zzhc(ProtectedSandApp.s("ퟩ"), 0, Void.class, Void.class, null);
        zza = zzhcVar;
        Class cls = Integer.TYPE;
        zzhc zzhcVar2 = new zzhc(ProtectedSandApp.s("ퟪ"), 1, cls, Integer.class, 0);
        zzb = zzhcVar2;
        zzhc zzhcVar3 = new zzhc(ProtectedSandApp.s("ퟫ"), 2, Long.TYPE, Long.class, 0L);
        zzc = zzhcVar3;
        zzhc zzhcVar4 = new zzhc(ProtectedSandApp.s("ퟬ"), 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zzhcVar4;
        zzhc zzhcVar5 = new zzhc(ProtectedSandApp.s("ퟭ"), 4, Double.TYPE, Double.class, Double.valueOf(p.f60679p));
        zze = zzhcVar5;
        zzhc zzhcVar6 = new zzhc(ProtectedSandApp.s("ퟮ"), 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zzhcVar6;
        zzhc zzhcVar7 = new zzhc(ProtectedSandApp.s("ퟯ"), 6, String.class, String.class, "");
        zzg = zzhcVar7;
        zzhc zzhcVar8 = new zzhc(ProtectedSandApp.s("ퟰ"), 7, zzfp.class, zzfp.class, zzfp.zza);
        zzh = zzhcVar8;
        zzhc zzhcVar9 = new zzhc(ProtectedSandApp.s("ퟱ"), 8, cls, Integer.class, null);
        zzi = zzhcVar9;
        zzhc zzhcVar10 = new zzhc(ProtectedSandApp.s("ퟲ"), 9, Object.class, Object.class, null);
        zzj = zzhcVar10;
        zzk = new zzhc[]{zzhcVar, zzhcVar2, zzhcVar3, zzhcVar4, zzhcVar5, zzhcVar6, zzhcVar7, zzhcVar8, zzhcVar9, zzhcVar10};
    }

    private zzhc(String str, int i4, Class cls, Class cls2, Object obj) {
        this.zzl = cls2;
    }

    public static zzhc[] values() {
        return (zzhc[]) zzk.clone();
    }

    public final Class zza() {
        return this.zzl;
    }
}
