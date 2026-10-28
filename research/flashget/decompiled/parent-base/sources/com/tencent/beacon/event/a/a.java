package com.tencent.beacon.event.a;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import androidx.annotation.o0;
import androidx.appcompat.view.g;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.a.b.j;
import com.tencent.beacon.a.d.c;
import com.tencent.beacon.a.d.d;
import com.tencent.beacon.event.EventBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: EventDAO.java */
/* loaded from: classes6.dex */
public class a implements d<EventBean> {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f71460a;

    /* renamed from: b, reason: collision with root package name */
    private final SQLiteStatement f71461b;

    /* renamed from: c, reason: collision with root package name */
    private final SQLiteStatement f71462c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f71463d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private final Object f71464e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private com.tencent.beacon.event.c.b f71465f = com.tencent.beacon.event.c.b.a();

    /* renamed from: g, reason: collision with root package name */
    private SQLiteDatabase f71466g;

    /* renamed from: h, reason: collision with root package name */
    private SQLiteDatabase f71467h;

    /* renamed from: i, reason: collision with root package name */
    private long f71468i;

    /* renamed from: j, reason: collision with root package name */
    private long f71469j;

    private a() {
        c cVar = new c(com.tencent.beacon.a.c.b.c(com.tencent.beacon.a.c.c.c().b()));
        this.f71466g = cVar.getWritableDatabase();
        SQLiteDatabase readableDatabase = cVar.getReadableDatabase();
        this.f71467h = readableDatabase;
        this.f71461b = readableDatabase.compileStatement(ProtectedSandApp.s("㉭\u0001"));
        this.f71462c = this.f71467h.compileStatement(ProtectedSandApp.s("㉮\u0001"));
        this.f71468i = a(ProtectedSandApp.s("㉯\u0001"));
        long a5 = a(ProtectedSandApp.s("㉰\u0001"));
        this.f71469j = a5;
        if (this.f71468i == 0 && a5 == 0) {
            return;
        }
        String str = ProtectedSandApp.s("㉱\u0001") + this.f71468i + ProtectedSandApp.s("㉲\u0001") + this.f71469j;
        String s4 = ProtectedSandApp.s("㉳\u0001");
        com.tencent.beacon.base.util.c.a(s4, str, new Object[0]);
        j.e().a(ProtectedSandApp.s("㉴\u0001"), s4 + str);
    }

    public static a a() {
        if (f71460a == null) {
            synchronized (a.class) {
                try {
                    if (f71460a == null) {
                        f71460a = new a();
                    }
                } finally {
                }
            }
        }
        return f71460a;
    }

    public Map<String, Integer> b(String str) {
        String s4 = ProtectedSandApp.s("㊉\u0001");
        String s5 = ProtectedSandApp.s("㊊\u0001");
        HashMap hashMap = new HashMap();
        Cursor cursor = null;
        try {
            try {
                cursor = this.f71467h.rawQuery(s5 + str + s4, null);
                if (cursor.moveToFirst()) {
                    do {
                        hashMap.put(cursor.getString(0), Integer.valueOf(cursor.getInt(1)));
                    } while (cursor.moveToNext());
                }
                if (!cursor.isClosed()) {
                    cursor.close();
                }
            } catch (Exception e4) {
                j e5 = j.e();
                String s6 = ProtectedSandApp.s("㉻\u0001");
                StringBuilder sb = new StringBuilder();
                sb.append(ProtectedSandApp.s("㉸\u0001"));
                sb.append(str);
                sb.append(ProtectedSandApp.s("㉼\u0001"));
                sb.append(e4.getMessage());
                e5.a(s6, sb.toString(), e4);
                com.tencent.beacon.base.util.c.a(e4);
                if (cursor != null && !cursor.isClosed()) {
                    cursor.close();
                }
            }
            return hashMap;
        } catch (Throwable th) {
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008f, code lost:
    
        if (r12.f71462c.executeInsert() >= 0) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(com.tencent.beacon.event.EventBean r13) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.beacon.event.a.a.a(com.tencent.beacon.event.EventBean):boolean");
    }

    public List<EventBean> a(@o0 String str, String str2, int i4) {
        String s4 = ProtectedSandApp.s("㉽\u0001");
        List<EventBean> list = null;
        try {
            list = a(str, this.f71467h.rawQuery(ProtectedSandApp.s("㉿\u0001") + str + ProtectedSandApp.s("㉾\u0001") + str2 + s4 + i4, null));
        } catch (Exception e4) {
            com.tencent.beacon.base.util.c.a(e4);
            j e5 = j.e();
            StringBuilder a5 = g.a(ProtectedSandApp.s("㉸\u0001"), str, ProtectedSandApp.s("㉼\u0001"));
            a5.append(e4.getMessage());
            e5.a(ProtectedSandApp.s("㉻\u0001"), a5.toString(), e4);
        }
        com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("㉳\u0001"), ProtectedSandApp.s("㊀\u0001"), str, str2);
        return list;
    }

