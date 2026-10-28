package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import androidx.annotation.c1;
import androidx.annotation.m1;
import androidx.annotation.n1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.datatransport.runtime.firebase.transport.a;
import com.google.android.datatransport.runtime.firebase.transport.c;
import com.google.android.datatransport.runtime.k;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import l1.a;

/* compiled from: SQLiteEventStore.java */
@n1
@h3.f
/* loaded from: classes3.dex */
public class n0 implements com.google.android.datatransport.runtime.scheduling.persistence.d, l1.a, com.google.android.datatransport.runtime.scheduling.persistence.c {

    /* renamed from: u, reason: collision with root package name */
    static final int f12714u = 16;

    /* renamed from: v, reason: collision with root package name */
    private static final int f12715v = 50;

    /* renamed from: o, reason: collision with root package name */
    private final u0 f12717o;

    /* renamed from: p, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.time.a f12718p;

    /* renamed from: q, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.time.a f12719q;

    /* renamed from: r, reason: collision with root package name */
    private final e f12720r;

    /* renamed from: s, reason: collision with root package name */
    private final h3.c<String> f12721s;

    /* renamed from: t, reason: collision with root package name */
    private static final String f12713t = ProtectedSandApp.s("₣");

    /* renamed from: w, reason: collision with root package name */
    private static final com.google.android.datatransport.c f12716w = com.google.android.datatransport.c.b(ProtectedSandApp.s("₤"));

    /* compiled from: SQLiteEventStore.java */
    /* loaded from: classes2.dex */
    interface b<T, U> {
        U apply(T t5);
    }

    /* compiled from: SQLiteEventStore.java */
    /* loaded from: classes2.dex */
    private static class c {

        /* renamed from: a, reason: collision with root package name */
        final String f12722a;

        /* renamed from: b, reason: collision with root package name */
        final String f12723b;

        private c(String str, String str2) {
            this.f12722a = str;
            this.f12723b = str2;
        }
    }

    /* compiled from: SQLiteEventStore.java */
    /* loaded from: classes2.dex */
    interface d<T> {
        T a();
    }

    @h3.a
    n0(@com.google.android.datatransport.runtime.time.h com.google.android.datatransport.runtime.time.a aVar, @com.google.android.datatransport.runtime.time.b com.google.android.datatransport.runtime.time.a aVar2, e eVar, u0 u0Var, @h3.b("PACKAGE_NAME") h3.c<String> cVar) {
        this.f12717o = u0Var;
        this.f12718p = aVar;
        this.f12719q = aVar2;
        this.f12720r = eVar;
        this.f12721s = cVar;
    }

