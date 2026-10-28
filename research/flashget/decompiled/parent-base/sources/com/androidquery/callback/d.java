package com.androidquery.callback;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.media.ExifInterface;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import com.androidquery.util.g;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import org.apache.http.HttpHost;

/* compiled from: BitmapAjaxCallback.java */
/* loaded from: classes3.dex */
public class d extends a<Bitmap, d> {
    private static int X2 = 20;
    private static int Y2 = 20;
    private static int Z2 = 2500;

    /* renamed from: a3, reason: collision with root package name */
    private static int f41157a3 = 160000;

    /* renamed from: b3, reason: collision with root package name */
    private static int f41158b3 = 1000000;

    /* renamed from: c3, reason: collision with root package name */
    private static boolean f41159c3 = false;

    /* renamed from: d3, reason: collision with root package name */
    private static Map<String, Bitmap> f41160d3 = null;

    /* renamed from: e3, reason: collision with root package name */
    private static Map<String, Bitmap> f41161e3 = null;

    /* renamed from: f3, reason: collision with root package name */
    private static Map<String, Bitmap> f41162f3 = null;

    /* renamed from: g3, reason: collision with root package name */
    private static HashMap<String, WeakHashMap<ImageView, d>> f41163g3 = new HashMap<>();

    /* renamed from: h3, reason: collision with root package name */
    private static Bitmap f41164h3 = null;

    /* renamed from: i3, reason: collision with root package name */
    private static Bitmap f41165i3 = null;

    /* renamed from: j3, reason: collision with root package name */
    private static final int f41166j3 = 300;
    private int L2;
    private int M2;
    private File N2;
    private Bitmap O2;
    private int P2;
    private Bitmap Q2;
    private float R2;
    private int S2;
    private boolean T2 = true;
    private float U2 = Float.MAX_VALUE;
    private WeakReference<ImageView> V1;
    private boolean V2;
    private boolean W2;

    static {
        Bitmap.Config config = Bitmap.Config.ALPHA_8;
        f41164h3 = Bitmap.createBitmap(1, 1, config);
        f41165i3 = Bitmap.createBitmap(1, 1, config);
    }

    public d() {
        b1(Bitmap.class).p0(true).B(true).d1("");
    }

    private static Bitmap C1(View view, Bitmap bitmap, int i4) {
        if (bitmap != null && bitmap.getWidth() == 1 && bitmap.getHeight() == 1 && bitmap != f41164h3) {
            bitmap = null;
        }
        if (bitmap != null) {
            view.setVisibility(0);
        } else if (i4 == -2) {
            view.setVisibility(8);
        } else if (i4 == -1) {
            view.setVisibility(4);
        }
        return bitmap;
    }

    private static Map<String, Bitmap> D1() {
        if (f41161e3 == null) {
            f41161e3 = Collections.synchronizedMap(new com.androidquery.util.b(Y2, f41157a3, f41158b3));
        }
        return f41161e3;
    }

    public static Bitmap E1() {
        return f41164h3;
    }

    private Bitmap F1() {
        ImageView imageView = this.V1.get();
        if (imageView == null) {
            return null;
        }
        String num = Integer.toString(this.M2);
        Bitmap q02 = q0(num);
        if (q02 != null) {
            return q02;
        }
        Bitmap decodeResource = BitmapFactory.decodeResource(imageView.getResources(), this.M2);
        if (decodeResource == null) {
            return decodeResource;
        }
        r0(num, decodeResource);
        return decodeResource;
    }

    private static Map<String, Bitmap> G1() {
        if (f41162f3 == null) {
            f41162f3 = Collections.synchronizedMap(new com.androidquery.util.b(100, f41157a3, 250000));
        }
        return f41162f3;
    }

    private static String H1(String str, int i4, int i5) {
        String s4 = ProtectedSandApp.s("ݳ");
        if (i4 > 0) {
            str = str + s4 + i4;
        }
        if (i5 <= 0) {
            return str;
        }
        return str + s4 + i5;
    }

    public static Bitmap I1(Context context, int i4) {
        String num = Integer.toString(i4);
        Bitmap T1 = T1(num, 0, 0);
        if (T1 == null && (T1 = BitmapFactory.decodeResource(context.getResources(), i4)) != null) {
            U1(num, 0, 0, T1, false);
        }
        return T1;
    }