    public long a(String str) {
        String s4 = ProtectedSandApp.s("㉸\u0001");
        Cursor cursor = null;
        try {
            try {
                cursor = this.f71467h.rawQuery(ProtectedSandApp.s("㉹\u0001") + str, new String[]{ProtectedSandApp.s("㉺\u0001")});
                cursor.moveToFirst();
                long j4 = cursor.getLong(0);
                if (cursor.isClosed()) {
                    return j4;
                }
                cursor.close();
                return j4;
            } catch (Exception e4) {
                j e5 = j.e();
                String s5 = ProtectedSandApp.s("㉻\u0001");
                StringBuilder sb = new StringBuilder(s4);
                sb.append(str);
                sb.append(ProtectedSandApp.s("㉼\u0001"));
                sb.append(e4.getMessage());
                e5.a(s5, sb.toString(), e4);
                com.tencent.beacon.base.util.c.a(e4);
                if (cursor != null && !cursor.isClosed()) {
                    cursor.close();
                }
                return -1L;
            }
        } catch (Throwable th) {
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
            throw th;
        }
    }

    public boolean a(@o0 String str, String str2) {
        try {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("㊄\u0001"));
            sb.append(str2);
            sb.append(ProtectedSandApp.s("㊅\u0001"));
            int delete = this.f71466g.delete(str, sb.toString(), null);
            a(str.equals(ProtectedSandApp.s("㉯\u0001")), false, delete);
            return delete >= 0;
        } catch (Exception e4) {
            j e5 = j.e();
            StringBuilder a5 = g.a(ProtectedSandApp.s("㉸\u0001"), str, ProtectedSandApp.s("㊆\u0001"));
            a5.append(e4.getMessage());
            a5.append(ProtectedSandApp.s("㊇\u0001"));
            a5.append(str2);
            e5.a(ProtectedSandApp.s("㊈\u0001"), a5.toString(), e4);
            com.tencent.beacon.base.util.c.a(e4);
            return false;
        }
    }

    private List<EventBean> a(String str, Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            b bVar = new b();
            bVar.f71470a = cursor.getLong(0);
            bVar.f71473d = cursor.getString(1);
            bVar.f71471b = cursor.getInt(2);
            bVar.f71472c = cursor.getLong(3);
            bVar.f71474e = cursor.getBlob(4);
            EventBean a5 = this.f71465f.c().a(bVar);
            if (a5 == null) {
                a(str, String.valueOf(bVar.f71470a));
                com.tencent.beacon.base.util.c.b(ProtectedSandApp.s("㉵\u0001"), new Object[0]);
            } else {
                arrayList.add(a5);
            }
        }
        if (!cursor.isClosed()) {
            cursor.close();
        }
        return arrayList;
    }

    private void a(boolean z4, boolean z5, long j4) {
        if (z4) {
            synchronized (this.f71463d) {
                try {
                    if (z5) {
                        this.f71468i += j4;
                    } else {
                        this.f71468i -= j4;
                    }
                    com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("㉳\u0001"), ProtectedSandApp.s("㉶\u0001"), Long.valueOf(this.f71468i));
                } finally {
                }
            }
            return;
        }
        synchronized (this.f71464e) {
            try {
                if (z5) {
                    this.f71469j += j4;
                } else {
                    this.f71469j -= j4;
                }
                com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("㉳\u0001"), ProtectedSandApp.s("㉷\u0001"), Long.valueOf(this.f71469j));
            } finally {
            }
        }
    }

    public boolean a(int i4) {
        boolean z4;
        if (i4 == 1) {
            synchronized (this.f71463d) {
                z4 = this.f71468i >= ((long) com.tencent.beacon.d.b.b().d());
            }
            return z4;
        }
        synchronized (this.f71464e) {
            z4 = this.f71469j >= ((long) com.tencent.beacon.d.b.b().d());
        }
        return z4;
    }
}
