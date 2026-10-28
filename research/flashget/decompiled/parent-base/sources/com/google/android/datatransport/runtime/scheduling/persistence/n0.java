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
import com.flashget.parentalcontrol.ProtectedSandApp;
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
import p8.a;

/* compiled from: SQLiteEventStore.java */
@n1
@cd.f
/* loaded from: classes5.dex */
public class n0 implements com.google.android.datatransport.runtime.scheduling.persistence.d, p8.a, com.google.android.datatransport.runtime.scheduling.persistence.c {

    /* renamed from: h, reason: collision with root package name */
    static final int f52237h = 16;

    /* renamed from: i, reason: collision with root package name */
    private static final int f52238i = 50;

    /* renamed from: b, reason: collision with root package name */
    private final w0 f52240b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.time.a f52241c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.time.a f52242d;

    /* renamed from: e, reason: collision with root package name */
    private final e f52243e;

    /* renamed from: f, reason: collision with root package name */
    private final cd.c<String> f52244f;

    /* renamed from: g, reason: collision with root package name */
    private static final String f52236g = ProtectedSandApp.s("왉");

    /* renamed from: j, reason: collision with root package name */
    private static final com.google.android.datatransport.e f52239j = com.google.android.datatransport.e.b(ProtectedSandApp.s("왊"));

    /* compiled from: SQLiteEventStore.java */
    interface b<T, U> {
        U apply(T t4);
    }

    /* compiled from: SQLiteEventStore.java */
    private static class c {

        /* renamed from: a, reason: collision with root package name */
        final String f52245a;

        /* renamed from: b, reason: collision with root package name */
        final String f52246b;

        private c(String str, String str2) {
            this.f52245a = str;
            this.f52246b = str2;
        }
    }

    /* compiled from: SQLiteEventStore.java */
    interface d<T> {
        T a();
    }

    @cd.a
    n0(@com.google.android.datatransport.runtime.time.h com.google.android.datatransport.runtime.time.a aVar, @com.google.android.datatransport.runtime.time.b com.google.android.datatransport.runtime.time.a aVar2, e eVar, w0 w0Var, @cd.b("PACKAGE_NAME") cd.c<String> cVar) {
        this.f52240b = w0Var;
        this.f52241c = aVar;
        this.f52242d = aVar2;
        this.f52243e = eVar;
        this.f52244f = cVar;
    }

