package kotlinx.coroutines.flow;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: Builders.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BW\u0012-\u0010\t\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000eø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R>\u0010\t\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\b8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lkotlinx/coroutines/flow/f;", "T", "Lkotlinx/coroutines/flow/internal/d;", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/b0;", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "", "Lkotlin/u;", "block", "Lkotlin/coroutines/g;", "context", "", "capacity", "Lkotlinx/coroutines/channels/i;", "onBufferOverflow", "<init>", "(Lld/p;Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/i;)V", "k", "(Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/i;)Lkotlinx/coroutines/flow/internal/d;", "scope", "i", "(Lkotlinx/coroutines/channels/b0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "e", "Lld/p;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
class f<T> extends kotlinx.coroutines.flow.internal.d<T> {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.p<kotlinx.coroutines.channels.b0<? super T>, kotlin.coroutines.d<? super k2>, Object> block;

    public /* synthetic */ f(ld.p pVar, kotlin.coroutines.g gVar, int i4, kotlinx.coroutines.channels.i iVar, int i5, kotlin.jvm.internal.w wVar) {
        this(pVar, (i5 & 2) != 0 ? kotlin.coroutines.i.f75057b : gVar, (i5 & 4) != 0 ? -2 : i4, (i5 & 8) != 0 ? kotlinx.coroutines.channels.i.SUSPEND : iVar);
    }

    static <T> Object p(f<T> fVar, kotlinx.coroutines.channels.b0<? super T> b0Var, kotlin.coroutines.d<? super k2> dVar) {
        Object invoke = ((f) fVar).block.invoke(b0Var, dVar);
        return invoke == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? invoke : k2.f75408a;
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @fg.m
    protected Object i(@fg.l kotlinx.coroutines.channels.b0<? super T> b0Var, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        return p(this, b0Var, dVar);
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @fg.l
    protected kotlinx.coroutines.flow.internal.d<T> k(@fg.l kotlin.coroutines.g context, int capacity, @fg.l kotlinx.coroutines.channels.i onBufferOverflow) {
        return new f(this.block, context, capacity, onBufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @fg.l
    public String toString() {
        return ProtectedSandApp.s("蛼\u0001") + this.block + ProtectedSandApp.s("蛽\u0001") + super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(@fg.l ld.p<? super kotlinx.coroutines.channels.b0<? super T>, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar, @fg.l kotlin.coroutines.g gVar, int i4, @fg.l kotlinx.coroutines.channels.i iVar) {
        super(gVar, i4, iVar);
        this.block = pVar;
    }
}
