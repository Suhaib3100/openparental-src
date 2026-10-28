package com.androidquery;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.Gallery;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.core.view.x1;
import com.androidquery.b;
import com.androidquery.callback.e;
import com.androidquery.callback.f;
import com.androidquery.util.c;
import com.androidquery.util.d;
import com.androidquery.util.h;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Constructor;
import java.nio.channels.FileChannel;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;

/* compiled from: AbstractAQuery.java */
/* loaded from: classes3.dex */
public abstract class b<T extends b<T>> implements d {
    private static final Class<?>[] Y = {View.class};
    private static Class<?>[] Z;

    /* renamed from: a0, reason: collision with root package name */
    private static Class<?>[] f41097a0;

    /* renamed from: b0, reason: collision with root package name */
    private static final Class<?>[] f41098b0;

    /* renamed from: c0, reason: collision with root package name */
    private static Class<?>[] f41099c0;

    /* renamed from: d0, reason: collision with root package name */
    private static final Class<?>[] f41100d0;

    /* renamed from: e0, reason: collision with root package name */
    private static Class<?>[] f41101e0;

    /* renamed from: f0, reason: collision with root package name */
    private static WeakHashMap<Dialog, Void> f41102f0;
    private View O;
    private Activity P;
    private Context Q;
    protected View R;
    protected Object S;
    protected com.androidquery.auth.a T;
    private f U;
    private Integer V;
    private HttpHost W;
    private Constructor<T> X;

    static {
        Class cls = Integer.TYPE;
        Z = new Class[]{AdapterView.class, View.class, cls, Long.TYPE};
        f41097a0 = new Class[]{AbsListView.class, cls};
        f41098b0 = new Class[]{CharSequence.class, cls, cls, cls};
        f41099c0 = new Class[]{cls, cls};
        f41100d0 = new Class[]{cls};
        f41101e0 = new Class[]{cls, Paint.class};
        f41102f0 = new WeakHashMap<>();
    }

    public b(Activity activity) {
        this.P = activity;
    }

    private View J(int i4) {
        View view = this.O;
        if (view != null) {
            return view.findViewById(i4);
        }
        Activity activity = this.P;
        if (activity != null) {
            return activity.findViewById(i4);
        }
        return null;
    }

    private View K(String str) {
        View childAt;
        View view = this.O;
        if (view != null) {
            return view.findViewWithTag(str);
        }
        Activity activity = this.P;
        if (activity == null || (childAt = ((ViewGroup) activity.findViewById(R.id.content)).getChildAt(0)) == null) {
            return null;
        }
        return childAt.findViewWithTag(str);
    }

    private View L(int... iArr) {
        View J = J(iArr[0]);
        for (int i4 = 1; i4 < iArr.length && J != null; i4++) {
            J = J.findViewById(iArr[i4]);
        }
        return J;
    }

