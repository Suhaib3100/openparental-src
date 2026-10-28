package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.annotation.m1;
import androidx.annotation.n1;
import androidx.constraintlayout.solver.widgets.analyzer.e;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzop;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes4.dex */
final class zzak extends zzku {
    private static final String[] zza = {ProtectedSandApp.s("⺄"), ProtectedSandApp.s("⺅"), ProtectedSandApp.s("⺆"), ProtectedSandApp.s("⺇"), ProtectedSandApp.s("⺈"), ProtectedSandApp.s("⺉"), ProtectedSandApp.s("⺊"), ProtectedSandApp.s("⺋"), ProtectedSandApp.s("⺌"), ProtectedSandApp.s("⺍"), ProtectedSandApp.s("⺎"), ProtectedSandApp.s("⺏")};
    private static final String[] zzb = {ProtectedSandApp.s("⺐"), ProtectedSandApp.s("⺑")};
    private static final String[] zzc = {ProtectedSandApp.s("⺒"), ProtectedSandApp.s("⺓"), ProtectedSandApp.s("⺔"), ProtectedSandApp.s("⺕"), ProtectedSandApp.s("⺖"), ProtectedSandApp.s("⺗"), ProtectedSandApp.s("⺘"), ProtectedSandApp.s("⺙"), ProtectedSandApp.s("\u2e9a"), ProtectedSandApp.s("⺛"), ProtectedSandApp.s("⺜"), ProtectedSandApp.s("⺝"), ProtectedSandApp.s("⺞"), ProtectedSandApp.s("⺟"), ProtectedSandApp.s("⺠"), ProtectedSandApp.s("⺡"), ProtectedSandApp.s("⺢"), ProtectedSandApp.s("⺣"), ProtectedSandApp.s("⺤"), ProtectedSandApp.s("⺥"), ProtectedSandApp.s("⺦"), ProtectedSandApp.s("⺧"), ProtectedSandApp.s("⺨"), ProtectedSandApp.s("⺩"), ProtectedSandApp.s("⺪"), ProtectedSandApp.s("⺫"), ProtectedSandApp.s("⺬"), ProtectedSandApp.s("⺭"), ProtectedSandApp.s("⺮"), ProtectedSandApp.s("⺯"), ProtectedSandApp.s("⺰"), ProtectedSandApp.s("⺱"), ProtectedSandApp.s("⺲"), ProtectedSandApp.s("⺳"), ProtectedSandApp.s("⺴"), ProtectedSandApp.s("⺵"), ProtectedSandApp.s("⺶"), ProtectedSandApp.s("⺷"), ProtectedSandApp.s("⺸"), ProtectedSandApp.s("⺹"), ProtectedSandApp.s("⺺"), ProtectedSandApp.s("⺻"), ProtectedSandApp.s("⺼"), ProtectedSandApp.s("⺽"), ProtectedSandApp.s("⺾"), ProtectedSandApp.s("⺿"), ProtectedSandApp.s("⻀"), ProtectedSandApp.s("⻁"), ProtectedSandApp.s("⻂"), ProtectedSandApp.s("⻃"), ProtectedSandApp.s("⻄"), ProtectedSandApp.s("⻅"), ProtectedSandApp.s("⻆"), ProtectedSandApp.s("⻇"), ProtectedSandApp.s("⻈"), ProtectedSandApp.s("⻉"), ProtectedSandApp.s("⻊"), ProtectedSandApp.s("⻋"), ProtectedSandApp.s("⻌"), ProtectedSandApp.s("⻍"), ProtectedSandApp.s("⻎"), ProtectedSandApp.s("⻏"), ProtectedSandApp.s("⻐"), ProtectedSandApp.s("⻑")};
    private static final String[] zzd = {ProtectedSandApp.s("⻒"), ProtectedSandApp.s("⻓")};
    private static final String[] zze = {ProtectedSandApp.s("⻖"), ProtectedSandApp.s("⻗"), ProtectedSandApp.s("⻔"), ProtectedSandApp.s("⻕")};
    private static final String[] zzg;
    private static final String[] zzh;
    private static final String[] zzi;
    private final zzaj zzj;
    private final zzkq zzk;

    static {
        String s5 = ProtectedSandApp.s("⻘");
        String s6 = ProtectedSandApp.s("⻙");
        zzg = new String[]{s6, s5};
        zzh = new String[]{s6, ProtectedSandApp.s("⻚")};
        zzi = new String[]{ProtectedSandApp.s("⻛"), ProtectedSandApp.s("⻜")};
    }

    zzak(zzlh zzlhVar) {
        super(zzlhVar);
        this.zzk = new zzkq(this.zzt.zzax());
        this.zzt.zzf();
        this.zzj = new zzaj(this, this.zzt.zzaw(), ProtectedSandApp.s("⻝"));
    }

