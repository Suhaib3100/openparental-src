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
import androidx.annotation.q0;
import androidx.annotation.s0;
import androidx.annotation.x0;
import androidx.core.os.b;
import androidx.core.view.accessibility.o0;
import java.lang.ref.WeakReference;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import z0.a;

/* compiled from: AccessibilityNodeInfoCompat.java */
/* loaded from: classes3.dex */
public class h0 {
    public static final int A = 1;
    public static final int A0 = 32;
    public static final int B = 2;

    @SuppressLint({"MinMaxConstant"})
    public static final int B0 = 50;
    public static final int C = 4;
    private static int C0 = 0;
    public static final int D = 8;
    public static final int E = 16;
    public static final int F = 32;
    public static final int G = 64;
    public static final int H = 128;
    public static final int I = 256;
    public static final int J = 512;
    public static final int K = 1024;
    public static final int L = 2048;
    public static final int M = 4096;
    public static final int N = 8192;
    public static final int O = 16384;
    public static final int P = 32768;
    public static final int Q = 65536;
    public static final int R = 131072;
    public static final int S = 262144;
    public static final int T = 524288;
    public static final int U = 1048576;
    public static final int V = 2097152;

    /* renamed from: k0, reason: collision with root package name */
    public static final int f26971k0 = 1;

    /* renamed from: l0, reason: collision with root package name */
    public static final int f26973l0 = 2;

    /* renamed from: m0, reason: collision with root package name */
    public static final int f26975m0 = 1;

    /* renamed from: n0, reason: collision with root package name */
    public static final int f26977n0 = 2;

    /* renamed from: o0, reason: collision with root package name */
    public static final int f26979o0 = 4;

    /* renamed from: p0, reason: collision with root package name */
    public static final int f26981p0 = 8;

    /* renamed from: q0, reason: collision with root package name */
    public static final int f26983q0 = 16;

    /* renamed from: s, reason: collision with root package name */
    private static final int f26986s = 1;

    /* renamed from: t, reason: collision with root package name */
    private static final int f26988t = 2;

    /* renamed from: u, reason: collision with root package name */
    private static final int f26990u = 4;

    /* renamed from: u0, reason: collision with root package name */
    public static final int f26991u0 = 20000;

    /* renamed from: v, reason: collision with root package name */
    private static final int f26992v = 8;

    /* renamed from: v0, reason: collision with root package name */
    public static final int f26993v0 = 1;

    /* renamed from: w, reason: collision with root package name */
    private static final int f26994w = 32;

    /* renamed from: w0, reason: collision with root package name */
    public static final int f26995w0 = 2;

    /* renamed from: x, reason: collision with root package name */
    private static final int f26996x = 64;

    /* renamed from: x0, reason: collision with root package name */
    public static final int f26997x0 = 4;

    /* renamed from: y, reason: collision with root package name */
    private static final int f26998y = 8388608;

    /* renamed from: y0, reason: collision with root package name */
    public static final int f26999y0 = 8;

    /* renamed from: z, reason: collision with root package name */
    private static final int f27000z = 67108864;

    /* renamed from: z0, reason: collision with root package name */
    public static final int f27001z0 = 16;

    /* renamed from: a, reason: collision with root package name */
    private final AccessibilityNodeInfo f27002a;

    /* renamed from: b, reason: collision with root package name */
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public int f27003b = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f27004c = -1;

    /* renamed from: j0, reason: collision with root package name */
    public static final String f26969j0 = "androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT";

    /* renamed from: h0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f26965h0 = "android.view.accessibility.action.ARGUMENT_PRESS_AND_HOLD_DURATION_MILLIS_INT";

    /* renamed from: f0, reason: collision with root package name */
    public static final String f26961f0 = "ACTION_ARGUMENT_MOVE_WINDOW_X";

    /* renamed from: d0, reason: collision with root package name */
    public static final String f26957d0 = "android.view.accessibility.action.ARGUMENT_COLUMN_INT";

    /* renamed from: b0, reason: collision with root package name */
    public static final String f26954b0 = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE";
    public static final String W = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT";
    public static final String X = "ACTION_ARGUMENT_HTML_ELEMENT_STRING";
    public static final String Y = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN";
    public static final String Z = "ACTION_ARGUMENT_SELECTION_START_INT";

    /* renamed from: s0, reason: collision with root package name */
    public static final String f26987s0 = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX";

    /* renamed from: d, reason: collision with root package name */
    private static final String f26956d = "AccessibilityNodeInfo.roleDescription";

    /* renamed from: e, reason: collision with root package name */
    private static final String f26958e = "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY";

    /* renamed from: f, reason: collision with root package name */
    private static final String f26960f = "androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY";

    /* renamed from: g, reason: collision with root package name */
    private static final String f26962g = "androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY";

    /* renamed from: i0, reason: collision with root package name */
    public static final String f26967i0 = "androidx.core.view.accessibility.action.ARGUMENT_DIRECTION_INT";

    /* renamed from: h, reason: collision with root package name */
    private static final String f26964h = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY";

    /* renamed from: g0, reason: collision with root package name */
    public static final String f26963g0 = "ACTION_ARGUMENT_MOVE_WINDOW_Y";

    /* renamed from: i, reason: collision with root package name */
    private static final String f26966i = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY";

    /* renamed from: j, reason: collision with root package name */
    private static final String f26968j = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY";

    /* renamed from: e0, reason: collision with root package name */
    public static final String f26959e0 = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE";

    /* renamed from: k, reason: collision with root package name */
    private static final String f26970k = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY";

    /* renamed from: l, reason: collision with root package name */
    private static final String f26972l = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY";

    /* renamed from: c0, reason: collision with root package name */
    public static final String f26955c0 = "android.view.accessibility.action.ARGUMENT_ROW_INT";

    /* renamed from: m, reason: collision with root package name */
    private static final String f26974m = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY";

    /* renamed from: n, reason: collision with root package name */
    private static final String f26976n = "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY";

    /* renamed from: a0, reason: collision with root package name */
    public static final String f26953a0 = "ACTION_ARGUMENT_SELECTION_END_INT";

    /* renamed from: o, reason: collision with root package name */
    private static final String f26978o = "androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY";

    /* renamed from: p, reason: collision with root package name */
    private static final String f26980p = "androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY";

    /* renamed from: q, reason: collision with root package name */
    private static final String f26982q = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY";

    /* renamed from: r, reason: collision with root package name */
    private static final String f26984r = "androidx.view.accessibility.AccessibilityNodeInfoCompat.MIN_DURATION_BETWEEN_CONTENT_CHANGES_KEY";

    /* renamed from: t0, reason: collision with root package name */
    public static final String f26989t0 = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH";

