package android.view.result;

import android.annotation.SuppressLint;
import androidx.annotation.l0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.app.i;
import b.a;

/* compiled from: ActivityResultLauncher.java */
/* loaded from: classes.dex */
public abstract class c<I> {
    @o0
    public abstract a<I, ?> a();

    public void b(@SuppressLint({"UnknownNullness"}) I i5) {
        c(i5, null);
    }

    public abstract void c(@SuppressLint({"UnknownNullness"}) I i5, @q0 i iVar);

    @l0
    public abstract void d();
}
