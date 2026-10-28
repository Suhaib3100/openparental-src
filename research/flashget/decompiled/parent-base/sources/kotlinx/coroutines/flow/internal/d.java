package kotlinx.coroutines.flow.internal;

import androidx.compose.foundation.layout.f3;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlinx.coroutines.channels.b0;
import kotlinx.coroutines.channels.d0;
import kotlinx.coroutines.f2;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import kotlinx.coroutines.w0;

/* compiled from: ChannelFlow.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H$¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H¤@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\u0013\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\u00020\u00142\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010 \u001a\u0004\u0018\u00010\u001fH\u0014¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010'R9\u0010-\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140)\u0012\u0006\u0012\u0004\u0018\u00010*0(8@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00100\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/\u0082\u0002\u0004\n\u0002\b\u0019¨\u00061"}, d2 = {"Lkotlinx/coroutines/flow/internal/d;", "T", "Lkotlinx/coroutines/flow/internal/p;", "Lkotlin/coroutines/g;", "context", "", "capacity", "Lkotlinx/coroutines/channels/i;", "onBufferOverflow", "<init>", "(Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/i;)V", "Lkotlinx/coroutines/flow/i;", "l", "()Lkotlinx/coroutines/flow/i;", "d", "(Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/i;)Lkotlinx/coroutines/flow/i;", "k", "(Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/i;)Lkotlinx/coroutines/flow/internal/d;", "Lkotlinx/coroutines/channels/b0;", "scope", "Lkotlin/k2;", "i", "(Lkotlinx/coroutines/channels/b0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/r0;", "Lkotlinx/coroutines/channels/d0;", "o", "(Lkotlinx/coroutines/r0;)Lkotlinx/coroutines/channels/d0;", "Lkotlinx/coroutines/flow/j;", "collector", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "f", "()Ljava/lang/String;", "toString", "b", "Lkotlin/coroutines/g;", "c", "I", "Lkotlinx/coroutines/channels/i;", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "m", "()Lld/p;", "collectToFun", "n", "()I", "produceCapacity", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@f2
@r1({"SMAP\nChannelFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelFlow.kt\nkotlinx/coroutines/flow/internal/ChannelFlow\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,245:1\n1#2:246\n*E\n"})
/* loaded from: classes7.dex */
public abstract class d<T> implements p<T> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public final kotlin.coroutines.g context;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @kd.f
    public final int capacity;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public final kotlinx.coroutines.channels.i onBufferOverflow;

    /* compiled from: ChannelFlow.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f80030b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f80031c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.j<T> f80032d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ d<T> f80033e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(kotlinx.coroutines.flow.j<? super T> jVar, d<T> dVar, kotlin.coroutines.d<? super a> dVar2) {
            super(2, dVar2);
            this.f80032d = jVar;
            this.f80033e = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f80032d, this.f80033e, dVar);
            aVar.f80031c = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f80030b;
            if (i4 == 0) {
                a1.n(obj);
                r0 r0Var = (r0) this.f80031c;
                kotlinx.coroutines.flow.j<T> jVar = this.f80032d;
                d0<T> o4 = this.f80033e.o(r0Var);
                this.f80030b = 1;
                if (kotlinx.coroutines.flow.k.l0(jVar, o4, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("蜑\u0001"));
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* compiled from: ChannelFlow.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lkotlinx/coroutines/channels/b0;", "it", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/channels/b0;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<b0<? super T>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f80034b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f80035c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ d<T> f80036d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(d<T> dVar, kotlin.coroutines.d<? super b> dVar2) {
            super(2, dVar2);
            this.f80036d = dVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l b0<? super T> b0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f80036d, dVar);
            bVar.f80035c = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f80034b;
            if (i4 == 0) {
                a1.n(obj);
                b0<? super T> b0Var = (b0) this.f80035c;
                d<T> dVar = this.f80036d;
                this.f80034b = 1;
                if (dVar.i(b0Var, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("蜒\u0001"));
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    public d(@fg.l kotlin.coroutines.g gVar, int i4, @fg.l kotlinx.coroutines.channels.i iVar) {
        this.context = gVar;
        this.capacity = i4;
        this.onBufferOverflow = iVar;
    }

    static <T> Object g(d<T> dVar, kotlinx.coroutines.flow.j<? super T> jVar, kotlin.coroutines.d<? super k2> dVar2) {
        Object g4 = s0.g(new a(jVar, dVar, null), dVar2);
        return g4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? g4 : k2.f75408a;
    }

    @Override // kotlinx.coroutines.flow.i
    @fg.m
    public Object a(@fg.l kotlinx.coroutines.flow.j<? super T> jVar, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        return g(this, jVar, dVar);
    }

    @Override // kotlinx.coroutines.flow.internal.p
    @fg.l
    public kotlinx.coroutines.flow.i<T> d(@fg.l kotlin.coroutines.g context, int capacity, @fg.l kotlinx.coroutines.channels.i onBufferOverflow) {
        kotlin.coroutines.g O = context.O(this.context);
        if (onBufferOverflow == kotlinx.coroutines.channels.i.SUSPEND) {
            int i4 = this.capacity;
            if (i4 != -3) {
                if (capacity != -3) {
                    if (i4 != -2) {
                        if (capacity != -2) {
                            capacity += i4;
                            if (capacity < 0) {
                                capacity = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                capacity = i4;
            }
            onBufferOverflow = this.onBufferOverflow;
        }
        return (l0.g(O, this.context) && capacity == this.capacity && onBufferOverflow == this.onBufferOverflow) ? this : k(O, capacity, onBufferOverflow);
    }

    @fg.m
    protected String f() {
        return null;
    }

    @fg.m
    protected abstract Object i(@fg.l b0<? super T> b0Var, @fg.l kotlin.coroutines.d<? super k2> dVar);

    @fg.l
    protected abstract d<T> k(@fg.l kotlin.coroutines.g context, int capacity, @fg.l kotlinx.coroutines.channels.i onBufferOverflow);

    @fg.m
    public kotlinx.coroutines.flow.i<T> l() {
        return null;
    }

    @fg.l
    public final ld.p<b0<? super T>, kotlin.coroutines.d<? super k2>, Object> m() {
        return new b(this, null);
    }

    public final int n() {
        int i4 = this.capacity;
        if (i4 == -3) {
            return -2;
        }
        return i4;
    }

    @fg.l
    public d0<T> o(@fg.l r0 scope) {
        return kotlinx.coroutines.channels.z.g(scope, this.context, n(), this.onBufferOverflow, t0.ATOMIC, null, m(), 16, null);
    }

    @fg.l
    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String f4 = f();
        if (f4 != null) {
            arrayList.add(f4);
        }
        if (this.context != kotlin.coroutines.i.f75057b) {
            arrayList.add(ProtectedSandApp.s("蛸\u0001") + this.context);
        }
        if (this.capacity != -3) {
            arrayList.add(ProtectedSandApp.s("蛹\u0001") + this.capacity);
        }
        if (this.onBufferOverflow != kotlinx.coroutines.channels.i.SUSPEND) {
            arrayList.add(ProtectedSandApp.s("蛺\u0001") + this.onBufferOverflow);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(w0.a(this));
        sb.append('[');
        return f3.a(sb, kotlin.collections.w.m3(arrayList, ProtectedSandApp.s("蛻\u0001"), null, null, 0, null, null, 62, null), ']');
    }
}
