package com.kizitonwose.calendar.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.kizitonwose.calendar.view.internal.weekcalendar.WeekCalendarLayoutManager;
import com.kizitonwose.calendar.view.k;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: WeekCalendarView.kt */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0002\u0086\u0001\b\u0016\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u0014¢\u0006\u0004\b\u001e\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u0014¢\u0006\u0004\b\u001f\u0010\u001dJ\u0015\u0010 \u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u0014¢\u0006\u0004\b \u0010\u001dJ\u0015\u0010#\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b%\u0010$J\u0015\u0010&\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b&\u0010$J\u0015\u0010'\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b'\u0010$J\u0015\u0010(\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u0014¢\u0006\u0004\b(\u0010\u001dJ\u0015\u0010)\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b)\u0010$J\u0015\u0010*\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u0014¢\u0006\u0004\b*\u0010\u001dJ\u0015\u0010+\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b+\u0010$J\r\u0010,\u001a\u00020\u000e¢\u0006\u0004\b,\u0010\u0012J\u000f\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u0004\u0018\u00010-¢\u0006\u0004\b0\u0010/J\u000f\u00101\u001a\u0004\u0018\u00010!¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u0004\u0018\u00010!¢\u0006\u0004\b3\u00102J%\u00107\u001a\u00020\u000e2\u0006\u00104\u001a\u00020\u00142\u0006\u00105\u001a\u00020\u00142\u0006\u00106\u001a\u00020\u0018¢\u0006\u0004\b7\u00108J-\u00109\u001a\u00020\u000e2\b\b\u0002\u00104\u001a\u00020\u00142\b\b\u0002\u00105\u001a\u00020\u00142\b\b\u0002\u00106\u001a\u00020\u0018H\u0007¢\u0006\u0004\b9\u00108R6\u0010B\u001a\b\u0012\u0002\b\u0003\u0018\u00010:2\f\u0010;\u001a\b\u0012\u0002\b\u0003\u0018\u00010:8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR6\u0010J\u001a\b\u0012\u0002\b\u0003\u0018\u00010C2\f\u0010;\u001a\b\u0012\u0002\b\u0003\u0018\u00010C8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR6\u0010N\u001a\b\u0012\u0002\b\u0003\u0018\u00010C2\f\u0010;\u001a\b\u0012\u0002\b\u0003\u0018\u00010C8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010E\u001a\u0004\bL\u0010G\"\u0004\bM\u0010IR6\u0010V\u001a\u0016\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u000e\u0018\u00010Oj\u0004\u0018\u0001`P8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR*\u0010[\u001a\u00020\t2\u0006\u0010;\u001a\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010&\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR*\u0010^\u001a\u00020\t2\u0006\u0010;\u001a\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010&\u001a\u0004\b\\\u0010X\"\u0004\b]\u0010ZR*\u0010a\u001a\u00020\t2\u0006\u0010;\u001a\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010&\u001a\u0004\b_\u0010X\"\u0004\b`\u0010ZR.\u0010i\u001a\u0004\u0018\u00010b2\b\u0010;\u001a\u0004\u0018\u00010b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR*\u0010p\u001a\u00020j2\u0006\u0010;\u001a\u00020j8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bk\u0010'\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR*\u0010w\u001a\u00020q2\u0006\u0010;\u001a\u00020q8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR*\u0010~\u001a\u00020x2\u0006\u0010;\u001a\u00020x8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bs\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R*\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u007f8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bW\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0018\u0010\u0088\u0001\u001a\u00030\u0086\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0087\u0001R\u0017\u0010\u008b\u0001\u001a\u00030\u0089\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bl\u0010\u008a\u0001R\u0019\u00104\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bL\u0010\u008c\u0001R\u0019\u00105\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b_\u0010\u008c\u0001R\u0019\u00106\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bF\u0010\u008d\u0001R\u0017\u0010\u0090\u0001\u001a\u00030\u008e\u00018BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bk\u0010\u008f\u0001R\u0017\u0010\u0093\u0001\u001a\u00030\u0091\u00018BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bc\u0010\u0092\u0001¨\u0006\u0094\u0001"}, d2 = {"Lcom/kizitonwose/calendar/view/WeekCalendarView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "attributeSet", "defStyleRes", "Lkotlin/k2;", "w", "(Landroid/util/AttributeSet;II)V", "x", "()V", "c0", "Lorg/threeten/bp/g;", "G", "()Lorg/threeten/bp/g;", "E", "Lorg/threeten/bp/d;", "F", "()Lorg/threeten/bp/d;", "date", "K", "(Lorg/threeten/bp/g;)V", "b0", "H", "Y", "Lcb/i;", "day", "J", "(Lcb/i;)V", "a0", "I", "Z", "A", "B", "D", "C", "z", "Lcb/h;", "f", "()Lcb/h;", "h", "e", "()Lcb/i;", "g", "startDate", "endDate", "firstDayOfWeek", "X", "(Lorg/threeten/bp/g;Lorg/threeten/bp/g;Lorg/threeten/bp/d;)V", "g0", "Lcom/kizitonwose/calendar/view/n;", "value", "b", "Lcom/kizitonwose/calendar/view/n;", "k", "()Lcom/kizitonwose/calendar/view/n;", "L", "(Lcom/kizitonwose/calendar/view/n;)V", "dayBinder", "Lcom/kizitonwose/calendar/view/o;", "c", "Lcom/kizitonwose/calendar/view/o;", "r", "()Lcom/kizitonwose/calendar/view/o;", "S", "(Lcom/kizitonwose/calendar/view/o;)V", "weekHeaderBinder", "d", "p", "Q", "weekFooterBinder", "Lkotlin/Function1;", "Lcom/kizitonwose/calendar/view/WeekScrollListener;", "Lld/l;", "u", "()Lld/l;", "V", "(Lld/l;)V", "weekScrollListener", "m", "()I", "N", "(I)V", "dayViewResource", "s", "T", "weekHeaderResource", "q", "R", "weekFooterResource", "", "i", "Ljava/lang/String;", "v", "()Ljava/lang/String;", "W", "(Ljava/lang/String;)V", "weekViewClass", "", "j", "o", "()Z", "P", "(Z)V", "scrollPaged", "Lcom/kizitonwose/calendar/view/e;", "Lcom/kizitonwose/calendar/view/e;", "l", "()Lcom/kizitonwose/calendar/view/e;", "M", "(Lcom/kizitonwose/calendar/view/e;)V", "daySize", "Lcom/kizitonwose/calendar/view/g;", "Lcom/kizitonwose/calendar/view/g;", "t", "()Lcom/kizitonwose/calendar/view/g;", "U", "(Lcom/kizitonwose/calendar/view/g;)V", "weekMargins", "Lcom/kizitonwose/calendar/view/f;", "Lcom/kizitonwose/calendar/view/f;", "n", "()Lcom/kizitonwose/calendar/view/f;", "O", "(Lcom/kizitonwose/calendar/view/f;)V", "layoutHelper", "com/kizitonwose/calendar/view/WeekCalendarView$a", "Lcom/kizitonwose/calendar/view/WeekCalendarView$a;", "scrollListenerInternal", "Lcom/kizitonwose/calendar/view/internal/g;", "Lcom/kizitonwose/calendar/view/internal/g;", "pagerSnapHelper", "Lorg/threeten/bp/g;", "Lorg/threeten/bp/d;", "Lcom/kizitonwose/calendar/view/internal/weekcalendar/WeekCalendarLayoutManager;", "()Lcom/kizitonwose/calendar/view/internal/weekcalendar/WeekCalendarLayoutManager;", "calendarLayoutManager", "Lcom/kizitonwose/calendar/view/internal/weekcalendar/c;", "()Lcom/kizitonwose/calendar/view/internal/weekcalendar/c;", "calendarAdapter", "Calendar-View_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nWeekCalendarView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeekCalendarView.kt\ncom/kizitonwose/calendar/view/WeekCalendarView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Context.kt\nandroidx/core/content/ContextKt\n*L\n1#1,461:1\n1#2:462\n59#3,2:463\n*S KotlinDebug\n*F\n+ 1 WeekCalendarView.kt\ncom/kizitonwose/calendar/view/WeekCalendarView\n*L\n189#1:463,2\n*E\n"})
/* loaded from: classes6.dex */
public class WeekCalendarView extends RecyclerView {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private n<?> dayBinder;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private o<?> weekHeaderBinder;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private o<?> weekFooterBinder;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private ld.l<? super cb.h, k2> weekScrollListener;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int dayViewResource;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int weekHeaderResource;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int weekFooterResource;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private String weekViewClass;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean scrollPaged;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private e daySize;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private g weekMargins;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private f layoutHelper;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final a scrollListenerInternal;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final com.kizitonwose.calendar.view.internal.g pagerSnapHelper;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private org.threeten.bp.g startDate;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private org.threeten.bp.g endDate;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private org.threeten.bp.d firstDayOfWeek;

