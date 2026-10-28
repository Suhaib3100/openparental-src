package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

/* compiled from: MenuProvider.java */
/* loaded from: classes.dex */
public interface e1 {
    boolean a(@androidx.annotation.o0 MenuItem menuItem);

    default void b(@androidx.annotation.o0 Menu menu) {
    }

    void c(@androidx.annotation.o0 Menu menu, @androidx.annotation.o0 MenuInflater menuInflater);

    default void d(@androidx.annotation.o0 Menu menu) {
    }
}
