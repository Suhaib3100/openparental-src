package androidx.compose.runtime;

import java.util.List;
import kotlin.Metadata;

/* compiled from: Composer.kt */
@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u0091\u00012\u00020\u0001:\u0002\u0091\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H'¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0004H'¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0004H'¢\u0006\u0004\b\u000e\u0010\bJ\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0011H'¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0017\u001a\u00020\u00042\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u001d\u001a\u00020\u00042\u001a\u0010\u001c\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a0\u0019H'¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fH&¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH&¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0004H&¢\u0006\u0004\b%\u0010\bJ\u000f\u0010&\u001a\u00020\u0004H'¢\u0006\u0004\b&\u0010\bJ\u0017\u0010)\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'H'¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0004H'¢\u0006\u0004\b+\u0010\bJ\u000f\u0010,\u001a\u00020\u0004H'¢\u0006\u0004\b,\u0010\bJ\u000f\u0010-\u001a\u00020\u0004H'¢\u0006\u0004\b-\u0010\bJ#\u00100\u001a\u00020\u0004\"\u0004\b\u0000\u0010\r2\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000.H'¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0004H'¢\u0006\u0004\b2\u0010\bJ\u000f\u00103\u001a\u00020\u0004H'¢\u0006\u0004\b3\u0010\bJ!\u00104\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b4\u0010\u000bJ\u000f\u00105\u001a\u00020\u0004H'¢\u0006\u0004\b5\u0010\bJ\u000f\u00106\u001a\u00020\u0004H'¢\u0006\u0004\b6\u0010\bJ\u000f\u00107\u001a\u00020\u0004H'¢\u0006\u0004\b7\u0010\bJ\u0017\u00109\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u0002H'¢\u0006\u0004\b9\u0010\u0006JB\u0010>\u001a\u00020\u0004\"\u0004\b\u0000\u0010:\"\u0004\b\u0001\u0010\r2\u0006\u0010\u0015\u001a\u00028\u00002\u001d\u0010=\u001a\u0019\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040;¢\u0006\u0002\b<H'¢\u0006\u0004\b>\u0010?J#\u0010B\u001a\u00020\u00012\b\u0010@\u001a\u0004\u0018\u00010\u00012\b\u0010A\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\bB\u0010CJ\u0011\u0010D\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\bD\u0010EJ\u0019\u0010F\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\bF\u0010GJ\u0019\u0010H\u001a\u00020'2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\bH\u0010IJ\u0017\u0010J\u001a\u00020'2\u0006\u0010\u0015\u001a\u00020'H\u0017¢\u0006\u0004\bJ\u0010KJ\u0017\u0010M\u001a\u00020'2\u0006\u0010\u0015\u001a\u00020LH\u0017¢\u0006\u0004\bM\u0010NJ\u0017\u0010P\u001a\u00020'2\u0006\u0010\u0015\u001a\u00020OH\u0017¢\u0006\u0004\bP\u0010QJ\u0017\u0010S\u001a\u00020'2\u0006\u0010\u0015\u001a\u00020RH\u0017¢\u0006\u0004\bS\u0010TJ\u0017\u0010U\u001a\u00020'2\u0006\u0010\u0015\u001a\u00020\u0002H\u0017¢\u0006\u0004\bU\u0010VJ\u0017\u0010X\u001a\u00020'2\u0006\u0010\u0015\u001a\u00020WH\u0017¢\u0006\u0004\bX\u0010YJ\u0017\u0010[\u001a\u00020'2\u0006\u0010\u0015\u001a\u00020ZH\u0017¢\u0006\u0004\b[\u0010\\J\u0017\u0010^\u001a\u00020'2\u0006\u0010\u0015\u001a\u00020]H\u0017¢\u0006\u0004\b^\u0010_J\u0019\u0010`\u001a\u00020'2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0017¢\u0006\u0004\b`\u0010IJ\u0017\u0010c\u001a\u00020\u00042\u0006\u0010b\u001a\u00020aH'¢\u0006\u0004\bc\u0010dJ\u001d\u0010f\u001a\u00020\u00042\f\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00040.H'¢\u0006\u0004\bf\u00101J#\u0010h\u001a\u00028\u0000\"\u0004\b\u0000\u0010\r2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000gH'¢\u0006\u0004\bh\u0010iJ#\u0010m\u001a\u00020\u00042\u0012\u0010l\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030k0jH'¢\u0006\u0004\bm\u0010nJ\u000f\u0010o\u001a\u00020\u0004H'¢\u0006\u0004\bo\u0010\bJ\u001b\u0010p\u001a\u00020\u00042\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030kH'¢\u0006\u0004\bp\u0010qJ\u000f\u0010r\u001a\u00020\u0004H'¢\u0006\u0004\br\u0010\bJ\u000f\u0010s\u001a\u00020\u0004H&¢\u0006\u0004\bs\u0010\bJ\u000f\u0010u\u001a\u00020tH'¢\u0006\u0004\bu\u0010vJ\u000f\u0010w\u001a\u00020\u0004H'¢\u0006\u0004\bw\u0010\bR\u001e\u0010|\u001a\u0006\u0012\u0002\b\u00030x8&X§\u0004¢\u0006\f\u0012\u0004\b{\u0010\b\u001a\u0004\by\u0010zR\u001b\u0010\u0080\u0001\u001a\u00020'8&X§\u0004¢\u0006\f\u0012\u0004\b\u007f\u0010\b\u001a\u0004\b}\u0010~R\u001d\u0010\u0083\u0001\u001a\u00020'8&X§\u0004¢\u0006\u000e\u0012\u0005\b\u0082\u0001\u0010\b\u001a\u0005\b\u0081\u0001\u0010~R\u001d\u0010\u0086\u0001\u001a\u00020'8&X§\u0004¢\u0006\u000e\u0012\u0005\b\u0085\u0001\u0010\b\u001a\u0005\b\u0084\u0001\u0010~R\u001f\u0010\u0089\u0001\u001a\u0004\u0018\u00010a8&X§\u0004¢\u0006\u000e\u0012\u0004\b:\u0010\b\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u00018&X§\u0004¢\u0006\u000e\u0012\u0005\b\u008b\u0001\u0010\b\u001a\u0005\b\u008a\u0001\u0010ER\u001e\u0010\u0090\u0001\u001a\u00020\u00028&X§\u0004¢\u0006\u000f\u0012\u0005\b\u008f\u0001\u0010\b\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001e\u0010\u0093\u0001\u001a\u00020\u00028&X§\u0004¢\u0006\u000f\u0012\u0005\b\u0092\u0001\u0010\b\u001a\u0006\b\u0091\u0001\u0010\u008e\u0001R\u001f\u0010\u0098\u0001\u001a\u00030\u0094\u00018gX§\u0004¢\u0006\u000f\u0012\u0005\b\u0097\u0001\u0010\b\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0018\u0010\u009c\u0001\u001a\u00030\u0099\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0018\u0010 \u0001\u001a\u00030\u009d\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0018\u0010¤\u0001\u001a\u00030¡\u00018gX¦\u0004¢\u0006\b\u001a\u0006\b¢\u0001\u0010£\u0001\u0082\u0001\u0002¥\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006¦\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/t;", "", "", "key", "Lkotlin/k2;", "P", "(I)V", "p0", "()V", "dataKey", "U", "(ILjava/lang/Object;)V", "o0", "T", "I", "o", "(I)Landroidx/compose/runtime/t;", "Landroidx/compose/runtime/t3;", "t", "()Landroidx/compose/runtime/t3;", "Landroidx/compose/runtime/c2;", "value", "parameter", "K", "(Landroidx/compose/runtime/c2;Ljava/lang/Object;)V", "", "Lkotlin/q0;", "Landroidx/compose/runtime/f2;", "references", "q", "(Ljava/util/List;)V", "", "sourceInformation", "b0", "(Ljava/lang/String;)V", "f0", "(ILjava/lang/String;)V", "n0", "d0", "", "changed", "m", "(Z)V", "n", "v", "W", "Lkotlin/Function0;", "factory", "F", "(Lld/a;)V", "C", "H", "Z", "O", "X", "e", "marker", "z", "V", "Lkotlin/Function2;", "Lkotlin/u;", "block", "w", "(Ljava/lang/Object;Lld/p;)V", "left", "right", "u", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Q", "()Ljava/lang/Object;", "E", "(Ljava/lang/Object;)V", "q0", "(Ljava/lang/Object;)Z", "b", "(Z)Z", "", "j", "(C)Z", "", "i", "(B)Z", "", "c", "(S)Z", "f", "(I)Z", "", "d", "(F)Z", "", "g", "(J)Z", "", "k", "(D)Z", "S", "Landroidx/compose/runtime/e3;", "scope", "j0", "(Landroidx/compose/runtime/e3;)V", "effect", "r", "Landroidx/compose/runtime/d0;", "x", "(Landroidx/compose/runtime/d0;)Ljava/lang/Object;", "", "Landroidx/compose/runtime/b3;", "values", "s0", "([Landroidx/compose/runtime/b3;)V", "h0", "Y", "(Landroidx/compose/runtime/b3;)V", "G", "M", "Landroidx/compose/runtime/z;", "m0", "()Landroidx/compose/runtime/z;", "L", "Landroidx/compose/runtime/e;", "s", "()Landroidx/compose/runtime/e;", "c0", "applier", "l", "()Z", "h", "inserting", "p", "k0", "skipping", "i0", "e0", "defaultsInvalid", "N", "()Landroidx/compose/runtime/e3;", "recomposeScope", "a0", "D", "recomposeScopeIdentity", "l0", "()I", "J", "compoundKeyHash", "a", "r0", "currentMarker", "Lkotlin/coroutines/g;", "A", "()Lkotlin/coroutines/g;", "y", "applyCoroutineContext", "Landroidx/compose/runtime/g0;", "B", "()Landroidx/compose/runtime/g0;", "currentCompositionLocalMap", "Landroidx/compose/runtime/tooling/a;", "R", "()Landroidx/compose/runtime/tooling/a;", "compositionData", "Landroidx/compose/runtime/n0;", "g0", "()Landroidx/compose/runtime/n0;", "composition", "Landroidx/compose/runtime/v;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface t {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = Companion.f17190a;

    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/compose/runtime/t$a;", "", "<init>", "()V", "Landroidx/compose/runtime/m0;", "tracer", "Lkotlin/k2;", "b", "(Landroidx/compose/runtime/m0;)V", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "Empty", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.t$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f17190a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final Object Empty = new C0325a();

        /* compiled from: Composer.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/runtime/t$a$a", "", "", "toString", "()Ljava/lang/String;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.runtime.t$a$a, reason: collision with other inner class name */
        public static final class C0325a {
            C0325a() {
            }

            @fg.l
            public String toString() {
                return "Empty";
            }
        }

        private Companion() {
        }

        @fg.l
        public final Object a() {
            return Empty;
        }

        @q1
        public final void b(@fg.l m0 tracer) {
            x.f17295a = tracer;
        }
    }

    @q
    static /* synthetic */ void D() {
    }

    @p1
    static /* synthetic */ void J() {
    }

    @p1
    static /* synthetic */ void V() {
    }

    @q
    static /* synthetic */ void c0() {
    }

    @q
    static /* synthetic */ void e0() {
    }

    @q
    static /* synthetic */ void h() {
    }

    @q
    static /* synthetic */ void k0() {
    }

    @q
    static /* synthetic */ void r0() {
    }

    @p1
    static /* synthetic */ void y() {
    }

    @fg.l
    @fg.p
    kotlin.coroutines.g A();

    @fg.l
    g0 B();

    @q
    void C();

    @q
    void E(@fg.m Object value);

    @q
    <T> void F(@fg.l ld.a<? extends T> factory);

    @p1
    void G();

    @q
    void H();

    @q
    void I();

    @p1
    void K(@fg.l c2<?> value, @fg.m Object parameter);

    @fg.p
    void L();

    void M();

    @fg.m
    e3 N();

    @q
    void O();

    @q
    void P(int key);

    @fg.m
    @q
    Object Q();

    @fg.l
    androidx.compose.runtime.tooling.a R();

    @q
    default boolean S(@fg.m Object value) {
        return q0(value);
    }

    @q
    void T();

    @q
    void U(int key, @fg.m Object dataKey);

    @q
    void W();

    @q
    void X();

    @p1
    void Y(@fg.l b3<?> value);

    @q
    void Z(int key, @fg.m Object dataKey);

    int a();

    @fg.m
    Object a0();

    @q
    default boolean b(boolean value) {
        return b(value);
    }

    void b0(@fg.l String sourceInformation);

    @q
    default boolean c(short value) {
        return c(value);
    }

    @q
    default boolean d(float value) {
        return d(value);
    }

    @q
    void d0();

    @q
    void e();

    @q
    default boolean f(int value) {
        return f(value);
    }

    void f0(int key, @fg.l String sourceInformation);

    @q
    default boolean g(long value) {
        return g(value);
    }

    @fg.l
    @fg.p
    n0 g0();

    @p1
    void h0();

    @q
    default boolean i(byte value) {
        return i(value);
    }

    boolean i0();

    @q
    default boolean j(char value) {
        return j(value);
    }

    @p1
    void j0(@fg.l e3 scope);

    @q
    default boolean k(double value) {
        return k(value);
    }

    boolean l();

    int l0();

    @q
    void m(boolean changed);

    @p1
    @fg.l
    z m0();

    @q
    void n();

    void n0();

    @fg.l
    @q
    t o(int key);

    @q
    void o0();

    boolean p();

    @q
    void p0();

    @p1
    void q(@fg.l List<kotlin.q0<f2, f2>> references);

    @q
    boolean q0(@fg.m Object value);

    @p1
    void r(@fg.l ld.a<kotlin.k2> effect);

    @fg.l
    e<?> s();

    @p1
    void s0(@fg.l b3<?>[] values);

    @fg.m
    @q
    t3 t();

    @fg.l
    @q
    Object u(@fg.m Object left, @fg.m Object right);

    @q
    void v();

    @q
    <V, T> void w(V value, @fg.l ld.p<? super T, ? super V, kotlin.k2> block);

    @p1
    <T> T x(@fg.l d0<T> key);

    @q
    void z(int marker);
}
