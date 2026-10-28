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
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.annotation.c1;
import androidx.annotation.g0;
import androidx.annotation.h1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.u0;
import androidx.annotation.w0;
import androidx.annotation.x;
import androidx.annotation.x0;
import androidx.core.text.p;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: TextViewCompat.java */
/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final int f27596a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f27597b = 1;

    /* compiled from: TextViewCompat.java */
    @x0(23)
    static class a {
        private a() {
        }

        static int a(TextView textView) {
            return textView.getBreakStrategy();
        }

        static ColorStateList b(TextView textView) {
            return textView.getCompoundDrawableTintList();
        }

        static PorterDuff.Mode c(TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }

        static int d(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        static void e(TextView textView, int i4) {
            textView.setBreakStrategy(i4);
        }

        static void f(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        static void g(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        static void h(TextView textView, int i4) {
            textView.setHyphenationFrequency(i4);
        }
    }

    /* compiled from: TextViewCompat.java */
    @x0(24)
    static class b {
        private b() {
        }

        static DecimalFormatSymbols a(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    /* compiled from: TextViewCompat.java */
    @x0(26)
    static class c {
        private c() {
        }

        static int a(TextView textView) {
            return textView.getAutoSizeMaxTextSize();
        }

        static int b(TextView textView) {
            return textView.getAutoSizeMinTextSize();
        }

        static int c(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        static int[] d(TextView textView) {
            return textView.getAutoSizeTextAvailableSizes();
        }

        static int e(TextView textView) {
            return textView.getAutoSizeTextType();
        }

        static void f(TextView textView, int i4, int i5, int i6, int i7) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i4, i5, i6, i7);
        }

        static void g(TextView textView, int[] iArr, int i4) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i4);
        }

        static void h(TextView textView, int i4) {
            textView.setAutoSizeTextTypeWithDefaults(i4);
        }
    }

    /* compiled from: TextViewCompat.java */
    @x0(28)
    static class d {
        private d() {
        }

        static CharSequence a(PrecomputedText precomputedText) {
            return precomputedText;
        }

        static String[] b(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        static PrecomputedText.Params c(TextView textView) {
            return textView.getTextMetricsParams();
        }

        static void d(TextView textView, int i4) {
            textView.setFirstBaselineToTopHeight(i4);
        }
    }

    /* compiled from: TextViewCompat.java */
    @x0(34)
    static class e {
        private e() {
        }

        public static void a(@o0 TextView textView, int i4, @x(from = 0.0d) float f4) {
            textView.setLineHeight(i4, f4);
        }
    }

    /* compiled from: TextViewCompat.java */
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface f {
    }

    /* compiled from: TextViewCompat.java */
    @x0(26)
    private static class g implements ActionMode.Callback {

        /* renamed from: g, reason: collision with root package name */
        private static final int f27598g = 100;

        /* renamed from: a, reason: collision with root package name */
        private final ActionMode.Callback f27599a;

        /* renamed from: b, reason: collision with root package name */
        private final TextView f27600b;

        /* renamed from: c, reason: collision with root package name */
        private Class<?> f27601c;

        /* renamed from: d, reason: collision with root package name */
        private Method f27602d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f27603e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f27604f = false;

        g(ActionMode.Callback callback, TextView textView) {
            this.f27599a = callback;
            this.f27600b = textView;
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
            Context context = this.f27600b.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f27604f) {
                this.f27604f = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f27601c = cls;
                    this.f27602d = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.f27603e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f27601c = null;
                    this.f27602d = null;
                    this.f27603e = false;
                }
            }
            try {
                Method declaredMethod = (this.f27603e && this.f27601c.isInstance(menu)) ? this.f27602d : menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                List<ResolveInfo> c5 = c(context, packageManager);
                for (int i4 = 0; i4 < c5.size(); i4++) {
                    ResolveInfo resolveInfo = c5.get(i4);
                    menu.add(0, 0, i4 + 100, resolveInfo.loadLabel(packageManager)).setIntent(b(resolveInfo, this.f27600b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        @o0
        ActionMode.Callback d() {
            return this.f27599a;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f27599a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f27599a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.f27599a.onDestroyActionMode(actionMode);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            g(menu);
            return this.f27599a.onPrepareActionMode(actionMode, menu);
        }
    }

    private q() {
    }

    public static void A(@o0 TextView textView, @u0 @g0(from = 0) int i4) {
        androidx.core.util.w.i(i4);
        if (i4 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i4 - r0, 1.0f);
        }
    }

    public static void B(@o0 TextView textView, int i4, @x(from = 0.0d) float f4) {
        if (Build.VERSION.SDK_INT >= 34) {
            e.a(textView, i4, f4);
        } else {
            A(textView, Math.round(TypedValue.applyDimension(i4, f4, textView.getResources().getDisplayMetrics())));
        }
    }

    public static void C(@o0 TextView textView, @o0 androidx.core.text.p pVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            textView.setText(pVar.i());
        } else {
            if (!o(textView).a(pVar.h())) {
                throw new IllegalArgumentException("Given text can not be applied to TextView.");
            }
            textView.setText(pVar);
        }
    }

    public static void D(@o0 TextView textView, @h1 int i4) {
        textView.setTextAppearance(i4);
    }

    public static void E(@o0 TextView textView, @o0 p.b bVar) {
        textView.setTextDirection(m(bVar.d()));
        textView.getPaint().set(bVar.e());
        textView.setBreakStrategy(bVar.b());
        textView.setHyphenationFrequency(bVar.c());
    }

    @q0
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public static ActionMode.Callback F(@q0 ActionMode.Callback callback) {
        return (!(callback instanceof g) || Build.VERSION.SDK_INT < 26) ? callback : ((g) callback).d();
    }

    @q0
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public static ActionMode.Callback G(@o0 TextView textView, @q0 ActionMode.Callback callback) {
        int i4 = Build.VERSION.SDK_INT;
        return (i4 < 26 || i4 > 27 || (callback instanceof g) || callback == null) ? callback : new g(callback, textView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int a(@o0 TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return c.a(textView);
        }
        if (textView instanceof androidx.core.widget.b) {
            return ((androidx.core.widget.b) textView).getAutoSizeMaxTextSize();
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int b(@o0 TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return c.b(textView);
        }
        if (textView instanceof androidx.core.widget.b) {
            return ((androidx.core.widget.b) textView).getAutoSizeMinTextSize();
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int c(@o0 TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return c.c(textView);
        }
        if (textView instanceof androidx.core.widget.b) {
            return ((androidx.core.widget.b) textView).getAutoSizeStepGranularity();
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0
    public static int[] d(@o0 TextView textView) {
        return Build.VERSION.SDK_INT >= 27 ? c.d(textView) : textView instanceof androidx.core.widget.b ? ((androidx.core.widget.b) textView).getAutoSizeTextAvailableSizes() : new int[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int e(@o0 TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return c.e(textView);
        }
        if (textView instanceof androidx.core.widget.b) {
            return ((androidx.core.widget.b) textView).getAutoSizeTextType();
        }
        return 0;
    }

    @q0
    public static ColorStateList f(@o0 TextView textView) {
        textView.getClass();
        return textView.getCompoundDrawableTintList();
    }

    @q0
    public static PorterDuff.Mode g(@o0 TextView textView) {
        textView.getClass();
        return textView.getCompoundDrawableTintMode();
    }

    @o0
    @w0(expression = "textView.getCompoundDrawablesRelative()")
    @Deprecated
    public static Drawable[] h(@o0 TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }

    public static int i(@o0 TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    public static int j(@o0 TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    @w0(expression = "textView.getMaxLines()")
    @Deprecated
    public static int k(@o0 TextView textView) {
        return textView.getMaxLines();
    }

    @w0(expression = "textView.getMinLines()")
    @Deprecated
    public static int l(@o0 TextView textView) {
        return textView.getMinLines();
    }

    private static int m(@o0 TextDirectionHeuristic textDirectionHeuristic) {
        TextDirectionHeuristic textDirectionHeuristic2;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        if (textDirectionHeuristic == textDirectionHeuristic3 || textDirectionHeuristic == (textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
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
        if (textDirectionHeuristic == textDirectionHeuristic2) {
            return 6;
        }
        return textDirectionHeuristic == textDirectionHeuristic3 ? 7 : 1;
    }

    private static TextDirectionHeuristic n(@o0 TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        if (Build.VERSION.SDK_INT >= 28 && (textView.getInputType() & 15) == 3) {
            byte directionality = Character.getDirectionality(d.b(DecimalFormatSymbols.getInstance(textView.getTextLocale()))[0].codePointAt(0));
            return (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        boolean z4 = textView.getLayoutDirection() == 1;
        switch (textView.getTextDirection()) {
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
                if (!z4) {
                    break;
                } else {
                    break;
                }
        }
        return TextDirectionHeuristics.LTR;
    }

    @o0
    public static p.b o(@o0 TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new p.b(d.c(textView));
        }
        p.b.a aVar = new p.b.a(new TextPaint(textView.getPaint()));
        aVar.b(textView.getBreakStrategy());
        aVar.c(textView.getHyphenationFrequency());
        aVar.d(n(textView));
        return aVar.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void p(@o0 TextView textView, int i4, int i5, int i6, int i7) throws IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 27) {
            c.f(textView, i4, i5, i6, i7);
        } else if (textView instanceof androidx.core.widget.b) {
            ((androidx.core.widget.b) textView).setAutoSizeTextTypeUniformWithConfiguration(i4, i5, i6, i7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void q(@o0 TextView textView, @o0 int[] iArr, int i4) throws IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 27) {
            c.g(textView, iArr, i4);
        } else if (textView instanceof androidx.core.widget.b) {
            ((androidx.core.widget.b) textView).setAutoSizeTextTypeUniformWithPresetSizes(iArr, i4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void r(@o0 TextView textView, int i4) {
        if (Build.VERSION.SDK_INT >= 27) {
            c.h(textView, i4);
        } else if (textView instanceof androidx.core.widget.b) {
            ((androidx.core.widget.b) textView).setAutoSizeTextTypeWithDefaults(i4);
        }
    }

    public static void s(@o0 TextView textView, @q0 ColorStateList colorStateList) {
        textView.getClass();
        textView.setCompoundDrawableTintList(colorStateList);
    }

    public static void t(@o0 TextView textView, @q0 PorterDuff.Mode mode) {
        textView.getClass();
        textView.setCompoundDrawableTintMode(mode);
    }

    @w0(expression = "textView.setCompoundDrawablesRelative(start, top, end, bottom)")
    @Deprecated
    public static void u(@o0 TextView textView, @q0 Drawable drawable, @q0 Drawable drawable2, @q0 Drawable drawable3, @q0 Drawable drawable4) {
        textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @w0(expression = "textView.setCompoundDrawablesRelativeWithIntrinsicBounds(start, top, end, bottom)")
    @Deprecated
    public static void v(@o0 TextView textView, @androidx.annotation.v int i4, @androidx.annotation.v int i5, @androidx.annotation.v int i6, @androidx.annotation.v int i7) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i4, i5, i6, i7);
    }

    @w0(expression = "textView.setCompoundDrawablesRelativeWithIntrinsicBounds(start, top, end, bottom)")
    @Deprecated
    public static void w(@o0 TextView textView, @q0 Drawable drawable, @q0 Drawable drawable2, @q0 Drawable drawable3, @q0 Drawable drawable4) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @w0(expression = "textView.setCustomSelectionActionModeCallback(callback)")
    @Deprecated
    public static void x(@o0 TextView textView, @o0 ActionMode.Callback callback) {
        textView.setCustomSelectionActionModeCallback(G(textView, callback));
    }

    public static void y(@o0 TextView textView, @u0 @g0(from = 0) int i4) {
        androidx.core.util.w.i(i4);
        if (Build.VERSION.SDK_INT >= 28) {
            d.d(textView, i4);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i5 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i4 > Math.abs(i5)) {
            textView.setPadding(textView.getPaddingLeft(), i4 + i5, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void z(@o0 TextView textView, @u0 @g0(from = 0) int i4) {
        androidx.core.util.w.i(i4);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i5 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i4 > Math.abs(i5)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i4 - i5);
        }
    }
}
