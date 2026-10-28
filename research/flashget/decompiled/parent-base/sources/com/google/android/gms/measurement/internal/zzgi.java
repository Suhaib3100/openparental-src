package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import androidx.annotation.n1;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
final class zzgi extends com.google.android.gms.internal.measurement.zzck {
    private final /* synthetic */ zzgf zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgi(zzgf zzgfVar, Context context, String str) {
        super(context, str, null, 1);
        this.zza = zzgfVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @n1
    public final SQLiteDatabase getWritableDatabase() throws SQLiteException {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e4) {
            throw e4;
        } catch (SQLiteException unused) {
            this.zza.zzj().zzg().zza(ProtectedSandApp.s("\ude67"));
            Context zza = this.zza.zza();
            String s4 = ProtectedSandApp.s("\ude68");
            if (!zza.getDatabasePath(s4).delete()) {
                this.zza.zzj().zzg().zza(ProtectedSandApp.s("\ude69"), s4);
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e5) {
                this.zza.zzj().zzg().zza(ProtectedSandApp.s("\ude6a"), e5);
                return null;
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
        zzaw.zza(this.zza.zzj(), sQLiteDatabase, ProtectedSandApp.s("\ude6c"), ProtectedSandApp.s("\ude6d"), ProtectedSandApp.s("\ude6b"), null);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @n1
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
    }
}
