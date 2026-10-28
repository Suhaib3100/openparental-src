package androidx.compose.ui.platform.coreshims;

import android.view.autofill.AutofillId;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.x0;

/* compiled from: AutofillIdCompat.java */
@c1({c1.a.LIBRARY})
/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final Object f19793a;

    @x0(26)
    private b(@o0 AutofillId autofillId) {
        this.f19793a = autofillId;
    }

    @o0
    @x0(26)
    public static b b(@o0 AutofillId autofillId) {
        return new b(autofillId);
    }

    @o0
    @x0(26)
    public AutofillId a() {
        return a.a(this.f19793a);
    }
}
