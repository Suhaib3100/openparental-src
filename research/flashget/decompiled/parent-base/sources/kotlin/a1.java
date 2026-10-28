package kotlin;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.z0;

/* compiled from: Result.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0087\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001aB\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\t*\u00028\u00002\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f¢\u0006\u0002\b\u0010H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a \u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0087\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a]\u0010\u0018\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t\"\b\b\u0001\u0010\u000e*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00052!\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0001\u0012\u0004\u0012\u00028\u00000\u000fH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\u0018\u0010\u0012\u001a2\u0010\u001a\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t\"\b\b\u0001\u0010\u000e*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\u0019\u001a\u00028\u0000H\u0087\b¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0086\u0001\u0010\u001e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\u000e*\b\u0012\u0004\u0012\u00028\u00010\u00052!\u0010\u001d\u001a\u001d\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00028\u00000\u000f2!\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0001\u0012\u0004\u0012\u00028\u00000\u000fH\u0087\bø\u0001\u0000\u0082\u0002\u0014\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a_\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\u000e*\b\u0012\u0004\u0012\u00028\u00010\u00052!\u0010 \u001a\u001d\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00028\u00000\u000fH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b!\u0010\u0012\u001aR\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\u000e*\b\u0012\u0004\u0012\u00028\u00010\u00052!\u0010 \u001a\u001d\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00028\u00000\u000fH\u0087\bø\u0001\u0000¢\u0006\u0004\b\"\u0010\u0012\u001ac\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\t\"\b\b\u0001\u0010\u000e*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00052!\u0010 \u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0001\u0012\u0004\u0012\u00028\u00000\u000fH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b#\u0010\u0012\u001aV\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\t\"\b\b\u0001\u0010\u000e*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00052!\u0010 \u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0001\u0012\u0004\u0012\u00028\u00000\u000fH\u0087\bø\u0001\u0000¢\u0006\u0004\b$\u0010\u0012\u001aY\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u00028\u00000\u00052!\u0010%\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0001\u0012\u0004\u0012\u00020\u00060\u000fH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b&\u0010\u0012\u001aY\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u00028\u00000\u00052!\u0010%\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00060\u000fH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b'\u0010\u0012\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006("}, d2 = {"", "exception", "", "a", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "Lkotlin/z0;", "Lkotlin/k2;", "n", "(Ljava/lang/Object;)V", "R", "Lkotlin/Function0;", "block", "m", "(Lld/a;)Ljava/lang/Object;", "T", "Lkotlin/Function1;", "Lkotlin/u;", "l", "(Ljava/lang/Object;Lld/l;)Ljava/lang/Object;", "e", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/r0;", "name", "onFailure", "d", "defaultValue", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "value", "onSuccess", "b", "(Ljava/lang/Object;Lld/l;Lld/l;)Ljava/lang/Object;", "transform", "f", "g", "j", "k", "action", "h", "i", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Result.kt\nkotlin/ResultKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,340:1\n1#2:341\n*E\n"})
/* loaded from: classes7.dex */
public final class a1 {
    @fg.l
    @c1(version = "1.3")
    @w0
    public static final Object a(@fg.l Throwable th) {
        kotlin.jvm.internal.l0.p(th, ProtectedSandApp.s("恽\u0001"));
        return new z0.b(th);
    }

    @c1(version = "1.3")
    @kotlin.internal.f
    private static final <R, T> R b(Object obj, ld.l<? super T, ? extends R> lVar, ld.l<? super Throwable, ? extends R> lVar2) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("恾\u0001"));
        kotlin.jvm.internal.l0.p(lVar2, ProtectedSandApp.s("恿\u0001"));
        Throwable e4 = z0.e(obj);
        return e4 == null ? lVar.invoke(obj) : lVar2.invoke(e4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @c1(version = "1.3")
    @kotlin.internal.f
    private static final <R, T extends R> R c(Object obj, R r4) {
        return z0.i(obj) ? r4 : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @c1(version = "1.3")
    @kotlin.internal.f
    private static final <R, T extends R> R d(Object obj, ld.l<? super Throwable, ? extends R> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("恿\u0001"));
        Throwable e4 = z0.e(obj);
        return e4 == null ? obj : lVar.invoke(e4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @c1(version = "1.3")
    @kotlin.internal.f
    private static final <T> T e(Object obj) {
        n(obj);
        return obj;
    }

    @c1(version = "1.3")
    @kotlin.internal.f
    private static final <R, T> Object f(Object obj, ld.l<? super T, ? extends R> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("悀\u0001"));
        if (!z0.j(obj)) {
            return obj;
        }
        z0.Companion companion = z0.INSTANCE;
        return lVar.invoke(obj);
    }

    @c1(version = "1.3")
    @kotlin.internal.f
    private static final <R, T> Object g(Object obj, ld.l<? super T, ? extends R> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("悀\u0001"));
        if (!z0.j(obj)) {
            return obj;
        }
        try {
            z0.Companion companion = z0.INSTANCE;
            return lVar.invoke(obj);
        } catch (Throwable th) {
            z0.Companion companion2 = z0.INSTANCE;
            return a(th);
        }
    }

    @c1(version = "1.3")
    @kotlin.internal.f
    private static final <T> Object h(Object obj, ld.l<? super Throwable, k2> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("悁\u0001"));
        Throwable e4 = z0.e(obj);
        if (e4 != null) {
            lVar.invoke(e4);
        }
        return obj;
    }

    @c1(version = "1.3")
    @kotlin.internal.f
    private static final <T> Object i(Object obj, ld.l<? super T, k2> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("悁\u0001"));
        if (z0.j(obj)) {
            lVar.invoke(obj);
        }
        return obj;
    }

    @c1(version = "1.3")
    @kotlin.internal.f
    private static final <R, T extends R> Object j(Object obj, ld.l<? super Throwable, ? extends R> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("悀\u0001"));
        Throwable e4 = z0.e(obj);
        if (e4 == null) {
            return obj;
        }
        z0.Companion companion = z0.INSTANCE;
        return lVar.invoke(e4);
    }

    @c1(version = "1.3")
    @kotlin.internal.f
    private static final <R, T extends R> Object k(Object obj, ld.l<? super Throwable, ? extends R> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("悀\u0001"));
        Throwable e4 = z0.e(obj);
        if (e4 == null) {
            return obj;
        }
        try {
            z0.Companion companion = z0.INSTANCE;
            return lVar.invoke(e4);
        } catch (Throwable th) {
            z0.Companion companion2 = z0.INSTANCE;
            return a(th);
        }
    }

    @c1(version = "1.3")
    @kotlin.internal.f
    private static final <T, R> Object l(T t4, ld.l<? super T, ? extends R> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("悂\u0001"));
        try {
            z0.Companion companion = z0.INSTANCE;
            return lVar.invoke(t4);
        } catch (Throwable th) {
            z0.Companion companion2 = z0.INSTANCE;
            return a(th);
        }
    }

    @c1(version = "1.3")
    @kotlin.internal.f
    private static final <R> Object m(ld.a<? extends R> aVar) {
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("悂\u0001"));
        try {
            z0.Companion companion = z0.INSTANCE;
            return aVar.invoke();
        } catch (Throwable th) {
            z0.Companion companion2 = z0.INSTANCE;
            return a(th);
        }
    }

    @c1(version = "1.3")
    @w0
    public static final void n(@fg.l Object obj) {
        if (obj instanceof z0.b) {
            throw ((z0.b) obj).exception;
        }
    }
}
