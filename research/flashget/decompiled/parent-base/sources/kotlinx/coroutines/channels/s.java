package kotlinx.coroutines.channels;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.x0;
import kotlin.z0;
import kotlinx.coroutines.channels.p;
import kotlinx.coroutines.r0;

/* compiled from: Channels.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a.\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"E", "Lkotlinx/coroutines/channels/e0;", "element", "Lkotlinx/coroutines/channels/p;", "Lkotlin/k2;", "b", "(Lkotlinx/coroutines/channels/e0;Ljava/lang/Object;)Ljava/lang/Object;", "a", "(Lkotlinx/coroutines/channels/e0;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "kotlinx/coroutines/channels/ChannelsKt")
@r1({"SMAP\nChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/channels/ChannelsKt__ChannelsKt\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n*L\n1#1,61:1\n514#2,6:62\n*S KotlinDebug\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/channels/ChannelsKt__ChannelsKt\n*L\n37#1:62,6\n*E\n"})
/* loaded from: classes7.dex */
final /* synthetic */ class s {

    /* compiled from: Channels.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$sendBlocking$1", f = "Channels.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f79417b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ e0<Object> f79418c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f79419d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(e0<Object> e0Var, Object obj, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f79418c = e0Var;
            this.f79419d = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new a(this.f79418c, this.f79419d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f79417b;
            if (i4 == 0) {
                a1.n(obj);
                e0<Object> e0Var = this.f79418c;
                Object obj2 = this.f79419d;
                this.f79417b = 1;
                if (e0Var.f0(obj2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("虣\u0001"));
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

    /* compiled from: Channels.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", f = "Channels.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"E", "Lkotlinx/coroutines/r0;", "Lkotlinx/coroutines/channels/p;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)Lkotlinx/coroutines/channels/p;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/channels/ChannelsKt__ChannelsKt$trySendBlocking$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
    static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super p<? extends k2>>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f79420b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f79421c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ e0<E> f79422d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ E f79423e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(e0<? super E> e0Var, E e4, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f79422d = e0Var;
            this.f79423e = e4;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f79422d, this.f79423e, dVar);
            bVar.f79421c = obj;
            return bVar;
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ Object invoke(r0 r0Var, kotlin.coroutines.d<? super p<? extends k2>> dVar) {
            return invoke2(r0Var, (kotlin.coroutines.d<? super p<k2>>) dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            Object a5;
            Object a6;
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f79420b;
            try {
                if (i4 == 0) {
                    a1.n(obj);
                    e0<E> e0Var = this.f79422d;
                    E e4 = this.f79423e;
                    z0.Companion companion = z0.INSTANCE;
                    this.f79420b = 1;
                    if (e0Var.f0(e4, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException(ProtectedSandApp.s("虤\u0001"));
                    }
                    a1.n(obj);
                }
                a5 = z0.b(k2.f75408a);
            } catch (Throwable th) {
                z0.Companion companion2 = z0.INSTANCE;
                a5 = a1.a(th);
            }
            if (z0.j(a5)) {
                p.Companion companion3 = p.INSTANCE;
                k2 k2Var = k2.f75408a;
                companion3.getClass();
                a6 = p.c(k2Var);
            } else {
                a6 = p.INSTANCE.a(z0.e(a5));
            }
            return p.b(a6);
        }

        @fg.m
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super p<k2>> dVar) {
            return ((b) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Deprecated in the favour of 'trySendBlocking'. Consider handling the result of 'trySendBlocking' explicitly and rethrow exception if necessary", replaceWith = @x0(expression = "trySendBlocking(element)", imports = {}))
    public static final /* synthetic */ void a(e0 e0Var, Object obj) {
        if (p.m(e0Var.M(obj))) {
            return;
        }
        kotlinx.coroutines.j.b(null, new a(e0Var, obj, null), 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.l
    public static final <E> Object b(@fg.l e0<? super E> e0Var, E e4) {
        Object b5;
        Object M = e0Var.M(e4);
        if (M instanceof p.c) {
            b5 = kotlinx.coroutines.j.b(null, new b(e0Var, e4, null), 1, null);
            return ((p) b5).getHolder();
        }
        p.Companion companion = p.INSTANCE;
        k2 k2Var = k2.f75408a;
        companion.getClass();
        return p.c(k2Var);
    }
}
