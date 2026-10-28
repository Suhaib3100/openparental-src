package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.c1;
import androidx.annotation.h1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.u0;
import androidx.annotation.x0;
import androidx.core.text.w;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: TextViewCompat.java */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private static final String f5904a = "TextViewCompat";

    /* renamed from: b, reason: collision with root package name */
    public static final int f5905b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f5906c = 1;

    /* renamed from: d, reason: collision with root package name */
    private static Field f5907d = null;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f5908e = false;

    /* renamed from: f, reason: collision with root package name */
    private static Field f5909f = null;

    /* renamed from: g, reason: collision with root package name */
    private static boolean f5910g = false;

    /* renamed from: h, reason: collision with root package name */
    private static Field f5911h = null;

    /* renamed from: i, reason: collision with root package name */
    private static boolean f5912i = false;

    /* renamed from: j, reason: collision with root package name */
    private static Field f5913j = null;

    /* renamed from: k, reason: collision with root package name */
    private static boolean f5914k = false;

    /* renamed from: l, reason: collision with root package name */
    private static final int f5915l = 1;

    /* compiled from: TextViewCompat.java */
    @x0(16)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static boolean a(TextView textView) {
            return textView.getIncludeFontPadding();
        }

        @androidx.annotation.u
        static int b(TextView textView) {
            return textView.getMaxLines();
        }

        @androidx.annotation.u
        static int c(TextView textView) {
            return textView.getMinLines();
        }
    }

    /* compiled from: TextViewCompat.java */
    @x0(17)
    static class b {
        private b() {
        }

        @androidx.annotation.u
        static Drawable[] a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        @androidx.annotation.u
        static int b(View view) {
            return view.getLayoutDirection();
        }

        @androidx.annotation.u
        static int c(View view) {
            return view.getTextDirection();
        }

        @androidx.annotation.u
        static Locale d(TextView textView) {
            return textView.getTextLocale();
        }

        @androidx.annotation.u
        static void e(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }

        @androidx.annotation.u
        static void f(TextView textView, int i5, int i6, int i7, int i8) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i5, i6, i7, i8);
        }

        @androidx.annotation.u
        static void g(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        @androidx.annotation.u
        static void h(View view, int i5) {
            view.setTextDirection(i5);
        }
    }

    /* compiled from: TextViewCompat.java */
    @x0(23)
    static class c {
        private c() {
        }

        @androidx.annotation.u
        static int a(TextView textView) {
            return textView.getBreakStrategy();
        }

        @androidx.annotation.u
        static ColorStateList b(TextView textView) {
            return textView.getCompoundDrawableTintList();
        }

        @androidx.annotation.u
        static PorterDuff.Mode c(TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }

        @androidx.annotation.u
        static int d(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        @androidx.annotation.u
        static void e(TextView textView, int i5) {
            textView.setBreakStrategy(i5);
        }

        @androidx.annotation.u
        static void f(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        @androidx.annotation.u
        static void g(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        @androidx.annotation.u
        static void h(TextView textView, int i5) {
            textView.setHyphenationFrequency(i5);
        }
    }

    /* compiled from: TextViewCompat.java */
    @x0(24)
    static class d {
        private d() {
        }

        @androidx.annotation.u
        static DecimalFormatSymbols a(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    /* compiled from: TextViewCompat.java */
    @x0(26)
    static class e {
        private e() {
        }

        @androidx.annotation.u
        static int a(TextView textView) {
            int autoSizeMaxTextSize;
            autoSizeMaxTextSize = textView.getAutoSizeMaxTextSize();
            return autoSizeMaxTextSize;
        }

        @androidx.annotation.u
        static int b(TextView textView) {
            int autoSizeMinTextSize;
            autoSizeMinTextSize = textView.getAutoSizeMinTextSize();
            return autoSizeMinTextSize;
        }

        @androidx.annotation.u
        static int c(TextView textView) {
            int autoSizeStepGranularity;
            autoSizeStepGranularity = textView.getAutoSizeStepGranularity();
            return autoSizeStepGranularity;
        }

        @androidx.annotation.u
        static int[] d(TextView textView) {
            int[] autoSizeTextAvailableSizes;
            autoSizeTextAvailableSizes = textView.getAutoSizeTextAvailableSizes();
            return autoSizeTextAvailableSizes;
        }

        @androidx.annotation.u
        static int e(TextView textView) {
            int autoSizeTextType;
            autoSizeTextType = textView.getAutoSizeTextType();
            return autoSizeTextType;
        }

        @androidx.annotation.u
        static void f(TextView textView, int i5, int i6, int i7, int i8) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i5, i6, i7, i8);
        }

        @androidx.annotation.u
        static void g(TextView textView, int[] iArr, int i5) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i5);
        }

        @androidx.annotation.u
        static void h(TextView textView, int i5) {
            textView.setAutoSizeTextTypeWithDefaults(i5);
        }
    }

    /* compiled from: TextViewCompat.java */
    @x0(28)
    static class f {
        private f() {
        }

        @androidx.annotation.u
        static String[] a(DecimalFormatSymbols decimalFormatSymbols) {
            String[] digitStrings;
            digitStrings = decimalFormatSymbols.getDigitStrings();
            return digitStrings;
        }

        @androidx.annotation.u
        static PrecomputedText.Params b(TextView textView) {
            PrecomputedText.Params textMetricsParams;
            textMetricsParams = textView.getTextMetricsParams();
            return textMetricsParams;
        }

        @androidx.annotation.u
        static void c(TextView textView, int i5) {
            textView.setFirstBaselineToTopHeight(i5);
        }
    }

    /* compiled from: TextViewCompat.java */
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface g {
    }

    /* compiled from: TextViewCompat.java */
    @x0(26)
    private static class h implements ActionMode.Callback {

        /* renamed from: g, reason: collision with root package name */
        private static final int f5916g = 100;

        /* renamed from: a, reason: collision with root package name */
        private final ActionMode.Callback f5917a;

        /* renamed from: b, reason: collision with root package name */
        private final TextView f5918b;

        /* renamed from: c, reason: collision with root package name */
        private Class<?> f5919c;

        /* renamed from: d, reason: collision with root package name */
        private Method f5920d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f5921e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f5922f = false;

        h(ActionMode.Callback callback, TextView textView) {
            this.f5917a = callback;
            this.f5918b = textView;
        }

        private Intent a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        private Intent b(ResolveInfo resolveInfo, TextView textView) {
            Intent putExtra = a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !e(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return putExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        private List<ResolveInfo> c(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (!(context instanceof Activity)) {
                return arrayList;
            }
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(a(), 0)) {
                if (f(resolveInfo, context)) {
                    arrayList.add(resolveInfo);
                }
            }
            return arrayList;
        }

        private boolean e(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        private boolean f(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            String str = activityInfo.permission;
            return str == null || context.checkSelfPermission(str) == 0;
        }

        private void g(Menu menu) {
            Context context = this.f5918b.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f5922f) {
                this.f5922f = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f5919c = cls;
                    this.f5920d = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.f5921e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f5919c = null;
                    this.f5920d = null;
                    this.f5921e = false;
                }
            }
            try {
                Method declaredMethod = (this.f5921e && this.f5919c.isInstance(menu)) ? this.f5920d : menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                List<ResolveInfo> c6 = c(context, packageManager);
                for (int i5 = 0; i5 < c6.size(); i5++) {
                    ResolveInfo resolveInfo = c6.get(i5);
                    menu.add(0, 0, i5 + 100, resolveInfo.loadLabel(packageManager)).setIntent(b(resolveInfo, this.f5918b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        @o0
        ActionMode.Callback d() {
            return this.f5917a;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f5917a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f5917a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.f5917a.onDestroyActionMode(actionMode);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            g(menu);
            return this.f5917a.onPrepareActionMode(actionMode, menu);
        }
    }

    private s() {
    }

    public static void A(@o0 TextView textView, @u0 @androidx.annotation.g0(from = 0) int i5) {
        androidx.core.util.q.i(i5);
        if (Build.VERSION.SDK_INT >= 28) {
            f.c(textView, i5);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i6 = a.a(textView) ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i5 > Math.abs(i6)) {
            textView.setPadding(textView.getPaddingLeft(), i5 + i6, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void B(@o0 TextView textView, @u0 @androidx.annotation.g0(from = 0) int i5) {
        androidx.core.util.q.i(i5);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i6 = a.a(textView) ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i5 > Math.abs(i6)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i5 - i6);
        }
    }

    public static void C(@o0 TextView textView, @u0 @androidx.annotation.g0(from = 0) int i5) {
        androidx.core.util.q.i(i5);
        if (i5 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i5 - r0, 1.0f);
        }
    }

    public static void D(@o0 TextView textView, @o0 androidx.core.text.w wVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            textView.setText(wVar.f());
        } else {
            if (!o(textView).a(wVar.e())) {
                throw new IllegalArgumentException("Given text can not be applied to TextView.");
            }
            textView.setText(wVar);
        }
    }

    public static void E(@o0 TextView textView, @h1 int i5) {
        textView.setTextAppearance(i5);
    }

    public static void F(@o0 TextView textView, @o0 w.a aVar) {
        b.h(textView, m(aVar.d()));
        textView.getPaint().set(aVar.e());
        c.e(textView, aVar.b());
        c.h(textView, aVar.c());
    }

    @q0
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public static ActionMode.Callback G(@q0 ActionMode.Callback callback) {
        return (!(callback instanceof h) || Build.VERSION.SDK_INT < 26) ? callback : ((h) callback).d();
    }

    @q0
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public static ActionMode.Callback H(@o0 TextView textView, @q0 ActionMode.Callback callback) {
        int i5 = Build.VERSION.SDK_INT;
        return (i5 < 26 || i5 > 27 || (callback instanceof h) || callback == null) ? callback : new h(callback, textView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int a(@o0 TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return e.a(textView);
        }
        if (textView instanceof androidx.core.widget.b) {
            return ((androidx.core.widget.b) textView).getAutoSizeMaxTextSize();
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int b(@o0 TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return e.b(textView);
        }
        if (textView instanceof androidx.core.widget.b) {
            return ((androidx.core.widget.b) textView).getAutoSizeMinTextSize();
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int c(@o0 TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return e.c(textView);
        }
        if (textView instanceof androidx.core.widget.b) {
            return ((androidx.core.widget.b) textView).getAutoSizeStepGranularity();
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0
    public static int[] d(@o0 TextView textView) {
        return Build.VERSION.SDK_INT >= 27 ? e.d(textView) : textView instanceof androidx.core.widget.b ? ((androidx.core.widget.b) textView).getAutoSizeTextAvailableSizes() : new int[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int e(@o0 TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return e.e(textView);
        }
        if (textView instanceof androidx.core.widget.b) {
            return ((androidx.core.widget.b) textView).getAutoSizeTextType();
        }
        return 0;
    }

    @q0
    public static ColorStateList f(@o0 TextView textView) {
        textView.getClass();
        return c.b(textView);
    }

    @q0
    public static PorterDuff.Mode g(@o0 TextView textView) {
        textView.getClass();
        return c.c(textView);
    }

    @o0
    public static Drawable[] h(@o0 TextView textView) {
        return b.a(textView);
    }

    public static int i(@o0 TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    public static int j(@o0 TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    public static int k(@o0 TextView textView) {
        return a.b(textView);
    }

    public static int l(@o0 TextView textView) {
        return a.c(textView);
    }

    @x0(18)
    private static int m(@o0 TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        return textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL ? 7 : 1;
    }

    @x0(18)
    private static TextDirectionHeuristic n(@o0 TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        if (Build.VERSION.SDK_INT >= 28 && (textView.getInputType() & 15) == 3) {
            byte directionality = Character.getDirectionality(f.a(d.a(b.d(textView)))[0].codePointAt(0));
            return (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        boolean z5 = b.b(textView) == 1;
        switch (b.c(textView)) {
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                if (!z5) {
                    break;
                } else {
                    break;
                }
        }
        return TextDirectionHeuristics.LTR;
    }

    @o0
    public static w.a o(@o0 TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new w.a(f.b(textView));
        }
        w.a.C0051a c0051a = new w.a.C0051a(new TextPaint(textView.getPaint()));
        c0051a.b(c.a(textView));
        c0051a.c(c.d(textView));
        c0051a.d(n(textView));
        return c0051a.a();
    }

    private static Field p(String str) {
        Field field = null;
        try {
            field = TextView.class.getDeclaredField(str);
            field.setAccessible(true);
            return field;
        } catch (NoSuchFieldException unused) {
            return field;
        }
    }

    private static int q(Field field, TextView textView) {
        try {
            return field.getInt(textView);
        } catch (IllegalAccessException unused) {
            field.getName();
            return -1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void r(@o0 TextView textView, int i5, int i6, int i7, int i8) throws IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 27) {
            e.f(textView, i5, i6, i7, i8);
        } else if (textView instanceof androidx.core.widget.b) {
            ((androidx.core.widget.b) textView).setAutoSizeTextTypeUniformWithConfiguration(i5, i6, i7, i8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void s(@o0 TextView textView, @o0 int[] iArr, int i5) throws IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 27) {
            e.g(textView, iArr, i5);
        } else if (textView instanceof androidx.core.widget.b) {
            ((androidx.core.widget.b) textView).setAutoSizeTextTypeUniformWithPresetSizes(iArr, i5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void t(@o0 TextView textView, int i5) {
        if (Build.VERSION.SDK_INT >= 27) {
            e.h(textView, i5);
        } else if (textView instanceof androidx.core.widget.b) {
            ((androidx.core.widget.b) textView).setAutoSizeTextTypeWithDefaults(i5);
        }
    }

    public static void u(@o0 TextView textView, @q0 ColorStateList colorStateList) {
        textView.getClass();
        c.f(textView, colorStateList);
    }

    public static void v(@o0 TextView textView, @q0 PorterDuff.Mode mode) {
        textView.getClass();
        c.g(textView, mode);
    }

    public static void w(@o0 TextView textView, @q0 Drawable drawable, @q0 Drawable drawable2, @q0 Drawable drawable3, @q0 Drawable drawable4) {
        b.e(textView, drawable, drawable2, drawable3, drawable4);
    }

    public static void x(@o0 TextView textView, @androidx.annotation.v int i5, @androidx.annotation.v int i6, @androidx.annotation.v int i7, @androidx.annotation.v int i8) {
        b.f(textView, i5, i6, i7, i8);
    }

    public static void y(@o0 TextView textView, @q0 Drawable drawable, @q0 Drawable drawable2, @q0 Drawable drawable3, @q0 Drawable drawable4) {
        b.g(textView, drawable, drawable2, drawable3, drawable4);
    }

    public static void z(@o0 TextView textView, @o0 ActionMode.Callback callback) {
        textView.setCustomSelectionActionModeCallback(H(textView, callback));
    }
}
