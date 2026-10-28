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
import androidx.core.view.x1;
import androidx.customview.view.AbsSavedState;
import d.a;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.eclipse.paho.client.mqttv3.internal.ClientDefaults;

/* loaded from: classes.dex */
public class SearchView extends LinearLayoutCompat implements androidx.appcompat.view.c {

    /* renamed from: r3, reason: collision with root package name */
    static final boolean f1593r3 = false;

    /* renamed from: s3, reason: collision with root package name */
    static final String f1594s3 = "SearchView";

    /* renamed from: t3, reason: collision with root package name */
    private static final String f1595t3 = "nm";

    /* renamed from: u3, reason: collision with root package name */
    static final o f1596u3;
    final SearchAutoComplete C;
    private final View D;
    private final View E;
    private final View F;
    final ImageView G;
    final ImageView H;
    final ImageView I;
    final ImageView J;
    private final View K;
    private p L;
    private final Intent L2;
    private Rect M;
    private final Intent M2;
    private Rect N;
    private final CharSequence N2;
    private int[] O;
    private m O2;
    private int[] P;
    private l P2;
    private final ImageView Q;
    private final int Q1;
    View.OnFocusChangeListener Q2;
    private final Drawable R;
    private n R2;
    private View.OnClickListener S2;
    private boolean T2;
    private boolean U2;
    private final int V1;
    androidx.cursoradapter.widget.a V2;
    private boolean W2;
    private CharSequence X2;
    private boolean Y2;
    private boolean Z2;

    /* renamed from: a3, reason: collision with root package name */
    private int f1597a3;

    /* renamed from: b3, reason: collision with root package name */
    private boolean f1598b3;

    /* renamed from: c3, reason: collision with root package name */
    private CharSequence f1599c3;

    /* renamed from: d3, reason: collision with root package name */
    private CharSequence f1600d3;

    /* renamed from: e3, reason: collision with root package name */
    private boolean f1601e3;

    /* renamed from: f3, reason: collision with root package name */
    private int f1602f3;

    /* renamed from: g3, reason: collision with root package name */
    SearchableInfo f1603g3;

    /* renamed from: h3, reason: collision with root package name */
    private Bundle f1604h3;

    /* renamed from: i3, reason: collision with root package name */
    private final Runnable f1605i3;

    /* renamed from: j3, reason: collision with root package name */
    private Runnable f1606j3;

    /* renamed from: k3, reason: collision with root package name */
    private final WeakHashMap<String, Drawable.ConstantState> f1607k3;

    /* renamed from: l3, reason: collision with root package name */
    private final View.OnClickListener f1608l3;

    /* renamed from: m3, reason: collision with root package name */
    View.OnKeyListener f1609m3;

    /* renamed from: n3, reason: collision with root package name */
    private final TextView.OnEditorActionListener f1610n3;

    /* renamed from: o3, reason: collision with root package name */
    private final AdapterView.OnItemClickListener f1611o3;

    /* renamed from: p3, reason: collision with root package name */
    private final AdapterView.OnItemSelectedListener f1612p3;

