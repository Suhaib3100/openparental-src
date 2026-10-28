package com.kizitonwose.calendar.view.internal;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a0;
import androidx.recyclerview.widget.z;
import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.ranges.s;

/* compiled from: CalendarPageSnapHelper.kt */
@Metadata(d1 = {"\u0000Y\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\n*\u0001/\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J&\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u000bH\u0002\u0082\u0002\f\n\n\b\u0000\u001a\u0006\u0010\u0001\"\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b\"\u0010#J\u0019\u0010$\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0005\u001a\u00020\u000bH\u0016¢\u0006\u0004\b$\u0010%J'\u0010&\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b&\u0010'R\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010)R\u0018\u0010.\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00105\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00107\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00104¨\u00068"}, d2 = {"Lcom/kizitonwose/calendar/view/internal/e;", "Landroidx/recyclerview/widget/a0;", "<init>", "()V", "Landroidx/recyclerview/widget/LinearLayoutManager;", "lm", "", "velocityX", "velocityY", "w", "(Landroidx/recyclerview/widget/LinearLayoutManager;II)I", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "", "r", "(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;II)Z", "v", "(Landroidx/recyclerview/widget/LinearLayoutManager;)I", "x", "Landroid/view/View;", "targetView", "Landroidx/recyclerview/widget/z;", "helper", "u", "(Landroid/view/View;Landroidx/recyclerview/widget/z;)I", "p", "(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)Landroidx/recyclerview/widget/z;", "q", "o", "", "c", "(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;Landroid/view/View;)[I", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lkotlin/k2;", "b", "(Landroidx/recyclerview/widget/RecyclerView;)V", "h", "(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)Landroid/view/View;", "i", "(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;II)I", "Landroidx/recyclerview/widget/RecyclerView;", "Ljava/lang/Integer;", "flingTargetPosition", "Lcom/kizitonwose/calendar/view/internal/o;", "j", "Lcom/kizitonwose/calendar/view/internal/o;", "scrollAction", "com/kizitonwose/calendar/view/internal/e$b", "k", "Lcom/kizitonwose/calendar/view/internal/e$b;", "scrollListener", "l", "Landroidx/recyclerview/widget/z;", "verticalHelper", "m", "horizontalHelper", "Calendar-View_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nCalendarPageSnapHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarPageSnapHelper.kt\ncom/kizitonwose/calendar/view/internal/CalendarPageSnapHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,194:1\n1#2:195\n*E\n"})
/* loaded from: classes6.dex */
public final class e extends a0 {

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private RecyclerView recyclerView;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Integer flingTargetPosition;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private o scrollAction;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final b scrollListener = new b();

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private z verticalHelper;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private z horizontalHelper;

    /* compiled from: CalendarPageSnapHelper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66741a;

        static {
            int[] iArr = new int[o.values().length];
            try {
                iArr[o.Forward.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.Backward.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o.Layout.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f66741a = iArr;
        }
    }

    /* compiled from: CalendarPageSnapHelper.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/kizitonwose/calendar/view/internal/e$b", "Landroidx/recyclerview/widget/RecyclerView$s;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "dx", "dy", "Lkotlin/k2;", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "Calendar-View_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends RecyclerView.s {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void onScrolled(@fg.l RecyclerView recyclerView, int dx, int dy) {
            l0.p(recyclerView, ProtectedSandApp.s("ᓝ\u0001"));
            e.this.scrollAction = (dx > 0 || dy > 0) ? o.Forward : (dx < 0 || dy < 0) ? o.Backward : o.Layout;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (kotlin.jvm.internal.l0.g(r0.k(), r4) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final androidx.recyclerview.widget.z o(androidx.recyclerview.widget.RecyclerView.LayoutManager r4) {
        /*
            r3 = this;
            androidx.recyclerview.widget.z r0 = r3.horizontalHelper
            r1 = 0
            java.lang.String r2 = "ᓞ\u0001"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)
            if (r0 == 0) goto L1b
            if (r0 != 0) goto L11
            kotlin.jvm.internal.l0.S(r2)
            r0 = r1
        L11:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.k()
            boolean r0 = kotlin.jvm.internal.l0.g(r0, r4)
            if (r0 != 0) goto L2a
        L1b:
            androidx.recyclerview.widget.z r4 = androidx.recyclerview.widget.z.a(r4)
            java.lang.String r0 = "ᓟ\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.o(r4, r0)
            r3.horizontalHelper = r4
        L2a:
            androidx.recyclerview.widget.z r4 = r3.horizontalHelper
            if (r4 != 0) goto L32
            kotlin.jvm.internal.l0.S(r2)
            goto L33
        L32:
            r1 = r4
        L33:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kizitonwose.calendar.view.internal.e.o(androidx.recyclerview.widget.RecyclerView$LayoutManager):androidx.recyclerview.widget.z");
    }

    private final z p(RecyclerView.LayoutManager lm) {
        l0.n(lm, ProtectedSandApp.s("ᓠ\u0001"));
        int orientation = ((LinearLayoutManager) lm).getOrientation();
        if (orientation == 0) {
            return o(lm);
        }
        if (orientation == 1) {
            return q(lm);
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (kotlin.jvm.internal.l0.g(r0.k(), r4) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final androidx.recyclerview.widget.z q(androidx.recyclerview.widget.RecyclerView.LayoutManager r4) {
        /*
            r3 = this;
            androidx.recyclerview.widget.z r0 = r3.verticalHelper
            r1 = 0
            java.lang.String r2 = "ᓡ\u0001"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)
            if (r0 == 0) goto L1b
            if (r0 != 0) goto L11
            kotlin.jvm.internal.l0.S(r2)
            r0 = r1
        L11:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.k()
            boolean r0 = kotlin.jvm.internal.l0.g(r0, r4)
            if (r0 != 0) goto L2a
        L1b:
            androidx.recyclerview.widget.z r4 = androidx.recyclerview.widget.z.c(r4)
            java.lang.String r0 = "ᓢ\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.o(r4, r0)
            r3.verticalHelper = r4
        L2a:
            androidx.recyclerview.widget.z r4 = r3.verticalHelper
            if (r4 != 0) goto L32
            kotlin.jvm.internal.l0.S(r2)
            goto L33
        L32:
            r1 = r4
        L33:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kizitonwose.calendar.view.internal.e.q(androidx.recyclerview.widget.RecyclerView$LayoutManager):androidx.recyclerview.widget.z");
    }

    private final boolean r(RecyclerView.LayoutManager lm, int velocityX, int velocityY) {
        if (lm.canScrollHorizontally()) {
            if (velocityX <= 0) {
                return false;
            }
        } else if (velocityY <= 0) {
            return false;
        }
        return true;
    }

    private final int u(View targetView, z helper) {
        return helper.g(targetView) - helper.n();
    }

    private final int v(LinearLayoutManager lm) {
        return lm.getReverseLayout() ? lm.findLastVisibleItemPosition() : lm.findFirstVisibleItemPosition();
    }

    private final int w(LinearLayoutManager lm, int velocityX, int velocityY) {
        kotlin.ranges.l b5;
        int v4 = r(lm, velocityX, velocityY) ? v(lm) + x(lm) : v(lm);
        b5 = f.b(lm);
        return s.J(v4, b5);
    }

    private final int x(LinearLayoutManager lm) {
        return lm.getReverseLayout() ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.e0
    public void b(@fg.m RecyclerView recyclerView) {
        super.b(recyclerView);
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 != null) {
            recyclerView2.removeOnScrollListener(this.scrollListener);
        }
        this.recyclerView = recyclerView;
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(this.scrollListener);
        }
    }

    @Override // androidx.recyclerview.widget.a0, androidx.recyclerview.widget.e0
    @fg.l
    public int[] c(@fg.l RecyclerView.LayoutManager lm, @fg.l View targetView) {
        l0.p(lm, ProtectedSandApp.s("ᓣ\u0001"));
        l0.p(targetView, ProtectedSandApp.s("ᓤ\u0001"));
        return new int[]{lm.canScrollHorizontally() ? u(targetView, o(lm)) : 0, lm.canScrollVertically() ? u(targetView, q(lm)) : 0};
    }

    @Override // androidx.recyclerview.widget.a0, androidx.recyclerview.widget.e0
    @fg.m
    public View h(@fg.l RecyclerView.LayoutManager lm) {
        int u4;
        kotlin.ranges.l b5;
        kotlin.ranges.l b6;
        l0.p(lm, ProtectedSandApp.s("ᓣ\u0001"));
        Integer num = this.flingTargetPosition;
        if (num != null) {
            this.flingTargetPosition = null;
            return lm.findViewByPosition(num.intValue());
        }
        o oVar = this.scrollAction;
        this.scrollAction = null;
        z p4 = p(lm);
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) lm;
        int x4 = x(linearLayoutManager);
        int v4 = v(linearLayoutManager);
        View findViewByPosition = lm.findViewByPosition(v4);
        if (findViewByPosition == null || (u4 = u(findViewByPosition, p4)) == 0) {
            return null;
        }
        int i4 = oVar == null ? -1 : a.f66741a[oVar.ordinal()];
        if (i4 != -1) {
            if (i4 != 1) {
                if (i4 == 2) {
                    b6 = f.b(lm);
                    View findViewByPosition2 = lm.findViewByPosition(s.J(v4 + x4, b6));
                    if (findViewByPosition2 == null) {
                        return findViewByPosition;
                    }
                    if (Math.abs(u(findViewByPosition2, p4)) <= p4.e(findViewByPosition2) * 0.1f) {
                        return findViewByPosition2;
                    }
                } else if (i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (Math.abs(u4) >= p4.e(findViewByPosition) * 0.1f) {
                b5 = f.b(lm);
                return lm.findViewByPosition(s.J(v4 + x4, b5));
            }
        }
        return findViewByPosition;
    }

    @Override // androidx.recyclerview.widget.a0, androidx.recyclerview.widget.e0
    public int i(@fg.l RecyclerView.LayoutManager lm, int velocityX, int velocityY) {
        l0.p(lm, ProtectedSandApp.s("ᓣ\u0001"));
        int w4 = w((LinearLayoutManager) lm, velocityX, velocityY);
        this.flingTargetPosition = Integer.valueOf(w4);
        return w4;
    }
}
