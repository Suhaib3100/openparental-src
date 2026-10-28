package androidx.appcompat.view.menu;

import android.graphics.drawable.Drawable;
import androidx.annotation.c1;

/* compiled from: MenuView.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public interface o {

    /* compiled from: MenuView.java */
    public interface a {
        void c(boolean z5, char c6);

        j d();

        boolean g();

        boolean k();

        void l(j jVar, int i5);

        void setCheckable(boolean z5);

        void setChecked(boolean z5);

        void setEnabled(boolean z5);

        void setIcon(Drawable drawable);

        void setTitle(CharSequence charSequence);
    }

    void e(g gVar);

    int h();
}
