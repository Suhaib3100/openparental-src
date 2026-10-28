package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.c2;
import androidx.room.g2;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WorkNameDao_Impl.java */
/* loaded from: classes3.dex */
public final class n implements m {

    /* renamed from: a, reason: collision with root package name */
    private final c2 f36331a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.room.w<l> f36332b;

    /* compiled from: WorkNameDao_Impl.java */
    class a extends androidx.room.w<l> {
        a(c2 database) {
            super(database);
        }

        @Override // androidx.room.w
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(f3.i stmt, l value) {
            String str = value.f36329a;
            if (str == null) {
                stmt.h3(1);
            } else {
                stmt.c2(1, str);
            }
            String str2 = value.f36330b;
            if (str2 == null) {
                stmt.h3(2);
            } else {
                stmt.c2(2, str2);
            }
        }

        @Override // androidx.room.n2
        public String createQuery() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }
    }

    public n(c2 __db) {
        this.f36331a = __db;
        this.f36332b = new a(__db);
    }

    @Override // androidx.work.impl.model.m
    public void a(final l workName) {
        this.f36331a.assertNotSuspendingTransaction();
        this.f36331a.beginTransaction();
        try {
            this.f36332b.insert((androidx.room.w<l>) workName);
            this.f36331a.setTransactionSuccessful();
        } finally {
            this.f36331a.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.m
    public List<String> b(final String workSpecId) {
        g2 d5 = g2.d("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (workSpecId == null) {
            d5.h3(1);
        } else {
            d5.c2(1, workSpecId);
        }
        this.f36331a.assertNotSuspendingTransaction();
        Cursor f4 = androidx.room.util.b.f(this.f36331a, d5, false, null);
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

    @Override // androidx.work.impl.model.m
    public List<String> c(final String name) {
        g2 d5 = g2.d("SELECT work_spec_id FROM workname WHERE name=?", 1);
        if (name == null) {
            d5.h3(1);
        } else {
            d5.c2(1, name);
        }
        this.f36331a.assertNotSuspendingTransaction();
        Cursor f4 = androidx.room.util.b.f(this.f36331a, d5, false, null);
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
