package androidx.view.result;

import android.annotation.SuppressLint;
import androidx.annotation.l0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.app.e;
import b.a;

/* compiled from: ActivityResultLauncher.java */
/* loaded from: classes.dex */
public abstract class h<I> {
    @o0
    public abstract a<I, ?> a();

    public void b(@SuppressLint({"UnknownNullness"}) I i4) {
        c(i4, null);
    }

    public abstract void c(@SuppressLint({"UnknownNullness"}) I i4, @q0 e eVar);

    @l0
    public abstract void d();
}