    @androidx.annotation.q0
    private Long A0(SQLiteDatabase sQLiteDatabase, com.google.android.datatransport.runtime.s sVar) {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("₥"));
        ArrayList arrayList = new ArrayList(Arrays.asList(sVar.b(), String.valueOf(m1.a.a(sVar.d()))));
        if (sVar.c() != null) {
            sb.append(ProtectedSandApp.s("₦"));
            arrayList.add(Base64.encodeToString(sVar.c(), 0));
        } else {
            sb.append(ProtectedSandApp.s("₧"));
        }
        return (Long) M1(sQLiteDatabase.query(ProtectedSandApp.s("₨"), new String[]{ProtectedSandApp.s("₩")}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.e0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                Long g12;
                g12 = n0.g1((Cursor) obj);
                return g12;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean A1(Cursor cursor) {
        return Boolean.valueOf(cursor.getCount() > 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object B1(String str, c.b bVar, long j5, SQLiteDatabase sQLiteDatabase) {
        if (((Boolean) M1(sQLiteDatabase.rawQuery(ProtectedSandApp.s("₪"), new String[]{str, Integer.toString(bVar.getNumber())}), new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.k0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                Boolean A1;
                A1 = n0.A1((Cursor) obj);
                return A1;
            }
        })).booleanValue()) {
            sQLiteDatabase.execSQL(ProtectedSandApp.s("₯") + j5 + ProtectedSandApp.s("₰"), new String[]{str, Integer.toString(bVar.getNumber())});
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put(ProtectedSandApp.s("₫"), str);
            contentValues.put(ProtectedSandApp.s("€"), Integer.valueOf(bVar.getNumber()));
            contentValues.put(ProtectedSandApp.s("₭"), Long.valueOf(j5));
            sQLiteDatabase.insert(ProtectedSandApp.s("₮"), null, contentValues);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object C1(long j5, com.google.android.datatransport.runtime.s sVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(ProtectedSandApp.s("₱"), Long.valueOf(j5));
        String[] strArr = {sVar.b(), String.valueOf(m1.a.a(sVar.d()))};
        String s5 = ProtectedSandApp.s("₲");
        if (sQLiteDatabase.update(s5, contentValues, ProtectedSandApp.s("₳"), strArr) < 1) {
            contentValues.put(ProtectedSandApp.s("₴"), sVar.b());
            contentValues.put(ProtectedSandApp.s("₵"), Integer.valueOf(m1.a.a(sVar.d())));
            sQLiteDatabase.insert(s5, null, contentValues);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object D1(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(ProtectedSandApp.s("₶")).execute();
        sQLiteDatabase.compileStatement(ProtectedSandApp.s("₷") + this.f12718p.a()).execute();
        return null;
    }

    private boolean E0() {
        return o0() * p0() >= this.f12720r.f();
    }

    private List<k> E1(SQLiteDatabase sQLiteDatabase, final com.google.android.datatransport.runtime.s sVar, int i5) {
        final ArrayList arrayList = new ArrayList();
        Long A0 = A0(sQLiteDatabase, sVar);
        if (A0 == null) {
            return arrayList;
        }
        M1(sQLiteDatabase.query(ProtectedSandApp.s("₸"), new String[]{ProtectedSandApp.s("₹"), ProtectedSandApp.s("₺"), ProtectedSandApp.s("₻"), ProtectedSandApp.s("₼"), ProtectedSandApp.s("₽"), ProtectedSandApp.s("₾"), ProtectedSandApp.s("₿"), ProtectedSandApp.s("⃀")}, ProtectedSandApp.s("\u20c1"), new String[]{A0.toString()}, null, null, null, String.valueOf(i5)), new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.t
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                Object u12;
                u12 = n0.this.u1(arrayList, sVar, (Cursor) obj);
                return u12;
            }
        });
        return arrayList;
    }

    private List<k> F0(List<k> list, Map<Long, Set<c>> map) {
        ListIterator<k> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            k next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.c()))) {
                k.a n5 = next.b().n();
                for (c cVar : map.get(Long.valueOf(next.c()))) {
                    n5.c(cVar.f12722a, cVar.f12723b);
                }
                listIterator.set(new com.google.android.datatransport.runtime.scheduling.persistence.b(next.c(), next.d(), n5.d()));
            }
        }
        return list;
    }