    /* renamed from: q3, reason: collision with root package name */
    private TextWatcher f1613q3;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        boolean f1614d;

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
            public SavedState[] newArray(int i4) {
                return new SavedState[i4];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("SearchView.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" isIconified=");
            return androidx.appcompat.app.h.a(sb, this.f1614d, "}");
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeValue(Boolean.valueOf(this.f1614d));
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1614d = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {

        /* renamed from: f, reason: collision with root package name */
        private int f1615f;

        /* renamed from: g, reason: collision with root package name */
        private SearchView f1616g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f1617h;

        /* renamed from: i, reason: collision with root package name */
        final Runnable f1618i;

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

        private int c() {
            Configuration configuration = getResources().getConfiguration();
            int i4 = configuration.screenWidthDp;
            int i5 = configuration.screenHeightDp;
            if (i4 >= 960 && i5 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i4 < 600) {
                return (i4 < 640 || i5 < 480) ? 160 : 192;
            }
            return 192;
        }

        void b() {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.f1596u3.c(this);
                return;
            }
            k.b(this, 1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        boolean d() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        void e(boolean z4) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z4) {
                this.f1617h = false;
                removeCallbacks(this.f1618i);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f1617h = true;
                    return;
                }
                this.f1617h = false;
                removeCallbacks(this.f1618i);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f1615f <= 0 || super.enoughToFilter();
        }

        void f(SearchView searchView) {
            this.f1616g = searchView;
        }

        void g() {
            if (this.f1617h) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f1617h = false;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatAutoCompleteTextView, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1617h) {
                removeCallbacks(this.f1618i);
                post(this.f1618i);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, c(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z4, int i4, Rect rect) {
            super.onFocusChanged(z4, i4, rect);
            this.f1616g.M0();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i4, KeyEvent keyEvent) {
            if (i4 == 4) {
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
                        this.f1616g.clearFocus();
                        e(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i4, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z4) {
            super.onWindowFocusChanged(z4);
            if (z4 && this.f1616g.hasFocus() && getVisibility() == 0) {
                this.f1617h = true;
                if (SearchView.x0(getContext())) {
                    b();
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
        public void setThreshold(int i4) {
            super.setThreshold(i4);
            this.f1615f = i4;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, a.b.S);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i4) {
            super(context, attributeSet, i4);
            this.f1618i = new a();
            this.f1615f = getThreshold();
        }
    }

    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            SearchView.this.L0(charSequence);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.j1();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.cursoradapter.widget.a aVar = SearchView.this.V2;
            if (aVar instanceof n0) {
                aVar.b(null);
            }
        }
    }

    class d implements View.OnFocusChangeListener {
        d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z4) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.Q2;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z4);
            }
        }
    }

