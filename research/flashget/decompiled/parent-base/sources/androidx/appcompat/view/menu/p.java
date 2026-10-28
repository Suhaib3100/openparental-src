package androidx.appcompat.view.menu;

import android.graphics.drawable.Drawable;
import androidx.annotation.c1;

/* compiled from: MenuView.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public interface p {

    /* compiled from: MenuView.java */
    public interface a {
        void b(boolean z4, char c5);

        void e(k kVar, int i4);

        k g();

        boolean h();

        boolean i();

        void setCheckable(boolean z4);

        void setChecked(boolean z4);

        void setEnabled(boolean z4);

        void setIcon(Drawable drawable);

        void setTitle(CharSequence charSequence);
    }

    void a(h hVar);

    int d();
}
