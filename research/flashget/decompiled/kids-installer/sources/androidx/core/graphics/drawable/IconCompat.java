package androidx.core.graphics.drawable;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.c1;
import androidx.annotation.d0;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.u;
import androidx.annotation.v;
import androidx.annotation.x0;
import androidx.core.view.y1;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.Objects;

/* loaded from: classes3.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: l, reason: collision with root package name */
    public static final int f4698l = -1;

    /* renamed from: m, reason: collision with root package name */
    public static final int f4699m = 1;

    /* renamed from: n, reason: collision with root package name */
    public static final int f4700n = 2;

    /* renamed from: o, reason: collision with root package name */
    public static final int f4701o = 3;

    /* renamed from: p, reason: collision with root package name */
    public static final int f4702p = 4;

    /* renamed from: q, reason: collision with root package name */
    public static final int f4703q = 5;

    /* renamed from: r, reason: collision with root package name */
    public static final int f4704r = 6;

    /* renamed from: s, reason: collision with root package name */
    private static final float f4705s = 0.25f;

    /* renamed from: t, reason: collision with root package name */
    private static final float f4706t = 0.6666667f;

    /* renamed from: u, reason: collision with root package name */
    private static final float f4707u = 0.9166667f;

    /* renamed from: v, reason: collision with root package name */
    private static final float f4708v = 0.010416667f;

    /* renamed from: w, reason: collision with root package name */
    private static final float f4709w = 0.020833334f;

    /* renamed from: x, reason: collision with root package name */
    private static final int f4710x = 61;

    /* renamed from: y, reason: collision with root package name */
    private static final int f4711y = 30;

    /* renamed from: a, reason: collision with root package name */
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public int f4713a;

    /* renamed from: b, reason: collision with root package name */
    Object f4714b;

    /* renamed from: c, reason: collision with root package name */
    @q0
    @c1({c1.a.LIBRARY})
    public byte[] f4715c;

    /* renamed from: d, reason: collision with root package name */
    @q0
    @c1({c1.a.LIBRARY})
    public Parcelable f4716d;

    /* renamed from: e, reason: collision with root package name */
    @c1({c1.a.LIBRARY})
    public int f4717e;

    /* renamed from: f, reason: collision with root package name */
    @c1({c1.a.LIBRARY})
    public int f4718f;

    /* renamed from: g, reason: collision with root package name */
    @q0
    @c1({c1.a.LIBRARY})
    public ColorStateList f4719g;

    /* renamed from: h, reason: collision with root package name */
    PorterDuff.Mode f4720h;

    /* renamed from: i, reason: collision with root package name */
    @q0
    @c1({c1.a.LIBRARY})
    public String f4721i;

    /* renamed from: j, reason: collision with root package name */
    @q0
    @c1({c1.a.LIBRARY})
    public String f4722j;

    @m1
    static final String A = "obj";

    @m1
    static final String B = "int1";

    @m1
    static final String C = "int2";

    @m1
    static final String D = "tint_list";

    @m1
    static final String E = "tint_mode";

    @m1
    static final String F = "string1";

    /* renamed from: z, reason: collision with root package name */
    @m1
    static final String f4712z = "type";

    /* renamed from: k, reason: collision with root package name */
    private static final String f4697k = "IconCompat";
    static final PorterDuff.Mode G = PorterDuff.Mode.SRC_IN;

    @x0(23)
    /* loaded from: classes.dex */
    static class a {
        private a() {
        }

        @q0
        static IconCompat a(@o0 Context context, @o0 Icon icon) {
            int e6 = e(icon);
            if (e6 == 2) {
                String d6 = d(icon);
                try {
                    return IconCompat.r(IconCompat.v(context, d6), d6, c(icon));
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            }
            if (e6 == 4) {
                return IconCompat.n(f(icon));
            }
            if (e6 == 6) {
                return IconCompat.k(f(icon));
            }
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.f4714b = icon;
            return iconCompat;
        }

        static IconCompat b(@o0 Object obj) {
            obj.getClass();
            int e6 = e(obj);
            if (e6 == 2) {
                return IconCompat.r(null, d(obj), c(obj));
            }
            if (e6 == 4) {
                return IconCompat.n(f(obj));
            }
            if (e6 == 6) {
                return IconCompat.k(f(obj));
            }
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.f4714b = obj;
            return iconCompat;
        }

        @d0
        @v
        static int c(@o0 Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return 0;
            }
        }

        @q0
        static String d(@o0 Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }

        static int e(@o0 Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException unused) {
                Objects.toString(obj);
                return -1;
            } catch (NoSuchMethodException unused2) {
                Objects.toString(obj);
                return -1;
            } catch (InvocationTargetException unused3) {
                Objects.toString(obj);
                return -1;
            }
        }

        @q0
        @u
        static Uri f(@o0 Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }

        @u
        static Drawable g(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        @u
        static Icon h(IconCompat iconCompat, Context context) {
            Icon createWithBitmap;
            switch (iconCompat.f4713a) {
                case -1:
                    return (Icon) iconCompat.f4714b;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    createWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f4714b);
                    break;
                case 2:
                    createWithBitmap = Icon.createWithResource(iconCompat.u(), iconCompat.f4717e);
                    break;
                case 3:
                    createWithBitmap = Icon.createWithData((byte[]) iconCompat.f4714b, iconCompat.f4717e, iconCompat.f4718f);
                    break;
                case 4:
                    createWithBitmap = Icon.createWithContentUri((String) iconCompat.f4714b);
                    break;
                case 5:
                    if (Build.VERSION.SDK_INT < 26) {
                        createWithBitmap = Icon.createWithBitmap(IconCompat.i((Bitmap) iconCompat.f4714b, false));
                        break;
                    } else {
                        createWithBitmap = b.b((Bitmap) iconCompat.f4714b);
                        break;
                    }
                case 6:
                    int i5 = Build.VERSION.SDK_INT;
                    if (i5 >= 30) {
                        createWithBitmap = d.a(iconCompat.x());
                        break;
                    } else {
                        if (context == null) {
                            throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.x());
                        }
                        InputStream y5 = iconCompat.y(context);
                        if (y5 == null) {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.x());
                        }
                        if (i5 < 26) {
                            createWithBitmap = Icon.createWithBitmap(IconCompat.i(BitmapFactory.decodeStream(y5), false));
                            break;
                        } else {
                            createWithBitmap = b.b(BitmapFactory.decodeStream(y5));
                            break;
                        }
                    }
            }
            ColorStateList colorStateList = iconCompat.f4719g;
            if (colorStateList != null) {
                createWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f4720h;
            if (mode != IconCompat.G) {
                createWithBitmap.setTintMode(mode);
            }
            return createWithBitmap;
        }
    }

    @x0(26)
    /* loaded from: classes.dex */
    static class b {
        private b() {
        }

        @u
        static Drawable a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        @u
        static Icon b(Bitmap bitmap) {
            Icon createWithAdaptiveBitmap;
            createWithAdaptiveBitmap = Icon.createWithAdaptiveBitmap(bitmap);
            return createWithAdaptiveBitmap;
        }
    }

    @x0(28)
    /* loaded from: classes.dex */
    static class c {
        private c() {
        }

        @u
        static int a(Object obj) {
            int resId;
            resId = ((Icon) obj).getResId();
            return resId;
        }

        @u
        static String b(Object obj) {
            String resPackage;
            resPackage = ((Icon) obj).getResPackage();
            return resPackage;
        }

        @u
        static int c(Object obj) {
            int type;
            type = ((Icon) obj).getType();
            return type;
        }

        @u
        static Uri d(Object obj) {
            Uri uri;
            uri = ((Icon) obj).getUri();
            return uri;
        }
    }

    @x0(30)
    /* loaded from: classes.dex */
    static class d {
        private d() {
        }

        @u
        static Icon a(Uri uri) {
            Icon createWithAdaptiveBitmapContentUri;
            createWithAdaptiveBitmapContentUri = Icon.createWithAdaptiveBitmapContentUri(uri);
            return createWithAdaptiveBitmapContentUri;
        }
    }

    @c1({c1.a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface e {
    }

    @c1({c1.a.LIBRARY})
    public IconCompat() {
        this.f4713a = -1;
        this.f4715c = null;
        this.f4716d = null;
        this.f4717e = 0;
        this.f4718f = 0;
        this.f4719g = null;
        this.f4720h = G;
        this.f4721i = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private Drawable A(Context context) {
        switch (this.f4713a) {
            case 1:
                return new BitmapDrawable(context.getResources(), (Bitmap) this.f4714b);
            case 2:
                String u5 = u();
                if (TextUtils.isEmpty(u5)) {
                    u5 = context.getPackageName();
                }
                try {
                    return androidx.core.content.res.i.g(v(context, u5), this.f4717e, context.getTheme());
                } catch (RuntimeException unused) {
                    String.format("Unable to load resource 0x%08x from pkg=%s", Integer.valueOf(this.f4717e), this.f4714b);
                    break;
                }
            case 3:
                return new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray((byte[]) this.f4714b, this.f4717e, this.f4718f));
            case 4:
                InputStream y5 = y(context);
                if (y5 != null) {
                    return new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(y5));
                }
                return null;
            case 5:
                return new BitmapDrawable(context.getResources(), i((Bitmap) this.f4714b, false));
            case 6:
                InputStream y6 = y(context);
                if (y6 != null) {
                    return Build.VERSION.SDK_INT >= 26 ? b.a(null, new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(y6))) : new BitmapDrawable(context.getResources(), i(BitmapFactory.decodeStream(y6), false));
                }
                return null;
            default:
                return null;
        }
    }

    private static String H(int i5) {
        switch (i5) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    @q0
    public static IconCompat e(@o0 Bundle bundle) {
        int i5 = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i5);
        iconCompat.f4717e = bundle.getInt("int1");
        iconCompat.f4718f = bundle.getInt("int2");
        iconCompat.f4722j = bundle.getString("string1");
        if (bundle.containsKey("tint_list")) {
            iconCompat.f4719g = (ColorStateList) bundle.getParcelable("tint_list");
        }
        if (bundle.containsKey("tint_mode")) {
            iconCompat.f4720h = PorterDuff.Mode.valueOf(bundle.getString("tint_mode"));
        }
        switch (i5) {
            case -1:
            case 1:
            case 5:
                iconCompat.f4714b = bundle.getParcelable("obj");
                return iconCompat;
            case 0:
            default:
                return null;
            case 2:
            case 4:
            case 6:
                iconCompat.f4714b = bundle.getString("obj");
                return iconCompat;
            case 3:
                iconCompat.f4714b = bundle.getByteArray("obj");
                return iconCompat;
        }
    }

    @q0
    @x0(23)
    public static IconCompat f(@o0 Context context, @o0 Icon icon) {
        icon.getClass();
        return a.a(context, icon);
    }

    @q0
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @x0(23)
    public static IconCompat g(@o0 Icon icon) {
        return a.b(icon);
    }

    @q0
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @x0(23)
    public static IconCompat h(@o0 Icon icon) {
        if (a.e(icon) == 2 && a.c(icon) == 0) {
            return null;
        }
        return a.b(icon);
    }

    @m1
    static Bitmap i(Bitmap bitmap, boolean z5) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * f4706t);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f6 = min;
        float f7 = 0.5f * f6;
        float f8 = f4707u * f7;
        if (z5) {
            float f9 = f4708v * f6;
            paint.setColor(0);
            paint.setShadowLayer(f9, 0.0f, f6 * f4709w, 1023410176);
            canvas.drawCircle(f7, f7, f8, paint);
            paint.setShadowLayer(f9, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f7, f7, f8, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(y1.f5758t);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f7, f7, f8, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    @o0
    public static IconCompat j(@o0 Bitmap bitmap) {
        bitmap.getClass();
        IconCompat iconCompat = new IconCompat(5);
        iconCompat.f4714b = bitmap;
        return iconCompat;
    }

    @o0
    public static IconCompat k(@o0 Uri uri) {
        uri.getClass();
        return l(uri.toString());
    }

    @o0
    public static IconCompat l(@o0 String str) {
        str.getClass();
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.f4714b = str;
        return iconCompat;
    }

    @o0
    public static IconCompat m(@o0 Bitmap bitmap) {
        bitmap.getClass();
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f4714b = bitmap;
        return iconCompat;
    }

    @o0
    public static IconCompat n(@o0 Uri uri) {
        uri.getClass();
        return o(uri.toString());
    }

    @o0
    public static IconCompat o(@o0 String str) {
        str.getClass();
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.f4714b = str;
        return iconCompat;
    }

    @o0
    public static IconCompat p(@o0 byte[] bArr, int i5, int i6) {
        bArr.getClass();
        IconCompat iconCompat = new IconCompat(3);
        iconCompat.f4714b = bArr;
        iconCompat.f4717e = i5;
        iconCompat.f4718f = i6;
        return iconCompat;
    }

    @o0
    public static IconCompat q(@o0 Context context, @v int i5) {
        context.getClass();
        return r(context.getResources(), context.getPackageName(), i5);
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @o0
    public static IconCompat r(@q0 Resources resources, @o0 String str, @v int i5) {
        str.getClass();
        if (i5 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f4717e = i5;
        if (resources != null) {
            try {
                iconCompat.f4714b = resources.getResourceName(i5);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f4714b = str;
        }
        iconCompat.f4722j = str;
        return iconCompat;
    }

    static Resources v(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            String.format("Unable to find pkg=%s for icon", str);
            return null;
        }
    }

    @o0
    public IconCompat B(@androidx.annotation.l int i5) {
        return C(ColorStateList.valueOf(i5));
    }

    @o0
    public IconCompat C(@q0 ColorStateList colorStateList) {
        this.f4719g = colorStateList;
        return this;
    }

    @o0
    public IconCompat D(@q0 PorterDuff.Mode mode) {
        this.f4720h = mode;
        return this;
    }

    @o0
    public Bundle E() {
        Bundle bundle = new Bundle();
        switch (this.f4713a) {
            case -1:
                bundle.putParcelable("obj", (Parcelable) this.f4714b);
                break;
            case 0:
            default:
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                bundle.putParcelable("obj", (Bitmap) this.f4714b);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString("obj", (String) this.f4714b);
                break;
            case 3:
                bundle.putByteArray("obj", (byte[]) this.f4714b);
                break;
        }
        bundle.putInt("type", this.f4713a);
        bundle.putInt("int1", this.f4717e);
        bundle.putInt("int2", this.f4718f);
        bundle.putString("string1", this.f4722j);
        ColorStateList colorStateList = this.f4719g;
        if (colorStateList != null) {
            bundle.putParcelable("tint_list", colorStateList);
        }
        PorterDuff.Mode mode = this.f4720h;
        if (mode != G) {
            bundle.putString("tint_mode", mode.name());
        }
        return bundle;
    }

    @o0
    @x0(23)
    @Deprecated
    public Icon F() {
        return G(null);
    }

    @o0
    @x0(23)
    public Icon G(@q0 Context context) {
        return a.h(this, context);
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void a() {
        this.f4720h = PorterDuff.Mode.valueOf(this.f4721i);
        switch (this.f4713a) {
            case -1:
                Parcelable parcelable = this.f4716d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                this.f4714b = parcelable;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f4716d;
                if (parcelable2 != null) {
                    this.f4714b = parcelable2;
                    return;
                }
                byte[] bArr = this.f4715c;
                this.f4714b = bArr;
                this.f4713a = 3;
                this.f4717e = 0;
                this.f4718f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f4715c, Charset.forName("UTF-16"));
                this.f4714b = str;
                if (this.f4713a == 2 && this.f4722j == null) {
                    this.f4722j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f4714b = this.f4715c;
                return;
        }
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void b(boolean z5) {
        this.f4721i = this.f4720h.name();
        switch (this.f4713a) {
            case -1:
                if (z5) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                this.f4716d = (Parcelable) this.f4714b;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (!z5) {
                    this.f4716d = (Parcelable) this.f4714b;
                    return;
                }
                Bitmap bitmap = (Bitmap) this.f4714b;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.f4715c = byteArrayOutputStream.toByteArray();
                return;
            case 2:
                this.f4715c = ((String) this.f4714b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f4715c = (byte[]) this.f4714b;
                return;
            case 4:
            case 6:
                this.f4715c = this.f4714b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void c(@o0 Intent intent, @q0 Drawable drawable, @o0 Context context) {
        Bitmap bitmap;
        d(context);
        int i5 = this.f4713a;
        if (i5 == 1) {
            bitmap = (Bitmap) this.f4714b;
            if (drawable != null) {
                bitmap = bitmap.copy(bitmap.getConfig(), true);
            }
        } else if (i5 == 2) {
            try {
                Context createPackageContext = context.createPackageContext(u(), 0);
                if (drawable == null) {
                    intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(createPackageContext, this.f4717e));
                    return;
                }
                Drawable i6 = androidx.core.content.d.i(createPackageContext, this.f4717e);
                if (i6.getIntrinsicWidth() > 0 && i6.getIntrinsicHeight() > 0) {
                    bitmap = Bitmap.createBitmap(i6.getIntrinsicWidth(), i6.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                    i6.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
                    i6.draw(new Canvas(bitmap));
                }
                int launcherLargeIconSize = ((ActivityManager) createPackageContext.getSystemService("activity")).getLauncherLargeIconSize();
                bitmap = Bitmap.createBitmap(launcherLargeIconSize, launcherLargeIconSize, Bitmap.Config.ARGB_8888);
                i6.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
                i6.draw(new Canvas(bitmap));
            } catch (PackageManager.NameNotFoundException e6) {
                throw new IllegalArgumentException("Can't find package " + this.f4714b, e6);
            }
        } else {
            if (i5 != 5) {
                throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
            }
            bitmap = i((Bitmap) this.f4714b, true);
        }
        if (drawable != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            drawable.setBounds(width / 2, height / 2, width, height);
            drawable.draw(new Canvas(bitmap));
        }
        intent.putExtra("android.intent.extra.shortcut.ICON", bitmap);
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void d(@o0 Context context) {
        Object obj;
        int identifier;
        if (this.f4713a != 2 || (obj = this.f4714b) == null) {
            return;
        }
        String str = (String) obj;
        if (str.contains(":")) {
            String str2 = str.split(":", -1)[1];
            String str3 = str2.split("/", -1)[0];
            String str4 = str2.split("/", -1)[1];
            String str5 = str.split(":", -1)[0];
            if ("0_resource_name_obfuscated".equals(str4) || this.f4717e == (identifier = v(context, u()).getIdentifier(str4, str3, str5))) {
                return;
            }
            this.f4717e = identifier;
        }
    }

    @q0
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public Bitmap s() {
        int i5 = this.f4713a;
        if (i5 == -1) {
            Object obj = this.f4714b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i5 == 1) {
            return (Bitmap) this.f4714b;
        }
        if (i5 == 5) {
            return i((Bitmap) this.f4714b, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    @v
    public int t() {
        int i5 = this.f4713a;
        if (i5 == -1) {
            return a.c(this.f4714b);
        }
        if (i5 == 2) {
            return this.f4717e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    @o0
    public String toString() {
        if (this.f4713a == -1) {
            return String.valueOf(this.f4714b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(H(this.f4713a));
        switch (this.f4713a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f4714b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f4714b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f4722j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(t())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f4717e);
                if (this.f4718f != 0) {
                    sb.append(" off=");
                    sb.append(this.f4718f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f4714b);
                break;
        }
        if (this.f4719g != null) {
            sb.append(" tint=");
            sb.append(this.f4719g);
        }
        if (this.f4720h != G) {
            sb.append(" mode=");
            sb.append(this.f4720h);
        }
        sb.append(")");
        return sb.toString();
    }

    @o0
    public String u() {
        int i5 = this.f4713a;
        if (i5 == -1) {
            return a.d(this.f4714b);
        }
        if (i5 == 2) {
            String str = this.f4722j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f4714b).split(":", -1)[0] : this.f4722j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int w() {
        int i5 = this.f4713a;
        return i5 == -1 ? a.e(this.f4714b) : i5;
    }

    @o0
    public Uri x() {
        int i5 = this.f4713a;
        if (i5 == -1) {
            return a.f(this.f4714b);
        }
        if (i5 == 4 || i5 == 6) {
            return Uri.parse((String) this.f4714b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    @q0
    @c1({c1.a.LIBRARY_GROUP})
    public InputStream y(@o0 Context context) {
        Uri x5 = x();
        String scheme = x5.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(x5);
            } catch (Exception unused) {
                x5.toString();
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.f4714b));
        } catch (FileNotFoundException unused2) {
            x5.toString();
            return null;
        }
    }

    @q0
    public Drawable z(@o0 Context context) {
        d(context);
        return a.g(G(context), context);
    }

    IconCompat(int i5) {
        this.f4715c = null;
        this.f4716d = null;
        this.f4717e = 0;
        this.f4718f = 0;
        this.f4719g = null;
        this.f4720h = G;
        this.f4721i = null;
        this.f4713a = i5;
    }
}
