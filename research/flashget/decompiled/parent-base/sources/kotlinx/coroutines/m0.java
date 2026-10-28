package kotlinx.coroutines;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.coroutines.e;
import kotlin.coroutines.g;

/* compiled from: CoroutineDispatcher.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\b&\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001#B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH&¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0017¢\u0006\u0004\b\u0014\u0010\u0013J'\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00112\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!¨\u0006$"}, d2 = {"Lkotlinx/coroutines/m0;", "Lkotlin/coroutines/a;", "Lkotlin/coroutines/e;", "<init>", "()V", "Lkotlin/coroutines/g;", "context", "", "c1", "(Lkotlin/coroutines/g;)Z", "", "parallelism", "e1", "(I)Lkotlinx/coroutines/m0;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/k2;", "S0", "(Lkotlin/coroutines/g;Ljava/lang/Runnable;)V", "U0", "T", "Lkotlin/coroutines/d;", "continuation", "m", "(Lkotlin/coroutines/d;)Lkotlin/coroutines/d;", "i", "(Lkotlin/coroutines/d;)V", "other", "g1", "(Lkotlinx/coroutines/m0;)Lkotlinx/coroutines/m0;", "", "toString", "()Ljava/lang/String;", "c", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class m0 extends kotlin.coroutines.a implements kotlin.coroutines.e {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: CoroutineDispatcher.kt */
    @kotlin.r
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/m0$a;", "Lkotlin/coroutines/b;", "Lkotlin/coroutines/e;", "Lkotlinx/coroutines/m0;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.m0$a, reason: from kotlin metadata */
    public static final class Companion extends kotlin.coroutines.b<kotlin.coroutines.e, m0> {

        /* compiled from: CoroutineDispatcher.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/coroutines/g$b;", "it", "Lkotlinx/coroutines/m0;", "a", "(Lkotlin/coroutines/g$b;)Lkotlinx/coroutines/m0;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: kotlinx.coroutines.m0$a$a, reason: collision with other inner class name */
        static final class C1258a extends kotlin.jvm.internal.n0 implements ld.l<g.b, m0> {

            /* renamed from: b, reason: collision with root package name */
            public static final C1258a f80865b = new C1258a(1);

            C1258a() {
                super(1);
            }

            @Override // ld.l
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final m0 invoke(@fg.l g.b bVar) {
                if (bVar instanceof m0) {
                    return (m0) bVar;
                }
                return null;
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }

        private Companion() {
            super(kotlin.coroutines.e.INSTANCE, C1258a.f80865b);
        }
    }

    public m0() {
        super(kotlin.coroutines.e.INSTANCE);
    }

    public abstract void S0(@fg.l kotlin.coroutines.g context, @fg.l Runnable block);

    @f2
    public void U0(@fg.l kotlin.coroutines.g context, @fg.l Runnable block) {
        S0(context, block);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.g.b, kotlin.coroutines.g
    @fg.m
    public <E extends g.b> E c(@fg.l g.c<E> cVar) {
        return (E) e.a.b(this, cVar);
    }

    public boolean c1(@fg.l kotlin.coroutines.g context) {
        return true;
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.g.b, kotlin.coroutines.g
    @fg.l
    public kotlin.coroutines.g d(@fg.l g.c<?> cVar) {
        return e.a.c(this, cVar);
    }

    @fg.l
    @z1
    public m0 e1(int parallelism) {
        kotlinx.coroutines.internal.t.a(parallelism);
        return new kotlinx.coroutines.internal.s(this, parallelism);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Operator '+' on two CoroutineDispatcher objects is meaningless. CoroutineDispatcher is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The dispatcher to the right of `+` just replaces the dispatcher to the left.")
    public final m0 g1(@fg.l m0 other) {
        return other;
    }

    @Override // kotlin.coroutines.e
    public final void i(@fg.l kotlin.coroutines.d<?> continuation) {
        kotlin.jvm.internal.l0.n(continuation, ProtectedSandApp.s("薝\u0001"));
        ((kotlinx.coroutines.internal.l) continuation).t();
    }

    @Override // kotlin.coroutines.e
    @fg.l
    public final <T> kotlin.coroutines.d<T> m(@fg.l kotlin.coroutines.d<? super T> continuation) {
        return new kotlinx.coroutines.internal.l(this, continuation);
    }

    @fg.l
    public String toString() {
        return w0.a(this) + '@' + w0.b(this);
    }
}
