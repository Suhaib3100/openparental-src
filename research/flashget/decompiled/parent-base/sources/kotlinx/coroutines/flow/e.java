package kotlinx.coroutines.flow;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: Channels.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u00020\u000f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0018\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010 \u001a\u00020\u000f2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0096@ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0014¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010'R\u000b\u0010)\u001a\u00020(8\u0002X\u0082\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Lkotlinx/coroutines/flow/e;", "T", "Lkotlinx/coroutines/flow/internal/d;", "Lkotlinx/coroutines/channels/d0;", "channel", "", "consume", "Lkotlin/coroutines/g;", "context", "", "capacity", "Lkotlinx/coroutines/channels/i;", "onBufferOverflow", "<init>", "(Lkotlinx/coroutines/channels/d0;ZLkotlin/coroutines/g;ILkotlinx/coroutines/channels/i;)V", "Lkotlin/k2;", "p", "()V", "k", "(Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/i;)Lkotlinx/coroutines/flow/internal/d;", "Lkotlinx/coroutines/flow/i;", "l", "()Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/channels/b0;", "scope", "i", "(Lkotlinx/coroutines/channels/b0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/r0;", "o", "(Lkotlinx/coroutines/r0;)Lkotlinx/coroutines/channels/d0;", "Lkotlinx/coroutines/flow/j;", "collector", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "f", "()Ljava/lang/String;", "e", "Lkotlinx/coroutines/channels/d0;", "Z", "Lkotlinx/atomicfu/AtomicBoolean;", "consumed", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/flow/ChannelAsFlow\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,176:1\n1#2:177\n*E\n"})
/* loaded from: classes7.dex */
final class e<T> extends kotlinx.coroutines.flow.internal.d<T> {

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private static final AtomicIntegerFieldUpdater f80002g = AtomicIntegerFieldUpdater.newUpdater(e.class, ProtectedSandApp.s("蜉\u0001"));

    @kd.x
    private volatile int consumed;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.channels.d0<T> channel;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean consume;

    public /* synthetic */ e(kotlinx.coroutines.channels.d0 d0Var, boolean z4, kotlin.coroutines.g gVar, int i4, kotlinx.coroutines.channels.i iVar, int i5, kotlin.jvm.internal.w wVar) {
        this(d0Var, z4, (i5 & 4) != 0 ? kotlin.coroutines.i.f75057b : gVar, (i5 & 8) != 0 ? -3 : i4, (i5 & 16) != 0 ? kotlinx.coroutines.channels.i.SUSPEND : iVar);
    }

    private final void p() {
        if (this.consume && f80002g.getAndSet(this, 1) != 0) {
            throw new IllegalStateException(ProtectedSandApp.s("蜊\u0001"));
        }
    }

    @Override // kotlinx.coroutines.flow.internal.d, kotlinx.coroutines.flow.i
    @fg.m
    public Object a(@fg.l j<? super T> jVar, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        if (this.capacity != -3) {
            Object a5 = super.a(jVar, dVar);
            return a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? a5 : k2.f75408a;
        }
        p();
        Object e4 = m.e(jVar, this.channel, this.consume, dVar);
        return e4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? e4 : k2.f75408a;
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @fg.l
    protected String f() {
        return ProtectedSandApp.s("蜋\u0001") + this.channel;
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @fg.m
    protected Object i(@fg.l kotlinx.coroutines.channels.b0<? super T> b0Var, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        Object e4 = m.e(new kotlinx.coroutines.flow.internal.w(b0Var), this.channel, this.consume, dVar);
        return e4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? e4 : k2.f75408a;
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @fg.l
    protected kotlinx.coroutines.flow.internal.d<T> k(@fg.l kotlin.coroutines.g context, int capacity, @fg.l kotlinx.coroutines.channels.i onBufferOverflow) {
        return new e(this.channel, this.consume, context, capacity, onBufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @fg.l
    public i<T> l() {
        return new e(this.channel, this.consume, null, 0, null, 28, null);
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @fg.l
    public kotlinx.coroutines.channels.d0<T> o(@fg.l kotlinx.coroutines.r0 scope) {
        p();
        return this.capacity == -3 ? this.channel : super.o(scope);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@fg.l kotlinx.coroutines.channels.d0<? extends T> d0Var, boolean z4, @fg.l kotlin.coroutines.g gVar, int i4, @fg.l kotlinx.coroutines.channels.i iVar) {
        super(gVar, i4, iVar);
        this.channel = d0Var;
        this.consume = z4;
        this.consumed = 0;
    }
}
