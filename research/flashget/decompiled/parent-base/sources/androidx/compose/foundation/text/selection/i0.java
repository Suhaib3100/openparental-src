package androidx.compose.foundation.text.selection;

import androidx.annotation.m1;
import androidx.compose.foundation.text.selection.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.r1;

/* compiled from: SelectionManager.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a%\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a%\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a1\u0010\u000f\u001a\u00020\u000e2\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00000\t0\u00062\u0006\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\"\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a*\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0018H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0013\u0010\u001c\u001a\u00020\u000e*\u00020\fH\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001e\u0010 \u001a\u00020\u001f*\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u0015H\u0000ø\u0001\u0000¢\u0006\u0004\b \u0010!\"\u0014\u0010$\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"Landroidx/compose/foundation/text/selection/q;", "lhs", "rhs", "h", "(Landroidx/compose/foundation/text/selection/q;Landroidx/compose/foundation/text/selection/q;)Landroidx/compose/foundation/text/selection/q;", "T", "", "e", "(Ljava/util/List;)Ljava/util/List;", "Lkotlin/q0;", "Landroidx/compose/foundation/text/selection/o;", "selectableSubSelectionPairs", "Landroidx/compose/ui/layout/u;", "containerCoordinates", "Li0/i;", "g", "(Ljava/util/List;Landroidx/compose/ui/layout/u;)Li0/i;", "Landroidx/compose/foundation/text/selection/h0;", "manager", "Landroidx/compose/ui/unit/u;", "magnifierSize", "Li0/f;", "c", "(Landroidx/compose/foundation/text/selection/h0;J)J", "Landroidx/compose/foundation/text/selection/q$a;", "anchor", "f", "(Landroidx/compose/foundation/text/selection/h0;JLandroidx/compose/foundation/text/selection/q$a;)J", "i", "(Landroidx/compose/ui/layout/u;)Li0/i;", "offset", "", "d", "(Li0/i;J)Z", "a", "Li0/i;", "invertedInfiniteRect", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSelectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionManager.kt\nandroidx/compose/foundation/text/selection/SelectionManagerKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,979:1\n33#2,6:980\n*S KotlinDebug\n*F\n+ 1 SelectionManager.kt\nandroidx/compose/foundation/text/selection/SelectionManagerKt\n*L\n858#1:980,6\n*E\n"})
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final i0.i f8030a = new i0.i(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* compiled from: SelectionManager.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8031a;

        static {
            int[] iArr = new int[androidx.compose.foundation.text.o.values().length];
            try {
                iArr[androidx.compose.foundation.text.o.SelectionStart.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.foundation.text.o.SelectionEnd.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.compose.foundation.text.o.Cursor.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f8031a = iArr;
        }
    }

    public static final long c(@fg.l h0 h0Var, long j4) {
        q I = h0Var.I();
        if (I == null) {
            i0.f.INSTANCE.getClass();
            return i0.f.f74149e;
        }
        androidx.compose.foundation.text.o y4 = h0Var.y();
        int i4 = y4 == null ? -1 : a.f8031a[y4.ordinal()];
        if (i4 == -1) {
            i0.f.INSTANCE.getClass();
            return i0.f.f74149e;
        }
        if (i4 == 1) {
            return f(h0Var, j4, I.h());
        }
        if (i4 == 2) {
            return f(h0Var, j4, I.f());
        }
        if (i4 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("SelectionContainer does not support cursor");
    }

    public static final boolean d(@fg.l i0.i iVar, long j4) {
        float t4 = iVar.t();
        float x4 = iVar.x();
        float p4 = i0.f.p(j4);
        if (t4 <= p4 && p4 <= x4) {
            float top2 = iVar.getTop();
            float j5 = iVar.j();
            float r4 = i0.f.r(j4);
            if (top2 <= r4 && r4 <= j5) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> e(List<? extends T> list) {
        int size = list.size();
        return (size == 0 || size == 1) ? list : kotlin.collections.w.O(kotlin.collections.w.B2(list), kotlin.collections.w.p3(list));
    }

    private static final long f(h0 h0Var, long j4, q.a aVar) {
        float H;
        o r4 = h0Var.r(aVar);
        if (r4 == null) {
            i0.f.INSTANCE.getClass();
            return i0.f.f74149e;
        }
        androidx.compose.ui.layout.u t4 = h0Var.t();
        if (t4 == null) {
            i0.f.INSTANCE.getClass();
            return i0.f.f74149e;
        }
        androidx.compose.ui.layout.u f4 = r4.f();
        if (f4 == null) {
            i0.f.INSTANCE.getClass();
            return i0.f.f74149e;
        }
        int g4 = aVar.g();
        if (g4 > r4.h()) {
            i0.f.INSTANCE.getClass();
            return i0.f.f74149e;
        }
        i0.f v4 = h0Var.v();
        kotlin.jvm.internal.l0.m(v4);
        float p4 = i0.f.p(f4.E(t4, v4.getPackedValue()));
        long m4 = r4.m(g4);
        if (androidx.compose.ui.text.t0.h(m4)) {
            H = r4.d(g4);
        } else {
            float d5 = r4.d((int) (m4 >> 32));
            float c5 = r4.c(((int) (m4 & 4294967295L)) - 1);
            H = kotlin.ranges.s.H(p4, Math.min(d5, c5), Math.max(d5, c5));
        }
        if (H == -1.0f) {
            i0.f.INSTANCE.getClass();
            return i0.f.f74149e;
        }
        if (Math.abs(p4 - H) > androidx.compose.ui.unit.u.m(j4) / 2) {
            i0.f.INSTANCE.getClass();
            return i0.f.f74149e;
        }
        float i4 = r4.i(g4);
        if (i4 != -1.0f) {
            return t4.E(f4, i0.g.a(H, i4));
        }
        i0.f.INSTANCE.getClass();
        return i0.f.f74149e;
    }

    @fg.l
    @m1
    public static final i0.i g(@fg.l List<? extends kotlin.q0<? extends o, q>> list, @fg.l androidx.compose.ui.layout.u uVar) {
        int i4;
        androidx.compose.ui.layout.u f4;
        int[] iArr;
        if (list.isEmpty()) {
            return f8030a;
        }
        i0.i iVar = f8030a;
        float left = iVar.getLeft();
        float c5 = iVar.c();
        float right = iVar.getRight();
        float bottom = iVar.getBottom();
        int size = list.size();
        char c6 = 0;
        int i5 = 0;
        while (i5 < size) {
            kotlin.q0<? extends o, q> q0Var = list.get(i5);
            o a5 = q0Var.a();
            q b5 = q0Var.b();
            int g4 = b5.h().g();
            int g5 = b5.f().g();
            if (g4 == g5 || (f4 = a5.f()) == null) {
                i4 = size;
            } else {
                int min = Math.min(g4, g5);
                int max = Math.max(g4, g5) - 1;
                if (min == max) {
                    iArr = new int[1];
                    iArr[c6] = min;
                } else {
                    int[] iArr2 = new int[2];
                    iArr2[c6] = min;
                    iArr2[1] = max;
                    iArr = iArr2;
                }
                i0.i iVar2 = f8030a;
                float left2 = iVar2.getLeft();
                float c7 = iVar2.c();
                float right2 = iVar2.getRight();
                float bottom2 = iVar2.getBottom();
                int length = iArr.length;
                i4 = size;
                int i6 = 0;
                while (i6 < length) {
                    int i7 = length;
                    i0.i e4 = a5.e(iArr[i6]);
                    left2 = Math.min(left2, e4.t());
                    c7 = Math.min(c7, e4.getTop());
                    right2 = Math.max(right2, e4.x());
                    bottom2 = Math.max(bottom2, e4.j());
                    i6++;
                    length = i7;
                }
                long a6 = i0.g.a(left2, c7);
                long a7 = i0.g.a(right2, bottom2);
                long E = uVar.E(f4, a6);
                long E2 = uVar.E(f4, a7);
                left = Math.min(left, i0.f.p(E));
                c5 = Math.min(c5, i0.f.r(E));
                right = Math.max(right, i0.f.p(E2));
                bottom = Math.max(bottom, i0.f.r(E2));
            }
            i5++;
            size = i4;
            c6 = 0;
        }
        return new i0.i(left, c5, right, bottom);
    }

    @fg.m
    public static final q h(@fg.m q qVar, @fg.m q qVar2) {
        q i4;
        return (qVar == null || (i4 = qVar.i(qVar2)) == null) ? qVar2 : i4;
    }

    @fg.l
    public static final i0.i i(@fg.l androidx.compose.ui.layout.u uVar) {
        i0.i c5 = androidx.compose.ui.layout.v.c(uVar);
        return i0.j.a(uVar.P(c5.E()), uVar.P(c5.n()));
    }
}
