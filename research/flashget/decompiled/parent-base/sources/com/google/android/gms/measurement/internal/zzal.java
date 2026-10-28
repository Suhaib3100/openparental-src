package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.d;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.m1;
import androidx.annotation.n1;
import androidx.core.database.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzfy;
import com.google.android.gms.internal.measurement.zzjt;
import com.google.android.gms.internal.measurement.zzpu;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes5.dex */
final class zzal extends zznr {
    private static final String[] zza = {ProtectedSandApp.s("\udb95"), ProtectedSandApp.s("\udb96"), ProtectedSandApp.s("\udb97"), ProtectedSandApp.s("\udb98"), ProtectedSandApp.s("\udb99"), ProtectedSandApp.s("\udb9a"), ProtectedSandApp.s("\udb9b"), ProtectedSandApp.s("\udb9c"), ProtectedSandApp.s("\udb9d"), ProtectedSandApp.s("\udb9e"), ProtectedSandApp.s("\udb93"), ProtectedSandApp.s("\udb94")};
    private static final String[] zzb = {ProtectedSandApp.s("\udb9f"), ProtectedSandApp.s("\udba0")};
    private static final String[] zzc = {ProtectedSandApp.s("\udba3"), ProtectedSandApp.s("\udba4"), ProtectedSandApp.s("\udba5"), ProtectedSandApp.s("\udba6"), ProtectedSandApp.s("\udba7"), ProtectedSandApp.s("\udba8"), ProtectedSandApp.s("\udba9"), ProtectedSandApp.s("\udbaa"), ProtectedSandApp.s("\udbab"), ProtectedSandApp.s("\udbac"), ProtectedSandApp.s("\udbad"), ProtectedSandApp.s("\udbae"), ProtectedSandApp.s("\udbaf"), ProtectedSandApp.s("\udbb0"), ProtectedSandApp.s("\udbb1"), ProtectedSandApp.s("\udbb2"), ProtectedSandApp.s("\udbb3"), ProtectedSandApp.s("\udbb4"), ProtectedSandApp.s("\udbb5"), ProtectedSandApp.s("\udbb6"), ProtectedSandApp.s("\udbb7"), ProtectedSandApp.s("\udbb8"), ProtectedSandApp.s("\udbb9"), ProtectedSandApp.s("\udbba"), ProtectedSandApp.s("\udbbb"), ProtectedSandApp.s("\udbbc"), ProtectedSandApp.s("\udbbd"), ProtectedSandApp.s("\udbbe"), ProtectedSandApp.s("\udbbf"), ProtectedSandApp.s("\udbc0"), ProtectedSandApp.s("\udbc1"), ProtectedSandApp.s("\udbc2"), ProtectedSandApp.s("\udbc3"), ProtectedSandApp.s("\udbc4"), ProtectedSandApp.s("\udbc5"), ProtectedSandApp.s("\udbc6"), ProtectedSandApp.s("\udbc7"), ProtectedSandApp.s("\udbc8"), ProtectedSandApp.s("\udbc9"), ProtectedSandApp.s("\udbca"), ProtectedSandApp.s("\udbcb"), ProtectedSandApp.s("\udbcc"), ProtectedSandApp.s("\udbcd"), ProtectedSandApp.s("\udbce"), ProtectedSandApp.s("\udbcf"), ProtectedSandApp.s("\udbd0"), ProtectedSandApp.s("\udbd1"), ProtectedSandApp.s("\udbd2"), ProtectedSandApp.s("\udbd3"), ProtectedSandApp.s("\udbd4"), ProtectedSandApp.s("\udbd5"), ProtectedSandApp.s("\udbd6"), ProtectedSandApp.s("\udbd7"), ProtectedSandApp.s("\udbd8"), ProtectedSandApp.s("\udbd9"), ProtectedSandApp.s("\udbda"), ProtectedSandApp.s("\udbdb"), ProtectedSandApp.s("\udbdc"), ProtectedSandApp.s("\udbdd"), ProtectedSandApp.s("\udbde"), ProtectedSandApp.s("\udbdf"), ProtectedSandApp.s("\udbe0"), ProtectedSandApp.s("\udbe1"), ProtectedSandApp.s("\udbe2"), ProtectedSandApp.s("\udbe3"), ProtectedSandApp.s("\udbe4"), ProtectedSandApp.s("\udbe5"), ProtectedSandApp.s("\udbe6"), ProtectedSandApp.s("\udbe7"), ProtectedSandApp.s("\udbe8"), ProtectedSandApp.s("\udbe9"), ProtectedSandApp.s("\udbea"), ProtectedSandApp.s("\udbeb"), ProtectedSandApp.s("\udbec"), ProtectedSandApp.s("\udbed"), ProtectedSandApp.s("\udbee"), ProtectedSandApp.s("\udbef"), ProtectedSandApp.s("\udbf0"), ProtectedSandApp.s("\udbf1"), ProtectedSandApp.s("\udbf2"), ProtectedSandApp.s("\udbf3"), ProtectedSandApp.s("\udbf4"), ProtectedSandApp.s("\udbf5"), ProtectedSandApp.s("\udbf6"), ProtectedSandApp.s("\udbf7"), ProtectedSandApp.s("\udbf8"), ProtectedSandApp.s("\udbf9"), ProtectedSandApp.s("\udbfa"), ProtectedSandApp.s("\udba1"), ProtectedSandApp.s("\udba2")};
    private static final String[] zzd = {ProtectedSandApp.s("\udbfb"), ProtectedSandApp.s("\udbfc")};
    private static final String[] zze = {ProtectedSandApp.s("\udbff"), ProtectedSandApp.s("\udc00"), ProtectedSandApp.s("\udbfd"), ProtectedSandApp.s("\udbfe")};
    private static final String[] zzf;
    private static final String[] zzh;
    private static final String[] zzi;
    private static final String[] zzj;
    private static final String[] zzk;
    private final zzat zzl;
    private final zznl zzm;

    static {
        String s4 = ProtectedSandApp.s("\udc01");
        String s5 = ProtectedSandApp.s("\udc02");
        zzf = new String[]{s5, s4};
        zzh = new String[]{s5, ProtectedSandApp.s("\udc03")};
        zzi = new String[]{ProtectedSandApp.s("\udc04"), ProtectedSandApp.s("\udc05")};
        zzj = new String[]{ProtectedSandApp.s("\udc08"), ProtectedSandApp.s("\udc09"), ProtectedSandApp.s("\udc0a"), ProtectedSandApp.s("\udc0b"), ProtectedSandApp.s("\udc06"), ProtectedSandApp.s("\udc07")};
        zzk = new String[]{ProtectedSandApp.s("\udc0c"), ProtectedSandApp.s("\udc0d")};
    }

    zzal(zznv zznvVar) {
        super(zznvVar);
        this.zzm = new zznl(zzb());
        this.zzl = new zzat(this, zza(), ProtectedSandApp.s("\udc0e"));
    }

