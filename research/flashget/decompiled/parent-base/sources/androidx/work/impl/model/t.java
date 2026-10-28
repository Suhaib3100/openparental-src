package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.c2;
import androidx.room.g2;
import androidx.room.n2;
import androidx.view.LiveData;
import androidx.work.f0;
import androidx.work.impl.model.r;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: WorkSpecDao_Impl.java */
/* loaded from: classes3.dex */
public final class t implements s {

    /* renamed from: a, reason: collision with root package name */
    private final c2 f36372a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.room.w<r> f36373b;

    /* renamed from: c, reason: collision with root package name */
    private final n2 f36374c;

    /* renamed from: d, reason: collision with root package name */
    private final n2 f36375d;

    /* renamed from: e, reason: collision with root package name */
    private final n2 f36376e;

    /* renamed from: f, reason: collision with root package name */
    private final n2 f36377f;

    /* renamed from: g, reason: collision with root package name */
    private final n2 f36378g;

    /* renamed from: h, reason: collision with root package name */
    private final n2 f36379h;

    /* renamed from: i, reason: collision with root package name */
    private final n2 f36380i;

    /* renamed from: j, reason: collision with root package name */
    private final n2 f36381j;

    /* compiled from: WorkSpecDao_Impl.java */
    class a implements Callable<List<String>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g2 f36382a;

