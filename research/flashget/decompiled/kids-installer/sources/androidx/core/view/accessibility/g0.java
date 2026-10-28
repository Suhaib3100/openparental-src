package androidx.core.view.accessibility;

import android.R;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.view.accessibility.m0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k.a;

/* compiled from: AccessibilityNodeInfoCompat.java */
/* loaded from: classes.dex */
public class g0 {
    public static final int A = 256;
    public static final int B = 512;
    public static final int C = 1024;
    public static final int D = 2048;
    public static final int E = 4096;
    public static final int F = 8192;
    public static final int G = 16384;
    public static final int H = 32768;
    public static final int I = 65536;
    public static final int J = 131072;
    public static final int K = 262144;
    public static final int L = 524288;
    public static final int M = 1048576;
    public static final int N = 2097152;

    /* renamed from: a0, reason: collision with root package name */
    public static final int f5338a0 = 1;

    /* renamed from: b0, reason: collision with root package name */
    public static final int f5339b0 = 2;

    /* renamed from: c0, reason: collision with root package name */
    public static final int f5340c0 = 1;

    /* renamed from: d0, reason: collision with root package name */
    public static final int f5342d0 = 2;

    /* renamed from: e0, reason: collision with root package name */
    public static final int f5344e0 = 4;

    /* renamed from: f0, reason: collision with root package name */
    public static final int f5346f0 = 8;

    /* renamed from: g0, reason: collision with root package name */
    public static final int f5348g0 = 16;

    /* renamed from: h0, reason: collision with root package name */
    private static int f5350h0 = 0;

    /* renamed from: o, reason: collision with root package name */
    private static final int f5357o = 1;

    /* renamed from: p, reason: collision with root package name */
    private static final int f5358p = 2;

    /* renamed from: q, reason: collision with root package name */
    private static final int f5359q = 4;

    /* renamed from: r, reason: collision with root package name */
    private static final int f5360r = 8;

    /* renamed from: s, reason: collision with root package name */
    public static final int f5361s = 1;

    /* renamed from: t, reason: collision with root package name */
    public static final int f5362t = 2;

    /* renamed from: u, reason: collision with root package name */
    public static final int f5363u = 4;

    /* renamed from: v, reason: collision with root package name */
    public static final int f5364v = 8;

    /* renamed from: w, reason: collision with root package name */
    public static final int f5365w = 16;

    /* renamed from: x, reason: collision with root package name */
    public static final int f5366x = 32;

    /* renamed from: y, reason: collision with root package name */
    public static final int f5367y = 64;

    /* renamed from: z, reason: collision with root package name */
    public static final int f5368z = 128;

    /* renamed from: a, reason: collision with root package name */
    private final AccessibilityNodeInfo f5369a;

    /* renamed from: b, reason: collision with root package name */
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public int f5370b = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f5371c = -1;

    /* renamed from: d, reason: collision with root package name */
    private static final String f5341d = "AccessibilityNodeInfo.roleDescription";

    /* renamed from: e, reason: collision with root package name */
    private static final String f5343e = "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY";

    /* renamed from: f, reason: collision with root package name */
    private static final String f5345f = "androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY";

    /* renamed from: g, reason: collision with root package name */
    private static final String f5347g = "androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY";

    /* renamed from: h, reason: collision with root package name */
    private static final String f5349h = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY";

    /* renamed from: i, reason: collision with root package name */
    private static final String f5351i = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY";

    /* renamed from: j, reason: collision with root package name */
    private static final String f5352j = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY";

    /* renamed from: k, reason: collision with root package name */
    private static final String f5353k = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY";

    /* renamed from: l, reason: collision with root package name */
    private static final String f5354l = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY";

    /* renamed from: m, reason: collision with root package name */
    private static final String f5355m = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY";

    /* renamed from: n, reason: collision with root package name */
    private static final String f5356n = "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY";
    public static final String O = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT";
    public static final String P = "ACTION_ARGUMENT_HTML_ELEMENT_STRING";
    public static final String Q = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN";
    public static final String R = "ACTION_ARGUMENT_SELECTION_START_INT";
    public static final String S = "ACTION_ARGUMENT_SELECTION_END_INT";
    public static final String T = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE";
    public static final String U = "android.view.accessibility.action.ARGUMENT_ROW_INT";
    public static final String V = "android.view.accessibility.action.ARGUMENT_COLUMN_INT";
    public static final String W = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE";
    public static final String X = "ACTION_ARGUMENT_MOVE_WINDOW_X";
    public static final String Y = "ACTION_ARGUMENT_MOVE_WINDOW_Y";

    @SuppressLint({"ActionValue"})
    public static final String Z = "android.view.accessibility.action.ARGUMENT_PRESS_AND_HOLD_DURATION_MILLIS_INT";

