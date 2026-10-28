package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.o0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: FontMatcher.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJH\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0080\b¢\u0006\u0004\b\u0011\u0010\u0012J.\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J.\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0014\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/text/font/j0;", "", "<init>", "()V", "", "Landroidx/compose/ui/text/font/x;", "fontList", "Landroidx/compose/ui/text/font/o0;", "fontWeight", "Landroidx/compose/ui/text/font/k0;", "fontStyle", "e", "(Ljava/util/List;Landroidx/compose/ui/text/font/o0;I)Ljava/util/List;", "", "preferBelow", "minSearchRange", "maxSearchRange", "a", "(Ljava/util/List;Landroidx/compose/ui/text/font/o0;ZLandroidx/compose/ui/text/font/o0;Landroidx/compose/ui/text/font/o0;)Ljava/util/List;", "Landroidx/compose/ui/text/font/y;", "fontFamily", "c", "(Landroidx/compose/ui/text/font/y;Landroidx/compose/ui/text/font/o0;I)Ljava/util/List;", "Landroidx/compose/ui/text/font/f0;", "d", "(Landroidx/compose/ui/text/font/f0;Landroidx/compose/ui/text/font/o0;I)Ljava/util/List;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nFontMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontMatcher.kt\nandroidx/compose/ui/text/font/FontMatcher\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,166:1\n102#1,34:190\n102#1,34:235\n108#1,28:280\n108#1,28:319\n235#2,3:167\n33#2,4:170\n238#2,2:174\n38#2:176\n240#2:177\n235#2,3:178\n33#2,4:181\n238#2,2:185\n38#2:187\n240#2:188\n235#2,3:224\n33#2,4:227\n238#2,2:231\n38#2:233\n240#2:234\n235#2,3:269\n33#2,4:272\n238#2,2:276\n38#2:278\n240#2:279\n235#2,3:308\n33#2,4:311\n238#2,2:315\n38#2:317\n240#2:318\n235#2,3:347\n33#2,4:350\n238#2,2:354\n38#2:356\n240#2:357\n235#2,3:358\n33#2,4:361\n238#2,2:365\n38#2:367\n240#2:368\n235#2,3:369\n33#2,4:372\n238#2,2:376\n38#2:378\n240#2:379\n1#3:189\n*S KotlinDebug\n*F\n+ 1 FontMatcher.kt\nandroidx/compose/ui/text/font/FontMatcher\n*L\n65#1:190,34\n71#1:235,34\n80#1:280,28\n87#1:319,28\n49#1:167,3\n49#1:170,4\n49#1:174,2\n49#1:176\n49#1:177\n57#1:178,3\n57#1:181,4\n57#1:185,2\n57#1:187\n57#1:188\n65#1:224,3\n65#1:227,4\n65#1:231,2\n65#1:233\n65#1:234\n71#1:269,3\n71#1:272,4\n71#1:276,2\n71#1:278\n71#1:279\n80#1:308,3\n80#1:311,4\n80#1:315,2\n80#1:317\n80#1:318\n87#1:347,3\n87#1:350,4\n87#1:354,2\n87#1:356\n87#1:357\n135#1:358,3\n135#1:361,4\n135#1:365,2\n135#1:367\n135#1:368\n135#1:369,3\n135#1:372,4\n135#1:376,2\n135#1:378\n135#1:379\n*E\n"})
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f20747a = 0;

    public static /* synthetic */ List b(j0 j0Var, List list, o0 o0Var, boolean z4, o0 o0Var2, o0 o0Var3, int i4, Object obj) {
        o0 o0Var4 = null;
        if ((i4 & 4) != 0) {
            o0Var2 = null;
        }
        if ((i4 & 8) != 0) {
            o0Var3 = null;
        }
        int size = list.size();
        int i5 = 0;
        o0 o0Var5 = null;
        while (true) {
            if (i5 >= size) {
                break;
            }
            o0 weight = ((x) list.get(i5)).getWeight();
            if ((o0Var2 == null || weight.compareTo(o0Var2) >= 0) && (o0Var3 == null || weight.compareTo(o0Var3) <= 0)) {
                if (weight.compareTo(o0Var) >= 0) {
                    if (weight.compareTo(o0Var) <= 0) {
                        o0Var4 = weight;
                        o0Var5 = o0Var4;
                        break;
                    }
                    if (o0Var5 == null || weight.compareTo(o0Var5) < 0) {
                        o0Var5 = weight;
                    }
                } else if (o0Var4 == null || weight.compareTo(o0Var4) > 0) {
                    o0Var4 = weight;
                }
            }
            i5++;
        }
        if (!z4 ? o0Var5 != null : o0Var4 == null) {
            o0Var4 = o0Var5;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        for (int i6 = 0; i6 < size2; i6++) {
            Object obj2 = list.get(i6);
            if (kotlin.jvm.internal.l0.g(((x) obj2).getWeight(), o0Var4)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    @fg.l
    public final List<x> a(@fg.l List<? extends x> list, @fg.l o0 o0Var, boolean z4, @fg.m o0 o0Var2, @fg.m o0 o0Var3) {
        int size = list.size();
        o0 o0Var4 = null;
        o0 o0Var5 = null;
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                break;
            }
            o0 weight = list.get(i4).getWeight();
            if ((o0Var2 == null || weight.compareTo(o0Var2) >= 0) && (o0Var3 == null || weight.compareTo(o0Var3) <= 0)) {
                if (weight.compareTo(o0Var) >= 0) {
                    if (weight.compareTo(o0Var) <= 0) {
                        o0Var4 = weight;
                        o0Var5 = o0Var4;
                        break;
                    }
                    if (o0Var5 == null || weight.compareTo(o0Var5) < 0) {
                        o0Var5 = weight;
                    }
                } else if (o0Var4 == null || weight.compareTo(o0Var4) > 0) {
                    o0Var4 = weight;
                }
            }
            i4++;
        }
        if (!z4 ? o0Var5 != null : o0Var4 == null) {
            o0Var4 = o0Var5;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        for (int i5 = 0; i5 < size2; i5++) {
            x xVar = list.get(i5);
            if (kotlin.jvm.internal.l0.g(xVar.getWeight(), o0Var4)) {
                arrayList.add(xVar);
            }
        }
        return arrayList;
    }

    @fg.l
    public final List<x> c(@fg.l y fontFamily, @fg.l o0 fontWeight, int fontStyle) {
        if (fontFamily instanceof f0) {
            return d((f0) fontFamily, fontWeight, fontStyle);
        }
        throw new IllegalArgumentException("Only FontFamily instances that presents a list of Fonts can be used");
    }

    @fg.l
    public final List<x> d(@fg.l f0 fontFamily, @fg.l o0 fontWeight, int fontStyle) {
        return e(fontFamily.s(), fontWeight, fontStyle);
    }

    @fg.l
    public final List<x> e(@fg.l List<? extends x> fontList, @fg.l o0 fontWeight, int fontStyle) {
        ArrayList arrayList = new ArrayList(fontList.size());
        int size = fontList.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            x xVar = fontList.get(i5);
            x xVar2 = xVar;
            if (kotlin.jvm.internal.l0.g(xVar2.getWeight(), fontWeight) && k0.f(xVar2.getStyle(), fontStyle)) {
                arrayList.add(xVar);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(fontList.size());
        int size2 = fontList.size();
        for (int i6 = 0; i6 < size2; i6++) {
            x xVar3 = fontList.get(i6);
            if (k0.f(xVar3.getStyle(), fontStyle)) {
                arrayList2.add(xVar3);
            }
        }
        if (!arrayList2.isEmpty()) {
            fontList = arrayList2;
        }
        List<? extends x> list = fontList;
        o0.Companion companion = o0.INSTANCE;
        companion.getClass();
        o0 o0Var = null;
        if (fontWeight.compareTo(o0.f20825h) < 0) {
            int size3 = list.size();
            o0 o0Var2 = null;
            int i7 = 0;
            while (true) {
                if (i7 >= size3) {
                    break;
                }
                o0 weight = list.get(i7).getWeight();
                if (weight.compareTo(fontWeight) >= 0) {
                    if (weight.compareTo(fontWeight) <= 0) {
                        o0Var2 = weight;
                        o0Var = o0Var2;
                        break;
                    }
                    if (o0Var2 == null || weight.compareTo(o0Var2) < 0) {
                        o0Var2 = weight;
                    }
                } else if (o0Var == null || weight.compareTo(o0Var) > 0) {
                    o0Var = weight;
                }
                i7++;
            }
            if (o0Var != null) {
                o0Var2 = o0Var;
            }
            ArrayList arrayList3 = new ArrayList(list.size());
            int size4 = list.size();
            while (i4 < size4) {
                x xVar4 = list.get(i4);
                if (kotlin.jvm.internal.l0.g(xVar4.getWeight(), o0Var2)) {
                    arrayList3.add(xVar4);
                }
                i4++;
            }
            return arrayList3;
        }
        companion.getClass();
        if (fontWeight.compareTo(o0.f20826i) > 0) {
            int size5 = list.size();
            o0 o0Var3 = null;
            int i10 = 0;
            while (true) {
                if (i10 >= size5) {
                    break;
                }
                o0 weight2 = list.get(i10).getWeight();
                if (weight2.compareTo(fontWeight) >= 0) {
                    if (weight2.compareTo(fontWeight) <= 0) {
                        o0Var3 = weight2;
                        o0Var = o0Var3;
                        break;
                    }
                    if (o0Var3 == null || weight2.compareTo(o0Var3) < 0) {
                        o0Var3 = weight2;
                    }
                } else if (o0Var == null || weight2.compareTo(o0Var) > 0) {
                    o0Var = weight2;
                }
                i10++;
            }
            if (o0Var3 == null) {
                o0Var3 = o0Var;
            }
            ArrayList arrayList4 = new ArrayList(list.size());
            int size6 = list.size();
            while (i4 < size6) {
                x xVar5 = list.get(i4);
                if (kotlin.jvm.internal.l0.g(xVar5.getWeight(), o0Var3)) {
                    arrayList4.add(xVar5);
                }
                i4++;
            }
            return arrayList4;
        }
        companion.getClass();
        o0 o0Var4 = o0.f20826i;
        int size7 = list.size();
        o0 o0Var5 = null;
        o0 o0Var6 = null;
        int i11 = 0;
        while (true) {
            if (i11 >= size7) {
                break;
            }
            o0 weight3 = list.get(i11).getWeight();
            if (o0Var4 == null || weight3.compareTo(o0Var4) <= 0) {
                if (weight3.compareTo(fontWeight) >= 0) {
                    if (weight3.compareTo(fontWeight) <= 0) {
                        o0Var5 = weight3;
                        o0Var6 = o0Var5;
                        break;
                    }
                    if (o0Var6 == null || weight3.compareTo(o0Var6) < 0) {
                        o0Var6 = weight3;
                    }
                } else if (o0Var5 == null || weight3.compareTo(o0Var5) > 0) {
                    o0Var5 = weight3;
                }
            }
            i11++;
        }
        if (o0Var6 != null) {
            o0Var5 = o0Var6;
        }
        ArrayList arrayList5 = new ArrayList(list.size());
        int size8 = list.size();
        for (int i12 = 0; i12 < size8; i12++) {
            x xVar6 = list.get(i12);
            if (kotlin.jvm.internal.l0.g(xVar6.getWeight(), o0Var5)) {
                arrayList5.add(xVar6);
            }
        }
        if (!arrayList5.isEmpty()) {
            return arrayList5;
        }
        o0.INSTANCE.getClass();
        o0 o0Var7 = o0.f20826i;
        int size9 = list.size();
        o0 o0Var8 = null;
        int i13 = 0;
        while (true) {
            if (i13 >= size9) {
                break;
            }
            o0 weight4 = list.get(i13).getWeight();
            if (o0Var7 == null || weight4.compareTo(o0Var7) >= 0) {
                if (weight4.compareTo(fontWeight) >= 0) {
                    if (weight4.compareTo(fontWeight) <= 0) {
                        o0Var = weight4;
                        o0Var8 = o0Var;
                        break;
                    }
                    if (o0Var8 == null || weight4.compareTo(o0Var8) < 0) {
                        o0Var8 = weight4;
                    }
                } else if (o0Var == null || weight4.compareTo(o0Var) > 0) {
                    o0Var = weight4;
                }
            }
            i13++;
        }
        if (o0Var8 != null) {
            o0Var = o0Var8;
        }
        ArrayList arrayList6 = new ArrayList(list.size());
        int size10 = list.size();
        while (i4 < size10) {
            x xVar7 = list.get(i4);
            if (kotlin.jvm.internal.l0.g(xVar7.getWeight(), o0Var)) {
                arrayList6.add(xVar7);
            }
            i4++;
        }
        return arrayList6;
    }
}
