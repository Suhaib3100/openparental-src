package com.bumptech.glide.load.resource.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.q0;
import androidx.annotation.v;
import androidx.core.content.res.i;

/* compiled from: DrawableDecoderCompat.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile boolean f11804a = true;

    private a() {
    }

    public static Drawable a(Context context, @v int i5, @q0 Resources.Theme theme) {
        return c(context, context, i5, theme);
    }

    public static Drawable b(Context context, Context context2, @v int i5) {
        return c(context, context2, i5, null);
    }

    private static Drawable c(Context context, Context context2, @v int i5, @q0 Resources.Theme theme) {
        try {
            if (f11804a) {
                return e(context2, i5, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e6) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e6;
            }
            return androidx.core.content.d.i(context2, i5);
        } catch (NoClassDefFoundError unused2) {
            f11804a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return d(context2, i5, theme);
    }

    private static Drawable d(Context context, @v int i5, @q0 Resources.Theme theme) {
        return i.g(context.getResources(), i5, theme);
    }

    private static Drawable e(Context context, @v int i5, @q0 Resources.Theme theme) {
        if (theme != null) {
            context = new androidx.appcompat.view.d(context, theme);
        }
        return androidx.appcompat.content.res.a.d(context, i5);
    }
}
