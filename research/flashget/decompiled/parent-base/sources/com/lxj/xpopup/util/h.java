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
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.lxj.xpopup.b;
import com.lxj.xpopup.core.AttachPopupView;
import com.lxj.xpopup.core.BasePopupView;
import com.lxj.xpopup.core.BubbleAttachPopupView;
import com.lxj.xpopup.core.PositionPopupView;
import com.lxj.xpopup.impl.FullScreenPopupView;
import gb.k;
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
/* loaded from: classes6.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private static int f69828a;

    /* renamed from: b, reason: collision with root package name */
    private static int f69829b;

    /* renamed from: c, reason: collision with root package name */
    private static final char[] f69830c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: d, reason: collision with root package name */
    private static final char[] f69831d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* compiled from: XPopupUtils.java */
    static class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ BasePopupView f69832b;

        a(final BasePopupView val$pv) {
            this.f69832b = val$pv;
        }

        @Override // java.lang.Runnable
        public void run() {
            h.O(h.f69829b, this.f69832b);
        }
    }

    /* compiled from: XPopupUtils.java */
    static class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f69833b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f69834c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f69835d;

        b(final k val$uri, final Context val$context, final Object val$imageLoader) {
            this.f69833b = val$uri;
            this.f69834c = val$context;
            this.f69835d = val$imageLoader;
        }

        @Override // java.lang.Runnable
        public void run() {
            String s4 = ProtectedSandApp.s("\u17de\u0001");
            String s5 = ProtectedSandApp.s("\u17df\u0001");
            File c5 = this.f69833b.c(this.f69834c, this.f69835d);
            if (c5 == null) {
                Context context = this.f69834c;
                h.V(context, context.getString(b.m.f68870c1));
                return;
            }
            try {
                File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), this.f69834c.getPackageName());
                if (!file.exists()) {
                    file.mkdirs();
                }
                File file2 = new File(file, System.currentTimeMillis() + ProtectedSandApp.s("០\u0001") + h.x(c5));
                if (Build.VERSION.SDK_INT < 29) {
                    if (file2.exists()) {
                        file2.delete();
                    }
                    file2.createNewFile();
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    try {
                        h.Y(fileOutputStream, new FileInputStream(c5));
                        fileOutputStream.close();
                        Intent intent = new Intent(ProtectedSandApp.s("១\u0001"));
                        intent.setData(Uri.parse(s5 + file2.getAbsolutePath()));
                        this.f69834c.sendBroadcast(intent);
                    } finally {
                    }
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(ProtectedSandApp.s("២\u0001"), file2.getName());
                    contentValues.put(ProtectedSandApp.s("៣\u0001"), ProtectedSandApp.s("៤\u0001"));
                    Uri uri = Environment.getExternalStorageState().equals(ProtectedSandApp.s("៥\u0001")) ? MediaStore.Images.Media.EXTERNAL_CONTENT_URI : MediaStore.Images.Media.INTERNAL_CONTENT_URI;
                    contentValues.put(ProtectedSandApp.s("៦\u0001"), Environment.DIRECTORY_DCIM + ProtectedSandApp.s("៧\u0001") + this.f69834c.getPackageName());
                    contentValues.put(s4, (Integer) 1);
                    Uri insert = this.f69834c.getContentResolver().insert(uri, contentValues);
                    if (insert == null) {
                        Context context2 = this.f69834c;
                        h.V(context2, context2.getString(b.m.f68879f1));
                        return;
                    }
                    ContentResolver contentResolver = this.f69834c.getContentResolver();
                    OutputStream openOutputStream = contentResolver.openOutputStream(insert);
                    try {
                        h.Y(openOutputStream, new FileInputStream(c5));
                        if (openOutputStream != null) {
                            openOutputStream.close();
                        }
                        contentValues.clear();
                        contentValues.put(s4, (Integer) 0);
                        contentResolver.update(insert, contentValues, null, null);
                    } finally {
                    }
                }
                Context context3 = this.f69834c;
                h.V(context3, context3.getString(b.m.f68882g1));
            } catch (Exception e4) {
                e4.printStackTrace();
                Context context4 = this.f69834c;
                h.V(context4, context4.getString(b.m.f68879f1));
            }
        }
    }

    /* compiled from: XPopupUtils.java */
    static class c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f69836b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f69837c;

        c(final Context val$text, final String val$context) {
            this.f69836b = val$text;
            this.f69837c = val$context;
        }

        @Override // java.lang.Runnable
        public void run() {
            Context context = this.f69836b;
            if (context != null) {
                Toast.makeText(context, this.f69837c, 0).show();
            }
        }
    }

    public static int A(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService(ProtectedSandApp.s("៨\u0001"));
        if (windowManager == null) {
            return -1;
        }
        Point point = new Point();
        windowManager.getDefaultDisplay().getRealSize(point);
        return point.y;
    }

    public static int B(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService(ProtectedSandApp.s("៨\u0001"));
        if (windowManager == null) {
            return -1;
        }
        Point point = new Point();
        windowManager.getDefaultDisplay().getRealSize(point);
        return point.x;
    }

    public static int C(Window window) {
        Resources system = Resources.getSystem();
        return system.getDimensionPixelSize(system.getIdentifier(ProtectedSandApp.s("\u17eb\u0001"), ProtectedSandApp.s("៩\u0001"), ProtectedSandApp.s("\u17ea\u0001")));
    }

    public static Rect D(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect;
    }

    public static boolean E(View view) {
        try {
            Method declaredMethod = Class.forName(ProtectedSandApp.s("\u17ec\u0001")).getDeclaredMethod(ProtectedSandApp.s("\u17ed\u0001"), null);
            if (!declaredMethod.isAccessible()) {
                declaredMethod.setAccessible(true);
            }
            Object invoke = declaredMethod.invoke(view, null);
            Field declaredField = Class.forName(ProtectedSandApp.s("\u17ee\u0001")).getDeclaredField(ProtectedSandApp.s("\u17ef\u0001"));
            if (!declaredField.isAccessible()) {
                declaredField.setAccessible(true);
            }
            return declaredField.get(invoke) != null;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean F(float x4, float y4, Rect rect) {
        return x4 >= ((float) rect.left) && x4 <= ((float) rect.right) && y4 >= ((float) rect.top) && y4 <= ((float) rect.bottom);
    }

    public static boolean G(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    public static boolean H(Context context) {
        return TextUtils.getLayoutDirectionFromLocale(context.getResources().getConfiguration().getLocales().get(0)) == 1;
    }

    public static boolean I(Window window) {
        ViewGroup viewGroup;
        boolean z4;
        if (window == null || (viewGroup = (ViewGroup) window.getDecorView()) == null) {
            return false;
        }
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = viewGroup.getChildAt(i4);
            int id2 = childAt.getId();
            if (id2 != -1) {
                try {
                    if (ProtectedSandApp.s("៰\u0001").equals(window.getContext().getResources().getResourceEntryName(id2)) && childAt.getVisibility() == 0) {
                        z4 = true;
                        break;
                    }
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        z4 = false;
        if (!z4) {
            return z4;
        }
        if (com.lxj.xpopup.util.a.x() && Build.VERSION.SDK_INT < 29) {
            try {
                return Settings.Global.getInt(window.getContext().getContentResolver(), ProtectedSandApp.s("៱\u0001")) == 0;
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
        if ((pv instanceof FullScreenPopupView) && pv.P().hasTransientState()) {
            return;
        }
        pv.P().animate().translationY(0.0f).setInterpolator(new LinearInterpolator()).setDuration(100L).start();
    }

    public static void N(final int keyboardHeight, final BasePopupView pv) {
        f69829b = keyboardHeight;
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
            } catch (IOException e4) {
                e = e4;
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
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
            }
            is.close();
            try {
                bufferedOutputStream.close();
                return true;
            } catch (IOException e6) {
                e6.printStackTrace();
                return true;
            }
        } catch (IOException e7) {
            e = e7;
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
        char[] cArr = isUpperCase ? f69830c : f69831d;
        int length = bytes.length;
        if (length <= 0) {
            return "";
        }
        char[] cArr2 = new char[length << 1];
        int i4 = 0;
        for (byte b5 : bytes) {
            int i5 = i4 + 1;
            cArr2[i4] = cArr[(b5 >> 4) & 15];
            i4 += 2;
            cArr2[i5] = cArr[b5 & com.google.common.base.c.f54871q];
        }
        return new String(cArr2);
    }

    public static int i(final BitmapFactory.Options options, final int maxWidth, final int maxHeight) {
        int i4 = options.outHeight;
        int i5 = options.outWidth;
        int i6 = 1;
        while (true) {
            if (i4 <= maxHeight && i5 <= maxWidth) {
                return i6;
            }
            i4 >>= 1;
            i5 >>= 1;
            i6 <<= 1;
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
        for (int i4 = 0; i4 < group.getChildCount(); i4++) {
            View childAt = group.getChildAt(i4);
            if ((childAt instanceof EditText) && childAt.getVisibility() == 0) {
                list.add((EditText) childAt);
            } else if (childAt instanceof ViewGroup) {
                q(list, (ViewGroup) childAt);
            }
        }
    }

    public static int r(Context context) {
        Activity j4 = j(context);
        if (j4 == null) {
            return 0;
        }
        if (j4 instanceof AppCompatActivity) {
            ActionBar supportActionBar = ((AppCompatActivity) j4).getSupportActionBar();
            if (supportActionBar == null) {
                return 0;
            }
            return supportActionBar.r();
        }
        android.app.ActionBar actionBar = j4.getActionBar();
        if (actionBar == null) {
            return 0;
        }
        return actionBar.getHeight();
    }

    public static int s(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService(ProtectedSandApp.s("៨\u0001"));
        if (windowManager == null) {
            return -1;
        }
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        return point.y;
    }

    public static int t(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService(ProtectedSandApp.s("៨\u0001"));
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
            return abs - f69828a;
        }
        f69828a = abs;
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

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x010e -> B:84:0x011d). Please report as a decompilation issue!!! */
    public static String x(final File file) {
        FileInputStream fileInputStream;
        if (file == null) {
            return "";
        }
        FileInputStream fileInputStream2 = null;
        try {
            try {
                try {
                    fileInputStream = new FileInputStream(file);
                } catch (IOException e4) {
                    e = e4;
                }
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e5) {
            e5.printStackTrace();
        }
        try {
            byte[] bArr = new byte[12];
            if (fileInputStream.read(bArr) != -1) {
                String upperCase = h(bArr, true).toUpperCase();
                if (upperCase.contains(ProtectedSandApp.s("៲\u0001"))) {
                    String s4 = ProtectedSandApp.s("៳\u0001");
                    try {
                        fileInputStream.close();
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                    return s4;
                }
                if (upperCase.contains(ProtectedSandApp.s("៴\u0001"))) {
                    String s5 = ProtectedSandApp.s("៵\u0001");
                    try {
                        fileInputStream.close();
                    } catch (IOException e7) {
                        e7.printStackTrace();
                    }
                    return s5;
                }
                if (upperCase.contains(ProtectedSandApp.s("៶\u0001"))) {
                    String s6 = ProtectedSandApp.s("៷\u0001");
                    try {
                        fileInputStream.close();
                    } catch (IOException e10) {
                        e10.printStackTrace();
                    }
                    return s6;
                }
                if (!upperCase.contains(ProtectedSandApp.s("៸\u0001")) && !upperCase.contains(ProtectedSandApp.s("៹\u0001"))) {
                    if (upperCase.contains(ProtectedSandApp.s("\u17fa\u0001"))) {
                        String s7 = ProtectedSandApp.s("\u17fb\u0001");
                        try {
                            fileInputStream.close();
                        } catch (IOException e11) {
                            e11.printStackTrace();
                        }
                        return s7;
                    }
                    if (upperCase.startsWith(ProtectedSandApp.s("\u17fc\u0001")) && upperCase.endsWith(ProtectedSandApp.s("\u17fd\u0001"))) {
                        String s10 = ProtectedSandApp.s("\u17fe\u0001");
                        try {
                            fileInputStream.close();
                        } catch (IOException e12) {
                            e12.printStackTrace();
                        }
                        return s10;
                    }
                    if (upperCase.contains(ProtectedSandApp.s("\u17ff\u0001")) || upperCase.contains(ProtectedSandApp.s("᠀\u0001"))) {
                        String s11 = ProtectedSandApp.s("᠁\u0001");
                        try {
                            fileInputStream.close();
                        } catch (IOException e13) {
                            e13.printStackTrace();
                        }
                        return s11;
                    }
                }
                String s12 = ProtectedSandApp.s("᠂\u0001");
                try {
                    fileInputStream.close();
                } catch (IOException e14) {
                    e14.printStackTrace();
                }
                return s12;
            }
            fileInputStream.close();
        } catch (IOException e15) {
            e = e15;
            fileInputStream2 = fileInputStream;
            e.printStackTrace();
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            return "";
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (IOException e16) {
                    e16.printStackTrace();
                }
            }
            throw th;
        }
        return "";
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
        int identifier = system.getIdentifier(ProtectedSandApp.s("᠃\u0001"), ProtectedSandApp.s("៩\u0001"), ProtectedSandApp.s("\u17ea\u0001"));
        if (identifier != 0) {
            return system.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static int z(final String filePath) {
        try {
            int attributeInt = new ExifInterface(filePath).getAttributeInt(ProtectedSandApp.s("᠄\u0001"), 1);
            if (attributeInt == 3) {
                return 180;
            }
            if (attributeInt != 6) {
                return attributeInt != 8 ? 0 : 270;
            }
            return 90;
        } catch (Exception e4) {
            e4.printStackTrace();
            return -1;
        }
    }
}
