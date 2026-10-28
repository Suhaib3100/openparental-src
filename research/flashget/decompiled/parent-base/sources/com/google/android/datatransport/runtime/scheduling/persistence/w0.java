package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.collection.n1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Arrays;
import java.util.List;

/* compiled from: SchemaManager.java */
/* loaded from: classes5.dex */
final class w0 extends SQLiteOpenHelper {
    private static final a A;
    private static final List<a> B;

    /* renamed from: u, reason: collision with root package name */
    private static final a f52286u;

    /* renamed from: v, reason: collision with root package name */
    private static final a f52287v;

    /* renamed from: w, reason: collision with root package name */
    private static final a f52288w;

    /* renamed from: x, reason: collision with root package name */
    private static final a f52289x;

    /* renamed from: y, reason: collision with root package name */
    private static final a f52290y;

    /* renamed from: z, reason: collision with root package name */
    private static final a f52291z;

    /* renamed from: b, reason: collision with root package name */
    private final int f52292b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f52293c;

    /* renamed from: d, reason: collision with root package name */
    static final String f52269d = ProtectedSandApp.s("욇");

    /* renamed from: e, reason: collision with root package name */
    private static final String f52270e = ProtectedSandApp.s("욈");

    /* renamed from: f, reason: collision with root package name */
    private static final String f52271f = ProtectedSandApp.s("욉");

    /* renamed from: g, reason: collision with root package name */
    private static final String f52272g = ProtectedSandApp.s("욊");

    /* renamed from: h, reason: collision with root package name */
    private static final String f52273h = ProtectedSandApp.s("욋");

    /* renamed from: i, reason: collision with root package name */
    private static final String f52274i = ProtectedSandApp.s("욌");

    /* renamed from: j, reason: collision with root package name */
    private static final String f52275j = ProtectedSandApp.s("욍");

    /* renamed from: k, reason: collision with root package name */
    private static final String f52276k = ProtectedSandApp.s("욎");

    /* renamed from: l, reason: collision with root package name */
    private static final String f52277l = ProtectedSandApp.s("욏");

    /* renamed from: m, reason: collision with root package name */
    private static final String f52278m = ProtectedSandApp.s("욐");

    /* renamed from: n, reason: collision with root package name */
    private static final String f52279n = ProtectedSandApp.s("욑");

    /* renamed from: o, reason: collision with root package name */
    private static final String f52280o = ProtectedSandApp.s("욒");

    /* renamed from: p, reason: collision with root package name */
    private static final String f52281p = ProtectedSandApp.s("욓");

    /* renamed from: r, reason: collision with root package name */
    private static final String f52283r = ProtectedSandApp.s("요");

    /* renamed from: s, reason: collision with root package name */
    private static final String f52284s = ProtectedSandApp.s("욕");

    /* renamed from: q, reason: collision with root package name */
    private static final String f52282q = ProtectedSandApp.s("욖") + System.currentTimeMillis() + ProtectedSandApp.s("욗");

    /* renamed from: t, reason: collision with root package name */
    static int f52285t = 7;

    /* compiled from: SchemaManager.java */
    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        p0 p0Var = new p0();
        f52286u = p0Var;
        q0 q0Var = new q0();
        f52287v = q0Var;
        r0 r0Var = new r0();
        f52288w = r0Var;
        s0 s0Var = new s0();
        f52289x = s0Var;
        t0 t0Var = new t0();
        f52290y = t0Var;
        u0 u0Var = new u0();
        f52291z = u0Var;
        v0 v0Var = new v0();
        A = v0Var;
        B = Arrays.asList(p0Var, q0Var, r0Var, s0Var, t0Var, u0Var, v0Var);
    }

    @cd.a
    w0(Context context, @cd.b("SQLITE_DB_NAME") String str, @cd.b("SCHEMA_VERSION") int i4) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i4);
        this.f52293c = false;
        this.f52292b = i4;
    }

    private void h(SQLiteDatabase sQLiteDatabase) {
        if (this.f52293c) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(ProtectedSandApp.s("욈"));
        sQLiteDatabase.execSQL(ProtectedSandApp.s("욉"));
        sQLiteDatabase.execSQL(ProtectedSandApp.s("욊"));
        sQLiteDatabase.execSQL(ProtectedSandApp.s("욋"));
        sQLiteDatabase.execSQL(ProtectedSandApp.s("욌"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void k(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(ProtectedSandApp.s("욘"));
        sQLiteDatabase.execSQL(ProtectedSandApp.s("욙"));
        sQLiteDatabase.execSQL(ProtectedSandApp.s("욚"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(ProtectedSandApp.s("욛"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void m(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(ProtectedSandApp.s("욜"));
        sQLiteDatabase.execSQL(ProtectedSandApp.s("욑"));
        sQLiteDatabase.execSQL(ProtectedSandApp.s("욐"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(ProtectedSandApp.s("요"));
        sQLiteDatabase.execSQL(ProtectedSandApp.s("욕"));
        sQLiteDatabase.execSQL(ProtectedSandApp.s("욒"));
        sQLiteDatabase.execSQL(ProtectedSandApp.s("욓"));
        sQLiteDatabase.execSQL(f52282q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void o(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(ProtectedSandApp.s("욝"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void q(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(ProtectedSandApp.s("욞"));
        sQLiteDatabase.execSQL(ProtectedSandApp.s("욟"));
        sQLiteDatabase.execSQL(ProtectedSandApp.s("욠"));
    }

    private void s(SQLiteDatabase sQLiteDatabase, int i4) {
        h(sQLiteDatabase);
        t(sQLiteDatabase, 0, i4);
    }

    private void t(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
        List<a> list = B;
        if (i5 <= list.size()) {
            while (i4 < i5) {
                B.get(i4).a(sQLiteDatabase);
                i4++;
            }
        } else {
            StringBuilder a5 = n1.a(ProtectedSandApp.s("욡"), i4, ProtectedSandApp.s("욢"), i5, ProtectedSandApp.s("욣"));
            a5.append(list.size());
            a5.append(ProtectedSandApp.s("욤"));
            throw new IllegalArgumentException(a5.toString());
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f52293c = true;
        sQLiteDatabase.rawQuery(ProtectedSandApp.s("욥"), new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        s(sQLiteDatabase, this.f52292b);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
        sQLiteDatabase.execSQL(ProtectedSandApp.s("욍"));
        sQLiteDatabase.execSQL(ProtectedSandApp.s("욎"));
        sQLiteDatabase.execSQL(ProtectedSandApp.s("욏"));
        sQLiteDatabase.execSQL(ProtectedSandApp.s("욑"));
        sQLiteDatabase.execSQL(ProtectedSandApp.s("요"));
        sQLiteDatabase.execSQL(ProtectedSandApp.s("욕"));
        s(sQLiteDatabase, i5);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        h(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
        h(sQLiteDatabase);
        t(sQLiteDatabase, i4, i5);
    }
}