    class e implements View.OnLayoutChangeListener {
        e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i4, int i5, int i6, int i7, int i10, int i11, int i12, int i13) {
            SearchView.this.b0();
        }
    }

    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.G) {
                searchView.I0();
                return;
            }
            if (view == searchView.I) {
                searchView.E0();
                return;
            }
            if (view == searchView.H) {
                searchView.J0();
            } else if (view == searchView.J) {
                searchView.N0();
            } else if (view == searchView.C) {
                searchView.h0();
            }
        }
    }

    class g implements View.OnKeyListener {
        g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i4, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f1603g3 == null) {
                return false;
            }
            if (searchView.C.isPopupShowing() && SearchView.this.C.getListSelection() != -1) {
                return SearchView.this.K0(view, i4, keyEvent);
            }
            if (SearchView.this.C.d() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i4 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.C0(0, null, searchView2.C.getText().toString());
            return true;
        }
    }

    class h implements TextView.OnEditorActionListener {
        h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i4, KeyEvent keyEvent) {
            SearchView.this.J0();
            return true;
        }
    }

    class i implements AdapterView.OnItemClickListener {
        i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            SearchView.this.F0(i4, 0, null);
        }
    }

    class j implements AdapterView.OnItemSelectedListener {
        j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i4, long j4) {
            SearchView.this.G0(i4);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    @androidx.annotation.x0(29)
    static class k {
        private k() {
        }

        @androidx.annotation.u
        static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        @androidx.annotation.u
        static void b(SearchAutoComplete searchAutoComplete, int i4) {
            searchAutoComplete.setInputMethodMode(i4);
        }
    }

    public interface l {
        boolean a();
    }

    public interface m {
        boolean onQueryTextChange(String str);

        boolean onQueryTextSubmit(String str);
    }

    public interface n {
        boolean onSuggestionClick(int i4);

        boolean onSuggestionSelect(int i4);
    }

    private static class o {

        /* renamed from: a, reason: collision with root package name */
        private Method f1630a;

        /* renamed from: b, reason: collision with root package name */
        private Method f1631b;

        /* renamed from: c, reason: collision with root package name */
        private Method f1632c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        o() {
            this.f1630a = null;
            this.f1631b = null;
            this.f1632c = null;
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                this.f1630a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                this.f1631b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f1632c = method;
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
            Method method = this.f1631b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f1630a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f1632c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    private static class p extends TouchDelegate {

        /* renamed from: a, reason: collision with root package name */
        private final View f1633a;

        /* renamed from: b, reason: collision with root package name */
        private final Rect f1634b;

        /* renamed from: c, reason: collision with root package name */
        private final Rect f1635c;

        /* renamed from: d, reason: collision with root package name */
        private final Rect f1636d;

        /* renamed from: e, reason: collision with root package name */
        private final int f1637e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f1638f;

        public p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f1637e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f1634b = new Rect();
            this.f1636d = new Rect();
            this.f1635c = new Rect();
            a(rect, rect2);
            this.f1633a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f1634b.set(rect);
            this.f1636d.set(rect);
            Rect rect3 = this.f1636d;
            int i4 = this.f1637e;
            rect3.inset(-i4, -i4);
            this.f1635c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z4;
            boolean z5;
            int x4 = (int) motionEvent.getX();
            int y4 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z6 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z5 = this.f1638f;
                    if (z5 && !this.f1636d.contains(x4, y4)) {
                        z6 = z5;
                        z4 = false;
                    }
                } else {
                    if (action == 3) {
                        z5 = this.f1638f;
                        this.f1638f = false;
                    }
                    z4 = true;
                    z6 = false;
                }
                z6 = z5;
                z4 = true;
            } else {
                if (this.f1634b.contains(x4, y4)) {
                    this.f1638f = true;
                    z4 = true;
                }
                z4 = true;
                z6 = false;
            }
            if (!z6) {
                return false;
            }
            if (!z4 || this.f1635c.contains(x4, y4)) {
                Rect rect = this.f1635c;
                motionEvent.setLocation(x4 - rect.left, y4 - rect.top);
            } else {
                motionEvent.setLocation(this.f1633a.getWidth() / 2, this.f1633a.getHeight() / 2);
            }
            return this.f1633a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        f1596u3 = Build.VERSION.SDK_INT < 29 ? new o() : null;
    }

    public SearchView(@androidx.annotation.o0 Context context) {
        this(context, null);
    }

    private void B0(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException unused) {
            intent.toString();
        }
    }

    private boolean D0(int i4, int i5, String str) {
        Cursor d5 = this.V2.d();
        if (d5 == null || !d5.moveToPosition(i4)) {
            return false;
        }
        B0(d0(d5, i5, str));
        return true;
    }

    private void O0() {
        post(this.f1605i3);
    }

    private void P0(int i4) {
        Editable text = this.C.getText();
        Cursor d5 = this.V2.d();
        if (d5 == null) {
            return;
        }
        if (!d5.moveToPosition(i4)) {
            b1(text);
            return;
        }
        CharSequence a5 = this.V2.a(d5);
        if (a5 != null) {
            b1(a5);
        } else {
            b1(text);
        }
    }

    private void b1(CharSequence charSequence) {
        this.C.setText(charSequence);
        this.C.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    private Intent c0(String str, Uri uri, String str2, String str3, int i4, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(ClientDefaults.MAX_MSG_SIZE);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1600d3);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1604h3;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i4 != 0) {
            intent.putExtra("action_key", i4);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f1603g3.getSearchActivity());
        return intent;
    }

    private Intent d0(Cursor cursor, int i4, String str) {
        String u4;
        try {
            try {
                String u5 = n0.u(cursor, "suggest_intent_action");
                if (u5 == null) {
                    u5 = this.f1603g3.getSuggestIntentAction();
                }
                if (u5 == null) {
                    u5 = "android.intent.action.SEARCH";
                }
                String str2 = u5;
                String u6 = n0.u(cursor, "suggest_intent_data");
                if (u6 == null) {
                    u6 = this.f1603g3.getSuggestIntentData();
                }
                if (u6 != null && (u4 = n0.u(cursor, "suggest_intent_data_id")) != null) {
                    u6 = u6 + "/" + Uri.encode(u4);
                }
                return c0(str2, u6 == null ? null : Uri.parse(u6), n0.u(cursor, "suggest_intent_extra_data"), n0.u(cursor, "suggest_intent_query"), i4, str);
            } catch (RuntimeException unused) {
                cursor.getPosition();
                return null;
            }
        } catch (RuntimeException unused2) {
            return null;
        }
    }

    private Intent e0(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1604h3;
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

    private Intent f0(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    private void g0() {
        this.C.dismissDropDown();
    }

    private void i0(View view, Rect rect) {
        view.getLocationInWindow(this.O);
        getLocationInWindow(this.P);
        int[] iArr = this.O;
        int i4 = iArr[1];
        int[] iArr2 = this.P;
        int i5 = i4 - iArr2[1];
        int i6 = iArr[0] - iArr2[0];
        rect.set(i6, i5, view.getWidth() + i6, view.getHeight() + i5);
    }

    private void i1() {
        boolean isEmpty = TextUtils.isEmpty(this.C.getText());
        this.I.setVisibility(!isEmpty || (this.T2 && !this.f1601e3) ? 0 : 8);
        Drawable drawable = this.I.getDrawable();
        if (drawable != null) {
            drawable.setState(!isEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private CharSequence j0(CharSequence charSequence) {
        if (!this.T2 || this.R == null) {
            return charSequence;
        }
        int textSize = (int) (this.C.getTextSize() * 1.25d);
        this.R.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.R), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private void k1() {
        CharSequence q02 = q0();
        SearchAutoComplete searchAutoComplete = this.C;
        if (q02 == null) {
            q02 = "";
        }
        searchAutoComplete.setHint(j0(q02));
    }

    private void l1() {
        this.C.setThreshold(this.f1603g3.getSuggestThreshold());
        this.C.setImeOptions(this.f1603g3.getImeOptions());
        int inputType = this.f1603g3.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f1603g3.getSuggestAuthority() != null) {
                inputType |= 589824;
            }
        }
        this.C.setInputType(inputType);
        androidx.cursoradapter.widget.a aVar = this.V2;
        if (aVar != null) {
            aVar.b(null);
        }
        if (this.f1603g3.getSuggestAuthority() != null) {
            n0 n0Var = new n0(getContext(), this, this.f1603g3, this.f1607k3);
            this.V2 = n0Var;
            this.C.setAdapter(n0Var);
            ((n0) this.V2).E(this.Y2 ? 2 : 1);
        }
    }

    private void m1() {
        this.F.setVisibility((z0() && (this.H.getVisibility() == 0 || this.J.getVisibility() == 0)) ? 0 : 8);
    }

    private int n0() {
        return getContext().getResources().getDimensionPixelSize(a.e.f73137c0);
    }

    private void n1(boolean z4) {
        this.H.setVisibility((this.W2 && z0() && hasFocus() && (z4 || !this.f1598b3)) ? 0 : 8);
    }

    private int o0() {
        return getContext().getResources().getDimensionPixelSize(a.e.f73139d0);
    }

    private void o1(boolean z4) {
        this.U2 = z4;
        int i4 = 8;
        int i5 = z4 ? 0 : 8;
        boolean isEmpty = TextUtils.isEmpty(this.C.getText());
        this.G.setVisibility(i5);
        n1(!isEmpty);
        this.D.setVisibility(z4 ? 8 : 0);
        if (this.Q.getDrawable() != null && !this.T2) {
            i4 = 0;
        }
        this.Q.setVisibility(i4);
        i1();
        p1(isEmpty);
        m1();
    }

    private void p1(boolean z4) {
        int i4 = 8;
        if (this.f1598b3 && !w0() && z4) {
            this.H.setVisibility(8);
            i4 = 0;
        }
        this.J.setVisibility(i4);
    }

    private boolean u0() {
        SearchableInfo searchableInfo = this.f1603g3;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = this.f1603g3.getVoiceSearchLaunchWebSearch() ? this.L2 : this.f1603g3.getVoiceSearchLaunchRecognizer() ? this.M2 : null;
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    static boolean x0(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean z0() {
        return (this.W2 || this.f1598b3) && !w0();
    }

    public boolean A0() {
        return this.W2;
    }

    void C0(int i4, String str, String str2) {
        getContext().startActivity(c0("android.intent.action.SEARCH", null, null, str2, i4, str));
    }

    void E0() {
        if (!TextUtils.isEmpty(this.C.getText())) {
            this.C.setText("");
            this.C.requestFocus();
            this.C.e(true);
        } else if (this.T2) {
            l lVar = this.P2;
            if (lVar == null || !lVar.a()) {
                clearFocus();
                o1(true);
            }
        }
    }

    boolean F0(int i4, int i5, String str) {
        n nVar = this.R2;
        if (nVar != null && nVar.onSuggestionClick(i4)) {
            return false;
        }
        D0(i4, 0, null);
        this.C.e(false);
        g0();
        return true;
    }

    boolean G0(int i4) {
        n nVar = this.R2;
        if (nVar != null && nVar.onSuggestionSelect(i4)) {
            return false;
        }
        P0(i4);
        return true;
    }

    protected void H0(@androidx.annotation.q0 CharSequence charSequence) {
        b1(charSequence);
    }

    void I0() {
        o1(false);
        this.C.requestFocus();
        this.C.e(true);
        View.OnClickListener onClickListener = this.S2;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    void J0() {
        Editable text = this.C.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        m mVar = this.O2;
        if (mVar == null || !mVar.onQueryTextSubmit(text.toString())) {
            if (this.f1603g3 != null) {
                C0(0, null, text.toString());
            }
            this.C.e(false);
            g0();
        }
    }

    boolean K0(View view, int i4, KeyEvent keyEvent) {
        if (this.f1603g3 != null && this.V2 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i4 == 66 || i4 == 84 || i4 == 61) {
                return F0(this.C.getListSelection(), 0, null);
            }
            if (i4 == 21 || i4 == 22) {
                this.C.setSelection(i4 == 21 ? 0 : this.C.length());
                this.C.setListSelection(0);
                this.C.clearListSelection();
                this.C.b();
                return true;
            }
            if (i4 == 19) {
                this.C.getListSelection();
                return false;
            }
        }
        return false;
    }

    void L0(CharSequence charSequence) {
        Editable text = this.C.getText();
        this.f1600d3 = text;
        boolean isEmpty = TextUtils.isEmpty(text);
        n1(!isEmpty);
        p1(isEmpty);
        i1();
        m1();
        if (this.O2 != null && !TextUtils.equals(charSequence, this.f1599c3)) {
            this.O2.onQueryTextChange(charSequence.toString());
        }
        this.f1599c3 = charSequence.toString();
    }

    void M0() {
        o1(w0());
        O0();
        if (this.C.hasFocus()) {
            h0();
        }
    }

    void N0() {
        SearchableInfo searchableInfo = this.f1603g3;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                getContext().startActivity(f0(this.L2, searchableInfo));
            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                getContext().startActivity(e0(this.M2, searchableInfo));
            }
        } catch (ActivityNotFoundException unused) {
        }
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void Q0(Bundle bundle) {
        this.f1604h3 = bundle;
    }

    public void R0(boolean z4) {
        if (z4) {
            E0();
        } else {
            I0();
        }
    }

    public void S0(boolean z4) {
        if (this.T2 == z4) {
            return;
        }
        this.T2 = z4;
        o1(z4);
        k1();
    }

    public void T0(int i4) {
        this.C.setImeOptions(i4);
    }

    public void U0(int i4) {
        this.C.setInputType(i4);
    }

    public void V0(int i4) {
        this.f1597a3 = i4;
        requestLayout();
    }

    public void W0(l lVar) {
        this.P2 = lVar;
    }

    public void X0(View.OnFocusChangeListener onFocusChangeListener) {
        this.Q2 = onFocusChangeListener;
    }

    public void Y0(m mVar) {
        this.O2 = mVar;
    }

    public void Z0(View.OnClickListener onClickListener) {
        this.S2 = onClickListener;
    }

    public void a1(n nVar) {
        this.R2 = nVar;
    }

    void b0() {
        if (this.K.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.E.getPaddingLeft();
            Rect rect = new Rect();
            boolean b5 = e1.b(this);
            int dimensionPixelSize = this.T2 ? resources.getDimensionPixelSize(a.e.Q) + resources.getDimensionPixelSize(a.e.P) : 0;
            this.C.getDropDownBackground().getPadding(rect);
            this.C.setDropDownHorizontalOffset(b5 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            this.C.setDropDownWidth((((this.K.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    @Override // androidx.appcompat.view.c
    public void c() {
        if (this.f1601e3) {
            return;
        }
        this.f1601e3 = true;
        int imeOptions = this.C.getImeOptions();
        this.f1602f3 = imeOptions;
        this.C.setImeOptions(imeOptions | 33554432);
        this.C.setText("");
        R0(false);
    }

    public void c1(CharSequence charSequence, boolean z4) {
        this.C.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.C;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f1600d3 = charSequence;
        }
        if (!z4 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        J0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.Z2 = true;
        super.clearFocus();
        this.C.clearFocus();
        this.C.e(false);
        this.Z2 = false;
    }

    public void d1(@androidx.annotation.q0 CharSequence charSequence) {
        this.X2 = charSequence;
        k1();
    }

    public void e1(boolean z4) {
        this.Y2 = z4;
        androidx.cursoradapter.widget.a aVar = this.V2;
        if (aVar instanceof n0) {
            ((n0) aVar).E(z4 ? 2 : 1);
        }
    }

    public void f1(SearchableInfo searchableInfo) {
        this.f1603g3 = searchableInfo;
        if (searchableInfo != null) {
            l1();
            k1();
        }
        boolean u02 = u0();
        this.f1598b3 = u02;
        if (u02) {
            this.C.setPrivateImeOptions("nm");
        }
        o1(w0());
    }

    public void g1(boolean z4) {
        this.W2 = z4;
        o1(w0());
    }

    void h0() {
        if (Build.VERSION.SDK_INT >= 29) {
            k.a(this.C);
            return;
        }
        o oVar = f1596u3;
        oVar.b(this.C);
        oVar.a(this.C);
    }

    public void h1(androidx.cursoradapter.widget.a aVar) {
        this.V2 = aVar;
        this.C.setAdapter(aVar);
    }

    @Override // androidx.appcompat.view.c
    public void j() {
        c1("", false);
        clearFocus();
        o1(true);
        this.C.setImeOptions(this.f1602f3);
        this.f1601e3 = false;
    }

    void j1() {
        int[] iArr = this.C.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.E.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.F.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public int k0() {
        return this.C.getImeOptions();
    }

    public int l0() {
        return this.C.getInputType();
    }

    public int m0() {
        return this.f1597a3;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f1605i3);
        post(this.f1606j3);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        if (z4) {
            i0(this.C, this.M);
            Rect rect = this.N;
            Rect rect2 = this.M;
            rect.set(rect2.left, 0, rect2.right, i7 - i5);
            p pVar = this.L;
            if (pVar != null) {
                pVar.a(this.N, this.M);
                return;
            }
            p pVar2 = new p(this.N, this.M, this.C);
            this.L = pVar2;
            setTouchDelegate(pVar2);
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected void onMeasure(int i4, int i5) {
        int i6;
        if (w0()) {
            super.onMeasure(i4, i5);
            return;
        }
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        if (mode == Integer.MIN_VALUE) {
            int i7 = this.f1597a3;
            size = i7 > 0 ? Math.min(i7, size) : Math.min(o0(), size);
        } else if (mode == 0) {
            size = this.f1597a3;
            if (size <= 0) {
                size = o0();
            }
        } else if (mode == 1073741824 && (i6 = this.f1597a3) > 0) {
            size = Math.min(i6, size);
        }
        int mode2 = View.MeasureSpec.getMode(i5);
        int size2 = View.MeasureSpec.getSize(i5);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(n0(), size2);
        } else if (mode2 == 0) {
            size2 = n0();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        o1(savedState.f1614d);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1614d = w0();
        return savedState;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z4) {
        super.onWindowFocusChanged(z4);
        O0();
    }

    public CharSequence p0() {
        return this.C.getText();
    }

    @androidx.annotation.q0
    public CharSequence q0() {
        CharSequence charSequence = this.X2;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f1603g3;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.N2 : getContext().getText(this.f1603g3.getHintId());
    }

    int r0() {
        return this.V1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i4, Rect rect) {
        if (this.Z2 || !isFocusable()) {
            return false;
        }
        if (w0()) {
            return super.requestFocus(i4, rect);
        }
        boolean requestFocus = this.C.requestFocus(i4, rect);
        if (requestFocus) {
            o1(false);
        }
        return requestFocus;
    }

    int s0() {
        return this.Q1;
    }

    public androidx.cursoradapter.widget.a t0() {
        return this.V2;
    }

    public boolean v0() {
        return this.T2;
    }

    public boolean w0() {
        return this.U2;
    }

    public boolean y0() {
        return this.Y2;
    }

    public SearchView(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.b.N2);
    }

    public SearchView(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.M = new Rect();
        this.N = new Rect();
        this.O = new int[2];
        this.P = new int[2];
        this.f1605i3 = new b();
        this.f1606j3 = new c();
        this.f1607k3 = new WeakHashMap<>();
        f fVar = new f();
        this.f1608l3 = fVar;
        this.f1609m3 = new g();
        h hVar = new h();
        this.f1610n3 = hVar;
        i iVar = new i();
        this.f1611o3 = iVar;
        j jVar = new j();
        this.f1612p3 = jVar;
        this.f1613q3 = new a();
        int[] iArr = a.m.b5;
        t0 G = t0.G(context, attributeSet, iArr, i4, 0);
        x1.F1(this, context, iArr, attributeSet, G.B(), i4, 0);
        LayoutInflater.from(context).inflate(G.u(a.m.l5, a.j.f73324z), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(a.g.f73245e0);
        this.C = searchAutoComplete;
        searchAutoComplete.f(this);
        this.D = findViewById(a.g.f73237a0);
        View findViewById = findViewById(a.g.f73243d0);
        this.E = findViewById;
        View findViewById2 = findViewById(a.g.f73265o0);
        this.F = findViewById2;
        ImageView imageView = (ImageView) findViewById(a.g.Y);
        this.G = imageView;
        ImageView imageView2 = (ImageView) findViewById(a.g.f73239b0);
        this.H = imageView2;
        ImageView imageView3 = (ImageView) findViewById(a.g.Z);
        this.I = imageView3;
        ImageView imageView4 = (ImageView) findViewById(a.g.f73247f0);
        this.J = imageView4;
        ImageView imageView5 = (ImageView) findViewById(a.g.f73241c0);
        this.Q = imageView5;
        findViewById.setBackground(G.h(a.m.m5));
        findViewById2.setBackground(G.h(a.m.q5));
        int i5 = a.m.p5;
        imageView.setImageDrawable(G.h(i5));
        imageView2.setImageDrawable(G.h(a.m.j5));
        imageView3.setImageDrawable(G.h(a.m.g5));
        imageView4.setImageDrawable(G.h(a.m.s5));
        imageView5.setImageDrawable(G.h(i5));
        this.R = G.h(a.m.o5);
        y0.a(imageView, getResources().getString(a.k.f73346v));
        this.Q1 = G.u(a.m.r5, a.j.f73323y);
        this.V1 = G.u(a.m.h5, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f1613q3);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f1609m3);
        searchAutoComplete.setOnFocusChangeListener(new d());
        S0(G.a(a.m.k5, true));
        int g4 = G.g(a.m.d5, -1);
        if (g4 != -1) {
            V0(g4);
        }
        this.N2 = G.x(a.m.i5);
        this.X2 = G.x(a.m.n5);
        int o4 = G.o(a.m.f5, -1);
        if (o4 != -1) {
            T0(o4);
        }
        int o5 = G.o(a.m.e5, -1);
        if (o5 != -1) {
            U0(o5);
        }
        setFocusable(G.a(a.m.c5, true));
        G.I();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.L2 = intent;
        intent.addFlags(ClientDefaults.MAX_MSG_SIZE);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.M2 = intent2;
        intent2.addFlags(ClientDefaults.MAX_MSG_SIZE);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.K = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        o1(this.T2);
        k1();
    }
}
