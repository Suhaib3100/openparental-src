package androidx.vectordrawable.graphics.drawable;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import androidx.annotation.o0;
import androidx.annotation.x0;

/* compiled from: Animatable2Compat.java */
/* loaded from: classes3.dex */
public interface b extends Animatable {

    /* compiled from: Animatable2Compat.java */
    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        Animatable2.AnimationCallback f35310a;

        /* compiled from: Animatable2Compat.java */
        /* renamed from: androidx.vectordrawable.graphics.drawable.b$a$a, reason: collision with other inner class name */
        class C0632a extends Animatable2.AnimationCallback {
            C0632a() {
            }

            @Override // android.graphics.drawable.Animatable2.AnimationCallback
            public void onAnimationEnd(Drawable drawable) {
                a.this.b(drawable);
            }

            @Override // android.graphics.drawable.Animatable2.AnimationCallback
            public void onAnimationStart(Drawable drawable) {
                a.this.c(drawable);
            }
        }

        @x0(23)
        Animatable2.AnimationCallback a() {
            if (this.f35310a == null) {
                this.f35310a = new C0632a();
            }
            return this.f35310a;
        }

        public void b(Drawable drawable) {
        }

        public void c(Drawable drawable) {
        }
    }

    void b(@o0 a aVar);

    void d();

    boolean e(@o0 a aVar);
}
