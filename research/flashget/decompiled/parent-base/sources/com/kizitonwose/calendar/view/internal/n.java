package com.kizitonwose.calendar.view.internal;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.z0;

/* compiled from: ItemRoot.kt */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a{\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Day", "Lcom/kizitonwose/calendar/view/l;", "Container", "Lcom/kizitonwose/calendar/view/g;", "itemMargins", "Lcom/kizitonwose/calendar/view/e;", "daySize", "Landroid/content/Context;", "context", "", "dayViewResource", "itemHeaderResource", "itemFooterResource", "weekSize", "", "itemViewClass", "Lcom/kizitonwose/calendar/view/a;", "dayBinder", "Lcom/kizitonwose/calendar/view/internal/m;", "b", "(Lcom/kizitonwose/calendar/view/g;Lcom/kizitonwose/calendar/view/e;Landroid/content/Context;IIIILjava/lang/String;Lcom/kizitonwose/calendar/view/a;)Lcom/kizitonwose/calendar/view/internal/m;", "Lorg/threeten/bp/g;", "date", "a", "(Lorg/threeten/bp/g;)I", "Calendar-View_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nItemRoot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ItemRoot.kt\ncom/kizitonwose/calendar/view/internal/ItemRootKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 CustomViewClass.kt\ncom/kizitonwose/calendar/view/internal/CustomViewClassKt\n*L\n1#1,93:1\n1#2:94\n1#2:96\n1#2:118\n2634#3:95\n12#4,21:97\n*S KotlinDebug\n*F\n+ 1 ItemRoot.kt\ncom/kizitonwose/calendar/view/internal/ItemRootKt\n*L\n58#1:96\n70#1:118\n58#1:95\n70#1:97,21\n*E\n"})
/* loaded from: classes6.dex */
public final class n {
    public static final int a(@fg.l org.threeten.bp.g gVar) {
        l0.p(gVar, ProtectedSandApp.s("ᔡ\u0001"));
        return gVar.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.l
    public static final <Day, Container extends com.kizitonwose.calendar.view.l> m<Day> b(@fg.l com.kizitonwose.calendar.view.g gVar, @fg.l com.kizitonwose.calendar.view.e eVar, @fg.l Context context, int i4, int i5, int i6, int i7, @fg.m String str, @fg.l com.kizitonwose.calendar.view.a<Day, Container> aVar) {
        View view;
        View view2;
        Object a5;
        l0.p(gVar, ProtectedSandApp.s("ᔢ\u0001"));
        l0.p(eVar, ProtectedSandApp.s("ᔣ\u0001"));
        l0.p(context, ProtectedSandApp.s("ᔤ\u0001"));
        l0.p(aVar, ProtectedSandApp.s("ᔥ\u0001"));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout linearLayout2 = null;
        if (i5 != 0) {
            view = l.b(linearLayout, i5, false, 2, null);
            linearLayout.addView(view);
        } else {
            view = null;
        }
        i iVar = new i(eVar, i4, aVar);
        ArrayList arrayList = new ArrayList(i7);
        for (int i10 = 0; i10 < i7; i10++) {
            com.kizitonwose.calendar.view.e g4 = iVar.g();
            ArrayList arrayList2 = new ArrayList(7);
            int i11 = 0;
            for (int i12 = 7; i11 < i12; i12 = 7) {
                arrayList2.add(new j(iVar));
                i11++;
            }
            arrayList.add(new p(g4, arrayList2));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linearLayout.addView(((p) it.next()).b(linearLayout));
        }
        if (i6 != 0) {
            View b5 = l.b(linearLayout, i6, false, 2, null);
            linearLayout.addView(b5);
            view2 = b5;
        } else {
            view2 = null;
        }
        if (str != null) {
            try {
                z0.Companion companion = z0.INSTANCE;
                Object newInstance = Class.forName(str).getDeclaredConstructor(Context.class).newInstance(linearLayout.getContext());
                l0.n(newInstance, ProtectedSandApp.s("ᔦ\u0001"));
                a5 = (ViewGroup) newInstance;
            } catch (Throwable th) {
                z0.Companion companion2 = z0.INSTANCE;
                a5 = a1.a(th);
            }
            z0.e(a5);
            if (a5 instanceof z0.b) {
                a5 = null;
            }
            ViewGroup viewGroup = (ViewGroup) a5;
            if (viewGroup != 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(eVar.getParentDecidesWidth$Calendar_View_release() ? -1 : -2, eVar.getParentDecidesHeight$Calendar_View_release() ? -1 : -2);
                marginLayoutParams.bottomMargin = gVar.h();
                marginLayoutParams.topMargin = gVar.k();
                marginLayoutParams.setMarginStart(gVar.j());
                marginLayoutParams.setMarginEnd(gVar.i());
                viewGroup.setLayoutParams(marginLayoutParams);
                viewGroup.addView(linearLayout);
                linearLayout2 = viewGroup;
            }
            if (linearLayout2 != null) {
                linearLayout = linearLayout2;
                return new m<>(linearLayout, view, view2, arrayList);
            }
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(eVar.getParentDecidesWidth$Calendar_View_release() ? -1 : -2, eVar.getParentDecidesHeight$Calendar_View_release() ? -1 : -2);
        marginLayoutParams2.bottomMargin = gVar.h();
        marginLayoutParams2.topMargin = gVar.k();
        marginLayoutParams2.setMarginStart(gVar.j());
        marginLayoutParams2.setMarginEnd(gVar.i());
        linearLayout.setLayoutParams(marginLayoutParams2);
        return new m<>(linearLayout, view, view2, arrayList);
    }
}
