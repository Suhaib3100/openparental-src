package kotlin;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Preconditions.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0004\u001a\u001c\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0087\b\u0082\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0087\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001\u001a/\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\u00062\b\u0010\u0002\u001a\u0004\u0018\u0001H\bH\u0087\b\u0082\u0002\n\n\b\b\u0000\u001a\u0004\b\u0003\u0010\u0001¢\u0006\u0002\u0010\t\u001a@\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\u00062\b\u0010\u0002\u001a\u0004\u0018\u0001H\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0000\u001a\u0004\b\u0003\u0010\u0001¢\u0006\u0002\u0010\n\u001a\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H\u0087\b\u001a\u001c\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0087\b\u0082\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001\u001a-\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0087\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001\u001a/\u0010\u000f\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\u00062\b\u0010\u0002\u001a\u0004\u0018\u0001H\bH\u0087\b\u0082\u0002\n\n\b\b\u0000\u001a\u0004\b\u0003\u0010\u0001¢\u0006\u0002\u0010\t\u001a@\u0010\u000f\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\u00062\b\u0010\u0002\u001a\u0004\u0018\u0001H\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0000\u001a\u0004\b\u0003\u0010\u0001¢\u0006\u0002\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0010"}, d2 = {"check", "", "value", "", "lazyMessage", "Lkotlin/Function0;", "", "checkNotNull", "T", "(Ljava/lang/Object;)Ljava/lang/Object;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "error", "", "message", "require", "requireNotNull", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/PreconditionsKt")
@SourceDebugExtension({"SMAP\nPreconditions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Preconditions.kt\nkotlin/PreconditionsKt__PreconditionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,144:1\n1#2:145\n*E\n"})
/* loaded from: classes5.dex */
class u0 extends t0 {
    @InlineOnly
    private static final void c(boolean z5) {
        if (!z5) {
            throw new IllegalStateException(ProtectedSandApp.s("屢").toString());
        }
    }

    @InlineOnly
    private static final void d(boolean z5, q3.a<? extends Object> aVar) {
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("屣"));
        if (!z5) {
            throw new IllegalStateException(aVar.n().toString());
        }
    }

    @InlineOnly
    private static final <T> T e(T t5) {
        if (t5 != null) {
            return t5;
        }
        throw new IllegalStateException(ProtectedSandApp.s("層").toString());
    }

    @InlineOnly
    private static final <T> T f(T t5, q3.a<? extends Object> aVar) {
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("履"));
        if (t5 != null) {
            return t5;
        }
        throw new IllegalStateException(aVar.n().toString());
    }

    @InlineOnly
    private static final Void g(Object obj) {
        kotlin.jvm.internal.l0.p(obj, ProtectedSandApp.s("屦"));
        throw new IllegalStateException(obj.toString());
    }

    @InlineOnly
    private static final void h(boolean z5) {
        if (!z5) {
            throw new IllegalArgumentException(ProtectedSandApp.s("屧").toString());
        }
    }

    @InlineOnly
    private static final void i(boolean z5, q3.a<? extends Object> aVar) {
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("屨"));
        if (!z5) {
            throw new IllegalArgumentException(aVar.n().toString());
        }
    }

    @InlineOnly
    private static final <T> T j(T t5) {
        if (t5 != null) {
            return t5;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("屩").toString());
    }

    @InlineOnly
    private static final <T> T k(T t5, q3.a<? extends Object> aVar) {
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("屪"));
        if (t5 != null) {
            return t5;
        }
        throw new IllegalArgumentException(aVar.n().toString());
    }
}
