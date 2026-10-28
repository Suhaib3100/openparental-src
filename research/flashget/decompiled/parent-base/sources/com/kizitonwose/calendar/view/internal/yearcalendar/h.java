package com.kizitonwose.calendar.view.internal.yearcalendar;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.kizitonwose.calendar.view.internal.n;
import com.kizitonwose.calendar.view.internal.p;
import fg.l;
import fg.m;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.j0;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import org.threeten.bp.q;

/* compiled from: YearMonthHolder.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\r\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010*R\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010+R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010*R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010*R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010,R\u001c\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001c\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010.R\u001c\u00103\u001a\b\u0012\u0004\u0012\u00020%008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00106\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00108\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00105R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lcom/kizitonwose/calendar/view/internal/yearcalendar/h;", "", "Lcom/kizitonwose/calendar/view/e;", "daySize", "", "dayViewResource", "Lcom/kizitonwose/calendar/view/h;", "Lcom/kizitonwose/calendar/view/l;", "dayBinder", "monthHeaderResource", "monthFooterResource", "", "monthViewClass", "Lcom/kizitonwose/calendar/view/i;", "monthHeaderBinder", "monthFooterBinder", "<init>", "(Lcom/kizitonwose/calendar/view/e;ILcom/kizitonwose/calendar/view/h;IILjava/lang/String;Lcom/kizitonwose/calendar/view/i;Lcom/kizitonwose/calendar/view/i;)V", "Landroid/widget/LinearLayout;", "parent", "Landroid/view/View;", "b", "(Landroid/widget/LinearLayout;)Landroid/view/View;", "Lcb/b;", "month", "Lkotlin/k2;", "a", "(Lcb/b;)V", "d", "()V", "", "c", "()Z", "Lorg/threeten/bp/q;", "yearMonth", "f", "(Lorg/threeten/bp/q;)Z", "Lcb/a;", "day", "e", "(Lcb/a;)Z", "Lcom/kizitonwose/calendar/view/e;", "I", "Lcom/kizitonwose/calendar/view/h;", "Ljava/lang/String;", "g", "Lcom/kizitonwose/calendar/view/i;", "h", "Lcom/kizitonwose/calendar/view/internal/m;", "i", "Lcom/kizitonwose/calendar/view/internal/m;", "monthContainer", "j", "Lcom/kizitonwose/calendar/view/l;", "headerContainer", "k", "footerContainer", "l", "Lcb/b;", "Calendar-View_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nYearMonthHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YearMonthHolder.kt\ncom/kizitonwose/calendar/view/internal/yearcalendar/YearMonthHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,90:1\n1#2:91\n262#3,2:92\n283#3,2:97\n260#3:99\n1864#4,3:94\n1747#4,3:100\n*S KotlinDebug\n*F\n+ 1 YearMonthHolder.kt\ncom/kizitonwose/calendar/view/internal/yearcalendar/YearMonthHolder\n*L\n51#1:92,2\n73#1:97,2\n77#1:99\n59#1:94,3\n88#1:100,3\n*E\n"})
/* loaded from: classes6.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final com.kizitonwose.calendar.view.e daySize;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int dayViewResource;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @m
    private com.kizitonwose.calendar.view.h<com.kizitonwose.calendar.view.l> dayBinder;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int monthHeaderResource;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int monthFooterResource;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @m
    private final String monthViewClass;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @m
    private final com.kizitonwose.calendar.view.i<com.kizitonwose.calendar.view.l> monthHeaderBinder;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @m
    private final com.kizitonwose.calendar.view.i<com.kizitonwose.calendar.view.l> monthFooterBinder;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private com.kizitonwose.calendar.view.internal.m<cb.a> monthContainer;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @m
    private com.kizitonwose.calendar.view.l headerContainer;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @m
    private com.kizitonwose.calendar.view.l footerContainer;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private cb.b month;

    public h(@l com.kizitonwose.calendar.view.e eVar, int i4, @m com.kizitonwose.calendar.view.h<com.kizitonwose.calendar.view.l> hVar, int i5, int i6, @m String str, @m com.kizitonwose.calendar.view.i<com.kizitonwose.calendar.view.l> iVar, @m com.kizitonwose.calendar.view.i<com.kizitonwose.calendar.view.l> iVar2) {
        l0.p(eVar, ProtectedSandApp.s("ᕦ\u0001"));
        this.daySize = eVar;
        this.dayViewResource = i4;
        this.dayBinder = hVar;
        this.monthHeaderResource = i5;
        this.monthFooterResource = i6;
        this.monthViewClass = str;
        this.monthHeaderBinder = iVar;
        this.monthFooterBinder = iVar2;
    }

    public final void a(@l cb.b month) {
        l0.p(month, ProtectedSandApp.s("ᕧ\u0001"));
        this.month = month;
        com.kizitonwose.calendar.view.internal.m<cb.a> mVar = this.monthContainer;
        com.kizitonwose.calendar.view.internal.m<cb.a> mVar2 = null;
        String s4 = ProtectedSandApp.s("ᕨ\u0001");
        if (mVar == null) {
            l0.S(s4);
            mVar = null;
        }
        ViewGroup i4 = mVar.i();
        i4.setTag(Integer.valueOf(i.c(month.f())));
        int i5 = 0;
        i4.setVisibility(0);
        com.kizitonwose.calendar.view.internal.m<cb.a> mVar3 = this.monthContainer;
        if (mVar3 == null) {
            l0.S(s4);
            mVar3 = null;
        }
        View h4 = mVar3.h();
        if (h4 != null) {
            com.kizitonwose.calendar.view.l lVar = this.headerContainer;
            if (lVar == null) {
                com.kizitonwose.calendar.view.i<com.kizitonwose.calendar.view.l> iVar = this.monthHeaderBinder;
                l0.m(iVar);
                lVar = iVar.b(h4);
                this.headerContainer = lVar;
            }
            com.kizitonwose.calendar.view.i<com.kizitonwose.calendar.view.l> iVar2 = this.monthHeaderBinder;
            if (iVar2 != null) {
                iVar2.a(lVar, month);
            }
        }
        com.kizitonwose.calendar.view.internal.m<cb.a> mVar4 = this.monthContainer;
        if (mVar4 == null) {
            l0.S(s4);
            mVar4 = null;
        }
        for (Object obj : mVar4.j()) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                w.Z();
            }
            p pVar = (p) obj;
            Collection collection = (List) w.W2(month.e(), i5);
            if (collection == null) {
                collection = j0.f74919b;
            }
            pVar.a(collection);
            i5 = i6;
        }
        com.kizitonwose.calendar.view.internal.m<cb.a> mVar5 = this.monthContainer;
        if (mVar5 == null) {
            l0.S(s4);
        } else {
            mVar2 = mVar5;
        }
        View g4 = mVar2.g();
        if (g4 != null) {
            com.kizitonwose.calendar.view.l lVar2 = this.footerContainer;
            if (lVar2 == null) {
                com.kizitonwose.calendar.view.i<com.kizitonwose.calendar.view.l> iVar3 = this.monthFooterBinder;
                l0.m(iVar3);
                lVar2 = iVar3.b(g4);
                this.footerContainer = lVar2;
            }
            com.kizitonwose.calendar.view.i<com.kizitonwose.calendar.view.l> iVar4 = this.monthFooterBinder;
            if (iVar4 != null) {
                iVar4.a(lVar2, month);
            }
        }
    }

    @l
    public final View b(@l LinearLayout parent) {
        l0.p(parent, ProtectedSandApp.s("ᕩ\u0001"));
        com.kizitonwose.calendar.view.g.INSTANCE.getClass();
        com.kizitonwose.calendar.view.g gVar = com.kizitonwose.calendar.view.g.f66720f;
        com.kizitonwose.calendar.view.e eVar = this.daySize;
        Context context = parent.getContext();
        l0.o(context, ProtectedSandApp.s("ᕪ\u0001"));
        int i4 = this.dayViewResource;
        int i5 = this.monthHeaderResource;
        int i6 = this.monthFooterResource;
        String str = this.monthViewClass;
        com.kizitonwose.calendar.view.h<com.kizitonwose.calendar.view.l> hVar = this.dayBinder;
        l0.n(hVar, ProtectedSandApp.s("ᕫ\u0001"));
        com.kizitonwose.calendar.view.internal.m<cb.a> b5 = n.b(gVar, eVar, context, i4, i5, i6, 6, str, hVar);
        this.monthContainer = b5;
        return b5.i();
    }

    public final boolean c() {
        com.kizitonwose.calendar.view.internal.m<cb.a> mVar = this.monthContainer;
        if (mVar == null) {
            l0.S(ProtectedSandApp.s("ᕨ\u0001"));
            mVar = null;
        }
        return mVar.i().getVisibility() == 0;
    }

    public final void d() {
        com.kizitonwose.calendar.view.internal.m<cb.a> mVar = this.monthContainer;
        if (mVar == null) {
            l0.S(ProtectedSandApp.s("ᕨ\u0001"));
            mVar = null;
        }
        ViewGroup i4 = mVar.i();
        i4.setTag(null);
        i4.setVisibility(4);
    }

    public final boolean e(@l cb.a day) {
        l0.p(day, ProtectedSandApp.s("ᕬ\u0001"));
        com.kizitonwose.calendar.view.internal.m<cb.a> mVar = this.monthContainer;
        if (mVar == null) {
            l0.S(ProtectedSandApp.s("ᕨ\u0001"));
            mVar = null;
        }
        List<p<cb.a>> j4 = mVar.j();
        if ((j4 instanceof Collection) && j4.isEmpty()) {
            return false;
        }
        Iterator<T> it = j4.iterator();
        while (it.hasNext()) {
            if (((p) it.next()).c(day)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(@l q yearMonth) {
        l0.p(yearMonth, ProtectedSandApp.s("ᕭ\u0001"));
        cb.b bVar = this.month;
        cb.b bVar2 = null;
        String s4 = ProtectedSandApp.s("ᕧ\u0001");
        if (bVar == null) {
            l0.S(s4);
            bVar = null;
        }
        if (!l0.g(yearMonth, bVar.f())) {
            return false;
        }
        cb.b bVar3 = this.month;
        if (bVar3 == null) {
            l0.S(s4);
        } else {
            bVar2 = bVar3;
        }
        a(bVar2);
        return true;
    }
}
