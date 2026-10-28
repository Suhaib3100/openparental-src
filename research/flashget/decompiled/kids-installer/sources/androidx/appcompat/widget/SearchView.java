package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.c1;
import androidx.core.view.y1;
import androidx.customview.view.AbsSavedState;
import d.a;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.apache.log4j.net.SyslogAppender;

/* loaded from: classes2.dex */
public class SearchView extends LinearLayoutCompat implements androidx.appcompat.view.c {
    static final boolean Q0 = false;
    static final n T0;
    private boolean A0;
    private CharSequence B0;
    private CharSequence C0;
    private boolean D0;
    private int E0;
    SearchableInfo F0;
    private Bundle G0;
    private final Runnable H0;
    private Runnable I0;
    private final WeakHashMap<String, Drawable.ConstantState> J0;
    private final View.OnClickListener K0;
    View.OnKeyListener L0;
    private final TextView.OnEditorActionListener M0;
    private final AdapterView.OnItemClickListener N0;
    private final AdapterView.OnItemSelectedListener O0;
    final SearchAutoComplete P;
    private TextWatcher P0;
    private final View Q;
    private final View R;
    private final View S;
    final ImageView T;
    final ImageView U;
    final ImageView V;
    final ImageView W;

    /* renamed from: a0, reason: collision with root package name */
    private final View f978a0;

    /* renamed from: b0, reason: collision with root package name */
    private o f979b0;

    /* renamed from: c0, reason: collision with root package name */
    private Rect f980c0;

    /* renamed from: d0, reason: collision with root package name */
    private Rect f981d0;

    /* renamed from: e0, reason: collision with root package name */
    private int[] f982e0;

    /* renamed from: f0, reason: collision with root package name */
    private int[] f983f0;

    /* renamed from: g0, reason: collision with root package name */
    private final ImageView f984g0;

    /* renamed from: h0, reason: collision with root package name */
    private final Drawable f985h0;

    /* renamed from: i0, reason: collision with root package name */
    private final int f986i0;

    /* renamed from: j0, reason: collision with root package name */
    private final int f987j0;

    /* renamed from: k0, reason: collision with root package name */
    private final Intent f988k0;

    /* renamed from: l0, reason: collision with root package name */
    private final Intent f989l0;

    /* renamed from: m0, reason: collision with root package name */
    private final CharSequence f990m0;

    /* renamed from: n0, reason: collision with root package name */
    private l f991n0;

    /* renamed from: o0, reason: collision with root package name */
    private k f992o0;

    /* renamed from: p0, reason: collision with root package name */
    View.OnFocusChangeListener f993p0;

    /* renamed from: q0, reason: collision with root package name */
    private m f994q0;

    /* renamed from: r0, reason: collision with root package name */
    private View.OnClickListener f995r0;

    /* renamed from: s0, reason: collision with root package name */
    private boolean f996s0;

    /* renamed from: t0, reason: collision with root package name */
    private boolean f997t0;

    /* renamed from: u0, reason: collision with root package name */
    androidx.cursoradapter.widget.a f998u0;

    /* renamed from: v0, reason: collision with root package name */
    private boolean f999v0;

    /* renamed from: w0, reason: collision with root package name */
    private CharSequence f1000w0;

    /* renamed from: x0, reason: collision with root package name */
    private boolean f1001x0;

    /* renamed from: y0, reason: collision with root package name */
    private boolean f1002y0;

    /* renamed from: z0, reason: collision with root package name */
    private int f1003z0;
    private static final String S0 = "nm";
    static final String R0 = "SearchView";

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: q, reason: collision with root package name */
        boolean f1004q;

