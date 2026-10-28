package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.c2;
import androidx.room.g2;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DependencyDao_Impl.java */
/* loaded from: classes3.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    private final c2 f36309a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.room.w<androidx.work.impl.model.a> f36310b;

    /* compiled from: DependencyDao_Impl.java */
    class a extends androidx.room.w<androidx.work.impl.model.a> {
        a(c2 database) {
            super(database);
        }

        @Override // androidx.room.w
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(f3.i stmt, androidx.work.impl.model.a value) {
            String str = value.f36307a;
            if (str == null) {
                stmt.h3(1);
            } else {
                stmt.c2(1, str);
            }
            String str2 = value.f36308b;
            if (str2 == null) {
                stmt.h3(2);
            } else {
                stmt.c2(2, str2);
            }
        }

        @Override // androidx.room.n2
        public String createQuery() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }
    }

    public c(c2 __db) {
        this.f36309a = __db;
        this.f36310b = new a(__db);
    }

    @Override // androidx.work.impl.model.b
    public void a(final androidx.work.impl.model.a dependency) {
        this.f36309a.assertNotSuspendingTransaction();
        this.f36309a.beginTransaction();
        try {
            this.f36310b.insert((androidx.room.w<androidx.work.impl.model.a>) dependency);
            this.f36309a.setTransactionSuccessful();
        } finally {
            this.f36309a.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.b
    public List<String> b(final String id2) {
        g2 d5 = g2.d("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (id2 == null) {
            d5.h3(1);
        } else {
            d5.c2(1, id2);
        }
        this.f36309a.assertNotSuspendingTransaction();
        Cursor f4 = androidx.room.util.b.f(this.f36309a, d5, false, null);
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

    @Override // androidx.work.impl.model.b
    public boolean c(final String id2) {
        g2 d5 = g2.d("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (id2 == null) {
            d5.h3(1);
        } else {
            d5.c2(1, id2);
        }
        this.f36309a.assertNotSuspendingTransaction();
        boolean z4 = false;
        Cursor f4 = androidx.room.util.b.f(this.f36309a, d5, false, null);
        try {
            if (f4.moveToFirst()) {
                z4 = f4.getInt(0) != 0;
            }
            return z4;
        } finally {
            f4.close();
            d5.release();
        }
    }

    @Override // androidx.work.impl.model.b
    public boolean d(final String id2) {
        g2 d5 = g2.d("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (id2 == null) {
            d5.h3(1);
        } else {
            d5.c2(1, id2);
        }
        this.f36309a.assertNotSuspendingTransaction();
        boolean z4 = false;
        Cursor f4 = androidx.room.util.b.f(this.f36309a, d5, false, null);
        try {
            if (f4.moveToFirst()) {
                z4 = f4.getInt(0) != 0;
            }
            return z4;
        } finally {
            f4.close();
            d5.release();
        }
    }

    @Override // androidx.work.impl.model.b
    public List<String> e(final String id2) {
        g2 d5 = g2.d("SELECT prerequisite_id FROM dependency WHERE work_spec_id=?", 1);
        if (id2 == null) {
            d5.h3(1);
        } else {
            d5.c2(1, id2);
        }
        this.f36309a.assertNotSuspendingTransaction();
        Cursor f4 = androidx.room.util.b.f(this.f36309a, d5, false, null);
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
