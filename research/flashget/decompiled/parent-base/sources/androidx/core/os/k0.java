package androidx.core.os;

import android.content.Context;
import android.os.ProfilingManager;
import android.os.ProfilingResult;
import androidx.annotation.x0;
import androidx.core.os.k0;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.k2;

/* compiled from: Profiling.kt */
@kd.i(name = "Profiling")
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\u001a\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a-\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a%\u0010\r\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a9\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014\"\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014\"\u0014\u0010\u0017\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014\"\u0014\u0010\u0018\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0014\"\u0014\u0010\u001a\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014\"\u0014\u0010\u001c\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0014\"\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\"\u0014\u0010\"\u001a\u00020\u001d8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u001f¨\u0006#"}, d2 = {"Landroid/content/Context;", "context", "Lkotlinx/coroutines/flow/i;", "Landroid/os/ProfilingResult;", "a", "(Landroid/content/Context;)Lkotlinx/coroutines/flow/i;", "Ljava/util/concurrent/Executor;", "executor", "Ljava/util/function/Consumer;", "listener", "Lkotlin/k2;", "b", "(Landroid/content/Context;Ljava/util/concurrent/Executor;Ljava/util/function/Consumer;)V", "d", "(Landroid/content/Context;Ljava/util/function/Consumer;)V", "Landroidx/core/os/l0;", "profilingRequest", "c", "(Landroid/content/Context;Landroidx/core/os/l0;Ljava/util/concurrent/Executor;Ljava/util/function/Consumer;)V", "", "Ljava/lang/String;", "KEY_DURATION_MS", "KEY_SAMPLING_INTERVAL_BYTES", "KEY_TRACK_JAVA_ALLOCATIONS", "KEY_FREQUENCY_HZ", "e", "KEY_SIZE_KB", "f", "KEY_BUFFER_FILL_POLICY", "", "g", "I", "VALUE_BUFFER_FILL_POLICY_DISCARD", "h", "VALUE_BUFFER_FILL_POLICY_RING_BUFFER", "core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final String f26512a = "KEY_DURATION_MS";

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final String f26513b = "KEY_SAMPLING_INTERVAL_BYTES";

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final String f26514c = "KEY_TRACK_JAVA_ALLOCATIONS";

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final String f26515d = "KEY_FREQUENCY_HZ";

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final String f26516e = "KEY_SIZE_KB";

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private static final String f26517f = "KEY_BUFFER_FILL_POLICY";

    /* renamed from: g, reason: collision with root package name */
    private static final int f26518g = 1;

    /* renamed from: h, reason: collision with root package name */
    private static final int f26519h = 2;

    /* compiled from: Profiling.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.core.os.Profiling$registerForAllProfilingResults$1", f = "Profiling.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/b0;", "Landroid/os/ProfilingResult;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/channels/b0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.channels.b0<? super ProfilingResult>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f26520b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f26521c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f26522d;

        /* compiled from: Profiling.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.core.os.k0$a$a, reason: collision with other inner class name */
        static final class C0423a extends kotlin.jvm.internal.n0 implements ld.a<k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ProfilingManager f26523b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Consumer<ProfilingResult> f26524c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0423a(ProfilingManager profilingManager, Consumer<ProfilingResult> consumer) {
                super(0);
                this.f26523b = profilingManager;
                this.f26524c = consumer;
            }

            public final void a() {
                this.f26523b.unregisterForAllProfilingResults(this.f26524c);
            }

            @Override // ld.a
            public /* bridge */ /* synthetic */ k2 invoke() {
                a();
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f26522d = context;
        }

        public static void a(Runnable runnable) {
            runnable.run();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void n(kotlinx.coroutines.channels.b0 b0Var, ProfilingResult result) {
            kotlin.jvm.internal.l0.o(result, "result");
            b0Var.M(result);
        }

        private static final void q(Runnable runnable) {
            runnable.run();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<k2> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f26522d, dVar);
            aVar.f26521c = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f26520b;
            if (i4 == 0) {
                a1.n(obj);
                final kotlinx.coroutines.channels.b0 b0Var = (kotlinx.coroutines.channels.b0) this.f26521c;
                Consumer consumer = new Consumer() { // from class: androidx.core.os.i0
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj2) {
                        k0.a.n(kotlinx.coroutines.channels.b0.this, (ProfilingResult) obj2);
                    }
                };
                ProfilingManager a5 = e0.a(this.f26522d.getSystemService(d0.a()));
                a5.registerForAllProfilingResults(new j0(), consumer);
                C0423a c0423a = new C0423a(a5, consumer);
                this.f26520b = 1;
                if (kotlinx.coroutines.channels.z.a(b0Var, c0423a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }

        @Override // ld.p
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.channels.b0<? super ProfilingResult> b0Var, kotlin.coroutines.d<? super k2> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    @fg.l
    @x0(api = 35)
    public static final kotlinx.coroutines.flow.i<ProfilingResult> a(@fg.l Context context) {
        kotlin.jvm.internal.l0.p(context, "context");
        return kotlinx.coroutines.flow.k.s(new a(context, null));
    }

    @x0(api = 35)
    public static final void b(@fg.l Context context, @fg.l Executor executor, @fg.l Consumer<ProfilingResult> listener) {
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(executor, "executor");
        kotlin.jvm.internal.l0.p(listener, "listener");
        e0.a(context.getSystemService(d0.a())).registerForAllProfilingResults(executor, listener);
    }

    @x0(api = 35)
    public static final void c(@fg.l Context context, @fg.l l0 profilingRequest, @fg.m Executor executor, @fg.m Consumer<ProfilingResult> consumer) {
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(profilingRequest, "profilingRequest");
        e0.a(context.getSystemService(d0.a())).requestProfiling(profilingRequest.getProfilingType(), profilingRequest.getParams(), profilingRequest.getTag(), profilingRequest.getCancellationSignal(), executor, consumer);
    }

    @x0(api = 35)
    public static final void d(@fg.l Context context, @fg.l Consumer<ProfilingResult> listener) {
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(listener, "listener");
        e0.a(context.getSystemService(d0.a())).unregisterForAllProfilingResults(listener);
    }
}