    /* compiled from: AccessibilityNodeInfoCompat.java */
    public static class a {
        public static final a B;
        public static final a C;
        public static final a D;
        public static final a E;
        public static final a F;
        public static final a G;

        @o0
        public static final a H;

        @o0
        public static final a I;

        @o0
        public static final a J;

        @o0
        public static final a K;
        public static final a L;
        public static final a M;
        public static final a N;
        public static final a O;
        public static final a P;

        @o0
        public static final a Q;

        @o0
        public static final a R;

        /* renamed from: a, reason: collision with root package name */
        final Object f5394a;

        /* renamed from: b, reason: collision with root package name */
        private final int f5395b;

        /* renamed from: c, reason: collision with root package name */
        private final Class<? extends m0.a> f5396c;

        /* renamed from: d, reason: collision with root package name */
        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        protected final m0 f5397d;

        /* renamed from: e, reason: collision with root package name */
        private static final String f5372e = "A11yActionCompat";

        /* renamed from: f, reason: collision with root package name */
        public static final a f5373f = new a(1, null);

        /* renamed from: g, reason: collision with root package name */
        public static final a f5374g = new a(2, null);

        /* renamed from: h, reason: collision with root package name */
        public static final a f5375h = new a(4, null);

        /* renamed from: i, reason: collision with root package name */
        public static final a f5376i = new a(8, null);

        /* renamed from: j, reason: collision with root package name */
        public static final a f5377j = new a(16, null);

        /* renamed from: k, reason: collision with root package name */
        public static final a f5378k = new a(32, null);

        /* renamed from: l, reason: collision with root package name */
        public static final a f5379l = new a(64, null);

        /* renamed from: m, reason: collision with root package name */
        public static final a f5380m = new a(128, null);

        /* renamed from: n, reason: collision with root package name */
        public static final a f5381n = new a(256, (CharSequence) null, (Class<? extends m0.a>) m0.b.class);

        /* renamed from: o, reason: collision with root package name */
        public static final a f5382o = new a(512, (CharSequence) null, (Class<? extends m0.a>) m0.b.class);

        /* renamed from: p, reason: collision with root package name */
        public static final a f5383p = new a(1024, (CharSequence) null, (Class<? extends m0.a>) m0.c.class);

        /* renamed from: q, reason: collision with root package name */
        public static final a f5384q = new a(2048, (CharSequence) null, (Class<? extends m0.a>) m0.c.class);

        /* renamed from: r, reason: collision with root package name */
        public static final a f5385r = new a(4096, null);

        /* renamed from: s, reason: collision with root package name */
        public static final a f5386s = new a(8192, null);

        /* renamed from: t, reason: collision with root package name */
        public static final a f5387t = new a(16384, null);

        /* renamed from: u, reason: collision with root package name */
        public static final a f5388u = new a(32768, null);

        /* renamed from: v, reason: collision with root package name */
        public static final a f5389v = new a(65536, null);

        /* renamed from: w, reason: collision with root package name */
        public static final a f5390w = new a(131072, (CharSequence) null, (Class<? extends m0.a>) m0.g.class);

        /* renamed from: x, reason: collision with root package name */
        public static final a f5391x = new a(262144, null);

        /* renamed from: y, reason: collision with root package name */
        public static final a f5392y = new a(524288, null);

