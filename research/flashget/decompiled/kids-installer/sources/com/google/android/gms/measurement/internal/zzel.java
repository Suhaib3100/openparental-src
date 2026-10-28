package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.m1;
import androidx.annotation.n1;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
@m1
/* loaded from: classes2.dex */
final class zzel extends SQLiteOpenHelper {
    final /* synthetic */ zzem zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzel(zzem zzemVar, Context context, String str) {
        super(context, ProtectedSandApp.s("ཚ"), (SQLiteDatabase.CursorFactory) null, 1);
        this.zza = zzemVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @n1
    public final SQLiteDatabase getWritableDatabase() throws SQLiteException {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e6) {
            throw e6;
        } catch (SQLiteException unused) {
            a.a(this.zza.zzt, ProtectedSandApp.s("ཛ"));
            this.zza.zzt.zzf();
            Context zzaw = this.zza.zzt.zzaw();
            String s5 = ProtectedSandApp.s("ཛྷ");
            if (!zzaw.getDatabasePath(s5).delete()) {
                this.zza.zzt.zzaA().zzd().zzb(ProtectedSandApp.s("ཝ"), s5);
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e7) {
                this.zza.zzt.zzaA().zzd().zzb(ProtectedSandApp.s("ཞ"), e7);
                return null;
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
        zzal.zza(this.zza.zzt.zzaA(), sQLiteDatabase, ProtectedSandApp.s("ཟ"), ProtectedSandApp.s("འ"), ProtectedSandApp.s("ཡ"), null);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @n1
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i5, int i6) {
    }
}
