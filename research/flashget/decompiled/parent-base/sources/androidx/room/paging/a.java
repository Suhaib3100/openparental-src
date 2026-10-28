package androidx.room.paging;

import android.database.Cursor;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.paging.e1;
import androidx.room.c2;
import androidx.room.g2;
import androidx.room.m0;
import f3.g;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: LimitOffsetDataSource.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public abstract class a<T> extends e1<T> {

    /* renamed from: h, reason: collision with root package name */
    private final g2 f33892h;

    /* renamed from: i, reason: collision with root package name */
    private final String f33893i;

    /* renamed from: j, reason: collision with root package name */
    private final String f33894j;

    /* renamed from: k, reason: collision with root package name */
    private final c2 f33895k;

    /* renamed from: l, reason: collision with root package name */
    private final m0.c f33896l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f33897m;

    /* renamed from: n, reason: collision with root package name */
    private final AtomicBoolean f33898n;

    /* compiled from: LimitOffsetDataSource.java */
    /* renamed from: androidx.room.paging.a$a, reason: collision with other inner class name */
    class C0609a extends m0.c {
        C0609a(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.m0.c
        public void c(@o0 Set<String> set) {
            a.this.f();
        }
    }

    protected a(@o0 c2 c2Var, @o0 g gVar, boolean z4, @o0 String... strArr) {
        this(c2Var, g2.f(gVar), z4, true, strArr);
    }

    private g2 D(int i4, int i5) {
        g2 a5 = g2.INSTANCE.a(this.f33894j, this.f33892h.getArgCount() + 2);
        a5.e(this.f33892h);
        a5.C2(a5.getArgCount() - 1, i5);
        a5.C2(a5.getArgCount(), i4);
        return a5;
    }

    private void F() {
        if (this.f33898n.compareAndSet(false, true)) {
            this.f33895k.getInvalidationTracker().d(this.f33896l);
        }
    }

    @o0
    protected abstract List<T> B(@o0 Cursor cursor);

    @c1({c1.a.LIBRARY})
    public int C() {
        F();
        g2 a5 = g2.INSTANCE.a(this.f33893i, this.f33892h.getArgCount());
        a5.e(this.f33892h);
        Cursor query = this.f33895k.query(a5);
        try {
            if (query.moveToFirst()) {
                return query.getInt(0);
            }
            return 0;
        } finally {
            query.close();
            a5.release();
        }
    }

    @c1({c1.a.LIBRARY})
    @o0
    public List<T> E(int i4, int i5) {
        g2 D = D(i4, i5);
        if (!this.f33897m) {
            Cursor query = this.f33895k.query(D);
            try {
                return B(query);
            } finally {
                query.close();
                D.release();
            }
        }
        this.f33895k.beginTransaction();
        Cursor cursor = null;
        try {
            cursor = this.f33895k.query(D);
            List<T> B = B(cursor);
            this.f33895k.setTransactionSuccessful();
            return B;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
            this.f33895k.endTransaction();
            D.release();
        }
    }

    @Override // androidx.paging.m
    public boolean h() {
        F();
        this.f33895k.getInvalidationTracker().s();
        return super.h();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    @Override // androidx.paging.e1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t(@androidx.annotation.o0 androidx.paging.e1.c r6, @androidx.annotation.o0 androidx.paging.e1.b<T> r7) {
        /*
            r5 = this;
            r5.F()
            java.util.List r0 = java.util.Collections.emptyList()
            androidx.room.c2 r1 = r5.f33895k
            r1.beginTransaction()
            r1 = 0
            int r2 = r5.C()     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L3a
            androidx.paging.e1$a r0 = androidx.paging.e1.INSTANCE     // Catch: java.lang.Throwable -> L38
            int r3 = r0.a(r6, r2)     // Catch: java.lang.Throwable -> L38
            int r6 = r0.b(r6, r3, r2)     // Catch: java.lang.Throwable -> L33
            androidx.room.g2 r6 = r5.D(r3, r6)     // Catch: java.lang.Throwable -> L33
            androidx.room.c2 r0 = r5.f33895k     // Catch: java.lang.Throwable -> L31
            android.database.Cursor r1 = r0.query(r6)     // Catch: java.lang.Throwable -> L31
            java.util.List r0 = r5.B(r1)     // Catch: java.lang.Throwable -> L31
            androidx.room.c2 r4 = r5.f33895k     // Catch: java.lang.Throwable -> L31
            r4.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L31
            goto L3c
        L31:
            r7 = move-exception
            goto L4f
        L33:
            r7 = move-exception
        L34:
            r6 = r1
            goto L4f
        L36:
            r7 = r6
            goto L34
        L38:
            r6 = move-exception
            goto L36
        L3a:
            r3 = 0
            r6 = r1
        L3c:
            if (r1 == 0) goto L41
            r1.close()
        L41:
            androidx.room.c2 r1 = r5.f33895k
            r1.endTransaction()
            if (r6 == 0) goto L4b
            r6.release()
        L4b:
            r7.b(r0, r3, r2)
            return
        L4f:
            if (r1 == 0) goto L54
            r1.close()
        L54:
            androidx.room.c2 r0 = r5.f33895k
            r0.endTransaction()
            if (r6 == 0) goto L5e
            r6.release()
        L5e:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.paging.a.t(androidx.paging.e1$c, androidx.paging.e1$b):void");
    }

    @Override // androidx.paging.e1
    public void w(@o0 e1.e eVar, @o0 e1.d<T> dVar) {
        dVar.a(E(eVar.startPosition, eVar.loadSize));
    }

    protected a(@o0 c2 c2Var, @o0 g gVar, boolean z4, boolean z5, @o0 String... strArr) {
        this(c2Var, g2.f(gVar), z4, z5, strArr);
    }

    protected a(@o0 c2 c2Var, @o0 g2 g2Var, boolean z4, @o0 String... strArr) {
        this(c2Var, g2Var, z4, true, strArr);
    }

    protected a(@o0 c2 c2Var, @o0 g2 g2Var, boolean z4, boolean z5, @o0 String... strArr) {
        this.f33898n = new AtomicBoolean(false);
        this.f33895k = c2Var;
        this.f33892h = g2Var;
        this.f33897m = z4;
        this.f33893i = "SELECT COUNT(*) FROM ( " + g2Var.getQuery() + " )";
        this.f33894j = "SELECT * FROM ( " + g2Var.getQuery() + " ) LIMIT ? OFFSET ?";
        this.f33896l = new C0609a(strArr);
        if (z5) {
            F();
        }
    }
}
