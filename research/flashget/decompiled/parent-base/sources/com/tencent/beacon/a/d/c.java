package com.tencent.beacon.a.d;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v4.media.session.PlaybackStateCompat;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.a.b.j;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: DBOpenHelper.java */
/* loaded from: classes6.dex */
public class c extends SQLiteOpenHelper {

    /* renamed from: a, reason: collision with root package name */
    private String f71125a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(java.lang.String r6) {
        /*
            r5 = this;
            com.tencent.beacon.a.c.c r0 = com.tencent.beacon.a.c.c.c()
            android.content.Context r0 = r0.b()
            java.lang.String r1 = "ゃ\u0001"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            java.lang.String r2 = androidx.constraintlayout.core.motion.key.c.a(r1, r6)
            r3 = 0
            r4 = 1
            r5.<init>(r0, r2, r3, r4)
            java.lang.String r0 = ""
            r5.f71125a = r0
            r0 = 0
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r3 = "や\u0001"
            java.lang.String r3 = com.flashget.parentalcontrol.ProtectedSandApp.s(r3)
            java.lang.String r4 = "ゅ\u0001"
            java.lang.String r4 = com.flashget.parentalcontrol.ProtectedSandApp.s(r4)
            com.tencent.beacon.base.util.c.a(r3, r0, r4, r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r5.f71125a = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.beacon.a.d.c.<init>(java.lang.String):void");
    }

    private boolean a(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor;
        try {
            ArrayList arrayList = new ArrayList();
            cursor = sQLiteDatabase.query(ProtectedSandApp.s("ゆ\u0001"), new String[]{ProtectedSandApp.s("ょ\u0001")}, ProtectedSandApp.s("よ\u0001"), null, null, null, null);
            if (cursor != null) {
                while (cursor.moveToNext()) {
                    try {
                        arrayList.add(cursor.getString(0));
                    } catch (Throwable th) {
                        th = th;
                        try {
                            j.e().a(ProtectedSandApp.s("ろ\u0001"), ProtectedSandApp.s("ゎ\u0001"), th);
                            com.tencent.beacon.base.util.c.a(th);
                            if (cursor != null && !cursor.isClosed()) {
                                cursor.close();
                            }
                            return false;
                        } finally {
                            if (cursor != null && !cursor.isClosed()) {
                                cursor.close();
                            }
                        }
                    }
                }
            }
            String s4 = ProtectedSandApp.s("ら\u0001");
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (!str.equals(ProtectedSandApp.s("り\u0001")) && !str.equals(ProtectedSandApp.s("る\u0001"))) {
                        sQLiteDatabase.execSQL(s4 + str);
                        com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("や\u0001"), 1, ProtectedSandApp.s("れ\u0001"), str);
                    }
                }
            }
            return true;
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
    }

    private void b(SQLiteDatabase sQLiteDatabase) {
        if (a(sQLiteDatabase)) {
            com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("や\u0001"), 0, ProtectedSandApp.s("わ\u0001"), new Object[0]);
            onCreate(sQLiteDatabase);
            return;
        }
        com.tencent.beacon.base.util.c.e(ProtectedSandApp.s("ゐ\u0001"), new Object[0]);
        File databasePath = com.tencent.beacon.a.c.c.c().b().getDatabasePath(this.f71125a);
        if (databasePath == null || !databasePath.canWrite()) {
            return;
        }
        databasePath.delete();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        super.onConfigure(sQLiteDatabase);
        sQLiteDatabase.setPageSize(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
        sQLiteDatabase.enableWriteAheadLogging();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("や\u0001"), 0, ProtectedSandApp.s("ゑ\u0001"), new Object[0]);
        try {
            Iterator<String> it = b.f71124a.iterator();
            while (it.hasNext()) {
                sQLiteDatabase.execSQL(it.next());
            }
        } catch (SQLException e4) {
            j.e().a(ProtectedSandApp.s("ん\u0001"), ProtectedSandApp.s("を\u0001") + e4.getMessage(), e4);
            com.tencent.beacon.base.util.c.b(ProtectedSandApp.s("ゔ\u0001"), new Object[0]);
            com.tencent.beacon.base.util.c.a(e4);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
        Object[] objArr = {this.f71125a, Integer.valueOf(i4), Integer.valueOf(i5)};
        com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("や\u0001"), 0, ProtectedSandApp.s("ゕ\u0001"), objArr);
        b(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
        Object[] objArr = {this.f71125a, Integer.valueOf(i4), Integer.valueOf(i5)};
        com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("や\u0001"), 0, ProtectedSandApp.s("ゖ\u0001"), objArr);
        b(sQLiteDatabase);
    }
}
