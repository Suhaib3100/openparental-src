package androidx.view.contextaware;

import android.content.Context;
import fg.m;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.z0;
import kotlinx.coroutines.p;
import kotlinx.coroutines.q;
import ld.l;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: ContextAware.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aB\u0010\u0006\u001a\u00078\u0000¢\u0006\u0002\b\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u001e\b\u0004\u0010\u0005\u001a\u0018\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u00040\u0002H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"R", "Landroidx/activity/contextaware/a;", "Lkotlin/Function1;", "Landroid/content/Context;", "Lkd/o;", "onContextAvailable", "a", "(Landroidx/activity/contextaware/a;Lld/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nContextAware.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextAware.kt\nandroidx/activity/contextaware/ContextAwareKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,94:1\n314#2,11:95\n*S KotlinDebug\n*F\n+ 1 ContextAware.kt\nandroidx/activity/contextaware/ContextAwareKt\n*L\n81#1:95,11\n*E\n"})
/* loaded from: classes.dex */
public final class c {

    /* compiled from: ContextAware.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "it", "Lkotlin/k2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nContextAware.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextAware.kt\nandroidx/activity/contextaware/ContextAwareKt$withContextAvailable$2$1\n*L\n1#1,94:1\n*E\n"})
    static final class a extends n0 implements l<Throwable, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.view.contextaware.a f520b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f521c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.view.contextaware.a aVar, b bVar) {
            super(1);
            this.f520b = aVar;
            this.f521c = bVar;
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Throwable th) {
            invoke2(th);
            return k2.f75408a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@m Throwable th) {
            this.f520b.removeOnContextAvailableListener(this.f521c);
        }
    }

    /* compiled from: ContextAware.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/activity/contextaware/c$b", "Landroidx/activity/contextaware/d;", "Landroid/content/Context;", "context", "Lkotlin/k2;", "a", "(Landroid/content/Context;)V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @r1({"SMAP\nContextAware.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextAware.kt\nandroidx/activity/contextaware/ContextAwareKt$withContextAvailable$2$listener$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,94:1\n1#2:95\n*E\n"})
    public static final class b implements d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ p<R> f522a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l<Context, R> f523b;

        public b(p<R> pVar, l<Context, R> lVar) {
            this.f522a = pVar;
            this.f523b = lVar;
        }

        @Override // androidx.view.contextaware.d
        public void a(@fg.l Context context) {
            Object a5;
            l0.p(context, "context");
            d dVar = this.f522a;
            l<Context, R> lVar = this.f523b;
            try {
                z0.Companion companion = z0.INSTANCE;
                a5 = lVar.invoke(context);
            } catch (Throwable th) {
                z0.Companion companion2 = z0.INSTANCE;
                a5 = a1.a(th);
            }
            dVar.resumeWith(a5);
        }
    }

    @m
    public static final <R> Object a(@fg.l androidx.view.contextaware.a aVar, @fg.l l<Context, R> lVar, @fg.l d<R> dVar) {
        Context peekAvailableContext = aVar.peekAvailableContext();
        if (peekAvailableContext != null) {
            return lVar.invoke(peekAvailableContext);
        }
        q qVar = new q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        qVar.e0();
        b bVar = new b(qVar, lVar);
        aVar.addOnContextAvailableListener(bVar);
        qVar.k0(new a(aVar, bVar));
        Object y4 = qVar.y();
        if (y4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
            h.c(dVar);
        }
        return y4;
    }

    private static final <R> Object b(androidx.view.contextaware.a aVar, l<Context, R> lVar, d<R> dVar) {
        Context peekAvailableContext = aVar.peekAvailableContext();
        if (peekAvailableContext != null) {
            return lVar.invoke(peekAvailableContext);
        }
        q qVar = new q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        qVar.e0();
        b bVar = new b(qVar, lVar);
        aVar.addOnContextAvailableListener(bVar);
        qVar.k0(new a(aVar, bVar));
        k2 k2Var = k2.f75408a;
        Object y4 = qVar.y();
        if (y4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
            h.c(dVar);
        }
        return y4;
    }
}
