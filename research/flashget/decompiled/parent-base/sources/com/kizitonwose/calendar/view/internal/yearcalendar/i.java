package com.kizitonwose.calendar.view.internal.yearcalendar;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.a1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.q0;
import kotlin.z0;
import org.threeten.bp.q;

/* compiled from: YearRoot.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a»\u0001\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00002\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00152\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a'\u0010!\u001a\u00020 2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0000H\u0002¢\u0006\u0004\b!\u0010\"\u001a\u001f\u0010$\u001a\u00020#2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b$\u0010%\u001a\u0017\u0010(\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&H\u0000¢\u0006\u0004\b(\u0010)¨\u0006*"}, d2 = {"", "monthColumns", "monthHorizontalSpacing", "monthVerticalSpacing", "Lcom/kizitonwose/calendar/view/g;", "yearItemMargins", "yearBodyMargins", "Lcom/kizitonwose/calendar/view/e;", "daySize", "Lcom/kizitonwose/calendar/view/j;", "monthHeight", "Landroid/content/Context;", "context", "dayViewResource", "Lcom/kizitonwose/calendar/view/h;", "Lcom/kizitonwose/calendar/view/l;", "dayBinder", "monthHeaderResource", "monthFooterResource", "", "monthViewClass", "Lcom/kizitonwose/calendar/view/i;", "monthHeaderBinder", "monthFooterBinder", "yearItemViewClass", "yearItemHeaderResource", "yearItemFooterResource", "Lcom/kizitonwose/calendar/view/internal/yearcalendar/g;", "d", "(IIILcom/kizitonwose/calendar/view/g;Lcom/kizitonwose/calendar/view/g;Lcom/kizitonwose/calendar/view/e;Lcom/kizitonwose/calendar/view/j;Landroid/content/Context;ILcom/kizitonwose/calendar/view/h;IILjava/lang/String;Lcom/kizitonwose/calendar/view/i;Lcom/kizitonwose/calendar/view/i;Ljava/lang/String;II)Lcom/kizitonwose/calendar/view/internal/yearcalendar/g;", "orientation", "axisSpacing", "Landroid/widget/LinearLayout;", "a", "(Landroid/content/Context;II)Landroid/widget/LinearLayout;", "Landroid/widget/LinearLayout$LayoutParams;", "b", "(Lcom/kizitonwose/calendar/view/e;Lcom/kizitonwose/calendar/view/j;)Landroid/widget/LinearLayout$LayoutParams;", "Lorg/threeten/bp/q;", "month", "c", "(Lorg/threeten/bp/q;)I", "Calendar-View_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nYearRoot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YearRoot.kt\ncom/kizitonwose/calendar/view/internal/yearcalendar/YearRootKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 CustomViewClass.kt\ncom/kizitonwose/calendar/view/internal/CustomViewClassKt\n*L\n1#1,185:1\n2634#2:186\n1#3:187\n1#3:209\n12#4,21:188\n*S KotlinDebug\n*F\n+ 1 YearRoot.kt\ncom/kizitonwose/calendar/view/internal/yearcalendar/YearRootKt\n*L\n88#1:186\n88#1:187\n120#1:209\n120#1:188,21\n*E\n"})
/* loaded from: classes6.dex */
public final class i {

