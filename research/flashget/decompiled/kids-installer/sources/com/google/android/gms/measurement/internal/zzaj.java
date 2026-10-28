package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.m1;
import androidx.annotation.n1;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
@m1
/* loaded from: classes2.dex */
final class zzaj extends SQLiteOpenHelper {
    final /* synthetic */ zzak zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzaj(zzak zzakVar, Context context, String str) {
        super(context, ProtectedSandApp.s("າ"), (SQLiteDatabase.CursorFactory) null, 1);
        this.zza = zzakVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @n1
    public final SQLiteDatabase getWritableDatabase() {
        zzkq zzkqVar;
        zzkq zzkqVar2;
        zzkq zzkqVar3;
        zzak zzakVar = this.zza;
        zzkqVar = zzakVar.zzk;
        zzakVar.zzt.zzf();
        if (!zzkqVar.zzc(3600000L)) {
            throw new SQLiteException(ProtectedSandApp.s("ື"));
        }
        try {
            return super.getWritableDatabase();
        } catch (SQLiteException unused) {
            zzkqVar2 = this.zza.zzk;
            zzkqVar2.zzb();
            a.a(this.zza.zzt, ProtectedSandApp.s("ຳ"));
            this.zza.zzt.zzf();
            Context zzaw = this.zza.zzt.zzaw();
            String s5 = ProtectedSandApp.s("ິ");
            if (!zzaw.getDatabasePath(s5).delete()) {
                this.zza.zzt.zzaA().zzd().zzb(ProtectedSandApp.s("ີ"), s5);
            }
            try {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                zzkqVar3 = this.zza.zzk;
                zzkqVar3.zza();
                return writableDatabase;
            } catch (SQLiteException e6) {
                this.zza.zzt.zzaA().zzd().zzb(ProtectedSandApp.s("ຶ"), e6);
                throw e6;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @n1
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        zzal.zzb(this.zza.zzt.zzaA(), sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @n1
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i5, int i6) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @n1
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        String[] strArr5;
        String[] strArr6;
        String[] strArr7;
        String[] strArr8;
        zzet zzaA = this.zza.zzt.zzaA();
        String s5 = ProtectedSandApp.s("ຸ");
        String s6 = ProtectedSandApp.s("ູ");
        String s7 = ProtectedSandApp.s("຺");
        strArr = zzak.zza;
        zzal.zza(zzaA, sQLiteDatabase, s5, s6, s7, strArr);
        zzal.zza(this.zza.zzt.zzaA(), sQLiteDatabase, ProtectedSandApp.s("ົ"), ProtectedSandApp.s("ຼ"), ProtectedSandApp.s("ຽ"), null);
        zzet zzaA2 = this.zza.zzt.zzaA();
        String s8 = ProtectedSandApp.s("\u0ebe");
        String s9 = ProtectedSandApp.s("\u0ebf");
        String s10 = ProtectedSandApp.s("ເ");
        strArr2 = zzak.zzb;
        zzal.zza(zzaA2, sQLiteDatabase, s8, s9, s10, strArr2);
        zzet zzaA3 = this.zza.zzt.zzaA();
        String s11 = ProtectedSandApp.s("ແ");
        String s12 = ProtectedSandApp.s("ໂ");
        String s13 = ProtectedSandApp.s("ໃ");
        strArr3 = zzak.zzc;
        zzal.zza(zzaA3, sQLiteDatabase, s11, s12, s13, strArr3);
        zzet zzaA4 = this.zza.zzt.zzaA();
        String s14 = ProtectedSandApp.s("ໄ");
        String s15 = ProtectedSandApp.s("\u0ec5");
        String s16 = ProtectedSandApp.s("ໆ");
        strArr4 = zzak.zze;
        zzal.zza(zzaA4, sQLiteDatabase, s14, s15, s16, strArr4);
        zzal.zza(this.zza.zzt.zzaA(), sQLiteDatabase, ProtectedSandApp.s("\u0ec7"), ProtectedSandApp.s("່"), ProtectedSandApp.s("້"), null);
        zzet zzaA5 = this.zza.zzt.zzaA();
        String s17 = ProtectedSandApp.s("໊");
        String s18 = ProtectedSandApp.s("໋");
        String s19 = ProtectedSandApp.s("໌");
        strArr5 = zzak.zzd;
        zzal.zza(zzaA5, sQLiteDatabase, s17, s18, s19, strArr5);
        zzet zzaA6 = this.zza.zzt.zzaA();
        String s20 = ProtectedSandApp.s("ໍ");
        String s21 = ProtectedSandApp.s("໎");
        String s22 = ProtectedSandApp.s("\u0ecf");
        strArr6 = zzak.zzg;
        zzal.zza(zzaA6, sQLiteDatabase, s20, s21, s22, strArr6);
        zzet zzaA7 = this.zza.zzt.zzaA();
        String s23 = ProtectedSandApp.s("໐");
        String s24 = ProtectedSandApp.s("໑");
        String s25 = ProtectedSandApp.s("໒");
        strArr7 = zzak.zzh;
        zzal.zza(zzaA7, sQLiteDatabase, s23, s24, s25, strArr7);
        zzal.zza(this.zza.zzt.zzaA(), sQLiteDatabase, ProtectedSandApp.s("໓"), ProtectedSandApp.s("໔"), ProtectedSandApp.s("໕"), null);
        zzet zzaA8 = this.zza.zzt.zzaA();
        String s26 = ProtectedSandApp.s("໖");
        String s27 = ProtectedSandApp.s("໗");
        String s28 = ProtectedSandApp.s("໘");
        strArr8 = zzak.zzi;
        zzal.zza(zzaA8, sQLiteDatabase, s26, s27, s28, strArr8);
        zzal.zza(this.zza.zzt.zzaA(), sQLiteDatabase, ProtectedSandApp.s("໙"), ProtectedSandApp.s("\u0eda"), ProtectedSandApp.s("\u0edb"), null);
        zzal.zza(this.zza.zzt.zzaA(), sQLiteDatabase, ProtectedSandApp.s("ໜ"), ProtectedSandApp.s("ໝ"), ProtectedSandApp.s("ໞ"), null);
        zzal.zza(this.zza.zzt.zzaA(), sQLiteDatabase, ProtectedSandApp.s("ໟ"), ProtectedSandApp.s("\u0ee0"), ProtectedSandApp.s("\u0ee1"), null);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @n1
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i5, int i6) {
    }
}
