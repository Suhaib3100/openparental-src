package f3;

import fg.l;
import fg.m;
import kd.n;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: SimpleSQLiteQuery.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00182\u00020\u0001:\u0001\u0015B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R \u0010\u0006\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lf3/b;", "Lf3/g;", "", "query", "", "", "bindArgs", "<init>", "(Ljava/lang/String;[Ljava/lang/Object;)V", "(Ljava/lang/String;)V", "Lf3/f;", "statement", "Lkotlin/k2;", "c", "(Lf3/f;)V", "b", "Ljava/lang/String;", "[Ljava/lang/Object;", "()Ljava/lang/String;", "sql", "", "a", "()I", "argCount", "d", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements g {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final String query;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @m
    private final Object[] bindArgs;

    /* compiled from: SimpleSQLiteQuery.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\r\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lf3/b$a;", "", "<init>", "()V", "Lf3/f;", "statement", "", "index", "arg", "Lkotlin/k2;", "a", "(Lf3/f;ILjava/lang/Object;)V", "", "bindArgs", "b", "(Lf3/f;[Ljava/lang/Object;)V", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: f3.b$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        private final void a(f statement, int index, Object arg) {
            if (arg == null) {
                statement.h3(index);
                return;
            }
            if (arg instanceof byte[]) {
                statement.L2(index, (byte[]) arg);
                return;
            }
            if (arg instanceof Float) {
                statement.k0(index, ((Number) arg).floatValue());
                return;
            }
            if (arg instanceof Double) {
                statement.k0(index, ((Number) arg).doubleValue());
                return;
            }
            if (arg instanceof Long) {
                statement.C2(index, ((Number) arg).longValue());
                return;
            }
            if (arg instanceof Integer) {
                statement.C2(index, ((Number) arg).intValue());
                return;
            }
            if (arg instanceof Short) {
                statement.C2(index, ((Number) arg).shortValue());
                return;
            }
            if (arg instanceof Byte) {
                statement.C2(index, ((Number) arg).byteValue());
                return;
            }
            if (arg instanceof String) {
                statement.c2(index, (String) arg);
                return;
            }
            if (arg instanceof Boolean) {
                statement.C2(index, ((Boolean) arg).booleanValue() ? 1L : 0L);
                return;
            }
            throw new IllegalArgumentException("Cannot bind " + arg + " at index " + index + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
        }

        @n
        public final void b(@l f statement, @m Object[] bindArgs) {
            l0.p(statement, "statement");
            if (bindArgs == null) {
                return;
            }
            int length = bindArgs.length;
            int i4 = 0;
            while (i4 < length) {
                Object obj = bindArgs[i4];
                i4++;
                a(statement, i4, obj);
            }
        }

        public Companion(w wVar) {
        }
    }

    public b(@l String query, @m Object[] objArr) {
        l0.p(query, "query");
        this.query = query;
        this.bindArgs = objArr;
    }

    @n
    public static final void d(@l f fVar, @m Object[] objArr) {
        INSTANCE.b(fVar, objArr);
    }

    @Override // f3.g
    public int a() {
        Object[] objArr = this.bindArgs;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    @Override // f3.g
    @l
    /* renamed from: b, reason: from getter */
    public String getQuery() {
        return this.query;
    }

    @Override // f3.g
    public void c(@l f statement) {
        l0.p(statement, "statement");
        INSTANCE.b(statement, this.bindArgs);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(@l String query) {
        this(query, null);
        l0.p(query, "query");
    }
}
