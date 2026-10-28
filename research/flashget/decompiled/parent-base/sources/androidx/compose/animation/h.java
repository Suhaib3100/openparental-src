package androidx.compose.animation;

import androidx.compose.animation.m;
import androidx.compose.ui.layout.i1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: AnimatedContent.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\r\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0013\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0016\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J)\u0010\u0017\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0014J)\u0010\u0018\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0014R\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"Landroidx/compose/animation/h;", "Landroidx/compose/ui/layout/m0;", "Landroidx/compose/animation/m;", "rootScope", "<init>", "(Landroidx/compose/animation/m;)V", "Landroidx/compose/ui/layout/o0;", "", "Landroidx/compose/ui/layout/l0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "a", "(Landroidx/compose/ui/layout/o0;Ljava/util/List;J)Landroidx/compose/ui/layout/n0;", "Landroidx/compose/ui/layout/q;", "Landroidx/compose/ui/layout/p;", "", "height", "d", "(Landroidx/compose/ui/layout/q;Ljava/util/List;I)I", "width", "c", "b", "e", "Landroidx/compose/animation/m;", "j", "()Landroidx/compose/animation/m;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,831:1\n69#2,6:832\n69#2,6:838\n317#2,8:872\n317#2,8:880\n317#2,8:888\n317#2,8:896\n14166#3,14:844\n14166#3,14:858\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentMeasurePolicy\n*L\n783#1:832,6\n792#1:838,6\n817#1:872,8\n821#1:880,8\n825#1:888,8\n829#1:896,8\n797#1:844,14\n798#1:858,14\n*E\n"})
/* loaded from: classes.dex */
final class h implements androidx.compose.ui.layout.m0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final m<?> rootScope;

    /* compiled from: AnimatedContent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentMeasurePolicy$measure$3\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,831:1\n13579#2,2:832\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentMeasurePolicy$measure$3\n*L\n802#1:832,2\n*E\n"})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<i1.a, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i1[] f3174b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ h f3175c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f3176d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f3177e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i1[] i1VarArr, h hVar, int i4, int i5) {
            super(1);
            this.f3174b = i1VarArr;
            this.f3175c = hVar;
            this.f3176d = i4;
            this.f3177e = i5;
        }

        public final void a(@fg.l i1.a aVar) {
            i1[] i1VarArr = this.f3174b;
            h hVar = this.f3175c;
            int i4 = this.f3176d;
            int i5 = this.f3177e;
            for (i1 i1Var : i1VarArr) {
                if (i1Var != null) {
                    long a5 = hVar.j().getContentAlignment().a(androidx.compose.ui.unit.v.a(i1Var.getWidth(), i1Var.getHeight()), androidx.compose.ui.unit.v.a(i4, i5), androidx.compose.ui.unit.w.Ltr);
                    i1.a.g(aVar, i1Var, androidx.compose.ui.unit.q.m(a5), (int) (a5 & 4294967295L), 0.0f, 4, null);
                }
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(i1.a aVar) {
            a(aVar);
            return k2.f75408a;
        }
    }

    public h(@fg.l m<?> mVar) {
        this.rootScope = mVar;
    }

    @Override // androidx.compose.ui.layout.m0
    @fg.l
    public androidx.compose.ui.layout.n0 a(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l List<? extends androidx.compose.ui.layout.l0> list, long j4) {
        i1 i1Var;
        i1 i1Var2;
        int size = list.size();
        i1[] i1VarArr = new i1[size];
        int size2 = list.size();
        int i4 = 0;
        while (true) {
            i1Var = null;
            if (i4 >= size2) {
                break;
            }
            androidx.compose.ui.layout.l0 l0Var = list.get(i4);
            Object parentData = l0Var.getParentData();
            m.a aVar = parentData instanceof m.a ? (m.a) parentData : null;
            if (aVar != null && aVar.e()) {
                i1VarArr[i4] = l0Var.m0(j4);
            }
            i4++;
        }
        int size3 = list.size();
        for (int i5 = 0; i5 < size3; i5++) {
            androidx.compose.ui.layout.l0 l0Var2 = list.get(i5);
            if (i1VarArr[i5] == null) {
                i1VarArr[i5] = l0Var2.m0(j4);
            }
        }
        if (size == 0) {
            i1Var2 = null;
        } else {
            i1Var2 = i1VarArr[0];
            int we2 = kotlin.collections.l.we(i1VarArr);
            if (we2 != 0) {
                int width = i1Var2 != null ? i1Var2.getWidth() : 0;
                kotlin.collections.u0 a5 = g.a(1, we2, 1);
                while (a5.hasNext()) {
                    i1 i1Var3 = i1VarArr[a5.c()];
                    int width2 = i1Var3 != null ? i1Var3.getWidth() : 0;
                    if (width < width2) {
                        i1Var2 = i1Var3;
                        width = width2;
                    }
                }
            }
        }
        int width3 = i1Var2 != null ? i1Var2.getWidth() : 0;
        if (size != 0) {
            i1Var = i1VarArr[0];
            int we3 = kotlin.collections.l.we(i1VarArr);
            if (we3 != 0) {
                int height = i1Var != null ? i1Var.getHeight() : 0;
                kotlin.collections.u0 a6 = g.a(1, we3, 1);
                while (a6.hasNext()) {
                    i1 i1Var4 = i1VarArr[a6.c()];
                    int height2 = i1Var4 != null ? i1Var4.getHeight() : 0;
                    if (height < height2) {
                        i1Var = i1Var4;
                        height = height2;
                    }
                }
            }
        }
        int height3 = i1Var != null ? i1Var.getHeight() : 0;
        this.rootScope.C(androidx.compose.ui.unit.v.a(width3, height3));
        return androidx.compose.ui.layout.o0.x2(o0Var, width3, height3, null, new a(i1VarArr, this, width3, height3), 4, null);
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
    public final m<?> j() {
        return this.rootScope;
    }
}