    /* renamed from: r0, reason: collision with root package name */
    public static final String f26985r0 = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY";

    /* compiled from: AccessibilityNodeInfoCompat.java */
    public static class a {
        public static final a B;
        public static final a C;
        public static final a D;
        public static final a E;
        public static final a F;
        public static final a G;

        @androidx.annotation.o0
        public static final a H;

        @androidx.annotation.o0
        public static final a I;

        @androidx.annotation.o0
        public static final a J;

        @androidx.annotation.o0
        public static final a K;
        public static final a L;
        public static final a M;
        public static final a N;
        public static final a O;
        public static final a P;

        @androidx.annotation.o0
        public static final a Q;

        @androidx.annotation.o0
        public static final a R;

        @androidx.annotation.o0
        public static final a S;

        @androidx.annotation.o0
        public static final a T;

        @androidx.annotation.o0
        public static final a U;

        @androidx.annotation.o0
        public static final a V;

        @androidx.annotation.o0
        @s0(markerClass = {b.InterfaceC0422b.class})
        public static final a W;

        /* renamed from: a, reason: collision with root package name */
        final Object f27027a;

        /* renamed from: b, reason: collision with root package name */
        private final int f27028b;

        /* renamed from: c, reason: collision with root package name */
        private final Class<? extends o0.a> f27029c;

        /* renamed from: d, reason: collision with root package name */
        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        protected final o0 f27030d;

        /* renamed from: e, reason: collision with root package name */
        private static final String f27005e = "A11yActionCompat";

        /* renamed from: f, reason: collision with root package name */
        public static final a f27006f = new a(1, null);

        /* renamed from: g, reason: collision with root package name */
        public static final a f27007g = new a(2, null);

        /* renamed from: h, reason: collision with root package name */
        public static final a f27008h = new a(4, null);

        /* renamed from: i, reason: collision with root package name */
        public static final a f27009i = new a(8, null);

        /* renamed from: j, reason: collision with root package name */
        public static final a f27010j = new a(16, null);

        /* renamed from: k, reason: collision with root package name */
        public static final a f27011k = new a(32, null);

        /* renamed from: l, reason: collision with root package name */
        public static final a f27012l = new a(64, null);

        /* renamed from: m, reason: collision with root package name */
        public static final a f27013m = new a(128, null);

        /* renamed from: n, reason: collision with root package name */
        public static final a f27014n = new a(256, (CharSequence) null, (Class<? extends o0.a>) o0.b.class);

        /* renamed from: o, reason: collision with root package name */
        public static final a f27015o = new a(512, (CharSequence) null, (Class<? extends o0.a>) o0.b.class);

        /* renamed from: p, reason: collision with root package name */
        public static final a f27016p = new a(1024, (CharSequence) null, (Class<? extends o0.a>) o0.c.class);

        /* renamed from: q, reason: collision with root package name */
        public static final a f27017q = new a(2048, (CharSequence) null, (Class<? extends o0.a>) o0.c.class);

        /* renamed from: r, reason: collision with root package name */
        public static final a f27018r = new a(4096, null);

        /* renamed from: s, reason: collision with root package name */
        public static final a f27019s = new a(8192, null);

        /* renamed from: t, reason: collision with root package name */
        public static final a f27020t = new a(16384, null);

        /* renamed from: u, reason: collision with root package name */
        public static final a f27021u = new a(32768, null);

        /* renamed from: v, reason: collision with root package name */
        public static final a f27022v = new a(65536, null);

        /* renamed from: w, reason: collision with root package name */
        public static final a f27023w = new a(131072, (CharSequence) null, (Class<? extends o0.a>) o0.g.class);

        /* renamed from: x, reason: collision with root package name */
        public static final a f27024x = new a(262144, null);

        /* renamed from: y, reason: collision with root package name */
        public static final a f27025y = new a(524288, null);

