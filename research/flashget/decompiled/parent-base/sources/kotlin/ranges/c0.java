package kotlin.ranges;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.a2;
import kotlin.c1;
import kotlin.g2;
import kotlin.jvm.internal.l0;
import kotlin.n2;
import kotlin.o2;
import kotlin.ranges.v;
import kotlin.ranges.y;
import kotlin.s1;
import kotlin.w1;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _URanges.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0015\u0010\b\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\n\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\f\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\f\u0010\u0003\u001a\u0013\u0010\r\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u0007\u001a\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u000e\u0010\t\u001a\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u000b\u001a\u0014\u0010\u0011\u001a\u00020\u0001*\u00020\u0010H\u0087\b¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0014\u0010\u0014\u001a\u00020\u0005*\u00020\u0013H\u0087\b¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0018\u001a\u00020\u0001*\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001b\u0010\u001a\u001a\u00020\u0005*\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u0001*\u00020\u0010H\u0087\b¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u0005*\u00020\u0013H\u0087\b¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001d\u0010 \u001a\u0004\u0018\u00010\u0001*\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b \u0010!\u001a\u001d\u0010\"\u001a\u0004\u0018\u00010\u0005*\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\"\u0010#\u001a\u001e\u0010&\u001a\u00020%*\u00020\u00102\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u0087\n¢\u0006\u0004\b&\u0010'\u001a\u001e\u0010(\u001a\u00020%*\u00020\u00132\b\u0010$\u001a\u0004\u0018\u00010\u0005H\u0087\n¢\u0006\u0004\b(\u0010)\u001a\u001c\u0010,\u001a\u00020%*\u00020\u00102\u0006\u0010+\u001a\u00020*H\u0087\u0002¢\u0006\u0004\b,\u0010-\u001a\u001c\u0010.\u001a\u00020%*\u00020\u00132\u0006\u0010+\u001a\u00020*H\u0087\u0002¢\u0006\u0004\b.\u0010/\u001a\u001c\u00100\u001a\u00020%*\u00020\u00132\u0006\u0010+\u001a\u00020\u0001H\u0087\u0002¢\u0006\u0004\b0\u00101\u001a\u001c\u00102\u001a\u00020%*\u00020\u00102\u0006\u0010+\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0004\b2\u00103\u001a\u001c\u00105\u001a\u00020%*\u00020\u00102\u0006\u0010+\u001a\u000204H\u0087\u0002¢\u0006\u0004\b5\u00106\u001a\u001c\u00107\u001a\u00020%*\u00020\u00132\u0006\u0010+\u001a\u000204H\u0087\u0002¢\u0006\u0004\b7\u00108\u001a\u001c\u0010:\u001a\u00020\u0000*\u00020*2\u0006\u00109\u001a\u00020*H\u0087\u0004¢\u0006\u0004\b:\u0010;\u001a\u001c\u0010<\u001a\u00020\u0000*\u00020\u00012\u0006\u00109\u001a\u00020\u0001H\u0087\u0004¢\u0006\u0004\b<\u0010=\u001a\u001c\u0010>\u001a\u00020\u0004*\u00020\u00052\u0006\u00109\u001a\u00020\u0005H\u0087\u0004¢\u0006\u0004\b>\u0010?\u001a\u001c\u0010@\u001a\u00020\u0000*\u0002042\u0006\u00109\u001a\u000204H\u0087\u0004¢\u0006\u0004\b@\u0010A\u001a\u0013\u0010B\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\bB\u0010C\u001a\u0013\u0010D\u001a\u00020\u0004*\u00020\u0004H\u0007¢\u0006\u0004\bD\u0010E\u001a\u001c\u0010H\u001a\u00020\u0000*\u00020\u00002\u0006\u0010G\u001a\u00020FH\u0087\u0004¢\u0006\u0004\bH\u0010I\u001a\u001c\u0010K\u001a\u00020\u0004*\u00020\u00042\u0006\u0010G\u001a\u00020JH\u0087\u0004¢\u0006\u0004\bK\u0010L\u001a\u001c\u0010M\u001a\u00020\u0010*\u00020*2\u0006\u00109\u001a\u00020*H\u0087\u0004¢\u0006\u0004\bM\u0010N\u001a\u001c\u0010O\u001a\u00020\u0010*\u00020\u00012\u0006\u00109\u001a\u00020\u0001H\u0087\u0004¢\u0006\u0004\bO\u0010P\u001a\u001c\u0010Q\u001a\u00020\u0013*\u00020\u00052\u0006\u00109\u001a\u00020\u0005H\u0087\u0004¢\u0006\u0004\bQ\u0010R\u001a\u001c\u0010S\u001a\u00020\u0010*\u0002042\u0006\u00109\u001a\u000204H\u0087\u0004¢\u0006\u0004\bS\u0010T\u001a\u001b\u0010V\u001a\u00020\u0001*\u00020\u00012\u0006\u0010U\u001a\u00020\u0001H\u0007¢\u0006\u0004\bV\u0010W\u001a\u001b\u0010X\u001a\u00020\u0005*\u00020\u00052\u0006\u0010U\u001a\u00020\u0005H\u0007¢\u0006\u0004\bX\u0010Y\u001a\u001b\u0010Z\u001a\u00020**\u00020*2\u0006\u0010U\u001a\u00020*H\u0007¢\u0006\u0004\bZ\u0010[\u001a\u001b\u0010\\\u001a\u000204*\u0002042\u0006\u0010U\u001a\u000204H\u0007¢\u0006\u0004\b\\\u0010]\u001a\u001b\u0010_\u001a\u00020\u0001*\u00020\u00012\u0006\u0010^\u001a\u00020\u0001H\u0007¢\u0006\u0004\b_\u0010W\u001a\u001b\u0010`\u001a\u00020\u0005*\u00020\u00052\u0006\u0010^\u001a\u00020\u0005H\u0007¢\u0006\u0004\b`\u0010Y\u001a\u001b\u0010a\u001a\u00020**\u00020*2\u0006\u0010^\u001a\u00020*H\u0007¢\u0006\u0004\ba\u0010[\u001a\u001b\u0010b\u001a\u000204*\u0002042\u0006\u0010^\u001a\u000204H\u0007¢\u0006\u0004\bb\u0010]\u001a#\u0010c\u001a\u00020\u0001*\u00020\u00012\u0006\u0010U\u001a\u00020\u00012\u0006\u0010^\u001a\u00020\u0001H\u0007¢\u0006\u0004\bc\u0010d\u001a#\u0010e\u001a\u00020\u0005*\u00020\u00052\u0006\u0010U\u001a\u00020\u00052\u0006\u0010^\u001a\u00020\u0005H\u0007¢\u0006\u0004\be\u0010f\u001a#\u0010g\u001a\u00020**\u00020*2\u0006\u0010U\u001a\u00020*2\u0006\u0010^\u001a\u00020*H\u0007¢\u0006\u0004\bg\u0010h\u001a#\u0010i\u001a\u000204*\u0002042\u0006\u0010U\u001a\u0002042\u0006\u0010^\u001a\u000204H\u0007¢\u0006\u0004\bi\u0010j\u001a!\u0010m\u001a\u00020\u0001*\u00020\u00012\f\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00010kH\u0007¢\u0006\u0004\bm\u0010n\u001a!\u0010o\u001a\u00020\u0005*\u00020\u00052\f\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00050kH\u0007¢\u0006\u0004\bo\u0010p¨\u0006q"}, d2 = {"Lkotlin/ranges/v;", "Lkotlin/w1;", "A", "(Lkotlin/ranges/v;)I", "Lkotlin/ranges/y;", "Lkotlin/a2;", "B", "(Lkotlin/ranges/y;)J", "C", "(Lkotlin/ranges/v;)Lkotlin/w1;", "D", "(Lkotlin/ranges/y;)Lkotlin/a2;", "E", "F", "G", "H", "Lkotlin/ranges/x;", "I", "(Lkotlin/ranges/x;)I", "Lkotlin/ranges/a0;", "K", "(Lkotlin/ranges/a0;)J", "Lkotlin/random/f;", "random", "J", "(Lkotlin/ranges/x;Lkotlin/random/f;)I", "L", "(Lkotlin/ranges/a0;Lkotlin/random/f;)J", "M", "(Lkotlin/ranges/x;)Lkotlin/w1;", "O", "(Lkotlin/ranges/a0;)Lkotlin/a2;", "N", "(Lkotlin/ranges/x;Lkotlin/random/f;)Lkotlin/w1;", "P", "(Lkotlin/ranges/a0;Lkotlin/random/f;)Lkotlin/a2;", "element", "", "t", "(Lkotlin/ranges/x;Lkotlin/w1;)Z", "p", "(Lkotlin/ranges/a0;Lkotlin/a2;)Z", "Lkotlin/s1;", "value", "o", "(Lkotlin/ranges/x;B)Z", "r", "(Lkotlin/ranges/a0;B)Z", "q", "(Lkotlin/ranges/a0;I)Z", "u", "(Lkotlin/ranges/x;J)Z", "Lkotlin/g2;", "s", "(Lkotlin/ranges/x;S)Z", "v", "(Lkotlin/ranges/a0;S)Z", "to", "y", "(BB)Lkotlin/ranges/v;", "x", "(II)Lkotlin/ranges/v;", "z", "(JJ)Lkotlin/ranges/y;", "w", "(SS)Lkotlin/ranges/v;", "Q", "(Lkotlin/ranges/v;)Lkotlin/ranges/v;", "R", "(Lkotlin/ranges/y;)Lkotlin/ranges/y;", "", "step", "S", "(Lkotlin/ranges/v;I)Lkotlin/ranges/v;", "", "T", "(Lkotlin/ranges/y;J)Lkotlin/ranges/y;", "W", "(BB)Lkotlin/ranges/x;", "V", "(II)Lkotlin/ranges/x;", "X", "(JJ)Lkotlin/ranges/a0;", "U", "(SS)Lkotlin/ranges/x;", "minimumValue", "b", "(II)I", "d", "(JJ)J", "c", "(BB)B", "a", "(SS)S", "maximumValue", "f", "h", "g", "e", "k", "(III)I", "m", "(JJJ)J", "l", "(BBB)B", "j", "(SSS)S", "Lkotlin/ranges/g;", "range", "n", "(ILkotlin/ranges/g;)I", "i", "(JLkotlin/ranges/g;)J", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/ranges/URangesKt")
/* loaded from: classes7.dex */
public class c0 {
    @c1(version = "1.7")
    public static final int A(@fg.l v vVar) {
        l0.p(vVar, ProtectedSandApp.s("旄\u0001"));
        if (!vVar.isEmpty()) {
            return vVar.getFirst();
        }
        throw new NoSuchElementException(ProtectedSandApp.s("旅\u0001") + vVar + ProtectedSandApp.s("旆\u0001"));
    }

    @c1(version = "1.7")
    public static final long B(@fg.l y yVar) {
        l0.p(yVar, ProtectedSandApp.s("旄\u0001"));
        if (!yVar.isEmpty()) {
            return yVar.getFirst();
        }
        throw new NoSuchElementException(ProtectedSandApp.s("旅\u0001") + yVar + ProtectedSandApp.s("旆\u0001"));
    }

    @fg.m
    @c1(version = "1.7")
    public static final w1 C(@fg.l v vVar) {
        l0.p(vVar, ProtectedSandApp.s("旄\u0001"));
        if (vVar.isEmpty()) {
            return null;
        }
        return w1.b(vVar.getFirst());
    }

    @fg.m
    @c1(version = "1.7")
    public static final a2 D(@fg.l y yVar) {
        l0.p(yVar, ProtectedSandApp.s("旄\u0001"));
        if (yVar.isEmpty()) {
            return null;
        }
        return a2.b(yVar.getFirst());
    }

    @c1(version = "1.7")
    public static final int E(@fg.l v vVar) {
        l0.p(vVar, ProtectedSandApp.s("旄\u0001"));
        if (!vVar.isEmpty()) {
            return vVar.getLast();
        }
        throw new NoSuchElementException(ProtectedSandApp.s("旅\u0001") + vVar + ProtectedSandApp.s("旆\u0001"));
    }

    @c1(version = "1.7")
    public static final long F(@fg.l y yVar) {
        l0.p(yVar, ProtectedSandApp.s("旄\u0001"));
        if (!yVar.isEmpty()) {
            return yVar.getLast();
        }
        throw new NoSuchElementException(ProtectedSandApp.s("旅\u0001") + yVar + ProtectedSandApp.s("旆\u0001"));
    }

    @fg.m
    @c1(version = "1.7")
    public static final w1 G(@fg.l v vVar) {
        l0.p(vVar, ProtectedSandApp.s("旄\u0001"));
        if (vVar.isEmpty()) {
            return null;
        }
        return w1.b(vVar.getLast());
    }

    @fg.m
    @c1(version = "1.7")
    public static final a2 H(@fg.l y yVar) {
        l0.p(yVar, ProtectedSandApp.s("旄\u0001"));
        if (yVar.isEmpty()) {
            return null;
        }
        return a2.b(yVar.getLast());
    }

    @o2(markerClass = {kotlin.t.class})
    @c1(version = "1.5")
    @kotlin.internal.f
    private static final int I(x xVar) {
        l0.p(xVar, ProtectedSandApp.s("旄\u0001"));
        return J(xVar, kotlin.random.f.INSTANCE);
    }

    @o2(markerClass = {kotlin.t.class})
    @c1(version = "1.5")
    public static final int J(@fg.l x xVar, @fg.l kotlin.random.f fVar) {
        l0.p(xVar, ProtectedSandApp.s("旄\u0001"));
        l0.p(fVar, ProtectedSandApp.s("旇\u0001"));
        try {
            return kotlin.random.h.h(fVar, xVar);
        } catch (IllegalArgumentException e4) {
            throw new NoSuchElementException(e4.getMessage());
        }
    }

    @o2(markerClass = {kotlin.t.class})
    @c1(version = "1.5")
    @kotlin.internal.f
    private static final long K(a0 a0Var) {
        l0.p(a0Var, ProtectedSandApp.s("旄\u0001"));
        return L(a0Var, kotlin.random.f.INSTANCE);
    }

    @o2(markerClass = {kotlin.t.class})
    @c1(version = "1.5")
    public static final long L(@fg.l a0 a0Var, @fg.l kotlin.random.f fVar) {
        l0.p(a0Var, ProtectedSandApp.s("旄\u0001"));
        l0.p(fVar, ProtectedSandApp.s("旇\u0001"));
        try {
            return kotlin.random.h.l(fVar, a0Var);
        } catch (IllegalArgumentException e4) {
            throw new NoSuchElementException(e4.getMessage());
        }
    }

    @o2(markerClass = {kotlin.r.class, kotlin.t.class})
    @c1(version = "1.5")
    @kotlin.internal.f
    private static final w1 M(x xVar) {
        l0.p(xVar, ProtectedSandApp.s("旄\u0001"));
        return N(xVar, kotlin.random.f.INSTANCE);
    }

    @o2(markerClass = {kotlin.r.class, kotlin.t.class})
    @fg.m
    @c1(version = "1.5")
    public static final w1 N(@fg.l x xVar, @fg.l kotlin.random.f fVar) {
        l0.p(xVar, ProtectedSandApp.s("旄\u0001"));
        l0.p(fVar, ProtectedSandApp.s("旇\u0001"));
        if (xVar.isEmpty()) {
            return null;
        }
        return w1.b(kotlin.random.h.h(fVar, xVar));
    }

    @o2(markerClass = {kotlin.r.class, kotlin.t.class})
    @c1(version = "1.5")
    @kotlin.internal.f
    private static final a2 O(a0 a0Var) {
        l0.p(a0Var, ProtectedSandApp.s("旄\u0001"));
        return P(a0Var, kotlin.random.f.INSTANCE);
    }

    @o2(markerClass = {kotlin.r.class, kotlin.t.class})
    @fg.m
    @c1(version = "1.5")
    public static final a2 P(@fg.l a0 a0Var, @fg.l kotlin.random.f fVar) {
        l0.p(a0Var, ProtectedSandApp.s("旄\u0001"));
        l0.p(fVar, ProtectedSandApp.s("旇\u0001"));
        if (a0Var.isEmpty()) {
            return null;
        }
        return a2.b(kotlin.random.h.l(fVar, a0Var));
    }

    @fg.l
    @o2(markerClass = {kotlin.t.class})
    @c1(version = "1.5")
    public static final v Q(@fg.l v vVar) {
        l0.p(vVar, ProtectedSandApp.s("旄\u0001"));
        return v.INSTANCE.a(vVar.getLast(), vVar.getFirst(), -vVar.getStep());
    }

    @fg.l
    @o2(markerClass = {kotlin.t.class})
    @c1(version = "1.5")
    public static final y R(@fg.l y yVar) {
        l0.p(yVar, ProtectedSandApp.s("旄\u0001"));
        return y.INSTANCE.a(yVar.getLast(), yVar.getFirst(), -yVar.getStep());
    }

    @fg.l
    @o2(markerClass = {kotlin.t.class})
    @c1(version = "1.5")
    public static final v S(@fg.l v vVar, int i4) {
        l0.p(vVar, ProtectedSandApp.s("旄\u0001"));
        t.a(i4 > 0, Integer.valueOf(i4));
        v.Companion companion = v.INSTANCE;
        int first = vVar.getFirst();
        int last = vVar.getLast();
        if (vVar.getStep() <= 0) {
            i4 = -i4;
        }
        return companion.a(first, last, i4);
    }

    @fg.l
    @o2(markerClass = {kotlin.t.class})
    @c1(version = "1.5")
    public static final y T(@fg.l y yVar, long j4) {
        l0.p(yVar, ProtectedSandApp.s("旄\u0001"));
        t.a(j4 > 0, Long.valueOf(j4));
        y.Companion companion = y.INSTANCE;
        long first = yVar.getFirst();
        long last = yVar.getLast();
        if (yVar.getStep() <= 0) {
            j4 = -j4;
        }
        return companion.a(first, last, j4);
    }

    @fg.l
    @o2(markerClass = {kotlin.t.class})
    @c1(version = "1.5")
    public static final x U(short s4, short s5) {
        int i4 = s5 & g2.f75095e;
        if (l0.t(i4, 0) > 0) {
            return new x(w1.h(s4 & g2.f75095e), i4 - 1, null);
        }
        x.INSTANCE.getClass();
        return x.f75505g;
    }

    @fg.l
    @o2(markerClass = {kotlin.t.class})
    @c1(version = "1.5")
    public static x V(int i4, int i5) {
        int compare;
        compare = Integer.compare(i5 ^ Integer.MIN_VALUE, 0 ^ Integer.MIN_VALUE);
        if (compare > 0) {
            return new x(i4, w1.h(i5 - 1), null);
        }
        x.INSTANCE.getClass();
        return x.f75505g;
    }

    @fg.l
    @o2(markerClass = {kotlin.t.class})
    @c1(version = "1.5")
    public static final x W(byte b5, byte b6) {
        int i4 = b6 & 255;
        if (l0.t(i4, 0) > 0) {
            return new x(w1.h(b5 & 255), i4 - 1, null);
        }
        x.INSTANCE.getClass();
        return x.f75505g;
    }

    @fg.l
    @o2(markerClass = {kotlin.t.class})
    @c1(version = "1.5")
    public static a0 X(long j4, long j5) {
        int compare;
        compare = Long.compare(j5 ^ Long.MIN_VALUE, 0 ^ Long.MIN_VALUE);
        if (compare > 0) {
            return new a0(j4, j5 - a2.h(1 & 4294967295L), null);
        }
        a0.INSTANCE.getClass();
        return a0.f75457g;
    }

    @o2(markerClass = {kotlin.t.class})
    @c1(version = "1.5")
    public static final short a(short s4, short s5) {
        return l0.t(s4 & g2.f75095e, 65535 & s5) < 0 ? s5 : s4;
    }

    @o2(markerClass = {kotlin.t.class})
    @c1(version = "1.5")
    public static final int b(int i4, int i5) {
        int compare;
        compare = Integer.compare(i4 ^ Integer.MIN_VALUE, i5 ^ Integer.MIN_VALUE);
        return compare < 0 ? i5 : i4;
    }

    @o2(markerClass = {kotlin.t.class})
    @c1(version = "1.5")
    public static final byte c(byte b5, byte b6) {
        return l0.t(b5 & 255, b6 & 255) < 0 ? b6 : b5;
    }

    @o2(markerClass = {kotlin.t.class})
    @c1(version = "1.5")
    public static final long d(long j4, long j5) {
        int compare;
        compare = Long.compare(j4 ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE);
        return compare < 0 ? j5 : j4;
    }

    @o2(markerClass = {kotlin.t.class})
    @c1(version = "1.5")
    public static final short e(short s4, short s5) {
        return l0.t(s4 & g2.f75095e, 65535 & s5) > 0 ? s5 : s4;
    }

    @o2(markerClass = {kotlin.t.class})
    @c1(version = "1.5")
    public static final int f(int i4, int i5) {
        int compare;
        compare = Integer.compare(i4 ^ Integer.MIN_VALUE, i5 ^ Integer.MIN_VALUE);
        return compare > 0 ? i5 : i4;
    }

    @o2(markerClass = {kotlin.t.class})
    @c1(version = "1.5")
    public static final byte g(byte b5, byte b6) {
        return l0.t(b5 & 255, b6 & 255) > 0 ? b6 : b5;
    }

    @o2(markerClass = {kotlin.t.class})
    @c1(version = "1.5")
    public static final long h(long j4, long j5) {
        int compare;
        compare = Long.compare(j4 ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE);
        return compare > 0 ? j5 : j4;
    }

    @o2(markerClass = {kotlin.t.class})
    @c1(version = "1.5")
    public static final long i(long j4, @fg.l g<a2> gVar) {
        int compare;
        int compare2;
        l0.p(gVar, ProtectedSandApp.s("旈\u0001"));
        if (gVar instanceof f) {
            return ((a2) u.N(a2.b(j4), (f) gVar)).getData();
        }
        if (gVar.isEmpty()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("旉\u0001") + gVar + '.');
        }
        compare = Long.compare(j4 ^ Long.MIN_VALUE, gVar.c().getData() ^ Long.MIN_VALUE);
        if (compare < 0) {
            return gVar.c().getData();
        }
        compare2 = Long.compare(j4 ^ Long.MIN_VALUE, gVar.h().getData() ^ Long.MIN_VALUE);
        return compare2 > 0 ? gVar.h().getData() : j4;
    }

    @o2(markerClass = {kotlin.t.class})
    @c1(version = "1.5")
    public static final short j(short s4, short s5, short s6) {
        int i4 = s5 & g2.f75095e;
        int i5 = s6 & g2.f75095e;
        if (l0.t(i4, i5) <= 0) {
            int i6 = 65535 & s4;
            return l0.t(i6, i4) < 0 ? s5 : l0.t(i6, i5) > 0 ? s6 : s4;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("旊\u0001") + ((Object) g2.f0(s6)) + ProtectedSandApp.s("旋\u0001") + ((Object) g2.f0(s5)) + '.');
    }

    @o2(markerClass = {kotlin.t.class})
    @c1(version = "1.5")
    public static final int k(int i4, int i5, int i6) {
        int compare;
        int compare2;
        int compare3;
        compare = Integer.compare(i5 ^ Integer.MIN_VALUE, i6 ^ Integer.MIN_VALUE);
        if (compare <= 0) {
            compare2 = Integer.compare(i4 ^ Integer.MIN_VALUE, i5 ^ Integer.MIN_VALUE);
            if (compare2 < 0) {
                return i5;
            }
            compare3 = Integer.compare(i4 ^ Integer.MIN_VALUE, i6 ^ Integer.MIN_VALUE);
            return compare3 > 0 ? i6 : i4;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("旊\u0001") + ((Object) w1.h0(i6)) + ProtectedSandApp.s("旋\u0001") + ((Object) w1.h0(i5)) + '.');
    }

    @o2(markerClass = {kotlin.t.class})
    @c1(version = "1.5")
    public static final byte l(byte b5, byte b6, byte b7) {
        int i4 = b6 & 255;
        int i5 = b7 & 255;
        if (l0.t(i4, i5) <= 0) {
            int i6 = b5 & 255;
            return l0.t(i6, i4) < 0 ? b6 : l0.t(i6, i5) > 0 ? b7 : b5;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("旊\u0001") + ((Object) s1.f0(b7)) + ProtectedSandApp.s("旋\u0001") + ((Object) s1.f0(b6)) + '.');
    }

    @o2(markerClass = {kotlin.t.class})
    @c1(version = "1.5")
    public static final long m(long j4, long j5, long j6) {
        int compare;
        int compare2;
        int compare3;
        compare = Long.compare(j5 ^ Long.MIN_VALUE, j6 ^ Long.MIN_VALUE);
        if (compare <= 0) {
            compare2 = Long.compare(j4 ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE);
            if (compare2 < 0) {
                return j5;
            }
            compare3 = Long.compare(j4 ^ Long.MIN_VALUE, j6 ^ Long.MIN_VALUE);
            return compare3 > 0 ? j6 : j4;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("旊\u0001") + ((Object) a2.h0(j6)) + ProtectedSandApp.s("旋\u0001") + ((Object) n2.l(j5, 10)) + '.');
    }

    @o2(markerClass = {kotlin.t.class})
    @c1(version = "1.5")
    public static final int n(int i4, @fg.l g<w1> gVar) {
        int compare;
        int compare2;
        l0.p(gVar, ProtectedSandApp.s("旈\u0001"));
        if (gVar instanceof f) {
            return ((w1) u.N(w1.b(i4), (f) gVar)).getData();
        }
        if (gVar.isEmpty()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("旉\u0001") + gVar + '.');
        }
        compare = Integer.compare(i4 ^ Integer.MIN_VALUE, gVar.c().getData() ^ Integer.MIN_VALUE);
        if (compare < 0) {
            return gVar.c().getData();
        }
        compare2 = Integer.compare(i4 ^ Integer.MIN_VALUE, gVar.h().getData() ^ Integer.MIN_VALUE);
        return compare2 > 0 ? gVar.h().getData() : i4;
    }

    @o2(markerClass = {kotlin.t.class})
    @c1(version = "1.5")
    public static final boolean o(@fg.l x xVar, byte b5) {
        l0.p(xVar, ProtectedSandApp.s("旌\u0001"));
        return xVar.q(w1.h(b5 & 255));
    }

    @o2(markerClass = {kotlin.t.class})
    @c1(version = "1.5")
    @kotlin.internal.f
    private static final boolean p(a0 a0Var, a2 a2Var) {
        l0.p(a0Var, ProtectedSandApp.s("旌\u0001"));
        return a2Var != null && a0Var.q(a2Var.getData());
    }

    @o2(markerClass = {kotlin.t.class})
    @c1(version = "1.5")
    public static final boolean q(@fg.l a0 a0Var, int i4) {
        l0.p(a0Var, ProtectedSandApp.s("旌\u0001"));
        return a0Var.q(a2.h(i4 & 4294967295L));
    }

    @o2(markerClass = {kotlin.t.class})
    @c1(version = "1.5")
    public static final boolean r(@fg.l a0 a0Var, byte b5) {
        l0.p(a0Var, ProtectedSandApp.s("旌\u0001"));
        return a0Var.q(a2.h(b5 & 255));
    }

    @o2(markerClass = {kotlin.t.class})
    @c1(version = "1.5")
    public static final boolean s(@fg.l x xVar, short s4) {
        l0.p(xVar, ProtectedSandApp.s("旌\u0001"));
        return xVar.q(w1.h(s4 & g2.f75095e));
    }

    @o2(markerClass = {kotlin.t.class})
    @c1(version = "1.5")
    @kotlin.internal.f
    private static final boolean t(x xVar, w1 w1Var) {
        l0.p(xVar, ProtectedSandApp.s("旌\u0001"));
        return w1Var != null && xVar.q(w1Var.getData());
    }

    @o2(markerClass = {kotlin.t.class})
    @c1(version = "1.5")
    public static final boolean u(@fg.l x xVar, long j4) {
        l0.p(xVar, ProtectedSandApp.s("旌\u0001"));
        return a2.h(j4 >>> 32) == 0 && xVar.q(w1.h((int) j4));
    }

    @o2(markerClass = {kotlin.t.class})
    @c1(version = "1.5")
    public static final boolean v(@fg.l a0 a0Var, short s4) {
        l0.p(a0Var, ProtectedSandApp.s("旌\u0001"));
        return a0Var.q(a2.h(s4 & okhttp3.internal.ws.g.f84969s));
    }

    @fg.l
    @o2(markerClass = {kotlin.t.class})
    @c1(version = "1.5")
    public static final v w(short s4, short s5) {
        return v.INSTANCE.a(w1.h(s4 & g2.f75095e), s5 & g2.f75095e, -1);
    }

    @fg.l
    @o2(markerClass = {kotlin.t.class})
    @c1(version = "1.5")
    public static final v x(int i4, int i5) {
        return v.INSTANCE.a(i4, i5, -1);
    }

    @fg.l
    @o2(markerClass = {kotlin.t.class})
    @c1(version = "1.5")
    public static final v y(byte b5, byte b6) {
        return v.INSTANCE.a(w1.h(b5 & 255), b6 & 255, -1);
    }

    @fg.l
    @o2(markerClass = {kotlin.t.class})
    @c1(version = "1.5")
    public static final y z(long j4, long j5) {
        return y.INSTANCE.a(j4, j5, -1L);
    }
}