        /* renamed from: z, reason: collision with root package name */
        public static final a f5393z = new a(1048576, null);
        public static final a A = new a(2097152, (CharSequence) null, (Class<? extends m0.a>) m0.h.class);

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
            int i5 = Build.VERSION.SDK_INT;
            B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, m0.e.class);
            D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            F = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            G = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            if (i5 >= 29) {
                accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
                accessibilityAction = accessibilityAction16;
            } else {
                accessibilityAction = null;
            }
            H = new a(accessibilityAction, R.id.accessibilityActionPageUp, null, null, null);
            if (i5 >= 29) {
                accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
                accessibilityAction2 = accessibilityAction15;
            } else {
                accessibilityAction2 = null;
            }
            I = new a(accessibilityAction2, R.id.accessibilityActionPageDown, null, null, null);
            if (i5 >= 29) {
                accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
                accessibilityAction3 = accessibilityAction14;
            } else {
                accessibilityAction3 = null;
            }
            J = new a(accessibilityAction3, R.id.accessibilityActionPageLeft, null, null, null);
            if (i5 >= 29) {
                accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
                accessibilityAction4 = accessibilityAction13;
            } else {
                accessibilityAction4 = null;
            }
            K = new a(accessibilityAction4, R.id.accessibilityActionPageRight, null, null, null);
            L = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            M = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, m0.f.class);
            if (i5 >= 26) {
                accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
                accessibilityAction5 = accessibilityAction12;
            } else {
                accessibilityAction5 = null;
            }
            N = new a(accessibilityAction5, R.id.accessibilityActionMoveWindow, null, null, m0.d.class);
            if (i5 >= 28) {
                accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
                accessibilityAction6 = accessibilityAction11;
            } else {
                accessibilityAction6 = null;
            }
            O = new a(accessibilityAction6, R.id.accessibilityActionShowTooltip, null, null, null);
            if (i5 >= 28) {
                accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
                accessibilityAction7 = accessibilityAction10;
            } else {
                accessibilityAction7 = null;
            }
            P = new a(accessibilityAction7, R.id.accessibilityActionHideTooltip, null, null, null);
            if (i5 >= 30) {
                accessibilityAction9 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
                accessibilityAction8 = accessibilityAction9;
            } else {
                accessibilityAction8 = null;
            }
            Q = new a(accessibilityAction8, R.id.accessibilityActionPressAndHold, null, null, null);
            R = new a(i5 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
        }

        public a(int i5, CharSequence charSequence) {
            this(null, i5, charSequence, null, null);
        }

        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        public a a(CharSequence charSequence, m0 m0Var) {
            return new a(null, this.f5395b, charSequence, m0Var, this.f5396c);
        }

        public int b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f5394a).getId();
        }

        public CharSequence c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f5394a).getLabel();
        }

        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        public boolean d(View view, Bundle bundle) {
            m0.a newInstance;
            if (this.f5397d == null) {
                return false;
            }
            Class<? extends m0.a> cls = this.f5396c;
            m0.a aVar = null;
            if (cls != null) {
                try {
                    newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception unused) {
                }
                try {
                    newInstance.a(bundle);
                    aVar = newInstance;
                } catch (Exception unused2) {
                    aVar = newInstance;
                    Class<? extends m0.a> cls2 = this.f5396c;
                    if (cls2 != null) {
                        cls2.getName();
                    }
                    return this.f5397d.a(view, aVar);
                }
            }
            return this.f5397d.a(view, aVar);
        }

        public boolean equals(@q0 Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.f5394a;
            return obj2 == null ? aVar.f5394a == null : obj2.equals(aVar.f5394a);
        }

        public int hashCode() {
            Object obj = this.f5394a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        public a(int i5, CharSequence charSequence, m0 m0Var) {
            this(null, i5, charSequence, m0Var, null);
        }

        a(Object obj) {
            this(obj, 0, null, null, null);
        }

        private a(int i5, CharSequence charSequence, Class<? extends m0.a> cls) {
            this(null, i5, charSequence, null, cls);
        }

        a(Object obj, int i5, CharSequence charSequence, m0 m0Var, Class<? extends m0.a> cls) {
            this.f5395b = i5;
            this.f5397d = m0Var;
            if (obj == null) {
                this.f5394a = new AccessibilityNodeInfo.AccessibilityAction(i5, charSequence);
            } else {
                this.f5394a = obj;
            }
            this.f5396c = cls;
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    public static class b {

        /* renamed from: b, reason: collision with root package name */
        public static final int f5398b = 0;

        /* renamed from: c, reason: collision with root package name */
        public static final int f5399c = 1;

        /* renamed from: d, reason: collision with root package name */
        public static final int f5400d = 2;

        /* renamed from: a, reason: collision with root package name */
        final Object f5401a;

        b(Object obj) {
            this.f5401a = obj;
        }

        public static b e(int i5, int i6, boolean z5) {
            return new b(AccessibilityNodeInfo.CollectionInfo.obtain(i5, i6, z5));
        }

        public static b f(int i5, int i6, boolean z5, int i7) {
            return new b(AccessibilityNodeInfo.CollectionInfo.obtain(i5, i6, z5, i7));
        }

        public int a() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f5401a).getColumnCount();
        }

        public int b() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f5401a).getRowCount();
        }

        public int c() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f5401a).getSelectionMode();
        }

        public boolean d() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f5401a).isHierarchical();
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        final Object f5402a;

        c(Object obj) {
            this.f5402a = obj;
        }

        public static c g(int i5, int i6, int i7, int i8, boolean z5) {
            return new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i5, i6, i7, i8, z5));
        }

        public static c h(int i5, int i6, int i7, int i8, boolean z5, boolean z6) {
            return new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i5, i6, i7, i8, z5, z6));
        }

        public int a() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f5402a).getColumnIndex();
        }

        public int b() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f5402a).getColumnSpan();
        }

        public int c() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f5402a).getRowIndex();
        }

        public int d() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f5402a).getRowSpan();
        }

        @Deprecated
        public boolean e() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f5402a).isHeading();
        }

        public boolean f() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f5402a).isSelected();
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    public static class d {

        /* renamed from: b, reason: collision with root package name */
        public static final int f5403b = 0;

        /* renamed from: c, reason: collision with root package name */
        public static final int f5404c = 1;

        /* renamed from: d, reason: collision with root package name */
        public static final int f5405d = 2;

        /* renamed from: a, reason: collision with root package name */
        final Object f5406a;

        d(Object obj) {
            this.f5406a = obj;
        }

        public static d e(int i5, float f6, float f7, float f8) {
            return new d(AccessibilityNodeInfo.RangeInfo.obtain(i5, f6, f7, f8));
        }

        public float a() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f5406a).getCurrent();
        }

        public float b() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f5406a).getMax();
        }

        public float c() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f5406a).getMin();
        }

        public int d() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f5406a).getType();
        }
    }

    @Deprecated
    public g0(Object obj) {
        this.f5369a = (AccessibilityNodeInfo) obj;
    }

    public static g0 C0() {
        return new g0(AccessibilityNodeInfo.obtain());
    }

    public static g0 D0(View view) {
        return new g0(AccessibilityNodeInfo.obtain(view));
    }

    public static g0 E0(View view, int i5) {
        return Y1(AccessibilityNodeInfo.obtain(view, i5));
    }

    public static g0 F0(g0 g0Var) {
        return new g0(AccessibilityNodeInfo.obtain(g0Var.f5369a));
    }

    private SparseArray<WeakReference<ClickableSpan>> M(View view) {
        SparseArray<WeakReference<ClickableSpan>> S2 = S(view);
        if (S2 != null) {
            return S2;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(a.e.f22982e0, sparseArray);
        return sparseArray;
    }

    private void N0(View view) {
        SparseArray<WeakReference<ClickableSpan>> S2 = S(view);
        if (S2 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i5 = 0; i5 < S2.size(); i5++) {
                if (S2.valueAt(i5).get() == null) {
                    arrayList.add(Integer.valueOf(i5));
                }
            }
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                S2.remove(((Integer) arrayList.get(i6)).intValue());
            }
        }
    }

    private void Q0(int i5, boolean z5) {
        Bundle D2 = D();
        if (D2 != null) {
            int i6 = D2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i5);
            if (!z5) {
                i5 = 0;
            }
            D2.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i5 | i6);
        }
    }

    private SparseArray<WeakReference<ClickableSpan>> S(View view) {
        return (SparseArray) view.getTag(a.e.f22982e0);
    }

    public static g0 X1(@o0 AccessibilityNodeInfo accessibilityNodeInfo) {
        return new g0(accessibilityNodeInfo);
    }

    static g0 Y1(Object obj) {
        if (obj != null) {
            return new g0(obj);
        }
        return null;
    }

    private void e(ClickableSpan clickableSpan, Spanned spanned, int i5) {
        i("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        i("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        i("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        i("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i5));
    }

    private boolean e0() {
        return !i("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    private int f0(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i5 = 0; i5 < sparseArray.size(); i5++) {
                if (clickableSpan.equals(sparseArray.valueAt(i5).get())) {
                    return sparseArray.keyAt(i5);
                }
            }
        }
        int i6 = f5350h0;
        f5350h0 = i6 + 1;
        return i6;
    }

    private void h() {
        this.f5369a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        this.f5369a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        this.f5369a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        this.f5369a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    private List<Integer> i(String str) {
        ArrayList<Integer> integerArrayList = this.f5369a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f5369a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    private static String o(int i5) {
        if (i5 == 1) {
            return "ACTION_FOCUS";
        }
        if (i5 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i5) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionImeEnter:
                return "ACTION_IME_ENTER";
            default:
                switch (i5) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i5) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                return "ACTION_UNKNOWN";
                        }
                }
        }
    }

    private boolean r(int i5) {
        Bundle D2 = D();
        return D2 != null && (D2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i5) == i5;
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public static ClickableSpan[] x(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public CharSequence A() {
        return this.f5369a.getContentDescription();
    }

    public boolean A0() {
        boolean isTextEntryKey;
        if (Build.VERSION.SDK_INT < 29) {
            return r(8);
        }
        isTextEntryKey = this.f5369a.isTextEntryKey();
        return isTextEntryKey;
    }

    public void A1(View view, int i5) {
        this.f5370b = i5;
        this.f5369a.setParent(view, i5);
    }

    public int B() {
        return this.f5369a.getDrawingOrder();
    }

    public boolean B0() {
        return this.f5369a.isVisibleToUser();
    }

    public void B1(boolean z5) {
        this.f5369a.setPassword(z5);
    }

    public CharSequence C() {
        return this.f5369a.getError();
    }

    public void C1(d dVar) {
        this.f5369a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) dVar.f5406a);
    }

    public Bundle D() {
        return this.f5369a.getExtras();
    }

    public void D1(@q0 CharSequence charSequence) {
        this.f5369a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    @q0
    public CharSequence E() {
        CharSequence hintText;
        if (Build.VERSION.SDK_INT < 26) {
            return this.f5369a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY");
        }
        hintText = this.f5369a.getHintText();
        return hintText;
    }

    public void E1(boolean z5) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f5369a.setScreenReaderFocusable(z5);
        } else {
            Q0(1, z5);
        }
    }

    @Deprecated
    public Object F() {
        return this.f5369a;
    }

    public void F1(boolean z5) {
        this.f5369a.setScrollable(z5);
    }

    public int G() {
        return this.f5369a.getInputType();
    }

    public boolean G0(int i5) {
        return this.f5369a.performAction(i5);
    }

    public void G1(boolean z5) {
        this.f5369a.setSelected(z5);
    }

    public g0 H() {
        return Y1(this.f5369a.getLabelFor());
    }

    public boolean H0(int i5, Bundle bundle) {
        return this.f5369a.performAction(i5, bundle);
    }

    public void H1(boolean z5) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f5369a.setShowingHintText(z5);
        } else {
            Q0(4, z5);
        }
    }

    public g0 I() {
        return Y1(this.f5369a.getLabeledBy());
    }

    public void I0() {
        this.f5369a.recycle();
    }

    public void I1(View view) {
        this.f5371c = -1;
        this.f5369a.setSource(view);
    }

    public int J() {
        return this.f5369a.getLiveRegion();
    }

    public boolean J0() {
        return this.f5369a.refresh();
    }

    public void J1(View view, int i5) {
        this.f5371c = i5;
        this.f5369a.setSource(view, i5);
    }

    public int K() {
        return this.f5369a.getMaxTextLength();
    }

    public boolean K0(a aVar) {
        return this.f5369a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f5394a);
    }

    public void K1(@q0 CharSequence charSequence) {
        if (androidx.core.os.a.h()) {
            this.f5369a.setStateDescription(charSequence);
        } else {
            this.f5369a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public int L() {
        return this.f5369a.getMovementGranularities();
    }

    public boolean L0(View view) {
        return this.f5369a.removeChild(view);
    }

    public void L1(CharSequence charSequence) {
        this.f5369a.setText(charSequence);
    }

    public boolean M0(View view, int i5) {
        return this.f5369a.removeChild(view, i5);
    }

    public void M1(boolean z5) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f5369a.setTextEntryKey(z5);
        } else {
            Q0(8, z5);
        }
    }

    public CharSequence N() {
        return this.f5369a.getPackageName();
    }

    public void N1(int i5, int i6) {
        this.f5369a.setTextSelection(i5, i6);
    }

    @q0
    public CharSequence O() {
        CharSequence paneTitle;
        if (Build.VERSION.SDK_INT < 28) {
            return this.f5369a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY");
        }
        paneTitle = this.f5369a.getPaneTitle();
        return paneTitle;
    }

    public void O0(boolean z5) {
        this.f5369a.setAccessibilityFocused(z5);
    }

    public void O1(@q0 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f5369a.setTooltipText(charSequence);
        } else {
            this.f5369a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY", charSequence);
        }
    }

    public g0 P() {
        return Y1(this.f5369a.getParent());
    }

    public void P0(@o0 List<String> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f5369a.setAvailableExtraData(list);
        }
    }

    public void P1(@o0 e eVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f5369a.setTouchDelegateInfo(eVar.f5407a);
        }
    }

    public d Q() {
        AccessibilityNodeInfo.RangeInfo rangeInfo = this.f5369a.getRangeInfo();
        if (rangeInfo != null) {
            return new d(rangeInfo);
        }
        return null;
    }

    public void Q1(View view) {
        this.f5369a.setTraversalAfter(view);
    }

    @q0
    public CharSequence R() {
        return this.f5369a.getExtras().getCharSequence("AccessibilityNodeInfo.roleDescription");
    }

    @Deprecated
    public void R0(Rect rect) {
        this.f5369a.setBoundsInParent(rect);
    }

    public void R1(View view, int i5) {
        this.f5369a.setTraversalAfter(view, i5);
    }

    public void S0(Rect rect) {
        this.f5369a.setBoundsInScreen(rect);
    }

    public void S1(View view) {
        this.f5369a.setTraversalBefore(view);
    }

    @q0
    public CharSequence T() {
        CharSequence stateDescription;
        if (!androidx.core.os.a.h()) {
            return this.f5369a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
        }
        stateDescription = this.f5369a.getStateDescription();
        return stateDescription;
    }

    public void T0(boolean z5) {
        this.f5369a.setCanOpenPopup(z5);
    }

    public void T1(View view, int i5) {
        this.f5369a.setTraversalBefore(view, i5);
    }

    public CharSequence U() {
        if (!e0()) {
            return this.f5369a.getText();
        }
        List<Integer> i5 = i("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> i6 = i("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> i7 = i("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> i8 = i("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f5369a.getText(), 0, this.f5369a.getText().length()));
        for (int i9 = 0; i9 < i5.size(); i9++) {
            spannableString.setSpan(new androidx.core.view.accessibility.a(i8.get(i9).intValue(), this, D().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), i5.get(i9).intValue(), i6.get(i9).intValue(), i7.get(i9).intValue());
        }
        return spannableString;
    }

    public void U0(boolean z5) {
        this.f5369a.setCheckable(z5);
    }

    public void U1(String str) {
        this.f5369a.setViewIdResourceName(str);
    }

    public int V() {
        return this.f5369a.getTextSelectionEnd();
    }

    public void V0(boolean z5) {
        this.f5369a.setChecked(z5);
    }

    public void V1(boolean z5) {
        this.f5369a.setVisibleToUser(z5);
    }

    public int W() {
        return this.f5369a.getTextSelectionStart();
    }

    public void W0(CharSequence charSequence) {
        this.f5369a.setClassName(charSequence);
    }

    public AccessibilityNodeInfo W1() {
        return this.f5369a;
    }

    @q0
    public CharSequence X() {
        CharSequence tooltipText;
        if (Build.VERSION.SDK_INT < 28) {
            return this.f5369a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
        }
        tooltipText = this.f5369a.getTooltipText();
        return tooltipText;
    }

    public void X0(boolean z5) {
        this.f5369a.setClickable(z5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0006, code lost:
    
        r0 = r2.f5369a.getTouchDelegateInfo();
     */
    @androidx.annotation.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.core.view.accessibility.g0.e Y() {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L14
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.f5369a
            android.view.accessibility.AccessibilityNodeInfo$TouchDelegateInfo r0 = androidx.core.view.accessibility.t.a(r0)
            if (r0 == 0) goto L14
            androidx.core.view.accessibility.g0$e r1 = new androidx.core.view.accessibility.g0$e
            r1.<init>(r0)
            return r1
        L14:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.accessibility.g0.Y():androidx.core.view.accessibility.g0$e");
    }

    public void Y0(Object obj) {
        this.f5369a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((b) obj).f5401a);
    }

    public g0 Z() {
        return Y1(this.f5369a.getTraversalAfter());
    }

    public void Z0(Object obj) {
        this.f5369a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((c) obj).f5402a);
    }

    public void a(int i5) {
        this.f5369a.addAction(i5);
    }

    public g0 a0() {
        return Y1(this.f5369a.getTraversalBefore());
    }

    public void a1(CharSequence charSequence) {
        this.f5369a.setContentDescription(charSequence);
    }

    public void b(a aVar) {
        this.f5369a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f5394a);
    }

    public String b0() {
        return this.f5369a.getViewIdResourceName();
    }

    public void b1(boolean z5) {
        this.f5369a.setContentInvalid(z5);
    }

    public void c(View view) {
        this.f5369a.addChild(view);
    }

    public n0 c0() {
        return n0.r(this.f5369a.getWindow());
    }

    public void c1(boolean z5) {
        this.f5369a.setContextClickable(z5);
    }

    public void d(View view, int i5) {
        this.f5369a.addChild(view, i5);
    }

    public int d0() {
        return this.f5369a.getWindowId();
    }

    public void d1(boolean z5) {
        this.f5369a.setDismissable(z5);
    }

    public void e1(int i5) {
        this.f5369a.setDrawingOrder(i5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f5369a;
        if (accessibilityNodeInfo == null) {
            if (g0Var.f5369a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(g0Var.f5369a)) {
            return false;
        }
        return this.f5371c == g0Var.f5371c && this.f5370b == g0Var.f5370b;
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void f(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            h();
            N0(view);
            ClickableSpan[] x5 = x(charSequence);
            if (x5 == null || x5.length <= 0) {
                return;
            }
            D().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", a.e.f22973a);
            SparseArray<WeakReference<ClickableSpan>> M2 = M(view);
            for (int i5 = 0; i5 < x5.length; i5++) {
                int f02 = f0(x5[i5], M2);
                M2.put(f02, new WeakReference<>(x5[i5]));
                e(x5[i5], (Spanned) charSequence, f02);
            }
        }
    }

    public void f1(boolean z5) {
        this.f5369a.setEditable(z5);
    }

    public boolean g() {
        return this.f5369a.canOpenPopup();
    }

    public boolean g0() {
        return this.f5369a.isAccessibilityFocused();
    }

    public void g1(boolean z5) {
        this.f5369a.setEnabled(z5);
    }

    public boolean h0() {
        return this.f5369a.isCheckable();
    }

    public void h1(CharSequence charSequence) {
        this.f5369a.setError(charSequence);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f5369a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public boolean i0() {
        return this.f5369a.isChecked();
    }

    public void i1(boolean z5) {
        this.f5369a.setFocusable(z5);
    }

    public List<g0> j(String str) {
        ArrayList arrayList = new ArrayList();
        List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText = this.f5369a.findAccessibilityNodeInfosByText(str);
        int size = findAccessibilityNodeInfosByText.size();
        for (int i5 = 0; i5 < size; i5++) {
            arrayList.add(new g0(findAccessibilityNodeInfosByText.get(i5)));
        }
        return arrayList;
    }

    public boolean j0() {
        return this.f5369a.isClickable();
    }

    public void j1(boolean z5) {
        this.f5369a.setFocused(z5);
    }

    public List<g0> k(String str) {
        List<AccessibilityNodeInfo> findAccessibilityNodeInfosByViewId = this.f5369a.findAccessibilityNodeInfosByViewId(str);
        ArrayList arrayList = new ArrayList();
        Iterator<AccessibilityNodeInfo> it = findAccessibilityNodeInfosByViewId.iterator();
        while (it.hasNext()) {
            arrayList.add(new g0(it.next()));
        }
        return arrayList;
    }

    public boolean k0() {
        return this.f5369a.isContentInvalid();
    }

    public void k1(boolean z5) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f5369a.setHeading(z5);
        } else {
            Q0(2, z5);
        }
    }

    public g0 l(int i5) {
        return Y1(this.f5369a.findFocus(i5));
    }

    public boolean l0() {
        return this.f5369a.isContextClickable();
    }

    public void l1(@q0 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f5369a.setHintText(charSequence);
        } else {
            this.f5369a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public g0 m(int i5) {
        return Y1(this.f5369a.focusSearch(i5));
    }

    public boolean m0() {
        return this.f5369a.isDismissable();
    }

    public void m1(boolean z5) {
        this.f5369a.setImportantForAccessibility(z5);
    }

    public List<a> n() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f5369a.getActionList();
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i5 = 0; i5 < size; i5++) {
            arrayList.add(new a(actionList.get(i5)));
        }
        return arrayList;
    }

    public boolean n0() {
        return this.f5369a.isEditable();
    }

    public void n1(int i5) {
        this.f5369a.setInputType(i5);
    }

    public boolean o0() {
        return this.f5369a.isEnabled();
    }

    public void o1(View view) {
        this.f5369a.setLabelFor(view);
    }

    public int p() {
        return this.f5369a.getActions();
    }

    public boolean p0() {
        return this.f5369a.isFocusable();
    }

    public void p1(View view, int i5) {
        this.f5369a.setLabelFor(view, i5);
    }

    @o0
    public List<String> q() {
        List<String> availableExtraData;
        if (Build.VERSION.SDK_INT < 26) {
            return Collections.emptyList();
        }
        availableExtraData = this.f5369a.getAvailableExtraData();
        return availableExtraData;
    }

    public boolean q0() {
        return this.f5369a.isFocused();
    }

    public void q1(View view) {
        this.f5369a.setLabeledBy(view);
    }

    public boolean r0() {
        boolean isHeading;
        if (Build.VERSION.SDK_INT >= 28) {
            isHeading = this.f5369a.isHeading();
            return isHeading;
        }
        if (r(2)) {
            return true;
        }
        c z5 = z();
        return z5 != null && z5.e();
    }

    public void r1(View view, int i5) {
        this.f5369a.setLabeledBy(view, i5);
    }

    @Deprecated
    public void s(Rect rect) {
        this.f5369a.getBoundsInParent(rect);
    }

    public boolean s0() {
        return this.f5369a.isImportantForAccessibility();
    }

    public void s1(int i5) {
        this.f5369a.setLiveRegion(i5);
    }

    public void t(Rect rect) {
        this.f5369a.getBoundsInScreen(rect);
    }

    public boolean t0() {
        return this.f5369a.isLongClickable();
    }

    public void t1(boolean z5) {
        this.f5369a.setLongClickable(z5);
    }

    @o0
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        s(rect);
        sb.append("; boundsInParent: " + rect);
        t(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(N());
        sb.append("; className: ");
        sb.append(w());
        sb.append("; text: ");
        sb.append(U());
        sb.append("; contentDescription: ");
        sb.append(A());
        sb.append("; viewId: ");
        sb.append(b0());
        sb.append("; checkable: ");
        sb.append(h0());
        sb.append("; checked: ");
        sb.append(i0());
        sb.append("; focusable: ");
        sb.append(p0());
        sb.append("; focused: ");
        sb.append(q0());
        sb.append("; selected: ");
        sb.append(y0());
        sb.append("; clickable: ");
        sb.append(j0());
        sb.append("; longClickable: ");
        sb.append(t0());
        sb.append("; enabled: ");
        sb.append(o0());
        sb.append("; password: ");
        sb.append(v0());
        sb.append("; scrollable: " + x0());
        sb.append("; [");
        List<a> n5 = n();
        for (int i5 = 0; i5 < n5.size(); i5++) {
            a aVar = n5.get(i5);
            String o5 = o(aVar.b());
            if (o5.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                o5 = aVar.c().toString();
            }
            sb.append(o5);
            if (i5 != n5.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public g0 u(int i5) {
        return Y1(this.f5369a.getChild(i5));
    }

    public boolean u0() {
        return this.f5369a.isMultiLine();
    }

    public void u1(int i5) {
        this.f5369a.setMaxTextLength(i5);
    }

    public int v() {
        return this.f5369a.getChildCount();
    }

    public boolean v0() {
        return this.f5369a.isPassword();
    }

    public void v1(int i5) {
        this.f5369a.setMovementGranularities(i5);
    }

    public CharSequence w() {
        return this.f5369a.getClassName();
    }

    public boolean w0() {
        boolean isScreenReaderFocusable;
        if (Build.VERSION.SDK_INT < 28) {
            return r(1);
        }
        isScreenReaderFocusable = this.f5369a.isScreenReaderFocusable();
        return isScreenReaderFocusable;
    }

    public void w1(boolean z5) {
        this.f5369a.setMultiLine(z5);
    }

    public boolean x0() {
        return this.f5369a.isScrollable();
    }

    public void x1(CharSequence charSequence) {
        this.f5369a.setPackageName(charSequence);
    }

    public b y() {
        AccessibilityNodeInfo.CollectionInfo collectionInfo = this.f5369a.getCollectionInfo();
        if (collectionInfo != null) {
            return new b(collectionInfo);
        }
        return null;
    }

    public boolean y0() {
        return this.f5369a.isSelected();
    }

    public void y1(@q0 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f5369a.setPaneTitle(charSequence);
        } else {
            this.f5369a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public c z() {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = this.f5369a.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            return new c(collectionItemInfo);
        }
        return null;
    }

    public boolean z0() {
        boolean isShowingHintText;
        if (Build.VERSION.SDK_INT < 26) {
            return r(4);
        }
        isShowingHintText = this.f5369a.isShowingHintText();
        return isShowingHintText;
    }

    public void z1(View view) {
        this.f5370b = -1;
        this.f5369a.setParent(view);
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        final AccessibilityNodeInfo.TouchDelegateInfo f5407a;

        public e(@o0 Map<Region, View> map) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f5407a = new AccessibilityNodeInfo.TouchDelegateInfo(map);
            } else {
                this.f5407a = null;
            }
        }

        @q0
        public Region a(@androidx.annotation.g0(from = 0) int i5) {
            Region regionAt;
            if (Build.VERSION.SDK_INT < 29) {
                return null;
            }
            regionAt = this.f5407a.getRegionAt(i5);
            return regionAt;
        }

        @androidx.annotation.g0(from = 0)
        public int b() {
            int regionCount;
            if (Build.VERSION.SDK_INT < 29) {
                return 0;
            }
            regionCount = this.f5407a.getRegionCount();
            return regionCount;
        }

        /* JADX WARN: Code restructure failed: missing block: B:3:0x0006, code lost:
        
            r3 = r2.f5407a.getTargetForRegion(r3);
         */
        @androidx.annotation.q0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public androidx.core.view.accessibility.g0 c(@androidx.annotation.o0 android.graphics.Region r3) {
            /*
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 < r1) goto L13
                android.view.accessibility.AccessibilityNodeInfo$TouchDelegateInfo r0 = r2.f5407a
                android.view.accessibility.AccessibilityNodeInfo r3 = androidx.core.view.accessibility.h0.a(r0, r3)
                if (r3 == 0) goto L13
                androidx.core.view.accessibility.g0 r3 = androidx.core.view.accessibility.g0.X1(r3)
                return r3
            L13:
                r3 = 0
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.accessibility.g0.e.c(android.graphics.Region):androidx.core.view.accessibility.g0");
        }

        e(@o0 AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo) {
            this.f5407a = touchDelegateInfo;
        }
    }

    private g0(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f5369a = accessibilityNodeInfo;
    }
}
