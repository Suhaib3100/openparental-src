package androidx.compose.ui.platform.coreshims;

import android.view.ViewStructure;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.u;
import androidx.annotation.x0;

/* compiled from: ViewStructureCompat.java */
@c1({c1.a.LIBRARY})
/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final Object f19803a;

    /* compiled from: ViewStructureCompat.java */
    @x0(23)
    private static class a {
        private a() {
        }

        @u
        static void a(ViewStructure viewStructure, String str) {
            viewStructure.setClassName(str);
        }

        @u
        static void b(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setContentDescription(charSequence);
        }

        @u
        static void c(ViewStructure viewStructure, int i4, int i5, int i6, int i7, int i10, int i11) {
            viewStructure.setDimens(i4, i5, i6, i7, i10, i11);
        }

        @u
        static void d(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setText(charSequence);
        }

        @u
        static void e(ViewStructure viewStructure, float f4, int i4, int i5, int i6) {
            viewStructure.setTextStyle(f4, i4, i5, i6);
        }
    }

    private f(@o0 ViewStructure viewStructure) {
        this.f19803a = viewStructure;
    }

    @o0
    @x0(23)
    public static f g(@o0 ViewStructure viewStructure) {
        return new f(viewStructure);
    }

    public void a(@o0 String str) {
        a.a((ViewStructure) this.f19803a, str);
    }

    public void b(@o0 CharSequence charSequence) {
        a.b((ViewStructure) this.f19803a, charSequence);
    }

    public void c(int i4, int i5, int i6, int i7, int i10, int i11) {
        a.c((ViewStructure) this.f19803a, i4, i5, i6, i7, i10, i11);
    }

    public void d(@o0 CharSequence charSequence) {
        a.d((ViewStructure) this.f19803a, charSequence);
    }

    public void e(float f4, int i4, int i5, int i6) {
        a.e((ViewStructure) this.f19803a, f4, i4, i5, i6);
    }

    @o0
    @x0(23)
    public ViewStructure f() {
        return (ViewStructure) this.f19803a;
    }
}
