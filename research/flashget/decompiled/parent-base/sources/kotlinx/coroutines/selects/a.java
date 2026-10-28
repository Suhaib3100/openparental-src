package kotlinx.coroutines.selects;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.u1;
import kotlin.k2;
import kotlinx.coroutines.c1;

/* compiled from: OnTimeout.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\n\u001a\u00020\t2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000e8F¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/selects/a;", "", "", "timeMillis", "<init>", "(J)V", "Lkotlinx/coroutines/selects/m;", "select", "ignoredParam", "Lkotlin/k2;", "d", "(Lkotlinx/coroutines/selects/m;Ljava/lang/Object;)V", "a", "J", "Lkotlinx/coroutines/selects/e;", "b", "()Lkotlinx/coroutines/selects/e;", "c", "()V", "selectClause", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nOnTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnTimeout.kt\nkotlinx/coroutines/selects/OnTimeout\n+ 2 Runnable.kt\nkotlinx/coroutines/RunnableKt\n*L\n1#1,66:1\n17#2:67\n*S KotlinDebug\n*F\n+ 1 OnTimeout.kt\nkotlinx/coroutines/selects/OnTimeout\n*L\n56#1:67\n*E\n"})
/* loaded from: classes7.dex */
final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long timeMillis;

    /* compiled from: Runnable.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/k2;", "run", "()V", "kotlinx/coroutines/f3$a", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nRunnable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Runnable.kt\nkotlinx/coroutines/RunnableKt$Runnable$1\n+ 2 OnTimeout.kt\nkotlinx/coroutines/selects/OnTimeout\n*L\n1#1,18:1\n57#2,2:19\n*E\n"})
    /* renamed from: kotlinx.coroutines.selects.a$a, reason: collision with other inner class name */
    public static final class RunnableC1260a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f81030b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ a f81031c;

        public RunnableC1260a(m mVar, a aVar) {
            this.f81030b = mVar;
            this.f81031c = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f81030b.l(this.f81031c, k2.f75408a);
        }
    }

    /* compiled from: OnTimeout.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class b extends h0 implements ld.q<a, m<?>, Object, k2> {

        /* renamed from: d, reason: collision with root package name */
        public static final b f81032d = new b();

        b() {
            super(3, a.class, ProtectedSandApp.s("袭\u0001"), ProtectedSandApp.s("袬\u0001"), 0);
        }

        @Override // ld.q
        public k2 R(a aVar, m<?> mVar, Object obj) {
            aVar.d(mVar, obj);
            return k2.f75408a;
        }

        public final void Z(@fg.l a aVar, @fg.l m<?> mVar, @fg.m Object obj) {
            aVar.d(mVar, obj);
        }
    }

    public a(long j4) {
        this.timeMillis = j4;
    }

    public static /* synthetic */ void c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(m<?> select, Object ignoredParam) {
        if (this.timeMillis <= 0) {
            select.d(k2.f75408a);
            return;
        }
        RunnableC1260a runnableC1260a = new RunnableC1260a(select, this);
        l0.n(select, ProtectedSandApp.s("袮\u0001"));
        kotlin.coroutines.g context = select.getContext();
        select.f(c1.d(context).q(this.timeMillis, runnableC1260a, context));
    }

    @fg.l
    public final e b() {
        b bVar = b.f81032d;
        l0.n(bVar, ProtectedSandApp.s("袯\u0001"));
        return new f(this, (ld.q) u1.q(bVar, 3), null, 4, null);
    }
}
