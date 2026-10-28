package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import androidx.annotation.q0;
import com.squareup.picasso.w;
import java.io.IOException;
import okio.o0;

/* compiled from: RequestHandler.java */
/* loaded from: classes6.dex */
public abstract class d0 {

    /* compiled from: RequestHandler.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final w.e f70831a;

        /* renamed from: b, reason: collision with root package name */
        private final Bitmap f70832b;

        /* renamed from: c, reason: collision with root package name */
        private final o0 f70833c;

        /* renamed from: d, reason: collision with root package name */
        private final int f70834d;

        public a(@androidx.annotation.o0 Bitmap bitmap, @androidx.annotation.o0 w.e eVar) {
            this((Bitmap) k0.e(bitmap, "bitmap == null"), null, eVar, 0);
        }

        @q0
        public Bitmap a() {
            return this.f70832b;
        }

        int b() {
            return this.f70834d;
        }

        @androidx.annotation.o0
        public w.e c() {
            return this.f70831a;
        }

        @q0
        public o0 d() {
            return this.f70833c;
        }

        public a(@androidx.annotation.o0 o0 o0Var, @androidx.annotation.o0 w.e eVar) {
            this(null, (o0) k0.e(o0Var, "source == null"), eVar, 0);
        }

        a(@q0 Bitmap bitmap, @q0 o0 o0Var, @androidx.annotation.o0 w.e eVar, int i4) {
            if ((bitmap != null) != (o0Var != null)) {
                this.f70832b = bitmap;
                this.f70833c = o0Var;
                this.f70831a = (w.e) k0.e(eVar, "loadedFrom == null");
                this.f70834d = i4;
                return;
            }
            throw new AssertionError();
        }
    }

    static void a(int i4, int i5, int i6, int i7, BitmapFactory.Options options, b0 b0Var) {
        int max;
        double floor;
        if (i7 > i5 || i6 > i4) {
            if (i5 == 0) {
                floor = Math.floor(i6 / i4);
            } else if (i4 == 0) {
                floor = Math.floor(i7 / i5);
            } else {
                int floor2 = (int) Math.floor(i7 / i5);
                int floor3 = (int) Math.floor(i6 / i4);
                max = b0Var.f70758l ? Math.max(floor2, floor3) : Math.min(floor2, floor3);
            }
            max = (int) floor;
        } else {
            max = 1;
        }
        options.inSampleSize = max;
        options.inJustDecodeBounds = false;
    }

    static void b(int i4, int i5, BitmapFactory.Options options, b0 b0Var) {
        a(i4, i5, options.outWidth, options.outHeight, options, b0Var);
    }

    static BitmapFactory.Options d(b0 b0Var) {
        boolean d5 = b0Var.d();
        boolean z4 = b0Var.f70765s != null;
        if (!d5 && !z4 && !b0Var.f70764r) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = d5;
        boolean z5 = b0Var.f70764r;
        options.inInputShareable = z5;
        options.inPurgeable = z5;
        if (z4) {
            options.inPreferredConfig = b0Var.f70765s;
        }
        return options;
    }

    static boolean g(BitmapFactory.Options options) {
        return options != null && options.inJustDecodeBounds;
    }

    public abstract boolean c(b0 b0Var);

    int e() {
        return 0;
    }

    @q0
    public abstract a f(b0 b0Var, int i4) throws IOException;

    boolean h(boolean z4, NetworkInfo networkInfo) {
        return false;
    }

    boolean i() {
        return false;
    }
}
