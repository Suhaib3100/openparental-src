package retrofit2;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.Method;
import kotlin.KotlinNullPointerException;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.k2;
import kotlin.z0;

/* compiled from: KotlinExtensions.kt */
@kd.i(name = "KotlinExtensions")
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u001c\u0010\u0002\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0000*\u00020\u0004*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\b\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0000*\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005H\u0087@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0007\u001a-\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\b\b\u0000\u0010\u0000*\u00020\u0004*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0007\u001a\u001b\u0010\u000e\u001a\u00020\r*\u00060\u000bj\u0002`\fH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"T", "Lretrofit2/y;", "d", "(Lretrofit2/y;)Ljava/lang/Object;", "", "Lretrofit2/b;", "a", "(Lretrofit2/b;Lkotlin/coroutines/d;)Ljava/lang/Object;", "b", "Lretrofit2/x;", "c", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "e", "(Ljava/lang/Exception;Lkotlin/coroutines/d;)Ljava/lang/Object;", "retrofit"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes9.dex */
public final class l {

    /* compiled from: KotlinExtensions.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "T", "", "it", "Lkotlin/k2;", "invoke", "(Ljava/lang/Throwable;)V", "retrofit2/KotlinExtensions$await$2$1", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    static final class a extends n0 implements ld.l<Throwable, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ retrofit2.b f89932b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(retrofit2.b bVar) {
            super(1);
            this.f89932b = bVar;
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Throwable th) {
            invoke2(th);
            return k2.f75408a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@fg.m Throwable th) {
            this.f89932b.cancel();
        }
    }

    /* compiled from: KotlinExtensions.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "T", "", "it", "Lkotlin/k2;", "invoke", "(Ljava/lang/Throwable;)V", "retrofit2/KotlinExtensions$await$4$1", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    static final class b extends n0 implements ld.l<Throwable, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ retrofit2.b f89933b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(retrofit2.b bVar) {
            super(1);
            this.f89933b = bVar;
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Throwable th) {
            invoke2(th);
            return k2.f75408a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@fg.m Throwable th) {
            this.f89933b.cancel();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: KotlinExtensions.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"retrofit2/l$c", "Lretrofit2/d;", "Lretrofit2/b;", "call", "Lretrofit2/x;", "response", "Lkotlin/k2;", "b", "(Lretrofit2/b;Lretrofit2/x;)V", "", "t", "a", "(Lretrofit2/b;Ljava/lang/Throwable;)V", "retrofit"}, k = 1, mv = {1, 4, 0})
    public static final class c<T> implements retrofit2.d<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.p f89934a;

        c(kotlinx.coroutines.p pVar) {
            this.f89934a = pVar;
        }

        @Override // retrofit2.d
        public void a(@fg.l retrofit2.b<T> call, @fg.l Throwable t4) {
            l0.q(call, ProtectedSandApp.s("ꗇ\u0001"));
            l0.q(t4, ProtectedSandApp.s("ꗈ\u0001"));
            kotlinx.coroutines.p pVar = this.f89934a;
            z0.Companion companion = z0.INSTANCE;
            pVar.resumeWith(a1.a(t4));
        }

        @Override // retrofit2.d
        public void b(@fg.l retrofit2.b<T> call, @fg.l x<T> response) {
            l0.q(call, ProtectedSandApp.s("ꗇ\u0001"));
            l0.q(response, ProtectedSandApp.s("ꗉ\u0001"));
            if (!response.g()) {
                kotlinx.coroutines.p pVar = this.f89934a;
                HttpException httpException = new HttpException(response);
                z0.Companion companion = z0.INSTANCE;
                pVar.resumeWith(a1.a(httpException));
                return;
            }
            T a5 = response.a();
            if (a5 != null) {
                kotlinx.coroutines.p pVar2 = this.f89934a;
                z0.Companion companion2 = z0.INSTANCE;
                pVar2.resumeWith(a5);
                return;
            }
            Object p4 = call.h().p(k.class);
            if (p4 == null) {
                l0.L();
            }
            l0.h(p4, ProtectedSandApp.s("ꗊ\u0001"));
            Method b5 = ((k) p4).b();
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ꗋ\u0001"));
            l0.h(b5, ProtectedSandApp.s("ꗌ\u0001"));
            Class<?> declaringClass = b5.getDeclaringClass();
            l0.h(declaringClass, ProtectedSandApp.s("ꗍ\u0001"));
            sb.append(declaringClass.getName());
            sb.append('.');
            sb.append(b5.getName());
            sb.append(ProtectedSandApp.s("ꗎ\u0001"));
            KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException(sb.toString());
            kotlinx.coroutines.p pVar3 = this.f89934a;
            z0.Companion companion3 = z0.INSTANCE;
            pVar3.resumeWith(a1.a(kotlinNullPointerException));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: KotlinExtensions.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001J/\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00022\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000b\u001a\u00020\u00062\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"retrofit2/l$d", "Lretrofit2/d;", "Lretrofit2/b;", "call", "Lretrofit2/x;", "response", "Lkotlin/k2;", "b", "(Lretrofit2/b;Lretrofit2/x;)V", "", "t", "a", "(Lretrofit2/b;Ljava/lang/Throwable;)V", "retrofit"}, k = 1, mv = {1, 4, 0})
    public static final class d<T> implements retrofit2.d<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.p f89935a;

        d(kotlinx.coroutines.p pVar) {
            this.f89935a = pVar;
        }

        @Override // retrofit2.d
        public void a(@fg.l retrofit2.b<T> call, @fg.l Throwable t4) {
            l0.q(call, ProtectedSandApp.s("ꗏ\u0001"));
            l0.q(t4, ProtectedSandApp.s("ꗐ\u0001"));
            kotlinx.coroutines.p pVar = this.f89935a;
            z0.Companion companion = z0.INSTANCE;
            pVar.resumeWith(a1.a(t4));
        }

        @Override // retrofit2.d
        public void b(@fg.l retrofit2.b<T> call, @fg.l x<T> response) {
            l0.q(call, ProtectedSandApp.s("ꗏ\u0001"));
            l0.q(response, ProtectedSandApp.s("ꗑ\u0001"));
            if (response.g()) {
                kotlinx.coroutines.p pVar = this.f89935a;
                T a5 = response.a();
                z0.Companion companion = z0.INSTANCE;
                pVar.resumeWith(a5);
                return;
            }
            kotlinx.coroutines.p pVar2 = this.f89935a;
            HttpException httpException = new HttpException(response);
            z0.Companion companion2 = z0.INSTANCE;
            pVar2.resumeWith(a1.a(httpException));
        }
    }

    /* compiled from: KotlinExtensions.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "T", "", "it", "Lkotlin/k2;", "invoke", "(Ljava/lang/Throwable;)V", "retrofit2/KotlinExtensions$awaitResponse$2$1", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    static final class e extends n0 implements ld.l<Throwable, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ retrofit2.b f89936b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(retrofit2.b bVar) {
            super(1);
            this.f89936b = bVar;
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Throwable th) {
            invoke2(th);
            return k2.f75408a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@fg.m Throwable th) {
            this.f89936b.cancel();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: KotlinExtensions.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"retrofit2/l$f", "Lretrofit2/d;", "Lretrofit2/b;", "call", "Lretrofit2/x;", "response", "Lkotlin/k2;", "b", "(Lretrofit2/b;Lretrofit2/x;)V", "", "t", "a", "(Lretrofit2/b;Ljava/lang/Throwable;)V", "retrofit"}, k = 1, mv = {1, 4, 0})
    public static final class f<T> implements retrofit2.d<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.p f89937a;

        f(kotlinx.coroutines.p pVar) {
            this.f89937a = pVar;
        }

        @Override // retrofit2.d
        public void a(@fg.l retrofit2.b<T> call, @fg.l Throwable t4) {
            l0.q(call, ProtectedSandApp.s("ꗒ\u0001"));
            l0.q(t4, ProtectedSandApp.s("ꗓ\u0001"));
            kotlinx.coroutines.p pVar = this.f89937a;
            z0.Companion companion = z0.INSTANCE;
            pVar.resumeWith(a1.a(t4));
        }

        @Override // retrofit2.d
        public void b(@fg.l retrofit2.b<T> call, @fg.l x<T> response) {
            l0.q(call, ProtectedSandApp.s("ꗒ\u0001"));
            l0.q(response, ProtectedSandApp.s("ꗔ\u0001"));
            kotlinx.coroutines.p pVar = this.f89937a;
            z0.Companion companion = z0.INSTANCE;
            pVar.resumeWith(response);
        }
    }

    /* compiled from: KotlinExtensions.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/k2;", "run", "()V", "retrofit2/KotlinExtensions$suspendAndThrow$2$1", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    static final class g implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.d f89938b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Exception f89939c;

        g(kotlin.coroutines.d dVar, Exception exc) {
            this.f89938b = dVar;
            this.f89939c = exc;
        }

        @Override // java.lang.Runnable
        public final void run() {
            kotlin.coroutines.d e4 = kotlin.coroutines.intrinsics.b.e(this.f89938b);
            Exception exc = this.f89939c;
            z0.Companion companion = z0.INSTANCE;
            e4.resumeWith(a1.a(exc));
        }
    }

    /* compiled from: KotlinExtensions.kt */
    @kotlin.coroutines.jvm.internal.f(c = "retrofit2.KotlinExtensions", f = "KotlinExtensions.kt", i = {0}, l = {113}, m = "suspendAndThrow", n = {"$this$suspendAndThrow"}, s = {"L$0"})
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00060\u0000j\u0002`\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0080@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ljava/lang/Exception;", "Lkotlin/Exception;", "Lkotlin/coroutines/d;", "", "continuation", "", "suspendAndThrow", "(Ljava/lang/Exception;Lkotlin/coroutines/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 0})
    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f89940b;

        /* renamed from: c, reason: collision with root package name */
        int f89941c;

        /* renamed from: d, reason: collision with root package name */
        Object f89942d;

        h(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f89940b = obj;
            this.f89941c |= Integer.MIN_VALUE;
            return l.e(null, this);
        }
    }

    @fg.m
    public static final <T> Object a(@fg.l retrofit2.b<T> bVar, @fg.l kotlin.coroutines.d<? super T> dVar) {
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        qVar.k0(new a(bVar));
        bVar.O0(new c(qVar));
        Object y4 = qVar.y();
        if (y4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y4;
    }

    @fg.m
    @kd.i(name = "awaitNullable")
    public static final <T> Object b(@fg.l retrofit2.b<T> bVar, @fg.l kotlin.coroutines.d<? super T> dVar) {
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        qVar.k0(new b(bVar));
        bVar.O0(new d(qVar));
        Object y4 = qVar.y();
        if (y4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y4;
    }

    @fg.m
    public static final <T> Object c(@fg.l retrofit2.b<T> bVar, @fg.l kotlin.coroutines.d<? super x<T>> dVar) {
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        qVar.k0(new e(bVar));
        bVar.O0(new f(qVar));
        Object y4 = qVar.y();
        if (y4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y4;
    }

    public static final <T> T d(@fg.l y yVar) {
        l0.q(yVar, ProtectedSandApp.s("ꗕ\u0001"));
        l0.P();
        return (T) yVar.g(Object.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(@fg.l java.lang.Exception r4, @fg.l kotlin.coroutines.d<?> r5) {
        /*
            boolean r0 = r5 instanceof retrofit2.l.h
            if (r0 == 0) goto L13
            r0 = r5
            retrofit2.l$h r0 = (retrofit2.l.h) r0
            int r1 = r0.f89941c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f89941c = r1
            goto L18
        L13:
            retrofit2.l$h r0 = new retrofit2.l$h
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f89940b
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f89941c
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f89942d
            java.lang.Exception r4 = (java.lang.Exception) r4
            kotlin.a1.n(r5)
            kotlin.k2 r4 = kotlin.k2.f75408a
            return r4
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "ꗖ\u0001"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        L39:
            kotlin.a1.n(r5)
            r0.f89942d = r4
            r0.f89941c = r3
            kotlinx.coroutines.m0 r5 = kotlinx.coroutines.j1.a()
            kotlin.coroutines.g r2 = r0.getF75269b()
            retrofit2.l$g r3 = new retrofit2.l$g
            r3.<init>(r0, r4)
            r5.S0(r2, r3)
            kotlin.coroutines.jvm.internal.h.c(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.l.e(java.lang.Exception, kotlin.coroutines.d):java.lang.Object");
    }
}
