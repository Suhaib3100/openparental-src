package androidx.view.compose;

import androidx.view.f;
import fg.l;
import fg.m;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.d;
import kotlin.jvm.internal.k1;
import kotlinx.coroutines.channels.e0;
import kotlinx.coroutines.channels.i;
import kotlinx.coroutines.channels.o;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.t;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.r0;
import ld.p;
import ld.q;

/* compiled from: PredictiveBackHandler.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00127\u0010\u000e\u001a3\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u00122\u0006\u0010\u0011\u001a\u00020\bø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u0016R\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u001b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010$\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b\u001d\u0010!\u001a\u0004\b\"\u0010#\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"Landroidx/activity/compose/k;", "", "Lkotlinx/coroutines/r0;", "scope", "", "isPredictiveBack", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/i;", "Landroidx/activity/f;", "Lkotlin/r0;", "name", "progress", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "onBack", "<init>", "(Lkotlinx/coroutines/r0;ZLld/p;)V", "backEvent", "Lkotlinx/coroutines/channels/p;", "f", "(Landroidx/activity/f;)Ljava/lang/Object;", "b", "()Z", "a", "()V", "Z", "e", "Lkotlinx/coroutines/channels/l;", "Lkotlinx/coroutines/channels/l;", "c", "()Lkotlinx/coroutines/channels/l;", "channel", "Lkotlinx/coroutines/k2;", "Lkotlinx/coroutines/k2;", "d", "()Lkotlinx/coroutines/k2;", "job", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class k {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isPredictiveBack;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final kotlinx.coroutines.channels.l<f> channel = o.d(-2, i.SUSPEND, null, 4, null);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final k2 job;

    /* compiled from: PredictiveBackHandler.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.activity.compose.OnBackInstance$job$1", f = "PredictiveBackHandler.kt", i = {0}, l = {154}, m = "invokeSuspend", n = {"completed"}, s = {"L$0"})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.o implements p<r0, d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f474b;

        /* renamed from: c, reason: collision with root package name */
        int f475c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ p<kotlinx.coroutines.flow.i<f>, d<? super kotlin.k2>, Object> f476d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ k f477e;

        /* compiled from: PredictiveBackHandler.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.activity.compose.OnBackInstance$job$1$1", f = "PredictiveBackHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Landroidx/activity/f;", "", "it", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.activity.compose.k$a$a, reason: collision with other inner class name */
        static final class C0005a extends kotlin.coroutines.jvm.internal.o implements q<j<? super f>, Throwable, d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f478b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ k1.a f479c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0005a(k1.a aVar, d<? super C0005a> dVar) {
                super(3, dVar);
                this.f479c = aVar;
            }

            @Override // ld.q
            @m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object R(@l j<? super f> jVar, @m Throwable th, @m d<? super kotlin.k2> dVar) {
                return new C0005a(this.f479c, dVar).invokeSuspend(kotlin.k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                if (this.f478b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a1.n(obj);
                this.f479c.f75322b = true;
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(p<? super kotlinx.coroutines.flow.i<f>, ? super d<? super kotlin.k2>, ? extends Object> pVar, k kVar, d<? super a> dVar) {
            super(2, dVar);
            this.f476d = pVar;
            this.f477e = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final d<kotlin.k2> create(@m Object obj, @l d<?> dVar) {
            return new a(this.f476d, this.f477e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            k1.a aVar;
            kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f475c;
            if (i4 == 0) {
                a1.n(obj);
                k1.a aVar3 = new k1.a();
                p<kotlinx.coroutines.flow.i<f>, d<? super kotlin.k2>, Object> pVar = this.f476d;
                t.b bVar = new t.b(kotlinx.coroutines.flow.k.X(this.f477e.c()), new C0005a(aVar3, null));
                this.f474b = aVar3;
                this.f475c = 1;
                if (pVar.invoke(bVar, this) == aVar2) {
                    return aVar2;
                }
                aVar = aVar3;
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (k1.a) this.f474b;
                a1.n(obj);
            }
            if (aVar.f75322b) {
                return kotlin.k2.f75408a;
            }
            throw new IllegalStateException("You must collect the progress flow");
        }

        @Override // ld.p
        @m
        public final Object invoke(@l r0 r0Var, @m d<? super kotlin.k2> dVar) {
            return ((a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    public k(@l r0 r0Var, boolean z4, @l p<? super kotlinx.coroutines.flow.i<f>, ? super d<? super kotlin.k2>, ? extends Object> pVar) {
        k2 f4;
        this.isPredictiveBack = z4;
        f4 = kotlinx.coroutines.k.f(r0Var, null, null, new a(pVar, this, null), 3, null);
        this.job = f4;
    }

    public final void a() {
        this.channel.b(new CancellationException("onBack cancelled"));
        k2.a.b(this.job, null, 1, null);
    }

    public final boolean b() {
        return e0.a.a(this.channel, null, 1, null);
    }

    @l
    public final kotlinx.coroutines.channels.l<f> c() {
        return this.channel;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final k2 getJob() {
        return this.job;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getIsPredictiveBack() {
        return this.isPredictiveBack;
    }

    @l
    public final Object f(@l f backEvent) {
        return this.channel.M(backEvent);
    }
}
