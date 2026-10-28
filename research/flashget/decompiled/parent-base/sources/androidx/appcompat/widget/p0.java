package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.widget.SpinnerAdapter;

/* compiled from: ThemedSpinnerAdapter.java */
/* loaded from: classes.dex */
public interface p0 extends SpinnerAdapter {

    /* compiled from: ThemedSpinnerAdapter.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Context f1982a;

        /* renamed from: b, reason: collision with root package name */
        private final LayoutInflater f1983b;

        /* renamed from: c, reason: collision with root package name */
        private LayoutInflater f1984c;

        public a(@androidx.annotation.o0 Context context) {
            this.f1982a = context;
            this.f1983b = LayoutInflater.from(context);
        }

        @androidx.annotation.o0
        public LayoutInflater a() {
            LayoutInflater layoutInflater = this.f1984c;
            return layoutInflater != null ? layoutInflater : this.f1983b;
        }

        @androidx.annotation.q0
        public Resources.Theme b() {
            LayoutInflater layoutInflater = this.f1984c;
            if (layoutInflater == null) {
                return null;
            }
            return layoutInflater.getContext().getTheme();
        }

        public void c(@androidx.annotation.q0 Resources.Theme theme) {
            if (theme == null) {
                this.f1984c = null;
            } else if (theme.equals(this.f1982a.getTheme())) {
                this.f1984c = this.f1983b;
            } else {
                this.f1984c = LayoutInflater.from(new androidx.appcompat.view.d(this.f1982a, theme));
            }
        }
    }

    @androidx.annotation.q0
    Resources.Theme getDropDownViewTheme();

    void setDropDownViewTheme(@androidx.annotation.q0 Resources.Theme theme);
}
