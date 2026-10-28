package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.widget.SpinnerAdapter;

/* compiled from: ThemedSpinnerAdapter.java */
/* loaded from: classes.dex */
public interface v0 extends SpinnerAdapter {

    /* compiled from: ThemedSpinnerAdapter.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Context f1398a;

        /* renamed from: b, reason: collision with root package name */
        private final LayoutInflater f1399b;

        /* renamed from: c, reason: collision with root package name */
        private LayoutInflater f1400c;

        public a(@androidx.annotation.o0 Context context) {
            this.f1398a = context;
            this.f1399b = LayoutInflater.from(context);
        }

        @androidx.annotation.o0
        public LayoutInflater a() {
            LayoutInflater layoutInflater = this.f1400c;
            return layoutInflater != null ? layoutInflater : this.f1399b;
        }

        @androidx.annotation.q0
        public Resources.Theme b() {
            LayoutInflater layoutInflater = this.f1400c;
            if (layoutInflater == null) {
                return null;
            }
            return layoutInflater.getContext().getTheme();
        }

        public void c(@androidx.annotation.q0 Resources.Theme theme) {
            if (theme == null) {
                this.f1400c = null;
            } else if (theme == this.f1398a.getTheme()) {
                this.f1400c = this.f1399b;
            } else {
                this.f1400c = LayoutInflater.from(new androidx.appcompat.view.d(this.f1398a, theme));
            }
        }
    }

    @androidx.annotation.q0
    Resources.Theme getDropDownViewTheme();

    void setDropDownViewTheme(@androidx.annotation.q0 Resources.Theme theme);
}
