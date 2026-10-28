package androidx.paging;

import androidx.paging.b1;
import androidx.paging.e0;
import androidx.paging.l0;
import androidx.paging.w1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.k2;
import kotlinx.coroutines.flow.t;

/* compiled from: PageFetcherSnapshotState.kt */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0001(B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\r¢\u0006\u0004\b\u0010\u0010\u000fJ-\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00112\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0013\u0010\u0014J3\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0011H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010!\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u001a2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J%\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010%2\b\u0010$\u001a\u0004\u0018\u00010#H\u0000¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R&\u0010-\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00110*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R,\u00102\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00110.8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u00101R$\u00108\u001a\u00020\n2\u0006\u00103\u001a\u00020\n8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0016\u00109\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u00105R\u0016\u0010:\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u00105R\u0016\u0010;\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u00105R\u0016\u0010<\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00105R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020\n0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010>R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\n0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010>R&\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001f0A8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bB\u0010DR$\u0010J\u001a\u00020F2\u0006\u00103\u001a\u00020F8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b6\u0010G\u001a\u0004\bH\u0010IR\u0014\u0010L\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bK\u00107R$\u0010Q\u001a\u00020\n2\u0006\u0010M\u001a\u00020\n8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\bN\u00107\"\u0004\bO\u0010PR$\u0010T\u001a\u00020\n2\u0006\u0010M\u001a\u00020\n8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\bR\u00107\"\u0004\bS\u0010P¨\u0006U"}, d2 = {"Landroidx/paging/p0;", "", "Key", "Value", "Landroidx/paging/x0;", "config", "<init>", "(Landroidx/paging/x0;)V", "Landroidx/paging/g0;", "loadType", "", "j", "(Landroidx/paging/g0;)I", "Lkotlinx/coroutines/flow/i;", "f", "()Lkotlinx/coroutines/flow/i;", "e", "Landroidx/paging/b1$b$c;", "Landroidx/paging/l0;", "u", "(Landroidx/paging/b1$b$c;Landroidx/paging/g0;)Landroidx/paging/l0;", "loadId", "page", "", "r", "(ILandroidx/paging/g0;Landroidx/paging/b1$b$c;)Z", "Landroidx/paging/l0$a;", "event", "Lkotlin/k2;", "h", "(Landroidx/paging/l0$a;)V", "Landroidx/paging/w1;", "hint", "i", "(Landroidx/paging/g0;Landroidx/paging/w1;)Landroidx/paging/l0$a;", "Landroidx/paging/w1$a;", "viewportHint", "Landroidx/paging/d1;", "g", "(Landroidx/paging/w1$a;)Landroidx/paging/d1;", "a", "Landroidx/paging/x0;", "", "b", "Ljava/util/List;", "_pages", "", "c", "m", "()Ljava/util/List;", "pages", "<set-?>", "d", "I", "l", "()I", "initialPageIndex", "_placeholdersBefore", "_placeholdersAfter", "prependGenerationId", "appendGenerationId", "Lkotlinx/coroutines/channels/l;", "Lkotlinx/coroutines/channels/l;", "prependGenerationIdCh", "appendGenerationIdCh", "", "k", "Ljava/util/Map;", "()Ljava/util/Map;", "failedHintsByLoadType", "Landroidx/paging/j0;", "Landroidx/paging/j0;", "p", "()Landroidx/paging/j0;", "sourceLoadStates", "q", "storageCount", "value", "o", "t", "(I)V", "placeholdersBefore", "n", "s", "placeholdersAfter", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class p0<Key, Value> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final x0 config;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<b1.b.c<Key, Value>> _pages;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<b1.b.c<Key, Value>> pages;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int initialPageIndex;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int _placeholdersBefore;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int _placeholdersAfter;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int prependGenerationId;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int appendGenerationId;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.channels.l<Integer> prependGenerationIdCh;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.channels.l<Integer> appendGenerationIdCh;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Map<g0, w1> failedHintsByLoadType;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private j0 sourceLoadStates;

    /* compiled from: PageFetcherSnapshotState.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JH\u0010\u000f\u001a\u00028\u0004\"\u0004\b\u0004\u0010\b2-\u0010\u000e\u001a)\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00028\u00040\tH\u0086Hø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Landroidx/paging/p0$a;", "", "Key", "Value", "Landroidx/paging/x0;", "config", "<init>", "(Landroidx/paging/x0;)V", "T", "Lkotlin/Function1;", "Landroidx/paging/p0;", "Lkotlin/r0;", "name", "state", "block", "c", "(Lld/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "a", "Landroidx/paging/x0;", "Lkotlinx/coroutines/sync/a;", "b", "Lkotlinx/coroutines/sync/a;", "lock", "Landroidx/paging/p0;", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a<Key, Value> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final x0 config;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final kotlinx.coroutines.sync.a lock;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final p0<Key, Value> state;

        /* compiled from: PageFetcherSnapshotState.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshotState$Holder", f = "PageFetcherSnapshotState.kt", i = {0, 0, 0}, l = {403}, m = "withLock", n = {"this", "block", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2"})
        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        /* renamed from: androidx.paging.p0$a$a, reason: collision with other inner class name */
        static final class C0559a<T> extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            Object f32179b;

            /* renamed from: c, reason: collision with root package name */
            Object f32180c;

            /* renamed from: d, reason: collision with root package name */
            Object f32181d;

            /* renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f32182e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ a<Key, Value> f32183f;

            /* renamed from: g, reason: collision with root package name */
            int f32184g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0559a(a<Key, Value> aVar, kotlin.coroutines.d<? super C0559a> dVar) {
                super(dVar);
                this.f32183f = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f32182e = obj;
                this.f32184g |= Integer.MIN_VALUE;
                return this.f32183f.c(null, this);
            }
        }

        public a(@fg.l x0 config) {
            kotlin.jvm.internal.l0.p(config, "config");
            this.config = config;
            this.lock = kotlinx.coroutines.sync.c.b(false, 1, null);
            this.state = new p0<>(config, null);
        }

        private final <T> Object d(ld.l<? super p0<Key, Value>, ? extends T> lVar, kotlin.coroutines.d<? super T> dVar) {
            kotlinx.coroutines.sync.a aVar = this.lock;
            aVar.f(null, dVar);
            try {
                return lVar.invoke(this.state);
            } finally {
                aVar.g(null);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final <T> java.lang.Object c(@fg.l ld.l<? super androidx.paging.p0<Key, Value>, ? extends T> r6, @fg.l kotlin.coroutines.d<? super T> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof androidx.paging.p0.a.C0559a
                if (r0 == 0) goto L13
                r0 = r7
                androidx.paging.p0$a$a r0 = (androidx.paging.p0.a.C0559a) r0
                int r1 = r0.f32184g
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f32184g = r1
                goto L18
            L13:
                androidx.paging.p0$a$a r0 = new androidx.paging.p0$a$a
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f32182e
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r2 = r0.f32184g
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L3e
                if (r2 != r3) goto L36
                java.lang.Object r6 = r0.f32181d
                kotlinx.coroutines.sync.a r6 = (kotlinx.coroutines.sync.a) r6
                java.lang.Object r1 = r0.f32180c
                ld.l r1 = (ld.l) r1
                java.lang.Object r0 = r0.f32179b
                androidx.paging.p0$a r0 = (androidx.paging.p0.a) r0
                kotlin.a1.n(r7)
                r7 = r6
                r6 = r1
                goto L53
            L36:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L3e:
                kotlin.a1.n(r7)
                kotlinx.coroutines.sync.a r7 = r5.lock
                r0.f32179b = r5
                r0.f32180c = r6
                r0.f32181d = r7
                r0.f32184g = r3
                java.lang.Object r0 = r7.f(r4, r0)
                if (r0 != r1) goto L52
                return r1
            L52:
                r0 = r5
            L53:
                androidx.paging.p0<Key, Value> r0 = r0.state     // Catch: java.lang.Throwable -> L5d
                java.lang.Object r6 = r6.invoke(r0)     // Catch: java.lang.Throwable -> L5d
                r7.g(r4)
                return r6
            L5d:
                r6 = move-exception
                r7.g(r4)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.p0.a.c(ld.l, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* compiled from: PageFetcherSnapshotState.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32185a;

        static {
            int[] iArr = new int[g0.values().length];
            iArr[g0.REFRESH.ordinal()] = 1;
            iArr[g0.PREPEND.ordinal()] = 2;
            iArr[g0.APPEND.ordinal()] = 3;
            f32185a = iArr;
        }
    }

    /* compiled from: PageFetcherSnapshotState.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1", f = "PageFetcherSnapshotState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Lkotlinx/coroutines/flow/j;", "", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 5, 1})
    static final class c extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.flow.j<? super Integer>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f32186b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ p0<Key, Value> f32187c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(p0<Key, Value> p0Var, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f32187c = p0Var;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.flow.j<? super Integer> jVar, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((c) create(jVar, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new c(this.f32187c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f32186b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a1.n(obj);
            ((p0) this.f32187c).appendGenerationIdCh.M(new Integer(((p0) this.f32187c).appendGenerationId));
            return k2.f75408a;
        }
    }

    /* compiled from: PageFetcherSnapshotState.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshotState$consumePrependGenerationIdAsFlow$1", f = "PageFetcherSnapshotState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Lkotlinx/coroutines/flow/j;", "", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 5, 1})
    static final class d extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.flow.j<? super Integer>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f32188b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ p0<Key, Value> f32189c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(p0<Key, Value> p0Var, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f32189c = p0Var;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.flow.j<? super Integer> jVar, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((d) create(jVar, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new d(this.f32189c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f32188b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a1.n(obj);
            ((p0) this.f32189c).prependGenerationIdCh.M(new Integer(((p0) this.f32189c).prependGenerationId));
            return k2.f75408a;
        }
    }

    public /* synthetic */ p0(x0 x0Var, kotlin.jvm.internal.w wVar) {
        this(x0Var);
    }

    @fg.l
    public final kotlinx.coroutines.flow.i<Integer> e() {
        return new t.e(new c(this, null), kotlinx.coroutines.flow.k.X(this.appendGenerationIdCh));
    }

    @fg.l
    public final kotlinx.coroutines.flow.i<Integer> f() {
        return new t.e(new d(this, null), kotlinx.coroutines.flow.k.X(this.prependGenerationIdCh));
    }

    @fg.l
    public final d1<Key, Value> g(@fg.m w1.a viewportHint) {
        Integer valueOf;
        List V5 = kotlin.collections.w.V5(this.pages);
        if (viewportHint == null) {
            valueOf = null;
        } else {
            int o4 = o();
            int i4 = -this.initialPageIndex;
            int J = kotlin.collections.w.J(this.pages) - this.initialPageIndex;
            int pageOffset = viewportHint.getPageOffset();
            if (i4 < pageOffset) {
                int i5 = i4;
                while (true) {
                    int i6 = i5 + 1;
                    o4 += i5 > J ? this.config.pageSize : this.pages.get(i5 + this.initialPageIndex).i().size();
                    if (i6 >= pageOffset) {
                        break;
                    }
                    i5 = i6;
                }
            }
            int indexInPage = viewportHint.getIndexInPage() + o4;
            if (viewportHint.getPageOffset() < i4) {
                indexInPage -= this.config.pageSize;
            }
            valueOf = Integer.valueOf(indexInPage);
        }
        return new d1<>(V5, valueOf, this.config, o());
    }

    public final void h(@fg.l l0.a<Value> event) {
        kotlin.jvm.internal.l0.p(event, "event");
        if (!(event.p() <= this.pages.size())) {
            throw new IllegalStateException(("invalid drop count. have " + this.pages.size() + " but wanted to drop " + event.p()).toString());
        }
        this.failedHintsByLoadType.remove(event.m());
        j0 j0Var = this.sourceLoadStates;
        g0 m4 = event.m();
        e0.c.INSTANCE.getClass();
        j0Var.f(m4, e0.c.f31663d);
        int i4 = b.f32185a[event.m().ordinal()];
        if (i4 != 2) {
            if (i4 != 3) {
                throw new IllegalArgumentException(kotlin.jvm.internal.l0.C("cannot drop ", event.m()));
            }
            int p4 = event.p();
            for (int i5 = 0; i5 < p4; i5++) {
                this._pages.remove(this.pages.size() - 1);
            }
            s(event.q());
            int i6 = this.appendGenerationId + 1;
            this.appendGenerationId = i6;
            this.appendGenerationIdCh.M(Integer.valueOf(i6));
            return;
        }
        int p5 = event.p();
        for (int i7 = 0; i7 < p5; i7++) {
            this._pages.remove(0);
        }
        this.initialPageIndex -= event.p();
        t(event.q());
        int i10 = this.prependGenerationId + 1;
        this.prependGenerationId = i10;
        this.prependGenerationIdCh.M(Integer.valueOf(i10));
    }

    @fg.m
    public final l0.a<Value> i(@fg.l g0 loadType, @fg.l w1 hint) {
        int size;
        kotlin.jvm.internal.l0.p(loadType, "loadType");
        kotlin.jvm.internal.l0.p(hint, "hint");
        l0.a<Value> aVar = null;
        if (this.config.maxSize == Integer.MAX_VALUE || this.pages.size() <= 2 || q() <= this.config.maxSize) {
            return null;
        }
        int i4 = 0;
        if (!(loadType != g0.REFRESH)) {
            throw new IllegalArgumentException(kotlin.jvm.internal.l0.C("Drop LoadType must be PREPEND or APPEND, but got ", loadType).toString());
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < this.pages.size() && q() - i6 > this.config.maxSize) {
            int[] iArr = b.f32185a;
            if (iArr[loadType.ordinal()] == 2) {
                size = this.pages.get(i5).i().size();
            } else {
                List<b1.b.c<Key, Value>> list = this.pages;
                size = list.get(kotlin.collections.w.J(list) - i5).i().size();
            }
            if (((iArr[loadType.ordinal()] == 2 ? hint.getPresentedItemsBefore() : hint.getPresentedItemsAfter()) - i6) - size < this.config.prefetchDistance) {
                break;
            }
            i6 += size;
            i5++;
        }
        if (i5 != 0) {
            int[] iArr2 = b.f32185a;
            int J = iArr2[loadType.ordinal()] == 2 ? -this.initialPageIndex : (kotlin.collections.w.J(this.pages) - this.initialPageIndex) - (i5 - 1);
            int J2 = iArr2[loadType.ordinal()] == 2 ? (i5 - 1) - this.initialPageIndex : kotlin.collections.w.J(this.pages) - this.initialPageIndex;
            if (this.config.enablePlaceholders) {
                i4 = (loadType == g0.PREPEND ? o() : n()) + i6;
            }
            aVar = new l0.a<>(loadType, J, J2, i4);
        }
        return aVar;
    }

    public final int j(@fg.l g0 loadType) {
        kotlin.jvm.internal.l0.p(loadType, "loadType");
        int i4 = b.f32185a[loadType.ordinal()];
        if (i4 == 1) {
            throw new IllegalArgumentException("Cannot get loadId for loadType: REFRESH");
        }
        if (i4 == 2) {
            return this.prependGenerationId;
        }
        if (i4 == 3) {
            return this.appendGenerationId;
        }
        throw new NoWhenBranchMatchedException();
    }

    @fg.l
    public final Map<g0, w1> k() {
        return this.failedHintsByLoadType;
    }

    /* renamed from: l, reason: from getter */
    public final int getInitialPageIndex() {
        return this.initialPageIndex;
    }

    @fg.l
    public final List<b1.b.c<Key, Value>> m() {
        return this.pages;
    }

    public final int n() {
        if (this.config.enablePlaceholders) {
            return this._placeholdersAfter;
        }
        return 0;
    }

    public final int o() {
        if (this.config.enablePlaceholders) {
            return this._placeholdersBefore;
        }
        return 0;
    }

    @fg.l
    /* renamed from: p, reason: from getter */
    public final j0 getSourceLoadStates() {
        return this.sourceLoadStates;
    }

    public final int q() {
        Iterator<T> it = this.pages.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 += ((b1.b.c) it.next()).i().size();
        }
        return i4;
    }

    @androidx.annotation.j
    public final boolean r(int loadId, @fg.l g0 loadType, @fg.l b1.b.c<Key, Value> page) {
        kotlin.jvm.internal.l0.p(loadType, "loadType");
        kotlin.jvm.internal.l0.p(page, "page");
        int i4 = b.f32185a[loadType.ordinal()];
        int i5 = 0;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3) {
                    if (this.pages.isEmpty()) {
                        throw new IllegalStateException("should've received an init before append");
                    }
                    if (loadId != this.appendGenerationId) {
                        return false;
                    }
                    this._pages.add(page);
                    if (page.j() == Integer.MIN_VALUE) {
                        int n4 = n() - page.i().size();
                        if (n4 >= 0) {
                            i5 = n4;
                        }
                    } else {
                        i5 = page.j();
                    }
                    s(i5);
                    this.failedHintsByLoadType.remove(g0.APPEND);
                }
            } else {
                if (this.pages.isEmpty()) {
                    throw new IllegalStateException("should've received an init before prepend");
                }
                if (loadId != this.prependGenerationId) {
                    return false;
                }
                this._pages.add(0, page);
                this.initialPageIndex++;
                if (page.k() == Integer.MIN_VALUE) {
                    int o4 = o() - page.i().size();
                    if (o4 >= 0) {
                        i5 = o4;
                    }
                } else {
                    i5 = page.k();
                }
                t(i5);
                this.failedHintsByLoadType.remove(g0.PREPEND);
            }
        } else {
            if (!this.pages.isEmpty()) {
                throw new IllegalStateException("cannot receive multiple init calls");
            }
            if (!(loadId == 0)) {
                throw new IllegalStateException("init loadId must be the initial value, 0");
            }
            this._pages.add(page);
            this.initialPageIndex = 0;
            s(page.j());
            t(page.k());
        }
        return true;
    }

    public final void s(int i4) {
        if (i4 == Integer.MIN_VALUE) {
            i4 = 0;
        }
        this._placeholdersAfter = i4;
    }

    public final void t(int i4) {
        if (i4 == Integer.MIN_VALUE) {
            i4 = 0;
        }
        this._placeholdersBefore = i4;
    }

    @fg.l
    public final l0<Value> u(@fg.l b1.b.c<Key, Value> cVar, @fg.l g0 loadType) {
        kotlin.jvm.internal.l0.p(cVar, "<this>");
        kotlin.jvm.internal.l0.p(loadType, "loadType");
        int[] iArr = b.f32185a;
        int i4 = iArr[loadType.ordinal()];
        int i5 = 0;
        if (i4 != 1) {
            if (i4 == 2) {
                i5 = 0 - this.initialPageIndex;
            } else {
                if (i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i5 = (this.pages.size() - this.initialPageIndex) - 1;
            }
        }
        List k4 = kotlin.collections.w.k(new t1(i5, cVar.i()));
        int i6 = iArr[loadType.ordinal()];
        if (i6 == 1) {
            return l0.b.INSTANCE.e(k4, o(), n(), this.sourceLoadStates.j(), null);
        }
        if (i6 == 2) {
            return l0.b.INSTANCE.c(k4, o(), this.sourceLoadStates.j(), null);
        }
        if (i6 == 3) {
            return l0.b.INSTANCE.a(k4, n(), this.sourceLoadStates.j(), null);
        }
        throw new NoWhenBranchMatchedException();
    }

    private p0(x0 x0Var) {
        this.config = x0Var;
        ArrayList arrayList = new ArrayList();
        this._pages = arrayList;
        this.pages = arrayList;
        this.prependGenerationIdCh = kotlinx.coroutines.channels.o.d(-1, null, null, 6, null);
        this.appendGenerationIdCh = kotlinx.coroutines.channels.o.d(-1, null, null, 6, null);
        this.failedHintsByLoadType = new LinkedHashMap();
        j0 j0Var = new j0();
        j0Var.f(g0.REFRESH, e0.b.f31660b);
        k2 k2Var = k2.f75408a;
        this.sourceLoadStates = j0Var;
    }
}
