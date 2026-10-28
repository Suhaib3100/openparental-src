package com.kizitonwose.calendar.view.internal;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: DayHolder.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u0018\u0010\u0010\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/kizitonwose/calendar/view/internal/j;", "Day", "", "Lcom/kizitonwose/calendar/view/internal/i;", "config", "<init>", "(Lcom/kizitonwose/calendar/view/internal/i;)V", "Landroid/widget/LinearLayout;", "parent", "Landroid/view/View;", "b", "(Landroid/widget/LinearLayout;)Landroid/view/View;", "currentDay", "Lkotlin/k2;", "a", "(Ljava/lang/Object;)V", "day", "", "c", "(Ljava/lang/Object;)Z", "Lcom/kizitonwose/calendar/view/internal/i;", "Landroid/view/View;", "dayView", "Lcom/kizitonwose/calendar/view/l;", "Lcom/kizitonwose/calendar/view/l;", "viewContainer", "d", "Ljava/lang/Object;", "Calendar-View_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class j<Day> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final i<Day> config;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private View dayView;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private com.kizitonwose.calendar.view.l viewContainer;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Day day;

    /* compiled from: DayHolder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66754a;

        static {
            int[] iArr = new int[com.kizitonwose.calendar.view.e.values().length];
            try {
                iArr[com.kizitonwose.calendar.view.e.Square.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.kizitonwose.calendar.view.e.Rectangle.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.kizitonwose.calendar.view.e.SeventhWidth.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.kizitonwose.calendar.view.e.FreeForm.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f66754a = iArr;
        }
    }

    public j(@fg.l i<Day> iVar) {
        l0.p(iVar, ProtectedSandApp.s("ᓵ\u0001"));
        this.config = iVar;
    }

    public final void a(Day currentDay) {
        org.threeten.bp.g c5;
        this.day = currentDay;
        com.kizitonwose.calendar.view.l lVar = this.viewContainer;
        String s4 = ProtectedSandApp.s("ᓶ\u0001");
        com.kizitonwose.calendar.view.l lVar2 = null;
        if (lVar == null) {
            com.kizitonwose.calendar.view.a<Day, com.kizitonwose.calendar.view.l> f4 = this.config.f();
            View view = this.dayView;
            if (view == null) {
                l0.S(s4);
                view = null;
            }
            this.viewContainer = f4.b(view);
        }
        View view2 = this.dayView;
        if (view2 == null) {
            l0.S(s4);
            view2 = null;
        }
        c5 = k.c(currentDay);
        view2.setTag(Integer.valueOf(n.a(c5)));
        com.kizitonwose.calendar.view.a<Day, com.kizitonwose.calendar.view.l> f5 = this.config.f();
        com.kizitonwose.calendar.view.l lVar3 = this.viewContainer;
        if (lVar3 == null) {
            l0.S(ProtectedSandApp.s("ᓷ\u0001"));
        } else {
            lVar2 = lVar3;
        }
        f5.a(lVar2, currentDay);
    }

    @fg.l
    public final View b(@fg.l LinearLayout parent) {
        l0.p(parent, ProtectedSandApp.s("ᓸ\u0001"));
        View b5 = l.b(parent, this.config.h(), false, 2, null);
        this.dayView = b5;
        ViewGroup.LayoutParams layoutParams = b5.getLayoutParams();
        l0.o(layoutParams, ProtectedSandApp.s("ᓹ\u0001"));
        LinearLayout.LayoutParams a5 = k.a(layoutParams);
        if (this.config.g().getParentDecidesWidth$Calendar_View_release()) {
            a5.width = 0;
            a5.weight = 1.0f;
        }
        int i4 = a.f66754a[this.config.g().ordinal()];
        if (i4 == 1 || i4 == 2) {
            a5.height = -1;
        }
        b5.setLayoutParams(a5);
        return b5;
    }

    public final boolean c(Day day) {
        if (!l0.g(day, this.day)) {
            return false;
        }
        a(day);
        return true;
    }
}
