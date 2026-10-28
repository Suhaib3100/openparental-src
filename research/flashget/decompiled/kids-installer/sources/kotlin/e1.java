package kotlin;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.internal.InlineOnly;

/* compiled from: Standard.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\t\u0010\u0000\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0087\b\u001a3\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\tH\u0087\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002\u001a2\u0010\n\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\rH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u000e\u001aK\u0010\u000f\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u0010\"\u0004\b\u0001\u0010\u000b2\u0006\u0010\u0011\u001a\u0002H\u00102\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u000b0\t¢\u0006\u0002\b\u0012H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0002\u0010\u0013\u001a<\u0010\u0014\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u0010*\u0002H\u00102\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u00020\u00050\tH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u0013\u001aA\u0010\u0015\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u0010*\u0002H\u00102\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0002\b\u0012H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u0013\u001aB\u0010\u0016\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u0010\"\u0004\b\u0001\u0010\u000b*\u0002H\u00102\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u000b0\tH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u0013\u001aG\u0010\n\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u0010\"\u0004\b\u0001\u0010\u000b*\u0002H\u00102\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u000b0\t¢\u0006\u0002\b\u0012H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u0013\u001a>\u0010\u0017\u001a\u0004\u0018\u0001H\u0010\"\u0004\b\u0000\u0010\u0010*\u0002H\u00102\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u00020\u00190\tH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u0013\u001a>\u0010\u001a\u001a\u0004\u0018\u0001H\u0010\"\u0004\b\u0000\u0010\u0010*\u0002H\u00102\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u00020\u00190\tH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001b"}, d2 = {"TODO", "", "reason", "", "repeat", "", "times", "", "action", "Lkotlin/Function1;", "run", "R", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "with", "T", "receiver", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "also", "apply", "let", "takeIf", "predicate", "", "takeUnless", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/StandardKt")
/* loaded from: classes5.dex */
class e1 {
    /* JADX WARN: Multi-variable type inference failed */
    @InlineOnly
    private static final Void a() {
        throw new NotImplementedError(null, 1, 0 == true ? 1 : 0);
    }

    @InlineOnly
    private static final Void b(String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("㼌"));
        throw new NotImplementedError(androidx.constraintlayout.motion.widget.g.a(ProtectedSandApp.s("㼍"), str));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <T> T c(T t5, q3.l<? super T, m2> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("㼎"));
        lVar.N(t5);
        return t5;
    }

    @InlineOnly
    private static final <T> T d(T t5, q3.l<? super T, m2> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("㼏"));
        lVar.N(t5);
        return t5;
    }

    @InlineOnly
    private static final <T, R> R e(T t5, q3.l<? super T, ? extends R> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("㼐"));
        return lVar.N(t5);
    }

    @InlineOnly
    private static final void f(int i5, q3.l<? super Integer, m2> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("㼑"));
        for (int i6 = 0; i6 < i5; i6++) {
            lVar.N(Integer.valueOf(i6));
        }
    }

    @InlineOnly
    private static final <T, R> R g(T t5, q3.l<? super T, ? extends R> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("㼒"));
        return lVar.N(t5);
    }

    @InlineOnly
    private static final <R> R h(q3.a<? extends R> aVar) {
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("㼓"));
        return aVar.n();
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <T> T i(T t5, q3.l<? super T, Boolean> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("㼔"));
        if (lVar.N(t5).booleanValue()) {
            return t5;
        }
        return null;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <T> T j(T t5, q3.l<? super T, Boolean> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("㼕"));
        if (lVar.N(t5).booleanValue()) {
            return null;
        }
        return t5;
    }

    @InlineOnly
    private static final <T, R> R k(T t5, q3.l<? super T, ? extends R> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("㼖"));
        return lVar.N(t5);
    }
}
