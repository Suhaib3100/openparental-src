package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.c2;
import androidx.room.g2;
import androidx.room.n2;
import java.util.ArrayList;
import java.util.List;

/* compiled from: SystemIdInfoDao_Impl.java */
/* loaded from: classes3.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    private final c2 f36324a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.room.w<i> f36325b;

    /* renamed from: c, reason: collision with root package name */
    private final n2 f36326c;

    /* compiled from: SystemIdInfoDao_Impl.java */
    class a extends androidx.room.w<i> {
        a(c2 database) {
            super(database);
        }

        @Override // androidx.room.w
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(f3.i stmt, i value) {
            String str = value.f36322a;
            if (str == null) {
                stmt.h3(1);
            } else {
                stmt.c2(1, str);
            }
            stmt.C2(2, value.f36323b);
        }

        @Override // androidx.room.n2
        public String createQuery() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }
    }

    /* compiled from: SystemIdInfoDao_Impl.java */
    class b extends n2 {
        b(c2 database) {
            super(database);
        }

        @Override // androidx.room.n2
        public String createQuery() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public k(c2 __db) {
        this.f36324a = __db;
        this.f36325b = new a(__db);
        this.f36326c = new b(__db);
    }

    @Override // androidx.work.impl.model.j
    public i a(final String workSpecId) {
        g2 d5 = g2.d("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (workSpecId == null) {
            d5.h3(1);
        } else {
            d5.c2(1, workSpecId);
        }
        this.f36324a.assertNotSuspendingTransaction();
        Cursor f4 = androidx.room.util.b.f(this.f36324a, d5, false, null);
        try {
            return f4.moveToFirst() ? new i(f4.getString(androidx.room.util.a.e(f4, "work_spec_id")), f4.getInt(androidx.room.util.a.e(f4, "system_id"))) : null;
        } finally {
            f4.close();
            d5.release();
        }
    }

    @Override // androidx.work.impl.model.j
    public List<String> b() {
        g2 d5 = g2.d("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f36324a.assertNotSuspendingTransaction();
        Cursor f4 = androidx.room.util.b.f(this.f36324a, d5, false, null);
        try {
            ArrayList arrayList = new ArrayList(f4.getCount());
            while (f4.moveToNext()) {
                arrayList.add(f4.getString(0));
            }
            return arrayList;
        } finally {
            f4.close();
            d5.release();
        }
    }

    @Override // androidx.work.impl.model.j
    public void c(final i systemIdInfo) {
        this.f36324a.assertNotSuspendingTransaction();
        this.f36324a.beginTransaction();
        try {
            this.f36325b.insert((androidx.room.w<i>) systemIdInfo);
            this.f36324a.setTransactionSuccessful();
        } finally {
            this.f36324a.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.j
    public void d(final String workSpecId) {
        this.f36324a.assertNotSuspendingTransaction();
        f3.i acquire = this.f36326c.acquire();
        if (workSpecId == null) {
            acquire.h3(1);
        } else {
            acquire.c2(1, workSpecId);
        }
        this.f36324a.beginTransaction();
        try {
            acquire.h0();
            this.f36324a.setTransactionSuccessful();
        } finally {
            this.f36324a.endTransaction();
            this.f36326c.release(acquire);
        }
    }
}