    public static Bitmap J1(String str, int i4) {
        return T1(str, i4, 0);
    }

    public static Bitmap K1(String str, byte[] bArr, int i4, boolean z4, int i5) {
        return L1(str, bArr, i4, z4, i5, false);
    }

    public static Bitmap L1(String str, byte[] bArr, int i4, boolean z4, int i5, boolean z5) {
        BitmapFactory.Options options;
        Bitmap bitmap = null;
        if (str == null && bArr == null) {
            return null;
        }
        if (i4 > 0) {
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inJustDecodeBounds = true;
            w1(str, bArr, options2, z5);
            int i6 = options2.outWidth;
            if (!z4) {
                i6 = Math.max(i6, options2.outHeight);
            }
            int c22 = c2(i6, i4);
            options = new BitmapFactory.Options();
            options.inSampleSize = c22;
        } else {
            options = null;
        }
        try {
            bitmap = w1(str, bArr, options, z5);
        } catch (OutOfMemoryError e4) {
            u1();
            com.androidquery.util.a.R(e4);
        }
        return i5 > 0 ? N1(bitmap, i5) : bitmap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Matrix M1(int r6) {
        /*
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r1 = 1127481344(0x43340000, float:180.0)
            r2 = 1119092736(0x42b40000, float:90.0)
            r3 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            switch(r6) {
                case 2: goto L34;
                case 3: goto L30;
                case 4: goto L29;
                case 5: goto L22;
                case 6: goto L1e;
                case 7: goto L17;
                case 8: goto L13;
                default: goto L12;
            }
        L12:
            goto L37
        L13:
            r0.setRotate(r3)
            goto L37
        L17:
            r0.setRotate(r3)
            r0.postScale(r5, r4)
            goto L37
        L1e:
            r0.setRotate(r2)
            goto L37
        L22:
            r0.setRotate(r2)
            r0.postScale(r5, r4)
            goto L37
        L29:
            r0.setRotate(r1)
            r0.postScale(r5, r4)
            goto L37
        L30:
            r0.setRotate(r1)
            goto L37
        L34:
            r0.setScale(r5, r4)
        L37:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.androidquery.callback.d.M1(int):android.graphics.Matrix");
    }

    private static Bitmap N1(Bitmap bitmap, int i4) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(rect);
        float f4 = i4;
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-12434878);
        canvas.drawRoundRect(rectF, f4, f4, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return createBitmap;
    }

    private static Map<String, Bitmap> O1() {
        if (f41160d3 == null) {
            f41160d3 = Collections.synchronizedMap(new com.androidquery.util.b(X2, Z2, 250000));
        }
        return f41160d3;
    }

    public static boolean Q1(String str) {
        return D1().containsKey(str) || O1().containsKey(str) || G1().containsKey(str);
    }

    private static Drawable R1(ImageView imageView, Bitmap bitmap, float f4, float f5) {
        return f4 > 0.0f ? new g(imageView.getResources(), bitmap, imageView, f4, f5) : new BitmapDrawable(imageView.getResources(), bitmap);
    }

    private static Bitmap T1(String str, int i4, int i5) {
        String H1 = H1(str, i4, i5);
        Bitmap bitmap = D1().get(H1);
        if (bitmap == null) {
            bitmap = O1().get(H1);
        }
        if (bitmap != null) {
            return bitmap;
        }
        Bitmap bitmap2 = G1().get(H1);
        if (bitmap2 == null || a.R() != 200) {
            return bitmap2;
        }
        f41162f3 = null;
        return null;
    }

    private static void U1(String str, int i4, int i5, Bitmap bitmap, boolean z4) {
        if (bitmap == null) {
            return;
        }
        Map<String, Bitmap> G1 = z4 ? G1() : bitmap.getHeight() * bitmap.getWidth() <= Z2 ? O1() : D1();
        if (i4 <= 0 && i5 <= 0) {
            G1.put(str, bitmap);
            return;
        }
        G1.put(H1(str, i4, i5), bitmap);
        if (G1.containsKey(str)) {
            return;
        }
        G1.put(str, null);
    }

    private void X1(String str, ImageView imageView) {
        if (str.equals(imageView.getTag(com.androidquery.util.d.f41256v)) && this.Q2 == null) {
            return;
        }
        imageView.setTag(com.androidquery.util.d.f41256v, str);
        if (this.Q2 == null || k(imageView.getContext())) {
            d2(str, imageView, null, true);
        } else {
            d2(str, imageView, this.Q2, true);
        }
    }

    private static Bitmap Z1(String str, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        int i4 = 1;
        try {
            i4 = new ExifInterface(str).getAttributeInt(ProtectedSandApp.s("ݴ"), 1);
        } catch (Exception e4) {
            com.androidquery.util.a.k(e4);
        }
        if (i4 <= 0) {
            return bitmap;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), M1(i4), true);
        StringBuilder sb = new StringBuilder();
        sb.append(bitmap.getWidth());
        String s4 = ProtectedSandApp.s("ݵ");
        sb.append(s4);
        sb.append(bitmap.getHeight());
        com.androidquery.util.a.j(ProtectedSandApp.s("ݶ"), sb.toString());
        com.androidquery.util.a.j(ProtectedSandApp.s("ݷ"), createBitmap.getWidth() + s4 + createBitmap.getHeight());
        if (bitmap != createBitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    private static int c2(int i4, int i5) {
        int i6 = 1;
        for (int i7 = 0; i7 < 10 && i4 >= i5 * 2; i7++) {
            i4 /= 2;
            i6 *= 2;
        }
        return i6;
    }

    private void d2(String str, ImageView imageView, Bitmap bitmap, boolean z4) {
        if (bitmap == null) {
            imageView.setImageDrawable(null);
            return;
        }
        if (z4) {
            imageView.setImageDrawable(R1(imageView, bitmap, this.R2, this.U2));
            return;
        }
        c cVar = this.f41119r;
        if (cVar != null) {
            e2(imageView, bitmap, this.Q2, this.M2, this.P2, this.R2, this.U2, cVar.z());
        }
    }

    private static void e2(ImageView imageView, Bitmap bitmap, Bitmap bitmap2, int i4, int i5, float f4, float f5, int i6) {
        Animation loadAnimation;
        Bitmap C1 = C1(imageView, bitmap, i4);
        if (C1 == null) {
            imageView.setImageBitmap(null);
            return;
        }
        Drawable R1 = R1(imageView, C1, f4, f5);
        if (!y1(i5, i6)) {
            if (i5 > 0) {
                loadAnimation = AnimationUtils.loadAnimation(imageView.getContext(), i5);
            }
            loadAnimation = null;
        } else if (bitmap2 == null) {
            loadAnimation = new AlphaAnimation(0.0f, 1.0f);
            loadAnimation.setInterpolator(new DecelerateInterpolator());
            loadAnimation.setDuration(300L);
        } else {
            TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{R1(imageView, bitmap2, f4, f5), R1});
            transitionDrawable.setCrossFadeEnabled(true);
            transitionDrawable.startTransition(300);
            R1 = transitionDrawable;
            loadAnimation = null;
        }
        imageView.setImageDrawable(R1);
        if (loadAnimation == null) {
            imageView.setAnimation(null);
        } else {
            loadAnimation.setStartTime(AnimationUtils.currentAnimationTimeMillis());
            imageView.startAnimation(loadAnimation);
        }
    }

    public static void f2(int i4) {
        Y2 = i4;
        u1();
    }

    public static void g2(boolean z4) {
        f41159c3 = z4;
    }

    public static void h2(int i4) {
        X2 = i4;
        u1();
    }

    public static void i2(int i4) {
        f41158b3 = i4;
        u1();
    }

    public static void j2(int i4) {
        f41157a3 = i4;
        u1();
    }

    private void k1(String str, ImageView imageView) {
        WeakHashMap<ImageView, d> weakHashMap = f41163g3.get(str);
        if (weakHashMap != null) {
            weakHashMap.put(imageView, this);
        } else {
            if (!f41163g3.containsKey(str)) {
                f41163g3.put(str, null);
                return;
            }
            WeakHashMap<ImageView, d> weakHashMap2 = new WeakHashMap<>();
            weakHashMap2.put(imageView, this);
            f41163g3.put(str, weakHashMap2);
        }
    }

    public static void k2(int i4) {
        Z2 = i4;
        u1();
    }

    public static void n1(Activity activity, Context context, ImageView imageView, String str, Object obj, com.androidquery.auth.a aVar, e eVar, HttpHost httpHost, String str2) {
        o1(activity, context, imageView, str, eVar.f41167a, eVar.f41168b, eVar.f41171e, eVar.f41172f, eVar.f41169c, eVar.f41173g, eVar.f41174h, eVar.f41176j, obj, aVar, eVar.f41170d, eVar.f41175i, httpHost, str2);
    }

    public static void o1(Activity activity, Context context, ImageView imageView, String str, boolean z4, boolean z5, int i4, int i5, Bitmap bitmap, int i6, float f4, float f5, Object obj, com.androidquery.auth.a aVar, int i7, int i10, HttpHost httpHost, String str2) {
        Bitmap T1 = z4 ? T1(str, i4, i10) : null;
        if (T1 != null) {
            imageView.setTag(com.androidquery.util.d.f41256v, str);
            com.androidquery.util.c.E(obj, str, false);
            e2(imageView, T1, bitmap, i5, i6, f4, f5, 4);
            return;
        }
        d dVar = new d();
        dVar.d1(str).P1(imageView).p0(z4).B(z5).m2(i4).z1(i5).W1(bitmap).m1(i6).Y1(f4).l1(f5).I0(obj).h(aVar).E0(i7).b2(i10).w0(str2);
        if (httpHost != null) {
            dVar.J0(httpHost.getHostName(), httpHost.getPort());
        }
        if (activity != null) {
            dVar.e(activity);
        } else {
            dVar.f(context);
        }
    }

    private Bitmap q1(String str, byte[] bArr) {
        return L1(str, bArr, this.L2, this.T2, this.S2, this.W2);
    }

    private void t1(d dVar, String str, ImageView imageView, Bitmap bitmap, c cVar) {
        if (imageView == null || dVar == null) {
            return;
        }
        if (str.equals(imageView.getTag(com.androidquery.util.d.f41256v))) {
            dVar.s1(str, imageView, bitmap, cVar);
        }
        dVar.U0(false);
    }

    public static void u1() {
        f41161e3 = null;
        f41160d3 = null;
        f41162f3 = null;
    }

    protected static void v1() {
        f41163g3.clear();
    }

    private static Bitmap w1(String str, byte[] bArr, BitmapFactory.Options options, boolean z4) {
        Bitmap x12 = str != null ? x1(str, options, z4) : bArr != null ? BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options) : null;
        if (x12 == null && options != null && !options.inJustDecodeBounds) {
            com.androidquery.util.a.j(ProtectedSandApp.s("ݸ"), str);
        }
        return x12;
    }

    private static Bitmap x1(String str, BitmapFactory.Options options, boolean z4) {
        Bitmap bitmap;
        FileInputStream fileInputStream;
        if (options == null) {
            options = new BitmapFactory.Options();
        }
        options.inInputShareable = true;
        options.inPurgeable = true;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(str);
            } catch (IOException e4) {
                e = e4;
                bitmap = null;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileInputStream.getFD(), null, options);
            if (decodeFileDescriptor != null && z4) {
                decodeFileDescriptor = Z1(str, decodeFileDescriptor);
            }
            com.androidquery.util.a.f(fileInputStream);
            return decodeFileDescriptor;
        } catch (IOException e5) {
            e = e5;
            bitmap = null;
            fileInputStream2 = fileInputStream;
            com.androidquery.util.a.R(e);
            com.androidquery.util.a.f(fileInputStream2);
            return bitmap;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            com.androidquery.util.a.f(fileInputStream2);
            throw th;
        }
    }

    private static boolean y1(int i4, int i5) {
        if (i4 != -3) {
            if (i4 != -2) {
                return i4 == -1;
            }
        } else if (i5 == 3) {
            return true;
        }
        return i5 == 1;
    }

    public d A1(File file) {
        this.N2 = file;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.androidquery.callback.a
    /* renamed from: B1, reason: merged with bridge method [inline-methods] */
    public Bitmap C(String str, File file, c cVar) {
        return q1(file.getAbsolutePath(), null);
    }

    public d P1(ImageView imageView) {
        this.V1 = new WeakReference<>(imageView);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.androidquery.callback.a
    /* renamed from: S1, reason: merged with bridge method [inline-methods] */
    public Bitmap q0(String str) {
        Bitmap bitmap = this.O2;
        if (bitmap != null) {
            return bitmap;
        }
        if (this.f41121t) {
            return T1(str, this.L2, this.S2);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.androidquery.callback.a
    /* renamed from: V1, reason: merged with bridge method [inline-methods] */
    public void r0(String str, Bitmap bitmap) {
        U1(str, this.L2, this.S2, bitmap, this.V2);
    }

    public d W1(Bitmap bitmap) {
        this.Q2 = bitmap;
        return this;
    }

    public d Y1(float f4) {
        this.R2 = f4;
        return this;
    }

    public d a2(boolean z4) {
        this.W2 = z4;
        return this;
    }

    public d b2(int i4) {
        this.S2 = i4;
        return this;
    }

    @Override // com.androidquery.callback.a
    protected File c(File file, String str) {
        File file2 = this.N2;
        return (file2 == null || !file2.exists()) ? super.c(file, str) : this.N2;
    }

    @Override // com.androidquery.callback.a
    public void f(Context context) {
        String Z = Z();
        ImageView imageView = this.V1.get();
        if (Z == null) {
            U0(false);
            d2(Z, imageView, null, false);
            return;
        }
        Bitmap q02 = q0(Z);
        if (q02 != null) {
            imageView.setTag(com.androidquery.util.d.f41256v, Z);
            c g4 = new c().I(4).g();
            this.f41119r = g4;
            m(Z, q02, g4);
            return;
        }
        X1(Z, imageView);
        if (f41163g3.containsKey(Z)) {
            U0(true);
            k1(Z, imageView);
        } else {
            k1(Z, imageView);
            super.f(imageView.getContext());
        }
    }

    public d l1(float f4) {
        this.U2 = f4;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.androidquery.callback.a
    /* renamed from: l2, reason: merged with bridge method [inline-methods] */
    public void V0(String str, Bitmap bitmap, c cVar) {
        f41163g3.remove(str);
    }

    @Override // com.androidquery.callback.a
    protected boolean m0() {
        return !f41159c3;
    }

    public d m1(int i4) {
        this.P2 = i4;
        return this;
    }

    public d m2(int i4) {
        this.L2 = i4;
        return this;
    }

    @Override // com.androidquery.callback.a
    /* renamed from: n2, reason: merged with bridge method [inline-methods] */
    public Bitmap Z0(String str, byte[] bArr, c cVar) {
        File r4 = cVar.r();
        Bitmap q12 = q1(r4 != null ? r4.getAbsolutePath() : null, bArr);
        if (q12 == null) {
            int i4 = this.M2;
            if (i4 > 0) {
                q12 = F1();
            } else if (i4 == -2 || i4 == -1) {
                q12 = f41165i3;
            } else if (i4 == -3) {
                q12 = this.Q2;
            }
            if (cVar.l() != 200) {
                this.V2 = true;
            }
        }
        return q12;
    }

    public d p1(Bitmap bitmap) {
        this.O2 = bitmap;
        return this;
    }

    @Override // com.androidquery.callback.a
    /* renamed from: r1, reason: merged with bridge method [inline-methods] */
    public final void m(String str, Bitmap bitmap, c cVar) {
        ImageView imageView = this.V1.get();
        WeakHashMap<ImageView, d> remove = f41163g3.remove(str);
        if (remove == null || !remove.containsKey(imageView)) {
            t1(this, str, imageView, bitmap, cVar);
        }
        if (remove != null) {
            for (ImageView imageView2 : remove.keySet()) {
                d dVar = remove.get(imageView2);
                dVar.f41119r = cVar;
                t1(dVar, str, imageView2, bitmap, cVar);
            }
        }
    }

    protected void s1(String str, ImageView imageView, Bitmap bitmap, c cVar) {
        d2(str, imageView, bitmap, false);
    }

    public d z1(int i4) {
        this.M2 = i4;
        return this;
    }
}
