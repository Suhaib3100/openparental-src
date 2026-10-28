package kotlinx.coroutines.channels;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.u1;
import kotlin.k2;
import kotlin.x0;

/* compiled from: Actor.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BO\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012-\u0010\r\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0007¢\u0006\u0002\b\fø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0013\u001a\u00020\n2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ&\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\u001c2\u0006\u0010\u0012\u001a\u00028\u0000H\u0016ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u00020\u00192\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R,\u0010+\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000'0&8VX\u0096\u0004¢\u0006\f\u0012\u0004\b*\u0010\u0016\u001a\u0004\b(\u0010)\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006,"}, d2 = {"Lkotlinx/coroutines/channels/x;", "E", "Lkotlinx/coroutines/channels/a;", "Lkotlin/coroutines/g;", "parentContext", "Lkotlinx/coroutines/channels/l;", "channel", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/c;", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "", "Lkotlin/u;", "block", "<init>", "(Lkotlin/coroutines/g;Lkotlinx/coroutines/channels/l;Lld/p;)V", "Lkotlinx/coroutines/selects/m;", "select", "element", "e2", "(Lkotlinx/coroutines/selects/m;Ljava/lang/Object;)V", "G1", "()V", "f0", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "offer", "(Ljava/lang/Object;)Z", "Lkotlinx/coroutines/channels/p;", "M", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "cause", "b0", "(Ljava/lang/Throwable;)Z", "f", "Lkotlin/coroutines/d;", "continuation", "Lkotlinx/coroutines/selects/i;", "Lkotlinx/coroutines/channels/e0;", "r", "()Lkotlinx/coroutines/selects/i;", "d2", "onSend", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
final class x<E> extends kotlinx.coroutines.channels.a<E> {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private kotlin.coroutines.d<? super k2> continuation;

    /* compiled from: Actor.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class a extends kotlin.jvm.internal.h0 implements ld.q<x<?>, kotlinx.coroutines.selects.m<?>, Object, k2> {

        /* renamed from: d, reason: collision with root package name */
        public static final a f79635d = new a();

        a() {
            super(3, x.class, ProtectedSandApp.s("蚄\u0001"), ProtectedSandApp.s("蚃\u0001"), 0);
        }

        @Override // ld.q
        public k2 R(x<?> xVar, kotlinx.coroutines.selects.m<?> mVar, Object obj) {
            xVar.e2(mVar, obj);
            return k2.f75408a;
        }

        public final void Z(@fg.l x<?> xVar, @fg.l kotlinx.coroutines.selects.m<?> mVar, @fg.m Object obj) {
            xVar.e2(mVar, obj);
        }
    }

    public x(@fg.l kotlin.coroutines.g gVar, @fg.l l<E> lVar, @fg.l ld.p<? super c<E>, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar) {
        super(gVar, lVar, false);
        this.continuation = kotlin.coroutines.intrinsics.b.c(pVar, this, this);
    }

    public static /* synthetic */ void d2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e2(kotlinx.coroutines.selects.m<?> select, Object element) {
        G1();
        super.r().a().R(this, select, element);
    }

    @Override // kotlinx.coroutines.r2
    protected void G1() {
        me.a.c(this.continuation, this);
    }

    @Override // kotlinx.coroutines.channels.m, kotlinx.coroutines.channels.e0
    @fg.l
    public Object M(E element) {
        start();
        return super.M(element);
    }

    @Override // kotlinx.coroutines.channels.m, kotlinx.coroutines.channels.e0
    public boolean b0(@fg.m Throwable cause) {
        boolean b02 = super.b0(cause);
        start();
        return b02;
    }

    @Override // kotlinx.coroutines.channels.m, kotlinx.coroutines.channels.e0
    @fg.m
    public Object f0(E e4, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        start();
        Object f02 = super.f0(e4, dVar);
        return f02 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? f02 : k2.f75408a;
    }

    @Override // kotlinx.coroutines.channels.m, kotlinx.coroutines.channels.e0
    @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @x0(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E element) {
        start();
        return super.offer(element);
    }

    @Override // kotlinx.coroutines.channels.m, kotlinx.coroutines.channels.e0
    @fg.l
    public kotlinx.coroutines.selects.i<E, e0<E>> r() {
        a aVar = a.f79635d;
        l0.n(aVar, ProtectedSandApp.s("蚅\u0001"));
        return new kotlinx.coroutines.selects.j(this, (ld.q) u1.q(aVar, 3), super.r().c(), null, 8, null);
    }
}
