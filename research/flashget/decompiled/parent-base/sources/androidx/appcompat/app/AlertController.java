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
import androidx.core.view.x1;
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
    private final Context f660a;

    /* renamed from: b, reason: collision with root package name */
    final r f661b;

    /* renamed from: c, reason: collision with root package name */
    private final Window f662c;

    /* renamed from: d, reason: collision with root package name */
    private final int f663d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f664e;

    /* renamed from: f, reason: collision with root package name */
    private CharSequence f665f;

    /* renamed from: g, reason: collision with root package name */
    ListView f666g;

    /* renamed from: h, reason: collision with root package name */
    private View f667h;

    /* renamed from: i, reason: collision with root package name */
    private int f668i;

    /* renamed from: j, reason: collision with root package name */
    private int f669j;

    /* renamed from: k, reason: collision with root package name */
    private int f670k;

    /* renamed from: l, reason: collision with root package name */
    private int f671l;

    /* renamed from: m, reason: collision with root package name */
    private int f672m;

    /* renamed from: o, reason: collision with root package name */
    Button f674o;

    /* renamed from: p, reason: collision with root package name */
    private CharSequence f675p;

    /* renamed from: q, reason: collision with root package name */
    Message f676q;

    /* renamed from: r, reason: collision with root package name */
    private Drawable f677r;

    /* renamed from: s, reason: collision with root package name */
    Button f678s;

    /* renamed from: t, reason: collision with root package name */
    private CharSequence f679t;

    /* renamed from: u, reason: collision with root package name */
    Message f680u;

    /* renamed from: v, reason: collision with root package name */
    private Drawable f681v;

    /* renamed from: w, reason: collision with root package name */
    Button f682w;

    /* renamed from: x, reason: collision with root package name */
    private CharSequence f683x;

    /* renamed from: y, reason: collision with root package name */
    Message f684y;

    /* renamed from: z, reason: collision with root package name */
    private Drawable f685z;

    /* renamed from: n, reason: collision with root package name */
    private boolean f673n = false;
    private int B = 0;
    int I = -1;
    private int Q = 0;
    private final View.OnClickListener S = new a();

    public static class RecycleListView extends ListView {

        /* renamed from: b, reason: collision with root package name */
        private final int f686b;

        /* renamed from: c, reason: collision with root package name */
        private final int f687c;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public void a(boolean z4, boolean z5) {
            if (z5 && z4) {
                return;
            }
            setPadding(getPaddingLeft(), z4 ? getPaddingTop() : this.f686b, getPaddingRight(), z5 ? getPaddingBottom() : this.f687c);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.m.Y4);
            this.f687c = obtainStyledAttributes.getDimensionPixelOffset(a.m.Z4, -1);
            this.f686b = obtainStyledAttributes.getDimensionPixelOffset(a.m.a5, -1);
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
            Message obtain = (view != alertController.f674o || (message3 = alertController.f676q) == null) ? (view != alertController.f678s || (message2 = alertController.f680u) == null) ? (view != alertController.f682w || (message = alertController.f684y) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
            if (obtain != null) {
                obtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.R.obtainMessage(1, alertController2.f661b).sendToTarget();
        }
    }

    class b implements NestedScrollView.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f689a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f690b;

        b(View view, View view2) {
            this.f689a = view;
            this.f690b = view2;
        }

        @Override // androidx.core.widget.NestedScrollView.e
        public void a(NestedScrollView nestedScrollView, int i4, int i5, int i6, int i7) {
            AlertController.g(nestedScrollView, this.f689a, this.f690b);
        }
    }

    class c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f692b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f693c;

        c(View view, View view2) {
            this.f692b = view;
            this.f693c = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.g(AlertController.this.A, this.f692b, this.f693c);
        }
    }

    class d implements AbsListView.OnScrollListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f695b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f696c;

        d(View view, View view2) {
            this.f695b = view;
            this.f696c = view2;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
            AlertController.g(absListView, this.f695b, this.f696c);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i4) {
        }
    }

    class e implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f698b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f699c;

        e(View view, View view2) {
            this.f698b = view;
            this.f699c = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.g(AlertController.this.f666g, this.f698b, this.f699c);
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
        public final Context f701a;

        /* renamed from: b, reason: collision with root package name */
        public final LayoutInflater f702b;

        /* renamed from: d, reason: collision with root package name */
        public Drawable f704d;

        /* renamed from: f, reason: collision with root package name */
        public CharSequence f706f;

        /* renamed from: g, reason: collision with root package name */
        public View f707g;

        /* renamed from: h, reason: collision with root package name */
        public CharSequence f708h;

        /* renamed from: i, reason: collision with root package name */
        public CharSequence f709i;

        /* renamed from: j, reason: collision with root package name */
        public Drawable f710j;

        /* renamed from: k, reason: collision with root package name */
        public DialogInterface.OnClickListener f711k;

        /* renamed from: l, reason: collision with root package name */
        public CharSequence f712l;

        /* renamed from: m, reason: collision with root package name */
        public Drawable f713m;

        /* renamed from: n, reason: collision with root package name */
        public DialogInterface.OnClickListener f714n;

        /* renamed from: o, reason: collision with root package name */
        public CharSequence f715o;

        /* renamed from: p, reason: collision with root package name */
        public Drawable f716p;

        /* renamed from: q, reason: collision with root package name */
        public DialogInterface.OnClickListener f717q;

        /* renamed from: s, reason: collision with root package name */
        public DialogInterface.OnCancelListener f719s;

        /* renamed from: t, reason: collision with root package name */
        public DialogInterface.OnDismissListener f720t;

        /* renamed from: u, reason: collision with root package name */
        public DialogInterface.OnKeyListener f721u;

        /* renamed from: v, reason: collision with root package name */
        public CharSequence[] f722v;

        /* renamed from: w, reason: collision with root package name */
        public ListAdapter f723w;

        /* renamed from: x, reason: collision with root package name */
        public DialogInterface.OnClickListener f724x;

        /* renamed from: y, reason: collision with root package name */
        public int f725y;

        /* renamed from: z, reason: collision with root package name */
        public View f726z;

        /* renamed from: c, reason: collision with root package name */
        public int f703c = 0;

        /* renamed from: e, reason: collision with root package name */
        public int f705e = 0;
        public boolean E = false;
        public int I = -1;
        public boolean Q = true;

        /* renamed from: r, reason: collision with root package name */
        public boolean f718r = true;

        class a extends ArrayAdapter<CharSequence> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ RecycleListView f727b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, int i4, int i5, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i4, i5, charSequenceArr);
                this.f727b = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i4, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i4, view, viewGroup);
                boolean[] zArr = f.this.F;
                if (zArr != null && zArr[i4]) {
                    this.f727b.setItemChecked(i4, true);
                }
                return view2;
            }
        }

        class b extends CursorAdapter {

            /* renamed from: b, reason: collision with root package name */
            private final int f729b;

            /* renamed from: c, reason: collision with root package name */
            private final int f730c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ RecycleListView f731d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ AlertController f732e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Context context, Cursor cursor, boolean z4, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z4);
                this.f731d = recycleListView;
                this.f732e = alertController;
                Cursor cursor2 = getCursor();
                this.f729b = cursor2.getColumnIndexOrThrow(f.this.L);
                this.f730c = cursor2.getColumnIndexOrThrow(f.this.M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f729b));
                this.f731d.setItemChecked(cursor.getPosition(), cursor.getInt(this.f730c) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return f.this.f702b.inflate(this.f732e.M, viewGroup, false);
            }
        }

        class c implements AdapterView.OnItemClickListener {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AlertController f734b;

            c(AlertController alertController) {
                this.f734b = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
                f.this.f724x.onClick(this.f734b.f661b, i4);
                if (f.this.H) {
                    return;
                }
                this.f734b.f661b.dismiss();
            }
        }

        class d implements AdapterView.OnItemClickListener {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ RecycleListView f736b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AlertController f737c;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f736b = recycleListView;
                this.f737c = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
                boolean[] zArr = f.this.F;
                if (zArr != null) {
                    zArr[i4] = this.f736b.isItemChecked(i4);
                }
                f.this.J.onClick(this.f737c.f661b, i4, this.f736b.isItemChecked(i4));
            }
        }

        public interface e {
            void a(ListView listView);
        }

        public f(Context context) {
            this.f701a = context;
            this.f702b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        private void b(AlertController alertController) {
            ListAdapter listAdapter;
            RecycleListView recycleListView = (RecycleListView) this.f702b.inflate(alertController.L, (ViewGroup) null);
            if (this.G) {
                listAdapter = this.K == null ? new a(this.f701a, alertController.M, R.id.text1, this.f722v, recycleListView) : new b(this.f701a, this.K, false, recycleListView, alertController);
            } else {
                int i4 = this.H ? alertController.N : alertController.O;
                if (this.K != null) {
                    listAdapter = new SimpleCursorAdapter(this.f701a, i4, this.K, new String[]{this.L}, new int[]{R.id.text1});
                } else {
                    listAdapter = this.f723w;
                    if (listAdapter == null) {
                        listAdapter = new h(this.f701a, i4, R.id.text1, (Object[]) this.f722v);
                    }
                }
            }
            e eVar = this.P;
            if (eVar != null) {
                eVar.a(recycleListView);
            }
            alertController.H = listAdapter;
            alertController.I = this.I;
            if (this.f724x != null) {
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
            alertController.f666g = recycleListView;
        }

        public void a(AlertController alertController) {
            View view = this.f707g;
            if (view != null) {
                alertController.n(view);
            } else {
                CharSequence charSequence = this.f706f;
                if (charSequence != null) {
                    alertController.s(charSequence);
                }
                Drawable drawable = this.f704d;
                if (drawable != null) {
                    alertController.p(drawable);
                }
                int i4 = this.f703c;
                if (i4 != 0) {
                    alertController.o(i4);
                }
                int i5 = this.f705e;
                if (i5 != 0) {
                    alertController.o(alertController.d(i5));
                }
            }
            CharSequence charSequence2 = this.f708h;
            if (charSequence2 != null) {
                alertController.q(charSequence2);
            }
            CharSequence charSequence3 = this.f709i;
            if (charSequence3 != null || this.f710j != null) {
                alertController.l(-1, charSequence3, this.f711k, null, this.f710j);
            }
            CharSequence charSequence4 = this.f712l;
            if (charSequence4 != null || this.f713m != null) {
                alertController.l(-2, charSequence4, this.f714n, null, this.f713m);
            }
            CharSequence charSequence5 = this.f715o;
            if (charSequence5 != null || this.f716p != null) {
                alertController.l(-3, charSequence5, this.f717q, null, this.f716p);
            }
            if (this.f722v != null || this.K != null || this.f723w != null) {
                b(alertController);
            }
            View view2 = this.f726z;
            if (view2 != null) {
                if (this.E) {
                    alertController.v(view2, this.A, this.B, this.C, this.D);
                    return;
                } else {
                    alertController.u(view2);
                    return;
                }
            }
            int i6 = this.f725y;
            if (i6 != 0) {
                alertController.t(i6);
            }
        }
    }

    private static final class g extends Handler {

        /* renamed from: b, reason: collision with root package name */
        private static final int f739b = 1;

        /* renamed from: a, reason: collision with root package name */
        private WeakReference<DialogInterface> f740a;

        public g(DialogInterface dialogInterface) {
            this.f740a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i4 = message.what;
            if (i4 == -3 || i4 == -2 || i4 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f740a.get(), message.what);
            } else {
                if (i4 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    private static class h extends ArrayAdapter<CharSequence> {
        public h(Context context, int i4, int i5, CharSequence[] charSequenceArr) {
            super(context, i4, i5, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, r rVar, Window window) {
        this.f660a = context;
        this.f661b = rVar;
        this.f662c = window;
        this.R = new g(rVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, a.m.T, a.b.M, 0);
        this.J = obtainStyledAttributes.getResourceId(a.m.U, 0);
        this.K = obtainStyledAttributes.getResourceId(a.m.W, 0);
        this.L = obtainStyledAttributes.getResourceId(a.m.Y, 0);
        this.M = obtainStyledAttributes.getResourceId(a.m.Z, 0);
        this.N = obtainStyledAttributes.getResourceId(a.m.f73492b0, 0);
        this.O = obtainStyledAttributes.getResourceId(a.m.X, 0);
        this.P = obtainStyledAttributes.getBoolean(a.m.f73486a0, true);
        this.f663d = obtainStyledAttributes.getDimensionPixelSize(a.m.V, 0);
        obtainStyledAttributes.recycle();
        rVar.n(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A() {
        View findViewById;
        ListAdapter listAdapter;
        View findViewById2;
        View findViewById3 = this.f662c.findViewById(a.g.O);
        int i4 = a.g.f73279v0;
        View findViewById4 = findViewById3.findViewById(i4);
        int i5 = a.g.f73276u;
        View findViewById5 = findViewById3.findViewById(i5);
        int i6 = a.g.f73268q;
        View findViewById6 = findViewById3.findViewById(i6);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(a.g.f73280w);
        y(viewGroup);
        View findViewById7 = viewGroup.findViewById(i4);
        View findViewById8 = viewGroup.findViewById(i5);
        View findViewById9 = viewGroup.findViewById(i6);
        ViewGroup j4 = j(findViewById7, findViewById4);
        ViewGroup j5 = j(findViewById8, findViewById5);
        ViewGroup j6 = j(findViewById9, findViewById6);
        x(j5);
        w(j6);
        z(j4);
        boolean z4 = viewGroup.getVisibility() != 8;
        boolean z5 = (j4 == null || j4.getVisibility() == 8) ? 0 : 1;
        boolean z6 = (j6 == null || j6.getVisibility() == 8) ? false : true;
        if (!z6 && j5 != null && (findViewById2 = j5.findViewById(a.g.f73269q0)) != null) {
            findViewById2.setVisibility(0);
        }
        if (z5 != 0) {
            NestedScrollView nestedScrollView = this.A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View findViewById10 = (this.f665f == null && this.f666g == null) ? null : j4.findViewById(a.g.f73275t0);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        } else if (j5 != null && (findViewById = j5.findViewById(a.g.f73271r0)) != null) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f666g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z5, z6);
        }
        if (!z4) {
            View view = this.f666g;
            if (view == null) {
                view = this.A;
            }
            if (view != null) {
                r(j5, view, z5 | (z6 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f666g;
        if (listView2 == null || (listAdapter = this.H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i7 = this.I;
        if (i7 > -1) {
            listView2.setItemChecked(i7, true);
            listView2.setSelection(i7);
        }
    }

    private static boolean B(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(a.b.L, typedValue, true);
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
        int i4 = this.K;
        return i4 == 0 ? this.J : this.Q == 1 ? i4 : this.J;
    }

    private void r(ViewGroup viewGroup, View view, int i4, int i5) {
        View findViewById = this.f662c.findViewById(a.g.U);
        View findViewById2 = this.f662c.findViewById(a.g.T);
        x1.z2(view, i4, i5);
        if (findViewById != null) {
            viewGroup.removeView(findViewById);
        }
        if (findViewById2 != null) {
            viewGroup.removeView(findViewById2);
        }
    }

    private void w(ViewGroup viewGroup) {
        int i4;
        Button button = (Button) viewGroup.findViewById(R.id.button1);
        this.f674o = button;
        button.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f675p) && this.f677r == null) {
            this.f674o.setVisibility(8);
            i4 = 0;
        } else {
            this.f674o.setText(this.f675p);
            Drawable drawable = this.f677r;
            if (drawable != null) {
                int i5 = this.f663d;
                drawable.setBounds(0, 0, i5, i5);
                this.f674o.setCompoundDrawables(this.f677r, null, null, null);
            }
            this.f674o.setVisibility(0);
            i4 = 1;
        }
        Button button2 = (Button) viewGroup.findViewById(R.id.button2);
        this.f678s = button2;
        button2.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f679t) && this.f681v == null) {
            this.f678s.setVisibility(8);
        } else {
            this.f678s.setText(this.f679t);
            Drawable drawable2 = this.f681v;
            if (drawable2 != null) {
                int i6 = this.f663d;
                drawable2.setBounds(0, 0, i6, i6);
                this.f678s.setCompoundDrawables(this.f681v, null, null, null);
            }
            this.f678s.setVisibility(0);
            i4 |= 2;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button3);
        this.f682w = button3;
        button3.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f683x) && this.f685z == null) {
            this.f682w.setVisibility(8);
        } else {
            this.f682w.setText(this.f683x);
            Drawable drawable3 = this.f685z;
            if (drawable3 != null) {
                int i7 = this.f663d;
                drawable3.setBounds(0, 0, i7, i7);
                this.f682w.setCompoundDrawables(this.f685z, null, null, null);
            }
            this.f682w.setVisibility(0);
            i4 |= 4;
        }
        if (B(this.f660a)) {
            if (i4 == 1) {
                b(this.f674o);
            } else if (i4 == 2) {
                b(this.f678s);
            } else if (i4 == 4) {
                b(this.f682w);
            }
        }
        if (i4 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void x(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f662c.findViewById(a.g.V);
        this.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f665f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.A.removeView(this.F);
        if (this.f666g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.A.getParent();
        int indexOfChild = viewGroup2.indexOfChild(this.A);
        viewGroup2.removeViewAt(indexOfChild);
        viewGroup2.addView(this.f666g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    private void y(ViewGroup viewGroup) {
        View view = this.f667h;
        if (view == null) {
            view = this.f668i != 0 ? LayoutInflater.from(this.f660a).inflate(this.f668i, viewGroup, false) : null;
        }
        boolean z4 = view != null;
        if (!z4 || !a(view)) {
            this.f662c.setFlags(131072, 131072);
        }
        if (!z4) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f662c.findViewById(a.g.f73278v);
        frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
        if (this.f673n) {
            frameLayout.setPadding(this.f669j, this.f670k, this.f671l, this.f672m);
        }
        if (this.f666g != null) {
            ((LinearLayout.LayoutParams) ((LinearLayoutCompat.LayoutParams) viewGroup.getLayoutParams())).weight = 0.0f;
        }
    }

    private void z(ViewGroup viewGroup) {
        if (this.G != null) {
            viewGroup.addView(this.G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f662c.findViewById(a.g.f73277u0).setVisibility(8);
            return;
        }
        this.D = (ImageView) this.f662c.findViewById(R.id.icon);
        if (TextUtils.isEmpty(this.f664e) || !this.P) {
            this.f662c.findViewById(a.g.f73277u0).setVisibility(8);
            this.D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f662c.findViewById(a.g.f73266p);
        this.E = textView;
        textView.setText(this.f664e);
        int i4 = this.B;
        if (i4 != 0) {
            this.D.setImageResource(i4);
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

    public Button c(int i4) {
        if (i4 == -3) {
            return this.f682w;
        }
        if (i4 == -2) {
            return this.f678s;
        }
        if (i4 != -1) {
            return null;
        }
        return this.f674o;
    }

    public int d(int i4) {
        TypedValue typedValue = new TypedValue();
        this.f660a.getTheme().resolveAttribute(i4, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView e() {
        return this.f666g;
    }

    public void f() {
        this.f661b.setContentView(k());
        A();
    }

    public boolean h(int i4, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.l(keyEvent);
    }

    public boolean i(int i4, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.l(keyEvent);
    }

    public void l(int i4, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.R.obtainMessage(i4, onClickListener);
        }
        if (i4 == -3) {
            this.f683x = charSequence;
            this.f684y = message;
            this.f685z = drawable;
        } else if (i4 == -2) {
            this.f679t = charSequence;
            this.f680u = message;
            this.f681v = drawable;
        } else {
            if (i4 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f675p = charSequence;
            this.f676q = message;
            this.f677r = drawable;
        }
    }

    public void m(int i4) {
        this.Q = i4;
    }

    public void n(View view) {
        this.G = view;
    }

    public void o(int i4) {
        this.C = null;
        this.B = i4;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (i4 == 0) {
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
        this.f665f = charSequence;
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void s(CharSequence charSequence) {
        this.f664e = charSequence;
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void t(int i4) {
        this.f667h = null;
        this.f668i = i4;
        this.f673n = false;
    }

    public void u(View view) {
        this.f667h = view;
        this.f668i = 0;
        this.f673n = false;
    }

    public void v(View view, int i4, int i5, int i6, int i7) {
        this.f667h = view;
        this.f668i = 0;
        this.f673n = true;
        this.f669j = i4;
        this.f670k = i5;
        this.f671l = i6;
        this.f672m = i7;
    }
}