    private Constructor<T> S() {
        if (this.X == null) {
            try {
                this.X = (Constructor<T>) getClass().getConstructor(View.class);
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
        return this.X;
    }

    private T o1() {
        return this;
    }

    private c r1() {
        AbsListView absListView = (AbsListView) this.R;
        c cVar = (c) absListView.getTag(d.f41257w);
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        absListView.setOnScrollListener(cVar2);
        absListView.setTag(d.f41257w, cVar2);
        com.androidquery.util.a.i(ProtectedSandApp.s("ܘ"));
        return cVar2;
    }

    private void z1(boolean z4, int i4, boolean z5) {
        View view = this.R;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Context T = T();
            if (i4 > 0 && z5) {
                i4 = com.androidquery.util.a.n(T, i4);
            }
            if (z4) {
                layoutParams.width = i4;
            } else {
                layoutParams.height = i4;
            }
            this.R.setLayoutParams(layoutParams);
        }
    }

    public <K> T A(String str, Class<K> cls, Object obj, String str2) {
        com.androidquery.callback.b<K> bVar = new com.androidquery.callback.b<>();
        bVar.f1(obj, str2);
        return z(str, cls, bVar);
    }

    public T A0(File file, int i4) {
        return B0(file, true, i4, null);
    }

    public <K> T A1(com.androidquery.callback.b<K> bVar) {
        c(bVar);
        bVar.j();
        return this;
    }

    public T B() {
        Iterator<Dialog> it = f41102f0.keySet().iterator();
        while (it.hasNext()) {
            try {
                it.next().dismiss();
            } catch (Exception unused) {
            }
            it.remove();
        }
        return this;
    }

    public T B0(File file, boolean z4, int i4, com.androidquery.callback.d dVar) {
        if (dVar == null) {
            dVar = new com.androidquery.callback.d();
        }
        com.androidquery.callback.d dVar2 = dVar;
        dVar2.A1(file);
        return K0(file != null ? file.getAbsolutePath() : null, z4, true, i4, 0, dVar2);
    }

    public T B1(int i4, Object obj) {
        View view = this.R;
        if (view != null) {
            view.setTag(i4, obj);
        }
        return this;
    }

    public T C(Dialog dialog) {
        if (dialog != null) {
            try {
                f41102f0.remove(dialog);
                dialog.dismiss();
            } catch (Exception unused) {
            }
        }
        return this;
    }

    public T C0(String str) {
        return G0(str, true, true, 0, 0);
    }

    public T C1(Object obj) {
        View view = this.R;
        if (view != null) {
            view.setTag(obj);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public T D(String str, File file, com.androidquery.callback.b<File> bVar) {
        ((com.androidquery.callback.b) bVar.d1(str)).b1(File.class).W0(file);
        return c(bVar);
    }

    public T D0(String str, e eVar) {
        return E0(str, eVar, null);
    }

    public T D1(int i4) {
        View view = this.R;
        if (view instanceof TextView) {
            ((TextView) view).setText(i4);
        }
        return this;
    }

    public T E(String str, File file, Object obj, String str2) {
        com.androidquery.callback.b<File> bVar = new com.androidquery.callback.b<>();
        bVar.f1(obj, str2);
        return D(str, file, bVar);
    }

    protected T E0(String str, e eVar, String str2) {
        if (this.R instanceof ImageView) {
            com.androidquery.callback.d.n1(this.P, T(), (ImageView) this.R, str, this.S, this.T, eVar, this.W, str2);
            l1();
        }
        return this;
    }

    public T E1(int i4, Object... objArr) {
        Context T = T();
        if (T != null) {
            G1(T.getString(i4, objArr));
        }
        return this;
    }

    public T F(boolean z4) {
        View view = this.R;
        if (view != null) {
            view.setEnabled(z4);
        }
        return this;
    }

    public T F0(String str, boolean z4, boolean z5) {
        return G0(str, z4, z5, 0, 0);
    }

    public T F1(Spanned spanned) {
        View view = this.R;
        if (view instanceof TextView) {
            ((TextView) view).setText(spanned);
        }
        return this;
    }

    public T G(int i4, boolean z4) {
        View view = this.R;
        if (view instanceof ExpandableListView) {
            ExpandableListView expandableListView = (ExpandableListView) view;
            if (z4) {
                expandableListView.expandGroup(i4);
            } else {
                expandableListView.collapseGroup(i4);
            }
        }
        return this;
    }

    public T G0(String str, boolean z4, boolean z5, int i4, int i5) {
        return H0(str, z4, z5, i4, i5, null, 0);
    }

    public T G1(CharSequence charSequence) {
        View view = this.R;
        if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
        return this;
    }

    public T H(boolean z4) {
        ExpandableListView expandableListView;
        ExpandableListAdapter expandableListAdapter;
        View view = this.R;
        if ((view instanceof ExpandableListView) && (expandableListAdapter = (expandableListView = (ExpandableListView) view).getExpandableListAdapter()) != null) {
            int groupCount = expandableListAdapter.getGroupCount();
            for (int i4 = 0; i4 < groupCount; i4++) {
                if (z4) {
                    expandableListView.expandGroup(i4);
                } else {
                    expandableListView.collapseGroup(i4);
                }
            }
        }
        return this;
    }

    public T H0(String str, boolean z4, boolean z5, int i4, int i5, Bitmap bitmap, int i6) {
        return I0(str, z4, z5, i4, i5, bitmap, i6, 0.0f);
    }

    public T H1(CharSequence charSequence, boolean z4) {
        return (z4 && (charSequence == null || charSequence.length() == 0)) ? n0() : G1(charSequence);
    }

    public T I(int i4) {
        return x(J(i4));
    }

    public T I0(String str, boolean z4, boolean z5, int i4, int i5, Bitmap bitmap, int i6, float f4) {
        return J0(str, z4, z5, i4, i5, bitmap, i6, f4, 0, null);
    }

    public T I1(Object obj, String str) {
        View view = this.R;
        if (view instanceof TextView) {
            ((TextView) view).addTextChangedListener(new c().e(obj, str, true, f41098b0));
        }
        return this;
    }

    protected T J0(String str, boolean z4, boolean z5, int i4, int i5, Bitmap bitmap, int i6, float f4, int i7, String str2) {
        if (this.R instanceof ImageView) {
            com.androidquery.callback.d.o1(this.P, T(), (ImageView) this.R, str, z4, z5, i4, i5, bitmap, i6, f4, Float.MAX_VALUE, this.S, this.T, this.V.intValue(), i7, this.W, str2);
            l1();
        }
        return this;
    }

    public T J1(int i4) {
        View view = this.R;
        if (view instanceof TextView) {
            ((TextView) view).setTextColor(i4);
        }
        return this;
    }

    public T K0(String str, boolean z4, boolean z5, int i4, int i5, com.androidquery.callback.d dVar) {
        dVar.m2(i4).z1(i5).d1(str).p0(z4).B(z5);
        return z0(dVar);
    }

    public T K1(float f4) {
        View view = this.R;
        if (view instanceof TextView) {
            ((TextView) view).setTextSize(f4);
        }
        return this;
    }

    public View L0(View view, int i4, ViewGroup viewGroup) {
        Integer num;
        if (view != null && (num = (Integer) view.getTag(d.f41258x)) != null && num.intValue() == i4) {
            return view;
        }
        Activity activity = this.P;
        View inflate = (activity != null ? activity.getLayoutInflater() : (LayoutInflater) T().getSystemService(ProtectedSandApp.s("ܙ"))).inflate(i4, viewGroup, false);
        inflate.setTag(d.f41258x, Integer.valueOf(i4));
        return inflate;
    }

    public T L1(f fVar) {
        this.U = fVar;
        return this;
    }

    public Button M() {
        return (Button) this.R;
    }

    public T M0(String str) {
        File N = N(str);
        if (N != null) {
            N.delete();
        }
        return this;
    }

    public T M1(boolean z4) {
        View view = this.R;
        if (view != null) {
            com.androidquery.util.a.d0(view, z4);
        }
        return this;
    }

    public File N(String str) {
        File u4 = com.androidquery.util.a.u(com.androidquery.util.a.q(T(), 1), str);
        return u4 == null ? com.androidquery.util.a.u(com.androidquery.util.a.q(T(), 0), str) : u4;
    }

    public T N0() {
        return O1(4);
    }

    public T N1(Typeface typeface) {
        View view = this.R;
        if (view instanceof TextView) {
            ((TextView) view).setTypeface(typeface);
        }
        return this;
    }

    public Bitmap O(int i4) {
        return com.androidquery.callback.d.I1(T(), i4);
    }

    protected <K> T O0(com.androidquery.callback.a<?, K> aVar) {
        com.androidquery.auth.a aVar2 = this.T;
        if (aVar2 != null) {
            aVar.h(aVar2);
        }
        Object obj = this.S;
        if (obj != null) {
            aVar.I0(obj);
        }
        f fVar = this.U;
        if (fVar != null) {
            aVar.a1(fVar);
        }
        Integer num = this.V;
        if (num != null) {
            aVar.E0(num.intValue());
        }
        HttpHost httpHost = this.W;
        if (httpHost != null) {
            aVar.J0(httpHost.getHostName(), this.W.getPort());
        }
        Activity activity = this.P;
        if (activity != null) {
            aVar.e(activity);
        } else {
            aVar.f(T());
        }
        l1();
        return this;
    }

    public T O1(int i4) {
        View view = this.R;
        if (view != null && view.getVisibility() != i4) {
            this.R.setVisibility(i4);
        }
        return this;
    }

    public Bitmap P(String str) {
        return Q(str, 0);
    }

    public Object P0(String str, Class<?>[] clsArr, Object... objArr) {
        Object obj = this.R;
        if (obj == null) {
            obj = this.P;
        }
        return com.androidquery.util.a.C(obj, str, false, false, clsArr, objArr);
    }

    public T P1() {
        return O1(0);
    }

    public Bitmap Q(String str, int i4) {
        File N;
        Bitmap J1 = com.androidquery.callback.d.J1(str, i4);
        return (J1 != null || (N = N(str)) == null) ? J1 : com.androidquery.callback.d.L1(N.getAbsolutePath(), null, i4, true, 0, false);
    }

    public boolean Q0() {
        View view = this.R;
        if (view instanceof CompoundButton) {
            return ((CompoundButton) view).isChecked();
        }
        return false;
    }

    public T Q1(String str) {
        return R1(str, true, false, x1.f27484y);
    }

    public CheckBox R() {
        return (CheckBox) this.R;
    }

    public boolean R0() {
        return this.R != null;
    }

    public T R1(String str, boolean z4, boolean z5, int i4) {
        if (this.R instanceof WebView) {
            p1(1, null);
            new h((WebView) this.R, str, this.S, z4, z5, i4).h();
            this.S = null;
        }
        return this;
    }

    public T S0(AdapterView.OnItemClickListener onItemClickListener) {
        View view = this.R;
        if (view instanceof AdapterView) {
            ((AdapterView) view).setOnItemClickListener(onItemClickListener);
        }
        return this;
    }

    public T S1(int i4) {
        z1(true, i4, true);
        return this;
    }

    public Context T() {
        Activity activity = this.P;
        if (activity != null) {
            return activity;
        }
        View view = this.O;
        return view != null ? view.getContext() : this.Q;
    }

    public T T0(Object obj, String str) {
        return S0(new c().e(obj, str, true, Z));
    }

    public T T1(int i4, boolean z4) {
        z1(true, i4, z4);
        return this;
    }

    public EditText U() {
        return (EditText) this.R;
    }

    public T U0(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        View view = this.R;
        if (view instanceof AdapterView) {
            ((AdapterView) view).setOnItemSelectedListener(onItemSelectedListener);
        }
        return this;
    }

    public Editable V() {
        View view = this.R;
        if (view instanceof EditText) {
            return ((EditText) view).getEditableText();
        }
        return null;
    }

    public T V0(Object obj, String str) {
        return U0(new c().e(obj, str, true, Z));
    }

    public ExpandableListView W() {
        return (ExpandableListView) this.R;
    }

    public T W0() {
        View view = this.R;
        if (view != null) {
            view.performLongClick();
        }
        return this;
    }

    public Gallery X() {
        return (Gallery) this.R;
    }

    public T X0(View.OnLongClickListener onLongClickListener) {
        View view = this.R;
        if (view != null) {
            view.setOnLongClickListener(onLongClickListener);
        }
        return this;
    }

    public GridView Y() {
        return (GridView) this.R;
    }

    public T Y0(Object obj, String str) {
        return X0(new c().e(obj, str, true, Y));
    }

    public ImageView Z() {
        return (ImageView) this.R;
    }

    public File Z0(String str, String str2) {
        File A;
        File file = null;
        try {
            File N = N(str);
            if (N == null || (A = com.androidquery.util.a.A()) == null) {
                return null;
            }
            File file2 = new File(A, str2);
            try {
                file2.createNewFile();
                FileInputStream fileInputStream = new FileInputStream(N);
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                FileChannel channel = fileInputStream.getChannel();
                FileChannel channel2 = fileOutputStream.getChannel();
                try {
                    channel.transferTo(0L, channel.size(), channel2);
                    com.androidquery.util.a.f(fileInputStream);
                    com.androidquery.util.a.f(fileOutputStream);
                    com.androidquery.util.a.f(channel);
                    com.androidquery.util.a.f(channel2);
                    return file2;
                } catch (Throwable th) {
                    com.androidquery.util.a.f(fileInputStream);
                    com.androidquery.util.a.f(fileOutputStream);
                    com.androidquery.util.a.f(channel);
                    com.androidquery.util.a.f(channel2);
                    throw th;
                }
            } catch (Exception e4) {
                e = e4;
                file = file2;
                com.androidquery.util.a.k(e);
                return file;
            }
        } catch (Exception e5) {
            e = e5;
        }
    }

    public T a(Adapter adapter) {
        View view = this.R;
        if (view instanceof AdapterView) {
            ((AdapterView) view).setAdapter(adapter);
        }
        return this;
    }

    public ListView a0() {
        return (ListView) this.R;
    }

    public T a1(float f4, float f5, float f6, float f7) {
        View view = this.R;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                Context T = T();
                ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(com.androidquery.util.a.n(T, f4), com.androidquery.util.a.n(T, f5), com.androidquery.util.a.n(T, f6), com.androidquery.util.a.n(T, f7));
                this.R.setLayoutParams(layoutParams);
            }
        }
        return this;
    }

    public T b(ExpandableListAdapter expandableListAdapter) {
        View view = this.R;
        if (view instanceof ExpandableListView) {
            ((ExpandableListView) view).setAdapter(expandableListAdapter);
        }
        return this;
    }

    public ProgressBar b0() {
        return (ProgressBar) this.R;
    }

    public T b1(int i4, int i5) {
        Activity activity = this.P;
        if (activity != null) {
            com.androidquery.util.a.C(activity, ProtectedSandApp.s("ܚ"), false, false, f41099c0, Integer.valueOf(i4), Integer.valueOf(i5));
        }
        return this;
    }

    public <K> T c(com.androidquery.callback.b<K> bVar) {
        return O0(bVar);
    }

    public RatingBar c0() {
        return (RatingBar) this.R;
    }

    public T c1(int i4) {
        View view = this.R;
        while (view != null) {
            if (view.getId() == i4) {
                break;
            }
            Object parent = view.getParent();
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        view = null;
        return x(view);
    }

    public <K> T d(String str, Class<K> cls, long j4, com.androidquery.callback.b<K> bVar) {
        bVar.b1(cls).d1(str).B(true).x(j4);
        return c(bVar);
    }

    public SeekBar d0() {
        return (SeekBar) this.R;
    }

    public T d1(int i4) {
        this.V = Integer.valueOf(i4);
        return this;
    }

    public <K> T e(String str, Class<K> cls, long j4, Object obj, String str2) {
        com.androidquery.callback.b<K> bVar = new com.androidquery.callback.b<>();
        bVar.b1(cls).f1(obj, str2).B(true).x(j4);
        return f(str, cls, bVar);
    }

    public Object e0() {
        View view = this.R;
        if (view instanceof AdapterView) {
            return ((AdapterView) view).getSelectedItem();
        }
        return null;
    }

    public T e1(int i4) {
        this.S = J(i4);
        return this;
    }

    public <K> T f(String str, Class<K> cls, com.androidquery.callback.b<K> bVar) {
        bVar.b1(cls).d1(str);
        return c(bVar);
    }

    public int f0() {
        View view = this.R;
        if (view instanceof AdapterView) {
            return ((AdapterView) view).getSelectedItemPosition();
        }
        return -1;
    }

    public T f1(Dialog dialog) {
        this.S = dialog;
        return this;
    }

    public <K> T g(String str, Class<K> cls, Object obj, String str2) {
        com.androidquery.callback.b<K> bVar = new com.androidquery.callback.b<>();
        bVar.b1(cls).f1(obj, str2);
        return f(str, cls, bVar);
    }

    public Spinner g0() {
        return (Spinner) this.R;
    }

    public T g1(Object obj) {
        this.S = obj;
        return this;
    }

    public <K> T h(String str, Map<String, ?> map, Class<K> cls, com.androidquery.callback.b<K> bVar) {
        bVar.b1(cls).d1(str).z0(map);
        return c(bVar);
    }

    public Object h0() {
        View view = this.R;
        if (view != null) {
            return view.getTag();
        }
        return null;
    }

    public T h1(String str, int i4) {
        this.W = new HttpHost(str, i4);
        return this;
    }

    public <K> T i(String str, Map<String, ?> map, Class<K> cls, Object obj, String str2) {
        com.androidquery.callback.b<K> bVar = new com.androidquery.callback.b<>();
        bVar.b1(cls).f1(obj, str2);
        return h(str, map, cls, bVar);
    }

    public Object i0(int i4) {
        View view = this.R;
        if (view != null) {
            return view.getTag(i4);
        }
        return null;
    }

    public <K> T i1(String str, String str2, HttpEntity httpEntity, Class<K> cls, com.androidquery.callback.b<K> bVar) {
        bVar.d1(str).b1(cls).s0(3).b0(ProtectedSandApp.s("ܛ"), str2).y0(ProtectedSandApp.s("ܜ"), httpEntity);
        return c(bVar);
    }

    public T j() {
        com.androidquery.callback.a.n();
        return this;
    }

    public CharSequence j0() {
        View view = this.R;
        if (view instanceof TextView) {
            return ((TextView) view).getText();
        }
        return null;
    }

    public T j1(float f4) {
        View view = this.R;
        if (view instanceof RatingBar) {
            ((RatingBar) view).setRating(f4);
        }
        return this;
    }

    public T k(int i4) {
        return l(i4, null);
    }

    public TextView k0() {
        return (TextView) this.R;
    }

    public T k1(View view) {
        this.O = view;
        this.R = view;
        l1();
        this.Q = null;
        return this;
    }

    public T l(int i4, Animation.AnimationListener animationListener) {
        Animation loadAnimation = AnimationUtils.loadAnimation(T(), i4);
        loadAnimation.setAnimationListener(animationListener);
        return m(loadAnimation);
    }

    public View l0() {
        return this.R;
    }

    protected void l1() {
        this.T = null;
        this.S = null;
        this.U = null;
        this.V = 0;
        this.W = null;
    }

    public T m(Animation animation) {
        View view = this.R;
        if (view != null && animation != null) {
            view.startAnimation(animation);
        }
        return this;
    }

    public WebView m0() {
        return (WebView) this.R;
    }

    public T m1(AbsListView.OnScrollListener onScrollListener) {
        if (this.R instanceof AbsListView) {
            r1().g(onScrollListener);
        }
        return this;
    }

    public T n(com.androidquery.auth.a aVar) {
        this.T = aVar;
        return this;
    }

    public T n0() {
        return O1(8);
    }

    public T n1(Object obj, String str) {
        if (this.R instanceof AbsListView) {
            r1().e(obj, str, true, f41097a0);
        }
        return this;
    }

    public T o(int i4) {
        View view = this.R;
        if (view != null) {
            if (i4 != 0) {
                view.setBackgroundResource(i4);
            } else {
                view.setBackgroundDrawable(null);
            }
        }
        return this;
    }

    public T o0() {
        Activity activity = this.P;
        if (activity != null) {
            activity.getWindow().setFlags(16777216, 16777216);
        }
        return this;
    }

    public T p(int i4) {
        View view = this.R;
        if (view != null) {
            view.setBackgroundColor(i4);
        }
        return this;
    }

    public T p0(int i4) {
        z1(false, i4, true);
        return this;
    }

    public T p1(int i4, Paint paint) {
        View view = this.R;
        if (view != null) {
            com.androidquery.util.a.C(view, ProtectedSandApp.s("ܝ"), false, false, f41101e0, Integer.valueOf(i4), paint);
        }
        return this;
    }

    public T q(String str, long j4) {
        return e(str, byte[].class, j4, null, null);
    }

    public T q0(int i4, boolean z4) {
        z1(false, i4, z4);
        return this;
    }

    public T q1(int i4) {
        View view = this.R;
        if (view instanceof AbsListView) {
            com.androidquery.util.a.C(view, ProtectedSandApp.s("ܞ"), false, false, f41100d0, Integer.valueOf(i4));
        }
        return this;
    }

    public T r(boolean z4) {
        View view = this.R;
        if (view instanceof CompoundButton) {
            ((CompoundButton) view).setChecked(z4);
        }
        return this;
    }

    public T r0(int i4) {
        return s0(J(i4));
    }

    public T s() {
        View view = this.R;
        if (view != null) {
            if (view instanceof ImageView) {
                ImageView imageView = (ImageView) view;
                imageView.setImageBitmap(null);
                imageView.setTag(d.f41256v, null);
            } else if (view instanceof WebView) {
                WebView webView = (WebView) view;
                webView.stopLoading();
                webView.clearView();
                webView.setTag(d.f41256v, null);
            } else if (view instanceof TextView) {
                ((TextView) view).setText("");
            }
        }
        return this;
    }

    public T s0(View view) {
        this.R = view;
        l1();
        return this;
    }

    public T s1(int i4) {
        View view = this.R;
        if (view instanceof AdapterView) {
            ((AdapterView) view).setSelection(i4);
        }
        return this;
    }

    public T t() {
        View view = this.R;
        if (view != null) {
            view.performClick();
        }
        return this;
    }

    public T t0(String str) {
        return s0(K(str));
    }

    public boolean t1(int i4, int i5, boolean z4, View view, ViewGroup viewGroup, String str) {
        return c.z(i4, i5, view, viewGroup, str);
    }

    public T u(boolean z4) {
        View view = this.R;
        if (view != null) {
            view.setClickable(z4);
        }
        return this;
    }

    public T u0(int... iArr) {
        return s0(L(iArr));
    }

    public boolean u1(int i4, View view, ViewGroup viewGroup, String str) {
        if (viewGroup instanceof ExpandableListView) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ܟ"));
        }
        return c.B(i4, view, viewGroup, str);
    }

    public T v(View.OnClickListener onClickListener) {
        View view = this.R;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
        return this;
    }

    public T v0(int i4) {
        View view = this.R;
        if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            imageView.setTag(d.f41256v, null);
            if (i4 == 0) {
                imageView.setImageBitmap(null);
            } else {
                imageView.setImageResource(i4);
            }
        }
        return this;
    }

