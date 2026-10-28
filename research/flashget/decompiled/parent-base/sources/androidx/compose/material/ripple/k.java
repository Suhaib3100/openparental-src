package androidx.compose.material.ripple;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.u;
import androidx.compose.ui.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.w;
import kotlin.jvm.internal.r1;

/* compiled from: RippleContainer.android.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\f\u001a\u00020\u0015*\u00020\u0014¢\u0006\u0004\b\f\u0010\u0016J\u0011\u0010\u0017\u001a\u00020\r*\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\f\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00150\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010\u0019¨\u0006'"}, d2 = {"Landroidx/compose/material/ripple/k;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "changed", "", "l", "t", "r", "b", "Lkotlin/k2;", "onLayout", "(ZIIII)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Landroidx/compose/material/ripple/a;", "Landroidx/compose/material/ripple/n;", "(Landroidx/compose/material/ripple/a;)Landroidx/compose/material/ripple/n;", "a", "(Landroidx/compose/material/ripple/a;)V", "I", "MaxRippleHosts", "", "c", "Ljava/util/List;", "rippleHosts", "d", "unusedRippleHosts", "Landroidx/compose/material/ripple/l;", "e", "Landroidx/compose/material/ripple/l;", "rippleHostMap", "f", "nextHostIndex", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nRippleContainer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RippleContainer.android.kt\nandroidx/compose/material/ripple/RippleContainer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,185:1\n1#2:186\n*E\n"})
/* loaded from: classes.dex */
public final class k extends ViewGroup {

    /* renamed from: g, reason: collision with root package name */
    public static final int f9354g = 8;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int MaxRippleHosts;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<n> rippleHosts;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<n> unusedRippleHosts;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final l rippleHostMap;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int nextHostIndex;

    public k(@fg.l Context context) {
        super(context);
        this.MaxRippleHosts = 5;
        ArrayList arrayList = new ArrayList();
        this.rippleHosts = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.unusedRippleHosts = arrayList2;
        this.rippleHostMap = new l();
        setClipChildren(false);
        n nVar = new n(context);
        addView(nVar);
        arrayList.add(nVar);
        arrayList2.add(nVar);
        this.nextHostIndex = 1;
        setTag(t.b.J, Boolean.TRUE);
    }

    public final void a(@fg.l a aVar) {
        aVar.o();
        n b5 = this.rippleHostMap.b(aVar);
        if (b5 != null) {
            b5.d();
            this.rippleHostMap.c(aVar);
            this.unusedRippleHosts.add(b5);
        }
    }

    @fg.l
    public final n b(@fg.l a aVar) {
        n b5 = this.rippleHostMap.b(aVar);
        if (b5 != null) {
            return b5;
        }
        n nVar = (n) w.N0(this.unusedRippleHosts);
        if (nVar == null) {
            if (this.nextHostIndex > w.J(this.rippleHosts)) {
                nVar = new n(getContext());
                addView(nVar);
                this.rippleHosts.add(nVar);
            } else {
                nVar = this.rippleHosts.get(this.nextHostIndex);
                a a5 = this.rippleHostMap.a(nVar);
                if (a5 != null) {
                    a5.o();
                    this.rippleHostMap.c(a5);
                    nVar.d();
                }
            }
            int i4 = this.nextHostIndex;
            if (i4 < this.MaxRippleHosts - 1) {
                this.nextHostIndex = i4 + 1;
            } else {
                this.nextHostIndex = 0;
            }
        }
        this.rippleHostMap.d(aVar, nVar);
        return nVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l4, int t4, int r4, int b5) {
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(0, 0);
    }
}
