package kotlin.coroutines;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.c1;
import kotlin.g0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.z0;
import ld.l;
import ld.p;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: Continuation.kt */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a(\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0087\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a(\u0010\b\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0087\b¢\u0006\u0004\b\b\u0010\t\u001aC\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u000b\u001a\u00020\n2\u001a\b\u0004\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0004\u0012\u00020\u00030\fH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001aC\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0001\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00110\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\\\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0001\"\u0004\b\u0000\u0010\u0015\"\u0004\b\u0001\u0010\u0000*#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0016¢\u0006\u0002\b\u00172\u0006\u0010\u0018\u001a\u00028\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a=\u0010\u001b\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00110\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001aV\u0010\u001d\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0015\"\u0004\b\u0001\u0010\u0000*#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0016¢\u0006\u0002\b\u00172\u0006\u0010\u0018\u001a\u00028\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001H\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a?\u0010 \u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u001a\b\u0004\u0010\u001f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0012\u0004\u0012\u00020\u00030\fH\u0087H\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b \u0010!\"\u001b\u0010&\u001a\u00020\n8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006'"}, d2 = {"T", "Lkotlin/coroutines/d;", "value", "Lkotlin/k2;", "f", "(Lkotlin/coroutines/d;Ljava/lang/Object;)V", "", "exception", "g", "(Lkotlin/coroutines/d;Ljava/lang/Throwable;)V", "Lkotlin/coroutines/g;", "context", "Lkotlin/Function1;", "Lkotlin/z0;", "resumeWith", "a", "(Lkotlin/coroutines/g;Lld/l;)Lkotlin/coroutines/d;", "", "completion", "b", "(Lld/l;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;", "R", "Lkotlin/Function2;", "Lkotlin/u;", "receiver", "c", "(Lld/p;Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;", "h", "(Lld/l;Lkotlin/coroutines/d;)V", "i", "(Lld/p;Ljava/lang/Object;Lkotlin/coroutines/d;)V", "block", "j", "(Lld/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "d", "()Lkotlin/coroutines/g;", "e", "()V", "coroutineContext", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class f {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Continuation.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001d\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"kotlin/coroutines/f$a", "Lkotlin/coroutines/d;", "Lkotlin/z0;", "result", "Lkotlin/k2;", "resumeWith", "(Ljava/lang/Object;)V", "Lkotlin/coroutines/g;", "getContext", "()Lkotlin/coroutines/g;", "context", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @r1({"SMAP\nContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Continuation.kt\nkotlin/coroutines/ContinuationKt$Continuation$1\n*L\n1#1,161:1\n*E\n"})
    public static final class a<T> implements d<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f75054b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ l<z0<? extends T>, k2> f75055c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(g gVar, l<? super z0<? extends T>, k2> lVar) {
            this.f75054b = gVar;
            this.f75055c = lVar;
        }

        @Override // kotlin.coroutines.d
        @fg.l
        /* renamed from: getContext, reason: from getter */
        public g getF75054b() {
            return this.f75054b;
        }

        @Override // kotlin.coroutines.d
        public void resumeWith(@fg.l Object result) {
            this.f75055c.invoke(z0.a(result));
        }
    }

    @c1(version = "1.3")
    @kotlin.internal.f
    private static final <T> d<T> a(g gVar, l<? super z0<? extends T>, k2> lVar) {
        l0.p(gVar, ProtectedSandApp.s("挅\u0001"));
        l0.p(lVar, ProtectedSandApp.s("挆\u0001"));
        return new a(gVar, lVar);
    }

    @fg.l
    @c1(version = "1.3")
    public static final <T> d<k2> b(@fg.l l<? super d<? super T>, ? extends Object> lVar, @fg.l d<? super T> dVar) {
        l0.p(lVar, ProtectedSandApp.s("指\u0001"));
        l0.p(dVar, ProtectedSandApp.s("挈\u0001"));
        return new k(kotlin.coroutines.intrinsics.b.e(kotlin.coroutines.intrinsics.b.b(lVar, dVar)), kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED);
    }

    @fg.l
    @c1(version = "1.3")
    public static final <R, T> d<k2> c(@fg.l p<? super R, ? super d<? super T>, ? extends Object> pVar, R r4, @fg.l d<? super T> dVar) {
        l0.p(pVar, ProtectedSandApp.s("指\u0001"));
        l0.p(dVar, ProtectedSandApp.s("挈\u0001"));
        return new k(kotlin.coroutines.intrinsics.b.e(kotlin.coroutines.intrinsics.b.c(pVar, r4, dVar)), kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED);
    }

    private static final g d() {
        throw new g0(ProtectedSandApp.s("按\u0001"));
    }

    @c1(version = "1.3")
    @kotlin.internal.f
    public static /* synthetic */ void e() {
    }

    @c1(version = "1.3")
    @kotlin.internal.f
    private static final <T> void f(d<? super T> dVar, T t4) {
        l0.p(dVar, ProtectedSandApp.s("指\u0001"));
        z0.Companion companion = z0.INSTANCE;
        dVar.resumeWith(t4);
    }

    @c1(version = "1.3")
    @kotlin.internal.f
    private static final <T> void g(d<? super T> dVar, Throwable th) {
        l0.p(dVar, ProtectedSandApp.s("指\u0001"));
        l0.p(th, ProtectedSandApp.s("挊\u0001"));
        z0.Companion companion = z0.INSTANCE;
        dVar.resumeWith(a1.a(th));
    }

    @c1(version = "1.3")
    public static final <T> void h(@fg.l l<? super d<? super T>, ? extends Object> lVar, @fg.l d<? super T> dVar) {
        l0.p(lVar, ProtectedSandApp.s("指\u0001"));
        l0.p(dVar, ProtectedSandApp.s("挈\u0001"));
        d e4 = kotlin.coroutines.intrinsics.b.e(kotlin.coroutines.intrinsics.b.b(lVar, dVar));
        z0.Companion companion = z0.INSTANCE;
        e4.resumeWith(k2.f75408a);
    }

    @c1(version = "1.3")
    public static final <R, T> void i(@fg.l p<? super R, ? super d<? super T>, ? extends Object> pVar, R r4, @fg.l d<? super T> dVar) {
        l0.p(pVar, ProtectedSandApp.s("指\u0001"));
        l0.p(dVar, ProtectedSandApp.s("挈\u0001"));
        d e4 = kotlin.coroutines.intrinsics.b.e(kotlin.coroutines.intrinsics.b.c(pVar, r4, dVar));
        z0.Companion companion = z0.INSTANCE;
        e4.resumeWith(k2.f75408a);
    }

    @c1(version = "1.3")
    @kotlin.internal.f
    private static final <T> Object j(l<? super d<? super T>, k2> lVar, d<? super T> dVar) {
        k kVar = new k(kotlin.coroutines.intrinsics.b.e(dVar));
        lVar.invoke(kVar);
        Object a5 = kVar.a();
        if (a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return a5;
    }
}
