package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import fg.l;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: FragmentReuseViolation.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentReuseViolation;", "Landroidx/fragment/app/strictmode/Violation;", "Landroidx/fragment/app/Fragment;", "fragment", "", "previousFragmentId", "<init>", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V", "c", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "fragment_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FragmentReuseViolation extends Violation {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final String previousFragmentId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentReuseViolation(@l Fragment fragment, @l String previousFragmentId) {
        super(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + previousFragmentId);
        l0.p(fragment, "fragment");
        l0.p(previousFragmentId, "previousFragmentId");
        this.previousFragmentId = previousFragmentId;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getPreviousFragmentId() {
        return this.previousFragmentId;
    }
}