    private final String zzao() {
        long currentTimeMillis = zzb().currentTimeMillis();
        zznt zzntVar = zznt.zzb;
        int zza2 = zzntVar.zza();
        long longValue = zzbh.zzaf.zza(null).longValue();
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("\udc34"));
        sb.append(zza2);
        String s4 = ProtectedSandApp.s("\udc35");
        sb.append(s4);
        sb.append(currentTimeMillis);
        String s5 = ProtectedSandApp.s("\udc36");
        sb.append(s5);
        sb.append(longValue);
        String s6 = ProtectedSandApp.s("\udc37");
        sb.append(s6);
        return c.a(ProtectedSandApp.s("\udc39"), sb.toString(), ProtectedSandApp.s("\udc3a"), ProtectedSandApp.s("\udc38") + zzntVar.zza() + s4 + currentTimeMillis + s5 + zzag.zzm() + s6, ProtectedSandApp.s("\udc3b"));
    }

    public final long b_() {
        Cursor cursor = null;
        try {
            try {
                cursor = e_().rawQuery(ProtectedSandApp.s("\udc48"), null);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return -1L;
                }
                long j4 = cursor.getLong(0);
                cursor.close();
                return j4;
            } catch (SQLiteException e4) {
                zzj().zzg().zza(ProtectedSandApp.s("\udc49"), e4);
                if (cursor != null) {
                    cursor.close();
                }
                return -1L;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @n1
    public final long c_() {
        return zza(ProtectedSandApp.s("\udc4a"), (String[]) null, 0L);
    }

    @n1
    public final long d_() {
        return zza(ProtectedSandApp.s("\udc4b"), (String[]) null, 0L);
    }

    @n1
    @m1
    final SQLiteDatabase e_() {
        zzt();
        try {
            return this.zzl.getWritableDatabase();
        } catch (SQLiteException e4) {
            zzj().zzu().zza(ProtectedSandApp.s("\udc4c"), e4);
            throw e4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    @androidx.annotation.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String f_() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.e_()
            r1 = 0
            java.lang.String r2 = "\udc4d"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)     // Catch: java.lang.Throwable -> L26 android.database.sqlite.SQLiteException -> L2b
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L26 android.database.sqlite.SQLiteException -> L2b
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1e android.database.sqlite.SQLiteException -> L20
            if (r2 == 0) goto L22
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: java.lang.Throwable -> L1e android.database.sqlite.SQLiteException -> L20
            r0.close()
            return r1
        L1e:
            r1 = move-exception
            goto L44
        L20:
            r2 = move-exception
            goto L2d
        L22:
            r0.close()
            return r1
        L26:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L44
        L2b:
            r2 = move-exception
            r0 = r1
        L2d:
            com.google.android.gms.measurement.internal.zzgo r3 = r6.zzj()     // Catch: java.lang.Throwable -> L1e
            com.google.android.gms.measurement.internal.zzgq r3 = r3.zzg()     // Catch: java.lang.Throwable -> L1e
            java.lang.String r4 = "\udc4e"
            java.lang.String r4 = com.flashget.parentalcontrol.ProtectedSandApp.s(r4)     // Catch: java.lang.Throwable -> L1e
            r3.zza(r4, r2)     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L43
            r0.close()
        L43:
            return r1
        L44:
            if (r0 == 0) goto L49
            r0.close()
        L49:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.f_():java.lang.String");
    }

    @m1
    protected final boolean zzaa() {
        return zza().getDatabasePath(ProtectedSandApp.s("\udc0e")).exists();
    }

    @n1
    @m1
    protected final long zzb(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzt();
        zzal();
        SQLiteDatabase e_ = e_();
        e_.beginTransaction();
        long j4 = 0;
        try {
            try {
                long zza2 = zza(ProtectedSandApp.s("\udcbb") + str2 + ProtectedSandApp.s("\udcbc"), new String[]{str}, -1L);
                String s4 = ProtectedSandApp.s("\udcbd");
                String s5 = ProtectedSandApp.s("\udc16");
                if (zza2 == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(s5, str);
                    contentValues.put(ProtectedSandApp.s("\udcbe"), (Integer) 0);
                    contentValues.put(ProtectedSandApp.s("\udc04"), (Integer) 0);
                    if (e_.insertWithOnConflict(s4, null, contentValues, 5) == -1) {
                        zzj().zzg().zza(ProtectedSandApp.s("\udcbf"), zzgo.zza(str), str2);
                        return -1L;
                    }
                    zza2 = 0;
                }
                try {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put(s5, str);
                    contentValues2.put(str2, Long.valueOf(1 + zza2));
                    if (e_.update(s4, contentValues2, ProtectedSandApp.s("\udc7d"), new String[]{str}) == 0) {
                        zzj().zzg().zza(ProtectedSandApp.s("\udcc0"), zzgo.zza(str), str2);
                        return -1L;
                    }
                    e_.setTransactionSuccessful();
                    return zza2;
                } catch (SQLiteException e4) {
                    long j5 = zza2;
                    e = e4;
                    j4 = j5;
                    zzj().zzg().zza(ProtectedSandApp.s("\udcc1"), zzgo.zza(str), str2, e);
                    e_.endTransaction();
                    return j4;
                }
            } finally {
                e_.endTransaction();
            }
        } catch (SQLiteException e5) {
            e = e5;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zznr
    protected final boolean zzc() {
        return false;
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0035: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:30:0x0035 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle zzd(java.lang.String r6) {
        /*
            r5 = this;
            r5.zzt()
            r5.zzal()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r5.e_()     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteException -> L7b
            java.lang.String r2 = "\udccf"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteException -> L7b
            java.lang.String[] r3 = new java.lang.String[]{r6}     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteException -> L7b
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteException -> L7b
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L34 android.database.sqlite.SQLiteException -> L37
            if (r2 != 0) goto L39
            com.google.android.gms.measurement.internal.zzgo r6 = r5.zzj()     // Catch: java.lang.Throwable -> L34 android.database.sqlite.SQLiteException -> L37
            com.google.android.gms.measurement.internal.zzgq r6 = r6.zzp()     // Catch: java.lang.Throwable -> L34 android.database.sqlite.SQLiteException -> L37
            java.lang.String r2 = "\udcd0"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)     // Catch: java.lang.Throwable -> L34 android.database.sqlite.SQLiteException -> L37
            r6.zza(r2)     // Catch: java.lang.Throwable -> L34 android.database.sqlite.SQLiteException -> L37
            r1.close()
            return r0
        L34:
            r6 = move-exception
            r0 = r1
            goto L94
        L37:
            r6 = move-exception
            goto L7d
        L39:
            r2 = 0
            byte[] r2 = r1.getBlob(r2)     // Catch: java.lang.Throwable -> L34 android.database.sqlite.SQLiteException -> L37
            com.google.android.gms.internal.measurement.zzfy$zzf$zza r3 = com.google.android.gms.internal.measurement.zzfy.zzf.zze()     // Catch: java.lang.Throwable -> L34 android.database.sqlite.SQLiteException -> L37 java.io.IOException -> L5f
            com.google.android.gms.internal.measurement.zzlb r2 = com.google.android.gms.measurement.internal.zzoo.zza(r3, r2)     // Catch: java.lang.Throwable -> L34 android.database.sqlite.SQLiteException -> L37 java.io.IOException -> L5f
            com.google.android.gms.internal.measurement.zzfy$zzf$zza r2 = (com.google.android.gms.internal.measurement.zzfy.zzf.zza) r2     // Catch: java.lang.Throwable -> L34 android.database.sqlite.SQLiteException -> L37 java.io.IOException -> L5f
            com.google.android.gms.internal.measurement.zzlc r2 = r2.zzai()     // Catch: java.lang.Throwable -> L34 android.database.sqlite.SQLiteException -> L37 java.io.IOException -> L5f
            com.google.android.gms.internal.measurement.zzjt r2 = (com.google.android.gms.internal.measurement.zzjt) r2     // Catch: java.lang.Throwable -> L34 android.database.sqlite.SQLiteException -> L37 java.io.IOException -> L5f
            com.google.android.gms.internal.measurement.zzfy$zzf r2 = (com.google.android.gms.internal.measurement.zzfy.zzf) r2     // Catch: java.lang.Throwable -> L34 android.database.sqlite.SQLiteException -> L37 java.io.IOException -> L5f
            r5.g_()     // Catch: java.lang.Throwable -> L34 android.database.sqlite.SQLiteException -> L37
            java.util.List r6 = r2.zzh()     // Catch: java.lang.Throwable -> L34 android.database.sqlite.SQLiteException -> L37
            android.os.Bundle r6 = com.google.android.gms.measurement.internal.zzoo.zza(r6)     // Catch: java.lang.Throwable -> L34 android.database.sqlite.SQLiteException -> L37
            r1.close()
            return r6
        L5f:
            r2 = move-exception
            com.google.android.gms.measurement.internal.zzgo r3 = r5.zzj()     // Catch: java.lang.Throwable -> L34 android.database.sqlite.SQLiteException -> L37
            com.google.android.gms.measurement.internal.zzgq r3 = r3.zzg()     // Catch: java.lang.Throwable -> L34 android.database.sqlite.SQLiteException -> L37
            java.lang.String r4 = "\udcd1"
            java.lang.String r4 = com.flashget.parentalcontrol.ProtectedSandApp.s(r4)     // Catch: java.lang.Throwable -> L34 android.database.sqlite.SQLiteException -> L37
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzgo.zza(r6)     // Catch: java.lang.Throwable -> L34 android.database.sqlite.SQLiteException -> L37
            r3.zza(r4, r6, r2)     // Catch: java.lang.Throwable -> L34 android.database.sqlite.SQLiteException -> L37
            r1.close()
            return r0
        L79:
            r6 = move-exception
            goto L94
        L7b:
            r6 = move-exception
            r1 = r0
        L7d:
            com.google.android.gms.measurement.internal.zzgo r2 = r5.zzj()     // Catch: java.lang.Throwable -> L34
            com.google.android.gms.measurement.internal.zzgq r2 = r2.zzg()     // Catch: java.lang.Throwable -> L34
            java.lang.String r3 = "\udcd2"
            java.lang.String r3 = com.flashget.parentalcontrol.ProtectedSandApp.s(r3)     // Catch: java.lang.Throwable -> L34
            r2.zza(r3, r6)     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L93
            r1.close()
        L93:
            return r0
        L94:
            if (r0 == 0) goto L99
            r0.close()
        L99:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzd(java.lang.String):android.os.Bundle");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x03aa A[Catch: all -> 0x016c, SQLiteException -> 0x0170, TryCatch #2 {SQLiteException -> 0x0170, blocks: (B:5:0x0135, B:10:0x013f, B:12:0x0151, B:14:0x015d, B:17:0x017a, B:19:0x0188, B:21:0x0194, B:23:0x01aa, B:25:0x01ec, B:29:0x01f6, B:32:0x0240, B:34:0x026f, B:38:0x0279, B:41:0x0294, B:43:0x029f, B:44:0x02b5, B:46:0x02bb, B:48:0x02c7, B:50:0x02de, B:52:0x02e4, B:54:0x02f0, B:56:0x02f9, B:58:0x0301, B:61:0x030a, B:63:0x0322, B:65:0x032b, B:67:0x0343, B:69:0x034f, B:70:0x0361, B:72:0x0369, B:75:0x0372, B:78:0x038a, B:81:0x03b4, B:83:0x03c3, B:85:0x03cb, B:86:0x03d6, B:88:0x03de, B:89:0x03e9, B:91:0x03ef, B:93:0x03fb, B:94:0x0404, B:96:0x040d, B:100:0x03aa, B:101:0x037f, B:104:0x0386, B:106:0x02d5, B:107:0x0290, B:109:0x023b, B:111:0x01a2, B:112:0x0173), top: B:4:0x0135 }] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x037f A[Catch: all -> 0x016c, SQLiteException -> 0x0170, TryCatch #2 {SQLiteException -> 0x0170, blocks: (B:5:0x0135, B:10:0x013f, B:12:0x0151, B:14:0x015d, B:17:0x017a, B:19:0x0188, B:21:0x0194, B:23:0x01aa, B:25:0x01ec, B:29:0x01f6, B:32:0x0240, B:34:0x026f, B:38:0x0279, B:41:0x0294, B:43:0x029f, B:44:0x02b5, B:46:0x02bb, B:48:0x02c7, B:50:0x02de, B:52:0x02e4, B:54:0x02f0, B:56:0x02f9, B:58:0x0301, B:61:0x030a, B:63:0x0322, B:65:0x032b, B:67:0x0343, B:69:0x034f, B:70:0x0361, B:72:0x0369, B:75:0x0372, B:78:0x038a, B:81:0x03b4, B:83:0x03c3, B:85:0x03cb, B:86:0x03d6, B:88:0x03de, B:89:0x03e9, B:91:0x03ef, B:93:0x03fb, B:94:0x0404, B:96:0x040d, B:100:0x03aa, B:101:0x037f, B:104:0x0386, B:106:0x02d5, B:107:0x0290, B:109:0x023b, B:111:0x01a2, B:112:0x0173), top: B:4:0x0135 }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0290 A[Catch: all -> 0x016c, SQLiteException -> 0x0170, TryCatch #2 {SQLiteException -> 0x0170, blocks: (B:5:0x0135, B:10:0x013f, B:12:0x0151, B:14:0x015d, B:17:0x017a, B:19:0x0188, B:21:0x0194, B:23:0x01aa, B:25:0x01ec, B:29:0x01f6, B:32:0x0240, B:34:0x026f, B:38:0x0279, B:41:0x0294, B:43:0x029f, B:44:0x02b5, B:46:0x02bb, B:48:0x02c7, B:50:0x02de, B:52:0x02e4, B:54:0x02f0, B:56:0x02f9, B:58:0x0301, B:61:0x030a, B:63:0x0322, B:65:0x032b, B:67:0x0343, B:69:0x034f, B:70:0x0361, B:72:0x0369, B:75:0x0372, B:78:0x038a, B:81:0x03b4, B:83:0x03c3, B:85:0x03cb, B:86:0x03d6, B:88:0x03de, B:89:0x03e9, B:91:0x03ef, B:93:0x03fb, B:94:0x0404, B:96:0x040d, B:100:0x03aa, B:101:0x037f, B:104:0x0386, B:106:0x02d5, B:107:0x0290, B:109:0x023b, B:111:0x01a2, B:112:0x0173), top: B:4:0x0135 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x023b A[Catch: all -> 0x016c, SQLiteException -> 0x0170, TryCatch #2 {SQLiteException -> 0x0170, blocks: (B:5:0x0135, B:10:0x013f, B:12:0x0151, B:14:0x015d, B:17:0x017a, B:19:0x0188, B:21:0x0194, B:23:0x01aa, B:25:0x01ec, B:29:0x01f6, B:32:0x0240, B:34:0x026f, B:38:0x0279, B:41:0x0294, B:43:0x029f, B:44:0x02b5, B:46:0x02bb, B:48:0x02c7, B:50:0x02de, B:52:0x02e4, B:54:0x02f0, B:56:0x02f9, B:58:0x0301, B:61:0x030a, B:63:0x0322, B:65:0x032b, B:67:0x0343, B:69:0x034f, B:70:0x0361, B:72:0x0369, B:75:0x0372, B:78:0x038a, B:81:0x03b4, B:83:0x03c3, B:85:0x03cb, B:86:0x03d6, B:88:0x03de, B:89:0x03e9, B:91:0x03ef, B:93:0x03fb, B:94:0x0404, B:96:0x040d, B:100:0x03aa, B:101:0x037f, B:104:0x0386, B:106:0x02d5, B:107:0x0290, B:109:0x023b, B:111:0x01a2, B:112:0x0173), top: B:4:0x0135 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x026f A[Catch: all -> 0x016c, SQLiteException -> 0x0170, TryCatch #2 {SQLiteException -> 0x0170, blocks: (B:5:0x0135, B:10:0x013f, B:12:0x0151, B:14:0x015d, B:17:0x017a, B:19:0x0188, B:21:0x0194, B:23:0x01aa, B:25:0x01ec, B:29:0x01f6, B:32:0x0240, B:34:0x026f, B:38:0x0279, B:41:0x0294, B:43:0x029f, B:44:0x02b5, B:46:0x02bb, B:48:0x02c7, B:50:0x02de, B:52:0x02e4, B:54:0x02f0, B:56:0x02f9, B:58:0x0301, B:61:0x030a, B:63:0x0322, B:65:0x032b, B:67:0x0343, B:69:0x034f, B:70:0x0361, B:72:0x0369, B:75:0x0372, B:78:0x038a, B:81:0x03b4, B:83:0x03c3, B:85:0x03cb, B:86:0x03d6, B:88:0x03de, B:89:0x03e9, B:91:0x03ef, B:93:0x03fb, B:94:0x0404, B:96:0x040d, B:100:0x03aa, B:101:0x037f, B:104:0x0386, B:106:0x02d5, B:107:0x0290, B:109:0x023b, B:111:0x01a2, B:112:0x0173), top: B:4:0x0135 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x029f A[Catch: all -> 0x016c, SQLiteException -> 0x0170, TryCatch #2 {SQLiteException -> 0x0170, blocks: (B:5:0x0135, B:10:0x013f, B:12:0x0151, B:14:0x015d, B:17:0x017a, B:19:0x0188, B:21:0x0194, B:23:0x01aa, B:25:0x01ec, B:29:0x01f6, B:32:0x0240, B:34:0x026f, B:38:0x0279, B:41:0x0294, B:43:0x029f, B:44:0x02b5, B:46:0x02bb, B:48:0x02c7, B:50:0x02de, B:52:0x02e4, B:54:0x02f0, B:56:0x02f9, B:58:0x0301, B:61:0x030a, B:63:0x0322, B:65:0x032b, B:67:0x0343, B:69:0x034f, B:70:0x0361, B:72:0x0369, B:75:0x0372, B:78:0x038a, B:81:0x03b4, B:83:0x03c3, B:85:0x03cb, B:86:0x03d6, B:88:0x03de, B:89:0x03e9, B:91:0x03ef, B:93:0x03fb, B:94:0x0404, B:96:0x040d, B:100:0x03aa, B:101:0x037f, B:104:0x0386, B:106:0x02d5, B:107:0x0290, B:109:0x023b, B:111:0x01a2, B:112:0x0173), top: B:4:0x0135 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02bb A[Catch: all -> 0x016c, SQLiteException -> 0x0170, TryCatch #2 {SQLiteException -> 0x0170, blocks: (B:5:0x0135, B:10:0x013f, B:12:0x0151, B:14:0x015d, B:17:0x017a, B:19:0x0188, B:21:0x0194, B:23:0x01aa, B:25:0x01ec, B:29:0x01f6, B:32:0x0240, B:34:0x026f, B:38:0x0279, B:41:0x0294, B:43:0x029f, B:44:0x02b5, B:46:0x02bb, B:48:0x02c7, B:50:0x02de, B:52:0x02e4, B:54:0x02f0, B:56:0x02f9, B:58:0x0301, B:61:0x030a, B:63:0x0322, B:65:0x032b, B:67:0x0343, B:69:0x034f, B:70:0x0361, B:72:0x0369, B:75:0x0372, B:78:0x038a, B:81:0x03b4, B:83:0x03c3, B:85:0x03cb, B:86:0x03d6, B:88:0x03de, B:89:0x03e9, B:91:0x03ef, B:93:0x03fb, B:94:0x0404, B:96:0x040d, B:100:0x03aa, B:101:0x037f, B:104:0x0386, B:106:0x02d5, B:107:0x0290, B:109:0x023b, B:111:0x01a2, B:112:0x0173), top: B:4:0x0135 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02e4 A[Catch: all -> 0x016c, SQLiteException -> 0x0170, TryCatch #2 {SQLiteException -> 0x0170, blocks: (B:5:0x0135, B:10:0x013f, B:12:0x0151, B:14:0x015d, B:17:0x017a, B:19:0x0188, B:21:0x0194, B:23:0x01aa, B:25:0x01ec, B:29:0x01f6, B:32:0x0240, B:34:0x026f, B:38:0x0279, B:41:0x0294, B:43:0x029f, B:44:0x02b5, B:46:0x02bb, B:48:0x02c7, B:50:0x02de, B:52:0x02e4, B:54:0x02f0, B:56:0x02f9, B:58:0x0301, B:61:0x030a, B:63:0x0322, B:65:0x032b, B:67:0x0343, B:69:0x034f, B:70:0x0361, B:72:0x0369, B:75:0x0372, B:78:0x038a, B:81:0x03b4, B:83:0x03c3, B:85:0x03cb, B:86:0x03d6, B:88:0x03de, B:89:0x03e9, B:91:0x03ef, B:93:0x03fb, B:94:0x0404, B:96:0x040d, B:100:0x03aa, B:101:0x037f, B:104:0x0386, B:106:0x02d5, B:107:0x0290, B:109:0x023b, B:111:0x01a2, B:112:0x0173), top: B:4:0x0135 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02f9 A[Catch: all -> 0x016c, SQLiteException -> 0x0170, TryCatch #2 {SQLiteException -> 0x0170, blocks: (B:5:0x0135, B:10:0x013f, B:12:0x0151, B:14:0x015d, B:17:0x017a, B:19:0x0188, B:21:0x0194, B:23:0x01aa, B:25:0x01ec, B:29:0x01f6, B:32:0x0240, B:34:0x026f, B:38:0x0279, B:41:0x0294, B:43:0x029f, B:44:0x02b5, B:46:0x02bb, B:48:0x02c7, B:50:0x02de, B:52:0x02e4, B:54:0x02f0, B:56:0x02f9, B:58:0x0301, B:61:0x030a, B:63:0x0322, B:65:0x032b, B:67:0x0343, B:69:0x034f, B:70:0x0361, B:72:0x0369, B:75:0x0372, B:78:0x038a, B:81:0x03b4, B:83:0x03c3, B:85:0x03cb, B:86:0x03d6, B:88:0x03de, B:89:0x03e9, B:91:0x03ef, B:93:0x03fb, B:94:0x0404, B:96:0x040d, B:100:0x03aa, B:101:0x037f, B:104:0x0386, B:106:0x02d5, B:107:0x0290, B:109:0x023b, B:111:0x01a2, B:112:0x0173), top: B:4:0x0135 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0343 A[Catch: all -> 0x016c, SQLiteException -> 0x0170, TryCatch #2 {SQLiteException -> 0x0170, blocks: (B:5:0x0135, B:10:0x013f, B:12:0x0151, B:14:0x015d, B:17:0x017a, B:19:0x0188, B:21:0x0194, B:23:0x01aa, B:25:0x01ec, B:29:0x01f6, B:32:0x0240, B:34:0x026f, B:38:0x0279, B:41:0x0294, B:43:0x029f, B:44:0x02b5, B:46:0x02bb, B:48:0x02c7, B:50:0x02de, B:52:0x02e4, B:54:0x02f0, B:56:0x02f9, B:58:0x0301, B:61:0x030a, B:63:0x0322, B:65:0x032b, B:67:0x0343, B:69:0x034f, B:70:0x0361, B:72:0x0369, B:75:0x0372, B:78:0x038a, B:81:0x03b4, B:83:0x03c3, B:85:0x03cb, B:86:0x03d6, B:88:0x03de, B:89:0x03e9, B:91:0x03ef, B:93:0x03fb, B:94:0x0404, B:96:0x040d, B:100:0x03aa, B:101:0x037f, B:104:0x0386, B:106:0x02d5, B:107:0x0290, B:109:0x023b, B:111:0x01a2, B:112:0x0173), top: B:4:0x0135 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0369 A[Catch: all -> 0x016c, SQLiteException -> 0x0170, TryCatch #2 {SQLiteException -> 0x0170, blocks: (B:5:0x0135, B:10:0x013f, B:12:0x0151, B:14:0x015d, B:17:0x017a, B:19:0x0188, B:21:0x0194, B:23:0x01aa, B:25:0x01ec, B:29:0x01f6, B:32:0x0240, B:34:0x026f, B:38:0x0279, B:41:0x0294, B:43:0x029f, B:44:0x02b5, B:46:0x02bb, B:48:0x02c7, B:50:0x02de, B:52:0x02e4, B:54:0x02f0, B:56:0x02f9, B:58:0x0301, B:61:0x030a, B:63:0x0322, B:65:0x032b, B:67:0x0343, B:69:0x034f, B:70:0x0361, B:72:0x0369, B:75:0x0372, B:78:0x038a, B:81:0x03b4, B:83:0x03c3, B:85:0x03cb, B:86:0x03d6, B:88:0x03de, B:89:0x03e9, B:91:0x03ef, B:93:0x03fb, B:94:0x0404, B:96:0x040d, B:100:0x03aa, B:101:0x037f, B:104:0x0386, B:106:0x02d5, B:107:0x0290, B:109:0x023b, B:111:0x01a2, B:112:0x0173), top: B:4:0x0135 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03c3 A[Catch: all -> 0x016c, SQLiteException -> 0x0170, TryCatch #2 {SQLiteException -> 0x0170, blocks: (B:5:0x0135, B:10:0x013f, B:12:0x0151, B:14:0x015d, B:17:0x017a, B:19:0x0188, B:21:0x0194, B:23:0x01aa, B:25:0x01ec, B:29:0x01f6, B:32:0x0240, B:34:0x026f, B:38:0x0279, B:41:0x0294, B:43:0x029f, B:44:0x02b5, B:46:0x02bb, B:48:0x02c7, B:50:0x02de, B:52:0x02e4, B:54:0x02f0, B:56:0x02f9, B:58:0x0301, B:61:0x030a, B:63:0x0322, B:65:0x032b, B:67:0x0343, B:69:0x034f, B:70:0x0361, B:72:0x0369, B:75:0x0372, B:78:0x038a, B:81:0x03b4, B:83:0x03c3, B:85:0x03cb, B:86:0x03d6, B:88:0x03de, B:89:0x03e9, B:91:0x03ef, B:93:0x03fb, B:94:0x0404, B:96:0x040d, B:100:0x03aa, B:101:0x037f, B:104:0x0386, B:106:0x02d5, B:107:0x0290, B:109:0x023b, B:111:0x01a2, B:112:0x0173), top: B:4:0x0135 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03ef A[Catch: all -> 0x016c, SQLiteException -> 0x0170, TryCatch #2 {SQLiteException -> 0x0170, blocks: (B:5:0x0135, B:10:0x013f, B:12:0x0151, B:14:0x015d, B:17:0x017a, B:19:0x0188, B:21:0x0194, B:23:0x01aa, B:25:0x01ec, B:29:0x01f6, B:32:0x0240, B:34:0x026f, B:38:0x0279, B:41:0x0294, B:43:0x029f, B:44:0x02b5, B:46:0x02bb, B:48:0x02c7, B:50:0x02de, B:52:0x02e4, B:54:0x02f0, B:56:0x02f9, B:58:0x0301, B:61:0x030a, B:63:0x0322, B:65:0x032b, B:67:0x0343, B:69:0x034f, B:70:0x0361, B:72:0x0369, B:75:0x0372, B:78:0x038a, B:81:0x03b4, B:83:0x03c3, B:85:0x03cb, B:86:0x03d6, B:88:0x03de, B:89:0x03e9, B:91:0x03ef, B:93:0x03fb, B:94:0x0404, B:96:0x040d, B:100:0x03aa, B:101:0x037f, B:104:0x0386, B:106:0x02d5, B:107:0x0290, B:109:0x023b, B:111:0x01a2, B:112:0x0173), top: B:4:0x0135 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x040d A[Catch: all -> 0x016c, SQLiteException -> 0x0170, TRY_LEAVE, TryCatch #2 {SQLiteException -> 0x0170, blocks: (B:5:0x0135, B:10:0x013f, B:12:0x0151, B:14:0x015d, B:17:0x017a, B:19:0x0188, B:21:0x0194, B:23:0x01aa, B:25:0x01ec, B:29:0x01f6, B:32:0x0240, B:34:0x026f, B:38:0x0279, B:41:0x0294, B:43:0x029f, B:44:0x02b5, B:46:0x02bb, B:48:0x02c7, B:50:0x02de, B:52:0x02e4, B:54:0x02f0, B:56:0x02f9, B:58:0x0301, B:61:0x030a, B:63:0x0322, B:65:0x032b, B:67:0x0343, B:69:0x034f, B:70:0x0361, B:72:0x0369, B:75:0x0372, B:78:0x038a, B:81:0x03b4, B:83:0x03c3, B:85:0x03cb, B:86:0x03d6, B:88:0x03de, B:89:0x03e9, B:91:0x03ef, B:93:0x03fb, B:94:0x0404, B:96:0x040d, B:100:0x03aa, B:101:0x037f, B:104:0x0386, B:106:0x02d5, B:107:0x0290, B:109:0x023b, B:111:0x01a2, B:112:0x0173), top: B:4:0x0135 }] */
    @androidx.annotation.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzg zze(java.lang.String r51) {
        /*
            Method dump skipped, instructions count: 1099
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zze(java.lang.String):com.google.android.gms.measurement.internal.zzg");
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0071: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:28:0x0071 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5  */
    @androidx.annotation.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzan zzf(java.lang.String r10) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r10)
            r9.zzt()
            r9.zzal()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r9.e_()     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            java.lang.String r2 = "\udc5a"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            java.lang.String r3 = "\udbb7"
            java.lang.String r3 = com.flashget.parentalcontrol.ProtectedSandApp.s(r3)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            java.lang.String r4 = "\udbd7"
            java.lang.String r4 = com.flashget.parentalcontrol.ProtectedSandApp.s(r4)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            java.lang.String r5 = "\udbd9"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r5}     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            java.lang.String r4 = "\udc46"
            java.lang.String r4 = com.flashget.parentalcontrol.ProtectedSandApp.s(r4)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            java.lang.String[] r5 = new java.lang.String[]{r10}     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            r7 = 0
            r8 = 0
            r6 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            if (r2 != 0) goto L45
            r1.close()
            return r0
        L45:
            r2 = 0
            byte[] r2 = r1.getBlob(r2)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            r3 = 1
            java.lang.String r3 = r1.getString(r3)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            r4 = 2
            java.lang.String r4 = r1.getString(r4)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            boolean r5 = r1.moveToNext()     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            if (r5 == 0) goto L75
            com.google.android.gms.measurement.internal.zzgo r5 = r9.zzj()     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            com.google.android.gms.measurement.internal.zzgq r5 = r5.zzg()     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            java.lang.String r6 = "\udcd7"
            java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzgo.zza(r10)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            r5.zza(r6, r7)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            goto L75
        L70:
            r10 = move-exception
            r0 = r1
            goto La3
        L73:
            r2 = move-exception
            goto L88
        L75:
            if (r2 != 0) goto L7b
            r1.close()
            return r0
        L7b:
            com.google.android.gms.measurement.internal.zzan r5 = new com.google.android.gms.measurement.internal.zzan     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            r5.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            r1.close()
            return r5
        L84:
            r10 = move-exception
            goto La3
        L86:
            r2 = move-exception
            r1 = r0
        L88:
            com.google.android.gms.measurement.internal.zzgo r3 = r9.zzj()     // Catch: java.lang.Throwable -> L70
            com.google.android.gms.measurement.internal.zzgq r3 = r3.zzg()     // Catch: java.lang.Throwable -> L70
            java.lang.String r4 = "\udcd8"
            java.lang.String r4 = com.flashget.parentalcontrol.ProtectedSandApp.s(r4)     // Catch: java.lang.Throwable -> L70
            java.lang.Object r10 = com.google.android.gms.measurement.internal.zzgo.zza(r10)     // Catch: java.lang.Throwable -> L70
            r3.zza(r4, r10, r2)     // Catch: java.lang.Throwable -> L70
            if (r1 == 0) goto La2
            r1.close()
        La2:
            return r0
        La3:
            if (r0 == 0) goto La8
            r0.close()
        La8:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzf(java.lang.String):com.google.android.gms.measurement.internal.zzan");
    }

    public final zzax zzg(String str) {
        Preconditions.checkNotNull(str);
        zzt();
        zzal();
        return zzax.zza(zza(ProtectedSandApp.s("\udcdb"), new String[]{str}, ""));
    }

    public final zzje zzh(String str) {
        Preconditions.checkNotNull(str);
        zzt();
        zzal();
        return zzje.zzb(zza(ProtectedSandApp.s("\udcde"), new String[]{str}, ""));
    }

    public final zzje zzi(String str) {
        Preconditions.checkNotNull(str);
        zzt();
        zzal();
        zzje zzjeVar = (zzje) zza(ProtectedSandApp.s("\udce0"), new String[]{str}, new zzau() { // from class: com.google.android.gms.measurement.internal.zzao
            @Override // com.google.android.gms.measurement.internal.zzau
            public final Object zza(Cursor cursor) {
                zzje zza2;
                zza2 = zzje.zza(cursor.getString(0), cursor.getInt(1));
                return zza2;
            }
        });
        return zzjeVar == null ? zzje.zza : zzjeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0124 A[Catch: all -> 0x00ab, SQLiteException -> 0x00af, IOException -> 0x00d5, TryCatch #1 {IOException -> 0x00d5, blocks: (B:21:0x00b2, B:23:0x00d0, B:26:0x0117, B:28:0x0124, B:30:0x0132, B:32:0x013a, B:36:0x0147, B:34:0x0159, B:39:0x0164, B:43:0x00d8, B:45:0x00df, B:46:0x00ec, B:48:0x00f2, B:50:0x0111), top: B:20:0x00b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c3  */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    @androidx.annotation.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzoj zzj(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzj(java.lang.String):com.google.android.gms.measurement.internal.zzoj");
    }

    public final List<zzno> zzk(String str) {
        Preconditions.checkNotEmpty(str);
        zzt();
        zzal();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = e_().query(ProtectedSandApp.s("\udcb0"), new String[]{ProtectedSandApp.s("\udcad"), ProtectedSandApp.s("\udcaf"), ProtectedSandApp.s("\udcae")}, ProtectedSandApp.s("\udc46"), new String[]{str}, null, null, ProtectedSandApp.s("\udc61"), null);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return arrayList;
                }
                do {
                    String string = cursor.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    arrayList.add(new zzno(string, cursor.getLong(1), cursor.getInt(2)));
                } while (cursor.moveToNext());
                cursor.close();
                return arrayList;
            } catch (SQLiteException e4) {
                zzj().zzg().zza(ProtectedSandApp.s("\udce9"), zzgo.zza(str), e4);
                List<zzno> emptyList = Collections.emptyList();
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

    @n1
    public final List<zzop> zzl(String str) {
        Preconditions.checkNotEmpty(str);
        zzt();
        zzal();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = e_().query(ProtectedSandApp.s("\udc9e"), new String[]{ProtectedSandApp.s("\udc17"), ProtectedSandApp.s("\udb9f"), ProtectedSandApp.s("\udc9d"), ProtectedSandApp.s("\udc69")}, ProtectedSandApp.s("\udc46"), new String[]{str}, null, null, ProtectedSandApp.s("\udc61"), ProtectedSandApp.s("\udcea"));
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
                    long j4 = cursor.getLong(2);
                    Object zza2 = zza(cursor, 3);
                    if (zza2 == null) {
                        zzj().zzg().zza(ProtectedSandApp.s("\udceb"), zzgo.zza(str));
                    } else {
                        arrayList.add(new zzop(str, str2, string, j4, zza2));
                    }
                } while (cursor.moveToNext());
                cursor.close();
                return arrayList;
            } catch (SQLiteException e4) {
                zzj().zzg().zza(ProtectedSandApp.s("\udcec"), zzgo.zza(str), e4);
                List<zzop> emptyList = Collections.emptyList();
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

    final Map<Integer, zzfy.zzm> zzm(String str) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        Cursor cursor = null;
        try {
            try {
                Cursor query = e_().query(ProtectedSandApp.s("\udc41"), new String[]{ProtectedSandApp.s("\udc29"), ProtectedSandApp.s("\udced")}, ProtectedSandApp.s("\udc46"), new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    Map<Integer, zzfy.zzm> emptyMap = Collections.emptyMap();
                    query.close();
                    return emptyMap;
                }
                androidx.collection.a aVar = new androidx.collection.a();
                do {
                    int i4 = query.getInt(0);
                    try {
                        aVar.put(Integer.valueOf(i4), (zzfy.zzm) ((com.google.android.gms.internal.measurement.zzjt) ((zzfy.zzm.zza) zzoo.zza(zzfy.zzm.zze(), query.getBlob(1))).zzai()));
                    } catch (IOException e4) {
                        zzj().zzg().zza(ProtectedSandApp.s("\udcee"), zzgo.zza(str), Integer.valueOf(i4), e4);
                    }
                } while (query.moveToNext());
                query.close();
                return aVar;
            } catch (SQLiteException e5) {
                zzj().zzg().zza(ProtectedSandApp.s("\udcef"), zzgo.zza(str), e5);
                Map<Integer, zzfy.zzm> emptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    final Map<Integer, List<zzfo.zzb>> zzn(String str) {
        Preconditions.checkNotEmpty(str);
        androidx.collection.a aVar = new androidx.collection.a();
        Cursor cursor = null;
        try {
            try {
                Cursor query = e_().query(ProtectedSandApp.s("\udc2c"), new String[]{ProtectedSandApp.s("\udc29"), ProtectedSandApp.s("\udc23")}, ProtectedSandApp.s("\udc46"), new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    Map<Integer, List<zzfo.zzb>> emptyMap = Collections.emptyMap();
                    query.close();
                    return emptyMap;
                }
                do {
                    try {
                        zzfo.zzb zzbVar = (zzfo.zzb) ((com.google.android.gms.internal.measurement.zzjt) ((zzfo.zzb.zza) zzoo.zza(zzfo.zzb.zzc(), query.getBlob(1))).zzai());
                        if (zzbVar.zzk()) {
                            int i4 = query.getInt(0);
                            List list = (List) aVar.get(Integer.valueOf(i4));
                            if (list == null) {
                                list = new ArrayList();
                                aVar.put(Integer.valueOf(i4), list);
                            }
                            list.add(zzbVar);
                        }
                    } catch (IOException e4) {
                        zzj().zzg().zza(ProtectedSandApp.s("\udcda"), zzgo.zza(str), e4);
                    }
                } while (query.moveToNext());
                query.close();
                return aVar;
            } catch (Throwable th) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e5) {
            zzj().zzg().zza(ProtectedSandApp.s("\udc42"), zzgo.zza(str), e5);
            Map<Integer, List<zzfo.zzb>> emptyMap2 = Collections.emptyMap();
            if (0 != 0) {
                cursor.close();
            }
            return emptyMap2;
        }
    }

    final Map<Integer, List<Integer>> zzo(String str) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        androidx.collection.a aVar = new androidx.collection.a();
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = e_().rawQuery(ProtectedSandApp.s("\udcf0"), new String[]{str, str});
                if (!rawQuery.moveToFirst()) {
                    Map<Integer, List<Integer>> emptyMap = Collections.emptyMap();
                    rawQuery.close();
                    return emptyMap;
                }
                do {
                    int i4 = rawQuery.getInt(0);
                    List list = (List) aVar.get(Integer.valueOf(i4));
                    if (list == null) {
                        list = new ArrayList();
                        aVar.put(Integer.valueOf(i4), list);
                    }
                    list.add(Integer.valueOf(rawQuery.getInt(1)));
                } while (rawQuery.moveToNext());
                rawQuery.close();
                return aVar;
            } catch (SQLiteException e4) {
                zzj().zzg().zza(ProtectedSandApp.s("\udcf1"), zzgo.zza(str), e4);
                Map<Integer, List<Integer>> emptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    @n1
    public final void zzp() {
        zzal();
        e_().beginTransaction();
    }

    public final void zzq(String str) {
        zzbb zzd2;
        String s4 = ProtectedSandApp.s("\udcf4");
        zzi(s4, str);
        Cursor cursor = null;
        try {
            try {
                cursor = e_().query(ProtectedSandApp.s("\udc76"), (String[]) Collections.singletonList(ProtectedSandApp.s("\udc17")).toArray(new String[0]), ProtectedSandApp.s("\udc46"), new String[]{str}, null, null, null);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return;
                }
                do {
                    String string = cursor.getString(0);
                    if (string != null && (zzd2 = zzd(str, string)) != null) {
                        zza(s4, zzd2);
                    }
                } while (cursor.moveToNext());
                cursor.close();
            } catch (SQLiteException e4) {
                zzj().zzg().zza(ProtectedSandApp.s("\udcf5"), zzgo.zza(str), e4);
                if (cursor != null) {
                    cursor.close();
                }
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bf, code lost:
    
        if (r6.equals(r0) != false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzr(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzr(java.lang.String):void");
    }

    @n1
    public final boolean zzs(String str) {
        if (!zzpu.zza() || zze().zza(zzbh.zzcb)) {
            return zzb(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("\udcf9"), zzao()), new String[]{str}) != 0;
        }
        return false;
    }

    final boolean zzt(String str) {
        boolean z4;
        boolean z5;
        Cursor cursor = null;
        try {
            try {
                cursor = e_().rawQuery(ProtectedSandApp.s("\udcfa"), new String[]{str});
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        } catch (SQLiteException e4) {
            e = e4;
            z4 = false;
        }
        if (!cursor.moveToFirst()) {
            cursor.close();
            return false;
        }
        z4 = zzb().currentTimeMillis() < cursor.getLong(0) + 15000;
        try {
            z5 = zza(ProtectedSandApp.s("\udcfb"), new String[]{str}, 0L) > 0;
            cursor.close();
        } catch (SQLiteException e5) {
            e = e5;
            zzj().zzg().zza(ProtectedSandApp.s("\udcfc"), e);
            z5 = false;
            if (z4) {
            }
        }
        return (z4 || z5) ? false : true;
    }

    @n1
    public final void zzu() {
        zzal();
        e_().endTransaction();
    }

    @n1
    final void zzv() {
        zzt();
        zzal();
        if (zzaa()) {
            long zza2 = zzn().zza.zza();
            long elapsedRealtime = zzb().elapsedRealtime();
            if (Math.abs(elapsedRealtime - zza2) > zzag.zzn()) {
                zzn().zza.zza(elapsedRealtime);
                zzt();
                zzal();
                if (zzaa()) {
                    int delete = e_().delete(ProtectedSandApp.s("\udc60"), ProtectedSandApp.s("\udcfd"), new String[]{String.valueOf(zzb().currentTimeMillis()), String.valueOf(zzag.zzm())});
                    if (delete > 0) {
                        zzj().zzp().zza(ProtectedSandApp.s("\udcfe"), Integer.valueOf(delete));
                    }
                }
            }
        }
    }

    @n1
    public final void zzw() {
        zzal();
        e_().setTransactionSuccessful();
    }

    public final boolean zzx() {
        return zzb(ProtectedSandApp.s("\udcff"), (String[]) null) != 0;
    }

    public final boolean zzy() {
        return zzb(ProtectedSandApp.s("\udd00"), (String[]) null) != 0;
    }

    public final boolean zzz() {
        return zzb(ProtectedSandApp.s("\udd01"), (String[]) null) != 0;
    }

    @n1
    public final int zza(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzt();
        zzal();
        try {
            return e_().delete(ProtectedSandApp.s("\udc4f"), ProtectedSandApp.s("\udc43"), new String[]{str, str2});
        } catch (SQLiteException e4) {
            zzj().zzg().zza(ProtectedSandApp.s("\udc50"), zzgo.zza(str), zzi().zzc(str2), e4);
            return 0;
        }
    }

    public final long zzc(String str) {
        Preconditions.checkNotEmpty(str);
        return zza(ProtectedSandApp.s("\udccc"), new String[]{str}, 0L);
    }

    public final void zzp(String str) {
        zzt();
        zzal();
        try {
            e_().execSQL(ProtectedSandApp.s("\udcf2"), new String[]{str});
        } catch (SQLiteException e4) {
            zzj().zzg().zza(ProtectedSandApp.s("\udcf3"), e4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0158  */
    @androidx.annotation.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzae zzc(java.lang.String r27, java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzc(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzae");
    }

    private final void zzi(String str, String str2) {
        Preconditions.checkNotEmpty(str2);
        zzt();
        zzal();
        try {
            e_().delete(str, ProtectedSandApp.s("\udc46"), new String[]{str2});
        } catch (SQLiteException e4) {
            zzj().zzg().zza(ProtectedSandApp.s("\udc47"), zzgo.zza(str2), e4);
        }
    }

    final Map<Integer, List<zzfo.zze>> zzg(String str, String str2) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        androidx.collection.a aVar = new androidx.collection.a();
        Cursor cursor = null;
        try {
            try {
                Cursor query = e_().query(ProtectedSandApp.s("\udc31"), new String[]{ProtectedSandApp.s("\udc29"), ProtectedSandApp.s("\udc23")}, ProtectedSandApp.s("\udcdc"), new String[]{str, str2}, null, null, null);
                if (!query.moveToFirst()) {
                    Map<Integer, List<zzfo.zze>> emptyMap = Collections.emptyMap();
                    query.close();
                    return emptyMap;
                }
                do {
                    try {
                        zzfo.zze zzeVar = (zzfo.zze) ((com.google.android.gms.internal.measurement.zzjt) ((zzfo.zze.zza) zzoo.zza(zzfo.zze.zzc(), query.getBlob(1))).zzai());
                        int i4 = query.getInt(0);
                        List list = (List) aVar.get(Integer.valueOf(i4));
                        if (list == null) {
                            list = new ArrayList();
                            aVar.put(Integer.valueOf(i4), list);
                        }
                        list.add(zzeVar);
                    } catch (IOException e4) {
                        zzj().zzg().zza(ProtectedSandApp.s("\udcdd"), zzgo.zza(str), e4);
                    }
                } while (query.moveToNext());
                query.close();
                return aVar;
            } catch (SQLiteException e5) {
                zzj().zzg().zza(ProtectedSandApp.s("\udc42"), zzgo.zza(str), e5);
                Map<Integer, List<zzfo.zze>> emptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    @n1
    public final void zzh(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzt();
        zzal();
        try {
            e_().delete(ProtectedSandApp.s("\udc9e"), ProtectedSandApp.s("\udc43"), new String[]{str, str2});
        } catch (SQLiteException e4) {
            zzj().zzg().zza(ProtectedSandApp.s("\udcdf"), zzgo.zza(str), zzi().zzc(str2), e4);
        }
    }

    public final long zza(String str) {
        Preconditions.checkNotEmpty(str);
        zzt();
        zzal();
        try {
            return e_().delete(ProtectedSandApp.s("\udc24"), ProtectedSandApp.s("\udc54"), new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, zze().zzb(str, zzbh.zzp))))});
        } catch (SQLiteException e4) {
            zzj().zzg().zza(ProtectedSandApp.s("\udc55"), zzgo.zza(str), e4);
            return 0L;
        }
    }

    @n1
    public final zzbb zzd(String str, String str2) {
        return zzc(ProtectedSandApp.s("\udc76"), str, str2);
    }

    final Map<Integer, List<zzfo.zzb>> zzf(String str, String str2) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        androidx.collection.a aVar = new androidx.collection.a();
        Cursor cursor = null;
        try {
            try {
                Cursor query = e_().query(ProtectedSandApp.s("\udc2c"), new String[]{ProtectedSandApp.s("\udc29"), ProtectedSandApp.s("\udc23")}, ProtectedSandApp.s("\udcd9"), new String[]{str, str2}, null, null, null);
                if (!query.moveToFirst()) {
                    Map<Integer, List<zzfo.zzb>> emptyMap = Collections.emptyMap();
                    query.close();
                    return emptyMap;
                }
                do {
                    try {
                        zzfo.zzb zzbVar = (zzfo.zzb) ((com.google.android.gms.internal.measurement.zzjt) ((zzfo.zzb.zza) zzoo.zza(zzfo.zzb.zzc(), query.getBlob(1))).zzai());
                        int i4 = query.getInt(0);
                        List list = (List) aVar.get(Integer.valueOf(i4));
                        if (list == null) {
                            list = new ArrayList();
                            aVar.put(Integer.valueOf(i4), list);
                        }
                        list.add(zzbVar);
                    } catch (IOException e4) {
                        zzj().zzg().zza(ProtectedSandApp.s("\udcda"), zzgo.zza(str), e4);
                    }
                } while (query.moveToNext());
                query.close();
                return aVar;
            } catch (SQLiteException e5) {
                zzj().zzg().zza(ProtectedSandApp.s("\udc42"), zzgo.zza(str), e5);
                Map<Integer, List<zzfo.zzb>> emptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long zza(zzfy.zzk zzkVar) throws IOException {
        zzt();
        zzal();
        Preconditions.checkNotNull(zzkVar);
        Preconditions.checkNotEmpty(zzkVar.zzz());
        byte[] zzca = zzkVar.zzca();
        long zza2 = g_().zza(zzca);
        ContentValues contentValues = new ContentValues();
        contentValues.put(ProtectedSandApp.s("\udc16"), zzkVar.zzz());
        contentValues.put(ProtectedSandApp.s("\udc22"), Long.valueOf(zza2));
        contentValues.put(ProtectedSandApp.s("\udc51"), zzca);
        try {
            e_().insertWithOnConflict(ProtectedSandApp.s("\udc52"), null, contentValues, 4);
            return zza2;
        } catch (SQLiteException e4) {
            zzj().zzg().zza(ProtectedSandApp.s("\udc53"), zzgo.zza(zzkVar.zzz()), e4);
            throw e4;
        }
    }

    @n1
    public final long zzb(String str) {
        Preconditions.checkNotEmpty(str);
        zzt();
        zzal();
        return zza(ProtectedSandApp.s("\udcba"), new String[]{str}, -1L);
    }

    @n1
    private final long zzb(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = e_().rawQuery(str, strArr);
                if (rawQuery.moveToFirst()) {
                    long j4 = rawQuery.getLong(0);
                    rawQuery.close();
                    return j4;
                }
                throw new SQLiteException(ProtectedSandApp.s("\udc3c"));
            } catch (SQLiteException e4) {
                zzj().zzg().zza(ProtectedSandApp.s("\udc0f"), str, e4);
                throw e4;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015c  */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v6 */
    @androidx.annotation.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.android.gms.measurement.internal.zzbb zzc(java.lang.String r29, java.lang.String r30, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzc(java.lang.String, java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzbb");
    }

    @n1
    private final long zza(String str, String[] strArr, long j4) {
        Cursor cursor = null;
        try {
            try {
                cursor = e_().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    long j5 = cursor.getLong(0);
                    cursor.close();
                    return j5;
                }
                cursor.close();
                return j4;
            } catch (SQLiteException e4) {
                zzj().zzg().zza(ProtectedSandApp.s("\udc0f"), str, e4);
                throw e4;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cd, code lost:
    
        zzj().zzg().zza(com.flashget.parentalcontrol.ProtectedSandApp.s("\udcc2"), 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0158  */
    @androidx.annotation.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.measurement.internal.zzop> zzb(java.lang.String r23, java.lang.String r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzb(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0039: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:30:0x0039 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair<com.google.android.gms.internal.measurement.zzfy.zzf, java.lang.Long> zza(java.lang.String r6, java.lang.Long r7) {
        /*
            r5 = this;
            r5.zzt()
            r5.zzal()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r5.e_()     // Catch: java.lang.Throwable -> L7f android.database.sqlite.SQLiteException -> L81
            java.lang.String r2 = "\udc56"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)     // Catch: java.lang.Throwable -> L7f android.database.sqlite.SQLiteException -> L81
            java.lang.String r3 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L7f android.database.sqlite.SQLiteException -> L81
            java.lang.String[] r3 = new java.lang.String[]{r6, r3}     // Catch: java.lang.Throwable -> L7f android.database.sqlite.SQLiteException -> L81
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L7f android.database.sqlite.SQLiteException -> L81
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L38 android.database.sqlite.SQLiteException -> L3b
            if (r2 != 0) goto L3d
            com.google.android.gms.measurement.internal.zzgo r6 = r5.zzj()     // Catch: java.lang.Throwable -> L38 android.database.sqlite.SQLiteException -> L3b
            com.google.android.gms.measurement.internal.zzgq r6 = r6.zzp()     // Catch: java.lang.Throwable -> L38 android.database.sqlite.SQLiteException -> L3b
            java.lang.String r7 = "\udc57"
            java.lang.String r7 = com.flashget.parentalcontrol.ProtectedSandApp.s(r7)     // Catch: java.lang.Throwable -> L38 android.database.sqlite.SQLiteException -> L3b
            r6.zza(r7)     // Catch: java.lang.Throwable -> L38 android.database.sqlite.SQLiteException -> L3b
            r1.close()
            return r0
        L38:
            r6 = move-exception
            r0 = r1
            goto L9a
        L3b:
            r6 = move-exception
            goto L83
        L3d:
            r2 = 0
            byte[] r2 = r1.getBlob(r2)     // Catch: java.lang.Throwable -> L38 android.database.sqlite.SQLiteException -> L3b
            r3 = 1
            long r3 = r1.getLong(r3)     // Catch: java.lang.Throwable -> L38 android.database.sqlite.SQLiteException -> L3b
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L38 android.database.sqlite.SQLiteException -> L3b
            com.google.android.gms.internal.measurement.zzfy$zzf$zza r4 = com.google.android.gms.internal.measurement.zzfy.zzf.zze()     // Catch: java.lang.Throwable -> L38 android.database.sqlite.SQLiteException -> L3b java.io.IOException -> L65
            com.google.android.gms.internal.measurement.zzlb r2 = com.google.android.gms.measurement.internal.zzoo.zza(r4, r2)     // Catch: java.lang.Throwable -> L38 android.database.sqlite.SQLiteException -> L3b java.io.IOException -> L65
            com.google.android.gms.internal.measurement.zzfy$zzf$zza r2 = (com.google.android.gms.internal.measurement.zzfy.zzf.zza) r2     // Catch: java.lang.Throwable -> L38 android.database.sqlite.SQLiteException -> L3b java.io.IOException -> L65
            com.google.android.gms.internal.measurement.zzlc r2 = r2.zzai()     // Catch: java.lang.Throwable -> L38 android.database.sqlite.SQLiteException -> L3b java.io.IOException -> L65
            com.google.android.gms.internal.measurement.zzjt r2 = (com.google.android.gms.internal.measurement.zzjt) r2     // Catch: java.lang.Throwable -> L38 android.database.sqlite.SQLiteException -> L3b java.io.IOException -> L65
            com.google.android.gms.internal.measurement.zzfy$zzf r2 = (com.google.android.gms.internal.measurement.zzfy.zzf) r2     // Catch: java.lang.Throwable -> L38 android.database.sqlite.SQLiteException -> L3b java.io.IOException -> L65
            android.util.Pair r6 = android.util.Pair.create(r2, r3)     // Catch: java.lang.Throwable -> L38 android.database.sqlite.SQLiteException -> L3b
            r1.close()
            return r6
        L65:
            r2 = move-exception
            com.google.android.gms.measurement.internal.zzgo r3 = r5.zzj()     // Catch: java.lang.Throwable -> L38 android.database.sqlite.SQLiteException -> L3b
            com.google.android.gms.measurement.internal.zzgq r3 = r3.zzg()     // Catch: java.lang.Throwable -> L38 android.database.sqlite.SQLiteException -> L3b
            java.lang.String r4 = "\udc58"
            java.lang.String r4 = com.flashget.parentalcontrol.ProtectedSandApp.s(r4)     // Catch: java.lang.Throwable -> L38 android.database.sqlite.SQLiteException -> L3b
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzgo.zza(r6)     // Catch: java.lang.Throwable -> L38 android.database.sqlite.SQLiteException -> L3b
            r3.zza(r4, r6, r7, r2)     // Catch: java.lang.Throwable -> L38 android.database.sqlite.SQLiteException -> L3b
            r1.close()
            return r0
        L7f:
            r6 = move-exception
            goto L9a
        L81:
            r6 = move-exception
            r1 = r0
        L83:
            com.google.android.gms.measurement.internal.zzgo r7 = r5.zzj()     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.measurement.internal.zzgq r7 = r7.zzg()     // Catch: java.lang.Throwable -> L38
            java.lang.String r2 = "\udc59"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)     // Catch: java.lang.Throwable -> L38
            r7.zza(r2, r6)     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L99
            r1.close()
        L99:
            return r0
        L9a:
            if (r0 == 0) goto L9f
            r0.close()
        L9f:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zza(java.lang.String, java.lang.Long):android.util.Pair");
    }

    @n1
    public final zzaq zza(long j4, String str, boolean z4, boolean z5, boolean z6, boolean z7, boolean z10, boolean z11, boolean z12) {
        return zza(j4, str, 1L, false, false, z6, false, z10, z11, z12);
    }

    @n1
    public final zzaq zza(long j4, String str, long j5, boolean z4, boolean z5, boolean z6, boolean z7, boolean z10, boolean z11, boolean z12) {
        Preconditions.checkNotEmpty(str);
        zzt();
        zzal();
        String[] strArr = {str};
        zzaq zzaqVar = new zzaq();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase e_ = e_();
                Cursor query = e_.query(ProtectedSandApp.s("\udc5a"), new String[]{ProtectedSandApp.s("\udbaf"), ProtectedSandApp.s("\udbb3"), ProtectedSandApp.s("\udbb1"), ProtectedSandApp.s("\udbb5"), ProtectedSandApp.s("\udbc1"), ProtectedSandApp.s("\udbc3"), ProtectedSandApp.s("\udbef"), ProtectedSandApp.s("\udba1")}, ProtectedSandApp.s("\udc46"), new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    zzj().zzu().zza(ProtectedSandApp.s("\udc5b"), zzgo.zza(str));
                    query.close();
                    return zzaqVar;
                }
                if (query.getLong(0) == j4) {
                    zzaqVar.zzb = query.getLong(1);
                    zzaqVar.zza = query.getLong(2);
                    zzaqVar.zzc = query.getLong(3);
                    zzaqVar.zzd = query.getLong(4);
                    zzaqVar.zze = query.getLong(5);
                    zzaqVar.zzf = query.getLong(6);
                    zzaqVar.zzg = query.getLong(7);
                }
                if (z4) {
                    zzaqVar.zzb += j5;
                }
                if (z5) {
                    zzaqVar.zza += j5;
                }
                if (z6) {
                    zzaqVar.zzc += j5;
                }
                if (z7) {
                    zzaqVar.zzd += j5;
                }
                if (z10) {
                    zzaqVar.zze += j5;
                }
                if (z11) {
                    zzaqVar.zzf += j5;
                }
                if (z12) {
                    zzaqVar.zzg += j5;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put(ProtectedSandApp.s("\udbaf"), Long.valueOf(j4));
                contentValues.put(ProtectedSandApp.s("\udbb1"), Long.valueOf(zzaqVar.zza));
                contentValues.put(ProtectedSandApp.s("\udbb3"), Long.valueOf(zzaqVar.zzb));
                contentValues.put(ProtectedSandApp.s("\udbb5"), Long.valueOf(zzaqVar.zzc));
                contentValues.put(ProtectedSandApp.s("\udbc1"), Long.valueOf(zzaqVar.zzd));
                contentValues.put(ProtectedSandApp.s("\udbc3"), Long.valueOf(zzaqVar.zze));
                contentValues.put(ProtectedSandApp.s("\udbef"), Long.valueOf(zzaqVar.zzf));
                contentValues.put(ProtectedSandApp.s("\udba1"), Long.valueOf(zzaqVar.zzg));
                e_.update(ProtectedSandApp.s("\udc5a"), contentValues, ProtectedSandApp.s("\udc46"), strArr);
                query.close();
                return zzaqVar;
            } catch (SQLiteException e4) {
                zzj().zzg().zza(ProtectedSandApp.s("\udc5c"), zzgo.zza(str), e4);
                if (0 != 0) {
                    cursor.close();
                }
                return zzaqVar;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0082: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:29:0x0082 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b3  */
    @androidx.annotation.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzop zze(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r11)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r12)
            r10.zzt()
            r10.zzal()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.e_()     // Catch: java.lang.Throwable -> L8a android.database.sqlite.SQLiteException -> L8c
            java.lang.String r2 = "\udc9e"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)     // Catch: java.lang.Throwable -> L8a android.database.sqlite.SQLiteException -> L8c
            java.lang.String r3 = "\udc9d"
            java.lang.String r3 = com.flashget.parentalcontrol.ProtectedSandApp.s(r3)     // Catch: java.lang.Throwable -> L8a android.database.sqlite.SQLiteException -> L8c
            java.lang.String r4 = "\udc69"
            java.lang.String r4 = com.flashget.parentalcontrol.ProtectedSandApp.s(r4)     // Catch: java.lang.Throwable -> L8a android.database.sqlite.SQLiteException -> L8c
            java.lang.String r5 = "\udb9f"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)     // Catch: java.lang.Throwable -> L8a android.database.sqlite.SQLiteException -> L8c
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r5}     // Catch: java.lang.Throwable -> L8a android.database.sqlite.SQLiteException -> L8c
            java.lang.String r4 = "\udc43"
            java.lang.String r4 = com.flashget.parentalcontrol.ProtectedSandApp.s(r4)     // Catch: java.lang.Throwable -> L8a android.database.sqlite.SQLiteException -> L8c
            java.lang.String[] r5 = new java.lang.String[]{r11, r12}     // Catch: java.lang.Throwable -> L8a android.database.sqlite.SQLiteException -> L8c
            r7 = 0
            r8 = 0
            r6 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L8a android.database.sqlite.SQLiteException -> L8c
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteException -> L84
            if (r2 != 0) goto L48
            r1.close()
            return r0
        L48:
            r2 = 0
            long r7 = r1.getLong(r2)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteException -> L84
            r2 = 1
            java.lang.Object r9 = r10.zza(r1, r2)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteException -> L84
            if (r9 != 0) goto L58
            r1.close()
            return r0
        L58:
            r2 = 2
            java.lang.String r5 = r1.getString(r2)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteException -> L84
            com.google.android.gms.measurement.internal.zzop r2 = new com.google.android.gms.measurement.internal.zzop     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteException -> L84
            r3 = r2
            r4 = r11
            r6 = r12
            r3.<init>(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteException -> L84
            boolean r3 = r1.moveToNext()     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteException -> L84
            if (r3 == 0) goto L86
            com.google.android.gms.measurement.internal.zzgo r3 = r10.zzj()     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteException -> L84
            com.google.android.gms.measurement.internal.zzgq r3 = r3.zzg()     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteException -> L84
            java.lang.String r4 = "\udcd5"
            java.lang.String r4 = com.flashget.parentalcontrol.ProtectedSandApp.s(r4)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteException -> L84
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzgo.zza(r11)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteException -> L84
            r3.zza(r4, r5)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteException -> L84
            goto L86
        L81:
            r11 = move-exception
            r0 = r1
            goto Lb1
        L84:
            r2 = move-exception
            goto L8e
        L86:
            r1.close()
            return r2
        L8a:
            r11 = move-exception
            goto Lb1
        L8c:
            r2 = move-exception
            r1 = r0
        L8e:
            com.google.android.gms.measurement.internal.zzgo r3 = r10.zzj()     // Catch: java.lang.Throwable -> L81
            com.google.android.gms.measurement.internal.zzgq r3 = r3.zzg()     // Catch: java.lang.Throwable -> L81
            java.lang.String r4 = "\udcd6"
            java.lang.String r4 = com.flashget.parentalcontrol.ProtectedSandApp.s(r4)     // Catch: java.lang.Throwable -> L81
            java.lang.Object r11 = com.google.android.gms.measurement.internal.zzgo.zza(r11)     // Catch: java.lang.Throwable -> L81
            com.google.android.gms.measurement.internal.zzgh r5 = r10.zzi()     // Catch: java.lang.Throwable -> L81
            java.lang.String r12 = r5.zzc(r12)     // Catch: java.lang.Throwable -> L81
            r3.zza(r4, r11, r12, r2)     // Catch: java.lang.Throwable -> L81
            if (r1 == 0) goto Lb0
            r1.close()
        Lb0:
            return r0
        Lb1:
            if (r0 == 0) goto Lb6
            r0.close()
        Lb6:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zze(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzop");
    }

    public final void zzb(String str, zzje zzjeVar) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzjeVar);
        zzt();
        zzal();
        ContentValues contentValues = new ContentValues();
        String s4 = ProtectedSandApp.s("\udc16");
        contentValues.put(s4, str);
        contentValues.put(ProtectedSandApp.s("\udcc5"), zzjeVar.zzf());
        contentValues.put(ProtectedSandApp.s("\udc08"), Integer.valueOf(zzjeVar.zza()));
        zza(ProtectedSandApp.s("\udc88"), s4, contentValues);
    }

    private final boolean zzb(String str, List<Integer> list) {
        Preconditions.checkNotEmpty(str);
        zzal();
        zzt();
        SQLiteDatabase e_ = e_();
        try {
            long zzb2 = zzb(ProtectedSandApp.s("\udc3d"), new String[]{str});
            int max = Math.max(0, Math.min(2000, zze().zzb(str, zzbh.zzah)));
            if (zzb2 <= max) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < list.size(); i4++) {
                Integer num = list.get(i4);
                if (num == null) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            return e_.delete(ProtectedSandApp.s("\udc41"), d.a(ProtectedSandApp.s("\udc3f"), d.a(ProtectedSandApp.s("\udc39"), TextUtils.join(ProtectedSandApp.s("\udc3e"), arrayList), ProtectedSandApp.s("\udc3b")), ProtectedSandApp.s("\udc40")), new String[]{str, Integer.toString(max)}) > 0;
        } catch (SQLiteException e4) {
            zzj().zzg().zza(ProtectedSandApp.s("\udc42"), zzgo.zza(str), e4);
            return false;
        }
    }

    @n1
    @m1
    private final Object zza(Cursor cursor, int i4) {
        int type = cursor.getType(i4);
        if (type == 0) {
            zzj().zzg().zza(ProtectedSandApp.s("\udc12"));
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i4));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i4));
        }
        if (type == 3) {
            return cursor.getString(i4);
        }
        if (type != 4) {
            zzj().zzg().zza(ProtectedSandApp.s("\udc10"), Integer.valueOf(type));
            return null;
        }
        zzj().zzg().zza(ProtectedSandApp.s("\udc11"));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    @androidx.annotation.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final <T> T zza(java.lang.String r3, java.lang.String[] r4, com.google.android.gms.measurement.internal.zzau<T> r5) {
        /*
            r2 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r2.e_()     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33
            android.database.Cursor r3 = r1.rawQuery(r3, r4)     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33
            boolean r4 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L24 android.database.sqlite.SQLiteException -> L27
            if (r4 != 0) goto L29
            com.google.android.gms.measurement.internal.zzgo r4 = r2.zzj()     // Catch: java.lang.Throwable -> L24 android.database.sqlite.SQLiteException -> L27
            com.google.android.gms.measurement.internal.zzgq r4 = r4.zzp()     // Catch: java.lang.Throwable -> L24 android.database.sqlite.SQLiteException -> L27
            java.lang.String r5 = "\udc13"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)     // Catch: java.lang.Throwable -> L24 android.database.sqlite.SQLiteException -> L27
            r4.zza(r5)     // Catch: java.lang.Throwable -> L24 android.database.sqlite.SQLiteException -> L27
            r3.close()
            return r0
        L24:
            r4 = move-exception
            r0 = r3
            goto L4c
        L27:
            r4 = move-exception
            goto L35
        L29:
            java.lang.Object r4 = r5.zza(r3)     // Catch: java.lang.Throwable -> L24 android.database.sqlite.SQLiteException -> L27
            r3.close()
            return r4
        L31:
            r4 = move-exception
            goto L4c
        L33:
            r4 = move-exception
            r3 = r0
        L35:
            com.google.android.gms.measurement.internal.zzgo r5 = r2.zzj()     // Catch: java.lang.Throwable -> L24
            com.google.android.gms.measurement.internal.zzgq r5 = r5.zzg()     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = "\udc14"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)     // Catch: java.lang.Throwable -> L24
            r5.zza(r1, r4)     // Catch: java.lang.Throwable -> L24
            if (r3 == 0) goto L4b
            r3.close()
        L4b:
            return r0
        L4c:
            if (r0 == 0) goto L51
            r0.close()
        L51:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zza(java.lang.String, java.lang.String[], com.google.android.gms.measurement.internal.zzau):java.lang.Object");
    }

    final boolean zzb(String str, Bundle bundle) {
        zzt();
        zzal();
        byte[] zzca = g_().zza(new zzbc(this.zzu, "", str, ProtectedSandApp.s("\udcc6"), 0L, 0L, bundle)).zzca();
        zzj().zzp().zza(ProtectedSandApp.s("\udcc7"), zzi().zza(str), Integer.valueOf(zzca.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put(ProtectedSandApp.s("\udc16"), str);
        contentValues.put(ProtectedSandApp.s("\udcc8"), zzca);
        try {
            if (e_().insertWithOnConflict(ProtectedSandApp.s("\udcc9"), null, contentValues, 5) != -1) {
                return true;
            }
            zzj().zzg().zza(ProtectedSandApp.s("\udcca"), zzgo.zza(str));
            return false;
        } catch (SQLiteException e4) {
            zzj().zzg().zza(ProtectedSandApp.s("\udccb"), zzgo.zza(str), e4);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String zza(long r4) {
        /*
            r3 = this;
            r3.zzt()
            r3.zzal()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r3.e_()     // Catch: java.lang.Throwable -> L46 android.database.sqlite.SQLiteException -> L48
            java.lang.String r2 = "\udc5d"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)     // Catch: java.lang.Throwable -> L46 android.database.sqlite.SQLiteException -> L48
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L46 android.database.sqlite.SQLiteException -> L48
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L46 android.database.sqlite.SQLiteException -> L48
            android.database.Cursor r4 = r1.rawQuery(r2, r4)     // Catch: java.lang.Throwable -> L46 android.database.sqlite.SQLiteException -> L48
            boolean r5 = r4.moveToFirst()     // Catch: java.lang.Throwable -> L38 android.database.sqlite.SQLiteException -> L3b
            if (r5 != 0) goto L3d
            com.google.android.gms.measurement.internal.zzgo r5 = r3.zzj()     // Catch: java.lang.Throwable -> L38 android.database.sqlite.SQLiteException -> L3b
            com.google.android.gms.measurement.internal.zzgq r5 = r5.zzp()     // Catch: java.lang.Throwable -> L38 android.database.sqlite.SQLiteException -> L3b
            java.lang.String r1 = "\udc5e"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)     // Catch: java.lang.Throwable -> L38 android.database.sqlite.SQLiteException -> L3b
            r5.zza(r1)     // Catch: java.lang.Throwable -> L38 android.database.sqlite.SQLiteException -> L3b
            r4.close()
            return r0
        L38:
            r5 = move-exception
            r0 = r4
            goto L61
        L3b:
            r5 = move-exception
            goto L4a
        L3d:
            r5 = 0
            java.lang.String r5 = r4.getString(r5)     // Catch: java.lang.Throwable -> L38 android.database.sqlite.SQLiteException -> L3b
            r4.close()
            return r5
        L46:
            r5 = move-exception
            goto L61
        L48:
            r5 = move-exception
            r4 = r0
        L4a:
            com.google.android.gms.measurement.internal.zzgo r1 = r3.zzj()     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.measurement.internal.zzgq r1 = r1.zzg()     // Catch: java.lang.Throwable -> L38
            java.lang.String r2 = "\udc5f"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)     // Catch: java.lang.Throwable -> L38
            r1.zza(r2, r5)     // Catch: java.lang.Throwable -> L38
            if (r4 == 0) goto L60
            r4.close()
        L60:
            return r0
        L61:
            if (r0 == 0) goto L66
            r0.close()
        L66:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zza(long):java.lang.String");
    }

    @n1
    private final String zza(String str, String[] strArr, String str2) {
        Cursor cursor = null;
        try {
            try {
                cursor = e_().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    String string = cursor.getString(0);
                    cursor.close();
                    return string;
                }
                cursor.close();
                return str2;
            } catch (SQLiteException e4) {
                zzj().zzg().zza(ProtectedSandApp.s("\udc0f"), str, e4);
                throw e4;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @n1
    public final List<Pair<zzfy.zzk, Long>> zza(String str, int i4, int i5) {
        byte[] zzc2;
        String s4;
        long j4;
        long j5;
        zzt();
        zzal();
        int i6 = 1;
        Preconditions.checkArgument(i4 > 0);
        Preconditions.checkArgument(i5 > 0);
        Preconditions.checkNotEmpty(str);
        Cursor cursor = null;
        try {
            try {
                Cursor query = e_().query(ProtectedSandApp.s("\udc60"), new String[]{ProtectedSandApp.s("\udc61"), ProtectedSandApp.s("\udc23"), ProtectedSandApp.s("\udbfd")}, ProtectedSandApp.s("\udc46"), new String[]{str}, null, null, ProtectedSandApp.s("\udc61"), String.valueOf(i4));
                if (!query.moveToFirst()) {
                    List<Pair<zzfy.zzk, Long>> emptyList = Collections.emptyList();
                    query.close();
                    return emptyList;
                }
                ArrayList arrayList = new ArrayList();
                int i7 = 0;
                while (true) {
                    long j6 = query.getLong(0);
                    try {
                        zzc2 = g_().zzc(query.getBlob(i6));
                    } catch (IOException e4) {
                        zzj().zzg().zza(ProtectedSandApp.s("\udc64"), zzgo.zza(str), e4);
                    }
                    if (!arrayList.isEmpty() && zzc2.length + i7 > i5) {
                        break;
                    }
                    try {
                        zzfy.zzk.zza zzaVar = (zzfy.zzk.zza) zzoo.zza(zzfy.zzk.zzw(), zzc2);
                        if (!arrayList.isEmpty()) {
                            zzfy.zzk zzkVar = (zzfy.zzk) ((Pair) arrayList.get(0)).first;
                            zzfy.zzk zzkVar2 = (zzfy.zzk) ((com.google.android.gms.internal.measurement.zzjt) zzaVar.zzai());
                            if (!zzkVar.zzae().equals(zzkVar2.zzae()) || !zzkVar.zzad().equals(zzkVar2.zzad()) || zzkVar.zzau() != zzkVar2.zzau() || !zzkVar.zzaf().equals(zzkVar2.zzaf())) {
                                break;
                            }
                            Iterator<zzfy.zzo> it = zzkVar.zzas().iterator();
                            while (true) {
                                boolean hasNext = it.hasNext();
                                s4 = ProtectedSandApp.s("\udc62");
                                j4 = -1;
                                if (!hasNext) {
                                    j5 = -1;
                                    break;
                                }
                                zzfy.zzo next = it.next();
                                if (s4.equals(next.zzg())) {
                                    j5 = next.zzc();
                                    break;
                                }
                            }
                            Iterator<zzfy.zzo> it2 = zzkVar2.zzas().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                zzfy.zzo next2 = it2.next();
                                if (s4.equals(next2.zzg())) {
                                    j4 = next2.zzc();
                                    break;
                                }
                            }
                            if (j5 != j4) {
                                break;
                            }
                        }
                        if (!query.isNull(2)) {
                            zzaVar.zzi(query.getInt(2));
                        }
                        i7 += zzc2.length;
                        arrayList.add(Pair.create((zzfy.zzk) ((com.google.android.gms.internal.measurement.zzjt) zzaVar.zzai()), Long.valueOf(j6)));
                    } catch (IOException e5) {
                        zzj().zzg().zza(ProtectedSandApp.s("\udc63"), zzgo.zza(str), e5);
                    }
                    if (!query.moveToNext() || i7 > i5) {
                        break;
                    }
                    i6 = 1;
                }
                query.close();
                return arrayList;
            } catch (SQLiteException e6) {
                zzj().zzg().zza(ProtectedSandApp.s("\udc65"), zzgo.zza(str), e6);
                List<Pair<zzfy.zzk, Long>> emptyList2 = Collections.emptyList();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyList2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    @n1
    public final List<zzae> zza(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        zzt();
        zzal();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("\udc46"));
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(ProtectedSandApp.s("\udc66"));
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(str3 + ProtectedSandApp.s("\udc67"));
            sb.append(ProtectedSandApp.s("\udc68"));
        }
        return zza(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0090, code lost:
    
        zzj().zzg().zza(com.flashget.parentalcontrol.ProtectedSandApp.s("\udc74"), 1000);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.measurement.internal.zzae> zza(java.lang.String r27, java.lang.String[] r28) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zza(java.lang.String, java.lang.String[]):java.util.List");
    }

    public final void zza(String str, Bundle bundle) {
        Preconditions.checkNotNull(bundle);
        zzt();
        zzal();
        zzar zzarVar = new zzar(this, str);
        for (List<zzap> zza2 = zzarVar.zza(); !zza2.isEmpty(); zza2 = zzarVar.zza()) {
            for (zzap zzapVar : zza2) {
                zzoo g_ = g_();
                zzfy.zzf zzfVar = zzapVar.zzd;
                Bundle bundle2 = new Bundle();
                for (zzfy.zzh zzhVar : zzfVar.zzh()) {
                    if (zzhVar.zzj()) {
                        bundle2.putDouble(zzhVar.zzg(), zzhVar.zza());
                    } else if (zzhVar.zzk()) {
                        bundle2.putFloat(zzhVar.zzg(), zzhVar.zzb());
                    } else if (zzhVar.zzl()) {
                        bundle2.putLong(zzhVar.zzg(), zzhVar.zzd());
                    } else if (zzhVar.zzn()) {
                        bundle2.putString(zzhVar.zzg(), zzhVar.zzh());
                    } else if (!zzhVar.zzi().isEmpty()) {
                        bundle2.putParcelableArray(zzhVar.zzg(), zzoo.zzb(zzhVar.zzi()));
                    } else {
                        g_.zzj().zzg().zza(ProtectedSandApp.s("\udc86"), zzhVar);
                    }
                }
                String s4 = ProtectedSandApp.s("\udc87");
                String string = bundle2.getString(s4);
                bundle2.remove(s4);
                String zzg = zzfVar.zzg();
                if (string == null) {
                    string = "";
                }
                zzgs zzgsVar = new zzgs(zzg, string, bundle2, zzfVar.zzd());
                zzq().zza(zzgsVar.zzc, bundle);
                zza(zzapVar.zza, new zzbc(this.zzu, zzgsVar.zzb, str, zzapVar.zzd.zzg(), zzapVar.zzd.zzd(), zzapVar.zzd.zzc(), zzgsVar.zzc), zzapVar.zzb, zzapVar.zzc);
            }
        }
    }

    @n1
    @m1
    final void zza(List<Long> list) {
        zzt();
        zzal();
        Preconditions.checkNotNull(list);
        Preconditions.checkNotZero(list.size());
        if (zzaa()) {
            String a5 = d.a(ProtectedSandApp.s("\udc39"), TextUtils.join(ProtectedSandApp.s("\udc3e"), list), ProtectedSandApp.s("\udc3b"));
            if (zzb(d.a(ProtectedSandApp.s("\udc8d"), a5, ProtectedSandApp.s("\udc81")), (String[]) null) > 0) {
                zzj().zzu().zza(ProtectedSandApp.s("\udc82"));
            }
            try {
                e_().execSQL(ProtectedSandApp.s("\udc8e") + a5 + ProtectedSandApp.s("\udc8f"));
            } catch (SQLiteException e4) {
                zzj().zzg().zza(ProtectedSandApp.s("\udc85"), e4);
            }
        }
    }

    @n1
    final void zza(Long l4) {
        zzt();
        zzal();
        Preconditions.checkNotNull(l4);
        if ((!zzpu.zza() || zze().zza(zzbh.zzcb)) && zzaa()) {
            if (zzb(ProtectedSandApp.s("\udc80") + l4 + ProtectedSandApp.s("\udc81"), (String[]) null) > 0) {
                zzj().zzu().zza(ProtectedSandApp.s("\udc82"));
            }
            try {
                e_().execSQL(ProtectedSandApp.s("\udc83") + l4 + ProtectedSandApp.s("\udc84"));
            } catch (SQLiteException e4) {
                zzj().zzg().zza(ProtectedSandApp.s("\udc85"), e4);
            }
        }
    }

    @n1
    private static void zza(ContentValues contentValues, String str, Object obj) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else {
            if (obj instanceof Double) {
                contentValues.put(str, (Double) obj);
                return;
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("\udc15"));
        }
    }

    @n1
    final void zza(String str, List<zzfo.zza> list) {
        boolean z4;
        boolean z5;
        String s4 = ProtectedSandApp.s("\udc89");
        String s5 = ProtectedSandApp.s("\udc2c");
        String s6 = ProtectedSandApp.s("\udc46");
        String s7 = ProtectedSandApp.s("\udc31");
        Preconditions.checkNotNull(list);
        for (int i4 = 0; i4 < list.size(); i4++) {
            zzfo.zza.C0791zza zzcd = list.get(i4).zzcd();
            if (zzcd.zza() != 0) {
                for (int i5 = 0; i5 < zzcd.zza(); i5++) {
                    zzfo.zzb.zza zzcd2 = zzcd.zza(i5).zzcd();
                    zzfo.zzb.zza zzaVar = (zzfo.zzb.zza) ((zzjt.zzb) zzcd2.clone());
                    String zzb2 = zzji.zzb(zzcd2.zzb());
                    if (zzb2 != null) {
                        zzaVar.zza(zzb2);
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    for (int i6 = 0; i6 < zzcd2.zza(); i6++) {
                        zzfo.zzc zza2 = zzcd2.zza(i6);
                        String zza3 = zzjk.zza(zza2.zze());
                        if (zza3 != null) {
                            zzaVar.zza(i6, (zzfo.zzc) ((com.google.android.gms.internal.measurement.zzjt) zza2.zzcd().zza(zza3).zzai()));
                            z5 = true;
                        }
                    }
                    if (z5) {
                        zzfo.zza.C0791zza zza4 = zzcd.zza(i5, zzaVar);
                        list.set(i4, (zzfo.zza) ((com.google.android.gms.internal.measurement.zzjt) zza4.zzai()));
                        zzcd = zza4;
                    }
                }
            }
            if (zzcd.zzb() != 0) {
                for (int i7 = 0; i7 < zzcd.zzb(); i7++) {
                    zzfo.zze zzb3 = zzcd.zzb(i7);
                    String zza5 = zzjj.zza(zzb3.zze());
                    if (zza5 != null) {
                        zzcd = zzcd.zza(i7, zzb3.zzcd().zza(zza5));
                        list.set(i4, (zzfo.zza) ((com.google.android.gms.internal.measurement.zzjt) zzcd.zzai()));
                    }
                }
            }
        }
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        SQLiteDatabase e_ = e_();
        e_.beginTransaction();
        try {
            zzal();
            zzt();
            Preconditions.checkNotEmpty(str);
            SQLiteDatabase e_2 = e_();
            e_2.delete(s7, s6, new String[]{str});
            e_2.delete(s5, s6, new String[]{str});
            for (zzfo.zza zzaVar2 : list) {
                zzal();
                zzt();
                Preconditions.checkNotEmpty(str);
                Preconditions.checkNotNull(zzaVar2);
                if (!zzaVar2.zzg()) {
                    zzj().zzu().zza(ProtectedSandApp.s("\udc8a"), zzgo.zza(str));
                } else {
                    int zza6 = zzaVar2.zza();
                    Iterator<zzfo.zzb> it = zzaVar2.zze().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!it.next().zzl()) {
                                zzj().zzu().zza(ProtectedSandApp.s("\udc8b"), zzgo.zza(str), Integer.valueOf(zza6));
                                break;
                            }
                        } else {
                            Iterator<zzfo.zze> it2 = zzaVar2.zzf().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (!it2.next().zzi()) {
                                        zzj().zzu().zza(ProtectedSandApp.s("\udc8c"), zzgo.zza(str), Integer.valueOf(zza6));
                                        break;
                                    }
                                } else {
                                    Iterator<zzfo.zzb> it3 = zzaVar2.zze().iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            if (!zza(str, zza6, it3.next())) {
                                                z4 = false;
                                                break;
                                            }
                                        } else {
                                            z4 = true;
                                            break;
                                        }
                                    }
                                    if (z4) {
                                        Iterator<zzfo.zze> it4 = zzaVar2.zzf().iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                if (!zza(str, zza6, it4.next())) {
                                                    z4 = false;
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                    }
                                    if (!z4) {
                                        zzal();
                                        zzt();
                                        Preconditions.checkNotEmpty(str);
                                        SQLiteDatabase e_3 = e_();
                                        e_3.delete(s7, s4, new String[]{str, String.valueOf(zza6)});
                                        e_3.delete(s5, s4, new String[]{str, String.valueOf(zza6)});
                                    }
                                }
                            }
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (zzfo.zza zzaVar3 : list) {
                arrayList.add(zzaVar3.zzg() ? Integer.valueOf(zzaVar3.zza()) : null);
            }
            zzb(str, arrayList);
            e_.setTransactionSuccessful();
            e_.endTransaction();
        } catch (Throwable th) {
            e_.endTransaction();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x004f, code lost:
    
        if (r7.zzg.zzb(r0).zza(com.google.android.gms.measurement.internal.zzje.zza.zzb) != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0389  */
    @androidx.annotation.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(com.google.android.gms.measurement.internal.zzg r8, boolean r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 1045
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zza(com.google.android.gms.measurement.internal.zzg, boolean, boolean):void");
    }

    public final void zza(String str, zzax zzaxVar) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzaxVar);
        zzt();
        zzal();
        if (zze().zza(zzbh.zzcr)) {
            zzje zzi2 = zzi(str);
            zzje zzjeVar = zzje.zza;
            if (zzi2 == zzjeVar) {
                zzb(str, zzjeVar);
            }
        }
        ContentValues contentValues = new ContentValues();
        String s4 = ProtectedSandApp.s("\udc16");
        contentValues.put(s4, str);
        contentValues.put(ProtectedSandApp.s("\udc0a"), zzaxVar.zzf());
        zza(ProtectedSandApp.s("\udc88"), s4, contentValues);
    }

    @n1
    public final void zza(zzbb zzbbVar) {
        zza(ProtectedSandApp.s("\udc76"), zzbbVar);
    }

    @n1
    private final void zza(String str, zzbb zzbbVar) {
        Preconditions.checkNotNull(zzbbVar);
        zzt();
        zzal();
        ContentValues contentValues = new ContentValues();
        contentValues.put(ProtectedSandApp.s("\udc16"), zzbbVar.zza);
        contentValues.put(ProtectedSandApp.s("\udc17"), zzbbVar.zzb);
        contentValues.put(ProtectedSandApp.s("\udc18"), Long.valueOf(zzbbVar.zzc));
        contentValues.put(ProtectedSandApp.s("\udc19"), Long.valueOf(zzbbVar.zzd));
        contentValues.put(ProtectedSandApp.s("\udc1a"), Long.valueOf(zzbbVar.zzf));
        contentValues.put(ProtectedSandApp.s("\udb95"), Long.valueOf(zzbbVar.zzg));
        contentValues.put(ProtectedSandApp.s("\udb97"), zzbbVar.zzh);
        contentValues.put(ProtectedSandApp.s("\udb99"), zzbbVar.zzi);
        contentValues.put(ProtectedSandApp.s("\udb9b"), zzbbVar.zzj);
        contentValues.put(ProtectedSandApp.s("\udb93"), Long.valueOf(zzbbVar.zze));
        Boolean bool = zzbbVar.zzk;
        contentValues.put(ProtectedSandApp.s("\udb9d"), (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (e_().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                zzj().zzg().zza(ProtectedSandApp.s("\udc1b"), zzgo.zza(zzbbVar.zza));
            }
        } catch (SQLiteException e4) {
            zzj().zzg().zza(ProtectedSandApp.s("\udc1c"), zzgo.zza(zzbbVar.zza), e4);
        }
    }

    @n1
    private final void zza(String str, String str2, ContentValues contentValues) {
        try {
            SQLiteDatabase e_ = e_();
            if (contentValues.getAsString(str2) == null) {
                zzj().zzm().zza(ProtectedSandApp.s("\udc1d"), zzgo.zza(str2));
                return;
            }
            if (e_.update(str, contentValues, str2 + ProtectedSandApp.s("\udc1e"), new String[]{r1}) == 0 && e_.insertWithOnConflict(str, null, contentValues, 5) == -1) {
                zzj().zzg().zza(ProtectedSandApp.s("\udc1f"), zzgo.zza(str), zzgo.zza(str2));
            }
        } catch (SQLiteException e4) {
            zzj().zzg().zza(ProtectedSandApp.s("\udc20"), zzgo.zza(str), zzgo.zza(str2), e4);
        }
    }

    public final void zza(String str, zzje zzjeVar) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzjeVar);
        zzt();
        zzal();
        zzb(str, zzi(str));
        ContentValues contentValues = new ContentValues();
        String s4 = ProtectedSandApp.s("\udc16");
        contentValues.put(s4, str);
        contentValues.put(ProtectedSandApp.s("\udc06"), zzjeVar.zzf());
        zza(ProtectedSandApp.s("\udc88"), s4, contentValues);
    }

    @n1
    public final boolean zza(zzfy.zzk zzkVar, boolean z4) {
        zzt();
        zzal();
        Preconditions.checkNotNull(zzkVar);
        Preconditions.checkNotEmpty(zzkVar.zzz());
        Preconditions.checkState(zzkVar.zzbj());
        zzv();
        long currentTimeMillis = zzb().currentTimeMillis();
        if (zzkVar.zzm() < currentTimeMillis - zzag.zzm() || zzkVar.zzm() > zzag.zzm() + currentTimeMillis) {
            zzj().zzu().zza(ProtectedSandApp.s("\udc90"), zzgo.zza(zzkVar.zzz()), Long.valueOf(currentTimeMillis), Long.valueOf(zzkVar.zzm()));
        }
        try {
            byte[] zzb2 = g_().zzb(zzkVar.zzca());
            zzj().zzp().zza(ProtectedSandApp.s("\udc91"), Integer.valueOf(zzb2.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put(ProtectedSandApp.s("\udc16"), zzkVar.zzz());
            contentValues.put(ProtectedSandApp.s("\udc92"), Long.valueOf(zzkVar.zzm()));
            contentValues.put(ProtectedSandApp.s("\udc23"), zzb2);
            contentValues.put(ProtectedSandApp.s("\udbff"), Integer.valueOf(z4 ? 1 : 0));
            if (zzkVar.zzbq()) {
                contentValues.put(ProtectedSandApp.s("\udbfd"), Integer.valueOf(zzkVar.zzg()));
            }
            try {
                if (e_().insert(ProtectedSandApp.s("\udc60"), null, contentValues) != -1) {
                    return true;
                }
                zzj().zzg().zza(ProtectedSandApp.s("\udc93"), zzgo.zza(zzkVar.zzz()));
                return false;
            } catch (SQLiteException e4) {
                zzj().zzg().zza(ProtectedSandApp.s("\udc94"), zzgo.zza(zzkVar.zzz()), e4);
                return false;
            }
        } catch (IOException e5) {
            zzj().zzg().zza(ProtectedSandApp.s("\udc95"), zzgo.zza(zzkVar.zzz()), e5);
            return false;
        }
    }

    @n1
    private final boolean zza(String str, int i4, zzfo.zzb zzbVar) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzbVar);
        if (zzbVar.zzf().isEmpty()) {
            zzj().zzu().zza(ProtectedSandApp.s("\udc28"), zzgo.zza(str), Integer.valueOf(i4), String.valueOf(zzbVar.zzl() ? Integer.valueOf(zzbVar.zzb()) : null));
            return false;
        }
        byte[] zzca = zzbVar.zzca();
        ContentValues contentValues = new ContentValues();
        contentValues.put(ProtectedSandApp.s("\udc16"), str);
        contentValues.put(ProtectedSandApp.s("\udc29"), Integer.valueOf(i4));
        contentValues.put(ProtectedSandApp.s("\udc2a"), zzbVar.zzl() ? Integer.valueOf(zzbVar.zzb()) : null);
        contentValues.put(ProtectedSandApp.s("\udc2b"), zzbVar.zzf());
        contentValues.put(ProtectedSandApp.s("\udc02"), zzbVar.zzm() ? Boolean.valueOf(zzbVar.zzj()) : null);
        contentValues.put(ProtectedSandApp.s("\udc23"), zzca);
        try {
            if (e_().insertWithOnConflict(ProtectedSandApp.s("\udc2c"), null, contentValues, 5) != -1) {
                return true;
            }
            zzj().zzg().zza(ProtectedSandApp.s("\udc2d"), zzgo.zza(str));
            return true;
        } catch (SQLiteException e4) {
            zzj().zzg().zza(ProtectedSandApp.s("\udc2e"), zzgo.zza(str), e4);
            return false;
        }
    }

    @n1
    private final boolean zza(String str, int i4, zzfo.zze zzeVar) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzeVar);
        if (zzeVar.zze().isEmpty()) {
            zzj().zzu().zza(ProtectedSandApp.s("\udc2f"), zzgo.zza(str), Integer.valueOf(i4), String.valueOf(zzeVar.zzi() ? Integer.valueOf(zzeVar.zza()) : null));
            return false;
        }
        byte[] zzca = zzeVar.zzca();
        ContentValues contentValues = new ContentValues();
        contentValues.put(ProtectedSandApp.s("\udc16"), str);
        contentValues.put(ProtectedSandApp.s("\udc29"), Integer.valueOf(i4));
        contentValues.put(ProtectedSandApp.s("\udc2a"), zzeVar.zzi() ? Integer.valueOf(zzeVar.zza()) : null);
        contentValues.put(ProtectedSandApp.s("\udc30"), zzeVar.zze());
        contentValues.put(ProtectedSandApp.s("\udc02"), zzeVar.zzj() ? Boolean.valueOf(zzeVar.zzh()) : null);
        contentValues.put(ProtectedSandApp.s("\udc23"), zzca);
        try {
            if (e_().insertWithOnConflict(ProtectedSandApp.s("\udc31"), null, contentValues, 5) != -1) {
                return true;
            }
            zzj().zzg().zza(ProtectedSandApp.s("\udc32"), zzgo.zza(str));
            return false;
        } catch (SQLiteException e4) {
            zzj().zzg().zza(ProtectedSandApp.s("\udc33"), zzgo.zza(str), e4);
            return false;
        }
    }

    public final boolean zza(zzbc zzbcVar, long j4, boolean z4) {
        zzt();
        zzal();
        Preconditions.checkNotNull(zzbcVar);
        Preconditions.checkNotEmpty(zzbcVar.zza);
        byte[] zzca = g_().zza(zzbcVar).zzca();
        ContentValues contentValues = new ContentValues();
        contentValues.put(ProtectedSandApp.s("\udc16"), zzbcVar.zza);
        contentValues.put(ProtectedSandApp.s("\udc17"), zzbcVar.zzb);
        contentValues.put(ProtectedSandApp.s("\udc21"), Long.valueOf(zzbcVar.zzd));
        contentValues.put(ProtectedSandApp.s("\udc22"), Long.valueOf(j4));
        contentValues.put(ProtectedSandApp.s("\udc23"), zzca);
        contentValues.put(ProtectedSandApp.s("\udbfb"), Integer.valueOf(z4 ? 1 : 0));
        try {
            if (e_().insert(ProtectedSandApp.s("\udc24"), null, contentValues) != -1) {
                return true;
            }
            zzj().zzg().zza(ProtectedSandApp.s("\udc99"), zzgo.zza(zzbcVar.zza));
            return false;
        } catch (SQLiteException e4) {
            zzj().zzg().zza(ProtectedSandApp.s("\udc9a"), zzgo.zza(zzbcVar.zza), e4);
            return false;
        }
    }

    @n1
    public final boolean zza(String str, zzno zznoVar) {
        zzt();
        zzal();
        Preconditions.checkNotNull(zznoVar);
        Preconditions.checkNotEmpty(str);
        long currentTimeMillis = zzb().currentTimeMillis();
        long j4 = zznoVar.zzb;
        zzfz<Long> zzfzVar = zzbh.zzbh;
        if (j4 < currentTimeMillis - zzfzVar.zza(null).longValue() || zznoVar.zzb > zzfzVar.zza(null).longValue() + currentTimeMillis) {
            zzj().zzu().zza(ProtectedSandApp.s("\udcab"), zzgo.zza(str), Long.valueOf(currentTimeMillis), Long.valueOf(zznoVar.zzb));
        }
        zzj().zzp().zza(ProtectedSandApp.s("\udcac"));
        ContentValues contentValues = new ContentValues();
        contentValues.put(ProtectedSandApp.s("\udc16"), str);
        contentValues.put(ProtectedSandApp.s("\udcad"), zznoVar.zza);
        contentValues.put(ProtectedSandApp.s("\udcae"), Integer.valueOf(zznoVar.zzc));
        contentValues.put(ProtectedSandApp.s("\udcaf"), Long.valueOf(zznoVar.zzb));
        try {
            if (e_().insert(ProtectedSandApp.s("\udcb0"), null, contentValues) != -1) {
                return true;
            }
            zzj().zzg().zza(ProtectedSandApp.s("\udcb1"), zzgo.zza(str));
            return false;
        } catch (SQLiteException e4) {
            zzj().zzg().zza(ProtectedSandApp.s("\udcb2"), zzgo.zza(str), e4);
            return false;
        }
    }

    @n1
    public final boolean zza(String str, zzfy.zzj zzjVar, String str2, Map<String, String> map, zznt zzntVar) {
        int delete;
        zzt();
        zzal();
        Preconditions.checkNotNull(zzjVar);
        Preconditions.checkNotEmpty(str);
        if (zzpu.zza() && !zze().zza(zzbh.zzcb)) {
            return false;
        }
        zzt();
        zzal();
        boolean zzaa = zzaa();
        String s4 = ProtectedSandApp.s("\udca1");
        if (zzaa) {
            long zza2 = zzn().zzb.zza();
            long elapsedRealtime = zzb().elapsedRealtime();
            if (Math.abs(elapsedRealtime - zza2) > zzag.zzn()) {
                zzn().zzb.zza(elapsedRealtime);
                zzt();
                zzal();
                if (zzaa() && (delete = e_().delete(s4, zzao(), new String[0])) > 0) {
                    zzj().zzp().zza(ProtectedSandApp.s("\udca2"), Integer.valueOf(delete));
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(entry.getKey() + ProtectedSandApp.s("\udca3") + entry.getValue());
        }
        byte[] zzca = zzjVar.zzca();
        ContentValues contentValues = new ContentValues();
        contentValues.put(ProtectedSandApp.s("\udc16"), str);
        contentValues.put(ProtectedSandApp.s("\udca4"), zzca);
        contentValues.put(ProtectedSandApp.s("\udca5"), str2);
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        if (size > 0) {
            sb.append((CharSequence) arrayList.get(0));
            int i4 = 1;
            while (i4 < size) {
                sb.append((CharSequence) ProtectedSandApp.s("\udca6"));
                Object obj = arrayList.get(i4);
                i4++;
                sb.append((CharSequence) obj);
            }
        }
        contentValues.put(ProtectedSandApp.s("\udca7"), sb.toString());
        contentValues.put(ProtectedSandApp.s("\udca8"), Integer.valueOf(zzntVar.zza()));
        contentValues.put(ProtectedSandApp.s("\udc6e"), Long.valueOf(zzb().currentTimeMillis()));
        contentValues.put(ProtectedSandApp.s("\udbfd"), (Integer) 0);
        try {
            if (e_().insert(s4, null, contentValues) != -1) {
                return true;
            }
            zzj().zzg().zza(ProtectedSandApp.s("\udca9"), str);
            return false;
        } catch (SQLiteException e4) {
            zzj().zzg().zza(ProtectedSandApp.s("\udcaa"), str, e4);
            return false;
        }
    }

    public final boolean zza(String str, Long l4, long j4, zzfy.zzf zzfVar) {
        zzt();
        zzal();
        Preconditions.checkNotNull(zzfVar);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(l4);
        byte[] zzca = zzfVar.zzca();
        zzj().zzp().zza(ProtectedSandApp.s("\udcb3"), zzi().zza(str), Integer.valueOf(zzca.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put(ProtectedSandApp.s("\udc16"), str);
        contentValues.put(ProtectedSandApp.s("\udcb4"), l4);
        contentValues.put(ProtectedSandApp.s("\udcb5"), Long.valueOf(j4));
        contentValues.put(ProtectedSandApp.s("\udcb6"), zzca);
        try {
            if (e_().insertWithOnConflict(ProtectedSandApp.s("\udcb7"), null, contentValues, 5) != -1) {
                return true;
            }
            zzj().zzg().zza(ProtectedSandApp.s("\udcb8"), zzgo.zza(str));
            return false;
        } catch (SQLiteException e4) {
            zzj().zzg().zza(ProtectedSandApp.s("\udcb9"), zzgo.zza(str), e4);
            return false;
        }
    }

    @n1
    public final boolean zza(zzae zzaeVar) {
        Preconditions.checkNotNull(zzaeVar);
        zzt();
        zzal();
        String str = zzaeVar.zza;
        Preconditions.checkNotNull(str);
        if (zze(str, zzaeVar.zzc.zza) == null && zzb(ProtectedSandApp.s("\udc96"), new String[]{str}) >= 1000) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(ProtectedSandApp.s("\udc16"), str);
        contentValues.put(ProtectedSandApp.s("\udb9f"), zzaeVar.zzb);
        contentValues.put(ProtectedSandApp.s("\udc17"), zzaeVar.zzc.zza);
        zza(contentValues, ProtectedSandApp.s("\udc69"), Preconditions.checkNotNull(zzaeVar.zzc.zza()));
        contentValues.put(ProtectedSandApp.s("\udc6a"), Boolean.valueOf(zzaeVar.zze));
        contentValues.put(ProtectedSandApp.s("\udc6b"), zzaeVar.zzf);
        contentValues.put(ProtectedSandApp.s("\udc6c"), Long.valueOf(zzaeVar.zzh));
        zzq();
        contentValues.put(ProtectedSandApp.s("\udc6d"), zzos.zza((Parcelable) zzaeVar.zzg));
        contentValues.put(ProtectedSandApp.s("\udc6e"), Long.valueOf(zzaeVar.zzd));
        zzq();
        contentValues.put(ProtectedSandApp.s("\udc6f"), zzos.zza((Parcelable) zzaeVar.zzi));
        contentValues.put(ProtectedSandApp.s("\udc70"), Long.valueOf(zzaeVar.zzc.zzb));
        contentValues.put(ProtectedSandApp.s("\udc71"), Long.valueOf(zzaeVar.zzj));
        zzq();
        contentValues.put(ProtectedSandApp.s("\udc72"), zzos.zza((Parcelable) zzaeVar.zzk));
        try {
            if (e_().insertWithOnConflict(ProtectedSandApp.s("\udc4f"), null, contentValues, 5) != -1) {
                return true;
            }
            zzj().zzg().zza(ProtectedSandApp.s("\udc97"), zzgo.zza(str));
            return true;
        } catch (SQLiteException e4) {
            zzj().zzg().zza(ProtectedSandApp.s("\udc98"), zzgo.zza(str), e4);
            return true;
        }
    }

    private final boolean zza(long j4, zzbc zzbcVar, long j5, boolean z4) {
        zzt();
        zzal();
        Preconditions.checkNotNull(zzbcVar);
        Preconditions.checkNotEmpty(zzbcVar.zza);
        byte[] zzca = g_().zza(zzbcVar).zzca();
        ContentValues contentValues = new ContentValues();
        contentValues.put(ProtectedSandApp.s("\udc16"), zzbcVar.zza);
        contentValues.put(ProtectedSandApp.s("\udc17"), zzbcVar.zzb);
        contentValues.put(ProtectedSandApp.s("\udc21"), Long.valueOf(zzbcVar.zzd));
        contentValues.put(ProtectedSandApp.s("\udc22"), Long.valueOf(j5));
        contentValues.put(ProtectedSandApp.s("\udc23"), zzca);
        contentValues.put(ProtectedSandApp.s("\udbfb"), Integer.valueOf(z4 ? 1 : 0));
        try {
            long update = e_().update(ProtectedSandApp.s("\udc24"), contentValues, ProtectedSandApp.s("\udc25"), new String[]{String.valueOf(j4)});
            if (update == 1) {
                return true;
            }
            zzj().zzg().zza(ProtectedSandApp.s("\udc26"), zzgo.zza(zzbcVar.zza), Long.valueOf(update));
            return false;
        } catch (SQLiteException e4) {
            zzj().zzg().zza(ProtectedSandApp.s("\udc27"), zzgo.zza(zzbcVar.zza), e4);
            return false;
        }
    }

    @n1
    public final boolean zza(zzop zzopVar) {
        Preconditions.checkNotNull(zzopVar);
        zzt();
        zzal();
        if (zze(zzopVar.zza, zzopVar.zzc) == null) {
            if (zzos.zzh(zzopVar.zzc)) {
                if (zzb(ProtectedSandApp.s("\udc9b"), new String[]{zzopVar.zza}) >= zze().zza(zzopVar.zza, zzbh.zzai, 25, 100)) {
                    return false;
                }
            } else if (!ProtectedSandApp.s("\udc62").equals(zzopVar.zzc)) {
                if (zzb(ProtectedSandApp.s("\udc9c"), new String[]{zzopVar.zza, zzopVar.zzb}) >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(ProtectedSandApp.s("\udc16"), zzopVar.zza);
        contentValues.put(ProtectedSandApp.s("\udb9f"), zzopVar.zzb);
        contentValues.put(ProtectedSandApp.s("\udc17"), zzopVar.zzc);
        contentValues.put(ProtectedSandApp.s("\udc9d"), Long.valueOf(zzopVar.zzd));
        zza(contentValues, ProtectedSandApp.s("\udc69"), zzopVar.zze);
        try {
            if (e_().insertWithOnConflict(ProtectedSandApp.s("\udc9e"), null, contentValues, 5) != -1) {
                return true;
            }
            zzj().zzg().zza(ProtectedSandApp.s("\udc9f"), zzgo.zza(zzopVar.zza));
            return true;
        } catch (SQLiteException e4) {
            zzj().zzg().zza(ProtectedSandApp.s("\udca0"), zzgo.zza(zzopVar.zza), e4);
            return true;
        }
    }
}
