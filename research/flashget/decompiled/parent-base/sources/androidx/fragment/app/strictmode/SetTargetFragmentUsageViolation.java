package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import fg.l;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: SetTargetFragmentUsageViolation.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/fragment/app/strictmode/SetTargetFragmentUsageViolation;", "Landroidx/fragment/app/strictmode/TargetFragmentUsageViolation;", "Landroidx/fragment/app/Fragment;", "fragment", "targetFragment", "", "requestCode", "<init>", "(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;I)V", "c", "Landroidx/fragment/app/Fragment;", "()Landroidx/fragment/app/Fragment;", "d", "I", "b", "()I", "fragment_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SetTargetFragmentUsageViolation extends TargetFragmentUsageViolation {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final Fragment targetFragment;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int requestCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetTargetFragmentUsageViolation(@l Fragment fragment, @l Fragment targetFragment, int i4) {
        super(fragment, "Attempting to set target fragment " + targetFragment + " with request code " + i4 + " for fragment " + fragment);
        l0.p(fragment, "fragment");
        l0.p(targetFragment, "targetFragment");
        this.targetFragment = targetFragment;
        this.requestCode = i4;
    }

    /* renamed from: b, reason: from getter */
    public final int getRequestCode() {
        return this.requestCode;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Fragment getTargetFragment() {
        return this.targetFragment;
    }
}
