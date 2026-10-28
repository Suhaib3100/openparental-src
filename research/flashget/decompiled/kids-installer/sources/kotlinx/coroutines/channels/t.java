package kotlinx.coroutines.channels;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Result;
import kotlin.a1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.m2;
import kotlinx.coroutines.channels.r;
import kotlinx.coroutines.u0;

/* compiled from: Channels.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a.\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"E", "Lkotlinx/coroutines/channels/k0;", "element", "Lkotlinx/coroutines/channels/r;", "Lkotlin/m2;", "b", "(Lkotlinx/coroutines/channels/k0;Ljava/lang/Object;)Ljava/lang/Object;", "a", "(Lkotlinx/coroutines/channels/k0;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/channels/ChannelsKt")
/* loaded from: classes5.dex */
final /* synthetic */ class t {

    /* compiled from: Channels.kt */
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$sendBlocking$1", f = "Channels.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"E", "Lkotlinx/coroutines/u0;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class a extends SuspendLambda implements q3.p<u0, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f27392s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ k0<E> f27393t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ E f27394u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(k0<? super E> k0Var, E e6, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f27393t = k0Var;
            this.f27394u = e6;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.f27392s;
            if (i5 == 0) {
                a1.n(obj);
                k0<E> k0Var = this.f27393t;
                E e6 = this.f27394u;
                this.f27392s = 1;
                if (k0Var.a0(e6, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("邛"));
                }
                a1.n(obj);
            }
            return m2.f23662a;
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d u0 u0Var, @d5.e Continuation<? super m2> continuation) {
            return ((a) c(u0Var, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            return new a(this.f27393t, this.f27394u, continuation);
        }
    }

    /* compiled from: Channels.kt */
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", f = "Channels.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"E", "Lkotlinx/coroutines/u0;", "Lkotlinx/coroutines/channels/r;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class b extends SuspendLambda implements q3.p<u0, Continuation<? super r<? extends m2>>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f27395s;

        /* renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f27396t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ k0<E> f27397u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ E f27398v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(k0<? super E> k0Var, E e6, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f27397u = k0Var;
            this.f27398v = e6;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            Object a6;
            Object a7;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.f27395s;
            try {
                if (i5 == 0) {
                    a1.n(obj);
                    k0<E> k0Var = this.f27397u;
                    E e6 = this.f27398v;
                    Result.a aVar = Result.f27242p;
                    this.f27395s = 1;
                    if (k0Var.a0(e6, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException(ProtectedSandApp.s("邜"));
                    }
                    a1.n(obj);
                }
                a6 = Result.b(m2.f23662a);
            } catch (Throwable th) {
                Result.a aVar2 = Result.f27242p;
                a6 = a1.a(th);
            }
            if (Result.j(a6)) {
                r.Companion companion = r.INSTANCE;
                m2 m2Var = m2.f23662a;
                companion.getClass();
                a7 = r.c(m2Var);
            } else {
                a7 = r.INSTANCE.a(Result.e(a6));
            }
            return r.b(a7);
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d u0 u0Var, @d5.e Continuation<? super r<m2>> continuation) {
            return ((b) c(u0Var, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            b bVar = new b(this.f27397u, this.f27398v, continuation);
            bVar.f27396t = obj;
            return bVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySendBlocking'. Consider handling the result of 'trySendBlocking' explicitly and rethrow exception if necessary", replaceWith = @ReplaceWith(expression = "trySendBlocking(element)", imports = {}))
    public static final <E> void a(@d5.d k0<? super E> k0Var, E e6) {
        if (r.m(k0Var.Y(e6))) {
            return;
        }
        kotlinx.coroutines.k.b(null, new a(k0Var, e6, null), 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @d5.d
    public static final <E> Object b(@d5.d k0<? super E> k0Var, E e6) {
        Object b6;
        Object Y = k0Var.Y(e6);
        if (Y instanceof r.c) {
            b6 = kotlinx.coroutines.k.b(null, new b(k0Var, e6, null), 1, null);
            return ((r) b6).getHolder();
        }
        r.Companion companion = r.INSTANCE;
        m2 m2Var = m2.f23662a;
        companion.getClass();
        return r.c(m2Var);
    }
}
