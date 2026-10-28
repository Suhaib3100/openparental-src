package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import d5.d;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: SetTargetFragmentUsageViolation.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Landroidx/fragment/app/strictmode/SetTargetFragmentUsageViolation;", "Landroidx/fragment/app/strictmode/TargetFragmentUsageViolation;", "Landroidx/fragment/app/Fragment;", "p", "Landroidx/fragment/app/Fragment;", "c", "()Landroidx/fragment/app/Fragment;", "targetFragment", "", "q", "I", "b", "()I", "requestCode", "fragment", "<init>", "(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;I)V", "fragment_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class SetTargetFragmentUsageViolation extends TargetFragmentUsageViolation {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @d
    private final Fragment targetFragment;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final int requestCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetTargetFragmentUsageViolation(@d Fragment fragment, @d Fragment targetFragment, int i5) {
        super(fragment, "Attempting to set target fragment " + targetFragment + " with request code " + i5 + " for fragment " + fragment);
        l0.p(fragment, "fragment");
        l0.p(targetFragment, "targetFragment");
        this.targetFragment = targetFragment;
        this.requestCode = i5;
    }

    /* renamed from: b, reason: from getter */
    public final int getRequestCode() {
        return this.requestCode;
    }

    @d
    /* renamed from: c, reason: from getter */
    public final Fragment getTargetFragment() {
        return this.targetFragment;
    }
}
