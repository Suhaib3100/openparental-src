package com.tencent.beacon.d;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.a.d.a;
import com.tencent.beacon.module.ModuleName;
import com.tencent.beacon.module.StrategyModule;
import java.util.Locale;

/* compiled from: StrategyUtils.java */
/* loaded from: classes6.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private static String f71453a;

    /* compiled from: StrategyUtils.java */
    public static class a extends SQLiteOpenHelper {
        public a(@q0 Context context, @q0 String str) {
            super(context, TextUtils.isEmpty(str) ? ProtectedSandApp.s("㉏\u0001") : androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("㉐\u0001"), str), (SQLiteDatabase.CursorFactory) null, 30);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(String.format(Locale.US, ProtectedSandApp.s("㉖\u0001"), ProtectedSandApp.s("㉓\u0001"), ProtectedSandApp.s("㉔\u0001"), ProtectedSandApp.s("㉕\u0001"), ProtectedSandApp.s("㉑\u0001"), ProtectedSandApp.s("㉒\u0001")));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
            com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("㉗\u0001"), ProtectedSandApp.s("㉏\u0001"), Integer.valueOf(i4), Integer.valueOf(i5));
        }
    }

    public static String a() {
        if (!TextUtils.isEmpty(f71453a)) {
            return f71453a;
        }
        com.tencent.beacon.a.d.a a5 = com.tencent.beacon.a.d.a.a();
        String s4 = ProtectedSandApp.s("㉣\u0001");
        f71453a = a5.getString(s4, "");
        if (!com.tencent.beacon.base.util.b.e().equals(f71453a)) {
            a.SharedPreferencesEditorC0995a edit = a5.edit();
            if (com.tencent.beacon.base.util.b.a((SharedPreferences.Editor) edit)) {
                edit.putString(s4, com.tencent.beacon.base.util.b.e());
            }
        }
        return f71453a;
    }

    public static boolean b() {
        com.tencent.beacon.a.d.a a5 = com.tencent.beacon.a.d.a.a();
        boolean equals = com.tencent.beacon.base.util.b.e().equals(a());
        String s4 = ProtectedSandApp.s("㉤\u0001");
        int i4 = equals ? a5.getInt(s4, 0) : 0;
        if (i4 > com.tencent.beacon.d.a.a().c()) {
            com.tencent.beacon.base.util.c.d(ProtectedSandApp.s("㉥\u0001"), new Object[0]);
            return true;
        }
        int i5 = i4 + 1;
        a.SharedPreferencesEditorC0995a edit = a5.edit();
        if (!com.tencent.beacon.base.util.b.a((SharedPreferences.Editor) edit)) {
            return false;
        }
        edit.putInt(s4, i5);
        return false;
    }

    public static boolean c() {
        b b5 = ((StrategyModule) com.tencent.beacon.a.c.c.c().a(ModuleName.STRATEGY)).b();
        if (b5.w()) {
            com.tencent.beacon.a.d.a a5 = com.tencent.beacon.a.d.a.a();
            long currentTimeMillis = System.currentTimeMillis();
            long j4 = ((currentTimeMillis / 60000) + 480) % 1440;
            if (j4 >= 0 && j4 <= 30 && currentTimeMillis - a5.getLong(ProtectedSandApp.s("㉦\u0001"), 0L) <= 90000000) {
                return true;
            }
            boolean equals = com.tencent.beacon.base.util.b.e().equals(a());
            String s4 = ProtectedSandApp.s("㉧\u0001");
            if (equals) {
                return a5.getInt(s4, 0) >= b5.k();
            }
            a.SharedPreferencesEditorC0995a edit = a5.edit();
            if (com.tencent.beacon.base.util.b.a((SharedPreferences.Editor) edit)) {
                edit.putInt(s4, 0);
            }
        }
        return false;
    }

    public static void d() {
        b b5 = ((StrategyModule) com.tencent.beacon.a.c.c.c().a(ModuleName.STRATEGY)).b();
        if (b5 == null || !b5.w()) {
            return;
        }
        com.tencent.beacon.a.d.a a5 = com.tencent.beacon.a.d.a.a();
        String s4 = ProtectedSandApp.s("㉧\u0001");
        int i4 = a5.getInt(s4, 0) + 1;
        a.SharedPreferencesEditorC0995a edit = a5.edit();
        if (com.tencent.beacon.base.util.b.a((SharedPreferences.Editor) edit)) {
            edit.putInt(s4, i4).putLong(ProtectedSandApp.s("㉦\u0001"), System.currentTimeMillis());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v8, types: [android.database.sqlite.SQLiteClosable, android.database.sqlite.SQLiteDatabase] */
    public static synchronized j a(Context context, int i4) {
        Exception e4;
        SQLiteDatabase sQLiteDatabase;
        j jVar;
        synchronized (k.class) {
            Cursor cursor = null;
            r2 = null;
            j jVar2 = null;
            r2 = null;
            Cursor cursor2 = null;
            cursor = null;
            if (context == 0) {
                com.tencent.beacon.base.util.c.e(ProtectedSandApp.s("㉘\u0001"), new Object[0]);
                return null;
            }
            try {
                try {
                    context = new a(context, com.tencent.beacon.a.c.c.c().e()).getWritableDatabase();
                    try {
                    } catch (Exception e5) {
                        e4 = e5;
                        jVar = null;
                        sQLiteDatabase = context;
                    }
                } catch (Exception e6) {
                    e4 = e6;
                    sQLiteDatabase = null;
                    jVar = null;
                } catch (Throwable th) {
                    th = th;
                    context = 0;
                }
                if (context == 0) {
                    com.tencent.beacon.base.util.c.e(ProtectedSandApp.s("㉙\u0001"), new Object[0]);
                    if (context != 0 && context.isOpen()) {
                        context.close();
                    }
                    return null;
                }
                Cursor query = context.query(ProtectedSandApp.s("㉜\u0001"), null, String.format(Locale.US, ProtectedSandApp.s("㉚\u0001"), ProtectedSandApp.s("㉛\u0001"), Integer.valueOf(i4)), null, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToNext() && (jVar2 = a(query)) != null) {
                            com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("㉝\u0001"), Integer.valueOf(jVar2.f71451b));
                        }
                    } catch (Exception e7) {
                        e4 = e7;
                        cursor2 = query;
                        jVar = null;
                        sQLiteDatabase = context;
                        com.tencent.beacon.a.b.j.e().a(ProtectedSandApp.s("㉞\u0001"), ProtectedSandApp.s("㉟\u0001"));
                        com.tencent.beacon.base.util.c.a(e4);
                        if (cursor2 != null && !cursor2.isClosed()) {
                            cursor2.close();
                        }
                        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                            sQLiteDatabase.close();
                        }
                        jVar2 = jVar;
                        return jVar2;
                    } catch (Throwable th2) {
                        cursor = query;
                        th = th2;
                        if (cursor != null && !cursor.isClosed()) {
                            cursor.close();
                        }
                        if (context != 0 && context.isOpen()) {
                            context.close();
                        }
                        throw th;
                    }
                }
                if (query != null && !query.isClosed()) {
                    query.close();
                }
                if (context.isOpen()) {
                    context.close();
                }
                return jVar2;
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    private static j a(Cursor cursor) {
        if (cursor == null || cursor.isBeforeFirst() || cursor.isAfterLast()) {
            return null;
        }
        com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("㉠\u0001"), new Object[0]);
        j jVar = new j();
        jVar.f71450a = cursor.getLong(cursor.getColumnIndex(ProtectedSandApp.s("㉡\u0001")));
        jVar.f71451b = cursor.getInt(cursor.getColumnIndex(ProtectedSandApp.s("㉛\u0001")));
        jVar.f71452c = cursor.getBlob(cursor.getColumnIndex(ProtectedSandApp.s("㉢\u0001")));
        return jVar;
    }
}
