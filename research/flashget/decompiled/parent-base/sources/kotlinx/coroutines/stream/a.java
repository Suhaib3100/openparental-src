package kotlinx.coroutines.stream;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.stream.Stream;
import kd.x;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlinx.coroutines.flow.i;

/* compiled from: Stream.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u000b\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/stream/a;", "T", "Lkotlinx/coroutines/flow/i;", "Ljava/util/stream/Stream;", "stream", "<init>", "(Ljava/util/stream/Stream;)V", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "b", "Ljava/util/stream/Stream;", "Lkotlinx/atomicfu/AtomicBoolean;", "consumed", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
final class a<T> implements i<T> {

    /* renamed from: c, reason: collision with root package name */
    @l
    private static final AtomicIntegerFieldUpdater f81088c = AtomicIntegerFieldUpdater.newUpdater(a.class, ProtectedSandApp.s("裈\u0001"));

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final Stream<T> stream;

    @x
    private volatile int consumed = 0;

    /* compiled from: Stream.kt */
    @f(c = "kotlinx.coroutines.stream.StreamFlow", f = "Stream.kt", i = {0, 0}, l = {26}, m = "collect", n = {"this", "collector"}, s = {"L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.stream.a$a, reason: collision with other inner class name */
    static final class C1261a extends d {

        /* renamed from: b, reason: collision with root package name */
        Object f81090b;

        /* renamed from: c, reason: collision with root package name */
        Object f81091c;

        /* renamed from: d, reason: collision with root package name */
        Object f81092d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f81093e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ a<T> f81094f;

        /* renamed from: g, reason: collision with root package name */
        int f81095g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1261a(a<T> aVar, kotlin.coroutines.d<? super C1261a> dVar) {
            super(dVar);
            this.f81094f = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            this.f81093e = obj;
            this.f81095g |= Integer.MIN_VALUE;
            return this.f81094f.a(null, this);
        }
    }

    public a(@l Stream<T> stream) {
        this.stream = stream;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005e A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #0 {all -> 0x0034, blocks: (B:11:0x002f, B:14:0x0058, B:16:0x005e), top: B:10:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // kotlinx.coroutines.flow.i
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@fg.l kotlinx.coroutines.flow.j<? super T> r7, @fg.l kotlin.coroutines.d<? super kotlin.k2> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.stream.a.C1261a
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.stream.a$a r0 = (kotlinx.coroutines.stream.a.C1261a) r0
            int r1 = r0.f81095g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f81095g = r1
            goto L18
        L13:
            kotlinx.coroutines.stream.a$a r0 = new kotlinx.coroutines.stream.a$a
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f81093e
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f81095g
            r3 = 1
            if (r2 == 0) goto L42
            if (r2 != r3) goto L36
            java.lang.Object r7 = r0.f81092d
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r2 = r0.f81091c
            kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
            java.lang.Object r4 = r0.f81090b
            kotlinx.coroutines.stream.a r4 = (kotlinx.coroutines.stream.a) r4
            kotlin.a1.n(r8)     // Catch: java.lang.Throwable -> L34
            r8 = r2
            goto L58
        L34:
            r7 = move-exception
            goto L7b
        L36:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "裉\u0001"
            java.lang.String r8 = com.flashget.parentalcontrol.ProtectedSandApp.s(r8)
            r7.<init>(r8)
            throw r7
        L42:
            kotlin.a1.n(r8)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r8 = kotlinx.coroutines.stream.a.f81088c
            r2 = 0
            boolean r8 = r8.compareAndSet(r6, r2, r3)
            if (r8 == 0) goto L81
            java.util.stream.Stream<T> r8 = r6.stream     // Catch: java.lang.Throwable -> L79
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L79
            r4 = r6
            r5 = r8
            r8 = r7
            r7 = r5
        L58:
            boolean r2 = r7.hasNext()     // Catch: java.lang.Throwable -> L34
            if (r2 == 0) goto L71
            java.lang.Object r2 = r7.next()     // Catch: java.lang.Throwable -> L34
            r0.f81090b = r4     // Catch: java.lang.Throwable -> L34
            r0.f81091c = r8     // Catch: java.lang.Throwable -> L34
            r0.f81092d = r7     // Catch: java.lang.Throwable -> L34
            r0.f81095g = r3     // Catch: java.lang.Throwable -> L34
            java.lang.Object r2 = r8.emit(r2, r0)     // Catch: java.lang.Throwable -> L34
            if (r2 != r1) goto L58
            return r1
        L71:
            java.util.stream.Stream<T> r7 = r4.stream
            r7.close()
            kotlin.k2 r7 = kotlin.k2.f75408a
            return r7
        L79:
            r7 = move-exception
            r4 = r6
        L7b:
            java.util.stream.Stream<T> r8 = r4.stream
            r8.close()
            throw r7
        L81:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "裊\u0001"
            java.lang.String r8 = com.flashget.parentalcontrol.ProtectedSandApp.s(r8)
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.stream.a.a(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
    }
}
