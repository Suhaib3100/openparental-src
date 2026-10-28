package com.lxj.xpopup.util;

import android.R;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.provider.Settings;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.Toast;
import androidx.annotation.x;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import c3.k;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.lxj.xpopup.b;
import com.lxj.xpopup.core.AttachPopupView;
import com.lxj.xpopup.core.BasePopupView;
import com.lxj.xpopup.core.BubbleAttachPopupView;
import com.lxj.xpopup.core.PositionPopupView;
import com.lxj.xpopup.impl.FullScreenPopupView;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.Executors;

/* compiled from: XPopupUtils.java */
/* loaded from: classes5.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private static int f21351a;

    /* renamed from: b, reason: collision with root package name */
    private static int f21352b;

    /* renamed from: c, reason: collision with root package name */
    private static final char[] f21353c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: d, reason: collision with root package name */
    private static final char[] f21354d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* compiled from: XPopupUtils.java */
    static class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ BasePopupView f21355o;

        a(final BasePopupView val$pv) {
            this.f21355o = val$pv;
        }

        @Override // java.lang.Runnable
        public void run() {
            h.O(h.f21352b, this.f21355o);
        }
    }

    /* compiled from: XPopupUtils.java */
    static class b implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ k f21356o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Context f21357p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Object f21358q;

        b(final k val$uri, final Context val$context, final Object val$imageLoader) {
            this.f21356o = val$uri;
            this.f21357p = val$context;
            this.f21358q = val$imageLoader;
        }

        @Override // java.lang.Runnable
        public void run() {
            String s5 = ProtectedSandApp.s("㕗");
            String s6 = ProtectedSandApp.s("㕘");
            File b6 = this.f21356o.b(this.f21357p, this.f21358q);
            if (b6 == null) {
                Context context = this.f21357p;
                h.V(context, context.getString(b.m.f20675c1));
                return;
            }
            try {
                File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), this.f21357p.getPackageName());
                if (!file.exists()) {
                    file.mkdirs();
                }
                File file2 = new File(file, System.currentTimeMillis() + ProtectedSandApp.s("㕙") + h.x(b6));
                if (Build.VERSION.SDK_INT < 29) {
                    if (file2.exists()) {
                        file2.delete();
                    }
                    file2.createNewFile();
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    try {
                        h.Y(fileOutputStream, new FileInputStream(b6));
                        fileOutputStream.close();
                        Intent intent = new Intent(ProtectedSandApp.s("㕚"));
                        intent.setData(Uri.parse(s6 + file2.getAbsolutePath()));
                        this.f21357p.sendBroadcast(intent);
                    } finally {
                    }
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(ProtectedSandApp.s("㕛"), file2.getName());
                    contentValues.put(ProtectedSandApp.s("㕜"), ProtectedSandApp.s("㕝"));
                    Uri uri = Environment.getExternalStorageState().equals(ProtectedSandApp.s("㕞")) ? MediaStore.Images.Media.EXTERNAL_CONTENT_URI : MediaStore.Images.Media.INTERNAL_CONTENT_URI;
                    contentValues.put(ProtectedSandApp.s("㕟"), Environment.DIRECTORY_DCIM + ProtectedSandApp.s("㕠") + this.f21357p.getPackageName());
                    contentValues.put(s5, (Integer) 1);
                    Uri insert = this.f21357p.getContentResolver().insert(uri, contentValues);
                    if (insert == null) {
                        Context context2 = this.f21357p;
                        h.V(context2, context2.getString(b.m.f20684f1));
                        return;
                    }
                    ContentResolver contentResolver = this.f21357p.getContentResolver();
                    OutputStream openOutputStream = contentResolver.openOutputStream(insert);
                    try {
                        h.Y(openOutputStream, new FileInputStream(b6));
                        if (openOutputStream != null) {
                            openOutputStream.close();
                        }
                        contentValues.clear();
                        contentValues.put(s5, (Integer) 0);
                        contentResolver.update(insert, contentValues, null, null);
                    } finally {
                    }
                }
                Context context3 = this.f21357p;
                h.V(context3, context3.getString(b.m.f20687g1));
            } catch (Exception e6) {
                e6.printStackTrace();
                Context context4 = this.f21357p;
                h.V(context4, context4.getString(b.m.f20684f1));
            }
        }
    }

    /* compiled from: XPopupUtils.java */
    static class c implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Context f21359o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f21360p;

        c(final Context val$text, final String val$context) {
            this.f21359o = val$text;
            this.f21360p = val$context;
        }

        @Override // java.lang.Runnable
        public void run() {
            Context context = this.f21359o;
            if (context != null) {
                Toast.makeText(context, this.f21360p, 0).show();
            }
        }
    }

    public static int A(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService(ProtectedSandApp.s("㕡"));
        if (windowManager == null) {
            return -1;
        }
        Point point = new Point();
        windowManager.getDefaultDisplay().getRealSize(point);
        return point.y;
    }

    public static int B(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService(ProtectedSandApp.s("㕢"));
        if (windowManager == null) {
            return -1;
        }
        Point point = new Point();
        windowManager.getDefaultDisplay().getRealSize(point);
        return point.x;
    }

    public static int C(Window window) {
        Resources system = Resources.getSystem();
        return system.getDimensionPixelSize(system.getIdentifier(ProtectedSandApp.s("㕥"), ProtectedSandApp.s("㕣"), ProtectedSandApp.s("㕤")));
    }

    public static Rect D(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect;
    }

    public static boolean E(View view) {
        try {
            Method declaredMethod = Class.forName(ProtectedSandApp.s("㕦")).getDeclaredMethod(ProtectedSandApp.s("㕧"), new Class[0]);
            if (!declaredMethod.isAccessible()) {
                declaredMethod.setAccessible(true);
            }
            Object invoke = declaredMethod.invoke(view, new Object[0]);
            Field declaredField = Class.forName(ProtectedSandApp.s("㕨")).getDeclaredField(ProtectedSandApp.s("㕩"));
            if (!declaredField.isAccessible()) {
                declaredField.setAccessible(true);
            }
            return declaredField.get(invoke) != null;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean F(float x5, float y5, Rect rect) {
        return x5 >= ((float) rect.left) && x5 <= ((float) rect.right) && y5 >= ((float) rect.top) && y5 <= ((float) rect.bottom);
    }

    public static boolean G(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    public static boolean H(Context context) {
        return TextUtils.getLayoutDirectionFromLocale(context.getResources().getConfiguration().getLocales().get(0)) == 1;
    }

    public static boolean I(Window window) {
        ViewGroup viewGroup;
        boolean z5;
        if (window == null || (viewGroup = (ViewGroup) window.getDecorView()) == null) {
            return false;
        }
        int childCount = viewGroup.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = viewGroup.getChildAt(i5);
            int id = childAt.getId();
            if (id != -1) {
                try {
                    if (ProtectedSandApp.s("㕪").equals(window.getContext().getResources().getResourceEntryName(id)) && childAt.getVisibility() == 0) {
                        z5 = true;
                        break;
                    }
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        z5 = false;
        if (!z5) {
            return z5;
        }
        if (com.lxj.xpopup.util.a.x() && Build.VERSION.SDK_INT < 29) {
            try {
                return Settings.Global.getInt(window.getContext().getContentResolver(), ProtectedSandApp.s("㕫")) == 0;
            } catch (Exception unused2) {
            }
        }
        return (viewGroup.getSystemUiVisibility() & 2) == 0;
    }

    public static boolean J() {
        return (Resources.getSystem().getConfiguration().screenLayout & 15) >= 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void K(final ViewGroup content, final int maxWidth, final int popupWidth, final int maxHeight, final int popupHeight, final Runnable afterApplySize) {
        ViewGroup.LayoutParams layoutParams = content.getLayoutParams();
        View childAt = content.getChildAt(0);
        if (childAt == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
        int measuredWidth = content.getMeasuredWidth();
        if (maxWidth > 0) {
            if (measuredWidth > maxWidth) {
                layoutParams.width = Math.min(measuredWidth, maxWidth);
            }
            if (layoutParams2.width == -1) {
                int min = Math.min(measuredWidth, maxWidth);
                layoutParams2.width = min;
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                    layoutParams2.width = (min - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin;
                }
            }
            if (popupWidth > 0) {
                layoutParams.width = Math.min(popupWidth, maxWidth);
                layoutParams2.width = Math.min(popupWidth, maxWidth);
            }
        } else if (popupWidth > 0) {
            layoutParams.width = popupWidth;
            layoutParams2.width = popupWidth;
        }
        if (maxHeight > 0) {
            int measuredHeight = content.getMeasuredHeight();
            if (measuredHeight > maxHeight) {
                layoutParams.height = Math.min(measuredHeight, maxHeight);
            }
            if (popupHeight > 0) {
                layoutParams.height = Math.min(popupHeight, maxHeight);
                layoutParams2.height = Math.min(popupHeight, maxHeight);
            }
        } else if (popupHeight > 0) {
            layoutParams.height = popupHeight;
            layoutParams2.height = popupHeight;
        }
        childAt.setLayoutParams(layoutParams2);
        content.setLayoutParams(layoutParams);
        content.post(new Runnable() { // from class: com.lxj.xpopup.util.f
            @Override // java.lang.Runnable
            public final void run() {
                h.L(afterApplySize);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void L(final Runnable afterApplySize) {
        if (afterApplySize != null) {
            afterApplySize.run();
        }
    }

    public static void M(BasePopupView pv) {
        if ((pv instanceof PositionPopupView) || (pv instanceof AttachPopupView) || (pv instanceof BubbleAttachPopupView)) {
            return;
        }
        if ((pv instanceof FullScreenPopupView) && pv.T().hasTransientState()) {
            return;
        }
        pv.T().animate().translationY(0.0f).setInterpolator(new LinearInterpolator()).setDuration(100L).start();
    }

    public static void N(final int keyboardHeight, final BasePopupView pv) {
        f21352b = keyboardHeight;
        pv.post(new a(pv));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ae, code lost:
    
        if (r7 > 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c2, code lost:
    
        if (r7 > 0) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void O(int r7, com.lxj.xpopup.core.BasePopupView r8) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lxj.xpopup.util.h.O(int, com.lxj.xpopup.core.BasePopupView):void");
    }

    public static Bitmap P(Context context, final Bitmap src, @x(from = 0.0d, fromInclusive = false, to = 25.0d) final float radius, final boolean recycle) {
        RenderScript renderScript;
        if (!recycle) {
            src = src.copy(src.getConfig(), true);
        }
        try {
            renderScript = RenderScript.create(context);
        } catch (Throwable th) {
            th = th;
            renderScript = null;
        }
        try {
            renderScript.setMessageHandler(new RenderScript.RSMessageHandler());
            Allocation createFromBitmap = Allocation.createFromBitmap(renderScript, src, Allocation.MipmapControl.MIPMAP_NONE, 1);
            Allocation createTyped = Allocation.createTyped(renderScript, createFromBitmap.getType());
            ScriptIntrinsicBlur create = ScriptIntrinsicBlur.create(renderScript, Element.U8_4(renderScript));
            create.setInput(createFromBitmap);
            create.setRadius(radius);
            create.forEach(createTyped);
            createTyped.copyTo(src);
            renderScript.destroy();
            return src;
        } catch (Throwable th2) {
            th = th2;
            if (renderScript != null) {
                renderScript.destroy();
            }
            throw th;
        }
    }

    public static Bitmap Q(final Bitmap src, final int degrees, final float px, final float py) {
        if (degrees == 0) {
            return src;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(degrees, px, py);
        return Bitmap.createBitmap(src, 0, 0, src.getWidth(), src.getHeight(), matrix, true);
    }

    public static void R(final Context context, final k imageLoader, final Object uri) {
        Executors.newSingleThreadExecutor().execute(new b(imageLoader, context, uri));
    }

    public static void S(EditText et, int color) {
    }

    public static void T(View view, boolean isVisible) {
        if (view != null) {
            view.setVisibility(isVisible ? 0 : 8);
        }
    }

    public static void U(View target, int width, int height) {
        if (width > 0 || height > 0) {
            ViewGroup.LayoutParams layoutParams = target.getLayoutParams();
            if (width > 0) {
                layoutParams.width = width;
            }
            if (height > 0) {
                layoutParams.height = height;
            }
            target.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void V(final Context context, final String text) {
        new Handler(Looper.getMainLooper()).post(new c(context, text));
    }

    public static Bitmap W(final View view) {
        return X(view, -1, 1);
    }

    public static Bitmap X(final View view, int clipHeight, int scale) {
        Bitmap createBitmap;
        if (view == null) {
            return null;
        }
        boolean isDrawingCacheEnabled = view.isDrawingCacheEnabled();
        boolean willNotCacheDrawing = view.willNotCacheDrawing();
        view.setDrawingCacheEnabled(true);
        view.setWillNotCacheDrawing(false);
        Bitmap drawingCache = view.getDrawingCache();
        if (drawingCache == null) {
            view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            view.buildDrawingCache();
            Bitmap drawingCache2 = view.getDrawingCache();
            if (drawingCache2 != null) {
                int width = drawingCache2.getWidth();
                if (clipHeight <= 0) {
                    clipHeight = drawingCache2.getHeight();
                }
                createBitmap = Bitmap.createBitmap(drawingCache2, 0, 0, width, clipHeight);
            } else {
                int measuredWidth = view.getMeasuredWidth();
                if (clipHeight <= 0) {
                    clipHeight = view.getMeasuredHeight();
                }
                createBitmap = Bitmap.createBitmap(measuredWidth, clipHeight, Bitmap.Config.ARGB_8888);
                view.draw(new Canvas(createBitmap));
            }
        } else {
            int width2 = drawingCache.getWidth();
            if (clipHeight <= 0) {
                clipHeight = drawingCache.getHeight();
            }
            createBitmap = Bitmap.createBitmap(drawingCache, 0, 0, width2, clipHeight);
        }
        view.destroyDrawingCache();
        view.setWillNotCacheDrawing(willNotCacheDrawing);
        view.setDrawingCacheEnabled(isDrawingCacheEnabled);
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, view.getMeasuredWidth() / scale, view.getMeasuredHeight() / scale, true);
        if (!createBitmap.isRecycled() && createBitmap != createScaledBitmap) {
            createBitmap.recycle();
        }
        return createScaledBitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean Y(final OutputStream fos, final InputStream is) {
        BufferedOutputStream bufferedOutputStream;
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                bufferedOutputStream = new BufferedOutputStream(fos);
            } catch (IOException e6) {
                e = e6;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int read = is.read(bArr, 0, 8192);
                if (read != -1) {
                    bufferedOutputStream.write(bArr, 0, read);
                } else {
                    try {
                        break;
                    } catch (IOException e7) {
                        e7.printStackTrace();
                    }
                }
            }
            is.close();
            try {
                bufferedOutputStream.close();
                return true;
            } catch (IOException e8) {
                e8.printStackTrace();
                return true;
            }
        } catch (IOException e9) {
            e = e9;
            bufferedOutputStream2 = bufferedOutputStream;
            e.printStackTrace();
            try {
                is.close();
            } catch (IOException e10) {
                e10.printStackTrace();
            }
            if (bufferedOutputStream2 != null) {
                try {
                    bufferedOutputStream2.close();
                } catch (IOException e11) {
                    e11.printStackTrace();
                }
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            bufferedOutputStream2 = bufferedOutputStream;
            try {
                is.close();
            } catch (IOException e12) {
                e12.printStackTrace();
            }
            if (bufferedOutputStream2 == null) {
                throw th;
            }
            try {
                bufferedOutputStream2.close();
                throw th;
            } catch (IOException e13) {
                e13.printStackTrace();
                throw th;
            }
        }
    }

    public static void g(final ViewGroup content, final int maxWidth, final int maxHeight, final int popupWidth, final int popupHeight, final Runnable afterApplySize) {
        content.post(new Runnable() { // from class: com.lxj.xpopup.util.g
            @Override // java.lang.Runnable
            public final void run() {
                h.K(content, maxWidth, popupWidth, maxHeight, popupHeight, afterApplySize);
            }
        });
    }

    public static String h(final byte[] bytes, boolean isUpperCase) {
        if (bytes == null) {
            return "";
        }
        char[] cArr = isUpperCase ? f21353c : f21354d;
        int length = bytes.length;
        if (length <= 0) {
            return "";
        }
        char[] cArr2 = new char[length << 1];
        int i5 = 0;
        for (byte b6 : bytes) {
            int i6 = i5 + 1;
            cArr2[i5] = cArr[(b6 >> 4) & 15];
            i5 = i6 + 1;
            cArr2[i6] = cArr[b6 & 15];
        }
        return new String(cArr2);
    }

    public static int i(final BitmapFactory.Options options, final int maxWidth, final int maxHeight) {
        int i5 = options.outHeight;
        int i6 = options.outWidth;
        int i7 = 1;
        while (true) {
            if (i5 <= maxHeight && i6 <= maxWidth) {
                return i7;
            }
            i5 >>= 1;
            i6 >>= 1;
            i7 <<= 1;
        }
    }

    public static Activity j(Context ctx) {
        while (ctx instanceof ContextWrapper) {
            if (ctx instanceof Activity) {
                return (Activity) ctx;
            }
            ctx = ((ContextWrapper) ctx).getBaseContext();
        }
        return null;
    }

    public static Activity k(View view) {
        return j(view.getContext());
    }

    public static BitmapDrawable l(Context context, int width, int color) {
        Bitmap createBitmap = Bitmap.createBitmap(width, p(context, 1.5f), Bitmap.Config.ARGB_4444);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setColor(color);
        canvas.drawRect(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight(), paint);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), createBitmap);
        bitmapDrawable.setGravity(80);
        return bitmapDrawable;
    }

    public static Drawable m(int color, float radius) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(color);
        gradientDrawable.setCornerRadius(radius);
        return gradientDrawable;
    }

    public static Drawable n(int color, float tlRadius, float trRadius, float brRadius, float blRadius) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(color);
        gradientDrawable.setCornerRadii(new float[]{tlRadius, tlRadius, trRadius, trRadius, brRadius, brRadius, blRadius, blRadius});
        return gradientDrawable;
    }

    public static StateListDrawable o(Drawable defaultDrawable, Drawable focusDrawable) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_focused}, focusDrawable);
        stateListDrawable.addState(new int[0], defaultDrawable);
        return stateListDrawable;
    }

    public static int p(Context context, float dipValue) {
        return (int) ((dipValue * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static void q(ArrayList<EditText> list, ViewGroup group) {
        for (int i5 = 0; i5 < group.getChildCount(); i5++) {
            View childAt = group.getChildAt(i5);
            if ((childAt instanceof EditText) && childAt.getVisibility() == 0) {
                list.add((EditText) childAt);
            } else if (childAt instanceof ViewGroup) {
                q(list, (ViewGroup) childAt);
            }
        }
    }

    public static int r(Context context) {
        Activity j5 = j(context);
        if (j5 == null) {
            return 0;
        }
        if (j5 instanceof AppCompatActivity) {
            ActionBar t02 = ((AppCompatActivity) j5).t0();
            if (t02 == null) {
                return 0;
            }
            return t02.q();
        }
        android.app.ActionBar actionBar = j5.getActionBar();
        if (actionBar == null) {
            return 0;
        }
        return actionBar.getHeight();
    }

    public static int s(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService(ProtectedSandApp.s("㕬"));
        if (windowManager == null) {
            return -1;
        }
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        return point.y;
    }

    public static int t(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService(ProtectedSandApp.s("㕭"));
        if (windowManager == null) {
            return -1;
        }
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        return point.x;
    }

    public static Bitmap u(final File file, final int maxWidth, final int maxHeight) {
        if (file == null) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        options.inSampleSize = i(options, maxWidth, maxHeight);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(file.getAbsolutePath(), options);
    }

    public static int v(final Window window) {
        View decorView;
        if (window == null || (decorView = window.getDecorView()) == null) {
            return 0;
        }
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int abs = Math.abs(decorView.getBottom() - rect.bottom);
        if (abs > y(window)) {
            return abs - f21351a;
        }
        f21351a = abs;
        return 0;
    }

    public static int[] w(File file) {
        if (file == null) {
            return new int[]{0, 0};
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        return new int[]{options.outWidth, options.outHeight};
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e1, code lost:
    
        if (r4 != false) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v37, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.String] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x0118 -> B:84:0x011b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String x(java.io.File r4) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lxj.xpopup.util.h.x(java.io.File):java.lang.String");
    }

    public static int y(Window window) {
        if (!I(window)) {
            return 0;
        }
        if (window != null) {
            View findViewById = window.findViewById(R.id.navigationBarBackground);
            if (findViewById != null && findViewById.getVisibility() == 0) {
                return findViewById.getHeight();
            }
            return 0;
        }
        Resources system = Resources.getSystem();
        int identifier = system.getIdentifier(ProtectedSandApp.s("㖁"), ProtectedSandApp.s("㕿"), ProtectedSandApp.s("㖀"));
        if (identifier != 0) {
            return system.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static int z(final String filePath) {
        try {
            int attributeInt = new ExifInterface(filePath).getAttributeInt(ProtectedSandApp.s("㖂"), 1);
            if (attributeInt == 3) {
                return SubsamplingScaleImageView.ORIENTATION_180;
            }
            if (attributeInt == 6) {
                return 90;
            }
            if (attributeInt != 8) {
                return 0;
            }
            return SubsamplingScaleImageView.ORIENTATION_270;
        } catch (Exception e6) {
            e6.printStackTrace();
            return -1;
        }
    }
}
