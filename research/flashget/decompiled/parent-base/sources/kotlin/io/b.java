package kotlin.io;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.jvm.internal.l0;
import kotlin.w0;

/* compiled from: Closeable.kt */
@kd.i(name = "CloseableKt")
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aJ\u0010\u0005\u001a\u00028\u0001\"\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u0000\"\u0004\b\u0001\u0010\u0002*\u00028\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\n\u001a\u00020\t*\u0004\u0018\u00010\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f"}, d2 = {"Ljava/io/Closeable;", "T", "R", "Lkotlin/Function1;", "block", "b", "(Ljava/io/Closeable;Lld/l;)Ljava/lang/Object;", "", "cause", "Lkotlin/k2;", "a", "(Ljava/io/Closeable;Ljava/lang/Throwable;)V", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class b {
    @c1(version = "1.1")
    @w0
    public static final void a(@fg.m Closeable closeable, @fg.m Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                kotlin.o.a(th, th2);
            }
        }
    }

    @kotlin.internal.f
    private static final <T extends Closeable, R> R b(T t4, ld.l<? super T, ? extends R> lVar) {
        l0.p(lVar, ProtectedSandApp.s("推\u0001"));
        try {
            R invoke = lVar.invoke(t4);
            if (kotlin.internal.m.a(1, 1, 0)) {
                a(t4, null);
            } else if (t4 != null) {
                t4.close();
            }
            return invoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (kotlin.internal.m.a(1, 1, 0)) {
                    a(t4, th);
                } else if (t4 != null) {
                    try {
                        t4.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th2;
            }
        }
    }
}
