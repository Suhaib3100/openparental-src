package kotlin;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: Synchronized.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a<\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007"}, d2 = {"R", "", "lock", "Lkotlin/Function0;", "block", "l", "(Ljava/lang/Object;Lld/a;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/StandardKt")
/* loaded from: classes7.dex */
class f1 extends e1 {
    @kotlin.internal.f
    private static final <R> R l(Object obj, ld.a<? extends R> aVar) {
        R invoke;
        kotlin.jvm.internal.l0.p(obj, ProtectedSandApp.s("捊\u0001"));
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("捋\u0001"));
        synchronized (obj) {
            invoke = aVar.invoke();
        }
        return invoke;
    }
}
