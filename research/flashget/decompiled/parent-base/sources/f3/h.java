package f3;

import fg.l;
import fg.m;
import java.util.regex.Pattern;
import kd.n;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;

/* compiled from: SupportSQLiteQueryBuilder.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u001f2\u00020\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\u000b\u001a\u00020\n*\u00060\u0006j\u0002`\u00072\u0006\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000f\u001a\u00020\n*\u00060\u0006j\u0002`\u00072\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u00002\u0010\u0010\u000e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0002\u0018\u00010\r¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0017\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0016\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010\r¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001d\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001f\u0010\u001bJ\u0015\u0010!\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0002¢\u0006\u0004\b!\u0010\u001bJ\r\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010%R\u0016\u0010(\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010'R \u0010\u000e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0002\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010%R\"\u0010\u0016\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010+R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010%R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010%R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010%R\u0018\u0010 \u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010%¨\u0006,"}, d2 = {"Lf3/h;", "", "", "table", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "name", "clause", "Lkotlin/k2;", "a", "(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V", "", "columns", "b", "(Ljava/lang/StringBuilder;[Ljava/lang/String;)V", "f", "()Lf3/h;", "d", "([Ljava/lang/String;)Lf3/h;", "selection", "bindArgs", "k", "(Ljava/lang/String;[Ljava/lang/Object;)Lf3/h;", "groupBy", "g", "(Ljava/lang/String;)Lf3/h;", "having", "h", "orderBy", "j", "limit", "i", "Lf3/g;", "e", "()Lf3/g;", "Ljava/lang/String;", "", "Z", "distinct", "c", "[Ljava/lang/String;", "[Ljava/lang/Object;", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSupportSQLiteQueryBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupportSQLiteQueryBuilder.kt\nandroidx/sqlite/db/SupportSQLiteQueryBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,187:1\n1#2:188\n*E\n"})
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: k, reason: collision with root package name */
    private static final Pattern f73877k = Pattern.compile("\\s*\\d+\\s*(,\\s*\\d+\\s*)?");

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final String table;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean distinct;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @m
    private String[] columns;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @m
    private String selection;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @m
    private Object[] bindArgs;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @m
    private String groupBy;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @m
    private String having;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @m
    private String orderBy;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @m
    private String limit;

    /* compiled from: SupportSQLiteQueryBuilder.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u000b\u001a\n \n*\u0004\u0018\u00010\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lf3/h$a;", "", "<init>", "()V", "", "tableName", "Lf3/h;", "a", "(Ljava/lang/String;)Lf3/h;", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "limitPattern", "Ljava/util/regex/Pattern;", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: f3.h$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @l
        @n
        public final h a(@l String tableName) {
            l0.p(tableName, "tableName");
            return new h(tableName, null);
        }

        public Companion(w wVar) {
        }
    }

    public /* synthetic */ h(String str, w wVar) {
        this(str);
    }

    private final void a(StringBuilder sb, String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            return;
        }
        sb.append(str);
        sb.append(str2);
    }

    private final void b(StringBuilder sb, String[] strArr) {
        int length = strArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            String str = strArr[i4];
            if (i4 > 0) {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(' ');
    }

    @l
    @n
    public static final h c(@l String str) {
        return INSTANCE.a(str);
    }

    @l
    public final h d(@m String[] columns) {
        this.columns = columns;
        return this;
    }

    @l
    public final g e() {
        String str;
        String str2 = this.groupBy;
        if ((str2 == null || str2.length() == 0) && (str = this.having) != null && str.length() != 0) {
            throw new IllegalArgumentException("HAVING clauses are only permitted when using a groupBy clause");
        }
        StringBuilder a5 = androidx.fragment.app.a.a(120, "SELECT ");
        if (this.distinct) {
            a5.append("DISTINCT ");
        }
        String[] strArr = this.columns;
        if (strArr == null || strArr.length == 0) {
            a5.append("* ");
        } else {
            l0.m(strArr);
            b(a5, strArr);
        }
        a5.append("FROM ");
        a5.append(this.table);
        a(a5, " WHERE ", this.selection);
        a(a5, " GROUP BY ", this.groupBy);
        a(a5, " HAVING ", this.having);
        a(a5, " ORDER BY ", this.orderBy);
        a(a5, " LIMIT ", this.limit);
        String sb = a5.toString();
        l0.o(sb, "StringBuilder(capacity).…builderAction).toString()");
        return new b(sb, this.bindArgs);
    }

    @l
    public final h f() {
        this.distinct = true;
        return this;
    }

    @l
    public final h g(@m String groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    @l
    public final h h(@m String having) {
        this.having = having;
        return this;
    }

    @l
    public final h i(@l String limit) {
        l0.p(limit, "limit");
        boolean matches = f73877k.matcher(limit).matches();
        if (limit.length() != 0 && !matches) {
            throw new IllegalArgumentException(androidx.constraintlayout.core.motion.key.c.a("invalid LIMIT clauses:", limit).toString());
        }
        this.limit = limit;
        return this;
    }

    @l
    public final h j(@m String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    @l
    public final h k(@m String selection, @m Object[] bindArgs) {
        this.selection = selection;
        this.bindArgs = bindArgs;
        return this;
    }

    private h(String str) {
        this.table = str;
    }
}