    @n1
    static final void zzV(ContentValues contentValues, String str, Object obj) {
        String s5 = ProtectedSandApp.s("⻞");
        Preconditions.checkNotEmpty(s5);
        Preconditions.checkNotNull(obj);
        if (obj instanceof String) {
            contentValues.put(s5, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(s5, (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("⻟"));
            }
            contentValues.put(s5, (Double) obj);
        }
    }

    @n1
    private final long zzZ(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = zzh().rawQuery(str, strArr);
                if (!rawQuery.moveToFirst()) {
                    throw new SQLiteException(ProtectedSandApp.s("⻠"));
                }
                long j5 = rawQuery.getLong(0);
                rawQuery.close();
                return j5;
            } catch (SQLiteException e6) {
                this.zzt.zzaA().zzd().zzc(ProtectedSandApp.s("⻡"), str, e6);
                throw e6;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    @n1
    private final long zzaa(String str, String[] strArr, long j5) {
        Cursor cursor = null;
        try {
            try {
                cursor = zzh().rawQuery(str, strArr);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return j5;
                }
                long j6 = cursor.getLong(0);
                cursor.close();
                return j6;
            } catch (SQLiteException e6) {
                this.zzt.zzaA().zzd().zzc(ProtectedSandApp.s("⻢"), str, e6);
                throw e6;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @n1
    public final void zzA(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzW();
        try {
            zzh().delete(ProtectedSandApp.s("⻣"), ProtectedSandApp.s("⻤"), new String[]{str, str2});
        } catch (SQLiteException e6) {
            this.zzt.zzaA().zzd().zzd(ProtectedSandApp.s("⻥"), zzet.zzn(str), this.zzt.zzj().zzf(str2), e6);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x026b, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0211, code lost:
    
        r0 = r23.zzt.zzaA().zzk();
        r8 = com.flashget.kidsdownloader.ProtectedSandApp.s("⻲");
        r9 = com.google.android.gms.measurement.internal.zzet.zzn(r24);
        r11 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x022d, code lost:
    
        if (r12.zzp() == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x022f, code lost:
    
        r20 = java.lang.Integer.valueOf(r12.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x023c, code lost:
    
        r0.zzd(r8, r9, r11, java.lang.String.valueOf(r20));
        r21 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x023a, code lost:
    
        r20 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02d9, code lost:
    
        r21 = r7;
        r0 = r0.zzh().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02e7, code lost:
    
        if (r0.hasNext() == false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02e9, code lost:
    
        r3 = (com.google.android.gms.internal.measurement.zzet) r0.next();
        zzW();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0303, code lost:
    
        if (r3.zze().isEmpty() == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0336, code lost:
    
        r7 = r3.zzbx();
        r11 = new android.content.ContentValues();
        r11.put(r15, r24);
        r11.put(r9, java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x034d, code lost:
    
        if (r3.zzj() == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x034f, code lost:
    
        r12 = java.lang.Integer.valueOf(r3.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0359, code lost:
    
        r11.put(r14, r12);
        r22 = r0;
        r11.put(com.flashget.kidsdownloader.ProtectedSandApp.s("\u2ef7"), r3.zze());
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x036f, code lost:
    
        if (r3.zzk() == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0371, code lost:
    
        r0 = java.lang.Boolean.valueOf(r3.zzi());
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x037b, code lost:
    
        r11.put(r13, r0);
        r11.put(r8, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x038f, code lost:
    
        if (zzh().insertWithOnConflict(r6, null, r11, 5) != (-1)) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x03a9, code lost:
    
        r0 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0391, code lost:
    
        r23.zzt.zzaA().zzd().zzb(com.flashget.kidsdownloader.ProtectedSandApp.s("\u2ef8"), com.google.android.gms.measurement.internal.zzet.zzn(r24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x03ad, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x03ae, code lost:
    
        r23.zzt.zzaA().zzd().zzc(com.flashget.kidsdownloader.ProtectedSandApp.s("\u2ef9"), com.google.android.gms.measurement.internal.zzet.zzn(r24), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x037a, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0358, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0305, code lost:
    
        r0 = r23.zzt.zzaA().zzk();
        r7 = com.flashget.kidsdownloader.ProtectedSandApp.s("\u2ef6");
        r8 = com.google.android.gms.measurement.internal.zzet.zzn(r24);
        r9 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0321, code lost:
    
        if (r3.zzj() == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0323, code lost:
    
        r3 = java.lang.Integer.valueOf(r3.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x032d, code lost:
    
        r0.zzd(r7, r8, r9, java.lang.String.valueOf(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x032c, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x03fc, code lost:
    
        r7 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0192, code lost:
    
        r11 = r0.zzh().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x019e, code lost:
    
        if (r11.hasNext() == false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01aa, code lost:
    
        if (((com.google.android.gms.internal.measurement.zzet) r11.next()).zzj() != false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01ac, code lost:
    
        r23.zzt.zzaA().zzk().zzc(com.flashget.kidsdownloader.ProtectedSandApp.s("⻬"), com.google.android.gms.measurement.internal.zzet.zzn(r24), java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01c9, code lost:
    
        r11 = r0.zzg().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01d1, code lost:
    
        r12 = r11.hasNext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01d5, code lost:
    
        r8 = com.flashget.kidsdownloader.ProtectedSandApp.s("⻭");
        r13 = com.flashget.kidsdownloader.ProtectedSandApp.s("⻮");
        r14 = com.flashget.kidsdownloader.ProtectedSandApp.s("⻯");
        r9 = com.flashget.kidsdownloader.ProtectedSandApp.s("⻰");
        r15 = com.flashget.kidsdownloader.ProtectedSandApp.s("⻱");
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01f3, code lost:
    
        if (r12 == false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01f5, code lost:
    
        r12 = (com.google.android.gms.internal.measurement.zzek) r11.next();
        zzW();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x020f, code lost:
    
        if (r12.zzg().isEmpty() == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0247, code lost:
    
        r3 = r12.zzbx();
        r21 = r7;
        r7 = new android.content.ContentValues();
        r7.put(r15, r24);
        r7.put(r9, java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0260, code lost:
    
        if (r12.zzp() == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0262, code lost:
    
        r9 = java.lang.Integer.valueOf(r12.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x026c, code lost:
    
        r7.put(r14, r9);
        r7.put(com.flashget.kidsdownloader.ProtectedSandApp.s("⻳"), r12.zzg());
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0280, code lost:
    
        if (r12.zzq() == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0282, code lost:
    
        r9 = java.lang.Boolean.valueOf(r12.zzn());
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x028c, code lost:
    
        r7.put(r13, r9);
        r7.put(r8, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02a0, code lost:
    
        if (zzh().insertWithOnConflict(r5, null, r7, 5) != (-1)) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02a2, code lost:
    
        r23.zzt.zzaA().zzd().zzb(com.flashget.kidsdownloader.ProtectedSandApp.s("\u2ef4"), com.google.android.gms.measurement.internal.zzet.zzn(r24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02b9, code lost:
    
        r7 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02bf, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02c0, code lost:
    
        r23.zzt.zzaA().zzd().zzc(com.flashget.kidsdownloader.ProtectedSandApp.s("\u2ef5"), com.google.android.gms.measurement.internal.zzet.zzn(r24), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x03c5, code lost:
    
        zzW();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24);
        r0 = zzh();
        r3 = r17;
        r0.delete(r6, r3, new java.lang.String[]{r24, java.lang.String.valueOf(r10)});
        r0.delete(r5, r3, new java.lang.String[]{r24, java.lang.String.valueOf(r10)});
        r17 = r3;
        r7 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x028b, code lost:
    
        r9 = null;
     */
    @androidx.annotation.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void zzB(java.lang.String r24, java.util.List r25) {
        /*
            Method dump skipped, instructions count: 1290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzak.zzB(java.lang.String, java.util.List):void");
    }

    @n1
    public final void zzC() {
        zzW();
        zzh().setTransactionSuccessful();
    }

    @n1
    public final void zzD(zzh zzhVar) {
        String s5 = ProtectedSandApp.s("⼂");
        Preconditions.checkNotNull(zzhVar);
        zzg();
        zzW();
        String zzv = zzhVar.zzv();
        Preconditions.checkNotNull(zzv);
        ContentValues contentValues = new ContentValues();
        contentValues.put(ProtectedSandApp.s("⼃"), zzv);
        contentValues.put(ProtectedSandApp.s("⼄"), zzhVar.zzw());
        contentValues.put(ProtectedSandApp.s("⼅"), zzhVar.zzA());
        contentValues.put(ProtectedSandApp.s("⼆"), zzhVar.zzC());
        contentValues.put(ProtectedSandApp.s("⼇"), Long.valueOf(zzhVar.zzo()));
        contentValues.put(ProtectedSandApp.s("⼈"), Long.valueOf(zzhVar.zzp()));
        contentValues.put(ProtectedSandApp.s("⼉"), Long.valueOf(zzhVar.zzn()));
        contentValues.put(ProtectedSandApp.s("⼊"), zzhVar.zzy());
        contentValues.put(ProtectedSandApp.s("⼋"), zzhVar.zzx());
        contentValues.put(ProtectedSandApp.s("⼌"), Long.valueOf(zzhVar.zzm()));
        contentValues.put(ProtectedSandApp.s("⼍"), Long.valueOf(zzhVar.zzj()));
        contentValues.put(ProtectedSandApp.s("⼎"), Boolean.valueOf(zzhVar.zzan()));
        contentValues.put(ProtectedSandApp.s("⼏"), Long.valueOf(zzhVar.zzi()));
        contentValues.put(ProtectedSandApp.s("⼐"), Long.valueOf(zzhVar.zzg()));
        contentValues.put(ProtectedSandApp.s("⼑"), Long.valueOf(zzhVar.zzf()));
        contentValues.put(ProtectedSandApp.s("⼒"), Long.valueOf(zzhVar.zzd()));
        contentValues.put(ProtectedSandApp.s("⼓"), Long.valueOf(zzhVar.zzc()));
        contentValues.put(ProtectedSandApp.s("⼔"), Long.valueOf(zzhVar.zzl()));
        contentValues.put(ProtectedSandApp.s("⼕"), Long.valueOf(zzhVar.zzb()));
        contentValues.put(ProtectedSandApp.s("⼖"), zzhVar.zzz());
        contentValues.put(ProtectedSandApp.s("⼗"), Long.valueOf(zzhVar.zze()));
        contentValues.put(ProtectedSandApp.s("⼘"), Long.valueOf(zzhVar.zzh()));
        contentValues.put(ProtectedSandApp.s("⼙"), zzhVar.zzB());
        zzhVar.zza();
        contentValues.put(ProtectedSandApp.s("⼚"), (Long) 0L);
        contentValues.put(ProtectedSandApp.s("⼛"), Boolean.valueOf(zzhVar.zzam()));
        contentValues.put(ProtectedSandApp.s("⼜"), zzhVar.zzt());
        contentValues.put(ProtectedSandApp.s("⼝"), Long.valueOf(zzhVar.zzk()));
        contentValues.put(ProtectedSandApp.s("⼞"), zzhVar.zzD());
        contentValues.put(ProtectedSandApp.s("⼟"), Boolean.valueOf(zzhVar.zzap()));
        contentValues.put(ProtectedSandApp.s("⼠"), Long.valueOf(zzhVar.zzr()));
        contentValues.put(ProtectedSandApp.s("⼡"), Long.valueOf(zzhVar.zzq()));
        List zzE = zzhVar.zzE();
        String s6 = ProtectedSandApp.s("⼢");
        if (zzE != null) {
            if (zzE.isEmpty()) {
                this.zzt.zzaA().zzk().zzb(ProtectedSandApp.s("⼣"), zzv);
            } else {
                contentValues.put(s6, TextUtils.join(ProtectedSandApp.s("⼤"), zzE));
            }
        }
        zzop.zzc();
        if (this.zzt.zzf().zzs(null, zzeg.zzak) && !contentValues.containsKey(s6)) {
            contentValues.put(s6, (String) null);
        }
        try {
            SQLiteDatabase zzh2 = zzh();
            if (zzh2.update(s5, contentValues, ProtectedSandApp.s("⼥"), new String[]{zzv}) == 0 && zzh2.insertWithOnConflict(s5, null, contentValues, 5) == -1) {
                this.zzt.zzaA().zzd().zzb(ProtectedSandApp.s("⼦"), zzet.zzn(zzv));
            }
        } catch (SQLiteException e6) {
            this.zzt.zzaA().zzd().zzc(ProtectedSandApp.s("⼧"), zzet.zzn(zzv), e6);
        }
    }

    @n1
    public final void zzE(zzaq zzaqVar) {
        Preconditions.checkNotNull(zzaqVar);
        zzg();
        zzW();
        ContentValues contentValues = new ContentValues();
        contentValues.put(ProtectedSandApp.s("⼨"), zzaqVar.zza);
        contentValues.put(ProtectedSandApp.s("⼩"), zzaqVar.zzb);
        contentValues.put(ProtectedSandApp.s("⼪"), Long.valueOf(zzaqVar.zzc));
        contentValues.put(ProtectedSandApp.s("⼫"), Long.valueOf(zzaqVar.zzd));
        contentValues.put(ProtectedSandApp.s("⼬"), Long.valueOf(zzaqVar.zzf));
        contentValues.put(ProtectedSandApp.s("⼭"), Long.valueOf(zzaqVar.zzg));
        contentValues.put(ProtectedSandApp.s("⼮"), zzaqVar.zzh);
        contentValues.put(ProtectedSandApp.s("⼯"), zzaqVar.zzi);
        contentValues.put(ProtectedSandApp.s("⼰"), zzaqVar.zzj);
        contentValues.put(ProtectedSandApp.s("⼱"), Long.valueOf(zzaqVar.zze));
        Boolean bool = zzaqVar.zzk;
        contentValues.put(ProtectedSandApp.s("⼲"), (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (zzh().insertWithOnConflict(ProtectedSandApp.s("⼳"), null, contentValues, 5) == -1) {
                this.zzt.zzaA().zzd().zzb(ProtectedSandApp.s("⼴"), zzet.zzn(zzaqVar.zza));
            }
        } catch (SQLiteException e6) {
            this.zzt.zzaA().zzd().zzc(ProtectedSandApp.s("⼵"), zzet.zzn(zzaqVar.zza), e6);
        }
    }

    public final boolean zzF() {
        return zzZ(ProtectedSandApp.s("⼶"), null) != 0;
    }

    public final boolean zzG() {
        return zzZ(ProtectedSandApp.s("⼷"), null) != 0;
    }

    public final boolean zzH() {
        return zzZ(ProtectedSandApp.s("⼸"), null) != 0;
    }

    @m1
    protected final boolean zzI() {
        Context zzaw = this.zzt.zzaw();
        this.zzt.zzf();
        return zzaw.getDatabasePath(ProtectedSandApp.s("⼹")).exists();
    }

    public final boolean zzJ(String str, Long l5, long j5, com.google.android.gms.internal.measurement.zzft zzftVar) {
        zzg();
        zzW();
        Preconditions.checkNotNull(zzftVar);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(l5);
        byte[] zzbx = zzftVar.zzbx();
        this.zzt.zzaA().zzj().zzc(ProtectedSandApp.s("⼺"), this.zzt.zzj().zzd(str), Integer.valueOf(zzbx.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put(ProtectedSandApp.s("⼻"), str);
        contentValues.put(ProtectedSandApp.s("⼼"), l5);
        contentValues.put(ProtectedSandApp.s("⼽"), Long.valueOf(j5));
        contentValues.put(ProtectedSandApp.s("⼾"), zzbx);
        try {
            if (zzh().insertWithOnConflict(ProtectedSandApp.s("⼿"), null, contentValues, 5) != -1) {
                return true;
            }
            this.zzt.zzaA().zzd().zzb(ProtectedSandApp.s("⽀"), zzet.zzn(str));
            return false;
        } catch (SQLiteException e6) {
            this.zzt.zzaA().zzd().zzc(ProtectedSandApp.s("⽁"), zzet.zzn(str), e6);
            return false;
        }
    }

    @n1
    public final boolean zzK(zzac zzacVar) {
        Preconditions.checkNotNull(zzacVar);
        zzg();
        zzW();
        String str = zzacVar.zza;
        Preconditions.checkNotNull(str);
        if (zzp(str, zzacVar.zzc.zzb) == null) {
            long zzZ = zzZ(ProtectedSandApp.s("⽂"), new String[]{str});
            this.zzt.zzf();
            if (zzZ >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(ProtectedSandApp.s("⽃"), str);
        contentValues.put(ProtectedSandApp.s("⽄"), zzacVar.zzb);
        contentValues.put(ProtectedSandApp.s("⽅"), zzacVar.zzc.zzb);
        zzV(contentValues, ProtectedSandApp.s("⽆"), Preconditions.checkNotNull(zzacVar.zzc.zza()));
        contentValues.put(ProtectedSandApp.s("⽇"), Boolean.valueOf(zzacVar.zze));
        contentValues.put(ProtectedSandApp.s("⽈"), zzacVar.zzf);
        contentValues.put(ProtectedSandApp.s("⽉"), Long.valueOf(zzacVar.zzh));
        contentValues.put(ProtectedSandApp.s("⽊"), this.zzt.zzv().zzap(zzacVar.zzg));
        contentValues.put(ProtectedSandApp.s("⽋"), Long.valueOf(zzacVar.zzd));
        contentValues.put(ProtectedSandApp.s("⽌"), this.zzt.zzv().zzap(zzacVar.zzi));
        contentValues.put(ProtectedSandApp.s("⽍"), Long.valueOf(zzacVar.zzc.zzc));
        contentValues.put(ProtectedSandApp.s("⽎"), Long.valueOf(zzacVar.zzj));
        contentValues.put(ProtectedSandApp.s("⽏"), this.zzt.zzv().zzap(zzacVar.zzk));
        try {
            if (zzh().insertWithOnConflict(ProtectedSandApp.s("⽐"), null, contentValues, 5) == -1) {
                this.zzt.zzaA().zzd().zzb(ProtectedSandApp.s("⽑"), zzet.zzn(str));
            }
        } catch (SQLiteException e6) {
            this.zzt.zzaA().zzd().zzc(ProtectedSandApp.s("⽒"), zzet.zzn(str), e6);
        }
        return true;
    }

    @n1
    public final boolean zzL(zzlm zzlmVar) {
        Preconditions.checkNotNull(zzlmVar);
        zzg();
        zzW();
        if (zzp(zzlmVar.zza, zzlmVar.zzc) == null) {
            if (zzlp.zzak(zzlmVar.zzc)) {
                if (zzZ(ProtectedSandApp.s("⽓"), new String[]{zzlmVar.zza}) >= this.zzt.zzf().zzf(zzlmVar.zza, zzeg.zzG, 25, 100)) {
                    return false;
                }
            } else if (!ProtectedSandApp.s("⽔").equals(zzlmVar.zzc)) {
                long zzZ = zzZ(ProtectedSandApp.s("⽕"), new String[]{zzlmVar.zza, zzlmVar.zzb});
                this.zzt.zzf();
                if (zzZ >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(ProtectedSandApp.s("⽖"), zzlmVar.zza);
        contentValues.put(ProtectedSandApp.s("⽗"), zzlmVar.zzb);
        contentValues.put(ProtectedSandApp.s("⽘"), zzlmVar.zzc);
        contentValues.put(ProtectedSandApp.s("⽙"), Long.valueOf(zzlmVar.zzd));
        zzV(contentValues, ProtectedSandApp.s("⽚"), zzlmVar.zze);
        try {
            if (zzh().insertWithOnConflict(ProtectedSandApp.s("⽛"), null, contentValues, 5) == -1) {
                this.zzt.zzaA().zzd().zzb(ProtectedSandApp.s("⽜"), zzet.zzn(zzlmVar.zza));
            }
        } catch (SQLiteException e6) {
            this.zzt.zzaA().zzd().zzc(ProtectedSandApp.s("⽝"), zzet.zzn(zzlmVar.zza), e6);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0273  */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzU(java.lang.String r21, long r22, long r24, com.google.android.gms.measurement.internal.zzle r26) {
        /*
            Method dump skipped, instructions count: 631
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzak.zzU(java.lang.String, long, long, com.google.android.gms.measurement.internal.zzle):void");
    }

    @n1
    public final int zza(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzW();
        try {
            return zzh().delete(ProtectedSandApp.s("⽷"), ProtectedSandApp.s("⽸"), new String[]{str, str2});
        } catch (SQLiteException e6) {
            this.zzt.zzaA().zzd().zzd(ProtectedSandApp.s("⽹"), zzet.zzn(str), this.zzt.zzj().zzf(str2), e6);
            return 0;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzku
    protected final boolean zzb() {
        return false;
    }

    @n1
    @m1
    protected final long zzc(String str, String str2) {
        long j5;
        SQLiteException e6;
        String s5;
        ContentValues contentValues;
        Preconditions.checkNotEmpty(str);
        String s6 = ProtectedSandApp.s("⽺");
        Preconditions.checkNotEmpty(s6);
        zzg();
        zzW();
        SQLiteDatabase zzh2 = zzh();
        zzh2.beginTransaction();
        try {
            try {
                j5 = zzaa(ProtectedSandApp.s("⽻"), new String[]{str}, -1L);
                s5 = ProtectedSandApp.s("⽼");
                String s7 = ProtectedSandApp.s("⽽");
                if (j5 == -1) {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put(s7, str);
                    contentValues2.put(s6, (Integer) 0);
                    contentValues2.put(ProtectedSandApp.s("⽾"), (Integer) 0);
                    if (zzh2.insertWithOnConflict(s5, null, contentValues2, 5) == -1) {
                        this.zzt.zzaA().zzd().zzc(ProtectedSandApp.s("⽿"), zzet.zzn(str), s6);
                        return -1L;
                    }
                    j5 = 0;
                }
                try {
                    contentValues = new ContentValues();
                    contentValues.put(s7, str);
                    contentValues.put(s6, Long.valueOf(1 + j5));
                } catch (SQLiteException e7) {
                    e6 = e7;
                    this.zzt.zzaA().zzd().zzd(ProtectedSandApp.s("⾂"), zzet.zzn(str), s6, e6);
                    return j5;
                }
            } catch (SQLiteException e8) {
                j5 = 0;
                e6 = e8;
            }
            if (zzh2.update(s5, contentValues, ProtectedSandApp.s("⾀"), new String[]{str}) == 0) {
                this.zzt.zzaA().zzd().zzc(ProtectedSandApp.s("⾁"), zzet.zzn(str), s6);
                return -1L;
            }
            zzh2.setTransactionSuccessful();
            return j5;
        } finally {
            zzh2.endTransaction();
        }
    }

    @n1
    public final long zzd() {
        return zzaa(ProtectedSandApp.s("⾃"), null, 0L);
    }

    @n1
    public final long zze() {
        return zzaa(ProtectedSandApp.s("⾄"), null, 0L);
    }

    public final long zzf(String str) {
        Preconditions.checkNotEmpty(str);
        return zzaa(ProtectedSandApp.s("⾅"), new String[]{str}, 0L);
    }

    @n1
    @m1
    final SQLiteDatabase zzh() {
        zzg();
        try {
            return this.zzj.getWritableDatabase();
        } catch (SQLiteException e6) {
            this.zzt.zzaA().zzk().zzb(ProtectedSandApp.s("⾆"), e6);
            throw e6;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00e6: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:215), block:B:57:0x00e6 */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle zzi(java.lang.String r8) {
        /*
            r7 = this;
            r7.zzg()
            r7.zzW()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.zzh()     // Catch: java.lang.Throwable -> Lc8 android.database.sqlite.SQLiteException -> Lca
            java.lang.String r2 = "⾇"
            java.lang.String r2 = com.flashget.kidsdownloader.ProtectedSandApp.s(r2)     // Catch: java.lang.Throwable -> Lc8 android.database.sqlite.SQLiteException -> Lca
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> Lc8 android.database.sqlite.SQLiteException -> Lca
            r4 = 0
            r3[r4] = r8     // Catch: java.lang.Throwable -> Lc8 android.database.sqlite.SQLiteException -> Lca
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> Lc8 android.database.sqlite.SQLiteException -> Lca
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> Lc6 java.lang.Throwable -> Le5
            if (r2 != 0) goto L38
            com.google.android.gms.measurement.internal.zzgd r8 = r7.zzt     // Catch: android.database.sqlite.SQLiteException -> Lc6 java.lang.Throwable -> Le5
            com.google.android.gms.measurement.internal.zzet r8 = r8.zzaA()     // Catch: android.database.sqlite.SQLiteException -> Lc6 java.lang.Throwable -> Le5
            com.google.android.gms.measurement.internal.zzer r8 = r8.zzj()     // Catch: android.database.sqlite.SQLiteException -> Lc6 java.lang.Throwable -> Le5
            java.lang.String r2 = "⾈"
            java.lang.String r2 = com.flashget.kidsdownloader.ProtectedSandApp.s(r2)     // Catch: android.database.sqlite.SQLiteException -> Lc6 java.lang.Throwable -> Le5
            r8.zza(r2)     // Catch: android.database.sqlite.SQLiteException -> Lc6 java.lang.Throwable -> Le5
            r1.close()
            return r0
        L38:
            byte[] r2 = r1.getBlob(r4)     // Catch: android.database.sqlite.SQLiteException -> Lc6 java.lang.Throwable -> Le5
            com.google.android.gms.internal.measurement.zzfs r3 = com.google.android.gms.internal.measurement.zzft.zze()     // Catch: java.io.IOException -> Laa android.database.sqlite.SQLiteException -> Lc6 java.lang.Throwable -> Le5
            com.google.android.gms.internal.measurement.zzmh r2 = com.google.android.gms.measurement.internal.zzlj.zzm(r3, r2)     // Catch: java.io.IOException -> Laa android.database.sqlite.SQLiteException -> Lc6 java.lang.Throwable -> Le5
            com.google.android.gms.internal.measurement.zzfs r2 = (com.google.android.gms.internal.measurement.zzfs) r2     // Catch: java.io.IOException -> Laa android.database.sqlite.SQLiteException -> Lc6 java.lang.Throwable -> Le5
            com.google.android.gms.internal.measurement.zzlb r2 = r2.zzaD()     // Catch: java.io.IOException -> Laa android.database.sqlite.SQLiteException -> Lc6 java.lang.Throwable -> Le5
            com.google.android.gms.internal.measurement.zzft r2 = (com.google.android.gms.internal.measurement.zzft) r2     // Catch: java.io.IOException -> Laa android.database.sqlite.SQLiteException -> Lc6 java.lang.Throwable -> Le5
            com.google.android.gms.measurement.internal.zzlh r8 = r7.zzf     // Catch: android.database.sqlite.SQLiteException -> Lc6 java.lang.Throwable -> Le5
            r8.zzu()     // Catch: android.database.sqlite.SQLiteException -> Lc6 java.lang.Throwable -> Le5
            java.util.List r8 = r2.zzi()     // Catch: android.database.sqlite.SQLiteException -> Lc6 java.lang.Throwable -> Le5
            android.os.Bundle r2 = new android.os.Bundle     // Catch: android.database.sqlite.SQLiteException -> Lc6 java.lang.Throwable -> Le5
            r2.<init>()     // Catch: android.database.sqlite.SQLiteException -> Lc6 java.lang.Throwable -> Le5
            java.util.Iterator r8 = r8.iterator()     // Catch: android.database.sqlite.SQLiteException -> Lc6 java.lang.Throwable -> Le5
        L5e:
            boolean r3 = r8.hasNext()     // Catch: android.database.sqlite.SQLiteException -> Lc6 java.lang.Throwable -> Le5
            if (r3 == 0) goto La6
            java.lang.Object r3 = r8.next()     // Catch: android.database.sqlite.SQLiteException -> Lc6 java.lang.Throwable -> Le5
            com.google.android.gms.internal.measurement.zzfx r3 = (com.google.android.gms.internal.measurement.zzfx) r3     // Catch: android.database.sqlite.SQLiteException -> Lc6 java.lang.Throwable -> Le5
            java.lang.String r4 = r3.zzg()     // Catch: android.database.sqlite.SQLiteException -> Lc6 java.lang.Throwable -> Le5
            boolean r5 = r3.zzu()     // Catch: android.database.sqlite.SQLiteException -> Lc6 java.lang.Throwable -> Le5
            if (r5 == 0) goto L7c
            double r5 = r3.zza()     // Catch: android.database.sqlite.SQLiteException -> Lc6 java.lang.Throwable -> Le5
            r2.putDouble(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> Lc6 java.lang.Throwable -> Le5
            goto L5e
        L7c:
            boolean r5 = r3.zzv()     // Catch: android.database.sqlite.SQLiteException -> Lc6 java.lang.Throwable -> Le5
            if (r5 == 0) goto L8a
            float r3 = r3.zzb()     // Catch: android.database.sqlite.SQLiteException -> Lc6 java.lang.Throwable -> Le5
            r2.putFloat(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> Lc6 java.lang.Throwable -> Le5
            goto L5e
        L8a:
            boolean r5 = r3.zzy()     // Catch: android.database.sqlite.SQLiteException -> Lc6 java.lang.Throwable -> Le5
            if (r5 == 0) goto L98
            java.lang.String r3 = r3.zzh()     // Catch: android.database.sqlite.SQLiteException -> Lc6 java.lang.Throwable -> Le5
            r2.putString(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> Lc6 java.lang.Throwable -> Le5
            goto L5e
        L98:
            boolean r5 = r3.zzw()     // Catch: android.database.sqlite.SQLiteException -> Lc6 java.lang.Throwable -> Le5
            if (r5 == 0) goto L5e
            long r5 = r3.zzd()     // Catch: android.database.sqlite.SQLiteException -> Lc6 java.lang.Throwable -> Le5
            r2.putLong(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> Lc6 java.lang.Throwable -> Le5
            goto L5e
        La6:
            r1.close()
            return r2
        Laa:
            r2 = move-exception
            com.google.android.gms.measurement.internal.zzgd r3 = r7.zzt     // Catch: android.database.sqlite.SQLiteException -> Lc6 java.lang.Throwable -> Le5
            com.google.android.gms.measurement.internal.zzet r3 = r3.zzaA()     // Catch: android.database.sqlite.SQLiteException -> Lc6 java.lang.Throwable -> Le5
            com.google.android.gms.measurement.internal.zzer r3 = r3.zzd()     // Catch: android.database.sqlite.SQLiteException -> Lc6 java.lang.Throwable -> Le5
            java.lang.String r4 = "⾉"
            java.lang.String r4 = com.flashget.kidsdownloader.ProtectedSandApp.s(r4)     // Catch: android.database.sqlite.SQLiteException -> Lc6 java.lang.Throwable -> Le5
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzet.zzn(r8)     // Catch: android.database.sqlite.SQLiteException -> Lc6 java.lang.Throwable -> Le5
            r3.zzc(r4, r8, r2)     // Catch: android.database.sqlite.SQLiteException -> Lc6 java.lang.Throwable -> Le5
            r1.close()
            return r0
        Lc6:
            r8 = move-exception
            goto Lcc
        Lc8:
            r8 = move-exception
            goto Le7
        Lca:
            r8 = move-exception
            r1 = r0
        Lcc:
            com.google.android.gms.measurement.internal.zzgd r2 = r7.zzt     // Catch: java.lang.Throwable -> Le5
            com.google.android.gms.measurement.internal.zzet r2 = r2.zzaA()     // Catch: java.lang.Throwable -> Le5
            com.google.android.gms.measurement.internal.zzer r2 = r2.zzd()     // Catch: java.lang.Throwable -> Le5
            java.lang.String r3 = "⾊"
            java.lang.String r3 = com.flashget.kidsdownloader.ProtectedSandApp.s(r3)     // Catch: java.lang.Throwable -> Le5
            r2.zzb(r3, r8)     // Catch: java.lang.Throwable -> Le5
            if (r1 == 0) goto Le4
            r1.close()
        Le4:
            return r0
        Le5:
            r8 = move-exception
            r0 = r1
        Le7:
            if (r0 == 0) goto Lec
            r0.close()
        Lec:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzak.zzi(java.lang.String):android.os.Bundle");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x020f A[Catch: SQLiteException -> 0x02c6, all -> 0x02e9, TryCatch #1 {SQLiteException -> 0x02c6, blocks: (B:5:0x00ef, B:10:0x00f9, B:12:0x015c, B:16:0x0166, B:19:0x01b0, B:21:0x01df, B:25:0x01e9, B:28:0x0204, B:30:0x020f, B:31:0x0225, B:33:0x0236, B:35:0x024d, B:37:0x025e, B:39:0x0266, B:42:0x026e, B:44:0x0271, B:46:0x0282, B:47:0x028b, B:49:0x0299, B:50:0x02a2, B:52:0x02ab, B:56:0x0244, B:57:0x0200, B:59:0x01ab), top: B:4:0x00ef }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0236 A[Catch: SQLiteException -> 0x02c6, all -> 0x02e9, TryCatch #1 {SQLiteException -> 0x02c6, blocks: (B:5:0x00ef, B:10:0x00f9, B:12:0x015c, B:16:0x0166, B:19:0x01b0, B:21:0x01df, B:25:0x01e9, B:28:0x0204, B:30:0x020f, B:31:0x0225, B:33:0x0236, B:35:0x024d, B:37:0x025e, B:39:0x0266, B:42:0x026e, B:44:0x0271, B:46:0x0282, B:47:0x028b, B:49:0x0299, B:50:0x02a2, B:52:0x02ab, B:56:0x0244, B:57:0x0200, B:59:0x01ab), top: B:4:0x00ef }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x025e A[Catch: SQLiteException -> 0x02c6, all -> 0x02e9, TryCatch #1 {SQLiteException -> 0x02c6, blocks: (B:5:0x00ef, B:10:0x00f9, B:12:0x015c, B:16:0x0166, B:19:0x01b0, B:21:0x01df, B:25:0x01e9, B:28:0x0204, B:30:0x020f, B:31:0x0225, B:33:0x0236, B:35:0x024d, B:37:0x025e, B:39:0x0266, B:42:0x026e, B:44:0x0271, B:46:0x0282, B:47:0x028b, B:49:0x0299, B:50:0x02a2, B:52:0x02ab, B:56:0x0244, B:57:0x0200, B:59:0x01ab), top: B:4:0x00ef }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0282 A[Catch: SQLiteException -> 0x02c6, all -> 0x02e9, TryCatch #1 {SQLiteException -> 0x02c6, blocks: (B:5:0x00ef, B:10:0x00f9, B:12:0x015c, B:16:0x0166, B:19:0x01b0, B:21:0x01df, B:25:0x01e9, B:28:0x0204, B:30:0x020f, B:31:0x0225, B:33:0x0236, B:35:0x024d, B:37:0x025e, B:39:0x0266, B:42:0x026e, B:44:0x0271, B:46:0x0282, B:47:0x028b, B:49:0x0299, B:50:0x02a2, B:52:0x02ab, B:56:0x0244, B:57:0x0200, B:59:0x01ab), top: B:4:0x00ef }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0299 A[Catch: SQLiteException -> 0x02c6, all -> 0x02e9, TryCatch #1 {SQLiteException -> 0x02c6, blocks: (B:5:0x00ef, B:10:0x00f9, B:12:0x015c, B:16:0x0166, B:19:0x01b0, B:21:0x01df, B:25:0x01e9, B:28:0x0204, B:30:0x020f, B:31:0x0225, B:33:0x0236, B:35:0x024d, B:37:0x025e, B:39:0x0266, B:42:0x026e, B:44:0x0271, B:46:0x0282, B:47:0x028b, B:49:0x0299, B:50:0x02a2, B:52:0x02ab, B:56:0x0244, B:57:0x0200, B:59:0x01ab), top: B:4:0x00ef }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02ab A[Catch: SQLiteException -> 0x02c6, all -> 0x02e9, TRY_LEAVE, TryCatch #1 {SQLiteException -> 0x02c6, blocks: (B:5:0x00ef, B:10:0x00f9, B:12:0x015c, B:16:0x0166, B:19:0x01b0, B:21:0x01df, B:25:0x01e9, B:28:0x0204, B:30:0x020f, B:31:0x0225, B:33:0x0236, B:35:0x024d, B:37:0x025e, B:39:0x0266, B:42:0x026e, B:44:0x0271, B:46:0x0282, B:47:0x028b, B:49:0x0299, B:50:0x02a2, B:52:0x02ab, B:56:0x0244, B:57:0x0200, B:59:0x01ab), top: B:4:0x00ef }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0200 A[Catch: SQLiteException -> 0x02c6, all -> 0x02e9, TryCatch #1 {SQLiteException -> 0x02c6, blocks: (B:5:0x00ef, B:10:0x00f9, B:12:0x015c, B:16:0x0166, B:19:0x01b0, B:21:0x01df, B:25:0x01e9, B:28:0x0204, B:30:0x020f, B:31:0x0225, B:33:0x0236, B:35:0x024d, B:37:0x025e, B:39:0x0266, B:42:0x026e, B:44:0x0271, B:46:0x0282, B:47:0x028b, B:49:0x0299, B:50:0x02a2, B:52:0x02ab, B:56:0x0244, B:57:0x0200, B:59:0x01ab), top: B:4:0x00ef }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ab A[Catch: SQLiteException -> 0x02c6, all -> 0x02e9, TryCatch #1 {SQLiteException -> 0x02c6, blocks: (B:5:0x00ef, B:10:0x00f9, B:12:0x015c, B:16:0x0166, B:19:0x01b0, B:21:0x01df, B:25:0x01e9, B:28:0x0204, B:30:0x020f, B:31:0x0225, B:33:0x0236, B:35:0x024d, B:37:0x025e, B:39:0x0266, B:42:0x026e, B:44:0x0271, B:46:0x0282, B:47:0x028b, B:49:0x0299, B:50:0x02a2, B:52:0x02ab, B:56:0x0244, B:57:0x0200, B:59:0x01ab), top: B:4:0x00ef }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02ed  */
    @androidx.annotation.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzh zzj(java.lang.String r39) {
        /*
            Method dump skipped, instructions count: 753
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzak.zzj(java.lang.String):com.google.android.gms.measurement.internal.zzh");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0162  */
    @androidx.annotation.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzac zzk(java.lang.String r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzak.zzk(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzac");
    }

    @n1
    public final zzai zzl(long j5, String str, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        return zzm(j5, str, 1L, false, false, z7, false, z9);
    }

    @n1
    public final zzai zzm(long j5, String str, long j6, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        String[] strArr = {str};
        zzai zzaiVar = new zzai();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase zzh2 = zzh();
                Cursor query = zzh2.query(ProtectedSandApp.s("⾿"), new String[]{ProtectedSandApp.s("⿀"), ProtectedSandApp.s("⿁"), ProtectedSandApp.s("⿂"), ProtectedSandApp.s("⿃"), ProtectedSandApp.s("⿄"), ProtectedSandApp.s("⿅")}, ProtectedSandApp.s("⿆"), new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    this.zzt.zzaA().zzk().zzb(ProtectedSandApp.s("⿇"), zzet.zzn(str));
                    query.close();
                    return zzaiVar;
                }
                if (query.getLong(0) == j5) {
                    zzaiVar.zzb = query.getLong(1);
                    zzaiVar.zza = query.getLong(2);
                    zzaiVar.zzc = query.getLong(3);
                    zzaiVar.zzd = query.getLong(4);
                    zzaiVar.zze = query.getLong(5);
                }
                if (z5) {
                    zzaiVar.zzb += j6;
                }
                if (z6) {
                    zzaiVar.zza += j6;
                }
                if (z7) {
                    zzaiVar.zzc += j6;
                }
                if (z8) {
                    zzaiVar.zzd += j6;
                }
                if (z9) {
                    zzaiVar.zze += j6;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put(ProtectedSandApp.s("⿈"), Long.valueOf(j5));
                contentValues.put(ProtectedSandApp.s("⿉"), Long.valueOf(zzaiVar.zza));
                contentValues.put(ProtectedSandApp.s("⿊"), Long.valueOf(zzaiVar.zzb));
                contentValues.put(ProtectedSandApp.s("⿋"), Long.valueOf(zzaiVar.zzc));
                contentValues.put(ProtectedSandApp.s("⿌"), Long.valueOf(zzaiVar.zzd));
                contentValues.put(ProtectedSandApp.s("⿍"), Long.valueOf(zzaiVar.zze));
                zzh2.update(ProtectedSandApp.s("⿎"), contentValues, ProtectedSandApp.s("⿏"), strArr);
                query.close();
                return zzaiVar;
            } catch (SQLiteException e6) {
                this.zzt.zzaA().zzd().zzc(ProtectedSandApp.s("⿐"), zzet.zzn(str), e6);
                if (0 != 0) {
                    cursor.close();
                }
                return zzaiVar;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0184  */
    @androidx.annotation.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzaq zzn(java.lang.String r28, java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzak.zzn(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzaq");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c2  */
    @androidx.annotation.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzlm zzp(java.lang.String r20, java.lang.String r21) {
        /*
            r19 = this;
            r1 = r19
            r9 = r21
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r20)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r21)
            r19.zzg()
            r19.zzW()
            r10 = 0
            android.database.sqlite.SQLiteDatabase r11 = r19.zzh()     // Catch: java.lang.Throwable -> L93 android.database.sqlite.SQLiteException -> L95
            java.lang.String r12 = "\u2fde"
            java.lang.String r12 = com.flashget.kidsdownloader.ProtectedSandApp.s(r12)     // Catch: java.lang.Throwable -> L93 android.database.sqlite.SQLiteException -> L95
            java.lang.String r0 = "\u2fdf"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)     // Catch: java.lang.Throwable -> L93 android.database.sqlite.SQLiteException -> L95
            java.lang.String r2 = "\u2fe0"
            java.lang.String r2 = com.flashget.kidsdownloader.ProtectedSandApp.s(r2)     // Catch: java.lang.Throwable -> L93 android.database.sqlite.SQLiteException -> L95
            java.lang.String r3 = "\u2fe1"
            java.lang.String r3 = com.flashget.kidsdownloader.ProtectedSandApp.s(r3)     // Catch: java.lang.Throwable -> L93 android.database.sqlite.SQLiteException -> L95
            java.lang.String[] r13 = new java.lang.String[]{r0, r2, r3}     // Catch: java.lang.Throwable -> L93 android.database.sqlite.SQLiteException -> L95
            java.lang.String r14 = "\u2fe2"
            java.lang.String r14 = com.flashget.kidsdownloader.ProtectedSandApp.s(r14)     // Catch: java.lang.Throwable -> L93 android.database.sqlite.SQLiteException -> L95
            r0 = 2
            java.lang.String[] r15 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L93 android.database.sqlite.SQLiteException -> L95
            r2 = 0
            r15[r2] = r20     // Catch: java.lang.Throwable -> L93 android.database.sqlite.SQLiteException -> L95
            r3 = 1
            r15[r3] = r9     // Catch: java.lang.Throwable -> L93 android.database.sqlite.SQLiteException -> L95
            r16 = 0
            r17 = 0
            r18 = 0
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> L93 android.database.sqlite.SQLiteException -> L95
            boolean r4 = r11.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L91 java.lang.Throwable -> Lbe
            if (r4 != 0) goto L54
            r11.close()
            return r10
        L54:
            long r6 = r11.getLong(r2)     // Catch: android.database.sqlite.SQLiteException -> L91 java.lang.Throwable -> Lbe
            java.lang.Object r8 = r1.zzq(r11, r3)     // Catch: android.database.sqlite.SQLiteException -> L91 java.lang.Throwable -> Lbe
            if (r8 != 0) goto L62
            r11.close()
            return r10
        L62:
            java.lang.String r4 = r11.getString(r0)     // Catch: android.database.sqlite.SQLiteException -> L91 java.lang.Throwable -> Lbe
            com.google.android.gms.measurement.internal.zzlm r0 = new com.google.android.gms.measurement.internal.zzlm     // Catch: android.database.sqlite.SQLiteException -> L91 java.lang.Throwable -> Lbe
            r2 = r0
            r3 = r20
            r5 = r21
            r2.<init>(r3, r4, r5, r6, r8)     // Catch: android.database.sqlite.SQLiteException -> L91 java.lang.Throwable -> Lbe
            boolean r2 = r11.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L91 java.lang.Throwable -> Lbe
            if (r2 == 0) goto L8d
            com.google.android.gms.measurement.internal.zzgd r2 = r1.zzt     // Catch: android.database.sqlite.SQLiteException -> L91 java.lang.Throwable -> Lbe
            com.google.android.gms.measurement.internal.zzet r2 = r2.zzaA()     // Catch: android.database.sqlite.SQLiteException -> L91 java.lang.Throwable -> Lbe
            com.google.android.gms.measurement.internal.zzer r2 = r2.zzd()     // Catch: android.database.sqlite.SQLiteException -> L91 java.lang.Throwable -> Lbe
            java.lang.String r3 = "\u2fe3"
            java.lang.String r3 = com.flashget.kidsdownloader.ProtectedSandApp.s(r3)     // Catch: android.database.sqlite.SQLiteException -> L91 java.lang.Throwable -> Lbe
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzet.zzn(r20)     // Catch: android.database.sqlite.SQLiteException -> L91 java.lang.Throwable -> Lbe
            r2.zzb(r3, r4)     // Catch: android.database.sqlite.SQLiteException -> L91 java.lang.Throwable -> Lbe
        L8d:
            r11.close()
            return r0
        L91:
            r0 = move-exception
            goto L97
        L93:
            r0 = move-exception
            goto Lc0
        L95:
            r0 = move-exception
            r11 = r10
        L97:
            com.google.android.gms.measurement.internal.zzgd r2 = r1.zzt     // Catch: java.lang.Throwable -> Lbe
            com.google.android.gms.measurement.internal.zzet r2 = r2.zzaA()     // Catch: java.lang.Throwable -> Lbe
            com.google.android.gms.measurement.internal.zzer r2 = r2.zzd()     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r3 = "\u2fe4"
            java.lang.String r3 = com.flashget.kidsdownloader.ProtectedSandApp.s(r3)     // Catch: java.lang.Throwable -> Lbe
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzet.zzn(r20)     // Catch: java.lang.Throwable -> Lbe
            com.google.android.gms.measurement.internal.zzgd r5 = r1.zzt     // Catch: java.lang.Throwable -> Lbe
            com.google.android.gms.measurement.internal.zzeo r5 = r5.zzj()     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r5 = r5.zzf(r9)     // Catch: java.lang.Throwable -> Lbe
            r2.zzd(r3, r4, r5, r0)     // Catch: java.lang.Throwable -> Lbe
            if (r11 == 0) goto Lbd
            r11.close()
        Lbd:
            return r10
        Lbe:
            r0 = move-exception
            r10 = r11
        Lc0:
            if (r10 == 0) goto Lc5
            r10.close()
        Lc5:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzak.zzp(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzlm");
    }

    @n1
    @m1
    final Object zzq(Cursor cursor, int i5) {
        int type = cursor.getType(i5);
        if (type == 0) {
            a.a(this.zzt, ProtectedSandApp.s("\u2fe7"));
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i5));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i5));
        }
        if (type == 3) {
            return cursor.getString(i5);
        }
        if (type == 4) {
            a.a(this.zzt, ProtectedSandApp.s("\u2fe6"));
            return null;
        }
        this.zzt.zzaA().zzd().zzb(ProtectedSandApp.s("\u2fe5"), Integer.valueOf(type));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    @androidx.annotation.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String zzr() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.zzh()
            r1 = 0
            java.lang.String r2 = "\u2fe8"
            java.lang.String r2 = com.flashget.kidsdownloader.ProtectedSandApp.s(r2)     // Catch: java.lang.Throwable -> L24 android.database.sqlite.SQLiteException -> L26
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L24 android.database.sqlite.SQLiteException -> L26
            boolean r2 = r0.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L22 java.lang.Throwable -> L42
            if (r2 == 0) goto L1e
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L22 java.lang.Throwable -> L42
            r0.close()
            return r1
        L1e:
            r0.close()
            return r1
        L22:
            r2 = move-exception
            goto L29
        L24:
            r0 = move-exception
            goto L46
        L26:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L29:
            com.google.android.gms.measurement.internal.zzgd r3 = r6.zzt     // Catch: java.lang.Throwable -> L42
            com.google.android.gms.measurement.internal.zzet r3 = r3.zzaA()     // Catch: java.lang.Throwable -> L42
            com.google.android.gms.measurement.internal.zzer r3 = r3.zzd()     // Catch: java.lang.Throwable -> L42
            java.lang.String r4 = "\u2fe9"
            java.lang.String r4 = com.flashget.kidsdownloader.ProtectedSandApp.s(r4)     // Catch: java.lang.Throwable -> L42
            r3.zzb(r4, r2)     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L41
            r0.close()
        L41:
            return r1
        L42:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L46:
            if (r1 == 0) goto L4b
            r1.close()
        L4b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzak.zzr():java.lang.String");
    }

    @n1
    public final List zzs(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("\u2fea"));
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(ProtectedSandApp.s("\u2feb"));
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat(ProtectedSandApp.s("\u2fec")));
            sb.append(ProtectedSandApp.s("\u2fed"));
        }
        return zzt(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0098, code lost:
    
        r2 = r27.zzt.zzaA().zzd();
        r4 = com.flashget.kidsdownloader.ProtectedSandApp.s("\u2ffe");
        r27.zzt.zzf();
        r2.zzb(r4, 1000);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List zzt(java.lang.String r28, java.lang.String[] r29) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzak.zzt(java.lang.String, java.lang.String[]):java.util.List");
    }

    @n1
    public final List zzu(String str) {
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        ArrayList arrayList = new ArrayList();
        String s5 = ProtectedSandApp.s("\u3000");
        Cursor cursor = null;
        try {
            try {
                String s6 = ProtectedSandApp.s("〇");
                this.zzt.zzf();
                cursor = zzh().query(ProtectedSandApp.s("、"), new String[]{ProtectedSandApp.s("。"), ProtectedSandApp.s("〃"), ProtectedSandApp.s("〄"), ProtectedSandApp.s("々")}, ProtectedSandApp.s("〆"), new String[]{str}, null, null, s6, s5);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return arrayList;
                }
                do {
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j5 = cursor.getLong(2);
                    Object zzq = zzq(cursor, 3);
                    if (zzq == null) {
                        this.zzt.zzaA().zzd().zzb(ProtectedSandApp.s("〈"), zzet.zzn(str));
                    } else {
                        arrayList.add(new zzlm(str, str2, string, j5, zzq));
                    }
                } while (cursor.moveToNext());
                cursor.close();
                return arrayList;
            } catch (SQLiteException e6) {
                this.zzt.zzaA().zzd().zzc(ProtectedSandApp.s("〉"), zzet.zzn(str), e6);
                List emptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyList;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d3, code lost:
    
        r0 = r17.zzt.zzaA().zzd();
        r3 = com.flashget.kidsdownloader.ProtectedSandApp.s("〕");
        r17.zzt.zzf();
        r0.zzb(r3, 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x015b A[DONT_GENERATE] */
    @androidx.annotation.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List zzv(java.lang.String r18, java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzak.zzv(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    @n1
    public final void zzw() {
        zzW();
        zzh().beginTransaction();
    }

    @n1
    public final void zzx() {
        zzW();
        zzh().endTransaction();
    }

    @n1
    @m1
    final void zzy(List list) {
        String s5 = ProtectedSandApp.s("〘");
        zzg();
        zzW();
        Preconditions.checkNotNull(list);
        Preconditions.checkNotZero(list.size());
        if (zzI()) {
            String a6 = e.a(ProtectedSandApp.s("〚"), TextUtils.join(ProtectedSandApp.s("〙"), list), ProtectedSandApp.s("〛"));
            if (zzZ(e.a(ProtectedSandApp.s("〜"), a6, ProtectedSandApp.s("〝")), null) > 0) {
                b.a(this.zzt, ProtectedSandApp.s("〞"));
            }
            try {
                zzh().execSQL(s5 + a6 + ProtectedSandApp.s("〟"));
            } catch (SQLiteException e6) {
                this.zzt.zzaA().zzd().zzb(ProtectedSandApp.s("〠"), e6);
            }
        }
    }

    @n1
    final void zzz() {
        zzg();
        zzW();
        if (zzI()) {
            long zza2 = this.zzf.zzs().zza.zza();
            long elapsedRealtime = this.zzt.zzax().elapsedRealtime();
            long abs = Math.abs(elapsedRealtime - zza2);
            this.zzt.zzf();
            if (abs > ((Long) zzeg.zzy.zza(null)).longValue()) {
                this.zzf.zzs().zza.zzb(elapsedRealtime);
                zzg();
                zzW();
                if (zzI()) {
                    SQLiteDatabase zzh2 = zzh();
                    this.zzt.zzf();
                    int delete = zzh2.delete(ProtectedSandApp.s("〡"), ProtectedSandApp.s("〢"), new String[]{String.valueOf(this.zzt.zzax().currentTimeMillis()), String.valueOf(zzag.zzA())});
                    if (delete > 0) {
                        this.zzt.zzaA().zzj().zzb(ProtectedSandApp.s("〣"), Integer.valueOf(delete));
                    }
                }
            }
        }
    }
}
