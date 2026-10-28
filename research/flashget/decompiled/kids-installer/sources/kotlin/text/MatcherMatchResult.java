package kotlin.text;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.collections.AbstractCollection;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import kotlin.text.MatchResult;

/* compiled from: Regex.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\n\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lkotlin/text/MatcherMatchResult;", "Lkotlin/text/MatchResult;", "matcher", "Ljava/util/regex/Matcher;", "input", "", "(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V", "groupValues", "", "", "getGroupValues", "()Ljava/util/List;", "groupValues_", "groups", "Lkotlin/text/MatchGroupCollection;", "getGroups", "()Lkotlin/text/MatchGroupCollection;", "matchResult", "Ljava/util/regex/MatchResult;", "getMatchResult", "()Ljava/util/regex/MatchResult;", "range", "Lkotlin/ranges/IntRange;", "getRange", "()Lkotlin/ranges/IntRange;", "value", "getValue", "()Ljava/lang/String;", "next", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.text.q, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
final class MatcherMatchResult implements MatchResult {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final Matcher f27152a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final CharSequence f27153b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final MatchGroupCollection f27154c;

    /* renamed from: d, reason: collision with root package name */
    @d5.e
    private List<String> f27155d;

    /* compiled from: Regex.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004H\u0096\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"kotlin/text/MatcherMatchResult$groupValues$1", "Lkotlin/collections/AbstractList;", "", "size", "", "getSize", "()I", "get", "index", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.text.q$a */
    /* loaded from: classes6.dex */
    public static final class a extends AbstractList<String> {
        a() {
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        /* renamed from: b */
        public int getF23147s() {
            return MatcherMatchResult.e(MatcherMatchResult.this).groupCount() + 1;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return super.contains((String) obj);
            }
            return false;
        }

        public /* bridge */ boolean f(String str) {
            return super.contains(str);
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        @d5.d
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public String get(int i5) {
            String group = MatcherMatchResult.e(MatcherMatchResult.this).group(i5);
            return group == null ? "" : group;
        }

        public /* bridge */ int h(String str) {
            return super.indexOf(str);
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return super.indexOf((String) obj);
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return super.lastIndexOf((String) obj);
            }
            return -1;
        }

        public /* bridge */ int p(String str) {
            return super.lastIndexOf(str);
        }
    }

    /* compiled from: Regex.kt */
    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\u0005H\u0096\u0002J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\u0011\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000fH\u0096\u0002R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"kotlin/text/MatcherMatchResult$groups$1", "Lkotlin/text/MatchNamedGroupCollection;", "Lkotlin/collections/AbstractCollection;", "Lkotlin/text/MatchGroup;", "size", "", "getSize", "()I", "get", "index", "name", "", "isEmpty", "", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.text.q$b */
    /* loaded from: classes6.dex */
    public static final class b extends AbstractCollection<MatchGroup> implements MatchNamedGroupCollection {

        /* compiled from: Regex.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lkotlin/text/MatchGroup;", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlin.text.q$b$a */
        static final class a extends Lambda implements q3.l<Integer, MatchGroup> {
            a() {
                super(1);
            }

            @Override // q3.l
            public /* bridge */ /* synthetic */ MatchGroup N(Integer num) {
                return a(num.intValue());
            }

            @d5.e
            public final MatchGroup a(int i5) {
                return b.this.get(i5);
            }
        }

        b() {
        }

        @Override // kotlin.collections.AbstractCollection
        /* renamed from: b */
        public int getF23147s() {
            return MatcherMatchResult.e(MatcherMatchResult.this).groupCount() + 1;
        }

        @Override // kotlin.text.MatchNamedGroupCollection
        @d5.e
        public MatchGroup c(@d5.d String str) {
            kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("逝"));
            return kotlin.internal.m.f23351a.c(MatcherMatchResult.e(MatcherMatchResult.this), str);
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof MatchGroup) {
                return super.contains((MatchGroup) obj);
            }
            return false;
        }

        public /* bridge */ boolean f(MatchGroup matchGroup) {
            return super.contains(matchGroup);
        }

        @Override // kotlin.text.MatchGroupCollection
        @d5.e
        public MatchGroup get(int i5) {
            IntRange j5;
            j5 = s.j(MatcherMatchResult.e(MatcherMatchResult.this), i5);
            if (j5.f().intValue() < 0) {
                return null;
            }
            String group = MatcherMatchResult.e(MatcherMatchResult.this).group(i5);
            kotlin.jvm.internal.l0.o(group, ProtectedSandApp.s("逞"));
            return new MatchGroup(group, j5);
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable
        @d5.d
        public Iterator<MatchGroup> iterator() {
            IntRange I;
            Sequence A1;
            Sequence k12;
            I = kotlin.collections.a0.I(this);
            A1 = kotlin.collections.j0.A1(I);
            k12 = kotlin.sequences.v.k1(A1, new a());
            return k12.iterator();
        }
    }

    public MatcherMatchResult(@d5.d Matcher matcher, @d5.d CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(matcher, ProtectedSandApp.s("官"));
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("宙"));
        this.f27152a = matcher;
        this.f27153b = charSequence;
        this.f27154c = new b();
    }

    public static final MatchResult e(MatcherMatchResult matcherMatchResult) {
        return matcherMatchResult.f27152a;
    }

    private final MatchResult f() {
        return this.f27152a;
    }

    @Override // kotlin.text.MatchResult
    @d5.d
    public MatchResult.b a() {
        return new MatchResult.b(this);
    }

    @Override // kotlin.text.MatchResult
    @d5.d
    public List<String> b() {
        if (this.f27155d == null) {
            this.f27155d = new a();
        }
        List<String> list = this.f27155d;
        kotlin.jvm.internal.l0.m(list);
        return list;
    }

    @Override // kotlin.text.MatchResult
    @d5.d
    /* renamed from: c, reason: from getter */
    public MatchGroupCollection getF27154c() {
        return this.f27154c;
    }

    @Override // kotlin.text.MatchResult
    @d5.d
    public IntRange d() {
        IntRange i5;
        i5 = s.i(this.f27152a);
        return i5;
    }

    @Override // kotlin.text.MatchResult
    @d5.d
    public String getValue() {
        String group = this.f27152a.group();
        kotlin.jvm.internal.l0.o(group, ProtectedSandApp.s("定"));
        return group;
    }

    @Override // kotlin.text.MatchResult
    @d5.e
    public MatchResult next() {
        MatchResult f6;
        int end = this.f27152a.end() + (this.f27152a.end() == this.f27152a.start() ? 1 : 0);
        if (end > this.f27153b.length()) {
            return null;
        }
        Matcher matcher = this.f27152a.pattern().matcher(this.f27153b);
        kotlin.jvm.internal.l0.o(matcher, ProtectedSandApp.s("宛"));
        f6 = s.f(matcher, end, this.f27153b);
        return f6;
    }
}
