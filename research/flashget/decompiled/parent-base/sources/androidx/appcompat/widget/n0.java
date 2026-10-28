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
/* loaded from: classes.dex */
class n0 extends androidx.cursoradapter.widget.c implements View.OnClickListener {
    private static final boolean D = false;
    private static final String E = "SuggestionsAdapter";
    private static final int F = 50;
    static final int G = 0;
    static final int H = 1;
    static final int I = 2;
    static final int J = -1;
    private int A;
    private int B;
    private int C;

    /* renamed from: p, reason: collision with root package name */
    private final SearchView f1947p;

    /* renamed from: q, reason: collision with root package name */
    private final SearchableInfo f1948q;

    /* renamed from: r, reason: collision with root package name */
    private final Context f1949r;

    /* renamed from: s, reason: collision with root package name */
    private final WeakHashMap<String, Drawable.ConstantState> f1950s;

    /* renamed from: t, reason: collision with root package name */
    private final int f1951t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f1952u;

    /* renamed from: v, reason: collision with root package name */
    private int f1953v;

    /* renamed from: w, reason: collision with root package name */
    private ColorStateList f1954w;

    /* renamed from: x, reason: collision with root package name */
    private int f1955x;

    /* renamed from: y, reason: collision with root package name */
    private int f1956y;

    /* renamed from: z, reason: collision with root package name */
    private int f1957z;

    /* compiled from: SuggestionsAdapter.java */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final TextView f1958a;

        /* renamed from: b, reason: collision with root package name */
        public final TextView f1959b;

        /* renamed from: c, reason: collision with root package name */
        public final ImageView f1960c;

        /* renamed from: d, reason: collision with root package name */
        public final ImageView f1961d;

        /* renamed from: e, reason: collision with root package name */
        public final ImageView f1962e;

