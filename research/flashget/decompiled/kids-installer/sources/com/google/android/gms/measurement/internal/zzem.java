package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import androidx.annotation.m1;
import androidx.annotation.n1;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes4.dex */
public final class zzem extends zzf {
    private final zzel zza;
    private boolean zzb;

    zzem(zzgd zzgdVar) {
        super(zzgdVar);
        Context zzaw = this.zzt.zzaw();
        this.zzt.zzf();
        this.zza = new zzel(this, zzaw, ProtectedSandApp.s("ど"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0158  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v9 */
    @androidx.annotation.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean zzq(int r18, byte[] r19) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzem.zzq(int, byte[]):boolean");
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    protected final boolean zzf() {
        return false;
    }

    @n1
    @m1
    final SQLiteDatabase zzh() throws SQLiteException {
        if (this.zzb) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.zza.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.zzb = true;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:195:0x0229 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0299 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0299 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0299 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x024d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List zzi(int r23) {
        /*
            Method dump skipped, instructions count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzem.zzi(int):java.util.List");
    }

    @n1
    public final void zzj() {
        int delete;
        zzg();
        try {
            SQLiteDatabase zzh = zzh();
            if (zzh == null || (delete = zzh.delete(ProtectedSandApp.s("ら"), null, null)) <= 0) {
                return;
            }
            this.zzt.zzaA().zzj().zzb(ProtectedSandApp.s("り"), Integer.valueOf(delete));
        } catch (SQLiteException e6) {
            this.zzt.zzaA().zzd().zzb(ProtectedSandApp.s("る"), e6);
        }
    }

    @n1
    public final boolean zzk() {
        return zzq(3, new byte[0]);
    }

    @m1
    final boolean zzl() {
        Context zzaw = this.zzt.zzaw();
        this.zzt.zzf();
        return zzaw.getDatabasePath(ProtectedSandApp.s("れ")).exists();
    }

    @n1
    public final boolean zzm() {
        int i5;
        String s5 = ProtectedSandApp.s("ろ");
        zzg();
        if (!this.zzb && zzl()) {
            int i6 = 5;
            for (0; i5 < 5; i5 + 1) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        SQLiteDatabase zzh = zzh();
                        if (zzh == null) {
                            this.zzb = true;
                            return false;
                        }
                        zzh.beginTransaction();
                        zzh.delete(ProtectedSandApp.s("ゎ"), ProtectedSandApp.s("わ"), new String[]{Integer.toString(3)});
                        zzh.setTransactionSuccessful();
                        zzh.endTransaction();
                        zzh.close();
                        return true;
                    } catch (SQLiteException e6) {
                        if (0 != 0) {
                            try {
                                if (sQLiteDatabase.inTransaction()) {
                                    sQLiteDatabase.endTransaction();
                                }
                            } catch (Throwable th) {
                                if (0 != 0) {
                                    sQLiteDatabase.close();
                                }
                                throw th;
                            }
                        }
                        this.zzt.zzaA().zzd().zzb(s5, e6);
                        this.zzb = true;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i6);
                    i6 += 20;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                } catch (SQLiteFullException e7) {
                    this.zzt.zzaA().zzd().zzb(s5, e7);
                    this.zzb = true;
                    i5 = 0 == 0 ? i5 + 1 : 0;
                    sQLiteDatabase.close();
                }
            }
            b.a(this.zzt, ProtectedSandApp.s("ゐ"));
        }
        return false;
    }

    public final boolean zzn(zzac zzacVar) {
        byte[] zzap = this.zzt.zzv().zzap(zzacVar);
        if (zzap.length <= 131072) {
            return zzq(2, zzap);
        }
        this.zzt.zzaA().zzh().zza(ProtectedSandApp.s("ゑ"));
        return false;
    }

    public final boolean zzo(zzau zzauVar) {
        Parcel obtain = Parcel.obtain();
        zzav.zza(zzauVar, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return zzq(0, marshall);
        }
        this.zzt.zzaA().zzh().zza(ProtectedSandApp.s("を"));
        return false;
    }

    public final boolean zzp(zzlk zzlkVar) {
        Parcel obtain = Parcel.obtain();
        zzll.zza(zzlkVar, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return zzq(1, marshall);
        }
        this.zzt.zzaA().zzh().zza(ProtectedSandApp.s("ん"));
        return false;
    }
}