        a(final g2 val$_statement) {
            this.f36382a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<String> call() throws Exception {
            t.this.f36372a.beginTransaction();
            try {
                Cursor f4 = androidx.room.util.b.f(t.this.f36372a, this.f36382a, false, null);
                try {
                    ArrayList arrayList = new ArrayList(f4.getCount());
                    while (f4.moveToNext()) {
                        arrayList.add(f4.getString(0));
                    }
                    t.this.f36372a.setTransactionSuccessful();
                    f4.close();
                    return arrayList;
                } catch (Throwable th) {
                    f4.close();
                    throw th;
                }
            } finally {
                t.this.f36372a.endTransaction();
            }
        }

        protected void finalize() {
            this.f36382a.release();
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    class b implements Callable<List<r.c>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g2 f36384a;

        b(final g2 val$_statement) {
            this.f36384a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<r.c> call() throws Exception {
            t.this.f36372a.beginTransaction();
            try {
                Cursor f4 = androidx.room.util.b.f(t.this.f36372a, this.f36384a, true, null);
                try {
                    int e4 = androidx.room.util.a.e(f4, "id");
                    int e5 = androidx.room.util.a.e(f4, "state");
                    int e6 = androidx.room.util.a.e(f4, "output");
                    int e7 = androidx.room.util.a.e(f4, "run_attempt_count");
                    androidx.collection.a aVar = new androidx.collection.a();
                    androidx.collection.a aVar2 = new androidx.collection.a();
                    while (f4.moveToNext()) {
                        if (!f4.isNull(e4)) {
                            String string = f4.getString(e4);
                            if (((ArrayList) aVar.get(string)) == null) {
                                aVar.put(string, new ArrayList());
                            }
                        }
                        if (!f4.isNull(e4)) {
                            String string2 = f4.getString(e4);
                            if (((ArrayList) aVar2.get(string2)) == null) {
                                aVar2.put(string2, new ArrayList());
                            }
                        }
                    }
                    f4.moveToPosition(-1);
                    t.this.J(aVar);
                    t.this.I(aVar2);
                    ArrayList arrayList = new ArrayList(f4.getCount());
                    while (f4.moveToNext()) {
                        ArrayList arrayList2 = !f4.isNull(e4) ? (ArrayList) aVar.get(f4.getString(e4)) : null;
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        ArrayList arrayList3 = !f4.isNull(e4) ? (ArrayList) aVar2.get(f4.getString(e4)) : null;
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        r.c cVar = new r.c();
                        cVar.f36366a = f4.getString(e4);
                        cVar.f36367b = x.g(f4.getInt(e5));
                        cVar.f36368c = androidx.work.f.m(f4.getBlob(e6));
                        cVar.f36369d = f4.getInt(e7);
                        cVar.f36370e = arrayList2;
                        cVar.f36371f = arrayList3;
                        arrayList.add(cVar);
                    }
                    t.this.f36372a.setTransactionSuccessful();
                    f4.close();
                    return arrayList;
                } catch (Throwable th) {
                    f4.close();
                    throw th;
                }
            } finally {
                t.this.f36372a.endTransaction();
            }
        }

        protected void finalize() {
            this.f36384a.release();
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    class c implements Callable<List<r.c>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g2 f36386a;

        c(final g2 val$_statement) {
            this.f36386a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<r.c> call() throws Exception {
            t.this.f36372a.beginTransaction();
            try {
                Cursor f4 = androidx.room.util.b.f(t.this.f36372a, this.f36386a, true, null);
                try {
                    int e4 = androidx.room.util.a.e(f4, "id");
                    int e5 = androidx.room.util.a.e(f4, "state");
                    int e6 = androidx.room.util.a.e(f4, "output");
                    int e7 = androidx.room.util.a.e(f4, "run_attempt_count");
                    androidx.collection.a aVar = new androidx.collection.a();
                    androidx.collection.a aVar2 = new androidx.collection.a();
                    while (f4.moveToNext()) {
                        if (!f4.isNull(e4)) {
                            String string = f4.getString(e4);
                            if (((ArrayList) aVar.get(string)) == null) {
                                aVar.put(string, new ArrayList());
                            }
                        }
                        if (!f4.isNull(e4)) {
                            String string2 = f4.getString(e4);
                            if (((ArrayList) aVar2.get(string2)) == null) {
                                aVar2.put(string2, new ArrayList());
                            }
                        }
                    }
                    f4.moveToPosition(-1);
                    t.this.J(aVar);
                    t.this.I(aVar2);
                    ArrayList arrayList = new ArrayList(f4.getCount());
                    while (f4.moveToNext()) {
                        ArrayList arrayList2 = !f4.isNull(e4) ? (ArrayList) aVar.get(f4.getString(e4)) : null;
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        ArrayList arrayList3 = !f4.isNull(e4) ? (ArrayList) aVar2.get(f4.getString(e4)) : null;
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        r.c cVar = new r.c();
                        cVar.f36366a = f4.getString(e4);
                        cVar.f36367b = x.g(f4.getInt(e5));
                        cVar.f36368c = androidx.work.f.m(f4.getBlob(e6));
                        cVar.f36369d = f4.getInt(e7);
                        cVar.f36370e = arrayList2;
                        cVar.f36371f = arrayList3;
                        arrayList.add(cVar);
                    }
                    t.this.f36372a.setTransactionSuccessful();
                    f4.close();
                    return arrayList;
                } catch (Throwable th) {
                    f4.close();
                    throw th;
                }
            } finally {
                t.this.f36372a.endTransaction();
            }
        }

        protected void finalize() {
            this.f36386a.release();
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    class d implements Callable<List<r.c>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g2 f36388a;

        d(final g2 val$_statement) {
            this.f36388a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<r.c> call() throws Exception {
            t.this.f36372a.beginTransaction();
            try {
                Cursor f4 = androidx.room.util.b.f(t.this.f36372a, this.f36388a, true, null);
                try {
                    int e4 = androidx.room.util.a.e(f4, "id");
                    int e5 = androidx.room.util.a.e(f4, "state");
                    int e6 = androidx.room.util.a.e(f4, "output");
                    int e7 = androidx.room.util.a.e(f4, "run_attempt_count");
                    androidx.collection.a aVar = new androidx.collection.a();
                    androidx.collection.a aVar2 = new androidx.collection.a();
                    while (f4.moveToNext()) {
                        if (!f4.isNull(e4)) {
                            String string = f4.getString(e4);
                            if (((ArrayList) aVar.get(string)) == null) {
                                aVar.put(string, new ArrayList());
                            }
                        }
                        if (!f4.isNull(e4)) {
                            String string2 = f4.getString(e4);
                            if (((ArrayList) aVar2.get(string2)) == null) {
                                aVar2.put(string2, new ArrayList());
                            }
                        }
                    }
                    f4.moveToPosition(-1);
                    t.this.J(aVar);
                    t.this.I(aVar2);
                    ArrayList arrayList = new ArrayList(f4.getCount());
                    while (f4.moveToNext()) {
                        ArrayList arrayList2 = !f4.isNull(e4) ? (ArrayList) aVar.get(f4.getString(e4)) : null;
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        ArrayList arrayList3 = !f4.isNull(e4) ? (ArrayList) aVar2.get(f4.getString(e4)) : null;
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        r.c cVar = new r.c();
                        cVar.f36366a = f4.getString(e4);
                        cVar.f36367b = x.g(f4.getInt(e5));
                        cVar.f36368c = androidx.work.f.m(f4.getBlob(e6));
                        cVar.f36369d = f4.getInt(e7);
                        cVar.f36370e = arrayList2;
                        cVar.f36371f = arrayList3;
                        arrayList.add(cVar);
                    }
                    t.this.f36372a.setTransactionSuccessful();
                    f4.close();
                    return arrayList;
                } catch (Throwable th) {
                    f4.close();
                    throw th;
                }
            } finally {
                t.this.f36372a.endTransaction();
            }
        }

        protected void finalize() {
            this.f36388a.release();
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    class e implements Callable<Long> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g2 f36390a;

        e(final g2 val$_statement) {
            this.f36390a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long call() throws Exception {
            Long l4 = null;
            Cursor f4 = androidx.room.util.b.f(t.this.f36372a, this.f36390a, false, null);
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
            this.f36390a.release();
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    class f extends androidx.room.w<r> {
        f(c2 database) {
            super(database);
        }

        @Override // androidx.room.w
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(f3.i iVar, r rVar) {
            String str = rVar.f36346a;
            if (str == null) {
                iVar.h3(1);
            } else {
                iVar.c2(1, str);
            }
            iVar.C2(2, x.j(rVar.f36347b));
            String str2 = rVar.f36348c;
            if (str2 == null) {
                iVar.h3(3);
            } else {
                iVar.c2(3, str2);
            }
            String str3 = rVar.f36349d;
            if (str3 == null) {
                iVar.h3(4);
            } else {
                iVar.c2(4, str3);
            }
            byte[] F = androidx.work.f.F(rVar.f36350e);
            if (F == null) {
                iVar.h3(5);
            } else {
                iVar.L2(5, F);
            }
            byte[] F2 = androidx.work.f.F(rVar.f36351f);
            if (F2 == null) {
                iVar.h3(6);
            } else {
                iVar.L2(6, F2);
            }
            iVar.C2(7, rVar.f36352g);
            iVar.C2(8, rVar.f36353h);
            iVar.C2(9, rVar.f36354i);
            iVar.C2(10, rVar.f36356k);
            iVar.C2(11, x.a(rVar.f36357l));
            iVar.C2(12, rVar.f36358m);
            iVar.C2(13, rVar.f36359n);
            iVar.C2(14, rVar.f36360o);
            iVar.C2(15, rVar.f36361p);
            iVar.C2(16, rVar.f36362q ? 1L : 0L);
            iVar.C2(17, x.i(rVar.f36363r));
            androidx.work.d dVar = rVar.f36355j;
            if (dVar == null) {
                iVar.h3(18);
                iVar.h3(19);
                iVar.h3(20);
                iVar.h3(21);
                iVar.h3(22);
                iVar.h3(23);
                iVar.h3(24);
                iVar.h3(25);
                return;
            }
            iVar.C2(18, x.h(dVar.b()));
            iVar.C2(19, dVar.g() ? 1L : 0L);
            iVar.C2(20, dVar.h() ? 1L : 0L);
            iVar.C2(21, dVar.f() ? 1L : 0L);
            iVar.C2(22, dVar.i() ? 1L : 0L);
            iVar.C2(23, dVar.c());
            iVar.C2(24, dVar.d());
            byte[] c5 = x.c(dVar.a());
            if (c5 == null) {
                iVar.h3(25);
            } else {
                iVar.L2(25, c5);
            }
        }

        @Override // androidx.room.n2
        public String createQuery() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    class g extends n2 {
        g(c2 database) {
            super(database);
        }

        @Override // androidx.room.n2
        public String createQuery() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    class h extends n2 {
        h(c2 database) {
            super(database);
        }

        @Override // androidx.room.n2
        public String createQuery() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    class i extends n2 {
        i(c2 database) {
            super(database);
        }

        @Override // androidx.room.n2
        public String createQuery() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    class j extends n2 {
        j(c2 database) {
            super(database);
        }

        @Override // androidx.room.n2
        public String createQuery() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    class k extends n2 {
        k(c2 database) {
            super(database);
        }

        @Override // androidx.room.n2
        public String createQuery() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    class l extends n2 {
        l(c2 database) {
            super(database);
        }

        @Override // androidx.room.n2
        public String createQuery() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    class m extends n2 {
        m(c2 database) {
            super(database);
        }

        @Override // androidx.room.n2
        public String createQuery() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    class n extends n2 {
        n(c2 database) {
            super(database);
        }

        @Override // androidx.room.n2
        public String createQuery() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public t(c2 __db) {
        this.f36372a = __db;
        this.f36373b = new f(__db);
        this.f36374c = new g(__db);
        this.f36375d = new h(__db);
        this.f36376e = new i(__db);
        this.f36377f = new j(__db);
        this.f36378g = new k(__db);
        this.f36379h = new l(__db);
        this.f36380i = new m(__db);
        this.f36381j = new n(__db);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I(final androidx.collection.a<String, ArrayList<androidx.work.f>> _map) {
        ArrayList<androidx.work.f> arrayList;
        Set<String> keySet = _map.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (_map.getSize() > 999) {
            androidx.collection.a<String, ArrayList<androidx.work.f>> aVar = new androidx.collection.a<>(999);
            int size = _map.getSize();
            int i4 = 0;
            int i5 = 0;
            while (i4 < size) {
                aVar.put(_map.keyAt(i4), _map.valueAt(i4));
                i4++;
                i5++;
                if (i5 == 999) {
                    I(aVar);
                    aVar = new androidx.collection.a<>(999);
                    i5 = 0;
                }
            }
            if (i5 > 0) {
                I(aVar);
                return;
            }
            return;
        }
        StringBuilder d5 = androidx.room.util.f.d();
        d5.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size2 = keySet.size();
        androidx.room.util.f.a(d5, size2);
        d5.append(")");
        g2 d6 = g2.d(d5.toString(), size2);
        int i6 = 1;
        for (String str : keySet) {
            if (str == null) {
                d6.h3(i6);
            } else {
                d6.c2(i6, str);
            }
            i6++;
        }
        Cursor f4 = androidx.room.util.b.f(this.f36372a, d6, false, null);
        try {
            int d7 = androidx.room.util.a.d(f4, "work_spec_id");
            if (d7 == -1) {
                return;
            }
            while (f4.moveToNext()) {
                if (!f4.isNull(d7) && (arrayList = _map.get(f4.getString(d7))) != null) {
                    arrayList.add(androidx.work.f.m(f4.getBlob(0)));
                }
            }
        } finally {
            f4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J(final androidx.collection.a<String, ArrayList<String>> _map) {
        ArrayList<String> arrayList;
        Set<String> keySet = _map.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (_map.getSize() > 999) {
            androidx.collection.a<String, ArrayList<String>> aVar = new androidx.collection.a<>(999);
            int size = _map.getSize();
            int i4 = 0;
            int i5 = 0;
            while (i4 < size) {
                aVar.put(_map.keyAt(i4), _map.valueAt(i4));
                i4++;
                i5++;
                if (i5 == 999) {
                    J(aVar);
                    aVar = new androidx.collection.a<>(999);
                    i5 = 0;
                }
            }
            if (i5 > 0) {
                J(aVar);
                return;
            }
            return;
        }
        StringBuilder d5 = androidx.room.util.f.d();
        d5.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size2 = keySet.size();
        androidx.room.util.f.a(d5, size2);
        d5.append(")");
        g2 d6 = g2.d(d5.toString(), size2);
        int i6 = 1;
        for (String str : keySet) {
            if (str == null) {
                d6.h3(i6);
            } else {
                d6.c2(i6, str);
            }
            i6++;
        }
        Cursor f4 = androidx.room.util.b.f(this.f36372a, d6, false, null);
        try {
            int d7 = androidx.room.util.a.d(f4, "work_spec_id");
            if (d7 == -1) {
                return;
            }
            while (f4.moveToNext()) {
                if (!f4.isNull(d7) && (arrayList = _map.get(f4.getString(d7))) != null) {
                    arrayList.add(f4.getString(0));
                }
            }
        } finally {
            f4.close();
        }
    }

    @Override // androidx.work.impl.model.s
    public boolean A() {
        boolean z4 = false;
        g2 d5 = g2.d("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.f36372a.assertNotSuspendingTransaction();
        Cursor f4 = androidx.room.util.b.f(this.f36372a, d5, false, null);
        try {
            if (f4.moveToFirst()) {
                if (f4.getInt(0) != 0) {
                    z4 = true;
                }
            }
            return z4;
        } finally {
            f4.close();
            d5.release();
        }
    }

    @Override // androidx.work.impl.model.s
    public int B(final String id2) {
        this.f36372a.assertNotSuspendingTransaction();
        f3.i acquire = this.f36378g.acquire();
        if (id2 == null) {
            acquire.h3(1);
        } else {
            acquire.c2(1, id2);
        }
        this.f36372a.beginTransaction();
        try {
            int h02 = acquire.h0();
            this.f36372a.setTransactionSuccessful();
            return h02;
        } finally {
            this.f36372a.endTransaction();
            this.f36378g.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.s
    public List<r.c> C(final String tag) {
        g2 d5 = g2.d("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (tag == null) {
            d5.h3(1);
        } else {
            d5.c2(1, tag);
        }
        this.f36372a.assertNotSuspendingTransaction();
        this.f36372a.beginTransaction();
        try {
            Cursor f4 = androidx.room.util.b.f(this.f36372a, d5, true, null);
            try {
                int e4 = androidx.room.util.a.e(f4, "id");
                int e5 = androidx.room.util.a.e(f4, "state");
                int e6 = androidx.room.util.a.e(f4, "output");
                int e7 = androidx.room.util.a.e(f4, "run_attempt_count");
                androidx.collection.a<String, ArrayList<String>> aVar = new androidx.collection.a<>();
                androidx.collection.a<String, ArrayList<androidx.work.f>> aVar2 = new androidx.collection.a<>();
                while (f4.moveToNext()) {
                    if (!f4.isNull(e4)) {
                        String string = f4.getString(e4);
                        if (aVar.get(string) == null) {
                            aVar.put(string, new ArrayList<>());
                        }
                    }
                    if (!f4.isNull(e4)) {
                        String string2 = f4.getString(e4);
                        if (aVar2.get(string2) == null) {
                            aVar2.put(string2, new ArrayList<>());
                        }
                    }
                }
                f4.moveToPosition(-1);
                J(aVar);
                I(aVar2);
                ArrayList arrayList = new ArrayList(f4.getCount());
                while (f4.moveToNext()) {
                    ArrayList<String> arrayList2 = !f4.isNull(e4) ? aVar.get(f4.getString(e4)) : null;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    ArrayList<androidx.work.f> arrayList3 = !f4.isNull(e4) ? aVar2.get(f4.getString(e4)) : null;
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList<>();
                    }
                    r.c cVar = new r.c();
                    cVar.f36366a = f4.getString(e4);
                    cVar.f36367b = x.g(f4.getInt(e5));
                    cVar.f36368c = androidx.work.f.m(f4.getBlob(e6));
                    cVar.f36369d = f4.getInt(e7);
                    cVar.f36370e = arrayList2;
                    cVar.f36371f = arrayList3;
                    arrayList.add(cVar);
                }
                this.f36372a.setTransactionSuccessful();
                f4.close();
                d5.release();
                return arrayList;
            } catch (Throwable th) {
                f4.close();
                d5.release();
                throw th;
            }
        } finally {
            this.f36372a.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.s
    public LiveData<List<r.c>> D(final List<String> ids) {
        StringBuilder d5 = androidx.room.util.f.d();
        d5.append("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (");
        int size = ids.size();
        androidx.room.util.f.a(d5, size);
        d5.append(")");
        g2 d6 = g2.d(d5.toString(), size);
        int i4 = 1;
        for (String str : ids) {
            if (str == null) {
                d6.h3(i4);
            } else {
                d6.c2(i4, str);
            }
            i4++;
        }
        return this.f36372a.getInvalidationTracker().f(new String[]{"WorkTag", "WorkProgress", "workspec"}, true, new b(d6));
    }

    @Override // androidx.work.impl.model.s
    public int E(final String id2) {
        this.f36372a.assertNotSuspendingTransaction();
        f3.i acquire = this.f36377f.acquire();
        if (id2 == null) {
            acquire.h3(1);
        } else {
            acquire.c2(1, id2);
        }
        this.f36372a.beginTransaction();
        try {
            int h02 = acquire.h0();
            this.f36372a.setTransactionSuccessful();
            return h02;
        } finally {
            this.f36372a.endTransaction();
            this.f36377f.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.s
    public void F(final String id2, final long periodStartTime) {
        this.f36372a.assertNotSuspendingTransaction();
        f3.i acquire = this.f36376e.acquire();
        acquire.C2(1, periodStartTime);
        if (id2 == null) {
            acquire.h3(2);
        } else {
            acquire.c2(2, id2);
        }
        this.f36372a.beginTransaction();
        try {
            acquire.h0();
            this.f36372a.setTransactionSuccessful();
        } finally {
            this.f36372a.endTransaction();
            this.f36376e.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.s
    public List<r.c> G(final List<String> ids) {
        StringBuilder d5 = androidx.room.util.f.d();
        d5.append("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (");
        int size = ids.size();
        androidx.room.util.f.a(d5, size);
        d5.append(")");
        g2 d6 = g2.d(d5.toString(), size);
        int i4 = 1;
        for (String str : ids) {
            if (str == null) {
                d6.h3(i4);
            } else {
                d6.c2(i4, str);
            }
            i4++;
        }
        this.f36372a.assertNotSuspendingTransaction();
        this.f36372a.beginTransaction();
        try {
            Cursor f4 = androidx.room.util.b.f(this.f36372a, d6, true, null);
            try {
                int e4 = androidx.room.util.a.e(f4, "id");
                int e5 = androidx.room.util.a.e(f4, "state");
                int e6 = androidx.room.util.a.e(f4, "output");
                int e7 = androidx.room.util.a.e(f4, "run_attempt_count");
                androidx.collection.a<String, ArrayList<String>> aVar = new androidx.collection.a<>();
                androidx.collection.a<String, ArrayList<androidx.work.f>> aVar2 = new androidx.collection.a<>();
                while (f4.moveToNext()) {
                    if (!f4.isNull(e4)) {
                        String string = f4.getString(e4);
                        if (aVar.get(string) == null) {
                            aVar.put(string, new ArrayList<>());
                        }
                    }
                    if (!f4.isNull(e4)) {
                        String string2 = f4.getString(e4);
                        if (aVar2.get(string2) == null) {
                            aVar2.put(string2, new ArrayList<>());
                        }
                    }
                }
                f4.moveToPosition(-1);
                J(aVar);
                I(aVar2);
                ArrayList arrayList = new ArrayList(f4.getCount());
                while (f4.moveToNext()) {
                    ArrayList<String> arrayList2 = !f4.isNull(e4) ? aVar.get(f4.getString(e4)) : null;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    ArrayList<androidx.work.f> arrayList3 = !f4.isNull(e4) ? aVar2.get(f4.getString(e4)) : null;
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList<>();
                    }
                    r.c cVar = new r.c();
                    cVar.f36366a = f4.getString(e4);
                    cVar.f36367b = x.g(f4.getInt(e5));
                    cVar.f36368c = androidx.work.f.m(f4.getBlob(e6));
                    cVar.f36369d = f4.getInt(e7);
                    cVar.f36370e = arrayList2;
                    cVar.f36371f = arrayList3;
                    arrayList.add(cVar);
                }
                this.f36372a.setTransactionSuccessful();
                f4.close();
                d6.release();
                return arrayList;
            } catch (Throwable th) {
                f4.close();
                d6.release();
                throw th;
            }
        } finally {
            this.f36372a.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.s
    public List<String> H() {
        g2 d5 = g2.d("SELECT id FROM workspec", 0);
        this.f36372a.assertNotSuspendingTransaction();
        Cursor f4 = androidx.room.util.b.f(this.f36372a, d5, false, null);
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

    @Override // androidx.work.impl.model.s
    public void a(final String id2) {
        this.f36372a.assertNotSuspendingTransaction();
        f3.i acquire = this.f36374c.acquire();
        if (id2 == null) {
            acquire.h3(1);
        } else {
            acquire.c2(1, id2);
        }
        this.f36372a.beginTransaction();
        try {
            acquire.h0();
            this.f36372a.setTransactionSuccessful();
        } finally {
            this.f36372a.endTransaction();
            this.f36374c.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.s
    public int b(final f0.a state, final String... ids) {
        this.f36372a.assertNotSuspendingTransaction();
        StringBuilder d5 = androidx.room.util.f.d();
        d5.append("UPDATE workspec SET state=");
        d5.append("?");
        d5.append(" WHERE id IN (");
        androidx.room.util.f.a(d5, ids.length);
        d5.append(")");
        f3.i compileStatement = this.f36372a.compileStatement(d5.toString());
        compileStatement.C2(1, x.j(state));
        int i4 = 2;
        for (String str : ids) {
            if (str == null) {
                compileStatement.h3(i4);
            } else {
                compileStatement.c2(i4, str);
            }
            i4++;
        }
        this.f36372a.beginTransaction();
        try {
            int h02 = compileStatement.h0();
            this.f36372a.setTransactionSuccessful();
            return h02;
        } finally {
            this.f36372a.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.s
    public void c() {
        this.f36372a.assertNotSuspendingTransaction();
        f3.i acquire = this.f36381j.acquire();
        this.f36372a.beginTransaction();
        try {
            acquire.h0();
            this.f36372a.setTransactionSuccessful();
        } finally {
            this.f36372a.endTransaction();
            this.f36381j.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.s
    public List<r> d(final long startingAt) {
        g2 g2Var;
        g2 d5 = g2.d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        d5.C2(1, startingAt);
        this.f36372a.assertNotSuspendingTransaction();
        Cursor f4 = androidx.room.util.b.f(this.f36372a, d5, false, null);
        try {
            int e4 = androidx.room.util.a.e(f4, "required_network_type");
            int e5 = androidx.room.util.a.e(f4, "requires_charging");
            int e6 = androidx.room.util.a.e(f4, "requires_device_idle");
            int e7 = androidx.room.util.a.e(f4, "requires_battery_not_low");
            int e10 = androidx.room.util.a.e(f4, "requires_storage_not_low");
            int e11 = androidx.room.util.a.e(f4, "trigger_content_update_delay");
            int e12 = androidx.room.util.a.e(f4, "trigger_max_content_delay");
            int e13 = androidx.room.util.a.e(f4, "content_uri_triggers");
            int e14 = androidx.room.util.a.e(f4, "id");
            int e15 = androidx.room.util.a.e(f4, "state");
            int e16 = androidx.room.util.a.e(f4, "worker_class_name");
            int e17 = androidx.room.util.a.e(f4, "input_merger_class_name");
            int e18 = androidx.room.util.a.e(f4, "input");
            int e19 = androidx.room.util.a.e(f4, "output");
            g2Var = d5;
            try {
                int e20 = androidx.room.util.a.e(f4, "initial_delay");
                int e21 = androidx.room.util.a.e(f4, "interval_duration");
                int e22 = androidx.room.util.a.e(f4, "flex_duration");
                int e23 = androidx.room.util.a.e(f4, "run_attempt_count");
                int e24 = androidx.room.util.a.e(f4, "backoff_policy");
                int e25 = androidx.room.util.a.e(f4, "backoff_delay_duration");
                int e26 = androidx.room.util.a.e(f4, "period_start_time");
                int e27 = androidx.room.util.a.e(f4, "minimum_retention_duration");
                int e28 = androidx.room.util.a.e(f4, "schedule_requested_at");
                int e29 = androidx.room.util.a.e(f4, "run_in_foreground");
                int e30 = androidx.room.util.a.e(f4, "out_of_quota_policy");
                int i4 = e19;
                ArrayList arrayList = new ArrayList(f4.getCount());
                while (f4.moveToNext()) {
                    String string = f4.getString(e14);
                    int i5 = e14;
                    String string2 = f4.getString(e16);
                    int i6 = e16;
                    androidx.work.d dVar = new androidx.work.d();
                    int i7 = e4;
                    dVar.k(x.e(f4.getInt(e4)));
                    dVar.m(f4.getInt(e5) != 0);
                    dVar.n(f4.getInt(e6) != 0);
                    dVar.l(f4.getInt(e7) != 0);
                    dVar.o(f4.getInt(e10) != 0);
                    int i10 = e5;
                    int i11 = e6;
                    dVar.p(f4.getLong(e11));
                    dVar.q(f4.getLong(e12));
                    dVar.j(x.b(f4.getBlob(e13)));
                    r rVar = new r(string, string2);
                    rVar.f36347b = x.g(f4.getInt(e15));
                    rVar.f36349d = f4.getString(e17);
                    rVar.f36350e = androidx.work.f.m(f4.getBlob(e18));
                    int i12 = i4;
                    rVar.f36351f = androidx.work.f.m(f4.getBlob(i12));
                    int i13 = e20;
                    i4 = i12;
                    rVar.f36352g = f4.getLong(i13);
                    int i14 = e17;
                    int i15 = e21;
                    rVar.f36353h = f4.getLong(i15);
                    int i16 = e7;
                    int i17 = e22;
                    rVar.f36354i = f4.getLong(i17);
                    int i18 = e23;
                    rVar.f36356k = f4.getInt(i18);
                    int i19 = e24;
                    rVar.f36357l = x.d(f4.getInt(i19));
                    e22 = i17;
                    int i20 = e25;
                    rVar.f36358m = f4.getLong(i20);
                    int i21 = e26;
                    rVar.f36359n = f4.getLong(i21);
                    e26 = i21;
                    int i22 = e27;
                    rVar.f36360o = f4.getLong(i22);
                    int i23 = e28;
                    rVar.f36361p = f4.getLong(i23);
                    int i24 = e29;
                    rVar.f36362q = f4.getInt(i24) != 0;
                    int i25 = e30;
                    rVar.f36363r = x.f(f4.getInt(i25));
                    rVar.f36355j = dVar;
                    arrayList.add(rVar);
                    e5 = i10;
                    e30 = i25;
                    e17 = i14;
                    e20 = i13;
                    e21 = i15;
                    e23 = i18;
                    e28 = i23;
                    e14 = i5;
                    e16 = i6;
                    e4 = i7;
                    e29 = i24;
                    e27 = i22;
                    e6 = i11;
                    e25 = i20;
                    e7 = i16;
                    e24 = i19;
                }
                f4.close();
                g2Var.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                f4.close();
                g2Var.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            g2Var = d5;
        }
    }

    @Override // androidx.work.impl.model.s
    public void e(final r workSpec) {
        this.f36372a.assertNotSuspendingTransaction();
        this.f36372a.beginTransaction();
        try {
            this.f36373b.insert((androidx.room.w<r>) workSpec);
            this.f36372a.setTransactionSuccessful();
        } finally {
            this.f36372a.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.s
    public List<r> f() {
        g2 g2Var;
        g2 d5 = g2.d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f36372a.assertNotSuspendingTransaction();
        Cursor f4 = androidx.room.util.b.f(this.f36372a, d5, false, null);
        try {
            int e4 = androidx.room.util.a.e(f4, "required_network_type");
            int e5 = androidx.room.util.a.e(f4, "requires_charging");
            int e6 = androidx.room.util.a.e(f4, "requires_device_idle");
            int e7 = androidx.room.util.a.e(f4, "requires_battery_not_low");
            int e10 = androidx.room.util.a.e(f4, "requires_storage_not_low");
            int e11 = androidx.room.util.a.e(f4, "trigger_content_update_delay");
            int e12 = androidx.room.util.a.e(f4, "trigger_max_content_delay");
            int e13 = androidx.room.util.a.e(f4, "content_uri_triggers");
            int e14 = androidx.room.util.a.e(f4, "id");
            int e15 = androidx.room.util.a.e(f4, "state");
            int e16 = androidx.room.util.a.e(f4, "worker_class_name");
            int e17 = androidx.room.util.a.e(f4, "input_merger_class_name");
            int e18 = androidx.room.util.a.e(f4, "input");
            int e19 = androidx.room.util.a.e(f4, "output");
            g2Var = d5;
            try {
                int e20 = androidx.room.util.a.e(f4, "initial_delay");
                int e21 = androidx.room.util.a.e(f4, "interval_duration");
                int e22 = androidx.room.util.a.e(f4, "flex_duration");
                int e23 = androidx.room.util.a.e(f4, "run_attempt_count");
                int e24 = androidx.room.util.a.e(f4, "backoff_policy");
                int e25 = androidx.room.util.a.e(f4, "backoff_delay_duration");
                int e26 = androidx.room.util.a.e(f4, "period_start_time");
                int e27 = androidx.room.util.a.e(f4, "minimum_retention_duration");
                int e28 = androidx.room.util.a.e(f4, "schedule_requested_at");
                int e29 = androidx.room.util.a.e(f4, "run_in_foreground");
                int e30 = androidx.room.util.a.e(f4, "out_of_quota_policy");
                int i4 = e19;
                ArrayList arrayList = new ArrayList(f4.getCount());
                while (f4.moveToNext()) {
                    String string = f4.getString(e14);
                    int i5 = e14;
                    String string2 = f4.getString(e16);
                    int i6 = e16;
                    androidx.work.d dVar = new androidx.work.d();
                    int i7 = e4;
                    dVar.k(x.e(f4.getInt(e4)));
                    dVar.m(f4.getInt(e5) != 0);
                    dVar.n(f4.getInt(e6) != 0);
                    dVar.l(f4.getInt(e7) != 0);
                    dVar.o(f4.getInt(e10) != 0);
                    int i10 = e5;
                    int i11 = e6;
                    dVar.p(f4.getLong(e11));
                    dVar.q(f4.getLong(e12));
                    dVar.j(x.b(f4.getBlob(e13)));
                    r rVar = new r(string, string2);
                    rVar.f36347b = x.g(f4.getInt(e15));
                    rVar.f36349d = f4.getString(e17);
                    rVar.f36350e = androidx.work.f.m(f4.getBlob(e18));
                    int i12 = i4;
                    rVar.f36351f = androidx.work.f.m(f4.getBlob(i12));
                    i4 = i12;
                    int i13 = e20;
                    rVar.f36352g = f4.getLong(i13);
                    int i14 = e18;
                    int i15 = e21;
                    rVar.f36353h = f4.getLong(i15);
                    int i16 = e7;
                    int i17 = e22;
                    rVar.f36354i = f4.getLong(i17);
                    int i18 = e23;
                    rVar.f36356k = f4.getInt(i18);
                    int i19 = e24;
                    rVar.f36357l = x.d(f4.getInt(i19));
                    e22 = i17;
                    int i20 = e25;
                    rVar.f36358m = f4.getLong(i20);
                    int i21 = e26;
                    rVar.f36359n = f4.getLong(i21);
                    e26 = i21;
                    int i22 = e27;
                    rVar.f36360o = f4.getLong(i22);
                    int i23 = e28;
                    rVar.f36361p = f4.getLong(i23);
                    int i24 = e29;
                    rVar.f36362q = f4.getInt(i24) != 0;
                    int i25 = e30;
                    rVar.f36363r = x.f(f4.getInt(i25));
                    rVar.f36355j = dVar;
                    arrayList.add(rVar);
                    e30 = i25;
                    e5 = i10;
                    e18 = i14;
                    e20 = i13;
                    e21 = i15;
                    e23 = i18;
                    e28 = i23;
                    e14 = i5;
                    e16 = i6;
                    e4 = i7;
                    e29 = i24;
                    e27 = i22;
                    e6 = i11;
                    e25 = i20;
                    e7 = i16;
                    e24 = i19;
                }
                f4.close();
                g2Var.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                f4.close();
                g2Var.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            g2Var = d5;
        }
    }

    @Override // androidx.work.impl.model.s
    public r[] g(final List<String> ids) {
        g2 g2Var;
        StringBuilder d5 = androidx.room.util.f.d();
        d5.append("SELECT ");
        d5.append("*");
        d5.append(" FROM workspec WHERE id IN (");
        int size = ids.size();
        androidx.room.util.f.a(d5, size);
        d5.append(")");
        g2 d6 = g2.d(d5.toString(), size);
        int i4 = 1;
        for (String str : ids) {
            if (str == null) {
                d6.h3(i4);
            } else {
                d6.c2(i4, str);
            }
            i4++;
        }
        this.f36372a.assertNotSuspendingTransaction();
        Cursor f4 = androidx.room.util.b.f(this.f36372a, d6, false, null);
        try {
            int e4 = androidx.room.util.a.e(f4, "required_network_type");
            int e5 = androidx.room.util.a.e(f4, "requires_charging");
            int e6 = androidx.room.util.a.e(f4, "requires_device_idle");
            int e7 = androidx.room.util.a.e(f4, "requires_battery_not_low");
            int e10 = androidx.room.util.a.e(f4, "requires_storage_not_low");
            int e11 = androidx.room.util.a.e(f4, "trigger_content_update_delay");
            int e12 = androidx.room.util.a.e(f4, "trigger_max_content_delay");
            int e13 = androidx.room.util.a.e(f4, "content_uri_triggers");
            int e14 = androidx.room.util.a.e(f4, "id");
            int e15 = androidx.room.util.a.e(f4, "state");
            int e16 = androidx.room.util.a.e(f4, "worker_class_name");
            int e17 = androidx.room.util.a.e(f4, "input_merger_class_name");
            int e18 = androidx.room.util.a.e(f4, "input");
            int e19 = androidx.room.util.a.e(f4, "output");
            g2Var = d6;
            try {
                int e20 = androidx.room.util.a.e(f4, "initial_delay");
                int e21 = androidx.room.util.a.e(f4, "interval_duration");
                int e22 = androidx.room.util.a.e(f4, "flex_duration");
                int e23 = androidx.room.util.a.e(f4, "run_attempt_count");
                int e24 = androidx.room.util.a.e(f4, "backoff_policy");
                int e25 = androidx.room.util.a.e(f4, "backoff_delay_duration");
                int e26 = androidx.room.util.a.e(f4, "period_start_time");
                int e27 = androidx.room.util.a.e(f4, "minimum_retention_duration");
                int e28 = androidx.room.util.a.e(f4, "schedule_requested_at");
                int e29 = androidx.room.util.a.e(f4, "run_in_foreground");
                int e30 = androidx.room.util.a.e(f4, "out_of_quota_policy");
                r[] rVarArr = new r[f4.getCount()];
                int i5 = 0;
                while (f4.moveToNext()) {
                    r[] rVarArr2 = rVarArr;
                    String string = f4.getString(e14);
                    int i6 = e14;
                    String string2 = f4.getString(e16);
                    int i7 = e16;
                    androidx.work.d dVar = new androidx.work.d();
                    int i10 = e4;
                    dVar.k(x.e(f4.getInt(e4)));
                    dVar.m(f4.getInt(e5) != 0);
                    dVar.n(f4.getInt(e6) != 0);
                    dVar.l(f4.getInt(e7) != 0);
                    dVar.o(f4.getInt(e10) != 0);
                    int i11 = e5;
                    int i12 = e6;
                    dVar.p(f4.getLong(e11));
                    dVar.q(f4.getLong(e12));
                    dVar.j(x.b(f4.getBlob(e13)));
                    r rVar = new r(string, string2);
                    rVar.f36347b = x.g(f4.getInt(e15));
                    rVar.f36349d = f4.getString(e17);
                    rVar.f36350e = androidx.work.f.m(f4.getBlob(e18));
                    rVar.f36351f = androidx.work.f.m(f4.getBlob(e19));
                    int i13 = e19;
                    int i14 = e20;
                    rVar.f36352g = f4.getLong(i14);
                    e20 = i14;
                    int i15 = e21;
                    rVar.f36353h = f4.getLong(i15);
                    int i16 = e17;
                    int i17 = e22;
                    rVar.f36354i = f4.getLong(i17);
                    int i18 = e23;
                    rVar.f36356k = f4.getInt(i18);
                    int i19 = e24;
                    rVar.f36357l = x.d(f4.getInt(i19));
                    e22 = i17;
                    int i20 = e25;
                    rVar.f36358m = f4.getLong(i20);
                    int i21 = e26;
                    rVar.f36359n = f4.getLong(i21);
                    e26 = i21;
                    int i22 = e27;
                    rVar.f36360o = f4.getLong(i22);
                    e27 = i22;
                    int i23 = e28;
                    rVar.f36361p = f4.getLong(i23);
                    int i24 = e29;
                    rVar.f36362q = f4.getInt(i24) != 0;
                    int i25 = e30;
                    rVar.f36363r = x.f(f4.getInt(i25));
                    rVar.f36355j = dVar;
                    rVarArr2[i5] = rVar;
                    i5++;
                    e30 = i25;
                    e5 = i11;
                    e28 = i23;
                    rVarArr = rVarArr2;
                    e14 = i6;
                    e16 = i7;
                    e4 = i10;
                    e29 = i24;
                    e19 = i13;
                    e6 = i12;
                    e25 = i20;
                    e17 = i16;
                    e21 = i15;
                    e23 = i18;
                    e24 = i19;
                }
                r[] rVarArr3 = rVarArr;
                f4.close();
                g2Var.release();
                return rVarArr3;
            } catch (Throwable th) {
                th = th;
                f4.close();
                g2Var.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            g2Var = d6;
        }
    }

    @Override // androidx.work.impl.model.s
    public List<String> h(final String name) {
        g2 d5 = g2.d("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (name == null) {
            d5.h3(1);
        } else {
            d5.c2(1, name);
        }
        this.f36372a.assertNotSuspendingTransaction();
        Cursor f4 = androidx.room.util.b.f(this.f36372a, d5, false, null);
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

    @Override // androidx.work.impl.model.s
    public r.c i(String str) {
        g2 d5 = g2.d("SELECT id, state, output, run_attempt_count FROM workspec WHERE id=?", 1);
        if (str == null) {
            d5.h3(1);
        } else {
            d5.c2(1, str);
        }
        this.f36372a.assertNotSuspendingTransaction();
        this.f36372a.beginTransaction();
        try {
            r.c cVar = null;
            Cursor f4 = androidx.room.util.b.f(this.f36372a, d5, true, null);
            try {
                int e4 = androidx.room.util.a.e(f4, "id");
                int e5 = androidx.room.util.a.e(f4, "state");
                int e6 = androidx.room.util.a.e(f4, "output");
                int e7 = androidx.room.util.a.e(f4, "run_attempt_count");
                androidx.collection.a<String, ArrayList<String>> aVar = new androidx.collection.a<>();
                androidx.collection.a<String, ArrayList<androidx.work.f>> aVar2 = new androidx.collection.a<>();
                while (f4.moveToNext()) {
                    if (!f4.isNull(e4)) {
                        String string = f4.getString(e4);
                        if (aVar.get(string) == null) {
                            aVar.put(string, new ArrayList<>());
                        }
                    }
                    if (!f4.isNull(e4)) {
                        String string2 = f4.getString(e4);
                        if (aVar2.get(string2) == null) {
                            aVar2.put(string2, new ArrayList<>());
                        }
                    }
                }
                f4.moveToPosition(-1);
                J(aVar);
                I(aVar2);
                if (f4.moveToFirst()) {
                    ArrayList<String> arrayList = !f4.isNull(e4) ? aVar.get(f4.getString(e4)) : null;
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    ArrayList<androidx.work.f> arrayList2 = f4.isNull(e4) ? null : aVar2.get(f4.getString(e4));
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    r.c cVar2 = new r.c();
                    cVar2.f36366a = f4.getString(e4);
                    cVar2.f36367b = x.g(f4.getInt(e5));
                    cVar2.f36368c = androidx.work.f.m(f4.getBlob(e6));
                    cVar2.f36369d = f4.getInt(e7);
                    cVar2.f36370e = arrayList;
                    cVar2.f36371f = arrayList2;
                    cVar = cVar2;
                }
                this.f36372a.setTransactionSuccessful();
                f4.close();
                d5.release();
                return cVar;
            } catch (Throwable th) {
                f4.close();
                d5.release();
                throw th;
            }
        } finally {
            this.f36372a.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.s
    public f0.a j(final String id2) {
        g2 d5 = g2.d("SELECT state FROM workspec WHERE id=?", 1);
        if (id2 == null) {
            d5.h3(1);
        } else {
            d5.c2(1, id2);
        }
        this.f36372a.assertNotSuspendingTransaction();
        Cursor f4 = androidx.room.util.b.f(this.f36372a, d5, false, null);
        try {
            return f4.moveToFirst() ? x.g(f4.getInt(0)) : null;
        } finally {
            f4.close();
            d5.release();
        }
    }

    @Override // androidx.work.impl.model.s
    public r k(final String id2) {
        g2 g2Var;
        int e4;
        int e5;
        int e6;
        int e7;
        int e10;
        int e11;
        int e12;
        int e13;
        int e14;
        int e15;
        int e16;
        int e17;
        int e18;
        int e19;
        r rVar;
        g2 d5 = g2.d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (id2 == null) {
            d5.h3(1);
        } else {
            d5.c2(1, id2);
        }
        this.f36372a.assertNotSuspendingTransaction();
        Cursor f4 = androidx.room.util.b.f(this.f36372a, d5, false, null);
        try {
            e4 = androidx.room.util.a.e(f4, "required_network_type");
            e5 = androidx.room.util.a.e(f4, "requires_charging");
            e6 = androidx.room.util.a.e(f4, "requires_device_idle");
            e7 = androidx.room.util.a.e(f4, "requires_battery_not_low");
            e10 = androidx.room.util.a.e(f4, "requires_storage_not_low");
            e11 = androidx.room.util.a.e(f4, "trigger_content_update_delay");
            e12 = androidx.room.util.a.e(f4, "trigger_max_content_delay");
            e13 = androidx.room.util.a.e(f4, "content_uri_triggers");
            e14 = androidx.room.util.a.e(f4, "id");
            e15 = androidx.room.util.a.e(f4, "state");
            e16 = androidx.room.util.a.e(f4, "worker_class_name");
            e17 = androidx.room.util.a.e(f4, "input_merger_class_name");
            e18 = androidx.room.util.a.e(f4, "input");
            e19 = androidx.room.util.a.e(f4, "output");
            g2Var = d5;
        } catch (Throwable th) {
            th = th;
            g2Var = d5;
        }
        try {
            int e20 = androidx.room.util.a.e(f4, "initial_delay");
            int e21 = androidx.room.util.a.e(f4, "interval_duration");
            int e22 = androidx.room.util.a.e(f4, "flex_duration");
            int e23 = androidx.room.util.a.e(f4, "run_attempt_count");
            int e24 = androidx.room.util.a.e(f4, "backoff_policy");
            int e25 = androidx.room.util.a.e(f4, "backoff_delay_duration");
            int e26 = androidx.room.util.a.e(f4, "period_start_time");
            int e27 = androidx.room.util.a.e(f4, "minimum_retention_duration");
            int e28 = androidx.room.util.a.e(f4, "schedule_requested_at");
            int e29 = androidx.room.util.a.e(f4, "run_in_foreground");
            int e30 = androidx.room.util.a.e(f4, "out_of_quota_policy");
            if (f4.moveToFirst()) {
                String string = f4.getString(e14);
                String string2 = f4.getString(e16);
                androidx.work.d dVar = new androidx.work.d();
                dVar.k(x.e(f4.getInt(e4)));
                dVar.m(f4.getInt(e5) != 0);
                dVar.n(f4.getInt(e6) != 0);
                dVar.l(f4.getInt(e7) != 0);
                dVar.o(f4.getInt(e10) != 0);
                dVar.p(f4.getLong(e11));
                dVar.q(f4.getLong(e12));
                dVar.j(x.b(f4.getBlob(e13)));
                r rVar2 = new r(string, string2);
                rVar2.f36347b = x.g(f4.getInt(e15));
                rVar2.f36349d = f4.getString(e17);
                rVar2.f36350e = androidx.work.f.m(f4.getBlob(e18));
                rVar2.f36351f = androidx.work.f.m(f4.getBlob(e19));
                rVar2.f36352g = f4.getLong(e20);
                rVar2.f36353h = f4.getLong(e21);
                rVar2.f36354i = f4.getLong(e22);
                rVar2.f36356k = f4.getInt(e23);
                rVar2.f36357l = x.d(f4.getInt(e24));
                rVar2.f36358m = f4.getLong(e25);
                rVar2.f36359n = f4.getLong(e26);
                rVar2.f36360o = f4.getLong(e27);
                rVar2.f36361p = f4.getLong(e28);
                rVar2.f36362q = f4.getInt(e29) != 0;
                rVar2.f36363r = x.f(f4.getInt(e30));
                rVar2.f36355j = dVar;
                rVar = rVar2;
            } else {
                rVar = null;
            }
            f4.close();
            g2Var.release();
            return rVar;
        } catch (Throwable th2) {
            th = th2;
            f4.close();
            g2Var.release();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.s
    public LiveData<Long> l(final String id2) {
        g2 d5 = g2.d("SELECT schedule_requested_at FROM workspec WHERE id=?", 1);
        if (id2 == null) {
            d5.h3(1);
        } else {
            d5.c2(1, id2);
        }
        return this.f36372a.getInvalidationTracker().f(new String[]{"workspec"}, false, new e(d5));
    }

    @Override // androidx.work.impl.model.s
    public List<String> m(final String tag) {
        g2 d5 = g2.d("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (tag == null) {
            d5.h3(1);
        } else {
            d5.c2(1, tag);
        }
        this.f36372a.assertNotSuspendingTransaction();
        Cursor f4 = androidx.room.util.b.f(this.f36372a, d5, false, null);
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

    @Override // androidx.work.impl.model.s
    public List<androidx.work.f> n(final String id2) {
        g2 d5 = g2.d("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (id2 == null) {
            d5.h3(1);
        } else {
            d5.c2(1, id2);
        }
        this.f36372a.assertNotSuspendingTransaction();
        Cursor f4 = androidx.room.util.b.f(this.f36372a, d5, false, null);
        try {
            ArrayList arrayList = new ArrayList(f4.getCount());
            while (f4.moveToNext()) {
                arrayList.add(androidx.work.f.m(f4.getBlob(0)));
            }
            return arrayList;
        } finally {
            f4.close();
            d5.release();
        }
    }

    @Override // androidx.work.impl.model.s
    public List<r.c> o(final String name) {
        g2 d5 = g2.d("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (name == null) {
            d5.h3(1);
        } else {
            d5.c2(1, name);
        }
        this.f36372a.assertNotSuspendingTransaction();
        this.f36372a.beginTransaction();
        try {
            Cursor f4 = androidx.room.util.b.f(this.f36372a, d5, true, null);
            try {
                int e4 = androidx.room.util.a.e(f4, "id");
                int e5 = androidx.room.util.a.e(f4, "state");
                int e6 = androidx.room.util.a.e(f4, "output");
                int e7 = androidx.room.util.a.e(f4, "run_attempt_count");
                androidx.collection.a<String, ArrayList<String>> aVar = new androidx.collection.a<>();
                androidx.collection.a<String, ArrayList<androidx.work.f>> aVar2 = new androidx.collection.a<>();
                while (f4.moveToNext()) {
                    if (!f4.isNull(e4)) {
                        String string = f4.getString(e4);
                        if (aVar.get(string) == null) {
                            aVar.put(string, new ArrayList<>());
                        }
                    }
                    if (!f4.isNull(e4)) {
                        String string2 = f4.getString(e4);
                        if (aVar2.get(string2) == null) {
                            aVar2.put(string2, new ArrayList<>());
                        }
                    }
                }
                f4.moveToPosition(-1);
                J(aVar);
                I(aVar2);
                ArrayList arrayList = new ArrayList(f4.getCount());
                while (f4.moveToNext()) {
                    ArrayList<String> arrayList2 = !f4.isNull(e4) ? aVar.get(f4.getString(e4)) : null;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    ArrayList<androidx.work.f> arrayList3 = !f4.isNull(e4) ? aVar2.get(f4.getString(e4)) : null;
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList<>();
                    }
                    r.c cVar = new r.c();
                    cVar.f36366a = f4.getString(e4);
                    cVar.f36367b = x.g(f4.getInt(e5));
                    cVar.f36368c = androidx.work.f.m(f4.getBlob(e6));
                    cVar.f36369d = f4.getInt(e7);
                    cVar.f36370e = arrayList2;
                    cVar.f36371f = arrayList3;
                    arrayList.add(cVar);
                }
                this.f36372a.setTransactionSuccessful();
                f4.close();
                d5.release();
                return arrayList;
            } catch (Throwable th) {
                f4.close();
                d5.release();
                throw th;
            }
        } finally {
            this.f36372a.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.s
    public List<r> p(final int maxLimit) {
        g2 g2Var;
        g2 d5 = g2.d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        d5.C2(1, maxLimit);
        this.f36372a.assertNotSuspendingTransaction();
        Cursor f4 = androidx.room.util.b.f(this.f36372a, d5, false, null);
        try {
            int e4 = androidx.room.util.a.e(f4, "required_network_type");
            int e5 = androidx.room.util.a.e(f4, "requires_charging");
            int e6 = androidx.room.util.a.e(f4, "requires_device_idle");
            int e7 = androidx.room.util.a.e(f4, "requires_battery_not_low");
            int e10 = androidx.room.util.a.e(f4, "requires_storage_not_low");
            int e11 = androidx.room.util.a.e(f4, "trigger_content_update_delay");
            int e12 = androidx.room.util.a.e(f4, "trigger_max_content_delay");
            int e13 = androidx.room.util.a.e(f4, "content_uri_triggers");
            int e14 = androidx.room.util.a.e(f4, "id");
            int e15 = androidx.room.util.a.e(f4, "state");
            int e16 = androidx.room.util.a.e(f4, "worker_class_name");
            int e17 = androidx.room.util.a.e(f4, "input_merger_class_name");
            int e18 = androidx.room.util.a.e(f4, "input");
            int e19 = androidx.room.util.a.e(f4, "output");
            g2Var = d5;
            try {
                int e20 = androidx.room.util.a.e(f4, "initial_delay");
                int e21 = androidx.room.util.a.e(f4, "interval_duration");
                int e22 = androidx.room.util.a.e(f4, "flex_duration");
                int e23 = androidx.room.util.a.e(f4, "run_attempt_count");
                int e24 = androidx.room.util.a.e(f4, "backoff_policy");
                int e25 = androidx.room.util.a.e(f4, "backoff_delay_duration");
                int e26 = androidx.room.util.a.e(f4, "period_start_time");
                int e27 = androidx.room.util.a.e(f4, "minimum_retention_duration");
                int e28 = androidx.room.util.a.e(f4, "schedule_requested_at");
                int e29 = androidx.room.util.a.e(f4, "run_in_foreground");
                int e30 = androidx.room.util.a.e(f4, "out_of_quota_policy");
                int i4 = e19;
                ArrayList arrayList = new ArrayList(f4.getCount());
                while (f4.moveToNext()) {
                    String string = f4.getString(e14);
                    int i5 = e14;
                    String string2 = f4.getString(e16);
                    int i6 = e16;
                    androidx.work.d dVar = new androidx.work.d();
                    int i7 = e4;
                    dVar.k(x.e(f4.getInt(e4)));
                    dVar.m(f4.getInt(e5) != 0);
                    dVar.n(f4.getInt(e6) != 0);
                    dVar.l(f4.getInt(e7) != 0);
                    dVar.o(f4.getInt(e10) != 0);
                    int i10 = e5;
                    int i11 = e6;
                    dVar.p(f4.getLong(e11));
                    dVar.q(f4.getLong(e12));
                    dVar.j(x.b(f4.getBlob(e13)));
                    r rVar = new r(string, string2);
                    rVar.f36347b = x.g(f4.getInt(e15));
                    rVar.f36349d = f4.getString(e17);
                    rVar.f36350e = androidx.work.f.m(f4.getBlob(e18));
                    int i12 = i4;
                    rVar.f36351f = androidx.work.f.m(f4.getBlob(i12));
                    i4 = i12;
                    int i13 = e20;
                    rVar.f36352g = f4.getLong(i13);
                    int i14 = e17;
                    int i15 = e21;
                    rVar.f36353h = f4.getLong(i15);
                    int i16 = e7;
                    int i17 = e22;
                    rVar.f36354i = f4.getLong(i17);
                    int i18 = e23;
                    rVar.f36356k = f4.getInt(i18);
                    int i19 = e24;
                    rVar.f36357l = x.d(f4.getInt(i19));
                    e22 = i17;
                    int i20 = e25;
                    rVar.f36358m = f4.getLong(i20);
                    int i21 = e26;
                    rVar.f36359n = f4.getLong(i21);
                    e26 = i21;
                    int i22 = e27;
                    rVar.f36360o = f4.getLong(i22);
                    int i23 = e28;
                    rVar.f36361p = f4.getLong(i23);
                    int i24 = e29;
                    rVar.f36362q = f4.getInt(i24) != 0;
                    int i25 = e30;
                    rVar.f36363r = x.f(f4.getInt(i25));
                    rVar.f36355j = dVar;
                    arrayList.add(rVar);
                    e30 = i25;
                    e5 = i10;
                    e17 = i14;
                    e20 = i13;
                    e21 = i15;
                    e23 = i18;
                    e28 = i23;
                    e14 = i5;
                    e16 = i6;
                    e4 = i7;
                    e29 = i24;
                    e27 = i22;
                    e6 = i11;
                    e25 = i20;
                    e7 = i16;
                    e24 = i19;
                }
                f4.close();
                g2Var.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                f4.close();
                g2Var.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            g2Var = d5;
        }
    }

    @Override // androidx.work.impl.model.s
    public int q() {
        this.f36372a.assertNotSuspendingTransaction();
        f3.i acquire = this.f36380i.acquire();
        this.f36372a.beginTransaction();
        try {
            int h02 = acquire.h0();
            this.f36372a.setTransactionSuccessful();
            return h02;
        } finally {
            this.f36372a.endTransaction();
            this.f36380i.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.s
    public int r(final String id2, final long startTime) {
        this.f36372a.assertNotSuspendingTransaction();
        f3.i acquire = this.f36379h.acquire();
        acquire.C2(1, startTime);
        if (id2 == null) {
            acquire.h3(2);
        } else {
            acquire.c2(2, id2);
        }
        this.f36372a.beginTransaction();
        try {
            int h02 = acquire.h0();
            this.f36372a.setTransactionSuccessful();
            return h02;
        } finally {
            this.f36372a.endTransaction();
            this.f36379h.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.s
    public List<r.b> s(final String name) {
        g2 d5 = g2.d("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (name == null) {
            d5.h3(1);
        } else {
            d5.c2(1, name);
        }
        this.f36372a.assertNotSuspendingTransaction();
        Cursor f4 = androidx.room.util.b.f(this.f36372a, d5, false, null);
        try {
            int e4 = androidx.room.util.a.e(f4, "id");
            int e5 = androidx.room.util.a.e(f4, "state");
            ArrayList arrayList = new ArrayList(f4.getCount());
            while (f4.moveToNext()) {
                r.b bVar = new r.b();
                bVar.f36364a = f4.getString(e4);
                bVar.f36365b = x.g(f4.getInt(e5));
                arrayList.add(bVar);
            }
            return arrayList;
        } finally {
            f4.close();
            d5.release();
        }
    }

    @Override // androidx.work.impl.model.s
    public List<r> t(final int schedulerLimit) {
        g2 g2Var;
        g2 d5 = g2.d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        d5.C2(1, schedulerLimit);
        this.f36372a.assertNotSuspendingTransaction();
        Cursor f4 = androidx.room.util.b.f(this.f36372a, d5, false, null);
        try {
            int e4 = androidx.room.util.a.e(f4, "required_network_type");
            int e5 = androidx.room.util.a.e(f4, "requires_charging");
            int e6 = androidx.room.util.a.e(f4, "requires_device_idle");
            int e7 = androidx.room.util.a.e(f4, "requires_battery_not_low");
            int e10 = androidx.room.util.a.e(f4, "requires_storage_not_low");
            int e11 = androidx.room.util.a.e(f4, "trigger_content_update_delay");
            int e12 = androidx.room.util.a.e(f4, "trigger_max_content_delay");
            int e13 = androidx.room.util.a.e(f4, "content_uri_triggers");
            int e14 = androidx.room.util.a.e(f4, "id");
            int e15 = androidx.room.util.a.e(f4, "state");
            int e16 = androidx.room.util.a.e(f4, "worker_class_name");
            int e17 = androidx.room.util.a.e(f4, "input_merger_class_name");
            int e18 = androidx.room.util.a.e(f4, "input");
            int e19 = androidx.room.util.a.e(f4, "output");
            g2Var = d5;
            try {
                int e20 = androidx.room.util.a.e(f4, "initial_delay");
                int e21 = androidx.room.util.a.e(f4, "interval_duration");
                int e22 = androidx.room.util.a.e(f4, "flex_duration");
                int e23 = androidx.room.util.a.e(f4, "run_attempt_count");
                int e24 = androidx.room.util.a.e(f4, "backoff_policy");
                int e25 = androidx.room.util.a.e(f4, "backoff_delay_duration");
                int e26 = androidx.room.util.a.e(f4, "period_start_time");
                int e27 = androidx.room.util.a.e(f4, "minimum_retention_duration");
                int e28 = androidx.room.util.a.e(f4, "schedule_requested_at");
                int e29 = androidx.room.util.a.e(f4, "run_in_foreground");
                int e30 = androidx.room.util.a.e(f4, "out_of_quota_policy");
                int i4 = e19;
                ArrayList arrayList = new ArrayList(f4.getCount());
                while (f4.moveToNext()) {
                    String string = f4.getString(e14);
                    int i5 = e14;
                    String string2 = f4.getString(e16);
                    int i6 = e16;
                    androidx.work.d dVar = new androidx.work.d();
                    int i7 = e4;
                    dVar.k(x.e(f4.getInt(e4)));
                    dVar.m(f4.getInt(e5) != 0);
                    dVar.n(f4.getInt(e6) != 0);
                    dVar.l(f4.getInt(e7) != 0);
                    dVar.o(f4.getInt(e10) != 0);
                    int i10 = e5;
                    int i11 = e6;
                    dVar.p(f4.getLong(e11));
                    dVar.q(f4.getLong(e12));
                    dVar.j(x.b(f4.getBlob(e13)));
                    r rVar = new r(string, string2);
                    rVar.f36347b = x.g(f4.getInt(e15));
                    rVar.f36349d = f4.getString(e17);
                    rVar.f36350e = androidx.work.f.m(f4.getBlob(e18));
                    int i12 = i4;
                    rVar.f36351f = androidx.work.f.m(f4.getBlob(i12));
                    i4 = i12;
                    int i13 = e20;
                    rVar.f36352g = f4.getLong(i13);
                    int i14 = e17;
                    int i15 = e21;
                    rVar.f36353h = f4.getLong(i15);
                    int i16 = e7;
                    int i17 = e22;
                    rVar.f36354i = f4.getLong(i17);
                    int i18 = e23;
                    rVar.f36356k = f4.getInt(i18);
                    int i19 = e24;
                    rVar.f36357l = x.d(f4.getInt(i19));
                    e22 = i17;
                    int i20 = e25;
                    rVar.f36358m = f4.getLong(i20);
                    int i21 = e26;
                    rVar.f36359n = f4.getLong(i21);
                    e26 = i21;
                    int i22 = e27;
                    rVar.f36360o = f4.getLong(i22);
                    int i23 = e28;
                    rVar.f36361p = f4.getLong(i23);
                    int i24 = e29;
                    rVar.f36362q = f4.getInt(i24) != 0;
                    int i25 = e30;
                    rVar.f36363r = x.f(f4.getInt(i25));
                    rVar.f36355j = dVar;
                    arrayList.add(rVar);
                    e30 = i25;
                    e5 = i10;
                    e17 = i14;
                    e20 = i13;
                    e21 = i15;
                    e23 = i18;
                    e28 = i23;
                    e14 = i5;
                    e16 = i6;
                    e4 = i7;
                    e29 = i24;
                    e27 = i22;
                    e6 = i11;
                    e25 = i20;
                    e7 = i16;
                    e24 = i19;
                }
                f4.close();
                g2Var.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                f4.close();
                g2Var.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            g2Var = d5;
        }
    }

    @Override // androidx.work.impl.model.s
    public void u(final String id2, final androidx.work.f output) {
        this.f36372a.assertNotSuspendingTransaction();
        f3.i acquire = this.f36375d.acquire();
        byte[] F = androidx.work.f.F(output);
        if (F == null) {
            acquire.h3(1);
        } else {
            acquire.L2(1, F);
        }
        if (id2 == null) {
            acquire.h3(2);
        } else {
            acquire.c2(2, id2);
        }
        this.f36372a.beginTransaction();
        try {
            acquire.h0();
            this.f36372a.setTransactionSuccessful();
        } finally {
            this.f36372a.endTransaction();
            this.f36375d.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.s
    public LiveData<List<String>> v() {
        return this.f36372a.getInvalidationTracker().f(new String[]{"workspec"}, true, new a(g2.d("SELECT id FROM workspec", 0)));
    }

    @Override // androidx.work.impl.model.s
    public LiveData<List<r.c>> w(final String name) {
        g2 d5 = g2.d("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (name == null) {
            d5.h3(1);
        } else {
            d5.c2(1, name);
        }
        return this.f36372a.getInvalidationTracker().f(new String[]{"WorkTag", "WorkProgress", "workspec", "workname"}, true, new d(d5));
    }

    @Override // androidx.work.impl.model.s
    public List<r> x() {
        g2 g2Var;
        g2 d5 = g2.d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        this.f36372a.assertNotSuspendingTransaction();
        Cursor f4 = androidx.room.util.b.f(this.f36372a, d5, false, null);
        try {
            int e4 = androidx.room.util.a.e(f4, "required_network_type");
            int e5 = androidx.room.util.a.e(f4, "requires_charging");
            int e6 = androidx.room.util.a.e(f4, "requires_device_idle");
            int e7 = androidx.room.util.a.e(f4, "requires_battery_not_low");
            int e10 = androidx.room.util.a.e(f4, "requires_storage_not_low");
            int e11 = androidx.room.util.a.e(f4, "trigger_content_update_delay");
            int e12 = androidx.room.util.a.e(f4, "trigger_max_content_delay");
            int e13 = androidx.room.util.a.e(f4, "content_uri_triggers");
            int e14 = androidx.room.util.a.e(f4, "id");
            int e15 = androidx.room.util.a.e(f4, "state");
            int e16 = androidx.room.util.a.e(f4, "worker_class_name");
            int e17 = androidx.room.util.a.e(f4, "input_merger_class_name");
            int e18 = androidx.room.util.a.e(f4, "input");
            int e19 = androidx.room.util.a.e(f4, "output");
            g2Var = d5;
            try {
                int e20 = androidx.room.util.a.e(f4, "initial_delay");
                int e21 = androidx.room.util.a.e(f4, "interval_duration");
                int e22 = androidx.room.util.a.e(f4, "flex_duration");
                int e23 = androidx.room.util.a.e(f4, "run_attempt_count");
                int e24 = androidx.room.util.a.e(f4, "backoff_policy");
                int e25 = androidx.room.util.a.e(f4, "backoff_delay_duration");
                int e26 = androidx.room.util.a.e(f4, "period_start_time");
                int e27 = androidx.room.util.a.e(f4, "minimum_retention_duration");
                int e28 = androidx.room.util.a.e(f4, "schedule_requested_at");
                int e29 = androidx.room.util.a.e(f4, "run_in_foreground");
                int e30 = androidx.room.util.a.e(f4, "out_of_quota_policy");
                int i4 = e19;
                ArrayList arrayList = new ArrayList(f4.getCount());
                while (f4.moveToNext()) {
                    String string = f4.getString(e14);
                    int i5 = e14;
                    String string2 = f4.getString(e16);
                    int i6 = e16;
                    androidx.work.d dVar = new androidx.work.d();
                    int i7 = e4;
                    dVar.k(x.e(f4.getInt(e4)));
                    dVar.m(f4.getInt(e5) != 0);
                    dVar.n(f4.getInt(e6) != 0);
                    dVar.l(f4.getInt(e7) != 0);
                    dVar.o(f4.getInt(e10) != 0);
                    int i10 = e5;
                    int i11 = e6;
                    dVar.p(f4.getLong(e11));
                    dVar.q(f4.getLong(e12));
                    dVar.j(x.b(f4.getBlob(e13)));
                    r rVar = new r(string, string2);
                    rVar.f36347b = x.g(f4.getInt(e15));
                    rVar.f36349d = f4.getString(e17);
                    rVar.f36350e = androidx.work.f.m(f4.getBlob(e18));
                    int i12 = i4;
                    rVar.f36351f = androidx.work.f.m(f4.getBlob(i12));
                    i4 = i12;
                    int i13 = e20;
                    rVar.f36352g = f4.getLong(i13);
                    int i14 = e18;
                    int i15 = e21;
                    rVar.f36353h = f4.getLong(i15);
                    int i16 = e7;
                    int i17 = e22;
                    rVar.f36354i = f4.getLong(i17);
                    int i18 = e23;
                    rVar.f36356k = f4.getInt(i18);
                    int i19 = e24;
                    rVar.f36357l = x.d(f4.getInt(i19));
                    e22 = i17;
                    int i20 = e25;
                    rVar.f36358m = f4.getLong(i20);
                    int i21 = e26;
                    rVar.f36359n = f4.getLong(i21);
                    e26 = i21;
                    int i22 = e27;
                    rVar.f36360o = f4.getLong(i22);
                    int i23 = e28;
                    rVar.f36361p = f4.getLong(i23);
                    int i24 = e29;
                    rVar.f36362q = f4.getInt(i24) != 0;
                    int i25 = e30;
                    rVar.f36363r = x.f(f4.getInt(i25));
                    rVar.f36355j = dVar;
                    arrayList.add(rVar);
                    e30 = i25;
                    e5 = i10;
                    e18 = i14;
                    e20 = i13;
                    e21 = i15;
                    e23 = i18;
                    e28 = i23;
                    e14 = i5;
                    e16 = i6;
                    e4 = i7;
                    e29 = i24;
                    e27 = i22;
                    e6 = i11;
                    e25 = i20;
                    e7 = i16;
                    e24 = i19;
                }
                f4.close();
                g2Var.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                f4.close();
                g2Var.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            g2Var = d5;
        }
    }

    @Override // androidx.work.impl.model.s
    public LiveData<List<r.c>> y(final String tag) {
        g2 d5 = g2.d("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (tag == null) {
            d5.h3(1);
        } else {
            d5.c2(1, tag);
        }
        return this.f36372a.getInvalidationTracker().f(new String[]{"WorkTag", "WorkProgress", "workspec", "worktag"}, true, new c(d5));
    }

    @Override // androidx.work.impl.model.s
    public List<String> z() {
        g2 d5 = g2.d("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
        this.f36372a.assertNotSuspendingTransaction();
        Cursor f4 = androidx.room.util.b.f(this.f36372a, d5, false, null);
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
