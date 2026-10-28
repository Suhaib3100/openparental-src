package h0;

import android.graphics.Rect;
import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.annotation.x0;
import kotlin.Metadata;

/* compiled from: AndroidAutofill.android.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0018\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0019"}, d2 = {"Lh0/f;", "Lh0/j;", "Landroid/view/View;", "view", "Lh0/a0;", "autofillTree", "<init>", "(Landroid/view/View;Lh0/a0;)V", "Lh0/z;", "autofillNode", "Lkotlin/k2;", "a", "(Lh0/z;)V", "b", "Landroid/view/View;", "e", "()Landroid/view/View;", "Lh0/a0;", "d", "()Lh0/a0;", "Landroid/view/autofill/AutofillManager;", "c", "Landroid/view/autofill/AutofillManager;", "()Landroid/view/autofill/AutofillManager;", "autofillManager", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@androidx.compose.ui.k
@x0(26)
/* loaded from: classes.dex */
public final class f implements j {

    /* renamed from: d, reason: collision with root package name */
    public static final int f73917d = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final View view;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final a0 autofillTree;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final AutofillManager autofillManager;

    public f(@fg.l View view, @fg.l a0 a0Var) {
        this.view = view;
        this.autofillTree = a0Var;
        AutofillManager a5 = d.a(view.getContext().getSystemService(c.a()));
        if (a5 == null) {
            throw new IllegalStateException("Autofill service could not be located.");
        }
        this.autofillManager = a5;
        view.setImportantForAutofill(1);
    }

    @Override // h0.j
    public void a(@fg.l z autofillNode) {
        i0.i boundingBox = autofillNode.getBoundingBox();
        if (boundingBox == null) {
            throw new IllegalStateException("requestAutofill called before onChildPositioned()");
        }
        this.autofillManager.notifyViewEntered(this.view, autofillNode.getId(), new Rect(kotlin.math.b.L0(boundingBox.t()), kotlin.math.b.L0(boundingBox.getTop()), kotlin.math.b.L0(boundingBox.x()), kotlin.math.b.L0(boundingBox.j())));
    }

    @Override // h0.j
    public void b(@fg.l z autofillNode) {
        this.autofillManager.notifyViewExited(this.view, autofillNode.getId());
    }

    @fg.l
    /* renamed from: c, reason: from getter */
    public final AutofillManager getAutofillManager() {
        return this.autofillManager;
    }

    @fg.l
    /* renamed from: d, reason: from getter */
    public final a0 getAutofillTree() {
        return this.autofillTree;
    }

    @fg.l
    /* renamed from: e, reason: from getter */
    public final View getView() {
        return this.view;
    }
}
