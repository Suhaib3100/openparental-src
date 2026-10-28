package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import d5.d;
import d5.e;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: Violation.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Landroidx/fragment/app/strictmode/Violation;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Landroidx/fragment/app/Fragment;", "o", "Landroidx/fragment/app/Fragment;", "a", "()Landroidx/fragment/app/Fragment;", "fragment", "", "violationMessage", "<init>", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V", "fragment_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public abstract class Violation extends RuntimeException {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @d
    private final Fragment fragment;

    public /* synthetic */ Violation(Fragment fragment, String str, int i5, w wVar) {
        this(fragment, (i5 & 2) != 0 ? null : str);
    }

    @d
    /* renamed from: a, reason: from getter */
    public final Fragment getFragment() {
        return this.fragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Violation(@d Fragment fragment, @e String str) {
        super(str);
        l0.p(fragment, "fragment");
        this.fragment = fragment;
    }
}
