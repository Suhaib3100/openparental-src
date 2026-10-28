package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.View;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.AppCompatToggleButton;
import androidx.collection.a3;
import androidx.core.view.x1;
import d.a;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: AppCompatViewInflater.java */
/* loaded from: classes.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f949a = new Object[2];

    /* renamed from: h, reason: collision with root package name */
    private static final String f947h = "AppCompatViewInflater";

    /* renamed from: b, reason: collision with root package name */
    private static final Class<?>[] f941b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f942c = {R.attr.onClick};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f943d = {R.attr.accessibilityHeading};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f944e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f945f = {R.attr.screenReaderFocusable};

    /* renamed from: g, reason: collision with root package name */
    private static final String[] f946g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: i, reason: collision with root package name */
    private static final a3<String, Constructor<? extends View>> f948i = new a3<>();

    /* compiled from: AppCompatViewInflater.java */
    private static class a implements View.OnClickListener {

        /* renamed from: b, reason: collision with root package name */
        private final View f950b;

        /* renamed from: c, reason: collision with root package name */
        private final String f951c;

        /* renamed from: d, reason: collision with root package name */
        private Method f952d;

        /* renamed from: e, reason: collision with root package name */
        private Context f953e;

        public a(@o0 View view, @o0 String str) {
            this.f950b = view;
            this.f951c = str;
        }

        private void a(@q0 Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f951c, View.class)) != null) {
                        this.f952d = method;
                        this.f953e = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id2 = this.f950b.getId();
            if (id2 == -1) {
                str = "";
            } else {
                str = " with id '" + this.f950b.getContext().getResources().getResourceEntryName(id2) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f951c + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f950b.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@o0 View view) {
            if (this.f952d == null) {
                a(this.f950b.getContext());
            }
            try {
                this.f952d.invoke(this.f953e, view);
            } catch (IllegalAccessException e4) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e4);
            } catch (InvocationTargetException e5) {
                throw new IllegalStateException("Could not execute method for android:onClick", e5);
            }
        }
    }

    private void a(@o0 Context context, @o0 View view, @o0 AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT > 28) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f943d);
        if (obtainStyledAttributes.hasValue(0)) {
            x1.I1(view, obtainStyledAttributes.getBoolean(0, false));
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f944e);
        if (obtainStyledAttributes2.hasValue(0)) {
            x1.K1(view, obtainStyledAttributes2.getString(0));
        }
        obtainStyledAttributes2.recycle();
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f945f);
        if (obtainStyledAttributes3.hasValue(0)) {
            x1.x2(view, obtainStyledAttributes3.getBoolean(0, false));
        }
        obtainStyledAttributes3.recycle();
    }

    private void b(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && x1.N0(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f942c);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    private View s(Context context, String str, String str2) throws ClassNotFoundException, InflateException {
        String str3;
        a3<String, Constructor<? extends View>> a3Var = f948i;
        Constructor<? extends View> constructor = a3Var.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f941b);
            a3Var.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.f949a);
    }

    private View t(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.f949a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return s(context, str, null);
            }
            int i4 = 0;
            while (true) {
                String[] strArr = f946g;
                if (i4 >= strArr.length) {
                    return null;
                }
                View s4 = s(context, str, strArr[i4]);
                if (s4 != null) {
                    return s4;
                }
                i4++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.f949a;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    private static Context u(Context context, AttributeSet attributeSet, boolean z4, boolean z5) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.m.K6, 0, 0);
        int resourceId = z4 ? obtainStyledAttributes.getResourceId(a.m.L6, 0) : 0;
        if (z5 && resourceId == 0) {
            resourceId = obtainStyledAttributes.getResourceId(a.m.P6, 0);
        }
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? ((context instanceof androidx.appcompat.view.d) && ((androidx.appcompat.view.d) context).c() == resourceId) ? context : new androidx.appcompat.view.d(context, resourceId) : context;
    }

    private void v(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    @o0
    protected AppCompatAutoCompleteTextView c(Context context, AttributeSet attributeSet) {
        return new AppCompatAutoCompleteTextView(context, attributeSet);
    }

    @o0
    protected AppCompatButton d(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    @o0
    protected AppCompatCheckBox e(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    @o0
    protected AppCompatCheckedTextView f(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckedTextView(context, attributeSet);
    }

    @o0
    protected AppCompatEditText g(Context context, AttributeSet attributeSet) {
        return new AppCompatEditText(context, attributeSet);
    }

    @o0
    protected AppCompatImageButton h(Context context, AttributeSet attributeSet) {
        return new AppCompatImageButton(context, attributeSet);
    }

    @o0
    protected AppCompatImageView i(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    @o0
    protected AppCompatMultiAutoCompleteTextView j(Context context, AttributeSet attributeSet) {
        return new AppCompatMultiAutoCompleteTextView(context, attributeSet);
    }

    @o0
    protected AppCompatRadioButton k(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    @o0
    protected AppCompatRatingBar l(Context context, AttributeSet attributeSet) {
        return new AppCompatRatingBar(context, attributeSet);
    }

    @o0
    protected AppCompatSeekBar m(Context context, AttributeSet attributeSet) {
        return new AppCompatSeekBar(context, attributeSet);
    }

    @o0
    protected AppCompatSpinner n(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    @o0
    protected AppCompatTextView o(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    @o0
    protected AppCompatToggleButton p(Context context, AttributeSet attributeSet) {
        return new AppCompatToggleButton(context, attributeSet);
    }

    @q0
    protected View q(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @q0
    public final View r(@q0 View view, @o0 String str, @o0 Context context, @o0 AttributeSet attributeSet, boolean z4, boolean z5, boolean z6, boolean z7) {
        View l4;
        Context context2 = (!z4 || view == null) ? context : view.getContext();
        if (z5 || z6) {
            context2 = u(context2, attributeSet, z5, z6);
        }
        if (z7) {
            context2 = androidx.appcompat.widget.q0.b(context2);
        }
        str.getClass();
        char c5 = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c5 = 0;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c5 = 1;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c5 = 2;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c5 = 3;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c5 = 4;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c5 = 5;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c5 = 6;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c5 = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c5 = '\b';
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c5 = '\t';
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c5 = '\n';
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c5 = 11;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c5 = '\f';
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c5 = org.apache.commons.lang3.m.f86065d;
                    break;
                }
                break;
        }
        switch (c5) {
            case 0:
                l4 = l(context2, attributeSet);
                v(l4, str);
                break;
            case 1:
                l4 = f(context2, attributeSet);
                v(l4, str);
                break;
            case 2:
                l4 = j(context2, attributeSet);
                v(l4, str);
                break;
            case 3:
                l4 = o(context2, attributeSet);
                v(l4, str);
                break;
            case 4:
                l4 = h(context2, attributeSet);
                v(l4, str);
                break;
            case 5:
                l4 = m(context2, attributeSet);
                v(l4, str);
                break;
            case 6:
                l4 = n(context2, attributeSet);
                v(l4, str);
                break;
            case 7:
                l4 = k(context2, attributeSet);
                v(l4, str);
                break;
            case '\b':
                l4 = p(context2, attributeSet);
                v(l4, str);
                break;
            case '\t':
                l4 = i(context2, attributeSet);
                v(l4, str);
                break;
            case '\n':
                l4 = c(context2, attributeSet);
                v(l4, str);
                break;
            case 11:
                l4 = e(context2, attributeSet);
                v(l4, str);
                break;
            case '\f':
                l4 = g(context2, attributeSet);
                v(l4, str);
                break;
            case '\r':
                l4 = d(context2, attributeSet);
                v(l4, str);
                break;
            default:
                l4 = q(context2, str, attributeSet);
                break;
        }
        if (l4 == null && context != context2) {
            l4 = t(context2, str, attributeSet);
        }
        if (l4 != null) {
            b(l4, attributeSet);
            a(context2, l4, attributeSet);
        }
        return l4;
    }
}