    public boolean v1(int i4, boolean z4, View view, ViewGroup viewGroup, String str) {
        return c.z(i4, -1, view, viewGroup, str);
    }

    public T w(Object obj, String str) {
        return v(new c().e(obj, str, true, Y));
    }

    public T w0(Bitmap bitmap) {
        View view = this.R;
        if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            imageView.setTag(d.f41256v, null);
            imageView.setImageBitmap(bitmap);
        }
        return this;
    }

    @Deprecated
    public boolean w1(View view, ViewGroup viewGroup, String str, float f4) {
        return c.B(-1, view, viewGroup, str);
    }

    protected T x(View view) {
        Exception e4;
        T t4;
        try {
            t4 = S().newInstance(view);
        } catch (Exception e5) {
            e4 = e5;
            t4 = null;
        }
        try {
            t4.P = this.P;
        } catch (Exception e6) {
            e4 = e6;
            e4.printStackTrace();
            return t4;
        }
        return t4;
    }

    public T x0(Bitmap bitmap, float f4) {
        com.androidquery.callback.d dVar = new com.androidquery.callback.d();
        dVar.Y1(f4).p1(bitmap);
        return z0(dVar);
    }

    @Deprecated
    public boolean x1(View view, ViewGroup viewGroup, String str, float f4, boolean z4) {
        return c.B(-1, view, viewGroup, str);
    }

    public T y() {
        View view = this.R;
        if (view instanceof AdapterView) {
            Adapter adapter = ((AdapterView) view).getAdapter();
            if (adapter instanceof BaseAdapter) {
                ((BaseAdapter) adapter).notifyDataSetChanged();
            }
        }
        return this;
    }

    public T y0(Drawable drawable) {
        View view = this.R;
        if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            imageView.setTag(d.f41256v, null);
            imageView.setImageDrawable(drawable);
        }
        return this;
    }

    public T y1(Dialog dialog) {
        if (dialog != null) {
            try {
                dialog.show();
                f41102f0.put(dialog, null);
            } catch (Exception unused) {
            }
        }
        return this;
    }

    public <K> T z(String str, Class<K> cls, com.androidquery.callback.b<K> bVar) {
        bVar.d1(str).b1(cls).s0(2);
        return c(bVar);
    }

    public T z0(com.androidquery.callback.d dVar) {
        View view = this.R;
        if (view instanceof ImageView) {
            dVar.P1((ImageView) view);
            O0(dVar);
        }
        return this;
    }

    public b(View view) {
        this.O = view;
        this.R = view;
    }

    public b(Activity activity, View view) {
        this.O = view;
        this.R = view;
        this.P = activity;
    }

    public b(Context context) {
        this.Q = context;
    }
}
