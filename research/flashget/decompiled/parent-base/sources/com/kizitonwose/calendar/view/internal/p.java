package com.kizitonwose.calendar.view.internal;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: WeekHolder.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R \u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/kizitonwose/calendar/view/internal/p;", "Day", "", "Lcom/kizitonwose/calendar/view/e;", "daySize", "", "Lcom/kizitonwose/calendar/view/internal/j;", "dayHolders", "<init>", "(Lcom/kizitonwose/calendar/view/e;Ljava/util/List;)V", "Landroid/widget/LinearLayout;", "parent", "Landroid/view/View;", "b", "(Landroid/widget/LinearLayout;)Landroid/view/View;", "daysOfWeek", "Lkotlin/k2;", "a", "(Ljava/util/List;)V", "day", "", "c", "(Ljava/lang/Object;)Z", "Lcom/kizitonwose/calendar/view/e;", "Ljava/util/List;", "Landroid/widget/LinearLayout;", "weekContainer", "Calendar-View_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nWeekHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeekHolder.kt\ncom/kizitonwose/calendar/view/internal/WeekHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,71:1\n304#2,2:72\n1864#3,3:74\n1747#3,3:77\n*S KotlinDebug\n*F\n+ 1 WeekHolder.kt\ncom/kizitonwose/calendar/view/internal/WeekHolder\n*L\n63#1:72,2\n64#1:74,3\n69#1:77,3\n*E\n"})
/* loaded from: classes6.dex */
public final class p<Day> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final com.kizitonwose.calendar.view.e daySize;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<j<Day>> dayHolders;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private LinearLayout weekContainer;

    public p(@fg.l com.kizitonwose.calendar.view.e eVar, @fg.l List<j<Day>> list) {
        l0.p(eVar, ProtectedSandApp.s("ᔪ\u0001"));
        l0.p(list, ProtectedSandApp.s("ᔫ\u0001"));
        this.daySize = eVar;
        this.dayHolders = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(@fg.l List<? extends Day> daysOfWeek) {
        l0.p(daysOfWeek, ProtectedSandApp.s("ᔬ\u0001"));
        LinearLayout linearLayout = this.weekContainer;
        if (linearLayout == null) {
            l0.S(ProtectedSandApp.s("ᔭ\u0001"));
            linearLayout = null;
        }
        int i4 = 0;
        linearLayout.setVisibility(daysOfWeek.isEmpty() ? 8 : 0);
        for (Object obj : daysOfWeek) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                w.Z();
            }
            this.dayHolders.get(i4).a(obj);
            i4 = i5;
        }
    }

    @fg.l
    public final View b(@fg.l LinearLayout parent) {
        l0.p(parent, ProtectedSandApp.s("ᔮ\u0001"));
        Context context = parent.getContext();
        l0.o(context, ProtectedSandApp.s("ᔯ\u0001"));
        WidthDivisorLinearLayout widthDivisorLinearLayout = new WidthDivisorLinearLayout(context);
        this.weekContainer = widthDivisorLinearLayout;
        widthDivisorLinearLayout.setLayoutParams(new LinearLayout.LayoutParams(this.daySize.getParentDecidesWidth$Calendar_View_release() ? -1 : -2, this.daySize.getParentDecidesHeight$Calendar_View_release() ? 0 : -2, this.daySize.getParentDecidesHeight$Calendar_View_release() ? 1.0f : 0.0f));
        widthDivisorLinearLayout.setOrientation(0);
        widthDivisorLinearLayout.b(this.daySize == com.kizitonwose.calendar.view.e.Square ? this.dayHolders.size() : 0);
        Iterator<j<Day>> it = this.dayHolders.iterator();
        while (it.hasNext()) {
            widthDivisorLinearLayout.addView(it.next().b(widthDivisorLinearLayout));
        }
        return widthDivisorLinearLayout;
    }

    public final boolean c(Day day) {
        List<j<Day>> list = this.dayHolders;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((j) it.next()).c(day)) {
                return true;
            }
        }
        return false;
    }
}
