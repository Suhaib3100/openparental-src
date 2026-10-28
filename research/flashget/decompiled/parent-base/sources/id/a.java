package id;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.m;
import kd.i;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.internal.f;
import kotlin.jvm.internal.l0;
import kotlin.o;
import kotlin.w0;
import ld.l;

/* compiled from: AutoCloseableJVM.kt */
@i(name = "AutoCloseableKt")
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aJ\u0010\u0005\u001a\u00028\u0001\"\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u0000\"\u0004\b\u0001\u0010\u0002*\u00028\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\n\u001a\u00020\t*\u0004\u0018\u00010\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f"}, d2 = {"Ljava/lang/AutoCloseable;", "T", "R", "Lkotlin/Function1;", "block", "b", "(Ljava/lang/AutoCloseable;Lld/l;)Ljava/lang/Object;", "", "cause", "Lkotlin/k2;", "a", "(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V", "kotlin-stdlib-jdk7"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class a {
    @c1(version = "1.2")
    @w0
    public static final void a(@m AutoCloseable autoCloseable, @m Throwable th) {
        if (autoCloseable != null) {
            if (th == null) {
                autoCloseable.close();
                return;
            }
            try {
                autoCloseable.close();
            } catch (Throwable th2) {
                o.a(th, th2);
            }
        }
    }

    @c1(version = "1.2")
    @f
    private static final <T extends AutoCloseable, R> R b(T t4, l<? super T, ? extends R> lVar) {
        l0.p(lVar, ProtectedSandApp.s("恒\u0001"));
        try {
            R invoke = lVar.invoke(t4);
            a(t4, null);
            return invoke;
        } finally {
        }
    }
}
