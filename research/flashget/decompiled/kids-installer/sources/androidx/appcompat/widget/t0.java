package androidx.appcompat.widget;

import android.R;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import d.a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: SuggestionsAdapter.java */
/* loaded from: classes3.dex */
class t0 extends androidx.cursoradapter.widget.c implements View.OnClickListener {
    private static final boolean Q = false;
    private static final String R = "SuggestionsAdapter";
    private static final int S = 50;
    static final int T = 0;
    static final int U = 1;
    static final int V = 2;
    static final int W = -1;
    private final SearchView C;
    private final SearchableInfo D;
    private final Context E;
    private final WeakHashMap<String, Drawable.ConstantState> F;
    private final int G;
    private boolean H;
    private int I;
    private ColorStateList J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private int P;

    /* compiled from: SuggestionsAdapter.java */
    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final TextView f1362a;

        /* renamed from: b, reason: collision with root package name */
        public final TextView f1363b;

        /* renamed from: c, reason: collision with root package name */
        public final ImageView f1364c;

        /* renamed from: d, reason: collision with root package name */
        public final ImageView f1365d;

        /* renamed from: e, reason: collision with root package name */
        public final ImageView f1366e;

        public a(View view) {
            this.f1362a = (TextView) view.findViewById(R.id.text1);
            this.f1363b = (TextView) view.findViewById(R.id.text2);
            this.f1364c = (ImageView) view.findViewById(R.id.icon1);
            this.f1365d = (ImageView) view.findViewById(R.id.icon2);
            this.f1366e = (ImageView) view.findViewById(a.h.f21900p0);
        }
    }

    public t0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.q0(), (Cursor) null, true);
        this.H = false;
        this.I = 1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.O = -1;
        this.P = -1;
        this.C = searchView;
        this.D = searchableInfo;
        this.G = searchView.p0();
        this.E = context;
        this.F = weakHashMap;
    }

    private static String C(Cursor cursor, int i5) {
        if (i5 == -1) {
            return null;
        }
        try {
            return cursor.getString(i5);
        } catch (Exception unused) {
            return null;
        }
    }

    private void E(ImageView imageView, Drawable drawable, int i5) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i5);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    private void F(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    private void G(String str, Drawable drawable) {
        if (drawable != null) {
            this.F.put(str, drawable.getConstantState());
        }
    }

    private void H(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    private Drawable o(String str) {
        Drawable.ConstantState constantState = this.F.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    private CharSequence q(CharSequence charSequence) {
        if (this.J == null) {
            TypedValue typedValue = new TypedValue();
            this.E.getTheme().resolveAttribute(a.c.E3, typedValue, true);
            this.J = this.E.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.J, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    private Drawable r(ComponentName componentName) {
        PackageManager packageManager = this.E.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            componentName.flattenToShortString();
            return null;
        } catch (PackageManager.NameNotFoundException e6) {
            e6.toString();
            return null;
        }
    }

    private Drawable s(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        if (!this.F.containsKey(flattenToShortString)) {
            Drawable r5 = r(componentName);
            this.F.put(flattenToShortString, r5 != null ? r5.getConstantState() : null);
            return r5;
        }
        Drawable.ConstantState constantState = this.F.get(flattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.E.getResources());
    }

    public static String t(Cursor cursor, String str) {
        return C(cursor, cursor.getColumnIndex(str));
    }

    private Drawable u() {
        Drawable s5 = s(this.D.getSearchActivity());
        return s5 != null ? s5 : this.E.getPackageManager().getDefaultActivityIcon();
    }

    private Drawable v(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return w(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream openInputStream = this.E.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            try {
                return Drawable.createFromStream(openInputStream, null);
            } finally {
                try {
                    openInputStream.close();
                } catch (IOException unused2) {
                    uri.toString();
                }
            }
        } catch (FileNotFoundException e6) {
            Objects.toString(uri);
            e6.getMessage();
            return null;
        }
        Objects.toString(uri);
        e6.getMessage();
        return null;
    }

    private Drawable x(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.E.getPackageName() + "/" + parseInt;
            Drawable o5 = o(str2);
            if (o5 != null) {
                return o5;
            }
            Drawable i5 = androidx.core.content.d.i(this.E, parseInt);
            G(str2, i5);
            return i5;
        } catch (Resources.NotFoundException unused) {
            return null;
        } catch (NumberFormatException unused2) {
            Drawable o6 = o(str);
            if (o6 != null) {
                return o6;
            }
            Drawable v5 = v(Uri.parse(str));
            G(str, v5);
            return v5;
        }
    }

    private Drawable y(Cursor cursor) {
        int i5 = this.N;
        if (i5 == -1) {
            return null;
        }
        Drawable x5 = x(cursor.getString(i5));
        return x5 != null ? x5 : u();
    }

    private Drawable z(Cursor cursor) {
        int i5 = this.O;
        if (i5 == -1) {
            return null;
        }
        return x(cursor.getString(i5));
    }

    public int A() {
        return this.I;
    }

    Cursor B(SearchableInfo searchableInfo, String str, int i5) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i5 > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i5));
        }
        return this.E.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    public void D(int i5) {
        this.I = i5;
    }

    @Override // androidx.cursoradapter.widget.a, androidx.cursoradapter.widget.b.a
    public void a(Cursor cursor) {
        if (this.H) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.a(cursor);
            if (cursor != null) {
                this.K = cursor.getColumnIndex("suggest_text_1");
                this.L = cursor.getColumnIndex("suggest_text_2");
                this.M = cursor.getColumnIndex("suggest_text_2_url");
                this.N = cursor.getColumnIndex("suggest_icon_1");
                this.O = cursor.getColumnIndex("suggest_icon_2");
                this.P = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception unused) {
        }
    }

    @Override // androidx.cursoradapter.widget.a, androidx.cursoradapter.widget.b.a
    public Cursor c(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.C.getVisibility() == 0 && this.C.getWindowVisibility() == 0) {
            try {
                Cursor B = B(this.D, charSequence2, 50);
                if (B != null) {
                    B.getCount();
                    return B;
                }
            } catch (RuntimeException unused) {
            }
        }
        return null;
    }

    @Override // androidx.cursoradapter.widget.a, androidx.cursoradapter.widget.b.a
    public CharSequence convertToString(Cursor cursor) {
        String t5;
        String t6;
        if (cursor == null) {
            return null;
        }
        String t7 = t(cursor, "suggest_intent_query");
        if (t7 != null) {
            return t7;
        }
        if (this.D.shouldRewriteQueryFromData() && (t6 = t(cursor, "suggest_intent_data")) != null) {
            return t6;
        }
        if (!this.D.shouldRewriteQueryFromText() || (t5 = t(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return t5;
    }

    @Override // androidx.cursoradapter.widget.a
    public void d(View view, Context context, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i5 = this.P;
        int i6 = i5 != -1 ? cursor.getInt(i5) : 0;
        if (aVar.f1362a != null) {
            F(aVar.f1362a, C(cursor, this.K));
        }
        if (aVar.f1363b != null) {
            String C = C(cursor, this.M);
            CharSequence q5 = C != null ? q(C) : C(cursor, this.L);
            if (TextUtils.isEmpty(q5)) {
                TextView textView = aVar.f1362a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f1362a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f1362a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f1362a.setMaxLines(1);
                }
            }
            F(aVar.f1363b, q5);
        }
        ImageView imageView = aVar.f1364c;
        if (imageView != null) {
            E(imageView, y(cursor), 4);
        }
        ImageView imageView2 = aVar.f1365d;
        if (imageView2 != null) {
            E(imageView2, z(cursor), 8);
        }
        int i7 = this.I;
        if (i7 != 2 && (i7 != 1 || (i6 & 1) == 0)) {
            aVar.f1366e.setVisibility(8);
            return;
        }
        aVar.f1366e.setVisibility(0);
        aVar.f1366e.setTag(aVar.f1362a.getText());
        aVar.f1366e.setOnClickListener(this);
    }

    @Override // androidx.cursoradapter.widget.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i5, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i5, view, viewGroup);
        } catch (RuntimeException e6) {
            View h5 = h(this.E, b(), viewGroup);
            if (h5 != null) {
                ((a) h5.getTag()).f1362a.setText(e6.toString());
            }
            return h5;
        }
    }

    @Override // androidx.cursoradapter.widget.a, android.widget.Adapter
    public View getView(int i5, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i5, view, viewGroup);
        } catch (RuntimeException e6) {
            View i6 = i(this.E, b(), viewGroup);
            if (i6 != null) {
                ((a) i6.getTag()).f1362a.setText(e6.toString());
            }
            return i6;
        }
    }

    @Override // androidx.cursoradapter.widget.a, android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // androidx.cursoradapter.widget.c, androidx.cursoradapter.widget.a
    public View i(Context context, Cursor cursor, ViewGroup viewGroup) {
        View i5 = super.i(context, cursor, viewGroup);
        i5.setTag(new a(i5));
        ((ImageView) i5.findViewById(a.h.f21900p0)).setImageResource(this.G);
        return i5;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        H(b());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        H(b());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.C.F0((CharSequence) tag);
        }
    }

    public void p() {
        a(null);
        this.H = true;
    }

    Drawable w(Uri uri) throws FileNotFoundException {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.E.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }
}
