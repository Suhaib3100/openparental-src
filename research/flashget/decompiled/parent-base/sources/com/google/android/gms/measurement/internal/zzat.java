package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import androidx.annotation.m1;
import androidx.annotation.n1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.internal.measurement.zzpn;
import org.apache.commons.lang3.time.e;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
@m1
/* loaded from: classes5.dex */
final class zzat extends com.google.android.gms.internal.measurement.zzck {
    private final /* synthetic */ zzal zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzat(zzal zzalVar, Context context, String str) {
        super(context, str, null, 1);
        this.zza = zzalVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @n1
    public final SQLiteDatabase getWritableDatabase() {
        zznl zznlVar;
        zznl zznlVar2;
        zznl zznlVar3;
        zznlVar = this.zza.zzm;
        if (!zznlVar.zza(e.f86241c)) {
            throw new SQLiteException(ProtectedSandApp.s("\udd11"));
        }
        try {
            return super.getWritableDatabase();
        } catch (SQLiteException unused) {
            zznlVar2 = this.zza.zzm;
            zznlVar2.zzb();
            this.zza.zzj().zzg().zza(ProtectedSandApp.s("\udd0d"));
            Context zza = this.zza.zza();
            String s4 = ProtectedSandApp.s("\udd0e");
            if (!zza.getDatabasePath(s4).delete()) {
                this.zza.zzj().zzg().zza(ProtectedSandApp.s("\udd0f"), s4);
            }
            try {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                zznlVar3 = this.zza.zzm;
                zznlVar3.zza();
                return writableDatabase;
            } catch (SQLiteException e4) {
                this.zza.zzj().zzg().zza(ProtectedSandApp.s("\udd10"), e4);
                throw e4;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @n1
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        zzaw.zza(this.zza.zzj(), sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @n1
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
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
        String[] strArr9;
        String[] strArr10;
        zzgo zzj = this.zza.zzj();
        String s4 = ProtectedSandApp.s("\udd12");
        strArr = zzal.zza;
        zzaw.zza(zzj, sQLiteDatabase, ProtectedSandApp.s("\udd13"), ProtectedSandApp.s("\udd14"), s4, strArr);
        zzaw.zza(this.zza.zzj(), sQLiteDatabase, ProtectedSandApp.s("\udd16"), ProtectedSandApp.s("\udd17"), ProtectedSandApp.s("\udd15"), null);
        zzaw.zza(this.zza.zzj(), sQLiteDatabase, ProtectedSandApp.s("\udd19"), ProtectedSandApp.s("\udd1a"), ProtectedSandApp.s("\udd18"), null);
        zzgo zzj2 = this.zza.zzj();
        String s5 = ProtectedSandApp.s("\udd1b");
        strArr2 = zzal.zzb;
        zzaw.zza(zzj2, sQLiteDatabase, ProtectedSandApp.s("\udd1c"), ProtectedSandApp.s("\udd1d"), s5, strArr2);
        zzgo zzj3 = this.zza.zzj();
        String s6 = ProtectedSandApp.s("\udd1e");
        strArr3 = zzal.zzc;
        zzaw.zza(zzj3, sQLiteDatabase, ProtectedSandApp.s("\udd1f"), ProtectedSandApp.s("\udd20"), s6, strArr3);
        zzgo zzj4 = this.zza.zzj();
        String s7 = ProtectedSandApp.s("\udd21");
        strArr4 = zzal.zze;
        zzaw.zza(zzj4, sQLiteDatabase, ProtectedSandApp.s("\udd22"), ProtectedSandApp.s("\udd23"), s7, strArr4);
        zzaw.zza(this.zza.zzj(), sQLiteDatabase, ProtectedSandApp.s("\udd25"), ProtectedSandApp.s("\udd26"), ProtectedSandApp.s("\udd24"), null);
        zzgo zzj5 = this.zza.zzj();
        String s10 = ProtectedSandApp.s("\udd27");
        strArr5 = zzal.zzd;
        zzaw.zza(zzj5, sQLiteDatabase, ProtectedSandApp.s("\udd28"), ProtectedSandApp.s("\udd29"), s10, strArr5);
        zzgo zzj6 = this.zza.zzj();
        String s11 = ProtectedSandApp.s("\udd2a");
        strArr6 = zzal.zzf;
        zzaw.zza(zzj6, sQLiteDatabase, ProtectedSandApp.s("\udd2b"), ProtectedSandApp.s("\udd2c"), s11, strArr6);
        zzgo zzj7 = this.zza.zzj();
        String s12 = ProtectedSandApp.s("\udd2d");
        strArr7 = zzal.zzh;
        zzaw.zza(zzj7, sQLiteDatabase, ProtectedSandApp.s("\udd2e"), ProtectedSandApp.s("\udd2f"), s12, strArr7);
        zzaw.zza(this.zza.zzj(), sQLiteDatabase, ProtectedSandApp.s("\udd31"), ProtectedSandApp.s("\udd32"), ProtectedSandApp.s("\udd30"), null);
        zzgo zzj8 = this.zza.zzj();
        String s13 = ProtectedSandApp.s("\udd33");
        strArr8 = zzal.zzi;
        zzaw.zza(zzj8, sQLiteDatabase, ProtectedSandApp.s("\udd34"), ProtectedSandApp.s("\udd35"), s13, strArr8);
        zzaw.zza(this.zza.zzj(), sQLiteDatabase, ProtectedSandApp.s("\udd37"), ProtectedSandApp.s("\udd38"), ProtectedSandApp.s("\udd36"), null);
        zzaw.zza(this.zza.zzj(), sQLiteDatabase, ProtectedSandApp.s("\udd3a"), ProtectedSandApp.s("\udd3b"), ProtectedSandApp.s("\udd39"), null);
        zzgo zzj9 = this.zza.zzj();
        String s14 = ProtectedSandApp.s("\udd3c");
        strArr9 = zzal.zzj;
        zzaw.zza(zzj9, sQLiteDatabase, ProtectedSandApp.s("\udd3d"), ProtectedSandApp.s("\udd3e"), s14, strArr9);
        if (zzpn.zza()) {
            zzgo zzj10 = this.zza.zzj();
            String s15 = ProtectedSandApp.s("\udd3f");
            strArr10 = zzal.zzk;
            zzaw.zza(zzj10, sQLiteDatabase, ProtectedSandApp.s("\udd40"), ProtectedSandApp.s("\udd41"), s15, strArr10);
        }
        zzaw.zza(this.zza.zzj(), sQLiteDatabase, ProtectedSandApp.s("\udd43"), ProtectedSandApp.s("\udd44"), ProtectedSandApp.s("\udd42"), null);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @n1
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
    }
}
