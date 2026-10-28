package kotlin.ranges;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.jvm.internal.l0;
import kotlin.o2;

/* compiled from: Ranges.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a2\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a2\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0087\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\n*\u00020\t2\u0006\u0010\u0002\u001a\u00020\tH\u0087\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\"\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u0006*\u00020\t2\u0006\u0010\u0002\u001a\u00020\tH\u0087\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\"\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\n*\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u000fH\u0087\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006*\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u000fH\u0087\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001aB\u0010\u0019\u001a\u00020\u0018\"\b\b\u0000\u0010\u0001*\u00020\u0014\"\u0018\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00000\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0015*\u00028\u00012\b\u0010\u0017\u001a\u0004\u0018\u00018\u0000H\u0087\n¢\u0006\u0004\b\u0019\u0010\u001a\u001aB\u0010\u001b\u001a\u00020\u0018\"\b\b\u0000\u0010\u0001*\u00020\u0014\"\u0018\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00000\u0006*\b\u0012\u0004\u0012\u00028\u00000\u0015*\u00028\u00012\b\u0010\u0017\u001a\u0004\u0018\u00018\u0000H\u0087\n¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001eH\u0000¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"", "T", "that", "Lkotlin/ranges/g;", "f", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Lkotlin/ranges/g;", "Lkotlin/ranges/r;", "i", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Lkotlin/ranges/r;", "", "Lkotlin/ranges/f;", "d", "(DD)Lkotlin/ranges/f;", "g", "(DD)Lkotlin/ranges/r;", "", "e", "(FF)Lkotlin/ranges/f;", "h", "(FF)Lkotlin/ranges/r;", "", "", "R", "element", "", "b", "(Lkotlin/ranges/g;Ljava/lang/Object;)Z", "c", "(Lkotlin/ranges/r;Ljava/lang/Object;)Z", "isPositive", "", "step", "Lkotlin/k2;", "a", "(ZLjava/lang/Number;)V", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/ranges/RangesKt")
/* loaded from: classes7.dex */
class t {
    public static final void a(boolean z4, @fg.l Number number) {
        l0.p(number, ProtectedSandApp.s("旪\u0001"));
        if (z4) {
            return;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("旫\u0001") + number + '.');
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;R::Lkotlin/ranges/g<TT;>;:Ljava/lang/Iterable<+TT;>;>(TR;TT;)Z */
    @c1(version = "1.3")
    @kotlin.internal.f
    private static final boolean b(g gVar, Object obj) {
        l0.p(gVar, ProtectedSandApp.s("旬\u0001"));
        return obj != null && gVar.b((Comparable) obj);
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;R::Lkotlin/ranges/r<TT;>;:Ljava/lang/Iterable<+TT;>;>(TR;TT;)Z */
    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.9")
    @kotlin.internal.f
    private static final boolean c(r rVar, Object obj) {
        l0.p(rVar, ProtectedSandApp.s("旬\u0001"));
        return obj != null && rVar.b((Comparable) obj);
    }

    @fg.l
    @c1(version = "1.1")
    public static f<Double> d(double d5, double d6) {
        return new d(d5, d6);
    }

    @fg.l
    @c1(version = "1.1")
    public static f<Float> e(float f4, float f5) {
        return new e(f4, f5);
    }

    @fg.l
    public static final <T extends Comparable<? super T>> g<T> f(@fg.l T t4, @fg.l T t5) {
        l0.p(t4, ProtectedSandApp.s("旬\u0001"));
        l0.p(t5, ProtectedSandApp.s("旭\u0001"));
        return new i(t4, t5);
    }

    @fg.l
    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.9")
    public static final r<Double> g(double d5, double d6) {
        return new p(d5, d6);
    }

    @fg.l
    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.9")
    public static final r<Float> h(float f4, float f5) {
        return new q(f4, f5);
    }

    @fg.l
    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.9")
    public static final <T extends Comparable<? super T>> r<T> i(@fg.l T t4, @fg.l T t5) {
        l0.p(t4, ProtectedSandApp.s("旬\u0001"));
        l0.p(t5, ProtectedSandApp.s("旭\u0001"));
        return new h(t4, t5);
    }
}
