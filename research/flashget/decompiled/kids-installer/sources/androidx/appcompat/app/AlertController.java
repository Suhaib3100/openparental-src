package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.annotation.q0;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.y1;
import androidx.core.widget.NestedScrollView;
import d.a;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class AlertController {
    NestedScrollView A;
    private Drawable C;
    private ImageView D;
    private TextView E;
    private TextView F;
    private View G;
    ListAdapter H;
    private int J;
    private int K;
    int L;
    int M;
    int N;
    int O;
    private boolean P;
    Handler R;

    /* renamed from: a, reason: collision with root package name */
    private final Context f167a;

    /* renamed from: b, reason: collision with root package name */
    final androidx.appcompat.app.h f168b;

    /* renamed from: c, reason: collision with root package name */
    private final Window f169c;

    /* renamed from: d, reason: collision with root package name */
    private final int f170d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f171e;

    /* renamed from: f, reason: collision with root package name */
    private CharSequence f172f;

    /* renamed from: g, reason: collision with root package name */
    ListView f173g;

    /* renamed from: h, reason: collision with root package name */
    private View f174h;

    /* renamed from: i, reason: collision with root package name */
    private int f175i;

    /* renamed from: j, reason: collision with root package name */
    private int f176j;

    /* renamed from: k, reason: collision with root package name */
    private int f177k;

    /* renamed from: l, reason: collision with root package name */
    private int f178l;

    /* renamed from: m, reason: collision with root package name */
    private int f179m;

    /* renamed from: o, reason: collision with root package name */
    Button f181o;

    /* renamed from: p, reason: collision with root package name */
    private CharSequence f182p;

    /* renamed from: q, reason: collision with root package name */
    Message f183q;

    /* renamed from: r, reason: collision with root package name */
    private Drawable f184r;

    /* renamed from: s, reason: collision with root package name */
    Button f185s;

    /* renamed from: t, reason: collision with root package name */
    private CharSequence f186t;

    /* renamed from: u, reason: collision with root package name */
    Message f187u;

    /* renamed from: v, reason: collision with root package name */
    private Drawable f188v;

    /* renamed from: w, reason: collision with root package name */
    Button f189w;

    /* renamed from: x, reason: collision with root package name */
    private CharSequence f190x;

    /* renamed from: y, reason: collision with root package name */
    Message f191y;

    /* renamed from: z, reason: collision with root package name */
    private Drawable f192z;

    /* renamed from: n, reason: collision with root package name */
    private boolean f180n = false;
    private int B = 0;
    int I = -1;
    private int Q = 0;
    private final View.OnClickListener S = new a();

    public static class RecycleListView extends ListView {

        /* renamed from: o, reason: collision with root package name */
        private final int f193o;

        /* renamed from: p, reason: collision with root package name */
        private final int f194p;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public void a(boolean z5, boolean z6) {
            if (z6 && z5) {
                return;
            }
            setPadding(getPaddingLeft(), z5 ? getPaddingTop() : this.f193o, getPaddingRight(), z6 ? getPaddingBottom() : this.f194p);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.n.c6);
            this.f194p = obtainStyledAttributes.getDimensionPixelOffset(a.n.d6, -1);
            this.f193o = obtainStyledAttributes.getDimensionPixelOffset(a.n.e6, -1);
        }
    }

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            Message obtain = (view != alertController.f181o || (message3 = alertController.f183q) == null) ? (view != alertController.f185s || (message2 = alertController.f187u) == null) ? (view != alertController.f189w || (message = alertController.f191y) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
            if (obtain != null) {
                obtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.R.obtainMessage(1, alertController2.f168b).sendToTarget();
        }
    }

    /* loaded from: classes2.dex */
    class b implements NestedScrollView.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f196a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f197b;

        b(View view, View view2) {
            this.f196a = view;
            this.f197b = view2;
        }

        @Override // androidx.core.widget.NestedScrollView.c
        public void a(NestedScrollView nestedScrollView, int i5, int i6, int i7, int i8) {
            AlertController.g(nestedScrollView, this.f196a, this.f197b);
        }
    }

    class c implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ View f199o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ View f200p;

        c(View view, View view2) {
            this.f199o = view;
            this.f200p = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.g(AlertController.this.A, this.f199o, this.f200p);
        }
    }

    class d implements AbsListView.OnScrollListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f202a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f203b;

        d(View view, View view2) {
            this.f202a = view;
            this.f203b = view2;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i5, int i6, int i7) {
            AlertController.g(absListView, this.f202a, this.f203b);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i5) {
        }
    }

    class e implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ View f205o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ View f206p;

        e(View view, View view2) {
            this.f205o = view;
            this.f206p = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.g(AlertController.this.f173g, this.f205o, this.f206p);
        }
    }

    public static class f {
        public int A;
        public int B;
        public int C;
        public int D;
        public boolean[] F;
        public boolean G;
        public boolean H;
        public DialogInterface.OnMultiChoiceClickListener J;
        public Cursor K;
        public String L;
        public String M;
        public boolean N;
        public AdapterView.OnItemSelectedListener O;
        public e P;

        /* renamed from: a, reason: collision with root package name */
        public final Context f208a;

        /* renamed from: b, reason: collision with root package name */
        public final LayoutInflater f209b;

        /* renamed from: d, reason: collision with root package name */
        public Drawable f211d;

        /* renamed from: f, reason: collision with root package name */
        public CharSequence f213f;

        /* renamed from: g, reason: collision with root package name */
        public View f214g;

        /* renamed from: h, reason: collision with root package name */
        public CharSequence f215h;

        /* renamed from: i, reason: collision with root package name */
        public CharSequence f216i;

        /* renamed from: j, reason: collision with root package name */
        public Drawable f217j;

        /* renamed from: k, reason: collision with root package name */
        public DialogInterface.OnClickListener f218k;

        /* renamed from: l, reason: collision with root package name */
        public CharSequence f219l;

        /* renamed from: m, reason: collision with root package name */
        public Drawable f220m;

        /* renamed from: n, reason: collision with root package name */
        public DialogInterface.OnClickListener f221n;

        /* renamed from: o, reason: collision with root package name */
        public CharSequence f222o;

        /* renamed from: p, reason: collision with root package name */
        public Drawable f223p;

        /* renamed from: q, reason: collision with root package name */
        public DialogInterface.OnClickListener f224q;

        /* renamed from: s, reason: collision with root package name */
        public DialogInterface.OnCancelListener f226s;

        /* renamed from: t, reason: collision with root package name */
        public DialogInterface.OnDismissListener f227t;

        /* renamed from: u, reason: collision with root package name */
        public DialogInterface.OnKeyListener f228u;

        /* renamed from: v, reason: collision with root package name */
        public CharSequence[] f229v;

        /* renamed from: w, reason: collision with root package name */
        public ListAdapter f230w;

        /* renamed from: x, reason: collision with root package name */
        public DialogInterface.OnClickListener f231x;

        /* renamed from: y, reason: collision with root package name */
        public int f232y;

        /* renamed from: z, reason: collision with root package name */
        public View f233z;

        /* renamed from: c, reason: collision with root package name */
        public int f210c = 0;

        /* renamed from: e, reason: collision with root package name */
        public int f212e = 0;
        public boolean E = false;
        public int I = -1;
        public boolean Q = true;

        /* renamed from: r, reason: collision with root package name */
        public boolean f225r = true;

        class a extends ArrayAdapter<CharSequence> {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ RecycleListView f234o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, int i5, int i6, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i5, i6, charSequenceArr);
                this.f234o = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i5, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i5, view, viewGroup);
                boolean[] zArr = f.this.F;
                if (zArr != null && zArr[i5]) {
                    this.f234o.setItemChecked(i5, true);
                }
                return view2;
            }
        }

        class b extends CursorAdapter {

            /* renamed from: o, reason: collision with root package name */
            private final int f236o;

            /* renamed from: p, reason: collision with root package name */
            private final int f237p;

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ RecycleListView f238q;

            /* renamed from: r, reason: collision with root package name */
            final /* synthetic */ AlertController f239r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Context context, Cursor cursor, boolean z5, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z5);
                this.f238q = recycleListView;
                this.f239r = alertController;
                Cursor cursor2 = getCursor();
                this.f236o = cursor2.getColumnIndexOrThrow(f.this.L);
                this.f237p = cursor2.getColumnIndexOrThrow(f.this.M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f236o));
                this.f238q.setItemChecked(cursor.getPosition(), cursor.getInt(this.f237p) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return f.this.f209b.inflate(this.f239r.M, viewGroup, false);
            }
        }

        class c implements AdapterView.OnItemClickListener {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ AlertController f241o;

            c(AlertController alertController) {
                this.f241o = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i5, long j5) {
                f.this.f231x.onClick(this.f241o.f168b, i5);
                if (f.this.H) {
                    return;
                }
                this.f241o.f168b.dismiss();
            }
        }

        class d implements AdapterView.OnItemClickListener {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ RecycleListView f243o;

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ AlertController f244p;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f243o = recycleListView;
                this.f244p = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i5, long j5) {
                boolean[] zArr = f.this.F;
                if (zArr != null) {
                    zArr[i5] = this.f243o.isItemChecked(i5);
                }
                f.this.J.onClick(this.f244p.f168b, i5, this.f243o.isItemChecked(i5));
            }
        }

        public interface e {
            void a(ListView listView);
        }

        public f(Context context) {
            this.f208a = context;
            this.f209b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        private void b(AlertController alertController) {
            ListAdapter listAdapter;
            RecycleListView recycleListView = (RecycleListView) this.f209b.inflate(alertController.L, (ViewGroup) null);
            if (this.G) {
                listAdapter = this.K == null ? new a(this.f208a, alertController.M, R.id.text1, this.f229v, recycleListView) : new b(this.f208a, this.K, false, recycleListView, alertController);
            } else {
                int i5 = this.H ? alertController.N : alertController.O;
                if (this.K != null) {
                    listAdapter = new SimpleCursorAdapter(this.f208a, i5, this.K, new String[]{this.L}, new int[]{R.id.text1});
                } else {
                    listAdapter = this.f230w;
                    if (listAdapter == null) {
                        listAdapter = new h(this.f208a, i5, R.id.text1, this.f229v);
                    }
                }
            }
            e eVar = this.P;
            if (eVar != null) {
                eVar.a(recycleListView);
            }
            alertController.H = listAdapter;
            alertController.I = this.I;
            if (this.f231x != null) {
                recycleListView.setOnItemClickListener(new c(alertController));
            } else if (this.J != null) {
                recycleListView.setOnItemClickListener(new d(recycleListView, alertController));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.O;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (this.H) {
                recycleListView.setChoiceMode(1);
            } else if (this.G) {
                recycleListView.setChoiceMode(2);
            }
            alertController.f173g = recycleListView;
        }

        public void a(AlertController alertController) {
            View view = this.f214g;
            if (view != null) {
                alertController.n(view);
            } else {
                CharSequence charSequence = this.f213f;
                if (charSequence != null) {
                    alertController.s(charSequence);
                }
                Drawable drawable = this.f211d;
                if (drawable != null) {
                    alertController.p(drawable);
                }
                int i5 = this.f210c;
                if (i5 != 0) {
                    alertController.o(i5);
                }
                int i6 = this.f212e;
                if (i6 != 0) {
                    alertController.o(alertController.d(i6));
                }
            }
            CharSequence charSequence2 = this.f215h;
            if (charSequence2 != null) {
                alertController.q(charSequence2);
            }
            CharSequence charSequence3 = this.f216i;
            if (charSequence3 != null || this.f217j != null) {
                alertController.l(-1, charSequence3, this.f218k, null, this.f217j);
            }
            CharSequence charSequence4 = this.f219l;
            if (charSequence4 != null || this.f220m != null) {
                alertController.l(-2, charSequence4, this.f221n, null, this.f220m);
            }
            CharSequence charSequence5 = this.f222o;
            if (charSequence5 != null || this.f223p != null) {
                alertController.l(-3, charSequence5, this.f224q, null, this.f223p);
            }
            if (this.f229v != null || this.K != null || this.f230w != null) {
                b(alertController);
            }
            View view2 = this.f233z;
            if (view2 != null) {
                if (this.E) {
                    alertController.v(view2, this.A, this.B, this.C, this.D);
                    return;
                } else {
                    alertController.u(view2);
                    return;
                }
            }
            int i7 = this.f232y;
            if (i7 != 0) {
                alertController.t(i7);
            }
        }
    }

    private static final class g extends Handler {

        /* renamed from: b, reason: collision with root package name */
        private static final int f246b = 1;

        /* renamed from: a, reason: collision with root package name */
        private WeakReference<DialogInterface> f247a;

        public g(DialogInterface dialogInterface) {
            this.f247a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i5 = message.what;
            if (i5 == -3 || i5 == -2 || i5 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f247a.get(), message.what);
            } else {
                if (i5 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    private static class h extends ArrayAdapter<CharSequence> {
        public h(Context context, int i5, int i6, CharSequence[] charSequenceArr) {
            super(context, i5, i6, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i5) {
            return i5;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, androidx.appcompat.app.h hVar, Window window) {
        this.f167a = context;
        this.f168b = hVar;
        this.f169c = window;
        this.R = new g(hVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, a.n.T, a.c.M, 0);
        this.J = obtainStyledAttributes.getResourceId(a.n.U, 0);
        this.K = obtainStyledAttributes.getResourceId(a.n.W, 0);
        this.L = obtainStyledAttributes.getResourceId(a.n.Y, 0);
        this.M = obtainStyledAttributes.getResourceId(a.n.Z, 0);
        this.N = obtainStyledAttributes.getResourceId(a.n.f22166b0, 0);
        this.O = obtainStyledAttributes.getResourceId(a.n.X, 0);
        this.P = obtainStyledAttributes.getBoolean(a.n.f22159a0, true);
        this.f170d = obtainStyledAttributes.getDimensionPixelSize(a.n.V, 0);
        obtainStyledAttributes.recycle();
        hVar.e(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A() {
        View findViewById;
        ListAdapter listAdapter;
        View findViewById2;
        View findViewById3 = this.f169c.findViewById(a.h.O0);
        int i5 = a.h.O1;
        View findViewById4 = findViewById3.findViewById(i5);
        int i6 = a.h.f21882j0;
        View findViewById5 = findViewById3.findViewById(i6);
        int i7 = a.h.f21867e0;
        View findViewById6 = findViewById3.findViewById(i7);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(a.h.f21888l0);
        y(viewGroup);
        View findViewById7 = viewGroup.findViewById(i5);
        View findViewById8 = viewGroup.findViewById(i6);
        View findViewById9 = viewGroup.findViewById(i7);
        ViewGroup j5 = j(findViewById7, findViewById4);
        ViewGroup j6 = j(findViewById8, findViewById5);
        ViewGroup j7 = j(findViewById9, findViewById6);
        x(j6);
        w(j7);
        z(j5);
        boolean z5 = viewGroup.getVisibility() != 8;
        boolean z6 = (j5 == null || j5.getVisibility() == 8) ? 0 : 1;
        boolean z7 = (j7 == null || j7.getVisibility() == 8) ? false : true;
        if (!z7 && j6 != null && (findViewById2 = j6.findViewById(a.h.I1)) != null) {
            findViewById2.setVisibility(0);
        }
        if (z6 != 0) {
            NestedScrollView nestedScrollView = this.A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View findViewById10 = (this.f172f == null && this.f173g == null) ? null : j5.findViewById(a.h.M1);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        } else if (j6 != null && (findViewById = j6.findViewById(a.h.J1)) != null) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f173g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z6, z7);
        }
        if (!z5) {
            View view = this.f173g;
            if (view == null) {
                view = this.A;
            }
            if (view != null) {
                r(j6, view, z6 | (z7 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f173g;
        if (listView2 == null || (listAdapter = this.H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i8 = this.I;
        if (i8 > -1) {
            listView2.setItemChecked(i8, true);
            listView2.setSelection(i8);
        }
    }

    private static boolean B(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(a.c.L, typedValue, true);
        return typedValue.data != 0;
    }

    static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    static void g(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    @q0
    private ViewGroup j(@q0 View view, @q0 View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    private int k() {
        int i5 = this.K;
        return i5 == 0 ? this.J : this.Q == 1 ? i5 : this.J;
    }

    private void r(ViewGroup viewGroup, View view, int i5, int i6) {
        View findViewById = this.f169c.findViewById(a.h.W0);
        View findViewById2 = this.f169c.findViewById(a.h.V0);
        y1.p2(view, i5, i6);
        if (findViewById != null) {
            viewGroup.removeView(findViewById);
        }
        if (findViewById2 != null) {
            viewGroup.removeView(findViewById2);
        }
    }

    private void w(ViewGroup viewGroup) {
        int i5;
        Button button = (Button) viewGroup.findViewById(R.id.button1);
        this.f181o = button;
        button.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f182p) && this.f184r == null) {
            this.f181o.setVisibility(8);
            i5 = 0;
        } else {
            this.f181o.setText(this.f182p);
            Drawable drawable = this.f184r;
            if (drawable != null) {
                int i6 = this.f170d;
                drawable.setBounds(0, 0, i6, i6);
                this.f181o.setCompoundDrawables(this.f184r, null, null, null);
            }
            this.f181o.setVisibility(0);
            i5 = 1;
        }
        Button button2 = (Button) viewGroup.findViewById(R.id.button2);
        this.f185s = button2;
        button2.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f186t) && this.f188v == null) {
            this.f185s.setVisibility(8);
        } else {
            this.f185s.setText(this.f186t);
            Drawable drawable2 = this.f188v;
            if (drawable2 != null) {
                int i7 = this.f170d;
                drawable2.setBounds(0, 0, i7, i7);
                this.f185s.setCompoundDrawables(this.f188v, null, null, null);
            }
            this.f185s.setVisibility(0);
            i5 |= 2;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button3);
        this.f189w = button3;
        button3.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f190x) && this.f192z == null) {
            this.f189w.setVisibility(8);
        } else {
            this.f189w.setText(this.f190x);
            Drawable drawable3 = this.f192z;
            if (drawable3 != null) {
                int i8 = this.f170d;
                drawable3.setBounds(0, 0, i8, i8);
                this.f189w.setCompoundDrawables(this.f192z, null, null, null);
            }
            this.f189w.setVisibility(0);
            i5 |= 4;
        }
        if (B(this.f167a)) {
            if (i5 == 1) {
                b(this.f181o);
            } else if (i5 == 2) {
                b(this.f185s);
            } else if (i5 == 4) {
                b(this.f189w);
            }
        }
        if (i5 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void x(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f169c.findViewById(a.h.X0);
        this.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f172f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.A.removeView(this.F);
        if (this.f173g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.A.getParent();
        int indexOfChild = viewGroup2.indexOfChild(this.A);
        viewGroup2.removeViewAt(indexOfChild);
        viewGroup2.addView(this.f173g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    private void y(ViewGroup viewGroup) {
        View view = this.f174h;
        if (view == null) {
            view = this.f175i != 0 ? LayoutInflater.from(this.f167a).inflate(this.f175i, viewGroup, false) : null;
        }
        boolean z5 = view != null;
        if (!z5 || !a(view)) {
            this.f169c.setFlags(131072, 131072);
        }
        if (!z5) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f169c.findViewById(a.h.f21885k0);
        frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
        if (this.f180n) {
            frameLayout.setPadding(this.f176j, this.f177k, this.f178l, this.f179m);
        }
        if (this.f173g != null) {
            ((LinearLayout.LayoutParams) ((LinearLayoutCompat.LayoutParams) viewGroup.getLayoutParams())).weight = 0.0f;
        }
    }

    private void z(ViewGroup viewGroup) {
        if (this.G != null) {
            viewGroup.addView(this.G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f169c.findViewById(a.h.N1).setVisibility(8);
            return;
        }
        this.D = (ImageView) this.f169c.findViewById(R.id.icon);
        if (!(!TextUtils.isEmpty(this.f171e)) || !this.P) {
            this.f169c.findViewById(a.h.N1).setVisibility(8);
            this.D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f169c.findViewById(a.h.f21858b0);
        this.E = textView;
        textView.setText(this.f171e);
        int i5 = this.B;
        if (i5 != 0) {
            this.D.setImageResource(i5);
            return;
        }
        Drawable drawable = this.C;
        if (drawable != null) {
            this.D.setImageDrawable(drawable);
        } else {
            this.E.setPadding(this.D.getPaddingLeft(), this.D.getPaddingTop(), this.D.getPaddingRight(), this.D.getPaddingBottom());
            this.D.setVisibility(8);
        }
    }

    public Button c(int i5) {
        if (i5 == -3) {
            return this.f189w;
        }
        if (i5 == -2) {
            return this.f185s;
        }
        if (i5 != -1) {
            return null;
        }
        return this.f181o;
    }

    public int d(int i5) {
        TypedValue typedValue = new TypedValue();
        this.f167a.getTheme().resolveAttribute(i5, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView e() {
        return this.f173g;
    }

    public void f() {
        this.f168b.setContentView(k());
        A();
    }

    public boolean h(int i5, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.q(keyEvent);
    }

    public boolean i(int i5, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.q(keyEvent);
    }

    public void l(int i5, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.R.obtainMessage(i5, onClickListener);
        }
        if (i5 == -3) {
            this.f190x = charSequence;
            this.f191y = message;
            this.f192z = drawable;
        } else if (i5 == -2) {
            this.f186t = charSequence;
            this.f187u = message;
            this.f188v = drawable;
        } else {
            if (i5 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f182p = charSequence;
            this.f183q = message;
            this.f184r = drawable;
        }
    }

    public void m(int i5) {
        this.Q = i5;
    }

    public void n(View view) {
        this.G = view;
    }

    public void o(int i5) {
        this.C = null;
        this.B = i5;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (i5 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.D.setImageResource(this.B);
            }
        }
    }

    public void p(Drawable drawable) {
        this.C = drawable;
        this.B = 0;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.D.setImageDrawable(drawable);
            }
        }
    }

    public void q(CharSequence charSequence) {
        this.f172f = charSequence;
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void s(CharSequence charSequence) {
        this.f171e = charSequence;
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void t(int i5) {
        this.f174h = null;
        this.f175i = i5;
        this.f180n = false;
    }

    public void u(View view) {
        this.f174h = view;
        this.f175i = 0;
        this.f180n = false;
    }

    public void v(View view, int i5, int i6, int i7, int i8) {
        this.f174h = view;
        this.f175i = 0;
        this.f180n = true;
        this.f176j = i5;
        this.f177k = i6;
        this.f178l = i7;
        this.f179m = i8;
    }
}
