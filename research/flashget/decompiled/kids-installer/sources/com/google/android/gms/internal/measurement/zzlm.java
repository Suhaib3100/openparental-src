package com.google.android.gms.internal.measurement;

import com.flashget.kidsdownloader.ProtectedSandApp;
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
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzlm {
    public static final zzlm zza;
    public static final zzlm zzb;
    public static final zzlm zzc;
    public static final zzlm zzd;
    public static final zzlm zze;
    public static final zzlm zzf;
    public static final zzlm zzg;
    public static final zzlm zzh;
    public static final zzlm zzi;
    public static final zzlm zzj;
    private static final /* synthetic */ zzlm[] zzk;
    private final Class zzl;
    private final Class zzm;
    private final Object zzn;

    static {
        zzlm zzlmVar = new zzlm(ProtectedSandApp.s("ท"), 0, Void.class, Void.class, null);
        zza = zzlmVar;
        Class cls = Integer.TYPE;
        zzlm zzlmVar2 = new zzlm(ProtectedSandApp.s("ธ"), 1, cls, Integer.class, 0);
        zzb = zzlmVar2;
        zzlm zzlmVar3 = new zzlm(ProtectedSandApp.s("น"), 2, Long.TYPE, Long.class, 0L);
        zzc = zzlmVar3;
        zzlm zzlmVar4 = new zzlm(ProtectedSandApp.s("บ"), 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zzlmVar4;
        zzlm zzlmVar5 = new zzlm(ProtectedSandApp.s("ป"), 4, Double.TYPE, Double.class, Double.valueOf(p.f18289o));
        zze = zzlmVar5;
        zzlm zzlmVar6 = new zzlm(ProtectedSandApp.s("ผ"), 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zzlmVar6;
        zzlm zzlmVar7 = new zzlm(ProtectedSandApp.s("ฝ"), 6, String.class, String.class, "");
        zzg = zzlmVar7;
        zzlm zzlmVar8 = new zzlm(ProtectedSandApp.s("พ"), 7, zzka.class, zzka.class, zzka.zzb);
        zzh = zzlmVar8;
        zzlm zzlmVar9 = new zzlm(ProtectedSandApp.s("ฟ"), 8, cls, Integer.class, null);
        zzi = zzlmVar9;
        zzlm zzlmVar10 = new zzlm(ProtectedSandApp.s("ภ"), 9, Object.class, Object.class, null);
        zzj = zzlmVar10;
        zzk = new zzlm[]{zzlmVar, zzlmVar2, zzlmVar3, zzlmVar4, zzlmVar5, zzlmVar6, zzlmVar7, zzlmVar8, zzlmVar9, zzlmVar10};
    }

    private zzlm(String str, int i5, Class cls, Class cls2, Object obj) {
        this.zzl = cls;
        this.zzm = cls2;
        this.zzn = obj;
    }

    public static zzlm[] values() {
        return (zzlm[]) zzk.clone();
    }

    public final Class zza() {
        return this.zzm;
    }
}
