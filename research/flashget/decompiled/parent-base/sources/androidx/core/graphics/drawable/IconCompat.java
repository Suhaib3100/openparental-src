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
import androidx.annotation.v;
import androidx.annotation.x0;
import androidx.core.view.x1;
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
    public static final int f26186l = -1;

    /* renamed from: m, reason: collision with root package name */
    public static final int f26187m = 1;

    /* renamed from: n, reason: collision with root package name */
    public static final int f26188n = 2;

    /* renamed from: o, reason: collision with root package name */
    public static final int f26189o = 3;

    /* renamed from: p, reason: collision with root package name */
    public static final int f26190p = 4;

    /* renamed from: q, reason: collision with root package name */
    public static final int f26191q = 5;

    /* renamed from: r, reason: collision with root package name */
    public static final int f26192r = 6;

    /* renamed from: s, reason: collision with root package name */
    private static final float f26193s = 0.25f;

    /* renamed from: t, reason: collision with root package name */
    private static final float f26194t = 0.6666667f;

    /* renamed from: u, reason: collision with root package name */
    private static final float f26195u = 0.9166667f;

    /* renamed from: v, reason: collision with root package name */
    private static final float f26196v = 0.010416667f;

    /* renamed from: w, reason: collision with root package name */
    private static final float f26197w = 0.020833334f;

    /* renamed from: x, reason: collision with root package name */
    private static final int f26198x = 61;

    /* renamed from: y, reason: collision with root package name */
    private static final int f26199y = 30;

    /* renamed from: a, reason: collision with root package name */
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public int f26201a;

    /* renamed from: b, reason: collision with root package name */
    Object f26202b;

    /* renamed from: c, reason: collision with root package name */
    @q0
    @c1({c1.a.LIBRARY})
    public byte[] f26203c;

    /* renamed from: d, reason: collision with root package name */
    @q0
    @c1({c1.a.LIBRARY})
    public Parcelable f26204d;

    /* renamed from: e, reason: collision with root package name */
    @c1({c1.a.LIBRARY})
    public int f26205e;

    /* renamed from: f, reason: collision with root package name */
    @c1({c1.a.LIBRARY})
    public int f26206f;

    /* renamed from: g, reason: collision with root package name */
    @q0
    @c1({c1.a.LIBRARY})
    public ColorStateList f26207g;

    /* renamed from: h, reason: collision with root package name */
    PorterDuff.Mode f26208h;

    /* renamed from: i, reason: collision with root package name */
    @q0
    @c1({c1.a.LIBRARY})
    public String f26209i;

    /* renamed from: j, reason: collision with root package name */
    @q0
    @c1({c1.a.LIBRARY})
    public String f26210j;

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
    static final String f26200z = "type";

    /* renamed from: k, reason: collision with root package name */
    private static final String f26185k = "IconCompat";
    static final PorterDuff.Mode G = PorterDuff.Mode.SRC_IN;

    @x0(23)
    static class a {
        private a() {
        }

        @q0
        static IconCompat a(@o0 Context context, @o0 Icon icon) {
            int e4 = e(icon);
            if (e4 == 2) {
                String d5 = d(icon);
                try {
                    return IconCompat.w(IconCompat.A(context, d5), d5, c(icon));
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            }
            if (e4 == 4) {
                return IconCompat.s(f(icon));
            }
            if (e4 == 6) {
                return IconCompat.p(f(icon));
            }
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.f26202b = icon;
            return iconCompat;
        }

        static IconCompat b(@o0 Object obj) {
            obj.getClass();
            int e4 = e(obj);
            if (e4 == 2) {
                return IconCompat.w(null, d(obj), c(obj));
            }
            if (e4 == 4) {
                return IconCompat.s(f(obj));
            }
            if (e4 == 6) {
                return IconCompat.p(f(obj));
            }
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.f26202b = obj;
            return iconCompat;
        }

        @d0
        @v
        static int c(@o0 Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
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
                return (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }

        static int e(@o0 Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
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
        static Uri f(@o0 Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }

        static Drawable g(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        static Icon h(IconCompat iconCompat, Context context) {
            Icon createWithBitmap;
            switch (iconCompat.f26201a) {
                case -1:
                    return (Icon) iconCompat.f26202b;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    createWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f26202b);
                    break;
                case 2:
                    createWithBitmap = Icon.createWithResource(iconCompat.z(), iconCompat.f26205e);
                    break;
                case 3:
                    createWithBitmap = Icon.createWithData((byte[]) iconCompat.f26202b, iconCompat.f26205e, iconCompat.f26206f);
                    break;
                case 4:
                    createWithBitmap = Icon.createWithContentUri((String) iconCompat.f26202b);
                    break;
                case 5:
                    if (Build.VERSION.SDK_INT < 26) {
                        createWithBitmap = Icon.createWithBitmap(IconCompat.n((Bitmap) iconCompat.f26202b, false));
                        break;
                    } else {
                        createWithBitmap = b.b((Bitmap) iconCompat.f26202b);
                        break;
                    }
                case 6:
                    int i4 = Build.VERSION.SDK_INT;
                    if (i4 >= 30) {
                        createWithBitmap = d.a(iconCompat.C());
                        break;
                    } else {
                        if (context == null) {
                            throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.C());
                        }
                        InputStream D = iconCompat.D(context);
                        if (D == null) {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.C());
                        }
                        if (i4 < 26) {
                            createWithBitmap = Icon.createWithBitmap(IconCompat.n(BitmapFactory.decodeStream(D), false));
                            break;
                        } else {
                            createWithBitmap = b.b(BitmapFactory.decodeStream(D));
                            break;
                        }
                    }
            }
            ColorStateList colorStateList = iconCompat.f26207g;
            if (colorStateList != null) {
                createWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f26208h;
            if (mode != IconCompat.G) {
                createWithBitmap.setTintMode(mode);
            }
            return createWithBitmap;
        }
    }

    @x0(26)
    static class b {
        private b() {
        }

        static Drawable a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        static Icon b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    @x0(28)
    static class c {
        private c() {
        }

        static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    @x0(30)
    static class d {
        private d() {
        }

        static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    @c1({c1.a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    @c1({c1.a.LIBRARY})
    public IconCompat() {
        this.f26201a = -1;
        this.f26203c = null;
        this.f26204d = null;
        this.f26205e = 0;
        this.f26206f = 0;
        this.f26207g = null;
        this.f26208h = G;
        this.f26209i = null;
    }

    static Resources A(Context context, String str) {
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private Drawable F(Context context) {
        switch (this.f26201a) {
            case 1:
                return new BitmapDrawable(context.getResources(), (Bitmap) this.f26202b);
            case 2:
                String z4 = z();
                if (TextUtils.isEmpty(z4)) {
                    z4 = context.getPackageName();
                }
                try {
                    return androidx.core.content.res.i.g(A(context, z4), this.f26205e, context.getTheme());
                } catch (RuntimeException unused) {
                    String.format("Unable to load resource 0x%08x from pkg=%s", Integer.valueOf(this.f26205e), this.f26202b);
                    break;
                }
            case 3:
                return new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray((byte[]) this.f26202b, this.f26205e, this.f26206f));
            case 4:
                InputStream D2 = D(context);
                if (D2 != null) {
                    return new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(D2));
                }
                return null;
            case 5:
                return new BitmapDrawable(context.getResources(), n((Bitmap) this.f26202b, false));
            case 6:
                InputStream D3 = D(context);
                if (D3 != null) {
                    return Build.VERSION.SDK_INT >= 26 ? b.a(null, new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(D3))) : new BitmapDrawable(context.getResources(), n(BitmapFactory.decodeStream(D3), false));
                }
                return null;
            default:
                return null;
        }
    }

    private static String L(int i4) {
        switch (i4) {
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
    public static IconCompat j(@o0 Bundle bundle) {
        int i4 = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i4);
        iconCompat.f26205e = bundle.getInt("int1");
        iconCompat.f26206f = bundle.getInt("int2");
        iconCompat.f26210j = bundle.getString("string1");
        if (bundle.containsKey("tint_list")) {
            iconCompat.f26207g = (ColorStateList) bundle.getParcelable("tint_list");
        }
        if (bundle.containsKey("tint_mode")) {
            iconCompat.f26208h = PorterDuff.Mode.valueOf(bundle.getString("tint_mode"));
        }
        switch (i4) {
            case -1:
            case 1:
            case 5:
                iconCompat.f26202b = bundle.getParcelable("obj");
                return iconCompat;
            case 0:
            default:
                return null;
            case 2:
            case 4:
            case 6:
                iconCompat.f26202b = bundle.getString("obj");
                return iconCompat;
            case 3:
                iconCompat.f26202b = bundle.getByteArray("obj");
                return iconCompat;
        }
    }

    @q0
    @x0(23)
    public static IconCompat k(@o0 Context context, @o0 Icon icon) {
        icon.getClass();
        return a.a(context, icon);
    }

    @q0
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @x0(23)
    public static IconCompat l(@o0 Icon icon) {
        return a.b(icon);
    }

    @q0
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @x0(23)
    public static IconCompat m(@o0 Icon icon) {
        if (a.e(icon) == 2 && a.c(icon) == 0) {
            return null;
        }
        return a.b(icon);
    }

    @m1
    static Bitmap n(Bitmap bitmap, boolean z4) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * f26194t);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f4 = min;
        float f5 = 0.5f * f4;
        float f6 = f26195u * f5;
        if (z4) {
            float f7 = f26196v * f4;
            paint.setColor(0);
            paint.setShadowLayer(f7, 0.0f, f4 * f26197w, 1023410176);
            canvas.drawCircle(f5, f5, f6, paint);
            paint.setShadowLayer(f7, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f5, f5, f6, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(x1.f27484y);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f5, f5, f6, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    @o0
    public static IconCompat o(@o0 Bitmap bitmap) {
        bitmap.getClass();
        IconCompat iconCompat = new IconCompat(5);
        iconCompat.f26202b = bitmap;
        return iconCompat;
    }

    @o0
    public static IconCompat p(@o0 Uri uri) {
        uri.getClass();
        return q(uri.toString());
    }

    @o0
    public static IconCompat q(@o0 String str) {
        str.getClass();
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.f26202b = str;
        return iconCompat;
    }

    @o0
    public static IconCompat r(@o0 Bitmap bitmap) {
        bitmap.getClass();
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f26202b = bitmap;
        return iconCompat;
    }

    @o0
    public static IconCompat s(@o0 Uri uri) {
        uri.getClass();
        return t(uri.toString());
    }

    @o0
    public static IconCompat t(@o0 String str) {
        str.getClass();
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.f26202b = str;
        return iconCompat;
    }

    @o0
    public static IconCompat u(@o0 byte[] bArr, int i4, int i5) {
        bArr.getClass();
        IconCompat iconCompat = new IconCompat(3);
        iconCompat.f26202b = bArr;
        iconCompat.f26205e = i4;
        iconCompat.f26206f = i5;
        return iconCompat;
    }

    @o0
    public static IconCompat v(@o0 Context context, @v int i4) {
        context.getClass();
        return w(context.getResources(), context.getPackageName(), i4);
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @o0
    public static IconCompat w(@q0 Resources resources, @o0 String str, @v int i4) {
        str.getClass();
        if (i4 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f26205e = i4;
        if (resources != null) {
            try {
                iconCompat.f26202b = resources.getResourceName(i4);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f26202b = str;
        }
        iconCompat.f26210j = str;
        return iconCompat;
    }

    public int B() {
        int i4 = this.f26201a;
        return i4 == -1 ? a.e(this.f26202b) : i4;
    }

    @o0
    public Uri C() {
        int i4 = this.f26201a;
        if (i4 == -1) {
            return a.f(this.f26202b);
        }
        if (i4 == 4 || i4 == 6) {
            return Uri.parse((String) this.f26202b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    @q0
    @c1({c1.a.LIBRARY_GROUP})
    public InputStream D(@o0 Context context) {
        Uri C2 = C();
        String scheme = C2.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(C2);
            } catch (Exception unused) {
                C2.toString();
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.f26202b));
        } catch (FileNotFoundException unused2) {
            C2.toString();
            return null;
        }
    }

    @q0
    public Drawable E(@o0 Context context) {
        i(context);
        return K(context).loadDrawable(context);
    }

    @o0
    public IconCompat G(@androidx.annotation.l int i4) {
        return H(ColorStateList.valueOf(i4));
    }

    @o0
    public IconCompat H(@q0 ColorStateList colorStateList) {
        this.f26207g = colorStateList;
        return this;
    }

    @o0
    public IconCompat I(@q0 PorterDuff.Mode mode) {
        this.f26208h = mode;
        return this;
    }

    @o0
    @x0(23)
    @Deprecated
    public Icon J() {
        return K(null);
    }

    @o0
    @x0(23)
    public Icon K(@q0 Context context) {
        return a.h(this, context);
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void f() {
        this.f26208h = PorterDuff.Mode.valueOf(this.f26209i);
        switch (this.f26201a) {
            case -1:
                Parcelable parcelable = this.f26204d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                this.f26202b = parcelable;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f26204d;
                if (parcelable2 != null) {
                    this.f26202b = parcelable2;
                    return;
                }
                byte[] bArr = this.f26203c;
                this.f26202b = bArr;
                this.f26201a = 3;
                this.f26205e = 0;
                this.f26206f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f26203c, Charset.forName("UTF-16"));
                this.f26202b = str;
                if (this.f26201a == 2 && this.f26210j == null) {
                    this.f26210j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f26202b = this.f26203c;
                return;
        }
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void g(boolean z4) {
        this.f26209i = this.f26208h.name();
        switch (this.f26201a) {
            case -1:
                if (z4) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                this.f26204d = (Parcelable) this.f26202b;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (!z4) {
                    this.f26204d = (Parcelable) this.f26202b;
                    return;
                }
                Bitmap bitmap = (Bitmap) this.f26202b;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.f26203c = byteArrayOutputStream.toByteArray();
                return;
            case 2:
                this.f26203c = ((String) this.f26202b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f26203c = (byte[]) this.f26202b;
                return;
            case 4:
            case 6:
                this.f26203c = this.f26202b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void h(@o0 Intent intent, @q0 Drawable drawable, @o0 Context context) {
        Bitmap bitmap;
        i(context);
        int i4 = this.f26201a;
        if (i4 == 1) {
            bitmap = (Bitmap) this.f26202b;
            if (drawable != null) {
                bitmap = bitmap.copy(bitmap.getConfig(), true);
            }
        } else if (i4 == 2) {
            try {
                Context createPackageContext = context.createPackageContext(z(), 0);
                if (drawable == null) {
                    intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(createPackageContext, this.f26205e));
                    return;
                }
                Drawable drawable2 = androidx.core.content.d.getDrawable(createPackageContext, this.f26205e);
                if (drawable2.getIntrinsicWidth() > 0 && drawable2.getIntrinsicHeight() > 0) {
                    bitmap = Bitmap.createBitmap(drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                    drawable2.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
                    drawable2.draw(new Canvas(bitmap));
                }
                int launcherLargeIconSize = ((ActivityManager) createPackageContext.getSystemService("activity")).getLauncherLargeIconSize();
                bitmap = Bitmap.createBitmap(launcherLargeIconSize, launcherLargeIconSize, Bitmap.Config.ARGB_8888);
                drawable2.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
                drawable2.draw(new Canvas(bitmap));
            } catch (PackageManager.NameNotFoundException e4) {
                throw new IllegalArgumentException("Can't find package " + this.f26202b, e4);
            }
        } else {
            if (i4 != 5) {
                throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
            }
            bitmap = n((Bitmap) this.f26202b, true);
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
    public void i(@o0 Context context) {
        Object obj;
        int identifier;
        if (this.f26201a != 2 || (obj = this.f26202b) == null) {
            return;
        }
        String str = (String) obj;
        if (str.contains(":")) {
            String str2 = str.split(":", -1)[1];
            String str3 = str2.split("/", -1)[0];
            String str4 = str2.split("/", -1)[1];
            String str5 = str.split(":", -1)[0];
            if ("0_resource_name_obfuscated".equals(str4) || this.f26205e == (identifier = A(context, z()).getIdentifier(str4, str3, str5))) {
                return;
            }
            this.f26205e = identifier;
        }
    }

    @o0
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        switch (this.f26201a) {
            case -1:
                bundle.putParcelable("obj", (Parcelable) this.f26202b);
                break;
            case 0:
            default:
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                bundle.putParcelable("obj", (Bitmap) this.f26202b);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString("obj", (String) this.f26202b);
                break;
            case 3:
                bundle.putByteArray("obj", (byte[]) this.f26202b);
                break;
        }
        bundle.putInt("type", this.f26201a);
        bundle.putInt("int1", this.f26205e);
        bundle.putInt("int2", this.f26206f);
        bundle.putString("string1", this.f26210j);
        ColorStateList colorStateList = this.f26207g;
        if (colorStateList != null) {
            bundle.putParcelable("tint_list", colorStateList);
        }
        PorterDuff.Mode mode = this.f26208h;
        if (mode != G) {
            bundle.putString("tint_mode", mode.name());
        }
        return bundle;
    }

    @o0
    public String toString() {
        if (this.f26201a == -1) {
            return String.valueOf(this.f26202b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(L(this.f26201a));
        switch (this.f26201a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f26202b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f26202b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f26210j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(y())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f26205e);
                if (this.f26206f != 0) {
                    sb.append(" off=");
                    sb.append(this.f26206f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f26202b);
                break;
        }
        if (this.f26207g != null) {
            sb.append(" tint=");
            sb.append(this.f26207g);
        }
        if (this.f26208h != G) {
            sb.append(" mode=");
            sb.append(this.f26208h);
        }
        sb.append(")");
        return sb.toString();
    }

    @q0
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public Bitmap x() {
        int i4 = this.f26201a;
        if (i4 == -1) {
            Object obj = this.f26202b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i4 == 1) {
            return (Bitmap) this.f26202b;
        }
        if (i4 == 5) {
            return n((Bitmap) this.f26202b, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    @v
    public int y() {
        int i4 = this.f26201a;
        if (i4 == -1) {
            return a.c(this.f26202b);
        }
        if (i4 == 2) {
            return this.f26205e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    @o0
    public String z() {
        int i4 = this.f26201a;
        if (i4 == -1) {
            return a.d(this.f26202b);
        }
        if (i4 == 2) {
            String str = this.f26210j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f26202b).split(":", -1)[0] : this.f26210j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    IconCompat(int i4) {
        this.f26203c = null;
        this.f26204d = null;
        this.f26205e = 0;
        this.f26206f = 0;
        this.f26207g = null;
        this.f26208h = G;
        this.f26209i = null;
        this.f26201a = i4;
    }
}
