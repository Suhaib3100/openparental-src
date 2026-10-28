package androidx.compose.ui.window;

import androidx.compose.animation.d1;
import androidx.compose.runtime.m1;
import kotlin.Metadata;
import kotlin.jvm.internal.w;

/* compiled from: AndroidDialog.android.kt */
@m1
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nB'\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/window/g;", "", "", "dismissOnBackPress", "dismissOnClickOutside", "Landroidx/compose/ui/window/q;", "securePolicy", "usePlatformDefaultWidth", "decorFitsSystemWindows", "<init>", "(ZZLandroidx/compose/ui/window/q;ZZ)V", "(ZZLandroidx/compose/ui/window/q;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Z", "b", "()Z", "c", "Landroidx/compose/ui/window/q;", "d", "()Landroidx/compose/ui/window/q;", "e", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g {

    /* renamed from: f, reason: collision with root package name */
    public static final int f21717f = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean dismissOnBackPress;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean dismissOnClickOutside;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final q securePolicy;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean usePlatformDefaultWidth;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean decorFitsSystemWindows;

    public g() {
        this(false, false, null, false, false, 31, null);
    }

    /* renamed from: a, reason: from getter */
    public final boolean getDecorFitsSystemWindows() {
        return this.decorFitsSystemWindows;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getDismissOnBackPress() {
        return this.dismissOnBackPress;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getDismissOnClickOutside() {
        return this.dismissOnClickOutside;
    }

    @fg.l
    /* renamed from: d, reason: from getter */
    public final q getSecurePolicy() {
        return this.securePolicy;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getUsePlatformDefaultWidth() {
        return this.usePlatformDefaultWidth;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof g)) {
            return false;
        }
        g gVar = (g) other;
        return this.dismissOnBackPress == gVar.dismissOnBackPress && this.dismissOnClickOutside == gVar.dismissOnClickOutside && this.securePolicy == gVar.securePolicy && this.usePlatformDefaultWidth == gVar.usePlatformDefaultWidth && this.decorFitsSystemWindows == gVar.decorFitsSystemWindows;
    }

    public int hashCode() {
        return Boolean.hashCode(this.decorFitsSystemWindows) + d1.a(this.usePlatformDefaultWidth, (this.securePolicy.hashCode() + d1.a(this.dismissOnClickOutside, Boolean.hashCode(this.dismissOnBackPress) * 31, 31)) * 31, 31);
    }

    public g(boolean z4, boolean z5, @fg.l q qVar, boolean z6, boolean z7) {
        this.dismissOnBackPress = z4;
        this.dismissOnClickOutside = z5;
        this.securePolicy = qVar;
        this.usePlatformDefaultWidth = z6;
        this.decorFitsSystemWindows = z7;
    }

    public /* synthetic */ g(boolean z4, boolean z5, q qVar, boolean z6, boolean z7, int i4, w wVar) {
        this((i4 & 1) != 0 ? true : z4, (i4 & 2) != 0 ? true : z5, (i4 & 4) != 0 ? q.Inherit : qVar, (i4 & 8) != 0 ? true : z6, (i4 & 16) != 0 ? true : z7);
    }

    public /* synthetic */ g(boolean z4, boolean z5, q qVar, int i4, w wVar) {
        this((i4 & 1) != 0 ? true : z4, (i4 & 2) != 0 ? true : z5, (i4 & 4) != 0 ? q.Inherit : qVar);
    }

    public g(boolean z4, boolean z5, @fg.l q qVar) {
        this(z4, z5, qVar, true, true);
    }
}
