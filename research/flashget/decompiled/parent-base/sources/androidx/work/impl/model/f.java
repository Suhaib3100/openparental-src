package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.c2;
import androidx.room.g2;
import androidx.view.LiveData;
import java.util.concurrent.Callable;

/* compiled from: PreferenceDao_Impl.java */
/* loaded from: classes3.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    private final c2 f36314a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.room.w<d> f36315b;

    /* compiled from: PreferenceDao_Impl.java */
    class a extends androidx.room.w<d> {
        a(c2 database) {
            super(database);
        }

        @Override // androidx.room.w
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(f3.i stmt, d value) {
            String str = value.f36312a;
            if (str == null) {
                stmt.h3(1);
            } else {
                stmt.c2(1, str);
            }
            Long l4 = value.f36313b;
            if (l4 == null) {
                stmt.h3(2);
            } else {
                stmt.C2(2, l4.longValue());
            }
        }

        @Override // androidx.room.n2
        public String createQuery() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }
    }

    /* compiled from: PreferenceDao_Impl.java */
    class b implements Callable<Long> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g2 f36317a;

        b(final g2 val$_statement) {
            this.f36317a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long call() throws Exception {
            Long l4 = null;
            Cursor f4 = androidx.room.util.b.f(f.this.f36314a, this.f36317a, false, null);
            try {
                if (f4.moveToFirst() && !f4.isNull(0)) {
                    l4 = Long.valueOf(f4.getLong(0));
                }
                return l4;
            } finally {
                f4.close();
            }
        }

        protected void finalize() {
            this.f36317a.release();
        }
    }

    public f(c2 __db) {
        this.f36314a = __db;
        this.f36315b = new a(__db);
    }

    @Override // androidx.work.impl.model.e
    public LiveData<Long> a(final String key) {
        g2 d5 = g2.d("SELECT long_value FROM Preference where `key`=?", 1);
        if (key == null) {
            d5.h3(1);
        } else {
            d5.c2(1, key);
        }
        return this.f36314a.getInvalidationTracker().f(new String[]{"Preference"}, false, new b(d5));
    }

    @Override // androidx.work.impl.model.e
    public void b(final d preference) {
        this.f36314a.assertNotSuspendingTransaction();
        this.f36314a.beginTransaction();
        try {
            this.f36315b.insert((androidx.room.w<d>) preference);
            this.f36314a.setTransactionSuccessful();
        } finally {
            this.f36314a.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.e
    public Long c(final String key) {
        g2 d5 = g2.d("SELECT long_value FROM Preference where `key`=?", 1);
        if (key == null) {
            d5.h3(1);
        } else {
            d5.c2(1, key);
        }
        this.f36314a.assertNotSuspendingTransaction();
        Long l4 = null;
        Cursor f4 = androidx.room.util.b.f(this.f36314a, d5, false, null);
        try {
            if (f4.moveToFirst() && !f4.isNull(0)) {
                l4 = Long.valueOf(f4.getLong(0));
            }
            return l4;
        } finally {
            f4.close();
            d5.release();
        }
    }
}
