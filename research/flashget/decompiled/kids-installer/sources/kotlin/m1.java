package kotlin;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;

/* compiled from: Tuples.kt */
@p3.i(name = "TuplesKt")
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u001a2\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0002H\u00022\u0006\u0010\u0004\u001a\u0002H\u0003H\u0086\u0004¢\u0006\u0002\u0010\u0005\u001a\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b*\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\b0\u0001\u001a(\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b*\u0014\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\b0\t¨\u0006\n"}, d2 = {"to", "Lkotlin/Pair;", "A", "B", "that", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;", "toList", "", "T", "Lkotlin/Triple;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class m1 {
    @d5.d
    public static final <A, B> Pair<A, B> a(A a6, B b6) {
        return new Pair<>(a6, b6);
    }

    @d5.d
    public static final <T> List<T> b(@d5.d Pair<? extends T, ? extends T> pair) {
        List<T> O;
        kotlin.jvm.internal.l0.p(pair, ProtectedSandApp.s("䆛"));
        O = kotlin.collections.a0.O(pair.e(), pair.f());
        return O;
    }

    @d5.d
    public static final <T> List<T> c(@d5.d Triple<? extends T, ? extends T, ? extends T> triple) {
        List<T> O;
        kotlin.jvm.internal.l0.p(triple, ProtectedSandApp.s("䆜"));
        O = kotlin.collections.a0.O(triple.f(), triple.g(), triple.h());
        return O;
    }
}
