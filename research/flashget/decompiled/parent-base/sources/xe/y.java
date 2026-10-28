package xe;

import java.lang.Throwable;
import java.util.Objects;

/* compiled from: FailableBiConsumer.java */
@FunctionalInterface
/* loaded from: classes6.dex */
public interface y<T, U, E extends Throwable> {

    /* renamed from: a, reason: collision with root package name */
    public static final y f93083a = new w();

    static <T, U, E extends Throwable> y<T, U, E> a() {
        return f93083a;
    }

    private static /* synthetic */ void b(Object obj, Object obj2) throws Throwable {
    }

    static /* synthetic */ void e(Object obj, Object obj2) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default void f(y yVar, Object obj, Object obj2) throws Throwable {
        accept(obj, obj2);
        yVar.accept(obj, obj2);
    }

    void accept(T t4, U u4) throws Throwable;

    default y<T, U, E> d(final y<? super T, ? super U, E> yVar) {
        Objects.requireNonNull(yVar);
        return new y() { // from class: xe.x
            @Override // xe.y
            public final void accept(Object obj, Object obj2) {
                y.this.f(yVar, obj, obj2);
            }
        };
    }
}
