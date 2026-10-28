package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.c2;
import androidx.room.g2;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WorkTagDao_Impl.java */
/* loaded from: classes3.dex */
public final class w implements v {

    /* renamed from: a, reason: collision with root package name */
    private final c2 f36403a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.room.w<u> f36404b;

    /* compiled from: WorkTagDao_Impl.java */
    class a extends androidx.room.w<u> {
        a(c2 database) {
            super(database);
        }

        @Override // androidx.room.w
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(f3.i stmt, u value) {
            String str = value.f36401a;
            if (str == null) {
                stmt.h3(1);
            } else {
                stmt.c2(1, str);
            }
            String str2 = value.f36402b;
            if (str2 == null) {
                stmt.h3(2);
            } else {
                stmt.c2(2, str2);
            }
        }

        @Override // androidx.room.n2
        public String createQuery() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    public w(c2 __db) {
        this.f36403a = __db;
        this.f36404b = new a(__db);
    }

    @Override // androidx.work.impl.model.v
    public List<String> a(final String id2) {
        g2 d5 = g2.d("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (id2 == null) {
            d5.h3(1);
        } else {
            d5.c2(1, id2);
        }
        this.f36403a.assertNotSuspendingTransaction();
        Cursor f4 = androidx.room.util.b.f(this.f36403a, d5, false, null);
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

    @Override // androidx.work.impl.model.v
    public void b(final u workTag) {
        this.f36403a.assertNotSuspendingTransaction();
        this.f36403a.beginTransaction();
        try {
            this.f36404b.insert((androidx.room.w<u>) workTag);
            this.f36403a.setTransactionSuccessful();
        } finally {
            this.f36403a.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.v
    public List<String> c(final String tag) {
        g2 d5 = g2.d("SELECT work_spec_id FROM worktag WHERE tag=?", 1);
        if (tag == null) {
            d5.h3(1);
        } else {
            d5.c2(1, tag);
        }
        this.f36403a.assertNotSuspendingTransaction();
        Cursor f4 = androidx.room.util.b.f(this.f36403a, d5, false, null);
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
}
