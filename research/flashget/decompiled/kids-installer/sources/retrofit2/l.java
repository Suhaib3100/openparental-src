package retrofit2;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.reflect.Method;
import kotlin.KotlinNullPointerException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.a1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.m2;

/* compiled from: KotlinExtensions.kt */
@p3.i(name = "KotlinExtensions")
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u001c\u0010\u0002\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0000*\u00020\u0004*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\b\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0000*\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005H\u0087@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0007\u001a-\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\b\b\u0000\u0010\u0000*\u00020\u0004*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0007\u001a\u001b\u0010\u000e\u001a\u00020\r*\u00060\u000bj\u0002`\fH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"T", "Lretrofit2/w;", "d", "(Lretrofit2/w;)Ljava/lang/Object;", "", "Lretrofit2/b;", "a", "(Lretrofit2/b;Lkotlin/coroutines/d;)Ljava/lang/Object;", "b", "Lretrofit2/v;", "c", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "e", "(Ljava/lang/Exception;Lkotlin/coroutines/d;)Ljava/lang/Object;", "retrofit"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class l {

    /* compiled from: KotlinExtensions.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "T", "", "it", "Lkotlin/m2;", "a", "(Ljava/lang/Throwable;)V", "retrofit2/KotlinExtensions$await$2$1"}, k = 3, mv = {1, 4, 0})
    /* loaded from: classes6.dex */
    static final class a extends Lambda implements q3.l<Throwable, m2> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ retrofit2.b f33016p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(retrofit2.b bVar) {
            super(1);
            this.f33016p = bVar;
        }

        @Override // q3.l
        public /* bridge */ /* synthetic */ m2 N(Throwable th) {
            a(th);
            return m2.f23662a;
        }

        public final void a(@d5.e Throwable th) {
            this.f33016p.cancel();
        }
    }

    /* compiled from: KotlinExtensions.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "T", "", "it", "Lkotlin/m2;", "a", "(Ljava/lang/Throwable;)V", "retrofit2/KotlinExtensions$await$4$1"}, k = 3, mv = {1, 4, 0})
    /* loaded from: classes6.dex */
    static final class b extends Lambda implements q3.l<Throwable, m2> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ retrofit2.b f33017p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(retrofit2.b bVar) {
            super(1);
            this.f33017p = bVar;
        }

        @Override // q3.l
        public /* bridge */ /* synthetic */ m2 N(Throwable th) {
            a(th);
            return m2.f23662a;
        }

        public final void a(@d5.e Throwable th) {
            this.f33017p.cancel();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: KotlinExtensions.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J$\u0010\u0007\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016J\u001e\u0010\n\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"retrofit2/l$c", "Lretrofit2/d;", "Lretrofit2/b;", "call", "Lretrofit2/v;", "response", "Lkotlin/m2;", "b", "", "t", "a", "retrofit"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes6.dex */
    public static final class c<T> implements retrofit2.d<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.q f33018a;

        c(kotlinx.coroutines.q qVar) {
            this.f33018a = qVar;
        }

        @Override // retrofit2.d
        public void a(@d5.d retrofit2.b<T> bVar, @d5.d Throwable th) {
            l0.q(bVar, ProtectedSandApp.s("鐚"));
            l0.q(th, ProtectedSandApp.s("鐛"));
            kotlinx.coroutines.q qVar = this.f33018a;
            Result.a aVar = Result.f27242p;
            qVar.s(a1.a(th));
        }

        @Override // retrofit2.d
        public void b(@d5.d retrofit2.b<T> bVar, @d5.d v<T> vVar) {
            l0.q(bVar, ProtectedSandApp.s("鐜"));
            l0.q(vVar, ProtectedSandApp.s("鐝"));
            if (!vVar.g()) {
                kotlinx.coroutines.q qVar = this.f33018a;
                HttpException httpException = new HttpException(vVar);
                Result.a aVar = Result.f27242p;
                qVar.s(a1.a(httpException));
                return;
            }
            T a6 = vVar.a();
            if (a6 != null) {
                kotlinx.coroutines.q qVar2 = this.f33018a;
                Result.a aVar2 = Result.f27242p;
                qVar2.s(a6);
                return;
            }
            Object p5 = bVar.g().p(k.class);
            if (p5 == null) {
                l0.L();
            }
            l0.h(p5, ProtectedSandApp.s("鐞"));
            Method b6 = ((k) p5).b();
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("鐟"));
            l0.h(b6, ProtectedSandApp.s("鐠"));
            Class<?> declaringClass = b6.getDeclaringClass();
            l0.h(declaringClass, ProtectedSandApp.s("鐡"));
            sb.append(declaringClass.getName());
            sb.append(org.apache.commons.io.k.f32026a);
            sb.append(b6.getName());
            sb.append(ProtectedSandApp.s("鐢"));
            KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException(sb.toString());
            kotlinx.coroutines.q qVar3 = this.f33018a;
            Result.a aVar3 = Result.f27242p;
            qVar3.s(a1.a(kotlinNullPointerException));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: KotlinExtensions.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001J(\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00022\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004H\u0016J \u0010\n\u001a\u00020\u00062\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"retrofit2/l$d", "Lretrofit2/d;", "Lretrofit2/b;", "call", "Lretrofit2/v;", "response", "Lkotlin/m2;", "b", "", "t", "a", "retrofit"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes6.dex */
    public static final class d<T> implements retrofit2.d<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.q f33019a;

        d(kotlinx.coroutines.q qVar) {
            this.f33019a = qVar;
        }

        @Override // retrofit2.d
        public void a(@d5.d retrofit2.b<T> bVar, @d5.d Throwable th) {
            l0.q(bVar, ProtectedSandApp.s("鐣"));
            l0.q(th, ProtectedSandApp.s("鐤"));
            kotlinx.coroutines.q qVar = this.f33019a;
            Result.a aVar = Result.f27242p;
            qVar.s(a1.a(th));
        }

        @Override // retrofit2.d
        public void b(@d5.d retrofit2.b<T> bVar, @d5.d v<T> vVar) {
            l0.q(bVar, ProtectedSandApp.s("鐥"));
            l0.q(vVar, ProtectedSandApp.s("鐦"));
            if (vVar.g()) {
                kotlinx.coroutines.q qVar = this.f33019a;
                T a6 = vVar.a();
                Result.a aVar = Result.f27242p;
                qVar.s(a6);
                return;
            }
            kotlinx.coroutines.q qVar2 = this.f33019a;
            HttpException httpException = new HttpException(vVar);
            Result.a aVar2 = Result.f27242p;
            qVar2.s(a1.a(httpException));
        }
    }

    /* compiled from: KotlinExtensions.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "T", "", "it", "Lkotlin/m2;", "a", "(Ljava/lang/Throwable;)V", "retrofit2/KotlinExtensions$awaitResponse$2$1"}, k = 3, mv = {1, 4, 0})
    /* loaded from: classes6.dex */
    static final class e extends Lambda implements q3.l<Throwable, m2> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ retrofit2.b f33020p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(retrofit2.b bVar) {
            super(1);
            this.f33020p = bVar;
        }

        @Override // q3.l
        public /* bridge */ /* synthetic */ m2 N(Throwable th) {
            a(th);
            return m2.f23662a;
        }

        public final void a(@d5.e Throwable th) {
            this.f33020p.cancel();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: KotlinExtensions.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J$\u0010\u0007\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016J\u001e\u0010\n\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"retrofit2/l$f", "Lretrofit2/d;", "Lretrofit2/b;", "call", "Lretrofit2/v;", "response", "Lkotlin/m2;", "b", "", "t", "a", "retrofit"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes6.dex */
    public static final class f<T> implements retrofit2.d<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.q f33021a;

        f(kotlinx.coroutines.q qVar) {
            this.f33021a = qVar;
        }

        @Override // retrofit2.d
        public void a(@d5.d retrofit2.b<T> bVar, @d5.d Throwable th) {
            l0.q(bVar, ProtectedSandApp.s("鐧"));
            l0.q(th, ProtectedSandApp.s("鐨"));
            kotlinx.coroutines.q qVar = this.f33021a;
            Result.a aVar = Result.f27242p;
            qVar.s(a1.a(th));
        }

        @Override // retrofit2.d
        public void b(@d5.d retrofit2.b<T> bVar, @d5.d v<T> vVar) {
            l0.q(bVar, ProtectedSandApp.s("鐩"));
            l0.q(vVar, ProtectedSandApp.s("鐪"));
            kotlinx.coroutines.q qVar = this.f33021a;
            Result.a aVar = Result.f27242p;
            qVar.s(vVar);
        }
    }

    /* compiled from: KotlinExtensions.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/m2;", "run", "()V", "retrofit2/KotlinExtensions$suspendAndThrow$2$1", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    static final class g implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Continuation f33022o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Exception f33023p;

        g(Continuation continuation, Exception exc) {
            this.f33022o = continuation;
            this.f33023p = exc;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Continuation e6;
            e6 = kotlin.coroutines.intrinsics.c.e(this.f33022o);
            Exception exc = this.f33023p;
            Result.a aVar = Result.f27242p;
            e6.s(a1.a(exc));
        }
    }

    /* compiled from: KotlinExtensions.kt */
    @DebugMetadata(c = "retrofit2.KotlinExtensions", f = "KotlinExtensions.kt", i = {0}, l = {113}, m = "suspendAndThrow", n = {"$this$suspendAndThrow"}, s = {"L$0"})
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00060\u0000j\u0002`\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0080@"}, d2 = {"Ljava/lang/Exception;", "Lkotlin/Exception;", "Lkotlin/coroutines/d;", "", "continuation", "", "suspendAndThrow"}, k = 3, mv = {1, 4, 0})
    /* loaded from: classes6.dex */
    static final class h extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f33024r;

        /* renamed from: s, reason: collision with root package name */
        int f33025s;

        /* renamed from: t, reason: collision with root package name */
        Object f33026t;

        h(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f33024r = obj;
            this.f33025s |= Integer.MIN_VALUE;
            return l.e(null, this);
        }
    }

    @d5.e
    public static final <T> Object a(@d5.d retrofit2.b<T> bVar, @d5.d Continuation<? super T> continuation) {
        Continuation e6;
        e6 = kotlin.coroutines.intrinsics.c.e(continuation);
        kotlinx.coroutines.s sVar = new kotlinx.coroutines.s(e6, 1);
        sVar.K(new a(bVar));
        bVar.y0(new c(sVar));
        Object A = sVar.A();
        if (A == CoroutineSingletons.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        return A;
    }

    @p3.i(name = "awaitNullable")
    @d5.e
    public static final <T> Object b(@d5.d retrofit2.b<T> bVar, @d5.d Continuation<? super T> continuation) {
        Continuation e6;
        e6 = kotlin.coroutines.intrinsics.c.e(continuation);
        kotlinx.coroutines.s sVar = new kotlinx.coroutines.s(e6, 1);
        sVar.K(new b(bVar));
        bVar.y0(new d(sVar));
        Object A = sVar.A();
        if (A == CoroutineSingletons.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        return A;
    }

    @d5.e
    public static final <T> Object c(@d5.d retrofit2.b<T> bVar, @d5.d Continuation<? super v<T>> continuation) {
        Continuation e6;
        e6 = kotlin.coroutines.intrinsics.c.e(continuation);
        kotlinx.coroutines.s sVar = new kotlinx.coroutines.s(e6, 1);
        sVar.K(new e(bVar));
        bVar.y0(new f(sVar));
        Object A = sVar.A();
        if (A == CoroutineSingletons.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        return A;
    }

    public static final <T> T d(@d5.d w wVar) {
        l0.q(wVar, ProtectedSandApp.s("楄"));
        l0.P();
        return (T) wVar.g(Object.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @d5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(@d5.d java.lang.Exception r4, @d5.d kotlin.coroutines.Continuation<?> r5) {
        /*
            boolean r0 = r5 instanceof retrofit2.l.h
            if (r0 == 0) goto L13
            r0 = r5
            retrofit2.l$h r0 = (retrofit2.l.h) r0
            int r1 = r0.f33025s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33025s = r1
            goto L18
        L13:
            retrofit2.l$h r0 = new retrofit2.l$h
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f33024r
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f33025s
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f33026t
            java.lang.Exception r4 = (java.lang.Exception) r4
            kotlin.a1.n(r5)
            kotlin.m2 r4 = kotlin.m2.f23662a
            return r4
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "楅"
            java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        L39:
            kotlin.a1.n(r5)
            r0.f33026t = r4
            r0.f33025s = r3
            kotlinx.coroutines.o0 r5 = kotlinx.coroutines.m1.a()
            kotlin.coroutines.g r2 = r0.getContext()
            retrofit2.l$g r3 = new retrofit2.l$g
            r3.<init>(r0, r4)
            r5.y0(r2, r3)
            kotlin.coroutines.jvm.internal.h.c(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.l.e(java.lang.Exception, kotlin.coroutines.d):java.lang.Object");
    }
}
