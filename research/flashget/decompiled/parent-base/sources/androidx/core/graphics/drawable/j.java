package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.view.Gravity;
import androidx.annotation.o0;
import androidx.annotation.q0;
import java.io.InputStream;
import java.util.Objects;

/* compiled from: RoundedBitmapDrawableFactory.java */
/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static final String f26230a = "RoundedBitmapDrawableFa";

    /* compiled from: RoundedBitmapDrawableFactory.java */
    private static class a extends i {
        a(Resources resources, Bitmap bitmap) {
            super(resources, bitmap);
        }

        @Override // androidx.core.graphics.drawable.i
        void f(int i4, int i5, int i6, Rect rect, Rect rect2) {
            Gravity.apply(i4, i5, i6, rect, rect2, 0);
        }

        @Override // androidx.core.graphics.drawable.i
        public boolean h() {
            Bitmap bitmap = this.f26217a;
            return bitmap != null && bitmap.hasMipMap();
        }

        @Override // androidx.core.graphics.drawable.i
        public void o(boolean z4) {
            Bitmap bitmap = this.f26217a;
            if (bitmap != null) {
                bitmap.setHasMipMap(z4);
                invalidateSelf();
            }
        }
    }

    private j() {
    }

    @o0
    public static i a(@o0 Resources resources, @q0 Bitmap bitmap) {
        return new h(resources, bitmap);
    }

    @o0
    public static i b(@o0 Resources resources, @o0 InputStream inputStream) {
        h hVar = new h(resources, BitmapFactory.decodeStream(inputStream));
        if (hVar.f26217a == null) {
            Objects.toString(inputStream);
        }
        return hVar;
    }

    @o0
    public static i c(@o0 Resources resources, @o0 String str) {
        return new h(resources, BitmapFactory.decodeFile(str));
    }
}
