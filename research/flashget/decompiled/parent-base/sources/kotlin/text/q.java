package kotlin.text;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.text.p;

/* compiled from: Regex.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u001dR\u0014\u0010!\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\"¨\u0006$"}, d2 = {"Lkotlin/text/q;", "Lkotlin/text/p;", "Ljava/util/regex/Matcher;", "matcher", "", "input", "<init>", "(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V", "next", "()Lkotlin/text/p;", "a", "Ljava/util/regex/Matcher;", "b", "Ljava/lang/CharSequence;", "Lkotlin/text/n;", "c", "Lkotlin/text/n;", "d", "()Lkotlin/text/n;", "groups", "", "", "Ljava/util/List;", "groupValues_", "Ljava/util/regex/MatchResult;", "f", "()Ljava/util/regex/MatchResult;", "matchResult", "Lkotlin/ranges/l;", "()Lkotlin/ranges/l;", "range", "getValue", "()Ljava/lang/String;", "value", "()Ljava/util/List;", "groupValues", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class q implements p {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Matcher matcher;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final CharSequence input;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final n groups;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private List<String> groupValues_;

    /* compiled from: Regex.kt */
    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"kotlin/text/q$a", "Lkotlin/collections/c;", "", "", "index", "f", "(I)Ljava/lang/String;", "b", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.collections.c<String> {
        a() {
        }

        @Override // kotlin.collections.c, kotlin.collections.a
        /* renamed from: b */
        public int getSize() {
            return q.e(q.this).groupCount() + 1;
        }

        public /* bridge */ boolean c(String str) {
            return super.contains(str);
        }

        @Override // kotlin.collections.a, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return super.contains((String) obj);
            }
            return false;
        }

        @Override // kotlin.collections.c, java.util.List
        @fg.l
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public String get(int index) {
            String group = q.e(q.this).group(index);
            return group == null ? "" : group;
        }

        public /* bridge */ int h(String str) {
            return super.indexOf(str);
        }

        public /* bridge */ int i(String str) {
            return super.lastIndexOf(str);
        }

        @Override // kotlin.collections.c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return super.indexOf((String) obj);
            }
            return -1;
        }

        @Override // kotlin.collections.c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return super.lastIndexOf((String) obj);
            }
            return -1;
        }
    }

    public q(@fg.l Matcher matcher, @fg.l CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(matcher, ProtectedSandApp.s("蓙\u0001"));
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("蓚\u0001"));
        this.matcher = matcher;
        this.input = charSequence;
        this.groups = new b();
    }

    public static final MatchResult e(q qVar) {
        return qVar.matcher;
    }

    private final MatchResult f() {
        return this.matcher;
    }

    @Override // kotlin.text.p
    @fg.l
    public p.b a() {
        return new p.b(this);
    }

    @Override // kotlin.text.p
    @fg.l
    public List<String> b() {
        if (this.groupValues_ == null) {
            this.groupValues_ = new a();
        }
        List<String> list = this.groupValues_;
        kotlin.jvm.internal.l0.m(list);
        return list;
    }

    @Override // kotlin.text.p
    @fg.l
    public kotlin.ranges.l c() {
        kotlin.ranges.l i4;
        i4 = s.i(this.matcher);
        return i4;
    }

    @Override // kotlin.text.p
    @fg.l
    /* renamed from: d, reason: from getter */
    public n getGroups() {
        return this.groups;
    }

    @Override // kotlin.text.p
    @fg.l
    public String getValue() {
        String group = this.matcher.group();
        kotlin.jvm.internal.l0.o(group, ProtectedSandApp.s("蓛\u0001"));
        return group;
    }

    @Override // kotlin.text.p
    @fg.m
    public p next() {
        p f4;
        int end = this.matcher.end() + (this.matcher.end() == this.matcher.start() ? 1 : 0);
        if (end > this.input.length()) {
            return null;
        }
        Matcher matcher = this.matcher.pattern().matcher(this.input);
        kotlin.jvm.internal.l0.o(matcher, ProtectedSandApp.s("蓜\u0001"));
        f4 = s.f(matcher, end, this.input);
        return f4;
    }

    /* compiled from: Regex.kt */
    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0096\u0002¢\u0006\u0004\b\f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"kotlin/text/q$b", "Lkotlin/text/o;", "Lkotlin/collections/a;", "Lkotlin/text/m;", "", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "", "index", "get", "(I)Lkotlin/text/m;", "", "name", "(Ljava/lang/String;)Lkotlin/text/m;", "b", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends kotlin.collections.a<m> implements o {

        /* compiled from: Regex.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/text/m;", "a", "(I)Lkotlin/text/m;"}, k = 3, mv = {1, 9, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<Integer, m> {
            a() {
                super(1);
            }

            @fg.m
            public final m a(int i4) {
                return b.this.get(i4);
            }

            @Override // ld.l
            public m invoke(Integer num) {
                return b.this.get(num.intValue());
            }
        }

        b() {
        }

        @Override // kotlin.collections.a
        /* renamed from: b */
        public int getSize() {
            return q.e(q.this).groupCount() + 1;
        }

        public /* bridge */ boolean c(m mVar) {
            return super.contains(mVar);
        }

        @Override // kotlin.collections.a, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof m) {
                return super.contains((m) obj);
            }
            return false;
        }

        @Override // kotlin.text.n
        @fg.m
        public m get(int index) {
            kotlin.ranges.l j4;
            j4 = s.j(q.e(q.this), index);
            if (j4.c().intValue() < 0) {
                return null;
            }
            String group = q.e(q.this).group(index);
            kotlin.jvm.internal.l0.o(group, ProtectedSandApp.s("蓗\u0001"));
            return new m(group, j4);
        }

        @Override // kotlin.collections.a, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // kotlin.collections.a, java.util.Collection, java.lang.Iterable, java.util.List
        @fg.l
        public Iterator<m> iterator() {
            return kotlin.sequences.p.k1(kotlin.collections.w.A1(kotlin.collections.w.I(this)), new a()).iterator();
        }

        @Override // kotlin.text.o
        @fg.m
        public m get(@fg.l String name) {
            kotlin.jvm.internal.l0.p(name, ProtectedSandApp.s("蓘\u0001"));
            return kotlin.internal.m.f75110a.c(q.e(q.this), name);
        }
    }
}
