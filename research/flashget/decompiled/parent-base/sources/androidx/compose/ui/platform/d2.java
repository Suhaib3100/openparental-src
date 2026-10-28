package androidx.compose.ui.platform;

import java.util.Arrays;
import kotlin.Metadata;

/* compiled from: JvmActuals.jvm.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0006\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a,\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0081\b¢\u0006\u0004\b\f\u0010\r*\f\b\u0000\u0010\u000f\"\u00020\u000e2\u00020\u000e¨\u0006\u0010"}, d2 = {"", "obj", "", "name", "b", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;", "a", "(Ljava/lang/Object;)Ljava/lang/Object;", "R", "lock", "Lkotlin/Function0;", "block", "c", "(Ljava/lang/Object;Lld/a;)Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicInteger;", "AtomicInt", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d2 {
    @fg.l
    public static final Object a(@fg.l Object obj) {
        return obj.getClass();
    }

    @fg.l
    public static final String b(@fg.l Object obj, @fg.m String str) {
        if (str == null) {
            str = obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('@');
        kotlin.jvm.internal.t1 t1Var = kotlin.jvm.internal.t1.f75371a;
        String format = String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
        kotlin.jvm.internal.l0.o(format, "format(format, *args)");
        sb.append(format);
        return sb.toString();
    }

    @kotlin.w0
    public static final <R> R c(@fg.l Object obj, @fg.l ld.a<? extends R> aVar) {
        R invoke;
        synchronized (obj) {
            invoke = aVar.invoke();
        }
        return invoke;
    }
}
