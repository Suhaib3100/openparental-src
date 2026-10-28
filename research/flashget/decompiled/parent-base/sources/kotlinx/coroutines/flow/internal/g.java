package kotlinx.coroutines.flow.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.e;
import kotlin.k2;
import kotlinx.coroutines.channels.b0;
import kotlinx.coroutines.l0;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: ChannelFlow.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B-\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0012\u001a\u00020\u00112\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0014\u001a\u00020\u00112\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH¤@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0018\u001a\u00020\u00112\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u0016H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001a\u001a\u00020\u00112\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0015J\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lkotlinx/coroutines/flow/internal/g;", "S", "T", "Lkotlinx/coroutines/flow/internal/d;", "Lkotlinx/coroutines/flow/i;", "flow", "Lkotlin/coroutines/g;", "context", "", "capacity", "Lkotlinx/coroutines/channels/i;", "onBufferOverflow", "<init>", "(Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/i;)V", "Lkotlinx/coroutines/flow/j;", "collector", "newContext", "Lkotlin/k2;", "s", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/g;Lkotlin/coroutines/d;)Ljava/lang/Object;", "t", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/b0;", "scope", "i", "(Lkotlinx/coroutines/channels/b0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "a", "", "toString", "()Ljava/lang/String;", "e", "Lkotlinx/coroutines/flow/i;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class g<S, T> extends d<T> {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    protected final kotlinx.coroutines.flow.i<S> flow;

    /* compiled from: ChannelFlow.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", i = {}, l = {SyslogAppender.LOG_LOCAL3}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"S", "T", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.flow.j<? super T>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f80053b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f80054c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ g<S, T> f80055d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(g<S, T> gVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f80055d = gVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.flow.j<? super T> jVar, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((a) create(jVar, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f80055d, dVar);
            aVar.f80054c = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f80053b;
            if (i4 == 0) {
                a1.n(obj);
                kotlinx.coroutines.flow.j<? super T> jVar = (kotlinx.coroutines.flow.j) this.f80054c;
                g<S, T> gVar = this.f80055d;
                this.f80053b = 1;
                if (gVar.t(jVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("蜖\u0001"));
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(@fg.l kotlinx.coroutines.flow.i<? extends S> iVar, @fg.l kotlin.coroutines.g gVar, int i4, @fg.l kotlinx.coroutines.channels.i iVar2) {
        super(gVar, i4, iVar2);
        this.flow = iVar;
    }

    static <S, T> Object q(g<S, T> gVar, kotlinx.coroutines.flow.j<? super T> jVar, kotlin.coroutines.d<? super k2> dVar) {
        if (gVar.capacity == -3) {
            kotlin.coroutines.g f75269b = dVar.getF75269b();
            kotlin.coroutines.g d5 = l0.d(f75269b, gVar.context);
            if (kotlin.jvm.internal.l0.g(d5, f75269b)) {
                Object t4 = gVar.t(jVar, dVar);
                return t4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? t4 : k2.f75408a;
            }
            e.Companion companion = kotlin.coroutines.e.INSTANCE;
            if (kotlin.jvm.internal.l0.g(d5.c(companion), f75269b.c(companion))) {
                Object s4 = gVar.s(jVar, d5, dVar);
                return s4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? s4 : k2.f75408a;
            }
        }
        Object g4 = d.g(gVar, jVar, dVar);
        return g4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? g4 : k2.f75408a;
    }

    static <S, T> Object r(g<S, T> gVar, b0<? super T> b0Var, kotlin.coroutines.d<? super k2> dVar) {
        Object t4 = gVar.t(new w(b0Var), dVar);
        return t4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? t4 : k2.f75408a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object s(kotlinx.coroutines.flow.j<? super T> jVar, kotlin.coroutines.g gVar, kotlin.coroutines.d<? super k2> dVar) {
        kotlinx.coroutines.flow.j e4;
        e4 = e.e(jVar, dVar.getF75269b());
        Object d5 = e.d(gVar, e4, null, new a(this, null), dVar, 4, null);
        return d5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? d5 : k2.f75408a;
    }

    @Override // kotlinx.coroutines.flow.internal.d, kotlinx.coroutines.flow.i
    @fg.m
    public Object a(@fg.l kotlinx.coroutines.flow.j<? super T> jVar, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        return q(this, jVar, dVar);
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @fg.m
    protected Object i(@fg.l b0<? super T> b0Var, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        return r(this, b0Var, dVar);
    }

    @fg.m
    protected abstract Object t(@fg.l kotlinx.coroutines.flow.j<? super T> jVar, @fg.l kotlin.coroutines.d<? super k2> dVar);

    @Override // kotlinx.coroutines.flow.internal.d
    @fg.l
    public String toString() {
        return this.flow + ProtectedSandApp.s("蜗\u0001") + super.toString();
    }
}
