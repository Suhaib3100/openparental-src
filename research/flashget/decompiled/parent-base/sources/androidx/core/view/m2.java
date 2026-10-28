package androidx.core.view;

import android.view.ViewStructure;

/* compiled from: ViewStructureCompat.java */
/* loaded from: classes3.dex */
public class m2 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f27322a;

    /* compiled from: ViewStructureCompat.java */
    @androidx.annotation.x0(23)
    private static class a {
        private a() {
        }

        static void a(ViewStructure viewStructure, String str) {
            viewStructure.setClassName(str);
        }

        static void b(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setContentDescription(charSequence);
        }

        static void c(ViewStructure viewStructure, int i4, int i5, int i6, int i7, int i10, int i11) {
            viewStructure.setDimens(i4, i5, i6, i7, i10, i11);
        }

        static void d(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setText(charSequence);
        }
    }

    private m2(@androidx.annotation.o0 ViewStructure viewStructure) {
        this.f27322a = viewStructure;
    }

    @androidx.annotation.o0
    @androidx.annotation.x0(23)
    public static m2 f(@androidx.annotation.o0 ViewStructure viewStructure) {
        return new m2(viewStructure);
    }

    public void a(@androidx.annotation.o0 String str) {
        ((ViewStructure) this.f27322a).setClassName(str);
    }

    public void b(@androidx.annotation.o0 CharSequence charSequence) {
        ((ViewStructure) this.f27322a).setContentDescription(charSequence);
    }

    public void c(int i4, int i5, int i6, int i7, int i10, int i11) {
        ((ViewStructure) this.f27322a).setDimens(i4, i5, i6, i7, i10, i11);
    }

    public void d(@androidx.annotation.o0 CharSequence charSequence) {
        ((ViewStructure) this.f27322a).setText(charSequence);
    }

    @androidx.annotation.o0
    @androidx.annotation.x0(23)
    public ViewStructure e() {
        return (ViewStructure) this.f27322a;
    }
}