        /* loaded from: classes.dex */
        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i5) {
                return new SavedState[i5];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f1004q + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i5) {
            super.writeToParcel(parcel, i5);
            parcel.writeValue(Boolean.valueOf(this.f1004q));
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1004q = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes3.dex */
    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {

        /* renamed from: r, reason: collision with root package name */
        private int f1005r;

        /* renamed from: s, reason: collision with root package name */
        private SearchView f1006s;

        /* renamed from: t, reason: collision with root package name */
        private boolean f1007t;

        /* renamed from: u, reason: collision with root package name */
        final Runnable f1008u;

        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.g();
            }
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        private int b() {
            Configuration configuration = getResources().getConfiguration();
            int i5 = configuration.screenWidthDp;
            int i6 = configuration.screenHeightDp;
            if (i5 >= 960 && i6 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i5 >= 600) {
                return 192;
            }
            if (i5 < 640 || i6 < 480) {
                return SyslogAppender.LOG_LOCAL4;
            }
            return 192;
        }

        void a() {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.T0.c(this);
                return;
            }
            setInputMethodMode(1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        boolean c() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        void d(boolean z5) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z5) {
                this.f1007t = false;
                removeCallbacks(this.f1008u);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f1007t = true;
                    return;
                }
                this.f1007t = false;
                removeCallbacks(this.f1008u);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f1005r <= 0 || super.enoughToFilter();
        }

        void f(SearchView searchView) {
            this.f1006s = searchView;
        }

        void g() {
            if (this.f1007t) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f1007t = false;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatAutoCompleteTextView, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1007t) {
                removeCallbacks(this.f1008u);
                post(this.f1008u);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, b(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z5, int i5, Rect rect) {
            super.onFocusChanged(z5, i5, rect);
            this.f1006s.K0();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i5, KeyEvent keyEvent) {
            if (i5 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1006s.clearFocus();
                        d(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i5, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z5) {
            super.onWindowFocusChanged(z5);
            if (z5 && this.f1006s.hasFocus() && getVisibility() == 0) {
                this.f1007t = true;
                if (SearchView.v0(getContext())) {
                    a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i5) {
            super.setThreshold(i5);
            this.f1005r = i5;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, a.c.T);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i5) {
            super(context, attributeSet, i5);
            this.f1008u = new a();
            this.f1005r = getThreshold();
        }
    }

    /* loaded from: classes.dex */
    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
            SearchView.this.J0(charSequence);
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.h1();
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.cursoradapter.widget.a aVar = SearchView.this.f998u0;
            if (aVar instanceof t0) {
                aVar.a(null);
            }
        }
    }

    /* loaded from: classes.dex */
    class d implements View.OnFocusChangeListener {
        d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z5) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f993p0;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z5);
            }
        }
    }

    /* loaded from: classes.dex */
    class e implements View.OnLayoutChangeListener {
        e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
            SearchView.this.Z();
        }
    }

    /* loaded from: classes.dex */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.T) {
                searchView.G0();
                return;
            }
            if (view == searchView.V) {
                searchView.C0();
                return;
            }
            if (view == searchView.U) {
                searchView.H0();
            } else if (view == searchView.W) {
                searchView.L0();
            } else if (view == searchView.P) {
                searchView.f0();
            }
        }
    }

    /* loaded from: classes.dex */
    class g implements View.OnKeyListener {
        g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i5, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.F0 == null) {
                return false;
            }
            if (searchView.P.isPopupShowing() && SearchView.this.P.getListSelection() != -1) {
                return SearchView.this.I0(view, i5, keyEvent);
            }
            if (SearchView.this.P.c() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i5 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.A0(0, null, searchView2.P.getText().toString());
            return true;
        }
    }

    /* loaded from: classes.dex */
    class h implements TextView.OnEditorActionListener {
        h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i5, KeyEvent keyEvent) {
            SearchView.this.H0();
            return true;
        }
    }

    /* loaded from: classes.dex */
    class i implements AdapterView.OnItemClickListener {
        i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i5, long j5) {
            SearchView.this.D0(i5, 0, null);
        }
    }

    /* loaded from: classes.dex */
    class j implements AdapterView.OnItemSelectedListener {
        j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i5, long j5) {
            SearchView.this.E0(i5);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* loaded from: classes.dex */
    public interface k {
        boolean onClose();
    }

    /* loaded from: classes.dex */
    public interface l {
        boolean onQueryTextChange(String str);

        boolean onQueryTextSubmit(String str);
    }

    /* loaded from: classes.dex */
    public interface m {
        boolean onSuggestionClick(int i5);

        boolean onSuggestionSelect(int i5);
    }

    /* loaded from: classes.dex */
    private static class n {

        /* renamed from: a, reason: collision with root package name */
        private Method f1020a;

        /* renamed from: b, reason: collision with root package name */
        private Method f1021b;

        /* renamed from: c, reason: collision with root package name */
        private Method f1022c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        n() {
            this.f1020a = null;
            this.f1021b = null;
            this.f1022c = null;
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f1020a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f1021b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f1022c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        private static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f1021b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f1020a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f1022c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* loaded from: classes.dex */
    private static class o extends TouchDelegate {

        /* renamed from: a, reason: collision with root package name */
        private final View f1023a;

        /* renamed from: b, reason: collision with root package name */
        private final Rect f1024b;

        /* renamed from: c, reason: collision with root package name */
        private final Rect f1025c;

        /* renamed from: d, reason: collision with root package name */
        private final Rect f1026d;

        /* renamed from: e, reason: collision with root package name */
        private final int f1027e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f1028f;

        public o(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f1027e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f1024b = new Rect();
            this.f1026d = new Rect();
            this.f1025c = new Rect();
            a(rect, rect2);
            this.f1023a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f1024b.set(rect);
            this.f1026d.set(rect);
            Rect rect3 = this.f1026d;
            int i5 = this.f1027e;
            rect3.inset(-i5, -i5);
            this.f1025c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z5;
            boolean z6;
            int x5 = (int) motionEvent.getX();
            int y5 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z7 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z6 = this.f1028f;
                    if (z6 && !this.f1026d.contains(x5, y5)) {
                        z7 = z6;
                        z5 = false;
                    }
                } else {
                    if (action == 3) {
                        z6 = this.f1028f;
                        this.f1028f = false;
                    }
                    z5 = true;
                    z7 = false;
                }
                z7 = z6;
                z5 = true;
            } else {
                if (this.f1024b.contains(x5, y5)) {
                    this.f1028f = true;
                    z5 = true;
                }
                z5 = true;
                z7 = false;
            }
            if (!z7) {
                return false;
            }
            if (!z5 || this.f1025c.contains(x5, y5)) {
                Rect rect = this.f1025c;
                motionEvent.setLocation(x5 - rect.left, y5 - rect.top);
            } else {
                motionEvent.setLocation(this.f1023a.getWidth() / 2, this.f1023a.getHeight() / 2);
            }
            return this.f1023a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        T0 = Build.VERSION.SDK_INT < 29 ? new n() : null;
    }

    public SearchView(@androidx.annotation.o0 Context context) {
        this(context, null);
    }

    private boolean B0(int i5, int i6, String str) {
        Cursor b6 = this.f998u0.b();
        if (b6 == null || !b6.moveToPosition(i5)) {
            return false;
        }
        z0(b0(b6, i6, str));
        return true;
    }

    private void M0() {
        post(this.H0);
    }

    private void N0(int i5) {
        Editable text = this.P.getText();
        Cursor b6 = this.f998u0.b();
        if (b6 == null) {
            return;
        }
        if (!b6.moveToPosition(i5)) {
            Z0(text);
            return;
        }
        CharSequence convertToString = this.f998u0.convertToString(b6);
        if (convertToString != null) {
            Z0(convertToString);
        } else {
            Z0(text);
        }
    }

    private void Z0(CharSequence charSequence) {
        this.P.setText(charSequence);
        this.P.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    private Intent a0(String str, Uri uri, String str2, String str3, int i5, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.C0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.G0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i5 != 0) {
            intent.putExtra("action_key", i5);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.F0.getSearchActivity());
        return intent;
    }

    private Intent b0(Cursor cursor, int i5, String str) {
        String t5;
        try {
            try {
                String t6 = t0.t(cursor, "suggest_intent_action");
                if (t6 == null) {
                    t6 = this.F0.getSuggestIntentAction();
                }
                if (t6 == null) {
                    t6 = "android.intent.action.SEARCH";
                }
                String str2 = t6;
                String t7 = t0.t(cursor, "suggest_intent_data");
                if (t7 == null) {
                    t7 = this.F0.getSuggestIntentData();
                }
                if (t7 != null && (t5 = t0.t(cursor, "suggest_intent_data_id")) != null) {
                    t7 = t7 + "/" + Uri.encode(t5);
                }
                return a0(str2, t7 == null ? null : Uri.parse(t7), t0.t(cursor, "suggest_intent_extra_data"), t0.t(cursor, "suggest_intent_query"), i5, str);
            } catch (RuntimeException unused) {
                cursor.getPosition();
                return null;
            }
        } catch (RuntimeException unused2) {
            return null;
        }
    }

    private Intent c0(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, androidx.constraintlayout.solver.widgets.analyzer.b.f2366g);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.G0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    private Intent d0(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    private void e0() {
        this.P.dismissDropDown();
    }

    private void g0(View view, Rect rect) {
        view.getLocationInWindow(this.f982e0);
        getLocationInWindow(this.f983f0);
        int[] iArr = this.f982e0;
        int i5 = iArr[1];
        int[] iArr2 = this.f983f0;
        int i6 = i5 - iArr2[1];
        int i7 = iArr[0] - iArr2[0];
        rect.set(i7, i6, view.getWidth() + i7, view.getHeight() + i6);
    }

    private void g1() {
        boolean z5 = true;
        boolean z6 = !TextUtils.isEmpty(this.P.getText());
        if (!z6 && (!this.f996s0 || this.D0)) {
            z5 = false;
        }
        this.V.setVisibility(z5 ? 0 : 8);
        Drawable drawable = this.V.getDrawable();
        if (drawable != null) {
            drawable.setState(z6 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private CharSequence h0(CharSequence charSequence) {
        if (!this.f996s0 || this.f985h0 == null) {
            return charSequence;
        }
        int textSize = (int) (this.P.getTextSize() * 1.25d);
        this.f985h0.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f985h0), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private void i1() {
        CharSequence o02 = o0();
        SearchAutoComplete searchAutoComplete = this.P;
        if (o02 == null) {
            o02 = "";
        }
        searchAutoComplete.setHint(h0(o02));
    }

    private void j1() {
        this.P.setThreshold(this.F0.getSuggestThreshold());
        this.P.setImeOptions(this.F0.getImeOptions());
        int inputType = this.F0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.F0.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.P.setInputType(inputType);
        androidx.cursoradapter.widget.a aVar = this.f998u0;
        if (aVar != null) {
            aVar.a(null);
        }
        if (this.F0.getSuggestAuthority() != null) {
            t0 t0Var = new t0(getContext(), this, this.F0, this.J0);
            this.f998u0 = t0Var;
            this.P.setAdapter(t0Var);
            ((t0) this.f998u0).D(this.f1001x0 ? 2 : 1);
        }
    }

    private void k1() {
        this.S.setVisibility((x0() && (this.U.getVisibility() == 0 || this.W.getVisibility() == 0)) ? 0 : 8);
    }

    private int l0() {
        return getContext().getResources().getDimensionPixelSize(a.f.f21741c0);
    }

    private void l1(boolean z5) {
        this.U.setVisibility((this.f999v0 && x0() && hasFocus() && (z5 || !this.A0)) ? 0 : 8);
    }

    private int m0() {
        return getContext().getResources().getDimensionPixelSize(a.f.f21744d0);
    }

    private void m1(boolean z5) {
        this.f997t0 = z5;
        int i5 = z5 ? 0 : 8;
        boolean z6 = !TextUtils.isEmpty(this.P.getText());
        this.T.setVisibility(i5);
        l1(z6);
        this.Q.setVisibility(z5 ? 8 : 0);
        this.f984g0.setVisibility((this.f984g0.getDrawable() == null || this.f996s0) ? 8 : 0);
        g1();
        n1(!z6);
        k1();
    }

    private void n1(boolean z5) {
        int i5 = 8;
        if (this.A0 && !u0() && z5) {
            this.U.setVisibility(8);
            i5 = 0;
        }
        this.W.setVisibility(i5);
    }

    private boolean s0() {
        SearchableInfo searchableInfo = this.F0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = this.F0.getVoiceSearchLaunchWebSearch() ? this.f988k0 : this.F0.getVoiceSearchLaunchRecognizer() ? this.f989l0 : null;
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    static boolean v0(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean x0() {
        return (this.f999v0 || this.A0) && !u0();
    }

    private void z0(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException unused) {
            intent.toString();
        }
    }

    void A0(int i5, String str, String str2) {
        getContext().startActivity(a0("android.intent.action.SEARCH", null, null, str2, i5, str));
    }

    void C0() {
        if (!TextUtils.isEmpty(this.P.getText())) {
            this.P.setText("");
            this.P.requestFocus();
            this.P.d(true);
        } else if (this.f996s0) {
            k kVar = this.f992o0;
            if (kVar == null || !kVar.onClose()) {
                clearFocus();
                m1(true);
            }
        }
    }

    boolean D0(int i5, int i6, String str) {
        m mVar = this.f994q0;
        if (mVar != null && mVar.onSuggestionClick(i5)) {
            return false;
        }
        B0(i5, 0, null);
        this.P.d(false);
        e0();
        return true;
    }

    boolean E0(int i5) {
        m mVar = this.f994q0;
        if (mVar != null && mVar.onSuggestionSelect(i5)) {
            return false;
        }
        N0(i5);
        return true;
    }

    void F0(CharSequence charSequence) {
        Z0(charSequence);
    }

    void G0() {
        m1(false);
        this.P.requestFocus();
        this.P.d(true);
        View.OnClickListener onClickListener = this.f995r0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    void H0() {
        Editable text = this.P.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        l lVar = this.f991n0;
        if (lVar == null || !lVar.onQueryTextSubmit(text.toString())) {
            if (this.F0 != null) {
                A0(0, null, text.toString());
            }
            this.P.d(false);
            e0();
        }
    }

    boolean I0(View view, int i5, KeyEvent keyEvent) {
        if (this.F0 != null && this.f998u0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i5 == 66 || i5 == 84 || i5 == 61) {
                return D0(this.P.getListSelection(), 0, null);
            }
            if (i5 == 21 || i5 == 22) {
                this.P.setSelection(i5 == 21 ? 0 : this.P.length());
                this.P.setListSelection(0);
                this.P.clearListSelection();
                this.P.a();
                return true;
            }
            if (i5 == 19) {
                this.P.getListSelection();
                return false;
            }
        }
        return false;
    }

    void J0(CharSequence charSequence) {
        Editable text = this.P.getText();
        this.C0 = text;
        boolean z5 = !TextUtils.isEmpty(text);
        l1(z5);
        n1(!z5);
        g1();
        k1();
        if (this.f991n0 != null && !TextUtils.equals(charSequence, this.B0)) {
            this.f991n0.onQueryTextChange(charSequence.toString());
        }
        this.B0 = charSequence.toString();
    }

    void K0() {
        m1(u0());
        M0();
        if (this.P.hasFocus()) {
            f0();
        }
    }

    void L0() {
        SearchableInfo searchableInfo = this.F0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                getContext().startActivity(d0(this.f988k0, searchableInfo));
            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                getContext().startActivity(c0(this.f989l0, searchableInfo));
            }
        } catch (ActivityNotFoundException unused) {
        }
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void O0(Bundle bundle) {
        this.G0 = bundle;
    }

    public void P0(boolean z5) {
        if (z5) {
            C0();
        } else {
            G0();
        }
    }

    public void Q0(boolean z5) {
        if (this.f996s0 == z5) {
            return;
        }
        this.f996s0 = z5;
        m1(z5);
        i1();
    }

    public void R0(int i5) {
        this.P.setImeOptions(i5);
    }

    public void S0(int i5) {
        this.P.setInputType(i5);
    }

    public void T0(int i5) {
        this.f1003z0 = i5;
        requestLayout();
    }

    public void U0(k kVar) {
        this.f992o0 = kVar;
    }

    public void V0(View.OnFocusChangeListener onFocusChangeListener) {
        this.f993p0 = onFocusChangeListener;
    }

    public void W0(l lVar) {
        this.f991n0 = lVar;
    }

    public void X0(View.OnClickListener onClickListener) {
        this.f995r0 = onClickListener;
    }

    public void Y0(m mVar) {
        this.f994q0 = mVar;
    }

    void Z() {
        if (this.f978a0.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.R.getPaddingLeft();
            Rect rect = new Rect();
            boolean b6 = g1.b(this);
            int dimensionPixelSize = this.f996s0 ? resources.getDimensionPixelSize(a.f.Q) + resources.getDimensionPixelSize(a.f.P) : 0;
            this.P.getDropDownBackground().getPadding(rect);
            this.P.setDropDownHorizontalOffset(b6 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            this.P.setDropDownWidth((((this.f978a0.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    public void a1(CharSequence charSequence, boolean z5) {
        this.P.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.P;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.C0 = charSequence;
        }
        if (!z5 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        H0();
    }

    public void b1(@androidx.annotation.q0 CharSequence charSequence) {
        this.f1000w0 = charSequence;
        i1();
    }

    public void c1(boolean z5) {
        this.f1001x0 = z5;
        androidx.cursoradapter.widget.a aVar = this.f998u0;
        if (aVar instanceof t0) {
            ((t0) aVar).D(z5 ? 2 : 1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f1002y0 = true;
        super.clearFocus();
        this.P.clearFocus();
        this.P.d(false);
        this.f1002y0 = false;
    }

    public void d1(SearchableInfo searchableInfo) {
        this.F0 = searchableInfo;
        if (searchableInfo != null) {
            j1();
            i1();
        }
        boolean s02 = s0();
        this.A0 = s02;
        if (s02) {
            this.P.setPrivateImeOptions("nm");
        }
        m1(u0());
    }

    public void e1(boolean z5) {
        this.f999v0 = z5;
        m1(u0());
    }

    void f0() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.P.refreshAutoCompleteResults();
            return;
        }
        n nVar = T0;
        nVar.b(this.P);
        nVar.a(this.P);
    }

    public void f1(androidx.cursoradapter.widget.a aVar) {
        this.f998u0 = aVar;
        this.P.setAdapter(aVar);
    }

    void h1() {
        int[] iArr = this.P.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.R.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.S.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public int i0() {
        return this.P.getImeOptions();
    }

    public int j0() {
        return this.P.getInputType();
    }

    public int k0() {
        return this.f1003z0;
    }

    public CharSequence n0() {
        return this.P.getText();
    }

    @androidx.annotation.q0
    public CharSequence o0() {
        CharSequence charSequence = this.f1000w0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.F0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f990m0 : getContext().getText(this.F0.getHintId());
    }

    @Override // androidx.appcompat.view.c
    public void onActionViewCollapsed() {
        a1("", false);
        clearFocus();
        m1(true);
        this.P.setImeOptions(this.E0);
        this.D0 = false;
    }

    @Override // androidx.appcompat.view.c
    public void onActionViewExpanded() {
        if (this.D0) {
            return;
        }
        this.D0 = true;
        int imeOptions = this.P.getImeOptions();
        this.E0 = imeOptions;
        this.P.setImeOptions(imeOptions | 33554432);
        this.P.setText("");
        P0(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.H0);
        post(this.I0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        super.onLayout(z5, i5, i6, i7, i8);
        if (z5) {
            g0(this.P, this.f980c0);
            Rect rect = this.f981d0;
            Rect rect2 = this.f980c0;
            rect.set(rect2.left, 0, rect2.right, i8 - i6);
            o oVar = this.f979b0;
            if (oVar != null) {
                oVar.a(this.f981d0, this.f980c0);
                return;
            }
            o oVar2 = new o(this.f981d0, this.f980c0, this.P);
            this.f979b0 = oVar2;
            setTouchDelegate(oVar2);
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected void onMeasure(int i5, int i6) {
        int i7;
        if (u0()) {
            super.onMeasure(i5, i6);
            return;
        }
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        if (mode == Integer.MIN_VALUE) {
            int i8 = this.f1003z0;
            size = i8 > 0 ? Math.min(i8, size) : Math.min(m0(), size);
        } else if (mode == 0) {
            size = this.f1003z0;
            if (size <= 0) {
                size = m0();
            }
        } else if (mode == 1073741824 && (i7 = this.f1003z0) > 0) {
            size = Math.min(i7, size);
        }
        int mode2 = View.MeasureSpec.getMode(i6);
        int size2 = View.MeasureSpec.getSize(i6);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(l0(), size2);
        } else if (mode2 == 0) {
            size2 = l0();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, androidx.constraintlayout.solver.widgets.analyzer.b.f2366g), View.MeasureSpec.makeMeasureSpec(size2, androidx.constraintlayout.solver.widgets.analyzer.b.f2366g));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        m1(savedState.f1004q);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1004q = u0();
        return savedState;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z5) {
        super.onWindowFocusChanged(z5);
        M0();
    }

    int p0() {
        return this.f987j0;
    }

    int q0() {
        return this.f986i0;
    }

    public androidx.cursoradapter.widget.a r0() {
        return this.f998u0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i5, Rect rect) {
        if (this.f1002y0 || !isFocusable()) {
            return false;
        }
        if (u0()) {
            return super.requestFocus(i5, rect);
        }
        boolean requestFocus = this.P.requestFocus(i5, rect);
        if (requestFocus) {
            m1(false);
        }
        return requestFocus;
    }

    public boolean t0() {
        return this.f996s0;
    }

    public boolean u0() {
        return this.f997t0;
    }

    public boolean w0() {
        return this.f1001x0;
    }

    public boolean y0() {
        return this.f999v0;
    }

    public SearchView(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.U2);
    }

    public SearchView(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.f980c0 = new Rect();
        this.f981d0 = new Rect();
        this.f982e0 = new int[2];
        this.f983f0 = new int[2];
        this.H0 = new b();
        this.I0 = new c();
        this.J0 = new WeakHashMap<>();
        f fVar = new f();
        this.K0 = fVar;
        this.L0 = new g();
        h hVar = new h();
        this.M0 = hVar;
        i iVar = new i();
        this.N0 = iVar;
        j jVar = new j();
        this.O0 = jVar;
        this.P0 = new a();
        z0 G = z0.G(context, attributeSet, a.n.f6, i5, 0);
        LayoutInflater.from(context).inflate(G.u(a.n.p6, a.k.f21969z), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(a.h.f21874g1);
        this.P = searchAutoComplete;
        searchAutoComplete.f(this);
        this.Q = findViewById(a.h.f21862c1);
        View findViewById = findViewById(a.h.f21871f1);
        this.R = findViewById;
        View findViewById2 = findViewById(a.h.f21907r1);
        this.S = findViewById2;
        ImageView imageView = (ImageView) findViewById(a.h.f21856a1);
        this.T = imageView;
        ImageView imageView2 = (ImageView) findViewById(a.h.f21865d1);
        this.U = imageView2;
        ImageView imageView3 = (ImageView) findViewById(a.h.f21859b1);
        this.V = imageView3;
        ImageView imageView4 = (ImageView) findViewById(a.h.f21877h1);
        this.W = imageView4;
        ImageView imageView5 = (ImageView) findViewById(a.h.f21868e1);
        this.f984g0 = imageView5;
        y1.I1(findViewById, G.h(a.n.q6));
        y1.I1(findViewById2, G.h(a.n.u6));
        int i6 = a.n.t6;
        imageView.setImageDrawable(G.h(i6));
        imageView2.setImageDrawable(G.h(a.n.n6));
        imageView3.setImageDrawable(G.h(a.n.k6));
        imageView4.setImageDrawable(G.h(a.n.w6));
        imageView5.setImageDrawable(G.h(i6));
        this.f985h0 = G.h(a.n.s6);
        c1.a(imageView, getResources().getString(a.l.f21991v));
        this.f986i0 = G.u(a.n.v6, a.k.f21968y);
        this.f987j0 = G.u(a.n.l6, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.P0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.L0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        Q0(G.a(a.n.o6, true));
        int g5 = G.g(a.n.h6, -1);
        if (g5 != -1) {
            T0(g5);
        }
        this.f990m0 = G.x(a.n.m6);
        this.f1000w0 = G.x(a.n.r6);
        int o5 = G.o(a.n.j6, -1);
        if (o5 != -1) {
            R0(o5);
        }
        int o6 = G.o(a.n.i6, -1);
        if (o6 != -1) {
            S0(o6);
        }
        setFocusable(G.a(a.n.g6, true));
        G.I();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f988k0 = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f989l0 = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f978a0 = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        m1(this.f996s0);
        i1();
    }
}
