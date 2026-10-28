package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.view.d0;
import java.io.InputStream;
import java.util.Objects;

/* compiled from: RoundedBitmapDrawableFactory.java */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private static final String f4742a = "RoundedBitmapDrawableFa";

    /* compiled from: RoundedBitmapDrawableFactory.java */
    /* loaded from: classes3.dex */
    private static class a extends n {
        a(Resources resources, Bitmap bitmap) {
            super(resources, bitmap);
        }

        @Override // androidx.core.graphics.drawable.n
        void f(int i5, int i6, int i7, Rect rect, Rect rect2) {
            d0.b(i5, i6, i7, rect, rect2, 0);
        }

        @Override // androidx.core.graphics.drawable.n
        public boolean h() {
            Bitmap bitmap = this.f4729a;
            return bitmap != null && androidx.core.graphics.a.c(bitmap);
        }

        @Override // androidx.core.graphics.drawable.n
        public void o(boolean z5) {
            Bitmap bitmap = this.f4729a;
            if (bitmap != null) {
                androidx.core.graphics.a.d(bitmap, z5);
                invalidateSelf();
            }
        }
    }

    private o() {
    }

    @o0
    public static n a(@o0 Resources resources, @q0 Bitmap bitmap) {
        return new m(resources, bitmap);
    }

    @o0
    public static n b(@o0 Resources resources, @o0 InputStream inputStream) {
        m mVar = new m(resources, BitmapFactory.decodeStream(inputStream));
        if (mVar.f4729a == null) {
            Objects.toString(inputStream);
        }
        return mVar;
    }

    @o0
    public static n c(@o0 Resources resources, @o0 String str) {
        return new m(resources, BitmapFactory.decodeFile(str));
    }
}
