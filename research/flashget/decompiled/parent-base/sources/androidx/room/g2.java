package androidx.room;

import androidx.annotation.c1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;

/* compiled from: RoomSQLiteQuery.kt */
@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\f\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010\u0013\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\t\b\u0007\u0018\u0000 D2\u00020\u00012\u00020\u0002:\u0002@%B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0006J\u001f\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\nH\u0016¢\u0006\u0004\b \u0010\u000eJ\u0015\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020\u0000¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\nH\u0016¢\u0006\u0004\b$\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010)R\u001a\u0010.\u001a\u00020*8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u0012\u0004\b-\u0010\u000eR\u001a\u00102\u001a\u00020/8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u00100\u0012\u0004\b1\u0010\u000eR\"\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0007038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u0012\u0004\b6\u0010\u000eR\"\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u00109\u0012\u0004\b:\u0010\u000eR\u001a\u0010>\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b:\u0010=\u0012\u0004\b8\u0010\u000eR$\u0010A\u001a\u00020\u00032\u0006\u0010?\u001a\u00020\u00038\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b'\u0010&\u001a\u0004\b@\u0010(R\u0014\u0010C\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010B¨\u0006E"}, d2 = {"Landroidx/room/g2;", "Lf3/g;", "Lf3/f;", "", "capacity", "<init>", "(I)V", "", "query", "initArgCount", "Lkotlin/k2;", "n", "(Ljava/lang/String;I)V", "release", "()V", "statement", "c", "(Lf3/f;)V", "index", "h3", "", "value", "C2", "(IJ)V", "", "k0", "(ID)V", "c2", "(ILjava/lang/String;)V", "", "L2", "(I[B)V", "close", "other", "e", "(Landroidx/room/g2;)V", "C3", "b", "I", "i", "()I", "Ljava/lang/String;", "", "d", "[J", "l", "longBindings", "", "[D", "k", "doubleBindings", "", "f", "[Ljava/lang/String;", "m", "stringBindings", "g", "[[B", "h", "blobBindings", "", "[I", "bindingTypes", "<set-?>", "a", "argCount", "()Ljava/lang/String;", "sql", "j", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g2 implements f3.g, f3.f {

    /* renamed from: k, reason: collision with root package name */
    public static final int f33686k = 15;

    /* renamed from: l, reason: collision with root package name */
    public static final int f33687l = 10;

    /* renamed from: n, reason: collision with root package name */
    private static final int f33689n = 1;

    /* renamed from: o, reason: collision with root package name */
    private static final int f33690o = 2;

    /* renamed from: p, reason: collision with root package name */
    private static final int f33691p = 3;

    /* renamed from: q, reason: collision with root package name */
    private static final int f33692q = 4;

    /* renamed from: r, reason: collision with root package name */
    private static final int f33693r = 5;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @androidx.annotation.m1
    private final int capacity;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private volatile String query;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public final long[] longBindings;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public final double[] doubleBindings;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public final String[] stringBindings;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public final byte[][] blobBindings;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final int[] bindingTypes;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int argCount;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: m, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final TreeMap<Integer, g2> f33688m = new TreeMap<>();

    /* compiled from: RoomSQLiteQuery.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/g2$a;", "", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @dd.e(dd.a.SOURCE)
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* compiled from: RoomSQLiteQuery.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0010\u0010\u0003R\u001a\u0010\u0011\u001a\u00020\u000b8\u0006X\u0087T¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0013\u0010\u0003R\u001a\u0010\u0014\u001a\u00020\u000b8\u0006X\u0087T¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u0012\u0004\b\u0015\u0010\u0003R&\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u0019\u0010\u0003R\u0014\u0010\u001a\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0012R\u0014\u0010\u001b\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0012R\u0014\u0010\u001c\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0012R\u0014\u0010\u001d\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0012R\u0014\u0010\u001e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0012¨\u0006\u001f"}, d2 = {"Landroidx/room/g2$b;", "", "<init>", "()V", "Lf3/g;", "supportSQLiteQuery", "Landroidx/room/g2;", "b", "(Lf3/g;)Landroidx/room/g2;", "", "query", "", "argumentCount", "a", "(Ljava/lang/String;I)Landroidx/room/g2;", "Lkotlin/k2;", "f", "POOL_LIMIT", "I", "d", "DESIRED_POOL_SIZE", "c", "Ljava/util/TreeMap;", "queryPool", "Ljava/util/TreeMap;", "e", "BLOB", "DOUBLE", "LONG", "NULL", "STRING", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.room.g2$b, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: RoomSQLiteQuery.kt */
        @Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0011H\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006H\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"androidx/room/g2$b$a", "Lf3/f;", "", "index", "", "value", "Lkotlin/k2;", "L2", "(I[B)V", "", "k0", "(ID)V", "", "C2", "(IJ)V", "h3", "(I)V", "", "c2", "(ILjava/lang/String;)V", "C3", "()V", "close", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.room.g2$b$a */
        public static final class a implements f3.f {

            /* renamed from: b, reason: collision with root package name */
            private final /* synthetic */ g2 f33702b;

            a(g2 g2Var) {
                this.f33702b = g2Var;
            }

            @Override // f3.f
            public void C2(int index, long value) {
                this.f33702b.C2(index, value);
            }

            @Override // f3.f
            public void C3() {
                this.f33702b.C3();
            }

            @Override // f3.f
            public void L2(int index, @fg.l byte[] value) {
                kotlin.jvm.internal.l0.p(value, "value");
                this.f33702b.L2(index, value);
            }

            @Override // f3.f
            public void c2(int index, @fg.l String value) {
                kotlin.jvm.internal.l0.p(value, "value");
                this.f33702b.c2(index, value);
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                this.f33702b.getClass();
            }

            @Override // f3.f
            public void h3(int index) {
                this.f33702b.h3(index);
            }

            @Override // f3.f
            public void k0(int index, double value) {
                this.f33702b.k0(index, value);
            }
        }

        private Companion() {
        }

        @androidx.annotation.m1
        public static /* synthetic */ void c() {
        }

        @androidx.annotation.m1
        public static /* synthetic */ void d() {
        }

        @androidx.annotation.m1
        public static /* synthetic */ void e() {
        }

        @fg.l
        @kd.n
        public final g2 a(@fg.l String query, int argumentCount) {
            kotlin.jvm.internal.l0.p(query, "query");
            TreeMap<Integer, g2> treeMap = g2.f33688m;
            synchronized (treeMap) {
                Map.Entry<Integer, g2> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(argumentCount));
                if (ceilingEntry == null) {
                    kotlin.k2 k2Var = kotlin.k2.f75408a;
                    g2 g2Var = new g2(argumentCount, null);
                    g2Var.n(query, argumentCount);
                    return g2Var;
                }
                treeMap.remove(ceilingEntry.getKey());
                g2 sqliteQuery = ceilingEntry.getValue();
                sqliteQuery.n(query, argumentCount);
                kotlin.jvm.internal.l0.o(sqliteQuery, "sqliteQuery");
                return sqliteQuery;
            }
        }

        @fg.l
        @kd.n
        public final g2 b(@fg.l f3.g supportSQLiteQuery) {
            kotlin.jvm.internal.l0.p(supportSQLiteQuery, "supportSQLiteQuery");
            g2 a5 = a(supportSQLiteQuery.getQuery(), supportSQLiteQuery.getArgCount());
            supportSQLiteQuery.c(new a(a5));
            return a5;
        }

        public final void f() {
            TreeMap<Integer, g2> treeMap = g2.f33688m;
            if (treeMap.size() <= 15) {
                return;
            }
            int size = treeMap.size() - 10;
            Iterator<Integer> it = treeMap.descendingKeySet().iterator();
            kotlin.jvm.internal.l0.o(it, "queryPool.descendingKeySet().iterator()");
            while (true) {
                int i4 = size - 1;
                if (size <= 0) {
                    return;
                }
                it.next();
                it.remove();
                size = i4;
            }
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public /* synthetic */ g2(int i4, kotlin.jvm.internal.w wVar) {
        this(i4);
    }

    @fg.l
    @kd.n
    public static final g2 d(@fg.l String str, int i4) {
        return INSTANCE.a(str, i4);
    }

    @fg.l
    @kd.n
    public static final g2 f(@fg.l f3.g gVar) {
        return INSTANCE.b(gVar);
    }

    private static /* synthetic */ void g() {
    }

    @androidx.annotation.m1
    public static /* synthetic */ void h() {
    }

    @androidx.annotation.m1
    public static /* synthetic */ void k() {
    }

    @androidx.annotation.m1
    public static /* synthetic */ void l() {
    }

    @androidx.annotation.m1
    public static /* synthetic */ void m() {
    }

    @Override // f3.f
    public void C2(int index, long value) {
        this.bindingTypes[index] = 2;
        this.longBindings[index] = value;
    }

    @Override // f3.f
    public void C3() {
        Arrays.fill(this.bindingTypes, 1);
        Arrays.fill(this.stringBindings, (Object) null);
        Arrays.fill(this.blobBindings, (Object) null);
        this.query = null;
    }

    @Override // f3.f
    public void L2(int index, @fg.l byte[] value) {
        kotlin.jvm.internal.l0.p(value, "value");
        this.bindingTypes[index] = 5;
        this.blobBindings[index] = value;
    }

    @Override // f3.g
    /* renamed from: a, reason: from getter */
    public int getArgCount() {
        return this.argCount;
    }

    @Override // f3.g
    @fg.l
    /* renamed from: b */
    public String getQuery() {
        String str = this.query;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // f3.g
    public void c(@fg.l f3.f statement) {
        kotlin.jvm.internal.l0.p(statement, "statement");
        int i4 = this.argCount;
        if (1 > i4) {
            return;
        }
        int i5 = 1;
        while (true) {
            int i6 = this.bindingTypes[i5];
            if (i6 == 1) {
                statement.h3(i5);
            } else if (i6 == 2) {
                statement.C2(i5, this.longBindings[i5]);
            } else if (i6 == 3) {
                statement.k0(i5, this.doubleBindings[i5]);
            } else if (i6 == 4) {
                String str = this.stringBindings[i5];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.c2(i5, str);
            } else if (i6 == 5) {
                byte[] bArr = this.blobBindings[i5];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.L2(i5, bArr);
            }
            if (i5 == i4) {
                return;
            } else {
                i5++;
            }
        }
    }

    @Override // f3.f
    public void c2(int index, @fg.l String value) {
        kotlin.jvm.internal.l0.p(value, "value");
        this.bindingTypes[index] = 4;
        this.stringBindings[index] = value;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final void e(@fg.l g2 other) {
        kotlin.jvm.internal.l0.p(other, "other");
        int i4 = other.argCount + 1;
        System.arraycopy(other.bindingTypes, 0, this.bindingTypes, 0, i4);
        System.arraycopy(other.longBindings, 0, this.longBindings, 0, i4);
        System.arraycopy(other.stringBindings, 0, this.stringBindings, 0, i4);
        System.arraycopy(other.blobBindings, 0, this.blobBindings, 0, i4);
        System.arraycopy(other.doubleBindings, 0, this.doubleBindings, 0, i4);
    }

    @Override // f3.f
    public void h3(int index) {
        this.bindingTypes[index] = 1;
    }

    /* renamed from: i, reason: from getter */
    public final int getCapacity() {
        return this.capacity;
    }

    @Override // f3.f
    public void k0(int index, double value) {
        this.bindingTypes[index] = 3;
        this.doubleBindings[index] = value;
    }

    public final void n(@fg.l String query, int initArgCount) {
        kotlin.jvm.internal.l0.p(query, "query");
        this.query = query;
        this.argCount = initArgCount;
    }

    public final void release() {
        TreeMap<Integer, g2> treeMap = f33688m;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.capacity), this);
            INSTANCE.f();
            kotlin.k2 k2Var = kotlin.k2.f75408a;
        }
    }

    private g2(int i4) {
        this.capacity = i4;
        int i5 = i4 + 1;
        this.bindingTypes = new int[i5];
        this.longBindings = new long[i5];
        this.doubleBindings = new double[i5];
        this.stringBindings = new String[i5];
        this.blobBindings = new byte[i5][];
    }
}