    private static /* synthetic */ Object A0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object B0(Throwable th) {
        throw new SynchronizationException(ProtectedSandApp.s("왋"), th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object B1(String str, c.b bVar, long j4, SQLiteDatabase sQLiteDatabase) {
        if (((Boolean) e2(sQLiteDatabase.rawQuery(ProtectedSandApp.s("왌"), new String[]{str, Integer.toString(bVar.getNumber())}), new o())).booleanValue()) {
            sQLiteDatabase.execSQL(androidx.compose.ui.input.pointer.s.a(ProtectedSandApp.s("왑"), j4, ProtectedSandApp.s("왒")), new String[]{str, Integer.toString(bVar.getNumber())});
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put(ProtectedSandApp.s("왍"), str);
            contentValues.put(ProtectedSandApp.s("왎"), Integer.valueOf(bVar.getNumber()));
            contentValues.put(ProtectedSandApp.s("왏"), Long.valueOf(j4));
            sQLiteDatabase.insert(ProtectedSandApp.s("왐"), null, contentValues);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SQLiteDatabase C0(Throwable th) {
        throw new SynchronizationException(ProtectedSandApp.s("왓"), th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object D1(long j4, com.google.android.datatransport.runtime.s sVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(ProtectedSandApp.s("왔"), Long.valueOf(j4));
        String[] strArr = {sVar.b(), String.valueOf(q8.a.a(sVar.d()))};
        String s4 = ProtectedSandApp.s("왕");
        if (sQLiteDatabase.update(s4, contentValues, ProtectedSandApp.s("왖"), strArr) < 1) {
            contentValues.put(ProtectedSandApp.s("왗"), sVar.b());
            contentValues.put(ProtectedSandApp.s("왘"), Integer.valueOf(q8.a.a(sVar.d())));
            sQLiteDatabase.insert(s4, null, contentValues);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long H0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object H1(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(ProtectedSandApp.s("왙")).execute();
        sQLiteDatabase.compileStatement(ProtectedSandApp.s("왚") + this.f52241c.a()).execute();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.google.android.datatransport.runtime.firebase.transport.f K0(long j4, Cursor cursor) {
        cursor.moveToNext();
        return com.google.android.datatransport.runtime.firebase.transport.f.d().c(cursor.getLong(0)).b(j4).a();
    }

    private List<k> K1(SQLiteDatabase sQLiteDatabase, final com.google.android.datatransport.runtime.s sVar, int i4) {
        final ArrayList arrayList = new ArrayList();
        Long c02 = c0(sQLiteDatabase, sVar);
        if (c02 == null) {
            return arrayList;
        }
        e2(sQLiteDatabase.query(ProtectedSandApp.s("왧"), new String[]{ProtectedSandApp.s("왝"), ProtectedSandApp.s("왞"), ProtectedSandApp.s("왟"), ProtectedSandApp.s("왠"), ProtectedSandApp.s("왡"), ProtectedSandApp.s("왢"), ProtectedSandApp.s("왣"), ProtectedSandApp.s("왤"), ProtectedSandApp.s("왥"), ProtectedSandApp.s("왦"), ProtectedSandApp.s("왛"), ProtectedSandApp.s("왜")}, ProtectedSandApp.s("왨"), new String[]{c02.toString()}, null, null, null, String.valueOf(i4)), new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.m
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                Object g12;
                g12 = n0.this.g1(arrayList, sVar, (Cursor) obj);
                return g12;
            }
        });
        return arrayList;
    }

    private c.b L(int i4) {
        c.b bVar = c.b.REASON_UNKNOWN;
        if (i4 == bVar.getNumber()) {
            return bVar;
        }
        c.b bVar2 = c.b.MESSAGE_TOO_OLD;
        if (i4 == bVar2.getNumber()) {
            return bVar2;
        }
        c.b bVar3 = c.b.CACHE_FULL;
        if (i4 == bVar3.getNumber()) {
            return bVar3;
        }
        c.b bVar4 = c.b.PAYLOAD_TOO_BIG;
        if (i4 == bVar4.getNumber()) {
            return bVar4;
        }
        c.b bVar5 = c.b.MAX_RETRIES_REACHED;
        if (i4 == bVar5.getNumber()) {
            return bVar5;
        }
        c.b bVar6 = c.b.INVALID_PAYLOD;
        if (i4 == bVar6.getNumber()) {
            return bVar6;
        }
        c.b bVar7 = c.b.SERVER_ERROR;
        if (i4 == bVar7.getNumber()) {
            return bVar7;
        }
        n8.a.c(ProtectedSandApp.s("왉"), ProtectedSandApp.s("왩"), Integer.valueOf(i4));
        return bVar;
    }

    private Map<Long, Set<c>> L1(SQLiteDatabase sQLiteDatabase, List<k> list) {
        final HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("왪"));
        for (int i4 = 0; i4 < list.size(); i4++) {
            sb.append(list.get(i4).c());
            if (i4 < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        e2(sQLiteDatabase.query(ProtectedSandApp.s("왮"), new String[]{ProtectedSandApp.s("왭"), ProtectedSandApp.s("왫"), ProtectedSandApp.s("왬")}, sb.toString(), null, null, null, null), new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.u
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                Object j12;
                j12 = n0.j1(hashMap, (Cursor) obj);
                return j12;
            }
        });
        return hashMap;
    }

    private void M(final SQLiteDatabase sQLiteDatabase) {
        W1(new d() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.f0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.d
            public final Object a() {
                return n0.y(sQLiteDatabase);
            }
        }, new g0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.google.android.datatransport.runtime.firebase.transport.f M0(final long j4, SQLiteDatabase sQLiteDatabase) {
        return (com.google.android.datatransport.runtime.firebase.transport.f) e2(sQLiteDatabase.rawQuery(ProtectedSandApp.s("왯"), new String[0]), new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.d0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                com.google.android.datatransport.runtime.firebase.transport.f K0;
                K0 = n0.K0(j4, (Cursor) obj);
                return K0;
            }
        });
    }

    private static byte[] M1(@androidx.annotation.q0 String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    private long N(SQLiteDatabase sQLiteDatabase, com.google.android.datatransport.runtime.s sVar) {
        Long c02 = c0(sQLiteDatabase, sVar);
        if (c02 != null) {
            return c02.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(ProtectedSandApp.s("왗"), sVar.b());
        contentValues.put(ProtectedSandApp.s("왘"), Integer.valueOf(q8.a.a(sVar.d())));
        contentValues.put(ProtectedSandApp.s("왔"), (Integer) 0);
        if (sVar.c() != null) {
            contentValues.put(ProtectedSandApp.s("왰"), Base64.encodeToString(sVar.c(), 0));
        }
        return sQLiteDatabase.insert(ProtectedSandApp.s("왕"), null, contentValues);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long N0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean O0(com.google.android.datatransport.runtime.s sVar, SQLiteDatabase sQLiteDatabase) {
        Long c02 = c0(sQLiteDatabase, sVar);
        if (c02 == null) {
            return Boolean.FALSE;
        }
        return (Boolean) e2(Q().rawQuery(ProtectedSandApp.s("왱"), new String[]{c02.toString()}), new h0());
    }

    private com.google.android.datatransport.runtime.firebase.transport.b S() {
        return com.google.android.datatransport.runtime.firebase.transport.b.d().b(com.google.android.datatransport.runtime.firebase.transport.e.d().b(O()).c(e.f52218f.f()).a()).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List S0(SQLiteDatabase sQLiteDatabase) {
        return (List) e2(sQLiteDatabase.rawQuery(ProtectedSandApp.s("왲"), new String[0]), new y());
    }

    private void S1(a.C0789a c0789a, Map<String, List<com.google.android.datatransport.runtime.firebase.transport.c>> map) {
        for (Map.Entry<String, List<com.google.android.datatransport.runtime.firebase.transport.c>> entry : map.entrySet()) {
            c0789a.a(com.google.android.datatransport.runtime.firebase.transport.d.d().d(entry.getKey()).c(entry.getValue()).b());
        }
    }

    private byte[] T1(long j4) {
        return (byte[]) e2(Q().query(ProtectedSandApp.s("왵"), new String[]{ProtectedSandApp.s("왳")}, ProtectedSandApp.s("왶"), new String[]{String.valueOf(j4)}, null, null, ProtectedSandApp.s("왴")), new z());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List U0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(com.google.android.datatransport.runtime.s.a().b(cursor.getString(1)).d(q8.a.b(cursor.getInt(2))).c(M1(cursor.getString(3))).a());
        }
        return arrayList;
    }

    private <T> T W1(d<T> dVar, b<Throwable, T> bVar) {
        long a5 = this.f52242d.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e4) {
                if (this.f52242d.a() >= this.f52243e.b() + a5) {
                    return bVar.apply(e4);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    private long X() {
        return Q().compileStatement(ProtectedSandApp.s("왷")).simpleQueryForLong();
    }

    private com.google.android.datatransport.runtime.firebase.transport.f Y() {
        final long a5 = this.f52241c.a();
        return (com.google.android.datatransport.runtime.firebase.transport.f) j0(new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.b0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                com.google.android.datatransport.runtime.firebase.transport.f M0;
                M0 = n0.M0(a5, (SQLiteDatabase) obj);
                return M0;
            }
        });
    }

    private static com.google.android.datatransport.e a2(@androidx.annotation.q0 String str) {
        return str == null ? f52239j : com.google.android.datatransport.e.b(str);
    }

    @androidx.annotation.q0
    private Long c0(SQLiteDatabase sQLiteDatabase, com.google.android.datatransport.runtime.s sVar) {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("왖"));
        ArrayList arrayList = new ArrayList(Arrays.asList(sVar.b(), String.valueOf(q8.a.a(sVar.d()))));
        if (sVar.c() != null) {
            sb.append(ProtectedSandApp.s("외"));
            arrayList.add(Base64.encodeToString(sVar.c(), 0));
        } else {
            sb.append(ProtectedSandApp.s("왹"));
        }
        return (Long) e2(sQLiteDatabase.query(ProtectedSandApp.s("왕"), new String[]{ProtectedSandApp.s("왝")}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List c1(com.google.android.datatransport.runtime.s sVar, SQLiteDatabase sQLiteDatabase) {
        List<k> K1 = K1(sQLiteDatabase, sVar, this.f52243e.d());
        for (com.google.android.datatransport.h hVar : com.google.android.datatransport.h.values()) {
            if (hVar != sVar.d()) {
                int d5 = this.f52243e.d() - K1.size();
                if (d5 <= 0) {
                    break;
                }
                K1.addAll(K1(sQLiteDatabase, sVar.f(hVar), d5));
            }
        }
        return o0(K1, L1(sQLiteDatabase, K1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ com.google.android.datatransport.runtime.firebase.transport.a d1(Map map, a.C0789a c0789a, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            c.b L = L(cursor.getInt(1));
            long j4 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(com.google.android.datatransport.runtime.firebase.transport.c.d().c(L).b(j4).a());
        }
        S1(c0789a, map);
        return c0789a.f(Y()).d(S()).c(this.f52244f.get()).b();
    }

    private static String d2(Iterable<k> iterable) {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("왺"));
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
    public /* synthetic */ com.google.android.datatransport.runtime.firebase.transport.a e1(String str, final Map map, final a.C0789a c0789a, SQLiteDatabase sQLiteDatabase) {
        return (com.google.android.datatransport.runtime.firebase.transport.a) e2(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.r
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                com.google.android.datatransport.runtime.firebase.transport.a d12;
                d12 = n0.this.d1(map, c0789a, (Cursor) obj);
                return d12;
            }
        });
    }

    @m1
    static <T> T e2(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object g1(List list, com.google.android.datatransport.runtime.s sVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j4 = cursor.getLong(0);
            boolean z4 = cursor.getInt(7) != 0;
            k.a o4 = com.google.android.datatransport.runtime.k.a().n(cursor.getString(1)).i(cursor.getLong(2)).o(cursor.getLong(3));
            if (z4) {
                o4.h(new com.google.android.datatransport.runtime.j(a2(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                o4.h(new com.google.android.datatransport.runtime.j(a2(cursor.getString(4)), T1(j4)));
            }
            if (!cursor.isNull(6)) {
                o4.g(Integer.valueOf(cursor.getInt(6)));
            }
            if (!cursor.isNull(8)) {
                o4.l(Integer.valueOf(cursor.getInt(8)));
            }
            if (!cursor.isNull(9)) {
                o4.m(cursor.getString(9));
            }
            if (!cursor.isNull(10)) {
                o4.j(cursor.getBlob(10));
            }
            if (!cursor.isNull(11)) {
                o4.k(cursor.getBlob(11));
            }
            list.add(new com.google.android.datatransport.runtime.scheduling.persistence.b(j4, sVar, o4.d()));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object j1(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j4 = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j4));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j4), set);
            }
            set.add(new c(cursor.getString(1), cursor.getString(2)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Long k1(com.google.android.datatransport.runtime.k kVar, com.google.android.datatransport.runtime.s sVar, SQLiteDatabase sQLiteDatabase) {
        if (n0()) {
            d(1L, c.b.CACHE_FULL, kVar.p());
            return -1L;
        }
        long N = N(sQLiteDatabase, sVar);
        int e4 = this.f52243e.e();
        byte[] a5 = kVar.e().a();
        boolean z4 = a5.length <= e4;
        ContentValues contentValues = new ContentValues();
        contentValues.put(ProtectedSandApp.s("왻"), Long.valueOf(N));
        contentValues.put(ProtectedSandApp.s("왞"), kVar.p());
        contentValues.put(ProtectedSandApp.s("왟"), Long.valueOf(kVar.f()));
        contentValues.put(ProtectedSandApp.s("왠"), Long.valueOf(kVar.q()));
        contentValues.put(ProtectedSandApp.s("왡"), kVar.e().b().a());
        contentValues.put(ProtectedSandApp.s("왣"), kVar.d());
        contentValues.put(ProtectedSandApp.s("왼"), (Integer) 0);
        contentValues.put(ProtectedSandApp.s("왤"), Boolean.valueOf(z4));
        contentValues.put(ProtectedSandApp.s("왢"), z4 ? a5 : new byte[0]);
        contentValues.put(ProtectedSandApp.s("왥"), kVar.n());
        contentValues.put(ProtectedSandApp.s("왦"), kVar.o());
        contentValues.put(ProtectedSandApp.s("왛"), kVar.g());
        contentValues.put(ProtectedSandApp.s("왜"), kVar.h());
        long insert = sQLiteDatabase.insert(ProtectedSandApp.s("왧"), null, contentValues);
        String s4 = ProtectedSandApp.s("왭");
        if (!z4) {
            int ceil = (int) Math.ceil(a5.length / e4);
            for (int i4 = 1; i4 <= ceil; i4++) {
                byte[] copyOfRange = Arrays.copyOfRange(a5, (i4 - 1) * e4, Math.min(i4 * e4, a5.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put(s4, Long.valueOf(insert));
                contentValues2.put(ProtectedSandApp.s("왴"), Integer.valueOf(i4));
                contentValues2.put(ProtectedSandApp.s("왳"), copyOfRange);
                sQLiteDatabase.insert(ProtectedSandApp.s("왵"), null, contentValues2);
            }
        }
        for (Map.Entry<String, String> entry : kVar.k().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put(s4, Long.valueOf(insert));
            contentValues3.put(ProtectedSandApp.s("왫"), entry.getKey());
            contentValues3.put(ProtectedSandApp.s("왬"), entry.getValue());
            sQLiteDatabase.insert(ProtectedSandApp.s("왮"), null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] l1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i4 += blob.length;
        }
        byte[] bArr = new byte[i4];
        int i5 = 0;
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            byte[] bArr2 = (byte[]) arrayList.get(i6);
            System.arraycopy(bArr2, 0, bArr, i5, bArr2.length);
            i5 += bArr2.length;
        }
        return bArr;
    }

    private boolean n0() {
        return X() * v() >= this.f52243e.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object n1(Cursor cursor) {
        while (cursor.moveToNext()) {
            d(cursor.getInt(0), c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    private List<k> o0(List<k> list, Map<Long, Set<c>> map) {
        ListIterator<k> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            k next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.c()))) {
                k.a r4 = next.b().r();
                for (c cVar : map.get(Long.valueOf(next.c()))) {
                    r4.c(cVar.f52245a, cVar.f52246b);
                }
                listIterator.set(new com.google.android.datatransport.runtime.scheduling.persistence.b(next.c(), next.d(), r4.d()));
            }
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object q0(Cursor cursor) {
        while (cursor.moveToNext()) {
            d(cursor.getInt(0), c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer r0(long j4, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j4)};
        e2(sQLiteDatabase.rawQuery(ProtectedSandApp.s("왽"), strArr), new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.e0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                Object q02;
                q02 = n0.this.q0((Cursor) obj);
                return q02;
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete(ProtectedSandApp.s("왧"), ProtectedSandApp.s("왾"), strArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object t1(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        e2(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.m0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                Object n12;
                n12 = n0.this.n1((Cursor) obj);
                return n12;
            }
        });
        sQLiteDatabase.compileStatement(ProtectedSandApp.s("왿")).execute();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object u0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.delete(ProtectedSandApp.s("왧"), null, new String[0]);
        sQLiteDatabase.delete(ProtectedSandApp.s("왕"), null, new String[0]);
        return null;
    }

    private long v() {
        return Q().compileStatement(ProtectedSandApp.s("욀")).simpleQueryForLong();
    }

    public static /* synthetic */ Object y(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean y1(Cursor cursor) {
        return Boolean.valueOf(cursor.getCount() > 0);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.d
    public boolean A1(final com.google.android.datatransport.runtime.s sVar) {
        return ((Boolean) j0(new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.q
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                Boolean O0;
                O0 = n0.this.O0(sVar, (SQLiteDatabase) obj);
                return O0;
            }
        })).booleanValue();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.d
    public void E1(Iterable<k> iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = ProtectedSandApp.s("욁") + d2(iterable);
            final String s4 = ProtectedSandApp.s("욂");
            j0(new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.w
                @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
                public final Object apply(Object obj) {
                    Object t12;
                    t12 = n0.this.t1(str, s4, (SQLiteDatabase) obj);
                    return t12;
                }
            });
        }
    }

    @c1({c1.a.TESTS})
    public void K() {
        j0(new i0());
    }

    @m1
    long O() {
        return X() * v();
    }

    @m1
    SQLiteDatabase Q() {
        final w0 w0Var = this.f52240b;
        Objects.requireNonNull(w0Var);
        return (SQLiteDatabase) W1(new d() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.k0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.d
            public final Object a() {
                return w0.this.getWritableDatabase();
            }
        }, new l0());
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.d
    public void U(Iterable<k> iterable) {
        if (iterable.iterator().hasNext()) {
            Q().compileStatement(ProtectedSandApp.s("욃") + d2(iterable)).execute();
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.c
    public void a() {
        j0(new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.t
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                Object H1;
                H1 = n0.this.H1((SQLiteDatabase) obj);
                return H1;
            }
        });
    }

    @Override // p8.a
    public <T> T b(a.InterfaceC1373a<T> interfaceC1373a) {
        SQLiteDatabase Q = Q();
        M(Q);
        try {
            T j4 = interfaceC1373a.j();
            Q.setTransactionSuccessful();
            return j4;
        } finally {
            Q.endTransaction();
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.c
    public com.google.android.datatransport.runtime.firebase.transport.a c() {
        final a.C0789a h4 = com.google.android.datatransport.runtime.firebase.transport.a.h();
        final HashMap hashMap = new HashMap();
        final String s4 = ProtectedSandApp.s("욄");
        return (com.google.android.datatransport.runtime.firebase.transport.a) j0(new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.l
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                com.google.android.datatransport.runtime.firebase.transport.a e12;
                e12 = n0.this.e1(s4, hashMap, h4, (SQLiteDatabase) obj);
                return e12;
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f52240b.close();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.c
    public void d(final long j4, final c.b bVar, final String str) {
        j0(new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.x
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                Object B1;
                B1 = n0.B1(str, bVar, j4, (SQLiteDatabase) obj);
                return B1;
            }
        });
    }

    @m1
    <T> T j0(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase Q = Q();
        Q.beginTransaction();
        try {
            T apply = bVar.apply(Q);
            Q.setTransactionSuccessful();
            return apply;
        } finally {
            Q.endTransaction();
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.d
    public Iterable<k> j2(final com.google.android.datatransport.runtime.s sVar) {
        return (Iterable) j0(new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.j0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                List c12;
                c12 = n0.this.c1(sVar, (SQLiteDatabase) obj);
                return c12;
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.d
    public void l0(final com.google.android.datatransport.runtime.s sVar, final long j4) {
        j0(new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.s
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                Object D1;
                D1 = n0.D1(j4, sVar, (SQLiteDatabase) obj);
                return D1;
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.d
    public int p() {
        final long a5 = this.f52241c.a() - this.f52243e.c();
        return ((Integer) j0(new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.v
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                Integer r02;
                r02 = n0.this.r0(a5, (SQLiteDatabase) obj);
                return r02;
            }
        })).intValue();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.d
    public Iterable<com.google.android.datatransport.runtime.s> p0() {
        return (Iterable) j0(new a0());
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.d
    @androidx.annotation.q0
    public k p3(final com.google.android.datatransport.runtime.s sVar, final com.google.android.datatransport.runtime.k kVar) {
        n8.a.e(ProtectedSandApp.s("왉"), ProtectedSandApp.s("욅"), sVar.d(), kVar.p(), sVar.b());
        long longValue = ((Long) j0(new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.p
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                Long k12;
                k12 = n0.this.k1(kVar, sVar, (SQLiteDatabase) obj);
                return k12;
            }
        })).longValue();
        if (longValue < 1) {
            return null;
        }
        return new com.google.android.datatransport.runtime.scheduling.persistence.b(longValue, sVar, kVar);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.d
    public long w1(com.google.android.datatransport.runtime.s sVar) {
        return ((Long) e2(Q().rawQuery(ProtectedSandApp.s("욆"), new String[]{sVar.b(), String.valueOf(q8.a.a(sVar.d()))}), new c0())).longValue();
    }
}
