package androidx.compose.material3;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.k1;

/* compiled from: DragGestureDetectorCopy.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aa\u0010\u000e\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u000326\u0010\r\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0005H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001aW\u0010\u0013\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u00052\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u0010H\u0082Hø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001e\u0010\u0017\u001a\u00020\u0016*\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001e\u0010\u001a\u001a\u00020\n*\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\"\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001d\"\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001d\"\u0014\u0010 \u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001d\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Landroidx/compose/ui/input/pointer/a0;", "pointerId", "Landroidx/compose/ui/input/pointer/q0;", "pointerType", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/b0;", "Lkotlin/r0;", "name", "change", "", "overSlop", "Lkotlin/k2;", "onPointerSlopReached", "a", "(Landroidx/compose/ui/input/pointer/c;JILld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Function1;", "Li0/f;", "getDragDirectionValue", "b", "(Landroidx/compose/ui/input/pointer/c;JILld/p;Lld/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/p;", "", "c", "(Landroidx/compose/ui/input/pointer/p;J)Z", "Landroidx/compose/ui/platform/s5;", "d", "(Landroidx/compose/ui/platform/s5;I)F", "Landroidx/compose/ui/unit/h;", "F", "mouseSlop", "defaultTouchSlop", "mouseToTouchSlopRatio", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nDragGestureDetectorCopy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetectorCopy.kt\nandroidx/compose/material3/DragGestureDetectorCopyKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,136:1\n74#1,10:137\n84#1,4:156\n88#1,29:167\n116#2,2:147\n33#2,6:149\n118#2:155\n33#2,6:160\n118#2:166\n116#2,2:196\n33#2,6:198\n118#2:204\n116#2,2:205\n33#2,6:207\n118#2:213\n116#2,2:214\n33#2,6:216\n118#2:222\n164#3:223\n154#3:224\n81#4:225\n*S KotlinDebug\n*F\n+ 1 DragGestureDetectorCopy.kt\nandroidx/compose/material3/DragGestureDetectorCopyKt\n*L\n41#1:137,10\n41#1:156,4\n41#1:167,29\n41#1:147,2\n41#1:149,6\n41#1:155\n41#1:160,6\n41#1:166\n83#1:196,2\n83#1:198,6\n83#1:204\n87#1:205,2\n87#1:207,6\n87#1:213\n124#1:214,2\n124#1:216,6\n124#1:222\n126#1:223\n127#1:224\n128#1:225\n*E\n"})
/* loaded from: classes.dex */
public final class s4 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f14308a;

    /* renamed from: b, reason: collision with root package name */
    private static final float f14309b;

    /* renamed from: c, reason: collision with root package name */
    private static final float f14310c;

    /* compiled from: DragGestureDetectorCopy.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.DragGestureDetectorCopyKt", f = "DragGestureDetectorCopy.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {145, 183}, m = "awaitHorizontalPointerSlopOrCancellation-gDDlDlE", n = {"onPointerSlopReached", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointer$iv", "touchSlop$iv", "totalPositionChange$iv", "onPointerSlopReached", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointer$iv", "dragEvent$iv", "touchSlop$iv", "totalPositionChange$iv"}, s = {"L$0", "L$1", "L$2", "F$0", "F$1", "L$0", "L$1", "L$2", "L$3", "F$0", "F$1"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f14311b;

        /* renamed from: c, reason: collision with root package name */
        Object f14312c;

        /* renamed from: d, reason: collision with root package name */
        Object f14313d;

        /* renamed from: e, reason: collision with root package name */
        Object f14314e;

        /* renamed from: f, reason: collision with root package name */
        float f14315f;

        /* renamed from: g, reason: collision with root package name */
        float f14316g;

        /* renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f14317h;

        /* renamed from: i, reason: collision with root package name */
        int f14318i;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f14317h = obj;
            this.f14318i |= Integer.MIN_VALUE;
            return s4.a(null, 0L, 0, null, this);
        }
    }

    static {
        float g4 = androidx.compose.ui.unit.h.g((float) 0.125d);
        f14308a = g4;
        float f4 = 18;
        f14309b = f4;
        f14310c = g4 / f4;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0119 -> B:14:0x0124). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x015a -> B:11:0x015c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x017d -> B:14:0x0124). Please report as a decompilation issue!!! */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@fg.l androidx.compose.ui.input.pointer.c r20, long r21, int r23, @fg.l ld.p<? super androidx.compose.ui.input.pointer.b0, ? super java.lang.Float, kotlin.k2> r24, @fg.l kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.b0> r25) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.s4.a(androidx.compose.ui.input.pointer.c, long, int, ld.p, kotlin.coroutines.d):java.lang.Object");
    }

    private static final Object b(androidx.compose.ui.input.pointer.c cVar, long j4, int i4, ld.p<? super androidx.compose.ui.input.pointer.b0, ? super Float, kotlin.k2> pVar, ld.l<? super i0.f, Float> lVar, kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.b0> dVar) {
        float f4;
        androidx.compose.ui.input.pointer.b0 b0Var;
        float f5;
        androidx.compose.ui.input.pointer.b0 b0Var2;
        if (c(cVar.v3(), j4)) {
            return null;
        }
        float d5 = d(cVar.d(), i4);
        k1.g gVar = new k1.g();
        gVar.f75328b = j4;
        float f6 = 0.0f;
        while (true) {
            androidx.compose.ui.input.pointer.p pVar2 = (androidx.compose.ui.input.pointer.p) androidx.compose.ui.input.pointer.c.a1(cVar, null, dVar, 1, null);
            List<androidx.compose.ui.input.pointer.b0> e4 = pVar2.e();
            int size = e4.size();
            int i5 = 0;
            int i6 = 0;
            while (true) {
                if (i6 >= size) {
                    f4 = f6;
                    b0Var = null;
                    break;
                }
                b0Var = e4.get(i6);
                f4 = f6;
                if (Boolean.valueOf(androidx.compose.ui.input.pointer.a0.d(b0Var.getId(), gVar.f75328b)).booleanValue()) {
                    break;
                }
                i6++;
                f6 = f4;
            }
            kotlin.jvm.internal.l0.m(b0Var);
            androidx.compose.ui.input.pointer.b0 b0Var3 = b0Var;
            if (b0Var3.D()) {
                return null;
            }
            if (androidx.compose.ui.input.pointer.q.e(b0Var3)) {
                List<androidx.compose.ui.input.pointer.b0> e5 = pVar2.e();
                int size2 = e5.size();
                while (true) {
                    if (i5 >= size2) {
                        b0Var2 = null;
                        break;
                    }
                    b0Var2 = e5.get(i5);
                    if (Boolean.valueOf(b0Var2.getPressed()).booleanValue()) {
                        break;
                    }
                    i5++;
                }
                androidx.compose.ui.input.pointer.b0 b0Var4 = b0Var2;
                if (b0Var4 == null) {
                    return null;
                }
                gVar.f75328b = b0Var4.getId();
                f5 = f4;
            } else {
                float floatValue = (lVar.invoke(i0.f.d(b0Var3.getPosition())).floatValue() - lVar.invoke(i0.f.d(b0Var3.getPreviousPosition())).floatValue()) + f4;
                if (Math.abs(floatValue) < d5) {
                    cVar.u3(androidx.compose.ui.input.pointer.r.Final, dVar);
                    if (b0Var3.D()) {
                        return null;
                    }
                    f5 = floatValue;
                } else {
                    pVar.invoke(b0Var3, Float.valueOf(floatValue - (Math.signum(floatValue) * d5)));
                    if (b0Var3.D()) {
                        return b0Var3;
                    }
                    f5 = 0.0f;
                    f6 = f5;
                }
            }
            f6 = f5;
        }
    }

    private static final boolean c(androidx.compose.ui.input.pointer.p pVar, long j4) {
        androidx.compose.ui.input.pointer.b0 b0Var;
        List<androidx.compose.ui.input.pointer.b0> e4 = pVar.e();
        int size = e4.size();
        boolean z4 = false;
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                b0Var = null;
                break;
            }
            b0Var = e4.get(i4);
            if (androidx.compose.ui.input.pointer.a0.d(b0Var.getId(), j4)) {
                break;
            }
            i4++;
        }
        androidx.compose.ui.input.pointer.b0 b0Var2 = b0Var;
        if (b0Var2 != null && b0Var2.getPressed()) {
            z4 = true;
        }
        return true ^ z4;
    }

    public static final float d(@fg.l androidx.compose.ui.platform.s5 s5Var, int i4) {
        androidx.compose.ui.input.pointer.q0.INSTANCE.getClass();
        return androidx.compose.ui.input.pointer.q0.i(i4, androidx.compose.ui.input.pointer.q0.f18818e) ? s5Var.h() * f14310c : s5Var.h();
    }
}
