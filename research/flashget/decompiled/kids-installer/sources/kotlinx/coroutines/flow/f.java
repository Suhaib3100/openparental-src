package kotlinx.coroutines.flow;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.m2;

/* compiled from: Builders.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BW\u0012-\u0010\u0017\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011¢\u0006\u0002\b\u0014\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014J!\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0094@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0010\u001a\u00020\u000fH\u0016R>\u0010\u0017\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011¢\u0006\u0002\b\u00148\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lkotlinx/coroutines/flow/f;", "T", "Lkotlinx/coroutines/flow/internal/d;", "Lkotlin/coroutines/g;", "context", "", "capacity", "Lkotlinx/coroutines/channels/m;", "onBufferOverflow", "i", "Lkotlinx/coroutines/channels/e0;", "scope", "Lkotlin/m2;", "h", "(Lkotlinx/coroutines/channels/e0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "toString", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "r", "Lq3/p;", "block", "<init>", "(Lq3/p;Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/m;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
class f<T> extends kotlinx.coroutines.flow.internal.d<T> {

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final q3.p<kotlinx.coroutines.channels.e0<? super T>, Continuation<? super m2>, Object> block;

    public /* synthetic */ f(q3.p pVar, CoroutineContext coroutineContext, int i5, kotlinx.coroutines.channels.m mVar, int i6, kotlin.jvm.internal.w wVar) {
        this(pVar, (i6 & 2) != 0 ? EmptyCoroutineContext.f23294o : coroutineContext, (i6 & 4) != 0 ? -2 : i5, (i6 & 8) != 0 ? kotlinx.coroutines.channels.m.SUSPEND : mVar);
    }

    static Object p(f fVar, kotlinx.coroutines.channels.e0 e0Var, Continuation continuation) {
        Object g02 = fVar.block.g0(e0Var, continuation);
        return g02 == CoroutineSingletons.COROUTINE_SUSPENDED ? g02 : m2.f23662a;
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @d5.e
    protected Object h(@d5.d kotlinx.coroutines.channels.e0<? super T> e0Var, @d5.d Continuation<? super m2> continuation) {
        return p(this, e0Var, continuation);
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @d5.d
    protected kotlinx.coroutines.flow.internal.d<T> i(@d5.d CoroutineContext context, int capacity, @d5.d kotlinx.coroutines.channels.m onBufferOverflow) {
        return new f(this.block, context, capacity, onBufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @d5.d
    public String toString() {
        return ProtectedSandApp.s("郫") + this.block + ProtectedSandApp.s("郬") + super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(@d5.d q3.p<? super kotlinx.coroutines.channels.e0<? super T>, ? super Continuation<? super m2>, ? extends Object> pVar, @d5.d CoroutineContext coroutineContext, int i5, @d5.d kotlinx.coroutines.channels.m mVar) {
        super(coroutineContext, i5, mVar);
        this.block = pVar;
    }
}
