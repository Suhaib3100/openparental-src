package androidx.paging;

import androidx.paging.e0;
import androidx.paging.l0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.apache.http.HttpStatus;

/* compiled from: Separators.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00028\u00002\u00020\u0001B`\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012L\u0010\f\u001aH\b\u0001\u0012\u0015\u0012\u0013\u0018\u00018\u0001¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00018\u0001¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00020\u000f\"\b\b\u0002\u0010\u0003*\u00020\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017*\b\u0012\u0004\u0012\u00028\u00010\u0017¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001b\u001a\u00020\u001a\"\b\b\u0002\u0010\u0003*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010\u001d\u001a\u00020\u001a\"\b\b\u0002\u0010\u0003*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001cJ'\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00172\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u0017H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010 ¢\u0006\u0004\b!\u0010\"J'\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010#H\u0086@ø\u0001\u0000¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010&\u001a\u0004\b'\u0010(R`\u0010\f\u001aH\b\u0001\u0012\u0015\u0012\u0013\u0018\u00018\u0001¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00018\u0001¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R#\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000f0-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\"\u00107\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u00103\u001a\u0004\b)\u00104\"\u0004\b5\u00106R\"\u0010;\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00103\u001a\u0004\b9\u00104\"\u0004\b:\u00106R\u0017\u0010A\u001a\u00020<8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R$\u0010G\u001a\u0004\u0018\u00010B8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010C\u001a\u0004\b=\u0010D\"\u0004\bE\u0010FR\"\u0010O\u001a\u00020H8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010Q\u001a\u00020H8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010J\u001a\u0004\bI\u0010L\"\u0004\bP\u0010NR\"\u0010S\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u00103\u001a\u0004\b.\u00104\"\u0004\bR\u00106R\"\u0010U\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u00103\u001a\u0004\b8\u00104\"\u0004\bT\u00106\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006V"}, d2 = {"Landroidx/paging/k1;", "", "R", "T", "Landroidx/paging/s1;", "terminalSeparatorType", "Lkotlin/Function3;", "Lkotlin/r0;", "name", "before", "after", "Lkotlin/coroutines/d;", "generator", "<init>", "(Landroidx/paging/s1;Lld/q;)V", "Landroidx/paging/t1;", "originalPage", "z", "(Landroidx/paging/t1;)Landroidx/paging/t1;", "Landroidx/paging/l0;", "event", "n", "(Landroidx/paging/l0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/paging/l0$b;", "a", "(Landroidx/paging/l0$b;)Landroidx/paging/l0$b;", "", "y", "(Landroidx/paging/l0$b;Landroidx/paging/s1;)Z", "x", "o", "(Landroidx/paging/l0$b;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/paging/l0$a;", "m", "(Landroidx/paging/l0$a;)Landroidx/paging/l0$a;", "Landroidx/paging/l0$c;", "p", "(Landroidx/paging/l0$c;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/paging/s1;", "l", "()Landroidx/paging/s1;", "b", "Lld/q;", "d", "()Lld/q;", "", "c", "Ljava/util/List;", "g", "()Ljava/util/List;", "pageStash", "Z", "()Z", "q", "(Z)V", "endTerminalSeparatorDeferred", "e", "k", "w", "startTerminalSeparatorDeferred", "Landroidx/paging/j0;", "f", "Landroidx/paging/j0;", "j", "()Landroidx/paging/j0;", "sourceStates", "Landroidx/paging/f0;", "Landroidx/paging/f0;", "()Landroidx/paging/f0;", "t", "(Landroidx/paging/f0;)V", "mediatorStates", "", "h", "I", "i", "()I", "v", "(I)V", "placeholdersBefore", "u", "placeholdersAfter", "r", "footerAdded", "s", "headerAdded", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
final class k1<R, T extends R> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final s1 terminalSeparatorType;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.q<T, T, kotlin.coroutines.d<? super R>, Object> generator;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<t1<T>> pageStash;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean endTerminalSeparatorDeferred;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean startTerminalSeparatorDeferred;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final j0 sourceStates;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private f0 mediatorStates;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int placeholdersBefore;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int placeholdersAfter;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean footerAdded;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean headerAdded;

    /* compiled from: Separators.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31799a;

        static {
            int[] iArr = new int[s1.values().length];
            iArr[s1.FULLY_COMPLETE.ordinal()] = 1;
            iArr[s1.SOURCE_COMPLETE.ordinal()] = 2;
            f31799a = iArr;
        }
    }

    /* compiled from: Separators.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "R", "T", "Landroidx/paging/t1;", "stash", "", "<anonymous>", "(Landroidx/paging/t1;)Z"}, k = 3, mv = {1, 5, 1})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<t1<T>, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.ranges.l f31800b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlin.ranges.l lVar) {
            super(1);
            this.f31800b = lVar;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l t1<T> stash) {
            kotlin.jvm.internal.l0.p(stash, "stash");
            int[] k4 = stash.k();
            kotlin.ranges.l lVar = this.f31800b;
            int length = k4.length;
            boolean z4 = false;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    break;
                }
                if (lVar.r(k4[i4])) {
                    z4 = true;
                    break;
                }
                i4++;
            }
            return Boolean.valueOf(z4);
        }
    }

    /* compiled from: Separators.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.SeparatorState", f = "Separators.kt", i = {0, 1}, l = {213, 215}, m = "onEvent", n = {"this", "this"}, s = {"L$0", "L$0"})
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f31801b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f31802c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ k1<R, T> f31803d;

        /* renamed from: e, reason: collision with root package name */
        int f31804e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(k1<R, T> k1Var, kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
            this.f31803d = k1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f31802c = obj;
            this.f31804e |= Integer.MIN_VALUE;
            return this.f31803d.n(null, this);
        }
    }

    /* compiled from: Separators.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.SeparatorState", f = "Separators.kt", i = {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9}, l = {305, 368, 380, 386, 398, HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED, 429, 438, 451, 462}, m = "onInsert", n = {"this", "event", "this", "event", "outList", "stashOutList", "firstNonEmptyPage", "firstNonEmptyPageIndex", "lastNonEmptyPage", "lastNonEmptyPageIndex", "pageAfter", "eventTerminatesEnd", "eventEmpty", "this", "event", "outList", "stashOutList", "firstNonEmptyPage", "firstNonEmptyPageIndex", "lastNonEmptyPage", "lastNonEmptyPageIndex", "eventTerminatesEnd", "eventEmpty", "this", "event", "outList", "stashOutList", "firstNonEmptyPage", "firstNonEmptyPageIndex", "lastNonEmptyPage", "lastNonEmptyPageIndex", "lastStash", "eventTerminatesEnd", "eventEmpty", "this", "event", "outList", "stashOutList", "firstNonEmptyPageIndex", "lastNonEmptyPage", "lastNonEmptyPageIndex", "eventTerminatesEnd", "eventEmpty", "this", "event", "outList", "stashOutList", "lastNonEmptyPage", "lastNonEmptyPageIndex", "iterator$iv", "page", "pageBefore", "eventTerminatesEnd", "eventEmpty", "this", "event", "outList", "stashOutList", "lastNonEmptyPage", "lastNonEmptyPageIndex", "iterator$iv", "page", "pageBefore", "eventTerminatesEnd", "eventEmpty", "this", "event", "outList", "stashOutList", "lastNonEmptyPage", "lastNonEmptyPageIndex", "pageAfter", "eventTerminatesEnd", "eventEmpty", "this", "event", "outList", "stashOutList", "lastNonEmptyPage", "eventTerminatesEnd", "eventEmpty", "pageIndex", "this", "event", "outList", "stashOutList", "pageBefore"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "Z$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "Z$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "Z$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "Z$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "Z$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "Z$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "Z$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "Z$0", "I$0", "I$3", "L$0", "L$1", "L$2", "L$3", "L$4"})
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f31805b;

        /* renamed from: c, reason: collision with root package name */
        Object f31806c;

        /* renamed from: d, reason: collision with root package name */
        Object f31807d;

        /* renamed from: e, reason: collision with root package name */
        Object f31808e;

        /* renamed from: f, reason: collision with root package name */
        Object f31809f;

        /* renamed from: g, reason: collision with root package name */
        Object f31810g;

        /* renamed from: h, reason: collision with root package name */
        Object f31811h;

        /* renamed from: i, reason: collision with root package name */
        Object f31812i;

        /* renamed from: j, reason: collision with root package name */
        Object f31813j;

        /* renamed from: k, reason: collision with root package name */
        Object f31814k;

        /* renamed from: l, reason: collision with root package name */
        boolean f31815l;

        /* renamed from: m, reason: collision with root package name */
        int f31816m;

        /* renamed from: n, reason: collision with root package name */
        int f31817n;

        /* renamed from: o, reason: collision with root package name */
        int f31818o;

        /* renamed from: p, reason: collision with root package name */
        int f31819p;

        /* renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f31820q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ k1<R, T> f31821r;

        /* renamed from: s, reason: collision with root package name */
        int f31822s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(k1<R, T> k1Var, kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
            this.f31821r = k1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f31820q = obj;
            this.f31822s |= Integer.MIN_VALUE;
            return this.f31821r.o(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k1(@fg.l s1 terminalSeparatorType, @fg.l ld.q<? super T, ? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> generator) {
        kotlin.jvm.internal.l0.p(terminalSeparatorType, "terminalSeparatorType");
        kotlin.jvm.internal.l0.p(generator, "generator");
        this.terminalSeparatorType = terminalSeparatorType;
        this.generator = generator;
        this.pageStash = new ArrayList();
        this.sourceStates = new j0();
    }

    private final <T> t1<T> z(t1<T> originalPage) {
        Integer num;
        int[] k4 = originalPage.k();
        List O = kotlin.collections.w.O(kotlin.collections.w.B2(originalPage.h()), kotlin.collections.w.p3(originalPage.h()));
        int j4 = originalPage.j();
        List<Integer> i4 = originalPage.i();
        int i5 = 0;
        if (i4 != null && (num = (Integer) kotlin.collections.w.B2(i4)) != null) {
            i5 = num.intValue();
        }
        Integer valueOf = Integer.valueOf(i5);
        List<Integer> i6 = originalPage.i();
        Integer num2 = i6 == null ? null : (Integer) kotlin.collections.w.p3(i6);
        return new t1<>(k4, O, j4, kotlin.collections.w.O(valueOf, Integer.valueOf(num2 == null ? kotlin.collections.w.J(originalPage.h()) : num2.intValue())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.l
    public final l0.b<R> a(@fg.l l0.b<T> bVar) {
        kotlin.jvm.internal.l0.p(bVar, "<this>");
        return bVar;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getEndTerminalSeparatorDeferred() {
        return this.endTerminalSeparatorDeferred;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getFooterAdded() {
        return this.footerAdded;
    }

    @fg.l
    public final ld.q<T, T, kotlin.coroutines.d<? super R>, Object> d() {
        return this.generator;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getHeaderAdded() {
        return this.headerAdded;
    }

    @fg.m
    /* renamed from: f, reason: from getter */
    public final f0 getMediatorStates() {
        return this.mediatorStates;
    }

    @fg.l
    public final List<t1<T>> g() {
        return this.pageStash;
    }

    /* renamed from: h, reason: from getter */
    public final int getPlaceholdersAfter() {
        return this.placeholdersAfter;
    }

    /* renamed from: i, reason: from getter */
    public final int getPlaceholdersBefore() {
        return this.placeholdersBefore;
    }

    @fg.l
    /* renamed from: j, reason: from getter */
    public final j0 getSourceStates() {
        return this.sourceStates;
    }

    /* renamed from: k, reason: from getter */
    public final boolean getStartTerminalSeparatorDeferred() {
        return this.startTerminalSeparatorDeferred;
    }

    @fg.l
    /* renamed from: l, reason: from getter */
    public final s1 getTerminalSeparatorType() {
        return this.terminalSeparatorType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.l
    public final l0.a<R> m(@fg.l l0.a<T> event) {
        kotlin.jvm.internal.l0.p(event, "event");
        j0 j0Var = this.sourceStates;
        g0 m4 = event.m();
        e0.c.INSTANCE.getClass();
        j0Var.f(m4, e0.c.f31663d);
        g0 m5 = event.m();
        g0 g0Var = g0.PREPEND;
        if (m5 == g0Var) {
            this.placeholdersBefore = event.q();
            this.headerAdded = false;
        } else if (event.m() == g0.APPEND) {
            this.placeholdersAfter = event.q();
            this.footerAdded = false;
        }
        if (this.pageStash.isEmpty()) {
            if (event.m() == g0Var) {
                this.startTerminalSeparatorDeferred = false;
            } else {
                this.endTerminalSeparatorDeferred = false;
            }
        }
        kotlin.collections.w.L0(this.pageStash, new b(new kotlin.ranges.l(event.o(), event.n(), 1)));
        return event;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(@fg.l androidx.paging.l0<T> r6, @fg.l kotlin.coroutines.d<? super androidx.paging.l0<R>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.paging.k1.c
            if (r0 == 0) goto L13
            r0 = r7
            androidx.paging.k1$c r0 = (androidx.paging.k1.c) r0
            int r1 = r0.f31804e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31804e = r1
            goto L18
        L13:
            androidx.paging.k1$c r0 = new androidx.paging.k1$c
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f31802c
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f31804e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r6 = r0.f31801b
            androidx.paging.k1 r6 = (androidx.paging.k1) r6
            kotlin.a1.n(r7)
            goto L74
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            java.lang.Object r6 = r0.f31801b
            androidx.paging.k1 r6 = (androidx.paging.k1) r6
            kotlin.a1.n(r7)
            goto L53
        L3e:
            kotlin.a1.n(r7)
            boolean r7 = r6 instanceof androidx.paging.l0.b
            if (r7 == 0) goto L56
            androidx.paging.l0$b r6 = (androidx.paging.l0.b) r6
            r0.f31801b = r5
            r0.f31804e = r4
            java.lang.Object r7 = r5.o(r6, r0)
            if (r7 != r1) goto L52
            return r1
        L52:
            r6 = r5
        L53:
            androidx.paging.l0 r7 = (androidx.paging.l0) r7
            goto L76
        L56:
            boolean r7 = r6 instanceof androidx.paging.l0.a
            if (r7 == 0) goto L62
            androidx.paging.l0$a r6 = (androidx.paging.l0.a) r6
            androidx.paging.l0$a r7 = r5.m(r6)
            r6 = r5
            goto L76
        L62:
            boolean r7 = r6 instanceof androidx.paging.l0.c
            if (r7 == 0) goto La1
            androidx.paging.l0$c r6 = (androidx.paging.l0.c) r6
            r0.f31801b = r5
            r0.f31804e = r3
            java.lang.Object r7 = r5.p(r6, r0)
            if (r7 != r1) goto L73
            return r1
        L73:
            r6 = r5
        L74:
            androidx.paging.l0 r7 = (androidx.paging.l0) r7
        L76:
            boolean r0 = r6.endTerminalSeparatorDeferred
            if (r0 == 0) goto L8b
            java.util.List<androidx.paging.t1<T extends R>> r0 = r6.pageStash
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L83
            goto L8b
        L83:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "deferred endTerm, page stash should be empty"
            r6.<init>(r7)
            throw r6
        L8b:
            boolean r0 = r6.startTerminalSeparatorDeferred
            if (r0 == 0) goto La0
            java.util.List<androidx.paging.t1<T extends R>> r6 = r6.pageStash
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L98
            goto La0
        L98:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "deferred startTerm, page stash should be empty"
            r6.<init>(r7)
            throw r6
        La0:
            return r7
        La1:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.k1.n(androidx.paging.l0, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x07b2  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0567 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0813  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x047d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x07ba  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x081e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0847  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x084d  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x087b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0829  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0815  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x07a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x07c2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x07a7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0799 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x079a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x072b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0756  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x07aa  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0735  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0723  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x069d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x062d  */
    /* JADX WARN: Type inference failed for: r1v50, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:152:0x047e -> B:136:0x0487). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x079a -> B:29:0x079b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x069e -> B:64:0x06a1). Please report as a decompilation issue!!! */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(@fg.l androidx.paging.l0.b<T> r31, @fg.l kotlin.coroutines.d<? super androidx.paging.l0.b<R>> r32) {
        /*
            Method dump skipped, instructions count: 2206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.k1.o(androidx.paging.l0$b, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.m
    public final Object p(@fg.l l0.c<T> cVar, @fg.l kotlin.coroutines.d<? super l0<R>> dVar) {
        f0 f0Var = this.mediatorStates;
        if (kotlin.jvm.internal.l0.g(this.sourceStates.j(), cVar.l()) && kotlin.jvm.internal.l0.g(f0Var, cVar.k())) {
            return cVar;
        }
        this.sourceStates.e(cVar.l());
        this.mediatorStates = cVar.k();
        if (cVar.k() != null && cVar.k().j().getEndOfPaginationReached()) {
            if (!kotlin.jvm.internal.l0.g(f0Var == null ? null : f0Var.j(), cVar.k().j())) {
                return o(l0.b.INSTANCE.c(kotlin.collections.j0.f74919b, this.placeholdersBefore, cVar.l(), cVar.k()), dVar);
            }
        }
        if (cVar.k() == null || !cVar.k().i().getEndOfPaginationReached()) {
            return cVar;
        }
        return !kotlin.jvm.internal.l0.g(f0Var != null ? f0Var.i() : null, cVar.k().i()) ? o(l0.b.INSTANCE.a(kotlin.collections.j0.f74919b, this.placeholdersAfter, cVar.l(), cVar.k()), dVar) : cVar;
    }

    public final void q(boolean z4) {
        this.endTerminalSeparatorDeferred = z4;
    }

    public final void r(boolean z4) {
        this.footerAdded = z4;
    }

    public final void s(boolean z4) {
        this.headerAdded = z4;
    }

    public final void t(@fg.m f0 f0Var) {
        this.mediatorStates = f0Var;
    }

    public final void u(int i4) {
        this.placeholdersAfter = i4;
    }

    public final void v(int i4) {
        this.placeholdersBefore = i4;
    }

    public final void w(boolean z4) {
        this.startTerminalSeparatorDeferred = z4;
    }

    public final <T> boolean x(@fg.l l0.b<T> bVar, @fg.l s1 terminalSeparatorType) {
        f0 q4;
        e0 i4;
        kotlin.jvm.internal.l0.p(bVar, "<this>");
        kotlin.jvm.internal.l0.p(terminalSeparatorType, "terminalSeparatorType");
        if (bVar.p() == g0.PREPEND) {
            return this.endTerminalSeparatorDeferred;
        }
        int i5 = a.f31799a[terminalSeparatorType.ordinal()];
        if (i5 == 1) {
            return bVar.u().i().getEndOfPaginationReached() && ((q4 = bVar.q()) == null || (i4 = q4.i()) == null || i4.getEndOfPaginationReached());
        }
        if (i5 == 2) {
            return bVar.u().i().getEndOfPaginationReached();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final <T> boolean y(@fg.l l0.b<T> bVar, @fg.l s1 terminalSeparatorType) {
        f0 q4;
        e0 j4;
        kotlin.jvm.internal.l0.p(bVar, "<this>");
        kotlin.jvm.internal.l0.p(terminalSeparatorType, "terminalSeparatorType");
        if (bVar.p() == g0.APPEND) {
            return this.startTerminalSeparatorDeferred;
        }
        int i4 = a.f31799a[terminalSeparatorType.ordinal()];
        if (i4 == 1) {
            return bVar.u().j().getEndOfPaginationReached() && ((q4 = bVar.q()) == null || (j4 = q4.j()) == null || j4.getEndOfPaginationReached());
        }
        if (i4 == 2) {
            return bVar.u().j().getEndOfPaginationReached();
        }
        throw new NoWhenBranchMatchedException();
    }
}