    /* compiled from: YearRoot.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66839a;

        static {
            int[] iArr = new int[com.kizitonwose.calendar.view.j.values().length];
            try {
                iArr[com.kizitonwose.calendar.view.j.FollowDaySize.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.kizitonwose.calendar.view.j.Fill.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f66839a = iArr;
        }
    }

    private static final LinearLayout a(Context context, int i4, int i5) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(i4);
        if (i5 > 0) {
            linearLayout.setShowDividers(2);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
            if (i4 == 1) {
                shapeDrawable.setIntrinsicHeight(i5);
            } else {
                shapeDrawable.setIntrinsicWidth(i5);
            }
            shapeDrawable.getPaint().setColor(0);
            linearLayout.setDividerDrawable(shapeDrawable);
        }
        return linearLayout;
    }

    private static final LinearLayout.LayoutParams b(com.kizitonwose.calendar.view.e eVar, com.kizitonwose.calendar.view.j jVar) {
        int i4 = eVar.getParentDecidesWidth$Calendar_View_release() ? -1 : -2;
        int i5 = a.f66839a[jVar.ordinal()];
        if (i5 == 1) {
            return new LinearLayout.LayoutParams(i4, eVar.getParentDecidesHeight$Calendar_View_release() ? 0 : -2, eVar.getParentDecidesHeight$Calendar_View_release() ? 1.0f : 0.0f);
        }
        if (i5 == 2) {
            return new LinearLayout.LayoutParams(i4, 0, 1.0f);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int c(@l q qVar) {
        l0.p(qVar, ProtectedSandApp.s("ᕮ\u0001"));
        return qVar.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r20v0, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r4v10, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [android.view.ViewGroup] */
    @l
    public static final g d(int i4, int i5, int i6, @l com.kizitonwose.calendar.view.g gVar, @l com.kizitonwose.calendar.view.g gVar2, @l com.kizitonwose.calendar.view.e eVar, @l com.kizitonwose.calendar.view.j jVar, @l Context context, int i7, @m com.kizitonwose.calendar.view.h<com.kizitonwose.calendar.view.l> hVar, int i10, int i11, @m String str, @m com.kizitonwose.calendar.view.i<com.kizitonwose.calendar.view.l> iVar, @m com.kizitonwose.calendar.view.i<com.kizitonwose.calendar.view.l> iVar2, @m String str2, int i12, int i13) {
        View view;
        int i14;
        Object obj;
        View view2;
        Object a5;
        int i15;
        Object obj2;
        int i16;
        int i17;
        int i18 = i4;
        Context context2 = context;
        l0.p(gVar, ProtectedSandApp.s("ᕯ\u0001"));
        l0.p(gVar2, ProtectedSandApp.s("ᕰ\u0001"));
        l0.p(eVar, ProtectedSandApp.s("ᕱ\u0001"));
        l0.p(jVar, ProtectedSandApp.s("ᕲ\u0001"));
        l0.p(context2, ProtectedSandApp.s("ᕳ\u0001"));
        ?? linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(1);
        LinearLayout a6 = a(context2, 1, i6);
        int i19 = 0;
        if (i12 != 0) {
            view = com.kizitonwose.calendar.view.internal.l.b(linearLayout, i12, false, 2, null);
            linearLayout.addView(view);
        } else {
            view = null;
        }
        int min = (12 / i18) + Math.min(12 % i18, 1);
        ArrayList arrayList = new ArrayList(min);
        while (i19 < min) {
            int i20 = 0;
            LinearLayout a7 = a(context2, 0, i5);
            ArrayList arrayList2 = new ArrayList(i18);
            int i21 = 0;
            while (i21 < i18) {
                arrayList2.add(new h(eVar, i7, hVar, i10, i11, str, iVar, iVar2));
                i21++;
                i18 = i4;
                arrayList = arrayList;
                i20 = i20;
                min = min;
                i19 = i19;
                a6 = a6;
                view = view;
            }
            View view3 = view;
            ArrayList arrayList3 = arrayList;
            int i22 = min;
            int i23 = i19;
            int i24 = i20;
            ?? r20 = a6;
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                a7.addView(((h) it.next()).b(a7), new LinearLayout.LayoutParams(i24, eVar.getParentDecidesHeight$Calendar_View_release() ? -1 : -2, 1.0f));
            }
            r20.addView(a7, b(eVar, jVar));
            arrayList3.add(new q0(a7, arrayList2));
            i19 = i23 + 1;
            i18 = i4;
            context2 = context;
            arrayList = arrayList3;
            a6 = r20;
            min = i22;
            view = view3;
        }
        View view4 = view;
        ArrayList arrayList4 = arrayList;
        LinearLayout.LayoutParams b5 = b(eVar, jVar);
        b5.bottomMargin = gVar2.h();
        b5.topMargin = gVar2.k();
        b5.setMarginStart(gVar2.j());
        b5.setMarginEnd(gVar2.i());
        k2 k2Var = k2.f75408a;
        linearLayout.addView(a6, b5);
        if (i13 != 0) {
            i14 = 2;
            obj = null;
            view2 = com.kizitonwose.calendar.view.internal.l.b(linearLayout, i13, false, 2, null);
            linearLayout.addView(view2);
        } else {
            i14 = 2;
            obj = null;
            view2 = null;
        }
        if (str2 != null) {
            try {
                z0.Companion companion = z0.INSTANCE;
                Object newInstance = Class.forName(str2).getDeclaredConstructor(Context.class).newInstance(linearLayout.getContext());
                l0.n(newInstance, ProtectedSandApp.s("ᕴ\u0001"));
                a5 = (ViewGroup) newInstance;
            } catch (Throwable th) {
                z0.Companion companion2 = z0.INSTANCE;
                a5 = a1.a(th);
            }
            z0.e(a5);
            if (a5 instanceof z0.b) {
                a5 = obj;
            }
            ?? r02 = (ViewGroup) a5;
            if (r02 != 0) {
                int i25 = eVar.getParentDecidesWidth$Calendar_View_release() ? -1 : -2;
                int i26 = a.f66839a[jVar.ordinal()];
                i15 = 1;
                if (i26 != 1) {
                    if (i26 != i14) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (!eVar.getParentDecidesHeight$Calendar_View_release()) {
                    i16 = -2;
                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i25, i16);
                    marginLayoutParams.bottomMargin = gVar.h();
                    marginLayoutParams.topMargin = gVar.k();
                    marginLayoutParams.setMarginStart(gVar.j());
                    marginLayoutParams.setMarginEnd(gVar.i());
                    r02.setLayoutParams(marginLayoutParams);
                    r02.addView(linearLayout);
                    obj2 = r02;
                }
                i16 = -1;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(i25, i16);
                marginLayoutParams2.bottomMargin = gVar.h();
                marginLayoutParams2.topMargin = gVar.k();
                marginLayoutParams2.setMarginStart(gVar.j());
                marginLayoutParams2.setMarginEnd(gVar.i());
                r02.setLayoutParams(marginLayoutParams2);
                r02.addView(linearLayout);
                obj2 = r02;
            } else {
                i15 = 1;
                obj2 = obj;
            }
            if (obj2 != null) {
                linearLayout = obj2;
                return new g(linearLayout, view4, view2, arrayList4);
            }
        } else {
            i15 = 1;
        }
        int i27 = eVar.getParentDecidesWidth$Calendar_View_release() ? -1 : -2;
        int i28 = a.f66839a[jVar.ordinal()];
        if (i28 != i15) {
            if (i28 != i14) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (!eVar.getParentDecidesHeight$Calendar_View_release()) {
            i17 = -2;
            ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(i27, i17);
            marginLayoutParams3.bottomMargin = gVar.h();
            marginLayoutParams3.topMargin = gVar.k();
            marginLayoutParams3.setMarginStart(gVar.j());
            marginLayoutParams3.setMarginEnd(gVar.i());
            linearLayout.setLayoutParams(marginLayoutParams3);
            return new g(linearLayout, view4, view2, arrayList4);
        }
        i17 = -1;
        ViewGroup.MarginLayoutParams marginLayoutParams32 = new ViewGroup.MarginLayoutParams(i27, i17);
        marginLayoutParams32.bottomMargin = gVar.h();
        marginLayoutParams32.topMargin = gVar.k();
        marginLayoutParams32.setMarginStart(gVar.j());
        marginLayoutParams32.setMarginEnd(gVar.i());
        linearLayout.setLayoutParams(marginLayoutParams32);
        return new g(linearLayout, view4, view2, arrayList4);
    }
}
