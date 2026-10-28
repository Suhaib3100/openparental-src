package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Arrays;
import java.util.List;

/* compiled from: SchemaManager.java */
/* loaded from: classes2.dex */
final class u0 extends SQLiteOpenHelper {
    private static final a H;
    private static final a I;
    private static final a J;
    private static final a K;
    private static final a L;
    private static final List<a> M;

    /* renamed from: o, reason: collision with root package name */
    private final int f12748o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f12749p;
    private static final String A = ProtectedSandApp.s("॒");
    private static final String B = ProtectedSandApp.s("॓");
    private static final String C = ProtectedSandApp.s("॔");
    private static final String E = ProtectedSandApp.s("ॕ");
    private static final String F = ProtectedSandApp.s("ॖ");

    /* renamed from: q, reason: collision with root package name */
    static final String f12738q = ProtectedSandApp.s("ॗ");

    /* renamed from: r, reason: collision with root package name */
    private static final String f12739r = ProtectedSandApp.s("क़");

    /* renamed from: s, reason: collision with root package name */
    private static final String f12740s = ProtectedSandApp.s("ख़");

    /* renamed from: t, reason: collision with root package name */
    private static final String f12741t = ProtectedSandApp.s("ग़");

    /* renamed from: u, reason: collision with root package name */
    private static final String f12742u = ProtectedSandApp.s("ज़");

    /* renamed from: v, reason: collision with root package name */
    private static final String f12743v = ProtectedSandApp.s("ड़");

    /* renamed from: w, reason: collision with root package name */
    private static final String f12744w = ProtectedSandApp.s("ढ़");

    /* renamed from: x, reason: collision with root package name */
    private static final String f12745x = ProtectedSandApp.s("फ़");

    /* renamed from: y, reason: collision with root package name */
    private static final String f12746y = ProtectedSandApp.s("य़");

    /* renamed from: z, reason: collision with root package name */
    private static final String f12747z = ProtectedSandApp.s("ॠ");
    private static final String D = ProtectedSandApp.s("ॡ") + System.currentTimeMillis() + ProtectedSandApp.s("ॢ");
    static int G = 5;

    /* compiled from: SchemaManager.java */
    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        a aVar = new a() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.p0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.u0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                u0.j(sQLiteDatabase);
            }
        };
        H = aVar;
        a aVar2 = new a() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.q0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.u0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                u0.k(sQLiteDatabase);
            }
        };
        I = aVar2;
        a aVar3 = new a() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.r0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.u0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                u0.l(sQLiteDatabase);
            }
        };
        J = aVar3;
        a aVar4 = new a() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.s0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.u0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                u0.m(sQLiteDatabase);
            }
        };
        K = aVar4;
        a aVar5 = new a() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.t0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.u0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                u0.n(sQLiteDatabase);
            }
        };
        L = aVar5;
        M = Arrays.asList(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    @h3.a
    u0(Context context, @h3.b("SQLITE_DB_NAME") String str, @h3.b("SCHEMA_VERSION") int i5) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i5);
        this.f12749p = false;
        this.f12748o = i5;
    }

    private void g(SQLiteDatabase sQLiteDatabase) {
        if (this.f12749p) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void j(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(ProtectedSandApp.s("ॣ"));
        sQLiteDatabase.execSQL(ProtectedSandApp.s("।"));
        sQLiteDatabase.execSQL(ProtectedSandApp.s("॥"));
        sQLiteDatabase.execSQL(ProtectedSandApp.s("०"));
        sQLiteDatabase.execSQL(ProtectedSandApp.s("१"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void k(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(ProtectedSandApp.s("२"));
        sQLiteDatabase.execSQL(ProtectedSandApp.s("३"));
        sQLiteDatabase.execSQL(ProtectedSandApp.s("४"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(ProtectedSandApp.s("५"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void m(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(ProtectedSandApp.s("६"));
        sQLiteDatabase.execSQL(ProtectedSandApp.s("७"));
        sQLiteDatabase.execSQL(ProtectedSandApp.s("८"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(ProtectedSandApp.s("९"));
        sQLiteDatabase.execSQL(ProtectedSandApp.s("॰"));
        sQLiteDatabase.execSQL(ProtectedSandApp.s("ॱ"));
        sQLiteDatabase.execSQL(ProtectedSandApp.s("ॲ"));
        sQLiteDatabase.execSQL(D);
    }

    private void o(SQLiteDatabase sQLiteDatabase, int i5) {
        g(sQLiteDatabase);
        r(sQLiteDatabase, 0, i5);
    }

    private void r(SQLiteDatabase sQLiteDatabase, int i5, int i6) {
        List<a> list = M;
        if (i6 <= list.size()) {
            while (i5 < i6) {
                M.get(i5).a(sQLiteDatabase);
                i5++;
            }
            return;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("ॳ") + i5 + ProtectedSandApp.s("ॴ") + i6 + ProtectedSandApp.s("ॵ") + list.size() + ProtectedSandApp.s("ॶ"));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f12749p = true;
        sQLiteDatabase.rawQuery(ProtectedSandApp.s("ॷ"), new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        o(sQLiteDatabase, this.f12748o);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i5, int i6) {
        sQLiteDatabase.execSQL(ProtectedSandApp.s("ॸ"));
        sQLiteDatabase.execSQL(ProtectedSandApp.s("ॹ"));
        sQLiteDatabase.execSQL(ProtectedSandApp.s("ॺ"));
        sQLiteDatabase.execSQL(ProtectedSandApp.s("ॻ"));
        sQLiteDatabase.execSQL(ProtectedSandApp.s("ॼ"));
        sQLiteDatabase.execSQL(ProtectedSandApp.s("ॽ"));
        o(sQLiteDatabase, i6);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        g(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i5, int i6) {
        g(sQLiteDatabase);
        r(sQLiteDatabase, i5, i6);
    }
}