    private Map<Long, Set<c>> F1(SQLiteDatabase sQLiteDatabase, List<k> list) {
        final HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("\u20c2"));
        for (int i5 = 0; i5 < list.size(); i5++) {
            sb.append(list.get(i5).c());
            if (i5 < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        M1(sQLiteDatabase.query(ProtectedSandApp.s("\u20c3"), new String[]{ProtectedSandApp.s("\u20c5"), ProtectedSandApp.s("\u20c6"), ProtectedSandApp.s("\u20c4")}, sb.toString(), null, null, null, null), new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.w
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                Object v12;
                v12 = n0.v1(hashMap, (Cursor) obj);
                return v12;
            }
        });
        return hashMap;
    }

    private static byte[] G1(@androidx.annotation.q0 String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    private void H1(a.C0163a c0163a, Map<String, List<com.google.android.datatransport.runtime.firebase.transport.c>> map) {
        for (Map.Entry<String, List<com.google.android.datatransport.runtime.firebase.transport.c>> entry : map.entrySet()) {
            c0163a.a(com.google.android.datatransport.runtime.firebase.transport.d.d().d(entry.getKey()).c(entry.getValue()).b());
        }
    }

    private byte[] I1(long j5) {
        return (byte[]) M1(m0().query(ProtectedSandApp.s("\u20c7"), new String[]{ProtectedSandApp.s("\u20c8")}, ProtectedSandApp.s("\u20c9"), new String[]{String.valueOf(j5)}, null, null, ProtectedSandApp.s("\u20ca")), new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.f0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                byte[] x12;
                x12 = n0.x1((Cursor) obj);
                return x12;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object J0(Cursor cursor) {
        while (cursor.moveToNext()) {
            c(cursor.getInt(0), c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    private <T> T J1(d<T> dVar, b<Throwable, T> bVar) {
        long a6 = this.f12719q.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e6) {
                if (this.f12719q.a() >= this.f12720r.b() + a6) {
                    return bVar.apply(e6);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    private static com.google.android.datatransport.c K1(@androidx.annotation.q0 String str) {
        return str == null ? f12716w : com.google.android.datatransport.c.b(str);
    }

    private static String L1(Iterable<k> iterable) {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("\u20cb"));
        Iterator<k> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().c());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer M0(long j5, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j5)};
        M1(sQLiteDatabase.rawQuery(ProtectedSandApp.s("\u20cc"), strArr), new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.c0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                Object J0;
                J0 = n0.this.J0((Cursor) obj);
                return J0;
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete(ProtectedSandApp.s("\u20cd"), ProtectedSandApp.s("\u20ce"), strArr));
    }

    @m1
    static <T> T M1(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object N0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.delete(ProtectedSandApp.s("\u20cf"), null, new String[0]);
        sQLiteDatabase.delete(ProtectedSandApp.s("⃐"), null, new String[0]);
        return null;
    }

    private static /* synthetic */ Object O0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object R0(Throwable th) {
        throw new SynchronizationException(ProtectedSandApp.s("⃑"), th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SQLiteDatabase T0(Throwable th) {
        throw new SynchronizationException(ProtectedSandApp.s("⃒"), th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long U0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.google.android.datatransport.runtime.firebase.transport.f b1(long j5, Cursor cursor) {
        cursor.moveToNext();
        return com.google.android.datatransport.runtime.firebase.transport.f.d().c(cursor.getLong(0)).b(j5).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.google.android.datatransport.runtime.firebase.transport.f f1(final long j5, SQLiteDatabase sQLiteDatabase) {
        return (com.google.android.datatransport.runtime.firebase.transport.f) M1(sQLiteDatabase.rawQuery(ProtectedSandApp.s("⃓"), new String[0]), new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.d0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                com.google.android.datatransport.runtime.firebase.transport.f b12;
                b12 = n0.b1(j5, (Cursor) obj);
                return b12;
            }
        });
    }

    private c.b g0(int i5) {
        c.b bVar = c.b.REASON_UNKNOWN;
        if (i5 == bVar.getNumber()) {
            return bVar;
        }
        c.b bVar2 = c.b.MESSAGE_TOO_OLD;
        if (i5 == bVar2.getNumber()) {
            return bVar2;
        }
        c.b bVar3 = c.b.CACHE_FULL;
        if (i5 == bVar3.getNumber()) {
            return bVar3;
        }
        c.b bVar4 = c.b.PAYLOAD_TOO_BIG;
        if (i5 == bVar4.getNumber()) {
            return bVar4;
        }
        c.b bVar5 = c.b.MAX_RETRIES_REACHED;
        if (i5 == bVar5.getNumber()) {
            return bVar5;
        }
        c.b bVar6 = c.b.INVALID_PAYLOD;
        if (i5 == bVar6.getNumber()) {
            return bVar6;
        }
        c.b bVar7 = c.b.SERVER_ERROR;
        if (i5 == bVar7.getNumber()) {
            return bVar7;
        }
        j1.a.c(ProtectedSandApp.s("⃕"), ProtectedSandApp.s("⃔"), Integer.valueOf(i5));
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long g1(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    private void i0(final SQLiteDatabase sQLiteDatabase) {
        J1(new d() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.v
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.d
            public final Object a() {
                return n0.l(sQLiteDatabase);
            }
        }, new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.x
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                Object R0;
                R0 = n0.R0((Throwable) obj);
                return R0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean i1(com.google.android.datatransport.runtime.s sVar, SQLiteDatabase sQLiteDatabase) {
        Long A0 = A0(sQLiteDatabase, sVar);
        return A0 == null ? Boolean.FALSE : (Boolean) M1(m0().rawQuery(ProtectedSandApp.s("⃖"), new String[]{A0.toString()}), new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.y
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    private long k0(SQLiteDatabase sQLiteDatabase, com.google.android.datatransport.runtime.s sVar) {
        Long A0 = A0(sQLiteDatabase, sVar);
        if (A0 != null) {
            return A0.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(ProtectedSandApp.s("⃗"), sVar.b());
        contentValues.put(ProtectedSandApp.s("⃘"), Integer.valueOf(m1.a.a(sVar.d())));
        contentValues.put(ProtectedSandApp.s("⃙"), (Integer) 0);
        if (sVar.c() != null) {
            contentValues.put(ProtectedSandApp.s("⃚"), Base64.encodeToString(sVar.c(), 0));
        }
        return sQLiteDatabase.insert(ProtectedSandApp.s("⃛"), null, contentValues);
    }

    public static /* synthetic */ Object l(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List m1(SQLiteDatabase sQLiteDatabase) {
        return (List) M1(sQLiteDatabase.rawQuery(ProtectedSandApp.s("⃜"), new String[0]), new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.a0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                List n12;
                n12 = n0.n1((Cursor) obj);
                return n12;
            }
        });
    }

    private com.google.android.datatransport.runtime.firebase.transport.b n0() {
        return com.google.android.datatransport.runtime.firebase.transport.b.d().b(com.google.android.datatransport.runtime.firebase.transport.e.d().b(l0()).c(e.f12691f.f()).a()).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List n1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(com.google.android.datatransport.runtime.s.a().b(cursor.getString(1)).d(m1.a.b(cursor.getInt(2))).c(G1(cursor.getString(3))).a());
        }
        return arrayList;
    }

    private long o0() {
        return m0().compileStatement(ProtectedSandApp.s("⃝")).simpleQueryForLong();
    }

    private long p0() {
        return m0().compileStatement(ProtectedSandApp.s("⃞")).simpleQueryForLong();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List q1(com.google.android.datatransport.runtime.s sVar, SQLiteDatabase sQLiteDatabase) {
        List<k> E1 = E1(sQLiteDatabase, sVar, this.f12720r.d());
        for (com.google.android.datatransport.e eVar : com.google.android.datatransport.e.values()) {
            if (eVar != sVar.d()) {
                int d6 = this.f12720r.d() - E1.size();
                if (d6 <= 0) {
                    break;
                }
                E1.addAll(E1(sQLiteDatabase, sVar.f(eVar), d6));
            }
        }
        return F0(E1, F1(sQLiteDatabase, E1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ com.google.android.datatransport.runtime.firebase.transport.a s1(Map map, a.C0163a c0163a, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            c.b g02 = g0(cursor.getInt(1));
            long j5 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(com.google.android.datatransport.runtime.firebase.transport.c.d().c(g02).b(j5).a());
        }
        H1(c0163a, map);
        c0163a.f(y0());
        c0163a.d(n0());
        c0163a.c(this.f12721s.get());
        return c0163a.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ com.google.android.datatransport.runtime.firebase.transport.a t1(String str, final Map map, final a.C0163a c0163a, SQLiteDatabase sQLiteDatabase) {
        return (com.google.android.datatransport.runtime.firebase.transport.a) M1(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.i0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                com.google.android.datatransport.runtime.firebase.transport.a s12;
                s12 = n0.this.s1(map, c0163a, (Cursor) obj);
                return s12;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object u1(List list, com.google.android.datatransport.runtime.s sVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j5 = cursor.getLong(0);
            boolean z5 = cursor.getInt(7) != 0;
            k.a k5 = com.google.android.datatransport.runtime.k.a().j(cursor.getString(1)).i(cursor.getLong(2)).k(cursor.getLong(3));
            if (z5) {
                k5.h(new com.google.android.datatransport.runtime.j(K1(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                k5.h(new com.google.android.datatransport.runtime.j(K1(cursor.getString(4)), I1(j5)));
            }
            if (!cursor.isNull(6)) {
                k5.g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(new com.google.android.datatransport.runtime.scheduling.persistence.b(j5, sVar, k5.d()));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object v1(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j5 = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j5));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j5), set);
            }
            set.add(new c(cursor.getString(1), cursor.getString(2)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Long w1(com.google.android.datatransport.runtime.k kVar, com.google.android.datatransport.runtime.s sVar, SQLiteDatabase sQLiteDatabase) {
        if (E0()) {
            c(1L, c.b.CACHE_FULL, kVar.l());
            return -1L;
        }
        long k02 = k0(sQLiteDatabase, sVar);
        int e6 = this.f12720r.e();
        byte[] a6 = kVar.e().a();
        boolean z5 = a6.length <= e6;
        ContentValues contentValues = new ContentValues();
        contentValues.put(ProtectedSandApp.s("⃟"), Long.valueOf(k02));
        contentValues.put(ProtectedSandApp.s("⃠"), kVar.l());
        contentValues.put(ProtectedSandApp.s("⃡"), Long.valueOf(kVar.f()));
        contentValues.put(ProtectedSandApp.s("⃢"), Long.valueOf(kVar.m()));
        contentValues.put(ProtectedSandApp.s("⃣"), kVar.e().b().a());
        contentValues.put(ProtectedSandApp.s("⃤"), kVar.d());
        contentValues.put(ProtectedSandApp.s("⃥"), (Integer) 0);
        contentValues.put(ProtectedSandApp.s("⃦"), Boolean.valueOf(z5));
        contentValues.put(ProtectedSandApp.s("⃧"), z5 ? a6 : new byte[0]);
        long insert = sQLiteDatabase.insert(ProtectedSandApp.s("⃨"), null, contentValues);
        String s5 = ProtectedSandApp.s("⃩");
        if (!z5) {
            int ceil = (int) Math.ceil(a6.length / e6);
            for (int i5 = 1; i5 <= ceil; i5++) {
                byte[] copyOfRange = Arrays.copyOfRange(a6, (i5 - 1) * e6, Math.min(i5 * e6, a6.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put(s5, Long.valueOf(insert));
                contentValues2.put(ProtectedSandApp.s("⃪"), Integer.valueOf(i5));
                contentValues2.put(ProtectedSandApp.s("⃫"), copyOfRange);
                sQLiteDatabase.insert(ProtectedSandApp.s("⃬"), null, contentValues2);
            }
        }
        for (Map.Entry<String, String> entry : kVar.i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put(s5, Long.valueOf(insert));
            contentValues3.put(ProtectedSandApp.s("⃭"), entry.getKey());
            contentValues3.put(ProtectedSandApp.s("⃮"), entry.getValue());
            sQLiteDatabase.insert(ProtectedSandApp.s("⃯"), null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] x1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i5 = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i5 += blob.length;
        }
        byte[] bArr = new byte[i5];
        int i6 = 0;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            byte[] bArr2 = (byte[]) arrayList.get(i7);
            System.arraycopy(bArr2, 0, bArr, i6, bArr2.length);
            i6 += bArr2.length;
        }
        return bArr;
    }

    private com.google.android.datatransport.runtime.firebase.transport.f y0() {
        final long a6 = this.f12718p.a();
        return (com.google.android.datatransport.runtime.firebase.transport.f) B0(new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.h0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                com.google.android.datatransport.runtime.firebase.transport.f f12;
                f12 = n0.f1(a6, (SQLiteDatabase) obj);
                return f12;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object y1(Cursor cursor) {
        while (cursor.moveToNext()) {
            c(cursor.getInt(0), c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object z1(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        M1(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.q
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                Object y12;
                y12 = n0.this.y1((Cursor) obj);
                return y12;
            }
        });
        sQLiteDatabase.compileStatement(ProtectedSandApp.s("⃰")).execute();
        return null;
    }

    @m1
    <T> T B0(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase m02 = m0();
        m02.beginTransaction();
        try {
            T apply = bVar.apply(m02);
            m02.setTransactionSuccessful();
            return apply;
        } finally {
            m02.endTransaction();
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.d
    public Iterable<k> C(final com.google.android.datatransport.runtime.s sVar) {
        return (Iterable) B0(new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.z
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                List q12;
                q12 = n0.this.q1(sVar, (SQLiteDatabase) obj);
                return q12;
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.d
    public void J(final com.google.android.datatransport.runtime.s sVar, final long j5) {
        B0(new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.r
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                Object C1;
                C1 = n0.C1(j5, sVar, (SQLiteDatabase) obj);
                return C1;
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.d
    public Iterable<com.google.android.datatransport.runtime.s> N() {
        return (Iterable) B0(new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.j0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                List m12;
                m12 = n0.m1((SQLiteDatabase) obj);
                return m12;
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.d
    @androidx.annotation.q0
    public k P0(final com.google.android.datatransport.runtime.s sVar, final com.google.android.datatransport.runtime.k kVar) {
        j1.a.e(ProtectedSandApp.s("\u20f1"), ProtectedSandApp.s("\u20f2"), sVar.d(), kVar.l(), sVar.b());
        long longValue = ((Long) B0(new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.m0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                Long w12;
                w12 = n0.this.w1(kVar, sVar, (SQLiteDatabase) obj);
                return w12;
            }
        })).longValue();
        if (longValue < 1) {
            return null;
        }
        return new com.google.android.datatransport.runtime.scheduling.persistence.b(longValue, sVar, kVar);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.d
    public long W0(com.google.android.datatransport.runtime.s sVar) {
        return ((Long) M1(m0().rawQuery(ProtectedSandApp.s("\u20f3"), new String[]{sVar.b(), String.valueOf(m1.a.a(sVar.d()))}), new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.p
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                Long U0;
                U0 = n0.U0((Cursor) obj);
                return U0;
            }
        })).longValue();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.c
    public void a() {
        B0(new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.s
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                Object D1;
                D1 = n0.this.D1((SQLiteDatabase) obj);
                return D1;
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.d
    public boolean a1(final com.google.android.datatransport.runtime.s sVar) {
        return ((Boolean) B0(new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.l0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                Boolean i12;
                i12 = n0.this.i1(sVar, (SQLiteDatabase) obj);
                return i12;
            }
        })).booleanValue();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.c
    public com.google.android.datatransport.runtime.firebase.transport.a b() {
        final a.C0163a h5 = com.google.android.datatransport.runtime.firebase.transport.a.h();
        final HashMap hashMap = new HashMap();
        final String s5 = ProtectedSandApp.s("\u20f4");
        return (com.google.android.datatransport.runtime.firebase.transport.a) B0(new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.g0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                com.google.android.datatransport.runtime.firebase.transport.a t12;
                t12 = n0.this.t1(s5, hashMap, h5, (SQLiteDatabase) obj);
                return t12;
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.c
    public void c(final long j5, final c.b bVar, final String str) {
        B0(new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.m
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                Object B1;
                B1 = n0.B1(str, bVar, j5, (SQLiteDatabase) obj);
                return B1;
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.d
    public void c1(Iterable<k> iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = ProtectedSandApp.s("\u20f5") + L1(iterable);
            final String s5 = ProtectedSandApp.s("\u20f6");
            B0(new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.b0
                @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
                public final Object apply(Object obj) {
                    Object z12;
                    z12 = n0.this.z1(str, s5, (SQLiteDatabase) obj);
                    return z12;
                }
            });
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f12717o.close();
    }

    @Override // l1.a
    public <T> T d(a.InterfaceC0460a<T> interfaceC0460a) {
        SQLiteDatabase m02 = m0();
        i0(m02);
        try {
            T execute = interfaceC0460a.execute();
            m02.setTransactionSuccessful();
            return execute;
        } finally {
            m02.endTransaction();
        }
    }

    @c1({c1.a.TESTS})
    public void f0() {
        B0(new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.l
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                Object N0;
                N0 = n0.N0((SQLiteDatabase) obj);
                return N0;
            }
        });
    }

    @m1
    long l0() {
        return o0() * p0();
    }

    @m1
    SQLiteDatabase m0() {
        final u0 u0Var = this.f12717o;
        Objects.requireNonNull(u0Var);
        return (SQLiteDatabase) J1(new d() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.n
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.d
            public final Object a() {
                return u0.this.getWritableDatabase();
            }
        }, new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.o
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                SQLiteDatabase T0;
                T0 = n0.T0((Throwable) obj);
                return T0;
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.d
    public int p() {
        final long a6 = this.f12718p.a() - this.f12720r.c();
        return ((Integer) B0(new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.u
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                Integer M0;
                M0 = n0.this.M0(a6, (SQLiteDatabase) obj);
                return M0;
            }
        })).intValue();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.d
    public void s(Iterable<k> iterable) {
        if (iterable.iterator().hasNext()) {
            m0().compileStatement(ProtectedSandApp.s("\u20f7") + L1(iterable)).execute();
        }
    }
}
