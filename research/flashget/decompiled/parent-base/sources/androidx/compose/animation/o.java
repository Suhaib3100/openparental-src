package androidx.compose.animation;

import androidx.compose.ui.layout.i1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: AnimatedVisibility.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\r\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0013\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0016\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J)\u0010\u0017\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0014J)\u0010\u0018\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"Landroidx/compose/animation/o;", "Landroidx/compose/ui/layout/m0;", "Landroidx/compose/animation/t;", "scope", "<init>", "(Landroidx/compose/animation/t;)V", "Landroidx/compose/ui/layout/o0;", "", "Landroidx/compose/ui/layout/l0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "a", "(Landroidx/compose/ui/layout/o0;Ljava/util/List;J)Landroidx/compose/ui/layout/n0;", "Landroidx/compose/ui/layout/q;", "Landroidx/compose/ui/layout/p;", "", "height", "d", "(Landroidx/compose/ui/layout/q;Ljava/util/List;I)I", "width", "c", "b", "e", "Landroidx/compose/animation/t;", "j", "()Landroidx/compose/animation/t;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nAnimatedVisibility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedEnterExitMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,919:1\n151#2,3:920\n33#2,4:923\n154#2,2:927\n38#2:929\n156#2:930\n171#2,13:931\n171#2,13:944\n317#2,8:957\n317#2,8:965\n317#2,8:973\n317#2,8:981\n*S KotlinDebug\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedEnterExitMeasurePolicy\n*L\n851#1:920,3\n851#1:923,4\n851#1:927,2\n851#1:929\n851#1:930\n852#1:931,13\n853#1:944,13\n866#1:957,8\n871#1:965,8\n876#1:973,8\n881#1:981,8\n*E\n"})
/* loaded from: classes.dex */
final class o implements androidx.compose.ui.layout.m0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final t scope;

    /* compiled from: AnimatedVisibility.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nAnimatedVisibility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedEnterExitMeasurePolicy$measure$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,919:1\n33#2,6:920\n*S KotlinDebug\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedEnterExitMeasurePolicy$measure$1\n*L\n857#1:920,6\n*E\n"})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<i1.a, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<i1> f3242b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(List<? extends i1> list) {
            super(1);
            this.f3242b = list;
        }

        public final void a(@fg.l i1.a aVar) {
            List<i1> list = this.f3242b;
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                i1.a.g(aVar, list.get(i4), 0, 0, 0.0f, 4, null);
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(i1.a aVar) {
            a(aVar);
            return k2.f75408a;
        }
    }

    public o(@fg.l t tVar) {
        this.scope = tVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v21 */
    @Override // androidx.compose.ui.layout.m0
    @fg.l
    public androidx.compose.ui.layout.n0 a(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l List<? extends androidx.compose.ui.layout.l0> list, long j4) {
        Object obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i4 = 0;
        while (i4 < size) {
            i4 = n.a(list.get(i4), j4, arrayList, i4, 1);
        }
        i1 i1Var = null;
        int i5 = 1;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int width = ((i1) obj).getWidth();
            int J = kotlin.collections.w.J(arrayList);
            if (1 <= J) {
                int i6 = 1;
                while (true) {
                    Object obj2 = arrayList.get(i6);
                    int width2 = ((i1) obj2).getWidth();
                    if (width < width2) {
                        obj = obj2;
                        width = width2;
                    }
                    if (i6 == J) {
                        break;
                    }
                    i6++;
                }
            }
        }
        i1 i1Var2 = (i1) obj;
        int width3 = i1Var2 != null ? i1Var2.getWidth() : 0;
        if (!arrayList.isEmpty()) {
            ?? r02 = arrayList.get(0);
            int height = ((i1) r02).getHeight();
            int J2 = kotlin.collections.w.J(arrayList);
            boolean z4 = r02;
            if (1 <= J2) {
                while (true) {
                    Object obj3 = arrayList.get(i5);
                    int height2 = ((i1) obj3).getHeight();
                    r02 = z4;
                    if (height < height2) {
                        r02 = obj3;
                        height = height2;
                    }
                    if (i5 == J2) {
                        break;
                    }
                    i5++;
                    z4 = r02;
                }
            }
            i1Var = r02;
        }
        i1 i1Var3 = i1Var;
        int height3 = i1Var3 != null ? i1Var3.getHeight() : 0;
        this.scope.a().setValue(androidx.compose.ui.unit.u.b(androidx.compose.ui.unit.v.a(width3, height3)));
        return androidx.compose.ui.layout.o0.x2(o0Var, width3, height3, null, new a(arrayList), 4, null);
    }

    @Override // androidx.compose.ui.layout.m0
    public int b(@fg.l androidx.compose.ui.layout.q qVar, @fg.l List<? extends androidx.compose.ui.layout.p> list, int i4) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(list.get(0).l0(i4));
            int J = kotlin.collections.w.J(list);
            int i5 = 1;
            if (1 <= J) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(list.get(i5).l0(i4));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i5 == J) {
                        break;
                    }
                    i5++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.m0
    public int c(@fg.l androidx.compose.ui.layout.q qVar, @fg.l List<? extends androidx.compose.ui.layout.p> list, int i4) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(list.get(0).Z(i4));
            int J = kotlin.collections.w.J(list);
            int i5 = 1;
            if (1 <= J) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(list.get(i5).Z(i4));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i5 == J) {
                        break;
                    }
                    i5++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.m0
    public int d(@fg.l androidx.compose.ui.layout.q qVar, @fg.l List<? extends androidx.compose.ui.layout.p> list, int i4) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(list.get(0).k0(i4));
            int J = kotlin.collections.w.J(list);
            int i5 = 1;
            if (1 <= J) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(list.get(i5).k0(i4));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i5 == J) {
                        break;
                    }
                    i5++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.m0
    public int e(@fg.l androidx.compose.ui.layout.q qVar, @fg.l List<? extends androidx.compose.ui.layout.p> list, int i4) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(list.get(0).t(i4));
            int J = kotlin.collections.w.J(list);
            int i5 = 1;
            if (1 <= J) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(list.get(i5).t(i4));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i5 == J) {
                        break;
                    }
                    i5++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @fg.l
    /* renamed from: j, reason: from getter */
    public final t getScope() {
        return this.scope;
    }
}
