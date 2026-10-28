package kotlin;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: Standard.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u0010\u0010\u0001\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a4\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\n\u0010\u000b\u001aI\u0010\u000f\u001a\u00028\u0001\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\u0007*\u00028\u00002\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001aM\u0010\u0012\u001a\u00028\u0001\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\u00072\u0006\u0010\u0011\u001a\u00028\u00002\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0012\u0010\u0010\u001aC\u0010\u0014\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f*\u00028\u00002\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\r¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0014\u0010\u0010\u001a>\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f*\u00028\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\rH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0015\u0010\u0010\u001aD\u0010\u0016\u001a\u00028\u0001\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\u0007*\u00028\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\rH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0016\u0010\u0010\u001a@\u0010\u0019\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f*\u00028\u00002\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\rH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0019\u0010\u0010\u001a@\u0010\u001a\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f*\u00028\u00002\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\rH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u001a\u0010\u0010\u001a:\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001b2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00130\rH\u0087\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006 "}, d2 = {"", "a", "()Ljava/lang/Void;", "", "reason", "b", "(Ljava/lang/String;)Ljava/lang/Void;", "R", "Lkotlin/Function0;", "block", "h", "(Lld/a;)Ljava/lang/Object;", "T", "Lkotlin/Function1;", "Lkotlin/u;", "g", "(Ljava/lang/Object;Lld/l;)Ljava/lang/Object;", "receiver", "k", "Lkotlin/k2;", "d", "c", "e", "", "predicate", "i", "j", "", "times", "action", "f", "(ILld/l;)V", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/StandardKt")
/* loaded from: classes7.dex */
class e1 {
    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.internal.f
    private static final Void a() {
        throw new g0(null, 1, 0 == true ? 1 : 0);
    }

    @kotlin.internal.f
    private static final Void b(String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("捅\u0001"));
        throw new g0(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("捆\u0001"), str));
    }

    @c1(version = "1.1")
    @kotlin.internal.f
    private static final <T> T c(T t4, ld.l<? super T, k2> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("捇\u0001"));
        lVar.invoke(t4);
        return t4;
    }

    @kotlin.internal.f
    private static final <T> T d(T t4, ld.l<? super T, k2> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("捇\u0001"));
        lVar.invoke(t4);
        return t4;
    }

    @kotlin.internal.f
    private static final <T, R> R e(T t4, ld.l<? super T, ? extends R> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("捇\u0001"));
        return lVar.invoke(t4);
    }

    @kotlin.internal.f
    private static final void f(int i4, ld.l<? super Integer, k2> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("捈\u0001"));
        for (int i5 = 0; i5 < i4; i5++) {
            lVar.invoke(Integer.valueOf(i5));
        }
    }

    @kotlin.internal.f
    private static final <T, R> R g(T t4, ld.l<? super T, ? extends R> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("捇\u0001"));
        return lVar.invoke(t4);
    }

    @kotlin.internal.f
    private static final <R> R h(ld.a<? extends R> aVar) {
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("捇\u0001"));
        return aVar.invoke();
    }

    @c1(version = "1.1")
    @kotlin.internal.f
    private static final <T> T i(T t4, ld.l<? super T, Boolean> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("捉\u0001"));
        if (lVar.invoke(t4).booleanValue()) {
            return t4;
        }
        return null;
    }

    @c1(version = "1.1")
    @kotlin.internal.f
    private static final <T> T j(T t4, ld.l<? super T, Boolean> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("捉\u0001"));
        if (lVar.invoke(t4).booleanValue()) {
            return null;
        }
        return t4;
    }

    @kotlin.internal.f
    private static final <T, R> R k(T t4, ld.l<? super T, ? extends R> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("捇\u0001"));
        return lVar.invoke(t4);
    }
}
