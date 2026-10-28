package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
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
import androidx.appcompat.widget.w0;
import androidx.core.view.y1;
import d.a;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: AppCompatViewInflater.java */
/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f370a = new Object[2];

    /* renamed from: e, reason: collision with root package name */
    private static final String f368e = "AppCompatViewInflater";

    /* renamed from: b, reason: collision with root package name */
    private static final Class<?>[] f365b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f366c = {R.attr.onClick};

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f367d = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: f, reason: collision with root package name */
    private static final androidx.collection.i<String, Constructor<? extends View>> f369f = new androidx.collection.i<>();

    /* compiled from: AppCompatViewInflater.java */
    private static class a implements View.OnClickListener {

        /* renamed from: o, reason: collision with root package name */
        private final View f371o;

        /* renamed from: p, reason: collision with root package name */
        private final String f372p;

        /* renamed from: q, reason: collision with root package name */
        private Method f373q;

        /* renamed from: r, reason: collision with root package name */
        private Context f374r;

        public a(@o0 View view, @o0 String str) {
            this.f371o = view;
            this.f372p = str;
        }

        private void a(@q0 Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f372p, View.class)) != null) {
                        this.f373q = method;
                        this.f374r = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f371o.getId();
            if (id == -1) {
                str = "";
            } else {
                str = " with id '" + this.f371o.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f372p + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f371o.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@o0 View view) {
            if (this.f373q == null) {
                a(this.f371o.getContext());
            }
            try {
                this.f373q.invoke(this.f374r, view);
            } catch (IllegalAccessException e6) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e6);
            } catch (InvocationTargetException e7) {
                throw new IllegalStateException("Could not execute method for android:onClick", e7);
            }
        }
    }

    private void a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && y1.K0(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f366c);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    private View r(Context context, String str, String str2) throws ClassNotFoundException, InflateException {
        String str3;
        androidx.collection.i<String, Constructor<? extends View>> iVar = f369f;
        Constructor<? extends View> constructor = iVar.get(str);
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
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f365b);
            iVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.f370a);
    }

    private View s(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.f370a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return r(context, str, null);
            }
            int i5 = 0;
            while (true) {
                String[] strArr = f367d;
                if (i5 >= strArr.length) {
                    return null;
                }
                View r5 = r(context, str, strArr[i5]);
                if (r5 != null) {
                    return r5;
                }
                i5++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.f370a;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    private static Context t(Context context, AttributeSet attributeSet, boolean z5, boolean z6) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.n.X7, 0, 0);
        int resourceId = z5 ? obtainStyledAttributes.getResourceId(a.n.Y7, 0) : 0;
        if (z6 && resourceId == 0) {
            resourceId = obtainStyledAttributes.getResourceId(a.n.c8, 0);
        }
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? ((context instanceof androidx.appcompat.view.d) && ((androidx.appcompat.view.d) context).c() == resourceId) ? context : new androidx.appcompat.view.d(context, resourceId) : context;
    }

    private void u(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    @o0
    protected AppCompatAutoCompleteTextView b(Context context, AttributeSet attributeSet) {
        return new AppCompatAutoCompleteTextView(context, attributeSet);
    }

    @o0
    protected AppCompatButton c(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    @o0
    protected AppCompatCheckBox d(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    @o0
    protected AppCompatCheckedTextView e(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckedTextView(context, attributeSet);
    }

    @o0
    protected AppCompatEditText f(Context context, AttributeSet attributeSet) {
        return new AppCompatEditText(context, attributeSet);
    }

    @o0
    protected AppCompatImageButton g(Context context, AttributeSet attributeSet) {
        return new AppCompatImageButton(context, attributeSet);
    }

    @o0
    protected AppCompatImageView h(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    @o0
    protected AppCompatMultiAutoCompleteTextView i(Context context, AttributeSet attributeSet) {
        return new AppCompatMultiAutoCompleteTextView(context, attributeSet);
    }

    @o0
    protected AppCompatRadioButton j(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    @o0
    protected AppCompatRatingBar k(Context context, AttributeSet attributeSet) {
        return new AppCompatRatingBar(context, attributeSet);
    }

    @o0
    protected AppCompatSeekBar l(Context context, AttributeSet attributeSet) {
        return new AppCompatSeekBar(context, attributeSet);
    }

    @o0
    protected AppCompatSpinner m(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    @o0
    protected AppCompatTextView n(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    @o0
    protected AppCompatToggleButton o(Context context, AttributeSet attributeSet) {
        return new AppCompatToggleButton(context, attributeSet);
    }

    @q0
    protected View p(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    final View q(View view, String str, @o0 Context context, @o0 AttributeSet attributeSet, boolean z5, boolean z6, boolean z7, boolean z8) {
        Context context2;
        View k5;
        context2 = (!z5 || view == null) ? context : view.getContext();
        if (z6 || z7) {
            context2 = t(context2, attributeSet, z6, z7);
        }
        if (z8) {
            context2 = w0.b(context2);
        }
        str.getClass();
        switch (str) {
            case "RatingBar":
                k5 = k(context2, attributeSet);
                u(k5, str);
                break;
            case "CheckedTextView":
                k5 = e(context2, attributeSet);
                u(k5, str);
                break;
            case "MultiAutoCompleteTextView":
                k5 = i(context2, attributeSet);
                u(k5, str);
                break;
            case "TextView":
                k5 = n(context2, attributeSet);
                u(k5, str);
                break;
            case "ImageButton":
                k5 = g(context2, attributeSet);
                u(k5, str);
                break;
            case "SeekBar":
                k5 = l(context2, attributeSet);
                u(k5, str);
                break;
            case "Spinner":
                k5 = m(context2, attributeSet);
                u(k5, str);
                break;
            case "RadioButton":
                k5 = j(context2, attributeSet);
                u(k5, str);
                break;
            case "ToggleButton":
                k5 = o(context2, attributeSet);
                u(k5, str);
                break;
            case "ImageView":
                k5 = h(context2, attributeSet);
                u(k5, str);
                break;
            case "AutoCompleteTextView":
                k5 = b(context2, attributeSet);
                u(k5, str);
                break;
            case "CheckBox":
                k5 = d(context2, attributeSet);
                u(k5, str);
                break;
            case "EditText":
                k5 = f(context2, attributeSet);
                u(k5, str);
                break;
            case "Button":
                k5 = c(context2, attributeSet);
                u(k5, str);
                break;
            default:
                k5 = p(context2, str, attributeSet);
                break;
        }
        if (k5 == null && context != context2) {
            k5 = s(context2, str, attributeSet);
        }
        if (k5 != null) {
            a(k5, attributeSet);
        }
        return k5;
    }
}
