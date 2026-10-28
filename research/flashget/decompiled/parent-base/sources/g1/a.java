package g1;

import android.view.autofill.AutofillId;
import androidx.annotation.o0;
import androidx.annotation.x0;

/* compiled from: AutofillIdCompat.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final Object f73898a;

    @x0(26)
    private a(@o0 AutofillId autofillId) {
        this.f73898a = autofillId;
    }

    @o0
    @x0(26)
    public static a b(@o0 AutofillId autofillId) {
        return new a(autofillId);
    }

    @o0
    @x0(26)
    public AutofillId a() {
        return androidx.compose.ui.platform.coreshims.a.a(this.f73898a);
    }
}