    /* compiled from: WeekCalendarView.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/kizitonwose/calendar/view/WeekCalendarView$a", "Landroidx/recyclerview/widget/RecyclerView$s;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "dx", "dy", "Lkotlin/k2;", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "newState", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "Calendar-View_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends RecyclerView.s {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void onScrollStateChanged(@fg.l RecyclerView recyclerView, int newState) {
            l0.p(recyclerView, ProtectedSandApp.s("ᒠ\u0001"));
            if (newState == 0) {
                WeekCalendarView.this.i().v();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void onScrolled(@fg.l RecyclerView recyclerView, int dx, int dy) {
            l0.p(recyclerView, ProtectedSandApp.s("ᒠ\u0001"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeekCalendarView(@fg.l Context context) {
        super(context);
        l0.p(context, ProtectedSandApp.s("ᒡ\u0001"));
        this.scrollPaged = true;
        this.daySize = e.Square;
        g.INSTANCE.getClass();
        this.weekMargins = g.f66720f;
        this.scrollListenerInternal = new a();
        this.pagerSnapHelper = new com.kizitonwose.calendar.view.internal.g();
    }

    private final org.threeten.bp.g E() {
        org.threeten.bp.g gVar = this.endDate;
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalStateException(com.kizitonwose.calendar.view.internal.l.d(ProtectedSandApp.s("ᒣ\u0001")).toString());
    }

    private final org.threeten.bp.d F() {
        org.threeten.bp.d dVar = this.firstDayOfWeek;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalStateException(com.kizitonwose.calendar.view.internal.l.d(ProtectedSandApp.s("ᒤ\u0001")).toString());
    }

    private final org.threeten.bp.g G() {
        org.threeten.bp.g gVar = this.startDate;
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalStateException(com.kizitonwose.calendar.view.internal.l.d(ProtectedSandApp.s("ᒥ\u0001")).toString());
    }

    private final void c0() {
        i().E(G(), E(), F());
    }

    public static /* synthetic */ void h0(WeekCalendarView weekCalendarView, org.threeten.bp.g gVar, org.threeten.bp.g gVar2, org.threeten.bp.d dVar, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("ᒦ\u0001"));
        }
        if ((i4 & 1) != 0) {
            gVar = weekCalendarView.G();
        }
        if ((i4 & 2) != 0) {
            gVar2 = weekCalendarView.E();
        }
        if ((i4 & 4) != 0) {
            dVar = weekCalendarView.F();
        }
        weekCalendarView.g0(gVar, gVar2, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.kizitonwose.calendar.view.internal.weekcalendar.c i() {
        RecyclerView.h adapter = getAdapter();
        l0.n(adapter, ProtectedSandApp.s("ᒧ\u0001"));
        return (com.kizitonwose.calendar.view.internal.weekcalendar.c) adapter;
    }

    private final WeekCalendarLayoutManager j() {
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        l0.n(layoutManager, ProtectedSandApp.s("ᒨ\u0001"));
        return (WeekCalendarLayoutManager) layoutManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void w(AttributeSet attributeSet, int defStyleAttr, int defStyleRes) {
        if (isInEditMode()) {
            return;
        }
        setItemAnimator(null);
        setHasFixedSize(true);
        Context context = getContext();
        l0.o(context, ProtectedSandApp.s("ᒩ\u0001"));
        int[] iArr = k.j.I0;
        l0.o(iArr, ProtectedSandApp.s("ᒪ\u0001"));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, defStyleAttr, defStyleRes);
        N(obtainStyledAttributes.getResourceId(k.j.K0, this.dayViewResource));
        T(obtainStyledAttributes.getResourceId(k.j.N0, this.weekHeaderResource));
        R(obtainStyledAttributes.getResourceId(k.j.M0, this.weekFooterResource));
        P(obtainStyledAttributes.getBoolean(k.j.L0, this.scrollPaged));
        M((e) e.getEntries().get(obtainStyledAttributes.getInt(k.j.J0, this.daySize.ordinal())));
        W(obtainStyledAttributes.getString(k.j.O0));
        obtainStyledAttributes.recycle();
        if (this.scrollPaged) {
            this.pagerSnapHelper.b(this);
        }
        if (this.dayViewResource == 0) {
            throw new IllegalStateException(ProtectedSandApp.s("ᒫ\u0001"));
        }
    }

    private final void x() {
        if (getAdapter() == null || getLayoutManager() == null) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        Parcelable onSaveInstanceState = layoutManager != null ? layoutManager.onSaveInstanceState() : null;
        setAdapter(getAdapter());
        RecyclerView.LayoutManager layoutManager2 = getLayoutManager();
        if (layoutManager2 != null) {
            layoutManager2.onRestoreInstanceState(onSaveInstanceState);
        }
        post(new Runnable() { // from class: com.kizitonwose.calendar.view.m
            @Override // java.lang.Runnable
            public final void run() {
                WeekCalendarView.y(WeekCalendarView.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(WeekCalendarView weekCalendarView) {
        l0.p(weekCalendarView, ProtectedSandApp.s("ᒬ\u0001"));
        weekCalendarView.i().v();
    }

    public final void A(@fg.l org.threeten.bp.g date) {
        l0.p(date, ProtectedSandApp.s("ᒭ\u0001"));
        i().C(date);
    }

    public final void B(@fg.l cb.i day) {
        l0.p(day, ProtectedSandApp.s("ᒮ\u0001"));
        A(day.e());
    }

    public final void C(@fg.l cb.i day) {
        l0.p(day, ProtectedSandApp.s("ᒮ\u0001"));
        D(day.e());
    }

    public final void D(@fg.l org.threeten.bp.g date) {
        l0.p(date, ProtectedSandApp.s("ᒭ\u0001"));
        i().D(date);
    }

    public final void H(@fg.l org.threeten.bp.g date) {
        l0.p(date, ProtectedSandApp.s("ᒭ\u0001"));
        j().Q(date);
    }

    public final void I(@fg.l cb.i day) {
        l0.p(day, ProtectedSandApp.s("ᒮ\u0001"));
        H(day.e());
    }

    public final void J(@fg.l cb.i day) {
        l0.p(day, ProtectedSandApp.s("ᒮ\u0001"));
        K(day.e());
    }

    public final void K(@fg.l org.threeten.bp.g date) {
        l0.p(date, ProtectedSandApp.s("ᒭ\u0001"));
        j().U(date);
    }

    public final void L(@fg.m n<?> nVar) {
        this.dayBinder = nVar;
        x();
    }

    public final void M(@fg.l e eVar) {
        l0.p(eVar, ProtectedSandApp.s("ᒯ\u0001"));
        if (this.daySize != eVar) {
            this.daySize = eVar;
            x();
        }
    }

    public final void N(int i4) {
        if (this.dayViewResource != i4) {
            if (i4 == 0) {
                throw new IllegalStateException(ProtectedSandApp.s("ᒰ\u0001"));
            }
            this.dayViewResource = i4;
            x();
        }
    }

    public final void O(@fg.m f fVar) {
        this.layoutHelper = fVar;
    }

    public final void P(boolean z4) {
        if (this.scrollPaged != z4) {
            this.scrollPaged = z4;
            this.pagerSnapHelper.b(z4 ? this : null);
        }
    }

    public final void Q(@fg.m o<?> oVar) {
        this.weekFooterBinder = oVar;
        x();
    }

    public final void R(int i4) {
        if (this.weekFooterResource != i4) {
            this.weekFooterResource = i4;
            x();
        }
    }

    public final void S(@fg.m o<?> oVar) {
        this.weekHeaderBinder = oVar;
        x();
    }

    public final void T(int i4) {
        if (this.weekHeaderResource != i4) {
            this.weekHeaderResource = i4;
            x();
        }
    }

    public final void U(@fg.l g gVar) {
        l0.p(gVar, ProtectedSandApp.s("ᒯ\u0001"));
        if (l0.g(this.weekMargins, gVar)) {
            return;
        }
        this.weekMargins = gVar;
        x();
    }

    public final void V(@fg.m ld.l<? super cb.h, k2> lVar) {
        this.weekScrollListener = lVar;
    }

    public final void W(@fg.m String str) {
        if (l0.g(this.weekViewClass, str)) {
            return;
        }
        this.weekViewClass = str;
        x();
    }

    public final void X(@fg.l org.threeten.bp.g startDate, @fg.l org.threeten.bp.g endDate, @fg.l org.threeten.bp.d firstDayOfWeek) {
        l0.p(startDate, ProtectedSandApp.s("ᒥ\u0001"));
        l0.p(endDate, ProtectedSandApp.s("ᒣ\u0001"));
        l0.p(firstDayOfWeek, ProtectedSandApp.s("ᒤ\u0001"));
        db.f.a(startDate, endDate);
        this.startDate = startDate;
        this.endDate = endDate;
        this.firstDayOfWeek = firstDayOfWeek;
        removeOnScrollListener(this.scrollListenerInternal);
        addOnScrollListener(this.scrollListenerInternal);
        setLayoutManager(new WeekCalendarLayoutManager(this));
        setAdapter(new com.kizitonwose.calendar.view.internal.weekcalendar.c(this, startDate, endDate, firstDayOfWeek));
    }

    public final void Y(@fg.l org.threeten.bp.g date) {
        l0.p(date, ProtectedSandApp.s("ᒭ\u0001"));
        j().W(date);
    }

    public final void Z(@fg.l cb.i day) {
        l0.p(day, ProtectedSandApp.s("ᒮ\u0001"));
        Y(day.e());
    }

    public final void a0(@fg.l cb.i day) {
        l0.p(day, ProtectedSandApp.s("ᒮ\u0001"));
        b0(day.e());
    }

    public final void b0(@fg.l org.threeten.bp.g date) {
        l0.p(date, ProtectedSandApp.s("ᒭ\u0001"));
        j().X(date);
    }

    @kd.j
    public final void d0() {
        h0(this, null, null, null, 7, null);
    }

    @fg.m
    public final cb.i e() {
        return i().i();
    }

    @kd.j
    public final void e0(@fg.l org.threeten.bp.g gVar) {
        l0.p(gVar, ProtectedSandApp.s("ᒥ\u0001"));
        h0(this, gVar, null, null, 6, null);
    }

    @fg.m
    public final cb.h f() {
        return i().j();
    }

    @kd.j
    public final void f0(@fg.l org.threeten.bp.g gVar, @fg.l org.threeten.bp.g gVar2) {
        l0.p(gVar, ProtectedSandApp.s("ᒥ\u0001"));
        l0.p(gVar2, ProtectedSandApp.s("ᒣ\u0001"));
        h0(this, gVar, gVar2, null, 4, null);
    }

    @fg.m
    public final cb.i g() {
        return i().l();
    }

    @kd.j
    public final void g0(@fg.l org.threeten.bp.g startDate, @fg.l org.threeten.bp.g endDate, @fg.l org.threeten.bp.d firstDayOfWeek) {
        l0.p(startDate, ProtectedSandApp.s("ᒥ\u0001"));
        l0.p(endDate, ProtectedSandApp.s("ᒣ\u0001"));
        l0.p(firstDayOfWeek, ProtectedSandApp.s("ᒤ\u0001"));
        db.f.a(startDate, endDate);
        this.startDate = startDate;
        this.endDate = endDate;
        this.firstDayOfWeek = firstDayOfWeek;
        c0();
    }

    @fg.m
    public final cb.h h() {
        return i().m();
    }

    @fg.m
    public final n<?> k() {
        return this.dayBinder;
    }

    @fg.l
    /* renamed from: l, reason: from getter */
    public final e getDaySize() {
        return this.daySize;
    }

    /* renamed from: m, reason: from getter */
    public final int getDayViewResource() {
        return this.dayViewResource;
    }

    @fg.m
    /* renamed from: n, reason: from getter */
    public final f getLayoutHelper() {
        return this.layoutHelper;
    }

    /* renamed from: o, reason: from getter */
    public final boolean getScrollPaged() {
        return this.scrollPaged;
    }

    @fg.m
    public final o<?> p() {
        return this.weekFooterBinder;
    }

    /* renamed from: q, reason: from getter */
    public final int getWeekFooterResource() {
        return this.weekFooterResource;
    }

    @fg.m
    public final o<?> r() {
        return this.weekHeaderBinder;
    }

    /* renamed from: s, reason: from getter */
    public final int getWeekHeaderResource() {
        return this.weekHeaderResource;
    }

    @fg.l
    /* renamed from: t, reason: from getter */
    public final g getWeekMargins() {
        return this.weekMargins;
    }

    @fg.m
    public final ld.l<cb.h, k2> u() {
        return this.weekScrollListener;
    }

    @fg.m
    /* renamed from: v, reason: from getter */
    public final String getWeekViewClass() {
        return this.weekViewClass;
    }

    public final void z() {
        i().B();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeekCalendarView(@fg.l Context context, @fg.l AttributeSet attributeSet) {
        super(context, attributeSet);
        l0.p(context, ProtectedSandApp.s("ᒡ\u0001"));
        l0.p(attributeSet, ProtectedSandApp.s("ᒢ\u0001"));
        this.scrollPaged = true;
        this.daySize = e.Square;
        g.INSTANCE.getClass();
        this.weekMargins = g.f66720f;
        this.scrollListenerInternal = new a();
        this.pagerSnapHelper = new com.kizitonwose.calendar.view.internal.g();
        w(attributeSet, 0, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeekCalendarView(@fg.l Context context, @fg.l AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        l0.p(context, ProtectedSandApp.s("ᒡ\u0001"));
        l0.p(attributeSet, ProtectedSandApp.s("ᒢ\u0001"));
        this.scrollPaged = true;
        this.daySize = e.Square;
        g.INSTANCE.getClass();
        this.weekMargins = g.f66720f;
        this.scrollListenerInternal = new a();
        this.pagerSnapHelper = new com.kizitonwose.calendar.view.internal.g();
        w(attributeSet, i4, i4);
    }
}
