package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import d5.d;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: FragmentReuseViolation.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentReuseViolation;", "Landroidx/fragment/app/strictmode/Violation;", "", "p", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "previousFragmentId", "Landroidx/fragment/app/Fragment;", "fragment", "<init>", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V", "fragment_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class FragmentReuseViolation extends Violation {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @d
    private final String previousFragmentId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentReuseViolation(@d Fragment fragment, @d String previousFragmentId) {
        super(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + previousFragmentId);
        l0.p(fragment, "fragment");
        l0.p(previousFragmentId, "previousFragmentId");
        this.previousFragmentId = previousFragmentId;
    }

    @d
    /* renamed from: b, reason: from getter */
    public final String getPreviousFragmentId() {
        return this.previousFragmentId;
    }
}
