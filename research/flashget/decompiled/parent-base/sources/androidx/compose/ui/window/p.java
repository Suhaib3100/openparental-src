package androidx.compose.ui.window;

import androidx.compose.animation.d1;
import androidx.compose.runtime.m1;
import kotlin.Metadata;
import kotlin.jvm.internal.w;

/* compiled from: AndroidPopup.android.kt */
@m1
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001BO\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fBE\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001e\u0010\u0017¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/window/p;", "", "", "focusable", "dismissOnBackPress", "dismissOnClickOutside", "Landroidx/compose/ui/window/q;", "securePolicy", "excludeFromSystemGesture", "clippingEnabled", "usePlatformDefaultWidth", "<init>", "(ZZZLandroidx/compose/ui/window/q;ZZZ)V", "(ZZZLandroidx/compose/ui/window/q;ZZ)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Z", "e", "()Z", "b", "c", "d", "Landroidx/compose/ui/window/q;", "f", "()Landroidx/compose/ui/window/q;", "g", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class p {

    /* renamed from: h, reason: collision with root package name */
    public static final int f21759h = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean focusable;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean dismissOnBackPress;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean dismissOnClickOutside;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final q securePolicy;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean excludeFromSystemGesture;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean clippingEnabled;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean usePlatformDefaultWidth;

    @androidx.compose.ui.k
    public p() {
        this(false, false, false, null, false, false, false, 127, null);
    }

    /* renamed from: a, reason: from getter */
    public final boolean getClippingEnabled() {
        return this.clippingEnabled;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getDismissOnBackPress() {
        return this.dismissOnBackPress;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getDismissOnClickOutside() {
        return this.dismissOnClickOutside;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getExcludeFromSystemGesture() {
        return this.excludeFromSystemGesture;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getFocusable() {
        return this.focusable;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof p)) {
            return false;
        }
        p pVar = (p) other;
        return this.focusable == pVar.focusable && this.dismissOnBackPress == pVar.dismissOnBackPress && this.dismissOnClickOutside == pVar.dismissOnClickOutside && this.securePolicy == pVar.securePolicy && this.excludeFromSystemGesture == pVar.excludeFromSystemGesture && this.clippingEnabled == pVar.clippingEnabled && this.usePlatformDefaultWidth == pVar.usePlatformDefaultWidth;
    }

    @fg.l
    /* renamed from: f, reason: from getter */
    public final q getSecurePolicy() {
        return this.securePolicy;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getUsePlatformDefaultWidth() {
        return this.usePlatformDefaultWidth;
    }

    public int hashCode() {
        return Boolean.hashCode(this.usePlatformDefaultWidth) + d1.a(this.clippingEnabled, d1.a(this.excludeFromSystemGesture, (this.securePolicy.hashCode() + d1.a(this.dismissOnClickOutside, d1.a(this.dismissOnBackPress, d1.a(this.focusable, Boolean.hashCode(this.dismissOnBackPress) * 31, 31), 31), 31)) * 31, 31), 31);
    }

    @androidx.compose.ui.k
    public p(boolean z4, boolean z5, boolean z6, @fg.l q qVar, boolean z7, boolean z10, boolean z11) {
        this.focusable = z4;
        this.dismissOnBackPress = z5;
        this.dismissOnClickOutside = z6;
        this.securePolicy = qVar;
        this.excludeFromSystemGesture = z7;
        this.clippingEnabled = z10;
        this.usePlatformDefaultWidth = z11;
    }

    public /* synthetic */ p(boolean z4, boolean z5, boolean z6, q qVar, boolean z7, boolean z10, boolean z11, int i4, w wVar) {
        this((i4 & 1) != 0 ? false : z4, (i4 & 2) != 0 ? true : z5, (i4 & 4) != 0 ? true : z6, (i4 & 8) != 0 ? q.Inherit : qVar, (i4 & 16) != 0 ? true : z7, (i4 & 32) == 0 ? z10 : true, (i4 & 64) != 0 ? false : z11);
    }

    public p(boolean z4, boolean z5, boolean z6, q qVar, boolean z7, boolean z10, int i4, w wVar) {
        this((i4 & 1) != 0 ? false : z4, (i4 & 2) != 0 ? true : z5, (i4 & 4) != 0 ? true : z6, (i4 & 8) != 0 ? q.Inherit : qVar, (i4 & 16) != 0 ? true : z7, (i4 & 32) == 0 ? z10 : true, false);
    }

    public p(boolean z4, boolean z5, boolean z6, @fg.l q qVar, boolean z7, boolean z10) {
        this(z4, z5, z6, qVar, z7, z10, false);
    }
}