        /* renamed from: z, reason: collision with root package name */
        public static final a f27026z = new a(1048576, null);
        public static final a A = new a(2097152, (CharSequence) null, (Class<? extends o0.a>) o0.h.class);

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
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction19;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction20;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction21;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction22;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction23;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction24;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction25;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction26;
            int i4 = Build.VERSION.SDK_INT;
            B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, o0.e.class);
            D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            F = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            G = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            if (i4 >= 29) {
                accessibilityAction26 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
                accessibilityAction = accessibilityAction26;
            } else {
                accessibilityAction = null;
            }
            H = new a(accessibilityAction, R.id.accessibilityActionPageUp, null, null, null);
            if (i4 >= 29) {
                accessibilityAction25 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
                accessibilityAction2 = accessibilityAction25;
            } else {
                accessibilityAction2 = null;
            }
            I = new a(accessibilityAction2, R.id.accessibilityActionPageDown, null, null, null);
            if (i4 >= 29) {
                accessibilityAction24 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
                accessibilityAction3 = accessibilityAction24;
            } else {
                accessibilityAction3 = null;
            }
            J = new a(accessibilityAction3, R.id.accessibilityActionPageLeft, null, null, null);
            if (i4 >= 29) {
                accessibilityAction23 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
                accessibilityAction4 = accessibilityAction23;
            } else {
                accessibilityAction4 = null;
            }
            K = new a(accessibilityAction4, R.id.accessibilityActionPageRight, null, null, null);
            L = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            M = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, o0.f.class);
            if (i4 >= 26) {
                accessibilityAction22 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
                accessibilityAction5 = accessibilityAction22;
            } else {
                accessibilityAction5 = null;
            }
            N = new a(accessibilityAction5, R.id.accessibilityActionMoveWindow, null, null, o0.d.class);
            if (i4 >= 28) {
                accessibilityAction21 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
                accessibilityAction6 = accessibilityAction21;
            } else {
                accessibilityAction6 = null;
            }
            O = new a(accessibilityAction6, R.id.accessibilityActionShowTooltip, null, null, null);
            if (i4 >= 28) {
                accessibilityAction20 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
                accessibilityAction7 = accessibilityAction20;
            } else {
                accessibilityAction7 = null;
            }
            P = new a(accessibilityAction7, R.id.accessibilityActionHideTooltip, null, null, null);
            if (i4 >= 30) {
                accessibilityAction19 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
                accessibilityAction8 = accessibilityAction19;
            } else {
                accessibilityAction8 = null;
            }
            Q = new a(accessibilityAction8, R.id.accessibilityActionPressAndHold, null, null, null);
            if (i4 >= 30) {
                accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
                accessibilityAction9 = accessibilityAction18;
            } else {
                accessibilityAction9 = null;
            }
            R = new a(accessibilityAction9, R.id.accessibilityActionImeEnter, null, null, null);
            if (i4 >= 32) {
                accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
                accessibilityAction10 = accessibilityAction17;
            } else {
                accessibilityAction10 = null;
            }
            S = new a(accessibilityAction10, R.id.accessibilityActionDragStart, null, null, null);
            if (i4 >= 32) {
                accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
                accessibilityAction11 = accessibilityAction16;
            } else {
                accessibilityAction11 = null;
            }
            T = new a(accessibilityAction11, R.id.accessibilityActionDragDrop, null, null, null);
            if (i4 >= 32) {
                accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
                accessibilityAction12 = accessibilityAction15;
            } else {
                accessibilityAction12 = null;
            }
            U = new a(accessibilityAction12, R.id.accessibilityActionDragCancel, null, null, null);
            if (i4 >= 33) {
                accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
                accessibilityAction13 = accessibilityAction14;
            } else {
                accessibilityAction13 = null;
            }
            V = new a(accessibilityAction13, R.id.accessibilityActionShowTextSuggestions, null, null, null);
            W = new a(i4 >= 34 ? d.a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        }

        public a(int i4, CharSequence charSequence) {
            this(null, i4, charSequence, null, null);
        }

        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        public a a(CharSequence charSequence, o0 o0Var) {
            return new a(null, this.f27028b, charSequence, o0Var, this.f27029c);
        }

        public int b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f27027a).getId();
        }

        public CharSequence c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f27027a).getLabel();
        }

        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        public boolean d(View view, Bundle bundle) {
            o0.a newInstance;
            if (this.f27030d == null) {
                return false;
            }
            Class<? extends o0.a> cls = this.f27029c;
            o0.a aVar = null;
            if (cls != null) {
                try {
                    newInstance = cls.getDeclaredConstructor(null).newInstance(null);
                } catch (Exception unused) {
                }
                try {
                    newInstance.a(bundle);
                    aVar = newInstance;
                } catch (Exception unused2) {
                    aVar = newInstance;
                    Class<? extends o0.a> cls2 = this.f27029c;
                    if (cls2 != null) {
                        cls2.getName();
                    }
                    return this.f27030d.a(view, aVar);
                }
            }
            return this.f27030d.a(view, aVar);
        }

        public boolean equals(@q0 Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.f27027a;
            return obj2 == null ? aVar.f27027a == null : obj2.equals(aVar.f27027a);
        }

        public int hashCode() {
            Object obj = this.f27027a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        @androidx.annotation.o0
        public String toString() {
            StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
            String o4 = h0.o(this.f27028b);
            if (o4.equals("ACTION_UNKNOWN") && c() != null) {
                o4 = c().toString();
            }
            sb.append(o4);
            return sb.toString();
        }

        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        public a(int i4, CharSequence charSequence, o0 o0Var) {
            this(null, i4, charSequence, o0Var, null);
        }

        a(Object obj) {
            this(obj, 0, null, null, null);
        }

        private a(int i4, CharSequence charSequence, Class<? extends o0.a> cls) {
            this(null, i4, charSequence, null, cls);
        }

        a(Object obj, int i4, CharSequence charSequence, o0 o0Var, Class<? extends o0.a> cls) {
            this.f27028b = i4;
            this.f27030d = o0Var;
            if (obj == null) {
                this.f27027a = new AccessibilityNodeInfo.AccessibilityAction(i4, charSequence);
            } else {
                this.f27027a = obj;
            }
            this.f27029c = cls;
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    @x0(30)
    private static class b {
        private b() {
        }

        public static Object a(int i4, float f4, float f5, float f6) {
            return new AccessibilityNodeInfo.RangeInfo(i4, f4, f5, f6);
        }

        public static CharSequence b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        public static void c(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    @x0(33)
    private static class c {
        private c() {
        }

        public static g a(boolean z4, int i4, int i5, int i6, int i7, boolean z5, String str, String str2) {
            return new g(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z4).setColumnIndex(i4).setRowIndex(i5).setColumnSpan(i6).setRowSpan(i7).setSelected(z5).setRowTitle(str).setColumnTitle(str2).build());
        }

        public static h0 b(AccessibilityNodeInfo accessibilityNodeInfo, int i4, int i5) {
            return h0.s2(accessibilityNodeInfo.getChild(i4, i5));
        }

        public static String c(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
        }

        public static String d(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
        }

        public static AccessibilityNodeInfo.ExtraRenderingInfo e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtraRenderingInfo();
        }

        public static h0 f(AccessibilityNodeInfo accessibilityNodeInfo, int i4) {
            return h0.s2(accessibilityNodeInfo.getParent(i4));
        }

        public static String g(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        public static boolean h(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }

        public static void i(AccessibilityNodeInfo accessibilityNodeInfo, boolean z4) {
            accessibilityNodeInfo.setTextSelectable(z4);
        }

        public static void j(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
            accessibilityNodeInfo.setUniqueId(str);
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    @x0(34)
    private static class d {
        private d() {
        }

        public static AccessibilityNodeInfo.AccessibilityAction a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        public static long d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getMinDurationBetweenContentChanges().toMillis();
        }

        public static boolean e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.hasRequestInitialAccessibilityFocus();
        }

        public static boolean f(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }

        public static void g(AccessibilityNodeInfo accessibilityNodeInfo, boolean z4) {
            accessibilityNodeInfo.setAccessibilityDataSensitive(z4);
        }

        public static void h(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.setBoundsInWindow(rect);
        }

        public static void i(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setContainerTitle(charSequence);
        }

        public static void j(AccessibilityNodeInfo accessibilityNodeInfo, long j4) {
            accessibilityNodeInfo.setMinDurationBetweenContentChanges(Duration.ofMillis(j4));
        }

        public static void k(AccessibilityNodeInfo accessibilityNodeInfo, View view, boolean z4) {
            accessibilityNodeInfo.setQueryFromAppProcessEnabled(view, z4);
        }

        public static void l(AccessibilityNodeInfo accessibilityNodeInfo, boolean z4) {
            accessibilityNodeInfo.setRequestInitialAccessibilityFocus(z4);
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    @x0(35)
    private static class e {
        private e() {
        }

        public static f a(int i4, int i5, boolean z4, int i6, int i7, int i10) {
            return new f.a().f(i4).b(i5).c(z4).g(i6).e(i7).d(i10).a();
        }

        public static int b(Object obj) {
            return ((AccessibilityNodeInfo.CollectionInfo) obj).getImportantForAccessibilityItemCount();
        }

        public static int c(Object obj) {
            return ((AccessibilityNodeInfo.CollectionInfo) obj).getItemCount();
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    public static class f {

        /* renamed from: b, reason: collision with root package name */
        public static final int f27031b = 0;

        /* renamed from: c, reason: collision with root package name */
        public static final int f27032c = 1;

        /* renamed from: d, reason: collision with root package name */
        public static final int f27033d = 2;

        /* renamed from: e, reason: collision with root package name */
        public static final int f27034e = -1;

        /* renamed from: a, reason: collision with root package name */
        final Object f27035a;

        /* compiled from: AccessibilityNodeInfoCompat.java */
        public static final class a {

            /* renamed from: d, reason: collision with root package name */
            private int f27039d;

            /* renamed from: a, reason: collision with root package name */
            private int f27036a = 0;

            /* renamed from: b, reason: collision with root package name */
            private int f27037b = 0;

            /* renamed from: c, reason: collision with root package name */
            private boolean f27038c = false;

            /* renamed from: e, reason: collision with root package name */
            private int f27040e = -1;

            /* renamed from: f, reason: collision with root package name */
            private int f27041f = -1;

            @androidx.annotation.o0
            public f a() {
                return Build.VERSION.SDK_INT >= 35 ? e.a(this.f27036a, this.f27037b, this.f27038c, this.f27039d, this.f27040e, this.f27041f) : f.h(this.f27036a, this.f27037b, this.f27038c, this.f27039d);
            }

            @androidx.annotation.o0
            public a b(int i4) {
                this.f27037b = i4;
                return this;
            }

            @androidx.annotation.o0
            public a c(boolean z4) {
                this.f27038c = z4;
                return this;
            }

            @androidx.annotation.o0
            public a d(int i4) {
                this.f27041f = i4;
                return this;
            }

            @androidx.annotation.o0
            public a e(int i4) {
                this.f27040e = i4;
                return this;
            }

            @androidx.annotation.o0
            public a f(int i4) {
                this.f27036a = i4;
                return this;
            }

            @androidx.annotation.o0
            public a g(int i4) {
                this.f27039d = i4;
                return this;
            }
        }

        f(Object obj) {
            this.f27035a = obj;
        }

        public static f g(int i4, int i5, boolean z4) {
            return new f(AccessibilityNodeInfo.CollectionInfo.obtain(i4, i5, z4));
        }

        public static f h(int i4, int i5, boolean z4, int i6) {
            return new f(AccessibilityNodeInfo.CollectionInfo.obtain(i4, i5, z4, i6));
        }

        public int a() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f27035a).getColumnCount();
        }

        public int b() {
            if (Build.VERSION.SDK_INT >= 35) {
                return e.b(this.f27035a);
            }
            return -1;
        }

        public int c() {
            if (Build.VERSION.SDK_INT >= 35) {
                return e.c(this.f27035a);
            }
            return -1;
        }

        public int d() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f27035a).getRowCount();
        }

        public int e() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f27035a).getSelectionMode();
        }

        public boolean f() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f27035a).isHierarchical();
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    public static class g {

        /* renamed from: a, reason: collision with root package name */
        final Object f27042a;

        /* compiled from: AccessibilityNodeInfoCompat.java */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private boolean f27043a;

            /* renamed from: b, reason: collision with root package name */
            private int f27044b;

            /* renamed from: c, reason: collision with root package name */
            private int f27045c;

            /* renamed from: d, reason: collision with root package name */
            private int f27046d;

            /* renamed from: e, reason: collision with root package name */
            private int f27047e;

            /* renamed from: f, reason: collision with root package name */
            private boolean f27048f;

            /* renamed from: g, reason: collision with root package name */
            private String f27049g;

            /* renamed from: h, reason: collision with root package name */
            private String f27050h;

            @androidx.annotation.o0
            public g a() {
                return Build.VERSION.SDK_INT >= 33 ? c.a(this.f27043a, this.f27044b, this.f27045c, this.f27046d, this.f27047e, this.f27048f, this.f27049g, this.f27050h) : new g(AccessibilityNodeInfo.CollectionItemInfo.obtain(this.f27045c, this.f27047e, this.f27044b, this.f27046d, this.f27043a, this.f27048f));
            }

            @androidx.annotation.o0
            public a b(int i4) {
                this.f27044b = i4;
                return this;
            }

            @androidx.annotation.o0
            public a c(int i4) {
                this.f27046d = i4;
                return this;
            }

            @androidx.annotation.o0
            public a d(@q0 String str) {
                this.f27050h = str;
                return this;
            }

            @androidx.annotation.o0
            public a e(boolean z4) {
                this.f27043a = z4;
                return this;
            }

            @androidx.annotation.o0
            public a f(int i4) {
                this.f27045c = i4;
                return this;
            }

            @androidx.annotation.o0
            public a g(int i4) {
                this.f27047e = i4;
                return this;
            }

            @androidx.annotation.o0
            public a h(@q0 String str) {
                this.f27049g = str;
                return this;
            }

            @androidx.annotation.o0
            public a i(boolean z4) {
                this.f27048f = z4;
                return this;
            }
        }

        g(Object obj) {
            this.f27042a = obj;
        }

        public static g i(int i4, int i5, int i6, int i7, boolean z4) {
            return new g(AccessibilityNodeInfo.CollectionItemInfo.obtain(i4, i5, i6, i7, z4));
        }

        public static g j(int i4, int i5, int i6, int i7, boolean z4, boolean z5) {
            return new g(AccessibilityNodeInfo.CollectionItemInfo.obtain(i4, i5, i6, i7, z4, z5));
        }

        public int a() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f27042a).getColumnIndex();
        }

        public int b() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f27042a).getColumnSpan();
        }

        @q0
        public String c() {
            if (Build.VERSION.SDK_INT >= 33) {
                return c.c(this.f27042a);
            }
            return null;
        }

        public int d() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f27042a).getRowIndex();
        }

        public int e() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f27042a).getRowSpan();
        }

        @q0
        public String f() {
            if (Build.VERSION.SDK_INT >= 33) {
                return c.d(this.f27042a);
            }
            return null;
        }

        @Deprecated
        public boolean g() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f27042a).isHeading();
        }

        public boolean h() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f27042a).isSelected();
        }
    }

    @Deprecated
    public h0(Object obj) {
        this.f27002a = (AccessibilityNodeInfo) obj;
    }

    public static h0 N0() {
        return new h0(AccessibilityNodeInfo.obtain());
    }

    public static h0 O0(View view) {
        return new h0(AccessibilityNodeInfo.obtain(view));
    }

    public static h0 P0(View view, int i4) {
        return s2(AccessibilityNodeInfo.obtain(view, i4));
    }

    public static h0 Q0(h0 h0Var) {
        return new h0(AccessibilityNodeInfo.obtain(h0Var.f27002a));
    }

    private SparseArray<WeakReference<ClickableSpan>> R(View view) {
        SparseArray<WeakReference<ClickableSpan>> Y2 = Y(view);
        if (Y2 != null) {
            return Y2;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(a.e.f93569g0, sparseArray);
        return sparseArray;
    }

    private SparseArray<WeakReference<ClickableSpan>> Y(View view) {
        return (SparseArray) view.getTag(a.e.f93569g0);
    }

    private void Y0(View view) {
        SparseArray<WeakReference<ClickableSpan>> Y2 = Y(view);
        if (Y2 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < Y2.size(); i4++) {
                if (Y2.valueAt(i4).get() == null) {
                    arrayList.add(Integer.valueOf(i4));
                }
            }
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                Y2.remove(((Integer) arrayList.get(i5)).intValue());
            }
        }
    }

    private void c1(int i4, boolean z4) {
        Bundle H2 = H();
        if (H2 != null) {
            int i5 = H2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i4);
            if (!z4) {
                i4 = 0;
            }
            H2.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i4 | i5);
        }
    }

    private void e(ClickableSpan clickableSpan, Spanned spanned, int i4) {
        i("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        i("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        i("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        i("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i4));
    }

    private void h() {
        this.f27002a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        this.f27002a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        this.f27002a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        this.f27002a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    private List<Integer> i(String str) {
        ArrayList<Integer> integerArrayList = this.f27002a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f27002a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    private boolean m0() {
        return !i("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    private int n0(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                if (clickableSpan.equals(sparseArray.valueAt(i4).get())) {
                    return sparseArray.keyAt(i4);
                }
            }
        }
        int i5 = C0;
        C0 = i5 + 1;
        return i5;
    }

    static String o(int i4) {
        if (i4 == 1) {
            return "ACTION_FOCUS";
        }
        if (i4 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i4) {
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
            case R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i4) {
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
                        switch (i4) {
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
                                switch (i4) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    private boolean r(int i4) {
        Bundle H2 = H();
        return H2 != null && (H2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i4) == i4;
    }

    public static h0 r2(@androidx.annotation.o0 AccessibilityNodeInfo accessibilityNodeInfo) {
        return new h0(accessibilityNodeInfo);
    }

    static h0 s2(Object obj) {
        if (obj != null) {
            return new h0(obj);
        }
        return null;
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public static ClickableSpan[] z(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public f A() {
        AccessibilityNodeInfo.CollectionInfo collectionInfo = this.f27002a.getCollectionInfo();
        if (collectionInfo != null) {
            return new f(collectionInfo);
        }
        return null;
    }

    public boolean A0() {
        return r(67108864);
    }

    public void A1(@q0 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f27002a.setHintText(charSequence);
        } else {
            this.f27002a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public g B() {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = this.f27002a.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            return new g(collectionItemInfo);
        }
        return null;
    }

    public boolean B0() {
        boolean isHeading;
        if (Build.VERSION.SDK_INT >= 28) {
            isHeading = this.f27002a.isHeading();
            return isHeading;
        }
        if (r(2)) {
            return true;
        }
        g B2 = B();
        return B2 != null && B2.g();
    }

    public void B1(boolean z4) {
        this.f27002a.setImportantForAccessibility(z4);
    }

    @q0
    public CharSequence C() {
        return Build.VERSION.SDK_INT >= 34 ? d.c(this.f27002a) : this.f27002a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }

    public boolean C0() {
        return this.f27002a.isImportantForAccessibility();
    }

    public void C1(int i4) {
        this.f27002a.setInputType(i4);
    }

    public CharSequence D() {
        return this.f27002a.getContentDescription();
    }

    public boolean D0() {
        return this.f27002a.isLongClickable();
    }

    public void D1(View view) {
        this.f27002a.setLabelFor(view);
    }

    public int E() {
        return this.f27002a.getDrawingOrder();
    }

    public boolean E0() {
        return this.f27002a.isMultiLine();
    }

    public void E1(View view, int i4) {
        this.f27002a.setLabelFor(view, i4);
    }

    public CharSequence F() {
        return this.f27002a.getError();
    }

    public boolean F0() {
        return this.f27002a.isPassword();
    }

    public void F1(View view) {
        this.f27002a.setLabeledBy(view);
    }

    @q0
    public AccessibilityNodeInfo.ExtraRenderingInfo G() {
        if (Build.VERSION.SDK_INT >= 33) {
            return c.e(this.f27002a);
        }
        return null;
    }

    public boolean G0() {
        boolean isScreenReaderFocusable;
        if (Build.VERSION.SDK_INT < 28) {
            return r(1);
        }
        isScreenReaderFocusable = this.f27002a.isScreenReaderFocusable();
        return isScreenReaderFocusable;
    }

    public void G1(View view, int i4) {
        this.f27002a.setLabeledBy(view, i4);
    }

    public Bundle H() {
        return this.f27002a.getExtras();
    }

    public boolean H0() {
        return this.f27002a.isScrollable();
    }

    public void H1(int i4) {
        this.f27002a.setLiveRegion(i4);
    }

    @q0
    public CharSequence I() {
        CharSequence hintText;
        if (Build.VERSION.SDK_INT < 26) {
            return this.f27002a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY");
        }
        hintText = this.f27002a.getHintText();
        return hintText;
    }

    public boolean I0() {
        return this.f27002a.isSelected();
    }

    public void I1(boolean z4) {
        this.f27002a.setLongClickable(z4);
    }

    @Deprecated
    public Object J() {
        return this.f27002a;
    }

    public boolean J0() {
        boolean isShowingHintText;
        if (Build.VERSION.SDK_INT < 26) {
            return r(4);
        }
        isShowingHintText = this.f27002a.isShowingHintText();
        return isShowingHintText;
    }

    public void J1(int i4) {
        this.f27002a.setMaxTextLength(i4);
    }

    public int K() {
        return this.f27002a.getInputType();
    }

    public boolean K0() {
        boolean isTextEntryKey;
        if (Build.VERSION.SDK_INT < 29) {
            return r(8);
        }
        isTextEntryKey = this.f27002a.isTextEntryKey();
        return isTextEntryKey;
    }

    public void K1(long j4) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.j(this.f27002a, j4);
        } else {
            this.f27002a.getExtras().putLong("androidx.view.accessibility.AccessibilityNodeInfoCompat.MIN_DURATION_BETWEEN_CONTENT_CHANGES_KEY", j4);
        }
    }

    public h0 L() {
        return s2(this.f27002a.getLabelFor());
    }

    public boolean L0() {
        return Build.VERSION.SDK_INT >= 33 ? c.h(this.f27002a) : r(8388608);
    }

    public void L1(int i4) {
        this.f27002a.setMovementGranularities(i4);
    }

    public h0 M() {
        return s2(this.f27002a.getLabeledBy());
    }

    public boolean M0() {
        return this.f27002a.isVisibleToUser();
    }

    public void M1(boolean z4) {
        this.f27002a.setMultiLine(z4);
    }

    public int N() {
        return this.f27002a.getLiveRegion();
    }

    public void N1(CharSequence charSequence) {
        this.f27002a.setPackageName(charSequence);
    }

    public int O() {
        return this.f27002a.getMaxTextLength();
    }

    public void O1(@q0 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f27002a.setPaneTitle(charSequence);
        } else {
            this.f27002a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public long P() {
        return Build.VERSION.SDK_INT >= 34 ? d.d(this.f27002a) : this.f27002a.getExtras().getLong("androidx.view.accessibility.AccessibilityNodeInfoCompat.MIN_DURATION_BETWEEN_CONTENT_CHANGES_KEY");
    }

    public void P1(View view) {
        this.f27003b = -1;
        this.f27002a.setParent(view);
    }

    public int Q() {
        return this.f27002a.getMovementGranularities();
    }

    public void Q1(View view, int i4) {
        this.f27003b = i4;
        this.f27002a.setParent(view, i4);
    }

    public boolean R0(int i4) {
        return this.f27002a.performAction(i4);
    }

    public void R1(boolean z4) {
        this.f27002a.setPassword(z4);
    }

    public CharSequence S() {
        return this.f27002a.getPackageName();
    }

    public boolean S0(int i4, Bundle bundle) {
        return this.f27002a.performAction(i4, bundle);
    }

    public void S1(@androidx.annotation.o0 View view, boolean z4) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.k(this.f27002a, view, z4);
        }
    }

    @q0
    public CharSequence T() {
        CharSequence paneTitle;
        if (Build.VERSION.SDK_INT < 28) {
            return this.f27002a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY");
        }
        paneTitle = this.f27002a.getPaneTitle();
        return paneTitle;
    }

    @Deprecated
    public void T0() {
    }

    public void T1(h hVar) {
        this.f27002a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) hVar.f27054a);
    }

    public h0 U() {
        return s2(this.f27002a.getParent());
    }

    public boolean U0() {
        return this.f27002a.refresh();
    }

    @SuppressLint({"GetterSetterNames"})
    public void U1(boolean z4) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.l(this.f27002a, z4);
        } else {
            c1(32, z4);
        }
    }

    @q0
    public h0 V(int i4) {
        return Build.VERSION.SDK_INT >= 33 ? c.f(this.f27002a, i4) : U();
    }

    public boolean V0(a aVar) {
        return this.f27002a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f27027a);
    }

    public void V1(@q0 CharSequence charSequence) {
        this.f27002a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public h W() {
        AccessibilityNodeInfo.RangeInfo rangeInfo = this.f27002a.getRangeInfo();
        if (rangeInfo != null) {
            return new h(rangeInfo);
        }
        return null;
    }

    public boolean W0(View view) {
        return this.f27002a.removeChild(view);
    }

    public void W1(boolean z4) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f27002a.setScreenReaderFocusable(z4);
        } else {
            c1(1, z4);
        }
    }

    @q0
    public CharSequence X() {
        return this.f27002a.getExtras().getCharSequence("AccessibilityNodeInfo.roleDescription");
    }

    public boolean X0(View view, int i4) {
        return this.f27002a.removeChild(view, i4);
    }

    public void X1(boolean z4) {
        this.f27002a.setScrollable(z4);
    }

    public void Y1(boolean z4) {
        this.f27002a.setSelected(z4);
    }

    @q0
    public CharSequence Z() {
        return Build.VERSION.SDK_INT >= 30 ? b.b(this.f27002a) : this.f27002a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public void Z0(boolean z4) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.g(this.f27002a, z4);
        } else {
            c1(64, z4);
        }
    }

    public void Z1(boolean z4) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f27002a.setShowingHintText(z4);
        } else {
            c1(4, z4);
        }
    }

    public void a(int i4) {
        this.f27002a.addAction(i4);
    }

    public CharSequence a0() {
        if (!m0()) {
            return this.f27002a.getText();
        }
        List<Integer> i4 = i("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> i5 = i("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> i6 = i("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> i7 = i("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f27002a.getText(), 0, this.f27002a.getText().length()));
        for (int i10 = 0; i10 < i4.size(); i10++) {
            spannableString.setSpan(new androidx.core.view.accessibility.a(i7.get(i10).intValue(), this, H().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), i4.get(i10).intValue(), i5.get(i10).intValue(), i6.get(i10).intValue());
        }
        return spannableString;
    }

    public void a1(boolean z4) {
        this.f27002a.setAccessibilityFocused(z4);
    }

    public void a2(View view) {
        this.f27004c = -1;
        this.f27002a.setSource(view);
    }

    public void b(a aVar) {
        this.f27002a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f27027a);
    }

    public int b0() {
        return this.f27002a.getTextSelectionEnd();
    }

    public void b1(@androidx.annotation.o0 List<String> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f27002a.setAvailableExtraData(list);
        }
    }

    public void b2(View view, int i4) {
        this.f27004c = i4;
        this.f27002a.setSource(view, i4);
    }

    public void c(View view) {
        this.f27002a.addChild(view);
    }

    public int c0() {
        return this.f27002a.getTextSelectionStart();
    }

    public void c2(@q0 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.c(this.f27002a, charSequence);
        } else {
            this.f27002a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public void d(View view, int i4) {
        this.f27002a.addChild(view, i4);
    }

    @q0
    public CharSequence d0() {
        CharSequence tooltipText;
        if (Build.VERSION.SDK_INT < 28) {
            return this.f27002a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
        }
        tooltipText = this.f27002a.getTooltipText();
        return tooltipText;
    }

    @Deprecated
    public void d1(Rect rect) {
        this.f27002a.setBoundsInParent(rect);
    }

    public void d2(CharSequence charSequence) {
        this.f27002a.setText(charSequence);
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0006, code lost:
    
        r0 = r2.f27002a.getTouchDelegateInfo();
     */
    @androidx.annotation.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.core.view.accessibility.h0.i e0() {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L14
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.f27002a
            android.view.accessibility.AccessibilityNodeInfo$TouchDelegateInfo r0 = androidx.core.view.accessibility.p.a(r0)
            if (r0 == 0) goto L14
            androidx.core.view.accessibility.h0$i r1 = new androidx.core.view.accessibility.h0$i
            r1.<init>(r0)
            return r1
        L14:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.accessibility.h0.e0():androidx.core.view.accessibility.h0$i");
    }

    public void e1(Rect rect) {
        this.f27002a.setBoundsInScreen(rect);
    }

    public void e2(boolean z4) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f27002a.setTextEntryKey(z4);
        } else {
            c1(8, z4);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f27002a;
        if (accessibilityNodeInfo == null) {
            if (h0Var.f27002a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(h0Var.f27002a)) {
            return false;
        }
        return this.f27004c == h0Var.f27004c && this.f27003b == h0Var.f27003b;
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void f(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            h();
            Y0(view);
            ClickableSpan[] z4 = z(charSequence);
            if (z4 == null || z4.length <= 0) {
                return;
            }
            H().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", a.e.f93556a);
            SparseArray<WeakReference<ClickableSpan>> R2 = R(view);
            for (int i4 = 0; i4 < z4.length; i4++) {
                int n02 = n0(z4[i4], R2);
                R2.put(n02, new WeakReference<>(z4[i4]));
                e(z4[i4], (Spanned) charSequence, n02);
            }
        }
    }

    public h0 f0() {
        return s2(this.f27002a.getTraversalAfter());
    }

    public void f1(@androidx.annotation.o0 Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.h(this.f27002a, rect);
        } else {
            this.f27002a.getExtras().putParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY", rect);
        }
    }

    public void f2(boolean z4) {
        if (Build.VERSION.SDK_INT >= 33) {
            c.i(this.f27002a, z4);
        } else {
            c1(8388608, z4);
        }
    }

    public boolean g() {
        return this.f27002a.canOpenPopup();
    }

    public h0 g0() {
        return s2(this.f27002a.getTraversalBefore());
    }

    public void g1(boolean z4) {
        this.f27002a.setCanOpenPopup(z4);
    }

    public void g2(int i4, int i5) {
        this.f27002a.setTextSelection(i4, i5);
    }

    @q0
    public String h0() {
        return Build.VERSION.SDK_INT >= 33 ? c.g(this.f27002a) : this.f27002a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public void h1(boolean z4) {
        this.f27002a.setCheckable(z4);
    }

    public void h2(@q0 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f27002a.setTooltipText(charSequence);
        } else {
            this.f27002a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY", charSequence);
        }
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f27002a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public String i0() {
        return this.f27002a.getViewIdResourceName();
    }

    public void i1(boolean z4) {
        this.f27002a.setChecked(z4);
    }

    public void i2(@androidx.annotation.o0 i iVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f27002a.setTouchDelegateInfo(iVar.f27055a);
        }
    }

    public List<h0> j(String str) {
        ArrayList arrayList = new ArrayList();
        List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText = this.f27002a.findAccessibilityNodeInfosByText(str);
        int size = findAccessibilityNodeInfosByText.size();
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.add(new h0(findAccessibilityNodeInfosByText.get(i4)));
        }
        return arrayList;
    }

    public p0 j0() {
        return p0.y(this.f27002a.getWindow());
    }

    public void j1(CharSequence charSequence) {
        this.f27002a.setClassName(charSequence);
    }

    public void j2(View view) {
        this.f27002a.setTraversalAfter(view);
    }

    public List<h0> k(String str) {
        List<AccessibilityNodeInfo> findAccessibilityNodeInfosByViewId = this.f27002a.findAccessibilityNodeInfosByViewId(str);
        ArrayList arrayList = new ArrayList();
        Iterator<AccessibilityNodeInfo> it = findAccessibilityNodeInfosByViewId.iterator();
        while (it.hasNext()) {
            arrayList.add(new h0(it.next()));
        }
        return arrayList;
    }

    public int k0() {
        return this.f27002a.getWindowId();
    }

    public void k1(boolean z4) {
        this.f27002a.setClickable(z4);
    }

    public void k2(View view, int i4) {
        this.f27002a.setTraversalAfter(view, i4);
    }

    public h0 l(int i4) {
        return s2(this.f27002a.findFocus(i4));
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public boolean l0() {
        return Build.VERSION.SDK_INT >= 34 ? d.e(this.f27002a) : r(32);
    }

    public void l1(Object obj) {
        this.f27002a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((f) obj).f27035a);
    }

    public void l2(View view) {
        this.f27002a.setTraversalBefore(view);
    }

    public h0 m(int i4) {
        return s2(this.f27002a.focusSearch(i4));
    }

    public void m1(Object obj) {
        this.f27002a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((g) obj).f27042a);
    }

    public void m2(View view, int i4) {
        this.f27002a.setTraversalBefore(view, i4);
    }

    public List<a> n() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f27002a.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.add(new a(actionList.get(i4)));
        }
        return arrayList;
    }

    public void n1(@q0 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.i(this.f27002a, charSequence);
        } else {
            this.f27002a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY", charSequence);
        }
    }

    public void n2(@q0 String str) {
        if (Build.VERSION.SDK_INT >= 33) {
            c.j(this.f27002a, str);
        } else {
            this.f27002a.getExtras().putString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY", str);
        }
    }

    public boolean o0() {
        return Build.VERSION.SDK_INT >= 34 ? d.f(this.f27002a) : r(64);
    }

    public void o1(CharSequence charSequence) {
        this.f27002a.setContentDescription(charSequence);
    }

    public void o2(String str) {
        this.f27002a.setViewIdResourceName(str);
    }

    @Deprecated
    public int p() {
        return this.f27002a.getActions();
    }

    public boolean p0() {
        return this.f27002a.isAccessibilityFocused();
    }

    public void p1(boolean z4) {
        this.f27002a.setContentInvalid(z4);
    }

    public void p2(boolean z4) {
        this.f27002a.setVisibleToUser(z4);
    }

    @androidx.annotation.o0
    public List<String> q() {
        List<String> availableExtraData;
        if (Build.VERSION.SDK_INT < 26) {
            return Collections.emptyList();
        }
        availableExtraData = this.f27002a.getAvailableExtraData();
        return availableExtraData;
    }

    public boolean q0() {
        return this.f27002a.isCheckable();
    }

    public void q1(boolean z4) {
        this.f27002a.setContextClickable(z4);
    }

    public AccessibilityNodeInfo q2() {
        return this.f27002a;
    }

    public boolean r0() {
        return this.f27002a.isChecked();
    }

    public void r1(boolean z4) {
        this.f27002a.setDismissable(z4);
    }

    @Deprecated
    public void s(Rect rect) {
        this.f27002a.getBoundsInParent(rect);
    }

    public boolean s0() {
        return this.f27002a.isClickable();
    }

    public void s1(int i4) {
        this.f27002a.setDrawingOrder(i4);
    }

    public void t(Rect rect) {
        this.f27002a.getBoundsInScreen(rect);
    }

    public boolean t0() {
        return this.f27002a.isContentInvalid();
    }

    public void t1(boolean z4) {
        this.f27002a.setEditable(z4);
    }

    @androidx.annotation.o0
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        s(rect);
        sb.append("; boundsInParent: " + rect);
        t(rect);
        sb.append("; boundsInScreen: " + rect);
        u(rect);
        sb.append("; boundsInWindow: " + rect);
        sb.append("; packageName: ");
        sb.append(S());
        sb.append("; className: ");
        sb.append(y());
        sb.append("; text: ");
        sb.append(a0());
        sb.append("; error: ");
        sb.append(F());
        sb.append("; maxTextLength: ");
        sb.append(O());
        sb.append("; stateDescription: ");
        sb.append(Z());
        sb.append("; contentDescription: ");
        sb.append(D());
        sb.append("; tooltipText: ");
        sb.append(d0());
        sb.append("; viewIdResName: ");
        sb.append(i0());
        sb.append("; uniqueId: ");
        sb.append(h0());
        sb.append("; checkable: ");
        sb.append(q0());
        sb.append("; checked: ");
        sb.append(r0());
        sb.append("; focusable: ");
        sb.append(y0());
        sb.append("; focused: ");
        sb.append(z0());
        sb.append("; selected: ");
        sb.append(I0());
        sb.append("; clickable: ");
        sb.append(s0());
        sb.append("; longClickable: ");
        sb.append(D0());
        sb.append("; contextClickable: ");
        sb.append(u0());
        sb.append("; enabled: ");
        sb.append(x0());
        sb.append("; password: ");
        sb.append(F0());
        sb.append("; scrollable: " + H0());
        sb.append("; containerTitle: ");
        sb.append(C());
        sb.append("; granularScrollingSupported: ");
        sb.append(A0());
        sb.append("; importantForAccessibility: ");
        sb.append(C0());
        sb.append("; visible: ");
        sb.append(M0());
        sb.append("; isTextSelectable: ");
        sb.append(L0());
        sb.append("; accessibilityDataSensitive: ");
        sb.append(o0());
        sb.append("; [");
        List<a> n4 = n();
        for (int i4 = 0; i4 < n4.size(); i4++) {
            a aVar = n4.get(i4);
            String o4 = o(aVar.b());
            if (o4.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                o4 = aVar.c().toString();
            }
            sb.append(o4);
            if (i4 != n4.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void u(@androidx.annotation.o0 Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.b(this.f27002a, rect);
            return;
        }
        Rect rect2 = (Rect) this.f27002a.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    public boolean u0() {
        return this.f27002a.isContextClickable();
    }

    public void u1(boolean z4) {
        this.f27002a.setEnabled(z4);
    }

    public h0 v(int i4) {
        return s2(this.f27002a.getChild(i4));
    }

    public boolean v0() {
        return this.f27002a.isDismissable();
    }

    public void v1(CharSequence charSequence) {
        this.f27002a.setError(charSequence);
    }

    @q0
    public h0 w(int i4, int i5) {
        return Build.VERSION.SDK_INT >= 33 ? c.b(this.f27002a, i4, i5) : v(i4);
    }

    public boolean w0() {
        return this.f27002a.isEditable();
    }

    public void w1(boolean z4) {
        this.f27002a.setFocusable(z4);
    }

    public int x() {
        return this.f27002a.getChildCount();
    }

    public boolean x0() {
        return this.f27002a.isEnabled();
    }

    public void x1(boolean z4) {
        this.f27002a.setFocused(z4);
    }

    public CharSequence y() {
        return this.f27002a.getClassName();
    }

    public boolean y0() {
        return this.f27002a.isFocusable();
    }

    public void y1(boolean z4) {
        c1(67108864, z4);
    }

    public boolean z0() {
        return this.f27002a.isFocused();
    }

    public void z1(boolean z4) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f27002a.setHeading(z4);
        } else {
            c1(2, z4);
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    public static class h {

        /* renamed from: b, reason: collision with root package name */
        public static final int f27051b = 0;

        /* renamed from: c, reason: collision with root package name */
        public static final int f27052c = 1;

        /* renamed from: d, reason: collision with root package name */
        public static final int f27053d = 2;

        /* renamed from: a, reason: collision with root package name */
        final Object f27054a;

        h(Object obj) {
            this.f27054a = obj;
        }

        public static h e(int i4, float f4, float f5, float f6) {
            return new h(AccessibilityNodeInfo.RangeInfo.obtain(i4, f4, f5, f6));
        }

        public float a() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f27054a).getCurrent();
        }

        public float b() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f27054a).getMax();
        }

        public float c() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f27054a).getMin();
        }

        public int d() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f27054a).getType();
        }

        public h(int i4, float f4, float f5, float f6) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.f27054a = b.a(i4, f4, f5, f6);
            } else {
                this.f27054a = AccessibilityNodeInfo.RangeInfo.obtain(i4, f4, f5, f6);
            }
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    public static final class i {

        /* renamed from: a, reason: collision with root package name */
        final AccessibilityNodeInfo.TouchDelegateInfo f27055a;

        public i(@androidx.annotation.o0 Map<Region, View> map) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f27055a = l0.a(map);
            } else {
                this.f27055a = null;
            }
        }

        @q0
        public Region a(@androidx.annotation.g0(from = 0) int i4) {
            Region regionAt;
            if (Build.VERSION.SDK_INT < 29) {
                return null;
            }
            regionAt = this.f27055a.getRegionAt(i4);
            return regionAt;
        }

        @androidx.annotation.g0(from = 0)
        public int b() {
            int regionCount;
            if (Build.VERSION.SDK_INT < 29) {
                return 0;
            }
            regionCount = this.f27055a.getRegionCount();
            return regionCount;
        }

        /* JADX WARN: Code restructure failed: missing block: B:3:0x0006, code lost:
        
            r3 = r2.f27055a.getTargetForRegion(r3);
         */
        @androidx.annotation.q0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public androidx.core.view.accessibility.h0 c(@androidx.annotation.o0 android.graphics.Region r3) {
            /*
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 < r1) goto L13
                android.view.accessibility.AccessibilityNodeInfo$TouchDelegateInfo r0 = r2.f27055a
                android.view.accessibility.AccessibilityNodeInfo r3 = androidx.core.view.accessibility.i0.a(r0, r3)
                if (r3 == 0) goto L13
                androidx.core.view.accessibility.h0 r3 = androidx.core.view.accessibility.h0.r2(r3)
                return r3
            L13:
                r3 = 0
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.accessibility.h0.i.c(android.graphics.Region):androidx.core.view.accessibility.h0");
        }

        i(@androidx.annotation.o0 AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo) {
            this.f27055a = touchDelegateInfo;
        }
    }

    private h0(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f27002a = accessibilityNodeInfo;
    }
}
