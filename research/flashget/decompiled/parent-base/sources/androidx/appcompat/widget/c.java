package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* compiled from: ActionBarBackgroundDrawable.java */
/* loaded from: classes.dex */
class c extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    final ActionBarContainer f1769a;

    /* compiled from: ActionBarBackgroundDrawable.java */
    @androidx.annotation.x0(21)
    private static class a {
        private a() {
        }

        public static void a(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }
    }

    public c(ActionBarContainer actionBarContainer) {
        this.f1769a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f1769a;
        if (actionBarContainer.f1337i) {
            Drawable drawable = actionBarContainer.f1336h;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f1334f;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f1769a;
        Drawable drawable3 = actionBarContainer2.f1335g;
        if (drawable3 == null || !actionBarContainer2.f1338j) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    @androidx.annotation.x0(21)
    public void getOutline(@androidx.annotation.o0 Outline outline) {
        ActionBarContainer actionBarContainer = this.f1769a;
        if (actionBarContainer.f1337i) {
            if (actionBarContainer.f1336h != null) {
                actionBarContainer.f1334f.getOutline(outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f1334f;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
