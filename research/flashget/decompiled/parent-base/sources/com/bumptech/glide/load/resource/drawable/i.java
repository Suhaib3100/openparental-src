package com.bumptech.glide.load.resource.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.q0;
import androidx.annotation.v;

/* compiled from: DrawableDecoderCompat.java */
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private static volatile boolean f44581a = true;

    private i() {
    }

    public static Drawable a(Context context, @v int i4, @q0 Resources.Theme theme) {
        return c(context, context, i4, theme);
    }

    public static Drawable b(Context context, Context context2, @v int i4) {
        return c(context, context2, i4, null);
    }

    private static Drawable c(Context context, Context context2, @v int i4, @q0 Resources.Theme theme) {
        try {
            if (f44581a) {
                return e(context2, i4, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e4) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e4;
            }
            return androidx.core.content.d.getDrawable(context2, i4);
        } catch (NoClassDefFoundError unused2) {
            f44581a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return d(context2, i4, theme);
    }

    private static Drawable d(Context context, @v int i4, @q0 Resources.Theme theme) {
        return androidx.core.content.res.i.g(context.getResources(), i4, theme);
    }

    private static Drawable e(Context context, @v int i4, @q0 Resources.Theme theme) {
        if (theme != null) {
            androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, theme);
            dVar.a(theme.getResources().getConfiguration());
            context = dVar;
        }
        return e.a.b(context, i4);
    }
}
