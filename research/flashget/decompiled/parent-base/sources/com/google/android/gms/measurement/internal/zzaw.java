package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.annotation.n1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzaw {
    @n1
    private static Set<String> zza(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        Cursor rawQuery = sQLiteDatabase.rawQuery(ProtectedSandApp.s("\udd46") + str + ProtectedSandApp.s("\udd47"), null);
        try {
            Collections.addAll(hashSet, rawQuery.getColumnNames());
            return hashSet;
        } finally {
            rawQuery.close();
        }
    }

    @n1
    static void zza(zzgo zzgoVar, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) throws SQLiteException {
        if (zzgoVar != null) {
            if (!zza(zzgoVar, sQLiteDatabase, str)) {
                sQLiteDatabase.execSQL(str2);
            }
            try {
                Set<String> zza = zza(sQLiteDatabase, str);
                for (String str4 : str3.split(ProtectedSandApp.s("\udd4d"))) {
                    if (!zza.remove(str4)) {
                        throw new SQLiteException(ProtectedSandApp.s("\udd4e") + str + ProtectedSandApp.s("\udd4f") + str4);
                    }
                }
                if (strArr != null) {
                    for (int i4 = 0; i4 < strArr.length; i4 += 2) {
                        if (!zza.remove(strArr[i4])) {
                            sQLiteDatabase.execSQL(strArr[i4 + 1]);
                        }
                    }
                }
                if (zza.isEmpty()) {
                    return;
                }
                zzgoVar.zzu().zza(ProtectedSandApp.s("\udd50"), str, TextUtils.join(ProtectedSandApp.s("\udd51"), zza));
                return;
            } catch (SQLiteException e4) {
                zzgoVar.zzg().zza(ProtectedSandApp.s("\udd52"), str);
                throw e4;
            }
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("\udd4c"));
    }

    static void zza(zzgo zzgoVar, SQLiteDatabase sQLiteDatabase) {
        if (zzgoVar != null) {
            File file = new File(com.google.android.gms.internal.measurement.zzcf.zza().zza(sQLiteDatabase.getPath()));
            if (!file.setReadable(false, false)) {
                zzgoVar.zzu().zza(ProtectedSandApp.s("\udd48"));
            }
            if (!file.setWritable(false, false)) {
                zzgoVar.zzu().zza(ProtectedSandApp.s("\udd49"));
            }
            if (!file.setReadable(true, true)) {
                zzgoVar.zzu().zza(ProtectedSandApp.s("\udd4a"));
            }
            if (file.setWritable(true, true)) {
                return;
            }
            zzgoVar.zzu().zza(ProtectedSandApp.s("\udd4b"));
            return;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("\udd4c"));
    }

    @n1
    private static boolean zza(zzgo zzgoVar, SQLiteDatabase sQLiteDatabase, String str) {
        if (zzgoVar != null) {
            Cursor cursor = null;
            try {
                try {
                    cursor = sQLiteDatabase.query(ProtectedSandApp.s("\udd53"), new String[]{ProtectedSandApp.s("\udd54")}, ProtectedSandApp.s("\udd55"), new String[]{str}, null, null, null);
                    boolean moveToFirst = cursor.moveToFirst();
                    cursor.close();
                    return moveToFirst;
                } catch (SQLiteException e4) {
                    zzgoVar.zzu().zza(ProtectedSandApp.s("\udd56"), str, e4);
                    if (cursor == null) {
                        return false;
                    }
                    cursor.close();
                    return false;
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("\udd4c"));
    }
}
