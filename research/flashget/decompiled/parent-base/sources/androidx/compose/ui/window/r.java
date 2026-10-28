package androidx.compose.ui.window;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SecureFlagPolicy.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/window/q;", "", "isSecureFlagSetOnParent", "a", "(Landroidx/compose/ui/window/q;Z)Z", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class r {

    /* compiled from: SecureFlagPolicy.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21767a;

        static {
            int[] iArr = new int[q.values().length];
            try {
                iArr[q.SecureOff.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q.SecureOn.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[q.Inherit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f21767a = iArr;
        }
    }

    public static final boolean a(@fg.l q qVar, boolean z4) {
        int i4 = a.f21767a[qVar.ordinal()];
        if (i4 == 1) {
            return false;
        }
        if (i4 == 2) {
            return true;
        }
        if (i4 == 3) {
            return z4;
        }
        throw new NoWhenBranchMatchedException();
    }
}
