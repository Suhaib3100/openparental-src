package kotlin;

@Metadata(d1 = {"kotlin/LazyKt__LazyJVMKt", "kotlin/LazyKt__LazyKt"}, k = 4, mv = {1, 9, 0}, xi = 49)
/* loaded from: classes6.dex */
public final class c0 extends e0 {
    private c0() {
    }

    @d5.d
    public static Lazy e(Object obj) {
        return new InitializedLazyImpl(obj);
    }
}
