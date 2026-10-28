package kotlin.ranges;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.Comparable;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: Range.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\bf\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u000f"}, d2 = {"Lkotlin/ranges/g;", "", "T", "", "value", "", "b", "(Ljava/lang/Comparable;)Z", "isEmpty", "()Z", "c", "()Ljava/lang/Comparable;", "start", "h", "endInclusive", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface g<T extends Comparable<? super T>> {

    /* compiled from: Range.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static <T extends Comparable<? super T>> boolean a(@fg.l g<T> gVar, @fg.l T t4) {
            l0.p(t4, ProtectedSandApp.s("旒\u0001"));
            return t4.compareTo(gVar.c()) >= 0 && t4.compareTo(gVar.h()) <= 0;
        }

        public static <T extends Comparable<? super T>> boolean b(@fg.l g<T> gVar) {
            return gVar.c().compareTo(gVar.h()) > 0;
        }
    }

    boolean b(@fg.l T value);

    @fg.l
    T c();

    @fg.l
    T h();

    boolean isEmpty();
}
