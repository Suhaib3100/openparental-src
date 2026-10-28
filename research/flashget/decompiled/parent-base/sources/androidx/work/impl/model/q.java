package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.c2;
import androidx.room.g2;
import androidx.room.n2;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WorkProgressDao_Impl.java */
/* loaded from: classes3.dex */
public final class q implements p {

    /* renamed from: a, reason: collision with root package name */
    private final c2 f36336a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.room.w<o> f36337b;

    /* renamed from: c, reason: collision with root package name */
    private final n2 f36338c;

    /* renamed from: d, reason: collision with root package name */
    private final n2 f36339d;

    /* compiled from: WorkProgressDao_Impl.java */
    class a extends androidx.room.w<o> {
        a(c2 database) {
            super(database);
        }

        @Override // androidx.room.w
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(f3.i stmt, o value) {
            String str = value.f36334a;
            if (str == null) {
                stmt.h3(1);
            } else {
                stmt.c2(1, str);
            }
            byte[] F = androidx.work.f.F(value.f36335b);
            if (F == null) {
                stmt.h3(2);
            } else {
                stmt.L2(2, F);
            }
        }

        @Override // androidx.room.n2
        public String createQuery() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }
    }

    /* compiled from: WorkProgressDao_Impl.java */
    class b extends n2 {
        b(c2 database) {
            super(database);
        }

        @Override // androidx.room.n2
        public String createQuery() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* compiled from: WorkProgressDao_Impl.java */
    class c extends n2 {
        c(c2 database) {
            super(database);
        }

        @Override // androidx.room.n2
        public String createQuery() {
            return "DELETE FROM WorkProgress";
        }
    }

    public q(c2 __db) {
        this.f36336a = __db;
        this.f36337b = new a(__db);
        this.f36338c = new b(__db);
        this.f36339d = new c(__db);
    }

    @Override // androidx.work.impl.model.p
    public void a(final String workSpecId) {
        this.f36336a.assertNotSuspendingTransaction();
        f3.i acquire = this.f36338c.acquire();
        if (workSpecId == null) {
            acquire.h3(1);
        } else {
            acquire.c2(1, workSpecId);
        }
        this.f36336a.beginTransaction();
        try {
            acquire.h0();
            this.f36336a.setTransactionSuccessful();
        } finally {
            this.f36336a.endTransaction();
            this.f36338c.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.p
    public androidx.work.f b(final String workSpecId) {
        g2 d5 = g2.d("SELECT progress FROM WorkProgress WHERE work_spec_id=?", 1);
        if (workSpecId == null) {
            d5.h3(1);
        } else {
            d5.c2(1, workSpecId);
        }
        this.f36336a.assertNotSuspendingTransaction();
        Cursor f4 = androidx.room.util.b.f(this.f36336a, d5, false, null);
        try {
            return f4.moveToFirst() ? androidx.work.f.m(f4.getBlob(0)) : null;
        } finally {
            f4.close();
            d5.release();
        }
    }

    @Override // androidx.work.impl.model.p
    public void c() {
        this.f36336a.assertNotSuspendingTransaction();
        f3.i acquire = this.f36339d.acquire();
        this.f36336a.beginTransaction();
        try {
            acquire.h0();
            this.f36336a.setTransactionSuccessful();
        } finally {
            this.f36336a.endTransaction();
            this.f36339d.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.p
    public void d(final o progress) {
        this.f36336a.assertNotSuspendingTransaction();
        this.f36336a.beginTransaction();
        try {
            this.f36337b.insert((androidx.room.w<o>) progress);
            this.f36336a.setTransactionSuccessful();
        } finally {
            this.f36336a.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.p
    public List<androidx.work.f> e(final List<String> workSpecIds) {
        StringBuilder d5 = androidx.room.util.f.d();
        d5.append("SELECT progress FROM WorkProgress WHERE work_spec_id IN (");
        int size = workSpecIds.size();
        androidx.room.util.f.a(d5, size);
        d5.append(")");
        g2 d6 = g2.d(d5.toString(), size);
        int i4 = 1;
        for (String str : workSpecIds) {
            if (str == null) {
                d6.h3(i4);
            } else {
                d6.c2(i4, str);
            }
            i4++;
        }
        this.f36336a.assertNotSuspendingTransaction();
        Cursor f4 = androidx.room.util.b.f(this.f36336a, d6, false, null);
        try {
            ArrayList arrayList = new ArrayList(f4.getCount());
            while (f4.moveToNext()) {
                arrayList.add(androidx.work.f.m(f4.getBlob(0)));
            }
            return arrayList;
        } finally {
            f4.close();
            d6.release();
        }
    }
}