        public a(View view) {
            this.f1958a = (TextView) view.findViewById(R.id.text1);
            this.f1959b = (TextView) view.findViewById(R.id.text2);
            this.f1960c = (ImageView) view.findViewById(R.id.icon1);
            this.f1961d = (ImageView) view.findViewById(R.id.icon2);
            this.f1962e = (ImageView) view.findViewById(a.g.f73286z);
        }
    }

    public n0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.s0(), (Cursor) null, true);
        this.f1952u = false;
        this.f1953v = 1;
        this.f1955x = -1;
        this.f1956y = -1;
        this.f1957z = -1;
        this.A = -1;
        this.B = -1;
        this.C = -1;
        this.f1947p = searchView;
        this.f1948q = searchableInfo;
        this.f1951t = searchView.r0();
        this.f1949r = context;
        this.f1950s = weakHashMap;
    }

    private Drawable A(Cursor cursor) {
        int i4 = this.B;
        if (i4 == -1) {
            return null;
        }
        return y(cursor.getString(i4));
    }

    private static String D(Cursor cursor, int i4) {
        if (i4 == -1) {
            return null;
        }
        try {
            return cursor.getString(i4);
        } catch (Exception unused) {
            return null;
        }
    }

    private void F(ImageView imageView, Drawable drawable, int i4) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i4);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    private void G(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    private void H(String str, Drawable drawable) {
        if (drawable != null) {
            this.f1950s.put(str, drawable.getConstantState());
        }
    }

    private void I(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    private Drawable p(String str) {
        Drawable.ConstantState constantState = this.f1950s.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    private CharSequence r(CharSequence charSequence) {
        if (this.f1954w == null) {
            TypedValue typedValue = new TypedValue();
            this.f1949r.getTheme().resolveAttribute(a.b.f73067x3, typedValue, true);
            this.f1954w = this.f1949r.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f1954w, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    private Drawable s(ComponentName componentName) {
        PackageManager packageManager = this.f1949r.getPackageManager();
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
        } catch (PackageManager.NameNotFoundException e4) {
            e4.toString();
            return null;
        }
    }

    private Drawable t(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        if (!this.f1950s.containsKey(flattenToShortString)) {
            Drawable s4 = s(componentName);
            this.f1950s.put(flattenToShortString, s4 != null ? s4.getConstantState() : null);
            return s4;
        }
        Drawable.ConstantState constantState = this.f1950s.get(flattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f1949r.getResources());
    }

    public static String u(Cursor cursor, String str) {
        return D(cursor, cursor.getColumnIndex(str));
    }

    private Drawable v() {
        Drawable t4 = t(this.f1948q.getSearchActivity());
        return t4 != null ? t4 : this.f1949r.getPackageManager().getDefaultActivityIcon();
    }

    private Drawable w(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return x(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream openInputStream = this.f1949r.getContentResolver().openInputStream(uri);
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
        } catch (FileNotFoundException e4) {
            Objects.toString(uri);
            e4.getMessage();
            return null;
        }
        Objects.toString(uri);
        e4.getMessage();
        return null;
    }

    private Drawable y(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f1949r.getPackageName() + "/" + parseInt;
            Drawable p4 = p(str2);
            if (p4 != null) {
                return p4;
            }
            Drawable drawable = androidx.core.content.d.getDrawable(this.f1949r, parseInt);
            H(str2, drawable);
            return drawable;
        } catch (Resources.NotFoundException unused) {
            return null;
        } catch (NumberFormatException unused2) {
            Drawable p5 = p(str);
            if (p5 != null) {
                return p5;
            }
            Drawable w4 = w(Uri.parse(str));
            H(str, w4);
            return w4;
        }
    }

    private Drawable z(Cursor cursor) {
        int i4 = this.A;
        if (i4 == -1) {
            return null;
        }
        Drawable y4 = y(cursor.getString(i4));
        return y4 != null ? y4 : v();
    }

    public int B() {
        return this.f1953v;
    }

    Cursor C(SearchableInfo searchableInfo, String str, int i4) {
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
        if (i4 > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i4));
        }
        return this.f1949r.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    public void E(int i4) {
        this.f1953v = i4;
    }

    @Override // androidx.cursoradapter.widget.a, androidx.cursoradapter.widget.b.a
    public CharSequence a(Cursor cursor) {
        String u4;
        String u5;
        if (cursor == null) {
            return null;
        }
        String u6 = u(cursor, "suggest_intent_query");
        if (u6 != null) {
            return u6;
        }
        if (this.f1948q.shouldRewriteQueryFromData() && (u5 = u(cursor, "suggest_intent_data")) != null) {
            return u5;
        }
        if (!this.f1948q.shouldRewriteQueryFromText() || (u4 = u(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return u4;
    }

    @Override // androidx.cursoradapter.widget.a, androidx.cursoradapter.widget.b.a
    public void b(Cursor cursor) {
        if (this.f1952u) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.b(cursor);
            if (cursor != null) {
                this.f1955x = cursor.getColumnIndex("suggest_text_1");
                this.f1956y = cursor.getColumnIndex("suggest_text_2");
                this.f1957z = cursor.getColumnIndex("suggest_text_2_url");
                this.A = cursor.getColumnIndex("suggest_icon_1");
                this.B = cursor.getColumnIndex("suggest_icon_2");
                this.C = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception unused) {
        }
    }

    @Override // androidx.cursoradapter.widget.a, androidx.cursoradapter.widget.b.a
    public Cursor c(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f1947p.getVisibility() == 0 && this.f1947p.getWindowVisibility() == 0) {
            try {
                Cursor C = C(this.f1948q, charSequence2, 50);
                if (C != null) {
                    C.getCount();
                    return C;
                }
            } catch (RuntimeException unused) {
            }
        }
        return null;
    }

    @Override // androidx.cursoradapter.widget.a
    public void e(View view, Context context, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i4 = this.C;
        int i5 = i4 != -1 ? cursor.getInt(i4) : 0;
        if (aVar.f1958a != null) {
            G(aVar.f1958a, D(cursor, this.f1955x));
        }
        if (aVar.f1959b != null) {
            String D2 = D(cursor, this.f1957z);
            CharSequence r4 = D2 != null ? r(D2) : D(cursor, this.f1956y);
            if (TextUtils.isEmpty(r4)) {
                TextView textView = aVar.f1958a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f1958a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f1958a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f1958a.setMaxLines(1);
                }
            }
            G(aVar.f1959b, r4);
        }
        ImageView imageView = aVar.f1960c;
        if (imageView != null) {
            F(imageView, z(cursor), 4);
        }
        ImageView imageView2 = aVar.f1961d;
        if (imageView2 != null) {
            F(imageView2, A(cursor), 8);
        }
        int i6 = this.f1953v;
        if (i6 != 2 && (i6 != 1 || (i5 & 1) == 0)) {
            aVar.f1962e.setVisibility(8);
            return;
        }
        aVar.f1962e.setVisibility(0);
        aVar.f1962e.setTag(aVar.f1958a.getText());
        aVar.f1962e.setOnClickListener(this);
    }

    @Override // androidx.cursoradapter.widget.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i4, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i4, view, viewGroup);
        } catch (RuntimeException e4) {
            View i5 = i(this.f1949r, d(), viewGroup);
            if (i5 != null) {
                ((a) i5.getTag()).f1958a.setText(e4.toString());
            }
            return i5;
        }
    }

    @Override // androidx.cursoradapter.widget.a, android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i4, view, viewGroup);
        } catch (RuntimeException e4) {
            View j4 = j(this.f1949r, d(), viewGroup);
            if (j4 != null) {
                ((a) j4.getTag()).f1958a.setText(e4.toString());
            }
            return j4;
        }
    }

    @Override // androidx.cursoradapter.widget.a, android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // androidx.cursoradapter.widget.c, androidx.cursoradapter.widget.a
    public View j(Context context, Cursor cursor, ViewGroup viewGroup) {
        View j4 = super.j(context, cursor, viewGroup);
        j4.setTag(new a(j4));
        ((ImageView) j4.findViewById(a.g.f73286z)).setImageResource(this.f1951t);
        return j4;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        I(d());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        I(d());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1947p.H0((CharSequence) tag);
        }
    }

    public void q() {
        b(null);
        this.f1952u = true;
    }

    Drawable x(Uri uri) throws FileNotFoundException {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f1949r.getPackageManager().getResourcesForApplication(authority);
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
