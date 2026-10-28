package kotlin.ranges;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.Comparable;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.jvm.internal.l0;

/* compiled from: Ranges.kt */
@c1(version = "1.1")
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bg\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lkotlin/ranges/f;", "", "T", "Lkotlin/ranges/g;", "value", "", "b", "(Ljava/lang/Comparable;)Z", "isEmpty", "()Z", "a", "f", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Z", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface f<T extends Comparable<? super T>> extends g<T> {

    /* compiled from: Ranges.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static <T extends Comparable<? super T>> boolean a(@fg.l f<T> fVar, @fg.l T t4) {
            l0.p(t4, ProtectedSandApp.s("旑\u0001"));
            return fVar.f(fVar.c(), t4) && fVar.f(t4, fVar.h());
        }

        public static <T extends Comparable<? super T>> boolean b(@fg.l f<T> fVar) {
            return !fVar.f(fVar.c(), fVar.h());
        }
    }

    @Override // kotlin.ranges.g
    boolean b(@fg.l T value);

    boolean f(@fg.l T a5, @fg.l T b5);

    @Override // kotlin.ranges.g
    boolean isEmpty();
}
